package defpackage;

import android.util.Log;
import com.dh.myembyapp.data.api.RetrofitClient;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import okhttp3.Request;
import okhttp3.Response;
import okhttp3.ResponseBody;

/* JADX INFO: loaded from: classes4.dex */
public final class ae extends SuspendLambda implements Function2 {
    public final /* synthetic */ String a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ae(String str, Continuation continuation) {
        super(2, continuation);
        this.a = str;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new ae(this.a, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((ae) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        String str = this.a;
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        ResultKt.throwOnFailure(obj);
        try {
            Response responseExecute = RetrofitClient.INSTANCE.getOkHttpClientForExoPlayer().newCall(new Request.Builder().url(str).build()).execute();
            if (!responseExecute.getIsSuccessful()) {
                Log.e("AssSubtitleParser", "下载 ASS/SSA 字幕失败: HTTP " + responseExecute.code());
                responseExecute.close();
                return null;
            }
            ResponseBody responseBodyBody = responseExecute.body();
            byte[] bArrBytes = responseBodyBody != null ? responseBodyBody.bytes() : null;
            responseExecute.close();
            if (bArrBytes == null) {
                Log.e("AssSubtitleParser", "下载 ASS/SSA 字幕失败: 响应体为空");
                return null;
            }
            String strA = d52.a(bArrBytes, new vb(1));
            if (strA == null) {
                Log.e("AssSubtitleParser", "无法识别网络 ASS/SSA 字幕编码: " + str);
            }
            return strA;
        } catch (Exception e) {
            kb0.G("下载 ASS/SSA 字幕失败: ", e.getMessage(), "AssSubtitleParser", e);
            return null;
        }
    }
}
