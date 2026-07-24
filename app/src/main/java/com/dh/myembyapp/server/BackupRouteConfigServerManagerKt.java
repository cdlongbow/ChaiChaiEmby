package com.dh.myembyapp.server;

import com.dh.myembyapp.data.model.BackupRouteConfig;
import defpackage.lr1;
import java.net.InetAddress;
import java.net.Proxy;
import java.util.List;
import java.util.Locale;
import kotlin.collections.CollectionsKt;
import kotlin.text.StringsKt;
import okhttp3.Dns;

/* JADX INFO: loaded from: classes4.dex */
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
