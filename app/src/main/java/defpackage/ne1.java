package defpackage;

import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: loaded from: classes4.dex */
public final class ne1 extends SuspendLambda implements Function2 {
    public final /* synthetic */ boolean a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ boolean c;
    public final /* synthetic */ Function1 d;
    public final /* synthetic */ th1 e;
    public final /* synthetic */ Function1 g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ne1(boolean z, boolean z2, boolean z3, Function1 function1, th1 th1Var, Function1 function2, Continuation continuation) {
        super(2, continuation);
        this.a = z;
        this.b = z2;
        this.c = z3;
        this.d = function1;
        this.e = th1Var;
        this.g = function2;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new ne1(this.a, this.b, this.c, this.d, this.e, this.g, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((ne1) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        ResultKt.throwOnFailure(obj);
        if (!this.a && !this.b) {
            if (this.c) {
                this.d.invoke(Boxing.boxBoolean(false));
            } else {
                this.e.invoke(Boxing.boxBoolean(true));
                this.g.invoke(Boxing.boxLong(System.currentTimeMillis()));
            }
        }
        return Unit.INSTANCE;
    }
}
