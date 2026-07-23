package defpackage;

import android.graphics.Bitmap;
import androidx.compose.foundation.BorderStroke;
import androidx.compose.foundation.gestures.FlingBehavior;
import androidx.compose.foundation.interaction.MutableInteractionSource;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.foundation.lazy.LazyDslKt;
import androidx.compose.foundation.lazy.LazyListState;
import androidx.compose.material3.CardColors;
import androidx.compose.material3.CardElevation;
import androidx.compose.material3.CardKt;
import androidx.compose.material3.CheckboxColors;
import androidx.compose.material3.CheckboxKt;
import androidx.compose.material3.DatePickerColors;
import androidx.compose.material3.DatePickerFormatter;
import androidx.compose.material3.DatePickerKt;
import androidx.compose.material3.DatePickerState;
import androidx.compose.material3.DateRangePickerKt;
import androidx.compose.material3.DateRangePickerState;
import androidx.compose.material3.IconButtonColors;
import androidx.compose.material3.IconButtonKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.focus.FocusRequester;
import androidx.compose.ui.graphics.Shape;
import androidx.compose.ui.graphics.drawscope.Stroke;
import androidx.compose.ui.state.ToggleableState;
import androidx.compose.ui.text.input.VisualTransformation;
import java.util.List;
import kotlin.Function;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class g8 implements Function2 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ boolean c;
    public final /* synthetic */ int d;
    public final /* synthetic */ int e;
    public final /* synthetic */ Object g;
    public final /* synthetic */ Object h;
    public final /* synthetic */ Object i;
    public final /* synthetic */ Object j;
    public final /* synthetic */ Object k;
    public final /* synthetic */ Object l;

    public /* synthetic */ g8(String str, Function1 function1, Modifier modifier, String str2, VisualTransformation visualTransformation, boolean z, Function1 function2, Function0 function0, int i, int i2) {
        this.a = 8;
        this.h = str;
        this.k = function1;
        this.g = modifier;
        this.i = str2;
        this.j = visualTransformation;
        this.c = z;
        this.l = function2;
        this.b = function0;
        this.d = i;
        this.e = i2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        int i = this.a;
        int i2 = this.d;
        Object obj3 = this.b;
        Object obj4 = this.l;
        Object obj5 = this.j;
        Object obj6 = this.i;
        Object obj7 = this.g;
        Object obj8 = this.k;
        Object obj9 = this.h;
        switch (i) {
            case 0:
                ((Integer) obj2).getClass();
                int iUpdateChangedFlags = RecomposeScopeImplKt.updateChangedFlags(i2 | 1);
                m8.b((Bitmap) obj7, (String) obj9, (List) obj6, this.c, (Function1) obj8, (List) obj5, (Function1) obj4, (Function0) obj3, (Composer) obj, iUpdateChangedFlags, this.e);
                return Unit.INSTANCE;
            case 1:
                int iIntValue = ((Integer) obj2).intValue();
                return CardKt.ElevatedCard$lambda$4((Function0) obj3, (Modifier) obj7, this.c, (Shape) obj9, (CardColors) obj6, (CardElevation) obj5, (MutableInteractionSource) obj8, (Function3) obj4, this.d, this.e, (Composer) obj, iIntValue);
            case 2:
                int iIntValue2 = ((Integer) obj2).intValue();
                return CheckboxKt.TriStateCheckbox$lambda$9((ToggleableState) obj7, (Function0) obj3, (Stroke) obj9, (Stroke) obj6, (Modifier) obj5, this.c, (CheckboxColors) obj8, (MutableInteractionSource) obj4, this.d, this.e, (Composer) obj, iIntValue2);
            case 3:
                int iIntValue3 = ((Integer) obj2).intValue();
                return DatePickerKt.DatePicker$lambda$3((DatePickerState) obj7, (Modifier) obj9, (DatePickerFormatter) obj6, (DatePickerColors) obj5, (Function2) obj8, (Function2) obj4, this.c, (FocusRequester) obj3, this.d, this.e, (Composer) obj, iIntValue3);
            case 4:
                int iIntValue4 = ((Integer) obj2).intValue();
                return DateRangePickerKt.DateRangePicker$lambda$3((DateRangePickerState) obj7, (Modifier) obj9, (DatePickerFormatter) obj6, (DatePickerColors) obj5, (Function2) obj8, (Function2) obj4, this.c, (FocusRequester) obj3, this.d, this.e, (Composer) obj, iIntValue4);
            case 5:
                int iIntValue5 = ((Integer) obj2).intValue();
                return IconButtonKt.OutlinedIconButton$lambda$18((Function0) obj3, (Modifier) obj7, this.c, (Shape) obj9, (IconButtonColors) obj6, (BorderStroke) obj5, (MutableInteractionSource) obj8, (Function2) obj4, this.d, this.e, (Composer) obj, iIntValue5);
            case 6:
                int iIntValue6 = ((Integer) obj2).intValue();
                return LazyDslKt.LazyColumn$lambda$2((Modifier) obj7, (LazyListState) obj9, (PaddingValues) obj6, this.c, (Arrangement.Vertical) obj5, (Alignment.Horizontal) obj4, (FlingBehavior) obj3, (Function1) obj8, this.d, this.e, (Composer) obj, iIntValue6);
            case 7:
                int iIntValue7 = ((Integer) obj2).intValue();
                return LazyDslKt.LazyRow$lambda$2((Modifier) obj7, (LazyListState) obj9, (PaddingValues) obj6, this.c, (Arrangement.Horizontal) obj5, (Alignment.Vertical) obj4, (FlingBehavior) obj3, (Function1) obj8, this.d, this.e, (Composer) obj, iIntValue7);
            default:
                ((Integer) obj2).getClass();
                int iUpdateChangedFlags2 = RecomposeScopeImplKt.updateChangedFlags(i2 | 1);
                ef2.d((String) obj9, (Function1) obj8, (Modifier) obj7, (String) obj6, (VisualTransformation) obj5, this.c, (Function1) obj4, (Function0) obj3, (Composer) obj, iUpdateChangedFlags2, this.e);
                return Unit.INSTANCE;
        }
    }

    public /* synthetic */ g8(Modifier modifier, LazyListState lazyListState, PaddingValues paddingValues, boolean z, Object obj, Object obj2, FlingBehavior flingBehavior, Function1 function1, int i, int i2, int i3) {
        this.a = i3;
        this.g = modifier;
        this.h = lazyListState;
        this.i = paddingValues;
        this.c = z;
        this.j = obj;
        this.l = obj2;
        this.b = flingBehavior;
        this.k = function1;
        this.d = i;
        this.e = i2;
    }

    public /* synthetic */ g8(ToggleableState toggleableState, Function0 function0, Stroke stroke, Stroke stroke2, Modifier modifier, boolean z, CheckboxColors checkboxColors, MutableInteractionSource mutableInteractionSource, int i, int i2) {
        this.a = 2;
        this.g = toggleableState;
        this.b = function0;
        this.h = stroke;
        this.i = stroke2;
        this.j = modifier;
        this.c = z;
        this.k = checkboxColors;
        this.l = mutableInteractionSource;
        this.d = i;
        this.e = i2;
    }

    public /* synthetic */ g8(Object obj, Modifier modifier, DatePickerFormatter datePickerFormatter, DatePickerColors datePickerColors, Function2 function2, Function2 function3, boolean z, FocusRequester focusRequester, int i, int i2, int i3) {
        this.a = i3;
        this.g = obj;
        this.h = modifier;
        this.i = datePickerFormatter;
        this.j = datePickerColors;
        this.k = function2;
        this.l = function3;
        this.c = z;
        this.b = focusRequester;
        this.d = i;
        this.e = i2;
    }

    public /* synthetic */ g8(Bitmap bitmap, String str, List list, boolean z, Function1 function1, List list2, Function1 function2, Function0 function0, int i, int i2) {
        this.a = 0;
        this.g = bitmap;
        this.h = str;
        this.i = list;
        this.c = z;
        this.k = function1;
        this.j = list2;
        this.l = function2;
        this.b = function0;
        this.d = i;
        this.e = i2;
    }

    public /* synthetic */ g8(Function0 function0, Modifier modifier, boolean z, Shape shape, Object obj, Object obj2, MutableInteractionSource mutableInteractionSource, Function function, int i, int i2, int i3) {
        this.a = i3;
        this.b = function0;
        this.g = modifier;
        this.c = z;
        this.h = shape;
        this.i = obj;
        this.j = obj2;
        this.k = mutableInteractionSource;
        this.l = function;
        this.d = i;
        this.e = i2;
    }
}
