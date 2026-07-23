package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class y90 extends z90 {
    public final String a;

    public y90(String str) {
        str.getClass();
        this.a = str;
    }


    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof y90) && Intrinsics.areEqual(this.a, ((y90) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return mr.r("Unavailable(itemId=", this.a, ")");
    }
}
