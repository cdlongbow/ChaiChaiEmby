package defpackage;

import com.dh.myembyapp.data.model.AudioCodecPriorityType;
import com.dh.myembyapp.data.model.AudioLanguagePreference;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class yf {
    public final String a;
    public final String b;
    public final qg c;
    public final AudioLanguagePreference d;
    public final AudioCodecPriorityType e;
    public final boolean f;
    public final int g;
    public final int h;
    public final Integer i;

    public yf(String str, String str2, qg qgVar, AudioLanguagePreference audioLanguagePreference, AudioCodecPriorityType audioCodecPriorityType, boolean z, int i, int i2, Integer num) {
        audioCodecPriorityType.getClass();
        this.a = str;
        this.b = str2;
        this.c = qgVar;
        this.d = audioLanguagePreference;
        this.e = audioCodecPriorityType;
        this.f = z;
        this.g = i;
        this.h = i2;
        this.i = num;
    }



    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof yf)) {
            return false;
        }
        yf yfVar = (yf) obj;
        return Intrinsics.areEqual(this.a, yfVar.a) && Intrinsics.areEqual(this.b, yfVar.b) && Intrinsics.areEqual(this.c, yfVar.c) && this.d == yfVar.d && this.e == yfVar.e && this.f == yfVar.f && this.g == yfVar.g && this.h == yfVar.h && Intrinsics.areEqual(this.i, yfVar.i);
    }

    public final int hashCode() {
        int i = i02.i(this.a.hashCode() * 31, 31, this.b);
        qg qgVar = this.c;
        int iHashCode = (i + (qgVar == null ? 0 : qgVar.hashCode())) * 31;
        AudioLanguagePreference audioLanguagePreference = this.d;
        int iHashCode2 = (((((((this.e.hashCode() + ((iHashCode + (audioLanguagePreference == null ? 0 : audioLanguagePreference.hashCode())) * 31)) * 31) + (this.f ? 1231 : 1237)) * 31) + this.g) * 31) + this.h) * 31;
        Integer num = this.i;
        return iHashCode2 + (num != null ? num.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbZ = kb0.z("AudioOption(id=", this.a, ", label=", this.b, ", trackInfo=");
        sbZ.append(this.c);
        sbZ.append(", languagePreference=");
        sbZ.append(this.d);
        sbZ.append(", codecType=");
        sbZ.append(this.e);
        sbZ.append(", isDefault=");
        sbZ.append(this.f);
        sbZ.append(", channelCount=");
        c61.t(sbZ, this.g, ", bitrate=", this.h, ", apiStreamIndex=");
        sbZ.append(this.i);
        sbZ.append(")");
        return sbZ.toString();
    }
}
