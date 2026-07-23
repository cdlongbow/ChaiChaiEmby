package defpackage;

import androidx.media3.exoplayer.upstream.CmcdData;
import java.util.Objects;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import java.util.concurrent.locks.LockSupport;
import java.util.logging.Level;
import java.util.logging.Logger;

/* JADX INFO: loaded from: classes4.dex */
public abstract class y implements f01 {
    public static final boolean d;
    public static final gx0 e;
    public static final tl0 g;
    public static final Object h;
    public volatile Object a;
    public volatile m b;
    public volatile x c;

    static {
        boolean z;
        Throwable th;
        tl0 pVar;
        try {
            z = Boolean.parseBoolean(System.getProperty("guava.concurrent.generate_cancellation_cause", "false"));
        } catch (SecurityException unused) {
            z = false;
        }
        d = z;
        e = new gx0(y.class);
        Throwable th2 = null;
        try {
            pVar = new w();
            th = null;
        } catch (Error | Exception e2) {
            th = e2;
            try {
                pVar = new n(AtomicReferenceFieldUpdater.newUpdater(x.class, Thread.class, CmcdData.OBJECT_TYPE_AUDIO_ONLY), AtomicReferenceFieldUpdater.newUpdater(x.class, x.class, "b"), AtomicReferenceFieldUpdater.newUpdater(y.class, x.class, "c"), AtomicReferenceFieldUpdater.newUpdater(y.class, m.class, "b"), AtomicReferenceFieldUpdater.newUpdater(y.class, Object.class, CmcdData.OBJECT_TYPE_AUDIO_ONLY));
            } catch (Error | Exception e3) {
                th2 = e3;
                pVar = new p();
            }
        }
        g = pVar;
        if (th2 != null) {
            gx0 gx0Var = e;
            Logger loggerA = gx0Var.a();
            Level level = Level.SEVERE;
            loggerA.log(level, "UnsafeAtomicHelper is broken!", th);
            gx0Var.a().log(level, "SafeAtomicHelper is broken!", th2);
        }
        h = new Object();
    }

    public static void d(y yVar, boolean z) {
        m mVar = null;
        while (true) {
            for (x xVarR = g.r(yVar); xVarR != null; xVarR = xVarR.b) {
                Thread thread = xVarR.a;
                if (thread != null) {
                    xVarR.a = null;
                    LockSupport.unpark(thread);
                }
            }
            if (z) {
                yVar.h();
                z = false;
            }
            yVar.b();
            m mVar2 = mVar;
            m mVarQ = g.q(yVar);
            m mVar3 = mVar2;
            while (mVarQ != null) {
                m mVar4 = mVarQ.c;
                mVarQ.c = mVar3;
                mVar3 = mVarQ;
                mVarQ = mVar4;
            }
            while (mVar3 != null) {
                mVar = mVar3.c;
                Runnable runnable = mVar3.a;
                Objects.requireNonNull(runnable);
                if (runnable instanceof o) {
                    o oVar = (o) runnable;
                    yVar = oVar.a;
                    if (yVar.a == oVar) {
                        if (g.d(yVar, oVar, g(oVar.b))) {
                        }
                    } else {
                        continue;
                    }
                } else {
                    Executor executor = mVar3.b;
                    Objects.requireNonNull(executor);
                    e(runnable, executor);
                }
                mVar3 = mVar;
            }
            return;
        }
    }

    public static void e(Runnable runnable, Executor executor) {
        try {
            executor.execute(runnable);
        } catch (Exception e2) {
            e.a().log(Level.SEVERE, "RuntimeException while executing runnable " + runnable + " with executor " + executor, (Throwable) e2);
        }
    }

    public static Object f(Object obj) throws ExecutionException {
        if (obj instanceof j) {
            Throwable th = ((j) obj).b;
            CancellationException cancellationException = new CancellationException("Task was cancelled.");
            cancellationException.initCause(th);
            throw cancellationException;
        }
        if (obj instanceof l) {
            throw new ExecutionException(((l) obj).a);
        }
        if (obj == h) {
            return null;
        }
        return obj;
    }

    public static Object g(f01 f01Var) {
        Object obj;
        Throwable thN;
        if (f01Var instanceof q) {
            Object jVar = ((y) f01Var).a;
            if (jVar instanceof j) {
                j jVar2 = (j) jVar;
                if (jVar2.a) {
                    jVar = jVar2.b != null ? new j(false, jVar2.b) : j.d;
                }
            }
            Objects.requireNonNull(jVar);
            return jVar;
        }
        if ((f01Var instanceof y) && (thN = ((y) f01Var).n()) != null) {
            return new l(thN);
        }
        boolean zIsCancelled = f01Var.isCancelled();
        boolean z = true;
        if ((!d) && zIsCancelled) {
            j jVar3 = j.d;
            Objects.requireNonNull(jVar3);
            return jVar3;
        }
        boolean z2 = false;
        while (true) {
            try {
                try {
                    try {
                        obj = f01Var.get();
                        break;
                    } catch (Error e2) {
                        e = e2;
                        return new l(e);
                    }
                } catch (InterruptedException unused) {
                    z2 = z;
                } catch (Throwable th) {
                    if (z2) {
                        Thread.currentThread().interrupt();
                    }
                    throw th;
                }
            } catch (Error | Exception e3) {
                e = e3;
                return new l(e);
            } catch (CancellationException e4) {
                if (zIsCancelled) {
                    return new j(false, e4);
                }
                return new l(new IllegalArgumentException("get() threw CancellationException, despite reporting isCancelled() == false: " + f01Var, e4));
            } catch (ExecutionException e5) {
                if (!zIsCancelled) {
                    return new l(e5.getCause());
                }
                return new j(false, new IllegalArgumentException("get() did not throw CancellationException, despite reporting isCancelled() == true: " + f01Var, e5));
            }
        }
        if (z2) {
            Thread.currentThread().interrupt();
        }
        if (!zIsCancelled) {
            return obj == null ? h : obj;
        }
        return new j(false, new IllegalArgumentException("get() did not throw CancellationException, despite reporting isCancelled() == true: " + f01Var));
    }

    public final void a(StringBuilder sb) {
        Object obj;
        boolean z = false;
        while (true) {
            try {
                try {
                    obj = get();
                    break;
                } catch (InterruptedException unused) {
                    z = true;
                } catch (Throwable th) {
                    if (z) {
                        Thread.currentThread().interrupt();
                    }
                    throw th;
                }
            } catch (CancellationException unused2) {
                sb.append("CANCELLED");
                return;
            } catch (ExecutionException e2) {
                sb.append("FAILURE, cause=[");
                sb.append(e2.getCause());
                sb.append("]");
                return;
            } catch (Exception e3) {
                sb.append("UNKNOWN, cause=[");
                sb.append(e3.getClass());
                sb.append(" thrown from get()]");
                return;
            }
        }
        if (z) {
            Thread.currentThread().interrupt();
        }
        sb.append("SUCCESS, result=[");
        c(sb, obj);
        sb.append("]");
    }

    @Override // defpackage.f01
    public void addListener(Runnable runnable, Executor executor) {
        m mVar;
        m mVar2 = m.d;
        ig2.t(runnable, "Runnable was null.");
        ig2.t(executor, "Executor was null.");
        if (!isDone() && (mVar = this.b) != mVar2) {
            m mVar3 = new m(runnable, executor);
            do {
                mVar3.c = mVar;
                if (g.c(this, mVar, mVar3)) {
                    return;
                } else {
                    mVar = this.b;
                }
            } while (mVar != mVar2);
        }
        e(runnable, executor);
    }

    public final void c(StringBuilder sb, Object obj) {
        if (obj == null) {
            sb.append("null");
        } else {
            if (obj == this) {
                sb.append("this future");
                return;
            }
            sb.append(obj.getClass().getName());
            sb.append("@");
            sb.append(Integer.toHexString(System.identityHashCode(obj)));
        }
    }

    @Override // java.util.concurrent.Future
    public boolean cancel(boolean z) {
        j jVar;
        Object obj = this.a;
        if (!(obj == null) && !(obj instanceof o)) {
            return false;
        }
        if (d) {
            jVar = new j(z, new CancellationException("Future.cancel() was called."));
        } else {
            jVar = z ? j.c : j.d;
            Objects.requireNonNull(jVar);
        }
        boolean z2 = false;
        while (true) {
            if (g.d(this, obj, jVar)) {
                d(this, z);
                if (obj instanceof o) {
                    f01 f01Var = ((o) obj).b;
                    if (f01Var instanceof q) {
                        this = (y) f01Var;
                        obj = this.a;
                        if ((obj == null) | (obj instanceof o)) {
                            z2 = true;
                        }
                    } else {
                        f01Var.cancel(z);
                    }
                }
                return true;
            }
            obj = this.a;
            if (!(obj instanceof o)) {
                return z2;
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:50:0x00ac  */
    /* JADX WARN: Code duplicated, block: B:52:0x00b0  */
    /* JADX WARN: Code duplicated, block: B:53:0x00b3  */
    /* JADX WARN: Code duplicated, block: B:58:0x00c0  */
    /* JADX WARN: Code duplicated, block: B:60:0x00c6 A[EDGE_INSN: B:60:0x00c6->B:37:0x0083 BREAK  A[LOOP:0: B:21:0x0043->B:44:0x0097]] */
    /* JADX WARN: Code duplicated, block: B:63:0x00d3  */
    /* JADX WARN: Code duplicated, block: B:65:0x00fe  */
    /* JADX WARN: Code duplicated, block: B:67:0x0114  */
    /* JADX WARN: Code duplicated, block: B:71:0x011c  */
    /* JADX WARN: Code duplicated, block: B:73:0x0120  */
    /* JADX WARN: Code duplicated, block: B:75:0x0137  */
    /* JADX WARN: Code duplicated, block: B:78:0x0143  */
    /* JADX WARN: Code duplicated, block: B:82:0x0163  */
    /* JADX WARN: Code duplicated, block: B:84:0x016f  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:60:0x00c6 -> B:37:0x0083). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    @Override // java.util.concurrent.Future
    public java.lang.Object get(long r21, java.util.concurrent.TimeUnit r23) {
        /*
            Method dump skipped, instruction units count: 385
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.y.get(long, java.util.concurrent.TimeUnit):java.lang.Object");
    }

    /* JADX WARN: Multi-variable type inference failed */
    public String i() {
        if (!(this instanceof ScheduledFuture)) {
            return null;
        }
        return "remaining delay=[" + ((ScheduledFuture) this).getDelay(TimeUnit.MILLISECONDS) + " ms]";
    }

    @Override // java.util.concurrent.Future
    public boolean isCancelled() {
        return this.a instanceof j;
    }

    @Override // java.util.concurrent.Future
    public boolean isDone() {
        Object obj = this.a;
        return (!(obj instanceof o)) & (obj != null);
    }

    public final void j(x xVar) {
        xVar.a = null;
        while (true) {
            x xVar2 = this.c;
            if (xVar2 == x.c) {
                return;
            }
            x xVar3 = null;
            while (xVar2 != null) {
                x xVar4 = xVar2.b;
                if (xVar2.a != null) {
                    xVar3 = xVar2;
                } else if (xVar3 != null) {
                    xVar3.b = xVar4;
                    if (xVar3.a == null) {
                    }
                } else if (!g.e(this, xVar2, xVar4)) {
                }
                xVar2 = xVar4;
            }
            return;
        }
    }

    public boolean k(Object obj) {
        if (obj == null) {
            obj = h;
        }
        if (!g.d(this, null, obj)) {
            return false;
        }
        d(this, false);
        return true;
    }

    public boolean l(Throwable th) {
        th.getClass();
        if (!g.d(this, null, new l(th))) {
            return false;
        }
        d(this, false);
        return true;
    }

    /* JADX WARN: Code duplicated, block: B:23:0x0048  */
    public boolean m(f01 f01Var) {
        l lVar;
        f01Var.getClass();
        Object obj = this.a;
        if (obj != null) {
            if (obj instanceof j) {
                f01Var.cancel(((j) obj).a);
            }
        } else if (f01Var.isDone()) {
            if (g.d(this, null, g(f01Var))) {
                d(this, false);
                return true;
            }
        } else {
            o oVar = new o(this, f01Var);
            if (g.d(this, null, oVar)) {
                try {
                    f01Var.addListener(oVar, bb0.a);
                    return true;
                } catch (Throwable th) {
                    try {
                        lVar = new l(th);
                    } catch (Error | Exception unused) {
                        lVar = l.b;
                    }
                    g.d(this, oVar, lVar);
                    return true;
                }
            }
            obj = this.a;
            if (obj instanceof j) {
                f01Var.cancel(((j) obj).a);
            }
        }
        return false;
    }

    public final Throwable n() {
        if (!(this instanceof q)) {
            return null;
        }
        Object obj = this.a;
        if (obj instanceof l) {
            return ((l) obj).a;
        }
        return null;
    }

    public final boolean o() {
        Object obj = this.a;
        return (obj instanceof j) && ((j) obj).a;
    }

    public final String toString() {
        String strI;
        StringBuilder sb = new StringBuilder();
        if (getClass().getName().startsWith("com.google.common.util.concurrent.")) {
            sb.append(getClass().getSimpleName());
        } else {
            sb.append(getClass().getName());
        }
        sb.append('@');
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        sb.append("[status=");
        if (isCancelled()) {
            sb.append("CANCELLED");
        } else if (isDone()) {
            a(sb);
        } else {
            int length = sb.length();
            sb.append("PENDING");
            Object obj = this.a;
            if (obj instanceof o) {
                sb.append(", setFuture=[");
                f01 f01Var = ((o) obj).b;
                try {
                    if (f01Var == this) {
                        sb.append("this future");
                    } else {
                        sb.append(f01Var);
                    }
                } catch (Exception e2) {
                    e = e2;
                    sb.append("Exception thrown from implementation: ");
                    sb.append(e.getClass());
                } catch (StackOverflowError e3) {
                    e = e3;
                    sb.append("Exception thrown from implementation: ");
                    sb.append(e.getClass());
                }
                sb.append("]");
            } else {
                try {
                    strI = i();
                    if (strI == null || strI.isEmpty()) {
                        strI = null;
                    }
                } catch (Exception | StackOverflowError e4) {
                    strI = "Exception thrown from implementation: " + e4.getClass();
                }
                if (strI != null) {
                    sb.append(", info=[");
                    sb.append(strI);
                    sb.append("]");
                }
            }
            if (isDone()) {
                sb.delete(length, sb.length());
                a(sb);
            }
        }
        sb.append("]");
        return sb.toString();
    }

    public void b() {
    }

    public void h() {
    }

    @Override // java.util.concurrent.Future
    public Object get() {
        Object obj;
        x xVar = x.c;
        if (!Thread.interrupted()) {
            Object obj2 = this.a;
            if ((obj2 != null) & (!(obj2 instanceof o))) {
                return f(obj2);
            }
            x xVar2 = this.c;
            if (xVar2 != xVar) {
                x xVar3 = new x();
                do {
                    tl0 tl0Var = g;
                    tl0Var.N(xVar3, xVar2);
                    if (tl0Var.e(this, xVar2, xVar3)) {
                        do {
                            LockSupport.park(this);
                            if (!Thread.interrupted()) {
                                obj = this.a;
                            } else {
                                j(xVar3);
                                throw new InterruptedException();
                            }
                        } while (!((obj != null) & (!(obj instanceof o))));
                        return f(obj);
                    }
                    xVar2 = this.c;
                } while (xVar2 != xVar);
            }
            Object obj3 = this.a;
            Objects.requireNonNull(obj3);
            return f(obj3);
        }
        throw new InterruptedException();
    }
}
