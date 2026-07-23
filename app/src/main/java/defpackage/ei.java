package defpackage;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.RecomposeScopeImplKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class ei implements Function2 {
    public final /* synthetic */ int a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ int c;

    public /* synthetic */ ei(boolean z, int i, int i2) {
        this.a = i2;
        this.b = z;
        this.c = i;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        int i = this.a;
        Composer composer = (Composer) obj;
        ((Integer) obj2).intValue();
        switch (i) {
            case 0:
                pi.d(this.b, composer, RecomposeScopeImplKt.updateChangedFlags(this.c | 1));
                break;
            case 1:
                y91.b(this.b, composer, RecomposeScopeImplKt.updateChangedFlags(this.c | 1));
                break;
            default:
                ef2.b(this.b, composer, RecomposeScopeImplKt.updateChangedFlags(this.c | 1));
                break;
        }
        return Unit.INSTANCE;
    }
}
