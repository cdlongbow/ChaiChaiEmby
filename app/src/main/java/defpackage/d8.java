package defpackage;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.RecomposeScopeImplKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class d8 implements Function2 {
    public final /* synthetic */ int a;
    public final /* synthetic */ String b;
    public final /* synthetic */ Function0 c;
    public final /* synthetic */ int d;

    public /* synthetic */ d8(String str, Function0 function0, int i, int i2) {
        this.a = i2;
        this.b = str;
        this.c = function0;
        this.d = i;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        int i = this.a;
        int i2 = this.d;
        Function0 function0 = this.c;
        String str = this.b;
        Composer composer = (Composer) obj;
        Integer num = (Integer) obj2;
        switch (i) {
            case 0:
                num.intValue();
                m8.c(str, function0, composer, RecomposeScopeImplKt.updateChangedFlags(i2 | 1));
                break;
            default:
                num.getClass();
                lq.e(str, function0, composer, RecomposeScopeImplKt.updateChangedFlags(i2 | 1));
                break;
        }
        return Unit.INSTANCE;
    }
}
