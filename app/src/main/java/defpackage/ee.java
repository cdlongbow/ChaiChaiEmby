package defpackage;

import android.util.Log;
import androidx.media3.common.Format;
import androidx.media3.common.MimeTypes;
import androidx.media3.extractor.text.DefaultSubtitleParserFactory;
import androidx.media3.extractor.text.SubtitleParser;
import io.github.peerless2012.ass.Ass;
import io.github.peerless2012.ass.AssTrack;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

/* JADX INFO: loaded from: classes4.dex */
public final class ee implements SubtitleParser.Factory {
    public final md a;
    public final DefaultSubtitleParserFactory b = new DefaultSubtitleParserFactory();

    public ee(md mdVar) {
        this.a = mdVar;
    }

    @Override // androidx.media3.extractor.text.SubtitleParser.Factory
    public final SubtitleParser create(Format format) {
        AssTrack assTrackCreateTrack;
        format.getClass();
        if (!Intrinsics.areEqual(format.sampleMimeType, MimeTypes.TEXT_SSA)) {
            SubtitleParser subtitleParserCreate = this.b.create(format);
            subtitleParserCreate.getClass();
            return subtitleParserCreate;
        }
        boolean zContentEquals = StringsKt.contentEquals((CharSequence) MimeTypes.VIDEO_MATROSKA, (CharSequence) format.containerMimeType);
        md mdVar = this.a;
        synchronized (mdVar) {
            try {
                Log.i("AssHandler", "createTrack: format = " + format);
                mdVar.a();
                if (!mdVar.g.isEmpty()) {
                    ArrayList arrayList = mdVar.g;
                    int size = arrayList.size();
                    int i = 0;
                    while (i < size) {
                        Object obj = arrayList.get(i);
                        i++;
                        Pair pair = (Pair) obj;
                        ((Ass) mdVar.a.getValue()).addFont((String) pair.component1(), (byte[]) pair.component2());
                    }
                    mdVar.g.clear();
                }
                assTrackCreateTrack = ((Ass) mdVar.a.getValue()).createTrack();
                if (format.initializationData.size() > 0) {
                    rd[] rdVarArr = rd.a;
                    byte[] bArr = format.initializationData.get(1);
                    bArr.getClass();
                    AssTrack.readBuffer$default(assTrackCreateTrack, ku.w(bArr), 0, 0, 6, null);
                }
                LinkedHashMap linkedHashMap = mdVar.e;
                String str = format.id;
                str.getClass();
                linkedHashMap.put(str, assTrackCreateTrack);
                mdVar.e();
            } catch (Throwable th) {
                throw th;
            }
        }
        md mdVar2 = this.a;
        if (zContentEquals) {
            rd[] rdVarArr2 = rd.a;
            return new pd();
        }
        assTrackCreateTrack.getClass();
        return new ld(mdVar2, assTrackCreateTrack, false);
    }

    @Override // androidx.media3.extractor.text.SubtitleParser.Factory
    public final int getCueReplacementBehavior(Format format) {
        format.getClass();
        return this.b.getCueReplacementBehavior(format);
    }

    @Override // androidx.media3.extractor.text.SubtitleParser.Factory
    public final boolean supportsFormat(Format format) {
        format.getClass();
        return this.b.supportsFormat(format);
    }
}
