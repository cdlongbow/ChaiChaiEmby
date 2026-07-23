package defpackage;

import androidx.compose.foundation.interaction.MutableInteractionSource;
import androidx.compose.material3.AndroidMenu_androidKt;
import androidx.compose.material3.DrawerState;
import androidx.compose.material3.NavigationDrawerKt;
import androidx.compose.material3.SliderColors;
import androidx.compose.material3.SliderDefaults;
import androidx.compose.runtime.Composer;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.window.PopupProperties;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class w9 implements Function2 {
    public final /* synthetic */ int a = 2;
    public final /* synthetic */ Modifier b;
    public final /* synthetic */ boolean c;
    public final /* synthetic */ long d;
    public final /* synthetic */ int e;
    public final /* synthetic */ int g;
    public final /* synthetic */ Object h;
    public final /* synthetic */ Object i;
    public final /* synthetic */ Object j;

    public /* synthetic */ w9(SliderDefaults sliderDefaults, MutableInteractionSource mutableInteractionSource, Modifier modifier, SliderColors sliderColors, boolean z, long j, int i, int i2) {
        this.h = sliderDefaults;
        this.i = mutableInteractionSource;
        this.b = modifier;
        this.j = sliderColors;
        this.c = z;
        this.d = j;
        this.e = i;
        this.g = i2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        int i = this.a;
        Object obj3 = this.j;
        Object obj4 = this.i;
        Object obj5 = this.h;
        switch (i) {
            case 0:
                int iIntValue = ((Integer) obj2).intValue();
                return AndroidMenu_androidKt.DropdownMenu_ILWXrKs$lambda$6(this.c, (Function0) obj5, this.b, this.d, (PopupProperties) obj4, (Function3) obj3, this.e, this.g, (Composer) obj, iIntValue);
            case 1:
                int iIntValue2 = ((Integer) obj2).intValue();
                return NavigationDrawerKt.ModalNavigationDrawer_FHprtrg$lambda$25((Function2) obj5, this.b, (DrawerState) obj4, this.c, this.d, (Function2) obj3, this.e, this.g, (Composer) obj, iIntValue2);
            default:
                int iIntValue3 = ((Integer) obj2).intValue();
                return SliderDefaults.Thumb_9LiSoMs$lambda$3((SliderDefaults) obj5, (MutableInteractionSource) obj4, this.b, (SliderColors) obj3, this.c, this.d, this.e, this.g, (Composer) obj, iIntValue3);
        }
    }

    public /* synthetic */ w9(Function2 function2, Modifier modifier, DrawerState drawerState, boolean z, long j, Function2 function3, int i, int i2) {
        this.h = function2;
        this.b = modifier;
        this.i = drawerState;
        this.c = z;
        this.d = j;
        this.j = function3;
        this.e = i;
        this.g = i2;
    }

    public /* synthetic */ w9(boolean z, Function0 function0, Modifier modifier, long j, PopupProperties popupProperties, Function3 function3, int i, int i2) {
        this.c = z;
        this.h = function0;
        this.b = modifier;
        this.d = j;
        this.i = popupProperties;
        this.j = function3;
        this.e = i;
        this.g = i2;
    }
}
