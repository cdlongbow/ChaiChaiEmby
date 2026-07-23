package defpackage;

import android.graphics.drawable.Drawable;
import android.os.Handler;
import android.os.Looper;
import java.util.concurrent.Semaphore;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class t11 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ x11 b;

    public /* synthetic */ t11(x11 x11Var, int i) {
        this.a = i;
        this.b = x11Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.a;
        x11 x11Var = this.b;
        switch (i) {
            case 0:
                Drawable.Callback callback = x11Var.getCallback();
                if (callback != null) {
                    callback.invalidateDrawable(x11Var);
                    return;
                }
                return;
            default:
                Semaphore semaphore = x11Var.N;
                au auVar = x11Var.p;
                if (auVar == null) {
                    return;
                }
                try {
                    semaphore.acquire();
                    auVar.q(x11Var.b.d());
                    if (x11.T && x11Var.L) {
                        if (x11Var.O == null) {
                            x11Var.O = new Handler(Looper.getMainLooper());
                            x11Var.P = new t11(x11Var, 0);
                        }
                        x11Var.O.post(x11Var.P);
                    }
                    break;
                } catch (InterruptedException unused) {
                } finally {
                    semaphore.release();
                }
                return;
        }
    }
}
