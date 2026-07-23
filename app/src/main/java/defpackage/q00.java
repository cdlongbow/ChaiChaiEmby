package defpackage;

import android.content.Context;
import android.net.Uri;
import androidx.media3.datasource.DataSourceBitmapLoader;
import com.airbnb.lottie.LottieAnimationView;
import java.util.HashMap;
import java.util.concurrent.Callable;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class q00 implements Callable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ q00(int i, Object obj, Object obj2) {
        this.a = i;
        this.b = obj;
        this.c = obj2;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        int i = this.a;
        Object obj = this.c;
        Object obj2 = this.b;
        switch (i) {
            case 0:
                return ((DataSourceBitmapLoader) obj2).lambda$decodeBitmap$1((byte[]) obj);
            case 1:
                return ((DataSourceBitmapLoader) obj2).lambda$loadBitmap$2((Uri) obj);
            default:
                LottieAnimationView lottieAnimationView = (LottieAnimationView) obj2;
                String str = (String) obj;
                if (!lottieAnimationView.k) {
                    return m11.b(lottieAnimationView.getContext(), str, null);
                }
                Context context = lottieAnimationView.getContext();
                HashMap map = m11.a;
                return m11.b(context, str, "asset_" + str);
        }
    }
}
