package com.dh.myembyapp.data.model;

import defpackage.kb0;
import defpackage.mr;
import java.net.URI;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.text.Regex;
import kotlin.text.RegexOption;
import kotlin.text.StringsKt;
import kotlin.text.StringsKt;
import kotlin.text.StringsKt;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\"\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u0012\u0010\u0000\u001a\u00020\u00012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0001H\u0002\u001a\u0012\u0010\u0003\u001a\u00020\u00042\b\u0010\u0002\u001a\u0004\u0018\u00010\u0001H\u0002\u001a\u0012\u0010\u0005\u001a\u00020\u00012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0001H\u0002\u001a\u0012\u0010\u0007\u001a\u00020\u00012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0001H\u0002\u001a*\u0010\b\u001a\u00020\t2\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\n\u001a\u00020\u00012\u0006\u0010\u000b\u001a\u00020\u00042\b\u0010\u0006\u001a\u0004\u0018\u00010\u0001H\u0002\u001a\u000e\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\r¨\u0006\u000f"}, d2 = {"normalizeServerProtocol", "", "protocol", "defaultPortForProtocol", "", "normalizeStoredServerPath", "path", "normalizeServerPath", "normalizeServerEndpoint", "Lcom/dh/myembyapp/data/model/NormalizedServerEndpoint;", "host", "port", "normalizeBackupRouteConfig", "Lcom/dh/myembyapp/data/model/BackupRouteConfig;", "route", "app"}, k = 2, mv = {2, 3, 0}, xi = 48)
public final class ServerConfigKt {
    private static final int defaultPortForProtocol(String str) {
        return StringsKt__StringsJVMKt.equals(str, "https", true) ? 443 : 80;
    }

    public static final BackupRouteConfig normalizeBackupRouteConfig(BackupRouteConfig backupRouteConfig) {
        backupRouteConfig.getClass();
        NormalizedServerEndpoint normalizedServerEndpointNormalizeServerEndpoint = normalizeServerEndpoint(backupRouteConfig.getProtocol(), backupRouteConfig.getHost(), backupRouteConfig.getPort(), backupRouteConfig.getPath());
        return BackupRouteConfig.copy$default(backupRouteConfig, null, null, normalizedServerEndpointNormalizeServerEndpoint.getProtocol(), normalizedServerEndpointNormalizeServerEndpoint.getHost(), normalizedServerEndpointNormalizeServerEndpoint.getPort(), normalizedServerEndpointNormalizeServerEndpoint.getPath(), false, 67, null);
    }

    private static final NormalizedServerEndpoint normalizeServerEndpoint(String str, String str2, int i, String str3) {
        Object objM8825constructorimpl;
        String host;
        String strNormalizeServerProtocol = normalizeServerProtocol(str);
        String strTrimEnd = StringsKt.trimEnd(StringsKt.trim((CharSequence) str2).toString(), '/');
        String strNormalizeStoredServerPath = normalizeStoredServerPath(str3);
        boolean z = StringsKt__StringsJVMKt.startsWith(strTrimEnd, "http://", true) || StringsKt__StringsJVMKt.startsWith(strTrimEnd, "https://", true);
        if (strTrimEnd.length() == 0) {
            return new NormalizedServerEndpoint(strNormalizeServerProtocol, "", i, strNormalizeStoredServerPath);
        }
        String strC = (StringsKt__StringsJVMKt.startsWith(strTrimEnd, "http://", true) || StringsKt__StringsJVMKt.startsWith(strTrimEnd, "https://", true)) ? strTrimEnd : mr.C(strNormalizeServerProtocol, "://", strTrimEnd);
        try {
            Result.Companion companion = Result.INSTANCE;
            objM8825constructorimpl = Result.m8825constructorimpl(new URI(strC));
        } catch (Throwable th) {
            Result.Companion companion2 = Result.INSTANCE;
            objM8825constructorimpl = Result.m8825constructorimpl(ResultKt.createFailure(th));
        }
        if (Result.m8831isFailureimpl(objM8825constructorimpl)) {
            objM8825constructorimpl = null;
        }
        URI uri = (URI) objM8825constructorimpl;
        if (uri != null && (host = uri.getHost()) != null && !StringsKt.isBlank(host)) {
            String strNormalizeStoredServerPath2 = normalizeStoredServerPath(uri.getPath());
            String strNormalizeServerProtocol2 = normalizeServerProtocol(uri.getScheme());
            String host2 = uri.getHost();
            host2.getClass();
            String strTrimEnd2 = StringsKt.trimEnd(StringsKt.trim((CharSequence) host2).toString(), '/');
            int port = uri.getPort();
            if (1 <= port && port < 65536) {
                i = uri.getPort();
            } else if (z) {
                i = defaultPortForProtocol(strNormalizeServerProtocol2);
            }
            if (strNormalizeStoredServerPath2.length() > 0) {
                strNormalizeStoredServerPath = strNormalizeStoredServerPath2;
            }
            return new NormalizedServerEndpoint(strNormalizeServerProtocol2, strTrimEnd2, i, strNormalizeStoredServerPath);
        }
        if (StringsKt__StringsJVMKt.startsWith(strTrimEnd, "https://", true)) {
            strNormalizeServerProtocol = "https";
        } else if (StringsKt__StringsJVMKt.startsWith(strTrimEnd, "http://", true)) {
            strNormalizeServerProtocol = "http";
        }
        String strReplace = new Regex("^https?://", RegexOption.IGNORE_CASE).replace(strTrimEnd, "");
        String strTrimEnd3 = StringsKt.trimEnd(StringsKt.trim((CharSequence) StringsKt__StringsKt.substringBefore$default(strReplace, '/', (String) null, 2, (Object) null)).toString(), '/');
        String strSubstringAfter = StringsKt__StringsKt.substringAfter(strReplace, '/', "");
        if (!StringsKt.isBlank(strSubstringAfter)) {
            strNormalizeStoredServerPath = strSubstringAfter;
        }
        int i2 = 0;
        for (int i3 = 0; i3 < strTrimEnd3.length(); i3++) {
            if (strTrimEnd3.charAt(i3) == ':') {
                i2++;
            }
        }
        if (i2 == 1) {
            String strTrimEnd4 = StringsKt.trimEnd(StringsKt.trim((CharSequence) StringsKt__StringsKt.substringBefore$default(strTrimEnd3, ':', (String) null, 2, (Object) null)).toString(), '/');
            Integer intOrNull = StringsKt.toIntOrNull(StringsKt__StringsKt.substringAfter$default(strTrimEnd3, ':', (String) null, 2, (Object) null));
            if (!StringsKt.isBlank(strTrimEnd4) && intOrNull != null) {
                return new NormalizedServerEndpoint(strNormalizeServerProtocol, strTrimEnd4, intOrNull.intValue(), normalizeStoredServerPath(strNormalizeStoredServerPath));
            }
        }
        if (z) {
            i = defaultPortForProtocol(strNormalizeServerProtocol);
        }
        return new NormalizedServerEndpoint(strNormalizeServerProtocol, strTrimEnd3, i, normalizeStoredServerPath(strNormalizeStoredServerPath));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String normalizeServerPath(String str) {
        String strNormalizeStoredServerPath = normalizeStoredServerPath(str);
        return strNormalizeStoredServerPath.length() == 0 ? "" : kb0.x("/", strNormalizeStoredServerPath);
    }

    private static final String normalizeServerProtocol(String str) {
        return StringsKt__StringsJVMKt.equals(str, "https", true) ? "https" : "http";
    }

    private static final String normalizeStoredServerPath(String str) {
        if (str == null) {
            str = "";
        }
        return StringsKt.trim(StringsKt.trim((CharSequence) str).toString(), '/');
    }
}
