package defpackage;

import java.util.concurrent.Callable;

/* JADX INFO: loaded from: classes4.dex */
public final class cc2 extends tu0 {
    public final Callable c;
    public final /* synthetic */ dc2 d;

    public cc2(dc2 dc2Var, Callable callable) {
        this.d = dc2Var;
        callable.getClass();
        this.c = callable;
    }

    @Override // defpackage.tu0
    public final void a(Throwable th) {
        this.d.l(th);
    }

    @Override // defpackage.tu0
    public final void b(Object obj) {
        this.d.k(obj);
    }

    @Override // defpackage.tu0
    public final boolean d() {
        return this.d.isDone();
    }

    @Override // defpackage.tu0
    public final Object e() {
        return this.c.call();
    }

    @Override // defpackage.tu0
    public final String f() {
        return this.c.toString();
    }
}
