package defpackage;

import android.graphics.Path;

/* JADX INFO: loaded from: classes4.dex */
public final class nm0 implements vu {
    public final int a;
    public final Path.FillType b;
    public final ta c;
    public final ta d;
    public final ta e;
    public final ta f;
    public final String g;
    public final boolean h;

    public nm0(String str, int i, Path.FillType fillType, ta taVar, ta taVar2, ta taVar3, ta taVar4, boolean z) {
        this.a = i;
        this.b = fillType;
        this.c = taVar;
        this.d = taVar2;
        this.e = taVar3;
        this.f = taVar4;
        this.g = str;
        this.h = z;
    }

    @Override // defpackage.vu
    public final ou a(x11 x11Var, g11 g11Var, gj gjVar) {
        return new om0(x11Var, g11Var, gjVar, this);
    }
}
