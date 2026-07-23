package defpackage;

import java.util.ArrayList;

/* JADX INFO: loaded from: classes4.dex */
public final class wz1 implements vu {
    public final String a;
    public final ua b;
    public final ArrayList c;
    public final ta d;
    public final ta e;
    public final ua f;
    public final int g;
    public final int h;
    public final float i;
    public final boolean j;

    public wz1(String str, ua uaVar, ArrayList arrayList, ta taVar, ta taVar2, ua uaVar2, int i, int i2, float f, boolean z) {
        this.a = str;
        this.b = uaVar;
        this.c = arrayList;
        this.d = taVar;
        this.e = taVar2;
        this.f = uaVar2;
        this.g = i;
        this.h = i2;
        this.i = f;
        this.j = z;
    }

    @Override // defpackage.vu
    public final ou a(x11 x11Var, g11 g11Var, gj gjVar) {
        return new k32(x11Var, gjVar, this);
    }
}
