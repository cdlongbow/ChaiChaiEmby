package defpackage;

import com.dh.myembyapp.dlna.DlnaService;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class ob0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ DlnaService b;

    public /* synthetic */ ob0(DlnaService dlnaService, int i) {
        this.a = i;
        this.b = dlnaService;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.a;
        DlnaService dlnaService = this.b;
        switch (i) {
            case 0:
                DlnaService.onStartCommand$lambda$0(dlnaService);
                break;
            case 1:
                DlnaService.sendSsdpNotify$lambda$0(dlnaService);
                break;
            default:
                DlnaService.startSsdpListener$lambda$0(dlnaService);
                break;
        }
    }
}
