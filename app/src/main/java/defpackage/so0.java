package defpackage;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.RecomposeScopeImplKt;
import com.dh.myembyapp.data.model.ServerConfig;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class so0 implements Function2 {
    public final /* synthetic */ int a = 1;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ Function1 c;
    public final /* synthetic */ Function1 d;
    public final /* synthetic */ Function1 e;
    public final /* synthetic */ Function2 g;
    public final /* synthetic */ Function2 h;
    public final /* synthetic */ Function1 i;
    public final /* synthetic */ Function0 j;
    public final /* synthetic */ Function0 k;
    public final /* synthetic */ Function0 l;
    public final /* synthetic */ Function0 m;
    public final /* synthetic */ int n;
    public final /* synthetic */ int o;
    public final /* synthetic */ Object p;
    public final /* synthetic */ Object q;

    public /* synthetic */ so0(NavBackStackEntry navBackStackEntry, ServerConfig serverConfig, boolean z, Function1 function1, Function1 function2, Function1 function3, Function2 function4, Function2 function5, Function1 function6, Function0 function0, Function0 function7, Function0 function8, Function0 function9, int i, int i2) {
        this.p = navBackStackEntry;
        this.q = serverConfig;
        this.b = z;
        this.c = function1;
        this.d = function2;
        this.e = function3;
        this.g = function4;
        this.h = function5;
        this.i = function6;
        this.j = function0;
        this.k = function7;
        this.l = function8;
        this.m = function9;
        this.n = i;
        this.o = i2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        int i = this.a;
        int i2 = this.o;
        int i3 = this.n;
        Object obj3 = this.q;
        Object obj4 = this.p;
        switch (i) {
            case 0:
                ((Integer) obj2).getClass();
                int iUpdateChangedFlags = RecomposeScopeImplKt.updateChangedFlags(i3 | 1);
                int iUpdateChangedFlags2 = RecomposeScopeImplKt.updateChangedFlags(i2);
                bq0.f(this.c, this.d, this.e, this.g, this.h, this.i, this.j, this.k, this.l, this.m, (cq0) obj4, (zq0) obj3, this.b, (Composer) obj, iUpdateChangedFlags, iUpdateChangedFlags2);
                break;
            default:
                ((Integer) obj2).getClass();
                int iUpdateChangedFlags3 = RecomposeScopeImplKt.updateChangedFlags(i3 | 1);
                int iUpdateChangedFlags4 = RecomposeScopeImplKt.updateChangedFlags(i2);
                e31.a((NavBackStackEntry) obj4, (ServerConfig) obj3, this.b, this.c, this.d, this.e, this.g, this.h, this.i, this.j, this.k, this.l, this.m, (Composer) obj, iUpdateChangedFlags3, iUpdateChangedFlags4);
                break;
        }
        return Unit.INSTANCE;
    }

    public /* synthetic */ so0(Function1 function1, Function1 function2, Function1 function3, Function2 function4, Function2 function5, Function1 function6, Function0 function0, Function0 function7, Function0 function8, Function0 function9, cq0 cq0Var, zq0 zq0Var, boolean z, int i, int i2) {
        this.c = function1;
        this.d = function2;
        this.e = function3;
        this.g = function4;
        this.h = function5;
        this.i = function6;
        this.j = function0;
        this.k = function7;
        this.l = function8;
        this.m = function9;
        this.p = cq0Var;
        this.q = zq0Var;
        this.b = z;
        this.n = i;
        this.o = i2;
    }
}
