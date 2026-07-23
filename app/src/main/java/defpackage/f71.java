package defpackage;

import androidx.compose.runtime.Composer;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import java.util.Map;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.reflect.KClass;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class f71 implements Function2 {
    public final /* synthetic */ int a = 0;
    public final /* synthetic */ NavHostController b;
    public final /* synthetic */ KClass c;
    public final /* synthetic */ Modifier d;
    public final /* synthetic */ Alignment e;
    public final /* synthetic */ Map g;
    public final /* synthetic */ Function1 h;
    public final /* synthetic */ Function1 i;
    public final /* synthetic */ Function1 j;
    public final /* synthetic */ Function1 k;
    public final /* synthetic */ Function1 l;
    public final /* synthetic */ Function1 m;
    public final /* synthetic */ int n;
    public final /* synthetic */ int o;
    public final /* synthetic */ int p;
    public final /* synthetic */ Object q;

    public /* synthetic */ f71(NavHostController navHostController, Object obj, Modifier modifier, Alignment alignment, KClass kClass, Map map, Function1 function1, Function1 function2, Function1 function3, Function1 function4, Function1 function5, Function1 function6, int i, int i2, int i3) {
        this.b = navHostController;
        this.q = obj;
        this.d = modifier;
        this.e = alignment;
        this.c = kClass;
        this.g = map;
        this.h = function1;
        this.i = function2;
        this.j = function3;
        this.k = function4;
        this.l = function5;
        this.m = function6;
        this.n = i;
        this.o = i2;
        this.p = i3;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.a) {
            case 0:
                int iIntValue = ((Integer) obj2).intValue();
                return NavHostKt.NavHost$lambda$25(this.b, this.q, this.d, this.e, this.c, this.g, this.h, this.i, this.j, this.k, this.l, this.m, this.n, this.o, this.p, (Composer) obj, iIntValue);
            default:
                int iIntValue2 = ((Integer) obj2).intValue();
                return NavHostKt.NavHost$lambda$19(this.b, this.c, this.d, this.e, (KClass) this.q, this.g, this.h, this.i, this.j, this.k, this.l, this.m, this.n, this.o, this.p, (Composer) obj, iIntValue2);
        }
    }

    public /* synthetic */ f71(NavHostController navHostController, KClass kClass, Modifier modifier, Alignment alignment, KClass kClass2, Map map, Function1 function1, Function1 function2, Function1 function3, Function1 function4, Function1 function5, Function1 function6, int i, int i2, int i3) {
        this.b = navHostController;
        this.c = kClass;
        this.d = modifier;
        this.e = alignment;
        this.q = kClass2;
        this.g = map;
        this.h = function1;
        this.i = function2;
        this.j = function3;
        this.k = function4;
        this.l = function5;
        this.m = function6;
        this.n = i;
        this.o = i2;
        this.p = i3;
    }
}
