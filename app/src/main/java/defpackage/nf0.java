package defpackage;

import android.util.Log;


import com.dh.myembyapp.data.api.RetrofitClient;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.SetsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.io.CloseableKt;
import kotlin.jvm.functions.Function2;
import kotlin.text.StringsKt;
import kotlinx.coroutines.CoroutineScope;
import okhttp3.HttpUrl;
import okhttp3.Request;
import okhttp3.Response;
import okhttp3.internal.http.HttpStatusCodesKt;

/* JADX INFO: loaded from: classes4.dex */
public final class nf0 extends SuspendLambda implements Function2 {
    public final /* synthetic */ String a;
    public final /* synthetic */ String b;
    public final /* synthetic */ Integer c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public nf0(String str, String str2, Integer num, Continuation continuation) {
        super(2, continuation);
        this.a = str;
        this.b = str2;
        this.c = num;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new nf0(this.a, this.b, this.c, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((nf0) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object objM8825constructorimpl;
        String url;
        String str = this.b;
        String str2 = this.a;
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        ResultKt.throwOnFailure(obj);
        try {
            RetrofitClient retrofitClient = RetrofitClient.INSTANCE;
            String imageUrl = retrofitClient.getImageUrl(str2, "Logo", str, this.c);
            Response responseExecute = retrofitClient.getOkHttpClientForExoPlayer().newBuilder().followRedirects(false).followSslRedirects(false).build().newCall(new Request.Builder().url(imageUrl).get().build()).execute();
            try {
                if (responseExecute.getIsSuccessful()) {
                    if (str == null) {
                        str = "";
                    }
                    Log.d("EmbyRepository", "详情页 Logo 解析成功(直链): itemId=" + str2 + ", tag=" + str + ", url=" + imageUrl);
                    objM8825constructorimpl = imageUrl;
                } else if (SetsKt.setOf((Object[]) new Integer[]{Boxing.boxInt(HttpStatus.SC_MOVED_PERMANENTLY), Boxing.boxInt(HttpStatus.SC_MOVED_TEMPORARILY), Boxing.boxInt(HttpStatus.SC_SEE_OTHER), Boxing.boxInt(307), Boxing.boxInt(HttpStatusCodesKt.HTTP_PERM_REDIRECT)}).contains(Boxing.boxInt(responseExecute.code()))) {
                    String strHeader$default = Response.header$default(responseExecute, HttpResponseHeader.Location, null, 2, null);
                    if (strHeader$default == null || StringsKt.isBlank(strHeader$default)) {
                        Log.e("EmbyRepository", "解析 Logo 重定向失败: 缺少 Location, url=" + imageUrl);
                        
                        objM8825constructorimpl = ResultKt.createFailure(new Exception("Logo 重定向缺少 Location"));
                    } else {
                        HttpUrl httpUrlResolve = responseExecute.request().url().resolve(strHeader$default);
                        if (httpUrlResolve != null && (url = httpUrlResolve.getUrl()) != null) {
                            strHeader$default = url;
                        }
                        if (str == null) {
                            str = "";
                        }
                        Log.d("EmbyRepository", "详情页 Logo 解析成功(重定向): itemId=" + str2 + ", tag=" + str + ", requestUrl=" + imageUrl + ", resolvedUrl=" + strHeader$default);
                        objM8825constructorimpl = strHeader$default;
                    }
                } else {
                    Log.e("EmbyRepository", "解析 Logo 地址失败: HTTP " + responseExecute.code() + ", url=" + imageUrl);
                    
                    objM8825constructorimpl = ResultKt.createFailure(new Exception("解析 Logo 地址失败: HTTP " + responseExecute.code()));
                }
                CloseableKt.closeFinally(responseExecute, null);
            } catch (Throwable th) {
                try {
                    throw th;
                } catch (Throwable th2) {
                    CloseableKt.closeFinally(responseExecute, th);
                    throw th2;
                }
            }
        } catch (Exception e) {
            Log.e("EmbyRepository", "解析 Logo 地址异常", e);
            
            objM8825constructorimpl = ResultKt.createFailure(new Exception(kb0.x("解析 Logo 地址异常: ", e.getMessage())));
        }
        return Result.m8824boximpl(objM8825constructorimpl);
    }
}
