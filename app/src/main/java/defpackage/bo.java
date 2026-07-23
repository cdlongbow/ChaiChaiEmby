package defpackage;

import com.journeyapps.barcodescanner.CaptureManager;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class bo implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ CaptureManager b;

    public /* synthetic */ bo(CaptureManager captureManager, int i) {
        this.a = i;
        this.b = captureManager;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.a;
        CaptureManager captureManager = this.b;
        switch (i) {
            case 0:
                captureManager.lambda$new$0();
                break;
            default:
                captureManager.returnResultTimeout();
                break;
        }
    }
}
