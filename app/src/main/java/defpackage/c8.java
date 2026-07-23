package defpackage;

import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.material3.MaterialTheme;
import androidx.compose.material3.TextKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.MutableState;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.text.style.TextOverflow;
import androidx.compose.ui.unit.Dp;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class c8 implements Function2 {
    public final /* synthetic */ int a;
    public final /* synthetic */ String b;
    public final /* synthetic */ MutableState c;

    public /* synthetic */ c8(int i, MutableState mutableState, String str) {
        this.a = i;
        this.b = str;
        this.c = mutableState;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        long jM5151copywmQWz5c$default;
        int i = this.a;
        MutableState mutableState = this.c;
        switch (i) {
            case 0:
                Composer composer = (Composer) obj;
                int iIntValue = ((Integer) obj2).intValue();
                if (composer.shouldExecute((iIntValue & 3) != 2, iIntValue & 1)) {
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(2131402417, iIntValue, -1, "com.dh.myembyapp.ui.screens.search.AggregateSearchHistoryTag.<anonymous> (AggregateSearchContent.kt:373)");
                    }
                    MaterialTheme materialTheme = MaterialTheme.INSTANCE;
                    int i2 = MaterialTheme.$stable;
                    TextStyle bodyLarge = materialTheme.getTypography(composer, i2).getBodyLarge();
                    if (((Boolean) mutableState.getValue()).booleanValue()) {
                        jM5151copywmQWz5c$default = kb0.u(composer, -186963218, materialTheme, composer, i2);
                    } else {
                        composer.startReplaceGroup(-186890182);
                        jM5151copywmQWz5c$default = Color.m5151copywmQWz5c$default(materialTheme.getColorScheme(composer, i2).getOnSurface(), 0.82f, 0.0f, 0.0f, 0.0f, 14, null);
                        composer.endReplaceGroup();
                    }
                    TextKt.m3048TextNvy7gAk(this.b, PaddingKt.m1000paddingVpY3zN4(Modifier.INSTANCE, Dp.m7813constructorimpl(12.0f), Dp.m7813constructorimpl(8.0f)), jM5151copywmQWz5c$default, null, 0L, null, null, null, 0L, null, null, 0L, TextOverflow.INSTANCE.m7761getEllipsisgIe3tQ8(), false, 1, 0, null, bodyLarge, composer, 48, 24960, 110584);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                } else {
                    composer.skipToGroupEnd();
                }
                break;
            default:
                Composer composer2 = (Composer) obj;
                int iIntValue2 = ((Integer) obj2).intValue();
                if (composer2.shouldExecute((iIntValue2 & 3) != 2, iIntValue2 & 1)) {
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(1109823367, iIntValue2, -1, "com.dh.myembyapp.ui.screens.detail.OtherServerResourceRow.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (DetailScreen.kt:3701)");
                    }
                    TextKt.m3048TextNvy7gAk(this.b, PaddingKt.m1000paddingVpY3zN4(Modifier.INSTANCE, Dp.m7813constructorimpl(8.0f), Dp.m7813constructorimpl(4.0f)), ((Boolean) mutableState.getValue()).booleanValue() ? u90.c : Color.m5151copywmQWz5c$default(Color.INSTANCE.m5189getWhite0d7_KjU(), 0.88f, 0.0f, 0.0f, 0.0f, 14, null), null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, MaterialTheme.INSTANCE.getTypography(composer2, MaterialTheme.$stable).getLabelMedium(), composer2, 48, 0, 131064);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                } else {
                    composer2.skipToGroupEnd();
                }
                break;
        }
        return Unit.INSTANCE;
    }
}
