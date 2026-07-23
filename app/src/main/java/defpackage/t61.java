package defpackage;

import android.util.Log;

import com.dh.myembyapp.MyEmbyApp;
import com.dh.myembyapp.data.api.RetrofitClient;
import com.dh.myembyapp.data.model.ServerConfig;
import java.io.IOException;
import kotlin.text.StringsKt;
import kotlin.text.StringsKt;
import kotlin.text.StringsKt;
import okhttp3.HttpUrl;
import okhttp3.Interceptor;
import okhttp3.Request;
import okhttp3.Response;

/* JADX INFO: loaded from: classes4.dex */
public final class t61 implements Interceptor {
    public final /* synthetic */ MyEmbyApp a;

    public t61(MyEmbyApp myEmbyApp) {
        this.a = myEmbyApp;
    }

    /* JADX WARN: Code duplicated, block: B:18:0x0036  */
    /* JADX WARN: Code duplicated, block: B:20:0x0043  */
    /* JADX WARN: Code duplicated, block: B:30:0x0075  */
    /* JADX WARN: Code duplicated, block: B:33:0x0079  */
    @Override // okhttp3.Interceptor
    public final Response intercept(Interceptor.Chain chain) throws IOException {
        RetrofitClient retrofitClient;
        HttpUrl httpUrl;
        String accessToken;
        Request requestBuild;
        String accessToken2;
        String deviceId;
        chain.getClass();
        Request request = chain.request();
        HttpUrl httpUrlUrl = request.url();
        int i = MyEmbyApp.j;
        ServerConfig serverConfigG = this.a.g(httpUrlUrl);
        q61 q61Var = null;
        q61Var = null;
        q61Var = null;
        q61Var = null;
        if (serverConfigG == null || (accessToken2 = serverConfigG.getAccessToken()) == null) {
            HttpUrl.Companion companion = HttpUrl.INSTANCE;
            retrofitClient = RetrofitClient.INSTANCE;
            httpUrl = companion.parse(retrofitClient.getBaseUrl());
            if (httpUrl != null && StringsKt__StringsJVMKt.equals(httpUrlUrl.host(), httpUrl.host(), true) && httpUrlUrl.port() == httpUrl.port()) {
                accessToken = retrofitClient.getAccessToken();
                if (StringsKt.isBlank(accessToken)) {
                    accessToken = null;
                }
                if (accessToken != null) {
                    q61Var = new q61(accessToken, retrofitClient.getDeviceId());
                }
            }
        } else {
            if (StringsKt.isBlank(accessToken2)) {
                accessToken2 = null;
            }
            if (accessToken2 != null) {
                String deviceId2 = serverConfigG.getDeviceId();
                if (deviceId2 == null) {
                    deviceId = RetrofitClient.INSTANCE.getDeviceId();
                } else {
                    deviceId = StringsKt.isBlank(deviceId2) ? null : deviceId2;
                    if (deviceId == null) {
                        deviceId = RetrofitClient.INSTANCE.getDeviceId();
                    }
                }
                q61Var = new q61(accessToken2, deviceId);
            } else {
                HttpUrl.Companion companion2 = HttpUrl.INSTANCE;
                retrofitClient = RetrofitClient.INSTANCE;
                httpUrl = companion2.parse(retrofitClient.getBaseUrl());
                if (httpUrl != null) {
                    accessToken = retrofitClient.getAccessToken();
                    if (StringsKt.isBlank(accessToken)) {
                        accessToken = null;
                    }
                    if (accessToken != null) {
                        q61Var = new q61(accessToken, retrofitClient.getDeviceId());
                    }
                }
            }
        }
        if (q61Var != null) {
            String str = q61Var.a;
            Request.Builder builderHeader = request.newBuilder().header("X-Emby-Token", str);
            RetrofitClient retrofitClient2 = RetrofitClient.INSTANCE;
            String clientName = retrofitClient2.getClientName();
            String str2 = q61Var.b;
            StringBuilder sbZ = kb0.z("MediaBrowser Token=\"", str, "\", Client=\"", clientName, "\", Device=\"AndroidTV\", DeviceId=\"");
            sbZ.append(str2);
            sbZ.append("\", Version=\"0.3.0\"");
            requestBuild = builderHeader.header("X-Emby-Authorization", sbZ.toString()).header(HttpRequestHeader.UserAgent, retrofitClient2.buildUserAgent("0.3.0")).header(HttpRequestHeader.Accept, "*/*").header(HttpRequestHeader.AcceptLanguage, "zh-CN,zh;q=0.9,en-US;q=0.8,en;q=0.7").build();
        } else {
            requestBuild = request.newBuilder().header(HttpRequestHeader.UserAgent, RetrofitClient.INSTANCE.buildUserAgent("0.3.0")).build();
        }
        Response responseProceed = chain.proceed(requestBuild);
        if (StringsKt__StringsKt.contains$default(request.url().getUrl(), (CharSequence) "/Images/", false, 2, (Object) null) && responseProceed.code() != 200) {
            Log.e("ImageLoader", "图片加载失败: " + request.url() + ", 状态码: " + responseProceed.code());
        }
        return responseProceed;
    }
}
