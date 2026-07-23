package defpackage;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.ui.Modifier;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class bz implements Function2 {
    public final /* synthetic */ int a;
    public final /* synthetic */ String b;
    public final /* synthetic */ boolean c;
    public final /* synthetic */ Function0 d;
    public final /* synthetic */ Modifier e;
    public final /* synthetic */ int g;

    public /* synthetic */ bz(String str, boolean z, Modifier modifier, Function0 function0, int i) {
        this.a = 2;
        this.b = str;
        this.c = z;
        this.e = modifier;
        this.d = function0;
        this.g = i;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        int i = this.a;
        int i2 = this.g;
        switch (i) {
            case 0:
                ((Integer) obj2).getClass();
                gz.c(RecomposeScopeImplKt.updateChangedFlags(i2 | 1), (Composer) obj, this.e, this.b, this.d, this.c);
                break;
            case 1:
                ((Integer) obj2).getClass();
                u90.u0(RecomposeScopeImplKt.updateChangedFlags(i2 | 1), (Composer) obj, this.e, this.b, this.d, this.c);
                break;
            default:
                ((Integer) obj2).getClass();
                v72.g(RecomposeScopeImplKt.updateChangedFlags(i2 | 1), (Composer) obj, this.e, this.b, this.d, this.c);
                break;
        }
        return Unit.INSTANCE;
    }

    public /* synthetic */ bz(String str, boolean z, Function0 function0, Modifier modifier, int i, int i2) {
        this.a = i2;
        this.b = str;
        this.c = z;
        this.d = function0;
        this.e = modifier;
        this.g = i;
    }
}
