package defpackage;

import androidx.compose.foundation.gestures.Draggable2DKt;
import androidx.compose.foundation.gestures.DraggableKt;
import androidx.compose.foundation.gestures.Scrollable2DStateKt;
import androidx.compose.foundation.gestures.ScrollableStateKt;
import androidx.compose.material3.DefaultSingleRowTopAppBarOverride;
import androidx.compose.runtime.DisposableEffectScope;
import androidx.compose.runtime.State;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.graphics.GraphicsLayerScope;
import androidx.compose.ui.graphics.drawscope.DrawScope;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class p4 implements Function1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ State b;

    public /* synthetic */ p4(State state, int i) {
        this.a = i;
        this.b = state;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i = this.a;
        State state = this.b;
        switch (i) {
            case 0:
                GraphicsLayerScope graphicsLayerScope = (GraphicsLayerScope) obj;
                graphicsLayerScope.getClass();
                graphicsLayerScope.setTranslationY(((Number) state.getValue()).floatValue());
                return Unit.INSTANCE;
            case 1:
                return DefaultSingleRowTopAppBarOverride.SingleRowTopAppBar$lambda$7$lambda$6(state, (DrawScope) obj);
            case 2:
                return Draggable2DKt.rememberDraggable2DState$lambda$0$0(state, (Offset) obj);
            case 3:
                return DraggableKt.rememberDraggableState$lambda$0$0(state, ((Float) obj).floatValue());
            case 4:
                GraphicsLayerScope graphicsLayerScope2 = (GraphicsLayerScope) obj;
                graphicsLayerScope2.getClass();
                graphicsLayerScope2.setRotationZ(((Number) state.getValue()).floatValue());
                return Unit.INSTANCE;
            case 5:
                ((DisposableEffectScope) obj).getClass();
                return new o2(state, 12);
            case 6:
                return Scrollable2DStateKt.rememberScrollable2DState$lambda$0$0(state, (Offset) obj);
            case 7:
                return Float.valueOf(ScrollableStateKt.rememberScrollableState$lambda$0$0(state, ((Float) obj).floatValue()));
            default:
                GraphicsLayerScope graphicsLayerScope3 = (GraphicsLayerScope) obj;
                graphicsLayerScope3.getClass();
                graphicsLayerScope3.setTranslationY(((Number) state.getValue()).floatValue());
                return Unit.INSTANCE;
        }
    }
}
