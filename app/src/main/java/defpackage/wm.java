package defpackage;

import android.content.Context;
import androidx.compose.foundation.BorderStrokeKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.RowKt;
import androidx.compose.foundation.layout.RowScopeInstance;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.material3.MaterialTheme;
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
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.State;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.focus.FocusRequester;
import androidx.compose.ui.focus.FocusRequesterModifierKt;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.ui.text.font.FontWeight;
import androidx.compose.ui.unit.Dp;
import androidx.compose.ui.window.AndroidDialog_androidKt;
import androidx.compose.ui.window.DialogProperties;
import androidx.datastore.preferences.core.Preferences;
import androidx.media3.exoplayer.RendererCapabilities;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.ranges.RangesKt;
import kotlinx.coroutines.CoroutineScope;
import okhttp3.internal.ws.RealWebSocket;

/* JADX INFO: loaded from: classes4.dex */
public abstract class wm {
    public static final void a(Function0 function0, Composer composer, int i) {
        int i2;
        boolean z;
        Function0 function1 = function0;
        function1.getClass();
        Composer composerStartRestartGroup = composer.startRestartGroup(-1951306909);
        if ((i & 6) == 0) {
            i2 = (composerStartRestartGroup.changedInstance(function1) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if (composerStartRestartGroup.shouldExecute((i2 & 3) != 2, i2 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1951306909, i2, -1, "com.dh.myembyapp.ui.components.BufferSettingsDialog (BufferSettingsDialog.kt:45)");
            }
            Context context = (Context) composerStartRestartGroup.consume(AndroidCompositionLocals_androidKt.getLocalContext());
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            Composer.Companion companion = Composer.INSTANCE;
            if (objRememberedValue == companion.getEmpty()) {
                objRememberedValue = new rm(context);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            rm rmVar = (rm) objRememberedValue;
            Object objRememberedValue2 = composerStartRestartGroup.rememberedValue();
            if (objRememberedValue2 == companion.getEmpty()) {
                objRememberedValue2 = EffectsKt.createCompositionCoroutineScope(EmptyCoroutineContext.INSTANCE, composerStartRestartGroup);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
            }
            CoroutineScope coroutineScope = (CoroutineScope) objRememberedValue2;
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-175699322, 6, -1, "com.dh.myembyapp.ui.theme.MyEmbyTheme.<get-colors> (Theme.kt:122)");
            }
            u61 u61Var = (u61) composerStartRestartGroup.consume(n72.b);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            b7 b7Var = rmVar.b;
            Preferences.Key key = rm.d;
            State stateCollectAsState = SnapshotStateKt.collectAsState(b7Var, Integer.valueOf(tl0.z()), null, composerStartRestartGroup, 0, 2);
            State stateCollectAsState2 = SnapshotStateKt.collectAsState(rmVar.c, 120, null, composerStartRestartGroup, 48, 2);
            Object objRememberedValue3 = composerStartRestartGroup.rememberedValue();
            if (objRememberedValue3 == companion.getEmpty()) {
                objRememberedValue3 = Integer.valueOf((int) ((Runtime.getRuntime().maxMemory() / RealWebSocket.DEFAULT_MINIMUM_DEFLATE_SIZE) / RealWebSocket.DEFAULT_MINIMUM_DEFLATE_SIZE));
                composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
            }
            int iIntValue = ((Number) objRememberedValue3).intValue();
            Object objRememberedValue4 = composerStartRestartGroup.rememberedValue();
            if (objRememberedValue4 == companion.getEmpty()) {
                objRememberedValue4 = Integer.valueOf(RangesKt.coerceAtLeast(iIntValue / 2, 1));
                composerStartRestartGroup.updateRememberedValue(objRememberedValue4);
            }
            int iIntValue2 = ((Number) objRememberedValue4).intValue();
            Object objRememberedValue5 = composerStartRestartGroup.rememberedValue();
            if (objRememberedValue5 == companion.getEmpty()) {
                objRememberedValue5 = Boolean.valueOf(iIntValue2 > 400);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue5);
            }
            boolean zBooleanValue = ((Boolean) objRememberedValue5).booleanValue();
            Object objRememberedValue6 = composerStartRestartGroup.rememberedValue();
            if (objRememberedValue6 == companion.getEmpty()) {
                objRememberedValue6 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Integer.valueOf(((Number) stateCollectAsState.getValue()).intValue()), null, 2, null);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue6);
            }
            MutableState mutableState = (MutableState) objRememberedValue6;
            Object objRememberedValue7 = composerStartRestartGroup.rememberedValue();
            if (objRememberedValue7 == companion.getEmpty()) {
                objRememberedValue7 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Integer.valueOf(((Number) stateCollectAsState2.getValue()).intValue()), null, 2, null);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue7);
            }
            MutableState mutableState2 = (MutableState) objRememberedValue7;
            Object objRememberedValue8 = composerStartRestartGroup.rememberedValue();
            if (objRememberedValue8 == companion.getEmpty()) {
                objRememberedValue8 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Boolean.FALSE, null, 2, null);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue8);
            }
            MutableState mutableState3 = (MutableState) objRememberedValue8;
            Integer numValueOf = Integer.valueOf(((Number) stateCollectAsState.getValue()).intValue());
            Integer numValueOf2 = Integer.valueOf(((Number) stateCollectAsState2.getValue()).intValue());
            boolean zChanged = composerStartRestartGroup.changed(stateCollectAsState) | composerStartRestartGroup.changed(stateCollectAsState2);
            Object objRememberedValue9 = composerStartRestartGroup.rememberedValue();
            if (zChanged || objRememberedValue9 == companion.getEmpty()) {
                objRememberedValue9 = new m2(stateCollectAsState, mutableState, stateCollectAsState2, mutableState2, (Continuation) null);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue9);
            }
            EffectsKt.LaunchedEffect(numValueOf, numValueOf2, (Function2) objRememberedValue9, composerStartRestartGroup, 0);
            Object objRememberedValue10 = composerStartRestartGroup.rememberedValue();
            if (objRememberedValue10 == companion.getEmpty()) {
                objRememberedValue10 = mr.n(composerStartRestartGroup);
            }
            FocusRequester focusRequester = (FocusRequester) objRememberedValue10;
            Unit unit = Unit.INSTANCE;
            Object objRememberedValue11 = composerStartRestartGroup.rememberedValue();
            if (objRememberedValue11 == companion.getEmpty()) {
                z = false;
                objRememberedValue11 = new vm(focusRequester, null, 0);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue11);
            } else {
                z = false;
            }
            EffectsKt.LaunchedEffect(unit, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) objRememberedValue11, composerStartRestartGroup, 6);
            function1 = function0;
            AndroidDialog_androidKt.Dialog(function1, new DialogProperties(true, z, z), ComposableLambdaKt.rememberComposableLambda(1201409338, true, new v9(u61Var, coroutineScope, rmVar, function0, focusRequester, mutableState, mutableState2, iIntValue, iIntValue2, zBooleanValue, mutableState3), composerStartRestartGroup, 54), composerStartRestartGroup, (i2 & 14) | 432, 0);
            composerStartRestartGroup = composerStartRestartGroup;
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new tm(i, 0, function1));
        }
    }

    /* JADX WARN: Code duplicated, block: B:102:0x0305  */
    /* JADX WARN: Code duplicated, block: B:105:0x03d0  */
    /* JADX WARN: Code duplicated, block: B:107:0x03d5  */
    /* JADX WARN: Code duplicated, block: B:110:0x03e2  */
    /* JADX WARN: Code duplicated, block: B:112:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:60:0x00aa  */
    /* JADX WARN: Code duplicated, block: B:61:0x00ad  */
    /* JADX WARN: Code duplicated, block: B:64:0x00b6 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:65:0x00b8  */
    /* JADX WARN: Code duplicated, block: B:66:0x00ba  */
    /* JADX WARN: Code duplicated, block: B:69:0x00c2  */
    /* JADX WARN: Code duplicated, block: B:72:0x00cd  */
    /* JADX WARN: Code duplicated, block: B:75:0x00e4  */
    /* JADX WARN: Code duplicated, block: B:79:0x0121  */
    /* JADX WARN: Code duplicated, block: B:82:0x012d  */
    /* JADX WARN: Code duplicated, block: B:83:0x0131  */
    /* JADX WARN: Code duplicated, block: B:86:0x014a  */
    /* JADX WARN: Code duplicated, block: B:87:0x014d  */
    /* JADX WARN: Code duplicated, block: B:90:0x0218  */
    /* JADX WARN: Code duplicated, block: B:91:0x021d  */
    /* JADX WARN: Code duplicated, block: B:95:0x0287  */
    /* JADX WARN: Code duplicated, block: B:98:0x0293  */
    /* JADX WARN: Code duplicated, block: B:99:0x0297  */
    public static final void b(final int i, final String str, final int i2, int i3, final int i4, final Function0 function0, final Function0 function1, FocusRequester focusRequester, Composer composer, final int i5, final int i6) {
        int i7;
        FocusRequester focusRequester2;
        boolean z;
        int i8;
        Composer composer2;
        final FocusRequester focusRequester3;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        FocusRequester focusRequester4;
        Modifier.Companion companion;
        Function0<ComposeUiNode> constructor;
        boolean z2;
        FocusRequester focusRequester5;
        Modifier modifierFocusRequester;
        Function0<ComposeUiNode> constructor2;
        Composer composerStartRestartGroup = composer.startRestartGroup(24886545);
        if ((i5 & 6) == 0) {
            i7 = (composerStartRestartGroup.changed(i) ? 4 : 2) | i5;
        } else {
            i7 = i5;
        }
        if ((i5 & 48) == 0) {
            i7 |= composerStartRestartGroup.changed(str) ? 32 : 16;
        }
        if ((i5 & RendererCapabilities.DECODER_SUPPORT_MASK) == 0) {
            i7 |= composerStartRestartGroup.changed(i2) ? 256 : 128;
        }
        if ((i5 & 3072) == 0) {
            i7 |= composerStartRestartGroup.changed(i3) ? 2048 : 1024;
        }
        if ((196608 & i5) == 0) {
            i7 |= composerStartRestartGroup.changedInstance(function0) ? 131072 : 65536;
        }
        if ((1572864 & i5) == 0) {
            i7 |= composerStartRestartGroup.changedInstance(function1) ? 1048576 : 524288;
        }
        int i9 = i6 & 128;
        if (i9 == 0) {
            if ((12582912 & i5) == 0) {
                focusRequester2 = focusRequester;
                i7 |= composerStartRestartGroup.changed(focusRequester2) ? 8388608 : 4194304;
            }
            if ((4785299 & i7) != 4785298) {
                z = true;
            } else {
                z = false;
            }
            if (composerStartRestartGroup.shouldExecute(z, i7 & 1)) {
                if (i9 != 0) {
                    focusRequester4 = null;
                } else {
                    focusRequester4 = focusRequester2;
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(24886545, i7, -1, "com.dh.myembyapp.ui.components.BufferValueSelector (BufferSettingsDialog.kt:283)");
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-175699322, 6, -1, "com.dh.myembyapp.ui.theme.MyEmbyTheme.<get-colors> (Theme.kt:122)");
                }
                u61 u61Var = (u61) composerStartRestartGroup.consume(n72.b);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                Alignment.Companion companion2 = Alignment.INSTANCE;
                Alignment.Vertical centerVertically = companion2.getCenterVertically();
                Arrangement.HorizontalOrVertical horizontalOrVerticalM712spacedBy0680j_4 = Arrangement.INSTANCE.m712spacedBy0680j_4(Dp.m7813constructorimpl(4.0f));
                companion = Modifier.INSTANCE;
                int i10 = i7;
                MeasurePolicy measurePolicyRowMeasurePolicy = RowKt.rowMeasurePolicy(horizontalOrVerticalM712spacedBy0680j_4, centerVertically, composerStartRestartGroup, 54);
                long currentCompositeKeyHashCode = ComposablesKt.getCurrentCompositeKeyHashCode(composerStartRestartGroup, 0);
                int i11 = (int) (currentCompositeKeyHashCode ^ (currentCompositeKeyHashCode >>> 32));
                CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
                Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(composerStartRestartGroup, companion);
                ComposeUiNode.Companion companion3 = ComposeUiNode.INSTANCE;
                constructor = companion3.getConstructor();
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
                mr.z(companion3, composerM4318constructorimpl, measurePolicyRowMeasurePolicy, composerM4318constructorimpl, currentCompositionLocalMap);
                Updater.m4326setimpl(composerM4318constructorimpl, modifierMaterializeModifier, (Function2<? super T, ? super Modifier, Unit>) id.h(companion3, composerM4318constructorimpl, Integer.valueOf(i11), composerM4318constructorimpl));
                RowScopeInstance rowScopeInstance = RowScopeInstance.INSTANCE;
                if (i > i2) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                IconButtonDefaults iconButtonDefaults = IconButtonDefaults.INSTANCE;
                MaterialTheme materialTheme = MaterialTheme.INSTANCE;
                int i12 = MaterialTheme.$stable;
                long surfaceVariant = materialTheme.getColorScheme(composerStartRestartGroup, i12).getSurfaceVariant();
                long j = u61Var.D;
                long j2 = u61Var.b;
                long onSurface = materialTheme.getColorScheme(composerStartRestartGroup, i12).getOnSurface();
                long onSurface2 = materialTheme.getColorScheme(composerStartRestartGroup, i12).getOnSurface();
                long jM5151copywmQWz5c$default = Color.m5151copywmQWz5c$default(materialTheme.getColorScheme(composerStartRestartGroup, i12).getSurfaceVariant(), 0.55f, 0.0f, 0.0f, 0.0f, 14, null);
                long jM5151copywmQWz5c$default2 = Color.m5151copywmQWz5c$default(materialTheme.getColorScheme(composerStartRestartGroup, i12).getOnSurface(), 0.3f, 0.0f, 0.0f, 0.0f, 14, null);
                int i13 = IconButtonDefaults.$stable;
                int i14 = i13 << 24;
                focusRequester5 = focusRequester4;
                boolean z3 = z2;
                ButtonColors buttonColorsM8385colorsoq7We08 = iconButtonDefaults.m8385colorsoq7We08(surfaceVariant, onSurface, j, onSurface2, 0L, 0L, jM5151copywmQWz5c$default, jM5151copywmQWz5c$default2, composerStartRestartGroup, i14, 48);
                ButtonScale buttonScaleScale$default = IconButtonDefaults.scale$default(iconButtonDefaults, 0.0f, 1.15f, 0.0f, 0.0f, 0.0f, 29, null);
                ButtonGlow buttonGlowB = el0.b(u61Var);
                int i15 = i13 << 15;
                ButtonBorder buttonBorderBorder = iconButtonDefaults.border(null, new Border(BorderStrokeKt.m301BorderStrokecXLIe8U(Dp.m7813constructorimpl(2.0f), j2), 0.0f, null, 6, null), null, null, null, composerStartRestartGroup, i15, 29);
                Modifier modifierM1064size3ABfNKs = SizeKt.m1064size3ABfNKs(companion, Dp.m7813constructorimpl(40.0f));
                if (focusRequester5 != null) {
                    modifierFocusRequester = FocusRequesterModifierKt.focusRequester(companion, focusRequester5);
                } else {
                    modifierFocusRequester = companion;
                }
                IconButtonKt.IconButton(function0, modifierM1064size3ABfNKs.then(modifierFocusRequester), null, z3, buttonScaleScale$default, buttonGlowB, null, buttonColorsM8385colorsoq7We08, buttonBorderBorder, null, ws.a, composerStartRestartGroup, (i10 >> 15) & 14, 6, 580);
                Modifier modifierV = kb0.v(8.0f, SizeKt.m1050height3ABfNKs(SizeKt.m1069width3ABfNKs(companion, Dp.m7813constructorimpl(90.0f)), Dp.m7813constructorimpl(40.0f)), materialTheme.getColorScheme(composerStartRestartGroup, i12).getSurfaceVariant());
                MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(companion2.getCenter(), false);
                long currentCompositeKeyHashCode2 = ComposablesKt.getCurrentCompositeKeyHashCode(composerStartRestartGroup, 0);
                int i16 = (int) (currentCompositeKeyHashCode2 ^ (currentCompositeKeyHashCode2 >>> 32));
                CompositionLocalMap currentCompositionLocalMap2 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                Modifier modifierMaterializeModifier2 = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifierV);
                constructor2 = companion3.getConstructor();
                if (composerStartRestartGroup.getApplier() == null) {
                    ComposablesKt.invalidApplier();
                }
                composerStartRestartGroup.startReusableNode();
                if (composerStartRestartGroup.getInserting()) {
                    composerStartRestartGroup.createNode(constructor2);
                } else {
                    composerStartRestartGroup.useNode();
                }
                Composer composerM4318constructorimpl2 = Updater.m4318constructorimpl(composerStartRestartGroup);
                mr.z(companion3, composerM4318constructorimpl2, measurePolicyMaybeCachedBoxMeasurePolicy, composerM4318constructorimpl2, currentCompositionLocalMap2);
                Updater.m4326setimpl(composerM4318constructorimpl2, modifierMaterializeModifier2, (Function2<? super T, ? super Modifier, Unit>) id.h(companion3, composerM4318constructorimpl2, Integer.valueOf(i16), composerM4318constructorimpl2));
                BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
                TextKt.m3048TextNvy7gAk(i + str, null, materialTheme.getColorScheme(composerStartRestartGroup, i12).getOnSurface(), null, 0L, null, FontWeight.INSTANCE.getMedium(), null, 0L, null, null, 0L, 0, false, 0, 0, null, materialTheme.getTypography(composerStartRestartGroup, i12).getBodyLarge(), composerStartRestartGroup, 1572864, 0, 131002);
                composerStartRestartGroup.endNode();
                i8 = i3;
                composer2 = composerStartRestartGroup;
                IconButtonKt.IconButton(function1, SizeKt.m1064size3ABfNKs(companion, Dp.m7813constructorimpl(40.0f)), null, i < i8, IconButtonDefaults.scale$default(iconButtonDefaults, 0.0f, 1.15f, 0.0f, 0.0f, 0.0f, 29, null), el0.b(u61Var), null, iconButtonDefaults.m8385colorsoq7We08(materialTheme.getColorScheme(composerStartRestartGroup, i12).getSurfaceVariant(), materialTheme.getColorScheme(composerStartRestartGroup, i12).getOnSurface(), u61Var.D, materialTheme.getColorScheme(composerStartRestartGroup, i12).getOnSurface(), 0L, 0L, Color.m5151copywmQWz5c$default(materialTheme.getColorScheme(composerStartRestartGroup, i12).getSurfaceVariant(), 0.55f, 0.0f, 0.0f, 0.0f, 14, null), Color.m5151copywmQWz5c$default(materialTheme.getColorScheme(composerStartRestartGroup, i12).getOnSurface(), 0.3f, 0.0f, 0.0f, 0.0f, 14, null), composer2, i14, 48), iconButtonDefaults.border(null, new Border(BorderStrokeKt.m301BorderStrokecXLIe8U(Dp.m7813constructorimpl(2.0f), j2), 0.0f, null, 6, null), null, null, null, composer2, i15, 29), null, ws.b, composer2, ((i10 >> 18) & 14) | 48, 6, 580);
                composer2.endNode();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                focusRequester3 = focusRequester5;
            } else {
                i8 = i3;
                composer2 = composerStartRestartGroup;
                composer2.skipToGroupEnd();
                focusRequester3 = focusRequester2;
            }
            scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup != null) {
                final int i17 = i8;
                scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: um
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        ((Integer) obj2).getClass();
                        wm.b(i, str, i2, i17, i4, function0, function1, focusRequester3, (Composer) obj, RecomposeScopeImplKt.updateChangedFlags(i5 | 1), i6);
                        return Unit.INSTANCE;
                    }
                });
            }
        }
        i7 |= 12582912;
        focusRequester2 = focusRequester;
        if ((4785299 & i7) != 4785298) {
            z = true;
        } else {
            z = false;
        }
        if (composerStartRestartGroup.shouldExecute(z, i7 & 1)) {
            if (i9 != 0) {
                focusRequester4 = null;
            } else {
                focusRequester4 = focusRequester2;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(24886545, i7, -1, "com.dh.myembyapp.ui.components.BufferValueSelector (BufferSettingsDialog.kt:283)");
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-175699322, 6, -1, "com.dh.myembyapp.ui.theme.MyEmbyTheme.<get-colors> (Theme.kt:122)");
            }
            u61 u61Var2 = (u61) composerStartRestartGroup.consume(n72.b);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            Alignment.Companion companion4 = Alignment.INSTANCE;
            Alignment.Vertical centerVertically2 = companion4.getCenterVertically();
            Arrangement.HorizontalOrVertical horizontalOrVerticalM712spacedBy0680j_5 = Arrangement.INSTANCE.m712spacedBy0680j_4(Dp.m7813constructorimpl(4.0f));
            companion = Modifier.INSTANCE;
            int i18 = i7;
            MeasurePolicy measurePolicyRowMeasurePolicy2 = RowKt.rowMeasurePolicy(horizontalOrVerticalM712spacedBy0680j_5, centerVertically2, composerStartRestartGroup, 54);
            long currentCompositeKeyHashCode3 = ComposablesKt.getCurrentCompositeKeyHashCode(composerStartRestartGroup, 0);
            int i19 = (int) (currentCompositeKeyHashCode3 ^ (currentCompositeKeyHashCode3 >>> 32));
            CompositionLocalMap currentCompositionLocalMap3 = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier3 = ComposedModifierKt.materializeModifier(composerStartRestartGroup, companion);
            ComposeUiNode.Companion companion5 = ComposeUiNode.INSTANCE;
            constructor = companion5.getConstructor();
            if (composerStartRestartGroup.getApplier() == null) {
                ComposablesKt.invalidApplier();
            }
            composerStartRestartGroup.startReusableNode();
            if (composerStartRestartGroup.getInserting()) {
                composerStartRestartGroup.createNode(constructor);
            } else {
                composerStartRestartGroup.useNode();
            }
            Composer composerM4318constructorimpl3 = Updater.m4318constructorimpl(composerStartRestartGroup);
            mr.z(companion5, composerM4318constructorimpl3, measurePolicyRowMeasurePolicy2, composerM4318constructorimpl3, currentCompositionLocalMap3);
            Updater.m4326setimpl(composerM4318constructorimpl3, modifierMaterializeModifier3, (Function2<? super T, ? super Modifier, Unit>) id.h(companion5, composerM4318constructorimpl3, Integer.valueOf(i19), composerM4318constructorimpl3));
            RowScopeInstance rowScopeInstance2 = RowScopeInstance.INSTANCE;
            if (i > i2) {
                z2 = true;
            } else {
                z2 = false;
            }
            IconButtonDefaults iconButtonDefaults2 = IconButtonDefaults.INSTANCE;
            MaterialTheme materialTheme2 = MaterialTheme.INSTANCE;
            int i110 = MaterialTheme.$stable;
            long surfaceVariant2 = materialTheme2.getColorScheme(composerStartRestartGroup, i110).getSurfaceVariant();
            long j3 = u61Var2.D;
            long j4 = u61Var2.b;
            long onSurface3 = materialTheme2.getColorScheme(composerStartRestartGroup, i110).getOnSurface();
            long onSurface4 = materialTheme2.getColorScheme(composerStartRestartGroup, i110).getOnSurface();
            long jM5151copywmQWz5c$default3 = Color.m5151copywmQWz5c$default(materialTheme2.getColorScheme(composerStartRestartGroup, i110).getSurfaceVariant(), 0.55f, 0.0f, 0.0f, 0.0f, 14, null);
            long jM5151copywmQWz5c$default4 = Color.m5151copywmQWz5c$default(materialTheme2.getColorScheme(composerStartRestartGroup, i110).getOnSurface(), 0.3f, 0.0f, 0.0f, 0.0f, 14, null);
            int i111 = IconButtonDefaults.$stable;
            int i112 = i111 << 24;
            focusRequester5 = focusRequester4;
            boolean z4 = z2;
            ButtonColors buttonColorsM8385colorsoq7We09 = iconButtonDefaults2.m8385colorsoq7We08(surfaceVariant2, onSurface3, j3, onSurface4, 0L, 0L, jM5151copywmQWz5c$default3, jM5151copywmQWz5c$default4, composerStartRestartGroup, i112, 48);
            ButtonScale buttonScaleScale$default2 = IconButtonDefaults.scale$default(iconButtonDefaults2, 0.0f, 1.15f, 0.0f, 0.0f, 0.0f, 29, null);
            ButtonGlow buttonGlowB2 = el0.b(u61Var2);
            int i113 = i111 << 15;
            ButtonBorder buttonBorderBorder2 = iconButtonDefaults2.border(null, new Border(BorderStrokeKt.m301BorderStrokecXLIe8U(Dp.m7813constructorimpl(2.0f), j4), 0.0f, null, 6, null), null, null, null, composerStartRestartGroup, i113, 29);
            Modifier modifierM1064size3ABfNKs2 = SizeKt.m1064size3ABfNKs(companion, Dp.m7813constructorimpl(40.0f));
            if (focusRequester5 != null) {
                modifierFocusRequester = FocusRequesterModifierKt.focusRequester(companion, focusRequester5);
            } else {
                modifierFocusRequester = companion;
            }
            IconButtonKt.IconButton(function0, modifierM1064size3ABfNKs2.then(modifierFocusRequester), null, z4, buttonScaleScale$default2, buttonGlowB2, null, buttonColorsM8385colorsoq7We09, buttonBorderBorder2, null, ws.a, composerStartRestartGroup, (i18 >> 15) & 14, 6, 580);
            Modifier modifierV2 = kb0.v(8.0f, SizeKt.m1050height3ABfNKs(SizeKt.m1069width3ABfNKs(companion, Dp.m7813constructorimpl(90.0f)), Dp.m7813constructorimpl(40.0f)), materialTheme2.getColorScheme(composerStartRestartGroup, i110).getSurfaceVariant());
            MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy2 = BoxKt.maybeCachedBoxMeasurePolicy(companion4.getCenter(), false);
            long currentCompositeKeyHashCode4 = ComposablesKt.getCurrentCompositeKeyHashCode(composerStartRestartGroup, 0);
            int i114 = (int) (currentCompositeKeyHashCode4 ^ (currentCompositeKeyHashCode4 >>> 32));
            CompositionLocalMap currentCompositionLocalMap4 = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier4 = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifierV2);
            constructor2 = companion5.getConstructor();
            if (composerStartRestartGroup.getApplier() == null) {
                ComposablesKt.invalidApplier();
            }
            composerStartRestartGroup.startReusableNode();
            if (composerStartRestartGroup.getInserting()) {
                composerStartRestartGroup.createNode(constructor2);
            } else {
                composerStartRestartGroup.useNode();
            }
            Composer composerM4318constructorimpl4 = Updater.m4318constructorimpl(composerStartRestartGroup);
            mr.z(companion5, composerM4318constructorimpl4, measurePolicyMaybeCachedBoxMeasurePolicy2, composerM4318constructorimpl4, currentCompositionLocalMap4);
            Updater.m4326setimpl(composerM4318constructorimpl4, modifierMaterializeModifier4, (Function2<? super T, ? super Modifier, Unit>) id.h(companion5, composerM4318constructorimpl4, Integer.valueOf(i114), composerM4318constructorimpl4));
            BoxScopeInstance boxScopeInstance2 = BoxScopeInstance.INSTANCE;
            TextKt.m3048TextNvy7gAk(i + str, null, materialTheme2.getColorScheme(composerStartRestartGroup, i110).getOnSurface(), null, 0L, null, FontWeight.INSTANCE.getMedium(), null, 0L, null, null, 0L, 0, false, 0, 0, null, materialTheme2.getTypography(composerStartRestartGroup, i110).getBodyLarge(), composerStartRestartGroup, 1572864, 0, 131002);
            composerStartRestartGroup.endNode();
            i8 = i3;
            if (i < i8) {
            }
            composer2 = composerStartRestartGroup;
            IconButtonKt.IconButton(function1, SizeKt.m1064size3ABfNKs(companion, Dp.m7813constructorimpl(40.0f)), null, i < i8, IconButtonDefaults.scale$default(iconButtonDefaults2, 0.0f, 1.15f, 0.0f, 0.0f, 0.0f, 29, null), el0.b(u61Var2), null, iconButtonDefaults2.m8385colorsoq7We08(materialTheme2.getColorScheme(composerStartRestartGroup, i110).getSurfaceVariant(), materialTheme2.getColorScheme(composerStartRestartGroup, i110).getOnSurface(), u61Var2.D, materialTheme2.getColorScheme(composerStartRestartGroup, i110).getOnSurface(), 0L, 0L, Color.m5151copywmQWz5c$default(materialTheme2.getColorScheme(composerStartRestartGroup, i110).getSurfaceVariant(), 0.55f, 0.0f, 0.0f, 0.0f, 14, null), Color.m5151copywmQWz5c$default(materialTheme2.getColorScheme(composerStartRestartGroup, i110).getOnSurface(), 0.3f, 0.0f, 0.0f, 0.0f, 14, null), composer2, i112, 48), iconButtonDefaults2.border(null, new Border(BorderStrokeKt.m301BorderStrokecXLIe8U(Dp.m7813constructorimpl(2.0f), j4), 0.0f, null, 6, null), null, null, null, composer2, i113, 29), null, ws.b, composer2, ((i18 >> 18) & 14) | 48, 6, 580);
            composer2.endNode();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            focusRequester3 = focusRequester5;
        } else {
            i8 = i3;
            composer2 = composerStartRestartGroup;
            composer2.skipToGroupEnd();
            focusRequester3 = focusRequester2;
        }
        scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            final int i115 = i8;
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: um
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    wm.b(i, str, i2, i115, i4, function0, function1, focusRequester3, (Composer) obj, RecomposeScopeImplKt.updateChangedFlags(i5 | 1), i6);
                    return Unit.INSTANCE;
                }
            });
        }
    }
}
