package defpackage;

import androidx.compose.material3.DrawerPredictiveBackState;
import androidx.compose.material3.NavigationDrawerKt;
import androidx.compose.ui.graphics.GraphicsLayerScope;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class v71 implements Function1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ DrawerPredictiveBackState b;
    public final /* synthetic */ boolean c;

    public /* synthetic */ v71(DrawerPredictiveBackState drawerPredictiveBackState, boolean z, int i) {
        this.a = i;
        this.b = drawerPredictiveBackState;
        this.c = z;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.a) {
            case 0:
                return NavigationDrawerKt.predictiveBackDrawerChild$lambda$57(this.b, this.c, (GraphicsLayerScope) obj);
            default:
                return NavigationDrawerKt.predictiveBackDrawerContainer$lambda$56(this.b, this.c, (GraphicsLayerScope) obj);
        }
    }
}
