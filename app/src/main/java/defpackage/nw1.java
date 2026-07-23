package defpackage;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.TuplesKt;
import kotlin.collections.ArraysKt;
import kotlin.collections.CollectionsKt;
import kotlin.collections.CollectionsKt;
import kotlin.collections.IndexedValue;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.RangesKt;

/* JADX INFO: loaded from: classes5.dex */
public final class nw1 implements lw1, qn {
    public final String a;
    public final ig2 b;
    public final int c;
    public final List d;
    public final HashSet e;
    public final String[] f;
    public final lw1[] g;
    public final List[] h;
    public final boolean[] i;
    public final Map j;
    public final lw1[] k;
    public final Lazy l;

    public nw1(String str, ig2 ig2Var, int i, List list, wp wpVar) {
        list.getClass();
        this.a = str;
        this.b = ig2Var;
        this.c = i;
        this.d = wpVar.b;
        ArrayList arrayList = wpVar.c;
        this.e = CollectionsKt___CollectionsKt.toHashSet(arrayList);
        String[] strArr = (String[]) arrayList.toArray(new String[0]);
        this.f = strArr;
        this.g = hg2.o(wpVar.e);
        this.h = (List[]) wpVar.f.toArray(new List[0]);
        this.i = CollectionsKt___CollectionsKt.toBooleanArray(wpVar.g);
        Iterable<IndexedValue> iterableWithIndex = ArraysKt.withIndex(strArr);
        ArrayList arrayList2 = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(iterableWithIndex, 10));
        for (IndexedValue indexedValue : iterableWithIndex) {
            arrayList2.add(TuplesKt.to(indexedValue.getValue(), Integer.valueOf(indexedValue.getIndex())));
        }
        this.j = MapsKt.toMap(arrayList2);
        this.k = hg2.o(list);
        this.l = LazyKt.lazy(new c71(this, 20));
    }

    @Override // defpackage.qn
    public final Set a() {
        return this.e;
    }

    @Override // defpackage.lw1
    public final boolean b() {
        return false;
    }

    @Override // defpackage.lw1

    @Override // defpackage.lw1
    public final String d(int i) {
        return this.f[i];
    }

    @Override // defpackage.lw1
    public final lw1 e(int i) {
        return this.g[i];
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof nw1) {
            lw1 lw1Var = (lw1) obj;
            if (Intrinsics.areEqual(this.a, lw1Var.f()) && Arrays.equals(this.k, ((nw1) obj).k)) {
                int iC = lw1Var.c();
                int i = this.c;
                if (i == iC) {
                    for (int i2 = 0; i2 < i; i2++) {
                        lw1[] lw1VarArr = this.g;
                        if (Intrinsics.areEqual(lw1VarArr[i2].f(), lw1Var.e(i2).f()) && Intrinsics.areEqual(lw1VarArr[i2].getKind(), lw1Var.e(i2).getKind())) {
                        }
                    }
                    return true;
                }
            }
        }
        return false;
    }

    @Override // defpackage.lw1

    @Override // defpackage.lw1
    public final boolean g(int i) {
        return this.i[i];
    }

    @Override // defpackage.lw1

    public final int hashCode() {
        return ((Number) this.l.getValue()).intValue();
    }

    @Override // defpackage.lw1
    public final boolean isInline() {
        return false;
    }

    public final String toString() {
        return CollectionsKt___CollectionsKt.joinToString$default(RangesKt.until(0, this.c), ", ", this.a.concat("("), ")", 0, null, new kh1(this, 20), 24, null);
    }
}
