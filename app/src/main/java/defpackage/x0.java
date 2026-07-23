package defpackage;

import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;

/* JADX INFO: loaded from: classes3.dex */
public abstract class x0 extends al0 implements Runnable {
    public static final /* synthetic */ int k = 0;
    public f01 i;
    public Object j;

    public x0(f01 f01Var, Object obj) {
        f01Var.getClass();
        this.i = f01Var;
        this.j = obj;
    }

    @Override // defpackage.y
    public final void b() {
        f01 f01Var = this.i;
        if ((f01Var != null) & isCancelled()) {
            f01Var.cancel(o());
        }
        this.i = null;
        this.j = null;
    }

    @Override // defpackage.y
    public final String i() {
        String str;
        f01 f01Var = this.i;
        Object obj = this.j;
        String strI = super.i();
        if (f01Var != null) {
            str = "inputFuture=[" + f01Var + "], ";
        } else {
            str = "";
        }
        if (obj == null) {
            if (strI != null) {
                return str.concat(strI);
            }
            return null;
        }
        return str + "function=[" + obj + "]";
    }

    public abstract Object p(Object obj, Object obj2);

    public abstract void q(Object obj);

    @Override // java.lang.Runnable
    public final void run() {
        f01 f01Var = this.i;
        Object obj = this.j;
        if (((this.a instanceof j) | (f01Var == null)) || (obj == null)) {
            return;
        }
        this.i = null;
        if (f01Var.isCancelled()) {
            m(f01Var);
            return;
        }
        try {
            if (!f01Var.isDone()) {
                throw new IllegalStateException(hg2.D("Future was expected to be done: %s", f01Var));
            }
            try {
                Object objP = p(obj, hg2.z(f01Var));
                this.j = null;
                q(objP);
            } catch (Throwable th) {
                try {
                    if (th instanceof InterruptedException) {
                        Thread.currentThread().interrupt();
                    }
                    l(th);
                } finally {
                    this.j = null;
                }
            }
        } catch (Error e) {
            l(e);
        } catch (CancellationException unused) {
            cancel(false);
        } catch (ExecutionException e2) {
            l(e2.getCause());
        } catch (Exception e3) {
            l(e3);
        }
    }
}
