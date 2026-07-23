package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class eq0 extends hq0 {
    public final String a;

    public eq0(String str) {
        this.a = str;
    }


    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof eq0) && Intrinsics.areEqual(this.a, ((eq0) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return mr.r("Error(message=", this.a, ")");
    }
}
