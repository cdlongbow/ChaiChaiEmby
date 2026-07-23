package defpackage;

import java.util.List;
import java.util.Locale;

/* JADX INFO: loaded from: classes4.dex */
public final class mw0 {
    public final List a;
    public final g11 b;
    public final String c;
    public final long d;
    public final int e;
    public final long f;
    public final String g;
    public final List h;
    public final bb i;
    public final int j;
    public final int k;
    public final int l;
    public final float m;
    public final float n;
    public final float o;
    public final float p;
    public final ta q;
    public final aa r;
    public final ua s;
    public final List t;
    public final int u;
    public final boolean v;
    public final ri w;
    public final ab x;
    public final int y;

    public mw0(List list, g11 g11Var, String str, long j, int i, long j2, String str2, List list2, bb bbVar, int i2, int i3, int i4, float f, float f2, float f3, float f4, ta taVar, aa aaVar, List list3, int i5, ua uaVar, boolean z, ri riVar, ab abVar, int i6) {
        this.a = list;
        this.b = g11Var;
        this.c = str;
        this.d = j;
        this.e = i;
        this.f = j2;
        this.g = str2;
        this.h = list2;
        this.i = bbVar;
        this.j = i2;
        this.k = i3;
        this.l = i4;
        this.m = f;
        this.n = f2;
        this.o = f3;
        this.p = f4;
        this.q = taVar;
        this.r = aaVar;
        this.t = list3;
        this.u = i5;
        this.s = uaVar;
        this.v = z;
        this.w = riVar;
        this.x = abVar;
        this.y = i6;
    }

    public final String a(String str) {
        int i;
        StringBuilder sbT = mr.t(str);
        sbT.append(this.c);
        sbT.append("\n");
        long j = this.f;
        g11 g11Var = this.b;
        mw0 mw0Var = (mw0) g11Var.i.get(j);
        if (mw0Var != null) {
            sbT.append("\t\tParents: ");
            sbT.append(mw0Var.c);
            for (mw0 mw0Var2 = (mw0) g11Var.i.get(mw0Var.f); mw0Var2 != null; mw0Var2 = (mw0) g11Var.i.get(mw0Var2.f)) {
                sbT.append("->");
                sbT.append(mw0Var2.c);
            }
            sbT.append(str);
            sbT.append("\n");
        }
        List list = this.h;
        if (!list.isEmpty()) {
            sbT.append(str);
            sbT.append("\tMasks: ");
            sbT.append(list.size());
            sbT.append("\n");
        }
        int i2 = this.j;
        if (i2 != 0 && (i = this.k) != 0) {
            sbT.append(str);
            sbT.append("\tBackground: ");
            sbT.append(String.format(Locale.US, "%dx%d %X\n", Integer.valueOf(i2), Integer.valueOf(i), Integer.valueOf(this.l)));
        }
        List list2 = this.a;
        if (!list2.isEmpty()) {
            sbT.append(str);
            sbT.append("\tShapes:\n");
            for (Object obj : list2) {
                sbT.append(str);
                sbT.append("\t\t");
                sbT.append(obj);
                sbT.append("\n");
            }
        }
        return sbT.toString();
    }

    public final String toString() {
        return a("");
    }
}
