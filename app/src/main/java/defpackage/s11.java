package defpackage;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class s11 implements v11 {
    public final /* synthetic */ x11 a;
    public final /* synthetic */ int b;
    public final /* synthetic */ int c;

    public /* synthetic */ s11(x11 x11Var, int i, int i2) {
        this.a = x11Var;
        this.b = i;
        this.c = i2;
    }

    @Override // defpackage.v11
    public final void run() {
        x11 x11Var = this.a;
        g11 g11Var = x11Var.a;
        int i = this.b;
        int i2 = this.c;
        if (g11Var == null) {
            x11Var.g.add(new s11(x11Var, i, i2));
        } else {
            x11Var.b.j(i, i2 + 0.99f);
        }
    }
}
