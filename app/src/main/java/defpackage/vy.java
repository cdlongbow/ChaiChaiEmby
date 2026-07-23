package defpackage;

import androidx.activity.compose.ReportDrawnKt;
import androidx.compose.material3.TextKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.unit.TextUnitKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class vy implements Function2 {
    public final /* synthetic */ int a;
    public final /* synthetic */ int b;

    public /* synthetic */ vy(int i, int i2) {
        this.a = i2;
        this.b = i;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        int i = this.a;
        int i2 = this.b;
        switch (i) {
            case 0:
                Composer composer = (Composer) obj;
                int iIntValue = ((Integer) obj2).intValue();
                if (composer.shouldExecute((iIntValue & 3) != 2, iIntValue & 1)) {
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(173560132, iIntValue, -1, "com.dh.myembyapp.ui.components.SizeSelector.<anonymous>.<anonymous>.<anonymous> (DanmakuSettingsDialog.kt:553)");
                    }
                    TextKt.m3048TextNvy7gAk("−", null, i2 > 5 ? Color.INSTANCE.m5189getWhite0d7_KjU() : Color.INSTANCE.m5182getGray0d7_KjU(), null, TextUnitKt.getSp(16), null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, composer, 24582, 0, 262122);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                } else {
                    composer.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 1:
                Composer composer2 = (Composer) obj;
                int iIntValue2 = ((Integer) obj2).intValue();
                if (composer2.shouldExecute((iIntValue2 & 3) != 2, iIntValue2 & 1)) {
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(1434985932, iIntValue2, -1, "com.dh.myembyapp.ui.components.SizeSelector.<anonymous>.<anonymous>.<anonymous> (DanmakuSettingsDialog.kt:599)");
                    }
                    TextKt.m3048TextNvy7gAk("+", null, i2 < 30 ? Color.INSTANCE.m5189getWhite0d7_KjU() : Color.INSTANCE.m5182getGray0d7_KjU(), null, TextUnitKt.getSp(16), null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, composer2, 24582, 0, 262122);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                } else {
                    composer2.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 2:
                Composer composer3 = (Composer) obj;
                int iIntValue3 = ((Integer) obj2).intValue();
                if (composer3.shouldExecute((iIntValue3 & 3) != 2, iIntValue3 & 1)) {
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-1686870955, iIntValue3, -1, "com.dh.myembyapp.ui.components.OpacitySelector.<anonymous>.<anonymous>.<anonymous> (DanmakuSettingsDialog.kt:820)");
                    }
                    TextKt.m3048TextNvy7gAk("−", null, i2 > 0 ? Color.INSTANCE.m5189getWhite0d7_KjU() : Color.INSTANCE.m5182getGray0d7_KjU(), null, TextUnitKt.getSp(16), null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, composer3, 24582, 0, 262122);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                } else {
                    composer3.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 3:
                Composer composer4 = (Composer) obj;
                int iIntValue4 = ((Integer) obj2).intValue();
                if (composer4.shouldExecute((iIntValue4 & 3) != 2, iIntValue4 & 1)) {
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-1237376819, iIntValue4, -1, "com.dh.myembyapp.ui.components.OpacitySelector.<anonymous>.<anonymous>.<anonymous> (DanmakuSettingsDialog.kt:866)");
                    }
                    TextKt.m3048TextNvy7gAk("+", null, i2 < 100 ? Color.INSTANCE.m5189getWhite0d7_KjU() : Color.INSTANCE.m5182getGray0d7_KjU(), null, TextUnitKt.getSp(16), null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, composer4, 24582, 0, 262122);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                } else {
                    composer4.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 4:
                Composer composer5 = (Composer) obj;
                int iIntValue5 = ((Integer) obj2).intValue();
                if (composer5.shouldExecute((iIntValue5 & 3) != 2, iIntValue5 & 1)) {
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(512031614, iIntValue5, -1, "com.dh.myembyapp.ui.components.SpeedSelector.<anonymous>.<anonymous>.<anonymous> (DanmakuSettingsDialog.kt:457)");
                    }
                    TextKt.m3048TextNvy7gAk("−", null, i2 > 3 ? Color.INSTANCE.m5189getWhite0d7_KjU() : Color.INSTANCE.m5182getGray0d7_KjU(), null, TextUnitKt.getSp(16), null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, composer5, 24582, 0, 262122);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                } else {
                    composer5.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 5:
                Composer composer6 = (Composer) obj;
                int iIntValue6 = ((Integer) obj2).intValue();
                if (composer6.shouldExecute((iIntValue6 & 3) != 2, iIntValue6 & 1)) {
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(961525750, iIntValue6, -1, "com.dh.myembyapp.ui.components.SpeedSelector.<anonymous>.<anonymous>.<anonymous> (DanmakuSettingsDialog.kt:503)");
                    }
                    TextKt.m3048TextNvy7gAk("+", null, i2 < 20 ? Color.INSTANCE.m5189getWhite0d7_KjU() : Color.INSTANCE.m5182getGray0d7_KjU(), null, TextUnitKt.getSp(16), null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, composer6, 24582, 0, 262122);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                } else {
                    composer6.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 6:
                Composer composer7 = (Composer) obj;
                int iIntValue7 = ((Integer) obj2).intValue();
                if (composer7.shouldExecute((iIntValue7 & 3) != 2, iIntValue7 & 1)) {
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(430166692, iIntValue7, -1, "com.dh.myembyapp.ui.components.SeekIntervalSelector.<anonymous>.<anonymous>.<anonymous> (OtherSettingsOverlay.kt:921)");
                    }
                    TextKt.m3048TextNvy7gAk("−", null, i2 > 5 ? Color.INSTANCE.m5189getWhite0d7_KjU() : Color.INSTANCE.m5182getGray0d7_KjU(), null, TextUnitKt.getSp(16), null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, composer7, 24582, 0, 262122);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                } else {
                    composer7.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 7:
                Composer composer8 = (Composer) obj;
                int iIntValue8 = ((Integer) obj2).intValue();
                if (composer8.shouldExecute((iIntValue8 & 3) != 2, iIntValue8 & 1)) {
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(525046556, iIntValue8, -1, "com.dh.myembyapp.ui.components.SeekIntervalSelector.<anonymous>.<anonymous>.<anonymous> (OtherSettingsOverlay.kt:963)");
                    }
                    TextKt.m3048TextNvy7gAk("+", null, i2 < 60 ? Color.INSTANCE.m5189getWhite0d7_KjU() : Color.INSTANCE.m5182getGray0d7_KjU(), null, TextUnitKt.getSp(16), null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, composer8, 24582, 0, 262122);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                } else {
                    composer8.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 8:
                Composer composer9 = (Composer) obj;
                int iIntValue9 = ((Integer) obj2).intValue();
                if (composer9.shouldExecute((iIntValue9 & 3) != 2, iIntValue9 & 1)) {
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-1235224780, iIntValue9, -1, "com.dh.myembyapp.ui.components.AudioDelaySelector.<anonymous>.<anonymous>.<anonymous> (OtherSettingsOverlay.kt:1013)");
                    }
                    TextKt.m3048TextNvy7gAk("−", null, i2 > -10000 ? Color.INSTANCE.m5189getWhite0d7_KjU() : Color.INSTANCE.m5182getGray0d7_KjU(), null, TextUnitKt.getSp(16), null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, composer9, 24582, 0, 262122);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                } else {
                    composer9.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 9:
                Composer composer10 = (Composer) obj;
                int iIntValue10 = ((Integer) obj2).intValue();
                if (composer10.shouldExecute((iIntValue10 & 3) != 2, iIntValue10 & 1)) {
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(1231910316, iIntValue10, -1, "com.dh.myembyapp.ui.components.AudioDelaySelector.<anonymous>.<anonymous>.<anonymous> (OtherSettingsOverlay.kt:1059)");
                    }
                    TextKt.m3048TextNvy7gAk("+", null, i2 < 10000 ? Color.INSTANCE.m5189getWhite0d7_KjU() : Color.INSTANCE.m5182getGray0d7_KjU(), null, TextUnitKt.getSp(16), null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, composer10, 24582, 0, 262122);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                } else {
                    composer10.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 10:
                return ReportDrawnKt.ReportDrawn$lambda$1(i2, (Composer) obj, ((Integer) obj2).intValue());
            default:
                ((Integer) obj2).intValue();
                q32.a((Composer) obj, RecomposeScopeImplKt.updateChangedFlags(i2 | 1));
                return Unit.INSTANCE;
        }
    }
}
