package defpackage;

import androidx.compose.ui.platform.AndroidComposeView;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class k9 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ AndroidComposeView b;

    public /* synthetic */ k9(AndroidComposeView androidComposeView, int i) {
        this.a = i;
        this.b = androidComposeView;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.a;
        AndroidComposeView androidComposeView = this.b;
        switch (i) {
            case 0:
                AndroidComposeView.outOfFrameRunnable$lambda$0(androidComposeView);
                break;
            case 1:
                AndroidComposeView.sendHoverExitEvent$lambda$0(androidComposeView);
                break;
            case 2:
                androidComposeView.invalidateDescendants();
                break;
            default:
                androidComposeView.invalidateDescendants();
                break;
        }
    }
}
