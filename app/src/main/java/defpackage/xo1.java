package defpackage;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.RangesKt;

/* JADX INFO: loaded from: classes5.dex */
public class xo1 implements lw1, qn {
    public final String a;
    public final jm0 b;
    public final int c;
    public int d;
    public final String[] e;
    public final List[] f;
    public final boolean[] g;
    public Map h;
    public final Lazy i;
    public final Lazy j;
    public final Lazy k;

    public xo1(String str, jm0 jm0Var, int i) {
        str.getClass();
        this.a = str;
        this.b = jm0Var;
        this.c = i;
        this.d = -1;
        String[] strArr = new String[i];
        final int i2 = 0;
        for (int i3 = 0; i3 < i; i3++) {
            strArr[i3] = "[UNINITIALIZED]";
        }
        this.e = strArr;
        int i4 = this.c;
        this.f = new List[i4];
        this.g = new boolean[i4];
        this.h = MapsKt.emptyMap();
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.PUBLICATION;
        this.i = LazyKt.lazy(lazyThreadSafetyMode, new Function0(this) { // from class: wo1
            public final /* synthetic */ xo1 b;

            {
                this.b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                xv0[] xv0VarArrChildSerializers;
                ArrayList arrayList;
                xv0[] xv0VarArrTypeParametersSerializers;
                int i5 = i2;
                xo1 xo1Var = this.b;
                switch (i5) {
                    case 0:
                        jm0 jm0Var2 = xo1Var.b;
                        return (jm0Var2 == null || (xv0VarArrChildSerializers = jm0Var2.childSerializers()) == null) ? ig2.b : xv0VarArrChildSerializers;
                    case 1:
                        jm0 jm0Var3 = xo1Var.b;
                        if (jm0Var3 == null || (xv0VarArrTypeParametersSerializers = jm0Var3.typeParametersSerializers()) == null) {
                            arrayList = null;
                        } else {
                            arrayList = new ArrayList(xv0VarArrTypeParametersSerializers.length);
                            for (xv0 xv0Var : xv0VarArrTypeParametersSerializers) {
                                arrayList.add(xv0Var.getDescriptor());
                            }
                        }
                        return hg2.o(arrayList);
                    default:
                        return Integer.valueOf(tl0.A(xo1Var, (lw1[]) xo1Var.j.getValue()));
                }
            }
        });
        final int i5 = 1;
        this.j = LazyKt.lazy(lazyThreadSafetyMode, new Function0(this) { // from class: wo1
            public final /* synthetic */ xo1 b;

            {
                this.b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                xv0[] xv0VarArrChildSerializers;
                ArrayList arrayList;
                xv0[] xv0VarArrTypeParametersSerializers;
                int i6 = i5;
                xo1 xo1Var = this.b;
                switch (i6) {
                    case 0:
                        jm0 jm0Var2 = xo1Var.b;
                        return (jm0Var2 == null || (xv0VarArrChildSerializers = jm0Var2.childSerializers()) == null) ? ig2.b : xv0VarArrChildSerializers;
                    case 1:
                        jm0 jm0Var3 = xo1Var.b;
                        if (jm0Var3 == null || (xv0VarArrTypeParametersSerializers = jm0Var3.typeParametersSerializers()) == null) {
                            arrayList = null;
                        } else {
                            arrayList = new ArrayList(xv0VarArrTypeParametersSerializers.length);
                            for (xv0 xv0Var : xv0VarArrTypeParametersSerializers) {
                                arrayList.add(xv0Var.getDescriptor());
                            }
                        }
                        return hg2.o(arrayList);
                    default:
                        return Integer.valueOf(tl0.A(xo1Var, (lw1[]) xo1Var.j.getValue()));
                }
            }
        });
        final int i6 = 2;
        this.k = LazyKt.lazy(lazyThreadSafetyMode, new Function0(this) { // from class: wo1
            public final /* synthetic */ xo1 b;

            {
                this.b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                xv0[] xv0VarArrChildSerializers;
                ArrayList arrayList;
                xv0[] xv0VarArrTypeParametersSerializers;
                int i7 = i6;
                xo1 xo1Var = this.b;
                switch (i7) {
                    case 0:
                        jm0 jm0Var2 = xo1Var.b;
                        return (jm0Var2 == null || (xv0VarArrChildSerializers = jm0Var2.childSerializers()) == null) ? ig2.b : xv0VarArrChildSerializers;
                    case 1:
                        jm0 jm0Var3 = xo1Var.b;
                        if (jm0Var3 == null || (xv0VarArrTypeParametersSerializers = jm0Var3.typeParametersSerializers()) == null) {
                            arrayList = null;
                        } else {
                            arrayList = new ArrayList(xv0VarArrTypeParametersSerializers.length);
                            for (xv0 xv0Var : xv0VarArrTypeParametersSerializers) {
                                arrayList.add(xv0Var.getDescriptor());
                            }
                        }
                        return hg2.o(arrayList);
                    default:
                        return Integer.valueOf(tl0.A(xo1Var, (lw1[]) xo1Var.j.getValue()));
                }
            }
        });
    }

    @Override // defpackage.qn
    public final Set a() {
        return this.h.keySet();
    }

    @Override // defpackage.lw1
    public final boolean b() {
        return false;
    }

    @Override // defpackage.lw1

    @Override // defpackage.lw1
    public final String d(int i) {
        return this.e[i];
    }

    @Override // defpackage.lw1
    public lw1 e(int i) {
        return ((xv0[]) this.i.getValue())[i].getDescriptor();
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof xo1) {
            lw1 lw1Var = (lw1) obj;
            if (Intrinsics.areEqual(this.a, lw1Var.f()) && Arrays.equals((lw1[]) this.j.getValue(), (lw1[]) ((xo1) obj).j.getValue())) {
                int iC = lw1Var.c();
                int i = this.c;
                if (i == iC) {
                    for (int i2 = 0; i2 < i; i2++) {
                        if (Intrinsics.areEqual(e(i2).f(), lw1Var.e(i2).f()) && Intrinsics.areEqual(e(i2).getKind(), lw1Var.e(i2).getKind())) {
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
        return this.g[i];
    }

    @Override // defpackage.lw1
    public ig2 getKind() {
        return l32.e;
    }

    public final void h(String str) {
        str.getClass();
        int i = this.d + 1;
        this.d = i;
        String[] strArr = this.e;
        strArr[i] = str;
        this.g[i] = false;
        this.f[i] = null;
        if (i == this.c - 1) {
            HashMap map = new HashMap();
            int length = strArr.length;
            for (int i2 = 0; i2 < length; i2++) {
                map.put(strArr[i2], Integer.valueOf(i2));
            }
            this.h = map;
        }
    }

    public int hashCode() {
        return ((Number) this.k.getValue()).intValue();
    }

    @Override // defpackage.lw1
    public boolean isInline() {
        return false;
    }

    public String toString() {
        return CollectionsKt___CollectionsKt.joinToString$default(RangesKt.until(0, this.c), ", ", qb2.i(new StringBuilder(), this.a, '('), ")", 0, null, new kh1(this, 4), 24, null);
    }
}
