package defpackage;

import android.content.Context;
import com.dh.myembyapp.data.model.MediaItem;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: loaded from: classes4.dex */
public final class po1 extends SuspendLambda implements Function2 {
    public int a;
    public final /* synthetic */ to1 b;
    public final /* synthetic */ Context c;
    public final /* synthetic */ MediaItem d;
    public final /* synthetic */ long e;
    public final /* synthetic */ Long g;
    public final /* synthetic */ ya2 h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public po1(to1 to1Var, Context context, MediaItem mediaItem, long j, Long l, ya2 ya2Var, Continuation continuation) {
        super(2, continuation);
        this.b = to1Var;
        this.c = context;
        this.d = mediaItem;
        this.e = j;
        this.g = l;
        this.h = ya2Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new po1(this.b, this.c, this.d, this.e, this.g, this.h, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((po1) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.a;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            this.a = 1;
            if (to1.o(this.b, this.c, this.d, this.e, this.g, this.h, this) == coroutine_suspended) {
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
