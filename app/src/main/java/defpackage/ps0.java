package defpackage;

import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import java.util.logging.Level;

/* JADX INFO: loaded from: classes4.dex */
public final class ps0 implements f01 {
    public static final ps0 a = new ps0();
    public static final gx0 b = new gx0(ps0.class);

    @Override // defpackage.f01
    public final void addListener(Runnable runnable, Executor executor) {
        ig2.t(executor, "Executor was null.");
        try {
            executor.execute(runnable);
        } catch (Exception e) {
            b.a().log(Level.SEVERE, "RuntimeException while executing runnable " + runnable + " with executor " + executor, (Throwable) e);
        }
    }

    @Override // java.util.concurrent.Future
    public final boolean cancel(boolean z) {
        return false;
    }

    @Override // java.util.concurrent.Future
    public final Object get(long j, TimeUnit timeUnit) {
        timeUnit.getClass();
        return null;
    }

    @Override // java.util.concurrent.Future
    public final boolean isCancelled() {
        return false;
    }

    @Override // java.util.concurrent.Future
    public final boolean isDone() {
        return true;
    }

    public final String toString() {
        return s01.w(new StringBuilder(), super.toString(), "[status=SUCCESS, result=[null]]");
    }

    @Override // java.util.concurrent.Future
    public final Object get() {
        return null;
    }
}
