package defpackage;

import android.content.ComponentCallbacks2;
import android.content.res.Configuration;
import kotlin.Unit;

/* JADX INFO: loaded from: classes4.dex */
public final class la implements ComponentCallbacks2 {
    public final /* synthetic */ ma a;

    public la(ma maVar) {
        this.a = maVar;
    }

    @Override // android.content.ComponentCallbacks
    public final void onConfigurationChanged(Configuration configuration) {
        ma maVar = this.a;
        synchronized (maVar) {
            if (((ks1) maVar.a.get()) == null) {
                maVar.a();
            }
            Unit unit = Unit.INSTANCE;
        }
    }

    @Override // android.content.ComponentCallbacks
    public final void onLowMemory() {
        onTrimMemory(80);
    }

    @Override // android.content.ComponentCallbacks2
    public final void onTrimMemory(int i) {
        os1 os1VarD;
        ma maVar = this.a;
        synchronized (maVar) {
            try {
                ks1 ks1Var = (ks1) maVar.a.get();
                if (ks1Var != null) {
                    hs1 hs1Var = ks1Var.a;
                    if (i >= 40) {
                        os1 os1VarD2 = ks1Var.d();
                        if (os1VarD2 != null) {
                            os1VarD2.a();
                        }
                    } else if (i >= 20) {
                        maVar.b.a(hs1Var.a);
                    } else if (i >= 10 && (os1VarD = ks1Var.d()) != null) {
                        os1VarD.e(os1VarD.b() / 2);
                    }
                } else {
                    maVar.a();
                }
                Unit unit = Unit.INSTANCE;
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
