package defpackage;

import java.util.Set;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* JADX INFO: loaded from: classes4.dex */
public final class c3 extends ig2 {
    public final AtomicReferenceFieldUpdater e;
    public final AtomicIntegerFieldUpdater f;

    public c3(AtomicReferenceFieldUpdater atomicReferenceFieldUpdater, AtomicIntegerFieldUpdater atomicIntegerFieldUpdater) {
        super(2);
        this.e = atomicReferenceFieldUpdater;
        this.f = atomicIntegerFieldUpdater;
    }

    @Override // defpackage.ig2
    public final int A(b3 b3Var) {
        return this.f.decrementAndGet(b3Var);
    }

    @Override // defpackage.ig2
    public final void z(b3 b3Var, Set set) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        do {
            atomicReferenceFieldUpdater = this.e;
            if (atomicReferenceFieldUpdater.compareAndSet(b3Var, null, set)) {
                return;
            }
        } while (atomicReferenceFieldUpdater.get(b3Var) == null);
    }
}
