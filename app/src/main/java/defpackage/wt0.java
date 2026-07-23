package defpackage;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class wt0 {
    public final List a;
    public final List b;
    public final long c;
    public final long d;

    public wt0(List list, List list2, long j, long j2) {
        list.getClass();
        list2.getClass();
        this.a = list;
        this.b = list2;
        this.c = j;
        this.d = j2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof wt0)) {
            return false;
        }
        wt0 wt0Var = (wt0) obj;
        return Intrinsics.areEqual(this.a, wt0Var.a) && Intrinsics.areEqual(this.b, wt0Var.b) && this.c == wt0Var.c && this.d == wt0Var.d;
    }

    public final int hashCode() {
        int iF = qi0.f(this.b, this.a.hashCode() * 31, 31);
        long j = this.c;
        long j2 = this.d;
        return ((iF + ((int) (j ^ (j >>> 32)))) * 31) + ((int) (j2 ^ (j2 >>> 32)));
    }

    public final String toString() {
        return "InitialDanmakuLoad(initialItems=" + this.a + ", deferredBatches=" + this.b + ", immediateWindowStartMs=" + this.c + ", immediateWindowEndMs=" + this.d + ")";
    }
}
