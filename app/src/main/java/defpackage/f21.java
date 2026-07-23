package defpackage;

import android.os.Handler;
import android.os.Looper;
import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/* JADX INFO: loaded from: classes4.dex */
public final class f21 {
    public static final ExecutorService e = Executors.newCachedThreadPool(new g21());
    public final LinkedHashSet a = new LinkedHashSet(1);
    public final LinkedHashSet b = new LinkedHashSet(1);
    public final Handler c = new Handler(Looper.getMainLooper());
    public volatile d21 d = null;

    public f21(Callable callable, boolean z) {
        if (z) {
            try {
                f((d21) callable.call());
                return;
            } catch (Throwable th) {
                f(new d21(th));
                return;
            }
        }
        ExecutorService executorService = e;
        e21 e21Var = new e21(callable);
        e21Var.a = this;
        executorService.execute(e21Var);
    }

    public final synchronized void a(b21 b21Var) {
        Throwable th;
        try {
            d21 d21Var = this.d;
            if (d21Var != null && (th = d21Var.b) != null) {
                b21Var.onResult(th);
            }
            this.b.add(b21Var);
        } catch (Throwable th2) {
            throw th2;
        }
    }

    public final synchronized void b(b21 b21Var) {
        g11 g11Var;
        try {
            d21 d21Var = this.d;
            if (d21Var != null && (g11Var = d21Var.a) != null) {
                b21Var.onResult(g11Var);
            }
            this.a.add(b21Var);
        } catch (Throwable th) {
            throw th;
        }
    }

    public final synchronized void c(Throwable th) {
        ArrayList arrayList = new ArrayList(this.b);
        if (arrayList.isEmpty()) {
            r01.c("Lottie encountered an error but no failure listener was added:", th);
            return;
        }
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            ((b21) obj).onResult(th);
        }
    }

    public final void d() {
        d21 d21Var = this.d;
        if (d21Var == null) {
            return;
        }
        g11 g11Var = d21Var.a;
        if (g11Var == null) {
            c(d21Var.b);
            return;
        }
        synchronized (this) {
            ArrayList arrayList = new ArrayList(this.a);
            int size = arrayList.size();
            int i = 0;
            while (i < size) {
                Object obj = arrayList.get(i);
                i++;
                ((b21) obj).onResult(g11Var);
            }
        }
    }

    public final synchronized void e(f11 f11Var) {
        this.b.remove(f11Var);
    }

    public final void f(d21 d21Var) {
        if (this.d != null) {
            rd1.o("A task may only be set once.");
            return;
        }
        this.d = d21Var;
        if (Looper.myLooper() == Looper.getMainLooper()) {
            d();
        } else {
            this.c.post(new e(this, 20));
        }
    }

    public f21(g11 g11Var) {
        f(new d21(g11Var));
    }
}
