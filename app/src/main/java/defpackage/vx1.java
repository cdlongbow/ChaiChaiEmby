package defpackage;

import androidx.compose.foundation.lazy.grid.LazyGridItemScope;
import androidx.compose.material3.internal.TextFieldImplKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.ui.layout.Measurable;
import androidx.compose.ui.layout.MeasureScope;
import androidx.compose.ui.unit.Constraints;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function3;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class vx1 implements Function3 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Function0 b;

    public /* synthetic */ vx1(int i, Function0 function0) {
        this.a = i;
        this.b = function0;
    }

    @Override // kotlin.jvm.functions.Function3
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        int i = this.a;
        Function0 function0 = this.b;
        switch (i) {
            case 0:
                Composer composer = (Composer) obj2;
                int iIntValue = ((Integer) obj3).intValue();
                ((LazyGridItemScope) obj).getClass();
                if (composer.shouldExecute((iIntValue & 17) != 16, iIntValue & 1)) {
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(811431420, iIntValue, -1, "com.dh.myembyapp.ui.screens.serverlist.ServerListScreen.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (ServerListScreen.kt:495)");
                    }
                    gy1.a(function0, composer, 0);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                } else {
                    composer.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            default:
                return TextFieldImplKt.textFieldLabelMinHeight$lambda$26(function0, (MeasureScope) obj, (Measurable) obj2, (Constraints) obj3);
        }
    }
}
