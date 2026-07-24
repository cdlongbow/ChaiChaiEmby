package defpackage;

import android.util.Log;
import com.dh.myembyapp.data.api.EmbyApiService;
import com.dh.myembyapp.data.api.RetrofitClient;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import retrofit2.Response;

/* JADX INFO: loaded from: classes4.dex */
public final class sd0 extends SuspendLambda implements Function2 {
    public int a;
    public final /* synthetic */ uf0 b;
    public final /* synthetic */ String c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public sd0(uf0 uf0Var, String str, Continuation continuation) {
        super(2, continuation);
        this.b = uf0Var;
        this.c = str;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new sd0(this.b, this.c, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((sd0) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code duplicated, block: B:26:0x0059  */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object objM8825constructorimpl;
        JsonObject asJsonObject;
        JsonElement jsonElement;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.a;
        boolean asBoolean = true;
        try {
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                EmbyApiService apiService = RetrofitClient.INSTANCE.getApiService();
                String str = this.c;
                this.a = 1;
                obj = apiService.getUser(str, this);
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
            JsonObject jsonObject = (JsonObject) response.body();
            if (!response.isSuccessful() || jsonObject == null) {
                Log.w("EmbyRepository", "获取用户转码权限失败: " + response.code() + " " + response.message());
                
                objM8825constructorimpl = ResultKt.createFailure(new Exception("获取用户转码权限失败: " + response.message()));
            } else {
                JsonElement jsonElement2 = jsonObject.get("Policy");
                if (jsonElement2 == null) {
                    asJsonObject = null;
                } else {
                    if (!jsonElement2.isJsonObject()) {
                        jsonElement2 = null;
                    }
                    if (jsonElement2 != null) {
                        asJsonObject = jsonElement2.getAsJsonObject();
                    } else {
                        asJsonObject = null;
                    }
                }
                if (asJsonObject != null && (jsonElement = asJsonObject.get("EnableVideoPlaybackTranscoding")) != null) {
                    JsonElement jsonElement3 = jsonElement.isJsonPrimitive() ? jsonElement : null;
                    if (jsonElement3 != null) {
                        asBoolean = jsonElement3.getAsBoolean();
                    }
                }
                
                objM8825constructorimpl = Boxing.boxBoolean(asBoolean);
            }
        } catch (Exception e) {
            Log.e("EmbyRepository", "获取用户转码权限异常", e);
            
            objM8825constructorimpl = ResultKt.createFailure(new Exception(kb0.x("网络错误: ", e.getMessage())));
        }
        return Result.m8824boximpl(objM8825constructorimpl);
    }
}
