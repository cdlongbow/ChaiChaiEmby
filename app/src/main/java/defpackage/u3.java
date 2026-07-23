package defpackage;

import android.util.Log;
import com.dh.myembyapp.data.api.EmbyApiService;
import com.dh.myembyapp.data.model.QueryResult;
import com.dh.myembyapp.data.model.ServerConfig;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;

import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import retrofit2.Response;

/* JADX INFO: loaded from: classes4.dex */
public final class u3 extends SuspendLambda implements Function2 {
    public b4 a;
    public ServerConfig b;
    public Object c;
    public Object d;
    public Object e;
    public int g;
    public int h;
    public /* synthetic */ Object i;
    public final /* synthetic */ b4 j;
    public final /* synthetic */ ServerConfig k;
    public final /* synthetic */ String l;
    public final /* synthetic */ int m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u3(b4 b4Var, ServerConfig serverConfig, String str, int i, Continuation continuation) {
        super(2, continuation);
        this.j = b4Var;
        this.k = serverConfig;
        this.l = str;
        this.m = i;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        u3 u3Var = new u3(this.j, this.k, this.l, this.m, continuation);
        u3Var.i = obj;
        return u3Var;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((u3) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        ServerConfig serverConfig;
        Object objM8825constructorimpl;
        Object objF;
        b4 b4Var;
        int i;
        CoroutineScope coroutineScope = (CoroutineScope) this.i;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = this.h;
        ServerConfig serverConfig2 = this.k;
        try {
            if (i2 == 0) {
                ResultKt.throwOnFailure(obj);
                b4 b4Var2 = this.j;
                String str = this.l;
                int i3 = this.m;
                Result.Companion companion = Result.INSTANCE;
                EmbyApiService embyApiServiceA = b4.a(b4Var2, serverConfig2);
                String strE = b4.e(b4Var2, serverConfig2);
                Integer numBoxInt = Boxing.boxInt(i3);
                this.i = null;
                this.a = b4Var2;
                this.b = serverConfig2;
                this.c = null;
                this.d = null;
                this.e = null;
                this.g = i3;
                this.h = 1;
                serverConfig = serverConfig2;
                try {
                    objF = kb0.f(embyApiServiceA, strE, null, false, null, null, null, str, false, null, numBoxInt, this, 446, null);
                    if (objF == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    serverConfig2 = serverConfig;
                    b4Var = b4Var2;
                    i = i3;
                } catch (Throwable th) {
                    th = th;
                    Result.Companion companion2 = Result.INSTANCE;
                    objM8825constructorimpl = Result.m8825constructorimpl(ResultKt.createFailure(th));
                }
            } else {
                if (i2 != 1) {
                    rd1.o("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                int i4 = this.g;
                ServerConfig serverConfig3 = this.b;
                b4Var = this.a;
                ResultKt.throwOnFailure(obj);
                serverConfig = serverConfig2;
                serverConfig2 = serverConfig3;
                i = i4;
                objF = obj;
            }
            Response response = (Response) objF;
            if (!response.isSuccessful() || response.body() == null) {
                throw new Exception("获取收藏失败: " + response.code() + " " + response.message());
            }
            Object objBody = response.body();
            objBody.getClass();
            objM8825constructorimpl = Result.m8825constructorimpl(CollectionsKt.take(b4.d(b4Var, (QueryResult) objBody, serverConfig2.getAlias() + " 收藏"), i));
            Throwable thM8828exceptionOrNullimpl = Result.m8828exceptionOrNullimpl(objM8825constructorimpl);
            if (thM8828exceptionOrNullimpl != null) {
                Log.e("AggregateHubRepo", "[" + serverConfig.getAlias() + "] 获取收藏失败", thM8828exceptionOrNullimpl);
            }
            return Result.m8824boximpl(objM8825constructorimpl);
        } catch (Throwable th2) {
            th = th2;
            serverConfig = serverConfig2;
        }
    }
}
