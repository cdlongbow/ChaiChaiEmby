package defpackage;

import kotlin.Unit;

/* JADX INFO: loaded from: classes4.dex */
public final class fb0 implements AutoCloseable {
    public final eb0 a;
    public boolean b;
    public final /* synthetic */ ib0 c;

    public fb0(ib0 ib0Var, eb0 eb0Var) {
        this.c = ib0Var;
        this.a = eb0Var;
    }

    @Override // java.lang.AutoCloseable
    public final void close() {
        if (this.b) {
            return;
        }
        this.b = true;
        ib0 ib0Var = this.c;
        synchronized (ib0Var.i) {
            try {
                eb0 eb0Var = this.a;
                int i = eb0Var.h - 1;
                eb0Var.h = i;
                if (i == 0 && eb0Var.f) {
                    ib0Var.j(eb0Var);
                }
                Unit unit = Unit.INSTANCE;
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
