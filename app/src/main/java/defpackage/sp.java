package defpackage;

import androidx.compose.foundation.BorderStroke;
import androidx.compose.foundation.interaction.MutableInteractionSource;
import androidx.compose.material3.ChipKt;
import androidx.compose.material3.SelectableChipColors;
import androidx.compose.material3.SelectableChipElevation;
import androidx.compose.material3.TextFieldColors;
import androidx.compose.runtime.Composer;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.Shape;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class sp implements Function2 {
    public final /* synthetic */ int a = 1;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ Modifier c;
    public final /* synthetic */ boolean d;
    public final /* synthetic */ Function2 e;
    public final /* synthetic */ Function2 g;
    public final /* synthetic */ Function2 h;
    public final /* synthetic */ MutableInteractionSource i;
    public final /* synthetic */ int j;
    public final /* synthetic */ int k;
    public final /* synthetic */ int l;
    public final /* synthetic */ Object m;
    public final /* synthetic */ Object n;
    public final /* synthetic */ Object o;
    public final /* synthetic */ Object p;
    public final /* synthetic */ Object q;
    public final /* synthetic */ Object r;

    public /* synthetic */ sp(SearchBarDefaults searchBarDefaults, String str, Function1 function1, Function1 function2, boolean z, Function1 function3, Modifier modifier, boolean z2, Function2 function4, Function2 function5, Function2 function6, TextFieldColors textFieldColors, MutableInteractionSource mutableInteractionSource, int i, int i2, int i3) {
        this.m = searchBarDefaults;
        this.n = str;
        this.o = function1;
        this.p = function2;
        this.b = z;
        this.q = function3;
        this.c = modifier;
        this.d = z2;
        this.e = function4;
        this.g = function5;
        this.h = function6;
        this.r = textFieldColors;
        this.i = mutableInteractionSource;
        this.j = i;
        this.k = i2;
        this.l = i3;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        int i = this.a;
        Object obj3 = this.r;
        Object obj4 = this.q;
        Object obj5 = this.p;
        Object obj6 = this.o;
        Object obj7 = this.n;
        Object obj8 = this.m;
        switch (i) {
            case 0:
                int iIntValue = ((Integer) obj2).intValue();
                return ChipKt.InputChip$lambda$8(this.b, (Function0) obj8, this.e, this.c, this.d, this.g, this.h, (Function2) obj7, (Shape) obj6, (SelectableChipColors) obj5, (SelectableChipElevation) obj4, (BorderStroke) obj3, this.i, this.j, this.k, this.l, (Composer) obj, iIntValue);
            default:
                int iIntValue2 = ((Integer) obj2).intValue();
                return SearchBarDefaults.InputField$lambda$44((SearchBarDefaults) obj8, (String) obj7, (Function1) obj6, (Function1) obj5, this.b, (Function1) obj4, this.c, this.d, this.e, this.g, this.h, (TextFieldColors) obj3, this.i, this.j, this.k, this.l, (Composer) obj, iIntValue2);
        }
    }

    public /* synthetic */ sp(boolean z, Function0 function0, Function2 function2, Modifier modifier, boolean z2, Function2 function3, Function2 function4, Function2 function5, Shape shape, SelectableChipColors selectableChipColors, SelectableChipElevation selectableChipElevation, BorderStroke borderStroke, MutableInteractionSource mutableInteractionSource, int i, int i2, int i3) {
        this.b = z;
        this.m = function0;
        this.e = function2;
        this.c = modifier;
        this.d = z2;
        this.g = function3;
        this.h = function4;
        this.n = function5;
        this.o = shape;
        this.p = selectableChipColors;
        this.q = selectableChipElevation;
        this.r = borderStroke;
        this.i = mutableInteractionSource;
        this.j = i;
        this.k = i2;
        this.l = i3;
    }
}
