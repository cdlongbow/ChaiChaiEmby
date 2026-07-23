package defpackage;

import android.util.Log;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: loaded from: classes4.dex */
public final class mf2 extends SuspendLambda implements Function2 {
    public final /* synthetic */ int a = 1;
    public /* synthetic */ Object b;
    public final /* synthetic */ pf2 c;
    public final /* synthetic */ ye2 d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public mf2(ye2 ye2Var, pf2 pf2Var, Continuation continuation) {
        super(2, continuation);
        this.d = ye2Var;
        this.c = pf2Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        int i = this.a;
        ye2 ye2Var = this.d;
        pf2 pf2Var = this.c;
        switch (i) {
            case 0:
                mf2 mf2Var = new mf2(ye2Var, pf2Var, continuation);
                mf2Var.b = obj;
                return mf2Var;
            default:
                mf2 mf2Var2 = new mf2(pf2Var, ye2Var, continuation);
                mf2Var2.b = obj;
                return mf2Var2;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        CoroutineScope coroutineScope = (CoroutineScope) obj;
        Continuation continuation = (Continuation) obj2;
        switch (this.a) {
            case 0:
                break;
        }
        return ((mf2) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object objM8825constructorimpl;
        Object objM8825constructorimpl2;
        int i = this.a;
        ye2 ye2Var = this.d;
        pf2 pf2Var = this.c;
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        switch (i) {
            case 0:
                ResultKt.throwOnFailure(obj);
                try {
                    Result.Companion companion = Result.INSTANCE;
                    if (!(ye2Var.d || ye2Var.e)) {
                        throw new IllegalArgumentException("请至少勾选一类同步内容");
                    }
                    rf2 rf2VarC = new ff2(pf2Var, ye2Var).c();
                    if (rf2VarC == null) {
                        throw new IllegalStateException("远端还没有可下载的同步文件");
                    }
                    objM8825constructorimpl = Result.m8825constructorimpl(pf2.c(rf2VarC, ye2Var));
                    Throwable thM8828exceptionOrNullimpl = Result.m8828exceptionOrNullimpl(objM8825constructorimpl);
                    if (thM8828exceptionOrNullimpl != null) {
                        Log.e("WebDavSyncRepository", "读取 WebDAV 下载预览失败", thM8828exceptionOrNullimpl);
                    }
                    return Result.m8824boximpl(objM8825constructorimpl);
                } catch (Throwable th) {
                    Result.Companion companion2 = Result.INSTANCE;
                    objM8825constructorimpl = Result.m8825constructorimpl(ResultKt.createFailure(th));
                }
                break;
            default:
                ResultKt.throwOnFailure(obj);
                try {
                    Result.Companion companion3 = Result.INSTANCE;
                    new ff2(pf2Var, ye2Var).d();
                    objM8825constructorimpl2 = Result.m8825constructorimpl("连接成功，已确认远端目录 ChaiChaiEmby 可访问。");
                    break;
                } catch (Throwable th2) {
                    Result.Companion companion4 = Result.INSTANCE;
                    objM8825constructorimpl2 = Result.m8825constructorimpl(ResultKt.createFailure(th2));
                }
                Throwable thM8828exceptionOrNullimpl2 = Result.m8828exceptionOrNullimpl(objM8825constructorimpl2);
                if (thM8828exceptionOrNullimpl2 != null) {
                    Log.e("WebDavSyncRepository", "测试 WebDAV 连接失败", thM8828exceptionOrNullimpl2);
                }
                return Result.m8824boximpl(objM8825constructorimpl2);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public mf2(pf2 pf2Var, ye2 ye2Var, Continuation continuation) {
        super(2, continuation);
        this.c = pf2Var;
        this.d = ye2Var;
    }
}
