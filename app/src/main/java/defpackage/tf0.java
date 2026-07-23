package defpackage;

import com.dh.myembyapp.data.api.EmbyApiService;
import com.dh.myembyapp.data.api.RetrofitClient;
import com.dh.myembyapp.data.api.UserDataRequest;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import retrofit2.Response;

/* JADX INFO: loaded from: classes4.dex */
public final class tf0 extends SuspendLambda implements Function2 {
    public int a;
    public final /* synthetic */ uf0 b;
    public final /* synthetic */ String c;
    public final /* synthetic */ String d;
    public final /* synthetic */ UserDataRequest e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public tf0(uf0 uf0Var, String str, String str2, UserDataRequest userDataRequest, Continuation continuation) {
        super(2, continuation);
        this.b = uf0Var;
        this.c = str;
        this.d = str2;
        this.e = userDataRequest;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new tf0(this.b, this.c, this.d, this.e, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((tf0) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object objM8825constructorimpl;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.a;
        try {
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                EmbyApiService apiService = RetrofitClient.INSTANCE.getApiService();
                String str = this.c;
                String str2 = this.d;
                UserDataRequest userDataRequest = this.e;
                this.a = 1;
                obj = apiService.updateUserData(str, str2, userDataRequest, this);
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
            if (response.isSuccessful()) {
                Result.Companion companion = Result.INSTANCE;
                objM8825constructorimpl = Result.m8825constructorimpl(Unit.INSTANCE);
            } else {
                Result.Companion companion2 = Result.INSTANCE;
                objM8825constructorimpl = Result.m8825constructorimpl(ResultKt.createFailure(new Exception("更新播放状态失败: " + response.message())));
            }
        } catch (Exception e) {
            Result.Companion companion3 = Result.INSTANCE;
            objM8825constructorimpl = Result.m8825constructorimpl(ResultKt.createFailure(new Exception(kb0.x("网络错误: ", e.getMessage()))));
        }
        return Result.m8824boximpl(objM8825constructorimpl);
    }
}
