package defpackage;

import android.util.Log;
import com.dh.myembyapp.MyEmbyApp;
import com.dh.myembyapp.data.ProxyConfig;
import com.dh.myembyapp.data.model.ServerConfig;
import java.io.IOException;
import java.net.Proxy;
import java.net.ProxySelector;
import java.net.SocketAddress;
import java.net.URI;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.text.StringsKt;
import kotlin.text.StringsKt;
import okhttp3.HttpUrl;

/* JADX INFO: loaded from: classes4.dex */
public final class s61 extends ProxySelector {
    public final /* synthetic */ MyEmbyApp a;

    public s61(MyEmbyApp myEmbyApp) {
        this.a = myEmbyApp;
    }

    @Override // java.net.ProxySelector
    public final void connectFailed(URI uri, SocketAddress socketAddress, IOException iOException) {
        String message;
        if (iOException == null || (message = iOException.getMessage()) == null || !StringsKt__StringsKt.contains$default(message, (CharSequence) "Socket closed", false, 2, (Object) null)) {
            Log.e("MyEmbyApp", "图片代理连接失败: " + uri, iOException);
        }
    }

    /* JADX WARN: Code duplicated, block: B:18:0x004a  */
    @Override // java.net.ProxySelector
    public final List select(URI uri) {
        Proxy proxyF;
        MyEmbyApp myEmbyApp = this.a;
        int i = MyEmbyApp.j;
        Proxy proxy = lr1.a;
        ProxyConfig proxyConfig = lr1.b;
        if (proxyConfig.getEnabled()) {
            String host = uri != null ? uri.getHost() : null;
            if (host == null) {
                host = "";
            }
            if (StringsKt.isBlank(host)) {
                proxyF = null;
            } else {
                if (proxyConfig.getBypassLan() && lr1.b(host)) {
                    Log.d("MyEmbyApp", "🔓 局域网不代理: " + host + " - 直连（图片）");
                } else {
                    HttpUrl httpUrl = HttpUrl.INSTANCE.parse(String.valueOf(uri));
                    ServerConfig serverConfigG = httpUrl != null ? myEmbyApp.g(httpUrl) : null;
                    if (serverConfigG == null || !serverConfigG.getDirectOnly()) {
                        proxyF = serverConfigG != null ? MyEmbyApp.f(proxyConfig) : lr1.a;
                    }
                }
                proxyF = null;
            }
        } else {
            proxyF = null;
        }
        String host2 = uri != null ? uri.getHost() : null;
        String str = host2 != null ? host2 : "";
        boolean zIsBlank = StringsKt.isBlank(str);
        ThreadLocal threadLocal = this.a.e;
        if (zIsBlank) {
            threadLocal.remove();
        } else {
            threadLocal.set(new p61(str, (proxyF != null ? proxyF.type() : null) == Proxy.Type.SOCKS));
        }
        if (proxyF != null) {
            return CollectionsKt.mutableListOf(proxyF);
        }
        Proxy proxy2 = Proxy.NO_PROXY;
        proxy2.getClass();
        return CollectionsKt.mutableListOf(proxy2);
    }
}
