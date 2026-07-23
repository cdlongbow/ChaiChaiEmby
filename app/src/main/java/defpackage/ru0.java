package defpackage;

import java.util.concurrent.locks.AbstractOwnableSynchronizer;

/* JADX INFO: loaded from: classes4.dex */
public final class ru0 extends AbstractOwnableSynchronizer implements Runnable {
    public final tu0 a;

    public ru0(tu0 tu0Var) {
        this.a = tu0Var;
    }

    public static void a(ru0 ru0Var, Thread thread) {
        ru0Var.setExclusiveOwnerThread(thread);
    }

    public final String toString() {
        return this.a.toString();
    }

    @Override // java.lang.Runnable
    public final void run() {
    }
}
