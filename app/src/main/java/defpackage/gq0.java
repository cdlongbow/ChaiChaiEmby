package defpackage;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class gq0 extends hq0 {
    public final List a;
    public final List b;
    public final List c;

    public gq0(List list, List list2, List list3) {
        list2.getClass();
        this.a = list;
        this.b = list2;
        this.c = list3;
    }

    public static gq0 a(gq0 gq0Var, List list, List list2, List list3, int i) {
        if ((i & 1) != 0) {
            list = gq0Var.a;
        }
        if ((i & 2) != 0) {
            list2 = gq0Var.b;
        }
        if ((i & 4) != 0) {
            list3 = gq0Var.c;
        }
        list.getClass();
        list2.getClass();
        list3.getClass();
        return new gq0(list, list2, list3);
    }


    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof gq0)) {
            return false;
        }
        gq0 gq0Var = (gq0) obj;
        return Intrinsics.areEqual(this.a, gq0Var.a) && Intrinsics.areEqual(this.b, gq0Var.b) && Intrinsics.areEqual(this.c, gq0Var.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + qi0.f(this.b, this.a.hashCode() * 31, 31);
    }

    public final String toString() {
        return "Success(libraries=" + this.a + ", resumeItems=" + this.b + ", libraryContents=" + this.c + ")";
    }
}
