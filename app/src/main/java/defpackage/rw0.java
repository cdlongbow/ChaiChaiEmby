package defpackage;

import androidx.compose.foundation.layout.RowScope;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.lazy.LazyItemScope;
import androidx.compose.foundation.lazy.LazyListIntervalContent;
import androidx.compose.foundation.lazy.grid.LazyGridIntervalContent;
import androidx.compose.foundation.lazy.grid.LazyGridItemScope;
import androidx.compose.material3.TextKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.MutableState;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.text.style.TextAlign;
import androidx.compose.ui.unit.TextUnitKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.functions.Function4;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class rw0 implements Function3 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ int c;

    public /* synthetic */ rw0(int i, MutableState mutableState) {
        this.a = 2;
        this.c = i;
        this.b = mutableState;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.jvm.functions.Function3
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        int i = this.a;
        Object obj4 = this.b;
        int i2 = this.c;
        switch (i) {
            case 0:
                return LazyGridIntervalContent.stickyHeader$lambda$2((Function4) obj4, i2, (LazyGridItemScope) obj, (Composer) obj2, ((Integer) obj3).intValue());
            case 1:
                return LazyListIntervalContent.stickyHeader$lambda$1((Function4) obj4, i2, (LazyItemScope) obj, (Composer) obj2, ((Integer) obj3).intValue());
            default:
                MutableState mutableState = (MutableState) obj4;
                Composer composer = (Composer) obj2;
                int iIntValue = ((Integer) obj3).intValue();
                ((RowScope) obj).getClass();
                if (composer.shouldExecute((iIntValue & 17) != 16, iIntValue & 1)) {
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(1618286847, iIntValue, -1, "com.dh.myembyapp.ui.components.AudioDelaySelector.<anonymous>.<anonymous>.<anonymous> (OtherSettingsOverlay.kt:1091)");
                    }
                    TextKt.m3048TextNvy7gAk("归零", SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null), hc2.q(0, 0, ((Boolean) mutableState.getValue()).booleanValue(), i2 != 0), null, TextUnitKt.getSp(14), null, null, null, 0L, null, TextAlign.m7696boximpl(TextAlign.INSTANCE.m7703getCentere0LSkKk()), 0L, 0, false, 1, 0, null, null, composer, 24630, 27648, 236520);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                } else {
                    composer.skipToGroupEnd();
                }
                return Unit.INSTANCE;
        }
    }

    public /* synthetic */ rw0(Function4 function4, int i, int i2) {
        this.a = i2;
        this.b = function4;
        this.c = i;
    }
}
