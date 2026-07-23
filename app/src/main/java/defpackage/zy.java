package defpackage;

import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.material3.MaterialTheme;
import androidx.compose.material3.TextKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.ColorKt;
import androidx.compose.ui.unit.Dp;
import androidx.compose.ui.unit.TextUnitKt;
import java.util.Arrays;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.StringCompanionObject;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class zy implements Function2 {
    public final /* synthetic */ int a;
    public final /* synthetic */ float b;

    public /* synthetic */ zy(float f, int i) {
        this.a = i;
        this.b = f;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        int i = this.a;
        float f = this.b;
        switch (i) {
            case 0:
                Composer composer = (Composer) obj;
                int iIntValue = ((Integer) obj2).intValue();
                if (composer.shouldExecute((iIntValue & 3) != 2, iIntValue & 1)) {
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-159022204, iIntValue, -1, "com.dh.myembyapp.ui.components.ScreenPartSlider.<anonymous>.<anonymous>.<anonymous> (DanmakuSettingsDialog.kt:726)");
                    }
                    TextKt.m3048TextNvy7gAk("−", null, f > 0.05f ? Color.INSTANCE.m5189getWhite0d7_KjU() : Color.INSTANCE.m5182getGray0d7_KjU(), null, TextUnitKt.getSp(16), null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, composer, 24582, 0, 262122);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                } else {
                    composer.skipToGroupEnd();
                }
                break;
            case 1:
                Composer composer2 = (Composer) obj;
                int iIntValue2 = ((Integer) obj2).intValue();
                if (composer2.shouldExecute((iIntValue2 & 3) != 2, iIntValue2 & 1)) {
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-987245556, iIntValue2, -1, "com.dh.myembyapp.ui.components.ScreenPartSlider.<anonymous>.<anonymous>.<anonymous> (DanmakuSettingsDialog.kt:773)");
                    }
                    TextKt.m3048TextNvy7gAk("+", null, f < 1.0f ? Color.INSTANCE.m5189getWhite0d7_KjU() : Color.INSTANCE.m5182getGray0d7_KjU(), null, TextUnitKt.getSp(16), null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, composer2, 24582, 0, 262122);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                } else {
                    composer2.skipToGroupEnd();
                }
                break;
            default:
                Composer composer3 = (Composer) obj;
                int iIntValue3 = ((Integer) obj2).intValue();
                if (composer3.shouldExecute((iIntValue3 & 3) != 2, iIntValue3 & 1)) {
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-1541617692, iIntValue3, -1, "com.dh.myembyapp.ui.screens.detail.DetailHeader.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (DetailScreen.kt:1904)");
                    }
                    StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
                    TextKt.m3048TextNvy7gAk(String.format("%.1f", Arrays.copyOf(new Object[]{Float.valueOf(f)}, 1)), PaddingKt.m1000paddingVpY3zN4(Modifier.INSTANCE, Dp.m7813constructorimpl(10.0f), Dp.m7813constructorimpl(4.0f)), ColorKt.Color(4282664004L), null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, MaterialTheme.INSTANCE.getTypography(composer3, MaterialTheme.$stable).getBodyMedium(), composer3, 432, 0, 131064);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                } else {
                    composer3.skipToGroupEnd();
                }
                break;
        }
        return Unit.INSTANCE;
    }
}
