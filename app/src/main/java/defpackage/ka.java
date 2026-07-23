package defpackage;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.os.Bundle;

/* JADX INFO: loaded from: classes4.dex */
public final class ka implements Application.ActivityLifecycleCallbacks {
    public final double a;
    public final /* synthetic */ ma b;

    public ka(ma maVar, ks1 ks1Var) {
        this.b = maVar;
        hs1 hs1Var = ks1Var.a;
        ri riVar = yr0.a;
        Object obj = hs1Var.b.n.a.get(yr0.d);
        this.a = ((Number) (obj == null ? Double.valueOf(1.0d) : obj)).doubleValue();
    }

    public final void a(Context context) {
        long j;
        double d = this.a;
        if (d == 1.0d) {
            return;
        }
        Context applicationContext = context.getApplicationContext();
        applicationContext.getClass();
        ((Application) applicationContext).registerActivityLifecycleCallbacks(this);
        ma maVar = this.b;
        ks1 ks1Var = (ks1) maVar.a.get();
        if (ks1Var == null) {
            maVar.a();
            return;
        }
        os1 os1VarD = ks1Var.d();
        if (os1VarD != null) {
            synchronized (os1VarD.c) {
                j = os1VarD.a.a;
            }
            os1VarD.d((long) (d * j));
        }
    }

    public final void b(Context context) {
        long j;
        if (this.a == 1.0d) {
            return;
        }
        Context applicationContext = context.getApplicationContext();
        applicationContext.getClass();
        ((Application) applicationContext).unregisterActivityLifecycleCallbacks(this);
        ma maVar = this.b;
        ks1 ks1Var = (ks1) maVar.a.get();
        if (ks1Var == null) {
            maVar.a();
            return;
        }
        os1 os1VarD = ks1Var.d();
        if (os1VarD != null) {
            synchronized (os1VarD.c) {
                j = os1VarD.a.a;
            }
            os1VarD.d(j);
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final /* synthetic */ void onActivityCreated(Activity activity, Bundle bundle) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final /* synthetic */ void onActivityDestroyed(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final /* synthetic */ void onActivityPaused(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final /* synthetic */ void onActivityResumed(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final /* synthetic */ void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStarted(Activity activity) {
        b(activity);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final /* synthetic */ void onActivityStopped(Activity activity) {
    }
}
