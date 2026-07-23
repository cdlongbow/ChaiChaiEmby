package defpackage;

import android.net.ConnectivityManager;
import android.net.NetworkCapabilities;
import android.net.NetworkInfo;

/* JADX INFO: loaded from: classes3.dex */
public final class ju implements iu {
    public final /* synthetic */ int b;
    public final ConnectivityManager c;

    public /* synthetic */ ju(ConnectivityManager connectivityManager, int i) {
        this.b = i;
        this.c = connectivityManager;
    }

    @Override // defpackage.iu
    public final boolean a() {
        int i = this.b;
        ConnectivityManager connectivityManager = this.c;
        switch (i) {
            case 0:
                NetworkInfo activeNetworkInfo = connectivityManager.getActiveNetworkInfo();
                return activeNetworkInfo != null && activeNetworkInfo.isConnectedOrConnecting();
            default:
                NetworkCapabilities networkCapabilities = connectivityManager.getNetworkCapabilities(connectivityManager.getActiveNetwork());
                return networkCapabilities != null && networkCapabilities.hasCapability(12);
        }
    }
}
