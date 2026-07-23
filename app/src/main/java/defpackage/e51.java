package defpackage;

import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;

/* JADX INFO: loaded from: classes3.dex */
public final class e51 implements Executor {
    public final /* synthetic */ Executor a;
    public final /* synthetic */ x0 b;

    public e51(Executor executor, x0 x0Var) {
        this.a = executor;
        this.b = x0Var;
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        try {
            this.a.execute(runnable);
        } catch (RejectedExecutionException e) {
            this.b.l(e);
        }
    }
}
