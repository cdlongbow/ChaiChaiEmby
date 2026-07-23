package defpackage;

import com.dh.myembyapp.data.ProxyConfig;
import java.net.InetAddress;
import java.util.List;
import kotlin.collections.CollectionsKt;
import okhttp3.Dns;

/* JADX INFO: loaded from: classes4.dex */
public final class o3 implements Dns {
    public final /* synthetic */ int a;
    public final /* synthetic */ ProxyConfig b;

    public /* synthetic */ o3(ProxyConfig proxyConfig, int i) {
        this.a = i;
        this.b = proxyConfig;
    }

    @Override // okhttp3.Dns
    public final List lookup(String str) {
        int i = this.a;
        ProxyConfig proxyConfig = this.b;
        str.getClass();
        switch (i) {
            case 0:
                return (proxyConfig.getBypassLan() && lr1.b(str)) ? Dns.SYSTEM.lookup(str) : CollectionsKt.listOf(InetAddress.getByAddress(str, new byte[]{0, 0, 0, 0}));
            case 1:
                return (proxyConfig.getBypassLan() && lr1.b(str)) ? Dns.SYSTEM.lookup(str) : CollectionsKt.listOf(InetAddress.getByAddress(str, new byte[]{0, 0, 0, 0}));
            default:
                return (proxyConfig.getBypassLan() && lr1.b(str)) ? Dns.SYSTEM.lookup(str) : CollectionsKt.listOf(InetAddress.getByAddress(str, new byte[]{0, 0, 0, 0}));
        }
    }
}
