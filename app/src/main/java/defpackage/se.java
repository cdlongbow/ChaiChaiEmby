package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class se {
    public final String a;
    public final String b;
    public final String c;

    public se(String str, String str2, String str3) {
        s01.D(str, str2, str3);
        this.a = str;
        this.b = str2;
        this.c = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof se)) {
            return false;
        }
        se seVar = (se) obj;
        return Intrinsics.areEqual(this.a, seVar.a) && Intrinsics.areEqual(this.b, seVar.b) && Intrinsics.areEqual(this.c, seVar.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + i02.i(this.a.hashCode() * 31, 31, this.b);
    }

    public final String toString() {
        return s01.w(kb0.z("SubtitleFileOption(name=", this.a, ", url=", this.b, ", format="), this.c, ")");
    }
}
