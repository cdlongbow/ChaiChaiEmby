package defpackage;

import androidx.compose.foundation.BackgroundKt;
import androidx.compose.foundation.FocusableKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.ColumnScopeInstance;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.RowKt;
import androidx.compose.foundation.layout.RowScopeInstance;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.shape.RoundedCornerShape;
import androidx.compose.foundation.shape.RoundedCornerShapeKt;
import androidx.compose.material.icons.Icons;
import androidx.compose.material.icons.filled.PauseKt;
import androidx.compose.material.icons.filled.PlayArrowKt;
import androidx.compose.material3.IconKt;
import androidx.compose.material3.ProgressIndicatorKt;
import androidx.compose.material3.SurfaceKt;
import androidx.compose.material3.TextKt;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambda;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.focus.FocusRequester;
import androidx.compose.ui.focus.FocusRequesterModifierKt;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.GraphicsLayerModifierKt;
import androidx.compose.ui.graphics.vector.ImageVector;
import androidx.compose.ui.input.key.KeyInputModifierKt;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.unit.Dp;
import androidx.compose.ui.viewinterop.AndroidView_androidKt;
import androidx.media3.exoplayer.RendererCapabilities;
import androidx.media3.exoplayer.analytics.AnalyticsListener;

import com.dh.myembyapp.data.model.AudioVersionPrioritySettings;
import com.dh.myembyapp.data.model.DanmakuConfig;
import com.dh.myembyapp.data.model.MediaItem;
import com.dh.myembyapp.data.model.SubtitleVersionPrioritySettings;
import com.dh.myembyapp.data.model.SystemDurationDisplayMode;
import com.dh.myembyapp.data.model.SystemNetworkSpeedDisplayMode;
import com.dh.myembyapp.data.model.SystemNetworkSpeedPosition;
import com.dh.myembyapp.data.model.SystemTimeDisplayMode;
import com.dh.myembyapp.data.model.VideoVersionPrioritySettings;
import com.dh.myembyapp.data.preferences.DanmakuPreferences;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import okhttp3.internal.ws.WebSocketProtocol;

/* JADX INFO: loaded from: classes4.dex */
public abstract class lh1 {
    public static final void a(final lg1 lg1Var, final kg1 kg1Var, Composer composer, final int i) {
        int i2;
        Composer composer2;
        final int i3;
        Composer composerStartRestartGroup = composer.startRestartGroup(572267544);
        if ((i & 6) == 0) {
            i2 = (composerStartRestartGroup.changedInstance(lg1Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= composerStartRestartGroup.changed(kg1Var) ? 32 : 16;
        }
        final int i4 = 0;
        if (composerStartRestartGroup.shouldExecute((i2 & 19) != 18, i2 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(572267544, i2, -1, "com.dh.myembyapp.ui.screens.player.PlayerControlsOverlay (PlayerPlaybackContent.kt:239)");
            }
            if (!lg1Var.a) {
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup != null) {
                    scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: jh1
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            int i5 = i4;
                            int i6 = i;
                            kg1 kg1Var2 = kg1Var;
                            lg1 lg1Var2 = lg1Var;
                            Composer composer3 = (Composer) obj;
                            ((Integer) obj2).getClass();
                            switch (i5) {
                                case 0:
                                    lh1.a(lg1Var2, kg1Var2, composer3, RecomposeScopeImplKt.updateChangedFlags(i6 | 1));
                                    break;
                                default:
                                    lh1.a(lg1Var2, kg1Var2, composer3, RecomposeScopeImplKt.updateChangedFlags(i6 | 1));
                                    break;
                            }
                            return Unit.INSTANCE;
                        }
                    });
                    return;
                }
                return;
            }
            composer2 = composerStartRestartGroup;
            i3 = 1;
            jg1.a(lg1Var.b, lg1Var.c, lg1Var.d, lg1Var.e, lg1Var.f, lg1Var.g, lg1Var.h, lg1Var.i, lg1Var.j, lg1Var.k, kg1Var.a, kg1Var.b, kg1Var.c, kg1Var.d, kg1Var.e, kg1Var.f, kg1Var.g, lg1Var.l, lg1Var.m, lg1Var.n, lg1Var.o, lg1Var.p, lg1Var.q, kg1Var.h, kg1Var.i, kg1Var.j, kg1Var.k, kg1Var.l, kg1Var.m, kg1Var.n, lg1Var.r, lg1Var.s, kg1Var.o, lg1Var.t, kg1Var.p, lg1Var.u, kg1Var.q, lg1Var.v, lg1Var.w, lg1Var.x, lg1Var.y, kg1Var.r, kg1Var.s, kg1Var.t, kg1Var.u, lg1Var.z, lg1Var.A, lg1Var.B, lg1Var.C, kg1Var.v, kg1Var.w, kg1Var.x, kg1Var.y, lg1Var.D, lg1Var.E, lg1Var.F, lg1Var.G, lg1Var.H, lg1Var.I, lg1Var.J, lg1Var.K, lg1Var.L, lg1Var.M, lg1Var.N, lg1Var.O, lg1Var.P, kg1Var.z, kg1Var.A, kg1Var.B, kg1Var.C, kg1Var.D, kg1Var.E, kg1Var.F, kg1Var.H, kg1Var.G, lg1Var.Q, kg1Var.I, lg1Var.R, lg1Var.S, lg1Var.T, lg1Var.U, lg1Var.V, lg1Var.W, lg1Var.X, kg1Var.J, kg1Var.K, kg1Var.L, kg1Var.M, lg1Var.Y, kg1Var.N, lg1Var.Z, kg1Var.O, lg1Var.a0, kg1Var.P, lg1Var.b0, kg1Var.Q, lg1Var.c0, kg1Var.R, lg1Var.d0, kg1Var.S, lg1Var.e0, kg1Var.T, lg1Var.f0, kg1Var.U, lg1Var.g0, kg1Var.V, lg1Var.h0, kg1Var.W, lg1Var.i0, kg1Var.X, composer2, MediaItem.$stable, 0, 0, (DanmakuConfig.$stable << 24) | (DanmakuPreferences.$stable << 27), 0, 0, 0, 0, 0, 0, (VideoVersionPrioritySettings.$stable << 15) | (AudioVersionPrioritySettings.$stable << 21) | (SubtitleVersionPrioritySettings.$stable << 27), 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composer2 = composerStartRestartGroup;
            i3 = 1;
            composer2.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup2 = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup2 != null) {
            scopeUpdateScopeEndRestartGroup2.updateScope(new Function2() { // from class: jh1
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    int i5 = i3;
                    int i6 = i;
                    kg1 kg1Var2 = kg1Var;
                    lg1 lg1Var2 = lg1Var;
                    Composer composer3 = (Composer) obj;
                    ((Integer) obj2).getClass();
                    switch (i5) {
                        case 0:
                            lh1.a(lg1Var2, kg1Var2, composer3, RecomposeScopeImplKt.updateChangedFlags(i6 | 1));
                            break;
                        default:
                            lh1.a(lg1Var2, kg1Var2, composer3, RecomposeScopeImplKt.updateChangedFlags(i6 | 1));
                            break;
                    }
                    return Unit.INSTANCE;
                }
            });
        }
    }

    public static final void b(FocusRequester focusRequester, Function1 function1, Function1 function2, boolean z, fj1 fj1Var, gj1 gj1Var, oh1 oh1Var, Function2 function3, Composer composer, int i) {
        int i2;
        focusRequester.getClass();
        function1.getClass();
        function2.getClass();
        function3.getClass();
        Composer composerStartRestartGroup = composer.startRestartGroup(1291632647);
        if ((i & 6) == 0) {
            i2 = (composerStartRestartGroup.changed(focusRequester) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= composerStartRestartGroup.changedInstance(function1) ? 32 : 16;
        }
        if ((i & RendererCapabilities.DECODER_SUPPORT_MASK) == 0) {
            i2 |= composerStartRestartGroup.changedInstance(function2) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= composerStartRestartGroup.changed(z) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i2 |= composerStartRestartGroup.changedInstance(fj1Var) ? 16384 : 8192;
        }
        if ((196608 & i) == 0) {
            i2 |= composerStartRestartGroup.changedInstance(gj1Var) ? 131072 : 65536;
        }
        if ((1572864 & i) == 0) {
            i2 |= composerStartRestartGroup.changedInstance(oh1Var) ? 1048576 : 524288;
        }
        if ((12582912 & i) == 0) {
            i2 |= composerStartRestartGroup.changedInstance(function3) ? 8388608 : 4194304;
        }
        if (composerStartRestartGroup.shouldExecute((4793491 & i2) != 4793490, i2 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1291632647, i2, -1, "com.dh.myembyapp.ui.screens.player.PlayerPlaybackContent (PlayerPlaybackContent.kt:209)");
            }
            Modifier modifierOnKeyEvent = KeyInputModifierKt.onKeyEvent(KeyInputModifierKt.onPreviewKeyEvent(FocusableKt.focusable$default(FocusRequesterModifierKt.focusRequester(BackgroundKt.m275backgroundbw27NRU$default(SizeKt.fillMaxSize$default(Modifier.INSTANCE, 0.0f, 1, null), Color.INSTANCE.m5178getBlack0d7_KjU(), null, 2, null), focusRequester), false, null, 3, null), function1), function2);
            MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.INSTANCE.getTopStart(), false);
            long currentCompositeKeyHashCode = ComposablesKt.getCurrentCompositeKeyHashCode(composerStartRestartGroup, 0);
            int i3 = (int) (currentCompositeKeyHashCode ^ (currentCompositeKeyHashCode >>> 32));
            CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifierOnKeyEvent);
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
            Updater.m4326setimpl(composerM4318constructorimpl, modifierMaterializeModifier, (Function2<? super T, ? super Modifier, Unit>) id.h(companion, composerM4318constructorimpl, Integer.valueOf(i3), composerM4318constructorimpl));
            BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
            d(z, fj1Var, gj1Var, composerStartRestartGroup, (i2 >> 9) & AnalyticsListener.EVENT_DRM_SESSION_ACQUIRED);
            c(oh1Var, function3, composerStartRestartGroup, (i2 >> 18) & WebSocketProtocol.PAYLOAD_SHORT);
            composerStartRestartGroup.endNode();
            Unit unit = Unit.INSTANCE;
            boolean z2 = (i2 & 14) == 4;
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            if (z2 || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                objRememberedValue = new ng(focusRequester, null, 10);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            EffectsKt.LaunchedEffect(unit, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) objRememberedValue, composerStartRestartGroup, 6);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new mr0(focusRequester, function1, function2, z, fj1Var, gj1Var, oh1Var, function3, i));
        }
    }

    /* JADX WARN: Type inference failed for: r3v18 */
    /* JADX WARN: Type inference failed for: r3v4 */
    /* JADX WARN: Type inference failed for: r3v5, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r4v22 */
    /* JADX WARN: Type inference failed for: r4v3 */
    /* JADX WARN: Type inference failed for: r4v4, types: [boolean, int] */
    public static final void c(oh1 oh1Var, Function2 function2, Composer composer, int i) {
        int i2;
        Composer composer2;
        boolean z;
        Object obj;
        int i3;
        Object r3;
        Object r4;
        float f;
        int i4;
        float f2;
        Object obj2;
        String str = oh1Var.o;
        Composer composerStartRestartGroup = composer.startRestartGroup(1306184611);
        if ((i & 6) == 0) {
            i2 = i | (composerStartRestartGroup.changedInstance(oh1Var) ? 4 : 2);
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= composerStartRestartGroup.changedInstance(function2) ? 32 : 16;
        }
        int i5 = i2;
        int i6 = 0;
        if (composerStartRestartGroup.shouldExecute((i5 & 19) != 18, i5 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1306184611, i5, -1, "com.dh.myembyapp.ui.screens.player.PlayerPlaybackOverlays (PlayerPlaybackContent.kt:376)");
            }
            int i7 = oh1Var.g;
            SystemTimeDisplayMode systemTimeDisplayMode = oh1Var.r;
            SystemNetworkSpeedPosition systemNetworkSpeedPosition = oh1Var.q;
            SystemNetworkSpeedDisplayMode systemNetworkSpeedDisplayMode = oh1Var.p;
            boolean z2 = oh1Var.n;
            boolean z3 = oh1Var.f;
            boolean z4 = str != null && ((z2 && systemNetworkSpeedDisplayMode.getShowsInMenu()) || systemNetworkSpeedDisplayMode.getIsPinned());
            boolean z5 = z4 && systemNetworkSpeedPosition == SystemNetworkSpeedPosition.TOP_CENTER;
            boolean z6 = z4 && systemNetworkSpeedPosition == SystemNetworkSpeedPosition.TOP_RIGHT;
            boolean z7 = oh1Var.s.length() > 0 && ((z2 && systemTimeDisplayMode.getShowsInMenu()) || systemTimeDisplayMode.getIsPinned());
            SystemDurationDisplayMode systemDurationDisplayMode = oh1Var.t;
            boolean z8 = oh1Var.u != null && oh1Var.u.length() > 0 && ((z2 && systemDurationDisplayMode.getShowsInMenu()) || systemDurationDisplayMode.getIsPinned());
            boolean z9 = z4 && systemNetworkSpeedPosition == SystemNetworkSpeedPosition.BOTTOM_RIGHT;
            if (oh1Var.b > 0.01f) {
                composerStartRestartGroup.startReplaceGroup(142942861);
                String str2 = oh1Var.c;
                Modifier modifierFillMaxSize$default = SizeKt.fillMaxSize$default(Modifier.INSTANCE, 0.0f, 1, null);
                boolean zChangedInstance = composerStartRestartGroup.changedInstance(oh1Var);
                Object objRememberedValue = composerStartRestartGroup.rememberedValue();
                if (zChangedInstance || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                    objRememberedValue = new kh1(oh1Var, i6);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                }
                in1.a(str2, GraphicsLayerModifierKt.graphicsLayer(modifierFillMaxSize$default, (Function1) objRememberedValue), composerStartRestartGroup, 0);
                composerStartRestartGroup.endReplaceGroup();
            } else {
                composerStartRestartGroup.startReplaceGroup(143175423);
                composerStartRestartGroup.endReplaceGroup();
            }
            if (!oh1Var.d || oh1Var.e.isEmpty()) {
                z = z3;
                composer2 = composerStartRestartGroup;
                obj = null;
                i3 = 3;
                composer2.startReplaceGroup(143697215);
                composer2.endReplaceGroup();
            } else {
                composerStartRestartGroup.startReplaceGroup(143257077);
                z = z3;
                composer2 = composerStartRestartGroup;
                obj = null;
                i3 = 3;
                l00.a(oh1Var.e, oh1Var.a, z3 && i7 == 3, oh1Var.h, oh1Var.j, oh1Var.k, SizeKt.fillMaxSize$default(Modifier.INSTANCE, 0.0f, 1, null), composer2, 1572864);
                composer2.endReplaceGroup();
            }
            if (z || i7 != i3) {
                r3 = 1;
                r4 = 0;
                f = 0.0f;
                composer2.startReplaceGroup(144212063);
                composer2.endReplaceGroup();
            } else {
                composer2.startReplaceGroup(143781535);
                Modifier.Companion companion = Modifier.INSTANCE;
                f = 0.0f;
                Modifier modifierFillMaxSize$default2 = SizeKt.fillMaxSize$default(companion, 0.0f, 1, obj);
                MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.INSTANCE.getCenter(), false);
                long currentCompositeKeyHashCode = ComposablesKt.getCurrentCompositeKeyHashCode(composer2, 0);
                int i8 = (int) (currentCompositeKeyHashCode ^ (currentCompositeKeyHashCode >>> 32));
                CompositionLocalMap currentCompositionLocalMap = composer2.getCurrentCompositionLocalMap();
                Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(composer2, modifierFillMaxSize$default2);
                ComposeUiNode.Companion companion2 = ComposeUiNode.INSTANCE;
                Function0<ComposeUiNode> constructor = companion2.getConstructor();
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
                mr.z(companion2, composerM4318constructorimpl, measurePolicyMaybeCachedBoxMeasurePolicy, composerM4318constructorimpl, currentCompositionLocalMap);
                Updater.m4326setimpl(composerM4318constructorimpl, modifierMaterializeModifier, (Function2<? super T, ? super Modifier, Unit>) id.h(companion2, composerM4318constructorimpl, Integer.valueOf(i8), composerM4318constructorimpl));
                BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
                Icons.Filled filled = Icons.INSTANCE.getDefault();
                ImageVector pause = z ? PauseKt.getPause(filled) : PlayArrowKt.getPlayArrow(filled);
                String str3 = z ? "暂停" : "播放";
                Composer composer3 = composer2;
                r4 = 0;
                r3 = 1;
                IconKt.m2496Iconww6aTOc(pause, str3, SizeKt.m1064size3ABfNKs(companion, Dp.m7813constructorimpl(120.0f)), Color.m5151copywmQWz5c$default(Color.INSTANCE.m5189getWhite0d7_KjU(), 0.6f, 0.0f, 0.0f, 0.0f, 14, null), composer3, 3456, 0);
                composer2 = composer3;
                composer2.endNode();
                composer2.endReplaceGroup();
            }
            if (oh1Var.l) {
                composer2.startReplaceGroup(144269382);
                Modifier.Companion companion3 = Modifier.INSTANCE;
                Modifier modifierFillMaxSize$default3 = SizeKt.fillMaxSize$default(companion3, f, r3, obj);
                Alignment.Companion companion4 = Alignment.INSTANCE;
                MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy2 = BoxKt.maybeCachedBoxMeasurePolicy(companion4.getCenter(), r4);
                long currentCompositeKeyHashCode2 = ComposablesKt.getCurrentCompositeKeyHashCode(composer2, r4);
                int i9 = (int) (currentCompositeKeyHashCode2 ^ (currentCompositeKeyHashCode2 >>> 32));
                CompositionLocalMap currentCompositionLocalMap2 = composer2.getCurrentCompositionLocalMap();
                Modifier modifierMaterializeModifier2 = ComposedModifierKt.materializeModifier(composer2, modifierFillMaxSize$default3);
                ComposeUiNode.Companion companion5 = ComposeUiNode.INSTANCE;
                Function0<ComposeUiNode> constructor2 = companion5.getConstructor();
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
                mr.z(companion5, composerM4318constructorimpl2, measurePolicyMaybeCachedBoxMeasurePolicy2, composerM4318constructorimpl2, currentCompositionLocalMap2);
                Updater.m4326setimpl(composerM4318constructorimpl2, modifierMaterializeModifier2, (Function2<? super T, ? super Modifier, Unit>) id.h(companion5, composerM4318constructorimpl2, Integer.valueOf(i9), composerM4318constructorimpl2));
                BoxScopeInstance boxScopeInstance2 = BoxScopeInstance.INSTANCE;
                MeasurePolicy measurePolicyP = mr.p(12.0f, Arrangement.INSTANCE, companion4.getCenterHorizontally(), composer2, 54);
                long currentCompositeKeyHashCode3 = ComposablesKt.getCurrentCompositeKeyHashCode(composer2, r4);
                int i10 = (int) (currentCompositeKeyHashCode3 ^ (currentCompositeKeyHashCode3 >>> 32));
                CompositionLocalMap currentCompositionLocalMap3 = composer2.getCurrentCompositionLocalMap();
                Modifier modifierMaterializeModifier3 = ComposedModifierKt.materializeModifier(composer2, companion3);
                Function0<ComposeUiNode> constructor3 = companion5.getConstructor();
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
                mr.z(companion5, composerM4318constructorimpl3, measurePolicyP, composerM4318constructorimpl3, currentCompositionLocalMap3);
                Updater.m4326setimpl(composerM4318constructorimpl3, modifierMaterializeModifier3, (Function2<? super T, ? super Modifier, Unit>) id.h(companion5, composerM4318constructorimpl3, Integer.valueOf(i10), composerM4318constructorimpl3));
                ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.INSTANCE;
                Color.Companion companion6 = Color.INSTANCE;
                Composer composer4 = composer2;
                i4 = 54;
                ProgressIndicatorKt.m2703CircularProgressIndicator4lLiAd8(null, Color.m5151copywmQWz5c$default(companion6.m5189getWhite0d7_KjU(), 0.9f, 0.0f, 0.0f, 0.0f, 14, null), 0.0f, 0L, 0, 0.0f, composer4, 48, 61);
                composer2 = composer4;
                String str4 = oh1Var.m;
                if (str4 == null) {
                    composer2.startReplaceGroup(38903153);
                    composer2.endReplaceGroup();
                } else {
                    composer2.startReplaceGroup(38903154);
                    SurfaceKt.m2905SurfaceT9BRK9s(null, RoundedCornerShapeKt.m1312RoundedCornerShape0680j_4(Dp.m7813constructorimpl(12.0f)), Color.m5151copywmQWz5c$default(companion6.m5178getBlack0d7_KjU(), 0.6f, 0.0f, 0.0f, 0.0f, 14, null), 0L, 0.0f, 0.0f, null, ComposableLambdaKt.rememberComposableLambda(856023482, r3, new z1(str4, 6), composer2, 54), composer2, 12583296, Input.Keys.PAUSE);
                    composer2 = composer2;
                    Unit unit = Unit.INSTANCE;
                    composer2.endReplaceGroup();
                }
                composer2.endNode();
                composer2.endNode();
                composer2.endReplaceGroup();
            } else {
                i4 = 54;
                composer2.startReplaceGroup(145154463);
                composer2.endReplaceGroup();
            }
            if (oh1Var.i) {
                composer2.startReplaceGroup(145221113);
                Modifier modifierM1003paddingqDBjuR0$default = PaddingKt.m1003paddingqDBjuR0$default(SizeKt.fillMaxSize$default(Modifier.INSTANCE, 0.0f, r3, null), 0.0f, 0.0f, Dp.m7813constructorimpl(10.0f), Dp.m7813constructorimpl(200.0f), 3, null);
                MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy3 = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.INSTANCE.getBottomEnd(), false);
                long currentCompositeKeyHashCode4 = ComposablesKt.getCurrentCompositeKeyHashCode(composer2, 0);
                int i11 = (int) (currentCompositeKeyHashCode4 ^ (currentCompositeKeyHashCode4 >>> 32));
                CompositionLocalMap currentCompositionLocalMap4 = composer2.getCurrentCompositionLocalMap();
                Modifier modifierMaterializeModifier4 = ComposedModifierKt.materializeModifier(composer2, modifierM1003paddingqDBjuR0$default);
                ComposeUiNode.Companion companion7 = ComposeUiNode.INSTANCE;
                Function0<ComposeUiNode> constructor4 = companion7.getConstructor();
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
                mr.z(companion7, composerM4318constructorimpl4, measurePolicyMaybeCachedBoxMeasurePolicy3, composerM4318constructorimpl4, currentCompositionLocalMap4);
                Updater.m4326setimpl(composerM4318constructorimpl4, modifierMaterializeModifier4, (Function2<? super T, ? super Modifier, Unit>) id.h(companion7, composerM4318constructorimpl4, Integer.valueOf(i11), composerM4318constructorimpl4));
                BoxScopeInstance boxScopeInstance3 = BoxScopeInstance.INSTANCE;
                long jM5151copywmQWz5c$default = Color.m5151copywmQWz5c$default(Color.INSTANCE.m5178getBlack0d7_KjU(), 0.62f, 0.0f, 0.0f, 0.0f, 14, null);
                RoundedCornerShape roundedCornerShapeM1312RoundedCornerShape0680j_4 = RoundedCornerShapeKt.m1312RoundedCornerShape0680j_4(Dp.m7813constructorimpl(18.0f));
                ComposableLambda composableLambdaRememberComposableLambda = ComposableLambdaKt.rememberComposableLambda(1453553817, r3, new a5(oh1Var, 24), composer2, i4);
                Composer composer5 = composer2;
                obj2 = null;
                f2 = 0.0f;
                SurfaceKt.m2905SurfaceT9BRK9s(null, roundedCornerShapeM1312RoundedCornerShape0680j_4, jM5151copywmQWz5c$default, 0L, 0.0f, 0.0f, null, composableLambdaRememberComposableLambda, composer5, 12583296, Input.Keys.PAUSE);
                composer2 = composer5;
                composer2.endNode();
                composer2.endReplaceGroup();
            } else {
                f2 = 0.0f;
                obj2 = null;
                composer2.startReplaceGroup(145872671);
                composer2.endReplaceGroup();
            }
            if (z5) {
                composer2.startReplaceGroup(145918117);
                Modifier modifierM1003paddingqDBjuR0$default2 = PaddingKt.m1003paddingqDBjuR0$default(SizeKt.fillMaxSize$default(Modifier.INSTANCE, f2, r3, obj2), 0.0f, Dp.m7813constructorimpl(18.0f), 0.0f, 0.0f, 13, null);
                MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy4 = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.INSTANCE.getTopCenter(), false);
                long currentCompositeKeyHashCode5 = ComposablesKt.getCurrentCompositeKeyHashCode(composer2, 0);
                int i12 = (int) ((currentCompositeKeyHashCode5 >>> 32) ^ currentCompositeKeyHashCode5);
                CompositionLocalMap currentCompositionLocalMap5 = composer2.getCurrentCompositionLocalMap();
                Modifier modifierMaterializeModifier5 = ComposedModifierKt.materializeModifier(composer2, modifierM1003paddingqDBjuR0$default2);
                ComposeUiNode.Companion companion8 = ComposeUiNode.INSTANCE;
                Function0<ComposeUiNode> constructor5 = companion8.getConstructor();
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
                mr.z(companion8, composerM4318constructorimpl5, measurePolicyMaybeCachedBoxMeasurePolicy4, composerM4318constructorimpl5, currentCompositionLocalMap5);
                Updater.m4326setimpl(composerM4318constructorimpl5, modifierMaterializeModifier5, (Function2<? super T, ? super Modifier, Unit>) id.h(companion8, composerM4318constructorimpl5, Integer.valueOf(i12), composerM4318constructorimpl5));
                BoxScopeInstance boxScopeInstance4 = BoxScopeInstance.INSTANCE;
                Composer composer6 = composer2;
                TextKt.m3048TextNvy7gAk(oh1Var.o, null, Color.INSTANCE.m5189getWhite0d7_KjU(), null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, composer6, RendererCapabilities.DECODER_SUPPORT_MASK, 0, 262138);
                composer2 = composer6;
                composer2.endNode();
                composer2.endReplaceGroup();
            } else {
                composer2.startReplaceGroup(146219871);
                composer2.endReplaceGroup();
            }
            if (z6 || z7 || z8) {
                composer2.startReplaceGroup(146302827);
                Modifier.Companion companion9 = Modifier.INSTANCE;
                Modifier modifierM1003paddingqDBjuR0$default3 = PaddingKt.m1003paddingqDBjuR0$default(SizeKt.fillMaxSize$default(companion9, f2, r3, obj2), 0.0f, Dp.m7813constructorimpl(18.0f), Dp.m7813constructorimpl(24.0f), 0.0f, 9, null);
                Alignment.Companion companion10 = Alignment.INSTANCE;
                MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy5 = BoxKt.maybeCachedBoxMeasurePolicy(companion10.getTopEnd(), false);
                long currentCompositeKeyHashCode6 = ComposablesKt.getCurrentCompositeKeyHashCode(composer2, 0);
                int i13 = (int) (currentCompositeKeyHashCode6 ^ (currentCompositeKeyHashCode6 >>> 32));
                CompositionLocalMap currentCompositionLocalMap6 = composer2.getCurrentCompositionLocalMap();
                Modifier modifierMaterializeModifier6 = ComposedModifierKt.materializeModifier(composer2, modifierM1003paddingqDBjuR0$default3);
                ComposeUiNode.Companion companion11 = ComposeUiNode.INSTANCE;
                Function0<ComposeUiNode> constructor6 = companion11.getConstructor();
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
                mr.z(companion11, composerM4318constructorimpl6, measurePolicyMaybeCachedBoxMeasurePolicy5, composerM4318constructorimpl6, currentCompositionLocalMap6);
                Updater.m4326setimpl(composerM4318constructorimpl6, modifierMaterializeModifier6, (Function2<? super T, ? super Modifier, Unit>) id.h(companion11, composerM4318constructorimpl6, Integer.valueOf(i13), composerM4318constructorimpl6));
                BoxScopeInstance boxScopeInstance5 = BoxScopeInstance.INSTANCE;
                MeasurePolicy measurePolicyRowMeasurePolicy = RowKt.rowMeasurePolicy(Arrangement.INSTANCE.m712spacedBy0680j_4(Dp.m7813constructorimpl(14.0f)), companion10.getCenterVertically(), composer2, 54);
                long currentCompositeKeyHashCode7 = ComposablesKt.getCurrentCompositeKeyHashCode(composer2, 0);
                int i14 = (int) (currentCompositeKeyHashCode7 ^ (currentCompositeKeyHashCode7 >>> 32));
                CompositionLocalMap currentCompositionLocalMap7 = composer2.getCurrentCompositionLocalMap();
                Modifier modifierMaterializeModifier7 = ComposedModifierKt.materializeModifier(composer2, companion9);
                Function0<ComposeUiNode> constructor7 = companion11.getConstructor();
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
                mr.z(companion11, composerM4318constructorimpl7, measurePolicyRowMeasurePolicy, composerM4318constructorimpl7, currentCompositionLocalMap7);
                Updater.m4326setimpl(composerM4318constructorimpl7, modifierMaterializeModifier7, (Function2<? super T, ? super Modifier, Unit>) id.h(companion11, composerM4318constructorimpl7, Integer.valueOf(i14), composerM4318constructorimpl7));
                RowScopeInstance rowScopeInstance = RowScopeInstance.INSTANCE;
                if (z6) {
                    composer2.startReplaceGroup(-1854309270);
                    Composer composer7 = composer2;
                    TextKt.m3048TextNvy7gAk(str == 0 ? "" : str, null, Color.INSTANCE.m5189getWhite0d7_KjU(), null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, composer7, RendererCapabilities.DECODER_SUPPORT_MASK, 0, 262138);
                    composer2 = composer7;
                    composer2.endReplaceGroup();
                } else {
                    composer2.startReplaceGroup(-1854136290);
                    composer2.endReplaceGroup();
                }
                if (z7) {
                    composer2.startReplaceGroup(-1854094378);
                    Composer composer8 = composer2;
                    TextKt.m3048TextNvy7gAk(oh1Var.s, null, Color.INSTANCE.m5189getWhite0d7_KjU(), null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, composer8, RendererCapabilities.DECODER_SUPPORT_MASK, 0, 262138);
                    composer2 = composer8;
                    composer2.endReplaceGroup();
                } else {
                    composer2.startReplaceGroup(-1853932930);
                    composer2.endReplaceGroup();
                }
                if (z8) {
                    composer2.startReplaceGroup(-1853769000);
                    Composer composer9 = composer2;
                    TextKt.m3048TextNvy7gAk(oh1Var.u, null, Color.INSTANCE.m5189getWhite0d7_KjU(), null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, composer9, RendererCapabilities.DECODER_SUPPORT_MASK, 0, 262138);
                    composer2 = composer9;
                    composer2.endReplaceGroup();
                } else {
                    composer2.startReplaceGroup(-1853769001);
                    composer2.endReplaceGroup();
                }
                composer2.endNode();
                composer2.endNode();
                composer2.endReplaceGroup();
            } else {
                composer2.startReplaceGroup(147090847);
                composer2.endReplaceGroup();
            }
            if (z9) {
                composer2.startReplaceGroup(-1853000000);
                Modifier modifierM1003paddingqDBjuR0$defaultBottom = PaddingKt.m1003paddingqDBjuR0$default(SizeKt.fillMaxSize$default(Modifier.INSTANCE, f2, r3, obj2), 0.0f, f2, Dp.m7813constructorimpl(16.0f), Dp.m7813constructorimpl(16.0f), 5, null);
                MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy4 = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.INSTANCE.getBottomEnd(), false);
                long currentCompositeKeyHashCode5 = ComposablesKt.getCurrentCompositeKeyHashCode(composer2, 0);
                int i12 = (int) ((currentCompositeKeyHashCode5 >>> 32) ^ currentCompositeKeyHashCode5);
                CompositionLocalMap currentCompositionLocalMap5 = composer2.getCurrentCompositionLocalMap();
                Modifier modifierMaterializeModifier5 = ComposedModifierKt.materializeModifier(composer2, modifierM1003paddingqDBjuR0$defaultBottom);
                ComposeUiNode.Companion companion8 = ComposeUiNode.INSTANCE;
                Function0<ComposeUiNode> constructor5 = companion8.getConstructor();
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
                mr.z(companion8, composerM4318constructorimpl5, measurePolicyMaybeCachedBoxMeasurePolicy4, composerM4318constructorimpl5, currentCompositionLocalMap5);
                Updater.m4326setimpl(composerM4318constructorimpl5, modifierMaterializeModifier5, (Function2<? super T, ? super Modifier, Unit>) id.h(companion8, composerM4318constructorimpl5, Integer.valueOf(i12), composerM4318constructorimpl5));
                BoxScopeInstance boxScopeInstance4 = BoxScopeInstance.INSTANCE;
                Composer composer6 = composer2;
                TextKt.m3048TextNvy7gAk(oh1Var.o, null, Color.INSTANCE.m5189getWhite0d7_KjU(), null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, composer6, RendererCapabilities.DECODER_SUPPORT_MASK, 0, 262138);
                composer2 = composer6;
                composer2.endNode();
                composer2.endReplaceGroup();
            } else {
                composer2.startReplaceGroup(-1853000001);
                composer2.endReplaceGroup();
            }
            if (z8) {
                composer2.startReplaceGroup(-1852000000);
                Modifier modifierM1003paddingqDBjuR0$defaultBottomLeft = PaddingKt.m1003paddingqDBjuR0$default(SizeKt.fillMaxSize$default(Modifier.INSTANCE, f2, r3, obj2), Dp.m7813constructorimpl(16.0f), f2, Dp.m7813constructorimpl(16.0f), 0.0f, 10, null);
                MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy4 = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.INSTANCE.getBottomStart(), false);
                long currentCompositeKeyHashCode5 = ComposablesKt.getCurrentCompositeKeyHashCode(composer2, 0);
                int i12 = (int) ((currentCompositeKeyHashCode5 >>> 32) ^ currentCompositeKeyHashCode5);
                CompositionLocalMap currentCompositionLocalMap5 = composer2.getCurrentCompositionLocalMap();
                Modifier modifierMaterializeModifier5 = ComposedModifierKt.materializeModifier(composer2, modifierM1003paddingqDBjuR0$defaultBottomLeft);
                ComposeUiNode.Companion companion8 = ComposeUiNode.INSTANCE;
                Function0<ComposeUiNode> constructor5 = companion8.getConstructor();
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
                mr.z(companion8, composerM4318constructorimpl5, measurePolicyMaybeCachedBoxMeasurePolicy4, composerM4318constructorimpl5, currentCompositionLocalMap5);
                Updater.m4326setimpl(composerM4318constructorimpl5, modifierMaterializeModifier5, (Function2<? super T, ? super Modifier, Unit>) id.h(companion8, composerM4318constructorimpl5, Integer.valueOf(i12), composerM4318constructorimpl5));
                BoxScopeInstance boxScopeInstance4 = BoxScopeInstance.INSTANCE;
                Composer composer6 = composer2;
                TextKt.m3048TextNvy7gAk(oh1Var.u, null, Color.INSTANCE.m5189getWhite0d7_KjU(), null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, composer6, RendererCapabilities.DECODER_SUPPORT_MASK, 0, 262138);
                composer2 = composer6;
                composer2.endNode();
                composer2.endReplaceGroup();
            } else {
                composer2.startReplaceGroup(-1852000001);
                composer2.endReplaceGroup();
            }
            if (id.u(composer2, (i5 >> 3) & 14, function2)) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composer2 = composerStartRestartGroup;
            composer2.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new e81(oh1Var, function2, i, 9));
        }
    }

    public static final void d(boolean z, fj1 fj1Var, gj1 gj1Var, Composer composer, int i) {
        int i2;
        Composer composerStartRestartGroup = composer.startRestartGroup(523862599);
        if ((i & 6) == 0) {
            i2 = (composerStartRestartGroup.changed(z) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= composerStartRestartGroup.changedInstance(fj1Var) ? 32 : 16;
        }
        if ((i & RendererCapabilities.DECODER_SUPPORT_MASK) == 0) {
            i2 |= composerStartRestartGroup.changedInstance(gj1Var) ? 256 : 128;
        }
        if (composerStartRestartGroup.shouldExecute((i2 & Input.Keys.NUMPAD_3) != 146, i2 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(523862599, i2, -1, "com.dh.myembyapp.ui.screens.player.PlayerVideoSurface (PlayerPlaybackContent.kt:362)");
            }
            composerStartRestartGroup.startMovableGroup(920790350, Boolean.valueOf(z));
            AndroidView_androidKt.AndroidView(fj1Var, SizeKt.fillMaxSize$default(Modifier.INSTANCE, 0.0f, 1, null), gj1Var, composerStartRestartGroup, ((i2 >> 3) & 14) | 48 | (i2 & 896), 0);
            composerStartRestartGroup.endMovableGroup();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new kw0(z, fj1Var, gj1Var, i, 1));
        }
    }
}
