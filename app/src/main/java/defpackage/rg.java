package defpackage;

import com.dh.myembyapp.data.model.AudioCodecPriorityType;
import com.dh.myembyapp.data.model.AudioLanguagePreference;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class rg {
    public final Object a;
    public final boolean b;
    public final Integer c;
    public final AudioLanguagePreference d;
    public final AudioCodecPriorityType e;
    public final Integer f;
    public final String g;

    public rg(Object obj, boolean z, Integer num, AudioLanguagePreference audioLanguagePreference, AudioCodecPriorityType audioCodecPriorityType, Integer num2, String str) {
        audioCodecPriorityType.getClass();
        this.a = obj;
        this.b = z;
        this.c = num;
        this.d = audioLanguagePreference;
        this.e = audioCodecPriorityType;
        this.f = num2;
        this.g = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof rg)) {
            return false;
        }
        rg rgVar = (rg) obj;
        return Intrinsics.areEqual(this.a, rgVar.a) && this.b == rgVar.b && Intrinsics.areEqual(this.c, rgVar.c) && this.d == rgVar.d && this.e == rgVar.e && Intrinsics.areEqual(this.f, rgVar.f) && Intrinsics.areEqual(this.g, rgVar.g);
    }

    public final int hashCode() {
        Object obj = this.a;
        int iHashCode = (((obj == null ? 0 : obj.hashCode()) * 31) + (this.b ? 1231 : 1237)) * 31;
        Integer num = this.c;
        int iHashCode2 = (iHashCode + (num == null ? 0 : num.hashCode())) * 31;
        AudioLanguagePreference audioLanguagePreference = this.d;
        int iHashCode3 = (this.e.hashCode() + ((iHashCode2 + (audioLanguagePreference == null ? 0 : audioLanguagePreference.hashCode())) * 31)) * 31;
        Integer num2 = this.f;
        int iHashCode4 = (iHashCode3 + (num2 == null ? 0 : num2.hashCode())) * 31;
        String str = this.g;
        return iHashCode4 + (str != null ? str.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("AudioTrackMemoryCandidate(value=");
        sb.append(this.a);
        sb.append(", isSelectable=");
        sb.append(this.b);
        sb.append(", apiStreamIndex=");
        sb.append(this.c);
        sb.append(", languagePreference=");
        sb.append(this.d);
        sb.append(", codecType=");
        sb.append(this.e);
        sb.append(", channelCount=");
        sb.append(this.f);
        sb.append(", titleKey=");
        return s01.w(sb, this.g, ")");
    }
}
