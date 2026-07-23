package defpackage;

import androidx.media3.common.util.BackgroundThreadStateHandler;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class zg implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ BackgroundThreadStateHandler b;
    public final /* synthetic */ Object c;

    public /* synthetic */ zg(BackgroundThreadStateHandler backgroundThreadStateHandler, Object obj, int i) {
        this.a = i;
        this.b = backgroundThreadStateHandler;
        this.c = obj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.a;
        Object obj = this.c;
        BackgroundThreadStateHandler backgroundThreadStateHandler = this.b;
        switch (i) {
            case 0:
                backgroundThreadStateHandler.lambda$setStateInBackground$2(obj);
                break;
            default:
                backgroundThreadStateHandler.lambda$updateStateAsync$0(obj);
                break;
        }
    }
}
