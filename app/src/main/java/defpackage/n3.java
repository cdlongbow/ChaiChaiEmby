package defpackage;

import android.util.Log;
import com.dh.myembyapp.data.ProxyConfig;
import com.dh.myembyapp.data.model.ServerConfig;
import java.io.IOException;
import java.net.Proxy;
import java.net.ProxySelector;
import java.net.SocketAddress;
import java.net.URI;
import java.util.List;
import kotlin.collections.CollectionsKt;

/* JADX INFO: loaded from: classes4.dex */
public final class n3 extends ProxySelector {
    public final /* synthetic */ int a;
    public final /* synthetic */ ProxyConfig b;
    public final /* synthetic */ Proxy c;
    public final /* synthetic */ ServerConfig d;

    public /* synthetic */ n3(ProxyConfig proxyConfig, Proxy proxy, ServerConfig serverConfig, int i) {
        this.a = i;
        this.b = proxyConfig;
        this.c = proxy;
        this.d = serverConfig;
    }

    @Override // java.net.ProxySelector
    public final void connectFailed(URI uri, SocketAddress socketAddress, IOException iOException) {
        int i = this.a;
        ServerConfig serverConfig = this.d;
        switch (i) {
            case 0:
                Log.e("AggregateHubRepo", "[" + serverConfig.getAlias() + "] 代理连接失败: " + uri, iOException);
                break;
            case 1:
                Log.e("OtherServerResourceRepo", "[" + serverConfig.getAlias() + "] 代理连接失败: " + uri, iOException);
                break;
            default:
                Log.e("ServerPingRepository", "[" + serverConfig.getAlias() + "] ping 代理连接失败: " + uri, iOException);
                break;
        }
    }

    @Override // java.net.ProxySelector
    public final List select(URI uri) {
        String host;
        String host2;
        String host3;
        int i = this.a;
        Proxy proxy = this.c;
        ProxyConfig proxyConfig = this.b;
        String str = "";
        switch (i) {
            case 0:
                if (uri != null && (host = uri.getHost()) != null) {
                    str = host;
                }
                if (!proxyConfig.getBypassLan() || !lr1.b(str)) {
                    return CollectionsKt.mutableListOf(proxy);
                }
                Proxy proxy2 = Proxy.NO_PROXY;
                proxy2.getClass();
                return CollectionsKt.mutableListOf(proxy2);
            case 1:
                if (uri != null && (host2 = uri.getHost()) != null) {
                    str = host2;
                }
                if (!proxyConfig.getBypassLan() || !lr1.b(str)) {
                    return CollectionsKt.mutableListOf(proxy);
                }
                Proxy proxy3 = Proxy.NO_PROXY;
                proxy3.getClass();
                return CollectionsKt.mutableListOf(proxy3);
            default:
                if (uri != null && (host3 = uri.getHost()) != null) {
                    str = host3;
                }
                if (!proxyConfig.getBypassLan() || !lr1.b(str)) {
                    return CollectionsKt.mutableListOf(proxy);
                }
                Proxy proxy4 = Proxy.NO_PROXY;
                proxy4.getClass();
                return CollectionsKt.mutableListOf(proxy4);
        }
    }
}
