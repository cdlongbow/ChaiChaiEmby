package com.dh.myembyapp.data.api;

import android.util.Log;
import com.dh.myembyapp.data.ProxyConfig;
import com.dh.myembyapp.data.api.DanmakuApiClient;
import defpackage.c61;
import defpackage.g40;
import defpackage.iw;
import defpackage.k3;
import defpackage.kb0;
import defpackage.ll0;
import defpackage.lr1;
import defpackage.qu;
import defpackage.rd1;
import java.net.InetAddress;
import java.net.Proxy;
import java.net.URI;
import java.security.KeyManagementException;
import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import javax.net.ssl.SSLContext;
import javax.net.ssl.SSLSession;
import javax.net.ssl.SSLSocketFactory;
import javax.net.ssl.X509TrustManager;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.Ref;
import kotlin.text.StringsKt;
import okhttp3.Dns;
import okhttp3.Interceptor;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;
import okhttp3.logging.HttpLoggingInterceptor;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010%\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0010\b\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\r\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000e\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u0006J:\u0010\u0013\u001a\u00020\u00112\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00060\n2\u000e\b\u0002\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00060\n2\u0014\b\u0002\u0010\u0016\u001a\u000e\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u000f0\rJ\u0018\u0010\u0017\u001a\u00020\u00072\u0006\u0010\u0012\u001a\u00020\u00062\u0006\u0010\u0018\u001a\u00020\u000fH\u0002J\u0006\u0010\u0019\u001a\u00020\u0007J\u000e\u0010\u001a\u001a\u00020\u00072\u0006\u0010\u0012\u001a\u00020\u0006J\f\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u00060\nJ\u000e\u0010\u001c\u001a\u00020\u00062\u0006\u0010\u0012\u001a\u00020\u0006J\u0006\u0010\u001d\u001a\u00020\u000fR\u001a\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\b\u001a\u0004\u0018\u00010\u0006X\u0082\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00060\nX\u0082\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00060\nX\u0082\u000e¢\u0006\u0002\n\u0000R\u001a\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u000f0\rX\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u001e"}, d2 = {"Lcom/dh/myembyapp/data/api/DanmakuApiClient;", "", "<init>", "()V", "apiServices", "", "", "Lcom/dh/myembyapp/data/api/DanmakuApiService;", "currentApiUrl", "apiUrls", "", "apiNames", "apiUrlsUseProxy", "", "", "", "initialize", "", "apiUrl", "initializeMultiple", "urls", "names", "useProxyMap", "createServiceForUrl", "useProxy", "getService", "getServiceForUrl", "getApiUrls", "getApiDisplayName", "isInitialized", "app"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class DanmakuApiClient {
    private static String currentApiUrl;
    public static final DanmakuApiClient INSTANCE = new DanmakuApiClient();
    private static final Map<String, DanmakuApiService> apiServices = new LinkedHashMap();
    private static List<String> apiUrls = CollectionsKt.emptyList();
    private static List<String> apiNames = CollectionsKt.emptyList();
    private static Map<Integer, Boolean> apiUrlsUseProxy = MapsKt.emptyMap();
    public static final int $stable = 8;

    private DanmakuApiClient() {
    }

    private final DanmakuApiService createServiceForUrl(String apiUrl, boolean useProxy) throws NoSuchAlgorithmException, KeyManagementException {
        Proxy proxy;
        String str = apiUrl + "|" + useProxy;
        Map<String, DanmakuApiService> map = apiServices;
        DanmakuApiService danmakuApiService = map.get(str);
        if (danmakuApiService == null) {
            if (!StringsKt__StringsJVMKt.endsWith$default(apiUrl, "/", false, 2, null)) {
                apiUrl = c61.n(apiUrl, "/");
            }
            final Ref.BooleanRef booleanRef = new Ref.BooleanRef();
            int i = 0;
            if (useProxy) {
                Proxy proxy2 = lr1.a;
                booleanRef.element = lr1.b.getEnabled() && lr1.a != null;
            }
            Interceptor interceptor = new Interceptor() { // from class: hw
                @Override // okhttp3.Interceptor
                public final Response intercept(Interceptor.Chain chain) {
                    return DanmakuApiClient.createServiceForUrl$lambda$0$0(booleanRef, chain);
                }
            };
            HttpLoggingInterceptor httpLoggingInterceptor = new HttpLoggingInterceptor(new qu(4));
            httpLoggingInterceptor.level(HttpLoggingInterceptor.Level.NONE);
            iw iwVar = new iw(i);
            OkHttpClient.Builder builder = new OkHttpClient.Builder();
            TimeUnit timeUnit = TimeUnit.SECONDS;
            OkHttpClient.Builder builderAddInterceptor = builder.connectTimeout(15L, timeUnit).readTimeout(15L, timeUnit).writeTimeout(15L, timeUnit).addInterceptor(iwVar).addInterceptor(interceptor).addInterceptor(httpLoggingInterceptor);
            String str2 = "DanmakuAPI";
            Log.d("DanmakuAPI", "⚠️ 弹幕API应用SSL配置（信任所有证书）");
            X509TrustManager x509TrustManager = new X509TrustManager() { // from class: com.dh.myembyapp.data.api.DanmakuApiClient$createServiceForUrl$1$1$trustAllCertsManager$1
                @Override // javax.net.ssl.X509TrustManager
                public void checkClientTrusted(X509Certificate[] chain, String authType) {
                    chain.getClass();
                    authType.getClass();
                }

                @Override // javax.net.ssl.X509TrustManager
                public void checkServerTrusted(X509Certificate[] chain, String authType) {
                    chain.getClass();
                    authType.getClass();
                }

                @Override // javax.net.ssl.X509TrustManager
                public X509Certificate[] getAcceptedIssuers() {
                    return new X509Certificate[0];
                }
            };
            SSLContext sSLContext = SSLContext.getInstance("TLS");
            sSLContext.init(null, new DanmakuApiClient$createServiceForUrl$1$1$trustAllCertsManager$1[]{x509TrustManager}, new SecureRandom());
            SSLSocketFactory socketFactory = sSLContext.getSocketFactory();
            socketFactory.getClass();
            builderAddInterceptor.sslSocketFactory(socketFactory, x509TrustManager);
            builderAddInterceptor.hostnameVerifier(new k3(2));
            if (useProxy) {
                Proxy proxy3 = lr1.a;
                ProxyConfig proxyConfig = lr1.b;
                if (proxyConfig.getEnabled() && (proxy = lr1.a) != null) {
                    builderAddInterceptor.proxy(proxy);
                    if (proxyConfig.getHasCredentials()) {
                        String username = proxyConfig.getUsername();
                        String password = proxyConfig.getPassword();
                        username.getClass();
                        password.getClass();
                        builderAddInterceptor.proxyAuthenticator(new g40(str2, username, password));
                    }
                    if (proxy.type() == Proxy.Type.SOCKS) {
                        builderAddInterceptor.dns(new Dns() { // from class: com.dh.myembyapp.data.api.DanmakuApiClient$createServiceForUrl$1$2
                            @Override // okhttp3.Dns
                            public List<InetAddress> lookup(String hostname) {
                                hostname.getClass();
                                Proxy proxy4 = lr1.a;
                                return (lr1.b.getBypassLan() && lr1.b(hostname)) ? Dns.SYSTEM.lookup(hostname) : CollectionsKt.listOf(InetAddress.getByAddress(hostname, new byte[]{0, 0, 0, 0}));
                            }
                        });
                    }
                }
            }
            Object objCreate = new Retrofit.Builder().baseUrl(apiUrl).client(builderAddInterceptor.build()).addConverterFactory(GsonConverterFactory.create()).build().create(DanmakuApiService.class);
            objCreate.getClass();
            danmakuApiService = (DanmakuApiService) objCreate;
            map.put(str, danmakuApiService);
        }
        return danmakuApiService;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Response createServiceForUrl$lambda$0$0(Ref.BooleanRef booleanRef, Interceptor.Chain chain) throws Exception {
        chain.getClass();
        Request request = chain.request();
        String string = request.url().getUrl();
        if (booleanRef.element) {
            Proxy proxy = lr1.a;
            ProxyConfig proxyConfig = lr1.b;
            String host = proxyConfig.getHost();
            int port = proxyConfig.getPort();
            StringBuilder sbZ = kb0.z("🌐 [代理] ", string, " -> ", host, ":");
            sbZ.append(port);
            Log.d("DanmakuAPI", sbZ.toString());
        } else {
            ll0.l("🔓 [直连] ", string, "DanmakuAPI");
        }
        long jCurrentTimeMillis = System.currentTimeMillis();
        try {
            Response responseProceed = chain.proceed(request);
            long jCurrentTimeMillis2 = System.currentTimeMillis() - jCurrentTimeMillis;
            Log.d("DanmakuAPI", "   ✅ " + responseProceed.code() + " (" + jCurrentTimeMillis2 + "ms)");
            return responseProceed;
        } catch (Exception e) {
            long jCurrentTimeMillis3 = System.currentTimeMillis() - jCurrentTimeMillis;
            Log.e("DanmakuAPI", "   ❌ " + e.getMessage() + " (" + jCurrentTimeMillis3 + "ms)");
            throw e;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void createServiceForUrl$lambda$0$1(String str) {
        str.getClass();
        Log.d("DanmakuAPI-Detail", str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Response createServiceForUrl$lambda$0$3(Interceptor.Chain chain) {
        chain.getClass();
        return chain.proceed(DandanplayAuthConfig.INSTANCE.addAuthHeadersIfNeeded(chain.request()));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean createServiceForUrl$lambda$0$4$0(String str, SSLSession sSLSession) {
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void initializeMultiple$default(DanmakuApiClient danmakuApiClient, List list, List list2, Map map, int i, Object obj) throws NoSuchAlgorithmException, KeyManagementException {
        if ((i & 2) != 0) {
            list2 = CollectionsKt.emptyList();
        }
        if ((i & 4) != 0) {
            map = MapsKt.emptyMap();
        }
        danmakuApiClient.initializeMultiple(list, list2, map);
    }

    public final String getApiDisplayName(String apiUrl) {
        Object objM8825constructorimpl;
        apiUrl.getClass();
        int iIndexOf = apiUrls.indexOf(apiUrl);
        if (iIndexOf >= 0) {
            String str = (String) CollectionsKt.getOrNull(apiNames, iIndexOf);
            String string = str != null ? StringsKt.trim((CharSequence) str).toString() : null;
            if (string == null) {
                string = "";
            }
            if (!StringsKt.isBlank(string)) {
                return string;
            }
        }
        try {
            Result.Companion companion = Result.INSTANCE;
            objM8825constructorimpl = Result.m8825constructorimpl(new URI(apiUrl).getHost());
        } catch (Throwable th) {
            Result.Companion companion2 = Result.INSTANCE;
            objM8825constructorimpl = Result.m8825constructorimpl(ResultKt.createFailure(th));
        }
        if (Result.m8831isFailureimpl(objM8825constructorimpl)) {
            objM8825constructorimpl = null;
        }
        String str2 = (String) objM8825constructorimpl;
        if (str2 == null) {
            return apiUrl;
        }
        String str3 = StringsKt.isBlank(str2) ? null : str2;
        return str3 != null ? str3 : apiUrl;
    }

    public final List<String> getApiUrls() {
        List<String> list = apiUrls;
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            if (!StringsKt.isBlank((String) obj)) {
                arrayList.add(obj);
            }
        }
        return arrayList;
    }

    public final DanmakuApiService getService() {
        String str = currentApiUrl;
        if (str == null) {
            rd1.o("DanmakuApiClient未初始化，请先调用initialize()");
            return null;
        }
        DanmakuApiService danmakuApiService = apiServices.get(str);
        if (danmakuApiService != null) {
            return danmakuApiService;
        }
        rd1.o("API服务未找到: ".concat(str));
        return null;
    }

    public final DanmakuApiService getServiceForUrl(String apiUrl) {
        Boolean bool;
        apiUrl.getClass();
        int iIndexOf = apiUrls.indexOf(apiUrl);
        boolean zBooleanValue = false;
        if (iIndexOf >= 0 && (bool = apiUrlsUseProxy.get(Integer.valueOf(iIndexOf))) != null) {
            zBooleanValue = bool.booleanValue();
        }
        DanmakuApiService danmakuApiService = apiServices.get(apiUrl + "|" + zBooleanValue);
        return danmakuApiService == null ? createServiceForUrl(apiUrl, zBooleanValue) : danmakuApiService;
    }

    public final void initialize(String apiUrl) throws NoSuchAlgorithmException, KeyManagementException {
        apiUrl.getClass();
        initializeMultiple$default(this, CollectionsKt.listOf(apiUrl), null, null, 6, null);
    }

    public final void initializeMultiple(List<String> urls, List<String> names, Map<Integer, Boolean> useProxyMap) throws NoSuchAlgorithmException, KeyManagementException {
        Object next;
        urls.getClass();
        names.getClass();
        useProxyMap.getClass();
        apiUrls = urls;
        apiNames = names;
        apiUrlsUseProxy = useProxyMap;
        apiServices.clear();
        int i = 0;
        int i2 = 0;
        for (Object obj : apiUrls) {
            int i3 = i2 + 1;
            if (i2 < 0) {
                CollectionsKt.throwIndexOverflow();
            }
            String str = (String) obj;
            if (!StringsKt.isBlank(str)) {
                Boolean bool = useProxyMap.get(Integer.valueOf(i2));
                INSTANCE.createServiceForUrl(str, bool != null ? bool.booleanValue() : false);
            }
            i2 = i3;
        }
        Iterator<T> it = apiUrls.iterator();
        do {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
        } while (StringsKt.isBlank((String) next));
        currentApiUrl = (String) next;
        List<String> list = apiUrls;
        if (list == null || !list.isEmpty()) {
            Iterator<T> it2 = list.iterator();
            while (it2.hasNext()) {
                if (!StringsKt.isBlank((String) it2.next()) && (i = i + 1) < 0) {
                    CollectionsKt.throwCountOverflow();
                }
            }
        }
        Log.d("DanmakuAPI", "弹幕API初始化完成，共" + i + "个");
    }

    public final boolean isInitialized() {
        return !apiUrls.isEmpty();
    }
}
