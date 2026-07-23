package defpackage;

import android.content.Context;
import android.widget.Toast;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: loaded from: classes4.dex */
public final class bj1 extends SuspendLambda implements Function2 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Context b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ bj1(Context context, Continuation continuation, int i) {
        super(2, continuation);
        this.a = i;
        this.b = context;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        int i = this.a;
        Context context = this.b;
        switch (i) {
            case 0:
                return new bj1(context, continuation, 0);
            case 1:
                return new bj1(context, continuation, 1);
            case 2:
                return new bj1(context, continuation, 2);
            default:
                return new bj1(context, continuation, 3);
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
            case 2:
                break;
        }
        return ((bj1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        int i = this.a;
        Context context = this.b;
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        switch (i) {
            case 0:
                ResultKt.throwOnFailure(obj);
                Toast.makeText(context, "已跳过片头", 0).show();
                break;
            case 1:
                ResultKt.throwOnFailure(obj);
                Toast.makeText(context, "已到达片尾，播放下一集", 0).show();
                break;
            case 2:
                ResultKt.throwOnFailure(obj);
                Toast.makeText(context, "已到达片尾", 0).show();
                break;
            default:
                ResultKt.throwOnFailure(obj);
                Toast.makeText(context, "已到达片尾", 0).show();
                break;
        }
        return Unit.INSTANCE;
    }
}
