package defpackage;

import androidx.media3.exoplayer.audio.AudioRendererEventListener;
import androidx.media3.exoplayer.offline.DownloadHelper;
import androidx.media3.exoplayer.source.preload.PreCacheHelper;
import com.google.zxing.client.android.AmbientLightManager;
import com.journeyapps.barcodescanner.camera.CameraInstance;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class b9 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ Object c;

    public /* synthetic */ b9(int i, Object obj, boolean z) {
        this.a = i;
        this.c = obj;
        this.b = z;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.a;
        boolean z = this.b;
        Object obj = this.c;
        switch (i) {
            case 0:
                ((AmbientLightManager) obj).lambda$setTorch$0(z);
                break;
            case 1:
                ((AudioRendererEventListener.EventDispatcher) obj).lambda$skipSilenceEnabledChanged$7(z);
                break;
            case 2:
                ((CameraInstance) obj).lambda$setTorch$0(z);
                break;
            case 3:
                ((DownloadHelper) obj).lambda$onMediaPrepared$2(z);
                break;
            default:
                ((PreCacheHelper) obj).lambda$release$2(z);
                break;
        }
    }
}
