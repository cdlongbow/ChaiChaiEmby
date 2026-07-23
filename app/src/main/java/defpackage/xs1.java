package defpackage;

/* JADX INFO: loaded from: classes4.dex */
public final class xs1 implements vu {
    public final /* synthetic */ int a = 0;
    public final String b;
    public final ua c;
    public final boolean d;
    public final db e;
    public final Object f;

    public xs1(String str, ua uaVar, ua uaVar2, bb bbVar, boolean z) {
        this.b = str;
        this.c = uaVar;
        this.e = uaVar2;
        this.f = bbVar;
        this.d = z;
    }

    @Override // defpackage.vu
    public final ou a(x11 x11Var, g11 g11Var, gj gjVar) {
        switch (this.a) {
            case 0:
                return new ws1(x11Var, gjVar, this);
            default:
                return new ot1(x11Var, gjVar, this);
        }
    }

    public String toString() {
        switch (this.a) {
            case 0:
                return "RectangleShape{position=" + this.e + ", size=" + ((db) this.f) + '}';
            default:
                return super.toString();
        }
    }

    public xs1(String str, db dbVar, ta taVar, ua uaVar, boolean z) {
        this.b = str;
        this.e = dbVar;
        this.f = taVar;
        this.c = uaVar;
        this.d = z;
    }
}
