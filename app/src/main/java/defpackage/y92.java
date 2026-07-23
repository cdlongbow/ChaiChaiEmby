package defpackage;

import android.util.Log;
import com.dh.myembyapp.data.api.TraktApiService;
import com.dh.myembyapp.data.model.TraktDeviceCodeRequest;
import com.dh.myembyapp.data.model.TraktDeviceCodeResponse;
import java.util.concurrent.CancellationException;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;

import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.text.StringsKt;
import kotlinx.coroutines.CoroutineScope;
import retrofit2.Response;

/* JADX INFO: loaded from: classes4.dex */
public final class y92 extends SuspendLambda implements Function2 {
    public Object a;
    public int b;
    public final /* synthetic */ i92 c;
    public final /* synthetic */ xa2 d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y92(i92 i92Var, xa2 xa2Var, Continuation continuation) {
        super(2, continuation);
        this.c = i92Var;
        this.d = xa2Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new y92(this.c, this.d, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((y92) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object objM8825constructorimpl;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.b;
        try {
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                i92 i92VarE = this.c.e();
                if (StringsKt.isBlank("1c6390b346287cb8aad251da052645aa6e57f4e2dd67ae9d9ee9c7217cc513e6")) {
                    Log.w("TraktSync", "event=device_code result=skip reason=missing_client_id");
                    Result.Companion companion = Result.INSTANCE;
                    return Result.m8824boximpl(Result.m8825constructorimpl(ResultKt.createFailure(new Exception("请先填写 Trakt Client ID"))));
                }
                TraktApiService traktApiService = this.d.c;
                TraktDeviceCodeRequest traktDeviceCodeRequest = new TraktDeviceCodeRequest("1c6390b346287cb8aad251da052645aa6e57f4e2dd67ae9d9ee9c7217cc513e6");
                this.a = null;
                this.b = 1;
                obj = traktApiService.generateDeviceCode(traktDeviceCodeRequest, this);
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
            TraktDeviceCodeResponse traktDeviceCodeResponse = (TraktDeviceCodeResponse) response.body();
            if (!response.isSuccessful() || traktDeviceCodeResponse == null) {
                Log.e("TraktSync", "event=device_code result=http_error code=" + response.code() + " message=" + response.message());
                Result.Companion companion2 = Result.INSTANCE;
                objM8825constructorimpl = Result.m8825constructorimpl(ResultKt.createFailure(new Exception("生成授权码失败: " + response.code() + " " + response.message())));
            } else {
                Log.d("TraktSync", "event=device_code result=success code=" + response.code() + " expiresIn=" + traktDeviceCodeResponse.getExpiresIn() + " interval=" + traktDeviceCodeResponse.getInterval());
                objM8825constructorimpl = Result.m8825constructorimpl(traktDeviceCodeResponse);
            }
        } catch (CancellationException e) {
            throw e;
        } catch (Exception e2) {
            kb0.G("event=device_code result=exception message=", e2.getMessage(), "TraktSync", e2);
            Result.Companion companion3 = Result.INSTANCE;
            objM8825constructorimpl = Result.m8825constructorimpl(ResultKt.createFailure(new Exception(kb0.x("生成授权码失败: ", e2.getMessage()))));
        }
        return Result.m8824boximpl(objM8825constructorimpl);
    }
}
