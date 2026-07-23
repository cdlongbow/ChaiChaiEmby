package com.dh.myembyapp.data.api;

import android.util.Log;

import java.util.Base64;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Charsets;
import kotlin.text.StringsKt;
import kotlin.text.StringsKt;
import okhttp3.HttpUrl;
import okhttp3.Request;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\bÁ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u000b\u001a\u00020\f2\b\u0010\r\u001a\u0004\u0018\u00010\u0005J\u000e\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u000fJ\u0010\u0010\u0011\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u000fH\u0002J&\u0010\u0012\u001a\u00020\u00052\u0006\u0010\u0013\u001a\u00020\u00052\u0006\u0010\u0014\u001a\u00020\u00052\u0006\u0010\u0015\u001a\u00020\u00052\u0006\u0010\u0016\u001a\u00020\u0005R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u0017"}, d2 = {"Lcom/dh/myembyapp/data/api/DandanplayAuthConfig;", "", "<init>", "()V", "OFFICIAL_API_HOST", "", "COMMENT_API_PREFIX", "WITH_RELATED", "X_APP_ID", "X_TIMESTAMP", "X_SIGNATURE", "isOfficialApiHost", "", "host", "addAuthHeadersIfNeeded", "Lokhttp3/Request;", "request", "addWithRelatedIfNeeded", "buildSignature", "appId", "timestamp", "path", "appSecret", "app"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class DandanplayAuthConfig {
    public static final int $stable = 0;
    private static final String COMMENT_API_PREFIX = "/api/v2/comment/";
    public static final DandanplayAuthConfig INSTANCE = new DandanplayAuthConfig();
    private static final String OFFICIAL_API_HOST = "api.dandanplay.net";
    private static final String WITH_RELATED = "withRelated";
    private static final String X_APP_ID = "X-AppId";
    private static final String X_SIGNATURE = "X-Signature";
    private static final String X_TIMESTAMP = "X-Timestamp";

    private DandanplayAuthConfig() {
    }

    private final Request addWithRelatedIfNeeded(Request request) {
        if (!Intrinsics.areEqual(request.method(), Net.HttpMethods.GET) || !StringsKt__StringsJVMKt.startsWith$default(request.url().encodedPath(), COMMENT_API_PREFIX, false, 2, null) || request.url().queryParameter(WITH_RELATED) != null) {
            return request;
        }
        HttpUrl httpUrlBuild = request.url().newBuilder().addQueryParameter(WITH_RELATED, "true").build();
        try {
            Result.Companion companion = Result.INSTANCE;
            Result.m8825constructorimpl(Integer.valueOf(Log.d("DanmakuAPI", "官方弹幕接口自动启用 withRelated=true: " + httpUrlBuild)));
        } catch (Throwable th) {
            Result.Companion companion2 = Result.INSTANCE;
            Result.m8825constructorimpl(ResultKt.createFailure(th));
        }
        return request.newBuilder().url(httpUrlBuild).build();
    }

    public final Request addAuthHeadersIfNeeded(Request request) throws NoSuchAlgorithmException {
        request.getClass();
        if (!isOfficialApiHost(request.url().host())) {
            return request;
        }
        Request requestAddWithRelatedIfNeeded = addWithRelatedIfNeeded(request);
        String string = StringsKt.trim((CharSequence) "qf9a338da5").toString();
        String string2 = StringsKt.trim((CharSequence) "kyu75iHRIpjRgab3Fd8BeUFT6yIqUiCa").toString();
        if (StringsKt.isBlank(string) || StringsKt.isBlank(string2)) {
            Log.w("DanmakuAPI", "弹弹play官方API鉴权信息未配置，跳过鉴权请求头");
            return requestAddWithRelatedIfNeeded;
        }
        String strValueOf = String.valueOf(System.currentTimeMillis() / 1000);
        return requestAddWithRelatedIfNeeded.newBuilder().header(X_APP_ID, string).header(X_TIMESTAMP, strValueOf).header(X_SIGNATURE, buildSignature(string, strValueOf, requestAddWithRelatedIfNeeded.url().encodedPath(), string2)).build();
    }

    public final String buildSignature(String appId, String timestamp, String path, String appSecret) throws NoSuchAlgorithmException {
        appId.getClass();
        timestamp.getClass();
        path.getClass();
        appSecret.getClass();
        String str = appId + timestamp + path + appSecret;
        MessageDigest messageDigest = MessageDigest.getInstance("SHA-256");
        byte[] bytes = str.getBytes(Charsets.UTF_8);
        bytes.getClass();
        String strEncodeToString = Base64.getEncoder().encodeToString(messageDigest.digest(bytes));
        strEncodeToString.getClass();
        return strEncodeToString;
    }

    public final boolean isOfficialApiHost(String host) {
        return StringsKt__StringsJVMKt.equals(host, OFFICIAL_API_HOST, true);
    }
}
