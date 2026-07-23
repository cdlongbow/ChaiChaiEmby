package defpackage;

/* JADX INFO: loaded from: classes4.dex */
public final class yz1 implements vu {
    public final int a;
    public final ua b;
    public final ua c;
    public final ua d;
    public final boolean e;

    public yz1(String str, int i, ua uaVar, ua uaVar2, ua uaVar3, boolean z) {
        this.a = i;
        this.b = uaVar;
        this.c = uaVar2;
        this.d = uaVar3;
        this.e = z;
    }

    @Override // defpackage.vu
    public final ou a(x11 x11Var, g11 g11Var, gj gjVar) {
        return new ac2(gjVar, this);
    }

    public final String toString() {
        return "Trim Path: {start: " + this.b + ", end: " + this.c + ", offset: " + this.d + "}";
    }
}
