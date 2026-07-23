package defpackage;

import java.util.Arrays;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public final class qz1 implements vu {
    public final String a;
    public final List b;
    public final boolean c;

    public qz1(String str, List list, boolean z) {
        this.a = str;
        this.b = list;
        this.c = z;
    }

    @Override // defpackage.vu
    public final ou a(x11 x11Var, g11 g11Var, gj gjVar) {
        return new pu(x11Var, gjVar, this, g11Var);
    }

    public final String toString() {
        return "ShapeGroup{name='" + this.a + "' Shapes: " + Arrays.toString(this.b.toArray()) + '}';
    }
}
