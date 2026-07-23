package defpackage;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class u11 implements v11 {
    public final /* synthetic */ int a;
    public final /* synthetic */ x11 b;

    public /* synthetic */ u11(x11 x11Var, int i) {
        this.a = i;
        this.b = x11Var;
    }

    @Override // defpackage.v11
    public final void run() {
        int i = this.a;
        x11 x11Var = this.b;
        switch (i) {
            case 0:
                x11Var.m();
                break;
            default:
                x11Var.k();
                break;
        }
    }
}
