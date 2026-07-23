package defpackage;

import android.util.Log;
import com.dh.myembyapp.data.ProxyConfig;
import com.dh.myembyapp.data.ProxyProtocol;
import java.net.Authenticator;
import java.net.InetSocketAddress;
import java.net.PasswordAuthentication;
import java.net.Proxy;
import java.net.SocketAddress;
import kotlin.text.StringsKt;

/* JADX INFO: loaded from: classes4.dex */
public final class jr1 extends Authenticator {
    @Override // java.net.Authenticator
    public final PasswordAuthentication getPasswordAuthentication() {
        ProxyConfig proxyConfig = lr1.b;
        Proxy proxy = lr1.a;
        Authenticator.RequestorType requestorType = getRequestorType();
        String requestingProtocol = getRequestingProtocol();
        String requestingHost = getRequestingHost();
        int requestingPort = getRequestingPort();
        proxyConfig.getClass();
        SocketAddress socketAddressAddress = proxy != null ? proxy.address() : null;
        InetSocketAddress inetSocketAddress = socketAddressAddress instanceof InetSocketAddress ? (InetSocketAddress) socketAddressAddress : null;
        if ((requestorType != Authenticator.RequestorType.PROXY && !StringsKt__StringsJVMKt.equals(requestingProtocol, "SOCKS5", true)) || proxyConfig.getProtocol() != ProxyProtocol.SOCKS5 || !proxyConfig.getHasCredentials() || inetSocketAddress == null || !StringsKt__StringsJVMKt.equals(requestingHost, inetSocketAddress.getHostString(), true) || requestingPort != inetSocketAddress.getPort()) {
            return null;
        }
        Log.d("ProxyManager", "SOCKS5 认证请求: 为当前代理提供凭据");
        String username = proxyConfig.getUsername();
        char[] charArray = proxyConfig.getPassword().toCharArray();
        charArray.getClass();
        return new PasswordAuthentication(username, charArray);
    }
}
