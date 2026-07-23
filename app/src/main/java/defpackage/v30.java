package defpackage;


import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;

/* JADX INFO: loaded from: classes4.dex */
public final class v30 {
    public final u30 a(String str) throws IOException {
        HttpURLConnection httpURLConnection = (HttpURLConnection) new URL(str).openConnection();
        httpURLConnection.setRequestMethod(Net.HttpMethods.GET);
        httpURLConnection.connect();
        return new u30(httpURLConnection);
    }
}
