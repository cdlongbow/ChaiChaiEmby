package defpackage;

import androidx.compose.runtime.MutableState;
import com.dh.myembyapp.data.model.Library;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;

import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: loaded from: classes4.dex */
public final class qy0 extends SuspendLambda implements Function2 {
    public Object a;
    public int b;
    public /* synthetic */ Object c;
    public final /* synthetic */ MutableState d;
    public final /* synthetic */ MutableState e;
    public final /* synthetic */ Function2 g;
    public final /* synthetic */ List h;
    public final /* synthetic */ Function1 i;
    public final /* synthetic */ List j;
    public final /* synthetic */ MutableState k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public qy0(MutableState mutableState, MutableState mutableState2, Function2 function2, List list, Function1 function1, List list2, MutableState mutableState3, Continuation continuation) {
        super(2, continuation);
        this.d = mutableState;
        this.e = mutableState2;
        this.g = function2;
        this.h = list;
        this.i = function1;
        this.j = list2;
        this.k = mutableState3;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        qy0 qy0Var = new qy0(this.d, this.e, this.g, this.h, this.i, this.j, this.k, continuation);
        qy0Var.c = obj;
        return qy0Var;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((qy0) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object objM8825constructorimpl;
        CoroutineScope coroutineScope = (CoroutineScope) this.c;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.b;
        List list = this.h;
        MutableState mutableState = this.e;
        MutableState mutableState2 = this.d;
        try {
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                mutableState2.setValue(Boolean.TRUE);
                mutableState.setValue(null);
                Function2 function2 = this.g;
                Result.Companion companion = Result.INSTANCE;
                this.c = null;
                this.a = null;
                this.b = 1;
                obj = function2.invoke(list, this);
                if (obj == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 1) {
                    rd1.o("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                ResultKt.throwOnFailure(obj);
            }
            objM8825constructorimpl = Result.m8825constructorimpl(Result.m8824boximpl(((Result) obj).getValue()));
        } catch (Throwable th) {
            Result.Companion companion2 = Result.INSTANCE;
            objM8825constructorimpl = Result.m8825constructorimpl(ResultKt.createFailure(th));
        }
        Throwable thM8828exceptionOrNullimpl = Result.m8828exceptionOrNullimpl(objM8825constructorimpl);
        if (thM8828exceptionOrNullimpl != null) {
            objM8825constructorimpl = Result.m8824boximpl(Result.m8825constructorimpl(ResultKt.createFailure(thM8828exceptionOrNullimpl)));
        }
        Object value = ((Result) objM8825constructorimpl).getValue();
        mutableState2.setValue(Boolean.FALSE);
        if (Result.m8832isSuccessimpl(value)) {
            ArrayList arrayList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(list, 10));
            Iterator it = list.iterator();
            while (it.hasNext()) {
                arrayList.add(((Library) it.next()).getId());
            }
            this.i.invoke(arrayList);
        }
        Throwable thM8828exceptionOrNullimpl2 = Result.m8828exceptionOrNullimpl(value);
        if (thM8828exceptionOrNullimpl2 != null) {
            this.k.setValue(this.j);
            String message = thM8828exceptionOrNullimpl2.getMessage();
            if (message == null) {
                message = "保存媒体库排序失败";
            }
            mutableState.setValue(message);
        }
        return Unit.INSTANCE;
    }
}
