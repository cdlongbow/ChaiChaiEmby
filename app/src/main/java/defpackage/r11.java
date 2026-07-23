package defpackage;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class r11 implements v11 {
    public final /* synthetic */ int a;
    public final /* synthetic */ x11 b;
    public final /* synthetic */ float c;

    public /* synthetic */ r11(x11 x11Var, float f, int i) {
        this.a = i;
        this.b = x11Var;
        this.c = f;
    }

    @Override // defpackage.v11
    public final void run() {
        int i = this.a;
        float f = this.c;
        x11 x11Var = this.b;
        switch (i) {
            case 0:
                g11 g11Var = x11Var.a;
                if (g11Var != null) {
                    h21 h21Var = x11Var.b;
                    h21Var.j(h21Var.k, s41.f(g11Var.l, g11Var.m, f));
                } else {
                    x11Var.g.add(new r11(x11Var, f, 0));
                }
                break;
            case 1:
                g11 g11Var2 = x11Var.a;
                if (g11Var2 != null) {
                    x11Var.s((int) s41.f(g11Var2.l, g11Var2.m, f));
                } else {
                    x11Var.g.add(new r11(x11Var, f, 1));
                }
                break;
            default:
                x11Var.u(f);
                break;
        }
    }
}
