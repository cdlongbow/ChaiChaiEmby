package defpackage;

import android.util.Log;
import com.dh.myembyapp.data.api.RetrofitClient;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import okhttp3.Request;
import okhttp3.Response;
import okhttp3.ResponseBody;

/* JADX INFO: loaded from: classes4.dex */
public final class a32 extends SuspendLambda implements Function2 {
    public final /* synthetic */ String a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a32(String str, Continuation continuation) {
        super(2, continuation);
        this.a = str;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new a32(this.a, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((a32) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        String strString;
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        ResultKt.throwOnFailure(obj);
        try {
            Response responseExecute = RetrofitClient.INSTANCE.getOkHttpClientForExoPlayer().newCall(new Request.Builder().url(this.a).build()).execute();
            if (!responseExecute.getIsSuccessful()) {
                Log.e("SrtParser", "下载字幕失败: HTTP " + responseExecute.code());
                return CollectionsKt.emptyList();
            }
            ResponseBody responseBodyBody = responseExecute.body();
            if (responseBodyBody == null || (strString = responseBodyBody.string()) == null) {
                strString = "";
            }
            responseExecute.close();
            return tl0.K(strString);
        } catch (Exception e) {
            Log.e("SrtParser", "下载或解析 SRT 失败: " + e.getMessage(), e);
            return CollectionsKt.emptyList();
        }
    }
}
