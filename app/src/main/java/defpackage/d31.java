package defpackage;

import androidx.compose.runtime.State;
import java.util.Set;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.MutableStateFlow;

/* JADX INFO: loaded from: classes4.dex */
public final class d31 extends SuspendLambda implements Function2 {
    public final /* synthetic */ int a;
    public final /* synthetic */ va0 b;
    public final /* synthetic */ NavBackStackEntry c;
    public final /* synthetic */ State d;
    public final /* synthetic */ State e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ d31(va0 va0Var, NavBackStackEntry navBackStackEntry, State state, State state2, Continuation continuation, int i) {
        super(2, continuation);
        this.a = i;
        this.b = va0Var;
        this.c = navBackStackEntry;
        this.d = state;
        this.e = state2;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        switch (this.a) {
            case 0:
                return new d31(this.b, this.c, this.d, this.e, continuation, 0);
            case 1:
                return new d31(this.b, this.c, this.d, this.e, continuation, 1);
            default:
                return new d31(this.b, this.c, this.d, this.e, continuation, 2);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        CoroutineScope coroutineScope = (CoroutineScope) obj;
        Continuation continuation = (Continuation) obj2;
        switch (this.a) {
            case 0:
                break;
            case 1:
                break;
        }
        return ((d31) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        int i = this.a;
        NavBackStackEntry navBackStackEntry = this.c;
        va0 va0Var = this.b;
        State state = this.e;
        State state2 = this.d;
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        switch (i) {
            case 0:
                ResultKt.throwOnFailure(obj);
                Set set = e31.a;
                String str = (String) state2.getValue();
                if (str != null) {
                    if (((Number) state.getValue()).intValue() > 0) {
                        va0Var.getClass();
                        va0Var.C.setValue(str);
                        MutableStateFlow mutableStateFlow = va0Var.E;
                        mutableStateFlow.setValue(Integer.valueOf(((Number) mutableStateFlow.getValue()).intValue() + 1));
                        navBackStackEntry.getSavedStateHandle().remove("detailReturnPersonFocusId");
                    }
                }
                break;
            case 1:
                ResultKt.throwOnFailure(obj);
                Set set2 = e31.a;
                String str2 = (String) state2.getValue();
                if (str2 != null) {
                    if (((Number) state.getValue()).intValue() > 0) {
                        va0Var.getClass();
                        va0Var.G.setValue(str2);
                        MutableStateFlow mutableStateFlow2 = va0Var.I;
                        mutableStateFlow2.setValue(Integer.valueOf(((Number) mutableStateFlow2.getValue()).intValue() + 1));
                        navBackStackEntry.getSavedStateHandle().remove("detailReturnSimilarFocusId");
                    }
                }
                break;
            default:
                ResultKt.throwOnFailure(obj);
                Set set3 = e31.a;
                String str3 = (String) state2.getValue();
                if (str3 != null) {
                    if (((Number) state.getValue()).intValue() > 0) {
                        va0Var.getClass();
                        va0Var.K.setValue(str3);
                        MutableStateFlow mutableStateFlow3 = va0Var.M;
                        mutableStateFlow3.setValue(Integer.valueOf(((Number) mutableStateFlow3.getValue()).intValue() + 1));
                        navBackStackEntry.getSavedStateHandle().remove("detailReturnCollectionFocusId");
                    }
                }
                break;
        }
        return Unit.INSTANCE;
    }
}
