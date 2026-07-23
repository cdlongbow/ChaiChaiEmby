package defpackage;

import android.util.Log;
import com.dh.myembyapp.data.ProxyConfig;
import com.dh.myembyapp.data.ProxyProtocol;
import com.dh.myembyapp.data.api.RetrofitClient;
import java.net.Authenticator;
import java.net.InetSocketAddress;
import java.net.Proxy;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Regex;
import kotlin.text.StringsKt;
import kotlin.text.StringsKt;

/* JADX INFO: loaded from: classes4.dex */
public abstract class lr1 {
    public static volatile Proxy a;
    public static volatile boolean c;
    public static volatile boolean e;
    public static volatile ProxyConfig b = new ProxyConfig(false, null, null, 0, null, null, false, 127, null);
    public static final jr1 d = new jr1();

    /* JADX WARN: Code duplicated, block: B:28:0x00f3  */
    /* JADX WARN: Code duplicated, block: B:30:0x00f7  */
    public static void a(ProxyConfig proxyConfig) {
        Proxy proxy;
        Proxy.Type type;
        proxyConfig.getClass();
        b = proxyConfig;
        Log.d("ProxyManager", "========== 开始应用代理配置 ==========");
        Log.d("ProxyManager", "代理配置: enabled=" + proxyConfig.getEnabled() + ", protocol=" + proxyConfig.getProtocol() + ", host=" + proxyConfig.getHost() + ", port=" + proxyConfig.getPort() + ", bypassLan=" + proxyConfig.getBypassLan());
        if (proxyConfig.getEnabled()) {
            int i = hr1.$EnumSwitchMapping$0[proxyConfig.getProtocol().ordinal()];
            if (i == 1 || i == 2) {
                type = Proxy.Type.HTTP;
            } else {
                if (i != 3) {
                    qu.f();
                    return;
                }
                type = Proxy.Type.SOCKS;
            }
            Log.d("ProxyManager", "代理类型: " + type);
            try {
                proxy = new Proxy(type, new InetSocketAddress(proxyConfig.getHost(), proxyConfig.getPort()));
                Log.d("ProxyManager", "✅ 代理对象创建成功: " + proxy);
            } catch (Exception e2) {
                Log.e("ProxyManager", "❌ 创建代理对象失败", e2);
                e2.printStackTrace();
                proxy = null;
            }
            a = proxy;
            Log.d("ProxyManager", "当前代理对象: " + a);
            if (!proxyConfig.getEnabled() && proxyConfig.getProtocol() == ProxyProtocol.SOCKS5 && proxyConfig.getHasCredentials()) {
                Log.d("ProxyManager", "设置 SOCKS5 全局认证器（用于 RFC 1929 协议认证）");
                Authenticator.setDefault(d);
                c = true;
            } else if (c) {
                Log.d("ProxyManager", "清除 SOCKS5 全局认证器");
                Authenticator.setDefault(null);
                c = false;
            }
            Log.d("ProxyManager", "通知 RetrofitClient 更新代理...");
            RetrofitClient.INSTANCE.updateProxy(a);
            Log.d("ProxyManager", "========== 代理配置应用完成 ==========");
        }
        Log.d("ProxyManager", "代理已禁用，清除代理配置");
        proxy = null;
        a = proxy;
        Log.d("ProxyManager", "当前代理对象: " + a);
        if (!proxyConfig.getEnabled()) {
            if (c) {
                Log.d("ProxyManager", "清除 SOCKS5 全局认证器");
                Authenticator.setDefault(null);
                c = false;
            }
        } else if (c) {
            Log.d("ProxyManager", "清除 SOCKS5 全局认证器");
            Authenticator.setDefault(null);
            c = false;
        }
        Log.d("ProxyManager", "通知 RetrofitClient 更新代理...");
        RetrofitClient.INSTANCE.updateProxy(a);
        Log.d("ProxyManager", "========== 代理配置应用完成 ==========");
    }

    public static boolean b(String str) {
        str.getClass();
        String lowerCase = str.toLowerCase(Locale.ROOT);
        lowerCase.getClass();
        String string = StringsKt.trim((CharSequence) lowerCase).toString();
        if (!Intrinsics.areEqual(string, "localhost") && !Intrinsics.areEqual(string, "127.0.0.1") && !StringsKt__StringsJVMKt.startsWith$default(string, "127.", false, 2, null) && !Intrinsics.areEqual(string, "::1")) {
            List listListOf = CollectionsKt.listOf((Object[]) new Regex[]{new Regex("^192\\.168\\.\\d{1,3}\\.\\d{1,3}$"), new Regex("^10\\.\\d{1,3}\\.\\d{1,3}\\.\\d{1,3}$"), new Regex("^172\\.(1[6-9]|2[0-9]|3[0-1])\\.\\d{1,3}\\.\\d{1,3}$")});
            if (listListOf == null || !listListOf.isEmpty()) {
                Iterator it = listListOf.iterator();
                while (it.hasNext()) {
                    if (((Regex) it.next()).matches(string)) {
                    }
                }
            }
            return false;
        }
        return true;
    }

    public static void c(boolean z) {
        Log.d("ProxyManager", "设置服务器仅直连模式: " + z);
        e = z;
        if (!z) {
            if (b.getEnabled()) {
                Log.d("ProxyManager", "服务器非仅直连，重新应用代理配置");
                a(b);
                return;
            }
            return;
        }
        Log.d("ProxyManager", "服务器设置为仅直连，清除代理");
        a = null;
        if (c) {
            Authenticator.setDefault(null);
            c = false;
        }
        RetrofitClient.INSTANCE.updateProxy(null);
    }
}
