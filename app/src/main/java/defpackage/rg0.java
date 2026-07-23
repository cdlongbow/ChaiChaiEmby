package defpackage;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class rg0 {
    public final String a;
    public final List b;

    public rg0(String str, List list) {
        this.a = str;
        this.b = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof rg0)) {
            return false;
        }
        rg0 rg0Var = (rg0) obj;
        return Intrinsics.areEqual(this.a, rg0Var.a) && Intrinsics.areEqual(this.b, rg0Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "EpisodeRangeBucket(label=" + this.a + ", episodes=" + this.b + ")";
    }
}
