package defpackage;

import android.util.Log;
import com.dh.myembyapp.data.model.DanmakuConfig;
import java.util.concurrent.CancellationException;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Job;

/* JADX INFO: loaded from: classes4.dex */
public final class lx extends SuspendLambda implements Function2 {
    public int a;
    public final /* synthetic */ mx b;
    public final /* synthetic */ long c;
    public final /* synthetic */ String d;
    public final /* synthetic */ String e;
    public final /* synthetic */ String g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public lx(mx mxVar, long j, String str, String str2, String str3, Continuation continuation) {
        super(2, continuation);
        this.b = mxVar;
        this.c = j;
        this.d = str;
        this.e = str2;
        this.g = str3;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new lx(this.b, this.c, this.d, this.e, this.g, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((lx) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object objA;
        mx mxVar = this.b;
        Function1 function1 = mxVar.i;
        kx kxVar = mxVar.b;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.a;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            ax axVar = mxVar.e;
            DanmakuConfig danmakuConfigB = kxVar.b();
            this.a = 1;
            objA = axVar.a(this.c, this.d, this.e, this.g, danmakuConfigB, this);
            if (objA == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i != 1) {
                rd1.o("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            ResultKt.throwOnFailure(obj);
            objA = ((Result) obj).getValue();
        }
        if (Result.m8831isFailureimpl(objA)) {
            objA = null;
        }
        ww wwVar = (ww) objA;
        if (wwVar == null) {
            function1.invoke("弹幕加载失败");
            return Unit.INSTANCE;
        }
        kxVar.a(wwVar.a, wwVar.b, wwVar.c, wwVar.d, wwVar.e);
        function1.invoke(wwVar.f);
        Job job = (Job) kxVar.h.getValue();
        if (job != null) {
            Job.DefaultImpls.cancel$default(job, (CancellationException) null, 1, (Object) null);
        }
        kxVar.h.setValue(null);
        Log.d("DanmakuPlayer", "已取消自动匹配任务");
        return Unit.INSTANCE;
    }
}
