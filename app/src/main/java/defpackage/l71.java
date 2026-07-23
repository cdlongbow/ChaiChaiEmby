package defpackage;

import androidx.compose.material3.NavigationBarKt;
import androidx.compose.material3.NavigationRailKt;
import androidx.compose.ui.graphics.GraphicsLayerScope;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class l71 implements Function1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ Function0 c;

    public /* synthetic */ l71(boolean z, Function0 function0, int i) {
        this.a = i;
        this.b = z;
        this.c = function0;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.a) {
            case 0:
                return NavigationBarKt.NavigationBarItemLayout$lambda$22$lambda$20$lambda$19(this.b, this.c, (GraphicsLayerScope) obj);
            default:
                return NavigationRailKt.NavigationRailItemLayout$lambda$17$lambda$15$lambda$14(this.b, this.c, (GraphicsLayerScope) obj);
        }
    }
}
