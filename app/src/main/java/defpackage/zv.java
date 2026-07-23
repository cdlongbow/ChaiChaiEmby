package defpackage;

/* JADX INFO: loaded from: classes4.dex */
public final class zv implements vb2 {
    public final int b;

    public zv(int i) {
        this.b = i;
        if (i > 0) {
            return;
        }
        ra.q("durationMillis must be > 0.");
        throw null;
    }

    @Override // defpackage.vb2
    public final wb2 a(lf lfVar, js0 js0Var) {
        if (js0Var instanceof h52) {
            return ((h52) js0Var).c == o00.a ? new z81(lfVar, js0Var) : new aw(lfVar, js0Var, this.b);
        }
        return new z81(lfVar, js0Var);
    }
}
