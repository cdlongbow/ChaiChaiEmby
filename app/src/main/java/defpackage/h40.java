package defpackage;

import androidx.compose.material3.DefaultTwoRowsTopAppBarOverride;
import androidx.compose.material3.NavigationDrawerKt;
import androidx.compose.material3.internal.FloatProducer;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class h40 implements FloatProducer {
    public final /* synthetic */ int a;

    public /* synthetic */ h40(int i) {
        this.a = i;
    }

    @Override // androidx.compose.material3.internal.FloatProducer
    public final float invoke() {
        switch (this.a) {
            case 0:
                return DefaultTwoRowsTopAppBarOverride.TwoRowsTopAppBar$lambda$27$lambda$26$lambda$23$lambda$22();
            default:
                return NavigationDrawerKt.DrawerSheet_cm3T3N0$lambda$51$lambda$50();
        }
    }
}
