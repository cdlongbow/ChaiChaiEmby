package defpackage;

import androidx.compose.material3.DatePickerColors;
import androidx.compose.material3.DatePickerKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.ui.Modifier;
import kotlin.Function;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class c10 implements Function2 {
    public final /* synthetic */ int a = 0;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ boolean c;
    public final /* synthetic */ boolean d;
    public final /* synthetic */ String e;
    public final /* synthetic */ Modifier g;
    public final /* synthetic */ int h;
    public final /* synthetic */ Function i;
    public final /* synthetic */ Function j;
    public final /* synthetic */ Function k;
    public final /* synthetic */ Object l;

    public /* synthetic */ c10(Modifier modifier, boolean z, boolean z2, boolean z3, String str, Function0 function0, Function0 function1, Function0 function2, DatePickerColors datePickerColors, int i) {
        this.g = modifier;
        this.b = z;
        this.c = z2;
        this.d = z3;
        this.e = str;
        this.i = function0;
        this.j = function1;
        this.k = function2;
        this.l = datePickerColors;
        this.h = i;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.a) {
            case 0:
                int iIntValue = ((Integer) obj2).intValue();
                return DatePickerKt.MonthsNavigation$lambda$69(this.g, this.b, this.c, this.d, this.e, (Function0) this.i, (Function0) this.j, (Function0) this.k, (DatePickerColors) this.l, this.h, (Composer) obj, iIntValue);
            default:
                ((Integer) obj2).getClass();
                vj0.b(this.b, this.c, this.d, this.e, (Function1) this.i, (Function1) this.j, (Function1) this.k, (Function1) this.l, this.g, (Composer) obj, RecomposeScopeImplKt.updateChangedFlags(this.h | 1));
                return Unit.INSTANCE;
        }
    }

    public /* synthetic */ c10(boolean z, boolean z2, boolean z3, String str, Function1 function1, Function1 function2, Function1 function3, Function1 function4, Modifier modifier, int i) {
        this.b = z;
        this.c = z2;
        this.d = z3;
        this.e = str;
        this.i = function1;
        this.j = function2;
        this.k = function3;
        this.l = function4;
        this.g = modifier;
        this.h = i;
    }
}
