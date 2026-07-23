package defpackage;

import androidx.media3.common.util.WakeLockManager;
import androidx.media3.common.util.WifiLockManager;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class re2 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ AtomicBoolean b;
    public final /* synthetic */ boolean c;
    public final /* synthetic */ boolean d;
    public final /* synthetic */ Object e;

    public /* synthetic */ re2(Object obj, AtomicBoolean atomicBoolean, boolean z, boolean z2, int i) {
        this.a = i;
        this.e = obj;
        this.b = atomicBoolean;
        this.c = z;
        this.d = z2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.a;
        boolean z = this.d;
        boolean z2 = this.c;
        AtomicBoolean atomicBoolean = this.b;
        Object obj = this.e;
        switch (i) {
            case 0:
                ((WakeLockManager) obj).lambda$postUpdateWakeLock$2(atomicBoolean, z2, z);
                break;
            default:
                ((WifiLockManager) obj).lambda$postUpdateWifiLock$2(atomicBoolean, z2, z);
                break;
        }
    }
}
