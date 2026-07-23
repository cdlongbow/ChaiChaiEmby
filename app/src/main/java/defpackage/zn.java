package defpackage;

import com.journeyapps.barcodescanner.camera.CameraInstance;
import com.journeyapps.barcodescanner.camera.PreviewCallback;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class zn implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ CameraInstance b;
    public final /* synthetic */ PreviewCallback c;

    public /* synthetic */ zn(CameraInstance cameraInstance, PreviewCallback previewCallback, int i) {
        this.a = i;
        this.b = cameraInstance;
        this.c = previewCallback;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.a;
        PreviewCallback previewCallback = this.c;
        CameraInstance cameraInstance = this.b;
        switch (i) {
            case 0:
                cameraInstance.lambda$requestPreview$3(previewCallback);
                break;
            default:
                cameraInstance.lambda$requestPreview$2(previewCallback);
                break;
        }
    }
}
