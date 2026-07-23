package defpackage;

import java.util.Objects;
import java.util.concurrent.ConcurrentHashMap;
import java.util.Collections;
import java.util.Set;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
import java.util.logging.Level;

/* JADX INFO: loaded from: classes4.dex */
public abstract class b3 extends e3 {
    public static final gx0 p = new gx0(b3.class);
    public ts0 m;
    public final boolean n;
    public final boolean o;

    public b3(ts0 ts0Var, boolean z, boolean z2) {
        int size = ts0Var.size();
        this.i = null;
        this.j = size;
        this.m = ts0Var;
        this.n = z;
        this.o = z2;
    }

    @Override // defpackage.y
    public final void b() {
        ts0 ts0Var = this.m;
        v(1);
        if ((ts0Var != null) && (this.a instanceof j)) {
            boolean zO = o();
            qd2 it = ts0Var.iterator();
            while (it.hasNext()) {
                ((Future) it.next()).cancel(zO);
            }
        }
    }

    @Override // defpackage.y
    public final String i() {
        ts0 ts0Var = this.m;
        if (ts0Var == null) {
            return super.i();
        }
        return "futures=" + ts0Var;
    }

    public abstract void p(int i, Object obj);

    public final void q(ts0 ts0Var) {
        int iA = e3.k.A(this);
        int i = 0;
        ig2.x(iA >= 0, "Less than 0 remaining futures");
        if (iA == 0) {
            if (ts0Var != null) {
                qd2 it = ts0Var.iterator();
                while (it.hasNext()) {
                    Future future = (Future) it.next();
                    if (!future.isCancelled()) {
                        try {
                            p(i, hg2.z(future));
                        } catch (ExecutionException e) {
                            s(e.getCause());
                        } catch (Throwable th) {
                            s(th);
                        }
                    }
                    i++;
                }
            }
            this.i = null;
            r();
            v(2);
        }
    }

    public abstract void r();

    public final void s(Throwable th) {
        th.getClass();
        if (this.n && !l(th)) {
            Set set = this.i;
            if (set == null) {
                Set setNewSetFromMap = Collections.newSetFromMap(new ConcurrentHashMap());
                setNewSetFromMap.getClass();
                if (!(this.a instanceof j)) {
                    Throwable thN = n();
                    Objects.requireNonNull(thN);
                    while (thN != null && setNewSetFromMap.add(thN)) {
                        thN = thN.getCause();
                    }
                }
                e3.k.z(this, setNewSetFromMap);
                Set set2 = this.i;
                Objects.requireNonNull(set2);
                set = set2;
            }
            Throwable cause = th;
            while (true) {
                if (cause == null) {
                    p.a().log(Level.SEVERE, th instanceof Error ? "Input Future failed with Error" : "Got more than one input Future failure. Logging failures after the first", th);
                    return;
                } else if (!set.add(cause)) {
                    break;
                } else {
                    cause = cause.getCause();
                }
            }
        }
        if (th instanceof Error) {
            p.a().log(Level.SEVERE, "Input Future failed with Error", th);
        }
    }

    public final void t() {
        Objects.requireNonNull(this.m);
        if (this.m.isEmpty()) {
            r();
            return;
        }
        boolean z = this.n;
        bb0 bb0Var = bb0.a;
        if (!z) {
            ts0 ts0Var = this.o ? this.m : null;
            y2 y2Var = new y2(1, this, ts0Var);
            qd2 it = this.m.iterator();
            while (it.hasNext()) {
                f01 f01Var = (f01) it.next();
                if (f01Var.isDone()) {
                    q(ts0Var);
                } else {
                    f01Var.addListener(y2Var, bb0Var);
                }
            }
            return;
        }
        qd2 it2 = this.m.iterator();
        int i = 0;
        while (it2.hasNext()) {
            f01 f01Var2 = (f01) it2.next();
            int i2 = i + 1;
            if (f01Var2.isDone()) {
                u(i, f01Var2);
            } else {
                f01Var2.addListener(new a3(this, i, f01Var2, 0), bb0Var);
            }
            i = i2;
        }
    }

    public final void u(int i, f01 f01Var) {
        try {
            if (f01Var.isCancelled()) {
                this.m = null;
                cancel(false);
            } else {
                try {
                    p(i, hg2.z(f01Var));
                } catch (ExecutionException e) {
                    s(e.getCause());
                } catch (Throwable th) {
                    s(th);
                }
            }
            q(null);
        } catch (Throwable th2) {
            q(null);
            throw th2;
        }
    }

    public abstract void v(int i);
}
