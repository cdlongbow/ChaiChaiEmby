package defpackage;

import android.animation.ValueAnimator;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class wq1 implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ Protection b;

    public /* synthetic */ wq1(Protection protection, int i) {
        this.a = i;
        this.b = protection;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        int i = this.a;
        Protection protection = this.b;
        switch (i) {
            case 0:
                protection.lambda$animateInsetsAmount$1(valueAnimator);
                break;
            default:
                protection.lambda$animateAlpha$0(valueAnimator);
                break;
        }
    }
}
