package defpackage;

import java.util.List;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: loaded from: classes4.dex */
public final class jq0 extends SuspendLambda implements Function2 {
    public final /* synthetic */ int a;
    public int b;
    public final /* synthetic */ zq0 c;
    public final /* synthetic */ String d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ jq0(zq0 zq0Var, String str, Continuation continuation, int i) {
        super(2, continuation);
        this.a = i;
        this.c = zq0Var;
        this.d = str;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        int i = this.a;
        String str = this.d;
        zq0 zq0Var = this.c;
        switch (i) {
            case 0:
                return new jq0(zq0Var, str, continuation, 0);
            case 1:
                return new jq0(zq0Var, str, continuation, 1);
            default:
                return new jq0(zq0Var, str, continuation, 2);
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
        return ((jq0) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object objP;
        Object objS;
        Object objS2;
        int i = this.a;
        String str = this.d;
        zq0 zq0Var = this.c;
        switch (i) {
            case 0:
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i2 = this.b;
                if (i2 == 0) {
                    ResultKt.throwOnFailure(obj);
                    uf0 uf0Var = zq0Var.a;
                    this.b = 1;
                    objP = uf0Var.p(str, this);
                    if (objP == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i2 != 1) {
                        rd1.o("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    ResultKt.throwOnFailure(obj);
                    objP = ((Result) obj).getValue();
                }
                return Result.m8824boximpl(objP);
            case 1:
                Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i3 = this.b;
                if (i3 == 0) {
                    ResultKt.throwOnFailure(obj);
                    uf0 uf0Var2 = zq0Var.a;
                    this.b = 1;
                    objS = uf0Var2.s(str, this);
                    if (objS == coroutine_suspended2) {
                        return coroutine_suspended2;
                    }
                } else {
                    if (i3 != 1) {
                        rd1.o("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    ResultKt.throwOnFailure(obj);
                    objS = ((Result) obj).getValue();
                }
                return Result.m8824boximpl(objS);
            default:
                Object coroutine_suspended3 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i4 = this.b;
                if (i4 == 0) {
                    ResultKt.throwOnFailure(obj);
                    uf0 uf0Var3 = zq0Var.a;
                    this.b = 1;
                    objS2 = uf0Var3.s(str, this);
                    if (objS2 == coroutine_suspended3) {
                        return coroutine_suspended3;
                    }
                } else {
                    if (i4 != 1) {
                        rd1.o("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    ResultKt.throwOnFailure(obj);
                    objS2 = ((Result) obj).getValue();
                }
                List list = (List) (false ? null : objS2);
                return list == null ? CollectionsKt.emptyList() : list;
        }
    }
}
