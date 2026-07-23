package defpackage;

import com.dh.myembyapp.MyEmbyApp;
import com.dh.myembyapp.data.api.DanmakuApiClient;
import com.dh.myembyapp.data.api.RetrofitClient;
import okhttp3.Interceptor;
import okhttp3.Response;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class iw implements Interceptor {
    public final /* synthetic */ int a;

    public /* synthetic */ iw(int i) {
        this.a = i;
    }

    @Override // okhttp3.Interceptor
    public final Response intercept(Interceptor.Chain chain) {
        switch (this.a) {
            case 0:
                return DanmakuApiClient.createServiceForUrl$lambda$0$3(chain);
            case 1:
                int i = MyEmbyApp.j;
                chain.getClass();
                return chain.proceed(chain.request()).newBuilder().header("Cache-Control", "public, max-age=604800").build();
            case 2:
                return RetrofitClient.embyPrefixInterceptor$lambda$0(chain);
            case 3:
                return RetrofitClient.authInterceptor$lambda$0(chain);
            default:
                return RetrofitClient.exoPlayerAuthInterceptor$lambda$0(chain);
        }
    }
}
