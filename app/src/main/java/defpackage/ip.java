package defpackage;

import androidx.compose.foundation.interaction.MutableInteractionSource;
import androidx.compose.material3.CheckboxColors;
import androidx.compose.material3.CheckboxKt;
import androidx.compose.material3.SliderKt;
import androidx.compose.material3.SliderState;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.focus.FocusRequester;
import androidx.compose.ui.graphics.drawscope.Stroke;
import androidx.compose.ui.graphics.vector.ImageVector;
import androidx.compose.ui.state.ToggleableState;
import com.dh.myembyapp.data.model.ItemCounts;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class ip implements Function2 {
    public final /* synthetic */ int a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ int c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object g;
    public final /* synthetic */ Object h;
    public final /* synthetic */ Object i;

    public /* synthetic */ ip(Modifier modifier, SliderState sliderState, boolean z, MutableInteractionSource mutableInteractionSource, Function3 function3, Function3 function4, int i) {
        this.a = 4;
        this.e = modifier;
        this.d = sliderState;
        this.b = z;
        this.g = mutableInteractionSource;
        this.h = function3;
        this.i = function4;
        this.c = i;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        int i = this.a;
        int i2 = this.c;
        Object obj3 = this.i;
        Object obj4 = this.h;
        Object obj5 = this.g;
        Object obj6 = this.d;
        Object obj7 = this.e;
        switch (i) {
            case 0:
                int iIntValue = ((Integer) obj2).intValue();
                return CheckboxKt.CheckboxImpl$lambda$15(this.b, (ToggleableState) obj6, (Modifier) obj7, (CheckboxColors) obj5, (Stroke) obj4, (Stroke) obj3, this.c, (Composer) obj, iIntValue);
            case 1:
                ((Integer) obj2).getClass();
                int iUpdateChangedFlags = RecomposeScopeImplKt.updateChangedFlags(i2 | 1);
                u90.g0((ImageVector) obj6, (String) obj7, (FocusRequester) obj5, (FocusRequester) obj4, this.b, (Function0) obj3, (Composer) obj, iUpdateChangedFlags);
                return Unit.INSTANCE;
            case 2:
                ((Integer) obj2).intValue();
                int iUpdateChangedFlags2 = RecomposeScopeImplKt.updateChangedFlags(i2 | 1);
                u90.b0(this.b, (String) obj6, (zh0) obj7, (Function0) obj5, (Function0) obj4, (Function1) obj3, (Composer) obj, iUpdateChangedFlags2);
                return Unit.INSTANCE;
            case 3:
                ((Integer) obj2).getClass();
                int iUpdateChangedFlags3 = RecomposeScopeImplKt.updateChangedFlags(i2 | 1);
                qn0.a((ItemCounts) obj6, this.b, (Function0) obj7, (Function0) obj5, (Function0) obj4, (Function0) obj3, (Composer) obj, iUpdateChangedFlags3);
                return Unit.INSTANCE;
            default:
                int iIntValue2 = ((Integer) obj2).intValue();
                return SliderKt.SliderImpl$lambda$31((Modifier) obj7, (SliderState) obj6, this.b, (MutableInteractionSource) obj5, (Function3) obj4, (Function3) obj3, this.c, (Composer) obj, iIntValue2);
        }
    }

    public /* synthetic */ ip(ImageVector imageVector, String str, FocusRequester focusRequester, FocusRequester focusRequester2, boolean z, Function0 function0, int i) {
        this.a = 1;
        this.d = imageVector;
        this.e = str;
        this.g = focusRequester;
        this.h = focusRequester2;
        this.b = z;
        this.i = function0;
        this.c = i;
    }

    public /* synthetic */ ip(ItemCounts itemCounts, boolean z, Function0 function0, Function0 function1, Function0 function2, Function0 function3, int i) {
        this.a = 3;
        this.d = itemCounts;
        this.b = z;
        this.e = function0;
        this.g = function1;
        this.h = function2;
        this.i = function3;
        this.c = i;
    }

    public /* synthetic */ ip(boolean z, Object obj, Object obj2, Object obj3, Object obj4, Object obj5, int i, int i2) {
        this.a = i2;
        this.b = z;
        this.d = obj;
        this.e = obj2;
        this.g = obj3;
        this.h = obj4;
        this.i = obj5;
        this.c = i;
    }
}
