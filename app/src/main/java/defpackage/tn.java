package defpackage;

import java.io.Closeable;
import kotlin.ResultKt;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugProbesKt;
import kotlin.io.CloseableKt;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CancellableContinuationImpl;
import okhttp3.Call;
import okhttp3.Request;
import okhttp3.Response;

/* JADX INFO: loaded from: classes4.dex */
public final class tn implements k81 {
    public final Call.Factory a;

    public /* synthetic */ tn(Call.Factory factory) {
        this.a = factory;
    }

    /* JADX WARN: Code duplicated, block: B:35:0x00b0  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public static Object a(Call.Factory factory, u81 u81Var, Function2 function2, ContinuationImpl continuationImpl) {
        sn snVar;
        Function2 function3;
        Closeable closeable;
        Throwable th;
        Closeable closeable2;
        if (continuationImpl instanceof sn) {
            snVar = (sn) continuationImpl;
            int i = snVar.d;
            if ((i & Integer.MIN_VALUE) != 0) {
                snVar.d = i - Integer.MIN_VALUE;
            } else {
                snVar = new sn(continuationImpl);
            }
        } else {
            snVar = new sn(continuationImpl);
        }
        Object objB = snVar.c;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = snVar.d;
        int i3 = 2;
        if (i2 == 0) {
            ResultKt.throwOnFailure(objB);
            snVar.a = function2;
            snVar.b = factory;
            snVar.d = 1;
            objB = vn.b(u81Var, snVar);
            if (objB != coroutine_suspended) {
            }
            return coroutine_suspended;
        }
        if (i2 != 1) {
            if (i2 != 2) {
                if (i2 != 3) {
                    rd1.o("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                closeable2 = (Closeable) snVar.a;
                try {
                    ResultKt.throwOnFailure(objB);
                    CloseableKt.closeFinally(closeable2, null);
                    return objB;
                } catch (Throwable th2) {
                    th = th2;
                    try {
                        throw th;
                    } catch (Throwable th3) {
                        CloseableKt.closeFinally(closeable2, th);
                        throw th3;
                    }
                }
            }
            function3 = (Function2) snVar.a;
            ResultKt.throwOnFailure(objB);
            closeable = (Closeable) objB;
            try {
                v81 v81VarA = vn.a((Response) closeable);
                snVar.a = closeable;
                snVar.d = 3;
                objB = function3.invoke(v81VarA, snVar);
                if (objB != coroutine_suspended) {
                    closeable2 = closeable;
                    CloseableKt.closeFinally(closeable2, null);
                    return objB;
                }
                return coroutine_suspended;
            } catch (Throwable th4) {
                th = th4;
                closeable2 = closeable;
                throw th;
            }
        }
        factory = snVar.b;
        function2 = (Function2) snVar.a;
        ResultKt.throwOnFailure(objB);
        Call callNewCall = factory.newCall((Request) objB);
        snVar.a = function2;
        snVar.b = null;
        snVar.d = 2;
        CancellableContinuationImpl cancellableContinuationImpl = new CancellableContinuationImpl(IntrinsicsKt.intercepted(snVar), 1);
        cancellableContinuationImpl.initCancellability();
        cancellableContinuationImpl.invokeOnCancellation(new xn(callNewCall, 0));
        callNewCall.enqueue(new ri(cancellableContinuationImpl, i3));
        objB = cancellableContinuationImpl.getResult();
        if (objB == IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
            DebugProbesKt.probeCoroutineSuspended(snVar);
        }
        if (objB != coroutine_suspended) {
            function3 = function2;
            closeable = (Closeable) objB;
            v81 v81VarA2 = vn.a((Response) closeable);
            snVar.a = closeable;
            snVar.d = 3;
            objB = function3.invoke(v81VarA2, snVar);
            if (objB != coroutine_suspended) {
                closeable2 = closeable;
                CloseableKt.closeFinally(closeable2, null);
                return objB;
            }
        }
        return coroutine_suspended;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof tn) {
            return Intrinsics.areEqual(this.a, ((tn) obj).a);
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "CallFactoryNetworkClient(callFactory=" + this.a + ")";
    }
}
