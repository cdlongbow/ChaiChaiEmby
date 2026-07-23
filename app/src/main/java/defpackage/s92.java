package defpackage;

import androidx.compose.animation.core.AnimateAsStateKt;
import androidx.compose.foundation.BackgroundKt;
import androidx.compose.foundation.BorderKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnScopeInstance;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.RowKt;
import androidx.compose.foundation.layout.RowScopeInstance;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.shape.RoundedCornerShape;
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
import androidx.compose.runtime.State;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.draw.ClipKt;
import androidx.compose.ui.draw.ScaleKt;
import androidx.compose.ui.focus.FocusChangedModifierKt;
import androidx.compose.ui.focus.FocusRequester;
import androidx.compose.ui.focus.FocusRequesterModifierKt;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.ColorKt;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.text.font.FontWeight;
import androidx.compose.ui.text.style.TextOverflow;
import androidx.compose.ui.unit.Dp;
import androidx.compose.ui.unit.TextUnitKt;
import androidx.media3.exoplayer.RendererCapabilities;
import com.dh.myembyapp.data.model.TraktCloudPlaybackProgress;
import java.util.Arrays;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.ranges.RangesKt;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: loaded from: classes4.dex */
public abstract class s92 {
    public static final void a(fo1 fo1Var, Function0 function0, Function0 function1, boolean z, Composer composer, int i) {
        int i2;
        Composer composer2;
        long j = fo1Var.c;
        function0.getClass();
        function1.getClass();
        Composer composerStartRestartGroup = composer.startRestartGroup(-1132652353);
        if ((i & 6) == 0) {
            i2 = (composerStartRestartGroup.changedInstance(fo1Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= composerStartRestartGroup.changedInstance(function0) ? 32 : 16;
        }
        if ((i & RendererCapabilities.DECODER_SUPPORT_MASK) == 0) {
            i2 |= composerStartRestartGroup.changedInstance(function1) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= composerStartRestartGroup.changed(z) ? 2048 : 1024;
        }
        if (composerStartRestartGroup.shouldExecute((i2 & 1171) != 1170, i2 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1132652353, i2, -1, "com.dh.myembyapp.ui.screens.player.components.TraktCloudProgressPrompt (TraktProgressPrompt.kt:119)");
            }
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            Composer.Companion companion = Composer.INSTANCE;
            if (objRememberedValue == companion.getEmpty()) {
                objRememberedValue = mr.n(composerStartRestartGroup);
            }
            FocusRequester focusRequester = (FocusRequester) objRememberedValue;
            Unit unit = Unit.INSTANCE;
            Object objRememberedValue2 = composerStartRestartGroup.rememberedValue();
            if (objRememberedValue2 == companion.getEmpty()) {
                objRememberedValue2 = new ji(focusRequester, null, 21);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
            }
            EffectsKt.LaunchedEffect(unit, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) objRememberedValue2, composerStartRestartGroup, 6);
            TraktCloudPlaybackProgress traktCloudPlaybackProgress = fo1Var.d;
            boolean zChanged = composerStartRestartGroup.changed(j);
            Object objRememberedValue3 = composerStartRestartGroup.rememberedValue();
            if (zChanged || objRememberedValue3 == companion.getEmpty()) {
                objRememberedValue3 = c(j);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
            }
            String str = (String) objRememberedValue3;
            boolean zChanged2 = composerStartRestartGroup.changed(traktCloudPlaybackProgress.getPositionTicks());
            Object objRememberedValue4 = composerStartRestartGroup.rememberedValue();
            if (zChanged2 || objRememberedValue4 == companion.getEmpty()) {
                objRememberedValue4 = c(traktCloudPlaybackProgress.getPositionTicks());
                composerStartRestartGroup.updateRememberedValue(objRememberedValue4);
            }
            String str2 = (String) objRememberedValue4;
            boolean zChanged3 = composerStartRestartGroup.changed(traktCloudPlaybackProgress.getProgressPercent());
            Object objRememberedValue5 = composerStartRestartGroup.rememberedValue();
            if (zChanged3 || objRememberedValue5 == companion.getEmpty()) {
                objRememberedValue5 = String.format("%.1f", Arrays.copyOf(new Object[]{Double.valueOf(traktCloudPlaybackProgress.getProgressPercent())}, 1)).concat("%");
                composerStartRestartGroup.updateRememberedValue(objRememberedValue5);
            }
            String str3 = (String) objRememberedValue5;
            Modifier.Companion companion2 = Modifier.INSTANCE;
            Modifier modifierFillMaxSize$default = SizeKt.fillMaxSize$default(companion2, 0.0f, 1, null);
            Color.Companion companion3 = Color.INSTANCE;
            Modifier modifierM275backgroundbw27NRU$default = BackgroundKt.m275backgroundbw27NRU$default(modifierFillMaxSize$default, Color.m5151copywmQWz5c$default(companion3.m5178getBlack0d7_KjU(), z ? 0.58f : 1.0f, 0.0f, 0.0f, 0.0f, 14, null), null, 2, null);
            Alignment.Companion companion4 = Alignment.INSTANCE;
            MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(companion4.getCenter(), false);
            long currentCompositeKeyHashCode = ComposablesKt.getCurrentCompositeKeyHashCode(composerStartRestartGroup, 0);
            int i3 = (int) (currentCompositeKeyHashCode ^ (currentCompositeKeyHashCode >>> 32));
            CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifierM275backgroundbw27NRU$default);
            ComposeUiNode.Companion companion5 = ComposeUiNode.INSTANCE;
            Function0<ComposeUiNode> constructor = companion5.getConstructor();
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
            mr.z(companion5, composerM4318constructorimpl, measurePolicyMaybeCachedBoxMeasurePolicy, composerM4318constructorimpl, currentCompositionLocalMap);
            Updater.m4326setimpl(composerM4318constructorimpl, modifierMaterializeModifier, (Function2<? super T, ? super Modifier, Unit>) id.h(companion5, composerM4318constructorimpl, Integer.valueOf(i3), composerM4318constructorimpl));
            BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
            Modifier modifierM999padding3ABfNKs = PaddingKt.m999padding3ABfNKs(BorderKt.m286borderxT4_qwU(BackgroundKt.m275backgroundbw27NRU$default(ClipKt.clip(SizeKt.m1069width3ABfNKs(companion2, Dp.m7813constructorimpl(560.0f)), RoundedCornerShapeKt.m1312RoundedCornerShape0680j_4(Dp.m7813constructorimpl(10.0f))), ColorKt.Color(3994359061L), null, 2, null), Dp.m7813constructorimpl(1.0f), Color.m5151copywmQWz5c$default(companion3.m5189getWhite0d7_KjU(), 0.24f, 0.0f, 0.0f, 0.0f, 14, null), RoundedCornerShapeKt.m1312RoundedCornerShape0680j_4(Dp.m7813constructorimpl(10.0f))), Dp.m7813constructorimpl(24.0f));
            Arrangement arrangement = Arrangement.INSTANCE;
            MeasurePolicy measurePolicyColumnMeasurePolicy = ColumnKt.columnMeasurePolicy(arrangement.m712spacedBy0680j_4(Dp.m7813constructorimpl(16.0f)), companion4.getStart(), composerStartRestartGroup, 6);
            long currentCompositeKeyHashCode2 = ComposablesKt.getCurrentCompositeKeyHashCode(composerStartRestartGroup, 0);
            int i4 = (int) (currentCompositeKeyHashCode2 ^ (currentCompositeKeyHashCode2 >>> 32));
            CompositionLocalMap currentCompositionLocalMap2 = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier2 = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifierM999padding3ABfNKs);
            Function0<ComposeUiNode> constructor2 = companion5.getConstructor();
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
            mr.z(companion5, composerM4318constructorimpl2, measurePolicyColumnMeasurePolicy, composerM4318constructorimpl2, currentCompositionLocalMap2);
            Updater.m4326setimpl(composerM4318constructorimpl2, modifierMaterializeModifier2, (Function2<? super T, ? super Modifier, Unit>) id.h(companion5, composerM4318constructorimpl2, Integer.valueOf(i4), composerM4318constructorimpl2));
            ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.INSTANCE;
            MaterialTheme materialTheme = MaterialTheme.INSTANCE;
            int i5 = MaterialTheme.$stable;
            int i6 = i2;
            TextKt.m3048TextNvy7gAk("发现 Trakt 云端播放进度", null, companion3.m5189getWhite0d7_KjU(), null, 0L, null, FontWeight.INSTANCE.getSemiBold(), null, 0L, null, null, 0L, 0, false, 0, 0, null, materialTheme.getTypography(composerStartRestartGroup, i5).getTitleMedium(), composerStartRestartGroup, 1573254, 0, 131002);
            TextKt.m3048TextNvy7gAk(fo1Var.a.getName(), null, Color.m5151copywmQWz5c$default(companion3.m5189getWhite0d7_KjU(), 0.9f, 0.0f, 0.0f, 0.0f, 14, null), null, 0L, null, null, null, 0L, null, null, 0L, TextOverflow.INSTANCE.m7761getEllipsisgIe3tQ8(), false, 2, 0, null, materialTheme.getTypography(composerStartRestartGroup, i5).getBodyLarge(), composerStartRestartGroup, RendererCapabilities.DECODER_SUPPORT_MASK, 24960, 110586);
            MeasurePolicy measurePolicyColumnMeasurePolicy2 = ColumnKt.columnMeasurePolicy(arrangement.m712spacedBy0680j_4(Dp.m7813constructorimpl(6.0f)), companion4.getStart(), composerStartRestartGroup, 6);
            long currentCompositeKeyHashCode3 = ComposablesKt.getCurrentCompositeKeyHashCode(composerStartRestartGroup, 0);
            int i7 = (int) (currentCompositeKeyHashCode3 ^ (currentCompositeKeyHashCode3 >>> 32));
            CompositionLocalMap currentCompositionLocalMap3 = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier3 = ComposedModifierKt.materializeModifier(composerStartRestartGroup, companion2);
            Function0<ComposeUiNode> constructor3 = companion5.getConstructor();
            if (composerStartRestartGroup.getApplier() == null) {
                ComposablesKt.invalidApplier();
            }
            composerStartRestartGroup.startReusableNode();
            if (composerStartRestartGroup.getInserting()) {
                composerStartRestartGroup.createNode(constructor3);
            } else {
                composerStartRestartGroup.useNode();
            }
            Composer composerM4318constructorimpl3 = Updater.m4318constructorimpl(composerStartRestartGroup);
            mr.z(companion5, composerM4318constructorimpl3, measurePolicyColumnMeasurePolicy2, composerM4318constructorimpl3, currentCompositionLocalMap3);
            Updater.m4326setimpl(composerM4318constructorimpl3, modifierMaterializeModifier3, (Function2<? super T, ? super Modifier, Unit>) id.h(companion5, composerM4318constructorimpl3, Integer.valueOf(i7), composerM4318constructorimpl3));
            StringBuilder sb = new StringBuilder("云端进度  ");
            sb.append(str2);
            TextKt.m3048TextNvy7gAk(s01.w(sb, "  ·  ", str3), null, Color.m5151copywmQWz5c$default(companion3.m5189getWhite0d7_KjU(), 0.86f, 0.0f, 0.0f, 0.0f, 14, null), null, TextUnitKt.getSp(17), null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, composerStartRestartGroup, 24960, 0, 262122);
            TextKt.m3048TextNvy7gAk(kb0.x("本地进度  ", str), null, Color.m5151copywmQWz5c$default(companion3.m5189getWhite0d7_KjU(), 0.68f, 0.0f, 0.0f, 0.0f, 14, null), null, TextUnitKt.getSp(16), null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, composerStartRestartGroup, 24960, 0, 262122);
            composerStartRestartGroup.endNode();
            Modifier modifierFillMaxWidth$default = SizeKt.fillMaxWidth$default(companion2, 0.0f, 1, null);
            MeasurePolicy measurePolicyRowMeasurePolicy = RowKt.rowMeasurePolicy(arrangement.m712spacedBy0680j_4(Dp.m7813constructorimpl(14.0f)), companion4.getTop(), composerStartRestartGroup, 6);
            long currentCompositeKeyHashCode4 = ComposablesKt.getCurrentCompositeKeyHashCode(composerStartRestartGroup, 0);
            int i8 = (int) (currentCompositeKeyHashCode4 ^ (currentCompositeKeyHashCode4 >>> 32));
            CompositionLocalMap currentCompositionLocalMap4 = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier4 = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifierFillMaxWidth$default);
            Function0<ComposeUiNode> constructor4 = companion5.getConstructor();
            if (composerStartRestartGroup.getApplier() == null) {
                ComposablesKt.invalidApplier();
            }
            composerStartRestartGroup.startReusableNode();
            if (composerStartRestartGroup.getInserting()) {
                composerStartRestartGroup.createNode(constructor4);
            } else {
                composerStartRestartGroup.useNode();
            }
            Composer composerM4318constructorimpl4 = Updater.m4318constructorimpl(composerStartRestartGroup);
            mr.z(companion5, composerM4318constructorimpl4, measurePolicyRowMeasurePolicy, composerM4318constructorimpl4, currentCompositionLocalMap4);
            Updater.m4326setimpl(composerM4318constructorimpl4, modifierMaterializeModifier4, (Function2<? super T, ? super Modifier, Unit>) id.h(companion5, composerM4318constructorimpl4, Integer.valueOf(i8), composerM4318constructorimpl4));
            RowScopeInstance rowScopeInstance = RowScopeInstance.INSTANCE;
            b(((i6 << 3) & 896) | 24630, 0, composerStartRestartGroup, SizeKt.m1050height3ABfNKs(zs1.E(rowScopeInstance, companion2, 1.0f, false, 2, null), Dp.m7813constructorimpl(48.0f)), focusRequester, "使用云端进度播放", function0, true);
            composer2 = composerStartRestartGroup;
            b((i6 & 896) | 54, 16, composerStartRestartGroup, SizeKt.m1050height3ABfNKs(zs1.E(rowScopeInstance, companion2, 1.0f, false, 2, null), Dp.m7813constructorimpl(48.0f)), null, "使用本地进度", function1, false);
            if (i02.w(composer2)) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composer2 = composerStartRestartGroup;
            composer2.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new u7(fo1Var, function0, function1, z, i, 11));
        }
    }

    /* JADX WARN: Code duplicated, block: B:46:0x007f  */
    /* JADX WARN: Code duplicated, block: B:47:0x0081  */
    /* JADX WARN: Code duplicated, block: B:50:0x008a  */
    /* JADX WARN: Code duplicated, block: B:52:0x008d  */
    /* JADX WARN: Code duplicated, block: B:55:0x0094  */
    /* JADX WARN: Code duplicated, block: B:58:0x00a6  */
    /* JADX WARN: Code duplicated, block: B:61:0x00bd  */
    /* JADX WARN: Code duplicated, block: B:62:0x00c1  */
    /* JADX WARN: Code duplicated, block: B:65:0x00fd  */
    /* JADX WARN: Code duplicated, block: B:66:0x0110  */
    /* JADX WARN: Code duplicated, block: B:70:0x013e  */
    /* JADX WARN: Code duplicated, block: B:73:0x014a  */
    /* JADX WARN: Code duplicated, block: B:74:0x014e  */
    /* JADX WARN: Code duplicated, block: B:77:0x016f  */
    /* JADX WARN: Code duplicated, block: B:80:0x0181  */
    /* JADX WARN: Code duplicated, block: B:83:0x0217  */
    /* JADX WARN: Code duplicated, block: B:84:0x021b  */
    /* JADX WARN: Code duplicated, block: B:87:0x0225  */
    /* JADX WARN: Code duplicated, block: B:89:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Multi-variable type inference failed */
    public static final void b(int i, int i2, Composer composer, Modifier modifier, FocusRequester focusRequester, String str, Function0 function0, boolean z) {
        int i3;
        FocusRequester focusRequester2;
        boolean z2;
        FocusRequester focusRequester3;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Object objRememberedValue;
        Composer.Companion companion;
        MutableState mutableState;
        float f;
        RoundedCornerShape RoundedCornerShape;
        Modifier modifierM286borderxT4_qwU;
        Function0<ComposeUiNode> constructor;
        Modifier modifierFocusRequester;
        Object objRememberedValue2;
        Composer composerStartRestartGroup = composer.startRestartGroup(894783520);
        if ((i & 6) == 0) {
            i3 = (composerStartRestartGroup.changed(str) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            i3 |= composerStartRestartGroup.changed(z) ? 32 : 16;
        }
        if ((i & RendererCapabilities.DECODER_SUPPORT_MASK) == 0) {
            i3 |= composerStartRestartGroup.changedInstance(function0) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i3 |= composerStartRestartGroup.changed(modifier) ? 2048 : 1024;
        }
        int i4 = i2 & 16;
        if (i4 == 0) {
            if ((i & 24576) == 0) {
                focusRequester2 = focusRequester;
                i3 |= composerStartRestartGroup.changed(focusRequester2) ? 16384 : 8192;
            }
            if ((i3 & 9363) != 9362) {
                z2 = true;
            } else {
                z2 = false;
            }
            if (composerStartRestartGroup.shouldExecute(z2, i3 & 1)) {
                if (i4 != 0) {
                    focusRequester2 = null;
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(894783520, i3, -1, "com.dh.myembyapp.ui.screens.player.components.TraktProgressChoiceButton (TraktProgressPrompt.kt:60)");
                }
                objRememberedValue = composerStartRestartGroup.rememberedValue();
                companion = Composer.INSTANCE;
                if (objRememberedValue == companion.getEmpty()) {
                    objRememberedValue = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Boolean.FALSE, null, 2, null);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                }
                mutableState = (MutableState) objRememberedValue;
                if (((Boolean) mutableState.getValue()).booleanValue()) {
                    f = 1.06f;
                } else {
                    f = 1.0f;
                }
                float f2 = f;
                focusRequester3 = focusRequester2;
                State<Float> stateAnimateFloatAsState = AnimateAsStateKt.animateFloatAsState(f2, null, 0.0f, null, null, composerStartRestartGroup, 0, 30);
                RoundedCornerShape = RoundedCornerShapeKt.RoundedCornerShape(50);
                Modifier modifierScale = ScaleKt.scale(modifier, stateAnimateFloatAsState.getValue().floatValue());
                if (((Boolean) mutableState.getValue()).booleanValue()) {
                    modifierM286borderxT4_qwU = BorderKt.m286borderxT4_qwU(Modifier.INSTANCE, Dp.m7813constructorimpl(2.0f), Color.INSTANCE.m5189getWhite0d7_KjU(), RoundedCornerShape);
                } else {
                    modifierM286borderxT4_qwU = Modifier.INSTANCE;
                }
                Modifier modifierThen = modifierScale.then(modifierM286borderxT4_qwU);
                MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.INSTANCE.getTopStart(), false);
                long currentCompositeKeyHashCode = ComposablesKt.getCurrentCompositeKeyHashCode(composerStartRestartGroup, 0);
                int i5 = (int) (currentCompositeKeyHashCode ^ (currentCompositeKeyHashCode >>> 32));
                CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
                Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifierThen);
                ComposeUiNode.Companion companion2 = ComposeUiNode.INSTANCE;
                constructor = companion2.getConstructor();
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
                mr.z(companion2, composerM4318constructorimpl, measurePolicyMaybeCachedBoxMeasurePolicy, composerM4318constructorimpl, currentCompositionLocalMap);
                Updater.m4326setimpl(composerM4318constructorimpl, modifierMaterializeModifier, (Function2<? super T, ? super Modifier, Unit>) id.h(companion2, composerM4318constructorimpl, Integer.valueOf(i5), composerM4318constructorimpl));
                BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
                modifierFocusRequester = Modifier.INSTANCE;
                Modifier modifierFillMaxSize$default = SizeKt.fillMaxSize$default(modifierFocusRequester, 0.0f, 1, null);
                if (focusRequester3 != null) {
                    modifierFocusRequester = FocusRequesterModifierKt.focusRequester(modifierFocusRequester, focusRequester3);
                }
                Modifier modifierThen2 = modifierFillMaxSize$default.then(modifierFocusRequester);
                objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                if (objRememberedValue2 == companion.getEmpty()) {
                    objRememberedValue2 = new b42(9, mutableState);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                }
                Modifier modifierOnFocusChanged = FocusChangedModifierKt.onFocusChanged(modifierThen2, (Function1) objRememberedValue2);
                ButtonDefaults buttonDefaults = ButtonDefaults.INSTANCE;
                ButtonKt.m8231ButtonTCVpFMg(function0, modifierOnFocusChanged, null, false, ButtonDefaults.scale$default(buttonDefaults, 1.0f, 1.0f, 0.0f, 0.0f, 0.0f, 28, null), null, ButtonDefaults.shape$default(buttonDefaults, RoundedCornerShape, null, null, null, null, 30, null), hc2.r(z, ColorKt.Color(4282532418L), composerStartRestartGroup, ((i3 >> 3) & 14) | RendererCapabilities.DECODER_SUPPORT_MASK, 2), 0.0f, null, PaddingKt.m993PaddingValuesYgX7TsA(Dp.m7813constructorimpl(14.0f), Dp.m7813constructorimpl(8.0f)), null, ComposableLambdaKt.rememberComposableLambda(97970454, true, new e8(4, mutableState, str), composerStartRestartGroup, 54), composerStartRestartGroup, (i3 >> 6) & 14, 390, 2860);
                composerStartRestartGroup = composerStartRestartGroup;
                composerStartRestartGroup.endNode();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
            } else {
                composerStartRestartGroup.skipToGroupEnd();
                focusRequester3 = focusRequester2;
            }
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup != null) {
                scopeUpdateScopeEndRestartGroup.updateScope(new yb1(str, z, function0, modifier, focusRequester3, i, i2));
            }
        }
        i3 |= 24576;
        focusRequester2 = focusRequester;
        if ((i3 & 9363) != 9362) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (composerStartRestartGroup.shouldExecute(z2, i3 & 1)) {
            if (i4 != 0) {
                focusRequester2 = null;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(894783520, i3, -1, "com.dh.myembyapp.ui.screens.player.components.TraktProgressChoiceButton (TraktProgressPrompt.kt:60)");
            }
            objRememberedValue = composerStartRestartGroup.rememberedValue();
            companion = Composer.INSTANCE;
            if (objRememberedValue == companion.getEmpty()) {
                objRememberedValue = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Boolean.FALSE, null, 2, null);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            mutableState = (MutableState) objRememberedValue;
            if (((Boolean) mutableState.getValue()).booleanValue()) {
                f = 1.06f;
            } else {
                f = 1.0f;
            }
            float f3 = f;
            focusRequester3 = focusRequester2;
            State<Float> stateAnimateFloatAsState2 = AnimateAsStateKt.animateFloatAsState(f3, null, 0.0f, null, null, composerStartRestartGroup, 0, 30);
            RoundedCornerShape = RoundedCornerShapeKt.RoundedCornerShape(50);
            Modifier modifierScale2 = ScaleKt.scale(modifier, stateAnimateFloatAsState2.getValue().floatValue());
            if (((Boolean) mutableState.getValue()).booleanValue()) {
                modifierM286borderxT4_qwU = BorderKt.m286borderxT4_qwU(Modifier.INSTANCE, Dp.m7813constructorimpl(2.0f), Color.INSTANCE.m5189getWhite0d7_KjU(), RoundedCornerShape);
            } else {
                modifierM286borderxT4_qwU = Modifier.INSTANCE;
            }
            Modifier modifierThen3 = modifierScale2.then(modifierM286borderxT4_qwU);
            MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy2 = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.INSTANCE.getTopStart(), false);
            long currentCompositeKeyHashCode2 = ComposablesKt.getCurrentCompositeKeyHashCode(composerStartRestartGroup, 0);
            int i6 = (int) (currentCompositeKeyHashCode2 ^ (currentCompositeKeyHashCode2 >>> 32));
            CompositionLocalMap currentCompositionLocalMap2 = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier2 = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifierThen3);
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
            Composer composerM4318constructorimpl2 = Updater.m4318constructorimpl(composerStartRestartGroup);
            mr.z(companion3, composerM4318constructorimpl2, measurePolicyMaybeCachedBoxMeasurePolicy2, composerM4318constructorimpl2, currentCompositionLocalMap2);
            Updater.m4326setimpl(composerM4318constructorimpl2, modifierMaterializeModifier2, (Function2<? super T, ? super Modifier, Unit>) id.h(companion3, composerM4318constructorimpl2, Integer.valueOf(i6), composerM4318constructorimpl2));
            BoxScopeInstance boxScopeInstance2 = BoxScopeInstance.INSTANCE;
            modifierFocusRequester = Modifier.INSTANCE;
            Modifier modifierFillMaxSize$default2 = SizeKt.fillMaxSize$default(modifierFocusRequester, 0.0f, 1, null);
            if (focusRequester3 != null) {
                modifierFocusRequester = FocusRequesterModifierKt.focusRequester(modifierFocusRequester, focusRequester3);
            }
            Modifier modifierThen4 = modifierFillMaxSize$default2.then(modifierFocusRequester);
            objRememberedValue2 = composerStartRestartGroup.rememberedValue();
            if (objRememberedValue2 == companion.getEmpty()) {
                objRememberedValue2 = new b42(9, mutableState);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
            }
            Modifier modifierOnFocusChanged2 = FocusChangedModifierKt.onFocusChanged(modifierThen4, (Function1) objRememberedValue2);
            ButtonDefaults buttonDefaults2 = ButtonDefaults.INSTANCE;
            ButtonKt.m8231ButtonTCVpFMg(function0, modifierOnFocusChanged2, null, false, ButtonDefaults.scale$default(buttonDefaults2, 1.0f, 1.0f, 0.0f, 0.0f, 0.0f, 28, null), null, ButtonDefaults.shape$default(buttonDefaults2, RoundedCornerShape, null, null, null, null, 30, null), hc2.r(z, ColorKt.Color(4282532418L), composerStartRestartGroup, ((i3 >> 3) & 14) | RendererCapabilities.DECODER_SUPPORT_MASK, 2), 0.0f, null, PaddingKt.m993PaddingValuesYgX7TsA(Dp.m7813constructorimpl(14.0f), Dp.m7813constructorimpl(8.0f)), null, ComposableLambdaKt.rememberComposableLambda(97970454, true, new e8(4, mutableState, str), composerStartRestartGroup, 54), composerStartRestartGroup, (i3 >> 6) & 14, 390, 2860);
            composerStartRestartGroup = composerStartRestartGroup;
            composerStartRestartGroup.endNode();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
            focusRequester3 = focusRequester2;
        }
        scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new yb1(str, z, function0, modifier, focusRequester3, i, i2));
        }
    }

    public static final String c(long j) {
        long jCoerceAtLeast = RangesKt.coerceAtLeast(j / 10000000, 0L);
        long j2 = jCoerceAtLeast / 3600;
        long j3 = (jCoerceAtLeast % 3600) / 60;
        long j4 = jCoerceAtLeast % 60;
        return j2 > 0 ? String.format("%d:%02d:%02d", Arrays.copyOf(new Object[]{Long.valueOf(j2), Long.valueOf(j3), Long.valueOf(j4)}, 3)) : String.format("%02d:%02d", Arrays.copyOf(new Object[]{Long.valueOf(j3), Long.valueOf(j4)}, 2));
    }
}
