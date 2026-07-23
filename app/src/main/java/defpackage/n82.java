package defpackage;

import androidx.appcompat.widget.Toolbar;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class n82 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Toolbar b;

    public /* synthetic */ n82(Toolbar toolbar, int i) {
        this.a = i;
        this.b = toolbar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.a;
        Toolbar toolbar = this.b;
        switch (i) {
            case 0:
                toolbar.collapseActionView();
                break;
            default:
                toolbar.invalidateMenu();
                break;
        }
    }
}
