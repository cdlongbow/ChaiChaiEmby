package defpackage;

import androidx.compose.foundation.ScrollState;

import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.ranges.RangesKt;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: loaded from: classes4.dex */
public final class zc extends SuspendLambda implements Function2 {
    public final /* synthetic */ int a;
    public int b;
    public final /* synthetic */ ScrollState c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ zc(ScrollState scrollState, Continuation continuation, int i) {
        super(2, continuation);
        this.a = i;
        this.c = scrollState;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        switch (this.a) {
            case 0:
                return new zc(this.c, continuation, 0);
            case 1:
                return new zc(this.c, continuation, 1);
            case 2:
                return new zc(this.c, continuation, 2);
            case 3:
                return new zc(this.c, continuation, 3);
            case 4:
                return new zc(this.c, continuation, 4);
            case 5:
                return new zc(this.c, continuation, 5);
            case 6:
                return new zc(this.c, continuation, 6);
            case 7:
                return new zc(this.c, continuation, 7);
            case 8:
                return new zc(this.c, continuation, 8);
            case 9:
                return new zc(this.c, continuation, 9);
            case 10:
                return new zc(this.c, continuation, 10);
            default:
                return new zc(this.c, continuation, 11);
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
            case 2:
                break;
            case 3:
                break;
            case 4:
                break;
            case 5:
                break;
            case 6:
                break;
            case 7:
                break;
            case 8:
                break;
            case 9:
                break;
            case 10:
                break;
        }
        return ((zc) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        int i = this.a;
        ScrollState scrollState = this.c;
        switch (i) {
            case 0:
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i2 = this.b;
                if (i2 == 0) {
                    ResultKt.throwOnFailure(obj);
                    if (scrollState.getValue() != 0) {
                        this.b = 1;
                        if (scrollState.scrollTo(0, this) == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                    }
                } else {
                    if (i2 != 1) {
                        rd1.o("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    ResultKt.throwOnFailure(obj);
                }
                return Unit.INSTANCE;
            case 1:
                Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i3 = this.b;
                if (i3 == 0) {
                    ResultKt.throwOnFailure(obj);
                    int iCoerceAtMost = RangesKt.coerceAtMost(scrollState.getValue() + 120, scrollState.getMaxValue());
                    this.b = 1;
                    if (ScrollState.animateScrollTo$default(this.c, iCoerceAtMost, null, this, 2, null) == coroutine_suspended2) {
                        return coroutine_suspended2;
                    }
                } else {
                    if (i3 != 1) {
                        rd1.o("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    ResultKt.throwOnFailure(obj);
                }
                return Unit.INSTANCE;
            case 2:
                Object coroutine_suspended3 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i4 = this.b;
                if (i4 == 0) {
                    ResultKt.throwOnFailure(obj);
                    int iCoerceAtLeast = RangesKt.coerceAtLeast(scrollState.getValue() - 120, 0);
                    this.b = 1;
                    if (ScrollState.animateScrollTo$default(this.c, iCoerceAtLeast, null, this, 2, null) == coroutine_suspended3) {
                        return coroutine_suspended3;
                    }
                } else {
                    if (i4 != 1) {
                        rd1.o("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    ResultKt.throwOnFailure(obj);
                }
                return Unit.INSTANCE;
            case 3:
                Object coroutine_suspended4 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i5 = this.b;
                if (i5 == 0) {
                    ResultKt.throwOnFailure(obj);
                    this.b = 1;
                    if (ScrollState.animateScrollTo$default(this.c, 0, null, this, 2, null) == coroutine_suspended4) {
                        return coroutine_suspended4;
                    }
                } else {
                    if (i5 != 1) {
                        rd1.o("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    ResultKt.throwOnFailure(obj);
                }
                return Unit.INSTANCE;
            case 4:
                Object coroutine_suspended5 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i6 = this.b;
                if (i6 == 0) {
                    ResultKt.throwOnFailure(obj);
                    this.b = 1;
                    if (ScrollState.animateScrollTo$default(this.c, 0, null, this, 2, null) == coroutine_suspended5) {
                        return coroutine_suspended5;
                    }
                } else {
                    if (i6 != 1) {
                        rd1.o("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    ResultKt.throwOnFailure(obj);
                }
                return Unit.INSTANCE;
            case 5:
                Object coroutine_suspended6 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i7 = this.b;
                if (i7 == 0) {
                    ResultKt.throwOnFailure(obj);
                    this.b = 1;
                    if (ScrollState.animateScrollTo$default(this.c, 100, null, this, 2, null) == coroutine_suspended6) {
                        return coroutine_suspended6;
                    }
                } else {
                    if (i7 != 1) {
                        rd1.o("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    ResultKt.throwOnFailure(obj);
                }
                return Unit.INSTANCE;
            case 6:
                Object coroutine_suspended7 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i8 = this.b;
                if (i8 == 0) {
                    ResultKt.throwOnFailure(obj);
                    this.b = 1;
                    if (ScrollState.animateScrollTo$default(this.c, Input.Keys.NUMPAD_6, null, this, 2, null) == coroutine_suspended7) {
                        return coroutine_suspended7;
                    }
                } else {
                    if (i8 != 1) {
                        rd1.o("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    ResultKt.throwOnFailure(obj);
                }
                return Unit.INSTANCE;
            case 7:
                Object coroutine_suspended8 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i9 = this.b;
                if (i9 == 0) {
                    ResultKt.throwOnFailure(obj);
                    this.b = 1;
                    if (ScrollState.animateScrollTo$default(this.c, Input.Keys.NUMPAD_6, null, this, 2, null) == coroutine_suspended8) {
                        return coroutine_suspended8;
                    }
                } else {
                    if (i9 != 1) {
                        rd1.o("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    ResultKt.throwOnFailure(obj);
                }
                return Unit.INSTANCE;
            case 8:
                Object coroutine_suspended9 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i10 = this.b;
                if (i10 == 0) {
                    ResultKt.throwOnFailure(obj);
                    ScrollState scrollState2 = this.c;
                    int maxValue = scrollState2.getMaxValue();
                    this.b = 1;
                    if (ScrollState.animateScrollTo$default(scrollState2, maxValue, null, this, 2, null) == coroutine_suspended9) {
                        return coroutine_suspended9;
                    }
                } else {
                    if (i10 != 1) {
                        rd1.o("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    ResultKt.throwOnFailure(obj);
                }
                return Unit.INSTANCE;
            case 9:
                Object coroutine_suspended10 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i11 = this.b;
                if (i11 == 0) {
                    ResultKt.throwOnFailure(obj);
                    ScrollState scrollState3 = this.c;
                    int maxValue2 = scrollState3.getMaxValue();
                    this.b = 1;
                    if (ScrollState.animateScrollTo$default(scrollState3, maxValue2, null, this, 2, null) == coroutine_suspended10) {
                        return coroutine_suspended10;
                    }
                } else {
                    if (i11 != 1) {
                        rd1.o("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    ResultKt.throwOnFailure(obj);
                }
                return Unit.INSTANCE;
            case 10:
                Object coroutine_suspended11 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i12 = this.b;
                if (i12 == 0) {
                    ResultKt.throwOnFailure(obj);
                    int iCoerceAtMost2 = RangesKt.coerceAtMost(scrollState.getValue() + 120, scrollState.getMaxValue());
                    this.b = 1;
                    if (ScrollState.animateScrollTo$default(this.c, iCoerceAtMost2, null, this, 2, null) == coroutine_suspended11) {
                        return coroutine_suspended11;
                    }
                } else {
                    if (i12 != 1) {
                        rd1.o("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    ResultKt.throwOnFailure(obj);
                }
                return Unit.INSTANCE;
            default:
                Object coroutine_suspended12 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i13 = this.b;
                if (i13 == 0) {
                    ResultKt.throwOnFailure(obj);
                    int iCoerceAtLeast2 = RangesKt.coerceAtLeast(scrollState.getValue() - 120, 0);
                    this.b = 1;
                    if (ScrollState.animateScrollTo$default(this.c, iCoerceAtLeast2, null, this, 2, null) == coroutine_suspended12) {
                        return coroutine_suspended12;
                    }
                } else {
                    if (i13 != 1) {
                        rd1.o("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    ResultKt.throwOnFailure(obj);
                }
                return Unit.INSTANCE;
        }
    }
}
