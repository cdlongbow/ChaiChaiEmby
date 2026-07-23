package defpackage;

import android.content.Context;
import java.lang.ref.WeakReference;

/* JADX INFO: loaded from: classes4.dex */
public final class ma {
    public final WeakReference a;
    public final ka b;
    public final la c = new la(this);
    public Context d;
    public boolean e;

    public ma(ks1 ks1Var) {
        this.a = new WeakReference(ks1Var);
        this.b = new ka(this, ks1Var);
    }

    public final synchronized void a() {
        try {
            if (this.e) {
                return;
            }
            this.e = true;
            Context context = this.d;
            if (context != null) {
                this.b.b(context);
                context.unregisterComponentCallbacks(this.c);
            }
            this.a.clear();
        } catch (Throwable th) {
            throw th;
        }
    }
}
