package defpackage;

import androidx.compose.material3.DrawerState;
import androidx.compose.material3.NavigationDrawerKt;
import androidx.compose.ui.semantics.SemanticsPropertyReceiver;
import kotlin.jvm.functions.Function1;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class s71 implements Function1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ String b;
    public final /* synthetic */ DrawerState c;
    public final /* synthetic */ CoroutineScope d;

    public /* synthetic */ s71(String str, DrawerState drawerState, CoroutineScope coroutineScope, int i) {
        this.a = i;
        this.b = str;
        this.c = drawerState;
        this.d = coroutineScope;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i = this.a;
        CoroutineScope coroutineScope = this.d;
        DrawerState drawerState = this.c;
        String str = this.b;
        SemanticsPropertyReceiver semanticsPropertyReceiver = (SemanticsPropertyReceiver) obj;
        switch (i) {
            case 0:
                return NavigationDrawerKt.ModalNavigationDrawer_FHprtrg$lambda$24$lambda$22$lambda$21(str, drawerState, coroutineScope, semanticsPropertyReceiver);
            default:
                return NavigationDrawerKt.DismissibleNavigationDrawer$lambda$38$lambda$36$lambda$33$lambda$32(str, drawerState, coroutineScope, semanticsPropertyReceiver);
        }
    }
}
