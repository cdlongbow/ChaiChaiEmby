package defpackage;

import android.util.Log;

import com.dh.myembyapp.data.api.EmbyApiService;
import com.dh.myembyapp.data.api.RetrofitClient;
import com.dh.myembyapp.data.model.MediaItem;
import com.dh.myembyapp.data.model.QueryResult;
import java.util.ArrayList;
import java.util.List;
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
public final class wd0 extends SuspendLambda implements Function2 {
    public int a;
    public final /* synthetic */ uf0 b;
    public final /* synthetic */ String c;
    public final /* synthetic */ String d;
    public final /* synthetic */ int e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public wd0(uf0 uf0Var, String str, String str2, int i, Continuation continuation) {
        super(2, continuation);
        this.b = uf0Var;
        this.c = str;
        this.d = str2;
        this.e = i;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new wd0(this.b, this.c, this.d, this.e, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((wd0) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object objM8825constructorimpl;
        Object objC;
        uf0 uf0Var = this.b;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.a;
        try {
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                EmbyApiService apiService = RetrofitClient.INSTANCE.getApiService();
                String str = this.c;
                String str2 = this.d;
                int i2 = this.e;
                this.a = 1;
                objC = kb0.c(apiService, str, str2, null, false, null, null, null, i2, this, Input.Keys.INSERT, null);
                if (objC == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 1) {
                    rd1.o("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                ResultKt.throwOnFailure(obj);
                objC = obj;
            }
            Response response = (Response) objC;
            if (!response.isSuccessful() || response.body() == null) {
                Result.Companion companion = Result.INSTANCE;
                objM8825constructorimpl = Result.m8825constructorimpl(ResultKt.createFailure(new Exception("获取所属合集失败: " + response.message())));
            } else {
                Object objBody = response.body();
                objBody.getClass();
                List listB = uf0.b(uf0Var, (QueryResult) objBody, "所属合集");
                ArrayList arrayList = new ArrayList();
                for (Object obj2 : listB) {
                    if (StringsKt__StringsJVMKt.equals(((MediaItem) obj2).getType(), "BoxSet", true)) {
                        arrayList.add(obj2);
                    }
                }
                objM8825constructorimpl = Result.m8825constructorimpl(arrayList);
            }
        } catch (Exception e) {
            Log.e("EmbyRepository", "获取所属合集失败", e);
            Result.Companion companion2 = Result.INSTANCE;
            objM8825constructorimpl = Result.m8825constructorimpl(ResultKt.createFailure(new Exception(kb0.x("网络错误: ", e.getMessage()))));
        }
        return Result.m8824boximpl(objM8825constructorimpl);
    }
}
