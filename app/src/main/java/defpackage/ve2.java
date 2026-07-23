package defpackage;

import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class ve2 {
    public final rf2 a;
    public final List b;
    public final List c;
    public final List d;
    public final ArrayList e;

    public ve2(rf2 rf2Var, List list, List list2, List list3, ArrayList arrayList) {
        list.getClass();
        list2.getClass();
        list3.getClass();
        this.a = rf2Var;
        this.b = list;
        this.c = list2;
        this.d = list3;
        this.e = arrayList;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ve2)) {
            return false;
        }
        ve2 ve2Var = (ve2) obj;
        return Intrinsics.areEqual(this.a, ve2Var.a) && Intrinsics.areEqual(this.b, ve2Var.b) && Intrinsics.areEqual(this.c, ve2Var.c) && Intrinsics.areEqual(this.d, ve2Var.d) && Intrinsics.areEqual(this.e, ve2Var.e);
    }

    public final int hashCode() {
        return this.e.hashCode() + qi0.f(this.d, qi0.f(this.c, qi0.f(this.b, this.a.hashCode() * 31, 31), 31), 31);
    }

    public final String toString() {
        return "WebDavDownloadPreview(snapshot=" + this.a + ", availableSections=" + this.b + ", selectedSections=" + this.c + ", appliedSections=" + this.d + ", missingSelectedSections=" + this.e + ")";
    }
}
