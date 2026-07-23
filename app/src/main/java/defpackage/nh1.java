package defpackage;

import com.dh.myembyapp.data.model.TranscodeQualityOption;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class nh1 {
    public final String a;
    public final long b;
    public final boolean c;
    public final String d;
    public final TranscodeQualityOption e;
    public final Integer f;
    public final Integer g;
    public final long h;

    public nh1(String str, long j, boolean z, String str2, TranscodeQualityOption transcodeQualityOption, Integer num, Integer num2, long j2) {
        this.a = str;
        this.b = j;
        this.c = z;
        this.d = str2;
        this.e = transcodeQualityOption;
        this.f = num;
        this.g = num2;
        this.h = j2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof nh1)) {
            return false;
        }
        nh1 nh1Var = (nh1) obj;
        return Intrinsics.areEqual(this.a, nh1Var.a) && this.b == nh1Var.b && this.c == nh1Var.c && Intrinsics.areEqual(this.d, nh1Var.d) && Intrinsics.areEqual(this.e, nh1Var.e) && Intrinsics.areEqual(this.f, nh1Var.f) && Intrinsics.areEqual(this.g, nh1Var.g) && this.h == nh1Var.h;
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() * 31;
        long j = this.b;
        int i = (((iHashCode + ((int) (j ^ (j >>> 32)))) * 31) + (this.c ? 1231 : 1237)) * 31;
        String str = this.d;
        int iHashCode2 = (i + (str == null ? 0 : str.hashCode())) * 31;
        TranscodeQualityOption transcodeQualityOption = this.e;
        int iHashCode3 = (iHashCode2 + (transcodeQualityOption == null ? 0 : transcodeQualityOption.hashCode())) * 31;
        Integer num = this.f;
        int iHashCode4 = (iHashCode3 + (num == null ? 0 : num.hashCode())) * 31;
        Integer num2 = this.g;
        int iHashCode5 = (iHashCode4 + (num2 != null ? num2.hashCode() : 0)) * 31;
        long j2 = this.h;
        return iHashCode5 + ((int) (j2 ^ (j2 >>> 32)));
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("PlayerPlaybackInfoReloadRequest(itemId=");
        sb.append(this.a);
        sb.append(", finalPositionMs=");
        sb.append(this.b);
        sb.append(", useTranscoding=");
        sb.append(this.c);
        sb.append(", preferredMediaSourceId=");
        sb.append(this.d);
        sb.append(", transcodeQuality=");
        sb.append(this.e);
        sb.append(", audioStreamIndex=");
        sb.append(this.f);
        sb.append(", subtitleStreamIndex=");
        sb.append(this.g);
        sb.append(", forcedStartPositionTicks=");
        return c61.i(this.h, ")", sb);
    }
}
