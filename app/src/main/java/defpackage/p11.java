package defpackage;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class p11 implements v11 {
    public final /* synthetic */ int a;
    public final /* synthetic */ x11 b;
    public final /* synthetic */ int c;

    public /* synthetic */ p11(x11 x11Var, int i, int i2) {
        this.a = i2;
        this.b = x11Var;
        this.c = i;
    }

    @Override // defpackage.v11
    public final void run() {
        int i = this.a;
        int i2 = this.c;
        x11 x11Var = this.b;
        switch (i) {
            case 0:
                x11Var.p(i2);
                break;
            case 1:
                x11Var.s(i2);
                break;
            default:
                x11Var.o(i2);
                break;
        }
    }
}
