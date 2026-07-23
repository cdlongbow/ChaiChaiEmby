package defpackage;

import android.util.Log;
import java.util.List;
import java.util.concurrent.CancellationException;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: loaded from: classes4.dex */
public final class ef0 extends SuspendLambda implements Function2 {
    public int a;
    public final /* synthetic */ uf0 b;
    public final /* synthetic */ String c;
    public final /* synthetic */ List d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ef0(uf0 uf0Var, String str, List list, Continuation continuation) {
        super(2, continuation);
        this.b = uf0Var;
        this.c = str;
        this.d = list;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new ef0(this.b, this.c, this.d, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((ef0) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object objM8825constructorimpl;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.a;
        try {
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                Result.Companion companion = Result.INSTANCE;
                uf0 uf0Var = this.b;
                String str = this.c;
                List list = this.d;
                this.a = 1;
                obj = uf0.d(uf0Var, str, list, this);
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
            objM8825constructorimpl = Result.m8825constructorimpl(obj);
        } catch (CancellationException e) {
            throw e;
        } catch (Exception e2) {
            Log.e("EmbyRepository", "媒体库排序：弹窗准备失败", e2);
            Result.Companion companion2 = Result.INSTANCE;
            objM8825constructorimpl = Result.m8825constructorimpl(ResultKt.createFailure(new Exception(kb0.x("准备媒体库排序数据失败: ", e2.getMessage()))));
        }
        return Result.m8824boximpl(objM8825constructorimpl);
    }
}
