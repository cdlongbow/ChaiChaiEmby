package defpackage;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.RecomposeScopeImplKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class ty implements Function2 {
    public final /* synthetic */ int a;
    public final /* synthetic */ float b;
    public final /* synthetic */ Function1 c;
    public final /* synthetic */ int d;

    public /* synthetic */ ty(float f, Function1 function1, int i, int i2) {
        this.a = i2;
        this.b = f;
        this.c = function1;
        this.d = i;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        int i = this.a;
        Composer composer = (Composer) obj;
        ((Integer) obj2).intValue();
        switch (i) {
            case 0:
                gz.e(this.b, this.c, composer, RecomposeScopeImplKt.updateChangedFlags(this.d | 1));
                break;
            case 1:
                gz.f(this.b, this.c, composer, RecomposeScopeImplKt.updateChangedFlags(this.d | 1));
                break;
            default:
                gz.d(this.b, this.c, composer, RecomposeScopeImplKt.updateChangedFlags(this.d | 1));
                break;
        }
        return Unit.INSTANCE;
    }
}
