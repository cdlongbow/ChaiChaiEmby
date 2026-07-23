package defpackage;

import java.util.concurrent.Callable;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes3.dex */
public final class i51 extends f51 implements ScheduledExecutorService {
    public final ScheduledExecutorService b;

    public i51(ScheduledExecutorService scheduledExecutorService) {
        super(scheduledExecutorService);
        this.b = scheduledExecutorService;
    }

    @Override // defpackage.f51, java.lang.AutoCloseable
    public final /* synthetic */ void close() {
        b0.g(this);
    }

    @Override // java.util.concurrent.ScheduledExecutorService
    public final ScheduledFuture schedule(Runnable runnable, long j, TimeUnit timeUnit) {
        dc2 dc2Var = new dc2(Executors.callable(runnable, null));
        return new g51(dc2Var, this.b.schedule(dc2Var, j, timeUnit));
    }

    @Override // java.util.concurrent.ScheduledExecutorService
    public final ScheduledFuture scheduleAtFixedRate(Runnable runnable, long j, long j2, TimeUnit timeUnit) {
        h51 h51Var = new h51(runnable);
        return new g51(h51Var, this.b.scheduleAtFixedRate(h51Var, j, j2, timeUnit));
    }

    @Override // java.util.concurrent.ScheduledExecutorService
    public final ScheduledFuture scheduleWithFixedDelay(Runnable runnable, long j, long j2, TimeUnit timeUnit) {
        h51 h51Var = new h51(runnable);
        return new g51(h51Var, this.b.scheduleWithFixedDelay(h51Var, j, j2, timeUnit));
    }

    @Override // java.util.concurrent.ScheduledExecutorService
    public final ScheduledFuture schedule(Callable callable, long j, TimeUnit timeUnit) {
        dc2 dc2Var = new dc2(callable);
        return new g51(dc2Var, this.b.schedule(dc2Var, j, timeUnit));
    }
}
