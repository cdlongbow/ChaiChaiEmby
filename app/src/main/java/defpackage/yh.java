package defpackage;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.RecomposeScopeImplKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class yh implements Function2 {
    public final /* synthetic */ int a;
    public final /* synthetic */ String b;
    public final /* synthetic */ boolean c;
    public final /* synthetic */ Function0 d;
    public final /* synthetic */ int e;

    public /* synthetic */ yh(String str, boolean z, Function0 function0, int i, int i2) {
        this.a = i2;
        this.b = str;
        this.c = z;
        this.d = function0;
        this.e = i;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        int i = this.a;
        int i2 = this.e;
        Function0 function0 = this.d;
        boolean z = this.c;
        String str = this.b;
        Composer composer = (Composer) obj;
        Integer num = (Integer) obj2;
        switch (i) {
            case 0:
                num.getClass();
                pi.p(str, z, function0, composer, RecomposeScopeImplKt.updateChangedFlags(i2 | 1));
                break;
            case 1:
                num.intValue();
                vj0.h(str, z, function0, composer, RecomposeScopeImplKt.updateChangedFlags(i2 | 1));
                break;
            default:
                num.intValue();
                cc1.h(str, z, function0, composer, RecomposeScopeImplKt.updateChangedFlags(i2 | 1));
                break;
        }
        return Unit.INSTANCE;
    }
}
