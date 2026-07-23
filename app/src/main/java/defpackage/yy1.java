package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class yy1 {
    public final String a;
    public final qy1 b;

    public yy1(String str, qy1 qy1Var) {
        str.getClass();
        this.a = str;
        this.b = qy1Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof yy1)) {
            return false;
        }
        yy1 yy1Var = (yy1) obj;
        return Intrinsics.areEqual(this.a, yy1Var.a) && this.b == yy1Var.b;
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "ServerSortFocusTarget(serverId=" + this.a + ", action=" + this.b + ")";
    }
}
