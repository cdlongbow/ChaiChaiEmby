package defpackage;

import androidx.lifecycle.SavedStateHandle;
import java.io.IOException;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import okio.Okio;

/* JADX INFO: loaded from: classes4.dex */
public final class hb0 extends SuspendLambda implements Function2 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ hb0(Object obj, Continuation continuation, int i) {
        super(2, continuation);
        this.a = i;
        this.b = obj;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        int i = this.a;
        Object obj2 = this.b;
        switch (i) {
            case 0:
                return new hb0((ib0) obj2, continuation, 0);
            default:
                return new hb0((NavBackStackEntry) obj2, continuation, 1);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        CoroutineScope coroutineScope = (CoroutineScope) obj;
        Continuation continuation = (Continuation) obj2;
        switch (this.a) {
            case 0:
                break;
        }
        return ((hb0) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        SavedStateHandle savedStateHandle;
        SavedStateHandle savedStateHandle2;
        int i = this.a;
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        switch (i) {
            case 0:
                ResultKt.throwOnFailure(obj);
                ib0 ib0Var = (ib0) this.b;
                synchronized (ib0Var.i) {
                    try {
                        if (!ib0Var.n || ib0Var.o) {
                            return Unit.INSTANCE;
                        }
                        try {
                            ib0Var.k();
                            break;
                        } catch (IOException unused) {
                            ib0Var.p = true;
                        }
                        try {
                            if (ib0Var.k >= 2000) {
                                ib0Var.m();
                            }
                            break;
                        } catch (IOException unused2) {
                            ib0Var.q = true;
                            ib0Var.l = Okio.buffer(Okio.blackhole());
                        }
                        return Unit.INSTANCE;
                    } catch (Throwable th) {
                        throw th;
                    }
                }
            default:
                ResultKt.throwOnFailure(obj);
                NavBackStackEntry navBackStackEntry = (NavBackStackEntry) this.b;
                if (navBackStackEntry != null && (savedStateHandle2 = navBackStackEntry.getSavedStateHandle()) != null) {
                }
                if (navBackStackEntry != null && (savedStateHandle = navBackStackEntry.getSavedStateHandle()) != null) {
                }
                return Unit.INSTANCE;
        }
    }
}
