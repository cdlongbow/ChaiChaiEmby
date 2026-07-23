package defpackage;

import com.dh.myembyapp.MyEmbyApp;
import kotlin.jvm.functions.Function0;
import okhttp3.OkHttpClient;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class o61 implements Function0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ OkHttpClient b;

    public /* synthetic */ o61(OkHttpClient okHttpClient, int i) {
        this.a = i;
        this.b = okHttpClient;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int i = this.a;
        OkHttpClient okHttpClient = this.b;
        switch (i) {
            case 0:
                int i2 = MyEmbyApp.j;
                break;
        }
        return okHttpClient;
    }
}
