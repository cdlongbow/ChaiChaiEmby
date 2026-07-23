package defpackage;

import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Ref;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: loaded from: classes4.dex */
public final class dg0 extends SuspendLambda implements Function2 {
    public int a;
    public final /* synthetic */ gg0 b;
    public final /* synthetic */ Ref.ObjectRef c;
    public final /* synthetic */ Ref.ObjectRef d;
    public final /* synthetic */ fs0 e;
    public final /* synthetic */ Object g;
    public final /* synthetic */ Ref.ObjectRef h;
    public final /* synthetic */ yg0 i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dg0(gg0 gg0Var, Ref.ObjectRef objectRef, Ref.ObjectRef objectRef2, fs0 fs0Var, Object obj, Ref.ObjectRef objectRef3, yg0 yg0Var, Continuation continuation) {
        super(2, continuation);
        this.b = gg0Var;
        this.c = objectRef;
        this.d = objectRef2;
        this.e = fs0Var;
        this.g = obj;
        this.h = objectRef3;
        this.i = yg0Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new dg0(this.b, this.c, this.d, this.e, this.g, this.h, this.i, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((dg0) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.a;
        if (i != 0) {
            if (i == 1) {
                ResultKt.throwOnFailure(obj);
                return obj;
            }
            rd1.o("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        ResultKt.throwOnFailure(obj);
        o22 o22Var = (o22) this.c.element;
        ds dsVar = (ds) this.d.element;
        wa1 wa1Var = (wa1) this.h.element;
        this.a = 1;
        Object objA = gg0.a(this.b, o22Var, dsVar, this.e, this.g, wa1Var, this.i, this);
        return objA == coroutine_suspended ? coroutine_suspended : objA;
    }
}
