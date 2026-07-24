package com.dh.myembyapp.server;

import android.content.Context;
import android.util.Log;
import com.dh.myembyapp.data.ProxyConfig;
import com.dh.myembyapp.data.api.RetrofitClient;
import com.dh.myembyapp.data.model.BackupRouteConfig;
import com.dh.myembyapp.data.model.ServerConfig;
import com.dh.myembyapp.data.model.ServerConfigKt;
import defpackage.f5;
import defpackage.g40;
import defpackage.i9;
import defpackage.k3;
import defpackage.kb0;
import defpackage.lr1;
import defpackage.rd1;
import defpackage.s01;
import defpackage.tl0;
import java.io.IOException;
import java.net.Proxy;
import java.security.KeyManagementException;
import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.concurrent.TimeUnit;
import javax.net.ssl.SSLContext;
import javax.net.ssl.SSLSession;
import javax.net.ssl.SSLSocketFactory;
import javax.net.ssl.X509TrustManager;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.jvm.functions.Function1;
import kotlin.text.StringsKt;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.Dispatchers;
import okhttp3.OkHttpClient;

/* JADX INFO: loaded from: classes4.dex */
public final class BackupRouteConfigServerManager {
    private static final int DEFAULT_PORT = 8771;
    private static final int MAX_PORT = 8799;
    private static final int MAX_ROUTES = 50;
    private static final String TAG = "BackupRouteCfgServer";
    private final Context context;
    private BackupRouteConfigServer server;
    

    public BackupRouteConfigServerManager(Context context) {
        context.getClass();
        this.context = context;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:12:0x0018  */
    public final String buildEmbyAuthorizationHeader(ServerConfig server) {
        String accessToken = server.getAccessToken();
        if (accessToken == null) {
            accessToken = "";
        }
        String deviceId = server.getDeviceId();
        if (deviceId == null) {
            deviceId = RetrofitClient.INSTANCE.getDeviceId();
        } else {
            if (StringsKt.isBlank(deviceId)) {
                deviceId = null;
            }
            if (deviceId == null) {
                deviceId = RetrofitClient.INSTANCE.getDeviceId();
            }
        }
        return s01.w(kb0.z("MediaBrowser Token=\"", accessToken, "\", Client=\"", RetrofitClient.INSTANCE.getClientName(), "\", Device=\"AndroidTV\", DeviceId=\""), deviceId, "\", Version=\"0.3.0\"");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final List<BackupRouteConfig> buildImportableRoutes(ServerConfig server, List<ExtServerDomainItem> items) {
        int port;
        String alias = server.getAlias();
        if (StringsKt.isBlank(alias)) {
            alias = "主线路";
        }
        String str = alias;
        String protocol = server.getProtocol();
        String host = server.getHost();
        int port2 = server.getPort();
        String path = server.getPath();
        BackupRouteConfig backupRouteConfigNormalizeBackupRouteConfig = ServerConfigKt.normalizeBackupRouteConfig(new BackupRouteConfig(null, str, protocol, host, port2, path == null ? "" : path, server.getDirectOnly(), 1, null));
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        linkedHashSet.add(BackupRouteConfigServerManagerKt.toRouteSignature(backupRouteConfigNormalizeBackupRouteConfig));
        ArrayList arrayList = new ArrayList();
        int i = 0;
        for (Object obj : items) {
            int i2 = i + 1;
            if (i < 0) {
                CollectionsKt.throwIndexOverflow();
            }
            ExtServerDomainItem extServerDomainItem = (ExtServerDomainItem) obj;
            String url = extServerDomainItem.getUrl();
            if (url == null) {
                url = "";
            }
            String string = StringsKt.trim((CharSequence) url).toString();
            if (!StringsKt.isBlank(string)) {
                String name = extServerDomainItem.getName();
                if (name == null) {
                    name = "";
                }
                String string2 = StringsKt.trim((CharSequence) name).toString();
                if (StringsKt.isBlank(string2)) {
                    string2 = i9.f(i2, "备用线路");
                }
                BackupRouteConfig backupRouteConfigNormalizeBackupRouteConfig2 = ServerConfigKt.normalizeBackupRouteConfig(new BackupRouteConfig(null, string2, server.getProtocol(), string, server.getPort(), "", true, 1, null));
                if (!StringsKt.isBlank(backupRouteConfigNormalizeBackupRouteConfig2.getHost()) && 1 <= (port = backupRouteConfigNormalizeBackupRouteConfig2.getPort()) && port < 65536 && linkedHashSet.add(BackupRouteConfigServerManagerKt.toRouteSignature(backupRouteConfigNormalizeBackupRouteConfig2))) {
                    arrayList.add(backupRouteConfigNormalizeBackupRouteConfig2);
                }
            }
            i = i2;
        }
        return arrayList;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final OkHttpClient createFetchClient(ServerConfig server, String requestHost) throws NoSuchAlgorithmException, KeyManagementException {
        OkHttpClient.Builder builder = new OkHttpClient.Builder();
        TimeUnit timeUnit = TimeUnit.SECONDS;
        OkHttpClient.Builder builderWriteTimeout = builder.connectTimeout(15L, timeUnit).readTimeout(15L, timeUnit).writeTimeout(15L, timeUnit);
        boolean z = false;
        int i = 1;
        if (server.getTrustAllCerts()) {
            X509TrustManager x509TrustManager = new X509TrustManager() { // from class: com.dh.myembyapp.server.BackupRouteConfigServerManager$createFetchClient$trustAllCertsManager$1
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
            sSLContext.init(null, new BackupRouteConfigServerManager$createFetchClient$trustAllCertsManager$1[]{x509TrustManager}, new SecureRandom());
            SSLSocketFactory socketFactory = sSLContext.getSocketFactory();
            socketFactory.getClass();
            builderWriteTimeout.sslSocketFactory(socketFactory, x509TrustManager);
            builderWriteTimeout.hostnameVerifier(new k3(i));
        }
        if (!server.getDirectOnly()) {
            Proxy proxy = lr1.a;
            Proxy proxy2 = lr1.a;
            ProxyConfig proxyConfig = lr1.b;
            if (proxyConfig.getEnabled() && proxyConfig.getBypassLan() && lr1.b(requestHost)) {
                z = true;
            }
            if (proxy2 != null && !z) {
                builderWriteTimeout.proxy(proxy2);
                if (proxyConfig.getHasCredentials()) {
                    String username = proxyConfig.getUsername();
                    String password = proxyConfig.getPassword();
                    username.getClass();
                    password.getClass();
                    builderWriteTimeout.proxyAuthenticator(new g40(TAG, username, password));
                }
                if (proxy2.type() == Proxy.Type.SOCKS) {
                    builderWriteTimeout.dns(BackupRouteConfigServerManagerKt.socksProxyDns);
                }
            }
        }
        return builderWriteTimeout.build();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean createFetchClient$lambda$0(String str, SSLSession sSLSession) {
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit startServer$lambda$0(Function1 function1, List list) {
        list.getClass();
        BuildersKt.launch$default(CoroutineScopeKt.CoroutineScope(Dispatchers.getMain()), null, null, new BackupRouteConfigServerManager$startServer$1$1(function1, list, null), 3, null);
        return Unit.INSTANCE;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: fetchServerDomains-gIAlu-s, reason: not valid java name */
    public final Object m8804fetchServerDomainsgIAlus(ServerConfig serverConfig, Continuation<? super Result<RemoteBackupRouteFetchResult>> continuation) {
        BackupRouteConfigServerManager$fetchServerDomains$1 backupRouteConfigServerManager$fetchServerDomains$1;
        if (continuation instanceof BackupRouteConfigServerManager$fetchServerDomains$1) {
            backupRouteConfigServerManager$fetchServerDomains$1 = (BackupRouteConfigServerManager$fetchServerDomains$1) continuation;
            int i = backupRouteConfigServerManager$fetchServerDomains$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                backupRouteConfigServerManager$fetchServerDomains$1.label = i - Integer.MIN_VALUE;
            } else {
                backupRouteConfigServerManager$fetchServerDomains$1 = new BackupRouteConfigServerManager$fetchServerDomains$1(this, continuation);
            }
        } else {
            backupRouteConfigServerManager$fetchServerDomains$1 = new BackupRouteConfigServerManager$fetchServerDomains$1(this, continuation);
        }
        Object objWithContext = backupRouteConfigServerManager$fetchServerDomains$1.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = backupRouteConfigServerManager$fetchServerDomains$1.label;
        if (i2 == 0) {
            ResultKt.throwOnFailure(objWithContext);
            CoroutineDispatcher io2 = Dispatchers.getIO();
            BackupRouteConfigServerManager$fetchServerDomains$2 backupRouteConfigServerManager$fetchServerDomains$2 = new BackupRouteConfigServerManager$fetchServerDomains$2(serverConfig, this, null);
            backupRouteConfigServerManager$fetchServerDomains$1.L$0 = null;
            backupRouteConfigServerManager$fetchServerDomains$1.label = 1;
            objWithContext = BuildersKt.withContext(io2, backupRouteConfigServerManager$fetchServerDomains$2, backupRouteConfigServerManager$fetchServerDomains$1);
            if (objWithContext == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i2 != 1) {
                rd1.o("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            ResultKt.throwOnFailure(objWithContext);
        }
        return ((Result) objWithContext).getValue();
    }

    public final String startServer(String serverAlias, List<BackupRouteConfig> initialRoutes, Function1<? super List<BackupRouteConfig>, Unit> onConfigReceived) {
        serverAlias.getClass();
        initialRoutes.getClass();
        onConfigReceived.getClass();
        stopServer();
        IOException e = null;
        for (int i = DEFAULT_PORT; i < 8800; i++) {
            try {
                BackupRouteConfigServer backupRouteConfigServer = new BackupRouteConfigServer(i, serverAlias, CollectionsKt.take(initialRoutes, 50), new f5(onConfigReceived, 2));
                this.server = backupRouteConfigServer;
                backupRouteConfigServer.start();
                return tl0.b(this.context, i);
            } catch (IOException e2) {
                e = e2;
                BackupRouteConfigServer backupRouteConfigServer2 = this.server;
                if (backupRouteConfigServer2 != null) {
                    backupRouteConfigServer2.stop();
                }
                this.server = null;
                Log.e(TAG, "端口 " + i + " 启动失败", e);
                String message = e.getMessage();
                if (message == null || !message.contains("EADDRINUSE")) {
                    break;
                }
            }
        }
        if (e != null) {
            Log.e(TAG, "所有候选端口均启动失败", e);
        }
        return null;
    }

    public final void stopServer() {
        BackupRouteConfigServer backupRouteConfigServer = this.server;
        if (backupRouteConfigServer != null) {
            backupRouteConfigServer.stop();
        }
        this.server = null;
    }
}
