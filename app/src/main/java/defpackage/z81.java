package defpackage;

/* JADX INFO: loaded from: classes4.dex */
public final class z81 implements wb2 {
    public final lf a;
    public final js0 b;

    public z81(lf lfVar, js0 js0Var) {
        this.a = lfVar;
        this.b = js0Var;
    }

    @Override // defpackage.wb2
    public final void a() {
        js0 js0Var = this.b;
        boolean z = js0Var instanceof h52;
        lf lfVar = this.a;
        if (z) {
            lfVar.getClass();
        } else if (js0Var instanceof xg0) {
            lfVar.getClass();
        } else {
            qu.f();
        }
    }
}
