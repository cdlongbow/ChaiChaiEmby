package defpackage;

import androidx.compose.foundation.BorderStroke;
import androidx.compose.foundation.interaction.MutableInteractionSource;
import androidx.compose.material3.IconButtonColors;
import androidx.compose.material3.IconButtonKt;
import androidx.compose.material3.RangeSliderState;
import androidx.compose.material3.SliderKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.focus.FocusRequester;
import androidx.compose.ui.graphics.Shape;
import kotlin.Function;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class mr0 implements Function2 {
    public final /* synthetic */ int a = 2;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ Function c;
    public final /* synthetic */ int d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object g;
    public final /* synthetic */ Object h;
    public final /* synthetic */ Object i;
    public final /* synthetic */ Object j;
    public final /* synthetic */ Object k;

    public /* synthetic */ mr0(Modifier modifier, RangeSliderState rangeSliderState, boolean z, MutableInteractionSource mutableInteractionSource, MutableInteractionSource mutableInteractionSource2, Function3 function3, Function3 function4, Function3 function5, int i) {
        this.g = modifier;
        this.e = rangeSliderState;
        this.b = z;
        this.k = mutableInteractionSource;
        this.h = mutableInteractionSource2;
        this.i = function3;
        this.j = function4;
        this.c = function5;
        this.d = i;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        int i = this.a;
        Function function = this.c;
        Object obj3 = this.j;
        Object obj4 = this.i;
        Object obj5 = this.h;
        Object obj6 = this.k;
        Object obj7 = this.e;
        Object obj8 = this.g;
        switch (i) {
            case 0:
                int iIntValue = ((Integer) obj2).intValue();
                return IconButtonKt.SurfaceIconButton$lambda$24((Function0) obj7, (Modifier) obj8, this.b, (Shape) obj5, (IconButtonColors) obj4, (BorderStroke) obj3, (MutableInteractionSource) obj6, (Function2) function, this.d, (Composer) obj, iIntValue);
            case 1:
                ((Integer) obj2).getClass();
                int iUpdateChangedFlags = RecomposeScopeImplKt.updateChangedFlags(this.d | 1);
                lh1.b((FocusRequester) obj7, (Function1) obj8, (Function1) obj5, this.b, (fj1) obj4, (gj1) obj3, (oh1) obj6, (Function2) function, (Composer) obj, iUpdateChangedFlags);
                return Unit.INSTANCE;
            default:
                int iIntValue2 = ((Integer) obj2).intValue();
                return SliderKt.RangeSliderImpl$lambda$46((Modifier) obj8, (RangeSliderState) obj7, this.b, (MutableInteractionSource) obj6, (MutableInteractionSource) obj5, (Function3) obj4, (Function3) obj3, (Function3) function, this.d, (Composer) obj, iIntValue2);
        }
    }

    public /* synthetic */ mr0(FocusRequester focusRequester, Function1 function1, Function1 function2, boolean z, fj1 fj1Var, gj1 gj1Var, oh1 oh1Var, Function2 function3, int i) {
        this.e = focusRequester;
        this.g = function1;
        this.h = function2;
        this.b = z;
        this.i = fj1Var;
        this.j = gj1Var;
        this.k = oh1Var;
        this.c = function3;
        this.d = i;
    }

    public /* synthetic */ mr0(Function0 function0, Modifier modifier, boolean z, Shape shape, IconButtonColors iconButtonColors, BorderStroke borderStroke, MutableInteractionSource mutableInteractionSource, Function2 function2, int i) {
        this.e = function0;
        this.g = modifier;
        this.b = z;
        this.h = shape;
        this.i = iconButtonColors;
        this.j = borderStroke;
        this.k = mutableInteractionSource;
        this.c = function2;
        this.d = i;
    }
}
