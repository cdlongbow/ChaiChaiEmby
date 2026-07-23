package defpackage;

import android.util.Log;
import com.dh.myembyapp.data.ProxyConfig;
import com.dh.myembyapp.data.api.RetrofitClient;
import java.net.Proxy;
import java.security.KeyManagementException;
import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;
import java.util.concurrent.TimeUnit;
import javax.net.ssl.SSLContext;
import javax.net.ssl.SSLSocketFactory;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;

/* JADX INFO: loaded from: classes4.dex */
public final class kr1 extends SuspendLambda implements Function2 {
    public final /* synthetic */ String a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public kr1(String str, Continuation continuation) {
        super(2, continuation);
        this.a = str;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new kr1(this.a, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((kr1) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws NoSuchAlgorithmException, KeyManagementException {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        ResultKt.throwOnFailure(obj);
        String str = "ProxyManager";
        Log.d("ProxyManager", "========== 开始测试代理连接 ==========");
        Log.d("ProxyManager", "测试 URL: ".concat(this.a));
        Log.d("ProxyManager", "当前代理: " + lr1.a);
        OkHttpClient.Builder builder = new OkHttpClient.Builder();
        TimeUnit timeUnit = TimeUnit.SECONDS;
        OkHttpClient.Builder builderWriteTimeout = builder.connectTimeout(10L, timeUnit).readTimeout(10L, timeUnit).writeTimeout(10L, timeUnit);
        if (RetrofitClient.INSTANCE.getTrustAllCerts()) {
            Log.d("ProxyManager", "⚠️ 代理测试应用不安全的SSL配置（信任所有证书）");
            p3 p3Var = new p3(4);
            SSLContext sSLContext = SSLContext.getInstance("TLS");
            sSLContext.init(null, new p3[]{p3Var}, new SecureRandom());
            SSLSocketFactory socketFactory = sSLContext.getSocketFactory();
            socketFactory.getClass();
            builderWriteTimeout.sslSocketFactory(socketFactory, p3Var);
            builderWriteTimeout.hostnameVerifier(new k3(0));
        }
        Proxy proxy = lr1.a;
        if (proxy != null) {
            Log.d("ProxyManager", "使用代理: " + proxy);
            builderWriteTimeout.proxy(proxy);
            if (lr1.b.getHasCredentials()) {
                Log.d("ProxyManager", "应用代理认证凭据");
                ProxyConfig proxyConfig = lr1.b;
                proxyConfig.getClass();
                if (proxyConfig.getHasCredentials()) {
                    String username = proxyConfig.getUsername();
                    String password = proxyConfig.getPassword();
                    username.getClass();
                    password.getClass();
                    builderWriteTimeout.proxyAuthenticator(new g40(str, username, password));
                }
            }
        } else {
            Boxing.boxInt(Log.d("ProxyManager", "未使用代理（直连）"));
        }
        OkHttpClient okHttpClientBuild = builderWriteTimeout.build();
        Request requestBuild = new Request.Builder().url(this.a).build();
        try {
            long jCurrentTimeMillis = System.currentTimeMillis();
            Log.d("ProxyManager", "发起请求...");
            Response responseExecute = okHttpClientBuild.newCall(requestBuild).execute();
            long jCurrentTimeMillis2 = System.currentTimeMillis() - jCurrentTimeMillis;
            Log.d("ProxyManager", "✅ 请求成功");
            Log.d("ProxyManager", "状态码: " + responseExecute.code());
            Log.d("ProxyManager", "耗时: " + jCurrentTimeMillis2 + "ms");
            Log.d("ProxyManager", "响应头: " + responseExecute.headers());
            Log.d("ProxyManager", "========== 测试完成 ==========");
            responseExecute.close();
            return new e62(true, responseExecute.code(), jCurrentTimeMillis2, "连接成功 (" + responseExecute.code() + ")");
        } catch (Exception e) {
            long jCurrentTimeMillis3 = System.currentTimeMillis() - System.currentTimeMillis();
            kb0.G("❌ 请求失败: ", e.getMessage(), "ProxyManager", e);
            Log.d("ProxyManager", "========== 测试完成 ==========");
            return new e62(false, -1, jCurrentTimeMillis3, kb0.x("连接失败: ", e.getMessage()));
        }
    }
}
