package defpackage;

import androidx.compose.runtime.MutableState;
import java.util.List;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.ranges.RangesKt;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: loaded from: classes4.dex */
public final class gx extends SuspendLambda implements Function2 {
    public final /* synthetic */ int a;
    public final /* synthetic */ List b;
    public final /* synthetic */ Function1 c;
    public final /* synthetic */ int d;
    public final /* synthetic */ MutableState e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ gx(List list, Function1 function1, int i, MutableState mutableState, Continuation continuation, int i2) {
        super(2, continuation);
        this.a = i2;
        this.b = list;
        this.c = function1;
        this.d = i;
        this.e = mutableState;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        switch (this.a) {
            case 0:
                return new gx(this.b, this.c, this.d, this.e, continuation, 0);
            default:
                return new gx(this.b, this.c, this.d, this.e, continuation, 1);
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
        return ((gx) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        int i = this.a;
        int i2 = this.d;
        Function1 function1 = this.c;
        List list = this.b;
        MutableState mutableState = this.e;
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        switch (i) {
            case 0:
                ResultKt.throwOnFailure(obj);
                if (jx.b(mutableState) >= list.size()) {
                    mutableState.setValue(Integer.valueOf(RangesKt.coerceAtLeast(list.size() - 1, 0)));
                    function1.invoke(Boxing.boxInt(((Number) mutableState.getValue()).intValue()));
                } else if (((Number) mutableState.getValue()).intValue() != i2) {
                    mutableState.setValue(Integer.valueOf(i2));
                }
                break;
            default:
                ResultKt.throwOnFailure(obj);
                if (c52.d(mutableState) >= list.size()) {
                    mutableState.setValue(Integer.valueOf(RangesKt.coerceAtLeast(list.size() - 1, 0)));
                    function1.invoke(Boxing.boxInt(((Number) mutableState.getValue()).intValue()));
                } else if (((Number) mutableState.getValue()).intValue() != i2) {
                    mutableState.setValue(Integer.valueOf(i2));
                }
                break;
        }
        return Unit.INSTANCE;
    }
}
