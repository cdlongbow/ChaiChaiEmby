package defpackage;

import androidx.media3.common.util.Consumer;
import androidx.media3.extractor.text.Subtitle;
import androidx.media3.extractor.text.SubtitleParser;
import androidx.media3.extractor.text.b;
import io.github.peerless2012.ass.AssTrack;
import kotlin.text.Regex;

/* JADX INFO: loaded from: classes4.dex */
public abstract class ce implements SubtitleParser {
    public final AssTrack a;

    public ce(md mdVar, AssTrack assTrack, boolean z) {
        this.a = assTrack;
        new Regex("\\\\fad\\((\\d+),(\\d+)\\)");
    }

    @Override // androidx.media3.extractor.text.SubtitleParser
    public final int getCueReplacementBehavior() {
        return 2;
    }

    @Override // androidx.media3.extractor.text.SubtitleParser
    public final void parse(byte[] bArr, int i, int i2, SubtitleParser.OutputOptions outputOptions, Consumer consumer) {
        bArr.getClass();
        outputOptions.getClass();
        consumer.getClass();
        ((ld) this).a.readBuffer(bArr, i, i2);
        rd[] rdVarArr = rd.a;
    }

    @Override // androidx.media3.extractor.text.SubtitleParser
    public final /* synthetic */ Subtitle parseToLegacySubtitle(byte[] bArr, int i, int i2) {
        return b.b(this, bArr, i, i2);
    }

    @Override // androidx.media3.extractor.text.SubtitleParser
    public final /* synthetic */ void reset() {
    }

    @Override // androidx.media3.extractor.text.SubtitleParser
    public final /* synthetic */ void parse(byte[] bArr, SubtitleParser.OutputOptions outputOptions, Consumer consumer) {
        b.a(this, bArr, outputOptions, consumer);
    }
}
