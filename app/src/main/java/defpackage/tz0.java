package defpackage;

import androidx.lifecycle.DefaultLifecycleObserver;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import java.util.concurrent.CancellationException;
import kotlin.Unit;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlinx.coroutines.Job;

/* JADX INFO: loaded from: classes4.dex */
public final class tz0 implements rt1, DefaultLifecycleObserver {
    public final Lifecycle a;
    public final Job b;

    public tz0(Lifecycle lifecycle, Job job) {
        this.a = lifecycle;
        this.b = job;
    }

    @Override // defpackage.rt1
    public final Object a(js1 js1Var) throws Throwable {
        Object objA = wz0.a(this.a, js1Var);
        return objA == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objA : Unit.INSTANCE;
    }

    @Override // defpackage.rt1
    public final /* synthetic */ void b() {
    }

    @Override // defpackage.rt1
    public final void complete() {
        this.a.removeObserver(this);
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public final void onCreate(LifecycleOwner lifecycleOwner) {
        lifecycleOwner.getClass();
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public final void onDestroy(LifecycleOwner lifecycleOwner) {
        Job.DefaultImpls.cancel$default(this.b, (CancellationException) null, 1, (Object) null);
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public final void onPause(LifecycleOwner lifecycleOwner) {
        lifecycleOwner.getClass();
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public final void onResume(LifecycleOwner lifecycleOwner) {
        lifecycleOwner.getClass();
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public final void onStart(LifecycleOwner lifecycleOwner) {
        lifecycleOwner.getClass();
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public final void onStop(LifecycleOwner lifecycleOwner) {
        lifecycleOwner.getClass();
    }

    @Override // defpackage.rt1
    public final void start() {
        this.a.addObserver(this);
    }
}
