package defpackage;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.ui.Modifier;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class db2 implements Function2 {
    public final /* synthetic */ int a = 1;
    public final /* synthetic */ Modifier b;
    public final /* synthetic */ String c;
    public final /* synthetic */ boolean d;
    public final /* synthetic */ jc2 e;
    public final /* synthetic */ Function0 g;
    public final /* synthetic */ int h;
    public final /* synthetic */ int i;

    public /* synthetic */ db2(Modifier modifier, String str, boolean z, jc2 jc2Var, Function0 function0, int i, int i2) {
        this.b = modifier;
        this.c = str;
        this.d = z;
        this.e = jc2Var;
        this.g = function0;
        this.h = i;
        this.i = i2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        int i = this.a;
        int i2 = this.h;
        switch (i) {
            case 0:
                ((Integer) obj2).getClass();
                hb2.a(RecomposeScopeImplKt.updateChangedFlags(i2 | 1), this.i, this.e, (Composer) obj, this.b, this.c, this.g, this.d);
                break;
            default:
                ((Integer) obj2).getClass();
                ef2.a(RecomposeScopeImplKt.updateChangedFlags(i2 | 1), this.i, this.e, (Composer) obj, this.b, this.c, this.g, this.d);
                break;
        }
        return Unit.INSTANCE;
    }

    public /* synthetic */ db2(String str, Function0 function0, Modifier modifier, jc2 jc2Var, boolean z, int i, int i2) {
        this.c = str;
        this.g = function0;
        this.b = modifier;
        this.e = jc2Var;
        this.d = z;
        this.h = i;
        this.i = i2;
    }
}
