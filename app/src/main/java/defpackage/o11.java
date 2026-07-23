package defpackage;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class o11 implements v11 {
    public final /* synthetic */ int a;
    public final /* synthetic */ x11 b;
    public final /* synthetic */ String c;

    public /* synthetic */ o11(x11 x11Var, String str, int i) {
        this.a = i;
        this.b = x11Var;
        this.c = str;
    }

    @Override // defpackage.v11
    public final void run() {
        int i = this.a;
        String str = this.c;
        x11 x11Var = this.b;
        switch (i) {
            case 0:
                x11Var.r(str);
                break;
            case 1:
                x11Var.q(str);
                break;
            default:
                x11Var.t(str);
                break;
        }
    }
}
