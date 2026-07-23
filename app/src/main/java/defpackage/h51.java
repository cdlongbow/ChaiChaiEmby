package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class h51 extends r implements Runnable {
    public final Runnable i;

    public h51(Runnable runnable) {
        runnable.getClass();
        this.i = runnable;
    }

    @Override // defpackage.y
    public final String i() {
        return "task=[" + this.i + "]";
    }

    @Override // java.lang.Runnable
    public final void run() {
        try {
            this.i.run();
        } catch (Throwable th) {
            l(th);
            throw th;
        }
    }
}
