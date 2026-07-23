package com.dh.myembyapp.server;

import com.dh.myembyapp.data.model.BackupRouteConfig;
import defpackage.lr1;
import java.net.InetAddress;
import java.net.Proxy;
import java.util.List;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.text.StringsKt;
import okhttp3.Dns;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\u0015\n\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0001\u001a\f\u0010\u0003\u001a\u00020\u0004*\u00020\u0005H\u0002\u001a\u0010\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0004H\u0002\"\u0010\u0010\u0000\u001a\u00020\u0001X\u0082\u0004¢\u0006\u0004\n\u0002\u0010\u0002¨\u0006\b"}, d2 = {"socksProxyDns", "com/dh/myembyapp/server/BackupRouteConfigServerManagerKt$socksProxyDns$1", "Lcom/dh/myembyapp/server/BackupRouteConfigServerManagerKt$socksProxyDns$1;", "toRouteSignature", "", "Lcom/dh/myembyapp/data/model/BackupRouteConfig;", "escapeHtml", "value", "app"}, k = 2, mv = {2, 3, 0}, xi = 48)
public final class BackupRouteConfigServerManagerKt {
    private static final Dns socksProxyDns = new Dns() { // from class: com.dh.myembyapp.server.BackupRouteConfigServerManagerKt$socksProxyDns$1
        @Override // okhttp3.Dns
        public List<InetAddress> lookup(String hostname) {
            hostname.getClass();
            Proxy proxy = lr1.a;
            return (lr1.b.getBypassLan() && lr1.b(hostname)) ? Dns.SYSTEM.lookup(hostname) : CollectionsKt.listOf(InetAddress.getByAddress(hostname, new byte[]{0, 0, 0, 0}));
        }
    };

    /* JADX INFO: Access modifiers changed from: private */
    public static final String escapeHtml(String str) {
        return StringsKt__StringsJVMKt.replace$default(StringsKt__StringsJVMKt.replace$default(StringsKt__StringsJVMKt.replace$default(StringsKt__StringsJVMKt.replace$default(str, "&", "&amp;", false, 4, (Object) null), "\"", "&quot;", false, 4, (Object) null), "<", "&lt;", false, 4, (Object) null), ">", "&gt;", false, 4, (Object) null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String toRouteSignature(BackupRouteConfig backupRouteConfig) {
        String protocol = backupRouteConfig.getProtocol();
        Locale locale = Locale.ROOT;
        String lowerCase = protocol.toLowerCase(locale);
        lowerCase.getClass();
        String lowerCase2 = StringsKt.trim((CharSequence) backupRouteConfig.getHost()).toString().toLowerCase(locale);
        lowerCase2.getClass();
        String strValueOf = String.valueOf(backupRouteConfig.getPort());
        String path = backupRouteConfig.getPath();
        if (path == null) {
            path = "";
        }
        return CollectionsKt___CollectionsKt.joinToString$default(CollectionsKt.listOf((Object[]) new String[]{lowerCase, lowerCase2, strValueOf, StringsKt.trim(StringsKt.trim((CharSequence) path).toString(), '/')}), "|", null, null, 0, null, null, 62, null);
    }
}
