package defpackage;

import androidx.compose.material3.pulltorefresh.PullToRefreshDefaults;
import androidx.compose.material3.pulltorefresh.PullToRefreshState;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.Shape;
import kotlin.Function;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class tr1 implements Function2 {
    public final /* synthetic */ int a = 0;
    public final /* synthetic */ Modifier b;
    public final /* synthetic */ boolean c;
    public final /* synthetic */ long d;
    public final /* synthetic */ float e;
    public final /* synthetic */ float g;
    public final /* synthetic */ int h;
    public final /* synthetic */ int i;
    public final /* synthetic */ Object j;
    public final /* synthetic */ Object k;
    public final /* synthetic */ Object l;
    public final /* synthetic */ Function m;

    public /* synthetic */ tr1(PullToRefreshDefaults pullToRefreshDefaults, PullToRefreshState pullToRefreshState, boolean z, Modifier modifier, float f, Shape shape, long j, float f2, Function3 function3, int i, int i2) {
        this.j = pullToRefreshDefaults;
        this.k = pullToRefreshState;
        this.c = z;
        this.b = modifier;
        this.e = f;
        this.l = shape;
        this.d = j;
        this.g = f2;
        this.m = function3;
        this.h = i;
        this.i = i2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        int i = this.a;
        Function function = this.m;
        Object obj3 = this.l;
        Object obj4 = this.k;
        Object obj5 = this.j;
        switch (i) {
            case 0:
                int iIntValue = ((Integer) obj2).intValue();
                return PullToRefreshDefaults.IndicatorBox_1CPYgEU$lambda$7((PullToRefreshDefaults) obj5, (PullToRefreshState) obj4, this.c, this.b, this.e, (Shape) obj3, this.d, this.g, (Function3) function, this.h, this.i, (Composer) obj, iIntValue);
            default:
                ((Integer) obj2).getClass();
                int iUpdateChangedFlags = RecomposeScopeImplKt.updateChangedFlags(this.h | 1);
                hc2.a((String) obj5, (Function0) obj4, this.b, (jc2) obj3, this.c, (Function0) function, this.d, this.e, this.g, (Composer) obj, iUpdateChangedFlags, this.i);
                return Unit.INSTANCE;
        }
    }

    public /* synthetic */ tr1(String str, Function0 function0, Modifier modifier, jc2 jc2Var, boolean z, Function0 function1, long j, float f, float f2, int i, int i2) {
        this.j = str;
        this.k = function0;
        this.b = modifier;
        this.l = jc2Var;
        this.c = z;
        this.m = function1;
        this.d = j;
        this.e = f;
        this.g = f2;
        this.h = i;
        this.i = i2;
    }
}
