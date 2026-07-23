package defpackage;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.ui.Modifier;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class jx1 implements Function2 {
    public final /* synthetic */ int a;
    public final /* synthetic */ String b;
    public final /* synthetic */ Function0 c;
    public final /* synthetic */ Modifier d;
    public final /* synthetic */ boolean e;
    public final /* synthetic */ long g;
    public final /* synthetic */ float h;
    public final /* synthetic */ float i;
    public final /* synthetic */ int j;
    public final /* synthetic */ int k;
    public final /* synthetic */ Object l;

    public /* synthetic */ jx1(String str, Function0 function0, Modifier modifier, boolean z, Object obj, long j, float f, float f2, int i, int i2, int i3) {
        this.a = i3;
        this.b = str;
        this.c = function0;
        this.d = modifier;
        this.e = z;
        this.l = obj;
        this.g = j;
        this.h = f;
        this.i = f2;
        this.j = i;
        this.k = i2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        int i = this.a;
        int i2 = this.j;
        Object obj3 = this.l;
        switch (i) {
            case 0:
                ((Integer) obj2).getClass();
                int iUpdateChangedFlags = RecomposeScopeImplKt.updateChangedFlags(i2 | 1);
                lx1.a(this.b, this.c, this.d, this.e, (cx1) obj3, this.g, this.h, this.i, (Composer) obj, iUpdateChangedFlags, this.k);
                break;
            default:
                ((Integer) obj2).getClass();
                int iUpdateChangedFlags2 = RecomposeScopeImplKt.updateChangedFlags(i2 | 1);
                hc2.c(this.b, this.c, this.d, this.e, (Function0) obj3, this.g, this.h, this.i, (Composer) obj, iUpdateChangedFlags2, this.k);
                break;
        }
        return Unit.INSTANCE;
    }
}
