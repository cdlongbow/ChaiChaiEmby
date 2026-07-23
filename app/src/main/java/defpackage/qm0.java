package defpackage;

import java.util.ArrayList;

/* JADX INFO: loaded from: classes4.dex */
public final class qm0 implements vu {
    public final String a;
    public final int b;
    public final ta c;
    public final ta d;
    public final ta e;
    public final ta f;
    public final ua g;
    public final int h;
    public final int i;
    public final float j;
    public final ArrayList k;
    public final ua l;
    public final boolean m;

    public qm0(String str, int i, ta taVar, ta taVar2, ta taVar3, ta taVar4, ua uaVar, int i2, int i3, float f, ArrayList arrayList, ua uaVar2, boolean z) {
        this.a = str;
        this.b = i;
        this.c = taVar;
        this.d = taVar2;
        this.e = taVar3;
        this.f = taVar4;
        this.g = uaVar;
        this.h = i2;
        this.i = i3;
        this.j = f;
        this.k = arrayList;
        this.l = uaVar2;
        this.m = z;
    }

    @Override // defpackage.vu
    public final ou a(x11 x11Var, g11 g11Var, gj gjVar) {
        return new rm0(x11Var, gjVar, this);
    }
}
