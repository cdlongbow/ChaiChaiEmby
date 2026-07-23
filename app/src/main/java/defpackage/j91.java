package defpackage;

import androidx.media3.exoplayer.drm.DrmSession;
import androidx.media3.exoplayer.drm.OfflineLicenseHelper;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class j91 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ OfflineLicenseHelper b;
    public final /* synthetic */ DrmSession c;
    public final /* synthetic */ fz1 d;

    public /* synthetic */ j91(fz1 fz1Var, DrmSession drmSession, OfflineLicenseHelper offlineLicenseHelper) {
        this.a = 1;
        this.b = offlineLicenseHelper;
        this.c = drmSession;
        this.d = fz1Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.a;
        DrmSession drmSession = this.c;
        fz1 fz1Var = this.d;
        OfflineLicenseHelper offlineLicenseHelper = this.b;
        switch (i) {
            case 0:
                offlineLicenseHelper.lambda$getLicenseDurationRemainingSec$0(fz1Var, drmSession);
                break;
            case 1:
                offlineLicenseHelper.lambda$acquireFirstSessionOnHandlerThread$3(drmSession, fz1Var);
                break;
            default:
                offlineLicenseHelper.lambda$acquireSessionAndGetOfflineLicenseKeySetIdOnHandlerThread$1(fz1Var, drmSession);
                break;
        }
    }

    public /* synthetic */ j91(OfflineLicenseHelper offlineLicenseHelper, fz1 fz1Var, DrmSession drmSession, int i) {
        this.a = i;
        this.b = offlineLicenseHelper;
        this.d = fz1Var;
        this.c = drmSession;
    }
}
