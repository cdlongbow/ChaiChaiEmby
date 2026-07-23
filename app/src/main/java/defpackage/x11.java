package defpackage;

import android.animation.Animator;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.provider.Settings;
import android.view.Choreographer;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.ImageView;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.Semaphore;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes4.dex */
public final class x11 extends Drawable implements Drawable.Callback, Animatable {
    public static final boolean T;
    public static final List U;
    public static final ThreadPoolExecutor V;
    public Canvas A;
    public Rect B;
    public RectF C;
    public jw0 D;
    public Rect E;
    public Rect F;
    public RectF G;
    public RectF H;
    public Matrix I;
    public final float[] J;
    public Matrix K;
    public boolean L;
    public qf M;
    public final Semaphore N;
    public Handler O;
    public t11 P;
    public final t11 Q;
    public float R;
    public int S;
    public g11 a;
    public final h21 b;
    public final boolean c;
    public boolean d;
    public boolean e;
    public final ArrayList g;
    public rr0 h;
    public String i;
    public ab j;
    public Map k;
    public String l;
    public final ri m;
    public boolean n;
    public boolean o;
    public au p;
    public int q;
    public boolean r;
    public boolean s;
    public boolean t;
    public boolean u;
    public boolean v;
    public nt1 w;
    public boolean x;
    public final Matrix y;
    public Bitmap z;

    static {
        T = Build.VERSION.SDK_INT <= 25;
        U = Arrays.asList("reduced motion", "reduced_motion", "reduced-motion", "reducedmotion");
        V = new ThreadPoolExecutor(0, 2, 35L, TimeUnit.MILLISECONDS, new LinkedBlockingQueue(), new g21());
    }

    public x11() {
        h21 h21Var = new h21();
        h21Var.d = 1.0f;
        h21Var.e = false;
        h21Var.g = 0L;
        h21Var.h = 0.0f;
        h21Var.i = 0.0f;
        h21Var.j = 0;
        h21Var.k = -2.14748365E9f;
        h21Var.l = 2.14748365E9f;
        h21Var.n = false;
        h21Var.o = false;
        this.b = h21Var;
        int i = 1;
        this.c = true;
        this.d = false;
        this.e = false;
        this.S = 1;
        this.g = new ArrayList();
        this.m = new ri(5);
        this.n = false;
        this.o = true;
        this.q = 255;
        this.v = false;
        this.w = nt1.a;
        this.x = false;
        this.y = new Matrix();
        this.J = new float[9];
        this.L = false;
        d40 d40Var = new d40(this, i);
        this.N = new Semaphore(1);
        this.Q = new t11(this, i);
        this.R = -3.4028235E38f;
        h21Var.addUpdateListener(d40Var);
    }

    public static void f(RectF rectF, Rect rect) {
        rect.set((int) Math.floor(rectF.left), (int) Math.floor(rectF.top), (int) Math.ceil(rectF.right), (int) Math.ceil(rectF.bottom));
    }

    public final void a(final zv0 zv0Var, final Object obj, final i21 i21Var) {
        au auVar = this.p;
        if (auVar == null) {
            this.g.add(new v11() { // from class: q11
                @Override // defpackage.v11
                public final void run() {
                    this.a.a(zv0Var, obj, i21Var);
                }
            });
            return;
        }
        boolean zIsEmpty = true;
        if (zv0Var == zv0.c) {
            auVar.f(i21Var, obj);
        } else {
            aw0 aw0Var = zv0Var.b;
            if (aw0Var != null) {
                aw0Var.f(i21Var, obj);
            } else {
                ArrayList arrayList = new ArrayList();
                this.p.c(zv0Var, 0, arrayList, new zv0(new String[0]));
                for (int i = 0; i < arrayList.size(); i++) {
                    ((zv0) arrayList.get(i)).b.f(i21Var, obj);
                }
                zIsEmpty = true ^ arrayList.isEmpty();
            }
        }
        if (zIsEmpty) {
            invalidateSelf();
            if (obj == c21.z) {
                u(this.b.d());
            }
        }
    }

    public final boolean b(Context context) {
        if (this.d) {
            return true;
        }
        if (!this.c) {
            return false;
        }
        if (context == null) {
            return true;
        }
        Matrix matrix = wd2.a;
        return Settings.Global.getFloat(context.getContentResolver(), "animator_duration_scale", 1.0f) != 0.0f;
    }

    public final void c() {
        g11 g11Var = this.a;
        if (g11Var == null) {
            return;
        }
        aa aaVar = nw0.a;
        Rect rect = g11Var.k;
        List list = Collections.EMPTY_LIST;
        au auVar = new au(this, new mw0(list, g11Var, "__container", -1L, 1, -1L, null, list, new bb(), 0, 0, 0, 0.0f, 0.0f, rect.width(), rect.height(), null, null, list, 1, null, false, null, null, 1), g11Var.j, g11Var);
        this.p = auVar;
        if (this.s) {
            auVar.p(true);
        }
        this.p.L = this.o;
    }

    public final void d() {
        h21 h21Var = this.b;
        if (h21Var.n) {
            h21Var.cancel();
            if (!isVisible()) {
                this.S = 1;
            }
        }
        this.a = null;
        this.p = null;
        this.h = null;
        this.R = -3.4028235E38f;
        h21Var.m = null;
        h21Var.k = -2.14748365E9f;
        h21Var.l = 2.14748365E9f;
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        g11 g11Var;
        au auVar = this.p;
        if (auVar == null) {
            return;
        }
        qf qfVar = this.M;
        if (qfVar == null) {
            qfVar = qf.a;
        }
        boolean z = qfVar == qf.b;
        t11 t11Var = this.Q;
        ThreadPoolExecutor threadPoolExecutor = V;
        Semaphore semaphore = this.N;
        h21 h21Var = this.b;
        if (z) {
            try {
                semaphore.acquire();
            } catch (InterruptedException unused) {
                if (!z) {
                    return;
                }
                semaphore.release();
                if (auVar.K == h21Var.d()) {
                    return;
                }
            } catch (Throwable th) {
                if (z) {
                    semaphore.release();
                    if (auVar.K != h21Var.d()) {
                        threadPoolExecutor.execute(t11Var);
                    }
                }
                throw th;
            }
        }
        if (z && (g11Var = this.a) != null) {
            float f = this.R;
            float fD = h21Var.d();
            this.R = fD;
            if (Math.abs(fD - f) * g11Var.b() >= 50.0f) {
                u(h21Var.d());
            }
        }
        boolean z2 = this.e;
        boolean z3 = this.x;
        if (z2) {
            try {
                if (z3) {
                    l(canvas, auVar);
                } else {
                    g(canvas);
                }
            } catch (Throwable unused2) {
                r01.a.getClass();
            }
        } else if (z3) {
            l(canvas, auVar);
        } else {
            g(canvas);
        }
        this.L = false;
        if (z) {
            semaphore.release();
            if (auVar.K == h21Var.d()) {
                return;
            }
            threadPoolExecutor.execute(t11Var);
        }
    }

    public final void e() {
        g11 g11Var = this.a;
        if (g11Var == null) {
            return;
        }
        nt1 nt1Var = this.w;
        int i = Build.VERSION.SDK_INT;
        boolean z = g11Var.o;
        int i2 = g11Var.p;
        int iOrdinal = nt1Var.ordinal();
        boolean z2 = false;
        if (iOrdinal != 1 && (iOrdinal == 2 || ((z && i < 28) || i2 > 4 || i <= 25))) {
            z2 = true;
        }
        this.x = z2;
    }

    public final void g(Canvas canvas) {
        au auVar = this.p;
        g11 g11Var = this.a;
        if (auVar == null || g11Var == null) {
            return;
        }
        Matrix matrix = this.y;
        matrix.reset();
        Rect bounds = getBounds();
        if (!bounds.isEmpty()) {
            float fWidth = bounds.width() / g11Var.k.width();
            float fHeight = bounds.height() / g11Var.k.height();
            matrix.preTranslate(bounds.left, bounds.top);
            matrix.preScale(fWidth, fHeight);
        }
        auVar.g(canvas, matrix, this.q, null);
    }

    @Override // android.graphics.drawable.Drawable

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicHeight() {
        g11 g11Var = this.a;
        if (g11Var == null) {
            return -1;
        }
        return g11Var.k.height();
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicWidth() {
        g11 g11Var = this.a;
        if (g11Var == null) {
            return -1;
        }
        return g11Var.k.width();
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        return -3;
    }

    public final Context h() {
        Drawable.Callback callback = getCallback();
        if (callback != null && (callback instanceof View)) {
            return ((View) callback).getContext();
        }
        return null;
    }

    public final ab i() {
        if (getCallback() == null) {
            return null;
        }
        if (this.j == null) {
            ab abVar = new ab(getCallback());
            this.j = abVar;
            String str = this.l;
            if (str != null) {
                abVar.e = str;
            }
        }
        return this.j;
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public final void invalidateDrawable(Drawable drawable) {
        Drawable.Callback callback = getCallback();
        if (callback == null) {
            return;
        }
        callback.invalidateDrawable(this);
    }

    @Override // android.graphics.drawable.Drawable
    public final void invalidateSelf() {
        Drawable.Callback callback;
        if (this.L) {
            return;
        }
        this.L = true;
        if ((!T || Looper.getMainLooper() == Looper.myLooper()) && (callback = getCallback()) != null) {
            callback.invalidateDrawable(this);
        }
    }

    @Override // android.graphics.drawable.Animatable
    public final boolean isRunning() {
        h21 h21Var = this.b;
        if (h21Var == null) {
            return false;
        }
        return h21Var.n;
    }

    public final void j() {
        this.g.clear();
        h21 h21Var = this.b;
        h21Var.h(true);
        Iterator it = h21Var.c.iterator();
        while (it.hasNext()) {
            ((Animator.AnimatorPauseListener) it.next()).onAnimationPause(h21Var);
        }
        if (isVisible()) {
            return;
        }
        this.S = 1;
    }

    public final void k() {
        if (this.p == null) {
            this.g.add(new u11(this, 1));
            return;
        }
        e();
        boolean zB = b(h());
        h21 h21Var = this.b;
        if (zB || h21Var.getRepeatCount() == 0) {
            if (isVisible()) {
                h21Var.n = true;
                h21Var.b(h21Var.g());
                h21Var.i((int) (h21Var.g() ? h21Var.e() : h21Var.f()));
                h21Var.g = 0L;
                h21Var.j = 0;
                if (h21Var.n) {
                    h21Var.h(false);
                    Choreographer.getInstance().postFrameCallback(h21Var);
                }
                this.S = 1;
            } else {
                this.S = 2;
            }
        }
        if (b(h())) {
            return;
        }
        Iterator it = U.iterator();
        q31 q31VarD = null;
        while (it.hasNext()) {
            q31VarD = this.a.d((String) it.next());
            if (q31VarD != null) {
                break;
            }
        }
        if (q31VarD != null) {
            o((int) q31VarD.b);
        } else {
            o((int) (h21Var.d < 0.0f ? h21Var.f() : h21Var.e()));
        }
        h21Var.h(true);
        h21Var.a(h21Var.g());
        if (isVisible()) {
            return;
        }
        this.S = 1;
    }

    /* JADX WARN: Code duplicated, block: B:16:0x00d3  */
    public final void l(Canvas canvas, au auVar) {
        boolean z;
        if (this.a == null || auVar == null) {
            return;
        }
        if (this.A == null) {
            this.A = new Canvas();
            this.H = new RectF();
            this.I = new Matrix();
            this.K = new Matrix();
            this.B = new Rect();
            this.C = new RectF();
            this.D = new jw0();
            this.E = new Rect();
            this.F = new Rect();
            this.G = new RectF();
        }
        canvas.getMatrix(this.I);
        canvas.getClipBounds(this.B);
        Rect rect = this.B;
        this.C.set(rect.left, rect.top, rect.right, rect.bottom);
        this.I.mapRect(this.C);
        f(this.C, this.B);
        boolean z2 = this.o;
        RectF rectF = this.H;
        if (z2) {
            rectF.set(0.0f, 0.0f, getIntrinsicWidth(), getIntrinsicHeight());
        } else {
            auVar.d(rectF, null, false);
        }
        this.I.mapRect(this.H);
        Rect bounds = getBounds();
        float fWidth = bounds.width() / getIntrinsicWidth();
        float fHeight = bounds.height() / getIntrinsicHeight();
        RectF rectF2 = this.H;
        rectF2.set(rectF2.left * fWidth, rectF2.top * fHeight, rectF2.right * fWidth, rectF2.bottom * fHeight);
        Drawable.Callback callback = getCallback();
        if (callback instanceof View) {
            ViewParent parent = ((View) callback).getParent();
            if (parent instanceof ViewGroup) {
                z = !((ViewGroup) parent).getClipChildren();
            } else {
                z = false;
            }
        } else {
            z = false;
        }
        if (!z) {
            RectF rectF3 = this.H;
            Rect rect2 = this.B;
            rectF3.intersect(rect2.left, rect2.top, rect2.right, rect2.bottom);
        }
        int iCeil = (int) Math.ceil(this.H.width());
        int iCeil2 = (int) Math.ceil(this.H.height());
        if (iCeil <= 0 || iCeil2 <= 0) {
            return;
        }
        Bitmap bitmap = this.z;
        if (bitmap == null || bitmap.getWidth() < iCeil || this.z.getHeight() < iCeil2) {
            Bitmap bitmapCreateBitmap = Bitmap.createBitmap(iCeil, iCeil2, Bitmap.Config.ARGB_8888);
            this.z = bitmapCreateBitmap;
            this.A.setBitmap(bitmapCreateBitmap);
            this.L = true;
        } else if (this.z.getWidth() > iCeil || this.z.getHeight() > iCeil2) {
            Bitmap bitmapCreateBitmap2 = Bitmap.createBitmap(this.z, 0, 0, iCeil, iCeil2);
            this.z = bitmapCreateBitmap2;
            this.A.setBitmap(bitmapCreateBitmap2);
            this.L = true;
        }
        if (this.L) {
            Matrix matrix = this.I;
            float[] fArr = this.J;
            matrix.getValues(fArr);
            float f = fArr[0];
            float f2 = fArr[4];
            Matrix matrix2 = this.I;
            Matrix matrix3 = this.y;
            matrix3.set(matrix2);
            matrix3.preScale(fWidth, fHeight);
            RectF rectF4 = this.H;
            matrix3.postTranslate(-rectF4.left, -rectF4.top);
            matrix3.postScale(1.0f / f, 1.0f / f2);
            this.z.eraseColor(0);
            this.A.setMatrix(wd2.a);
            this.A.scale(f, f2);
            auVar.g(this.A, matrix3, this.q, null);
            this.I.invert(this.K);
            this.K.mapRect(this.G, this.H);
            f(this.G, this.F);
        }
        this.E.set(0, 0, iCeil, iCeil2);
        canvas.drawBitmap(this.z, this.E, this.F, this.D);
    }

    public final void m() {
        if (this.p == null) {
            this.g.add(new u11(this, 0));
            return;
        }
        e();
        boolean zB = b(h());
        h21 h21Var = this.b;
        if (zB || h21Var.getRepeatCount() == 0) {
            if (isVisible()) {
                h21Var.n = true;
                h21Var.h(false);
                Choreographer.getInstance().postFrameCallback(h21Var);
                h21Var.g = 0L;
                if (h21Var.g() && h21Var.i == h21Var.f()) {
                    h21Var.i(h21Var.e());
                } else if (!h21Var.g() && h21Var.i == h21Var.e()) {
                    h21Var.i(h21Var.f());
                }
                Iterator it = h21Var.c.iterator();
                while (it.hasNext()) {
                    ((Animator.AnimatorPauseListener) it.next()).onAnimationResume(h21Var);
                }
                this.S = 1;
            } else {
                this.S = 3;
            }
        }
        if (b(h())) {
            return;
        }
        o((int) (h21Var.d < 0.0f ? h21Var.f() : h21Var.e()));
        h21Var.h(true);
        h21Var.a(h21Var.g());
        if (isVisible()) {
            return;
        }
        this.S = 1;
    }

    public final boolean n(g11 g11Var) {
        if (this.a == g11Var) {
            return false;
        }
        this.L = true;
        d();
        this.a = g11Var;
        c();
        h21 h21Var = this.b;
        boolean z = h21Var.m == null;
        h21Var.m = g11Var;
        if (z) {
            h21Var.j(Math.max(h21Var.k, g11Var.l), Math.min(h21Var.l, g11Var.m));
        } else {
            h21Var.j((int) g11Var.l, (int) g11Var.m);
        }
        float f = h21Var.i;
        h21Var.i = 0.0f;
        h21Var.h = 0.0f;
        h21Var.i((int) f);
        h21Var.c();
        u(h21Var.getAnimatedFraction());
        ArrayList arrayList = this.g;
        Iterator it = new ArrayList(arrayList).iterator();
        while (it.hasNext()) {
            v11 v11Var = (v11) it.next();
            if (v11Var != null) {
                v11Var.run();
            }
            it.remove();
        }
        arrayList.clear();
        g11Var.a.a = this.r;
        e();
        Drawable.Callback callback = getCallback();
        if (callback instanceof ImageView) {
            ImageView imageView = (ImageView) callback;
            imageView.setImageDrawable(null);
            imageView.setImageDrawable(this);
        }
        return true;
    }

    public final void o(int i) {
        if (this.a != null) {
            this.b.i(i);
        } else {
            this.g.add(new p11(this, i, 2));
        }
    }

    public final void p(int i) {
        if (this.a == null) {
            this.g.add(new p11(this, i, 0));
        } else {
            h21 h21Var = this.b;
            h21Var.j(h21Var.k, i + 0.99f);
        }
    }

    public final void q(String str) {
        g11 g11Var = this.a;
        if (g11Var == null) {
            this.g.add(new o11(this, str, 1));
            return;
        }
        q31 q31VarD = g11Var.d(str);
        if (q31VarD != null) {
            p((int) (q31VarD.b + q31VarD.c));
        } else {
            ra.q(mr.r("Cannot find marker with name ", str, "."));
        }
    }

    public final void r(String str) {
        g11 g11Var = this.a;
        ArrayList arrayList = this.g;
        if (g11Var == null) {
            arrayList.add(new o11(this, str, 0));
            return;
        }
        q31 q31VarD = g11Var.d(str);
        if (q31VarD == null) {
            ra.q(mr.r("Cannot find marker with name ", str, "."));
            return;
        }
        int i = (int) q31VarD.b;
        int i2 = ((int) q31VarD.c) + i;
        if (this.a == null) {
            arrayList.add(new s11(this, i, i2));
        } else {
            this.b.j(i, i2 + 0.99f);
        }
    }

    public final void s(int i) {
        if (this.a == null) {
            this.g.add(new p11(this, i, 1));
        } else {
            h21 h21Var = this.b;
            h21Var.j(i, (int) h21Var.l);
        }
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public final void scheduleDrawable(Drawable drawable, Runnable runnable, long j) {
        Drawable.Callback callback = getCallback();
        if (callback == null) {
            return;
        }
        callback.scheduleDrawable(this, runnable, j);
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i) {
        this.q = i;
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
        r01.b("Use addColorFilter instead.");
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean setVisible(boolean z, boolean z2) {
        boolean zIsVisible = isVisible();
        boolean visible = super.setVisible(z, z2);
        if (z) {
            int i = this.S;
            if (i == 2) {
                k();
                return visible;
            }
            if (i == 3) {
                m();
                return visible;
            }
        } else {
            if (this.b.n) {
                j();
                this.S = 3;
                return visible;
            }
            if (zIsVisible) {
                this.S = 1;
            }
        }
        return visible;
    }

    @Override // android.graphics.drawable.Animatable
    public final void start() {
        Drawable.Callback callback = getCallback();
        if ((callback instanceof View) && ((View) callback).isInEditMode()) {
            return;
        }
        k();
    }

    @Override // android.graphics.drawable.Animatable
    public final void stop() {
        this.g.clear();
        h21 h21Var = this.b;
        h21Var.h(true);
        h21Var.a(h21Var.g());
        if (isVisible()) {
            return;
        }
        this.S = 1;
    }

    public final void t(String str) {
        g11 g11Var = this.a;
        if (g11Var == null) {
            this.g.add(new o11(this, str, 2));
            return;
        }
        q31 q31VarD = g11Var.d(str);
        if (q31VarD != null) {
            s((int) q31VarD.b);
        } else {
            ra.q(mr.r("Cannot find marker with name ", str, "."));
        }
    }

    public final void u(float f) {
        g11 g11Var = this.a;
        if (g11Var == null) {
            this.g.add(new r11(this, f, 2));
        } else {
            this.b.i(s41.f(g11Var.l, g11Var.m, f));
        }
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public final void unscheduleDrawable(Drawable drawable, Runnable runnable) {
        Drawable.Callback callback = getCallback();
        if (callback == null) {
            return;
        }
        callback.unscheduleDrawable(this, runnable);
    }
}
