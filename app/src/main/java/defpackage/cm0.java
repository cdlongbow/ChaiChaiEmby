package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class cm0 extends r implements Runnable {
    public f01 i;

    @Override // defpackage.y
    public final void b() {
        this.i = null;
    }

    @Override // defpackage.y
    public final String i() {
        f01 f01Var = this.i;
        if (f01Var == null) {
            return null;
        }
        return "delegate=[" + f01Var + "]";
    }

    @Override // java.lang.Runnable
    public final void run() {
        f01 f01Var = this.i;
        if (f01Var != null) {
            m(f01Var);
        }
    }
}
