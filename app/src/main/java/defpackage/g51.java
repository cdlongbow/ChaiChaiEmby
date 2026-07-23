package defpackage;

import java.util.concurrent.Delayed;
import java.util.concurrent.Executor;
import java.util.concurrent.Future;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes3.dex */
public final class g51 extends ol0 implements ScheduledFuture, f01, Future {
    public final y a;
    public final ScheduledFuture b;

    public g51(y yVar, ScheduledFuture scheduledFuture) {
        this.a = yVar;
        this.b = scheduledFuture;
    }

    public final boolean a(boolean z) {
        return this.a.cancel(z);
    }

    @Override // defpackage.f01
    public final void addListener(Runnable runnable, Executor executor) {
        this.a.addListener(runnable, executor);
    }

    @Override // java.util.concurrent.Future
    public final boolean cancel(boolean z) {
        boolean zA = a(z);
        if (zA) {
            this.b.cancel(z);
        }
        return zA;
    }

    @Override // java.lang.Comparable
    public final int compareTo(Delayed delayed) {
        return this.b.compareTo(delayed);
    }

    @Override // defpackage.ol0

    @Override // java.util.concurrent.Future
    public final Object get() {
        return this.a.get();
    }

    @Override // java.util.concurrent.Delayed
    public final long getDelay(TimeUnit timeUnit) {
        return this.b.getDelay(timeUnit);
    }

    @Override // java.util.concurrent.Future
    public final boolean isCancelled() {
        return this.a.isCancelled();
    }

    @Override // java.util.concurrent.Future
    public final boolean isDone() {
        return this.a.isDone();
    }

    @Override // java.util.concurrent.Future
    public final Object get(long j, TimeUnit timeUnit) {
        return this.a.get(j, timeUnit);
    }
}
