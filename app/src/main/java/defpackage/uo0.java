package defpackage;

import androidx.compose.material3.TimePickerKt;
import androidx.compose.ui.focus.FocusProperties;
import androidx.compose.ui.graphics.GraphicsLayerScope;
import androidx.compose.ui.semantics.SemanticsPropertyReceiver;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class uo0 implements Function1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ boolean b;

    public /* synthetic */ uo0(boolean z, int i) {
        this.a = i;
        this.b = z;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i = this.a;
        boolean z = this.b;
        switch (i) {
            case 0:
                GraphicsLayerScope graphicsLayerScope = (GraphicsLayerScope) obj;
                graphicsLayerScope.getClass();
                graphicsLayerScope.setAlpha(z ? 1.0f : 0.0f);
                return Unit.INSTANCE;
            case 1:
                NavOptionsBuilder navOptionsBuilder = (NavOptionsBuilder) obj;
                navOptionsBuilder.getClass();
                if (z) {
                    navOptionsBuilder.popUpTo("home", (Function1<? super PopUpToBuilder, Unit>) new ox0(13));
                } else {
                    navOptionsBuilder.popUpTo("aggregate_search", (Function1<? super PopUpToBuilder, Unit>) new ox0(21));
                }
                navOptionsBuilder.setLaunchSingleTop(true);
                return Unit.INSTANCE;
            case 2:
                return TimePickerKt.ToggleItem$lambda$49$lambda$48(z, (SemanticsPropertyReceiver) obj);
            default:
                FocusProperties focusProperties = (FocusProperties) obj;
                focusProperties.getClass();
                focusProperties.setCanFocus(z);
                return Unit.INSTANCE;
        }
    }
}
