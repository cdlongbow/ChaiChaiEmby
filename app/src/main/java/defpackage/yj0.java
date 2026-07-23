package defpackage;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class yj0 {
    public final zj0 a;
    public final String b;
    public final List c;

    public yj0(zj0 zj0Var, String str, List list) {
        list.getClass();
        this.a = zj0Var;
        this.b = str;
        this.c = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof yj0)) {
            return false;
        }
        yj0 yj0Var = (yj0) obj;
        return this.a == yj0Var.a && Intrinsics.areEqual(this.b, yj0Var.b) && Intrinsics.areEqual(this.c, yj0Var.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + i02.i(this.a.hashCode() * 31, 31, this.b);
    }

    public final String toString() {
        return "FavoriteSectionData(type=" + this.a + ", title=" + this.b + ", items=" + this.c + ")";
    }
}
