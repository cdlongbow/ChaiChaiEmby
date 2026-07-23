package defpackage;

import androidx.media3.common.C;
import androidx.media3.common.DataReader;
import androidx.media3.common.Format;
import androidx.media3.common.MimeTypes;
import androidx.media3.common.util.ParsableByteArray;
import androidx.media3.common.util.Util;
import androidx.media3.exoplayer.Renderer;
import androidx.media3.extractor.TrackOutput;
import io.github.peerless2012.ass.AssTrack;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

/* JADX INFO: loaded from: classes4.dex */
public final class je implements TrackOutput {
    public static final Pattern f;
    public final TrackOutput a;
    public final md b;
    public final od c;
    public boolean d;
    public String e;

    static {
        Pattern patternCompile = Pattern.compile("(?:(\\d+):)?(\\d+):(\\d+)[:.](\\d+)");
        patternCompile.getClass();
        f = patternCompile;
    }

    public je(TrackOutput trackOutput, md mdVar, od odVar) {
        trackOutput.getClass();
        mdVar.getClass();
        this.a = trackOutput;
        this.b = mdVar;
        this.c = odVar;
    }

    public static int a(byte[] bArr, int i) {
        if (i != 0) {
            int i2 = 0;
            int i3 = 0;
            for (byte b : bArr) {
                i2++;
                if (b == 44 && (i3 = i3 + 1) == i) {
                    return i2;
                }
            }
        }
        return 0;
    }

    @Override // androidx.media3.extractor.TrackOutput
    public final /* synthetic */ void durationUs(long j) {
    }

    @Override // androidx.media3.extractor.TrackOutput
    public final void format(Format format) {
        format.getClass();
        if (Intrinsics.areEqual(format.sampleMimeType, MimeTypes.TEXT_SSA) || Intrinsics.areEqual(format.codecs, MimeTypes.TEXT_SSA)) {
            this.d = true;
            this.e = format.id;
        }
        this.a.format(format);
    }

    @Override // androidx.media3.extractor.TrackOutput
    public final int sampleData(DataReader dataReader, int i, boolean z, int i2) {
        dataReader.getClass();
        return this.a.sampleData(dataReader, i, z, i2);
    }

    @Override // androidx.media3.extractor.TrackOutput
    public final void sampleMetadata(long j, int i, int i2, int i3, TrackOutput.CryptoData cryptoData) {
        if (this.d) {
            long j2 = C.TIME_UNSET;
            if (j != C.TIME_UNSET) {
                ParsableByteArray parsableByteArray = this.c.d;
                byte[] data = parsableByteArray.getData();
                data.getClass();
                int iA = a(data, 1);
                byte[] data2 = parsableByteArray.getData();
                data2.getClass();
                int iA2 = a(data2, 2);
                byte[] data3 = parsableByteArray.getData();
                data3.getClass();
                String strDecodeToString$default = StringsKt__StringsJVMKt.decodeToString$default(data3, iA, iA2 - 1, false, 4, null);
                int length = strDecodeToString$default.length() - 1;
                int i4 = 0;
                boolean z = false;
                while (i4 <= length) {
                    boolean z2 = Intrinsics.compare((int) strDecodeToString$default.charAt(!z ? i4 : length), 32) <= 0;
                    if (z) {
                        if (!z2) {
                            break;
                        } else {
                            length--;
                        }
                    } else if (z2) {
                        i4++;
                    } else {
                        z = true;
                    }
                }
                Matcher matcher = f.matcher(strDecodeToString$default.subSequence(i4, length + 1).toString());
                if (matcher.matches()) {
                    Object objCastNonNull = Util.castNonNull(matcher.group(1));
                    objCastNonNull.getClass();
                    long j3 = Long.parseLong((String) objCastNonNull) * 3600000000L;
                    Object objCastNonNull2 = Util.castNonNull(matcher.group(2));
                    objCastNonNull2.getClass();
                    long j4 = (Long.parseLong((String) objCastNonNull2) * 60000000) + j3;
                    Object objCastNonNull3 = Util.castNonNull(matcher.group(3));
                    objCastNonNull3.getClass();
                    long j5 = (Long.parseLong((String) objCastNonNull3) * 1000000) + j4;
                    Object objCastNonNull4 = Util.castNonNull(matcher.group(4));
                    objCastNonNull4.getClass();
                    j2 = j5 + (Long.parseLong((String) objCastNonNull4) * Renderer.DEFAULT_DURATION_TO_PROGRESS_US);
                }
                String str = this.e;
                long j6 = j / 1000;
                long j7 = j2 / 1000;
                byte[] data4 = parsableByteArray.getData();
                data4.getClass();
                int iLimit = parsableByteArray.limit() - iA2;
                md mdVar = this.b;
                mdVar.getClass();
                AssTrack assTrack = (AssTrack) mdVar.e.get(str);
                if (assTrack != null) {
                    assTrack.readChunk(j6, j7, data4, iA2, iLimit);
                }
            }
        }
        this.a.sampleMetadata(j, i, i2, i3, cryptoData);
    }

    @Override // androidx.media3.extractor.TrackOutput
    public final void sampleData(ParsableByteArray parsableByteArray, int i, int i2) {
        parsableByteArray.getClass();
        this.a.sampleData(parsableByteArray, i, i2);
    }

    @Override // androidx.media3.extractor.TrackOutput
    public final int sampleData(DataReader dataReader, int i, boolean z) {
        return sampleData(dataReader, i, z, 0);
    }

    @Override // androidx.media3.extractor.TrackOutput
    public final void sampleData(ParsableByteArray parsableByteArray, int i) {
        sampleData(parsableByteArray, i, 0);
    }
}
