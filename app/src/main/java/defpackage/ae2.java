package defpackage;

import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes4.dex */
public abstract class ae2 {
    public static final xg0 a(fs0 fs0Var, Throwable th) {
        pr0 pr0Var;
        if (th instanceof e91) {
            Function1 function1 = fs0Var.o;
            cs0 cs0Var = fs0Var.u;
            pr0Var = (pr0) function1.invoke(fs0Var);
            if (pr0Var == null) {
                pr0Var = (pr0) cs0Var.j.invoke(fs0Var);
            }
            if (pr0Var == null && (pr0Var = (pr0) fs0Var.n.invoke(fs0Var)) == null) {
                pr0Var = (pr0) cs0Var.i.invoke(fs0Var);
            }
        } else {
            pr0Var = (pr0) fs0Var.n.invoke(fs0Var);
            if (pr0Var == null) {
                pr0Var = (pr0) fs0Var.u.i.invoke(fs0Var);
            }
        }
        return new xg0(pr0Var, fs0Var, th);
    }
}
