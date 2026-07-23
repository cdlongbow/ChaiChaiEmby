package defpackage;

import android.animation.ValueAnimator;
import android.graphics.drawable.Drawable;
import androidx.media3.ui.DefaultTimeBar;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class d40 implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ Drawable.Callback b;

    public /* synthetic */ d40(Drawable.Callback callback, int i) {
        this.a = i;
        this.b = callback;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        int i = this.a;
        Drawable.Callback callback = this.b;
        switch (i) {
            case 0:
                ((DefaultTimeBar) callback).lambda$new$1(valueAnimator);
                break;
            default:
                x11 x11Var = (x11) callback;
                qf qfVar = x11Var.M;
                if (qfVar == null) {
                    qfVar = qf.a;
                }
                if (qfVar != qf.b) {
                    au auVar = x11Var.p;
                    if (auVar != null) {
                        auVar.q(x11Var.b.d());
                    }
                } else {
                    x11Var.invalidateSelf();
                }
                break;
        }
    }
}
