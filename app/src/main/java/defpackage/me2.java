package defpackage;

import android.view.ViewConfiguration;
import androidx.core.util.Supplier;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class me2 implements Supplier {
    public final /* synthetic */ int a;
    public final /* synthetic */ ViewConfiguration b;

    public /* synthetic */ me2(ViewConfiguration viewConfiguration, int i) {
        this.a = i;
        this.b = viewConfiguration;
    }

    @Override // androidx.core.util.Supplier
    public final Object get() {
        int scaledMaximumFlingVelocity;
        int i = this.a;
        ViewConfiguration viewConfiguration = this.b;
        switch (i) {
            case 0:
                scaledMaximumFlingVelocity = viewConfiguration.getScaledMaximumFlingVelocity();
                break;
            default:
                scaledMaximumFlingVelocity = viewConfiguration.getScaledMinimumFlingVelocity();
                break;
        }
        return Integer.valueOf(scaledMaximumFlingVelocity);
    }
}
