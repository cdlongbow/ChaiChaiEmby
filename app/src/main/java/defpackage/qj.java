package defpackage;

import androidx.compose.foundation.interaction.InteractionSource;
import androidx.compose.foundation.interaction.MutableInteractionSource;
import androidx.compose.material3.CheckboxColors;
import androidx.compose.material3.CheckboxKt;
import androidx.compose.material3.RadioButtonColors;
import androidx.compose.material3.RadioButtonKt;
import androidx.compose.material3.TextFieldColors;
import androidx.compose.material3.TextFieldDefaults;
import androidx.compose.material3.TooltipState;
import androidx.compose.material3.internal.BasicEdgeToEdgeDialog_androidKt;
import androidx.compose.material3.internal.BasicTooltipKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.Shape;
import androidx.compose.ui.graphics.vector.ImageVector;
import androidx.compose.ui.window.DialogProperties;
import kotlin.Function;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class qj implements Function2 {
    public final /* synthetic */ int a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ boolean c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ int e;
    public final /* synthetic */ int g;
    public final /* synthetic */ Object h;
    public final /* synthetic */ Object i;
    public final /* synthetic */ Object j;

    public /* synthetic */ qj(TextFieldDefaults textFieldDefaults, boolean z, boolean z2, InteractionSource interactionSource, TextFieldColors textFieldColors, Shape shape, int i, int i2) {
        this.a = 5;
        this.h = textFieldDefaults;
        this.b = z;
        this.c = z2;
        this.d = interactionSource;
        this.i = textFieldColors;
        this.j = shape;
        this.e = i;
        this.g = i2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        int i = this.a;
        Object obj3 = this.j;
        Object obj4 = this.i;
        Object obj5 = this.d;
        Object obj6 = this.h;
        switch (i) {
            case 0:
                int iIntValue = ((Integer) obj2).intValue();
                return BasicEdgeToEdgeDialog_androidKt.BasicEdgeToEdgeDialog$lambda$12((Function0) obj6, (Modifier) obj5, (DialogProperties) obj4, this.b, this.c, (Function3) obj3, this.e, this.g, (Composer) obj, iIntValue);
            case 1:
                int iIntValue2 = ((Integer) obj2).intValue();
                return BasicTooltipKt.WrappedAnchor$lambda$7(this.b, (TooltipState) obj6, (MutableState) obj4, this.c, (Modifier) obj5, (Function2) obj3, this.e, this.g, (Composer) obj, iIntValue2);
            case 2:
                int iIntValue3 = ((Integer) obj2).intValue();
                return CheckboxKt.Checkbox$lambda$3(this.b, (Function1) obj6, (Modifier) obj5, this.c, (CheckboxColors) obj4, (MutableInteractionSource) obj3, this.e, this.g, (Composer) obj, iIntValue3);
            case 3:
                ((Integer) obj2).getClass();
                int iUpdateChangedFlags = RecomposeScopeImplKt.updateChangedFlags(this.e | 1);
                u90.L((ImageVector) obj4, (String) obj3, (Function0) obj6, this.b, this.c, (Modifier) obj5, (Composer) obj, iUpdateChangedFlags, this.g);
                return Unit.INSTANCE;
            case 4:
                int iIntValue4 = ((Integer) obj2).intValue();
                return RadioButtonKt.RadioButton$lambda$2(this.b, (Function0) obj6, (Modifier) obj5, this.c, (RadioButtonColors) obj4, (MutableInteractionSource) obj3, this.e, this.g, (Composer) obj, iIntValue4);
            default:
                int iIntValue5 = ((Integer) obj2).intValue();
                return TextFieldDefaults.ContainerBox$lambda$7((TextFieldDefaults) obj6, this.b, this.c, (InteractionSource) obj5, (TextFieldColors) obj4, (Shape) obj3, this.e, this.g, (Composer) obj, iIntValue5);
        }
    }

    public /* synthetic */ qj(ImageVector imageVector, String str, Function0 function0, boolean z, boolean z2, Modifier modifier, int i, int i2) {
        this.a = 3;
        this.i = imageVector;
        this.j = str;
        this.h = function0;
        this.b = z;
        this.c = z2;
        this.d = modifier;
        this.e = i;
        this.g = i2;
    }

    public /* synthetic */ qj(Function0 function0, Modifier modifier, DialogProperties dialogProperties, boolean z, boolean z2, Function3 function3, int i, int i2) {
        this.a = 0;
        this.h = function0;
        this.d = modifier;
        this.i = dialogProperties;
        this.b = z;
        this.c = z2;
        this.j = function3;
        this.e = i;
        this.g = i2;
    }

    public /* synthetic */ qj(boolean z, TooltipState tooltipState, MutableState mutableState, boolean z2, Modifier modifier, Function2 function2, int i, int i2) {
        this.a = 1;
        this.b = z;
        this.h = tooltipState;
        this.i = mutableState;
        this.c = z2;
        this.d = modifier;
        this.j = function2;
        this.e = i;
        this.g = i2;
    }

    public /* synthetic */ qj(boolean z, Function function, Modifier modifier, boolean z2, Object obj, MutableInteractionSource mutableInteractionSource, int i, int i2, int i3) {
        this.a = i3;
        this.b = z;
        this.h = function;
        this.d = modifier;
        this.c = z2;
        this.i = obj;
        this.j = mutableInteractionSource;
        this.e = i;
        this.g = i2;
    }
}
