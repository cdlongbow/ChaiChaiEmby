package defpackage;

import androidx.media3.common.ParserException;
import androidx.media3.common.util.ParsableByteArray;
import androidx.media3.extractor.ExtractorInput;
import androidx.media3.extractor.ExtractorOutput;
import androidx.media3.extractor.mkv.MatroskaExtractor;
import io.github.peerless2012.ass.Ass;
import java.io.IOException;
import java.lang.reflect.Field;
import java.util.List;
import kotlin.TuplesKt;
import kotlin.collections.CollectionsKt;

/* JADX INFO: loaded from: classes4.dex */
public final class od extends MatroskaExtractor {
    public static final List e = CollectionsKt.listOf((Object[]) new String[]{"font/ttf", "font/otf", "font/sfnt", "font/woff", "font/woff2", "application/font-sfnt", "application/font-woff", "application/x-truetype-font", "application/vnd.ms-opentype", "application/x-font-ttf"});
    public static final Field f;
    public static final Field g;
    public final md a;
    public String b;
    public String c;
    public final ParsableByteArray d;

    static {
        Field declaredField = MatroskaExtractor.class.getDeclaredField("extractorOutput");
        declaredField.setAccessible(true);
        f = declaredField;
        Field declaredField2 = MatroskaExtractor.class.getDeclaredField("subtitleSample");
        declaredField2.setAccessible(true);
        g = declaredField2;
    }

    public od(nd1 nd1Var, md mdVar) throws IllegalAccessException {
        super(nd1Var, 0);
        this.a = mdVar;
        Object obj = g.get(this);
        obj.getClass();
        this.d = (ParsableByteArray) obj;
    }

    @Override // androidx.media3.extractor.mkv.MatroskaExtractor
    public final void binaryElement(int i, int i2, ExtractorInput extractorInput) throws IOException {
        extractorInput.getClass();
        if (i != 18012) {
            super.binaryElement(i, i2, extractorInput);
            return;
        }
        String str = this.b;
        if (str == null) {
            ra.q("Required value was null.");
            return;
        }
        String str2 = this.c;
        if (str2 == null) {
            ra.q("Required value was null.");
            return;
        }
        if (!e.contains(str2)) {
            extractorInput.skipFully(i2);
            return;
        }
        byte[] bArr = new byte[i2];
        extractorInput.readFully(bArr, 0, i2);
        md mdVar = this.a;
        synchronized (mdVar) {
            try {
                if (mdVar.e.isEmpty()) {
                    mdVar.g.add(TuplesKt.to(str, bArr));
                } else {
                    ((Ass) mdVar.a.getValue()).addFont(str, bArr);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // androidx.media3.extractor.mkv.MatroskaExtractor
    public final void endMasterElement(int i) throws ParserException {
        if (i != 224) {
            if (i != 24999) {
                super.endMasterElement(i);
                return;
            } else {
                this.b = null;
                this.c = null;
                return;
            }
        }
        MatroskaExtractor.Track currentTrack = getCurrentTrack(i);
        currentTrack.getClass();
        this.a.c(currentTrack.width, currentTrack.height);
        super.endMasterElement(i);
    }

    @Override // androidx.media3.extractor.mkv.MatroskaExtractor
    public final int getElementType(int i) {
        if (i == 18012) {
            return 4;
        }
        int i2 = 3;
        if (i != 18016 && i != 18030) {
            i2 = 1;
            if (i != 24999 && i != 423732329) {
                return super.getElementType(i);
            }
        }
        return i2;
    }

    @Override // androidx.media3.extractor.mkv.MatroskaExtractor
    public final boolean isLevel1Element(int i) {
        return super.isLevel1Element(i) || i == 423732329;
    }

    @Override // androidx.media3.extractor.mkv.MatroskaExtractor
    public final void startMasterElement(int i, long j, long j2) throws IllegalAccessException, ParserException {
        if (i == 24999) {
            this.b = null;
            this.c = null;
            return;
        }
        if (i != 440786851) {
            super.startMasterElement(i, j, j2);
            return;
        }
        md mdVar = this.a;
        mdVar.getClass();
        rd[] rdVarArr = rd.a;
        Field field = f;
        Object obj = field.get(this);
        obj.getClass();
        ExtractorOutput extractorOutput = (ExtractorOutput) obj;
        if (!(extractorOutput instanceof yd)) {
            field.set(this, new yd(extractorOutput, mdVar, this));
        }
        super.startMasterElement(i, j, j2);
    }

    @Override // androidx.media3.extractor.mkv.MatroskaExtractor
    public final void stringElement(int i, String str) throws ParserException {
        str.getClass();
        if (i == 18016) {
            this.c = str;
        } else if (i != 18030) {
            super.stringElement(i, str);
        } else {
            this.b = str;
        }
    }
}
