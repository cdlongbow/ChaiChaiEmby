package defpackage;

import com.airbnb.lottie.LottieAnimationView;
import java.lang.ref.WeakReference;

/* JADX INFO: loaded from: classes4.dex */
public final class f11 implements b21 {
    public final /* synthetic */ int a;
    public final WeakReference b;

    public f11(LottieAnimationView lottieAnimationView, int i) {
        this.a = i;
        switch (i) {
            case 1:
                this.b = new WeakReference(lottieAnimationView);
                break;
            default:
                this.b = new WeakReference(lottieAnimationView);
                break;
        }
    }

    @Override // defpackage.b21
    public final void onResult(Object obj) {
        int i = this.a;
        WeakReference weakReference = this.b;
        switch (i) {
            case 0:
                Throwable th = (Throwable) obj;
                LottieAnimationView lottieAnimationView = (LottieAnimationView) weakReference.get();
                if (lottieAnimationView != null) {
                    int i2 = lottieAnimationView.d;
                    if (i2 != 0) {
                        lottieAnimationView.setImageResource(i2);
                    }
                    b21 b21Var = lottieAnimationView.c;
                    if (b21Var == null) {
                        b21Var = LottieAnimationView.o;
                    }
                    b21Var.onResult(th);
                    break;
                }
                break;
            default:
                g11 g11Var = (g11) obj;
                LottieAnimationView lottieAnimationView2 = (LottieAnimationView) weakReference.get();
                if (lottieAnimationView2 != null) {
                    lottieAnimationView2.setComposition(g11Var);
                    break;
                }
                break;
        }
    }
}
