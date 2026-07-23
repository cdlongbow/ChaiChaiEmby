package defpackage;

import android.content.Context;
import androidx.compose.foundation.BorderKt;
import androidx.compose.foundation.BorderStrokeKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScope;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnScopeInstance;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.RowKt;
import androidx.compose.foundation.layout.RowScopeInstance;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.SpacerKt;
import androidx.compose.foundation.shape.RoundedCornerShapeKt;
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
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.State;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.focus.FocusRequester;
import androidx.compose.ui.graphics.Brush;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.ColorKt;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.text.font.FontWeight;
import androidx.compose.ui.unit.Dp;
import androidx.compose.ui.unit.TextUnitKt;
import androidx.compose.ui.window.AndroidDialog_androidKt;
import androidx.compose.ui.window.DialogProperties;
import androidx.media3.exoplayer.RendererCapabilities;
import androidx.media3.extractor.ts.PsExtractor;

import com.dh.myembyapp.data.model.AppCardSizeLevel;
import com.dh.myembyapp.data.model.AppThemePreset;
import com.dh.myembyapp.data.model.DarkThemeGlowPosition;
import com.dh.myembyapp.data.model.DarkThemeStyle;
import com.dh.myembyapp.data.model.LightThemeBackgroundStyle;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: loaded from: classes4.dex */
public abstract class v72 {
    public static final void a(DarkThemeStyle darkThemeStyle, DarkThemeGlowPosition darkThemeGlowPosition, boolean z, Modifier modifier, Function0 function0, Composer composer, int i) {
        int i2;
        ClickableSurfaceBorder clickableSurfaceBorderBorder;
        Composer composerStartRestartGroup = composer.startRestartGroup(1599712797);
        if ((i & 6) == 0) {
            i2 = (composerStartRestartGroup.changed(darkThemeStyle.ordinal()) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= composerStartRestartGroup.changed(darkThemeGlowPosition.ordinal()) ? 32 : 16;
        }
        if ((i & RendererCapabilities.DECODER_SUPPORT_MASK) == 0) {
            i2 |= composerStartRestartGroup.changed(z) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= composerStartRestartGroup.changed(modifier) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i2 |= composerStartRestartGroup.changedInstance(function0) ? 16384 : 8192;
        }
        if (composerStartRestartGroup.shouldExecute((i2 & 9363) != 9362, i2 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1599712797, i2, -1, "com.dh.myembyapp.ui.components.DarkThemeOptionCard (ThemeSettingsDialog.kt:482)");
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-175699322, 6, -1, "com.dh.myembyapp.ui.theme.MyEmbyTheme.<get-colors> (Theme.kt:122)");
            }
            u61 u61Var = (u61) composerStartRestartGroup.consume(n72.b);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            gb gbVarC = l72.c(darkThemeStyle);
            Modifier modifierM1050height3ABfNKs = SizeKt.m1050height3ABfNKs(modifier, Dp.m7813constructorimpl(82.0f));
            ClickableSurfaceDefaults clickableSurfaceDefaults = ClickableSurfaceDefaults.INSTANCE;
            long j = z ? u61Var.E : u61Var.C;
            long j2 = z ? u61Var.F : u61Var.D;
            MaterialTheme materialTheme = MaterialTheme.INSTANCE;
            int i3 = MaterialTheme.$stable;
            long onSurface = materialTheme.getColorScheme(composerStartRestartGroup, i3).getOnSurface();
            long onSurface2 = materialTheme.getColorScheme(composerStartRestartGroup, i3).getOnSurface();
            int i4 = ClickableSurfaceDefaults.$stable;
            int i5 = i2;
            ClickableSurfaceColors clickableSurfaceColorsM8292colorsoq7We08 = clickableSurfaceDefaults.m8292colorsoq7We08(j, onSurface, j2, onSurface2, 0L, 0L, 0L, 0L, composerStartRestartGroup, i4 << 24, PsExtractor.VIDEO_STREAM_MASK);
            if (z) {
                composerStartRestartGroup.startReplaceGroup(87788693);
                clickableSurfaceBorderBorder = clickableSurfaceDefaults.border(new Border(BorderStrokeKt.m301BorderStrokecXLIe8U(Dp.m7813constructorimpl(1.0f), materialTheme.getColorScheme(composerStartRestartGroup, i3).getPrimary()), 0.0f, null, 6, null), new Border(BorderStrokeKt.m301BorderStrokecXLIe8U(Dp.m7813constructorimpl(2.0f), u61Var.b), 0.0f, null, 6, null), null, null, null, composerStartRestartGroup, i4 << 15, 28);
                composerStartRestartGroup.endReplaceGroup();
            } else {
                composerStartRestartGroup.startReplaceGroup(88123772);
                clickableSurfaceBorderBorder = clickableSurfaceDefaults.border(null, new Border(BorderStrokeKt.m301BorderStrokecXLIe8U(Dp.m7813constructorimpl(2.0f), u61Var.b), 0.0f, null, 6, null), null, null, null, composerStartRestartGroup, i4 << 15, 29);
                composerStartRestartGroup.endReplaceGroup();
            }
            SurfaceKt.m8520Surface05tvjtU(function0, modifierM1050height3ABfNKs, null, false, 0.0f, clickableSurfaceDefaults.shape(RoundedCornerShapeKt.m1312RoundedCornerShape0680j_4(Dp.m7813constructorimpl(12.0f)), null, null, null, null, composerStartRestartGroup, i4 << 15, 30), clickableSurfaceColorsM8292colorsoq7We08, ClickableSurfaceDefaults.scale$default(clickableSurfaceDefaults, 0.0f, 1.02f, 0.0f, 0.0f, 0.0f, 29, null), clickableSurfaceBorderBorder, el0.c(u61Var), null, ComposableLambdaKt.rememberComposableLambda(-411697186, true, new ph(darkThemeStyle, darkThemeGlowPosition, gbVarC, 8), composerStartRestartGroup, 54), composerStartRestartGroup, (i5 >> 12) & 14, 48, 1052);
            composerStartRestartGroup = composerStartRestartGroup;
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new el(darkThemeStyle, darkThemeGlowPosition, z, modifier, function0, i, 5));
        }
    }

    public static final void b(Modifier modifier, Composer composer, int i) {
        int i2;
        Composer composerStartRestartGroup = composer.startRestartGroup(1722816964);
        if ((i & 6) == 0) {
            i2 = (composerStartRestartGroup.changed(modifier) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if (composerStartRestartGroup.shouldExecute((i2 & 3) != 2, i2 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1722816964, i2, -1, "com.dh.myembyapp.ui.components.DarkThemePlaceholderCard (ThemeSettingsDialog.kt:557)");
            }
            Modifier modifierM1050height3ABfNKs = SizeKt.m1050height3ABfNKs(modifier, Dp.m7813constructorimpl(82.0f));
            float fM7813constructorimpl = Dp.m7813constructorimpl(1.0f);
            MaterialTheme materialTheme = MaterialTheme.INSTANCE;
            int i3 = MaterialTheme.$stable;
            Modifier modifierM999padding3ABfNKs = PaddingKt.m999padding3ABfNKs(kb0.v(12.0f, BorderKt.m286borderxT4_qwU(modifierM1050height3ABfNKs, fM7813constructorimpl, Color.m5151copywmQWz5c$default(materialTheme.getColorScheme(composerStartRestartGroup, i3).getOutlineVariant(), 0.35f, 0.0f, 0.0f, 0.0f, 14, null), RoundedCornerShapeKt.m1312RoundedCornerShape0680j_4(Dp.m7813constructorimpl(12.0f))), Color.m5151copywmQWz5c$default(materialTheme.getColorScheme(composerStartRestartGroup, i3).getSurfaceVariant(), 0.12f, 0.0f, 0.0f, 0.0f, 14, null)), Dp.m7813constructorimpl(5.0f));
            MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.INSTANCE.getTopStart(), false);
            long currentCompositeKeyHashCode = ComposablesKt.getCurrentCompositeKeyHashCode(composerStartRestartGroup, 0);
            int i4 = (int) (currentCompositeKeyHashCode ^ (currentCompositeKeyHashCode >>> 32));
            CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifierM999padding3ABfNKs);
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
            mr.z(companion, composerM4318constructorimpl, measurePolicyMaybeCachedBoxMeasurePolicy, composerM4318constructorimpl, currentCompositionLocalMap);
            Updater.m4326setimpl(composerM4318constructorimpl, modifierMaterializeModifier, (Function2<? super T, ? super Modifier, Unit>) id.h(companion, composerM4318constructorimpl, Integer.valueOf(i4), composerM4318constructorimpl));
            BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
            BoxKt.Box(kb0.v(12.0f, SizeKt.fillMaxSize$default(Modifier.INSTANCE, 0.0f, 1, null), Color.m5151copywmQWz5c$default(Color.INSTANCE.m5178getBlack0d7_KjU(), 0.1f, 0.0f, 0.0f, 0.0f, 14, null)), composerStartRestartGroup, 0);
            composerStartRestartGroup.endNode();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new jm(modifier, i, 1));
        }
    }

    public static final void c(LightThemeBackgroundStyle lightThemeBackgroundStyle, boolean z, Modifier modifier, Function0 function0, Composer composer, int i) {
        int i2;
        ClickableSurfaceBorder clickableSurfaceBorderBorder;
        Composer composerStartRestartGroup = composer.startRestartGroup(-42086541);
        if ((i & 6) == 0) {
            i2 = (composerStartRestartGroup.changed(lightThemeBackgroundStyle.ordinal()) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= composerStartRestartGroup.changed(z) ? 32 : 16;
        }
        if ((i & RendererCapabilities.DECODER_SUPPORT_MASK) == 0) {
            i2 |= composerStartRestartGroup.changed(modifier) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= composerStartRestartGroup.changedInstance(function0) ? 2048 : 1024;
        }
        if (composerStartRestartGroup.shouldExecute((i2 & 1171) != 1170, i2 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-42086541, i2, -1, "com.dh.myembyapp.ui.components.LightBackgroundOptionCard (ThemeSettingsDialog.kt:855)");
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-175699322, 6, -1, "com.dh.myembyapp.ui.theme.MyEmbyTheme.<get-colors> (Theme.kt:122)");
            }
            u61 u61Var = (u61) composerStartRestartGroup.consume(n72.b);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            gb gbVarD = l72.d(lightThemeBackgroundStyle);
            Brush brushB = l72.b(gbVarD);
            Modifier modifierM1050height3ABfNKs = SizeKt.m1050height3ABfNKs(modifier, Dp.m7813constructorimpl(82.0f));
            ClickableSurfaceDefaults clickableSurfaceDefaults = ClickableSurfaceDefaults.INSTANCE;
            long j = z ? u61Var.E : u61Var.C;
            long j2 = z ? u61Var.F : u61Var.D;
            MaterialTheme materialTheme = MaterialTheme.INSTANCE;
            int i3 = MaterialTheme.$stable;
            long onSurface = materialTheme.getColorScheme(composerStartRestartGroup, i3).getOnSurface();
            long onSurface2 = materialTheme.getColorScheme(composerStartRestartGroup, i3).getOnSurface();
            int i4 = ClickableSurfaceDefaults.$stable;
            int i5 = i2;
            ClickableSurfaceColors clickableSurfaceColorsM8292colorsoq7We08 = clickableSurfaceDefaults.m8292colorsoq7We08(j, onSurface, j2, onSurface2, 0L, 0L, 0L, 0L, composerStartRestartGroup, i4 << 24, PsExtractor.VIDEO_STREAM_MASK);
            if (z) {
                composerStartRestartGroup.startReplaceGroup(331300991);
                clickableSurfaceBorderBorder = clickableSurfaceDefaults.border(new Border(BorderStrokeKt.m301BorderStrokecXLIe8U(Dp.m7813constructorimpl(1.0f), materialTheme.getColorScheme(composerStartRestartGroup, i3).getPrimary()), 0.0f, null, 6, null), new Border(BorderStrokeKt.m301BorderStrokecXLIe8U(Dp.m7813constructorimpl(2.0f), u61Var.b), 0.0f, null, 6, null), null, null, null, composerStartRestartGroup, i4 << 15, 28);
                composerStartRestartGroup.endReplaceGroup();
            } else {
                composerStartRestartGroup.startReplaceGroup(331636070);
                clickableSurfaceBorderBorder = clickableSurfaceDefaults.border(null, new Border(BorderStrokeKt.m301BorderStrokecXLIe8U(Dp.m7813constructorimpl(2.0f), u61Var.b), 0.0f, null, 6, null), null, null, null, composerStartRestartGroup, i4 << 15, 29);
                composerStartRestartGroup.endReplaceGroup();
            }
            SurfaceKt.m8520Surface05tvjtU(function0, modifierM1050height3ABfNKs, null, false, 0.0f, clickableSurfaceDefaults.shape(RoundedCornerShapeKt.m1312RoundedCornerShape0680j_4(Dp.m7813constructorimpl(12.0f)), null, null, null, null, composerStartRestartGroup, i4 << 15, 30), clickableSurfaceColorsM8292colorsoq7We08, ClickableSurfaceDefaults.scale$default(clickableSurfaceDefaults, 0.0f, 1.02f, 0.0f, 0.0f, 0.0f, 29, null), clickableSurfaceBorderBorder, el0.c(u61Var), null, ComposableLambdaKt.rememberComposableLambda(24357138, true, new ph(gbVarD, brushB, lightThemeBackgroundStyle, 7), composerStartRestartGroup, 54), composerStartRestartGroup, (i5 >> 9) & 14, 48, 1052);
            composerStartRestartGroup = composerStartRestartGroup;
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new u7(lightThemeBackgroundStyle, z, modifier, function0, i, 9));
        }
    }

    public static final void d(int i, Modifier modifier, Function0 function0, Composer composer, int i2) {
        int i3;
        Function0 function1 = function0;
        Composer composerStartRestartGroup = composer.startRestartGroup(1913449102);
        if ((i2 & 6) == 0) {
            i3 = (composerStartRestartGroup.changed(i) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= composerStartRestartGroup.changed(modifier) ? 32 : 16;
        }
        if ((i2 & RendererCapabilities.DECODER_SUPPORT_MASK) == 0) {
            i3 |= composerStartRestartGroup.changedInstance(function1) ? 256 : 128;
        }
        if (composerStartRestartGroup.shouldExecute((i3 & Input.Keys.NUMPAD_3) != 146, i3 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1913449102, i3, -1, "com.dh.myembyapp.ui.components.ThemeCardSizeLevelOptionCard (ThemeSettingsDialog.kt:388)");
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-175699322, 6, -1, "com.dh.myembyapp.ui.theme.MyEmbyTheme.<get-colors> (Theme.kt:122)");
            }
            u61 u61Var = (u61) composerStartRestartGroup.consume(n72.b);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            final int iNormalize = AppCardSizeLevel.INSTANCE.normalize(i);
            Modifier modifierM1050height3ABfNKs = SizeKt.m1050height3ABfNKs(modifier, Dp.m7813constructorimpl(58.0f));
            ClickableSurfaceDefaults clickableSurfaceDefaults = ClickableSurfaceDefaults.INSTANCE;
            long j = u61Var.C;
            long j2 = u61Var.D;
            MaterialTheme materialTheme = MaterialTheme.INSTANCE;
            int i4 = MaterialTheme.$stable;
            long onSurface = materialTheme.getColorScheme(composerStartRestartGroup, i4).getOnSurface();
            long onSurface2 = materialTheme.getColorScheme(composerStartRestartGroup, i4).getOnSurface();
            int i5 = ClickableSurfaceDefaults.$stable;
            ClickableSurfaceColors clickableSurfaceColorsM8292colorsoq7We08 = clickableSurfaceDefaults.m8292colorsoq7We08(j, onSurface, j2, onSurface2, 0L, 0L, 0L, 0L, composerStartRestartGroup, i5 << 24, PsExtractor.VIDEO_STREAM_MASK);
            int i6 = i5 << 15;
            function1 = function0;
            SurfaceKt.m8520Surface05tvjtU(function1, modifierM1050height3ABfNKs, null, false, 0.0f, clickableSurfaceDefaults.shape(RoundedCornerShapeKt.m1312RoundedCornerShape0680j_4(Dp.m7813constructorimpl(12.0f)), null, null, null, null, composerStartRestartGroup, i6, 30), clickableSurfaceColorsM8292colorsoq7We08, ClickableSurfaceDefaults.scale$default(clickableSurfaceDefaults, 0.0f, 1.02f, 0.0f, 0.0f, 0.0f, 29, null), clickableSurfaceDefaults.border(null, new Border(BorderStrokeKt.m301BorderStrokecXLIe8U(Dp.m7813constructorimpl(2.0f), u61Var.b), 0.0f, null, 6, null), null, null, null, composerStartRestartGroup, i6, 29), el0.c(u61Var), null, ComposableLambdaKt.rememberComposableLambda(1981317199, true, new Function3() { // from class: t72
                @Override // kotlin.jvm.functions.Function3
                public final Object invoke(Object obj, Object obj2, Object obj3) {
                    int i7;
                    long jM5151copywmQWz5c$default;
                    Composer composer2 = (Composer) obj2;
                    int iIntValue = ((Integer) obj3).intValue();
                    ((BoxScope) obj).getClass();
                    if (composer2.shouldExecute((iIntValue & 17) != 16, iIntValue & 1)) {
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(1981317199, iIntValue, -1, "com.dh.myembyapp.ui.components.ThemeCardSizeLevelOptionCard.<anonymous> (ThemeSettingsDialog.kt:409)");
                        }
                        Modifier.Companion companion = Modifier.INSTANCE;
                        Modifier modifierM1000paddingVpY3zN4 = PaddingKt.m1000paddingVpY3zN4(SizeKt.fillMaxSize$default(companion, 0.0f, 1, null), Dp.m7813constructorimpl(10.0f), Dp.m7813constructorimpl(8.0f));
                        Alignment.Companion companion2 = Alignment.INSTANCE;
                        Alignment.Vertical centerVertically = companion2.getCenterVertically();
                        Arrangement arrangement = Arrangement.INSTANCE;
                        MeasurePolicy measurePolicyRowMeasurePolicy = RowKt.rowMeasurePolicy(arrangement.getSpaceBetween(), centerVertically, composer2, 54);
                        long currentCompositeKeyHashCode = ComposablesKt.getCurrentCompositeKeyHashCode(composer2, 0);
                        int i8 = (int) (currentCompositeKeyHashCode ^ (currentCompositeKeyHashCode >>> 32));
                        CompositionLocalMap currentCompositionLocalMap = composer2.getCurrentCompositionLocalMap();
                        Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(composer2, modifierM1000paddingVpY3zN4);
                        ComposeUiNode.Companion companion3 = ComposeUiNode.INSTANCE;
                        Function0<ComposeUiNode> constructor = companion3.getConstructor();
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
                        mr.z(companion3, composerM4318constructorimpl, measurePolicyRowMeasurePolicy, composerM4318constructorimpl, currentCompositionLocalMap);
                        Updater.m4326setimpl(composerM4318constructorimpl, modifierMaterializeModifier, (Function2<? super T, ? super Modifier, Unit>) id.h(companion3, composerM4318constructorimpl, Integer.valueOf(i8), composerM4318constructorimpl));
                        Modifier modifierE = zs1.E(RowScopeInstance.INSTANCE, companion, 1.0f, false, 2, null);
                        MeasurePolicy measurePolicyColumnMeasurePolicy = ColumnKt.columnMeasurePolicy(arrangement.m712spacedBy0680j_4(Dp.m7813constructorimpl(2.0f)), companion2.getStart(), composer2, 6);
                        long currentCompositeKeyHashCode2 = ComposablesKt.getCurrentCompositeKeyHashCode(composer2, 0);
                        int i9 = (int) (currentCompositeKeyHashCode2 ^ (currentCompositeKeyHashCode2 >>> 32));
                        CompositionLocalMap currentCompositionLocalMap2 = composer2.getCurrentCompositionLocalMap();
                        Modifier modifierMaterializeModifier2 = ComposedModifierKt.materializeModifier(composer2, modifierE);
                        Function0<ComposeUiNode> constructor2 = companion3.getConstructor();
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
                        mr.z(companion3, composerM4318constructorimpl2, measurePolicyColumnMeasurePolicy, composerM4318constructorimpl2, currentCompositionLocalMap2);
                        Updater.m4326setimpl(composerM4318constructorimpl2, modifierMaterializeModifier2, (Function2<? super T, ? super Modifier, Unit>) id.h(companion3, composerM4318constructorimpl2, Integer.valueOf(i9), composerM4318constructorimpl2));
                        ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.INSTANCE;
                        MaterialTheme materialTheme2 = MaterialTheme.INSTANCE;
                        int i10 = MaterialTheme.$stable;
                        TextKt.m3048TextNvy7gAk("卡片大小等级", null, materialTheme2.getColorScheme(composer2, i10).getOnSurface(), null, 0L, null, FontWeight.INSTANCE.getSemiBold(), null, 0L, null, null, 0L, 0, false, 1, 0, null, materialTheme2.getTypography(composer2, i10).getLabelLarge(), composer2, 1572870, 24576, 114618);
                        TextKt.m3048TextNvy7gAk("媒体卡片尺寸", null, Color.m5151copywmQWz5c$default(materialTheme2.getColorScheme(composer2, i10).getOnSurface(), 0.64f, 0.0f, 0.0f, 0.0f, 14, null), null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, materialTheme2.getTypography(composer2, i10).getLabelSmall(), composer2, 6, 0, 131066);
                        composer2.endNode();
                        SpacerKt.Spacer(SizeKt.m1069width3ABfNKs(companion, Dp.m7813constructorimpl(10.0f)), composer2, 6);
                        MeasurePolicy measurePolicyQ = mr.q(8.0f, arrangement, companion2.getCenterVertically(), composer2, 54);
                        long currentCompositeKeyHashCode3 = ComposablesKt.getCurrentCompositeKeyHashCode(composer2, 0);
                        int i11 = (int) (currentCompositeKeyHashCode3 ^ (currentCompositeKeyHashCode3 >>> 32));
                        CompositionLocalMap currentCompositionLocalMap3 = composer2.getCurrentCompositionLocalMap();
                        Modifier modifierMaterializeModifier3 = ComposedModifierKt.materializeModifier(composer2, companion);
                        Function0<ComposeUiNode> constructor3 = companion3.getConstructor();
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
                        mr.z(companion3, composerM4318constructorimpl3, measurePolicyQ, composerM4318constructorimpl3, currentCompositionLocalMap3);
                        Updater.m4326setimpl(composerM4318constructorimpl3, modifierMaterializeModifier3, (Function2<? super T, ? super Modifier, Unit>) id.h(companion3, composerM4318constructorimpl3, Integer.valueOf(i11), composerM4318constructorimpl3));
                        MeasurePolicy measurePolicyRowMeasurePolicy2 = RowKt.rowMeasurePolicy(arrangement.m712spacedBy0680j_4(Dp.m7813constructorimpl(3.0f)), companion2.getBottom(), composer2, 54);
                        long currentCompositeKeyHashCode4 = ComposablesKt.getCurrentCompositeKeyHashCode(composer2, 0);
                        int i12 = (int) (currentCompositeKeyHashCode4 ^ (currentCompositeKeyHashCode4 >>> 32));
                        CompositionLocalMap currentCompositionLocalMap4 = composer2.getCurrentCompositionLocalMap();
                        Modifier modifierMaterializeModifier4 = ComposedModifierKt.materializeModifier(composer2, companion);
                        Function0<ComposeUiNode> constructor4 = companion3.getConstructor();
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
                        mr.z(companion3, composerM4318constructorimpl4, measurePolicyRowMeasurePolicy2, composerM4318constructorimpl4, currentCompositionLocalMap4);
                        Updater.m4326setimpl(composerM4318constructorimpl4, modifierMaterializeModifier4, (Function2<? super T, ? super Modifier, Unit>) id.h(companion3, composerM4318constructorimpl4, Integer.valueOf(i12), composerM4318constructorimpl4));
                        composer2.startReplaceGroup(-1729826623);
                        int i13 = 0;
                        while (true) {
                            i7 = iNormalize;
                            if (i13 >= 12) {
                                break;
                            }
                            boolean z = i13 < i7;
                            Modifier modifierM1050height3ABfNKs2 = SizeKt.m1050height3ABfNKs(SizeKt.m1069width3ABfNKs(Modifier.INSTANCE, Dp.m7813constructorimpl(4.0f)), z ? Dp.m7813constructorimpl(18.0f) : Dp.m7813constructorimpl(10.0f));
                            if (z) {
                                composer2.startReplaceGroup(607003454);
                                jM5151copywmQWz5c$default = MaterialTheme.INSTANCE.getColorScheme(composer2, MaterialTheme.$stable).getPrimary();
                                composer2.endReplaceGroup();
                            } else {
                                composer2.startReplaceGroup(607122122);
                                jM5151copywmQWz5c$default = Color.m5151copywmQWz5c$default(MaterialTheme.INSTANCE.getColorScheme(composer2, MaterialTheme.$stable).getOutline(), 0.35f, 0.0f, 0.0f, 0.0f, 14, null);
                                composer2.endReplaceGroup();
                            }
                            BoxKt.Box(kb0.v(2.0f, modifierM1050height3ABfNKs2, jM5151copywmQWz5c$default), composer2, 0);
                            i13++;
                        }
                        composer2.endReplaceGroup();
                        composer2.endNode();
                        String str = i7 + " 级";
                        MaterialTheme materialTheme3 = MaterialTheme.INSTANCE;
                        int i14 = MaterialTheme.$stable;
                        TextKt.m3048TextNvy7gAk(str, null, materialTheme3.getColorScheme(composer2, i14).getPrimary(), null, 0L, null, FontWeight.INSTANCE.getBold(), null, 0L, null, null, 0L, 0, false, 1, 0, null, materialTheme3.getTypography(composer2, i14).getLabelLarge(), composer2, 1572864, 24576, 114618);
                        if (x2.m(composer2)) {
                            ComposerKt.traceEventEnd();
                        }
                    } else {
                        composer2.skipToGroupEnd();
                    }
                    return Unit.INSTANCE;
                }
            }, composerStartRestartGroup, 54), composerStartRestartGroup, (i3 >> 6) & 14, 48, 1052);
            composerStartRestartGroup = composerStartRestartGroup;
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new jh(i, modifier, function1, i2));
        }
    }

    public static final void e(final AppThemePreset appThemePreset, final boolean z, Modifier modifier, Function0 function0, Composer composer, int i) {
        int i2;
        long jColor;
        long jColor2;
        ClickableSurfaceBorder clickableSurfaceBorderBorder;
        Composer composerStartRestartGroup = composer.startRestartGroup(-937767919);
        if ((i & 6) == 0) {
            i2 = (composerStartRestartGroup.changed(appThemePreset.ordinal()) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= composerStartRestartGroup.changed(z) ? 32 : 16;
        }
        if ((i & RendererCapabilities.DECODER_SUPPORT_MASK) == 0) {
            i2 |= composerStartRestartGroup.changed(modifier) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= composerStartRestartGroup.changedInstance(function0) ? 2048 : 1024;
        }
        if (composerStartRestartGroup.shouldExecute((i2 & 1171) != 1170, i2 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-937767919, i2, -1, "com.dh.myembyapp.ui.components.ThemeOptionRow (ThemeSettingsDialog.kt:730)");
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-175699322, 6, -1, "com.dh.myembyapp.ui.theme.MyEmbyTheme.<get-colors> (Theme.kt:122)");
            }
            u61 u61Var = (u61) composerStartRestartGroup.consume(n72.b);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            int[] iArr = u72.$EnumSwitchMapping$0;
            int i3 = iArr[appThemePreset.ordinal()];
            if (i3 == 1) {
                jColor = ColorKt.Color(4279638043L);
            } else {
                if (i3 != 2) {
                    qu.f();
                    return;
                }
                jColor = ColorKt.Color(4294507260L);
            }
            final long j = jColor;
            int i4 = iArr[appThemePreset.ordinal()];
            if (i4 == 1) {
                jColor2 = ColorKt.Color(4294375674L);
            } else {
                if (i4 != 2) {
                    qu.f();
                    return;
                }
                jColor2 = ColorKt.Color(4279374871L);
            }
            final long j2 = jColor2;
            ClickableSurfaceDefaults clickableSurfaceDefaults = ClickableSurfaceDefaults.INSTANCE;
            long j3 = z ? u61Var.E : u61Var.C;
            long j4 = z ? u61Var.F : u61Var.D;
            MaterialTheme materialTheme = MaterialTheme.INSTANCE;
            int i5 = MaterialTheme.$stable;
            long onSurface = materialTheme.getColorScheme(composerStartRestartGroup, i5).getOnSurface();
            long onSurface2 = materialTheme.getColorScheme(composerStartRestartGroup, i5).getOnSurface();
            int i6 = ClickableSurfaceDefaults.$stable;
            ClickableSurfaceColors clickableSurfaceColorsM8292colorsoq7We08 = clickableSurfaceDefaults.m8292colorsoq7We08(j3, onSurface, j4, onSurface2, 0L, 0L, 0L, 0L, composerStartRestartGroup, i6 << 24, PsExtractor.VIDEO_STREAM_MASK);
            if (z) {
                composerStartRestartGroup.startReplaceGroup(1719336769);
                clickableSurfaceBorderBorder = clickableSurfaceDefaults.border(new Border(BorderStrokeKt.m301BorderStrokecXLIe8U(Dp.m7813constructorimpl(1.0f), materialTheme.getColorScheme(composerStartRestartGroup, i5).getPrimary()), 0.0f, null, 6, null), new Border(BorderStrokeKt.m301BorderStrokecXLIe8U(Dp.m7813constructorimpl(2.0f), u61Var.b), 0.0f, null, 6, null), null, null, null, composerStartRestartGroup, i6 << 15, 28);
                composerStartRestartGroup.endReplaceGroup();
            } else {
                composerStartRestartGroup.startReplaceGroup(1719671848);
                clickableSurfaceBorderBorder = clickableSurfaceDefaults.border(null, new Border(BorderStrokeKt.m301BorderStrokecXLIe8U(Dp.m7813constructorimpl(2.0f), u61Var.b), 0.0f, null, 6, null), null, null, null, composerStartRestartGroup, i6 << 15, 29);
                composerStartRestartGroup.endReplaceGroup();
            }
            ClickableSurfaceBorder clickableSurfaceBorder = clickableSurfaceBorderBorder;
            ClickableSurfaceScale clickableSurfaceScaleScale$default = ClickableSurfaceDefaults.scale$default(clickableSurfaceDefaults, 0.0f, 1.02f, 0.0f, 0.0f, 0.0f, 29, null);
            ClickableSurfaceGlow clickableSurfaceGlowC = el0.c(u61Var);
            ClickableSurfaceShape clickableSurfaceShapeShape = clickableSurfaceDefaults.shape(RoundedCornerShapeKt.m1312RoundedCornerShape0680j_4(Dp.m7813constructorimpl(12.0f)), null, null, null, null, composerStartRestartGroup, i6 << 15, 30);
            int i7 = i2;
            SurfaceKt.m8520Surface05tvjtU(function0, modifier, null, false, 0.0f, clickableSurfaceShapeShape, clickableSurfaceColorsM8292colorsoq7We08, clickableSurfaceScaleScale$default, clickableSurfaceBorder, clickableSurfaceGlowC, null, ComposableLambdaKt.rememberComposableLambda(509322992, true, new Function3() { // from class: r72
                @Override // kotlin.jvm.functions.Function3
                public final Object invoke(Object obj, Object obj2, Object obj3) {
                    long jM5151copywmQWz5c$default;
                    Composer composer2 = (Composer) obj2;
                    int iIntValue = ((Integer) obj3).intValue();
                    ((BoxScope) obj).getClass();
                    if (composer2.shouldExecute((iIntValue & 17) != 16, iIntValue & 1)) {
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(509322992, iIntValue, -1, "com.dh.myembyapp.ui.components.ThemeOptionRow.<anonymous> (ThemeSettingsDialog.kt:778)");
                        }
                        Modifier.Companion companion = Modifier.INSTANCE;
                        Modifier modifierM1000paddingVpY3zN4 = PaddingKt.m1000paddingVpY3zN4(SizeKt.fillMaxWidth$default(companion, 0.0f, 1, null), Dp.m7813constructorimpl(12.0f), Dp.m7813constructorimpl(10.0f));
                        Arrangement arrangement = Arrangement.INSTANCE;
                        Arrangement.HorizontalOrVertical horizontalOrVerticalM712spacedBy0680j_4 = arrangement.m712spacedBy0680j_4(Dp.m7813constructorimpl(12.0f));
                        Alignment.Companion companion2 = Alignment.INSTANCE;
                        MeasurePolicy measurePolicyRowMeasurePolicy = RowKt.rowMeasurePolicy(horizontalOrVerticalM712spacedBy0680j_4, companion2.getCenterVertically(), composer2, 54);
                        long currentCompositeKeyHashCode = ComposablesKt.getCurrentCompositeKeyHashCode(composer2, 0);
                        int i8 = (int) (currentCompositeKeyHashCode ^ (currentCompositeKeyHashCode >>> 32));
                        CompositionLocalMap currentCompositionLocalMap = composer2.getCurrentCompositionLocalMap();
                        Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(composer2, modifierM1000paddingVpY3zN4);
                        ComposeUiNode.Companion companion3 = ComposeUiNode.INSTANCE;
                        Function0<ComposeUiNode> constructor = companion3.getConstructor();
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
                        mr.z(companion3, composerM4318constructorimpl, measurePolicyRowMeasurePolicy, composerM4318constructorimpl, currentCompositionLocalMap);
                        Updater.m4326setimpl(composerM4318constructorimpl, modifierMaterializeModifier, (Function2<? super T, ? super Modifier, Unit>) id.h(companion3, composerM4318constructorimpl, Integer.valueOf(i8), composerM4318constructorimpl));
                        RowScopeInstance rowScopeInstance = RowScopeInstance.INSTANCE;
                        Modifier modifierM999padding3ABfNKs = PaddingKt.m999padding3ABfNKs(kb0.v(10.0f, SizeKt.m1066sizeVpY3zN4(companion, Dp.m7813constructorimpl(68.0f), Dp.m7813constructorimpl(42.0f)), j), Dp.m7813constructorimpl(5.0f));
                        MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(companion2.getTopStart(), false);
                        long currentCompositeKeyHashCode2 = ComposablesKt.getCurrentCompositeKeyHashCode(composer2, 0);
                        int i9 = (int) (currentCompositeKeyHashCode2 ^ (currentCompositeKeyHashCode2 >>> 32));
                        CompositionLocalMap currentCompositionLocalMap2 = composer2.getCurrentCompositionLocalMap();
                        Modifier modifierMaterializeModifier2 = ComposedModifierKt.materializeModifier(composer2, modifierM999padding3ABfNKs);
                        Function0<ComposeUiNode> constructor2 = companion3.getConstructor();
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
                        mr.z(companion3, composerM4318constructorimpl2, measurePolicyMaybeCachedBoxMeasurePolicy, composerM4318constructorimpl2, currentCompositionLocalMap2);
                        Updater.m4326setimpl(composerM4318constructorimpl2, modifierMaterializeModifier2, (Function2<? super T, ? super Modifier, Unit>) id.h(companion3, composerM4318constructorimpl2, Integer.valueOf(i9), composerM4318constructorimpl2));
                        BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
                        Modifier modifierFillMaxSize$default = SizeKt.fillMaxSize$default(companion, 0.0f, 1, null);
                        MeasurePolicy measurePolicyColumnMeasurePolicy = ColumnKt.columnMeasurePolicy(arrangement.getSpaceBetween(), companion2.getStart(), composer2, 6);
                        long currentCompositeKeyHashCode3 = ComposablesKt.getCurrentCompositeKeyHashCode(composer2, 0);
                        int i10 = (int) (currentCompositeKeyHashCode3 ^ (currentCompositeKeyHashCode3 >>> 32));
                        CompositionLocalMap currentCompositionLocalMap3 = composer2.getCurrentCompositionLocalMap();
                        Modifier modifierMaterializeModifier3 = ComposedModifierKt.materializeModifier(composer2, modifierFillMaxSize$default);
                        Function0<ComposeUiNode> constructor3 = companion3.getConstructor();
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
                        mr.z(companion3, composerM4318constructorimpl3, measurePolicyColumnMeasurePolicy, composerM4318constructorimpl3, currentCompositionLocalMap3);
                        Updater.m4326setimpl(composerM4318constructorimpl3, modifierMaterializeModifier3, (Function2<? super T, ? super Modifier, Unit>) id.h(companion3, composerM4318constructorimpl3, Integer.valueOf(i10), composerM4318constructorimpl3));
                        ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.INSTANCE;
                        Modifier modifierM1050height3ABfNKs = SizeKt.m1050height3ABfNKs(SizeKt.fillMaxWidth$default(companion, 0.0f, 1, null), Dp.m7813constructorimpl(8.0f));
                        AppThemePreset appThemePreset2 = AppThemePreset.DARK;
                        AppThemePreset appThemePreset3 = appThemePreset;
                        BoxKt.Box(kb0.v(4.0f, modifierM1050height3ABfNKs, appThemePreset3 == appThemePreset2 ? ColorKt.Color(4281020986L) : ColorKt.Color(4293389811L)), composer2, 0);
                        MaterialTheme materialTheme2 = MaterialTheme.INSTANCE;
                        int i11 = MaterialTheme.$stable;
                        TextStyle labelMedium = materialTheme2.getTypography(composer2, i11).getLabelMedium();
                        FontWeight.Companion companion4 = FontWeight.INSTANCE;
                        TextKt.m3048TextNvy7gAk("Aa", null, j2, null, 0L, null, companion4.getSemiBold(), null, 0L, null, null, 0L, 0, false, 0, 0, null, labelMedium, composer2, 1572870, 0, 131002);
                        composer2.endNode();
                        composer2.endNode();
                        Modifier modifierE = zs1.E(rowScopeInstance, companion, 1.0f, false, 2, null);
                        MeasurePolicy measurePolicyColumnMeasurePolicy2 = ColumnKt.columnMeasurePolicy(arrangement.m712spacedBy0680j_4(Dp.m7813constructorimpl(3.0f)), companion2.getStart(), composer2, 6);
                        long currentCompositeKeyHashCode4 = ComposablesKt.getCurrentCompositeKeyHashCode(composer2, 0);
                        int i12 = (int) (currentCompositeKeyHashCode4 ^ (currentCompositeKeyHashCode4 >>> 32));
                        CompositionLocalMap currentCompositionLocalMap4 = composer2.getCurrentCompositionLocalMap();
                        Modifier modifierMaterializeModifier4 = ComposedModifierKt.materializeModifier(composer2, modifierE);
                        Function0<ComposeUiNode> constructor4 = companion3.getConstructor();
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
                        mr.z(companion3, composerM4318constructorimpl4, measurePolicyColumnMeasurePolicy2, composerM4318constructorimpl4, currentCompositionLocalMap4);
                        Updater.m4326setimpl(composerM4318constructorimpl4, modifierMaterializeModifier4, (Function2<? super T, ? super Modifier, Unit>) id.h(companion3, composerM4318constructorimpl4, Integer.valueOf(i12), composerM4318constructorimpl4));
                        TextKt.m3048TextNvy7gAk(appThemePreset3.getDisplayName(), null, materialTheme2.getColorScheme(composer2, i11).getOnSurface(), null, 0L, null, companion4.getSemiBold(), null, 0L, null, null, 0L, 0, false, 0, 0, null, materialTheme2.getTypography(composer2, i11).getBodySmall(), composer2, 1572864, 0, 131002);
                        TextKt.m3048TextNvy7gAk(appThemePreset3.getDescription(), null, Color.m5151copywmQWz5c$default(materialTheme2.getColorScheme(composer2, i11).getOnSurface(), 0.72f, 0.0f, 0.0f, 0.0f, 14, null), null, 0L, null, null, null, 0L, null, null, TextUnitKt.getSp(16), 0, false, 0, 0, null, materialTheme2.getTypography(composer2, i11).getLabelSmall(), composer2, 0, 48, 129018);
                        composer2.endNode();
                        boolean z2 = z;
                        String str = z2 ? "已选中" : "可切换";
                        TextStyle labelSmall = materialTheme2.getTypography(composer2, i11).getLabelSmall();
                        if (z2) {
                            composer2.startReplaceGroup(-77631227);
                            jM5151copywmQWz5c$default = materialTheme2.getColorScheme(composer2, i11).getPrimary();
                            composer2.endReplaceGroup();
                        } else {
                            composer2.startReplaceGroup(-77552177);
                            jM5151copywmQWz5c$default = Color.m5151copywmQWz5c$default(materialTheme2.getColorScheme(composer2, i11).getOnSurface(), 0.55f, 0.0f, 0.0f, 0.0f, 14, null);
                            composer2.endReplaceGroup();
                        }
                        TextKt.m3048TextNvy7gAk(str, null, jM5151copywmQWz5c$default, null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, labelSmall, composer2, 0, 0, 131066);
                        composer2.endNode();
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                    } else {
                        composer2.skipToGroupEnd();
                    }
                    return Unit.INSTANCE;
                }
            }, composerStartRestartGroup, 54), composerStartRestartGroup, ((i7 >> 9) & 14) | ((i7 >> 3) & Input.Keys.FORWARD_DEL), 48, 1052);
            composerStartRestartGroup = composerStartRestartGroup;
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new u7(appThemePreset, z, modifier, function0, i, 8));
        }
    }

    public static final void f(Function0 function0, Composer composer, int i) {
        int i2;
        Composer composer2;
        Function0 function1 = function0;
        function1.getClass();
        Composer composerStartRestartGroup = composer.startRestartGroup(1434442329);
        if ((i & 6) == 0) {
            i2 = (composerStartRestartGroup.changedInstance(function1) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if (composerStartRestartGroup.shouldExecute((i2 & 3) != 2, i2 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1434442329, i2, -1, "com.dh.myembyapp.ui.components.ThemeSettingsDialog (ThemeSettingsDialog.kt:80)");
            }
            Context context = (Context) composerStartRestartGroup.consume(AndroidCompositionLocals_androidKt.getLocalContext());
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            Composer.Companion companion = Composer.INSTANCE;
            if (objRememberedValue == companion.getEmpty()) {
                objRememberedValue = new q72(context);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            q72 q72Var = (q72) objRememberedValue;
            State stateCollectAsState = SnapshotStateKt.collectAsState(q72Var.b, new bc(0), null, composerStartRestartGroup, 0, 2);
            boolean zChanged = composerStartRestartGroup.changed(((bc) stateCollectAsState.getValue()).getPreset().ordinal());
            Object objRememberedValue2 = composerStartRestartGroup.rememberedValue();
            if (zChanged || objRememberedValue2 == companion.getEmpty()) {
                objRememberedValue2 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(((bc) stateCollectAsState.getValue()).getPreset(), null, 2, null);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
            }
            MutableState mutableState = (MutableState) objRememberedValue2;
            boolean zChanged2 = composerStartRestartGroup.changed(((bc) stateCollectAsState.getValue()).getLightBackgroundStyle().ordinal());
            Object objRememberedValue3 = composerStartRestartGroup.rememberedValue();
            if (zChanged2 || objRememberedValue3 == companion.getEmpty()) {
                objRememberedValue3 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(((bc) stateCollectAsState.getValue()).getLightBackgroundStyle(), null, 2, null);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
            }
            MutableState mutableState2 = (MutableState) objRememberedValue3;
            boolean zChanged3 = composerStartRestartGroup.changed(((bc) stateCollectAsState.getValue()).getDarkThemeStyle().ordinal());
            Object objRememberedValue4 = composerStartRestartGroup.rememberedValue();
            if (zChanged3 || objRememberedValue4 == companion.getEmpty()) {
                objRememberedValue4 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(((bc) stateCollectAsState.getValue()).getDarkThemeStyle(), null, 2, null);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue4);
            }
            MutableState mutableState3 = (MutableState) objRememberedValue4;
            boolean zChanged4 = composerStartRestartGroup.changed(((bc) stateCollectAsState.getValue()).getDarkThemeGlowPosition().ordinal());
            Object objRememberedValue5 = composerStartRestartGroup.rememberedValue();
            if (zChanged4 || objRememberedValue5 == companion.getEmpty()) {
                objRememberedValue5 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(((bc) stateCollectAsState.getValue()).getDarkThemeGlowPosition(), null, 2, null);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue5);
            }
            MutableState mutableState4 = (MutableState) objRememberedValue5;
            boolean zChanged5 = composerStartRestartGroup.changed(((bc) stateCollectAsState.getValue()).getAccentFollowsTheme());
            Object objRememberedValue6 = composerStartRestartGroup.rememberedValue();
            if (zChanged5 || objRememberedValue6 == companion.getEmpty()) {
                objRememberedValue6 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Boolean.valueOf(((bc) stateCollectAsState.getValue()).getAccentFollowsTheme()), null, 2, null);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue6);
            }
            MutableState mutableState5 = (MutableState) objRememberedValue6;
            boolean zChanged6 = composerStartRestartGroup.changed(((bc) stateCollectAsState.getValue()).getDetachedFocusBorderEnabled());
            Object objRememberedValue7 = composerStartRestartGroup.rememberedValue();
            if (zChanged6 || objRememberedValue7 == companion.getEmpty()) {
                objRememberedValue7 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Boolean.valueOf(((bc) stateCollectAsState.getValue()).getDetachedFocusBorderEnabled()), null, 2, null);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue7);
            }
            MutableState mutableState6 = (MutableState) objRememberedValue7;
            boolean zChanged7 = composerStartRestartGroup.changed(((bc) stateCollectAsState.getValue()).getCardSizeLevel());
            Object objRememberedValue8 = composerStartRestartGroup.rememberedValue();
            if (zChanged7 || objRememberedValue8 == companion.getEmpty()) {
                MutableState mutableStateMutableStateOf$default = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Integer.valueOf(AppCardSizeLevel.INSTANCE.normalize(((bc) stateCollectAsState.getValue()).getCardSizeLevel())), null, 2, null);
                composerStartRestartGroup.updateRememberedValue(mutableStateMutableStateOf$default);
                objRememberedValue8 = mutableStateMutableStateOf$default;
            }
            MutableState mutableState7 = (MutableState) objRememberedValue8;
            Object objRememberedValue9 = composerStartRestartGroup.rememberedValue();
            if (objRememberedValue9 == companion.getEmpty()) {
                objRememberedValue9 = EffectsKt.createCompositionCoroutineScope(EmptyCoroutineContext.INSTANCE, composerStartRestartGroup);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue9);
            }
            CoroutineScope coroutineScope = (CoroutineScope) objRememberedValue9;
            Object objRememberedValue10 = composerStartRestartGroup.rememberedValue();
            if (objRememberedValue10 == companion.getEmpty()) {
                objRememberedValue10 = mr.n(composerStartRestartGroup);
            }
            FocusRequester focusRequester = (FocusRequester) objRememberedValue10;
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-175699322, 6, -1, "com.dh.myembyapp.ui.theme.MyEmbyTheme.<get-colors> (Theme.kt:122)");
            }
            u61 u61Var = (u61) composerStartRestartGroup.consume(n72.b);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            Unit unit = Unit.INSTANCE;
            Object objRememberedValue11 = composerStartRestartGroup.rememberedValue();
            if (objRememberedValue11 == companion.getEmpty()) {
                objRememberedValue11 = new ji(focusRequester, null, 20);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue11);
            }
            EffectsKt.LaunchedEffect(unit, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) objRememberedValue11, composerStartRestartGroup, 6);
            function1 = function0;
            AndroidDialog_androidKt.Dialog(function1, new DialogProperties(true, false, false), ComposableLambdaKt.rememberComposableLambda(914818544, true, new wy(u61Var, focusRequester, mutableState, mutableState2, mutableState3, mutableState4, mutableState7, mutableState5, mutableState6, function0, coroutineScope, q72Var), composerStartRestartGroup, 54), composerStartRestartGroup, (i2 & 14) | 432, 0);
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
            scopeUpdateScopeEndRestartGroup.updateScope(new tm(i, 8, function1));
        }
    }

    public static final void g(int i, Composer composer, Modifier modifier, String str, Function0 function0, boolean z) {
        int i2;
        ClickableSurfaceBorder clickableSurfaceBorderBorder;
        Composer composerStartRestartGroup = composer.startRestartGroup(1234807526);
        int i3 = 2;
        if ((i & 6) == 0) {
            i2 = (composerStartRestartGroup.changed(str) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= composerStartRestartGroup.changed(z) ? 32 : 16;
        }
        if ((i & RendererCapabilities.DECODER_SUPPORT_MASK) == 0) {
            i2 |= composerStartRestartGroup.changed(modifier) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= composerStartRestartGroup.changedInstance(function0) ? 2048 : 1024;
        }
        if (composerStartRestartGroup.shouldExecute((i2 & 1171) != 1170, i2 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1234807526, i2, -1, "com.dh.myembyapp.ui.components.ThemeSingleChoiceOptionCard (ThemeSettingsDialog.kt:590)");
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-175699322, 6, -1, "com.dh.myembyapp.ui.theme.MyEmbyTheme.<get-colors> (Theme.kt:122)");
            }
            u61 u61Var = (u61) composerStartRestartGroup.consume(n72.b);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            Modifier modifierM1050height3ABfNKs = SizeKt.m1050height3ABfNKs(modifier, Dp.m7813constructorimpl(48.0f));
            ClickableSurfaceDefaults clickableSurfaceDefaults = ClickableSurfaceDefaults.INSTANCE;
            long j = z ? u61Var.E : u61Var.C;
            long j2 = z ? u61Var.F : u61Var.D;
            MaterialTheme materialTheme = MaterialTheme.INSTANCE;
            int i4 = MaterialTheme.$stable;
            long onSurface = materialTheme.getColorScheme(composerStartRestartGroup, i4).getOnSurface();
            long onSurface2 = materialTheme.getColorScheme(composerStartRestartGroup, i4).getOnSurface();
            int i5 = ClickableSurfaceDefaults.$stable;
            int i6 = i2;
            ClickableSurfaceColors clickableSurfaceColorsM8292colorsoq7We08 = clickableSurfaceDefaults.m8292colorsoq7We08(j, onSurface, j2, onSurface2, 0L, 0L, 0L, 0L, composerStartRestartGroup, i5 << 24, PsExtractor.VIDEO_STREAM_MASK);
            if (z) {
                composerStartRestartGroup.startReplaceGroup(-243004756);
                clickableSurfaceBorderBorder = clickableSurfaceDefaults.border(new Border(BorderStrokeKt.m301BorderStrokecXLIe8U(Dp.m7813constructorimpl(1.0f), materialTheme.getColorScheme(composerStartRestartGroup, i4).getPrimary()), 0.0f, null, 6, null), new Border(BorderStrokeKt.m301BorderStrokecXLIe8U(Dp.m7813constructorimpl(2.0f), u61Var.b), 0.0f, null, 6, null), null, null, null, composerStartRestartGroup, i5 << 15, 28);
                composerStartRestartGroup.endReplaceGroup();
            } else {
                composerStartRestartGroup.startReplaceGroup(-242669677);
                clickableSurfaceBorderBorder = clickableSurfaceDefaults.border(null, new Border(BorderStrokeKt.m301BorderStrokecXLIe8U(Dp.m7813constructorimpl(2.0f), u61Var.b), 0.0f, null, 6, null), null, null, null, composerStartRestartGroup, i5 << 15, 29);
                composerStartRestartGroup.endReplaceGroup();
            }
            SurfaceKt.m8520Surface05tvjtU(function0, modifierM1050height3ABfNKs, null, false, 0.0f, clickableSurfaceDefaults.shape(RoundedCornerShapeKt.m1312RoundedCornerShape0680j_4(Dp.m7813constructorimpl(12.0f)), null, null, null, null, composerStartRestartGroup, i5 << 15, 30), clickableSurfaceColorsM8292colorsoq7We08, ClickableSurfaceDefaults.scale$default(clickableSurfaceDefaults, 0.0f, 1.02f, 0.0f, 0.0f, 0.0f, 29, null), clickableSurfaceBorderBorder, el0.c(u61Var), null, ComposableLambdaKt.rememberComposableLambda(1482277735, true, new rb1(str, i3), composerStartRestartGroup, 54), composerStartRestartGroup, (i6 >> 9) & 14, 48, 1052);
            composerStartRestartGroup = composerStartRestartGroup;
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new bz(str, z, modifier, function0, i));
        }
    }

    public static final void h(int i, Composer composer, Modifier modifier, String str, String str2, Function0 function0, boolean z) {
        int i2;
        Composer composerStartRestartGroup = composer.startRestartGroup(-1429688610);
        if ((i & 6) == 0) {
            i2 = (composerStartRestartGroup.changed(str) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= composerStartRestartGroup.changed(str2) ? 32 : 16;
        }
        if ((i & RendererCapabilities.DECODER_SUPPORT_MASK) == 0) {
            i2 |= composerStartRestartGroup.changed(z) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= composerStartRestartGroup.changed(modifier) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i2 |= composerStartRestartGroup.changedInstance(function0) ? 16384 : 8192;
        }
        if (composerStartRestartGroup.shouldExecute((i2 & 9363) != 9362, i2 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1429688610, i2, -1, "com.dh.myembyapp.ui.components.ThemeToggleOptionCard (ThemeSettingsDialog.kt:651)");
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-175699322, 6, -1, "com.dh.myembyapp.ui.theme.MyEmbyTheme.<get-colors> (Theme.kt:122)");
            }
            u61 u61Var = (u61) composerStartRestartGroup.consume(n72.b);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            Modifier modifierM1050height3ABfNKs = SizeKt.m1050height3ABfNKs(modifier, Dp.m7813constructorimpl(58.0f));
            ClickableSurfaceDefaults clickableSurfaceDefaults = ClickableSurfaceDefaults.INSTANCE;
            long j = u61Var.C;
            long j2 = u61Var.D;
            MaterialTheme materialTheme = MaterialTheme.INSTANCE;
            int i3 = MaterialTheme.$stable;
            long onSurface = materialTheme.getColorScheme(composerStartRestartGroup, i3).getOnSurface();
            long onSurface2 = materialTheme.getColorScheme(composerStartRestartGroup, i3).getOnSurface();
            int i4 = ClickableSurfaceDefaults.$stable;
            ClickableSurfaceColors clickableSurfaceColorsM8292colorsoq7We08 = clickableSurfaceDefaults.m8292colorsoq7We08(j, onSurface, j2, onSurface2, 0L, 0L, 0L, 0L, composerStartRestartGroup, i4 << 24, PsExtractor.VIDEO_STREAM_MASK);
            int i5 = i4 << 15;
            SurfaceKt.m8520Surface05tvjtU(function0, modifierM1050height3ABfNKs, null, false, 0.0f, clickableSurfaceDefaults.shape(RoundedCornerShapeKt.m1312RoundedCornerShape0680j_4(Dp.m7813constructorimpl(12.0f)), null, null, null, null, composerStartRestartGroup, i5, 30), clickableSurfaceColorsM8292colorsoq7We08, ClickableSurfaceDefaults.scale$default(clickableSurfaceDefaults, 0.0f, 1.02f, 0.0f, 0.0f, 0.0f, 29, null), clickableSurfaceDefaults.border(null, new Border(BorderStrokeKt.m301BorderStrokecXLIe8U(Dp.m7813constructorimpl(2.0f), u61Var.b), 0.0f, null, 6, null), null, null, null, composerStartRestartGroup, i5, 29), el0.c(u61Var), null, ComposableLambdaKt.rememberComposableLambda(1946920573, true, new mu0(str, str2, 3, z), composerStartRestartGroup, 54), composerStartRestartGroup, (i2 >> 12) & 14, 48, 1052);
            composerStartRestartGroup = composerStartRestartGroup;
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new nu0(str, str2, z, modifier, function0, i, 3));
        }
    }
}
