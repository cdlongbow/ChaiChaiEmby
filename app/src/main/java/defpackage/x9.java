package defpackage;

import androidx.compose.foundation.ScrollState;
import androidx.compose.foundation.interaction.MutableInteractionSource;
import androidx.compose.material3.AndroidMenu_androidKt;
import androidx.compose.material3.SliderColors;
import androidx.compose.material3.SliderDefaults;
import androidx.compose.material3.SliderState;
import androidx.compose.runtime.Composer;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.window.PopupProperties;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class x9 implements Function2 {
    public final /* synthetic */ int a = 1;
    public final /* synthetic */ Modifier b;
    public final /* synthetic */ boolean c;
    public final /* synthetic */ long d;
    public final /* synthetic */ int e;
    public final /* synthetic */ int g;
    public final /* synthetic */ Object h;
    public final /* synthetic */ Object i;
    public final /* synthetic */ Object j;
    public final /* synthetic */ Object k;

    public /* synthetic */ x9(SliderDefaults sliderDefaults, MutableInteractionSource mutableInteractionSource, SliderState sliderState, Modifier modifier, SliderColors sliderColors, boolean z, long j, int i, int i2) {
        this.h = sliderDefaults;
        this.i = mutableInteractionSource;
        this.j = sliderState;
        this.b = modifier;
        this.k = sliderColors;
        this.c = z;
        this.d = j;
        this.e = i;
        this.g = i2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        int i = this.a;
        Object obj3 = this.k;
        Object obj4 = this.j;
        Object obj5 = this.i;
        Object obj6 = this.h;
        switch (i) {
            case 0:
                int iIntValue = ((Integer) obj2).intValue();
                return AndroidMenu_androidKt.DropdownMenu_4kj__NE$lambda$5(this.c, (Function0) obj6, this.b, this.d, (ScrollState) obj5, (PopupProperties) obj4, (Function3) obj3, this.e, this.g, (Composer) obj, iIntValue);
            default:
                int iIntValue2 = ((Integer) obj2).intValue();
                return SliderDefaults.Thumb_HwbPF3A$lambda$6((SliderDefaults) obj6, (MutableInteractionSource) obj5, (SliderState) obj4, this.b, (SliderColors) obj3, this.c, this.d, this.e, this.g, (Composer) obj, iIntValue2);
        }
    }

    public /* synthetic */ x9(boolean z, Function0 function0, Modifier modifier, long j, ScrollState scrollState, PopupProperties popupProperties, Function3 function3, int i, int i2) {
        this.c = z;
        this.h = function0;
        this.b = modifier;
        this.d = j;
        this.i = scrollState;
        this.j = popupProperties;
        this.k = function3;
        this.e = i;
        this.g = i2;
    }
}
