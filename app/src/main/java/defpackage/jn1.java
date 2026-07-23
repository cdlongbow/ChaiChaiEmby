package defpackage;

import androidx.compose.foundation.text.KeyboardOptions;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.SolidColor;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.text.input.TextFieldValue;
import androidx.compose.ui.text.input.VisualTransformation;
import kotlin.Function;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.functions.Function4;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class jn1 implements Function2 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Function1 b;
    public final /* synthetic */ boolean c;
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
    public final /* synthetic */ Function p;
    public final /* synthetic */ Object q;

    public /* synthetic */ jn1(Object obj, Function1 function1, Modifier modifier, boolean z, TextStyle textStyle, SolidColor solidColor, KeyboardOptions keyboardOptions, Function0 function0, VisualTransformation visualTransformation, Function1 function2, Function4 function4, Function3 function3, int i, int i2, int i3, int i4) {
        this.a = i4;
        this.h = obj;
        this.b = function1;
        this.i = modifier;
        this.c = z;
        this.j = textStyle;
        this.k = solidColor;
        this.l = keyboardOptions;
        this.m = function0;
        this.n = visualTransformation;
        this.o = function2;
        this.p = function4;
        this.q = function3;
        this.d = i;
        this.e = i2;
        this.g = i3;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        int i = this.a;
        int i2 = this.e;
        int i3 = this.d;
        Object obj3 = this.q;
        Function function = this.p;
        Object obj4 = this.o;
        Object obj5 = this.n;
        Object obj6 = this.m;
        Object obj7 = this.l;
        Object obj8 = this.k;
        Object obj9 = this.j;
        Object obj10 = this.i;
        Object obj11 = this.h;
        switch (i) {
            case 0:
                ((Integer) obj2).getClass();
                int iUpdateChangedFlags = RecomposeScopeImplKt.updateChangedFlags(i3 | 1);
                int iUpdateChangedFlags2 = RecomposeScopeImplKt.updateChangedFlags(i2);
                kn1.a((String) obj11, (String) obj10, (String) obj9, (String) obj8, (Integer) obj5, (Integer) obj4, (String) obj7, (String) obj6, this.c, this.b, (Function2) function, (to1) obj3, (Composer) obj, iUpdateChangedFlags, iUpdateChangedFlags2, this.g);
                break;
            case 1:
                ((Integer) obj2).getClass();
                int iUpdateChangedFlags3 = RecomposeScopeImplKt.updateChangedFlags(i3 | 1);
                int iUpdateChangedFlags4 = RecomposeScopeImplKt.updateChangedFlags(i2);
                yc2.a((TextFieldValue) obj11, this.b, (Modifier) obj10, this.c, (TextStyle) obj9, (SolidColor) obj8, (KeyboardOptions) obj7, (Function0) obj6, (VisualTransformation) obj5, (Function1) obj4, (Function4) function, (Function3) obj3, (Composer) obj, iUpdateChangedFlags3, iUpdateChangedFlags4, this.g);
                break;
            default:
                ((Integer) obj2).getClass();
                int iUpdateChangedFlags5 = RecomposeScopeImplKt.updateChangedFlags(i3 | 1);
                int iUpdateChangedFlags6 = RecomposeScopeImplKt.updateChangedFlags(i2);
                yc2.b((String) obj11, this.b, (Modifier) obj10, this.c, (TextStyle) obj9, (SolidColor) obj8, (KeyboardOptions) obj7, (Function0) obj6, (VisualTransformation) obj5, (Function1) obj4, (Function4) function, (Function3) obj3, (Composer) obj, iUpdateChangedFlags5, iUpdateChangedFlags6, this.g);
                break;
        }
        return Unit.INSTANCE;
    }

    public /* synthetic */ jn1(String str, String str2, String str3, String str4, Integer num, Integer num2, String str5, String str6, boolean z, Function1 function1, Function2 function2, to1 to1Var, int i, int i2, int i3) {
        this.a = 0;
        this.h = str;
        this.i = str2;
        this.j = str3;
        this.k = str4;
        this.n = num;
        this.o = num2;
        this.l = str5;
        this.m = str6;
        this.c = z;
        this.b = function1;
        this.p = function2;
        this.q = to1Var;
        this.d = i;
        this.e = i2;
        this.g = i3;
    }
}
