package defpackage;

import com.dh.myembyapp.MyEmbyApp;
import com.dh.myembyapp.data.api.DanmakuApiClient;
import com.dh.myembyapp.data.api.ExternalHttpClient;
import com.dh.myembyapp.data.api.RetrofitClient;
import com.dh.myembyapp.server.BackupRouteConfigServerManager;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.SSLSession;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class k3 implements HostnameVerifier {
    public final /* synthetic */ int a;

    public /* synthetic */ k3(int i) {
        this.a = i;
    }

    @Override // javax.net.ssl.HostnameVerifier
    public final boolean verify(String str, SSLSession sSLSession) {
        switch (this.a) {
            case 0:
                return true;
            case 1:
                return BackupRouteConfigServerManager.createFetchClient$lambda$0(str, sSLSession);
            case 2:
                return DanmakuApiClient.createServiceForUrl$lambda$0$4$0(str, sSLSession);
            case 3:
                return ExternalHttpClient.buildClient$lambda$0(str, sSLSession);
            case 4:
                int i = MyEmbyApp.j;
                return true;
            case 5:
                return RetrofitClient.getOkHttpClientForExoPlayer$lambda$1(str, sSLSession);
            case 6:
                return RetrofitClient.getOkHttpClientForDlna$lambda$1(str, sSLSession);
            default:
                return RetrofitClient.getOkHttpClient$lambda$0(str, sSLSession);
        }
    }
}
