package defpackage;

import android.util.Log;
import com.dh.myembyapp.data.api.RetrofitClient;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.text.StringsKt;
import kotlin.text.StringsKt;
import kotlinx.coroutines.CoroutineScope;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;
import okhttp3.ResponseBody;

/* JADX INFO: loaded from: classes4.dex */
public final class we0 extends SuspendLambda implements Function2 {
    public final /* synthetic */ String a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public we0(String str, Continuation continuation) {
        super(2, continuation);
        this.a = str;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new we0(this.a, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((we0) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object objM8825constructorimpl;
        String string;
        String strString;
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        ResultKt.throwOnFailure(obj);
        try {
            RetrofitClient retrofitClient = RetrofitClient.INSTANCE;
            OkHttpClient okHttpClientForExoPlayer = retrofitClient.getOkHttpClientForExoPlayer();
            String str = retrofitClient.getBaseUrl() + "emby/Items/" + this.a + "/Download?api_key=" + retrofitClient.getAccessToken();
            Log.d("EmbyRepository", "获取STRM文件内容: ".concat(str));
            Response responseExecute = okHttpClientForExoPlayer.newCall(new Request.Builder().url(str).build()).execute();
            if (responseExecute.getIsSuccessful()) {
                ResponseBody responseBodyBody = responseExecute.body();
                if (responseBodyBody == null || (strString = responseBodyBody.string()) == null || (string = StringsKt.trim((CharSequence) strString).toString()) == null) {
                    string = "";
                }
                responseExecute.close();
                if (string.length() == 0) {
                    Log.e("EmbyRepository", "STRM文件内容为空");
                    Result.Companion companion = Result.INSTANCE;
                    return Result.m8824boximpl(Result.m8825constructorimpl(ResultKt.createFailure(new Exception("STRM文件内容为空"))));
                }
                if (!StringsKt__StringsJVMKt.startsWith$default(string, "http://", false, 2, null) && !StringsKt__StringsJVMKt.startsWith$default(string, "https://", false, 2, null)) {
                    Log.e("EmbyRepository", "STRM文件内容不是有效的URL: ".concat(string));
                    Result.Companion companion2 = Result.INSTANCE;
                    return Result.m8824boximpl(Result.m8825constructorimpl(ResultKt.createFailure(new Exception("STRM文件内容不是有效的URL"))));
                }
                Log.d("EmbyRepository", "✅ 获取STRM直链成功: ".concat(string));
                objM8825constructorimpl = Result.m8825constructorimpl(string);
            } else {
                Log.e("EmbyRepository", "获取STRM文件失败: HTTP " + responseExecute.code());
                responseExecute.close();
                Result.Companion companion3 = Result.INSTANCE;
                objM8825constructorimpl = Result.m8825constructorimpl(ResultKt.createFailure(new Exception("获取STRM文件失败: HTTP " + responseExecute.code())));
            }
        } catch (Exception e) {
            Log.e("EmbyRepository", "获取STRM文件异常", e);
            Result.Companion companion4 = Result.INSTANCE;
            objM8825constructorimpl = Result.m8825constructorimpl(ResultKt.createFailure(new Exception(kb0.x("获取STRM文件异常: ", e.getMessage()))));
        }
        return Result.m8824boximpl(objM8825constructorimpl);
    }
}
