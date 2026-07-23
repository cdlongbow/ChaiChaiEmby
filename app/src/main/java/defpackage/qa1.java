package defpackage;

import android.content.Context;
import androidx.compose.runtime.MutableIntState;
import androidx.compose.runtime.MutableState;
import java.util.List;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: loaded from: classes4.dex */
public final class qa1 extends SuspendLambda implements Function2 {
    public int a;
    public final /* synthetic */ Context b;
    public final /* synthetic */ String c;
    public final /* synthetic */ String d;
    public final /* synthetic */ ne e;
    public final /* synthetic */ MutableState g;
    public final /* synthetic */ MutableState h;
    public final /* synthetic */ MutableState i;
    public final /* synthetic */ MutableState j;
    public final /* synthetic */ MutableState k;
    public final /* synthetic */ MutableState l;
    public final /* synthetic */ MutableState m;
    public final /* synthetic */ MutableIntState n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public qa1(Context context, String str, String str2, ne neVar, MutableState mutableState, MutableState mutableState2, MutableState mutableState3, MutableState mutableState4, MutableState mutableState5, MutableState mutableState6, MutableState mutableState7, MutableIntState mutableIntState, Continuation continuation) {
        super(2, continuation);
        this.b = context;
        this.c = str;
        this.d = str2;
        this.e = neVar;
        this.g = mutableState;
        this.h = mutableState2;
        this.i = mutableState3;
        this.j = mutableState4;
        this.k = mutableState5;
        this.l = mutableState6;
        this.m = mutableState7;
        this.n = mutableIntState;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new qa1(this.b, this.c, this.d, this.e, this.g, this.h, this.i, this.j, this.k, this.l, this.m, this.n, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((qa1) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        qa1 qa1Var;
        Object objR;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.a;
        MutableState mutableState = this.g;
        MutableState mutableState2 = this.j;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            float f = ra1.a;
            Boolean bool = Boolean.TRUE;
            mutableState.setValue(bool);
            this.h.setValue(bool);
            this.i.setValue(Boolean.FALSE);
            mutableState2.setValue(null);
            this.k.setValue(null);
            ye yeVar = ye.a;
            this.a = 1;
            qa1Var = this;
            objR = yeVar.r(this.b, this.c, this.d, 0, 10, this.e, qa1Var);
            if (objR == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i != 1) {
                rd1.o("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            ResultKt.throwOnFailure(obj);
            objR = ((Result) obj).getValue();
            qa1Var = this;
        }
        boolean zM8832isSuccessimpl = Result.m8832isSuccessimpl(objR);
        MutableState mutableState3 = qa1Var.m;
        MutableState mutableState4 = qa1Var.l;
        if (zM8832isSuccessimpl) {
            List list = (List) objR;
            float f2 = ra1.a;
            mutableState4.setValue(list);
            mutableState3.setValue(Boolean.valueOf(list.size() >= 10));
            if (list.isEmpty()) {
                mutableState2.setValue("没有找到匹配字幕");
            } else {
                MutableIntState mutableIntState = qa1Var.n;
                int intValue = mutableIntState.getIntValue();
                mutableIntState.setIntValue(intValue + 1);
                Boxing.boxInt(intValue);
            }
        }
        Throwable thM8828exceptionOrNullimpl = Result.m8828exceptionOrNullimpl(objR);
        if (thM8828exceptionOrNullimpl != null) {
            String message = thM8828exceptionOrNullimpl.getMessage();
            if (message == null) {
                message = "搜索失败";
            }
            float f3 = ra1.a;
            mutableState2.setValue(message);
            mutableState4.setValue(CollectionsKt.emptyList());
            mutableState3.setValue(Boolean.FALSE);
        }
        float f4 = ra1.a;
        mutableState.setValue(Boolean.FALSE);
        return Unit.INSTANCE;
    }
}
