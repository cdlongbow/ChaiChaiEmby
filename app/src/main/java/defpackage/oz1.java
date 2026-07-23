package defpackage;

import android.graphics.Path;

/* JADX INFO: loaded from: classes4.dex */
public final class oz1 implements vu {
    public final boolean a;
    public final Path.FillType b;
    public final String c;
    public final ta d;
    public final ta e;
    public final boolean f;

    public oz1(String str, boolean z, Path.FillType fillType, ta taVar, ta taVar2, boolean z2) {
        this.c = str;
        this.a = z;
        this.b = fillType;
        this.d = taVar;
        this.e = taVar2;
        this.f = z2;
    }

    @Override // defpackage.vu
    public final ou a(x11 x11Var, g11 g11Var, gj gjVar) {
        return new jk0(x11Var, gjVar, this);
    }

    public final String toString() {
        return wn.i(new StringBuilder("ShapeFill{color=, fillEnabled="), this.a, '}');
    }
}
