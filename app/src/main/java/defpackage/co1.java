package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class co1 extends go1 {
    public final String a;

    public co1(String str) {
        this.a = str;
    }


    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof co1) && Intrinsics.areEqual(this.a, ((co1) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return mr.r("Error(message=", this.a, ")");
    }
}
