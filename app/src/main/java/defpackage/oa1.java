package defpackage;

import android.content.Context;
import androidx.compose.runtime.MutableState;
import java.util.List;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: loaded from: classes4.dex */
public final class oa1 extends SuspendLambda implements Function2 {
    public int a;
    public final /* synthetic */ String b;
    public final /* synthetic */ qe c;
    public final /* synthetic */ ne d;
    public final /* synthetic */ MutableState e;
    public final /* synthetic */ CoroutineScope g;
    public final /* synthetic */ Context h;
    public final /* synthetic */ MutableState i;
    public final /* synthetic */ MutableState j;
    public final /* synthetic */ MutableState k;
    public final /* synthetic */ jj1 l;
    public final /* synthetic */ MutableState m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public oa1(String str, qe qeVar, ne neVar, MutableState mutableState, CoroutineScope coroutineScope, Context context, MutableState mutableState2, MutableState mutableState3, MutableState mutableState4, jj1 jj1Var, MutableState mutableState5, Continuation continuation) {
        super(2, continuation);
        this.b = str;
        this.c = qeVar;
        this.d = neVar;
        this.e = mutableState;
        this.g = coroutineScope;
        this.h = context;
        this.i = mutableState2;
        this.j = mutableState3;
        this.k = mutableState4;
        this.l = jj1Var;
        this.m = mutableState5;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new oa1(this.b, this.c, this.d, this.e, this.g, this.h, this.i, this.j, this.k, this.l, this.m, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((oa1) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object value;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.a;
        qe qeVar = this.c;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            ye yeVar = ye.a;
            this.a = 1;
            Object objJ = yeVar.j(this.b, qeVar, this.d, this);
            if (objJ == coroutine_suspended) {
                return coroutine_suspended;
            }
            value = objJ;
        } else {
            if (i != 1) {
                rd1.o("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            ResultKt.throwOnFailure(obj);
            value = ((Result) obj).getValue();
        }
        if (Result.m8832isSuccessimpl(value)) {
            re reVar = (re) value;
            boolean zIsEmpty = reVar.b.isEmpty();
            MutableState mutableState = this.e;
            if (zIsEmpty) {
                se seVar = (se) CollectionsKt.firstOrNull((List) reVar.b);
                float f = ra1.a;
                BuildersKt__Builders_commonKt.launch$default(this.g, null, null, new wd(qeVar, seVar, this.h, this.b, this.d, this.i, this.j, this.k, this.l, mutableState, (Continuation) null), 3, null);
            } else {
                float f2 = ra1.a;
                mutableState.setValue(reVar);
            }
        }
        Throwable thM8828exceptionOrNullimpl = Result.m8828exceptionOrNullimpl(value);
        if (thM8828exceptionOrNullimpl != null) {
            String message = thM8828exceptionOrNullimpl.getMessage();
            if (message == null) {
                message = "加载字幕详情失败";
            }
            float f3 = ra1.a;
            this.k.setValue(message);
        }
        float f4 = ra1.a;
        this.m.setValue(null);
        return Unit.INSTANCE;
    }
}
