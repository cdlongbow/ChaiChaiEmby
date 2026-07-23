package com.dh.myembyapp.data.api;

import android.util.Log;
import com.dh.myembyapp.data.ProxyConfig;
import com.dh.myembyapp.data.ProxyProtocol;
import defpackage.g40;
import defpackage.k3;
import defpackage.lr1;
import defpackage.qu;
import java.io.IOException;
import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.Proxy;
import java.net.ProxySelector;
import java.net.SocketAddress;
import java.net.URI;
import java.security.KeyManagementException;
import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;
import java.security.cert.X509Certificate;
import java.util.List;
import java.util.concurrent.TimeUnit;
import javax.net.ssl.SSLContext;
import javax.net.ssl.SSLSession;
import javax.net.ssl.SSLSocketFactory;
import javax.net.ssl.X509TrustManager;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import kotlin.text.StringsKt;
import okhttp3.Dns;
import okhttp3.OkHttpClient;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000]\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u001c\bÇ\u0002\u0018\u00002\u00020\u0001:\u0001\"B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J$\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\u000b2\b\b\u0002\u0010\f\u001a\u00020\u000bJ$\u0010\r\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\u000b2\b\b\u0002\u0010\f\u001a\u00020\u000bJ8\u0010\u000e\u001a\u00020\u00072\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0012\u001a\u00020\u00102\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u000bH\u0002J \u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u00162\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u000bH\u0002J\u0012\u0010\u0017\u001a\u0004\u0018\u00010\u00182\u0006\u0010\u0019\u001a\u00020\u001aH\u0002J\u0014\u0010\u001e\u001a\u000e\u0012\u0004\u0012\u00020 \u0012\u0004\u0012\u00020!0\u001fH\u0002R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u0010\u0010\u001b\u001a\u00020\u001cX\u0082\u0004¢\u0006\u0004\n\u0002\u0010\u001d¨\u0006#"}, d2 = {"Lcom/dh/myembyapp/data/api/ExternalHttpClient;", "", "<init>", "()V", "TAG", "", "createApiClient", "Lokhttp3/OkHttpClient;", "routeMode", "Lcom/dh/myembyapp/data/api/ExternalHttpClient$RouteMode;", "allowUnsafeSsl", "", "ignoreServerDirectOnly", "createDownloadClient", "buildClient", "connectTimeoutSeconds", "", "readTimeoutSeconds", "writeTimeoutSeconds", "applyProxyRoute", "", "builder", "Lokhttp3/OkHttpClient$Builder;", "createProxyFromConfig", "Ljava/net/Proxy;", "proxyConfig", "Lcom/dh/myembyapp/data/ProxyConfig;", "socksProxyDns", "com/dh/myembyapp/data/api/ExternalHttpClient$socksProxyDns$1", "Lcom/dh/myembyapp/data/api/ExternalHttpClient$socksProxyDns$1;", "createUnsafeSslContext", "Lkotlin/Pair;", "Ljavax/net/ssl/SSLSocketFactory;", "Ljavax/net/ssl/X509TrustManager;", "RouteMode", "app"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class ExternalHttpClient {
    public static final int $stable = 0;
    private static final String TAG = "ExternalHttpClient";
    public static final ExternalHttpClient INSTANCE = new ExternalHttpClient();
    private static final Dns socksProxyDns = new Dns() { // from class: com.dh.myembyapp.data.api.ExternalHttpClient$socksProxyDns$1
        @Override // okhttp3.Dns
        public List<InetAddress> lookup(String hostname) {
            hostname.getClass();
            Proxy proxy = lr1.a;
            return (lr1.b.getBypassLan() && lr1.b(hostname)) ? Dns.SYSTEM.lookup(hostname) : CollectionsKt.listOf(InetAddress.getByAddress(hostname, new byte[]{0, 0, 0, 0}));
        }
    };

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, d2 = {"Lcom/dh/myembyapp/data/api/ExternalHttpClient$RouteMode;", "", "<init>", "(Ljava/lang/String;I)V", "AUTO", "FORCE_PROXY", "FORCE_DIRECT", "app"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public enum RouteMode {
        AUTO,
        FORCE_PROXY,
        FORCE_DIRECT;

        private static final /* synthetic */ EnumEntries $ENTRIES = EnumEntriesKt.enumEntries(values());

        public static EnumEntries<RouteMode> getEntries() {
            return $ENTRIES;
        }
    }

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;
        public static final /* synthetic */ int[] $EnumSwitchMapping$1;

        static {
            int[] iArr = new int[RouteMode.values().length];
            try {
                iArr[RouteMode.FORCE_DIRECT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[RouteMode.FORCE_PROXY.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[RouteMode.AUTO.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
            int[] iArr2 = new int[ProxyProtocol.values().length];
            try {
                iArr2[ProxyProtocol.HTTP.ordinal()] = 1;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr2[ProxyProtocol.HTTPS.ordinal()] = 2;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr2[ProxyProtocol.SOCKS5.ordinal()] = 3;
            } catch (NoSuchFieldError unused6) {
            }
            $EnumSwitchMapping$1 = iArr2;
        }
    }

    private ExternalHttpClient() {
    }

    private final void applyProxyRoute(OkHttpClient.Builder builder, RouteMode routeMode, boolean ignoreServerDirectOnly) {
        final Proxy proxyCreateProxyFromConfig;
        Proxy proxy = lr1.a;
        ProxyConfig proxyConfig = lr1.b;
        if (!ignoreServerDirectOnly || (proxyCreateProxyFromConfig = createProxyFromConfig(proxyConfig)) == null) {
            proxyCreateProxyFromConfig = lr1.a;
        }
        boolean z = proxyConfig.getEnabled() && proxyCreateProxyFromConfig != null;
        int i = WhenMappings.$EnumSwitchMapping$0[routeMode.ordinal()];
        if (i == 1) {
            builder.proxy(Proxy.NO_PROXY);
            return;
        }
        String str = TAG;
        if (i == 2) {
            if (!z) {
                Log.w(TAG, "FORCE_PROXY 但未配置有效代理，回退直连");
                builder.proxy(Proxy.NO_PROXY);
                return;
            }
            builder.proxy(proxyCreateProxyFromConfig);
            if (proxyConfig.getHasCredentials()) {
                String username = proxyConfig.getUsername();
                String password = proxyConfig.getPassword();
                username.getClass();
                password.getClass();
                builder.proxyAuthenticator(new g40(str, username, password));
            }
            if (proxyCreateProxyFromConfig.type() == Proxy.Type.SOCKS) {
                builder.dns(socksProxyDns);
            }
            Unit unit = Unit.INSTANCE;
            return;
        }
        if (i != 3) {
            qu.f();
            return;
        }
        if (!z) {
            builder.proxy(Proxy.NO_PROXY);
            return;
        }
        builder.proxySelector(new ProxySelector() { // from class: com.dh.myembyapp.data.api.ExternalHttpClient.applyProxyRoute.1
            @Override // java.net.ProxySelector
            public void connectFailed(URI uri, SocketAddress sa, IOException ioe) {
                Log.e(ExternalHttpClient.TAG, "外部请求代理连接失败: " + uri, ioe);
            }

            @Override // java.net.ProxySelector
            public List<Proxy> select(URI uri) {
                String host;
                if (uri == null || (host = uri.getHost()) == null) {
                    host = "";
                }
                Proxy proxy2 = lr1.a;
                ProxyConfig proxyConfig2 = lr1.b;
                if (!proxyConfig2.getEnabled() || !proxyConfig2.getBypassLan() || !lr1.b(host)) {
                    return CollectionsKt.mutableListOf(proxyCreateProxyFromConfig);
                }
                Proxy proxy3 = Proxy.NO_PROXY;
                proxy3.getClass();
                return CollectionsKt.mutableListOf(proxy3);
            }
        });
        if (proxyConfig.getHasCredentials()) {
            String username2 = proxyConfig.getUsername();
            String password2 = proxyConfig.getPassword();
            username2.getClass();
            password2.getClass();
            builder.proxyAuthenticator(new g40(str, username2, password2));
        }
        if (proxyCreateProxyFromConfig.type() == Proxy.Type.SOCKS) {
            builder.dns(socksProxyDns);
        }
        Unit unit2 = Unit.INSTANCE;
    }

    private final OkHttpClient buildClient(long connectTimeoutSeconds, long readTimeoutSeconds, long writeTimeoutSeconds, RouteMode routeMode, boolean allowUnsafeSsl, boolean ignoreServerDirectOnly) throws NoSuchAlgorithmException, KeyManagementException {
        OkHttpClient.Builder builder = new OkHttpClient.Builder();
        TimeUnit timeUnit = TimeUnit.SECONDS;
        OkHttpClient.Builder builderFollowSslRedirects = builder.connectTimeout(connectTimeoutSeconds, timeUnit).readTimeout(readTimeoutSeconds, timeUnit).writeTimeout(writeTimeoutSeconds, timeUnit).followRedirects(true).followSslRedirects(true);
        if (allowUnsafeSsl) {
            Pair<SSLSocketFactory, X509TrustManager> pairCreateUnsafeSslContext = createUnsafeSslContext();
            builderFollowSslRedirects.sslSocketFactory(pairCreateUnsafeSslContext.component1(), pairCreateUnsafeSslContext.component2());
            builderFollowSslRedirects.hostnameVerifier(new k3(3));
        }
        applyProxyRoute(builderFollowSslRedirects, routeMode, ignoreServerDirectOnly);
        return builderFollowSslRedirects.build();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean buildClient$lambda$0(String str, SSLSession sSLSession) {
        return true;
    }

    public static /* synthetic */ OkHttpClient createApiClient$default(ExternalHttpClient externalHttpClient, RouteMode routeMode, boolean z, boolean z2, int i, Object obj) {
        if ((i & 1) != 0) {
            routeMode = RouteMode.AUTO;
        }
        if ((i & 2) != 0) {
            z = false;
        }
        if ((i & 4) != 0) {
            z2 = false;
        }
        return externalHttpClient.createApiClient(routeMode, z, z2);
    }

    public static /* synthetic */ OkHttpClient createDownloadClient$default(ExternalHttpClient externalHttpClient, RouteMode routeMode, boolean z, boolean z2, int i, Object obj) {
        if ((i & 1) != 0) {
            routeMode = RouteMode.AUTO;
        }
        if ((i & 2) != 0) {
            z = false;
        }
        if ((i & 4) != 0) {
            z2 = false;
        }
        return externalHttpClient.createDownloadClient(routeMode, z, z2);
    }

    private final Proxy createProxyFromConfig(ProxyConfig proxyConfig) {
        Proxy.Type type;
        if (proxyConfig.getEnabled() && !StringsKt.isBlank(proxyConfig.getHost())) {
            int i = WhenMappings.$EnumSwitchMapping$1[proxyConfig.getProtocol().ordinal()];
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
                return new Proxy(type, new InetSocketAddress(proxyConfig.getHost(), proxyConfig.getPort()));
            } catch (Exception e) {
                Log.e(TAG, "根据全局代理配置创建外部请求代理失败", e);
            }
        }
        return null;
    }

    private final Pair<SSLSocketFactory, X509TrustManager> createUnsafeSslContext() throws NoSuchAlgorithmException, KeyManagementException {
        X509TrustManager x509TrustManager = new X509TrustManager() { // from class: com.dh.myembyapp.data.api.ExternalHttpClient$createUnsafeSslContext$trustAllCertsManager$1
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
        sSLContext.init(null, new ExternalHttpClient$createUnsafeSslContext$trustAllCertsManager$1[]{x509TrustManager}, new SecureRandom());
        return new Pair<>(sSLContext.getSocketFactory(), x509TrustManager);
    }

    public final OkHttpClient createApiClient(RouteMode routeMode, boolean allowUnsafeSsl, boolean ignoreServerDirectOnly) {
        routeMode.getClass();
        return buildClient(10L, 15L, 15L, routeMode, allowUnsafeSsl, ignoreServerDirectOnly);
    }

    public final OkHttpClient createDownloadClient(RouteMode routeMode, boolean allowUnsafeSsl, boolean ignoreServerDirectOnly) {
        routeMode.getClass();
        return buildClient(20L, 120L, 30L, routeMode, allowUnsafeSsl, ignoreServerDirectOnly);
    }
}
