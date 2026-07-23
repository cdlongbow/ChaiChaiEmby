package defpackage;

import androidx.compose.foundation.interaction.MutableInteractionSource;
import androidx.compose.material3.DatePickerKt;
import androidx.compose.material3.DrawerState;
import androidx.compose.material3.LabelKt;
import androidx.compose.material3.NavigationDrawerKt;
import androidx.compose.material3.RangeSliderState;
import androidx.compose.material3.SliderColors;
import androidx.compose.material3.SliderDefaults;
import androidx.compose.material3.SliderPositions;
import androidx.compose.material3.SliderState;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.focus.FocusRequester;
import androidx.compose.ui.graphics.vector.ImageVector;
import com.dh.myembyapp.data.model.OtherServerResourceMatch;
import com.dh.myembyapp.data.model.ServerConfig;
import java.io.UnsupportedEncodingException;
import java.util.List;
import kotlin.Function;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class m10 implements Function2 {
    public final /* synthetic */ int a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ int c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ int e;
    public final /* synthetic */ Object g;
    public final /* synthetic */ Object h;
    public final /* synthetic */ Object i;

    public /* synthetic */ m10(Modifier modifier, String str, boolean z, Function0 function0, Function0 function1, int i, int i2) {
        this.a = 3;
        this.i = modifier;
        this.h = str;
        this.b = z;
        this.d = function0;
        this.g = function1;
        this.c = i;
        this.e = i2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) throws UnsupportedEncodingException {
        int i = this.a;
        int i2 = this.c;
        Object obj3 = this.h;
        Object obj4 = this.i;
        Object obj5 = this.g;
        Object obj6 = this.d;
        switch (i) {
            case 0:
                int iIntValue = ((Integer) obj2).intValue();
                return DatePickerKt.IconButtonWithTooltip$lambda$71((Function0) obj6, (ImageVector) obj5, (String) obj3, (Modifier) obj4, this.b, this.c, this.e, (Composer) obj, iIntValue);
            case 1:
                ((Integer) obj2).intValue();
                int iUpdateChangedFlags = RecomposeScopeImplKt.updateChangedFlags(this.e | 1);
                u90.m0((ServerConfig) obj5, (OtherServerResourceMatch) obj3, this.b, this.c, (FocusRequester) obj4, (Function0) obj6, (Composer) obj, iUpdateChangedFlags);
                return Unit.INSTANCE;
            case 2:
                ((Integer) obj2).getClass();
                int iUpdateChangedFlags2 = RecomposeScopeImplKt.updateChangedFlags(i2 | 1);
                qn0.d((String) obj3, (List) obj5, this.b, (Function1) obj4, (Function0) obj6, (Composer) obj, iUpdateChangedFlags2, this.e);
                return Unit.INSTANCE;
            case 3:
                ((Integer) obj2).getClass();
                int iUpdateChangedFlags3 = RecomposeScopeImplKt.updateChangedFlags(i2 | 1);
                gv0.d((Modifier) obj4, (String) obj3, this.b, (Function0) obj6, (Function0) obj5, (Composer) obj, iUpdateChangedFlags3, this.e);
                return Unit.INSTANCE;
            case 4:
                int iIntValue2 = ((Integer) obj2).intValue();
                return LabelKt.Label$lambda$5((Function3) obj6, (Modifier) obj4, (MutableInteractionSource) obj5, this.b, (Function2) obj3, this.c, this.e, (Composer) obj, iIntValue2);
            case 5:
                int iIntValue3 = ((Integer) obj2).intValue();
                return NavigationDrawerKt.DismissibleNavigationDrawer$lambda$39((Function2) obj6, (Modifier) obj4, (DrawerState) obj5, this.b, (Function2) obj3, this.c, this.e, (Composer) obj, iIntValue3);
            case 6:
                int iIntValue4 = ((Integer) obj2).intValue();
                return SliderDefaults.Track$lambda$13((SliderDefaults) obj6, (SliderState) obj5, (Modifier) obj4, (SliderColors) obj3, this.b, this.c, this.e, (Composer) obj, iIntValue4);
            case 7:
                int iIntValue5 = ((Integer) obj2).intValue();
                return SliderDefaults.Track$lambda$12((SliderDefaults) obj6, (SliderPositions) obj5, (Modifier) obj4, (SliderColors) obj3, this.b, this.c, this.e, (Composer) obj, iIntValue5);
            default:
                int iIntValue6 = ((Integer) obj2).intValue();
                return SliderDefaults.Track$lambda$33((SliderDefaults) obj6, (RangeSliderState) obj5, (Modifier) obj4, (SliderColors) obj3, this.b, this.c, this.e, (Composer) obj, iIntValue6);
        }
    }

    public /* synthetic */ m10(SliderDefaults sliderDefaults, Object obj, Modifier modifier, SliderColors sliderColors, boolean z, int i, int i2, int i3) {
        this.a = i3;
        this.d = sliderDefaults;
        this.g = obj;
        this.i = modifier;
        this.h = sliderColors;
        this.b = z;
        this.c = i;
        this.e = i2;
    }

    public /* synthetic */ m10(ServerConfig serverConfig, OtherServerResourceMatch otherServerResourceMatch, boolean z, int i, FocusRequester focusRequester, Function0 function0, int i2) {
        this.a = 1;
        this.g = serverConfig;
        this.h = otherServerResourceMatch;
        this.b = z;
        this.c = i;
        this.i = focusRequester;
        this.d = function0;
        this.e = i2;
    }

    public /* synthetic */ m10(String str, List list, boolean z, Function1 function1, Function0 function0, int i, int i2) {
        this.a = 2;
        this.h = str;
        this.g = list;
        this.b = z;
        this.i = function1;
        this.d = function0;
        this.c = i;
        this.e = i2;
    }

    public /* synthetic */ m10(Function function, Modifier modifier, Object obj, boolean z, Function2 function2, int i, int i2, int i3) {
        this.a = i3;
        this.d = function;
        this.i = modifier;
        this.g = obj;
        this.b = z;
        this.h = function2;
        this.c = i;
        this.e = i2;
    }

    public /* synthetic */ m10(Function0 function0, ImageVector imageVector, String str, Modifier modifier, boolean z, int i, int i2) {
        this.a = 0;
        this.d = function0;
        this.g = imageVector;
        this.h = str;
        this.i = modifier;
        this.b = z;
        this.c = i;
        this.e = i2;
    }
}
