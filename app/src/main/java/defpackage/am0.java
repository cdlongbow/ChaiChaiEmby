package defpackage;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;

/* JADX INFO: loaded from: classes4.dex */
public final class am0 implements Runnable {
    public final Future a;
    public final yl0 b;

    public am0(f01 f01Var, yl0 yl0Var) {
        this.a = f01Var;
        this.b = yl0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Throwable thN;
        Future future = this.a;
        boolean z = future instanceof y;
        yl0 yl0Var = this.b;
        if (z && (thN = ((y) future).n()) != null) {
            yl0Var.onFailure(thN);
            return;
        }
        try {
            if (!future.isDone()) {
                throw new IllegalStateException(hg2.D("Future was expected to be done: %s", future));
            }
            yl0Var.onSuccess(hg2.z(future));
        } catch (ExecutionException e) {
            yl0Var.onFailure(e.getCause());
        } catch (Throwable th) {
            yl0Var.onFailure(th);
        }
    }

    public final String toString() {
        rr0 rr0Var = new rr0(am0.class.getSimpleName());
        aa aaVar = new aa();
        ((aa) rr0Var.d).b = aaVar;
        rr0Var.d = aaVar;
        aaVar.a = this.b;
        return rr0Var.toString();
    }
}
