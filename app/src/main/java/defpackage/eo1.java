package defpackage;

import com.dh.myembyapp.data.model.MediaItem;
import com.dh.myembyapp.data.model.TranscodeQualityOption;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class eo1 extends go1 {
    public final MediaItem a;
    public final String b;
    public final long c;
    public final boolean d;
    public final String e;
    public final List f;
    public final String g;
    public final boolean h;
    public final TranscodeQualityOption i;
    public final Integer j;
    public final Integer k;

    public eo1(MediaItem mediaItem, String str, long j, boolean z, String str2, List list, String str3, boolean z2, TranscodeQualityOption transcodeQualityOption, Integer num, Integer num2) {
        mediaItem.getClass();
        str.getClass();
        str2.getClass();
        this.a = mediaItem;
        this.b = str;
        this.c = j;
        this.d = z;
        this.e = str2;
        this.f = list;
        this.g = str3;
        this.h = z2;
        this.i = transcodeQualityOption;
        this.j = num;
        this.k = num2;
    }

    public final MediaItem a() {
        return this.a;
    }



    public final TranscodeQualityOption d() {
        return this.i;
    }


    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof eo1)) {
            return false;
        }
        eo1 eo1Var = (eo1) obj;
        return Intrinsics.areEqual(this.a, eo1Var.a) && Intrinsics.areEqual(this.b, eo1Var.b) && this.c == eo1Var.c && this.d == eo1Var.d && Intrinsics.areEqual(this.e, eo1Var.e) && Intrinsics.areEqual(this.f, eo1Var.f) && Intrinsics.areEqual(this.g, eo1Var.g) && this.h == eo1Var.h && Intrinsics.areEqual(this.i, eo1Var.i) && Intrinsics.areEqual(this.j, eo1Var.j) && Intrinsics.areEqual(this.k, eo1Var.k);
    }

    public final int hashCode() {
        int i = i02.i(this.a.hashCode() * 31, 31, this.b);
        long j = this.c;
        int i2 = i02.i((((i + ((int) (j ^ (j >>> 32)))) * 31) + (this.d ? 1231 : 1237)) * 31, 31, this.e);
        List list = this.f;
        int iHashCode = (i2 + (list == null ? 0 : list.hashCode())) * 31;
        String str = this.g;
        int iHashCode2 = (((iHashCode + (str == null ? 0 : str.hashCode())) * 31) + (this.h ? 1231 : 1237)) * 31;
        TranscodeQualityOption transcodeQualityOption = this.i;
        int iHashCode3 = (iHashCode2 + (transcodeQualityOption == null ? 0 : transcodeQualityOption.hashCode())) * 31;
        Integer num = this.j;
        int iHashCode4 = (iHashCode3 + (num == null ? 0 : num.hashCode())) * 31;
        Integer num2 = this.k;
        return iHashCode4 + (num2 != null ? num2.hashCode() : 0);
    }

    public final String toString() {
        return "Ready(mediaItem=" + this.a + ", videoUrl=" + this.b + ", startPosition=" + this.c + ", isTranscoding=" + this.d + ", mediaSourceId=" + this.e + ", playbackMediaSources=" + this.f + ", playbackContainer=" + this.g + ", canUserTranscodeVideo=" + this.h + ", transcodeQuality=" + this.i + ", transcodeAudioStreamIndex=" + this.j + ", transcodeSubtitleStreamIndex=" + this.k + ")";
    }
}
