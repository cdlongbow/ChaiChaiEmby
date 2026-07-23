package defpackage;

/* JADX INFO: loaded from: classes4.dex */
public final class o implements Runnable {
    public final y a;
    public final f01 b;

    public o(y yVar, f01 f01Var) {
        this.a = yVar;
        this.b = f01Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (this.a.a != this) {
            return;
        }
        if (y.g.d(this.a, this, y.g(this.b))) {
            y.d(this.a, false);
        }
    }
}
