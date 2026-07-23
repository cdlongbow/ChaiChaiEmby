package defpackage;

import android.content.IntentSender;
import androidx.activity.ComponentActivity$activityResultRegistry$1;
import androidx.activity.result.contract.ActivityResultContract;
import androidx.media3.common.util.ListenerSet;
import androidx.media3.exoplayer.drm.DrmSessionEventListener;
import java.util.concurrent.CopyOnWriteArraySet;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class a3 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ a3(DrmSessionEventListener.EventDispatcher eventDispatcher, DrmSessionEventListener drmSessionEventListener, int i) {
        this.a = 4;
        this.c = eventDispatcher;
        this.d = drmSessionEventListener;
        this.b = i;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.a;
        Object obj = this.d;
        int i2 = this.b;
        Object obj2 = this.c;
        switch (i) {
            case 0:
                ((b3) obj2).u(i2, (f01) obj);
                break;
            case 1:
                ComponentActivity$activityResultRegistry$1.onLaunch$lambda$0((ComponentActivity$activityResultRegistry$1) obj2, i2, (ActivityResultContract.SynchronousResult) obj);
                break;
            case 2:
                ComponentActivity$activityResultRegistry$1.onLaunch$lambda$1((ComponentActivity$activityResultRegistry$1) obj2, i2, (IntentSender.SendIntentException) obj);
                break;
            case 3:
                ((DeviceProfileWriter) obj2).lambda$result$0(i2, obj);
                break;
            case 4:
                ((DrmSessionEventListener.EventDispatcher) obj2).lambda$drmSessionAcquired$0((DrmSessionEventListener) obj, i2);
                break;
            default:
                ListenerSet.lambda$queueEvent$0((CopyOnWriteArraySet) obj2, i2, (ListenerSet.Event) obj);
                break;
        }
    }

    public /* synthetic */ a3(Object obj, int i, Object obj2, int i2) {
        this.a = i2;
        this.c = obj;
        this.b = i;
        this.d = obj2;
    }
}
