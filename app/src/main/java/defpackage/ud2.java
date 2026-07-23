package defpackage;

import androidx.media3.common.util.Util;
import java.util.concurrent.ThreadFactory;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class ud2 implements ThreadFactory {
    public final /* synthetic */ int a;
    public final /* synthetic */ String b;

    public /* synthetic */ ud2(String str, int i) {
        this.a = i;
        this.b = str;
    }

    @Override // java.util.concurrent.ThreadFactory
    public final Thread newThread(Runnable runnable) {
        int i = this.a;
        String str = this.b;
        switch (i) {
            case 0:
                return Util.lambda$newSingleThreadExecutor$3(str, runnable);
            default:
                return Util.lambda$newSingleThreadScheduledExecutor$4(str, runnable);
        }
    }
}
