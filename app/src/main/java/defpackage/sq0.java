package defpackage;

import com.dh.myembyapp.data.model.Library;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes4.dex */
public final class sq0 extends SuspendLambda implements Function1 {
    public int a;
    public final /* synthetic */ zq0 b;
    public final /* synthetic */ String c;
    public final /* synthetic */ Library d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public sq0(zq0 zq0Var, String str, Library library, Continuation continuation) {
        super(1, continuation);
        this.b = zq0Var;
        this.c = str;
        this.d = library;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Continuation continuation) {
        return new sq0(this.b, this.c, this.d, continuation);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        return ((sq0) create((Continuation) obj)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object objJ;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.a;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            zq0 zq0Var = this.b;
            uf0 uf0Var = zq0Var.a;
            Library library = this.d;
            String id = library.getId();
            String collectionType = library.getCollectionType();
            boolean z = zq0Var.K;
            this.a = 1;
            objJ = uf0Var.j(this.c, id, collectionType, 8, 0, z, this);
            if (objJ == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i != 1) {
                rd1.o("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            ResultKt.throwOnFailure(obj);
            objJ = ((Result) obj).getValue();
        }
        return Result.m8824boximpl(objJ);
    }
}
