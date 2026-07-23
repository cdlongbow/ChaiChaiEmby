package defpackage;

import com.dh.myembyapp.data.model.Library;
import java.util.Set;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: loaded from: classes4.dex */
public final class wq0 extends SuspendLambda implements Function2 {
    public int a;
    public final /* synthetic */ zq0 b;
    public final /* synthetic */ String c;
    public final /* synthetic */ Library d;
    public final /* synthetic */ long e;
    public final /* synthetic */ Set g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public wq0(zq0 zq0Var, String str, Library library, long j, Set set, Continuation continuation) {
        super(2, continuation);
        this.b = zq0Var;
        this.c = str;
        this.d = library;
        this.e = j;
        this.g = set;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new wq0(this.b, this.c, this.d, this.e, this.g, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((wq0) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.a;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            Set set = this.g;
            Library library = this.d;
            boolean zContains = set.contains(library.getId());
            this.a = 1;
            if (zq0.b(this.b, this.c, library, this.e, zContains, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i != 1) {
                rd1.o("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            ResultKt.throwOnFailure(obj);
        }
        return Unit.INSTANCE;
    }
}
