package defpackage;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* JADX INFO: loaded from: classes4.dex */
public final class n extends tl0 {
    public final AtomicReferenceFieldUpdater c;
    public final AtomicReferenceFieldUpdater d;
    public final AtomicReferenceFieldUpdater e;
    public final AtomicReferenceFieldUpdater f;
    public final AtomicReferenceFieldUpdater g;

    public n(AtomicReferenceFieldUpdater atomicReferenceFieldUpdater, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater3, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater4, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater5) {
        this.c = atomicReferenceFieldUpdater;
        this.d = atomicReferenceFieldUpdater2;
        this.e = atomicReferenceFieldUpdater3;
        this.f = atomicReferenceFieldUpdater4;
        this.g = atomicReferenceFieldUpdater5;
    }

    @Override // defpackage.tl0
    public final void N(x xVar, x xVar2) {
        this.d.lazySet(xVar, xVar2);
    }

    @Override // defpackage.tl0
    public final void O(x xVar, Thread thread) {
        this.c.lazySet(xVar, thread);
    }

    @Override // defpackage.tl0
    public final boolean c(y yVar, m mVar, m mVar2) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        do {
            atomicReferenceFieldUpdater = this.f;
            if (atomicReferenceFieldUpdater.compareAndSet(yVar, mVar, mVar2)) {
                return true;
            }
        } while (atomicReferenceFieldUpdater.get(yVar) == mVar);
        return false;
    }

    @Override // defpackage.tl0
    public final boolean d(y yVar, Object obj, Object obj2) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        do {
            atomicReferenceFieldUpdater = this.g;
            if (atomicReferenceFieldUpdater.compareAndSet(yVar, obj, obj2)) {
                return true;
            }
        } while (atomicReferenceFieldUpdater.get(yVar) == obj);
        return false;
    }

    @Override // defpackage.tl0
    public final boolean e(y yVar, x xVar, x xVar2) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        do {
            atomicReferenceFieldUpdater = this.e;
            if (atomicReferenceFieldUpdater.compareAndSet(yVar, xVar, xVar2)) {
                return true;
            }
        } while (atomicReferenceFieldUpdater.get(yVar) == xVar);
        return false;
    }

    @Override // defpackage.tl0
    public final m q(y yVar) {
        return (m) this.f.getAndSet(yVar, m.d);
    }

    @Override // defpackage.tl0
    public final x r(y yVar) {
        return (x) this.e.getAndSet(yVar, x.c);
    }
}
