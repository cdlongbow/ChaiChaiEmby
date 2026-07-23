package defpackage;

import androidx.compose.runtime.MutableState;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: loaded from: classes4.dex */
public final class h6 extends SuspendLambda implements Function2 {
    public final /* synthetic */ int a;
    public final /* synthetic */ vc b;
    public final /* synthetic */ MutableState c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ h6(vc vcVar, MutableState mutableState, Continuation continuation, int i) {
        super(2, continuation);
        this.a = i;
        this.b = vcVar;
        this.c = mutableState;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        int i = this.a;
        MutableState mutableState = this.c;
        vc vcVar = this.b;
        switch (i) {
            case 0:
                return new h6(vcVar, mutableState, continuation, 0);
            case 1:
                return new h6(vcVar, mutableState, continuation, 1);
            default:
                return new h6(vcVar, mutableState, continuation, 2);
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
        return ((h6) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        int i = this.a;
        vc vcVar = this.b;
        MutableState mutableState = this.c;
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        switch (i) {
            case 0:
                ResultKt.throwOnFailure(obj);
                float f = f7.a;
                if (((Boolean) mutableState.getValue()).booleanValue()) {
                    vcVar.c();
                }
                break;
            case 1:
                ResultKt.throwOnFailure(obj);
                if (((Boolean) mutableState.getValue()).booleanValue()) {
                    vcVar.c();
                }
                break;
            default:
                ResultKt.throwOnFailure(obj);
                if (((Boolean) mutableState.getValue()).booleanValue()) {
                    vcVar.c();
                }
                break;
        }
        return Unit.INSTANCE;
    }
}
