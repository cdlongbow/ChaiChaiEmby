package defpackage;

import androidx.compose.runtime.MutableState;
import com.dh.myembyapp.data.model.Library;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.ranges.RangesKt;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: loaded from: classes4.dex */
public final class ap0 extends SuspendLambda implements Function2 {
    public final /* synthetic */ List a;
    public final /* synthetic */ MutableState b;
    public final /* synthetic */ MutableState c;
    public final /* synthetic */ MutableState d;
    public final /* synthetic */ Map e;
    public final /* synthetic */ MutableState g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ap0(List list, MutableState mutableState, MutableState mutableState2, MutableState mutableState3, Map map, MutableState mutableState4, Continuation continuation) {
        super(2, continuation);
        this.a = list;
        this.b = mutableState;
        this.c = mutableState2;
        this.d = mutableState3;
        this.e = map;
        this.g = mutableState4;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new ap0(this.a, this.b, this.c, this.d, this.e, this.g, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((ap0) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        ResultKt.throwOnFailure(obj);
        MutableState mutableState = this.b;
        if (!((Boolean) mutableState.getValue()).booleanValue()) {
            return Unit.INSTANCE;
        }
        MutableState mutableState2 = this.c;
        int iIntValue = ((Number) mutableState2.getValue()).intValue();
        MutableState mutableState3 = this.d;
        int iIntValue2 = ((Number) mutableState3.getValue()).intValue();
        if (iIntValue < 0 || iIntValue2 <= iIntValue) {
            return Unit.INSTANCE;
        }
        List list = this.a;
        List listSubList = list.subList(iIntValue, RangesKt.coerceAtMost(iIntValue2, list.size()));
        if (listSubList == null || !listSubList.isEmpty()) {
            Iterator it = listSubList.iterator();
            while (it.hasNext()) {
                if (!this.e.containsKey(((Library) it.next()).getId())) {
                }
            }
            this.g.setValue(Integer.valueOf(iIntValue2));
            mutableState2.setValue(-1);
            mutableState3.setValue(0);
            mutableState.setValue(Boolean.FALSE);
        } else {
            this.g.setValue(Integer.valueOf(iIntValue2));
            mutableState2.setValue(-1);
            mutableState3.setValue(0);
            mutableState.setValue(Boolean.FALSE);
        }
        return Unit.INSTANCE;
    }
}
