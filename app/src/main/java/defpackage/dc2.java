package defpackage;

import java.util.concurrent.Callable;
import java.util.concurrent.RunnableFuture;

/* JADX INFO: loaded from: classes4.dex */
public final class dc2 extends al0 implements RunnableFuture {
    public volatile cc2 i;

    public dc2(Callable callable) {
        this.i = new cc2(this, callable);
    }

    @Override // defpackage.y
    public final void b() {
        cc2 cc2Var;
        if (o() && (cc2Var = this.i) != null) {
            cc2Var.c();
        }
        this.i = null;
    }

    @Override // defpackage.y
    public final String i() {
        cc2 cc2Var = this.i;
        if (cc2Var == null) {
            return super.i();
        }
        return "task=[" + cc2Var + "]";
    }

    @Override // java.util.concurrent.RunnableFuture, java.lang.Runnable
    public final void run() {
        cc2 cc2Var = this.i;
        if (cc2Var != null) {
            cc2Var.run();
        }
        this.i = null;
    }
}
