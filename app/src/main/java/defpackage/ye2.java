package defpackage;

import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

/* JADX INFO: loaded from: classes4.dex */
public final class ye2 {
    public final String a;
    public final String b;
    public final String c;
    public final boolean d;
    public final boolean e;

    public ye2(String str, String str2, String str3, boolean z, boolean z2) {
        str.getClass();
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = z;
        this.e = z2;
    }

    public final ye2 a() {
        String strE = hg2.E(this.a);
        String string = StringsKt.trim((CharSequence) this.b).toString();
        String string2 = StringsKt.trim((CharSequence) this.c).toString();
        strE.getClass();
        string.getClass();
        string2.getClass();
        return new ye2(strE, string, string2, this.d, this.e);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ye2)) {
            return false;
        }
        ye2 ye2Var = (ye2) obj;
        return Intrinsics.areEqual(this.a, ye2Var.a) && Intrinsics.areEqual(this.b, ye2Var.b) && Intrinsics.areEqual(this.c, ye2Var.c) && this.d == ye2Var.d && this.e == ye2Var.e;
    }

    public final int hashCode() {
        return ((i02.i(i02.i(this.a.hashCode() * 31, 31, this.b), 31, this.c) + (this.d ? 1231 : 1237)) * 31) + (this.e ? 1231 : 1237);
    }

    public final String toString() {
        StringBuilder sbZ = kb0.z("WebDavSyncConfig(serverUrl=", this.a, ", username=", this.b, ", password=");
        sbZ.append(this.c);
        sbZ.append(", syncServerConfigurations=");
        sbZ.append(this.d);
        sbZ.append(", syncAppSettings=");
        return i9.i(sbZ, this.e, ")");
    }
}
