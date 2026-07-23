package defpackage;

import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleObserver;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugProbesKt;
import kotlin.jvm.internal.Ref;
import kotlinx.coroutines.CancellableContinuationImpl;

/* JADX INFO: loaded from: classes4.dex */
public abstract class wz0 {
    /* JADX WARN: Code duplicated, block: B:34:0x0088  */
    /* JADX WARN: Code duplicated, block: B:39:0x0094  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v1, types: [T, androidx.lifecycle.LifecycleObserver, vz0] */
    public static final Object a(Lifecycle lifecycle, ContinuationImpl continuationImpl) throws Throwable {
        uz0 uz0Var;
        Lifecycle lifecycle2;
        Ref.ObjectRef objectRef;
        Throwable th;
        Lifecycle lifecycle3;
        LifecycleObserver lifecycleObserver;
        LifecycleObserver lifecycleObserver2;
        if (continuationImpl instanceof uz0) {
            uz0Var = (uz0) continuationImpl;
            int i = uz0Var.d;
            if ((i & Integer.MIN_VALUE) != 0) {
                uz0Var.d = i - Integer.MIN_VALUE;
            } else {
                uz0Var = new uz0(continuationImpl);
            }
        } else {
            uz0Var = new uz0(continuationImpl);
        }
        Object obj = uz0Var.c;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = uz0Var.d;
        if (i2 != 0) {
            if (i2 != 1) {
                rd1.o("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            objectRef = uz0Var.b;
            lifecycle2 = uz0Var.a;
            try {
                ResultKt.throwOnFailure(obj);
                lifecycle3 = lifecycle2;
                lifecycleObserver2 = (LifecycleObserver) objectRef.element;
                if (lifecycleObserver2 != null) {
                    lifecycle3.removeObserver(lifecycleObserver2);
                }
                return Unit.INSTANCE;
            } catch (Throwable th2) {
                th = th2;
                lifecycleObserver = (LifecycleObserver) objectRef.element;
                if (lifecycleObserver != null) {
                    lifecycle2.removeObserver(lifecycleObserver);
                }
                throw th;
            }
        }
        ResultKt.throwOnFailure(obj);
        if (lifecycle.getState().isAtLeast(Lifecycle.State.STARTED)) {
            return Unit.INSTANCE;
        }
        Ref.ObjectRef objectRef2 = new Ref.ObjectRef();
        try {
            uz0Var.a = lifecycle;
            uz0Var.b = objectRef2;
            uz0Var.d = 1;
            CancellableContinuationImpl cancellableContinuationImpl = new CancellableContinuationImpl(IntrinsicsKt.intercepted(uz0Var), 1);
            cancellableContinuationImpl.initCancellability();
            Object vz0Var = new vz0(cancellableContinuationImpl);
            objectRef2.element = vz0Var;
            lifecycle.addObserver(vz0Var);
            Object result = cancellableContinuationImpl.getResult();
            if (result == IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
                DebugProbesKt.probeCoroutineSuspended(uz0Var);
            }
            if (result == coroutine_suspended) {
                return coroutine_suspended;
            }
            lifecycle3 = lifecycle;
            objectRef = objectRef2;
            lifecycleObserver2 = (LifecycleObserver) objectRef.element;
            if (lifecycleObserver2 != null) {
                lifecycle3.removeObserver(lifecycleObserver2);
            }
            return Unit.INSTANCE;
        } catch (Throwable th3) {
            lifecycle2 = lifecycle;
            objectRef = objectRef2;
            th = th3;
            lifecycleObserver = (LifecycleObserver) objectRef.element;
            if (lifecycleObserver != null) {
                lifecycle2.removeObserver(lifecycleObserver);
            }
            throw th;
        }
    }
}
