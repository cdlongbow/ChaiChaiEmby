package defpackage;

import androidx.media3.common.util.WakeLockManager;
import androidx.media3.common.util.WifiLockManager;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class qe2 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ boolean c;
    public final /* synthetic */ Object d;

    public /* synthetic */ qe2(Object obj, boolean z, boolean z2, int i) {
        this.a = i;
        this.d = obj;
        this.b = z;
        this.c = z2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.a;
        boolean z = this.c;
        boolean z2 = this.b;
        Object obj = this.d;
        switch (i) {
            case 0:
                ((WakeLockManager) obj).lambda$postUpdateWakeLock$0(z2, z);
                break;
            default:
                ((WifiLockManager) obj).lambda$postUpdateWifiLock$0(z2, z);
                break;
        }
    }
}
