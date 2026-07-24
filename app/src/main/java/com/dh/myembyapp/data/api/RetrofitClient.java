package com.dh.myembyapp.data.api;

import android.content.Context;
import android.util.Log;
import com.dh.myembyapp.data.ProxyConfig;
import com.dh.myembyapp.dlna.DlnaSettings;
import defpackage.c61;
import defpackage.g40;
import defpackage.i02;
import defpackage.iw;
import defpackage.k3;
import defpackage.kb0;
import defpackage.ll0;
import defpackage.lr1;
import defpackage.mr;
import defpackage.s01;
import java.io.IOException;
import java.net.InetAddress;
import java.net.Proxy;
import java.net.ProxySelector;
import java.net.SocketAddress;
import java.net.URI;
import java.net.URL;
import java.security.KeyManagementException;
import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.UUID;
import java.util.concurrent.TimeUnit;
import javax.net.ssl.SSLContext;
import javax.net.ssl.SSLSession;
import javax.net.ssl.SSLSocketFactory;
import javax.net.ssl.X509TrustManager;
import kotlin.Pair;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import okhttp3.ConnectionPool;
import okhttp3.Dns;
import okhttp3.HttpUrl;
import okhttp3.Interceptor;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;
import okhttp3.logging.HttpLoggingInterceptor;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

/* JADX INFO: loaded from: classes4.dex */
public final class RetrofitClient {
    public static final int $stable;
    private static final String CLIENT_NAME = "chaichai";
    private static final String TAG = "RetrofitClient";
    private static final long VIDEO_READ_TIMEOUT_SECONDS = 10;
    private static final Interceptor authInterceptor;
    private static Proxy currentProxy;
    private static final Interceptor embyPrefixInterceptor;
    private static final Interceptor exoPlayerAuthInterceptor;
    private static final HttpLoggingInterceptor loggingInterceptor;
    private static OkHttpClient okHttpClientInstance;
    private static Retrofit retrofitInstance;
    private static final Dns socksProxyDns;
    private static boolean trustAllCerts;
    public static final RetrofitClient INSTANCE = new RetrofitClient();
    private static String baseUrl = "http://127.0.0.1:8096/";
    private static String accessToken = "";
    private static String userId = "";
    private static String deviceId = "";
    private static String appVersion = "1.0.0";
    private static ProxyAuthKey currentProxyAuthKey = new ProxyAuthKey(false, null, null, 7, null);

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v8, types: [com.dh.myembyapp.data.api.RetrofitClient$socksProxyDns$1] */
    static {
        HttpLoggingInterceptor httpLoggingInterceptor = new HttpLoggingInterceptor(null, 1, 0 == true ? 1 : 0);
        httpLoggingInterceptor.level(HttpLoggingInterceptor.Level.NONE);
        loggingInterceptor = httpLoggingInterceptor;
        embyPrefixInterceptor = new iw(2);
        authInterceptor = new iw(3);
        exoPlayerAuthInterceptor = new iw(4);
        socksProxyDns = new Dns() { // from class: com.dh.myembyapp.data.api.RetrofitClient$socksProxyDns$1
            @Override // okhttp3.Dns
            public List<InetAddress> lookup(String hostname) {
                hostname.getClass();
                Proxy proxy = lr1.a;
                if (lr1.b.getBypassLan() && lr1.b(hostname)) {
                    Log.d("RetrofitClient", "🔓 局域网不代理 DNS: " + hostname + " 使用系统 DNS");
                    return Dns.SYSTEM.lookup(hostname);
                }
                Log.d("RetrofitClient", "SOCKS 代理模式：跳过本地 DNS 解析，主机名 " + hostname + " 将由代理服务器解析");
                return CollectionsKt.listOf(InetAddress.getByAddress(hostname, new byte[]{0, 0, 0, 0}));
            }
        };
        $stable = 8;
    }

    private RetrofitClient() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Response authInterceptor$lambda$0(Interceptor.Chain chain) {
        chain.getClass();
        Request request = chain.request();
        Request.Builder builderHeader = request.newBuilder().header(HttpRequestHeader.Accept, "application/json").header(HttpRequestHeader.AcceptLanguage, "zh-CN,zh;q=0.9,en-US;q=0.8,en;q=0.7").header(HttpRequestHeader.UserAgent, buildUserAgent$default(INSTANCE, null, 1, null));
        if (Intrinsics.areEqual(request.method(), "POST") || Intrinsics.areEqual(request.method(), Net.HttpMethods.PUT)) {
            builderHeader.header("Content-Type", "application/json");
        }
        if (accessToken.length() > 0) {
            builderHeader.header("X-Emby-Token", accessToken);
        }
        String str = accessToken;
        String str2 = deviceId;
        String str3 = appVersion;
        StringBuilder sbZ = kb0.z("MediaBrowser Token=\"", str, "\", Client=\"chaichai\", Device=\"AndroidTV\", DeviceId=\"", str2, "\", Version=\"");
        sbZ.append(str3);
        sbZ.append("\"");
        builderHeader.header("X-Emby-Authorization", sbZ.toString());
        return chain.proceed(builderHeader.build());
    }

    public static /* synthetic */ String buildUserAgent$default(RetrofitClient retrofitClient, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            str = appVersion;
        }
        return retrofitClient.buildUserAgent(str);
    }

    private final Pair<SSLSocketFactory, X509TrustManager> createUnsafeSslContext() throws NoSuchAlgorithmException, KeyManagementException {
        X509TrustManager x509TrustManager = new X509TrustManager() { // from class: com.dh.myembyapp.data.api.RetrofitClient$createUnsafeSslContext$trustAllCertsManager$1
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
        sSLContext.init(null, new RetrofitClient$createUnsafeSslContext$trustAllCertsManager$1[]{x509TrustManager}, new SecureRandom());
        return new Pair<>(sSLContext.getSocketFactory(), x509TrustManager);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Response embyPrefixInterceptor$lambda$0(Interceptor.Chain chain) {
        String strTrimEnd;
        chain.getClass();
        Request request = chain.request();
        HttpUrl httpUrlUrl = request.url();
        String strEncodedPath = httpUrlUrl.encodedPath();
        try {
            String path = new URL(baseUrl).getPath();
            path.getClass();
            strTrimEnd = StringsKt.trimEnd(path, '/');
        } catch (Exception unused) {
            strTrimEnd = "";
        }
        if (strTrimEnd.length() > 0 && StringsKt__StringsJVMKt.startsWith$default(strEncodedPath, strTrimEnd, false, 2, null)) {
            strEncodedPath = strEncodedPath.substring(strTrimEnd.length());
        }
        return (StringsKt__StringsJVMKt.startsWith$default(strEncodedPath, "/emby/", false, 2, null) || StringsKt__StringsJVMKt.startsWith$default(strEncodedPath, "/emby", false, 2, null)) ? chain.proceed(request) : chain.proceed(request.newBuilder().url(httpUrlUrl.newBuilder().encodedPath(mr.C(strTrimEnd, "/emby", strEncodedPath)).build()).build());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Response exoPlayerAuthInterceptor$lambda$0(Interceptor.Chain chain) {
        String lowerCase;
        chain.getClass();
        Request request = chain.request();
        String strHost = request.url().host();
        Locale locale = Locale.ROOT;
        String lowerCase2 = strHost.toLowerCase(locale);
        lowerCase2.getClass();
        try {
            String host = new URL(baseUrl).getHost();
            host.getClass();
            lowerCase = host.toLowerCase(locale);
            lowerCase.getClass();
        } catch (Exception unused) {
            lowerCase = "";
        }
        Request.Builder builderHeader = request.newBuilder().header(HttpRequestHeader.UserAgent, buildUserAgent$default(INSTANCE, null, 1, null));
        if (!StringsKt.isBlank(lowerCase) && Intrinsics.areEqual(lowerCase2, lowerCase)) {
            if (accessToken.length() > 0) {
                builderHeader.header("X-Emby-Token", accessToken);
            }
            String str = accessToken;
            String str2 = deviceId;
            String str3 = appVersion;
            StringBuilder sbZ = kb0.z("MediaBrowser Token=\"", str, "\", Client=\"chaichai\", Device=\"AndroidTV\", DeviceId=\"", str2, "\", Version=\"");
            sbZ.append(str3);
            sbZ.append("\"");
            builderHeader.header("X-Emby-Authorization", sbZ.toString());
        }
        return chain.proceed(builderHeader.build());
    }

    public static /* synthetic */ String getImageUrl$default(RetrofitClient retrofitClient, String str, String str2, String str3, Integer num, int i, Object obj) {
        if ((i & 2) != 0) {
            str2 = "Primary";
        }
        if ((i & 4) != 0) {
            str3 = null;
        }
        if ((i & 8) != 0) {
            num = 320;
        }
        return retrofitClient.getImageUrl(str, str2, str3, num);
    }

    private final OkHttpClient getOkHttpClient() throws NoSuchAlgorithmException, KeyManagementException {
        OkHttpClient okHttpClient = okHttpClientInstance;
        String str = TAG;
        if (okHttpClient == null) {
            Log.d(TAG, "========== 创建新的 OkHttpClient ==========");
            Log.d(TAG, "当前代理配置: " + currentProxy);
            Log.d(TAG, "信任所有SSL证书: " + trustAllCerts);
            OkHttpClient.Builder builder = new OkHttpClient.Builder();
            TimeUnit timeUnit = TimeUnit.SECONDS;
            OkHttpClient.Builder builderAddInterceptor = builder.connectTimeout(30L, timeUnit).readTimeout(30L, timeUnit).writeTimeout(30L, timeUnit).addInterceptor(embyPrefixInterceptor).addInterceptor(authInterceptor).addInterceptor(loggingInterceptor);
            if (trustAllCerts) {
                Log.d(TAG, "⚠️ 应用不安全的SSL配置（信任所有证书）");
                Pair<SSLSocketFactory, X509TrustManager> pairCreateUnsafeSslContext = createUnsafeSslContext();
                builderAddInterceptor.sslSocketFactory(pairCreateUnsafeSslContext.component1(), pairCreateUnsafeSslContext.component2());
                builderAddInterceptor.hostnameVerifier(new k3(7));
            }
            Proxy proxy = lr1.a;
            ProxyConfig proxyConfig = lr1.b;
            Log.d(TAG, "当前代理配置: enabled=" + proxyConfig.getEnabled() + ", bypassLan=" + proxyConfig.getBypassLan());
            final Proxy proxy2 = currentProxy;
            if (proxy2 != null) {
                Log.d(TAG, "✅ 应用代理到 OkHttpClient: " + proxy2 + " (局域网不代理: " + proxyConfig.getBypassLan() + ")");
                builderAddInterceptor.proxySelector(new ProxySelector() { // from class: com.dh.myembyapp.data.api.RetrofitClient$getOkHttpClient$2$1
                    @Override // java.net.ProxySelector
                    public void connectFailed(URI uri, SocketAddress sa, IOException ioe) {
                        Log.e("RetrofitClient", "API代理连接失败: " + uri, ioe);
                    }

                    @Override // java.net.ProxySelector
                    public List<Proxy> select(URI uri) {
                        String host;
                        if (uri == null || (host = uri.getHost()) == null) {
                            host = "";
                        }
                        Proxy proxy3 = lr1.a;
                        ProxyConfig proxyConfig2 = lr1.b;
                        Log.d("RetrofitClient", "ProxySelector.select - host: " + host + ", enabled: " + proxyConfig2.getEnabled() + ", bypassLan: " + proxyConfig2.getBypassLan());
                        if (proxyConfig2.getEnabled() && proxyConfig2.getBypassLan()) {
                            boolean zB = lr1.b(host);
                            Log.d("RetrofitClient", "检查是否为局域网: " + host + " -> " + zB);
                            if (zB) {
                                Log.d("RetrofitClient", "🔓 局域网不代理: " + host + " - 直连（API请求）");
                                Proxy proxy4 = Proxy.NO_PROXY;
                                proxy4.getClass();
                                return CollectionsKt.mutableListOf(proxy4);
                            }
                        }
                        Log.d("RetrofitClient", "使用代理: ".concat(host));
                        return CollectionsKt.mutableListOf(proxy2);
                    }
                });
                if (proxy2.type() == Proxy.Type.SOCKS) {
                    Log.d(TAG, "✅ 应用 SOCKS 代理专用 DNS 解析器（远程解析）");
                    builderAddInterceptor.dns(socksProxyDns);
                }
                if (proxyConfig.getHasCredentials()) {
                    Log.d(TAG, "✅ 应用代理认证凭据");
                    if (proxyConfig.getHasCredentials()) {
                        String username = proxyConfig.getUsername();
                        String password = proxyConfig.getPassword();
                        username.getClass();
                        password.getClass();
                        builderAddInterceptor.proxyAuthenticator(new g40(str, username, password));
                    }
                }
            } else {
                Log.d(TAG, "未设置代理，使用直连");
            }
            okHttpClientInstance = builderAddInterceptor.build();
            Log.d(TAG, "OkHttpClient 创建完成");
            Log.d(TAG, "========================================");
        } else {
            Log.d(TAG, "使用缓存的 OkHttpClient 实例（代理: " + currentProxy + "）");
        }
        OkHttpClient okHttpClient2 = okHttpClientInstance;
        okHttpClient2.getClass();
        return okHttpClient2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean getOkHttpClient$lambda$0(String str, SSLSession sSLSession) {
        return true;
    }

    public static /* synthetic */ OkHttpClient getOkHttpClientForDlna$default(RetrofitClient retrofitClient, Context context, int i, Object obj) {
        if ((i & 1) != 0) {
            context = null;
        }
        return retrofitClient.getOkHttpClientForDlna(context);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean getOkHttpClientForDlna$lambda$1(String str, SSLSession sSLSession) {
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean getOkHttpClientForExoPlayer$lambda$1(String str, SSLSession sSLSession) {
        return true;
    }

    public static /* synthetic */ String getPersonImageUrl$default(RetrofitClient retrofitClient, String str, String str2, int i, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            str2 = null;
        }
        if ((i2 & 4) != 0) {
            i = 200;
        }
        return retrofitClient.getPersonImageUrl(str, str2, i);
    }

    private final Retrofit getRetrofit() {
        if (retrofitInstance == null) {
            retrofitInstance = new Retrofit.Builder().baseUrl(baseUrl.length() > 0 ? baseUrl : "http://127.0.0.1:8096/").client(getOkHttpClient()).addConverterFactory(GsonConverterFactory.create()).build();
        }
        Retrofit retrofit = retrofitInstance;
        retrofit.getClass();
        return retrofit;
    }

    public static /* synthetic */ String getSubtitleUrl$default(RetrofitClient retrofitClient, String str, String str2, int i, String str3, long j, int i2, Object obj) {
        if ((i2 & 8) != 0) {
            str3 = "srt";
        }
        String str4 = str3;
        if ((i2 & 16) != 0) {
            j = 0;
        }
        return retrofitClient.getSubtitleUrl(str, str2, i, str4, j);
    }

    public static /* synthetic */ String getVideoUrl$default(RetrofitClient retrofitClient, String str, String str2, String str3, long j, int i, Object obj) {
        if ((i & 4) != 0) {
            str3 = "mkv";
        }
        String str4 = str3;
        if ((i & 8) != 0) {
            j = 0;
        }
        return retrofitClient.getVideoUrl(str, str2, str4, j);
    }

    public final String buildUserAgent(String version) {
        version.getClass();
        return "chaichai/" + version;
    }

    public final String getAccessToken() {
        return accessToken;
    }

    public final EmbyApiService getApiService() {
        Object objCreate = getRetrofit().create(EmbyApiService.class);
        objCreate.getClass();
        return (EmbyApiService) objCreate;
    }

    public final String getBaseUrl() {
        return baseUrl;
    }

    public final String getClientName() {
        return CLIENT_NAME;
    }

    public final String getDeviceId() {
        return deviceId;
    }

    public final String getImageUrl(String itemId, String imageType, String tag, Integer maxWidth) {
        itemId.getClass();
        imageType.getClass();
        String str = baseUrl + "emby/Items/" + itemId + "/Images/" + imageType;
        ArrayList arrayList = new ArrayList();
        if (tag != null) {
            arrayList.add("tag=".concat(tag));
        }
        if (maxWidth != null) {
            arrayList.add("maxWidth=" + maxWidth.intValue());
        }
        if (Intrinsics.areEqual(imageType, "Logo")) {
            arrayList.add("Format=png");
        } else {
            arrayList.add("Format=jpg");
            arrayList.add("Quality=90");
        }
        return !arrayList.isEmpty() ? mr.C(str, "?", CollectionsKt.joinToString$default(arrayList, "&", null, null, 0, null, null, 62, null)) : str;
    }

    public final OkHttpClient getOkHttpClientForDlna(Context context) throws NoSuchAlgorithmException, KeyManagementException {
        OkHttpClient.Builder builder = new OkHttpClient.Builder();
        TimeUnit timeUnit = TimeUnit.SECONDS;
        OkHttpClient.Builder builderConnectionPool = builder.connectTimeout(30L, timeUnit).readTimeout(VIDEO_READ_TIMEOUT_SECONDS, timeUnit).writeTimeout(30L, timeUnit).callTimeout(0L, timeUnit).followRedirects(true).followSslRedirects(true).connectionPool(new ConnectionPool(5, 5L, TimeUnit.MINUTES));
        boolean trustAllCerts2 = false;
        if (context != null) {
            try {
                trustAllCerts2 = new DlnaSettings(context).getConfigSync().getTrustAllCerts();
            } catch (Exception unused) {
            }
        }
        String str = TAG;
        if (trustAllCerts2) {
            Log.d(TAG, "⚠️ DLNA 应用不安全的SSL配置（信任所有证书）");
            Pair<SSLSocketFactory, X509TrustManager> pairCreateUnsafeSslContext = createUnsafeSslContext();
            builderConnectionPool.sslSocketFactory(pairCreateUnsafeSslContext.component1(), pairCreateUnsafeSslContext.component2());
            builderConnectionPool.hostnameVerifier(new k3(6));
        }
        final Proxy proxy = currentProxy;
        if (proxy != null) {
            Proxy proxy2 = lr1.a;
            final ProxyConfig proxyConfig = lr1.b;
            builderConnectionPool.proxySelector(new ProxySelector() { // from class: com.dh.myembyapp.data.api.RetrofitClient$getOkHttpClientForDlna$2$1
                @Override // java.net.ProxySelector
                public void connectFailed(URI uri, SocketAddress sa, IOException ioe) {
                    Log.e("RetrofitClient", "DLNA 代理连接失败: " + uri, ioe);
                }

                @Override // java.net.ProxySelector
                public List<Proxy> select(URI uri) {
                    String host;
                    if (uri == null || (host = uri.getHost()) == null) {
                        host = "";
                    }
                    if (!proxyConfig.getEnabled() || !proxyConfig.getBypassLan() || !lr1.b(host)) {
                        return CollectionsKt.mutableListOf(proxy);
                    }
                    Log.d("RetrofitClient", "🔓 DLNA 局域网不代理: " + host + " - 直连");
                    Proxy proxy3 = Proxy.NO_PROXY;
                    proxy3.getClass();
                    return CollectionsKt.mutableListOf(proxy3);
                }
            });
            if (proxy.type() == Proxy.Type.SOCKS) {
                builderConnectionPool.dns(socksProxyDns);
            }
            proxyConfig.getClass();
            if (proxyConfig.getHasCredentials()) {
                String username = proxyConfig.getUsername();
                String password = proxyConfig.getPassword();
                username.getClass();
                password.getClass();
                builderConnectionPool.proxyAuthenticator(new g40(str, username, password));
            }
        }
        return builderConnectionPool.build();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final OkHttpClient getOkHttpClientForExoPlayer() throws NoSuchAlgorithmException, KeyManagementException {
        HttpLoggingInterceptor httpLoggingInterceptor = new HttpLoggingInterceptor(null, 1, 0 == true ? 1 : 0);
        httpLoggingInterceptor.level(HttpLoggingInterceptor.Level.NONE);
        OkHttpClient.Builder builder = new OkHttpClient.Builder();
        TimeUnit timeUnit = TimeUnit.SECONDS;
        int i = 5;
        OkHttpClient.Builder builderAddInterceptor = builder.connectTimeout(30L, timeUnit).readTimeout(VIDEO_READ_TIMEOUT_SECONDS, timeUnit).writeTimeout(30L, timeUnit).callTimeout(0L, timeUnit).followRedirects(true).followSslRedirects(true).connectionPool(new ConnectionPool(5, 5L, TimeUnit.MINUTES)).addInterceptor(exoPlayerAuthInterceptor).addInterceptor(httpLoggingInterceptor);
        boolean z = trustAllCerts;
        String str = TAG;
        if (z) {
            Log.d(TAG, "⚠️ ExoPlayer应用不安全的SSL配置（信任所有证书）");
            Pair<SSLSocketFactory, X509TrustManager> pairCreateUnsafeSslContext = createUnsafeSslContext();
            builderAddInterceptor.sslSocketFactory(pairCreateUnsafeSslContext.component1(), pairCreateUnsafeSslContext.component2());
            builderAddInterceptor.hostnameVerifier(new k3(i));
        }
        final Proxy proxy = currentProxy;
        if (proxy != null) {
            Proxy proxy2 = lr1.a;
            final ProxyConfig proxyConfig = lr1.b;
            builderAddInterceptor.proxySelector(new ProxySelector() { // from class: com.dh.myembyapp.data.api.RetrofitClient$getOkHttpClientForExoPlayer$2$1
                @Override // java.net.ProxySelector
                public void connectFailed(URI uri, SocketAddress sa, IOException ioe) {
                    Log.e("RetrofitClient", "视频代理连接失败: " + uri, ioe);
                }

                @Override // java.net.ProxySelector
                public List<Proxy> select(URI uri) {
                    String host;
                    if (uri == null || (host = uri.getHost()) == null) {
                        host = "";
                    }
                    if (!proxyConfig.getEnabled() || !proxyConfig.getBypassLan() || !lr1.b(host)) {
                        return CollectionsKt.mutableListOf(proxy);
                    }
                    Log.d("RetrofitClient", "🔓 局域网不代理: " + host + " - 直连（视频流）");
                    Proxy proxy3 = Proxy.NO_PROXY;
                    proxy3.getClass();
                    return CollectionsKt.mutableListOf(proxy3);
                }
            });
            if (proxy.type() == Proxy.Type.SOCKS) {
                builderAddInterceptor.dns(socksProxyDns);
            }
            proxyConfig.getClass();
            if (proxyConfig.getHasCredentials()) {
                String username = proxyConfig.getUsername();
                String password = proxyConfig.getPassword();
                username.getClass();
                password.getClass();
                builderAddInterceptor.proxyAuthenticator(new g40(str, username, password));
            }
        }
        return builderAddInterceptor.build();
    }

    public final String getPersonImageUrl(String personId, String tag, int maxWidth) {
        personId.getClass();
        String str = baseUrl + "emby/Items/" + personId + "/Images/Primary";
        ArrayList arrayList = new ArrayList();
        if (tag != null) {
            arrayList.add("tag=".concat(tag));
        }
        arrayList.add("maxWidth=" + maxWidth);
        arrayList.add("Format=jpg");
        arrayList.add("Quality=90");
        return !arrayList.isEmpty() ? mr.C(str, "?", CollectionsKt.joinToString$default(arrayList, "&", null, null, 0, null, null, 62, null)) : str;
    }

    public final String getSubtitleUrl(String itemId, String mediaSourceId, int subtitleIndex, String format, long startPositionTicks) {
        itemId.getClass();
        mediaSourceId.getClass();
        format.getClass();
        ArrayList arrayList = new ArrayList();
        if (startPositionTicks > 0) {
            arrayList.add("StartPositionTicks=" + startPositionTicks);
        }
        if (accessToken.length() > 0) {
            arrayList.add("api_key=" + accessToken);
        }
        String str = baseUrl;
        ArrayList arrayList2 = !arrayList.isEmpty() ? arrayList : null;
        String strJoinToString$default = arrayList2 != null ? CollectionsKt.joinToString$default(arrayList2, "&", "?", null, 0, null, null, 60, null) : null;
        if (strJoinToString$default == null) {
            strJoinToString$default = "";
        }
        return str + "emby/Videos/" + itemId + "/" + mediaSourceId + "/Subtitles/" + subtitleIndex + "/Stream." + format + strJoinToString$default;
    }

    public final String getTranscodedVideoUrl(String itemId, String mediaSourceId, long startTimeTicks, Long videoBitrate, Integer maxWidth, Integer maxHeight, Integer audioStreamIndex, Integer subtitleStreamIndex) {
        itemId.getClass();
        mediaSourceId.getClass();
        List listMutableListOf = CollectionsKt.mutableListOf("MediaSourceId=".concat(mediaSourceId), kb0.x("DeviceId=", deviceId), "Container=ts");
        if (startTimeTicks > 0) {
            listMutableListOf.add("StartTimeTicks=" + startTimeTicks);
        }
        if (videoBitrate != null) {
            if (videoBitrate.longValue() <= 0) {
                videoBitrate = null;
            }
            if (videoBitrate != null) {
                listMutableListOf.add("VideoBitRate=" + videoBitrate.longValue());
            }
        }
        if (maxWidth != null) {
            if (maxWidth.intValue() <= 0) {
                maxWidth = null;
            }
            if (maxWidth != null) {
                listMutableListOf.add("MaxWidth=" + maxWidth.intValue());
            }
        }
        if (maxHeight != null) {
            if (maxHeight.intValue() <= 0) {
                maxHeight = null;
            }
            if (maxHeight != null) {
                listMutableListOf.add("MaxHeight=" + maxHeight.intValue());
            }
        }
        if (audioStreamIndex != null) {
            listMutableListOf.add("AudioStreamIndex=" + audioStreamIndex.intValue());
        }
        if (subtitleStreamIndex != null) {
            listMutableListOf.add("SubtitleStreamIndex=" + subtitleStreamIndex.intValue());
        }
        if (accessToken.length() > 0) {
            listMutableListOf.add("api_key=" + accessToken);
        }
        return baseUrl + "emby/Videos/" + itemId + "/master.m3u8?" + CollectionsKt.joinToString$default(listMutableListOf, "&", null, null, 0, null, null, 62, null);
    }

    public final boolean getTrustAllCerts() {
        return trustAllCerts;
    }

    public final String getUserId() {
        return userId;
    }

    public final long getVideoReadTimeoutSeconds() {
        return VIDEO_READ_TIMEOUT_SECONDS;
    }

    public final String getVideoUrl(String itemId, String mediaSourceId, String container, long startTimeTicks) {
        itemId.getClass();
        mediaSourceId.getClass();
        container.getClass();
        String string = UUID.randomUUID().toString();
        string.getClass();
        StringsKt__StringsJVMKt.replace$default(string, "-", "", false, 4, (Object) null);
        String str = baseUrl + "emby/videos/" + itemId + "/stream." + container + "?";
        if (accessToken.length() > 0) {
            str = str + "api_key=" + accessToken + "&";
        }
        String str2 = str + "Static=true&MediaSourceId=" + mediaSourceId + "&DeviceId=" + deviceId;
        if (startTimeTicks <= 0) {
            return str2;
        }
        return str2 + "&StartTimeTicks=" + startTimeTicks;
    }

    public final boolean hasCustomRoutingPath() {
        String strEncodedPath;
        HttpUrl httpUrl = HttpUrl.INSTANCE.parse(baseUrl);
        return (httpUrl == null || (strEncodedPath = httpUrl.encodedPath()) == null || StringsKt.isBlank(strEncodedPath) || Intrinsics.areEqual(strEncodedPath, "/")) ? false : true;
    }

    public final void initialize(String serverUrl) {
        serverUrl.getClass();
        if (!StringsKt__StringsJVMKt.endsWith$default(serverUrl, "/", false, 2, null)) {
            serverUrl = serverUrl.concat("/");
        }
        if (Intrinsics.areEqual(baseUrl, serverUrl)) {
            return;
        }
        baseUrl = serverUrl;
        retrofitInstance = null;
    }

    public final String remapAbsoluteMediaUrlToBaseUrl(String rawUrl) {
        HttpUrl httpUrl;
        rawUrl.getClass();
        HttpUrl.Companion companion = HttpUrl.INSTANCE;
        HttpUrl httpUrl2 = companion.parse(baseUrl);
        if (httpUrl2 != null && (httpUrl = companion.parse(rawUrl)) != null) {
            String strTrimEnd = StringsKt.trimEnd(httpUrl2.encodedPath(), '/');
            if (!StringsKt.isBlank(strTrimEnd)) {
                String strEncodedPath = httpUrl.encodedPath();
                if (!StringsKt__StringsJVMKt.equals(strEncodedPath, "/emby", true) && !StringsKt__StringsJVMKt.startsWith(strEncodedPath, "/emby/", true) && (StringsKt__StringsJVMKt.equals(strEncodedPath, "/videos", true) || StringsKt__StringsJVMKt.startsWith(strEncodedPath, "/videos/", true))) {
                    strEncodedPath = kb0.x("/emby", strEncodedPath);
                }
                if (!Intrinsics.areEqual(strEncodedPath, strTrimEnd)) {
                    if (!StringsKt__StringsJVMKt.startsWith$default(strEncodedPath, strTrimEnd + "/", false, 2, null)) {
                        strEncodedPath = c61.n(strTrimEnd, strEncodedPath);
                    }
                }
                return httpUrl2.newBuilder().encodedPath(strEncodedPath).encodedQuery(httpUrl.encodedQuery()).build().getUrl();
            }
        }
        return rawUrl;
    }

    public final void setAppVersion(String version) {
        version.getClass();
        appVersion = version;
        ll0.l("设置应用版本号: ", version, TAG);
    }

    public final void setAuthToken(String token, String uid) {
        token.getClass();
        uid.getClass();
        accessToken = token;
        userId = uid;
    }

    public final void setDeviceId(String id) {
        id.getClass();
        deviceId = id;
        ll0.l("设置DeviceId: ", id, TAG);
    }

    public final void setTrustAllCerts(boolean trust) {
        if (trustAllCerts != trust) {
            Log.d(TAG, "设置信任所有SSL证书: " + trust);
            trustAllCerts = trust;
            okHttpClientInstance = null;
            retrofitInstance = null;
        }
    }

    public final void updateProxy(Proxy proxy) {
        Log.d(TAG, "========== RetrofitClient.updateProxy ==========");
        Log.d(TAG, "旧代理: " + currentProxy);
        Log.d(TAG, "新代理: " + proxy);
        ProxyAuthKey proxyAuthKeyFromCurrentConfig = ProxyAuthKey.INSTANCE.fromCurrentConfig();
        if (Intrinsics.areEqual(currentProxy, proxy) && Intrinsics.areEqual(currentProxyAuthKey, proxyAuthKeyFromCurrentConfig)) {
            Log.d(TAG, "代理配置未改变，无需更新");
        } else {
            Log.d(TAG, "代理配置已改变，清除 OkHttpClient 和 Retrofit 实例");
            currentProxy = proxy;
            currentProxyAuthKey = proxyAuthKeyFromCurrentConfig;
            okHttpClientInstance = null;
            retrofitInstance = null;
            Log.d(TAG, "✅ 实例已清除，下次请求将使用新代理");
        }
        Log.d(TAG, "========================================");
    }

        public static final  class ProxyAuthKey {

        /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);
        private final boolean hasCredentials;
        private final String password;
        private final String username;

                public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final ProxyAuthKey fromCurrentConfig() {
                Proxy proxy = lr1.a;
                ProxyConfig proxyConfig = lr1.b;
                return new ProxyAuthKey(proxyConfig.getHasCredentials(), proxyConfig.getUsername(), proxyConfig.getPassword());
            }

            private Companion() {
            }
        }

        public /* synthetic */ ProxyAuthKey(boolean z, String str, String str2, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? false : z, (i & 2) != 0 ? "" : str, (i & 4) != 0 ? "" : str2);
        }

        public static /* synthetic */ ProxyAuthKey copy$default(ProxyAuthKey proxyAuthKey, boolean z, String str, String str2, int i, Object obj) {
            if ((i & 1) != 0) {
                z = proxyAuthKey.hasCredentials;
            }
            if ((i & 2) != 0) {
                str = proxyAuthKey.username;
            }
            if ((i & 4) != 0) {
                str2 = proxyAuthKey.password;
            }
            return proxyAuthKey.copy(z, str, str2);
        }

        /* JADX INFO: renamed from: component1, reason: from getter */

        /* JADX INFO: renamed from: component2, reason: from getter */

        /* JADX INFO: renamed from: component3, reason: from getter */

        public final ProxyAuthKey copy(boolean hasCredentials, String username, String password) {
            username.getClass();
            password.getClass();
            return new ProxyAuthKey(hasCredentials, username, password);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof ProxyAuthKey)) {
                return false;
            }
            ProxyAuthKey proxyAuthKey = (ProxyAuthKey) other;
            return this.hasCredentials == proxyAuthKey.hasCredentials && Intrinsics.areEqual(this.username, proxyAuthKey.username) && Intrinsics.areEqual(this.password, proxyAuthKey.password);
        }




        public int hashCode() {
            return this.password.hashCode() + i02.i((this.hasCredentials ? 1231 : 1237) * 31, 31, this.username);
        }

        public String toString() {
            boolean z = this.hasCredentials;
            String str = this.username;
            String str2 = this.password;
            StringBuilder sb = new StringBuilder("ProxyAuthKey(hasCredentials=");
            sb.append(z);
            sb.append(", username=");
            sb.append(str);
            sb.append(", password=");
            return s01.w(sb, str2, ")");
        }

        public ProxyAuthKey(boolean z, String str, String str2) {
            str.getClass();
            str2.getClass();
            this.hasCredentials = z;
            this.username = str;
            this.password = str2;
        }

        public ProxyAuthKey() {
            this(false, null, null, 7, null);
        }
    }
}
