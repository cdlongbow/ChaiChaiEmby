package defpackage;

import android.util.Log;
import com.dh.myembyapp.data.api.EmbyApiService;
import com.dh.myembyapp.data.api.RetrofitClient;
import java.util.Map;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.collections.MapsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;

import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import retrofit2.Response;

/* JADX INFO: loaded from: classes4.dex */
public final class qd0 extends SuspendLambda implements Function2 {
    public Object a;
    public int b;
    public final /* synthetic */ String c;
    public final /* synthetic */ String d;
    public final /* synthetic */ uf0 e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public qd0(uf0 uf0Var, String str, String str2, Continuation continuation) {
        super(2, continuation);
        this.c = str;
        this.d = str2;
        this.e = uf0Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new qd0(this.e, this.c, this.d, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((qd0) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object objM8825constructorimpl;
        String str = this.d;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.b;
        try {
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                Map<String, String> mapMapOf = MapsKt.mapOf(TuplesKt.to("Username", this.c), TuplesKt.to("Password", str), TuplesKt.to("Pw", str));
                EmbyApiService apiService = RetrofitClient.INSTANCE.getApiService();
                this.a = null;
                this.b = 1;
                obj = apiService.authenticateUser(mapMapOf, this);
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
            Response response = (Response) obj;
            if (!response.isSuccessful() || response.body() == null) {
                Log.e("EmbyRepository", "登录失败: " + response.code() + " " + response.message());
                Result.Companion companion = Result.INSTANCE;
                objM8825constructorimpl = Result.m8825constructorimpl(ResultKt.createFailure(new Exception("登录失败: " + response.code() + " " + response.message())));
            } else {
                Log.d("EmbyRepository", "✅ 登录成功");
                Result.Companion companion2 = Result.INSTANCE;
                Object objBody = response.body();
                objBody.getClass();
                objM8825constructorimpl = Result.m8825constructorimpl(objBody);
            }
        } catch (Exception e) {
            Log.e("EmbyRepository", "登录异常", e);
            Result.Companion companion3 = Result.INSTANCE;
            objM8825constructorimpl = Result.m8825constructorimpl(ResultKt.createFailure(new Exception(kb0.x("网络错误: ", e.getMessage()))));
        }
        return Result.m8824boximpl(objM8825constructorimpl);
    }
}
