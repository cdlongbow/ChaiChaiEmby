package defpackage;

import android.content.Context;
import androidx.compose.foundation.BackgroundKt;
import androidx.compose.foundation.BorderStrokeKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnScope;
import androidx.compose.foundation.layout.ColumnScopeInstance;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.RowKt;
import androidx.compose.foundation.layout.RowScopeInstance;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.SpacerKt;
import androidx.compose.material3.CardColors;
import androidx.compose.material3.CardDefaults;
import androidx.compose.material3.CardKt;
import androidx.compose.material3.MaterialTheme;
import androidx.compose.material3.TextKt;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambda;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.focus.FocusChangedModifierKt;
import androidx.compose.ui.focus.FocusRequester;
import androidx.compose.ui.focus.FocusRequesterModifierKt;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.ColorKt;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.unit.Dp;
import androidx.compose.ui.window.AndroidDialog_androidKt;
import androidx.compose.ui.window.DialogProperties;
import androidx.media3.exoplayer.RendererCapabilities;
import com.dh.myembyapp.dlna.DlnaConfig;
import com.dh.myembyapp.dlna.DlnaSettings;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: loaded from: classes4.dex */
public abstract class zb0 {
    public static final void a(String str, Function1 function1, FocusRequester focusRequester, boolean z, Composer composer, int i) {
        int i2;
        String str2;
        Composer composer2;
        Composer composerStartRestartGroup = composer.startRestartGroup(385086016);
        if ((i & 6) == 0) {
            i2 = (composerStartRestartGroup.changed("设备名称（在控制端显示）") ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            str2 = str;
            i2 |= composerStartRestartGroup.changed(str2) ? 32 : 16;
        } else {
            str2 = str;
        }
        if ((i & RendererCapabilities.DECODER_SUPPORT_MASK) == 0) {
            i2 |= composerStartRestartGroup.changedInstance(function1) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= composerStartRestartGroup.changed(focusRequester) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i2 |= composerStartRestartGroup.changed(z) ? 16384 : 8192;
        }
        if (composerStartRestartGroup.shouldExecute((i2 & 9363) != 9362, i2 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(385086016, i2, -1, "com.dh.myembyapp.dlna.DlnaInputField (DlnaSettingsScreen.kt:334)");
            }
            Modifier modifierFocusRequester = FocusRequesterModifierKt.focusRequester(SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null), focusRequester);
            TextStyle bodyMedium = MaterialTheme.INSTANCE.getTypography(composerStartRestartGroup, MaterialTheme.$stable).getBodyMedium();
            boolean z2 = ((57344 & i2) == 16384) | ((i2 & 896) == 256);
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            if (z2 || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                objRememberedValue = new wb0(0, z, function1);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            int i3 = i2 >> 3;
            composer2 = composerStartRestartGroup;
            yc2.d(str2, (Function1) objRememberedValue, modifierFocusRequester, z, ComposableLambdaKt.rememberComposableLambda(-1098941670, true, new xw(10), composerStartRestartGroup, 54), null, null, null, null, null, bodyMedium, false, null, null, composer2, (i3 & 14) | 24576 | (i3 & 7168), 6, 29664);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composer2 = composerStartRestartGroup;
            composer2.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new u7(str, function1, focusRequester, z, i, 3));
        }
    }

    public static final void b(final Function0 function0, Composer composer, int i) {
        int i2;
        Composer composer2;
        Function0 function1 = function0;
        function1.getClass();
        Composer composerStartRestartGroup = composer.startRestartGroup(-1205100762);
        if ((i & 6) == 0) {
            i2 = (composerStartRestartGroup.changedInstance(function1) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if (composerStartRestartGroup.shouldExecute((i2 & 3) != 2, i2 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1205100762, i2, -1, "com.dh.myembyapp.dlna.DlnaSettingsScreen (DlnaSettingsScreen.kt:43)");
            }
            final Context context = (Context) composerStartRestartGroup.consume(AndroidCompositionLocals_androidKt.getLocalContext());
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-175699322, 6, -1, "com.dh.myembyapp.ui.theme.MyEmbyTheme.<get-colors> (Theme.kt:122)");
            }
            final u61 u61Var = (u61) composerStartRestartGroup.consume(n72.b);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            Composer.Companion companion = Composer.INSTANCE;
            if (objRememberedValue == companion.getEmpty()) {
                objRememberedValue = EffectsKt.createCompositionCoroutineScope(EmptyCoroutineContext.INSTANCE, composerStartRestartGroup);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            final CoroutineScope coroutineScope = (CoroutineScope) objRememberedValue;
            Object objRememberedValue2 = composerStartRestartGroup.rememberedValue();
            if (objRememberedValue2 == companion.getEmpty()) {
                objRememberedValue2 = new DlnaSettings(context);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
            }
            final DlnaSettings dlnaSettings = (DlnaSettings) objRememberedValue2;
            Object objRememberedValue3 = composerStartRestartGroup.rememberedValue();
            if (objRememberedValue3 == companion.getEmpty()) {
                objRememberedValue3 = dlnaSettings.getConfigSync();
                composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
            }
            DlnaConfig dlnaConfig = (DlnaConfig) objRememberedValue3;
            Object objRememberedValue4 = composerStartRestartGroup.rememberedValue();
            if (objRememberedValue4 == companion.getEmpty()) {
                objRememberedValue4 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Boolean.valueOf(dlnaConfig.getEnabled()), null, 2, null);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue4);
            }
            final MutableState mutableState = (MutableState) objRememberedValue4;
            Object objRememberedValue5 = composerStartRestartGroup.rememberedValue();
            if (objRememberedValue5 == companion.getEmpty()) {
                objRememberedValue5 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(dlnaConfig.getDeviceName(), null, 2, null);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue5);
            }
            final MutableState mutableState2 = (MutableState) objRememberedValue5;
            Object objRememberedValue6 = composerStartRestartGroup.rememberedValue();
            if (objRememberedValue6 == companion.getEmpty()) {
                objRememberedValue6 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Boolean.valueOf(dlnaConfig.getUseProxyByDefault()), null, 2, null);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue6);
            }
            final MutableState mutableState3 = (MutableState) objRememberedValue6;
            Object objRememberedValue7 = composerStartRestartGroup.rememberedValue();
            if (objRememberedValue7 == companion.getEmpty()) {
                objRememberedValue7 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Boolean.valueOf(dlnaConfig.getTrustAllCerts()), null, 2, null);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue7);
            }
            final MutableState mutableState4 = (MutableState) objRememberedValue7;
            Object objRememberedValue8 = composerStartRestartGroup.rememberedValue();
            if (objRememberedValue8 == companion.getEmpty()) {
                objRememberedValue8 = mr.n(composerStartRestartGroup);
            }
            final FocusRequester focusRequester = (FocusRequester) objRememberedValue8;
            Object objRememberedValue9 = composerStartRestartGroup.rememberedValue();
            if (objRememberedValue9 == companion.getEmpty()) {
                objRememberedValue9 = mr.n(composerStartRestartGroup);
            }
            final FocusRequester focusRequester2 = (FocusRequester) objRememberedValue9;
            Unit unit = Unit.INSTANCE;
            Object objRememberedValue10 = composerStartRestartGroup.rememberedValue();
            if (objRememberedValue10 == companion.getEmpty()) {
                objRememberedValue10 = new vm(focusRequester2, null, 7);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue10);
            }
            EffectsKt.LaunchedEffect(unit, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) objRememberedValue10, composerStartRestartGroup, 6);
            function1 = function0;
            composer2 = composerStartRestartGroup;
            AndroidDialog_androidKt.Dialog(function1, new DialogProperties(true, false, false), ComposableLambdaKt.rememberComposableLambda(-32781329, true, new Function2() { // from class: xb0
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    Composer composer3 = (Composer) obj;
                    int iIntValue = ((Integer) obj2).intValue();
                    if (composer3.shouldExecute((iIntValue & 3) != 2, iIntValue & 1)) {
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(-32781329, iIntValue, -1, "com.dh.myembyapp.dlna.DlnaSettingsScreen.<anonymous> (DlnaSettingsScreen.kt:76)");
                        }
                        Modifier.Companion companion2 = Modifier.INSTANCE;
                        Modifier modifierFillMaxSize$default = SizeKt.fillMaxSize$default(companion2, 0.0f, 1, null);
                        final u61 u61Var2 = u61Var;
                        Modifier modifierM275backgroundbw27NRU$default = BackgroundKt.m275backgroundbw27NRU$default(modifierFillMaxSize$default, u61Var2.a, null, 2, null);
                        MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.INSTANCE.getCenter(), false);
                        long currentCompositeKeyHashCode = ComposablesKt.getCurrentCompositeKeyHashCode(composer3, 0);
                        int i3 = (int) (currentCompositeKeyHashCode ^ (currentCompositeKeyHashCode >>> 32));
                        CompositionLocalMap currentCompositionLocalMap = composer3.getCurrentCompositionLocalMap();
                        Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(composer3, modifierM275backgroundbw27NRU$default);
                        ComposeUiNode.Companion companion3 = ComposeUiNode.INSTANCE;
                        Function0<ComposeUiNode> constructor = companion3.getConstructor();
                        if (composer3.getApplier() == null) {
                            ComposablesKt.invalidApplier();
                        }
                        composer3.startReusableNode();
                        if (composer3.getInserting()) {
                            composer3.createNode(constructor);
                        } else {
                            composer3.useNode();
                        }
                        Composer composerM4318constructorimpl = Updater.m4318constructorimpl(composer3);
                        mr.z(companion3, composerM4318constructorimpl, measurePolicyMaybeCachedBoxMeasurePolicy, composerM4318constructorimpl, currentCompositionLocalMap);
                        Updater.m4326setimpl(composerM4318constructorimpl, modifierMaterializeModifier, (Function2<? super T, ? super Modifier, Unit>) id.h(companion3, composerM4318constructorimpl, Integer.valueOf(i3), composerM4318constructorimpl));
                        BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
                        Modifier modifierM1050height3ABfNKs = SizeKt.m1050height3ABfNKs(SizeKt.m1069width3ABfNKs(companion2, Dp.m7813constructorimpl(480.0f)), Dp.m7813constructorimpl(430.0f));
                        CardColors cardColorsM2119cardColorsro_MJ88 = CardDefaults.INSTANCE.m2119cardColorsro_MJ88(MaterialTheme.INSTANCE.getColorScheme(composer3, MaterialTheme.$stable).getSurface(), 0L, 0L, 0L, composer3, CardDefaults.$stable << 12, 14);
                        final Context context2 = context;
                        final MutableState mutableState5 = mutableState;
                        final MutableState mutableState6 = mutableState2;
                        final MutableState mutableState7 = mutableState3;
                        final MutableState mutableState8 = mutableState4;
                        final FocusRequester focusRequester3 = focusRequester2;
                        final FocusRequester focusRequester4 = focusRequester;
                        final DlnaSettings dlnaSettings2 = dlnaSettings;
                        final Function0 function2 = function0;
                        final CoroutineScope coroutineScope2 = coroutineScope;
                        CardKt.Card(modifierM1050height3ABfNKs, null, cardColorsM2119cardColorsro_MJ88, null, null, ComposableLambdaKt.rememberComposableLambda(-1169970697, true, new Function3() { // from class: yb0
                            /* JADX WARN: Multi-variable type inference failed */
                            /* JADX WARN: Type inference failed for: r1v11 */
                            /* JADX WARN: Type inference failed for: r1v8 */
                            /* JADX WARN: Type inference failed for: r1v9, types: [boolean, int] */
                            @Override // kotlin.jvm.functions.Function3
                            public final Object invoke(Object obj3, Object obj4, Object obj5) {
                                MutableState mutableState9;
                                MutableState mutableState10;
                                MutableState mutableState11;
                                MutableState mutableState12;
                                ComposeUiNode.Companion companion4;
                                Object r1;
                                MutableState mutableState13;
                                Composer composer4 = (Composer) obj4;
                                int iIntValue2 = ((Integer) obj5).intValue();
                                ((ColumnScope) obj3).getClass();
                                if (composer4.shouldExecute((iIntValue2 & 17) != 16, iIntValue2 & 1)) {
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventStart(-1169970697, iIntValue2, -1, "com.dh.myembyapp.dlna.DlnaSettingsScreen.<anonymous>.<anonymous>.<anonymous> (DlnaSettingsScreen.kt:90)");
                                    }
                                    Modifier.Companion companion5 = Modifier.INSTANCE;
                                    Modifier modifierM999padding3ABfNKs = PaddingKt.m999padding3ABfNKs(SizeKt.fillMaxSize$default(companion5, 0.0f, 1, null), Dp.m7813constructorimpl(12.0f));
                                    Arrangement arrangement = Arrangement.INSTANCE;
                                    Arrangement.HorizontalOrVertical horizontalOrVerticalM712spacedBy0680j_4 = arrangement.m712spacedBy0680j_4(Dp.m7813constructorimpl(6.0f));
                                    Alignment.Companion companion6 = Alignment.INSTANCE;
                                    MeasurePolicy measurePolicyColumnMeasurePolicy = ColumnKt.columnMeasurePolicy(horizontalOrVerticalM712spacedBy0680j_4, companion6.getStart(), composer4, 6);
                                    long currentCompositeKeyHashCode2 = ComposablesKt.getCurrentCompositeKeyHashCode(composer4, 0);
                                    int i4 = (int) (currentCompositeKeyHashCode2 ^ (currentCompositeKeyHashCode2 >>> 32));
                                    CompositionLocalMap currentCompositionLocalMap2 = composer4.getCurrentCompositionLocalMap();
                                    Modifier modifierMaterializeModifier2 = ComposedModifierKt.materializeModifier(composer4, modifierM999padding3ABfNKs);
                                    ComposeUiNode.Companion companion7 = ComposeUiNode.INSTANCE;
                                    Function0<ComposeUiNode> constructor2 = companion7.getConstructor();
                                    if (composer4.getApplier() == null) {
                                        ComposablesKt.invalidApplier();
                                    }
                                    composer4.startReusableNode();
                                    if (composer4.getInserting()) {
                                        composer4.createNode(constructor2);
                                    } else {
                                        composer4.useNode();
                                    }
                                    Composer composerM4318constructorimpl2 = Updater.m4318constructorimpl(composer4);
                                    mr.z(companion7, composerM4318constructorimpl2, measurePolicyColumnMeasurePolicy, composerM4318constructorimpl2, currentCompositionLocalMap2);
                                    Updater.m4326setimpl(composerM4318constructorimpl2, modifierMaterializeModifier2, (Function2<? super T, ? super Modifier, Unit>) id.h(companion7, composerM4318constructorimpl2, Integer.valueOf(i4), composerM4318constructorimpl2));
                                    ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.INSTANCE;
                                    MaterialTheme materialTheme = MaterialTheme.INSTANCE;
                                    int i5 = MaterialTheme.$stable;
                                    TextKt.m3048TextNvy7gAk("DLNA 投屏设置", null, materialTheme.getColorScheme(composer4, i5).getPrimary(), null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, materialTheme.getTypography(composer4, i5).getTitleSmall(), composer4, 6, 0, 131066);
                                    SpacerKt.Spacer(SizeKt.m1050height3ABfNKs(companion5, Dp.m7813constructorimpl(2.0f)), composer4, 6);
                                    MutableState mutableState14 = mutableState5;
                                    boolean zBooleanValue = ((Boolean) mutableState14.getValue()).booleanValue();
                                    Object objRememberedValue11 = composer4.rememberedValue();
                                    Composer.Companion companion8 = Composer.INSTANCE;
                                    if (objRememberedValue11 == companion8.getEmpty()) {
                                        objRememberedValue11 = new a50(9, mutableState14);
                                        composer4.updateRememberedValue(objRememberedValue11);
                                    }
                                    zb0.c("启用 DLNA 投屏", zBooleanValue, (Function0) objRememberedValue11, false, focusRequester3, composer4, 24966, 8);
                                    MutableState mutableState15 = mutableState6;
                                    String str = (String) mutableState15.getValue();
                                    Object objRememberedValue12 = composer4.rememberedValue();
                                    if (objRememberedValue12 == companion8.getEmpty()) {
                                        objRememberedValue12 = new h70(10, mutableState15);
                                        composer4.updateRememberedValue(objRememberedValue12);
                                    }
                                    zb0.a(str, (Function1) objRememberedValue12, focusRequester4, ((Boolean) mutableState14.getValue()).booleanValue(), composer4, 3462);
                                    Composer composer5 = composer4;
                                    MutableState mutableState16 = mutableState7;
                                    boolean zBooleanValue2 = ((Boolean) mutableState16.getValue()).booleanValue();
                                    Object objRememberedValue13 = composer5.rememberedValue();
                                    if (objRememberedValue13 == companion8.getEmpty()) {
                                        objRememberedValue13 = new a50(10, mutableState16);
                                        composer5.updateRememberedValue(objRememberedValue13);
                                    }
                                    zb0.c("默认使用代理播放", zBooleanValue2, (Function0) objRememberedValue13, ((Boolean) mutableState14.getValue()).booleanValue(), null, composer5, 390, 16);
                                    MutableState mutableState17 = mutableState8;
                                    boolean zBooleanValue3 = ((Boolean) mutableState17.getValue()).booleanValue();
                                    Object objRememberedValue14 = composer5.rememberedValue();
                                    if (objRememberedValue14 == companion8.getEmpty()) {
                                        objRememberedValue14 = new a50(11, mutableState17);
                                        composer5.updateRememberedValue(objRememberedValue14);
                                    }
                                    zb0.c("信任所有证书", zBooleanValue3, (Function0) objRememberedValue14, ((Boolean) mutableState14.getValue()).booleanValue(), null, composer5, 390, 16);
                                    if (((Boolean) mutableState14.getValue()).booleanValue()) {
                                        composer5.startReplaceGroup(1141516229);
                                        Modifier modifierM999padding3ABfNKs2 = PaddingKt.m999padding3ABfNKs(kb0.v(8.0f, SizeKt.fillMaxWidth$default(companion5, 0.0f, 1, null), Color.m5151copywmQWz5c$default(ColorKt.Color(4279983648L), 0.3f, 0.0f, 0.0f, 0.0f, 14, null)), Dp.m7813constructorimpl(12.0f));
                                        MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy2 = BoxKt.maybeCachedBoxMeasurePolicy(companion6.getTopStart(), false);
                                        long currentCompositeKeyHashCode3 = ComposablesKt.getCurrentCompositeKeyHashCode(composer5, 0);
                                        int i6 = (int) (currentCompositeKeyHashCode3 ^ (currentCompositeKeyHashCode3 >>> 32));
                                        CompositionLocalMap currentCompositionLocalMap3 = composer5.getCurrentCompositionLocalMap();
                                        Modifier modifierMaterializeModifier3 = ComposedModifierKt.materializeModifier(composer5, modifierM999padding3ABfNKs2);
                                        Function0<ComposeUiNode> constructor3 = companion7.getConstructor();
                                        if (composer5.getApplier() == null) {
                                            ComposablesKt.invalidApplier();
                                        }
                                        composer5.startReusableNode();
                                        if (composer5.getInserting()) {
                                            composer5.createNode(constructor3);
                                        } else {
                                            composer5.useNode();
                                        }
                                        Composer composerM4318constructorimpl3 = Updater.m4318constructorimpl(composer5);
                                        companion4 = companion7;
                                        mr.z(companion4, composerM4318constructorimpl3, measurePolicyMaybeCachedBoxMeasurePolicy2, composerM4318constructorimpl3, currentCompositionLocalMap3);
                                        Updater.m4326setimpl(composerM4318constructorimpl3, modifierMaterializeModifier3, (Function2<? super T, ? super Modifier, Unit>) id.h(companion4, composerM4318constructorimpl3, Integer.valueOf(i6), composerM4318constructorimpl3));
                                        BoxScopeInstance boxScopeInstance2 = BoxScopeInstance.INSTANCE;
                                        mutableState10 = mutableState15;
                                        mutableState11 = mutableState16;
                                        mutableState12 = mutableState17;
                                        mutableState9 = mutableState14;
                                        r1 = 0;
                                        TextKt.m3048TextNvy7gAk(mr.r("✓ 服务运行中，设备「", (String) mutableState15.getValue(), "」可被发现"), null, ColorKt.Color(4286695300L), null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, materialTheme.getTypography(composer5, i5).getBodySmall(), composer5, RendererCapabilities.DECODER_SUPPORT_MASK, 0, 131066);
                                        composer5 = composer5;
                                        composer5.endNode();
                                        composer5.endReplaceGroup();
                                    } else {
                                        mutableState9 = mutableState14;
                                        mutableState10 = mutableState15;
                                        mutableState11 = mutableState16;
                                        mutableState12 = mutableState17;
                                        companion4 = companion7;
                                        r1 = 0;
                                        composer5.startReplaceGroup(1142219681);
                                        composer5.endReplaceGroup();
                                    }
                                    SpacerKt.Spacer(wn.F(columnScopeInstance, companion5, 1.0f, false, 2, null), composer5, r1);
                                    Modifier modifierFillMaxWidth$default = SizeKt.fillMaxWidth$default(companion5, 0.0f, 1, null);
                                    MeasurePolicy measurePolicyRowMeasurePolicy = RowKt.rowMeasurePolicy(arrangement.m713spacedByD5KLDUw(Dp.m7813constructorimpl(12.0f), companion6.getEnd()), companion6.getTop(), composer5, 6);
                                    long currentCompositeKeyHashCode4 = ComposablesKt.getCurrentCompositeKeyHashCode(composer5, r1);
                                    int i7 = (int) (currentCompositeKeyHashCode4 ^ (currentCompositeKeyHashCode4 >>> 32));
                                    CompositionLocalMap currentCompositionLocalMap4 = composer5.getCurrentCompositionLocalMap();
                                    Modifier modifierMaterializeModifier4 = ComposedModifierKt.materializeModifier(composer5, modifierFillMaxWidth$default);
                                    Function0<ComposeUiNode> constructor4 = companion4.getConstructor();
                                    if (composer5.getApplier() == null) {
                                        ComposablesKt.invalidApplier();
                                    }
                                    composer5.startReusableNode();
                                    if (composer5.getInserting()) {
                                        composer5.createNode(constructor4);
                                    } else {
                                        composer5.useNode();
                                    }
                                    Composer composerM4318constructorimpl4 = Updater.m4318constructorimpl(composer5);
                                    mr.z(companion4, composerM4318constructorimpl4, measurePolicyRowMeasurePolicy, composerM4318constructorimpl4, currentCompositionLocalMap4);
                                    Updater.m4326setimpl(composerM4318constructorimpl4, modifierMaterializeModifier4, (Function2<? super T, ? super Modifier, Unit>) id.h(companion4, composerM4318constructorimpl4, Integer.valueOf(i7), composerM4318constructorimpl4));
                                    RowScopeInstance rowScopeInstance = RowScopeInstance.INSTANCE;
                                    Object objRememberedValue15 = composer5.rememberedValue();
                                    if (objRememberedValue15 == companion8.getEmpty()) {
                                        objRememberedValue15 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Boolean.FALSE, null, 2, null);
                                        composer5.updateRememberedValue(objRememberedValue15);
                                    }
                                    MutableState mutableState18 = (MutableState) objRememberedValue15;
                                    Object objRememberedValue16 = composer5.rememberedValue();
                                    if (objRememberedValue16 == companion8.getEmpty()) {
                                        objRememberedValue16 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Boolean.FALSE, null, 2, null);
                                        composer5.updateRememberedValue(objRememberedValue16);
                                    }
                                    MutableState mutableState19 = (MutableState) objRememberedValue16;
                                    ButtonColors buttonColorsI = hc2.i(jc2.c, r1, composer5, 6, 2);
                                    ButtonScale buttonScaleL = hc2.l(1.05f);
                                    u61 u61Var3 = u61Var2;
                                    ButtonGlow buttonGlowA = el0.a(u61Var3);
                                    ButtonBorder buttonBorderH = hc2.h(composer5);
                                    Modifier modifierM1050height3ABfNKs2 = SizeKt.m1050height3ABfNKs(SizeKt.m1069width3ABfNKs(companion5, Dp.m7813constructorimpl(100.0f)), Dp.m7813constructorimpl(48.0f));
                                    Object objRememberedValue17 = composer5.rememberedValue();
                                    if (objRememberedValue17 == companion8.getEmpty()) {
                                        objRememberedValue17 = new h70(8, mutableState18);
                                        composer5.updateRememberedValue(objRememberedValue17);
                                    }
                                    Modifier modifierOnFocusChanged = FocusChangedModifierKt.onFocusChanged(modifierM1050height3ABfNKs2, (Function1) objRememberedValue17);
                                    ComposableLambda composableLambdaRememberComposableLambda = ComposableLambdaKt.rememberComposableLambda(-1786856595, true, new p1(21, mutableState18), composer5, 54);
                                    Function0 function3 = function2;
                                    Composer composer6 = composer5;
                                    ButtonKt.m8231ButtonTCVpFMg(function3, modifierOnFocusChanged, null, false, buttonScaleL, buttonGlowA, null, buttonColorsI, 0.0f, buttonBorderH, null, null, composableLambdaRememberComposableLambda, composer6, 0, RendererCapabilities.DECODER_SUPPORT_MASK, 3404);
                                    ButtonColors buttonColorsI2 = hc2.i(jc2.b, r1, composer6, 6, 2);
                                    ButtonScale buttonScaleL2 = hc2.l(1.05f);
                                    ButtonGlow buttonGlowA2 = el0.a(u61Var3);
                                    ButtonBorder buttonBorderH2 = hc2.h(composer6);
                                    Modifier modifierM1050height3ABfNKs3 = SizeKt.m1050height3ABfNKs(SizeKt.m1069width3ABfNKs(companion5, Dp.m7813constructorimpl(100.0f)), Dp.m7813constructorimpl(48.0f));
                                    Object objRememberedValue18 = composer6.rememberedValue();
                                    if (objRememberedValue18 == companion8.getEmpty()) {
                                        mutableState13 = mutableState19;
                                        objRememberedValue18 = new h70(9, mutableState13);
                                        composer6.updateRememberedValue(objRememberedValue18);
                                    } else {
                                        mutableState13 = mutableState19;
                                    }
                                    Modifier modifierOnFocusChanged2 = FocusChangedModifierKt.onFocusChanged(modifierM1050height3ABfNKs3, (Function1) objRememberedValue18);
                                    CoroutineScope coroutineScope3 = coroutineScope2;
                                    boolean zChangedInstance = composer6.changedInstance(coroutineScope3);
                                    DlnaSettings dlnaSettings3 = dlnaSettings2;
                                    boolean zChangedInstance2 = zChangedInstance | composer6.changedInstance(dlnaSettings3);
                                    Context context3 = context2;
                                    boolean zChangedInstance3 = zChangedInstance2 | composer6.changedInstance(context3) | composer6.changed(function3);
                                    Object objRememberedValue19 = composer6.rememberedValue();
                                    if (zChangedInstance3 || objRememberedValue19 == companion8.getEmpty()) {
                                        objRememberedValue19 = new c4(coroutineScope3, dlnaSettings3, context3, function3, mutableState9, mutableState10, mutableState11, mutableState12, 2);
                                        composer6.updateRememberedValue(objRememberedValue19);
                                    }
                                    ButtonKt.m8231ButtonTCVpFMg((Function0) objRememberedValue19, modifierOnFocusChanged2, null, false, buttonScaleL2, buttonGlowA2, null, buttonColorsI2, 0.0f, buttonBorderH2, null, null, ComposableLambdaKt.rememberComposableLambda(-1599905194, true, new p1(22, mutableState13), composer6, 54), composer6, 0, RendererCapabilities.DECODER_SUPPORT_MASK, 3404);
                                    if (x2.m(composer6)) {
                                        ComposerKt.traceEventEnd();
                                    }
                                } else {
                                    composer4.skipToGroupEnd();
                                }
                                return Unit.INSTANCE;
                            }
                        }, composer3, 54), composer3, 196614, 26);
                        composer3.endNode();
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                    } else {
                        composer3.skipToGroupEnd();
                    }
                    return Unit.INSTANCE;
                }
            }, composerStartRestartGroup, 54), composer2, (i2 & 14) | 432, 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composer2 = composerStartRestartGroup;
            composer2.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new tm(i, 2, function1));
        }
    }

    /* JADX WARN: Code duplicated, block: B:37:0x0062  */
    /* JADX WARN: Code duplicated, block: B:39:0x0067  */
    /* JADX WARN: Code duplicated, block: B:41:0x006b  */
    /* JADX WARN: Code duplicated, block: B:43:0x0073  */
    /* JADX WARN: Code duplicated, block: B:44:0x0076  */
    /* JADX WARN: Code duplicated, block: B:48:0x0082  */
    /* JADX WARN: Code duplicated, block: B:49:0x0084  */
    /* JADX WARN: Code duplicated, block: B:52:0x008e A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:53:0x0090  */
    /* JADX WARN: Code duplicated, block: B:56:0x0094  */
    /* JADX WARN: Code duplicated, block: B:57:0x0096  */
    /* JADX WARN: Code duplicated, block: B:60:0x009e  */
    /* JADX WARN: Code duplicated, block: B:63:0x00a9  */
    /* JADX WARN: Code duplicated, block: B:66:0x00c0  */
    /* JADX WARN: Code duplicated, block: B:69:0x00cc  */
    /* JADX WARN: Code duplicated, block: B:72:0x014f A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:75:0x0155  */
    /* JADX WARN: Code duplicated, block: B:78:0x015a  */
    /* JADX WARN: Code duplicated, block: B:79:0x015c  */
    /* JADX WARN: Code duplicated, block: B:82:0x0164  */
    /* JADX WARN: Code duplicated, block: B:85:0x016e  */
    /* JADX WARN: Code duplicated, block: B:87:0x0176  */
    /* JADX WARN: Code duplicated, block: B:90:0x01b0  */
    /* JADX WARN: Code duplicated, block: B:92:0x01b6  */
    /* JADX WARN: Code duplicated, block: B:95:0x01c3  */
    /* JADX WARN: Code duplicated, block: B:97:? A[RETURN, SYNTHETIC] */
    public static final void c(String str, boolean z, Function0 function0, boolean z2, FocusRequester focusRequester, Composer composer, int i, int i2) {
        int i3;
        boolean z3;
        int i4;
        FocusRequester focusRequester2;
        int i5;
        boolean z4;
        Composer composer2;
        boolean z5;
        FocusRequester focusRequester3;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        FocusRequester focusRequester4;
        Modifier modifierFocusRequester;
        boolean z6;
        boolean z7;
        boolean z8;
        boolean z9;
        Object objRememberedValue;
        String str2 = str;
        Composer composerStartRestartGroup = composer.startRestartGroup(-1069059410);
        if ((i & 6) == 0) {
            i3 = (composerStartRestartGroup.changed(str2) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            i3 |= composerStartRestartGroup.changed(z) ? 32 : 16;
        }
        if ((i & RendererCapabilities.DECODER_SUPPORT_MASK) == 0) {
            i3 |= composerStartRestartGroup.changedInstance(function0) ? 256 : 128;
        }
        int i6 = i2 & 8;
        if (i6 == 0) {
            if ((i & 3072) == 0) {
                z3 = z2;
                i3 |= composerStartRestartGroup.changed(z3) ? 2048 : 1024;
            }
            i4 = i2 & 16;
            if (i4 != 0) {
                if ((i & 24576) == 0) {
                    focusRequester2 = focusRequester;
                    if (composerStartRestartGroup.changed(focusRequester2)) {
                        i5 = 16384;
                    } else {
                        i5 = 8192;
                    }
                    i3 |= i5;
                }
                if ((i3 & 9363) != 9362) {
                    z4 = true;
                } else {
                    z4 = false;
                }
                if (composerStartRestartGroup.shouldExecute(z4, i3 & 1)) {
                    if (i6 != 0) {
                        z3 = true;
                    }
                    if (i4 != 0) {
                        focusRequester4 = null;
                    } else {
                        focusRequester4 = focusRequester2;
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-1069059410, i3, -1, "com.dh.myembyapp.dlna.DlnaSwitch (DlnaSettingsScreen.kt:261)");
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-175699322, 6, -1, "com.dh.myembyapp.ui.theme.MyEmbyTheme.<get-colors> (Theme.kt:122)");
                    }
                    u61 u61Var = (u61) composerStartRestartGroup.consume(n72.b);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    modifierFocusRequester = Modifier.INSTANCE;
                    Modifier modifierFillMaxWidth$default = SizeKt.fillMaxWidth$default(modifierFocusRequester, 0.0f, 1, null);
                    if (focusRequester4 != null) {
                        modifierFocusRequester = FocusRequesterModifierKt.focusRequester(modifierFocusRequester, focusRequester4);
                    }
                    Modifier modifierThen = modifierFillMaxWidth$default.then(modifierFocusRequester);
                    ClickableSurfaceDefaults clickableSurfaceDefaults = ClickableSurfaceDefaults.INSTANCE;
                    long j = u61Var.C;
                    long j2 = u61Var.D;
                    int i7 = ClickableSurfaceDefaults.$stable;
                    z6 = z3;
                    FocusRequester focusRequester5 = focusRequester4;
                    ClickableSurfaceColors clickableSurfaceColorsM8292colorsoq7We08 = clickableSurfaceDefaults.m8292colorsoq7We08(j, 0L, j2, 0L, 0L, 0L, 0L, 0L, composerStartRestartGroup, i7 << 24, 250);
                    ClickableSurfaceBorder clickableSurfaceBorderBorder = clickableSurfaceDefaults.border(null, new Border(BorderStrokeKt.m301BorderStrokecXLIe8U(Dp.m7813constructorimpl(2.0f), u61Var.b), 0.0f, null, 6, null), null, null, null, composerStartRestartGroup, i7 << 15, 29);
                    ClickableSurfaceScale clickableSurfaceScaleScale$default = ClickableSurfaceDefaults.scale$default(clickableSurfaceDefaults, 0.0f, 1.02f, 0.0f, 0.0f, 0.0f, 29, null);
                    ClickableSurfaceGlow clickableSurfaceGlowC = el0.c(u61Var);
                    if (z6 && focusRequester5 == null) {
                        z7 = false;
                    } else {
                        z7 = true;
                    }
                    if ((i3 & 7168) == 2048) {
                        z8 = true;
                    } else {
                        z8 = false;
                    }
                    z9 = z8 | ((i3 & 896) == 256);
                    objRememberedValue = composerStartRestartGroup.rememberedValue();
                    if (z9 || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                        objRememberedValue = new fv(z6, function0, 2);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                    }
                    Function0 function1 = (Function0) objRememberedValue;
                    str2 = str;
                    composer2 = composerStartRestartGroup;
                    SurfaceKt.m8520Surface05tvjtU(function1, modifierThen, null, z7, 0.0f, null, clickableSurfaceColorsM8292colorsoq7We08, clickableSurfaceScaleScale$default, clickableSurfaceBorderBorder, clickableSurfaceGlowC, null, ComposableLambdaKt.rememberComposableLambda(639933581, true, new vb0(z6, focusRequester5, str2, z), composerStartRestartGroup, 54), composer2, 0, 48, 1076);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    z5 = z6;
                    focusRequester3 = focusRequester5;
                } else {
                    composer2 = composerStartRestartGroup;
                    composer2.skipToGroupEnd();
                    z5 = z3;
                    focusRequester3 = focusRequester2;
                }
                scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup != null) {
                    scopeUpdateScopeEndRestartGroup.updateScope(new yk(str2, z, function0, z5, focusRequester3, i, i2));
                }
            }
            i3 |= 24576;
            focusRequester2 = focusRequester;
            if ((i3 & 9363) != 9362) {
                z4 = true;
            } else {
                z4 = false;
            }
            if (composerStartRestartGroup.shouldExecute(z4, i3 & 1)) {
                if (i6 != 0) {
                    z3 = true;
                }
                if (i4 != 0) {
                    focusRequester4 = null;
                } else {
                    focusRequester4 = focusRequester2;
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-1069059410, i3, -1, "com.dh.myembyapp.dlna.DlnaSwitch (DlnaSettingsScreen.kt:261)");
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-175699322, 6, -1, "com.dh.myembyapp.ui.theme.MyEmbyTheme.<get-colors> (Theme.kt:122)");
                }
                u61 u61Var2 = (u61) composerStartRestartGroup.consume(n72.b);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                modifierFocusRequester = Modifier.INSTANCE;
                Modifier modifierFillMaxWidth$default2 = SizeKt.fillMaxWidth$default(modifierFocusRequester, 0.0f, 1, null);
                if (focusRequester4 != null) {
                    modifierFocusRequester = FocusRequesterModifierKt.focusRequester(modifierFocusRequester, focusRequester4);
                }
                Modifier modifierThen2 = modifierFillMaxWidth$default2.then(modifierFocusRequester);
                ClickableSurfaceDefaults clickableSurfaceDefaults2 = ClickableSurfaceDefaults.INSTANCE;
                long j3 = u61Var2.C;
                long j4 = u61Var2.D;
                int i8 = ClickableSurfaceDefaults.$stable;
                z6 = z3;
                FocusRequester focusRequester6 = focusRequester4;
                ClickableSurfaceColors clickableSurfaceColorsM8292colorsoq7We09 = clickableSurfaceDefaults2.m8292colorsoq7We08(j3, 0L, j4, 0L, 0L, 0L, 0L, 0L, composerStartRestartGroup, i8 << 24, 250);
                ClickableSurfaceBorder clickableSurfaceBorderBorder2 = clickableSurfaceDefaults2.border(null, new Border(BorderStrokeKt.m301BorderStrokecXLIe8U(Dp.m7813constructorimpl(2.0f), u61Var2.b), 0.0f, null, 6, null), null, null, null, composerStartRestartGroup, i8 << 15, 29);
                ClickableSurfaceScale clickableSurfaceScaleScale$default2 = ClickableSurfaceDefaults.scale$default(clickableSurfaceDefaults2, 0.0f, 1.02f, 0.0f, 0.0f, 0.0f, 29, null);
                ClickableSurfaceGlow clickableSurfaceGlowC2 = el0.c(u61Var2);
                if (z6) {
                    z7 = true;
                } else {
                    z7 = true;
                }
                if ((i3 & 7168) == 2048) {
                    z8 = true;
                } else {
                    z8 = false;
                }
                z9 = z8 | ((i3 & 896) == 256);
                objRememberedValue = composerStartRestartGroup.rememberedValue();
                if (z9) {
                    objRememberedValue = new fv(z6, function0, 2);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                } else {
                    objRememberedValue = new fv(z6, function0, 2);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                }
                Function0 function2 = (Function0) objRememberedValue;
                str2 = str;
                composer2 = composerStartRestartGroup;
                SurfaceKt.m8520Surface05tvjtU(function2, modifierThen2, null, z7, 0.0f, null, clickableSurfaceColorsM8292colorsoq7We09, clickableSurfaceScaleScale$default2, clickableSurfaceBorderBorder2, clickableSurfaceGlowC2, null, ComposableLambdaKt.rememberComposableLambda(639933581, true, new vb0(z6, focusRequester6, str2, z), composerStartRestartGroup, 54), composer2, 0, 48, 1076);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                z5 = z6;
                focusRequester3 = focusRequester6;
            } else {
                composer2 = composerStartRestartGroup;
                composer2.skipToGroupEnd();
                z5 = z3;
                focusRequester3 = focusRequester2;
            }
            scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup != null) {
                scopeUpdateScopeEndRestartGroup.updateScope(new yk(str2, z, function0, z5, focusRequester3, i, i2));
            }
        }
        i3 |= 3072;
        z3 = z2;
        i4 = i2 & 16;
        if (i4 != 0) {
            if ((i & 24576) == 0) {
                focusRequester2 = focusRequester;
                if (composerStartRestartGroup.changed(focusRequester2)) {
                    i5 = 16384;
                } else {
                    i5 = 8192;
                }
                i3 |= i5;
            }
            if ((i3 & 9363) != 9362) {
                z4 = true;
            } else {
                z4 = false;
            }
            if (composerStartRestartGroup.shouldExecute(z4, i3 & 1)) {
                if (i6 != 0) {
                    z3 = true;
                }
                if (i4 != 0) {
                    focusRequester4 = null;
                } else {
                    focusRequester4 = focusRequester2;
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-1069059410, i3, -1, "com.dh.myembyapp.dlna.DlnaSwitch (DlnaSettingsScreen.kt:261)");
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-175699322, 6, -1, "com.dh.myembyapp.ui.theme.MyEmbyTheme.<get-colors> (Theme.kt:122)");
                }
                u61 u61Var3 = (u61) composerStartRestartGroup.consume(n72.b);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                modifierFocusRequester = Modifier.INSTANCE;
                Modifier modifierFillMaxWidth$default3 = SizeKt.fillMaxWidth$default(modifierFocusRequester, 0.0f, 1, null);
                if (focusRequester4 != null) {
                    modifierFocusRequester = FocusRequesterModifierKt.focusRequester(modifierFocusRequester, focusRequester4);
                }
                Modifier modifierThen3 = modifierFillMaxWidth$default3.then(modifierFocusRequester);
                ClickableSurfaceDefaults clickableSurfaceDefaults3 = ClickableSurfaceDefaults.INSTANCE;
                long j5 = u61Var3.C;
                long j6 = u61Var3.D;
                int i9 = ClickableSurfaceDefaults.$stable;
                z6 = z3;
                FocusRequester focusRequester7 = focusRequester4;
                ClickableSurfaceColors clickableSurfaceColorsM8292colorsoq7We010 = clickableSurfaceDefaults3.m8292colorsoq7We08(j5, 0L, j6, 0L, 0L, 0L, 0L, 0L, composerStartRestartGroup, i9 << 24, 250);
                ClickableSurfaceBorder clickableSurfaceBorderBorder3 = clickableSurfaceDefaults3.border(null, new Border(BorderStrokeKt.m301BorderStrokecXLIe8U(Dp.m7813constructorimpl(2.0f), u61Var3.b), 0.0f, null, 6, null), null, null, null, composerStartRestartGroup, i9 << 15, 29);
                ClickableSurfaceScale clickableSurfaceScaleScale$default3 = ClickableSurfaceDefaults.scale$default(clickableSurfaceDefaults3, 0.0f, 1.02f, 0.0f, 0.0f, 0.0f, 29, null);
                ClickableSurfaceGlow clickableSurfaceGlowC3 = el0.c(u61Var3);
                if (z6) {
                    z7 = true;
                } else {
                    z7 = true;
                }
                if ((i3 & 7168) == 2048) {
                    z8 = true;
                } else {
                    z8 = false;
                }
                z9 = z8 | ((i3 & 896) == 256);
                objRememberedValue = composerStartRestartGroup.rememberedValue();
                if (z9) {
                    objRememberedValue = new fv(z6, function0, 2);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                } else {
                    objRememberedValue = new fv(z6, function0, 2);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                }
                Function0 function3 = (Function0) objRememberedValue;
                str2 = str;
                composer2 = composerStartRestartGroup;
                SurfaceKt.m8520Surface05tvjtU(function3, modifierThen3, null, z7, 0.0f, null, clickableSurfaceColorsM8292colorsoq7We010, clickableSurfaceScaleScale$default3, clickableSurfaceBorderBorder3, clickableSurfaceGlowC3, null, ComposableLambdaKt.rememberComposableLambda(639933581, true, new vb0(z6, focusRequester7, str2, z), composerStartRestartGroup, 54), composer2, 0, 48, 1076);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                z5 = z6;
                focusRequester3 = focusRequester7;
            } else {
                composer2 = composerStartRestartGroup;
                composer2.skipToGroupEnd();
                z5 = z3;
                focusRequester3 = focusRequester2;
            }
            scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup != null) {
                scopeUpdateScopeEndRestartGroup.updateScope(new yk(str2, z, function0, z5, focusRequester3, i, i2));
            }
        }
        i3 |= 24576;
        focusRequester2 = focusRequester;
        if ((i3 & 9363) != 9362) {
            z4 = true;
        } else {
            z4 = false;
        }
        if (composerStartRestartGroup.shouldExecute(z4, i3 & 1)) {
            if (i6 != 0) {
                z3 = true;
            }
            if (i4 != 0) {
                focusRequester4 = null;
            } else {
                focusRequester4 = focusRequester2;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1069059410, i3, -1, "com.dh.myembyapp.dlna.DlnaSwitch (DlnaSettingsScreen.kt:261)");
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-175699322, 6, -1, "com.dh.myembyapp.ui.theme.MyEmbyTheme.<get-colors> (Theme.kt:122)");
            }
            u61 u61Var4 = (u61) composerStartRestartGroup.consume(n72.b);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            modifierFocusRequester = Modifier.INSTANCE;
            Modifier modifierFillMaxWidth$default4 = SizeKt.fillMaxWidth$default(modifierFocusRequester, 0.0f, 1, null);
            if (focusRequester4 != null) {
                modifierFocusRequester = FocusRequesterModifierKt.focusRequester(modifierFocusRequester, focusRequester4);
            }
            Modifier modifierThen4 = modifierFillMaxWidth$default4.then(modifierFocusRequester);
            ClickableSurfaceDefaults clickableSurfaceDefaults4 = ClickableSurfaceDefaults.INSTANCE;
            long j7 = u61Var4.C;
            long j8 = u61Var4.D;
            int i10 = ClickableSurfaceDefaults.$stable;
            z6 = z3;
            FocusRequester focusRequester8 = focusRequester4;
            ClickableSurfaceColors clickableSurfaceColorsM8292colorsoq7We011 = clickableSurfaceDefaults4.m8292colorsoq7We08(j7, 0L, j8, 0L, 0L, 0L, 0L, 0L, composerStartRestartGroup, i10 << 24, 250);
            ClickableSurfaceBorder clickableSurfaceBorderBorder4 = clickableSurfaceDefaults4.border(null, new Border(BorderStrokeKt.m301BorderStrokecXLIe8U(Dp.m7813constructorimpl(2.0f), u61Var4.b), 0.0f, null, 6, null), null, null, null, composerStartRestartGroup, i10 << 15, 29);
            ClickableSurfaceScale clickableSurfaceScaleScale$default4 = ClickableSurfaceDefaults.scale$default(clickableSurfaceDefaults4, 0.0f, 1.02f, 0.0f, 0.0f, 0.0f, 29, null);
            ClickableSurfaceGlow clickableSurfaceGlowC4 = el0.c(u61Var4);
            if (z6) {
                z7 = true;
            } else {
                z7 = true;
            }
            if ((i3 & 7168) == 2048) {
                z8 = true;
            } else {
                z8 = false;
            }
            z9 = z8 | ((i3 & 896) == 256);
            objRememberedValue = composerStartRestartGroup.rememberedValue();
            if (z9) {
                objRememberedValue = new fv(z6, function0, 2);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            } else {
                objRememberedValue = new fv(z6, function0, 2);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            Function0 function4 = (Function0) objRememberedValue;
            str2 = str;
            composer2 = composerStartRestartGroup;
            SurfaceKt.m8520Surface05tvjtU(function4, modifierThen4, null, z7, 0.0f, null, clickableSurfaceColorsM8292colorsoq7We011, clickableSurfaceScaleScale$default4, clickableSurfaceBorderBorder4, clickableSurfaceGlowC4, null, ComposableLambdaKt.rememberComposableLambda(639933581, true, new vb0(z6, focusRequester8, str2, z), composerStartRestartGroup, 54), composer2, 0, 48, 1076);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            z5 = z6;
            focusRequester3 = focusRequester8;
        } else {
            composer2 = composerStartRestartGroup;
            composer2.skipToGroupEnd();
            z5 = z3;
            focusRequester3 = focusRequester2;
        }
        scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new yk(str2, z, function0, z5, focusRequester3, i, i2));
        }
    }
}
