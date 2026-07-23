package defpackage;

import kotlinx.coroutines.sync.Semaphore;

/* JADX INFO: loaded from: classes4.dex */
public final class jl implements a20 {
    public final Semaphore a;
    public final eh0 b;

    public jl(Semaphore semaphore, eh0 eh0Var) {
        this.a = semaphore;
        this.b = eh0Var;
    }

    @Override // defpackage.a20
    public final c20 a(o22 o22Var, wa1 wa1Var) {
        return new ll(o22Var.a, wa1Var, this.a, this.b);
    }
}
