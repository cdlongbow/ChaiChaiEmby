package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class px0 {
    public final qx0 a;
    public final String b;
    public final boolean c;

    public px0(qx0 qx0Var, String str, boolean z) {
        this.a = qx0Var;
        this.b = str;
        this.c = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof px0)) {
            return false;
        }
        px0 px0Var = (px0) obj;
        return this.a == px0Var.a && Intrinsics.areEqual(this.b, px0Var.b) && this.c == px0Var.c;
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() * 31;
        String str = this.b;
        return ((iHashCode + (str == null ? 0 : str.hashCode())) * 31) + (this.c ? 1231 : 1237);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("LibraryBrowseConfig(mode=");
        sb.append(this.a);
        sb.append(", includeItemTypes=");
        sb.append(this.b);
        sb.append(", recursive=");
        return i9.i(sb, this.c, ")");
    }
}
