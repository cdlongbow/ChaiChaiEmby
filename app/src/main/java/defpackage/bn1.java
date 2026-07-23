package defpackage;

import android.app.Activity;
import android.view.Window;
import androidx.compose.runtime.DisposableEffectResult;

/* JADX INFO: loaded from: classes4.dex */
public final class bn1 implements DisposableEffectResult {
    public final /* synthetic */ int a;
    public final /* synthetic */ Activity b;

    public /* synthetic */ bn1(Activity activity, int i) {
        this.a = i;
        this.b = activity;
    }

    @Override // androidx.compose.runtime.DisposableEffectResult
    public final void dispose() {
        Window window;
        int i = this.a;
        Activity activity = this.b;
        switch (i) {
            case 0:
                if (activity != null && (window = activity.getWindow()) != null) {
                    window.clearFlags(128);
                    break;
                }
                break;
            default:
                if (activity != null) {
                    tl0.a(activity, 0);
                }
                break;
        }
    }
}
