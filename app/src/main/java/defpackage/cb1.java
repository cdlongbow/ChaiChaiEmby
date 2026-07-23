package defpackage;


import com.dh.myembyapp.data.api.RetrofitClient;
import com.dh.myembyapp.data.model.ServerConfig;
import okhttp3.Interceptor;
import okhttp3.Request;
import okhttp3.Response;

/* JADX INFO: loaded from: classes4.dex */
public final class cb1 implements Interceptor {
    public final /* synthetic */ ServerConfig a;

    public cb1(ServerConfig serverConfig) {
        this.a = serverConfig;
    }

    @Override // okhttp3.Interceptor
    public final Response intercept(Interceptor.Chain chain) {
        chain.getClass();
        Request.Builder builderNewBuilder = chain.request().newBuilder();
        String accessToken = this.a.getAccessToken();
        if (accessToken == null) {
            accessToken = "";
        }
        return chain.proceed(builderNewBuilder.header("X-Emby-Token", accessToken).header(HttpRequestHeader.Accept, "application/json").header(HttpRequestHeader.AcceptLanguage, "zh-CN,zh;q=0.9,en-US;q=0.8,en;q=0.7").header(HttpRequestHeader.UserAgent, RetrofitClient.buildUserAgent$default(RetrofitClient.INSTANCE, null, 1, null)).build());
    }
}
