package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class p61 {
    public final String a;
    public final boolean b;

    public p61(String str, boolean z) {
        this.a = str;
        this.b = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof p61)) {
            return false;
        }
        p61 p61Var = (p61) obj;
        return Intrinsics.areEqual(this.a, p61Var.a) && this.b == p61Var.b;
    }

    public final int hashCode() {
        return (this.a.hashCode() * 31) + (this.b ? 1231 : 1237);
    }

    public final String toString() {
        return "ImageProxyDecision(host=" + this.a + ", useSocksDns=" + this.b + ")";
    }
}
