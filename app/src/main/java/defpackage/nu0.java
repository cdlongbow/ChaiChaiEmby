package defpackage;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.ui.Modifier;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class nu0 implements Function2 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Modifier b;
    public final /* synthetic */ String c;
    public final /* synthetic */ String d;
    public final /* synthetic */ boolean e;
    public final /* synthetic */ Function0 g;
    public final /* synthetic */ int h;

    public /* synthetic */ nu0(Modifier modifier, String str, String str2, boolean z, Function0 function0, int i) {
        this.a = 1;
        this.b = modifier;
        this.c = str;
        this.d = str2;
        this.e = z;
        this.g = function0;
        this.h = i;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        int i = this.a;
        int i2 = this.h;
        switch (i) {
            case 0:
                ((Integer) obj2).getClass();
                qu0.b(RecomposeScopeImplKt.updateChangedFlags(i2 | 1), (Composer) obj, this.b, this.c, this.d, this.g, this.e);
                break;
            case 1:
                ((Integer) obj2).getClass();
                y91.a(RecomposeScopeImplKt.updateChangedFlags(i2 | 1), (Composer) obj, this.b, this.c, this.d, this.g, this.e);
                break;
            case 2:
                ((Integer) obj2).getClass();
                xr1.a(RecomposeScopeImplKt.updateChangedFlags(i2 | 1), (Composer) obj, this.b, this.c, this.d, this.g, this.e);
                break;
            case 3:
                ((Integer) obj2).getClass();
                v72.h(RecomposeScopeImplKt.updateChangedFlags(i2 | 1), (Composer) obj, this.b, this.c, this.d, this.g, this.e);
                break;
            default:
                ((Integer) obj2).getClass();
                hb2.g(RecomposeScopeImplKt.updateChangedFlags(i2 | 1), (Composer) obj, this.b, this.c, this.d, this.g, this.e);
                break;
        }
        return Unit.INSTANCE;
    }

    public /* synthetic */ nu0(String str, String str2, boolean z, Modifier modifier, Function0 function0, int i, int i2) {
        this.a = i2;
        this.c = str;
        this.d = str2;
        this.e = z;
        this.b = modifier;
        this.g = function0;
        this.h = i;
    }
}
