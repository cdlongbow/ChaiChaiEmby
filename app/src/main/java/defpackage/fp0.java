package defpackage;

import android.util.Log;
import androidx.compose.runtime.MutableState;
import java.util.List;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.ranges.RangesKt;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: loaded from: classes4.dex */
public final class fp0 extends SuspendLambda implements Function2 {
    public final /* synthetic */ int a;
    public final /* synthetic */ List b;
    public final /* synthetic */ MutableState c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ fp0(List list, MutableState mutableState, Continuation continuation, int i) {
        super(2, continuation);
        this.a = i;
        this.b = list;
        this.c = mutableState;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        int i = this.a;
        MutableState mutableState = this.c;
        List list = this.b;
        switch (i) {
            case 0:
                return new fp0(list, mutableState, continuation, 0);
            default:
                return new fp0(list, mutableState, continuation, 1);
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
        return ((fp0) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        int i = this.a;
        MutableState mutableState = this.c;
        List list = this.b;
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        switch (i) {
            case 0:
                ResultKt.throwOnFailure(obj);
                mutableState.setValue(Integer.valueOf(RangesKt.coerceAtMost(((Number) mutableState.getValue()).intValue(), list.size())));
                break;
            default:
                ResultKt.throwOnFailure(obj);
                if (((Number) mutableState.getValue()).intValue() >= 0 && ((Number) mutableState.getValue()).intValue() < list.size()) {
                    Log.d("MoreMenu", "键盘Enter触发菜单项: " + ((Number) mutableState.getValue()).intValue());
                    ((j51) list.get(((Number) mutableState.getValue()).intValue())).b.invoke();
                    mutableState.setValue(-1);
                }
                break;
        }
        return Unit.INSTANCE;
    }
}
