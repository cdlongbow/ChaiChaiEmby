package defpackage;

import androidx.compose.foundation.layout.BoxScope;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function3;

/* JADX INFO: loaded from: classes4.dex */
public final class j8 implements Function3 {
    public final /* synthetic */ List a;

    public j8(List list) {
        this.a = list;
    }

    @Override // kotlin.jvm.functions.Function3
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        BoxScope boxScope = (BoxScope) obj;
        Composer composer = (Composer) obj2;
        int iIntValue = ((Number) obj3).intValue();
        boxScope.getClass();
        if ((iIntValue & 6) == 0) {
            iIntValue |= composer.changed(boxScope) ? 4 : 2;
        }
        if (composer.shouldExecute((iIntValue & 19) != 18, iIntValue & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1263801601, iIntValue, -1, "com.dh.myembyapp.ui.screens.search.AggregateSearchResultSection.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (AggregateSearchContent.kt:540)");
            }
            m8.g(boxScope, this.a, composer, iIntValue & 14);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composer.skipToGroupEnd();
        }
        return Unit.INSTANCE;
    }
}
