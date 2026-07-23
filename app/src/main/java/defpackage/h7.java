package defpackage;

import java.util.ArrayList;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class h7 {
    public final String a;
    public final boolean b;
    public final boolean c;
    public final List d;
    public final List e;
    public final boolean f;

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ h7(String str, ArrayList arrayList, int i) {
        String str2 = (i & 1) != 0 ? "" : str;
        boolean z = false;
        if ((i & 2) == 0) {
            z = true;
        }
        this(str2, z, (i & 4) == 0, (i & 8) != 0 ? CollectionsKt.emptyList() : arrayList, CollectionsKt.emptyList(), false);
    }

    public static h7 a(h7 h7Var, String str, boolean z, List list, List list2, boolean z2, int i) {
        if ((i & 1) != 0) {
            str = h7Var.a;
        }
        String str2 = str;
        if ((i & 2) != 0) {
            z = h7Var.b;
        }
        boolean z3 = z;
        boolean z4 = h7Var.c;
        if ((i & 8) != 0) {
            list = h7Var.d;
        }
        List list3 = list;
        if ((i & 16) != 0) {
            list2 = h7Var.e;
        }
        List list4 = list2;
        if ((i & 32) != 0) {
            z2 = h7Var.f;
        }
        h7Var.getClass();
        str2.getClass();
        list3.getClass();
        list4.getClass();
        return new h7(str2, z3, z4, list3, list4, z2);
    }


    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof h7)) {
            return false;
        }
        h7 h7Var = (h7) obj;
        return Intrinsics.areEqual(this.a, h7Var.a) && this.b == h7Var.b && this.c == h7Var.c && Intrinsics.areEqual(this.d, h7Var.d) && Intrinsics.areEqual(this.e, h7Var.e) && this.f == h7Var.f;
    }

    public final int hashCode() {
        return qi0.f(this.e, qi0.f(this.d, ((((this.a.hashCode() * 31) + (this.b ? 1231 : 1237)) * 31) + (this.c ? 1231 : 1237)) * 31, 31), 31) + (this.f ? 1231 : 1237);
    }

    public final String toString() {
        return "AggregateHubSearchState(query=" + this.a + ", isSearching=" + this.b + ", hasSearched=" + this.c + ", results=" + this.d + ", suggestItems=" + this.e + ", isFetchingSuggest=" + this.f + ")";
    }

    public h7(String str, boolean z, boolean z2, List list, List list2, boolean z3) {
        str.getClass();
        list.getClass();
        list2.getClass();
        this.a = str;
        this.b = z;
        this.c = z2;
        this.d = list;
        this.e = list2;
        this.f = z3;
    }
}
