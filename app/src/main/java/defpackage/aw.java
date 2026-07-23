package defpackage;

/* JADX INFO: loaded from: classes4.dex */
public final class aw implements wb2 {
    public final lf a;
    public final js0 b;
    public final int c;

    public aw(lf lfVar, js0 js0Var, int i) {
        this.a = lfVar;
        this.b = js0Var;
        this.c = i;
        if (i > 0) {
            return;
        }
        ra.q("durationMillis must be > 0.");
        throw null;
    }

    @Override // defpackage.wb2
    public final void a() {
        this.a.getClass();
        js0 js0Var = this.b;
        if (js0Var.b() != null) {
            rd1.f();
            return;
        }
        boolean z = js0Var instanceof h52;
        xv xvVar = new xv(js0Var.a().q, this.c, (z && ((h52) js0Var).g) ? false : true);
        if (z) {
            ig2.f(xvVar);
        } else if (js0Var instanceof xg0) {
            ig2.f(xvVar);
        } else {
            qu.f();
        }
    }
}
