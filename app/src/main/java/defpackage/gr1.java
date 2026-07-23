package defpackage;

import android.graphics.Bitmap;
import androidx.compose.foundation.BackgroundKt;
import androidx.compose.foundation.BorderStrokeKt;
import androidx.compose.foundation.ImageKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScope;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnScope;
import androidx.compose.foundation.layout.ColumnScopeInstance;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.RowKt;
import androidx.compose.foundation.layout.RowScopeInstance;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.material3.CardColors;
import androidx.compose.material3.CardDefaults;
import androidx.compose.material3.CardKt;
import androidx.compose.material3.MaterialTheme;
import androidx.compose.material3.TextFieldColors;
import androidx.compose.material3.TextKt;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.DisposableEffectResult;
import androidx.compose.runtime.DisposableEffectScope;
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
import androidx.compose.ui.graphics.AndroidImageBitmap_androidKt;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.ColorKt;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.text.input.PasswordVisualTransformation;
import androidx.compose.ui.unit.Dp;
import androidx.compose.ui.window.AndroidDialog_androidKt;
import androidx.compose.ui.window.DialogProperties;
import androidx.media3.exoplayer.RendererCapabilities;
import androidx.media3.extractor.ts.PsExtractor;

import com.dh.myembyapp.data.ProxyConfig;
import com.dh.myembyapp.data.ProxyProtocol;
import com.dh.myembyapp.server.ProxyConfigServerManager;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.text.StringsKt;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: loaded from: classes4.dex */
public abstract class gr1 {
    public static final void a(final boolean z, final Function0 function0, final boolean z2, Composer composer, final int i) {
        int i2;
        Composer composer2;
        Composer composerStartRestartGroup = composer.startRestartGroup(-1854221234);
        if ((i & 6) == 0) {
            i2 = (composerStartRestartGroup.changed(z) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= composerStartRestartGroup.changedInstance(function0) ? 32 : 16;
        }
        if ((i & RendererCapabilities.DECODER_SUPPORT_MASK) == 0) {
            i2 |= composerStartRestartGroup.changed(z2) ? 256 : 128;
        }
        if (composerStartRestartGroup.shouldExecute((i2 & Input.Keys.NUMPAD_3) != 146, i2 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1854221234, i2, -1, "com.dh.myembyapp.ui.components.LanBypassSwitch (ProxyConfigDialog.kt:611)");
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-175699322, 6, -1, "com.dh.myembyapp.ui.theme.MyEmbyTheme.<get-colors> (Theme.kt:122)");
            }
            u61 u61Var = (u61) composerStartRestartGroup.consume(n72.b);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            Modifier modifierFillMaxWidth$default = SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null);
            ClickableSurfaceDefaults clickableSurfaceDefaults = ClickableSurfaceDefaults.INSTANCE;
            long surfaceVariant = MaterialTheme.INSTANCE.getColorScheme(composerStartRestartGroup, MaterialTheme.$stable).getSurfaceVariant();
            long j = u61Var.D;
            int i3 = ClickableSurfaceDefaults.$stable;
            ClickableSurfaceColors clickableSurfaceColorsM8292colorsoq7We08 = clickableSurfaceDefaults.m8292colorsoq7We08(surfaceVariant, 0L, j, 0L, 0L, 0L, 0L, 0L, composerStartRestartGroup, i3 << 24, 250);
            ClickableSurfaceBorder clickableSurfaceBorderBorder = clickableSurfaceDefaults.border(null, new Border(BorderStrokeKt.m301BorderStrokecXLIe8U(Dp.m7813constructorimpl(2.0f), u61Var.b), 0.0f, null, 6, null), null, null, null, composerStartRestartGroup, i3 << 15, 29);
            ClickableSurfaceScale clickableSurfaceScaleScale$default = ClickableSurfaceDefaults.scale$default(clickableSurfaceDefaults, 0.0f, 1.02f, 0.0f, 0.0f, 0.0f, 29, null);
            ClickableSurfaceGlow clickableSurfaceGlowC = el0.c(u61Var);
            boolean z3 = ((i2 & 896) == 256) | ((i2 & Input.Keys.FORWARD_DEL) == 32);
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            if (z3 || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                objRememberedValue = new fv(z2, function0, 8);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            composer2 = composerStartRestartGroup;
            SurfaceKt.m8520Surface05tvjtU((Function0) objRememberedValue, modifierFillMaxWidth$default, null, z2, 0.0f, null, clickableSurfaceColorsM8292colorsoq7We08, clickableSurfaceScaleScale$default, clickableSurfaceBorderBorder, clickableSurfaceGlowC, null, ComposableLambdaKt.rememberComposableLambda(1039156111, true, new Function3() { // from class: ar1
                /* JADX WARN: Type inference failed for: r15v3 */
                /* JADX WARN: Type inference failed for: r15v4, types: [boolean, int] */
                /* JADX WARN: Type inference failed for: r15v5 */
                @Override // kotlin.jvm.functions.Function3
                public final Object invoke(Object obj, Object obj2, Object obj3) {
                    long jM5151copywmQWz5c$default;
                    boolean z4;
                    Object r15;
                    long jD;
                    Composer composer3 = (Composer) obj2;
                    int iIntValue = ((Integer) obj3).intValue();
                    ((BoxScope) obj).getClass();
                    if (composer3.shouldExecute((iIntValue & 17) != 16, iIntValue & 1)) {
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(1039156111, iIntValue, -1, "com.dh.myembyapp.ui.components.LanBypassSwitch.<anonymous> (ProxyConfigDialog.kt:629)");
                        }
                        Modifier.Companion companion = Modifier.INSTANCE;
                        Modifier modifierM999padding3ABfNKs = PaddingKt.m999padding3ABfNKs(SizeKt.fillMaxWidth$default(companion, 0.0f, 1, null), Dp.m7813constructorimpl(12.0f));
                        Arrangement.HorizontalOrVertical spaceBetween = Arrangement.INSTANCE.getSpaceBetween();
                        Alignment.Companion companion2 = Alignment.INSTANCE;
                        MeasurePolicy measurePolicyRowMeasurePolicy = RowKt.rowMeasurePolicy(spaceBetween, companion2.getCenterVertically(), composer3, 54);
                        long currentCompositeKeyHashCode = ComposablesKt.getCurrentCompositeKeyHashCode(composer3, 0);
                        int i4 = (int) (currentCompositeKeyHashCode ^ (currentCompositeKeyHashCode >>> 32));
                        CompositionLocalMap currentCompositionLocalMap = composer3.getCurrentCompositionLocalMap();
                        Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(composer3, modifierM999padding3ABfNKs);
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
                        mr.z(companion3, composerM4318constructorimpl, measurePolicyRowMeasurePolicy, composerM4318constructorimpl, currentCompositionLocalMap);
                        Updater.m4326setimpl(composerM4318constructorimpl, modifierMaterializeModifier, (Function2<? super T, ? super Modifier, Unit>) id.h(companion3, composerM4318constructorimpl, Integer.valueOf(i4), composerM4318constructorimpl));
                        RowScopeInstance rowScopeInstance = RowScopeInstance.INSTANCE;
                        MaterialTheme materialTheme = MaterialTheme.INSTANCE;
                        int i5 = MaterialTheme.$stable;
                        TextStyle bodyMedium = materialTheme.getTypography(composer3, i5).getBodyMedium();
                        boolean z5 = z2;
                        if (z5) {
                            jM5151copywmQWz5c$default = kb0.u(composer3, 398434988, materialTheme, composer3, i5);
                        } else {
                            composer3.startReplaceGroup(398515929);
                            jM5151copywmQWz5c$default = Color.m5151copywmQWz5c$default(materialTheme.getColorScheme(composer3, i5).getOnSurface(), 0.4f, 0.0f, 0.0f, 0.0f, 14, null);
                            composer3.endReplaceGroup();
                        }
                        TextKt.m3048TextNvy7gAk("局域网不代理", null, jM5151copywmQWz5c$default, null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, bodyMedium, composer3, 6, 0, 131066);
                        Modifier modifierM1050height3ABfNKs = SizeKt.m1050height3ABfNKs(SizeKt.m1069width3ABfNKs(companion, Dp.m7813constructorimpl(44.0f)), Dp.m7813constructorimpl(24.0f));
                        boolean z6 = z;
                        if (z6) {
                            composer3.startReplaceGroup(398825619);
                            z4 = z5;
                            r15 = 0;
                            jD = zc2.b(z4, composer3, 0);
                            composer3.endReplaceGroup();
                        } else {
                            z4 = z5;
                            r15 = 0;
                            composer3.startReplaceGroup(398930833);
                            jD = zc2.d(z4, composer3, 0);
                            composer3.endReplaceGroup();
                        }
                        Modifier modifierM999padding3ABfNKs2 = PaddingKt.m999padding3ABfNKs(kb0.v(12.0f, modifierM1050height3ABfNKs, jD), Dp.m7813constructorimpl(2.0f));
                        MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(z6 ? companion2.getCenterEnd() : companion2.getCenterStart(), r15);
                        long currentCompositeKeyHashCode2 = ComposablesKt.getCurrentCompositeKeyHashCode(composer3, r15);
                        int i6 = (int) (currentCompositeKeyHashCode2 ^ (currentCompositeKeyHashCode2 >>> 32));
                        CompositionLocalMap currentCompositionLocalMap2 = composer3.getCurrentCompositionLocalMap();
                        Modifier modifierMaterializeModifier2 = ComposedModifierKt.materializeModifier(composer3, modifierM999padding3ABfNKs2);
                        Function0<ComposeUiNode> constructor2 = companion3.getConstructor();
                        if (composer3.getApplier() == null) {
                            ComposablesKt.invalidApplier();
                        }
                        composer3.startReusableNode();
                        if (composer3.getInserting()) {
                            composer3.createNode(constructor2);
                        } else {
                            composer3.useNode();
                        }
                        Composer composerM4318constructorimpl2 = Updater.m4318constructorimpl(composer3);
                        mr.z(companion3, composerM4318constructorimpl2, measurePolicyMaybeCachedBoxMeasurePolicy, composerM4318constructorimpl2, currentCompositionLocalMap2);
                        Updater.m4326setimpl(composerM4318constructorimpl2, modifierMaterializeModifier2, (Function2<? super T, ? super Modifier, Unit>) id.h(companion3, composerM4318constructorimpl2, Integer.valueOf(i6), composerM4318constructorimpl2));
                        BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
                        BoxKt.Box(kb0.v(10.0f, SizeKt.m1064size3ABfNKs(companion, Dp.m7813constructorimpl(20.0f)), zc2.c(z4)), composer3, r15);
                        composer3.endNode();
                        composer3.endNode();
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                    } else {
                        composer3.skipToGroupEnd();
                    }
                    return Unit.INSTANCE;
                }
            }, composerStartRestartGroup, 54), composer2, ((i2 << 3) & 7168) | 48, 48, 1076);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composer2 = composerStartRestartGroup;
            composer2.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: br1
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).intValue();
                    int iUpdateChangedFlags = RecomposeScopeImplKt.updateChangedFlags(i | 1);
                    gr1.a(z, function0, z2, (Composer) obj, iUpdateChangedFlags);
                    return Unit.INSTANCE;
                }
            });
        }
    }

    public static final void b(w81 w81Var, Function0 function0, Composer composer, int i) {
        int i2;
        Function0 function1;
        Composer composerStartRestartGroup = composer.startRestartGroup(735313143);
        if ((i & 6) == 0) {
            i2 = (composerStartRestartGroup.changed(w81Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= composerStartRestartGroup.changedInstance(function0) ? 32 : 16;
        }
        if (composerStartRestartGroup.shouldExecute((i2 & 19) != 18, i2 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(735313143, i2, -1, "com.dh.myembyapp.ui.components.NetworkTestResultDialog (ProxyConfigDialog.kt:476)");
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-175699322, 6, -1, "com.dh.myembyapp.ui.theme.MyEmbyTheme.<get-colors> (Theme.kt:122)");
            }
            u61 u61Var = (u61) composerStartRestartGroup.consume(n72.b);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            function1 = function0;
            AndroidDialog_androidKt.Dialog(function1, new DialogProperties(true, true, false), ComposableLambdaKt.rememberComposableLambda(1657829134, true, new a2(22, u61Var, w81Var), composerStartRestartGroup, 54), composerStartRestartGroup, ((i2 >> 3) & 14) | 432, 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            function1 = function0;
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new e81(w81Var, function1, i, 11));
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void c(ProxyConfig proxyConfig, ProxyConfigServerManager proxyConfigServerManager, final Function0 function0, final Function1 function1, Composer composer, int i) {
        int i2;
        Object obj;
        Composer composer2;
        Unit unit;
        MutableState mutableState;
        MutableState mutableState2;
        MutableState mutableState3;
        MutableState mutableState4;
        MutableState mutableState5;
        MutableState mutableState6;
        MutableState mutableState7;
        Bitmap bitmapY;
        proxyConfig.getClass();
        proxyConfigServerManager.getClass();
        function0.getClass();
        function1.getClass();
        Composer composerStartRestartGroup = composer.startRestartGroup(597664524);
        if ((i & 6) == 0) {
            i2 = (composerStartRestartGroup.changed(proxyConfig) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= composerStartRestartGroup.changedInstance(proxyConfigServerManager) ? 32 : 16;
        }
        if ((i & RendererCapabilities.DECODER_SUPPORT_MASK) == 0) {
            i2 |= composerStartRestartGroup.changedInstance(function0) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= composerStartRestartGroup.changedInstance(function1) ? 2048 : 1024;
        }
        if (composerStartRestartGroup.shouldExecute((i2 & 1171) != 1170, i2 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(597664524, i2, -1, "com.dh.myembyapp.ui.components.ProxyConfigDialog (ProxyConfigDialog.kt:73)");
            }
            char c = 6;
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
                objRememberedValue = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Boolean.valueOf(proxyConfig.getEnabled()), null, 2, null);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            MutableState mutableState8 = (MutableState) objRememberedValue;
            Object objRememberedValue2 = composerStartRestartGroup.rememberedValue();
            if (objRememberedValue2 == companion.getEmpty()) {
                objRememberedValue2 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(proxyConfig.getProtocol(), null, 2, null);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
            }
            MutableState mutableState9 = (MutableState) objRememberedValue2;
            Object objRememberedValue3 = composerStartRestartGroup.rememberedValue();
            if (objRememberedValue3 == companion.getEmpty()) {
                objRememberedValue3 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(proxyConfig.getHost(), null, 2, null);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
            }
            MutableState mutableState10 = (MutableState) objRememberedValue3;
            Object objRememberedValue4 = composerStartRestartGroup.rememberedValue();
            if (objRememberedValue4 == companion.getEmpty()) {
                objRememberedValue4 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(String.valueOf(proxyConfig.getPort()), null, 2, null);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue4);
            }
            MutableState mutableState11 = (MutableState) objRememberedValue4;
            Object objRememberedValue5 = composerStartRestartGroup.rememberedValue();
            if (objRememberedValue5 == companion.getEmpty()) {
                objRememberedValue5 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(proxyConfig.getUsername(), null, 2, null);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue5);
            }
            MutableState mutableState12 = (MutableState) objRememberedValue5;
            Object objRememberedValue6 = composerStartRestartGroup.rememberedValue();
            if (objRememberedValue6 == companion.getEmpty()) {
                objRememberedValue6 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(proxyConfig.getPassword(), null, 2, null);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue6);
            }
            final MutableState mutableState13 = (MutableState) objRememberedValue6;
            Object objRememberedValue7 = composerStartRestartGroup.rememberedValue();
            if (objRememberedValue7 == companion.getEmpty()) {
                objRememberedValue7 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Boolean.valueOf(proxyConfig.getBypassLan()), null, 2, null);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue7);
            }
            final MutableState mutableState14 = (MutableState) objRememberedValue7;
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
            Object objRememberedValue10 = composerStartRestartGroup.rememberedValue();
            if (objRememberedValue10 == companion.getEmpty()) {
                objRememberedValue10 = mr.n(composerStartRestartGroup);
            }
            final FocusRequester focusRequester3 = (FocusRequester) objRememberedValue10;
            Object objRememberedValue11 = composerStartRestartGroup.rememberedValue();
            if (objRememberedValue11 == companion.getEmpty()) {
                objRememberedValue11 = mr.n(composerStartRestartGroup);
            }
            final FocusRequester focusRequester4 = (FocusRequester) objRememberedValue11;
            Object objRememberedValue12 = composerStartRestartGroup.rememberedValue();
            if (objRememberedValue12 == companion.getEmpty()) {
                objRememberedValue12 = mr.n(composerStartRestartGroup);
            }
            final FocusRequester focusRequester5 = (FocusRequester) objRememberedValue12;
            Object objRememberedValue13 = composerStartRestartGroup.rememberedValue();
            if (objRememberedValue13 == companion.getEmpty()) {
                objRememberedValue13 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Boolean.FALSE, null, 2, null);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue13);
            }
            final MutableState mutableState15 = (MutableState) objRememberedValue13;
            Object objRememberedValue14 = composerStartRestartGroup.rememberedValue();
            if (objRememberedValue14 == companion.getEmpty()) {
                objRememberedValue14 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(null, null, 2, null);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue14);
            }
            final MutableState mutableState16 = (MutableState) objRememberedValue14;
            Object objRememberedValue15 = composerStartRestartGroup.rememberedValue();
            if (objRememberedValue15 == companion.getEmpty()) {
                objRememberedValue15 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Boolean.FALSE, null, 2, null);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue15);
            }
            final MutableState mutableState17 = (MutableState) objRememberedValue15;
            Object objRememberedValue16 = composerStartRestartGroup.rememberedValue();
            if (objRememberedValue16 == companion.getEmpty()) {
                objRememberedValue16 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Boolean.FALSE, null, 2, null);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue16);
            }
            final MutableState mutableState18 = (MutableState) objRememberedValue16;
            Object objRememberedValue17 = composerStartRestartGroup.rememberedValue();
            if (objRememberedValue17 == companion.getEmpty()) {
                objRememberedValue17 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Boolean.FALSE, null, 2, null);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue17);
            }
            final MutableState mutableState19 = (MutableState) objRememberedValue17;
            Object objRememberedValue18 = composerStartRestartGroup.rememberedValue();
            if (objRememberedValue18 == companion.getEmpty()) {
                objRememberedValue18 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Boolean.FALSE, null, 2, null);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue18);
            }
            final MutableState mutableState20 = (MutableState) objRememberedValue18;
            Object objRememberedValue19 = composerStartRestartGroup.rememberedValue();
            if (objRememberedValue19 == companion.getEmpty()) {
                objRememberedValue19 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(null, null, 2, null);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue19);
            }
            MutableState mutableState21 = (MutableState) objRememberedValue19;
            Object objRememberedValue20 = composerStartRestartGroup.rememberedValue();
            if (objRememberedValue20 == companion.getEmpty()) {
                objRememberedValue20 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Boolean.FALSE, null, 2, null);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue20);
            }
            MutableState mutableState22 = (MutableState) objRememberedValue20;
            Object objRememberedValue21 = composerStartRestartGroup.rememberedValue();
            if (objRememberedValue21 == companion.getEmpty()) {
                objRememberedValue21 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(null, null, 2, null);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue21);
            }
            final MutableState mutableState23 = (MutableState) objRememberedValue21;
            Object objRememberedValue22 = composerStartRestartGroup.rememberedValue();
            if (objRememberedValue22 == companion.getEmpty()) {
                objRememberedValue22 = EffectsKt.createCompositionCoroutineScope(EmptyCoroutineContext.INSTANCE, composerStartRestartGroup);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue22);
            }
            final CoroutineScope coroutineScope = (CoroutineScope) objRememberedValue22;
            Unit unit2 = Unit.INSTANCE;
            boolean zChangedInstance = composerStartRestartGroup.changedInstance(proxyConfigServerManager);
            Object objRememberedValue23 = composerStartRestartGroup.rememberedValue();
            if (zChangedInstance || objRememberedValue23 == companion.getEmpty()) {
                unit = unit2;
                mutableState = mutableState21;
                mutableState2 = mutableState22;
                mutableState3 = mutableState8;
                mutableState4 = mutableState9;
                mutableState5 = mutableState10;
                mutableState6 = mutableState11;
                mutableState7 = mutableState12;
                er1 er1Var = new er1(proxyConfigServerManager, mutableState3, mutableState4, mutableState5, mutableState6, mutableState7, mutableState13, mutableState14, mutableState23, mutableState, mutableState2, null);
                composerStartRestartGroup.updateRememberedValue(er1Var);
                objRememberedValue23 = er1Var;
            } else {
                unit = unit2;
                mutableState = mutableState21;
                mutableState2 = mutableState22;
                mutableState3 = mutableState8;
                mutableState4 = mutableState9;
                mutableState5 = mutableState10;
                mutableState6 = mutableState11;
                mutableState7 = mutableState12;
            }
            EffectsKt.LaunchedEffect(unit, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) objRememberedValue23, composerStartRestartGroup, c);
            boolean zChangedInstance2 = composerStartRestartGroup.changedInstance(obj);
            Object objRememberedValue24 = composerStartRestartGroup.rememberedValue();
            if (zChangedInstance2 || objRememberedValue24 == companion.getEmpty()) {
                objRememberedValue24 = new kh1(proxyConfigServerManager, c);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue24);
            }
            EffectsKt.DisposableEffect(unit, (Function1<? super DisposableEffectScope, ? extends DisposableEffectResult>) objRememberedValue24, composerStartRestartGroup, c);
            boolean zChanged = composerStartRestartGroup.changed((String) mutableState.getValue());
            Object objRememberedValue25 = composerStartRestartGroup.rememberedValue();
            if (zChanged || objRememberedValue25 == companion.getEmpty()) {
                String str = (String) mutableState.getValue();
                if (str == null || StringsKt.isBlank(str)) {
                    bitmapY = null;
                } else {
                    String str2 = (String) mutableState.getValue();
                    str2.getClass();
                    bitmapY = ku.y(280, 280, str2);
                }
                composerStartRestartGroup.updateRememberedValue(bitmapY);
                objRememberedValue25 = bitmapY;
            }
            final Bitmap bitmap = (Bitmap) objRememberedValue25;
            final MutableState mutableState24 = mutableState3;
            final MutableState mutableState25 = mutableState4;
            final MutableState mutableState26 = mutableState5;
            final MutableState mutableState27 = mutableState6;
            final MutableState mutableState28 = mutableState7;
            final MutableState mutableState29 = mutableState;
            final MutableState mutableState30 = mutableState2;
            composer2 = composerStartRestartGroup;
            AndroidDialog_androidKt.Dialog(function0, new DialogProperties(true, false, false), ComposableLambdaKt.rememberComposableLambda(861781781, true, new Function2() { // from class: cr1
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj2, Object obj3) {
                    Composer composer3 = (Composer) obj2;
                    int iIntValue = ((Integer) obj3).intValue();
                    if (composer3.shouldExecute((iIntValue & 3) != 2, iIntValue & 1)) {
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(861781781, iIntValue, -1, "com.dh.myembyapp.ui.components.ProxyConfigDialog.<anonymous> (ProxyConfigDialog.kt:145)");
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
                        Modifier modifierM1069width3ABfNKs = SizeKt.m1069width3ABfNKs(companion2, Dp.m7813constructorimpl(860.0f));
                        CardColors cardColorsM2119cardColorsro_MJ88 = CardDefaults.INSTANCE.m2119cardColorsro_MJ88(MaterialTheme.INSTANCE.getColorScheme(composer3, MaterialTheme.$stable).getSurface(), 0L, 0L, 0L, composer3, CardDefaults.$stable << 12, 14);
                        final Bitmap bitmap2 = bitmap;
                        final MutableState mutableState31 = mutableState29;
                        final MutableState mutableState32 = mutableState30;
                        final MutableState mutableState33 = mutableState24;
                        final MutableState mutableState34 = mutableState25;
                        final MutableState mutableState35 = mutableState26;
                        final MutableState mutableState36 = mutableState27;
                        final MutableState mutableState37 = mutableState28;
                        final MutableState mutableState38 = mutableState13;
                        final MutableState mutableState39 = mutableState14;
                        final MutableState mutableState40 = mutableState23;
                        final MutableState mutableState41 = mutableState18;
                        final MutableState mutableState42 = mutableState17;
                        final MutableState mutableState43 = mutableState19;
                        final MutableState mutableState44 = mutableState16;
                        final MutableState mutableState45 = mutableState15;
                        final MutableState mutableState46 = mutableState20;
                        final FocusRequester focusRequester6 = focusRequester;
                        final FocusRequester focusRequester7 = focusRequester2;
                        final FocusRequester focusRequester8 = focusRequester3;
                        final FocusRequester focusRequester9 = focusRequester4;
                        final FocusRequester focusRequester10 = focusRequester5;
                        final Function0 function2 = function0;
                        final Function1 function3 = function1;
                        final CoroutineScope coroutineScope2 = coroutineScope;
                        CardKt.Card(modifierM1069width3ABfNKs, null, cardColorsM2119cardColorsro_MJ88, null, null, ComposableLambdaKt.rememberComposableLambda(-1394227427, true, new Function3() { // from class: dr1
                            /* JADX WARN: Multi-variable type inference failed */
                            @Override // kotlin.jvm.functions.Function3
                            public final Object invoke(Object obj4, Object obj5, Object obj6) {
                                MaterialTheme materialTheme;
                                int i4;
                                long jU;
                                Composer composer4;
                                MutableState mutableState47;
                                MutableState mutableState48;
                                MutableState mutableState49;
                                int i5;
                                MutableState mutableState50;
                                int i6;
                                MutableState mutableState51;
                                Composer composer5 = (Composer) obj5;
                                int iIntValue2 = ((Integer) obj6).intValue();
                                ((ColumnScope) obj4).getClass();
                                if (composer5.shouldExecute((iIntValue2 & 17) != 16, iIntValue2 & 1)) {
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventStart(-1394227427, iIntValue2, -1, "com.dh.myembyapp.ui.components.ProxyConfigDialog.<anonymous>.<anonymous>.<anonymous> (ProxyConfigDialog.kt:155)");
                                    }
                                    Modifier.Companion companion4 = Modifier.INSTANCE;
                                    Modifier modifierM999padding3ABfNKs = PaddingKt.m999padding3ABfNKs(SizeKt.fillMaxWidth$default(companion4, 0.0f, 1, null), Dp.m7813constructorimpl(20.0f));
                                    Arrangement arrangement = Arrangement.INSTANCE;
                                    Arrangement.HorizontalOrVertical horizontalOrVerticalM712spacedBy0680j_4 = arrangement.m712spacedBy0680j_4(Dp.m7813constructorimpl(18.0f));
                                    Alignment.Companion companion5 = Alignment.INSTANCE;
                                    MeasurePolicy measurePolicyRowMeasurePolicy = RowKt.rowMeasurePolicy(horizontalOrVerticalM712spacedBy0680j_4, companion5.getTop(), composer5, 6);
                                    long currentCompositeKeyHashCode2 = ComposablesKt.getCurrentCompositeKeyHashCode(composer5, 0);
                                    int i7 = (int) (currentCompositeKeyHashCode2 ^ (currentCompositeKeyHashCode2 >>> 32));
                                    CompositionLocalMap currentCompositionLocalMap2 = composer5.getCurrentCompositionLocalMap();
                                    Modifier modifierMaterializeModifier2 = ComposedModifierKt.materializeModifier(composer5, modifierM999padding3ABfNKs);
                                    ComposeUiNode.Companion companion6 = ComposeUiNode.INSTANCE;
                                    Function0<ComposeUiNode> constructor2 = companion6.getConstructor();
                                    if (composer5.getApplier() == null) {
                                        ComposablesKt.invalidApplier();
                                    }
                                    composer5.startReusableNode();
                                    if (composer5.getInserting()) {
                                        composer5.createNode(constructor2);
                                    } else {
                                        composer5.useNode();
                                    }
                                    Composer composerM4318constructorimpl2 = Updater.m4318constructorimpl(composer5);
                                    mr.z(companion6, composerM4318constructorimpl2, measurePolicyRowMeasurePolicy, composerM4318constructorimpl2, currentCompositionLocalMap2);
                                    Updater.m4326setimpl(composerM4318constructorimpl2, modifierMaterializeModifier2, (Function2<? super T, ? super Modifier, Unit>) id.h(companion6, composerM4318constructorimpl2, Integer.valueOf(i7), composerM4318constructorimpl2));
                                    RowScopeInstance rowScopeInstance = RowScopeInstance.INSTANCE;
                                    Modifier modifierM1069width3ABfNKs2 = SizeKt.m1069width3ABfNKs(companion4, Dp.m7813constructorimpl(320.0f));
                                    MeasurePolicy measurePolicyP = mr.p(10.0f, arrangement, companion5.getCenterHorizontally(), composer5, 54);
                                    long currentCompositeKeyHashCode3 = ComposablesKt.getCurrentCompositeKeyHashCode(composer5, 0);
                                    int i8 = (int) (currentCompositeKeyHashCode3 ^ (currentCompositeKeyHashCode3 >>> 32));
                                    CompositionLocalMap currentCompositionLocalMap3 = composer5.getCurrentCompositionLocalMap();
                                    Modifier modifierMaterializeModifier3 = ComposedModifierKt.materializeModifier(composer5, modifierM1069width3ABfNKs2);
                                    Function0<ComposeUiNode> constructor3 = companion6.getConstructor();
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
                                    mr.z(companion6, composerM4318constructorimpl3, measurePolicyP, composerM4318constructorimpl3, currentCompositionLocalMap3);
                                    Updater.m4326setimpl(composerM4318constructorimpl3, modifierMaterializeModifier3, (Function2<? super T, ? super Modifier, Unit>) id.h(companion6, composerM4318constructorimpl3, Integer.valueOf(i8), composerM4318constructorimpl3));
                                    ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.INSTANCE;
                                    MaterialTheme materialTheme2 = MaterialTheme.INSTANCE;
                                    int i9 = MaterialTheme.$stable;
                                    TextKt.m3048TextNvy7gAk("手机扫码导入", null, materialTheme2.getColorScheme(composer5, i9).getPrimary(), null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, materialTheme2.getTypography(composer5, i9).getTitleMedium(), composer5, 6, 0, 131066);
                                    Bitmap bitmap3 = bitmap2;
                                    if (bitmap3 != null) {
                                        composer5.startReplaceGroup(-91915882);
                                        ImageKt.m332Image5hnEew(AndroidImageBitmap_androidKt.asImageBitmap(bitmap3), "代理配置二维码", SizeKt.m1064size3ABfNKs(companion4, Dp.m7813constructorimpl(220.0f)), null, null, 0.0f, null, 0, composer5, 432, 248);
                                        String str3 = (String) mutableState31.getValue();
                                        if (str3 == null) {
                                            str3 = "";
                                        }
                                        i4 = i9;
                                        materialTheme = materialTheme2;
                                        TextKt.m3048TextNvy7gAk(str3, null, Color.m5151copywmQWz5c$default(materialTheme2.getColorScheme(composer5, i9).getOnSurface(), 0.65f, 0.0f, 0.0f, 0.0f, 14, null), null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, materialTheme2.getTypography(composer5, i9).getBodySmall(), composer5, 0, 0, 131066);
                                        TextKt.m3048TextNvy7gAk("手机浏览器打开后输入代理信息", null, Color.m5151copywmQWz5c$default(materialTheme.getColorScheme(composer5, i4).getOnSurface(), 0.65f, 0.0f, 0.0f, 0.0f, 14, null), null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, materialTheme.getTypography(composer5, i4).getBodySmall(), composer5, 6, 0, 131066);
                                        composer4 = composer5;
                                        composer4.endReplaceGroup();
                                    } else {
                                        materialTheme = materialTheme2;
                                        i4 = i9;
                                        composer5.startReplaceGroup(-91030925);
                                        MutableState mutableState52 = mutableState32;
                                        String str4 = ((Boolean) mutableState52.getValue()).booleanValue() ? "配置服务启动失败" : "正在启动配置服务...";
                                        TextStyle bodySmall = materialTheme.getTypography(composer5, i4).getBodySmall();
                                        if (((Boolean) mutableState52.getValue()).booleanValue()) {
                                            composer5.startReplaceGroup(551260712);
                                            jU = materialTheme.getColorScheme(composer5, i4).getError();
                                            composer5.endReplaceGroup();
                                        } else {
                                            jU = kb0.u(composer5, 551261900, materialTheme, composer5, i4);
                                        }
                                        TextKt.m3048TextNvy7gAk(str4, null, jU, null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, bodySmall, composer5, 0, 0, 131066);
                                        composer4 = composer5;
                                        composer4.endReplaceGroup();
                                    }
                                    composer4.endNode();
                                    Modifier modifierE = zs1.E(rowScopeInstance, companion4, 1.0f, false, 2, null);
                                    MeasurePolicy measurePolicyColumnMeasurePolicy = ColumnKt.columnMeasurePolicy(arrangement.m712spacedBy0680j_4(Dp.m7813constructorimpl(8.0f)), companion5.getStart(), composer4, 6);
                                    long currentCompositeKeyHashCode4 = ComposablesKt.getCurrentCompositeKeyHashCode(composer4, 0);
                                    int i10 = (int) (currentCompositeKeyHashCode4 ^ (currentCompositeKeyHashCode4 >>> 32));
                                    CompositionLocalMap currentCompositionLocalMap4 = composer4.getCurrentCompositionLocalMap();
                                    Modifier modifierMaterializeModifier4 = ComposedModifierKt.materializeModifier(composer4, modifierE);
                                    Function0<ComposeUiNode> constructor4 = companion6.getConstructor();
                                    if (composer4.getApplier() == null) {
                                        ComposablesKt.invalidApplier();
                                    }
                                    composer4.startReusableNode();
                                    if (composer4.getInserting()) {
                                        composer4.createNode(constructor4);
                                    } else {
                                        composer4.useNode();
                                    }
                                    Composer composerM4318constructorimpl4 = Updater.m4318constructorimpl(composer4);
                                    mr.z(companion6, composerM4318constructorimpl4, measurePolicyColumnMeasurePolicy, composerM4318constructorimpl4, currentCompositionLocalMap4);
                                    Updater.m4326setimpl(composerM4318constructorimpl4, modifierMaterializeModifier4, (Function2<? super T, ? super Modifier, Unit>) id.h(companion6, composerM4318constructorimpl4, Integer.valueOf(i10), composerM4318constructorimpl4));
                                    Composer composer6 = composer4;
                                    int i11 = i4;
                                    TextKt.m3048TextNvy7gAk("代理配置", null, materialTheme.getColorScheme(composer4, i4).getPrimary(), null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, materialTheme.getTypography(composer4, i4).getTitleLarge(), composer6, 6, 0, 131066);
                                    MutableState mutableState53 = mutableState33;
                                    boolean zD = gr1.d(mutableState53);
                                    Object objRememberedValue26 = composer6.rememberedValue();
                                    Composer.Companion companion7 = Composer.INSTANCE;
                                    if (objRememberedValue26 == companion7.getEmpty()) {
                                        objRememberedValue26 = new zq1(0, mutableState53);
                                        composer6.updateRememberedValue(objRememberedValue26);
                                    }
                                    gr1.g(zD, (Function0) objRememberedValue26, composer6, 48);
                                    MutableState mutableState54 = mutableState34;
                                    ProxyProtocol proxyProtocol = (ProxyProtocol) mutableState54.getValue();
                                    Object objRememberedValue27 = composer6.rememberedValue();
                                    if (objRememberedValue27 == companion7.getEmpty()) {
                                        objRememberedValue27 = new li1(12, mutableState54);
                                        composer6.updateRememberedValue(objRememberedValue27);
                                    }
                                    gr1.f(proxyProtocol, (Function1) objRememberedValue27, ((Boolean) mutableState53.getValue()).booleanValue(), composer6, 48);
                                    TextKt.m3048TextNvy7gAk("请填写局域网或可信任的代理服务器地址", null, Color.m5151copywmQWz5c$default(materialTheme.getColorScheme(composer6, i11).getOnSurface(), 0.65f, 0.0f, 0.0f, 0.0f, 14, null), null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, materialTheme.getTypography(composer6, i11).getBodySmall(), composer6, 6, 0, 131066);
                                    Modifier modifierFillMaxWidth$default = SizeKt.fillMaxWidth$default(companion4, 0.0f, 1, null);
                                    MeasurePolicy measurePolicyRowMeasurePolicy2 = RowKt.rowMeasurePolicy(arrangement.m712spacedBy0680j_4(Dp.m7813constructorimpl(10.0f)), companion5.getTop(), composer6, 6);
                                    long currentCompositeKeyHashCode5 = ComposablesKt.getCurrentCompositeKeyHashCode(composer6, 0);
                                    int i12 = (int) (currentCompositeKeyHashCode5 ^ (currentCompositeKeyHashCode5 >>> 32));
                                    CompositionLocalMap currentCompositionLocalMap5 = composer6.getCurrentCompositionLocalMap();
                                    Modifier modifierMaterializeModifier5 = ComposedModifierKt.materializeModifier(composer6, modifierFillMaxWidth$default);
                                    Function0<ComposeUiNode> constructor5 = companion6.getConstructor();
                                    if (composer6.getApplier() == null) {
                                        ComposablesKt.invalidApplier();
                                    }
                                    composer6.startReusableNode();
                                    if (composer6.getInserting()) {
                                        composer6.createNode(constructor5);
                                    } else {
                                        composer6.useNode();
                                    }
                                    Composer composerM4318constructorimpl5 = Updater.m4318constructorimpl(composer6);
                                    mr.z(companion6, composerM4318constructorimpl5, measurePolicyRowMeasurePolicy2, composerM4318constructorimpl5, currentCompositionLocalMap5);
                                    Updater.m4326setimpl(composerM4318constructorimpl5, modifierMaterializeModifier5, (Function2<? super T, ? super Modifier, Unit>) id.h(companion6, composerM4318constructorimpl5, Integer.valueOf(i12), composerM4318constructorimpl5));
                                    MutableState mutableState55 = mutableState35;
                                    String str5 = (String) mutableState55.getValue();
                                    Modifier modifierFocusRequester = FocusRequesterModifierKt.focusRequester(zs1.E(rowScopeInstance, companion4, 1.0f, false, 2, null), focusRequester6);
                                    TextStyle bodyMedium = materialTheme.getTypography(composer6, i11).getBodyMedium();
                                    boolean zBooleanValue = ((Boolean) mutableState53.getValue()).booleanValue();
                                    TextFieldColors textFieldColorsM = yc2.m(composer6);
                                    Object objRememberedValue28 = composer6.rememberedValue();
                                    if (objRememberedValue28 == companion7.getEmpty()) {
                                        mutableState47 = mutableState53;
                                        objRememberedValue28 = new ai(10, mutableState47, mutableState55);
                                        composer6.updateRememberedValue(objRememberedValue28);
                                    } else {
                                        mutableState47 = mutableState53;
                                    }
                                    MutableState mutableState56 = mutableState47;
                                    MaterialTheme materialTheme3 = materialTheme;
                                    yc2.d(str5, (Function1) objRememberedValue28, modifierFocusRequester, zBooleanValue, qt.a, null, null, null, null, null, bodyMedium, false, textFieldColorsM, null, composer6, 24624, 6, 21472);
                                    MutableState mutableState57 = mutableState36;
                                    String str6 = (String) mutableState57.getValue();
                                    Modifier modifierFocusRequester2 = FocusRequesterModifierKt.focusRequester(SizeKt.m1069width3ABfNKs(companion4, Dp.m7813constructorimpl(110.0f)), focusRequester7);
                                    TextStyle bodyMedium2 = materialTheme3.getTypography(composer6, i11).getBodyMedium();
                                    boolean zBooleanValue2 = ((Boolean) mutableState56.getValue()).booleanValue();
                                    TextFieldColors textFieldColorsM2 = yc2.m(composer6);
                                    Object objRememberedValue29 = composer6.rememberedValue();
                                    int i13 = 11;
                                    if (objRememberedValue29 == companion7.getEmpty()) {
                                        mutableState48 = mutableState56;
                                        objRememberedValue29 = new ai(i13, mutableState48, mutableState57);
                                        composer6.updateRememberedValue(objRememberedValue29);
                                    } else {
                                        mutableState48 = mutableState56;
                                    }
                                    MutableState mutableState58 = mutableState48;
                                    yc2.d(str6, (Function1) objRememberedValue29, modifierFocusRequester2, zBooleanValue2, qt.b, null, null, null, null, null, bodyMedium2, false, textFieldColorsM2, null, composer6, 24624, 6, 21472);
                                    composer6.endNode();
                                    Modifier modifierFillMaxWidth$default2 = SizeKt.fillMaxWidth$default(companion4, 0.0f, 1, null);
                                    MeasurePolicy measurePolicyRowMeasurePolicy3 = RowKt.rowMeasurePolicy(arrangement.m712spacedBy0680j_4(Dp.m7813constructorimpl(10.0f)), companion5.getTop(), composer6, 6);
                                    long currentCompositeKeyHashCode6 = ComposablesKt.getCurrentCompositeKeyHashCode(composer6, 0);
                                    int i14 = (int) (currentCompositeKeyHashCode6 ^ (currentCompositeKeyHashCode6 >>> 32));
                                    CompositionLocalMap currentCompositionLocalMap6 = composer6.getCurrentCompositionLocalMap();
                                    Modifier modifierMaterializeModifier6 = ComposedModifierKt.materializeModifier(composer6, modifierFillMaxWidth$default2);
                                    Function0<ComposeUiNode> constructor6 = companion6.getConstructor();
                                    if (composer6.getApplier() == null) {
                                        ComposablesKt.invalidApplier();
                                    }
                                    composer6.startReusableNode();
                                    if (composer6.getInserting()) {
                                        composer6.createNode(constructor6);
                                    } else {
                                        composer6.useNode();
                                    }
                                    Composer composerM4318constructorimpl6 = Updater.m4318constructorimpl(composer6);
                                    mr.z(companion6, composerM4318constructorimpl6, measurePolicyRowMeasurePolicy3, composerM4318constructorimpl6, currentCompositionLocalMap6);
                                    Updater.m4326setimpl(composerM4318constructorimpl6, modifierMaterializeModifier6, (Function2<? super T, ? super Modifier, Unit>) id.h(companion6, composerM4318constructorimpl6, Integer.valueOf(i14), composerM4318constructorimpl6));
                                    MutableState mutableState59 = mutableState37;
                                    String str7 = (String) mutableState59.getValue();
                                    Modifier modifierFocusRequester3 = FocusRequesterModifierKt.focusRequester(zs1.E(rowScopeInstance, companion4, 1.0f, false, 2, null), focusRequester8);
                                    TextStyle bodyMedium3 = materialTheme3.getTypography(composer6, i11).getBodyMedium();
                                    boolean zBooleanValue3 = ((Boolean) mutableState58.getValue()).booleanValue();
                                    TextFieldColors textFieldColorsM3 = yc2.m(composer6);
                                    Object objRememberedValue30 = composer6.rememberedValue();
                                    if (objRememberedValue30 == companion7.getEmpty()) {
                                        mutableState49 = mutableState58;
                                        i5 = 12;
                                        objRememberedValue30 = new ai(i5, mutableState49, mutableState59);
                                        composer6.updateRememberedValue(objRememberedValue30);
                                    } else {
                                        mutableState49 = mutableState58;
                                        i5 = 12;
                                    }
                                    MutableState mutableState60 = mutableState49;
                                    yc2.d(str7, (Function1) objRememberedValue30, modifierFocusRequester3, zBooleanValue3, qt.c, null, null, null, null, null, bodyMedium3, false, textFieldColorsM3, null, composer6, 24624, 6, 21472);
                                    MutableState mutableState61 = mutableState38;
                                    String str8 = (String) mutableState61.getValue();
                                    Modifier modifierFocusRequester4 = FocusRequesterModifierKt.focusRequester(zs1.E(rowScopeInstance, companion4, 1.0f, false, 2, null), focusRequester9);
                                    TextStyle bodyMedium4 = materialTheme3.getTypography(composer6, i11).getBodyMedium();
                                    boolean zBooleanValue4 = ((Boolean) mutableState60.getValue()).booleanValue();
                                    PasswordVisualTransformation passwordVisualTransformation = new PasswordVisualTransformation((char) 0, 1, null);
                                    TextFieldColors textFieldColorsM4 = yc2.m(composer6);
                                    Object objRememberedValue31 = composer6.rememberedValue();
                                    int i15 = 13;
                                    if (objRememberedValue31 == companion7.getEmpty()) {
                                        mutableState50 = mutableState60;
                                        objRememberedValue31 = new ai(i15, mutableState50, mutableState61);
                                        composer6.updateRememberedValue(objRememberedValue31);
                                    } else {
                                        mutableState50 = mutableState60;
                                    }
                                    MutableState mutableState62 = mutableState50;
                                    yc2.d(str8, (Function1) objRememberedValue31, modifierFocusRequester4, zBooleanValue4, qt.d, null, null, passwordVisualTransformation, null, null, bodyMedium4, false, textFieldColorsM4, null, composer6, 24624, 6, 21344);
                                    Composer composer7 = composer6;
                                    composer7.endNode();
                                    MutableState mutableState63 = mutableState39;
                                    boolean zE = gr1.e(mutableState63);
                                    Object objRememberedValue32 = composer7.rememberedValue();
                                    if (objRememberedValue32 == companion7.getEmpty()) {
                                        objRememberedValue32 = new zq1(2, mutableState63);
                                        composer7.updateRememberedValue(objRememberedValue32);
                                    }
                                    gr1.a(zE, (Function0) objRememberedValue32, ((Boolean) mutableState62.getValue()).booleanValue(), composer7, 48);
                                    MutableState mutableState64 = mutableState40;
                                    String str9 = (String) mutableState64.getValue();
                                    if (str9 == null || StringsKt.isBlank(str9)) {
                                        composer7.startReplaceGroup(-1462112842);
                                        composer7.endReplaceGroup();
                                    } else {
                                        composer7.startReplaceGroup(-1462361586);
                                        String str10 = (String) mutableState64.getValue();
                                        TextKt.m3048TextNvy7gAk(str10 != null ? str10 : "", null, ColorKt.Color(4281236786L), null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, materialTheme3.getTypography(composer7, i11).getBodySmall(), composer7, RendererCapabilities.DECODER_SUPPORT_MASK, 0, 131066);
                                        composer7 = composer7;
                                        composer7.endReplaceGroup();
                                    }
                                    id.i(4.0f, companion4, composer7, 6);
                                    Modifier modifierFillMaxWidth$default3 = SizeKt.fillMaxWidth$default(companion4, 0.0f, 1, null);
                                    MeasurePolicy measurePolicyRowMeasurePolicy4 = RowKt.rowMeasurePolicy(arrangement.m713spacedByD5KLDUw(Dp.m7813constructorimpl(12.0f), companion5.getEnd()), companion5.getTop(), composer7, 6);
                                    long currentCompositeKeyHashCode7 = ComposablesKt.getCurrentCompositeKeyHashCode(composer7, 0);
                                    int i16 = (int) (currentCompositeKeyHashCode7 ^ (currentCompositeKeyHashCode7 >>> 32));
                                    CompositionLocalMap currentCompositionLocalMap7 = composer7.getCurrentCompositionLocalMap();
                                    Modifier modifierMaterializeModifier7 = ComposedModifierKt.materializeModifier(composer7, modifierFillMaxWidth$default3);
                                    Function0<ComposeUiNode> constructor7 = companion6.getConstructor();
                                    if (composer7.getApplier() == null) {
                                        ComposablesKt.invalidApplier();
                                    }
                                    composer7.startReusableNode();
                                    if (composer7.getInserting()) {
                                        composer7.createNode(constructor7);
                                    } else {
                                        composer7.useNode();
                                    }
                                    Composer composerM4318constructorimpl7 = Updater.m4318constructorimpl(composer7);
                                    mr.z(companion6, composerM4318constructorimpl7, measurePolicyRowMeasurePolicy4, composerM4318constructorimpl7, currentCompositionLocalMap7);
                                    Updater.m4326setimpl(composerM4318constructorimpl7, modifierMaterializeModifier7, (Function2<? super T, ? super Modifier, Unit>) id.h(companion6, composerM4318constructorimpl7, Integer.valueOf(i16), composerM4318constructorimpl7));
                                    ButtonColors buttonColorsI = hc2.i(jc2.c, false, composer7, 6, 2);
                                    ButtonScale buttonScaleL = hc2.l(1.05f);
                                    u61 u61Var3 = u61Var2;
                                    ButtonGlow buttonGlowA = el0.a(u61Var3);
                                    ButtonBorder buttonBorderH = hc2.h(composer7);
                                    Modifier modifierM1050height3ABfNKs = SizeKt.m1050height3ABfNKs(SizeKt.m1069width3ABfNKs(companion4, Dp.m7813constructorimpl(100.0f)), Dp.m7813constructorimpl(48.0f));
                                    Object objRememberedValue33 = composer7.rememberedValue();
                                    Object empty = companion7.getEmpty();
                                    MutableState mutableState65 = mutableState41;
                                    if (objRememberedValue33 == empty) {
                                        i6 = 13;
                                        objRememberedValue33 = new li1(13, mutableState65);
                                        composer7.updateRememberedValue(objRememberedValue33);
                                    } else {
                                        i6 = 13;
                                    }
                                    ButtonKt.m8231ButtonTCVpFMg(function2, FocusChangedModifierKt.onFocusChanged(modifierM1050height3ABfNKs, (Function1) objRememberedValue33), null, false, buttonScaleL, buttonGlowA, null, buttonColorsI, 0.0f, buttonBorderH, null, null, ComposableLambdaKt.rememberComposableLambda(-762738592, true, new w91(i6, mutableState65), composer7, 54), composer7, 0, RendererCapabilities.DECODER_SUPPORT_MASK, 3404);
                                    MutableState mutableState66 = mutableState42;
                                    boolean z = !((Boolean) mutableState66.getValue()).booleanValue();
                                    ButtonColors buttonColorsI2 = hc2.i(jc2.d, !((Boolean) mutableState66.getValue()).booleanValue(), composer7, 6, 0);
                                    ButtonScale buttonScaleL2 = hc2.l(1.05f);
                                    ButtonGlow buttonGlowA2 = el0.a(u61Var3);
                                    ButtonBorder buttonBorderH2 = hc2.h(composer7);
                                    Modifier modifierM1050height3ABfNKs2 = SizeKt.m1050height3ABfNKs(SizeKt.m1069width3ABfNKs(companion4, Dp.m7813constructorimpl(100.0f)), Dp.m7813constructorimpl(48.0f));
                                    Object objRememberedValue34 = composer7.rememberedValue();
                                    Object empty2 = companion7.getEmpty();
                                    MutableState mutableState67 = mutableState43;
                                    if (objRememberedValue34 == empty2) {
                                        objRememberedValue34 = new li1(14, mutableState67);
                                        composer7.updateRememberedValue(objRememberedValue34);
                                    }
                                    Modifier modifierOnFocusChanged = FocusChangedModifierKt.onFocusChanged(modifierM1050height3ABfNKs2, (Function1) objRememberedValue34);
                                    CoroutineScope coroutineScope3 = coroutineScope2;
                                    boolean zChangedInstance3 = composer7.changedInstance(coroutineScope3);
                                    Object objRememberedValue35 = composer7.rememberedValue();
                                    if (zChangedInstance3 || objRememberedValue35 == companion7.getEmpty()) {
                                        ha1 ha1Var = new ha1(coroutineScope3, mutableState66, mutableState57, mutableState62, mutableState54, mutableState55, mutableState59, mutableState61, mutableState63, mutableState44, mutableState45);
                                        mutableState51 = mutableState63;
                                        composer7.updateRememberedValue(ha1Var);
                                        objRememberedValue35 = ha1Var;
                                    } else {
                                        mutableState51 = mutableState63;
                                    }
                                    ButtonKt.m8231ButtonTCVpFMg((Function0) objRememberedValue35, modifierOnFocusChanged, null, z, buttonScaleL2, buttonGlowA2, null, buttonColorsI2, 0.0f, buttonBorderH2, null, null, ComposableLambdaKt.rememberComposableLambda(-204240311, true, new x1(2, mutableState66, mutableState67), composer7, 54), composer7, 0, RendererCapabilities.DECODER_SUPPORT_MASK, 3396);
                                    Modifier modifierFocusRequester5 = FocusRequesterModifierKt.focusRequester(SizeKt.m1050height3ABfNKs(SizeKt.m1069width3ABfNKs(companion4, Dp.m7813constructorimpl(100.0f)), Dp.m7813constructorimpl(48.0f)), focusRequester10);
                                    Object objRememberedValue36 = composer7.rememberedValue();
                                    Object empty3 = companion7.getEmpty();
                                    MutableState mutableState68 = mutableState46;
                                    if (objRememberedValue36 == empty3) {
                                        objRememberedValue36 = new li1(11, mutableState68);
                                        composer7.updateRememberedValue(objRememberedValue36);
                                    }
                                    Modifier modifierOnFocusChanged2 = FocusChangedModifierKt.onFocusChanged(modifierFocusRequester5, (Function1) objRememberedValue36);
                                    ButtonColors buttonColorsI3 = hc2.i(jc2.b, false, composer7, 6, 2);
                                    ButtonScale buttonScaleL3 = hc2.l(1.05f);
                                    ButtonGlow buttonGlowA3 = el0.a(u61Var3);
                                    ButtonBorder buttonBorderH3 = hc2.h(composer7);
                                    Function1 function4 = function3;
                                    boolean zChanged2 = composer7.changed(function4);
                                    Object objRememberedValue37 = composer7.rememberedValue();
                                    if (zChanged2 || objRememberedValue37 == companion7.getEmpty()) {
                                        objRememberedValue37 = new yq1(function4, mutableState57, mutableState62, mutableState54, mutableState55, mutableState59, mutableState61, mutableState51, 0);
                                        composer7.updateRememberedValue(objRememberedValue37);
                                    }
                                    ButtonKt.m8231ButtonTCVpFMg((Function0) objRememberedValue37, modifierOnFocusChanged2, null, false, buttonScaleL3, buttonGlowA3, null, buttonColorsI3, 0.0f, buttonBorderH3, null, null, ComposableLambdaKt.rememberComposableLambda(-1281341464, true, new w91(12, mutableState68), composer7, 54), composer7, 0, RendererCapabilities.DECODER_SUPPORT_MASK, 3404);
                                    if (i02.w(composer7)) {
                                        ComposerKt.traceEventEnd();
                                    }
                                } else {
                                    composer5.skipToGroupEnd();
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
            }, composerStartRestartGroup, 54), composer2, ((i2 >> 6) & 14) | 432, 0);
            if (!((Boolean) mutableState15.getValue()).booleanValue() || ((w81) mutableState16.getValue()) == null) {
                composer2.startReplaceGroup(-1891593802);
                composer2.endReplaceGroup();
            } else {
                composer2.startReplaceGroup(-1891724498);
                w81 w81Var = (w81) mutableState16.getValue();
                w81Var.getClass();
                Object objRememberedValue26 = composer2.rememberedValue();
                if (objRememberedValue26 == companion.getEmpty()) {
                    objRememberedValue26 = new zq1(1, mutableState15);
                    composer2.updateRememberedValue(objRememberedValue26);
                }
                b(w81Var, (Function0) objRememberedValue26, composer2, 48);
                composer2.endReplaceGroup();
            }
            Object objRememberedValue27 = composer2.rememberedValue();
            if (objRememberedValue27 == companion.getEmpty()) {
                objRememberedValue27 = new ji(focusRequester5, null, 16);
                composer2.updateRememberedValue(objRememberedValue27);
            }
            EffectsKt.LaunchedEffect(unit, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) objRememberedValue27, composer2, c);
            obj = obj;
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            obj = proxyConfigServerManager;
            composer2 = composerStartRestartGroup;
            composer2.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new l5((Object) proxyConfig, obj, function0, (Object) function1, i, 19));
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final boolean d(MutableState mutableState) {
        return ((Boolean) mutableState.getValue()).booleanValue();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final boolean e(MutableState mutableState) {
        return ((Boolean) mutableState.getValue()).booleanValue();
    }

    public static final void f(ProxyProtocol proxyProtocol, Function1 function1, boolean z, Composer composer, int i) {
        int i2;
        ProxyProtocol proxyProtocol2;
        Composer composer2;
        ProxyProtocol proxyProtocol3;
        Function1 function2;
        boolean z2;
        Function1 function3 = function1;
        boolean z3 = z;
        Composer composerStartRestartGroup = composer.startRestartGroup(-474144515);
        if ((i & 6) == 0) {
            i2 = (composerStartRestartGroup.changed(proxyProtocol.ordinal()) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= composerStartRestartGroup.changedInstance(function3) ? 32 : 16;
        }
        if ((i & RendererCapabilities.DECODER_SUPPORT_MASK) == 0) {
            i2 |= composerStartRestartGroup.changed(z3) ? 256 : 128;
        }
        if (composerStartRestartGroup.shouldExecute((i2 & Input.Keys.NUMPAD_3) != 146, i2 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-474144515, i2, -1, "com.dh.myembyapp.ui.components.ProxyProtocolSelector (ProxyConfigDialog.kt:743)");
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-175699322, 6, -1, "com.dh.myembyapp.ui.theme.MyEmbyTheme.<get-colors> (Theme.kt:122)");
            }
            u61 u61Var = (u61) composerStartRestartGroup.consume(n72.b);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            Modifier.Companion companion = Modifier.INSTANCE;
            Modifier modifierFillMaxWidth$default = SizeKt.fillMaxWidth$default(companion, 0.0f, 1, null);
            MeasurePolicy measurePolicyRowMeasurePolicy = RowKt.rowMeasurePolicy(Arrangement.INSTANCE.m712spacedBy0680j_4(Dp.m7813constructorimpl(12.0f)), Alignment.INSTANCE.getCenterVertically(), composerStartRestartGroup, 54);
            long currentCompositeKeyHashCode = ComposablesKt.getCurrentCompositeKeyHashCode(composerStartRestartGroup, 0);
            int i3 = (int) (currentCompositeKeyHashCode ^ (currentCompositeKeyHashCode >>> 32));
            CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifierFillMaxWidth$default);
            ComposeUiNode.Companion companion2 = ComposeUiNode.INSTANCE;
            Function0<ComposeUiNode> constructor = companion2.getConstructor();
            if (composerStartRestartGroup.getApplier() == null) {
                ComposablesKt.invalidApplier();
            }
            composerStartRestartGroup.startReusableNode();
            if (composerStartRestartGroup.getInserting()) {
                composerStartRestartGroup.createNode(constructor);
            } else {
                composerStartRestartGroup.useNode();
            }
            Composer composerM4318constructorimpl = Updater.m4318constructorimpl(composerStartRestartGroup);
            mr.z(companion2, composerM4318constructorimpl, measurePolicyRowMeasurePolicy, composerM4318constructorimpl, currentCompositionLocalMap);
            Updater.m4326setimpl(composerM4318constructorimpl, modifierMaterializeModifier, (Function2<? super T, ? super Modifier, Unit>) id.h(companion2, composerM4318constructorimpl, Integer.valueOf(i3), composerM4318constructorimpl));
            RowScopeInstance rowScopeInstance = RowScopeInstance.INSTANCE;
            MaterialTheme materialTheme = MaterialTheme.INSTANCE;
            int i4 = MaterialTheme.$stable;
            boolean z4 = false;
            TextKt.m3048TextNvy7gAk("代理协议", SizeKt.m1069width3ABfNKs(companion, Dp.m7813constructorimpl(80.0f)), Color.m5151copywmQWz5c$default(materialTheme.getColorScheme(composerStartRestartGroup, i4).getOnSurface(), 0.6f, 0.0f, 0.0f, 0.0f, 14, null), null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, materialTheme.getTypography(composerStartRestartGroup, i4).getBodySmall(), composerStartRestartGroup, 54, 0, 131064);
            Modifier modifierM1050height3ABfNKs = SizeKt.m1050height3ABfNKs(SizeKt.m1069width3ABfNKs(companion, Dp.m7813constructorimpl(120.0f)), Dp.m7813constructorimpl(48.0f));
            ButtonDefaults buttonDefaults = ButtonDefaults.INSTANCE;
            long surfaceVariant = materialTheme.getColorScheme(composerStartRestartGroup, i4).getSurfaceVariant();
            long j = u61Var.D;
            long onSurface = materialTheme.getColorScheme(composerStartRestartGroup, i4).getOnSurface();
            long onSurface2 = materialTheme.getColorScheme(composerStartRestartGroup, i4).getOnSurface();
            int i5 = ButtonDefaults.$stable;
            ButtonColors buttonColorsM8228colorsoq7We08 = buttonDefaults.m8228colorsoq7We08(surfaceVariant, onSurface, j, onSurface2, 0L, 0L, 0L, 0L, composerStartRestartGroup, i5 << 24, PsExtractor.VIDEO_STREAM_MASK);
            ButtonScale buttonScaleScale$default = ButtonDefaults.scale$default(buttonDefaults, 0.0f, 1.05f, 0.0f, 0.0f, 0.0f, 29, null);
            ButtonGlow buttonGlowA = el0.a(u61Var);
            ButtonBorder buttonBorderBorder = buttonDefaults.border(null, new Border(BorderStrokeKt.m301BorderStrokecXLIe8U(Dp.m7813constructorimpl(2.0f), u61Var.b), 0.0f, null, 6, null), null, null, null, composerStartRestartGroup, i5 << 15, 29);
            boolean z5 = ((i2 & 896) == 256) | ((i2 & 14) == 4);
            if ((i2 & Input.Keys.FORWARD_DEL) == 32) {
                z4 = true;
            }
            boolean z6 = z5 | z4;
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            if (z6 || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                proxyProtocol3 = proxyProtocol;
                function2 = function1;
                z2 = z;
                objRememberedValue = new a60(z2, proxyProtocol3, function2, 6);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            } else {
                proxyProtocol3 = proxyProtocol;
                function2 = function1;
                z2 = z;
            }
            composer2 = composerStartRestartGroup;
            function3 = function2;
            proxyProtocol2 = proxyProtocol3;
            z3 = z2;
            ButtonKt.m8231ButtonTCVpFMg((Function0) objRememberedValue, modifierM1050height3ABfNKs, null, z3, buttonScaleScale$default, buttonGlowA, null, buttonColorsM8228colorsoq7We08, 0.0f, buttonBorderBorder, null, null, ComposableLambdaKt.rememberComposableLambda(437040721, true, new rx(1, proxyProtocol3, z2), composerStartRestartGroup, 54), composer2, ((i2 << 3) & 7168) | 48, RendererCapabilities.DECODER_SUPPORT_MASK, 3396);
            composer2.endNode();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            proxyProtocol2 = proxyProtocol;
            composer2 = composerStartRestartGroup;
            composer2.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new kw0(proxyProtocol2, function3, z3, i));
        }
    }

    public static final void g(boolean z, Function0 function0, Composer composer, int i) {
        int i2;
        Composer composer2;
        Function0 function1 = function0;
        Composer composerStartRestartGroup = composer.startRestartGroup(1949160767);
        int i3 = 4;
        if ((i & 6) == 0) {
            i2 = i | (composerStartRestartGroup.changed(z) ? 4 : 2);
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= composerStartRestartGroup.changedInstance(function1) ? 32 : 16;
        }
        if (composerStartRestartGroup.shouldExecute((i2 & 19) != 18, i2 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1949160767, i2, -1, "com.dh.myembyapp.ui.components.ProxySwitch (ProxyConfigDialog.kt:679)");
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-175699322, 6, -1, "com.dh.myembyapp.ui.theme.MyEmbyTheme.<get-colors> (Theme.kt:122)");
            }
            u61 u61Var = (u61) composerStartRestartGroup.consume(n72.b);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            Modifier modifierFillMaxWidth$default = SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null);
            ClickableSurfaceDefaults clickableSurfaceDefaults = ClickableSurfaceDefaults.INSTANCE;
            long surfaceVariant = MaterialTheme.INSTANCE.getColorScheme(composerStartRestartGroup, MaterialTheme.$stable).getSurfaceVariant();
            long j = u61Var.D;
            int i4 = ClickableSurfaceDefaults.$stable;
            function1 = function0;
            SurfaceKt.m8520Surface05tvjtU(function1, modifierFillMaxWidth$default, null, false, 0.0f, null, clickableSurfaceDefaults.m8292colorsoq7We08(surfaceVariant, 0L, j, 0L, 0L, 0L, 0L, 0L, composerStartRestartGroup, i4 << 24, 250), ClickableSurfaceDefaults.scale$default(clickableSurfaceDefaults, 0.0f, 1.02f, 0.0f, 0.0f, 0.0f, 29, null), clickableSurfaceDefaults.border(null, new Border(BorderStrokeKt.m301BorderStrokecXLIe8U(Dp.m7813constructorimpl(2.0f), u61Var.b), 0.0f, null, 6, null), null, null, null, composerStartRestartGroup, i4 << 15, 29), el0.c(u61Var), null, ComposableLambdaKt.rememberComposableLambda(-2115543552, true, new g2(z, i3), composerStartRestartGroup, 54), composerStartRestartGroup, ((i2 >> 3) & 14) | 48, 48, 1084);
            composer2 = composerStartRestartGroup;
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composer2 = composerStartRestartGroup;
            composer2.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new pv(z, function1, i, 2));
        }
    }

    public static final void h(String str, e62 e62Var, Composer composer, int i) {
        int i2;
        Composer composer2;
        Composer composerStartRestartGroup = composer.startRestartGroup(2126837841);
        if ((i & 6) == 0) {
            i2 = i | (composerStartRestartGroup.changed(str) ? 4 : 2);
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= composerStartRestartGroup.changed(e62Var) ? 32 : 16;
        }
        if (composerStartRestartGroup.shouldExecute((i2 & 19) != 18, i2 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(2126837841, i2, -1, "com.dh.myembyapp.ui.components.TestResultItem (ProxyConfigDialog.kt:573)");
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-175699322, 6, -1, "com.dh.myembyapp.ui.theme.MyEmbyTheme.<get-colors> (Theme.kt:122)");
            }
            u61 u61Var = (u61) composerStartRestartGroup.consume(n72.b);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            Modifier modifierFillMaxWidth$default = SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null);
            MeasurePolicy measurePolicyRowMeasurePolicy = RowKt.rowMeasurePolicy(Arrangement.INSTANCE.getSpaceBetween(), Alignment.INSTANCE.getCenterVertically(), composerStartRestartGroup, 54);
            long currentCompositeKeyHashCode = ComposablesKt.getCurrentCompositeKeyHashCode(composerStartRestartGroup, 0);
            int i3 = (int) (currentCompositeKeyHashCode ^ (currentCompositeKeyHashCode >>> 32));
            CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifierFillMaxWidth$default);
            ComposeUiNode.Companion companion = ComposeUiNode.INSTANCE;
            Function0<ComposeUiNode> constructor = companion.getConstructor();
            if (composerStartRestartGroup.getApplier() == null) {
                ComposablesKt.invalidApplier();
            }
            composerStartRestartGroup.startReusableNode();
            if (composerStartRestartGroup.getInserting()) {
                composerStartRestartGroup.createNode(constructor);
            } else {
                composerStartRestartGroup.useNode();
            }
            Composer composerM4318constructorimpl = Updater.m4318constructorimpl(composerStartRestartGroup);
            mr.z(companion, composerM4318constructorimpl, measurePolicyRowMeasurePolicy, composerM4318constructorimpl, currentCompositionLocalMap);
            Updater.m4326setimpl(composerM4318constructorimpl, modifierMaterializeModifier, (Function2<? super T, ? super Modifier, Unit>) id.h(companion, composerM4318constructorimpl, Integer.valueOf(i3), composerM4318constructorimpl));
            RowScopeInstance rowScopeInstance = RowScopeInstance.INSTANCE;
            String strConcat = str.concat(":");
            MaterialTheme materialTheme = MaterialTheme.INSTANCE;
            int i4 = MaterialTheme.$stable;
            TextKt.m3048TextNvy7gAk(strConcat, null, materialTheme.getColorScheme(composerStartRestartGroup, i4).getOnSurface(), null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, materialTheme.getTypography(composerStartRestartGroup, i4).getBodyMedium(), composerStartRestartGroup, 0, 0, 131066);
            if (e62Var.a) {
                composerStartRestartGroup.startReplaceGroup(-1471879743);
                composer2 = composerStartRestartGroup;
                TextKt.m3048TextNvy7gAk("请求成功，耗时 " + e62Var.c + "ms", null, u61Var.P, null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, materialTheme.getTypography(composerStartRestartGroup, i4).getBodyMedium(), composer2, 0, 0, 131066);
                composer2.endReplaceGroup();
            } else {
                composerStartRestartGroup.startReplaceGroup(-1471671578);
                composer2 = composerStartRestartGroup;
                TextKt.m3048TextNvy7gAk(e62Var.d, null, materialTheme.getColorScheme(composerStartRestartGroup, i4).getError(), null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, materialTheme.getTypography(composerStartRestartGroup, i4).getBodyMedium(), composer2, 0, 0, 131066);
                composer2.endReplaceGroup();
            }
            composer2.endNode();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composer2 = composerStartRestartGroup;
            composer2.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new e81(str, e62Var, i, 12));
        }
    }
}
