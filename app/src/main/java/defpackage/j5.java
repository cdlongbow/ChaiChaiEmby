package defpackage;

import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.material3.NavigationItemKt;
import androidx.compose.material3.internal.DraggableAnchorsConfig;
import androidx.compose.ui.graphics.GraphicsLayerScope;
import androidx.compose.ui.platform.InspectorInfo;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class j5 implements Function1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ float b;

    public /* synthetic */ j5(float f, int i) {
        this.a = i;
        this.b = f;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i = this.a;
        float f = this.b;
        switch (i) {
            case 0:
                GraphicsLayerScope graphicsLayerScope = (GraphicsLayerScope) obj;
                graphicsLayerScope.getClass();
                graphicsLayerScope.setScaleX(f);
                graphicsLayerScope.setScaleY(f);
                return Unit.INSTANCE;
            case 1:
                GraphicsLayerScope graphicsLayerScope2 = (GraphicsLayerScope) obj;
                graphicsLayerScope2.getClass();
                graphicsLayerScope2.setScaleX(f);
                graphicsLayerScope2.setScaleY(f);
                return Unit.INSTANCE;
            case 2:
                GraphicsLayerScope graphicsLayerScope3 = (GraphicsLayerScope) obj;
                graphicsLayerScope3.getClass();
                graphicsLayerScope3.setScaleX(f);
                graphicsLayerScope3.setScaleY(f);
                return Unit.INSTANCE;
            case 3:
                GraphicsLayerScope graphicsLayerScope4 = (GraphicsLayerScope) obj;
                graphicsLayerScope4.getClass();
                graphicsLayerScope4.setScaleX(f);
                graphicsLayerScope4.setScaleY(f);
                return Unit.INSTANCE;
            case 4:
                GraphicsLayerScope graphicsLayerScope5 = (GraphicsLayerScope) obj;
                graphicsLayerScope5.getClass();
                graphicsLayerScope5.setScaleX(f);
                graphicsLayerScope5.setScaleY(f);
                return Unit.INSTANCE;
            case 5:
                return NavigationItemKt.placeAnimatedLabelAndIcon_2QYhCQ8$lambda$40$lambda$39(f, (GraphicsLayerScope) obj);
            case 6:
                return PaddingKt.padding_3ABfNKs$lambda$0(f, (InspectorInfo) obj);
            case 7:
                return Boolean.valueOf(SplitAttributes.SplitType.Companion.ratio$lambda$0(f, ((Float) obj).floatValue()));
            default:
                return WideNavigationRailKt.ModalWideNavigationRailContent_pU6N4AM$lambda$23$lambda$22$lambda$21(f, 0.0f, (DraggableAnchorsConfig) obj);
        }
    }
}
