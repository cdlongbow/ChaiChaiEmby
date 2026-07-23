package defpackage;

import java.util.concurrent.Callable;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes4.dex */
public final class br extends tu0 {
    public final Executor c;
    public final /* synthetic */ cr d;
    public final /* synthetic */ int e;
    public final /* synthetic */ cr g;
    public final Object h;

    public br(cr crVar, Object obj, Executor executor, int i) {
        this.e = i;
        this.g = crVar;
        this.d = crVar;
        executor.getClass();
        this.c = executor;
        this.h = obj;
    }

    @Override // defpackage.tu0
    public final void a(Throwable th) {
        cr crVar = this.d;
        crVar.q = null;
        if (th instanceof ExecutionException) {
            crVar.l(((ExecutionException) th).getCause());
        } else if (th instanceof CancellationException) {
            crVar.cancel(false);
        } else {
            crVar.l(th);
        }
    }

    @Override // defpackage.tu0
    public final void b(Object obj) {
        this.d.q = null;
        int i = this.e;
        cr crVar = this.g;
        switch (i) {
            case 0:
                crVar.m((f01) obj);
                break;
            default:
                crVar.k(obj);
                break;
        }
    }

    @Override // defpackage.tu0
    public final boolean d() {
        return this.d.isDone();
    }

    @Override // defpackage.tu0
    public final Object e() throws Exception {
        int i = this.e;
        Object obj = this.h;
        switch (i) {
            case 0:
                g1 g1Var = (g1) obj;
                f01 f01VarLambda$setEffectsAsync$0 = ((ExperimentalBitmapProcessor) g1Var.b).lambda$setEffectsAsync$0();
                if (f01VarLambda$setEffectsAsync$0 != null) {
                    return f01VarLambda$setEffectsAsync$0;
                }
                n41.l(hg2.D("AsyncCallable.call returned null instead of a Future. Did you mean to return immediateFuture(null)? %s", g1Var));
                return null;
            default:
                return ((Callable) obj).call();
        }
    }

    @Override // defpackage.tu0
    public final String f() {
        switch (this.e) {
            case 0:
                return ((g1) this.h).toString();
            default:
                return ((Callable) this.h).toString();
        }
    }
}
