package com.dh.myembyapp.data.api;

import android.util.Log;

import java.util.Base64;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Charsets;
import kotlin.text.StringsKt;
import kotlin.text.StringsKt;
import okhttp3.HttpUrl;
import okhttp3.Request;

/* JADX INFO: loaded from: classes4.dex */
public final class DandanplayAuthConfig {
    
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
            
            Integer.valueOf(Log.d("DanmakuAPI", "官方弹幕接口自动启用 withRelated=true: " + httpUrlBuild));
        } catch (Throwable th) {
            
            ResultKt.createFailure(th);
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
