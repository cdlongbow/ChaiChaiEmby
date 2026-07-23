package defpackage;

import androidx.compose.foundation.BorderStrokeKt;
import androidx.compose.foundation.CanvasKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.RowScopeInstance;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.SpacerKt;
import androidx.compose.material3.AndroidAlertDialog_androidKt;
import androidx.compose.material3.MaterialTheme;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.focus.FocusChangedModifierKt;
import androidx.compose.ui.focus.FocusRequester;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.unit.Dp;
import androidx.compose.ui.window.AndroidDialog_androidKt;
import androidx.compose.ui.window.DialogProperties;
import androidx.media3.exoplayer.RendererCapabilities;
import androidx.media3.extractor.ts.PsExtractor;

import java.util.List;
import kotlin.Function;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: loaded from: classes4.dex */
public abstract class q32 {
    public static final void a(Composer composer, int i) {
        Composer composerStartRestartGroup = composer.startRestartGroup(-1441802857);
        if (composerStartRestartGroup.shouldExecute(i != 0, i & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1441802857, i, -1, "com.dh.myembyapp.ui.components.DashedDivider (SubtitleFontManagerDialog.kt:217)");
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-175699322, 6, -1, "com.dh.myembyapp.ui.theme.MyEmbyTheme.<get-colors> (Theme.kt:122)");
            }
            u61 u61Var = (u61) composerStartRestartGroup.consume(n72.b);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            Modifier modifierM1050height3ABfNKs = SizeKt.m1050height3ABfNKs(SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null), Dp.m7813constructorimpl(1.0f));
            boolean zChanged = composerStartRestartGroup.changed(u61Var);
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            if (zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                objRememberedValue = new m22(u61Var, 2);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            CanvasKt.Canvas(modifierM1050height3ABfNKs, (Function1) objRememberedValue, composerStartRestartGroup, 6);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new vy(i, 11));
        }
    }

    /* JADX WARN: Code duplicated, block: B:23:0x003d  */
    /* JADX WARN: Code duplicated, block: B:25:0x0045  */
    /* JADX WARN: Code duplicated, block: B:26:0x0048  */
    /* JADX WARN: Code duplicated, block: B:28:0x004c  */
    /* JADX WARN: Code duplicated, block: B:31:0x0056  */
    /* JADX WARN: Code duplicated, block: B:32:0x0058  */
    /* JADX WARN: Code duplicated, block: B:35:0x0061 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:36:0x0063  */
    /* JADX WARN: Code duplicated, block: B:37:0x0066  */
    /* JADX WARN: Code duplicated, block: B:40:0x006f  */
    /* JADX WARN: Code duplicated, block: B:43:0x007b  */
    /* JADX WARN: Code duplicated, block: B:46:0x0091  */
    /* JADX WARN: Code duplicated, block: B:49:0x00a1  */
    /* JADX WARN: Code duplicated, block: B:52:0x00ae  */
    /* JADX WARN: Code duplicated, block: B:53:0x00b1  */
    /* JADX WARN: Code duplicated, block: B:56:0x00d6  */
    /* JADX WARN: Code duplicated, block: B:59:0x0124  */
    /* JADX WARN: Code duplicated, block: B:61:0x012a  */
    /* JADX WARN: Code duplicated, block: B:64:0x0136  */
    /* JADX WARN: Code duplicated, block: B:66:? A[RETURN, SYNTHETIC] */
    public static final void b(String str, boolean z, Function0 function0, Composer composer, int i, int i2) {
        int i3;
        boolean z2;
        int i4;
        boolean z3;
        Composer composer2;
        boolean z4;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        boolean z5;
        Object objRememberedValue;
        Composer.Companion companion;
        MutableState mutableState;
        jc2 jc2Var;
        Object objRememberedValue2;
        int i5;
        Composer composerStartRestartGroup = composer.startRestartGroup(1108518300);
        if ((i & 6) == 0) {
            i3 = (composerStartRestartGroup.changed(str) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        int i6 = i2 & 2;
        if (i6 == 0) {
            if ((i & 48) == 0) {
                z2 = z;
                i3 |= composerStartRestartGroup.changed(z2) ? 32 : 16;
            }
            if ((i & RendererCapabilities.DECODER_SUPPORT_MASK) != 0) {
                if (composerStartRestartGroup.changedInstance(function0)) {
                    i5 = 256;
                } else {
                    i5 = 128;
                }
                i3 |= i5;
            }
            i4 = 0;
            if ((i3 & Input.Keys.NUMPAD_3) != 146) {
                z3 = true;
            } else {
                z3 = false;
            }
            if (composerStartRestartGroup.shouldExecute(z3, i3 & 1)) {
                if (i6 != 0) {
                    z5 = false;
                } else {
                    z5 = z2;
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(1108518300, i3, -1, "com.dh.myembyapp.ui.components.FocusAwareDialogButton (SubtitleFontManagerDialog.kt:343)");
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-175699322, 6, -1, "com.dh.myembyapp.ui.theme.MyEmbyTheme.<get-colors> (Theme.kt:122)");
                }
                u61 u61Var = (u61) composerStartRestartGroup.consume(n72.b);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                objRememberedValue = composerStartRestartGroup.rememberedValue();
                companion = Composer.INSTANCE;
                if (objRememberedValue == companion.getEmpty()) {
                    objRememberedValue = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Boolean.FALSE, null, 2, null);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                }
                mutableState = (MutableState) objRememberedValue;
                if (z5) {
                    jc2Var = jc2.e;
                } else {
                    jc2Var = jc2.c;
                }
                Modifier modifierM1071widthInVpY3zN4$default = SizeKt.m1071widthInVpY3zN4$default(SizeKt.m1050height3ABfNKs(Modifier.INSTANCE, Dp.m7813constructorimpl(40.0f)), Dp.m7813constructorimpl(86.0f), 0.0f, 2, null);
                objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                if (objRememberedValue2 == companion.getEmpty()) {
                    objRememberedValue2 = new li1(29, mutableState);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                }
                composer2 = composerStartRestartGroup;
                ButtonKt.m8231ButtonTCVpFMg(function0, FocusChangedModifierKt.onFocusChanged(modifierM1071widthInVpY3zN4$default, (Function1) objRememberedValue2), null, false, hc2.l(1.0f), el0.a(u61Var), null, hc2.i(jc2Var, false, composerStartRestartGroup, 0, 2), 0.0f, hc2.h(composerStartRestartGroup), null, null, ComposableLambdaKt.rememberComposableLambda(1441297292, true, new p32(jc2Var, str, mutableState, i4), composerStartRestartGroup, 54), composer2, (i3 >> 6) & 14, RendererCapabilities.DECODER_SUPPORT_MASK, 3404);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                z4 = z5;
            } else {
                composer2 = composerStartRestartGroup;
                composer2.skipToGroupEnd();
                z4 = z2;
            }
            scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup != null) {
                scopeUpdateScopeEndRestartGroup.updateScope(new pj(str, z4, function0, i, i2, 3));
            }
        }
        i3 |= 48;
        z2 = z;
        if ((i & RendererCapabilities.DECODER_SUPPORT_MASK) != 0) {
            if (composerStartRestartGroup.changedInstance(function0)) {
                i5 = 256;
            } else {
                i5 = 128;
            }
            i3 |= i5;
        }
        i4 = 0;
        if ((i3 & Input.Keys.NUMPAD_3) != 146) {
            z3 = true;
        } else {
            z3 = false;
        }
        if (composerStartRestartGroup.shouldExecute(z3, i3 & 1)) {
            if (i6 != 0) {
                z5 = false;
            } else {
                z5 = z2;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1108518300, i3, -1, "com.dh.myembyapp.ui.components.FocusAwareDialogButton (SubtitleFontManagerDialog.kt:343)");
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-175699322, 6, -1, "com.dh.myembyapp.ui.theme.MyEmbyTheme.<get-colors> (Theme.kt:122)");
            }
            u61 u61Var2 = (u61) composerStartRestartGroup.consume(n72.b);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            objRememberedValue = composerStartRestartGroup.rememberedValue();
            companion = Composer.INSTANCE;
            if (objRememberedValue == companion.getEmpty()) {
                objRememberedValue = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Boolean.FALSE, null, 2, null);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            mutableState = (MutableState) objRememberedValue;
            if (z5) {
                jc2Var = jc2.e;
            } else {
                jc2Var = jc2.c;
            }
            Modifier modifierM1071widthInVpY3zN4$default2 = SizeKt.m1071widthInVpY3zN4$default(SizeKt.m1050height3ABfNKs(Modifier.INSTANCE, Dp.m7813constructorimpl(40.0f)), Dp.m7813constructorimpl(86.0f), 0.0f, 2, null);
            objRememberedValue2 = composerStartRestartGroup.rememberedValue();
            if (objRememberedValue2 == companion.getEmpty()) {
                objRememberedValue2 = new li1(29, mutableState);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
            }
            composer2 = composerStartRestartGroup;
            ButtonKt.m8231ButtonTCVpFMg(function0, FocusChangedModifierKt.onFocusChanged(modifierM1071widthInVpY3zN4$default2, (Function1) objRememberedValue2), null, false, hc2.l(1.0f), el0.a(u61Var2), null, hc2.i(jc2Var, false, composerStartRestartGroup, 0, 2), 0.0f, hc2.h(composerStartRestartGroup), null, null, ComposableLambdaKt.rememberComposableLambda(1441297292, true, new p32(jc2Var, str, mutableState, i4), composerStartRestartGroup, 54), composer2, (i3 >> 6) & 14, RendererCapabilities.DECODER_SUPPORT_MASK, 3404);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            z4 = z5;
        } else {
            composer2 = composerStartRestartGroup;
            composer2.skipToGroupEnd();
            z4 = z2;
        }
        scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new pj(str, z4, function0, i, i2, 3));
        }
    }

    public static final void c(String str, boolean z, Function0 function0, Function0 function1, Composer composer, int i) {
        int i2;
        Composer composerStartRestartGroup = composer.startRestartGroup(-1165016711);
        if ((i & 6) == 0) {
            i2 = (composerStartRestartGroup.changed(str) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= composerStartRestartGroup.changed(z) ? 32 : 16;
        }
        if ((i & RendererCapabilities.DECODER_SUPPORT_MASK) == 0) {
            i2 |= composerStartRestartGroup.changedInstance(function0) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= composerStartRestartGroup.changedInstance(function1) ? 2048 : 1024;
        }
        if (composerStartRestartGroup.shouldExecute((i2 & 1171) != 1170, i2 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1165016711, i2, -1, "com.dh.myembyapp.ui.components.FontRow (SubtitleFontManagerDialog.kt:241)");
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
            int i3 = i2;
            MeasurePolicy measurePolicyQ = mr.q(10.0f, Arrangement.INSTANCE, Alignment.INSTANCE.getCenterVertically(), composerStartRestartGroup, 54);
            long currentCompositeKeyHashCode = ComposablesKt.getCurrentCompositeKeyHashCode(composerStartRestartGroup, 0);
            int i4 = (int) (currentCompositeKeyHashCode ^ (currentCompositeKeyHashCode >>> 32));
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
            mr.z(companion2, composerM4318constructorimpl, measurePolicyQ, composerM4318constructorimpl, currentCompositionLocalMap);
            Updater.m4326setimpl(composerM4318constructorimpl, modifierMaterializeModifier, (Function2<? super T, ? super Modifier, Unit>) id.h(companion2, composerM4318constructorimpl, Integer.valueOf(i4), composerM4318constructorimpl));
            Modifier modifierM1050height3ABfNKs = SizeKt.m1050height3ABfNKs(zs1.E(RowScopeInstance.INSTANCE, companion, 1.0f, false, 2, null), Dp.m7813constructorimpl(46.0f));
            ClickableSurfaceDefaults clickableSurfaceDefaults = ClickableSurfaceDefaults.INSTANCE;
            long j = z ? u61Var.E : u61Var.C;
            long j2 = z ? u61Var.F : u61Var.D;
            MaterialTheme materialTheme = MaterialTheme.INSTANCE;
            int i5 = MaterialTheme.$stable;
            long onSurface = materialTheme.getColorScheme(composerStartRestartGroup, i5).getOnSurface();
            long onSurface2 = materialTheme.getColorScheme(composerStartRestartGroup, i5).getOnSurface();
            int i6 = ClickableSurfaceDefaults.$stable;
            int i7 = i6 << 24;
            ClickableSurfaceColors clickableSurfaceColorsM8292colorsoq7We08 = clickableSurfaceDefaults.m8292colorsoq7We08(j, onSurface, j2, onSurface2, 0L, 0L, 0L, 0L, composerStartRestartGroup, i7, PsExtractor.VIDEO_STREAM_MASK);
            int i8 = i6 << 15;
            SurfaceKt.m8520Surface05tvjtU(function0, modifierM1050height3ABfNKs, null, false, 0.0f, null, clickableSurfaceColorsM8292colorsoq7We08, ClickableSurfaceDefaults.scale$default(clickableSurfaceDefaults, 0.0f, 1.02f, 0.0f, 0.0f, 0.0f, 29, null), clickableSurfaceDefaults.border(null, new Border(BorderStrokeKt.m301BorderStrokecXLIe8U(Dp.m7813constructorimpl(2.0f), u61Var.b), 0.0f, null, 6, null), null, null, null, composerStartRestartGroup, i8, 29), el0.c(u61Var), null, ComposableLambdaKt.rememberComposableLambda(359786548, true, new i20(z, str), composerStartRestartGroup, 54), composerStartRestartGroup, (i3 >> 6) & 14, 48, 1084);
            composerStartRestartGroup = composerStartRestartGroup;
            if (Intrinsics.areEqual(str, "使用系统默认字体")) {
                composerStartRestartGroup.startReplaceGroup(1082934222);
                SpacerKt.Spacer(SizeKt.m1064size3ABfNKs(companion, Dp.m7813constructorimpl(46.0f)), composerStartRestartGroup, 6);
                composerStartRestartGroup.endReplaceGroup();
            } else {
                composerStartRestartGroup.startReplaceGroup(1081652682);
                SurfaceKt.m8520Surface05tvjtU(function1, SizeKt.m1064size3ABfNKs(companion, Dp.m7813constructorimpl(46.0f)), null, false, 0.0f, null, clickableSurfaceDefaults.m8292colorsoq7We08(u61Var.C, materialTheme.getColorScheme(composerStartRestartGroup, i5).getOnSurface(), u61Var.D, materialTheme.getColorScheme(composerStartRestartGroup, i5).getOnSurface(), 0L, 0L, 0L, 0L, composerStartRestartGroup, i7, PsExtractor.VIDEO_STREAM_MASK), ClickableSurfaceDefaults.scale$default(clickableSurfaceDefaults, 0.0f, 1.02f, 0.0f, 0.0f, 0.0f, 29, null), clickableSurfaceDefaults.border(null, new Border(BorderStrokeKt.m301BorderStrokecXLIe8U(Dp.m7813constructorimpl(2.0f), u61Var.b), 0.0f, null, 6, null), null, null, null, composerStartRestartGroup, i8, 29), el0.c(u61Var), null, tt.d, composerStartRestartGroup, ((i3 >> 9) & 14) | 48, 48, 1084);
                composerStartRestartGroup = composerStartRestartGroup;
                composerStartRestartGroup.endReplaceGroup();
            }
            composerStartRestartGroup.endNode();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new u7((Object) str, z, (Function) function0, (Object) function1, i, 7));
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void d(List list, String str, Function0 function0, Function1 function1, Function1 function2, Function0 function3, Composer composer, int i) {
        int i2;
        String str2;
        Function0 function4;
        Function0 function5;
        list.getClass();
        function1.getClass();
        function2.getClass();
        function3.getClass();
        Composer composerStartRestartGroup = composer.startRestartGroup(-828948750);
        if ((i & 6) == 0) {
            i2 = (composerStartRestartGroup.changedInstance(list) ? 4 : 2) | i;
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
            function4 = function0;
            i2 |= composerStartRestartGroup.changedInstance(function4) ? 256 : 128;
        } else {
            function4 = function0;
        }
        if ((i & 3072) == 0) {
            i2 |= composerStartRestartGroup.changedInstance(function1) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i2 |= composerStartRestartGroup.changedInstance(function2) ? 16384 : 8192;
        }
        if ((196608 & i) == 0) {
            function5 = function3;
            i2 |= composerStartRestartGroup.changedInstance(function5) ? 131072 : 65536;
        } else {
            function5 = function3;
        }
        if (composerStartRestartGroup.shouldExecute((74899 & i2) != 74898, i2 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-828948750, i2, -1, "com.dh.myembyapp.ui.components.SubtitleFontManagerDialog (SubtitleFontManagerDialog.kt:59)");
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-175699322, 6, -1, "com.dh.myembyapp.ui.theme.MyEmbyTheme.<get-colors> (Theme.kt:122)");
            }
            u61 u61Var = (u61) composerStartRestartGroup.consume(n72.b);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            Composer.Companion companion = Composer.INSTANCE;
            if (objRememberedValue == companion.getEmpty()) {
                objRememberedValue = mr.n(composerStartRestartGroup);
            }
            FocusRequester focusRequester = (FocusRequester) objRememberedValue;
            Object objRememberedValue2 = composerStartRestartGroup.rememberedValue();
            if (objRememberedValue2 == companion.getEmpty()) {
                objRememberedValue2 = Long.valueOf(System.currentTimeMillis());
                composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
            }
            long jLongValue = ((Number) objRememberedValue2).longValue();
            Object objRememberedValue3 = composerStartRestartGroup.rememberedValue();
            if (objRememberedValue3 == companion.getEmpty()) {
                objRememberedValue3 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(null, null, 2, null);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
            }
            MutableState mutableState = (MutableState) objRememberedValue3;
            Long lValueOf = Long.valueOf(jLongValue);
            Object objRememberedValue4 = composerStartRestartGroup.rememberedValue();
            if (objRememberedValue4 == companion.getEmpty()) {
                objRememberedValue4 = new vm(focusRequester, null, 11);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue4);
            }
            EffectsKt.LaunchedEffect(lValueOf, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) objRememberedValue4, composerStartRestartGroup, 6);
            AndroidDialog_androidKt.Dialog(function5, new DialogProperties(true, false, false), ComposableLambdaKt.rememberComposableLambda(-814845111, true, new kn0(u61Var, mutableState, focusRequester, str2, list, function4, function1), composerStartRestartGroup, 54), composerStartRestartGroup, ((i2 >> 15) & 14) | 432, 0);
            o32 o32Var = (o32) mutableState.getValue();
            if (o32Var == null) {
                composerStartRestartGroup.startReplaceGroup(855802305);
                composerStartRestartGroup.endReplaceGroup();
            } else {
                composerStartRestartGroup.startReplaceGroup(855802306);
                Object objRememberedValue5 = composerStartRestartGroup.rememberedValue();
                if (objRememberedValue5 == companion.getEmpty()) {
                    objRememberedValue5 = new zq1(29, mutableState);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue5);
                }
                AndroidAlertDialog_androidKt.m2041AlertDialogOix01E0((Function0) objRememberedValue5, ComposableLambdaKt.rememberComposableLambda(736202608, true, new r5(function2, o32Var, mutableState, 16), composerStartRestartGroup, 54), null, ComposableLambdaKt.rememberComposableLambda(-2023368018, true, new b2(23, mutableState), composerStartRestartGroup, 54), null, tt.c, ComposableLambdaKt.rememberComposableLambda(-1867756661, true, new y12(o32Var, 2), composerStartRestartGroup, 54), null, 0L, 0L, 0L, 0L, 0.0f, null, composerStartRestartGroup, 1772598, 0, 16276);
                composerStartRestartGroup = composerStartRestartGroup;
                composerStartRestartGroup.endReplaceGroup();
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new kh(list, str, function0, function1, function2, function3, i));
        }
    }
}
