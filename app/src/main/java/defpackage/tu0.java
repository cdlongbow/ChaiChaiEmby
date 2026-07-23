package defpackage;

import java.util.concurrent.atomic.AtomicReference;
import java.util.concurrent.locks.LockSupport;

/* JADX INFO: loaded from: classes4.dex */
public abstract class tu0 extends AtomicReference implements Runnable {
    public static final su0 a = new su0();
    public static final su0 b = new su0();

    public abstract void a(Throwable th);

    public abstract void b(Object obj);

    public final void c() {
        su0 su0Var = b;
        su0 su0Var2 = a;
        Runnable runnable = (Runnable) get();
        if (runnable instanceof Thread) {
            ru0 ru0Var = new ru0(this);
            ru0.a(ru0Var, Thread.currentThread());
            if (compareAndSet(runnable, ru0Var)) {
                try {
                    ((Thread) runnable).interrupt();
                } finally {
                    if (((Runnable) getAndSet(su0Var2)) == su0Var) {
                        LockSupport.unpark((Thread) runnable);
                    }
                }
            }
        }
    }

    public abstract boolean d();

    public abstract Object e();

    public abstract String f();

    public final void g(Thread thread) {
        Runnable runnable = (Runnable) get();
        ru0 ru0Var = null;
        boolean z = false;
        int i = 0;
        while (true) {
            boolean z2 = runnable instanceof ru0;
            su0 su0Var = b;
            if (!z2 && runnable != su0Var) {
                break;
            }
            if (z2) {
                ru0Var = (ru0) runnable;
            }
            i++;
            if (i <= 1000) {
                Thread.yield();
            } else if (runnable == su0Var || compareAndSet(runnable, su0Var)) {
                z = Thread.interrupted() || z;
                LockSupport.park(ru0Var);
            }
            runnable = (Runnable) get();
        }
        if (z) {
            thread.interrupt();
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        Thread threadCurrentThread = Thread.currentThread();
        Object objE = null;
        if (compareAndSet(null, threadCurrentThread)) {
            boolean zD = d();
            su0 su0Var = a;
            if (!zD) {
                try {
                    objE = e();
                } catch (Throwable th) {
                    try {
                        if (th instanceof InterruptedException) {
                            Thread.currentThread().interrupt();
                        }
                        if (!compareAndSet(threadCurrentThread, su0Var)) {
                            g(threadCurrentThread);
                        }
                        if (zD) {
                            return;
                        }
                        a(th);
                        return;
                    } catch (Throwable th2) {
                        if (!compareAndSet(threadCurrentThread, su0Var)) {
                            g(threadCurrentThread);
                        }
                        if (!zD) {
                            b(null);
                        }
                        throw th2;
                    }
                }
            }
            if (!compareAndSet(threadCurrentThread, su0Var)) {
                g(threadCurrentThread);
            }
            if (zD) {
                return;
            }
            b(objE);
        }
    }

    @Override // java.util.concurrent.atomic.AtomicReference
    public final String toString() {
        String str;
        Runnable runnable = (Runnable) get();
        if (runnable == a) {
            str = "running=[DONE]";
        } else if (runnable instanceof ru0) {
            str = "running=[INTERRUPTED]";
        } else if (runnable instanceof Thread) {
            str = "running=[RUNNING ON " + ((Thread) runnable).getName() + "]";
        } else {
            str = "running=[NOT STARTED YET]";
        }
        StringBuilder sbX = s01.x(str, ", ");
        sbX.append(f());
        return sbX.toString();
    }
}
