package defpackage;

import androidx.compose.foundation.layout.WindowInsets;
import androidx.compose.foundation.text.KeyboardOptions;
import androidx.compose.material3.AppBarKt;
import androidx.compose.material3.TopAppBarColors;
import androidx.compose.material3.TopAppBarScrollBehavior;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.text.input.VisualTransformation;
import kotlin.Function;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class jb implements Function2 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Modifier c;
    public final /* synthetic */ Function d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object g;
    public final /* synthetic */ Object h;
    public final /* synthetic */ Object i;
    public final /* synthetic */ int j;
    public final /* synthetic */ int k;

    public /* synthetic */ jb(String str, Function1 function1, String str2, String str3, Modifier modifier, VisualTransformation visualTransformation, KeyboardOptions keyboardOptions, int i, int i2) {
        this.a = 4;
        this.b = str;
        this.d = function1;
        this.e = str2;
        this.g = str3;
        this.c = modifier;
        this.h = visualTransformation;
        this.i = keyboardOptions;
        this.j = i;
        this.k = i2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        int i = this.a;
        Object obj3 = this.i;
        Object obj4 = this.h;
        Object obj5 = this.g;
        Object obj6 = this.e;
        Function function = this.d;
        Object obj7 = this.b;
        switch (i) {
            case 0:
                int iIntValue = ((Integer) obj2).intValue();
                return AppBarKt.CenterAlignedTopAppBar$lambda$2((Function2) obj7, this.c, (Function2) function, (Function3) obj6, (WindowInsets) obj5, (TopAppBarColors) obj4, (TopAppBarScrollBehavior) obj3, this.j, this.k, (Composer) obj, iIntValue);
            case 1:
                int iIntValue2 = ((Integer) obj2).intValue();
                return AppBarKt.LargeTopAppBar$lambda$8((Function2) obj7, this.c, (Function2) function, (Function3) obj6, (WindowInsets) obj5, (TopAppBarColors) obj4, (TopAppBarScrollBehavior) obj3, this.j, this.k, (Composer) obj, iIntValue2);
            case 2:
                int iIntValue3 = ((Integer) obj2).intValue();
                return AppBarKt.TopAppBar$lambda$0((Function2) obj7, this.c, (Function2) function, (Function3) obj6, (WindowInsets) obj5, (TopAppBarColors) obj4, (TopAppBarScrollBehavior) obj3, this.j, this.k, (Composer) obj, iIntValue3);
            case 3:
                int iIntValue4 = ((Integer) obj2).intValue();
                return AppBarKt.MediumTopAppBar$lambda$5((Function2) obj7, this.c, (Function2) function, (Function3) obj6, (WindowInsets) obj5, (TopAppBarColors) obj4, (TopAppBarScrollBehavior) obj3, this.j, this.k, (Composer) obj, iIntValue4);
            default:
                ((Integer) obj2).getClass();
                int iUpdateChangedFlags = RecomposeScopeImplKt.updateChangedFlags(this.j | 1);
                p2.b((String) obj7, (Function1) function, (String) obj6, (String) obj5, this.c, (VisualTransformation) obj4, (KeyboardOptions) obj3, (Composer) obj, iUpdateChangedFlags, this.k);
                return Unit.INSTANCE;
        }
    }

    public /* synthetic */ jb(Function2 function2, Modifier modifier, Function2 function3, Function3 function4, WindowInsets windowInsets, TopAppBarColors topAppBarColors, TopAppBarScrollBehavior topAppBarScrollBehavior, int i, int i2, int i3) {
        this.a = i3;
        this.b = function2;
        this.c = modifier;
        this.d = function3;
        this.e = function4;
        this.g = windowInsets;
        this.h = topAppBarColors;
        this.i = topAppBarScrollBehavior;
        this.j = i;
        this.k = i2;
    }
}
