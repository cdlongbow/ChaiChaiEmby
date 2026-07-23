package defpackage;

import androidx.compose.foundation.layout.WindowInsets;
import androidx.compose.material3.ScaffoldKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.RecomposeScopeImplKt;
import kotlin.Function;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class k51 implements Function2 {
    public final /* synthetic */ int a = 1;
    public final /* synthetic */ int b;
    public final /* synthetic */ int c;
    public final /* synthetic */ Function d;
    public final /* synthetic */ Function e;
    public final /* synthetic */ Function g;
    public final /* synthetic */ Function h;
    public final /* synthetic */ Object i;
    public final /* synthetic */ Function j;

    public /* synthetic */ k51(int i, Function2 function2, Function3 function3, Function2 function4, Function2 function5, WindowInsets windowInsets, Function2 function6, int i2) {
        this.b = i;
        this.d = function2;
        this.e = function3;
        this.g = function4;
        this.h = function5;
        this.i = windowInsets;
        this.j = function6;
        this.c = i2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.a) {
            case 0:
                ((Integer) obj2).getClass();
                m51.a((Function0) this.d, (Function0) this.e, (Function0) this.g, (Function0) this.h, this.b, (Function1) this.j, (Function0) this.i, (Composer) obj, RecomposeScopeImplKt.updateChangedFlags(this.c | 1));
                return Unit.INSTANCE;
            default:
                int iIntValue = ((Integer) obj2).intValue();
                return ScaffoldKt.ScaffoldLayout_FMILGgc$lambda$16(this.b, (Function2) this.d, (Function3) this.e, (Function2) this.g, (Function2) this.h, (WindowInsets) this.i, (Function2) this.j, this.c, (Composer) obj, iIntValue);
        }
    }

    public /* synthetic */ k51(Function0 function0, Function0 function1, Function0 function2, Function0 function3, int i, Function1 function4, Function0 function5, int i2) {
        this.d = function0;
        this.e = function1;
        this.g = function2;
        this.h = function3;
        this.b = i;
        this.j = function4;
        this.i = function5;
        this.c = i2;
    }
}
