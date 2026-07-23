package defpackage;

import android.os.SystemClock;
import android.util.Log;

import com.dh.myembyapp.data.ProxyConfig;
import com.dh.myembyapp.data.api.RetrofitClient;
import com.dh.myembyapp.data.model.ServerConfig;
import com.dh.myembyapp.data.model.ServerPingState;
import java.net.InetSocketAddress;
import java.net.Proxy;
import java.security.KeyManagementException;
import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;
import java.util.concurrent.CancellationException;
import java.util.concurrent.TimeUnit;
import javax.net.ssl.SSLContext;
import javax.net.ssl.SSLSocketFactory;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.io.CloseableKt;
import kotlin.jvm.functions.Function2;
import kotlin.text.StringsKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.DisposableHandle;
import kotlinx.coroutines.JobKt;
import okhttp3.Call;
import okhttp3.HttpUrl;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;

/* JADX INFO: loaded from: classes4.dex */
public final class jy1 extends SuspendLambda implements Function2 {
    public /* synthetic */ Object a;
    public final /* synthetic */ ServerConfig b;
    public final /* synthetic */ ky1 c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public jy1(ServerConfig serverConfig, ky1 ky1Var, Continuation continuation) {
        super(2, continuation);
        this.b = serverConfig;
        this.c = ky1Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        jy1 jy1Var = new jy1(this.b, this.c, continuation);
        jy1Var.a = obj;
        return jy1Var;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((jy1) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code duplicated, block: B:35:0x0113  */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws NoSuchAlgorithmException, KeyManagementException {
        Proxy proxy;
        boolean z;
        ServerPingState unreachable;
        Proxy.Type type;
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        ResultKt.throwOnFailure(obj);
        ServerConfig effectiveServerConfig = this.b.getEffectiveServerConfig();
        HttpUrl httpUrl = HttpUrl.INSTANCE.parse(effectiveServerConfig.getFullUrl() + "emby/System/Info/Public");
        String str = "ServerPingRepository";
        if (httpUrl == null) {
            Log.w("ServerPingRepository", "[" + this.b.getAlias() + "] 构造 ping 地址失败: " + effectiveServerConfig.getFullUrl());
            return ServerPingState.INSTANCE.getUnreachable();
        }
        Request.Builder builderHeader = new Request.Builder().url(httpUrl).get().header(HttpRequestHeader.Accept, "application/json").header(HttpRequestHeader.AcceptLanguage, "zh-CN,zh;q=0.9,en-US;q=0.8,en;q=0.7").header(HttpRequestHeader.UserAgent, RetrofitClient.buildUserAgent$default(RetrofitClient.INSTANCE, null, 1, null));
        String accessToken = effectiveServerConfig.getAccessToken();
        if (accessToken != null) {
            if (StringsKt.isBlank(accessToken)) {
                accessToken = null;
            }
            if (accessToken != null) {
                builderHeader.header("X-Emby-Token", accessToken);
            }
        }
        Request requestBuild = builderHeader.build();
        CoroutineContext context = getContext();
        Proxy proxy2 = lr1.a;
        ProxyConfig proxyConfig = lr1.b;
        if (!proxyConfig.getEnabled() || StringsKt.isBlank(proxyConfig.getHost())) {
            proxy = null;
        } else {
            int i = iy1.$EnumSwitchMapping$0[proxyConfig.getProtocol().ordinal()];
            if (i == 1 || i == 2) {
                type = Proxy.Type.HTTP;
            } else {
                if (i != 3) {
                    qu.f();
                    return null;
                }
                type = Proxy.Type.SOCKS;
            }
            try {
                proxy = new Proxy(type, new InetSocketAddress(proxyConfig.getHost(), proxyConfig.getPort()));
            } catch (Exception e) {
                Log.e("ServerPingRepository", "创建 ping 代理对象失败: " + proxyConfig.getHost() + ":" + proxyConfig.getPort(), e);
                proxy = null;
            }
        }
        if (effectiveServerConfig.getDirectOnly() || !proxyConfig.getEnabled() || proxy == null) {
            z = false;
        } else {
            if (proxyConfig.getBypassLan()) {
                Proxy proxy3 = lr1.a;
                if (lr1.b(effectiveServerConfig.getHost())) {
                    z = false;
                }
            }
            z = true;
        }
        OkHttpClient.Builder builder = new OkHttpClient.Builder();
        TimeUnit timeUnit = TimeUnit.SECONDS;
        OkHttpClient.Builder builderFollowSslRedirects = builder.connectTimeout(4L, timeUnit).readTimeout(4L, timeUnit).writeTimeout(4L, timeUnit).callTimeout(6L, timeUnit).followRedirects(true).followSslRedirects(true);
        if (effectiveServerConfig.getTrustAllCerts()) {
            p3 p3Var = new p3(5);
            SSLContext sSLContext = SSLContext.getInstance("TLS");
            sSLContext.init(null, new p3[]{p3Var}, new SecureRandom());
            SSLSocketFactory socketFactory = sSLContext.getSocketFactory();
            socketFactory.getClass();
            builderFollowSslRedirects.sslSocketFactory(socketFactory, p3Var);
            builderFollowSslRedirects.hostnameVerifier(new k3(0));
        }
        if (z && proxy != null) {
            builderFollowSslRedirects.proxySelector(new n3(proxyConfig, proxy, effectiveServerConfig, 2));
            if (proxyConfig.getHasCredentials()) {
                String username = proxyConfig.getUsername();
                String password = proxyConfig.getPassword();
                username.getClass();
                password.getClass();
                builderFollowSslRedirects.proxyAuthenticator(new g40(str, username, password));
            }
            if (proxy.type() == Proxy.Type.SOCKS) {
                builderFollowSslRedirects.dns(new o3(proxyConfig, 2));
            }
        }
        Call callNewCall = builderFollowSslRedirects.build().newCall(requestBuild);
        DisposableHandle disposableHandleInvokeOnCompletion = JobKt.getJob(context).invokeOnCompletion(new kh1(callNewCall, 23));
        try {
            try {
                long jElapsedRealtime = SystemClock.elapsedRealtime();
                Response responseExecute = callNewCall.execute();
                ServerConfig serverConfig = this.b;
                try {
                    long jElapsedRealtime2 = SystemClock.elapsedRealtime() - jElapsedRealtime;
                    Log.d("ServerPingRepository", "[" + serverConfig.getAlias() + "] ping=" + jElapsedRealtime2 + "ms code=" + responseExecute.code() + " route=" + serverConfig.getCurrentRouteDisplayName());
                    unreachable = responseExecute.getIsSuccessful() ? ServerPingState.INSTANCE.fromLatency(jElapsedRealtime2) : ServerPingState.INSTANCE.fromHttpStatusCode(responseExecute.code());
                    CloseableKt.closeFinally(responseExecute, null);
                } catch (Throwable th) {
                    try {
                        throw th;
                    } catch (Throwable th2) {
                        CloseableKt.closeFinally(responseExecute, th);
                        throw th2;
                    }
                }
            } catch (CancellationException e2) {
                throw e2;
            } catch (Exception e3) {
                JobKt.ensureActive(context);
                Log.w("ServerPingRepository", "[" + this.b.getAlias() + "] ping 失败: " + e3.getClass().getSimpleName() + ": " + e3.getMessage(), e3);
                unreachable = ServerPingState.INSTANCE.getUnreachable();
            }
            disposableHandleInvokeOnCompletion.dispose();
            return unreachable;
        } catch (Throwable th3) {
            disposableHandleInvokeOnCompletion.dispose();
            throw th3;
        }
    }
}
