package defpackage;

import androidx.compose.material3.DateInputKt;
import androidx.compose.material3.DateInputValidator;
import androidx.compose.material3.DatePickerColors;
import androidx.compose.material3.internal.CalendarModel;
import androidx.compose.material3.internal.DateInputFormat;
import androidx.compose.runtime.Composer;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.focus.FocusRequester;
import java.util.Locale;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class v00 implements Function2 {
    public final /* synthetic */ int a = 0;
    public final /* synthetic */ Modifier b;
    public final /* synthetic */ Function1 c;
    public final /* synthetic */ int d;
    public final /* synthetic */ int e;
    public final /* synthetic */ int g;
    public final /* synthetic */ Object h;
    public final /* synthetic */ Object i;
    public final /* synthetic */ Object j;
    public final /* synthetic */ Object k;
    public final /* synthetic */ Object l;
    public final /* synthetic */ Object m;
    public final /* synthetic */ Object n;
    public final /* synthetic */ Object o;
    public final /* synthetic */ Object p;

    public /* synthetic */ v00(Modifier modifier, Long l, Function1 function1, CalendarModel calendarModel, Function2 function2, Function2 function3, int i, DateInputValidator dateInputValidator, DateInputFormat dateInputFormat, Locale locale, DatePickerColors datePickerColors, FocusRequester focusRequester, int i2, int i3) {
        this.b = modifier;
        this.h = l;
        this.c = function1;
        this.i = calendarModel;
        this.j = function2;
        this.k = function3;
        this.d = i;
        this.l = dateInputValidator;
        this.m = dateInputFormat;
        this.n = locale;
        this.o = datePickerColors;
        this.p = focusRequester;
        this.e = i2;
        this.g = i3;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.a) {
            case 0:
                int iIntValue = ((Integer) obj2).intValue();
                return DateInputKt.DateInputTextField_xJ3Ic0Y$lambda$17(this.b, (Long) this.h, this.c, (CalendarModel) this.i, (Function2) this.j, (Function2) this.k, this.d, (DateInputValidator) this.l, (DateInputFormat) this.m, (Locale) this.n, (DatePickerColors) this.o, (FocusRequester) this.p, this.e, this.g, (Composer) obj, iIntValue);
            default:
                int iIntValue2 = ((Integer) obj2).intValue();
                return NavHostKt.NavHost$lambda$13((NavHostController) this.h, (String) this.i, this.b, (Alignment) this.j, (String) this.k, this.c, (Function1) this.l, (Function1) this.m, (Function1) this.n, (Function1) this.o, (Function1) this.p, this.d, this.e, this.g, (Composer) obj, iIntValue2);
        }
    }

    public /* synthetic */ v00(NavHostController navHostController, String str, Modifier modifier, Alignment alignment, String str2, Function1 function1, Function1 function2, Function1 function3, Function1 function4, Function1 function5, Function1 function6, int i, int i2, int i3) {
        this.h = navHostController;
        this.i = str;
        this.b = modifier;
        this.j = alignment;
        this.k = str2;
        this.c = function1;
        this.l = function2;
        this.m = function3;
        this.n = function4;
        this.o = function5;
        this.p = function6;
        this.d = i;
        this.e = i2;
        this.g = i3;
    }
}
