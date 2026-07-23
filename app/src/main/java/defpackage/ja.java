package defpackage;

import androidx.compose.animation.core.Animatable;
import androidx.compose.foundation.text.selection.AndroidSelectionHandles_androidKt;
import androidx.compose.material3.ModalWideNavigationRailState;
import androidx.compose.material3.RailPredictiveBackState;
import androidx.compose.ui.graphics.ColorFilter;
import androidx.compose.ui.graphics.GraphicsLayerScope;
import androidx.compose.ui.graphics.ImageBitmap;
import androidx.compose.ui.graphics.drawscope.ContentDrawScope;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class ja implements Function1 {
    public final /* synthetic */ int a = 1;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;

    public /* synthetic */ ja(Animatable animatable, ModalWideNavigationRailState modalWideNavigationRailState, RailPredictiveBackState railPredictiveBackState, boolean z) {
        this.c = animatable;
        this.d = modalWideNavigationRailState;
        this.e = railPredictiveBackState;
        this.b = z;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.a) {
            case 0:
                return AndroidSelectionHandles_androidKt.drawSelectionHandle$lambda$0$0$0$0((Function0) this.c, this.b, (ImageBitmap) this.d, (ColorFilter) this.e, (ContentDrawScope) obj);
            default:
                return WideNavigationRailKt.ModalWideNavigationRailContent_pU6N4AM$lambda$20$lambda$19((Animatable) this.c, (ModalWideNavigationRailState) this.d, (RailPredictiveBackState) this.e, this.b, (GraphicsLayerScope) obj);
        }
    }

    public /* synthetic */ ja(Function0 function0, boolean z, ImageBitmap imageBitmap, ColorFilter colorFilter) {
        this.c = function0;
        this.b = z;
        this.d = imageBitmap;
        this.e = colorFilter;
    }
}
