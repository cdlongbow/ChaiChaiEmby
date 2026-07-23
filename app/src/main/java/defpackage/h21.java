package defpackage;

import android.animation.Animator;
import android.graphics.PointF;
import android.view.Choreographer;
import java.util.Iterator;

/* JADX INFO: loaded from: classes4.dex */
public final class h21 extends hj implements Choreographer.FrameCallback {
    public float d;
    public boolean e;
    public long g;
    public float h;
    public float i;
    public int j;
    public float k;
    public float l;
    public g11 m;
    public boolean n;
    public boolean o;

    @Override // android.animation.ValueAnimator, android.animation.Animator
    public final void cancel() {
        Iterator it = this.b.iterator();
        while (it.hasNext()) {
            ((Animator.AnimatorListener) it.next()).onAnimationCancel(this);
        }
        a(g());
        h(true);
    }

    public final float d() {
        g11 g11Var = this.m;
        if (g11Var == null) {
            return 0.0f;
        }
        float f = this.i;
        float f2 = g11Var.l;
        return (f - f2) / (g11Var.m - f2);
    }

    @Override // android.view.Choreographer.FrameCallback
    public final void doFrame(long j) {
        if (this.n) {
            h(false);
            Choreographer.getInstance().postFrameCallback(this);
        }
        g11 g11Var = this.m;
        if (g11Var == null || !this.n) {
            return;
        }
        long j2 = this.g;
        float fAbs = (j2 != 0 ? j - j2 : 0L) / ((1.0E9f / g11Var.n) / Math.abs(this.d));
        float f = this.h;
        if (g()) {
            fAbs = -fAbs;
        }
        float f2 = f + fAbs;
        float f3 = f();
        float fE = e();
        PointF pointF = s41.a;
        boolean z = f2 >= f3 && f2 <= fE;
        float f4 = this.h;
        float fB = s41.b(f2, f(), e());
        this.h = fB;
        if (this.o) {
            fB = (float) Math.floor(fB);
        }
        this.i = fB;
        this.g = j;
        if (z) {
            if (!this.o || this.h != f4) {
                c();
            }
        } else if (getRepeatCount() == -1 || this.j < getRepeatCount()) {
            if (getRepeatMode() == 2) {
                this.e = !this.e;
                this.d = -this.d;
            } else {
                float fE2 = g() ? e() : f();
                this.h = fE2;
                this.i = fE2;
            }
            this.g = j;
            if (!this.o || this.h != f4) {
                c();
            }
            Iterator it = this.b.iterator();
            while (it.hasNext()) {
                ((Animator.AnimatorListener) it.next()).onAnimationRepeat(this);
            }
            this.j++;
        } else {
            float f5 = this.d < 0.0f ? f() : e();
            this.h = f5;
            this.i = f5;
            h(true);
            if (!this.o || this.h != f4) {
                c();
            }
            a(g());
        }
        if (this.m == null) {
            return;
        }
        float f6 = this.i;
        float f7 = this.k;
        if (f6 < f7 || f6 > this.l) {
            throw new IllegalStateException(String.format("Frame must be [%f,%f]. It is %f", Float.valueOf(f7), Float.valueOf(this.l), Float.valueOf(this.i)));
        }
    }

    public final float e() {
        g11 g11Var = this.m;
        if (g11Var == null) {
            return 0.0f;
        }
        float f = this.l;
        return f == 2.14748365E9f ? g11Var.m : f;
    }

    public final float f() {
        g11 g11Var = this.m;
        if (g11Var == null) {
            return 0.0f;
        }
        float f = this.k;
        return f == -2.14748365E9f ? g11Var.l : f;
    }

    public final boolean g() {
        return this.d < 0.0f;
    }

    @Override // android.animation.ValueAnimator
    public final float getAnimatedFraction() {
        float f;
        float fE;
        float f2;
        if (this.m == null) {
            return 0.0f;
        }
        if (g()) {
            f = e() - this.i;
            fE = e();
            f2 = f();
        } else {
            f = this.i - f();
            fE = e();
            f2 = f();
        }
        return f / (fE - f2);
    }

    @Override // android.animation.ValueAnimator
    public final Object getAnimatedValue() {
        return Float.valueOf(d());
    }

    @Override // android.animation.ValueAnimator, android.animation.Animator
    public final long getDuration() {
        g11 g11Var = this.m;
        if (g11Var == null) {
            return 0L;
        }
        return (long) g11Var.b();
    }

    public final void h(boolean z) {
        Choreographer.getInstance().removeFrameCallback(this);
        if (z) {
            this.n = false;
        }
    }

    public final void i(float f) {
        if (this.h == f) {
            return;
        }
        float fB = s41.b(f, f(), e());
        this.h = fB;
        if (this.o) {
            fB = (float) Math.floor(fB);
        }
        this.i = fB;
        this.g = 0L;
        c();
    }

    @Override // android.animation.ValueAnimator, android.animation.Animator

    public final void j(float f, float f2) {
        if (f > f2) {
            rd1.p("minFrame (", f, ") must be <= maxFrame (", f2, ")");
            return;
        }
        g11 g11Var = this.m;
        float f3 = g11Var == null ? -3.4028235E38f : g11Var.l;
        float f4 = g11Var == null ? Float.MAX_VALUE : g11Var.m;
        float fB = s41.b(f, f3, f4);
        float fB2 = s41.b(f2, f3, f4);
        if (fB == this.k && fB2 == this.l) {
            return;
        }
        this.k = fB;
        this.l = fB2;
        i((int) s41.b(this.i, fB, fB2));
    }

    @Override // android.animation.ValueAnimator
    public final void setRepeatMode(int i) {
        super.setRepeatMode(i);
        if (i == 2 || !this.e) {
            return;
        }
        this.e = false;
        this.d = -this.d;
    }
}
