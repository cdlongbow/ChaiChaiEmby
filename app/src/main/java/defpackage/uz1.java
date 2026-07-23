package defpackage;

/* JADX INFO: loaded from: classes4.dex */
public final class uz1 implements vu {
    public final String a;
    public final int b;
    public final ta c;
    public final boolean d;

    public uz1(String str, int i, ta taVar, boolean z) {
        this.a = str;
        this.b = i;
        this.c = taVar;
        this.d = z;
    }

    @Override // defpackage.vu
    public final ou a(x11 x11Var, g11 g11Var, gj gjVar) {
        return new lz1(x11Var, gjVar, this);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ShapePath{name=");
        sb.append(this.a);
        sb.append(", index=");
        return i02.p(sb, this.b, '}');
    }
}
