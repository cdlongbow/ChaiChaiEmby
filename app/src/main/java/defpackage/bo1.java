package defpackage;

import com.dh.myembyapp.data.model.TranscodeQualityOption;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class bo1 {
    public final String a;
    public final String b;
    public final TranscodeQualityOption c;
    public final Integer d;
    public final Integer e;
    public final long f;

    public bo1(String str, String str2, TranscodeQualityOption transcodeQualityOption, Integer num, Integer num2, long j) {
        str.getClass();
        this.a = str;
        this.b = str2;
        this.c = transcodeQualityOption;
        this.d = num;
        this.e = num2;
        this.f = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof bo1)) {
            return false;
        }
        bo1 bo1Var = (bo1) obj;
        return Intrinsics.areEqual(this.a, bo1Var.a) && Intrinsics.areEqual(this.b, bo1Var.b) && Intrinsics.areEqual(this.c, bo1Var.c) && Intrinsics.areEqual(this.d, bo1Var.d) && Intrinsics.areEqual(this.e, bo1Var.e) && this.f == bo1Var.f;
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() * 31;
        String str = this.b;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        TranscodeQualityOption transcodeQualityOption = this.c;
        int iHashCode3 = (iHashCode2 + (transcodeQualityOption == null ? 0 : transcodeQualityOption.hashCode())) * 31;
        Integer num = this.d;
        int iHashCode4 = (iHashCode3 + (num == null ? 0 : num.hashCode())) * 31;
        Integer num2 = this.e;
        int iHashCode5 = num2 != null ? num2.hashCode() : 0;
        long j = this.f;
        return ((iHashCode4 + iHashCode5) * 31) + ((int) (j ^ (j >>> 32)));
    }

    public final String toString() {
        StringBuilder sbZ = kb0.z("PlayerTranscodeSwitchRequest(itemId=", this.a, ", preferredMediaSourceId=", this.b, ", transcodeQuality=");
        sbZ.append(this.c);
        sbZ.append(", audioStreamIndex=");
        sbZ.append(this.d);
        sbZ.append(", subtitleStreamIndex=");
        sbZ.append(this.e);
        sbZ.append(", forcedStartPositionTicks=");
        sbZ.append(this.f);
        sbZ.append(")");
        return sbZ.toString();
    }
}
