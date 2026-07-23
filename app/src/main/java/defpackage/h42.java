package defpackage;

import com.dh.myembyapp.data.model.SubtitleFormatPriorityType;
import com.dh.myembyapp.data.model.SubtitleLanguagePriorityType;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class h42 {
    public final String a;
    public final String b;
    public final String c;
    public final g52 d;
    public final Integer e;
    public final SubtitleLanguagePriorityType f;
    public final SubtitleFormatPriorityType g;

    public h42(String str, String str2, String str3, g52 g52Var, Integer num, SubtitleLanguagePriorityType subtitleLanguagePriorityType, SubtitleFormatPriorityType subtitleFormatPriorityType) {
        subtitleLanguagePriorityType.getClass();
        subtitleFormatPriorityType.getClass();
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = g52Var;
        this.e = num;
        this.f = subtitleLanguagePriorityType;
        this.g = subtitleFormatPriorityType;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof h42)) {
            return false;
        }
        h42 h42Var = (h42) obj;
        return Intrinsics.areEqual(this.a, h42Var.a) && Intrinsics.areEqual(this.b, h42Var.b) && Intrinsics.areEqual(this.c, h42Var.c) && Intrinsics.areEqual(this.d, h42Var.d) && Intrinsics.areEqual(this.e, h42Var.e) && this.f == h42Var.f && this.g == h42Var.g;
    }

    public final int hashCode() {
        int i = i02.i(this.a.hashCode() * 31, 31, this.b);
        String str = this.c;
        int iHashCode = (i + (str == null ? 0 : str.hashCode())) * 31;
        g52 g52Var = this.d;
        int iHashCode2 = (iHashCode + (g52Var == null ? 0 : g52Var.hashCode())) * 31;
        Integer num = this.e;
        return this.g.hashCode() + ((this.f.hashCode() + ((iHashCode2 + (num != null ? num.hashCode() : 0)) * 31)) * 31);
    }

    public final String toString() {
        StringBuilder sbZ = kb0.z("SubtitleOption(id=", this.a, ", title=", this.b, ", description=");
        sbZ.append(this.c);
        sbZ.append(", trackInfo=");
        sbZ.append(this.d);
        sbZ.append(", apiStreamIndex=");
        sbZ.append(this.e);
        sbZ.append(", languageType=");
        sbZ.append(this.f);
        sbZ.append(", formatType=");
        sbZ.append(this.g);
        sbZ.append(")");
        return sbZ.toString();
    }

    public /* synthetic */ h42() {
        this("subtitle_off", "关闭字幕", null, null, null, SubtitleLanguagePriorityType.OTHER, SubtitleFormatPriorityType.OTHER);
    }
}
