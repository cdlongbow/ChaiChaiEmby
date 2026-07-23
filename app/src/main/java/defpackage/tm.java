package defpackage;

import androidx.activity.compose.ReportDrawnKt;
import androidx.compose.material3.ExposedDropdownMenu_androidKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.RecomposeScopeImplKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class tm implements Function2 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Function0 b;
    public final /* synthetic */ int c;

    public /* synthetic */ tm(int i, int i2, Function0 function0) {
        this.a = i2;
        this.b = function0;
        this.c = i;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        Composer composer = (Composer) obj;
        Integer num = (Integer) obj2;
        switch (this.a) {
            case 0:
                num.intValue();
                wm.a(this.b, composer, RecomposeScopeImplKt.updateChangedFlags(this.c | 1));
                return Unit.INSTANCE;
            case 1:
                num.getClass();
                lq.a(this.b, composer, RecomposeScopeImplKt.updateChangedFlags(this.c | 1));
                return Unit.INSTANCE;
            case 2:
                num.intValue();
                zb0.b(this.b, composer, RecomposeScopeImplKt.updateChangedFlags(this.c | 1));
                return Unit.INSTANCE;
            case 3:
                return ExposedDropdownMenu_androidKt.OnPlatformWindowBoundsChange$lambda$1(this.b, this.c, composer, num.intValue());
            case 4:
                return ReportDrawnKt.ReportDrawnWhen$lambda$0(this.b, this.c, composer, num.intValue());
            case 5:
                return ReportDrawnKt.ReportDrawnWhen$lambda$2(this.b, this.c, composer, num.intValue());
            case 6:
                num.intValue();
                gy1.a(this.b, composer, RecomposeScopeImplKt.updateChangedFlags(this.c | 1));
                return Unit.INSTANCE;
            case 7:
                num.intValue();
                gy1.c(this.b, composer, RecomposeScopeImplKt.updateChangedFlags(this.c | 1));
                return Unit.INSTANCE;
            default:
                num.intValue();
                v72.f(this.b, composer, RecomposeScopeImplKt.updateChangedFlags(this.c | 1));
                return Unit.INSTANCE;
        }
    }
}
