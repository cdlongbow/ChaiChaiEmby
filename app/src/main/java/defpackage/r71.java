package defpackage;

import androidx.compose.material3.DrawerState;
import androidx.compose.material3.NavigationDrawerKt;
import kotlin.jvm.functions.Function0;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class r71 implements Function0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ DrawerState b;
    public final /* synthetic */ CoroutineScope c;

    public /* synthetic */ r71(DrawerState drawerState, CoroutineScope coroutineScope, int i) {
        this.a = i;
        this.b = drawerState;
        this.c = coroutineScope;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        boolean zModalNavigationDrawer_FHprtrg$lambda$24$lambda$22$lambda$21$lambda$20;
        int i = this.a;
        CoroutineScope coroutineScope = this.c;
        DrawerState drawerState = this.b;
        switch (i) {
            case 0:
                zModalNavigationDrawer_FHprtrg$lambda$24$lambda$22$lambda$21$lambda$20 = NavigationDrawerKt.ModalNavigationDrawer_FHprtrg$lambda$24$lambda$22$lambda$21$lambda$20(drawerState, coroutineScope);
                break;
            default:
                zModalNavigationDrawer_FHprtrg$lambda$24$lambda$22$lambda$21$lambda$20 = NavigationDrawerKt.DismissibleNavigationDrawer$lambda$38$lambda$36$lambda$33$lambda$32$lambda$31(drawerState, coroutineScope);
                break;
        }
        return Boolean.valueOf(zModalNavigationDrawer_FHprtrg$lambda$24$lambda$22$lambda$21$lambda$20);
    }
}
