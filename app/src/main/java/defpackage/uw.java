package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class uw {
    public final String a;
    public final String b;
    public final String c;
    public final String d;
    public final String e;
    public final String f;
    public final int g;

    public uw(String str, String str2, String str3, String str4, String str5, String str6, int i) {
        str.getClass();
        str5.getClass();
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
        this.e = str5;
        this.f = str6;
        this.g = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof uw)) {
            return false;
        }
        uw uwVar = (uw) obj;
        return Intrinsics.areEqual(this.a, uwVar.a) && Intrinsics.areEqual(this.b, uwVar.b) && Intrinsics.areEqual(this.c, uwVar.c) && Intrinsics.areEqual(this.d, uwVar.d) && Intrinsics.areEqual(this.e, uwVar.e) && Intrinsics.areEqual(this.f, uwVar.f) && this.g == uwVar.g;
    }

    public final int hashCode() {
        return i02.i(i02.i(i02.i(i02.i(i02.i(this.a.hashCode() * 31, 31, this.b), 31, this.c), 31, this.d), 31, this.e), 31, this.f) + this.g;
    }

    public final String toString() {
        StringBuilder sbZ = kb0.z("DanmakuLoadedInfo(loadSource=", this.a, ", animeTitle=", this.b, ", episodeTitle=");
        i02.v(sbZ, this.c, ", pool=", this.d, ", apiName=");
        i02.v(sbZ, this.e, ", apiUrl=", this.f, ", commentCount=");
        return ll0.f(sbZ, this.g, ")");
    }

    public /* synthetic */ uw() {
        this("-", "-", "-", "-", "-", "-", 0);
    }
}
