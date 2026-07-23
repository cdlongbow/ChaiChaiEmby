package defpackage;

import android.util.Log;
import androidx.compose.foundation.BackgroundKt;
import androidx.compose.foundation.BorderKt;
import androidx.compose.foundation.BorderStrokeKt;
import androidx.compose.foundation.ScrollKt;
import androidx.compose.foundation.ScrollState;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnScopeInstance;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.foundation.layout.RowKt;
import androidx.compose.foundation.layout.RowScopeInstance;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.SpacerKt;
import androidx.compose.foundation.shape.RoundedCornerShapeKt;
import androidx.compose.material3.DividerKt;
import androidx.compose.material3.TextKt;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.focus.FocusChangedModifierKt;
import androidx.compose.ui.focus.FocusRequester;
import androidx.compose.ui.focus.FocusRequesterModifierKt;
import androidx.compose.ui.focus.FocusState;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.ColorKt;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.unit.Dp;
import androidx.compose.ui.unit.TextUnitKt;
import androidx.compose.ui.window.AndroidDialog_androidKt;
import androidx.compose.ui.window.DialogProperties;
import androidx.media3.exoplayer.RendererCapabilities;
import java.util.Arrays;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.StringCompanionObject;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: loaded from: classes4.dex */
public abstract class gv0 {
    /* JADX WARN: Code duplicated, block: B:30:0x0051  */
    /* JADX WARN: Code duplicated, block: B:32:0x0057  */
    /* JADX WARN: Code duplicated, block: B:33:0x005a  */
    /* JADX WARN: Code duplicated, block: B:37:0x0065  */
    /* JADX WARN: Code duplicated, block: B:38:0x0067  */
    /* JADX WARN: Code duplicated, block: B:41:0x0070  */
    /* JADX WARN: Code duplicated, block: B:43:0x0073  */
    /* JADX WARN: Code duplicated, block: B:46:0x007a  */
    /* JADX WARN: Code duplicated, block: B:49:0x008c  */
    /* JADX WARN: Code duplicated, block: B:52:0x00fc  */
    /* JADX WARN: Code duplicated, block: B:53:0x00fe  */
    /* JADX WARN: Code duplicated, block: B:58:0x010d  */
    /* JADX WARN: Code duplicated, block: B:61:0x011d  */
    /* JADX WARN: Code duplicated, block: B:64:0x015b  */
    /* JADX WARN: Code duplicated, block: B:65:0x015f  */
    /* JADX WARN: Code duplicated, block: B:68:0x0169  */
    /* JADX WARN: Code duplicated, block: B:70:? A[RETURN, SYNTHETIC] */
    public static final void a(String str, Function0 function0, FocusRequester focusRequester, Function0 function1, Composer composer, int i, int i2) {
        int i3;
        FocusRequester focusRequester2;
        boolean z;
        FocusRequester focusRequester3;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Object objRememberedValue;
        Composer.Companion companion;
        MutableState mutableState;
        Modifier modifierFocusRequester;
        boolean z2;
        Object objRememberedValue2;
        int i4;
        Composer composerStartRestartGroup = composer.startRestartGroup(430085666);
        if ((i & 6) == 0) {
            i3 = (composerStartRestartGroup.changed(str) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            i3 |= composerStartRestartGroup.changedInstance(function0) ? 32 : 16;
        }
        int i5 = i2 & 4;
        if (i5 == 0) {
            if ((i & RendererCapabilities.DECODER_SUPPORT_MASK) == 0) {
                focusRequester2 = focusRequester;
                i3 |= composerStartRestartGroup.changed(focusRequester2) ? 256 : 128;
            }
            if ((i & 3072) == 0) {
                if (composerStartRestartGroup.changedInstance(function1)) {
                    i4 = 2048;
                } else {
                    i4 = 1024;
                }
                i3 |= i4;
            }
            if ((i3 & 1171) != 1170) {
                z = true;
            } else {
                z = false;
            }
            if (composerStartRestartGroup.shouldExecute(z, i3 & 1)) {
                if (i5 != 0) {
                    focusRequester2 = null;
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(430085666, i3, -1, "com.dh.myembyapp.ui.components.CompactMarkButton (IntroOutroSettingsDialog.kt:413)");
                }
                objRememberedValue = composerStartRestartGroup.rememberedValue();
                companion = Composer.INSTANCE;
                if (objRememberedValue == companion.getEmpty()) {
                    objRememberedValue = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Boolean.FALSE, null, 2, null);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                }
                mutableState = (MutableState) objRememberedValue;
                ButtonColors buttonColorsM = hc2.m(false, composerStartRestartGroup, 1);
                ButtonDefaults buttonDefaults = ButtonDefaults.INSTANCE;
                ButtonScale buttonScaleScale$default = ButtonDefaults.scale$default(buttonDefaults, 0.0f, 1.05f, 0.0f, 0.0f, 0.0f, 29, null);
                focusRequester3 = focusRequester2;
                ButtonBorder buttonBorderBorder = buttonDefaults.border(null, new Border(BorderStrokeKt.m301BorderStrokecXLIe8U(Dp.m7813constructorimpl(2.0f), Color.INSTANCE.m5189getWhite0d7_KjU()), 0.0f, null, 6, null), null, null, null, composerStartRestartGroup, (ButtonDefaults.$stable << 15) | 48, 29);
                PaddingValues paddingValuesM993PaddingValuesYgX7TsA = PaddingKt.m993PaddingValuesYgX7TsA(Dp.m7813constructorimpl(8.0f), Dp.m7813constructorimpl(4.0f));
                modifierFocusRequester = Modifier.INSTANCE;
                if ((i3 & 7168) == 2048) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                if (z2 || objRememberedValue2 == companion.getEmpty()) {
                    objRememberedValue2 = new qx(function1, mutableState, 3);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                }
                Modifier modifierOnFocusChanged = FocusChangedModifierKt.onFocusChanged(modifierFocusRequester, (Function1) objRememberedValue2);
                if (focusRequester3 != null) {
                    modifierFocusRequester = FocusRequesterModifierKt.focusRequester(modifierFocusRequester, focusRequester3);
                }
                ButtonKt.m8231ButtonTCVpFMg(function0, modifierOnFocusChanged.then(modifierFocusRequester), null, false, buttonScaleScale$default, null, null, buttonColorsM, 0.0f, buttonBorderBorder, paddingValuesM993PaddingValuesYgX7TsA, null, ComposableLambdaKt.rememberComposableLambda(916828722, true, new e8(1, mutableState, str), composerStartRestartGroup, 54), composerStartRestartGroup, (i3 >> 3) & 14, 390, 2412);
                composerStartRestartGroup = composerStartRestartGroup;
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
            } else {
                composerStartRestartGroup.skipToGroupEnd();
                focusRequester3 = focusRequester2;
            }
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup != null) {
                scopeUpdateScopeEndRestartGroup.updateScope(new fv0(str, function0, focusRequester3, function1, i, i2, 0));
            }
        }
        i3 |= RendererCapabilities.DECODER_SUPPORT_MASK;
        focusRequester2 = focusRequester;
        if ((i & 3072) == 0) {
            if (composerStartRestartGroup.changedInstance(function1)) {
                i4 = 2048;
            } else {
                i4 = 1024;
            }
            i3 |= i4;
        }
        if ((i3 & 1171) != 1170) {
            z = true;
        } else {
            z = false;
        }
        if (composerStartRestartGroup.shouldExecute(z, i3 & 1)) {
            if (i5 != 0) {
                focusRequester2 = null;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(430085666, i3, -1, "com.dh.myembyapp.ui.components.CompactMarkButton (IntroOutroSettingsDialog.kt:413)");
            }
            objRememberedValue = composerStartRestartGroup.rememberedValue();
            companion = Composer.INSTANCE;
            if (objRememberedValue == companion.getEmpty()) {
                objRememberedValue = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Boolean.FALSE, null, 2, null);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            mutableState = (MutableState) objRememberedValue;
            ButtonColors buttonColorsM2 = hc2.m(false, composerStartRestartGroup, 1);
            ButtonDefaults buttonDefaults2 = ButtonDefaults.INSTANCE;
            ButtonScale buttonScaleScale$default2 = ButtonDefaults.scale$default(buttonDefaults2, 0.0f, 1.05f, 0.0f, 0.0f, 0.0f, 29, null);
            focusRequester3 = focusRequester2;
            ButtonBorder buttonBorderBorder2 = buttonDefaults2.border(null, new Border(BorderStrokeKt.m301BorderStrokecXLIe8U(Dp.m7813constructorimpl(2.0f), Color.INSTANCE.m5189getWhite0d7_KjU()), 0.0f, null, 6, null), null, null, null, composerStartRestartGroup, (ButtonDefaults.$stable << 15) | 48, 29);
            PaddingValues paddingValuesM993PaddingValuesYgX7TsA2 = PaddingKt.m993PaddingValuesYgX7TsA(Dp.m7813constructorimpl(8.0f), Dp.m7813constructorimpl(4.0f));
            modifierFocusRequester = Modifier.INSTANCE;
            if ((i3 & 7168) == 2048) {
                z2 = true;
            } else {
                z2 = false;
            }
            objRememberedValue2 = composerStartRestartGroup.rememberedValue();
            if (z2) {
                objRememberedValue2 = new qx(function1, mutableState, 3);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
            } else {
                objRememberedValue2 = new qx(function1, mutableState, 3);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
            }
            Modifier modifierOnFocusChanged2 = FocusChangedModifierKt.onFocusChanged(modifierFocusRequester, (Function1) objRememberedValue2);
            if (focusRequester3 != null) {
                modifierFocusRequester = FocusRequesterModifierKt.focusRequester(modifierFocusRequester, focusRequester3);
            }
            ButtonKt.m8231ButtonTCVpFMg(function0, modifierOnFocusChanged2.then(modifierFocusRequester), null, false, buttonScaleScale$default2, null, null, buttonColorsM2, 0.0f, buttonBorderBorder2, paddingValuesM993PaddingValuesYgX7TsA2, null, ComposableLambdaKt.rememberComposableLambda(916828722, true, new e8(1, mutableState, str), composerStartRestartGroup, 54), composerStartRestartGroup, (i3 >> 3) & 14, 390, 2412);
            composerStartRestartGroup = composerStartRestartGroup;
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
            focusRequester3 = focusRequester2;
        }
        scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new fv0(str, function0, focusRequester3, function1, i, i2, 0));
        }
    }

    public static final void b(final Long l, final Long l2, final Long l3, final Long l4, final Long l5, final Long l6, final long j, final boolean z, final boolean z2, final boolean z3, final Function0 function0, final Function0 function1, final Function1 function2, final Function1 function3, final Function1 function4, final Function0 function5, final Function0 function6, Composer composer, final int i, final int i2) {
        int i3;
        Long l7;
        int i4;
        function0.getClass();
        function1.getClass();
        function2.getClass();
        function3.getClass();
        function4.getClass();
        function5.getClass();
        function6.getClass();
        Composer composerStartRestartGroup = composer.startRestartGroup(-1774770346);
        if ((i & 6) == 0) {
            i3 = (composerStartRestartGroup.changed(l) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            i3 |= composerStartRestartGroup.changed(l2) ? 32 : 16;
        }
        if ((i & RendererCapabilities.DECODER_SUPPORT_MASK) == 0) {
            i3 |= composerStartRestartGroup.changed(l3) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            l7 = l4;
            i3 |= composerStartRestartGroup.changed(l7) ? 2048 : 1024;
        } else {
            l7 = l4;
        }
        if ((i & 24576) == 0) {
            i3 |= composerStartRestartGroup.changed(l5) ? 16384 : 8192;
        }
        if ((i & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE) == 0) {
            i3 |= composerStartRestartGroup.changed(l6) ? 131072 : 65536;
        }
        if ((i & 12582912) == 0) {
            i3 |= composerStartRestartGroup.changed(z) ? 8388608 : 4194304;
        }
        if ((i & 100663296) == 0) {
            i3 |= composerStartRestartGroup.changed(z2) ? 67108864 : GroupFlagsKt.HasAuxSlotFlag;
        }
        if ((i & 805306368) == 0) {
            i3 |= composerStartRestartGroup.changed(z3) ? 536870912 : 268435456;
        }
        if ((i2 & 6) == 0) {
            i4 = i2 | (composerStartRestartGroup.changedInstance(function0) ? 4 : 2);
        } else {
            i4 = i2;
        }
        if ((i2 & 48) == 0) {
            i4 |= composerStartRestartGroup.changedInstance(function1) ? 32 : 16;
        }
        if ((i2 & RendererCapabilities.DECODER_SUPPORT_MASK) == 0) {
            i4 |= composerStartRestartGroup.changedInstance(function2) ? 256 : 128;
        }
        if ((i2 & 3072) == 0) {
            i4 |= composerStartRestartGroup.changedInstance(function3) ? 2048 : 1024;
        }
        if ((i2 & 24576) == 0) {
            i4 |= composerStartRestartGroup.changedInstance(function4) ? 16384 : 8192;
        }
        if ((i2 & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE) == 0) {
            i4 |= composerStartRestartGroup.changedInstance(function5) ? 131072 : 65536;
        }
        if ((i2 & 1572864) == 0) {
            i4 |= composerStartRestartGroup.changedInstance(function6) ? 1048576 : 524288;
        }
        int i5 = i4;
        if (composerStartRestartGroup.shouldExecute(((i3 & 306259091) == 306259090 && (599187 & i5) == 599186) ? false : true, i3 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1774770346, i3, i5, "com.dh.myembyapp.ui.components.IntroOutroSettingsDialog (IntroOutroSettingsDialog.kt:64)");
            }
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            Composer.Companion companion = Composer.INSTANCE;
            if (objRememberedValue == companion.getEmpty()) {
                objRememberedValue = mr.n(composerStartRestartGroup);
            }
            final FocusRequester focusRequester = (FocusRequester) objRememberedValue;
            Object objRememberedValue2 = composerStartRestartGroup.rememberedValue();
            if (objRememberedValue2 == companion.getEmpty()) {
                objRememberedValue2 = Long.valueOf(System.currentTimeMillis());
                composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
            }
            Long lValueOf = Long.valueOf(((Number) objRememberedValue2).longValue());
            Object objRememberedValue3 = composerStartRestartGroup.rememberedValue();
            if (objRememberedValue3 == companion.getEmpty()) {
                objRememberedValue3 = new vm(focusRequester, null, 8);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
            }
            EffectsKt.LaunchedEffect(lValueOf, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) objRememberedValue3, composerStartRestartGroup, 6);
            final Long l8 = l7;
            AndroidDialog_androidKt.Dialog(function6, new DialogProperties(true, false, false), ComposableLambdaKt.rememberComposableLambda(-602415457, true, new Function2() { // from class: av0
                /* JADX WARN: Multi-variable type inference failed */
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    String strConcat;
                    final int i6;
                    final int i7;
                    final int i8;
                    int i9;
                    final MutableState mutableState;
                    Long l9;
                    Composer composer2 = (Composer) obj;
                    int iIntValue = ((Integer) obj2).intValue();
                    if (composer2.shouldExecute((iIntValue & 3) != 2, iIntValue & 1)) {
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(-602415457, iIntValue, -1, "com.dh.myembyapp.ui.components.IntroOutroSettingsDialog.<anonymous> (IntroOutroSettingsDialog.kt:106)");
                        }
                        final ScrollState scrollStateRememberScrollState = ScrollKt.rememberScrollState(0, composer2, 0, 1);
                        Object objRememberedValue4 = composer2.rememberedValue();
                        Composer.Companion companion2 = Composer.INSTANCE;
                        if (objRememberedValue4 == companion2.getEmpty()) {
                            objRememberedValue4 = EffectsKt.createCompositionCoroutineScope(EmptyCoroutineContext.INSTANCE, composer2);
                            composer2.updateRememberedValue(objRememberedValue4);
                        }
                        final CoroutineScope coroutineScope = (CoroutineScope) objRememberedValue4;
                        Modifier.Companion companion3 = Modifier.INSTANCE;
                        Modifier modifierFillMaxSize$default = SizeKt.fillMaxSize$default(companion3, 0.0f, 1, null);
                        Color.Companion companion4 = Color.INSTANCE;
                        Modifier modifierM275backgroundbw27NRU$default = BackgroundKt.m275backgroundbw27NRU$default(modifierFillMaxSize$default, Color.m5151copywmQWz5c$default(companion4.m5178getBlack0d7_KjU(), 0.7f, 0.0f, 0.0f, 0.0f, 14, null), null, 2, null);
                        Alignment.Companion companion5 = Alignment.INSTANCE;
                        MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(companion5.getCenter(), false);
                        long currentCompositeKeyHashCode = ComposablesKt.getCurrentCompositeKeyHashCode(composer2, 0);
                        int i10 = (int) (currentCompositeKeyHashCode ^ (currentCompositeKeyHashCode >>> 32));
                        CompositionLocalMap currentCompositionLocalMap = composer2.getCurrentCompositionLocalMap();
                        Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(composer2, modifierM275backgroundbw27NRU$default);
                        ComposeUiNode.Companion companion6 = ComposeUiNode.INSTANCE;
                        Function0<ComposeUiNode> constructor = companion6.getConstructor();
                        if (composer2.getApplier() == null) {
                            ComposablesKt.invalidApplier();
                        }
                        composer2.startReusableNode();
                        if (composer2.getInserting()) {
                            composer2.createNode(constructor);
                        } else {
                            composer2.useNode();
                        }
                        Composer composerM4318constructorimpl = Updater.m4318constructorimpl(composer2);
                        mr.z(companion6, composerM4318constructorimpl, measurePolicyMaybeCachedBoxMeasurePolicy, composerM4318constructorimpl, currentCompositionLocalMap);
                        Updater.m4326setimpl(composerM4318constructorimpl, modifierMaterializeModifier, (Function2<? super T, ? super Modifier, Unit>) id.h(companion6, composerM4318constructorimpl, Integer.valueOf(i10), composerM4318constructorimpl));
                        BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
                        Modifier modifierM999padding3ABfNKs = PaddingKt.m999padding3ABfNKs(ScrollKt.verticalScroll$default(kb0.v(12.0f, SizeKt.m1069width3ABfNKs(companion3, Dp.m7813constructorimpl(480.0f)), ColorKt.Color(4280032284L)), scrollStateRememberScrollState, false, null, false, 14, null), Dp.m7813constructorimpl(20.0f));
                        Arrangement arrangement = Arrangement.INSTANCE;
                        MeasurePolicy measurePolicyColumnMeasurePolicy = ColumnKt.columnMeasurePolicy(arrangement.m712spacedBy0680j_4(Dp.m7813constructorimpl(8.0f)), companion5.getStart(), composer2, 6);
                        long currentCompositeKeyHashCode2 = ComposablesKt.getCurrentCompositeKeyHashCode(composer2, 0);
                        int i11 = (int) (currentCompositeKeyHashCode2 ^ (currentCompositeKeyHashCode2 >>> 32));
                        CompositionLocalMap currentCompositionLocalMap2 = composer2.getCurrentCompositionLocalMap();
                        Modifier modifierMaterializeModifier2 = ComposedModifierKt.materializeModifier(composer2, modifierM999padding3ABfNKs);
                        Function0<ComposeUiNode> constructor2 = companion6.getConstructor();
                        if (composer2.getApplier() == null) {
                            ComposablesKt.invalidApplier();
                        }
                        composer2.startReusableNode();
                        if (composer2.getInserting()) {
                            composer2.createNode(constructor2);
                        } else {
                            composer2.useNode();
                        }
                        Composer composerM4318constructorimpl2 = Updater.m4318constructorimpl(composer2);
                        mr.z(companion6, composerM4318constructorimpl2, measurePolicyColumnMeasurePolicy, composerM4318constructorimpl2, currentCompositionLocalMap2);
                        Updater.m4326setimpl(composerM4318constructorimpl2, modifierMaterializeModifier2, (Function2<? super T, ? super Modifier, Unit>) id.h(companion6, composerM4318constructorimpl2, Integer.valueOf(i11), composerM4318constructorimpl2));
                        ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.INSTANCE;
                        TextKt.m3048TextNvy7gAk("自动标记", null, companion4.m5182getGray0d7_KjU(), null, TextUnitKt.getSp(13), null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, composer2, 24966, 0, 262122);
                        Modifier modifierFillMaxWidth$default = SizeKt.fillMaxWidth$default(companion3, 0.0f, 1, null);
                        MeasurePolicy measurePolicyRowMeasurePolicy = RowKt.rowMeasurePolicy(arrangement.m712spacedBy0680j_4(Dp.m7813constructorimpl(16.0f)), companion5.getTop(), composer2, 6);
                        long currentCompositeKeyHashCode3 = ComposablesKt.getCurrentCompositeKeyHashCode(composer2, 0);
                        int i12 = (int) (currentCompositeKeyHashCode3 ^ (currentCompositeKeyHashCode3 >>> 32));
                        CompositionLocalMap currentCompositionLocalMap3 = composer2.getCurrentCompositionLocalMap();
                        Modifier modifierMaterializeModifier3 = ComposedModifierKt.materializeModifier(composer2, modifierFillMaxWidth$default);
                        Function0<ComposeUiNode> constructor3 = companion6.getConstructor();
                        if (composer2.getApplier() == null) {
                            ComposablesKt.invalidApplier();
                        }
                        composer2.startReusableNode();
                        if (composer2.getInserting()) {
                            composer2.createNode(constructor3);
                        } else {
                            composer2.useNode();
                        }
                        Composer composerM4318constructorimpl3 = Updater.m4318constructorimpl(composer2);
                        mr.z(companion6, composerM4318constructorimpl3, measurePolicyRowMeasurePolicy, composerM4318constructorimpl3, currentCompositionLocalMap3);
                        Updater.m4326setimpl(composerM4318constructorimpl3, modifierMaterializeModifier3, (Function2<? super T, ? super Modifier, Unit>) id.h(companion6, composerM4318constructorimpl3, Integer.valueOf(i12), composerM4318constructorimpl3));
                        RowScopeInstance rowScopeInstance = RowScopeInstance.INSTANCE;
                        Long l10 = l;
                        if (l10 == null || (l9 = l2) == null || l10.longValue() >= l9.longValue()) {
                            Long l11 = l3;
                            strConcat = "片头结束: ".concat(l11 != null ? gv0.c(l11.longValue()) : "未标记");
                        } else {
                            strConcat = ll0.e("片头曲: ", gv0.c(l10.longValue()), " - ", gv0.c(l9.longValue()));
                        }
                        TextKt.m3048TextNvy7gAk(strConcat, zs1.E(rowScopeInstance, companion3, 1.0f, false, 2, null), companion4.m5189getWhite0d7_KjU(), null, TextUnitKt.getSp(13), null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, composer2, 24960, 0, 262120);
                        Long l12 = l8;
                        TextKt.m3048TextNvy7gAk("片尾: ".concat(l12 != null ? gv0.c(l12.longValue()) : "未标记"), zs1.E(rowScopeInstance, companion3, 1.0f, false, 2, null), companion4.m5189getWhite0d7_KjU(), null, TextUnitKt.getSp(13), null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, composer2, 24960, 0, 262120);
                        composer2.endNode();
                        SpacerKt.Spacer(SizeKt.m1050height3ABfNKs(companion3, Dp.m7813constructorimpl(4.0f)), composer2, 6);
                        TextKt.m3048TextNvy7gAk("手动标记", null, companion4.m5182getGray0d7_KjU(), null, TextUnitKt.getSp(13), null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, composer2, 24966, 0, 262122);
                        Modifier modifierFillMaxWidth$default2 = SizeKt.fillMaxWidth$default(companion3, 0.0f, 1, null);
                        MeasurePolicy measurePolicyRowMeasurePolicy2 = RowKt.rowMeasurePolicy(arrangement.m712spacedBy0680j_4(Dp.m7813constructorimpl(12.0f)), companion5.getTop(), composer2, 6);
                        long currentCompositeKeyHashCode4 = ComposablesKt.getCurrentCompositeKeyHashCode(composer2, 0);
                        int i13 = (int) (currentCompositeKeyHashCode4 ^ (currentCompositeKeyHashCode4 >>> 32));
                        CompositionLocalMap currentCompositionLocalMap4 = composer2.getCurrentCompositionLocalMap();
                        Modifier modifierMaterializeModifier4 = ComposedModifierKt.materializeModifier(composer2, modifierFillMaxWidth$default2);
                        Function0<ComposeUiNode> constructor4 = companion6.getConstructor();
                        if (composer2.getApplier() == null) {
                            ComposablesKt.invalidApplier();
                        }
                        composer2.startReusableNode();
                        if (composer2.getInserting()) {
                            composer2.createNode(constructor4);
                        } else {
                            composer2.useNode();
                        }
                        Composer composerM4318constructorimpl4 = Updater.m4318constructorimpl(composer2);
                        mr.z(companion6, composerM4318constructorimpl4, measurePolicyRowMeasurePolicy2, composerM4318constructorimpl4, currentCompositionLocalMap4);
                        Updater.m4326setimpl(composerM4318constructorimpl4, modifierMaterializeModifier4, (Function2<? super T, ? super Modifier, Unit>) id.h(companion6, composerM4318constructorimpl4, Integer.valueOf(i13), composerM4318constructorimpl4));
                        Modifier modifierE = zs1.E(rowScopeInstance, companion3, 1.0f, false, 2, null);
                        MeasurePolicy measurePolicyRowMeasurePolicy3 = RowKt.rowMeasurePolicy(arrangement.getSpaceBetween(), companion5.getCenterVertically(), composer2, 54);
                        long currentCompositeKeyHashCode5 = ComposablesKt.getCurrentCompositeKeyHashCode(composer2, 0);
                        int i14 = (int) (currentCompositeKeyHashCode5 ^ (currentCompositeKeyHashCode5 >>> 32));
                        CompositionLocalMap currentCompositionLocalMap5 = composer2.getCurrentCompositionLocalMap();
                        Modifier modifierMaterializeModifier5 = ComposedModifierKt.materializeModifier(composer2, modifierE);
                        Function0<ComposeUiNode> constructor5 = companion6.getConstructor();
                        if (composer2.getApplier() == null) {
                            ComposablesKt.invalidApplier();
                        }
                        composer2.startReusableNode();
                        if (composer2.getInserting()) {
                            composer2.createNode(constructor5);
                        } else {
                            composer2.useNode();
                        }
                        Composer composerM4318constructorimpl5 = Updater.m4318constructorimpl(composer2);
                        mr.z(companion6, composerM4318constructorimpl5, measurePolicyRowMeasurePolicy3, composerM4318constructorimpl5, currentCompositionLocalMap5);
                        Updater.m4326setimpl(composerM4318constructorimpl5, modifierMaterializeModifier5, (Function2<? super T, ? super Modifier, Unit>) id.h(companion6, composerM4318constructorimpl5, Integer.valueOf(i14), composerM4318constructorimpl5));
                        final Long l13 = l5;
                        TextKt.m3048TextNvy7gAk("正片: ".concat(l13 != null ? gv0.c(l13.longValue()) : "未标记"), null, companion4.m5189getWhite0d7_KjU(), null, TextUnitKt.getSp(12), null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, composer2, 24960, 0, 262122);
                        String str = l13 != null ? "取消" : "标记";
                        boolean zChanged = composer2.changed(l13);
                        final Function0 function7 = function0;
                        boolean zChanged2 = zChanged | composer2.changed(function7);
                        Object objRememberedValue5 = composer2.rememberedValue();
                        if (zChanged2 || objRememberedValue5 == companion2.getEmpty()) {
                            i6 = 0;
                            objRememberedValue5 = new Function0() { // from class: cv0
                                @Override // kotlin.jvm.functions.Function0
                                public final Object invoke() {
                                    int i15 = i6;
                                    Function0 function8 = function7;
                                    Long l14 = l13;
                                    switch (i15) {
                                        case 0:
                                            Log.e("IntroOutro", "点击标记正片按钮: manualIntroTime=" + l14);
                                            function8.invoke();
                                            break;
                                        default:
                                            Log.e("IntroOutro", "点击标记片尾按钮: manualOutroRemainingMs=" + l14);
                                            function8.invoke();
                                            break;
                                    }
                                    return Unit.INSTANCE;
                                }
                            };
                            composer2.updateRememberedValue(objRememberedValue5);
                        } else {
                            i6 = 0;
                        }
                        Function0 function8 = (Function0) objRememberedValue5;
                        boolean zChangedInstance = composer2.changedInstance(coroutineScope) | composer2.changed(scrollStateRememberScrollState);
                        Object objRememberedValue6 = composer2.rememberedValue();
                        if (zChangedInstance || objRememberedValue6 == companion2.getEmpty()) {
                            objRememberedValue6 = new Function0() { // from class: dv0
                                @Override // kotlin.jvm.functions.Function0
                                public final Object invoke() {
                                    switch (i6) {
                                        case 0:
                                            BuildersKt__Builders_commonKt.launch$default(coroutineScope, null, null, new zc(scrollStateRememberScrollState, null, 3), 3, null);
                                            break;
                                        case 1:
                                            BuildersKt__Builders_commonKt.launch$default(coroutineScope, null, null, new zc(scrollStateRememberScrollState, null, 4), 3, null);
                                            break;
                                        case 2:
                                            BuildersKt__Builders_commonKt.launch$default(coroutineScope, null, null, new zc(scrollStateRememberScrollState, null, 5), 3, null);
                                            break;
                                        case 3:
                                            BuildersKt__Builders_commonKt.launch$default(coroutineScope, null, null, new zc(scrollStateRememberScrollState, null, 6), 3, null);
                                            break;
                                        default:
                                            BuildersKt__Builders_commonKt.launch$default(coroutineScope, null, null, new zc(scrollStateRememberScrollState, null, 7), 3, null);
                                            break;
                                    }
                                    return Unit.INSTANCE;
                                }
                            };
                            composer2.updateRememberedValue(objRememberedValue6);
                        }
                        gv0.a(str, function8, focusRequester, (Function0) objRememberedValue6, composer2, RendererCapabilities.DECODER_SUPPORT_MASK, 0);
                        composer2.endNode();
                        Modifier modifierE2 = zs1.E(rowScopeInstance, companion3, 1.0f, false, 2, null);
                        MeasurePolicy measurePolicyRowMeasurePolicy4 = RowKt.rowMeasurePolicy(arrangement.getSpaceBetween(), companion5.getCenterVertically(), composer2, 54);
                        long currentCompositeKeyHashCode6 = ComposablesKt.getCurrentCompositeKeyHashCode(composer2, i6);
                        int i15 = (int) (currentCompositeKeyHashCode6 ^ (currentCompositeKeyHashCode6 >>> 32));
                        CompositionLocalMap currentCompositionLocalMap6 = composer2.getCurrentCompositionLocalMap();
                        Modifier modifierMaterializeModifier6 = ComposedModifierKt.materializeModifier(composer2, modifierE2);
                        Function0<ComposeUiNode> constructor6 = companion6.getConstructor();
                        if (composer2.getApplier() == null) {
                            ComposablesKt.invalidApplier();
                        }
                        composer2.startReusableNode();
                        if (composer2.getInserting()) {
                            composer2.createNode(constructor6);
                        } else {
                            composer2.useNode();
                        }
                        Composer composerM4318constructorimpl6 = Updater.m4318constructorimpl(composer2);
                        mr.z(companion6, composerM4318constructorimpl6, measurePolicyRowMeasurePolicy4, composerM4318constructorimpl6, currentCompositionLocalMap6);
                        Updater.m4326setimpl(composerM4318constructorimpl6, modifierMaterializeModifier6, (Function2<? super T, ? super Modifier, Unit>) id.h(companion6, composerM4318constructorimpl6, Integer.valueOf(i15), composerM4318constructorimpl6));
                        final Long l14 = l6;
                        TextKt.m3048TextNvy7gAk("片尾(距结束): ".concat(l14 != null ? gv0.c(l14.longValue()) : "未标记"), null, companion4.m5189getWhite0d7_KjU(), null, TextUnitKt.getSp(12), null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, composer2, 24960, 0, 262122);
                        String str2 = l14 != null ? "取消" : "标记";
                        boolean zChanged3 = composer2.changed(l14);
                        final Function0 function9 = function1;
                        boolean zChanged4 = zChanged3 | composer2.changed(function9);
                        Object objRememberedValue7 = composer2.rememberedValue();
                        if (zChanged4 || objRememberedValue7 == companion2.getEmpty()) {
                            i7 = 1;
                            objRememberedValue7 = new Function0() { // from class: cv0
                                @Override // kotlin.jvm.functions.Function0
                                public final Object invoke() {
                                    int i16 = i7;
                                    Function0 function10 = function9;
                                    Long l15 = l14;
                                    switch (i16) {
                                        case 0:
                                            Log.e("IntroOutro", "点击标记正片按钮: manualIntroTime=" + l15);
                                            function10.invoke();
                                            break;
                                        default:
                                            Log.e("IntroOutro", "点击标记片尾按钮: manualOutroRemainingMs=" + l15);
                                            function10.invoke();
                                            break;
                                    }
                                    return Unit.INSTANCE;
                                }
                            };
                            composer2.updateRememberedValue(objRememberedValue7);
                        } else {
                            i7 = 1;
                        }
                        Function0 function10 = (Function0) objRememberedValue7;
                        boolean zChangedInstance2 = composer2.changedInstance(coroutineScope) | composer2.changed(scrollStateRememberScrollState);
                        Object objRememberedValue8 = composer2.rememberedValue();
                        if (zChangedInstance2 || objRememberedValue8 == companion2.getEmpty()) {
                            objRememberedValue8 = new Function0() { // from class: dv0
                                @Override // kotlin.jvm.functions.Function0
                                public final Object invoke() {
                                    switch (i7) {
                                        case 0:
                                            BuildersKt__Builders_commonKt.launch$default(coroutineScope, null, null, new zc(scrollStateRememberScrollState, null, 3), 3, null);
                                            break;
                                        case 1:
                                            BuildersKt__Builders_commonKt.launch$default(coroutineScope, null, null, new zc(scrollStateRememberScrollState, null, 4), 3, null);
                                            break;
                                        case 2:
                                            BuildersKt__Builders_commonKt.launch$default(coroutineScope, null, null, new zc(scrollStateRememberScrollState, null, 5), 3, null);
                                            break;
                                        case 3:
                                            BuildersKt__Builders_commonKt.launch$default(coroutineScope, null, null, new zc(scrollStateRememberScrollState, null, 6), 3, null);
                                            break;
                                        default:
                                            BuildersKt__Builders_commonKt.launch$default(coroutineScope, null, null, new zc(scrollStateRememberScrollState, null, 7), 3, null);
                                            break;
                                    }
                                    return Unit.INSTANCE;
                                }
                            };
                            composer2.updateRememberedValue(objRememberedValue8);
                        }
                        gv0.a(str2, function10, null, (Function0) objRememberedValue8, composer2, 0, 4);
                        composer2.endNode();
                        composer2.endNode();
                        SpacerKt.Spacer(SizeKt.m1050height3ABfNKs(companion3, Dp.m7813constructorimpl(8.0f)), composer2, 6);
                        Modifier modifierFillMaxWidth$default3 = SizeKt.fillMaxWidth$default(companion3, 0.0f, i7, null);
                        MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy2 = BoxKt.maybeCachedBoxMeasurePolicy(companion5.getCenter(), false);
                        long currentCompositeKeyHashCode7 = ComposablesKt.getCurrentCompositeKeyHashCode(composer2, 0);
                        int i16 = (int) (currentCompositeKeyHashCode7 ^ (currentCompositeKeyHashCode7 >>> 32));
                        CompositionLocalMap currentCompositionLocalMap7 = composer2.getCurrentCompositionLocalMap();
                        Modifier modifierMaterializeModifier7 = ComposedModifierKt.materializeModifier(composer2, modifierFillMaxWidth$default3);
                        Function0<ComposeUiNode> constructor7 = companion6.getConstructor();
                        if (composer2.getApplier() == null) {
                            ComposablesKt.invalidApplier();
                        }
                        composer2.startReusableNode();
                        if (composer2.getInserting()) {
                            composer2.createNode(constructor7);
                        } else {
                            composer2.useNode();
                        }
                        Composer composerM4318constructorimpl7 = Updater.m4318constructorimpl(composer2);
                        mr.z(companion6, composerM4318constructorimpl7, measurePolicyMaybeCachedBoxMeasurePolicy2, composerM4318constructorimpl7, currentCompositionLocalMap7);
                        Updater.m4326setimpl(composerM4318constructorimpl7, modifierMaterializeModifier7, (Function2<? super T, ? super Modifier, Unit>) id.h(companion6, composerM4318constructorimpl7, Integer.valueOf(i16), composerM4318constructorimpl7));
                        DividerKt.m2374Divider9IZ8Weo(SizeKt.fillMaxWidth$default(companion3, 0.0f, i7, null), Dp.m7813constructorimpl(1.0f), Color.m5151copywmQWz5c$default(companion4.m5182getGray0d7_KjU(), 0.3f, 0.0f, 0.0f, 0.0f, 14, null), composer2, 438, 0);
                        TextKt.m3048TextNvy7gAk("下面为全局设置", PaddingKt.m1001paddingVpY3zN4$default(BackgroundKt.m275backgroundbw27NRU$default(companion3, ColorKt.Color(4280032284L), null, 2, null), Dp.m7813constructorimpl(8.0f), 0.0f, 2, null), companion4.m5182getGray0d7_KjU(), null, TextUnitKt.getSp(11), null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, composer2, 25014, 0, 262120);
                        composer2.endNode();
                        SpacerKt.Spacer(SizeKt.m1050height3ABfNKs(companion3, Dp.m7813constructorimpl(4.0f)), composer2, 6);
                        TextKt.m3048TextNvy7gAk("标记优先级", null, companion4.m5182getGray0d7_KjU(), null, TextUnitKt.getSp(13), null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, composer2, 24966, 0, 262122);
                        Function1 function11 = function2;
                        boolean zChanged5 = composer2.changed(function11);
                        boolean z4 = z;
                        boolean zChanged6 = zChanged5 | composer2.changed(z4);
                        Object objRememberedValue9 = composer2.rememberedValue();
                        if (zChanged6 || objRememberedValue9 == companion2.getEmpty()) {
                            objRememberedValue9 = new jp(6, z4, function11);
                            composer2.updateRememberedValue(objRememberedValue9);
                        }
                        Function0 function12 = (Function0) objRememberedValue9;
                        boolean zChangedInstance3 = composer2.changedInstance(coroutineScope) | composer2.changed(scrollStateRememberScrollState);
                        Object objRememberedValue10 = composer2.rememberedValue();
                        if (zChangedInstance3 || objRememberedValue10 == companion2.getEmpty()) {
                            i8 = 2;
                            objRememberedValue10 = new Function0() { // from class: dv0
                                @Override // kotlin.jvm.functions.Function0
                                public final Object invoke() {
                                    switch (i8) {
                                        case 0:
                                            BuildersKt__Builders_commonKt.launch$default(coroutineScope, null, null, new zc(scrollStateRememberScrollState, null, 3), 3, null);
                                            break;
                                        case 1:
                                            BuildersKt__Builders_commonKt.launch$default(coroutineScope, null, null, new zc(scrollStateRememberScrollState, null, 4), 3, null);
                                            break;
                                        case 2:
                                            BuildersKt__Builders_commonKt.launch$default(coroutineScope, null, null, new zc(scrollStateRememberScrollState, null, 5), 3, null);
                                            break;
                                        case 3:
                                            BuildersKt__Builders_commonKt.launch$default(coroutineScope, null, null, new zc(scrollStateRememberScrollState, null, 6), 3, null);
                                            break;
                                        default:
                                            BuildersKt__Builders_commonKt.launch$default(coroutineScope, null, null, new zc(scrollStateRememberScrollState, null, 7), 3, null);
                                            break;
                                    }
                                    return Unit.INSTANCE;
                                }
                            };
                            composer2.updateRememberedValue(objRememberedValue10);
                        } else {
                            i8 = 2;
                        }
                        gv0.d(null, "自动标记优先", z4, function12, (Function0) objRememberedValue10, composer2, 48, 1);
                        SpacerKt.Spacer(SizeKt.m1050height3ABfNKs(companion3, Dp.m7813constructorimpl(4.0f)), composer2, 6);
                        TextKt.m3048TextNvy7gAk("跳过设置", null, companion4.m5182getGray0d7_KjU(), null, TextUnitKt.getSp(13), null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, composer2, 24966, 0, 262122);
                        final int i17 = 1;
                        Modifier modifierFillMaxWidth$default4 = SizeKt.fillMaxWidth$default(companion3, 0.0f, 1, null);
                        MeasurePolicy measurePolicyRowMeasurePolicy5 = RowKt.rowMeasurePolicy(arrangement.m712spacedBy0680j_4(Dp.m7813constructorimpl(12.0f)), companion5.getTop(), composer2, 6);
                        long currentCompositeKeyHashCode8 = ComposablesKt.getCurrentCompositeKeyHashCode(composer2, 0);
                        int i18 = (int) (currentCompositeKeyHashCode8 ^ (currentCompositeKeyHashCode8 >>> 32));
                        CompositionLocalMap currentCompositionLocalMap8 = composer2.getCurrentCompositionLocalMap();
                        Modifier modifierMaterializeModifier8 = ComposedModifierKt.materializeModifier(composer2, modifierFillMaxWidth$default4);
                        Function0<ComposeUiNode> constructor8 = companion6.getConstructor();
                        if (composer2.getApplier() == null) {
                            ComposablesKt.invalidApplier();
                        }
                        composer2.startReusableNode();
                        if (composer2.getInserting()) {
                            composer2.createNode(constructor8);
                        } else {
                            composer2.useNode();
                        }
                        Composer composerM4318constructorimpl8 = Updater.m4318constructorimpl(composer2);
                        mr.z(companion6, composerM4318constructorimpl8, measurePolicyRowMeasurePolicy5, composerM4318constructorimpl8, currentCompositionLocalMap8);
                        Updater.m4326setimpl(composerM4318constructorimpl8, modifierMaterializeModifier8, (Function2<? super T, ? super Modifier, Unit>) id.h(companion6, composerM4318constructorimpl8, Integer.valueOf(i18), composerM4318constructorimpl8));
                        Modifier modifierE3 = zs1.E(rowScopeInstance, companion3, 1.0f, false, 2, null);
                        Function1 function13 = function3;
                        boolean zChanged7 = composer2.changed(function13);
                        boolean z5 = z2;
                        boolean zChanged8 = zChanged7 | composer2.changed(z5);
                        Object objRememberedValue11 = composer2.rememberedValue();
                        if (zChanged8 || objRememberedValue11 == companion2.getEmpty()) {
                            objRememberedValue11 = new jp(7, z5, function13);
                            composer2.updateRememberedValue(objRememberedValue11);
                        }
                        Function0 function14 = (Function0) objRememberedValue11;
                        boolean zChangedInstance4 = composer2.changedInstance(coroutineScope) | composer2.changed(scrollStateRememberScrollState);
                        Object objRememberedValue12 = composer2.rememberedValue();
                        if (zChangedInstance4 || objRememberedValue12 == companion2.getEmpty()) {
                            final int i19 = 3;
                            objRememberedValue12 = new Function0() { // from class: dv0
                                @Override // kotlin.jvm.functions.Function0
                                public final Object invoke() {
                                    switch (i19) {
                                        case 0:
                                            BuildersKt__Builders_commonKt.launch$default(coroutineScope, null, null, new zc(scrollStateRememberScrollState, null, 3), 3, null);
                                            break;
                                        case 1:
                                            BuildersKt__Builders_commonKt.launch$default(coroutineScope, null, null, new zc(scrollStateRememberScrollState, null, 4), 3, null);
                                            break;
                                        case 2:
                                            BuildersKt__Builders_commonKt.launch$default(coroutineScope, null, null, new zc(scrollStateRememberScrollState, null, 5), 3, null);
                                            break;
                                        case 3:
                                            BuildersKt__Builders_commonKt.launch$default(coroutineScope, null, null, new zc(scrollStateRememberScrollState, null, 6), 3, null);
                                            break;
                                        default:
                                            BuildersKt__Builders_commonKt.launch$default(coroutineScope, null, null, new zc(scrollStateRememberScrollState, null, 7), 3, null);
                                            break;
                                    }
                                    return Unit.INSTANCE;
                                }
                            };
                            composer2.updateRememberedValue(objRememberedValue12);
                        }
                        gv0.d(modifierE3, "跳过片头", z5, function14, (Function0) objRememberedValue12, composer2, 48, 0);
                        Modifier modifierE4 = zs1.E(rowScopeInstance, companion3, 1.0f, false, 2, null);
                        Function1 function15 = function4;
                        boolean zChanged9 = composer2.changed(function15);
                        boolean z6 = z3;
                        boolean zChanged10 = zChanged9 | composer2.changed(z6);
                        Object objRememberedValue13 = composer2.rememberedValue();
                        if (zChanged10 || objRememberedValue13 == companion2.getEmpty()) {
                            objRememberedValue13 = new jp(8, z6, function15);
                            composer2.updateRememberedValue(objRememberedValue13);
                        }
                        Function0 function16 = (Function0) objRememberedValue13;
                        boolean zChangedInstance5 = composer2.changedInstance(coroutineScope) | composer2.changed(scrollStateRememberScrollState);
                        Object objRememberedValue14 = composer2.rememberedValue();
                        if (zChangedInstance5 || objRememberedValue14 == companion2.getEmpty()) {
                            final int i20 = 4;
                            objRememberedValue14 = new Function0() { // from class: dv0
                                @Override // kotlin.jvm.functions.Function0
                                public final Object invoke() {
                                    switch (i20) {
                                        case 0:
                                            BuildersKt__Builders_commonKt.launch$default(coroutineScope, null, null, new zc(scrollStateRememberScrollState, null, 3), 3, null);
                                            break;
                                        case 1:
                                            BuildersKt__Builders_commonKt.launch$default(coroutineScope, null, null, new zc(scrollStateRememberScrollState, null, 4), 3, null);
                                            break;
                                        case 2:
                                            BuildersKt__Builders_commonKt.launch$default(coroutineScope, null, null, new zc(scrollStateRememberScrollState, null, 5), 3, null);
                                            break;
                                        case 3:
                                            BuildersKt__Builders_commonKt.launch$default(coroutineScope, null, null, new zc(scrollStateRememberScrollState, null, 6), 3, null);
                                            break;
                                        default:
                                            BuildersKt__Builders_commonKt.launch$default(coroutineScope, null, null, new zc(scrollStateRememberScrollState, null, 7), 3, null);
                                            break;
                                    }
                                    return Unit.INSTANCE;
                                }
                            };
                            composer2.updateRememberedValue(objRememberedValue14);
                        }
                        gv0.d(modifierE4, "跳过片尾", z6, function16, (Function0) objRememberedValue14, composer2, 48, 0);
                        composer2.endNode();
                        SpacerKt.Spacer(SizeKt.m1050height3ABfNKs(companion3, Dp.m7813constructorimpl(8.0f)), composer2, 6);
                        Modifier modifierFillMaxWidth$default5 = SizeKt.fillMaxWidth$default(companion3, 0.0f, 1, null);
                        MeasurePolicy measurePolicyRowMeasurePolicy6 = RowKt.rowMeasurePolicy(arrangement.getEnd(), companion5.getTop(), composer2, 6);
                        long currentCompositeKeyHashCode9 = ComposablesKt.getCurrentCompositeKeyHashCode(composer2, 0);
                        int i21 = (int) (currentCompositeKeyHashCode9 ^ (currentCompositeKeyHashCode9 >>> 32));
                        CompositionLocalMap currentCompositionLocalMap9 = composer2.getCurrentCompositionLocalMap();
                        Modifier modifierMaterializeModifier9 = ComposedModifierKt.materializeModifier(composer2, modifierFillMaxWidth$default5);
                        Function0<ComposeUiNode> constructor9 = companion6.getConstructor();
                        if (composer2.getApplier() == null) {
                            ComposablesKt.invalidApplier();
                        }
                        composer2.startReusableNode();
                        if (composer2.getInserting()) {
                            composer2.createNode(constructor9);
                        } else {
                            composer2.useNode();
                        }
                        Composer composerM4318constructorimpl9 = Updater.m4318constructorimpl(composer2);
                        mr.z(companion6, composerM4318constructorimpl9, measurePolicyRowMeasurePolicy6, composerM4318constructorimpl9, currentCompositionLocalMap9);
                        Updater.m4326setimpl(composerM4318constructorimpl9, modifierMaterializeModifier9, (Function2<? super T, ? super Modifier, Unit>) id.h(companion6, composerM4318constructorimpl9, Integer.valueOf(i21), composerM4318constructorimpl9));
                        Object objRememberedValue15 = composer2.rememberedValue();
                        if (objRememberedValue15 == companion2.getEmpty()) {
                            i9 = 2;
                            objRememberedValue15 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Boolean.FALSE, null, 2, null);
                            composer2.updateRememberedValue(objRememberedValue15);
                        } else {
                            i9 = 2;
                        }
                        final MutableState mutableState2 = (MutableState) objRememberedValue15;
                        Object objRememberedValue16 = composer2.rememberedValue();
                        if (objRememberedValue16 == companion2.getEmpty()) {
                            objRememberedValue16 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Boolean.FALSE, null, i9, null);
                            composer2.updateRememberedValue(objRememberedValue16);
                        }
                        MutableState mutableState3 = (MutableState) objRememberedValue16;
                        Modifier modifierThen = companion3.then(((Boolean) mutableState2.getValue()).booleanValue() ? BorderKt.m286borderxT4_qwU(companion3, Dp.m7813constructorimpl(2.0f), companion4.m5189getWhite0d7_KjU(), RoundedCornerShapeKt.RoundedCornerShape(50)) : companion3);
                        MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy3 = BoxKt.maybeCachedBoxMeasurePolicy(companion5.getTopStart(), false);
                        long currentCompositeKeyHashCode10 = ComposablesKt.getCurrentCompositeKeyHashCode(composer2, 0);
                        int i22 = (int) (currentCompositeKeyHashCode10 ^ (currentCompositeKeyHashCode10 >>> 32));
                        CompositionLocalMap currentCompositionLocalMap10 = composer2.getCurrentCompositionLocalMap();
                        Modifier modifierMaterializeModifier10 = ComposedModifierKt.materializeModifier(composer2, modifierThen);
                        Function0<ComposeUiNode> constructor10 = companion6.getConstructor();
                        if (composer2.getApplier() == null) {
                            ComposablesKt.invalidApplier();
                        }
                        composer2.startReusableNode();
                        if (composer2.getInserting()) {
                            composer2.createNode(constructor10);
                        } else {
                            composer2.useNode();
                        }
                        Composer composerM4318constructorimpl10 = Updater.m4318constructorimpl(composer2);
                        mr.z(companion6, composerM4318constructorimpl10, measurePolicyMaybeCachedBoxMeasurePolicy3, composerM4318constructorimpl10, currentCompositionLocalMap10);
                        Updater.m4326setimpl(composerM4318constructorimpl10, modifierMaterializeModifier10, (Function2<? super T, ? super Modifier, Unit>) id.h(companion6, composerM4318constructorimpl10, Integer.valueOf(i22), composerM4318constructorimpl10));
                        boolean zChangedInstance6 = composer2.changedInstance(coroutineScope) | composer2.changed(scrollStateRememberScrollState);
                        Object objRememberedValue17 = composer2.rememberedValue();
                        if (zChangedInstance6 || objRememberedValue17 == companion2.getEmpty()) {
                            objRememberedValue17 = new Function1() { // from class: bv0
                                @Override // kotlin.jvm.functions.Function1
                                public final Object invoke(Object obj3) {
                                    int i23 = i17;
                                    ScrollState scrollState = scrollStateRememberScrollState;
                                    MutableState mutableState4 = mutableState2;
                                    FocusState focusState = (FocusState) obj3;
                                    switch (i23) {
                                        case 0:
                                            focusState.getClass();
                                            mutableState4.setValue(Boolean.valueOf(focusState.isFocused()));
                                            if (focusState.isFocused()) {
                                                BuildersKt__Builders_commonKt.launch$default(coroutineScope, null, null, new zc(scrollState, null, 9), 3, null);
                                            }
                                            break;
                                        default:
                                            focusState.getClass();
                                            mutableState4.setValue(Boolean.valueOf(focusState.isFocused()));
                                            if (focusState.isFocused()) {
                                                BuildersKt__Builders_commonKt.launch$default(coroutineScope, null, null, new zc(scrollState, null, 8), 3, null);
                                            }
                                            break;
                                    }
                                    return Unit.INSTANCE;
                                }
                            };
                            composer2.updateRememberedValue(objRememberedValue17);
                        }
                        Modifier modifierOnFocusChanged = FocusChangedModifierKt.onFocusChanged(companion3, (Function1) objRememberedValue17);
                        ButtonDefaults buttonDefaults = ButtonDefaults.INSTANCE;
                        ButtonKt.m8231ButtonTCVpFMg(function6, modifierOnFocusChanged, null, false, ButtonDefaults.scale$default(buttonDefaults, 1.0f, 1.0f, 0.0f, 0.0f, 0.0f, 28, null), null, null, hc2.p(false, composer2, 0, 1), 0.0f, null, null, null, ComposableLambdaKt.rememberComposableLambda(481946160, true, new p1(28, mutableState2), composer2, 54), composer2, 0, RendererCapabilities.DECODER_SUPPORT_MASK, 3948);
                        composer2.endNode();
                        SpacerKt.Spacer(SizeKt.m1069width3ABfNKs(companion3, Dp.m7813constructorimpl(12.0f)), composer2, 6);
                        Modifier modifierThen2 = companion3.then(((Boolean) mutableState3.getValue()).booleanValue() ? BorderKt.m286borderxT4_qwU(companion3, Dp.m7813constructorimpl(2.0f), companion4.m5189getWhite0d7_KjU(), RoundedCornerShapeKt.RoundedCornerShape(50)) : companion3);
                        final int i23 = 0;
                        MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy4 = BoxKt.maybeCachedBoxMeasurePolicy(companion5.getTopStart(), false);
                        long currentCompositeKeyHashCode11 = ComposablesKt.getCurrentCompositeKeyHashCode(composer2, 0);
                        int i24 = (int) (currentCompositeKeyHashCode11 ^ (currentCompositeKeyHashCode11 >>> 32));
                        CompositionLocalMap currentCompositionLocalMap11 = composer2.getCurrentCompositionLocalMap();
                        Modifier modifierMaterializeModifier11 = ComposedModifierKt.materializeModifier(composer2, modifierThen2);
                        Function0<ComposeUiNode> constructor11 = companion6.getConstructor();
                        if (composer2.getApplier() == null) {
                            ComposablesKt.invalidApplier();
                        }
                        composer2.startReusableNode();
                        if (composer2.getInserting()) {
                            composer2.createNode(constructor11);
                        } else {
                            composer2.useNode();
                        }
                        Composer composerM4318constructorimpl11 = Updater.m4318constructorimpl(composer2);
                        mr.z(companion6, composerM4318constructorimpl11, measurePolicyMaybeCachedBoxMeasurePolicy4, composerM4318constructorimpl11, currentCompositionLocalMap11);
                        Updater.m4326setimpl(composerM4318constructorimpl11, modifierMaterializeModifier11, (Function2<? super T, ? super Modifier, Unit>) id.h(companion6, composerM4318constructorimpl11, Integer.valueOf(i24), composerM4318constructorimpl11));
                        boolean zChangedInstance7 = composer2.changedInstance(coroutineScope) | composer2.changed(scrollStateRememberScrollState);
                        Object objRememberedValue18 = composer2.rememberedValue();
                        if (zChangedInstance7 || objRememberedValue18 == companion2.getEmpty()) {
                            mutableState = mutableState3;
                            objRememberedValue18 = new Function1() { // from class: bv0
                                @Override // kotlin.jvm.functions.Function1
                                public final Object invoke(Object obj3) {
                                    int i25 = i23;
                                    ScrollState scrollState = scrollStateRememberScrollState;
                                    MutableState mutableState4 = mutableState;
                                    FocusState focusState = (FocusState) obj3;
                                    switch (i25) {
                                        case 0:
                                            focusState.getClass();
                                            mutableState4.setValue(Boolean.valueOf(focusState.isFocused()));
                                            if (focusState.isFocused()) {
                                                BuildersKt__Builders_commonKt.launch$default(coroutineScope, null, null, new zc(scrollState, null, 9), 3, null);
                                            }
                                            break;
                                        default:
                                            focusState.getClass();
                                            mutableState4.setValue(Boolean.valueOf(focusState.isFocused()));
                                            if (focusState.isFocused()) {
                                                BuildersKt__Builders_commonKt.launch$default(coroutineScope, null, null, new zc(scrollState, null, 8), 3, null);
                                            }
                                            break;
                                    }
                                    return Unit.INSTANCE;
                                }
                            };
                            composer2.updateRememberedValue(objRememberedValue18);
                        } else {
                            mutableState = mutableState3;
                        }
                        ButtonKt.m8231ButtonTCVpFMg(function5, FocusChangedModifierKt.onFocusChanged(companion3, (Function1) objRememberedValue18), null, false, ButtonDefaults.scale$default(buttonDefaults, 1.0f, 1.0f, 0.0f, 0.0f, 0.0f, 28, null), null, null, hc2.m(false, composer2, 1), 0.0f, null, null, null, ComposableLambdaKt.rememberComposableLambda(-560948455, true, new p1(27, mutableState), composer2, 54), composer2, 0, RendererCapabilities.DECODER_SUPPORT_MASK, 3948);
                        composer2.endNode();
                        composer2.endNode();
                        composer2.endNode();
                        composer2.endNode();
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                    } else {
                        composer2.skipToGroupEnd();
                    }
                    return Unit.INSTANCE;
                }
            }, composerStartRestartGroup, 54), composerStartRestartGroup, ((i5 >> 18) & 14) | 432, 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: ev0
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).intValue();
                    int iUpdateChangedFlags = RecomposeScopeImplKt.updateChangedFlags(i | 1);
                    int iUpdateChangedFlags2 = RecomposeScopeImplKt.updateChangedFlags(i2);
                    gv0.b(l, l2, l3, l4, l5, l6, j, z, z2, z3, function0, function1, function2, function3, function4, function5, function6, (Composer) obj, iUpdateChangedFlags, iUpdateChangedFlags2);
                    return Unit.INSTANCE;
                }
            });
        }
    }

    public static final String c(long j) {
        long j2 = j / 1000;
        StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
        return String.format("%d:%02d", Arrays.copyOf(new Object[]{Long.valueOf(j2 / 60), Long.valueOf(j2 % 60)}, 2));
    }

    public static final void d(Modifier modifier, String str, boolean z, Function0 function0, Function0 function1, Composer composer, int i, int i2) {
        Modifier modifier2;
        int i3;
        Composer composer2;
        Modifier modifier3;
        Composer composerStartRestartGroup = composer.startRestartGroup(-231099850);
        int i4 = i2 & 1;
        if (i4 != 0) {
            i3 = i | 6;
            modifier2 = modifier;
        } else if ((i & 6) == 0) {
            modifier2 = modifier;
            i3 = (composerStartRestartGroup.changed(modifier2) ? 4 : 2) | i;
        } else {
            modifier2 = modifier;
            i3 = i;
        }
        if ((i & 48) == 0) {
            i3 |= composerStartRestartGroup.changed(str) ? 32 : 16;
        }
        if ((i & RendererCapabilities.DECODER_SUPPORT_MASK) == 0) {
            i3 |= composerStartRestartGroup.changed(z) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i3 |= composerStartRestartGroup.changedInstance(function0) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i3 |= composerStartRestartGroup.changedInstance(function1) ? 16384 : 8192;
        }
        int i5 = 1;
        if (composerStartRestartGroup.shouldExecute((i3 & 9363) != 9362, i3 & 1)) {
            modifier3 = i4 != 0 ? Modifier.INSTANCE : modifier2;
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-231099850, i3, -1, "com.dh.myembyapp.ui.components.SettingsSwitch (IntroOutroSettingsDialog.kt:458)");
            }
            Modifier modifierM1050height3ABfNKs = SizeKt.m1050height3ABfNKs(modifier3, Dp.m7813constructorimpl(36.0f));
            boolean z2 = (57344 & i3) == 16384;
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            if (z2 || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                objRememberedValue = new tb(4, function1);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            Modifier modifierOnFocusChanged = FocusChangedModifierKt.onFocusChanged(modifierM1050height3ABfNKs, (Function1) objRememberedValue);
            ClickableSurfaceDefaults clickableSurfaceDefaults = ClickableSurfaceDefaults.INSTANCE;
            long jColor = ColorKt.Color(4281084972L);
            long jColor2 = ColorKt.Color(4282532418L);
            int i6 = ClickableSurfaceDefaults.$stable;
            SurfaceKt.m8520Surface05tvjtU(function0, modifierOnFocusChanged, null, false, 0.0f, null, clickableSurfaceDefaults.m8292colorsoq7We08(jColor, 0L, jColor2, 0L, 0L, 0L, 0L, 0L, composerStartRestartGroup, (i6 << 24) | 390, 250), ClickableSurfaceDefaults.scale$default(clickableSurfaceDefaults, 0.0f, 1.02f, 0.0f, 0.0f, 0.0f, 29, null), clickableSurfaceDefaults.border(null, new Border(BorderStrokeKt.m301BorderStrokecXLIe8U(Dp.m7813constructorimpl(2.0f), Color.INSTANCE.m5189getWhite0d7_KjU()), 0.0f, null, 6, null), null, null, null, composerStartRestartGroup, (i6 << 15) | 48, 29), null, null, ComposableLambdaKt.rememberComposableLambda(1364569719, true, new i20(i5, str, z), composerStartRestartGroup, 54), composerStartRestartGroup, (i3 >> 9) & 14, 48, 1596);
            composer2 = composerStartRestartGroup;
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composer2 = composerStartRestartGroup;
            composer2.skipToGroupEnd();
            modifier3 = modifier2;
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new m10(modifier3, str, z, function0, function1, i, i2));
        }
    }
}
