package defpackage;

import android.window.OnBackInvokedCallback;
import androidx.navigationevent.OnBackInvokedInput;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class r91 implements OnBackInvokedCallback {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ r91(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    public final void onBackInvoked() {
        int i = this.a;
        Object obj = this.b;
        switch (i) {
            case 0:
                ((OnBackInvokedInput) obj).dispatchOnBackCompleted();
                break;
            default:
                ((Runnable) obj).run();
                break;
        }
    }
}
