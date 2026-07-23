package defpackage;

import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class i7 {
    public final List a;
    public final List b;
    public final List c;

    public i7(List list, List list2, List list3) {
        list.getClass();
        list2.getClass();
        list3.getClass();
        this.a = list;
        this.b = list2;
        this.c = list3;
    }

    public static i7 a(i7 i7Var, List list, List list2, List list3, int i) {
        if ((i & 1) != 0) {
            list = i7Var.a;
        }
        if ((i & 2) != 0) {
            list2 = i7Var.b;
        }
        if ((i & 4) != 0) {
            list3 = i7Var.c;
        }
        list.getClass();
        list2.getClass();
        list3.getClass();
        return new i7(list, list2, list3);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof i7)) {
            return false;
        }
        i7 i7Var = (i7) obj;
        return Intrinsics.areEqual(this.a, i7Var.a) && Intrinsics.areEqual(this.b, i7Var.b) && Intrinsics.areEqual(this.c, i7Var.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + qi0.f(this.b, this.a.hashCode() * 31, 31);
    }

    public final String toString() {
        return "AggregateHubUiState(librarySections=" + this.a + ", favoriteSections=" + this.b + ", recentSections=" + this.c + ")";
    }

    public /* synthetic */ i7() {
        this(CollectionsKt.emptyList(), CollectionsKt.emptyList(), CollectionsKt.emptyList());
    }
}
