package defpackage;

import androidx.compose.foundation.BorderStrokeKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.lazy.LazyItemScope;
import androidx.compose.foundation.text.selection.AndroidSelectionHandles_androidKt;
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
import kotlin.jvm.functions.Function3;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class ha implements Function3 {
    public final /* synthetic */ int a = 0;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ Function0 c;

    public /* synthetic */ ha(Function0 function0, boolean z) {
        this.c = function0;
        this.b = z;
    }

    @Override // kotlin.jvm.functions.Function3
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        int i = this.a;
        Function0 function0 = this.c;
        boolean z = this.b;
        switch (i) {
            case 0:
                return AndroidSelectionHandles_androidKt.drawSelectionHandle$lambda$0(function0, z, (Modifier) obj, (Composer) obj2, ((Integer) obj3).intValue());
            default:
                Composer composer = (Composer) obj2;
                int iIntValue = ((Integer) obj3).intValue();
                ((LazyItemScope) obj).getClass();
                if (composer.shouldExecute((iIntValue & 17) != 16, iIntValue & 1)) {
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(1247463534, iIntValue, -1, "com.dh.myembyapp.ui.screens.player.components.SubtitleSettingsDialog.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (SubtitleSettings.kt:581)");
                    }
                    Object objRememberedValue = composer.rememberedValue();
                    Composer.Companion companion = Composer.INSTANCE;
                    if (objRememberedValue == companion.getEmpty()) {
                        objRememberedValue = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Boolean.FALSE, null, 2, null);
                        composer.updateRememberedValue(objRememberedValue);
                    }
                    MutableState mutableState = (MutableState) objRememberedValue;
                    boolean z2 = !z;
                    Modifier modifierFillMaxWidth$default = SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null);
                    Object objRememberedValue2 = composer.rememberedValue();
                    if (objRememberedValue2 == companion.getEmpty()) {
                        objRememberedValue2 = new b42(3, mutableState);
                        composer.updateRememberedValue(objRememberedValue2);
                    }
                    Modifier modifierOnFocusChanged = FocusChangedModifierKt.onFocusChanged(modifierFillMaxWidth$default, (Function1) objRememberedValue2);
                    ButtonColors buttonColorsP = hc2.p(z2, composer, 0, 0);
                    ButtonDefaults buttonDefaults = ButtonDefaults.INSTANCE;
                    ButtonScale buttonScaleScale$default = ButtonDefaults.scale$default(buttonDefaults, 0.0f, 1.02f, 0.0f, 0.0f, 0.0f, 29, null);
                    ButtonBorder buttonBorderBorder = buttonDefaults.border(null, new Border(BorderStrokeKt.m301BorderStrokecXLIe8U(Dp.m7813constructorimpl(2.0f), Color.INSTANCE.m5189getWhite0d7_KjU()), 0.0f, null, 6, null), null, null, null, composer, (ButtonDefaults.$stable << 15) | 48, 29);
                    boolean zChanged = composer.changed(function0);
                    Object objRememberedValue3 = composer.rememberedValue();
                    if (zChanged || objRememberedValue3 == companion.getEmpty()) {
                        objRememberedValue3 = new eq1(4, function0);
                        composer.updateRememberedValue(objRememberedValue3);
                    }
                    ButtonKt.m8231ButtonTCVpFMg((Function0) objRememberedValue3, modifierOnFocusChanged, null, z2, buttonScaleScale$default, null, null, buttonColorsP, 0.0f, buttonBorderBorder, null, null, ComposableLambdaKt.rememberComposableLambda(1657025662, true, new i50(z, mutableState, 4), composer, 54), composer, 0, RendererCapabilities.DECODER_SUPPORT_MASK, 3428);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                } else {
                    composer.skipToGroupEnd();
                }
                return Unit.INSTANCE;
        }
    }

    public /* synthetic */ ha(boolean z, Function0 function0) {
        this.b = z;
        this.c = function0;
    }
}
