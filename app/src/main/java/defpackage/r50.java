package defpackage;

import androidx.compose.foundation.BorderStrokeKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.focus.FocusChangedModifierKt;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.unit.Dp;
import androidx.media3.exoplayer.RendererCapabilities;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class r50 implements Function2 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Function0 b;

    public /* synthetic */ r50(int i, Function0 function0) {
        this.a = i;
        this.b = function0;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.a) {
            case 0:
                Composer composer = (Composer) obj;
                int iIntValue = ((Integer) obj2).intValue();
                if (composer.shouldExecute((iIntValue & 3) != 2, iIntValue & 1)) {
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(273012103, iIntValue, -1, "com.dh.myembyapp.ui.screens.detail.SeasonSelectionDialog.<anonymous> (DetailScreen.kt:3390)");
                    }
                    Object objRememberedValue = composer.rememberedValue();
                    Composer.Companion companion = Composer.INSTANCE;
                    if (objRememberedValue == companion.getEmpty()) {
                        objRememberedValue = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Boolean.FALSE, null, 2, null);
                        composer.updateRememberedValue(objRememberedValue);
                    }
                    MutableState mutableState = (MutableState) objRememberedValue;
                    Modifier.Companion companion2 = Modifier.INSTANCE;
                    Object objRememberedValue2 = composer.rememberedValue();
                    if (objRememberedValue2 == companion.getEmpty()) {
                        objRememberedValue2 = new u00(18, mutableState);
                        composer.updateRememberedValue(objRememberedValue2);
                    }
                    Modifier modifierOnFocusChanged = FocusChangedModifierKt.onFocusChanged(companion2, (Function1) objRememberedValue2);
                    ButtonDefaults buttonDefaults = ButtonDefaults.INSTANCE;
                    long j = u90.g;
                    long j2 = u90.i;
                    int i = ButtonDefaults.$stable;
                    ButtonKt.m8231ButtonTCVpFMg(this.b, modifierOnFocusChanged, null, false, ButtonDefaults.scale$default(buttonDefaults, 0.0f, 1.0f, 0.0f, 0.0f, 0.0f, 29, null), null, null, buttonDefaults.m8228colorsoq7We08(j, 0L, j2, 0L, 0L, 0L, 0L, 0L, composer, (i << 24) | 390, 250), 0.0f, buttonDefaults.border(null, new Border(BorderStrokeKt.m301BorderStrokecXLIe8U(Dp.m7813constructorimpl(2.0f), Color.INSTANCE.m5189getWhite0d7_KjU()), 0.0f, null, 6, null), null, null, null, composer, (i << 15) | 48, 29), null, null, ComposableLambdaKt.rememberComposableLambda(1326312855, true, new p1(19, mutableState), composer, 54), composer, 0, RendererCapabilities.DECODER_SUPPORT_MASK, 3436);
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
                        ComposerKt.traceEventStart(-1068042544, iIntValue2, -1, "com.dh.myembyapp.ui.screens.detail.EpisodeVersionDialog.<anonymous> (DetailScreen.kt:9118)");
                    }
                    Object objRememberedValue3 = composer2.rememberedValue();
                    Composer.Companion companion3 = Composer.INSTANCE;
                    if (objRememberedValue3 == companion3.getEmpty()) {
                        objRememberedValue3 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Boolean.FALSE, null, 2, null);
                        composer2.updateRememberedValue(objRememberedValue3);
                    }
                    MutableState mutableState2 = (MutableState) objRememberedValue3;
                    Modifier.Companion companion4 = Modifier.INSTANCE;
                    Object objRememberedValue4 = composer2.rememberedValue();
                    if (objRememberedValue4 == companion3.getEmpty()) {
                        objRememberedValue4 = new u00(26, mutableState2);
                        composer2.updateRememberedValue(objRememberedValue4);
                    }
                    Modifier modifierOnFocusChanged2 = FocusChangedModifierKt.onFocusChanged(companion4, (Function1) objRememberedValue4);
                    ButtonDefaults buttonDefaults2 = ButtonDefaults.INSTANCE;
                    long j3 = u90.g;
                    long j4 = u90.i;
                    int i2 = ButtonDefaults.$stable;
                    ButtonKt.m8231ButtonTCVpFMg(this.b, modifierOnFocusChanged2, null, false, ButtonDefaults.scale$default(buttonDefaults2, 0.0f, 1.0f, 0.0f, 0.0f, 0.0f, 29, null), null, null, buttonDefaults2.m8228colorsoq7We08(j3, 0L, j4, 0L, 0L, 0L, 0L, 0L, composer2, (i2 << 24) | 390, 250), 0.0f, buttonDefaults2.border(null, new Border(BorderStrokeKt.m301BorderStrokecXLIe8U(Dp.m7813constructorimpl(2.0f), Color.INSTANCE.m5189getWhite0d7_KjU()), 0.0f, null, 6, null), null, null, null, composer2, (i2 << 15) | 48, 29), null, null, ComposableLambdaKt.rememberComposableLambda(-466863392, true, new p1(20, mutableState2), composer2, 54), composer2, 0, RendererCapabilities.DECODER_SUPPORT_MASK, 3436);
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
                        ComposerKt.traceEventStart(-622675511, iIntValue3, -1, "com.dh.myembyapp.ui.screens.player.components.VersionSelectionDialog.<anonymous> (PlayerControls.kt:2591)");
                    }
                    Object objRememberedValue5 = composer3.rememberedValue();
                    Composer.Companion companion5 = Composer.INSTANCE;
                    if (objRememberedValue5 == companion5.getEmpty()) {
                        objRememberedValue5 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Boolean.FALSE, null, 2, null);
                        composer3.updateRememberedValue(objRememberedValue5);
                    }
                    MutableState mutableState3 = (MutableState) objRememberedValue5;
                    Modifier.Companion companion6 = Modifier.INSTANCE;
                    Object objRememberedValue6 = composer3.rememberedValue();
                    if (objRememberedValue6 == companion5.getEmpty()) {
                        objRememberedValue6 = new ub1(9, mutableState3);
                        composer3.updateRememberedValue(objRememberedValue6);
                    }
                    Modifier modifierOnFocusChanged3 = FocusChangedModifierKt.onFocusChanged(companion6, (Function1) objRememberedValue6);
                    ButtonDefaults buttonDefaults3 = ButtonDefaults.INSTANCE;
                    long j5 = jg1.b;
                    long j6 = jg1.d;
                    long j7 = jg1.f;
                    int i3 = ButtonDefaults.$stable;
                    ButtonKt.m8231ButtonTCVpFMg(this.b, modifierOnFocusChanged3, null, false, ButtonDefaults.scale$default(buttonDefaults3, 0.0f, 1.0f, 0.0f, 0.0f, 0.0f, 29, null), null, null, buttonDefaults3.m8228colorsoq7We08(j5, j7, j6, 0L, 0L, 0L, 0L, 0L, composer3, (i3 << 24) | 438, 248), 0.0f, buttonDefaults3.border(null, new Border(BorderStrokeKt.m301BorderStrokecXLIe8U(Dp.m7813constructorimpl(2.0f), Color.INSTANCE.m5189getWhite0d7_KjU()), 0.0f, null, 6, null), null, null, null, composer3, (i3 << 15) | 48, 29), null, null, ComposableLambdaKt.rememberComposableLambda(-897920071, true, new w91(11, mutableState3), composer3, 54), composer3, 0, RendererCapabilities.DECODER_SUPPORT_MASK, 3436);
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
