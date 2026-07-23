package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class ai0 {
    public final String a;
    public final String b;

    public ai0(String str, String str2) {
        str.getClass();
        this.a = str;
        this.b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ai0)) {
            return false;
        }
        ai0 ai0Var = (ai0) obj;
        return Intrinsics.areEqual(this.a, ai0Var.a) && Intrinsics.areEqual(this.b, ai0Var.b);
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() * 31;
        String str = this.b;
        return iHashCode + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        return mr.s("ExternalPlaybackTarget(itemId=", this.a, ", mediaSourceId=", this.b, ")");
    }
}
