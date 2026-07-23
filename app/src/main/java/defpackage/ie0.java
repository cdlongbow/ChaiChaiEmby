package defpackage;

import com.dh.myembyapp.data.api.EmbyApiService;
import com.dh.myembyapp.data.api.RetrofitClient;
import com.dh.myembyapp.data.model.QueryResult;
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
public final class ie0 extends SuspendLambda implements Function2 {
    public int a;
    public final /* synthetic */ uf0 b;
    public final /* synthetic */ String c;
    public final /* synthetic */ String d;
    public final /* synthetic */ String e;
    public final /* synthetic */ String g;
    public final /* synthetic */ String h;
    public final /* synthetic */ String i;
    public final /* synthetic */ String j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ie0(uf0 uf0Var, String str, String str2, String str3, String str4, String str5, String str6, String str7, Continuation continuation) {
        super(2, continuation);
        this.b = uf0Var;
        this.c = str;
        this.d = str2;
        this.e = str3;
        this.g = str4;
        this.h = str5;
        this.i = str6;
        this.j = str7;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new ie0(this.b, this.c, this.d, this.e, this.g, this.h, this.i, this.j, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((ie0) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object objM8825constructorimpl;
        String str;
        Object objH;
        uf0 uf0Var = this.b;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.a;
        try {
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                EmbyApiService apiService = RetrofitClient.INSTANCE.getApiService();
                String str2 = this.c;
                String str3 = this.d;
                String str4 = this.e;
                String str5 = this.g;
                String str6 = this.h;
                String str7 = this.i;
                String str8 = this.j;
                this.a = 1;
                str = "获取媒体项失败: ";
                objH = kb0.h(apiService, str2, str3, str4, str5, str6, false, str7, str8, null, null, null, this, 1792, null);
                if (objH == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 1) {
                    rd1.o("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                ResultKt.throwOnFailure(obj);
                str = "获取媒体项失败: ";
                objH = obj;
            }
            Response response = (Response) objH;
            if (!response.isSuccessful() || response.body() == null) {
                Result.Companion companion = Result.INSTANCE;
                objM8825constructorimpl = Result.m8825constructorimpl(ResultKt.createFailure(new Exception(str + response.message())));
            } else {
                Result.Companion companion2 = Result.INSTANCE;
                Object objBody = response.body();
                objBody.getClass();
                objM8825constructorimpl = Result.m8825constructorimpl(uf0.b(uf0Var, (QueryResult) objBody, "排序获取媒体项"));
            }
        } catch (Exception e) {
            Result.Companion companion3 = Result.INSTANCE;
            objM8825constructorimpl = Result.m8825constructorimpl(ResultKt.createFailure(new Exception(kb0.x("网络错误: ", e.getMessage()))));
        }
        return Result.m8824boximpl(objM8825constructorimpl);
    }
}
