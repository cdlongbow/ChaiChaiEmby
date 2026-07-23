package defpackage;

import androidx.compose.runtime.MutableState;
import androidx.media3.exoplayer.ExoPlayer;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.DelayKt;

/* JADX INFO: loaded from: classes4.dex */
public final class j20 extends SuspendLambda implements Function2 {
    public final /* synthetic */ int a;
    public int b;
    public final /* synthetic */ MutableState c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j20(int i, MutableState mutableState, Continuation continuation) {
        super(2, continuation);
        this.a = 0;
        this.b = i;
        this.c = mutableState;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        int i = this.a;
        MutableState mutableState = this.c;
        switch (i) {
            case 0:
                return new j20(this.b, mutableState, continuation);
            case 1:
                return new j20(mutableState, continuation, 1);
            default:
                return new j20(mutableState, continuation, 2);
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
        return ((j20) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        int i = this.a;
        MutableState mutableState = this.c;
        switch (i) {
            case 0:
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                ResultKt.throwOnFailure(obj);
                int iB = m20.b(mutableState);
                int i2 = this.b;
                if (iB != i2) {
                    m20.c(i2, mutableState);
                }
                return Unit.INSTANCE;
            case 1:
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i3 = this.b;
                if (i3 == 0) {
                    ResultKt.throwOnFailure(obj);
                    this.b = 1;
                    if (DelayKt.delay(ExoPlayer.DEFAULT_DETACH_SURFACE_TIMEOUT_MS, this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i3 != 1) {
                        rd1.o("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    ResultKt.throwOnFailure(obj);
                }
                float f = a41.a;
                mr.A((Number) mutableState.getValue(), 1, mutableState);
                return Unit.INSTANCE;
            default:
                Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i4 = this.b;
                if (i4 == 0) {
                    ResultKt.throwOnFailure(obj);
                    this.b = 1;
                    if (DelayKt.delay(ExoPlayer.DEFAULT_DETACH_SURFACE_TIMEOUT_MS, this) == coroutine_suspended2) {
                        return coroutine_suspended2;
                    }
                } else {
                    if (i4 != 1) {
                        rd1.o("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    ResultKt.throwOnFailure(obj);
                }
                float f2 = a41.a;
                mr.A((Number) mutableState.getValue(), 1, mutableState);
                return Unit.INSTANCE;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ j20(MutableState mutableState, Continuation continuation, int i) {
        super(2, continuation);
        this.a = i;
        this.c = mutableState;
    }
}
