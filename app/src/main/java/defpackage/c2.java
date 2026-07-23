package defpackage;

import androidx.compose.foundation.lazy.layout.LazyLayoutKt;
import androidx.compose.foundation.lazy.layout.LazyLayoutMeasurePolicy;
import androidx.compose.foundation.lazy.layout.LazyLayoutPrefetchState;
import androidx.compose.foundation.text.selection.Selection;
import androidx.compose.foundation.text.selection.SelectionContainerKt;
import androidx.compose.material3.ColorScheme;
import androidx.compose.material3.IconKt;
import androidx.compose.material3.MaterialThemeKt;
import androidx.compose.material3.Shapes;
import androidx.compose.material3.Typography;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.ColorProducer;
import androidx.compose.ui.graphics.painter.Painter;
import androidx.compose.ui.graphics.vector.ImageVector;
import androidx.compose.ui.layout.ContentScale;
import androidx.compose.ui.window.PopupPositionProvider;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class c2 implements Function2 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ int d;
    public final /* synthetic */ int e;
    public final /* synthetic */ Object g;
    public final /* synthetic */ Object h;

    public /* synthetic */ c2(Modifier modifier, Selection selection, Function1 function1, Function2 function2, int i, int i2) {
        this.a = 7;
        this.g = modifier;
        this.b = selection;
        this.c = function1;
        this.h = function2;
        this.d = i;
        this.e = i2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        int i = this.a;
        int i2 = this.d;
        Object obj3 = this.h;
        Object obj4 = this.b;
        Object obj5 = this.c;
        Object obj6 = this.g;
        switch (i) {
            case 0:
                ((Integer) obj2).getClass();
                p2.a((String) obj6, (Function1) obj5, (Function0) obj4, (w2) obj3, (Composer) obj, RecomposeScopeImplKt.updateChangedFlags(i2 | 1), this.e);
                return Unit.INSTANCE;
            case 1:
                int iIntValue = ((Integer) obj2).intValue();
                return ContextMenuUiKt.ContextMenuPopup$lambda$0((PopupPositionProvider) obj6, (Function0) obj4, (Modifier) obj3, (Function1) obj5, this.d, this.e, (Composer) obj, iIntValue);
            case 2:
                ((Integer) obj2).getClass();
                qn0.b((String) obj6, (ImageVector) obj5, (Modifier) obj3, (Function0) obj4, (Composer) obj, RecomposeScopeImplKt.updateChangedFlags(i2 | 1), this.e);
                return Unit.INSTANCE;
            case 3:
                int iIntValue2 = ((Integer) obj2).intValue();
                return IconKt.Icon$lambda$13((Painter) obj5, (ColorProducer) obj4, (String) obj6, (Modifier) obj3, this.d, this.e, (Composer) obj, iIntValue2);
            case 4:
                int iIntValue3 = ((Integer) obj2).intValue();
                return LazyLayoutKt.LazyLayout$lambda$0((Function0) obj4, (Modifier) obj6, (LazyLayoutPrefetchState) obj5, (Function2) obj3, this.d, this.e, (Composer) obj, iIntValue3);
            case 5:
                int iIntValue4 = ((Integer) obj2).intValue();
                return LazyLayoutKt.LazyLayout$lambda$2((Function0) obj4, (Modifier) obj6, (LazyLayoutPrefetchState) obj5, (LazyLayoutMeasurePolicy) obj3, this.d, this.e, (Composer) obj, iIntValue4);
            case 6:
                int iIntValue5 = ((Integer) obj2).intValue();
                return MaterialThemeKt.MaterialTheme$lambda$0((ColorScheme) obj6, (Shapes) obj5, (Typography) obj4, (Function2) obj3, this.d, this.e, (Composer) obj, iIntValue5);
            case 7:
                int iIntValue6 = ((Integer) obj2).intValue();
                return SelectionContainerKt.SelectionContainer$lambda$11((Modifier) obj6, (Selection) obj4, (Function1) obj5, (Function2) obj3, this.d, this.e, (Composer) obj, iIntValue6);
            default:
                ((Integer) obj2).getClass();
                lx1.c((String) obj6, (String) obj5, (Modifier) obj4, (ContentScale) obj3, (Composer) obj, RecomposeScopeImplKt.updateChangedFlags(i2 | 1), this.e);
                return Unit.INSTANCE;
        }
    }

    public /* synthetic */ c2(Painter painter, ColorProducer colorProducer, String str, Modifier modifier, int i, int i2) {
        this.a = 3;
        this.c = painter;
        this.b = colorProducer;
        this.g = str;
        this.h = modifier;
        this.d = i;
        this.e = i2;
    }

    public /* synthetic */ c2(PopupPositionProvider popupPositionProvider, Function0 function0, Modifier modifier, Function1 function1, int i, int i2) {
        this.a = 1;
        this.g = popupPositionProvider;
        this.b = function0;
        this.h = modifier;
        this.c = function1;
        this.d = i;
        this.e = i2;
    }

    public /* synthetic */ c2(Object obj, Object obj2, Object obj3, Object obj4, int i, int i2, int i3) {
        this.a = i3;
        this.g = obj;
        this.c = obj2;
        this.b = obj3;
        this.h = obj4;
        this.d = i;
        this.e = i2;
    }

    public /* synthetic */ c2(String str, ImageVector imageVector, Modifier modifier, Function0 function0, int i, int i2) {
        this.a = 2;
        this.g = str;
        this.c = imageVector;
        this.h = modifier;
        this.b = function0;
        this.d = i;
        this.e = i2;
    }

    public /* synthetic */ c2(Function0 function0, Modifier modifier, LazyLayoutPrefetchState lazyLayoutPrefetchState, Object obj, int i, int i2, int i3) {
        this.a = i3;
        this.b = function0;
        this.g = modifier;
        this.c = lazyLayoutPrefetchState;
        this.h = obj;
        this.d = i;
        this.e = i2;
    }
}
