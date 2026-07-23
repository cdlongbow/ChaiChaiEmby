package defpackage;

import android.util.Log;
import com.dh.myembyapp.data.ProxyConfig;
import com.dh.myembyapp.data.api.RetrofitClient;
import java.net.Proxy;
import java.security.KeyManagementException;
import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;
import java.util.List;
import java.util.concurrent.TimeUnit;
import javax.net.ssl.SSLContext;
import javax.net.ssl.SSLSocketFactory;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.MatchResult;
import kotlin.text.Regex;
import kotlinx.coroutines.CoroutineScope;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;

/* JADX INFO: loaded from: classes4.dex */
public final class ir1 extends SuspendLambda implements Function2 {
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new ir1(2, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((ir1) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws NoSuchAlgorithmException, KeyManagementException {
        String str;
        String str2;
        List<String> groupValues;
        List<String> groupValues2;
        List<String> groupValues3;
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        ResultKt.throwOnFailure(obj);
        String str3 = "ProxyManager";
        Log.d("ProxyManager", "========== 开始获取公网IP信息 ==========");
        Log.d("ProxyManager", "使用代理: " + lr1.a);
        OkHttpClient.Builder builder = new OkHttpClient.Builder();
        TimeUnit timeUnit = TimeUnit.SECONDS;
        OkHttpClient.Builder timeout = builder.connectTimeout(10L, timeUnit).readTimeout(10L, timeUnit);
        if (RetrofitClient.INSTANCE.getTrustAllCerts()) {
            Log.d("ProxyManager", "⚠️ IP查询应用不安全的SSL配置（信任所有证书）");
            p3 p3Var = new p3(3);
            SSLContext sSLContext = SSLContext.getInstance("TLS");
            sSLContext.init(null, new p3[]{p3Var}, new SecureRandom());
            SSLSocketFactory socketFactory = sSLContext.getSocketFactory();
            socketFactory.getClass();
            timeout.sslSocketFactory(socketFactory, p3Var);
            timeout.hostnameVerifier(new k3(0));
        }
        Proxy proxy = lr1.a;
        if (proxy != null) {
            timeout.proxy(proxy);
            if (lr1.b.getHasCredentials()) {
                ProxyConfig proxyConfig = lr1.b;
                proxyConfig.getClass();
                if (proxyConfig.getHasCredentials()) {
                    String username = proxyConfig.getUsername();
                    String password = proxyConfig.getPassword();
                    username.getClass();
                    password.getClass();
                    timeout.proxyAuthenticator(new g40(str3, username, password));
                }
            }
        }
        OkHttpClient okHttpClientBuild = timeout.build();
        try {
            Request requestBuild = new Request.Builder().url("http://ip-api.com/json/?fields=status,message,country,query").build();
            Log.d("ProxyManager", "发起请求到 http://ip-api.com/json/");
            Response responseExecute = okHttpClientBuild.newCall(requestBuild).execute();
            Log.d("ProxyManager", "响应状态码: " + responseExecute.code());
            String strString = responseExecute.body().string();
            Log.d("ProxyManager", "响应内容: " + strString);
            responseExecute.close();
            if (responseExecute.code() != 200) {
                Log.w("ProxyManager", "响应异常 - 状态码: " + responseExecute.code());
                Log.d("ProxyManager", "========== 获取IP信息完成 ==========");
                return new iv0("未知", "未知");
            }
            Regex regex = new Regex("\"status\"\\s*:\\s*\"([^\"]+)\"");
            Regex regex2 = new Regex("\"query\"\\s*:\\s*\"([^\"]+)\"");
            Regex regex3 = new Regex("\"country\"\\s*:\\s*\"([^\"]+)\"");
            MatchResult matchResultFind$default = Regex.find$default(regex, strString, 0, 2, null);
            String str4 = (matchResultFind$default == null || (groupValues3 = matchResultFind$default.getGroupValues()) == null) ? null : groupValues3.get(1);
            if (!Intrinsics.areEqual(str4, "success")) {
                Log.w("ProxyManager", "API返回失败状态: " + str4);
                Log.d("ProxyManager", "========== 获取IP信息完成 ==========");
                return new iv0("未知", "未知");
            }
            MatchResult matchResultFind$default2 = Regex.find$default(regex2, strString, 0, 2, null);
            if (matchResultFind$default2 == null || (groupValues2 = matchResultFind$default2.getGroupValues()) == null || (str = groupValues2.get(1)) == null) {
                str = "未知";
            }
            MatchResult matchResultFind$default3 = Regex.find$default(regex3, strString, 0, 2, null);
            if (matchResultFind$default3 == null || (groupValues = matchResultFind$default3.getGroupValues()) == null || (str2 = groupValues.get(1)) == null) {
                str2 = "未知";
            }
            if (Intrinsics.areEqual(str2, "Taiwan")) {
                str2 = "China(Taiwan)";
            }
            Log.d("ProxyManager", "解析结果 - IP: " + str + ", 国家或地区: " + str2);
            Log.d("ProxyManager", "========== 获取IP信息完成 ==========");
            return new iv0(str, str2);
        } catch (Exception e) {
            Log.e("ProxyManager", "❌ 获取IP信息失败: " + e.getMessage(), e);
            e.printStackTrace();
            Log.d("ProxyManager", "========== 获取IP信息完成 ==========");
            return new iv0("获取失败", "未知");
        }
    }
}
