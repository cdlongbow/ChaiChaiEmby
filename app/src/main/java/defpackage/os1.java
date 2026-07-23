package defpackage;

import java.util.LinkedHashMap;
import kotlin.Unit;

/* JADX INFO: loaded from: classes4.dex */
public final class os1 {
    public final ss1 a;
    public final l91 b;
    public final Object c = new Object();

    public os1(ss1 ss1Var, l91 l91Var) {
        this.a = ss1Var;
        this.b = l91Var;
    }

    public final void a() {
        synchronized (this.c) {
            this.a.c.d(-1L);
            l91 l91Var = this.b;
            l91Var.a = 0;
            ((LinkedHashMap) l91Var.b).clear();
            Unit unit = Unit.INSTANCE;
        }
    }

    public final long b() {
        long jB;
        synchronized (this.c) {
            jB = this.a.c.b();
        }
        return jB;
    }

    public final void c(g41 g41Var) {
        synchronized (this.c) {
            rs1 rs1Var = this.a.c;
            Object objRemove = rs1Var.a.remove(g41Var);
            if (objRemove != null) {
                rs1Var.c = rs1Var.b() - rs1Var.c(g41Var, objRemove);
                rs1Var.a(g41Var, objRemove, null);
            }
            if (objRemove != null) {
            }
            if (((LinkedHashMap) this.b.b).remove(g41Var) != null) {
            }
        }
    }

    public final void d(long j) {
        synchronized (this.c) {
            rs1 rs1Var = this.a.c;
            rs1Var.b = j;
            rs1Var.d(j);
            Unit unit = Unit.INSTANCE;
        }
    }

    public final void e(long j) {
        synchronized (this.c) {
            this.a.c.d(j);
            Unit unit = Unit.INSTANCE;
        }
    }
}
