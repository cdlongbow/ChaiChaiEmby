package defpackage;

import androidx.compose.animation.core.AnimateAsStateKt;
import androidx.compose.foundation.BorderKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.RowScopeInstance;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.shape.RoundedCornerShapeKt;
import androidx.compose.material3.IconButtonKt;
import androidx.compose.material3.TextKt;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.DisposableEffectResult;
import androidx.compose.runtime.DisposableEffectScope;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.MutableFloatState;
import androidx.compose.runtime.MutableIntState;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.PrimitiveSnapshotStateKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SnapshotIntStateKt;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.State;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.draw.ScaleKt;
import androidx.compose.ui.focus.FocusChangedModifierKt;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.ColorKt;
import androidx.compose.ui.input.key.KeyInputModifierKt;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.text.font.FontWeight;
import androidx.compose.ui.unit.Dp;
import androidx.compose.ui.unit.TextUnitKt;
import androidx.compose.ui.window.AndroidDialog_androidKt;
import androidx.compose.ui.window.DialogProperties;
import androidx.media3.exoplayer.RendererCapabilities;
import androidx.media3.exoplayer.upstream.CmcdData;

import com.dh.myembyapp.data.DanmakuSettings;
import java.util.Arrays;
import kotlin.Unit;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.StringCompanionObject;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: loaded from: classes4.dex */
public abstract class gz {
    public static final void a(DanmakuSettings danmakuSettings, Function1 function1, Function0 function0, Function1 function2, Composer composer, int i) {
        DanmakuSettings danmakuSettings2;
        int i2;
        Function1 function3;
        danmakuSettings.getClass();
        function0.getClass();
        function2.getClass();
        Composer composerStartRestartGroup = composer.startRestartGroup(-1569145287);
        if ((i & 6) == 0) {
            danmakuSettings2 = danmakuSettings;
            i2 = (composerStartRestartGroup.changed(danmakuSettings2) ? 4 : 2) | i;
        } else {
            danmakuSettings2 = danmakuSettings;
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= composerStartRestartGroup.changedInstance(function1) ? 32 : 16;
        }
        if ((i & RendererCapabilities.DECODER_SUPPORT_MASK) == 0) {
            i2 |= composerStartRestartGroup.changedInstance(function0) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            function3 = function2;
            i2 |= composerStartRestartGroup.changedInstance(function3) ? 2048 : 1024;
        } else {
            function3 = function2;
        }
        if (composerStartRestartGroup.shouldExecute((i2 & 1171) != 1170, i2 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1569145287, i2, -1, "com.dh.myembyapp.ui.components.DanmakuSettingsDialog (DanmakuSettingsDialog.kt:48)");
            }
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            Composer.Companion companion = Composer.INSTANCE;
            if (objRememberedValue == companion.getEmpty()) {
                objRememberedValue = PrimitiveSnapshotStateKt.mutableFloatStateOf(danmakuSettings2.getSpeed());
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            MutableFloatState mutableFloatState = (MutableFloatState) objRememberedValue;
            Object objRememberedValue2 = composerStartRestartGroup.rememberedValue();
            if (objRememberedValue2 == companion.getEmpty()) {
                objRememberedValue2 = PrimitiveSnapshotStateKt.mutableFloatStateOf(danmakuSettings2.getSize());
                composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
            }
            MutableFloatState mutableFloatState2 = (MutableFloatState) objRememberedValue2;
            Object objRememberedValue3 = composerStartRestartGroup.rememberedValue();
            if (objRememberedValue3 == companion.getEmpty()) {
                objRememberedValue3 = SnapshotIntStateKt.mutableIntStateOf(danmakuSettings2.getOpacity());
                composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
            }
            MutableIntState mutableIntState = (MutableIntState) objRememberedValue3;
            Object objRememberedValue4 = composerStartRestartGroup.rememberedValue();
            if (objRememberedValue4 == companion.getEmpty()) {
                objRememberedValue4 = PrimitiveSnapshotStateKt.mutableFloatStateOf(danmakuSettings2.getScreenPart());
                composerStartRestartGroup.updateRememberedValue(objRememberedValue4);
            }
            MutableFloatState mutableFloatState3 = (MutableFloatState) objRememberedValue4;
            Object objRememberedValue5 = composerStartRestartGroup.rememberedValue();
            if (objRememberedValue5 == companion.getEmpty()) {
                objRememberedValue5 = SnapshotIntStateKt.mutableIntStateOf(danmakuSettings2.getTimeOffsetSec());
                composerStartRestartGroup.updateRememberedValue(objRememberedValue5);
            }
            MutableIntState mutableIntState2 = (MutableIntState) objRememberedValue5;
            Object objRememberedValue6 = composerStartRestartGroup.rememberedValue();
            if (objRememberedValue6 == companion.getEmpty()) {
                objRememberedValue6 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Boolean.valueOf(danmakuSettings2.getShowTopDanmaku()), null, 2, null);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue6);
            }
            MutableState mutableState = (MutableState) objRememberedValue6;
            Object objRememberedValue7 = composerStartRestartGroup.rememberedValue();
            if (objRememberedValue7 == companion.getEmpty()) {
                objRememberedValue7 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Boolean.valueOf(danmakuSettings2.getShowBottomDanmaku()), null, 2, null);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue7);
            }
            MutableState mutableState2 = (MutableState) objRememberedValue7;
            Object objRememberedValue8 = composerStartRestartGroup.rememberedValue();
            if (objRememberedValue8 == companion.getEmpty()) {
                objRememberedValue8 = EffectsKt.createCompositionCoroutineScope(EmptyCoroutineContext.INSTANCE, composerStartRestartGroup);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue8);
            }
            CoroutineScope coroutineScope = (CoroutineScope) objRememberedValue8;
            Object objRememberedValue9 = composerStartRestartGroup.rememberedValue();
            if (objRememberedValue9 == companion.getEmpty()) {
                objRememberedValue9 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(null, null, 2, null);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue9);
            }
            MutableState mutableState3 = (MutableState) objRememberedValue9;
            Unit unit = Unit.INSTANCE;
            Object objRememberedValue10 = composerStartRestartGroup.rememberedValue();
            if (objRememberedValue10 == companion.getEmpty()) {
                objRememberedValue10 = new zh(11, mutableState3);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue10);
            }
            EffectsKt.DisposableEffect(unit, (Function1<? super DisposableEffectScope, ? extends DisposableEffectResult>) objRememberedValue10, composerStartRestartGroup, 54);
            AndroidDialog_androidKt.Dialog(function0, new DialogProperties(false, false, false, 3, (DefaultConstructorMarker) null), ComposableLambdaKt.rememberComposableLambda(-1976416560, true, new wy(coroutineScope, function1, mutableFloatState, mutableFloatState2, mutableFloatState3, mutableIntState, mutableIntState2, mutableState3, mutableState, mutableState2, function0, function3), composerStartRestartGroup, 54), composerStartRestartGroup, ((i2 >> 6) & 14) | 432, 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new l5((Object) danmakuSettings2, (Object) function1, function0, (Object) function2, i, 8));
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void b(Function1 function1, int i, Composer composer, int i2) {
        int i3;
        int i4;
        int i5;
        Function1 function2 = function1;
        Composer composerStartRestartGroup = composer.startRestartGroup(1160273997);
        if ((i2 & 6) == 0) {
            i3 = i2 | (composerStartRestartGroup.changed(i) ? 4 : 2);
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= composerStartRestartGroup.changedInstance(function2) ? 32 : 16;
        }
        int i6 = i3;
        if (composerStartRestartGroup.shouldExecute((i6 & 19) != 18, i6 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1160273997, i6, -1, "com.dh.myembyapp.ui.components.OpacitySelector (DanmakuSettingsDialog.kt:790)");
            }
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            Composer.Companion companion = Composer.INSTANCE;
            if (objRememberedValue == companion.getEmpty()) {
                objRememberedValue = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Boolean.FALSE, null, 2, null);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            MutableState mutableState = (MutableState) objRememberedValue;
            Object objRememberedValue2 = composerStartRestartGroup.rememberedValue();
            if (objRememberedValue2 == companion.getEmpty()) {
                objRememberedValue2 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Boolean.FALSE, null, 2, null);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
            }
            MutableState mutableState2 = (MutableState) objRememberedValue2;
            State<Float> stateAnimateFloatAsState = AnimateAsStateKt.animateFloatAsState(((Boolean) mutableState.getValue()).booleanValue() ? 1.06f : 1.0f, null, 0.0f, null, null, composerStartRestartGroup, 0, 30);
            State<Float> stateAnimateFloatAsState2 = AnimateAsStateKt.animateFloatAsState(((Boolean) mutableState2.getValue()).booleanValue() ? 1.06f : 1.0f, null, 0.0f, null, null, composerStartRestartGroup, 0, 30);
            Modifier.Companion companion2 = Modifier.INSTANCE;
            Modifier modifierFillMaxWidth$default = SizeKt.fillMaxWidth$default(companion2, 0.0f, 1, null);
            Alignment.Companion companion3 = Alignment.INSTANCE;
            MeasurePolicy measurePolicyQ = mr.q(8.0f, Arrangement.INSTANCE, companion3.getCenterVertically(), composerStartRestartGroup, 54);
            long currentCompositeKeyHashCode = ComposablesKt.getCurrentCompositeKeyHashCode(composerStartRestartGroup, 0);
            int i7 = (int) (currentCompositeKeyHashCode ^ (currentCompositeKeyHashCode >>> 32));
            CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifierFillMaxWidth$default);
            ComposeUiNode.Companion companion4 = ComposeUiNode.INSTANCE;
            Function0<ComposeUiNode> constructor = companion4.getConstructor();
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
            mr.z(companion4, composerM4318constructorimpl, measurePolicyQ, composerM4318constructorimpl, currentCompositionLocalMap);
            Updater.m4326setimpl(composerM4318constructorimpl, modifierMaterializeModifier, (Function2<? super T, ? super Modifier, Unit>) id.h(companion4, composerM4318constructorimpl, Integer.valueOf(i7), composerM4318constructorimpl));
            RowScopeInstance rowScopeInstance = RowScopeInstance.INSTANCE;
            Modifier modifierThen = ScaleKt.scale(companion2, stateAnimateFloatAsState.getValue().floatValue()).then(((Boolean) mutableState.getValue()).booleanValue() ? BorderKt.m286borderxT4_qwU(companion2, Dp.m7813constructorimpl(2.0f), Color.INSTANCE.m5189getWhite0d7_KjU(), RoundedCornerShapeKt.getCircleShape()) : companion2);
            MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(companion3.getTopStart(), false);
            long currentCompositeKeyHashCode2 = ComposablesKt.getCurrentCompositeKeyHashCode(composerStartRestartGroup, 0);
            int i8 = (int) (currentCompositeKeyHashCode2 ^ (currentCompositeKeyHashCode2 >>> 32));
            CompositionLocalMap currentCompositionLocalMap2 = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier2 = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifierThen);
            Function0<ComposeUiNode> constructor2 = companion4.getConstructor();
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
            mr.z(companion4, composerM4318constructorimpl2, measurePolicyMaybeCachedBoxMeasurePolicy, composerM4318constructorimpl2, currentCompositionLocalMap2);
            Updater.m4326setimpl(composerM4318constructorimpl2, modifierMaterializeModifier2, (Function2<? super T, ? super Modifier, Unit>) id.h(companion4, composerM4318constructorimpl2, Integer.valueOf(i8), composerM4318constructorimpl2));
            BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
            boolean z = i > 0;
            Modifier modifierM1064size3ABfNKs = SizeKt.m1064size3ABfNKs(companion2, Dp.m7813constructorimpl(30.0f));
            Object objRememberedValue3 = composerStartRestartGroup.rememberedValue();
            if (objRememberedValue3 == companion.getEmpty()) {
                objRememberedValue3 = new zh(14, mutableState);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
            }
            Modifier modifierOnFocusChanged = FocusChangedModifierKt.onFocusChanged(modifierM1064size3ABfNKs, (Function1) objRememberedValue3);
            int i9 = i6 & 14;
            boolean z2 = i9 == 4;
            int i10 = i6 & Input.Keys.FORWARD_DEL;
            boolean z3 = z2 | (i10 == 32);
            Object objRememberedValue4 = composerStartRestartGroup.rememberedValue();
            if (z3 || objRememberedValue4 == companion.getEmpty()) {
                i5 = 2;
                objRememberedValue4 = new uy(i, function2, 2);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue4);
            } else {
                i5 = 2;
            }
            IconButtonKt.IconButton((Function0) objRememberedValue4, modifierOnFocusChanged, z, null, null, null, ComposableLambdaKt.rememberComposableLambda(-1686870955, true, new vy(i, i5), composerStartRestartGroup, 54), composerStartRestartGroup, 1572864, 56);
            composerStartRestartGroup.endNode();
            Modifier modifierM1001paddingVpY3zN4$default = PaddingKt.m1001paddingVpY3zN4$default(kb0.v(6.0f, SizeKt.m1069width3ABfNKs(companion2, Dp.m7813constructorimpl(54.0f)), ColorKt.Color(4281545523L)), 0.0f, Dp.m7813constructorimpl(4.0f), 1, null);
            MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy2 = BoxKt.maybeCachedBoxMeasurePolicy(companion3.getCenter(), false);
            long currentCompositeKeyHashCode3 = ComposablesKt.getCurrentCompositeKeyHashCode(composerStartRestartGroup, 0);
            int i11 = (int) (currentCompositeKeyHashCode3 ^ (currentCompositeKeyHashCode3 >>> 32));
            CompositionLocalMap currentCompositionLocalMap3 = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier3 = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifierM1001paddingVpY3zN4$default);
            Function0<ComposeUiNode> constructor3 = companion4.getConstructor();
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
            mr.z(companion4, composerM4318constructorimpl3, measurePolicyMaybeCachedBoxMeasurePolicy2, composerM4318constructorimpl3, currentCompositionLocalMap3);
            Updater.m4326setimpl(composerM4318constructorimpl3, modifierMaterializeModifier3, (Function2<? super T, ? super Modifier, Unit>) id.h(companion4, composerM4318constructorimpl3, Integer.valueOf(i11), composerM4318constructorimpl3));
            String strValueOf = String.valueOf(i);
            long sp = TextUnitKt.getSp(14);
            Color.Companion companion5 = Color.INSTANCE;
            i4 = 0;
            TextKt.m3048TextNvy7gAk(strValueOf, null, companion5.m5189getWhite0d7_KjU(), null, sp, null, FontWeight.INSTANCE.getBold(), null, 0L, null, null, 0L, 0, false, 0, 0, null, null, composerStartRestartGroup, 1597824, 0, 262058);
            composerStartRestartGroup.endNode();
            Modifier modifierThen2 = ScaleKt.scale(companion2, stateAnimateFloatAsState2.getValue().floatValue()).then(((Boolean) mutableState2.getValue()).booleanValue() ? BorderKt.m286borderxT4_qwU(companion2, Dp.m7813constructorimpl(2.0f), companion5.m5189getWhite0d7_KjU(), RoundedCornerShapeKt.getCircleShape()) : companion2);
            MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy3 = BoxKt.maybeCachedBoxMeasurePolicy(companion3.getTopStart(), false);
            long currentCompositeKeyHashCode4 = ComposablesKt.getCurrentCompositeKeyHashCode(composerStartRestartGroup, 0);
            int i12 = (int) (currentCompositeKeyHashCode4 ^ (currentCompositeKeyHashCode4 >>> 32));
            CompositionLocalMap currentCompositionLocalMap4 = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier4 = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifierThen2);
            Function0<ComposeUiNode> constructor4 = companion4.getConstructor();
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
            mr.z(companion4, composerM4318constructorimpl4, measurePolicyMaybeCachedBoxMeasurePolicy3, composerM4318constructorimpl4, currentCompositionLocalMap4);
            Updater.m4326setimpl(composerM4318constructorimpl4, modifierMaterializeModifier4, (Function2<? super T, ? super Modifier, Unit>) id.h(companion4, composerM4318constructorimpl4, Integer.valueOf(i12), composerM4318constructorimpl4));
            boolean z4 = i < 100;
            Modifier modifierM1064size3ABfNKs2 = SizeKt.m1064size3ABfNKs(companion2, Dp.m7813constructorimpl(30.0f));
            Object objRememberedValue5 = composerStartRestartGroup.rememberedValue();
            if (objRememberedValue5 == companion.getEmpty()) {
                objRememberedValue5 = new zh(15, mutableState2);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue5);
            }
            Modifier modifierOnFocusChanged2 = FocusChangedModifierKt.onFocusChanged(modifierM1064size3ABfNKs2, (Function1) objRememberedValue5);
            boolean z5 = (i9 == 4) | (i10 == 32);
            Object objRememberedValue6 = composerStartRestartGroup.rememberedValue();
            int i13 = 3;
            if (z5 || objRememberedValue6 == companion.getEmpty()) {
                function2 = function1;
                objRememberedValue6 = new uy(i, function2, 3);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue6);
            } else {
                function2 = function1;
            }
            IconButtonKt.IconButton((Function0) objRememberedValue6, modifierOnFocusChanged2, z4, null, null, null, ComposableLambdaKt.rememberComposableLambda(-1237376819, true, new vy(i, i13), composerStartRestartGroup, 54), composerStartRestartGroup, 1572864, 56);
            composerStartRestartGroup = composerStartRestartGroup;
            if (x2.m(composerStartRestartGroup)) {
                ComposerKt.traceEventEnd();
            }
        } else {
            i4 = 0;
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new xy(i, i2, i4, function2));
        }
    }

    public static final void c(int i, Composer composer, Modifier modifier, String str, Function0 function0, boolean z) {
        int i2;
        Composer composerStartRestartGroup = composer.startRestartGroup(-522272499);
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
            i2 |= composerStartRestartGroup.changed(modifier) ? 2048 : 1024;
        }
        if (composerStartRestartGroup.shouldExecute((i2 & 1171) != 1170, i2 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-522272499, i2, -1, "com.dh.myembyapp.ui.components.RepeatableIconButton (DanmakuSettingsDialog.kt:356)");
            }
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            Composer.Companion companion = Composer.INSTANCE;
            if (objRememberedValue == companion.getEmpty()) {
                objRememberedValue = EffectsKt.createCompositionCoroutineScope(EmptyCoroutineContext.INSTANCE, composerStartRestartGroup);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            CoroutineScope coroutineScope = (CoroutineScope) objRememberedValue;
            Object objRememberedValue2 = composerStartRestartGroup.rememberedValue();
            if (objRememberedValue2 == companion.getEmpty()) {
                objRememberedValue2 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(null, null, 2, null);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
            }
            MutableState mutableState = (MutableState) objRememberedValue2;
            State stateRememberUpdatedState = SnapshotStateKt.rememberUpdatedState(function0, composerStartRestartGroup, (i2 >> 6) & 14);
            Unit unit = Unit.INSTANCE;
            Object objRememberedValue3 = composerStartRestartGroup.rememberedValue();
            if (objRememberedValue3 == companion.getEmpty()) {
                objRememberedValue3 = new zh(22, mutableState);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
            }
            EffectsKt.DisposableEffect(unit, (Function1<? super DisposableEffectScope, ? extends DisposableEffectResult>) objRememberedValue3, composerStartRestartGroup, 54);
            int i3 = i2 & Input.Keys.FORWARD_DEL;
            boolean zChanged = (i3 == 32) | composerStartRestartGroup.changed(stateRememberUpdatedState) | composerStartRestartGroup.changedInstance(coroutineScope);
            Object objRememberedValue4 = composerStartRestartGroup.rememberedValue();
            if (zChanged || objRememberedValue4 == companion.getEmpty()) {
                objRememberedValue4 = new fz(z, coroutineScope, mutableState, stateRememberUpdatedState);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue4);
            }
            Modifier modifierOnPreviewKeyEvent = KeyInputModifierKt.onPreviewKeyEvent(modifier, (Function1) objRememberedValue4);
            boolean zChanged2 = (i3 == 32) | composerStartRestartGroup.changed(stateRememberUpdatedState);
            Object objRememberedValue5 = composerStartRestartGroup.rememberedValue();
            if (zChanged2 || objRememberedValue5 == companion.getEmpty()) {
                objRememberedValue5 = new fk(2, stateRememberUpdatedState, z);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue5);
            }
            IconButtonKt.IconButton((Function0) objRememberedValue5, modifierOnPreviewKeyEvent, z, null, null, null, ComposableLambdaKt.rememberComposableLambda(-541439185, true, new az(0, str, z), composerStartRestartGroup, 54), composerStartRestartGroup, ((i2 << 3) & 896) | 1572864, 56);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new bz(str, z, function0, modifier, i, 0));
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r13v10, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r13v12 */
    /* JADX WARN: Type inference failed for: r13v9 */
    public static final void d(float f, Function1 function1, Composer composer, int i) {
        int i2;
        Function1 function2;
        Object r13;
        float f2 = f;
        Composer composerStartRestartGroup = composer.startRestartGroup(2122081420);
        if ((i & 6) == 0) {
            i2 = i | (composerStartRestartGroup.changed(f2) ? 4 : 2);
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= composerStartRestartGroup.changedInstance(function1) ? 32 : 16;
        }
        int i3 = i2;
        int i4 = 0;
        if (composerStartRestartGroup.shouldExecute((i3 & 19) != 18, i3 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(2122081420, i3, -1, "com.dh.myembyapp.ui.components.ScreenPartSlider (DanmakuSettingsDialog.kt:693)");
            }
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            Composer.Companion companion = Composer.INSTANCE;
            if (objRememberedValue == companion.getEmpty()) {
                objRememberedValue = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Boolean.FALSE, null, 2, null);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            MutableState mutableState = (MutableState) objRememberedValue;
            Object objRememberedValue2 = composerStartRestartGroup.rememberedValue();
            if (objRememberedValue2 == companion.getEmpty()) {
                objRememberedValue2 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Boolean.FALSE, null, 2, null);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
            }
            MutableState mutableState2 = (MutableState) objRememberedValue2;
            State<Float> stateAnimateFloatAsState = AnimateAsStateKt.animateFloatAsState(((Boolean) mutableState.getValue()).booleanValue() ? 1.06f : 1.0f, null, 0.0f, null, null, composerStartRestartGroup, 0, 30);
            State<Float> stateAnimateFloatAsState2 = AnimateAsStateKt.animateFloatAsState(((Boolean) mutableState2.getValue()).booleanValue() ? 1.06f : 1.0f, null, 0.0f, null, null, composerStartRestartGroup, 0, 30);
            Modifier.Companion companion2 = Modifier.INSTANCE;
            Modifier modifierFillMaxWidth$default = SizeKt.fillMaxWidth$default(companion2, 0.0f, 1, null);
            Alignment.Companion companion3 = Alignment.INSTANCE;
            MeasurePolicy measurePolicyQ = mr.q(8.0f, Arrangement.INSTANCE, companion3.getCenterVertically(), composerStartRestartGroup, 54);
            long currentCompositeKeyHashCode = ComposablesKt.getCurrentCompositeKeyHashCode(composerStartRestartGroup, 0);
            int i5 = (int) (currentCompositeKeyHashCode ^ (currentCompositeKeyHashCode >>> 32));
            CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifierFillMaxWidth$default);
            ComposeUiNode.Companion companion4 = ComposeUiNode.INSTANCE;
            Function0<ComposeUiNode> constructor = companion4.getConstructor();
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
            mr.z(companion4, composerM4318constructorimpl, measurePolicyQ, composerM4318constructorimpl, currentCompositionLocalMap);
            Updater.m4326setimpl(composerM4318constructorimpl, modifierMaterializeModifier, (Function2<? super T, ? super Modifier, Unit>) id.h(companion4, composerM4318constructorimpl, Integer.valueOf(i5), composerM4318constructorimpl));
            RowScopeInstance rowScopeInstance = RowScopeInstance.INSTANCE;
            Modifier modifierThen = ScaleKt.scale(companion2, stateAnimateFloatAsState.getValue().floatValue()).then(((Boolean) mutableState.getValue()).booleanValue() ? BorderKt.m286borderxT4_qwU(companion2, Dp.m7813constructorimpl(2.0f), Color.INSTANCE.m5189getWhite0d7_KjU(), RoundedCornerShapeKt.getCircleShape()) : companion2);
            MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(companion3.getTopStart(), false);
            long currentCompositeKeyHashCode2 = ComposablesKt.getCurrentCompositeKeyHashCode(composerStartRestartGroup, 0);
            int i6 = (int) (currentCompositeKeyHashCode2 ^ (currentCompositeKeyHashCode2 >>> 32));
            CompositionLocalMap currentCompositionLocalMap2 = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier2 = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifierThen);
            Function0<ComposeUiNode> constructor2 = companion4.getConstructor();
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
            mr.z(companion4, composerM4318constructorimpl2, measurePolicyMaybeCachedBoxMeasurePolicy, composerM4318constructorimpl2, currentCompositionLocalMap2);
            Updater.m4326setimpl(composerM4318constructorimpl2, modifierMaterializeModifier2, (Function2<? super T, ? super Modifier, Unit>) id.h(companion4, composerM4318constructorimpl2, Integer.valueOf(i6), composerM4318constructorimpl2));
            BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
            boolean z = f2 > 0.05f;
            Modifier modifierM1064size3ABfNKs = SizeKt.m1064size3ABfNKs(companion2, Dp.m7813constructorimpl(30.0f));
            Object objRememberedValue3 = composerStartRestartGroup.rememberedValue();
            if (objRememberedValue3 == companion.getEmpty()) {
                objRememberedValue3 = new zh(20, mutableState);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
            }
            Modifier modifierOnFocusChanged = FocusChangedModifierKt.onFocusChanged(modifierM1064size3ABfNKs, (Function1) objRememberedValue3);
            int i7 = i3 & 14;
            boolean z2 = i7 == 4;
            int i8 = i3 & Input.Keys.FORWARD_DEL;
            boolean z3 = z2 | (i8 == 32);
            Object objRememberedValue4 = composerStartRestartGroup.rememberedValue();
            if (z3 || objRememberedValue4 == companion.getEmpty()) {
                objRememberedValue4 = new yy(f2, function1, 0);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue4);
            }
            IconButtonKt.IconButton((Function0) objRememberedValue4, modifierOnFocusChanged, z, null, null, null, ComposableLambdaKt.rememberComposableLambda(-159022204, true, new zy(f2, i4), composerStartRestartGroup, 54), composerStartRestartGroup, 1572864, 56);
            composerStartRestartGroup.endNode();
            Modifier modifierM1001paddingVpY3zN4$default = PaddingKt.m1001paddingVpY3zN4$default(kb0.v(6.0f, SizeKt.m1069width3ABfNKs(companion2, Dp.m7813constructorimpl(70.0f)), ColorKt.Color(4281545523L)), 0.0f, Dp.m7813constructorimpl(4.0f), 1, null);
            MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy2 = BoxKt.maybeCachedBoxMeasurePolicy(companion3.getCenter(), false);
            long currentCompositeKeyHashCode3 = ComposablesKt.getCurrentCompositeKeyHashCode(composerStartRestartGroup, 0);
            int i9 = (int) (currentCompositeKeyHashCode3 ^ (currentCompositeKeyHashCode3 >>> 32));
            CompositionLocalMap currentCompositionLocalMap3 = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier3 = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifierM1001paddingVpY3zN4$default);
            Function0<ComposeUiNode> constructor3 = companion4.getConstructor();
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
            mr.z(companion4, composerM4318constructorimpl3, measurePolicyMaybeCachedBoxMeasurePolicy2, composerM4318constructorimpl3, currentCompositionLocalMap3);
            Updater.m4326setimpl(composerM4318constructorimpl3, modifierMaterializeModifier3, (Function2<? super T, ? super Modifier, Unit>) id.h(companion4, composerM4318constructorimpl3, Integer.valueOf(i9), composerM4318constructorimpl3));
            StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
            String str = String.format("%.2f", Arrays.copyOf(new Object[]{Float.valueOf(f)}, 1));
            long sp = TextUnitKt.getSp(14);
            Color.Companion companion5 = Color.INSTANCE;
            boolean z4 = false;
            TextKt.m3048TextNvy7gAk(str, null, companion5.m5189getWhite0d7_KjU(), null, sp, null, FontWeight.INSTANCE.getBold(), null, 0L, null, null, 0L, 0, false, 0, 0, null, null, composerStartRestartGroup, 1597824, 0, 262058);
            composerStartRestartGroup.endNode();
            Modifier modifierThen2 = ScaleKt.scale(companion2, stateAnimateFloatAsState2.getValue().floatValue()).then(((Boolean) mutableState2.getValue()).booleanValue() ? BorderKt.m286borderxT4_qwU(companion2, Dp.m7813constructorimpl(2.0f), companion5.m5189getWhite0d7_KjU(), RoundedCornerShapeKt.getCircleShape()) : companion2);
            MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy3 = BoxKt.maybeCachedBoxMeasurePolicy(companion3.getTopStart(), false);
            long currentCompositeKeyHashCode4 = ComposablesKt.getCurrentCompositeKeyHashCode(composerStartRestartGroup, 0);
            int i10 = (int) (currentCompositeKeyHashCode4 ^ (currentCompositeKeyHashCode4 >>> 32));
            CompositionLocalMap currentCompositionLocalMap4 = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier4 = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifierThen2);
            Function0<ComposeUiNode> constructor4 = companion4.getConstructor();
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
            mr.z(companion4, composerM4318constructorimpl4, measurePolicyMaybeCachedBoxMeasurePolicy3, composerM4318constructorimpl4, currentCompositionLocalMap4);
            Updater.m4326setimpl(composerM4318constructorimpl4, modifierMaterializeModifier4, (Function2<? super T, ? super Modifier, Unit>) id.h(companion4, composerM4318constructorimpl4, Integer.valueOf(i10), composerM4318constructorimpl4));
            boolean z5 = f < 1.0f;
            Modifier modifierM1064size3ABfNKs2 = SizeKt.m1064size3ABfNKs(companion2, Dp.m7813constructorimpl(30.0f));
            Object objRememberedValue5 = composerStartRestartGroup.rememberedValue();
            if (objRememberedValue5 == companion.getEmpty()) {
                objRememberedValue5 = new zh(21, mutableState2);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue5);
            }
            Modifier modifierOnFocusChanged2 = FocusChangedModifierKt.onFocusChanged(modifierM1064size3ABfNKs2, (Function1) objRememberedValue5);
            boolean z6 = i7 == 4;
            if (i8 == 32) {
                z4 = true;
            }
            boolean z7 = z6 | z4;
            Object objRememberedValue6 = composerStartRestartGroup.rememberedValue();
            if (z7 || objRememberedValue6 == companion.getEmpty()) {
                r13 = 1;
                f2 = f;
                function2 = function1;
                objRememberedValue6 = new yy(f2, function2, 1);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue6);
            } else {
                r13 = 1;
                f2 = f;
                function2 = function1;
            }
            IconButtonKt.IconButton((Function0) objRememberedValue6, modifierOnFocusChanged2, z5, null, null, null, ComposableLambdaKt.rememberComposableLambda(-987245556, r13, new zy(f2, r13), composerStartRestartGroup, 54), composerStartRestartGroup, 1572864, 56);
            composerStartRestartGroup = composerStartRestartGroup;
            if (x2.m(composerStartRestartGroup)) {
                ComposerKt.traceEventEnd();
            }
        } else {
            function2 = function1;
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new ty(f2, function2, i, 2));
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v10 */
    /* JADX WARN: Type inference failed for: r3v11, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r3v13 */
    public static final void e(float f, Function1 function1, Composer composer, int i) {
        int i2;
        int i3;
        Object r3;
        Composer composerStartRestartGroup = composer.startRestartGroup(-1397164468);
        if ((i & 6) == 0) {
            i2 = i | (composerStartRestartGroup.changed(f) ? 4 : 2);
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= composerStartRestartGroup.changedInstance(function1) ? 32 : 16;
        }
        int i4 = i2;
        int i5 = 0;
        if (composerStartRestartGroup.shouldExecute((i4 & 19) != 18, i4 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1397164468, i4, -1, "com.dh.myembyapp.ui.components.SizeSelector (DanmakuSettingsDialog.kt:520)");
            }
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            Composer.Companion companion = Composer.INSTANCE;
            if (objRememberedValue == companion.getEmpty()) {
                objRememberedValue = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Boolean.FALSE, null, 2, null);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            MutableState mutableState = (MutableState) objRememberedValue;
            Object objRememberedValue2 = composerStartRestartGroup.rememberedValue();
            if (objRememberedValue2 == companion.getEmpty()) {
                objRememberedValue2 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Boolean.FALSE, null, 2, null);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
            }
            MutableState mutableState2 = (MutableState) objRememberedValue2;
            State<Float> stateAnimateFloatAsState = AnimateAsStateKt.animateFloatAsState(((Boolean) mutableState.getValue()).booleanValue() ? 1.06f : 1.0f, null, 0.0f, null, null, composerStartRestartGroup, 0, 30);
            State<Float> stateAnimateFloatAsState2 = AnimateAsStateKt.animateFloatAsState(((Boolean) mutableState2.getValue()).booleanValue() ? 1.06f : 1.0f, null, 0.0f, null, null, composerStartRestartGroup, 0, 30);
            int iRint = (int) Math.rint(f * 10.0f);
            Modifier.Companion companion2 = Modifier.INSTANCE;
            Modifier modifierFillMaxWidth$default = SizeKt.fillMaxWidth$default(companion2, 0.0f, 1, null);
            Alignment.Companion companion3 = Alignment.INSTANCE;
            MeasurePolicy measurePolicyQ = mr.q(8.0f, Arrangement.INSTANCE, companion3.getCenterVertically(), composerStartRestartGroup, 54);
            long currentCompositeKeyHashCode = ComposablesKt.getCurrentCompositeKeyHashCode(composerStartRestartGroup, 0);
            int i6 = (int) (currentCompositeKeyHashCode ^ (currentCompositeKeyHashCode >>> 32));
            CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifierFillMaxWidth$default);
            ComposeUiNode.Companion companion4 = ComposeUiNode.INSTANCE;
            Function0<ComposeUiNode> constructor = companion4.getConstructor();
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
            mr.z(companion4, composerM4318constructorimpl, measurePolicyQ, composerM4318constructorimpl, currentCompositionLocalMap);
            Updater.m4326setimpl(composerM4318constructorimpl, modifierMaterializeModifier, (Function2<? super T, ? super Modifier, Unit>) id.h(companion4, composerM4318constructorimpl, Integer.valueOf(i6), composerM4318constructorimpl));
            RowScopeInstance rowScopeInstance = RowScopeInstance.INSTANCE;
            Modifier modifierThen = ScaleKt.scale(companion2, stateAnimateFloatAsState.getValue().floatValue()).then(((Boolean) mutableState.getValue()).booleanValue() ? BorderKt.m286borderxT4_qwU(companion2, Dp.m7813constructorimpl(2.0f), Color.INSTANCE.m5189getWhite0d7_KjU(), RoundedCornerShapeKt.getCircleShape()) : companion2);
            MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(companion3.getTopStart(), false);
            long currentCompositeKeyHashCode2 = ComposablesKt.getCurrentCompositeKeyHashCode(composerStartRestartGroup, 0);
            int i7 = (int) (currentCompositeKeyHashCode2 ^ (currentCompositeKeyHashCode2 >>> 32));
            CompositionLocalMap currentCompositionLocalMap2 = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier2 = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifierThen);
            Function0<ComposeUiNode> constructor2 = companion4.getConstructor();
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
            mr.z(companion4, composerM4318constructorimpl2, measurePolicyMaybeCachedBoxMeasurePolicy, composerM4318constructorimpl2, currentCompositionLocalMap2);
            Updater.m4326setimpl(composerM4318constructorimpl2, modifierMaterializeModifier2, (Function2<? super T, ? super Modifier, Unit>) id.h(companion4, composerM4318constructorimpl2, Integer.valueOf(i7), composerM4318constructorimpl2));
            BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
            boolean z = iRint > 5;
            Modifier modifierM1064size3ABfNKs = SizeKt.m1064size3ABfNKs(companion2, Dp.m7813constructorimpl(30.0f));
            Object objRememberedValue3 = composerStartRestartGroup.rememberedValue();
            if (objRememberedValue3 == companion.getEmpty()) {
                objRememberedValue3 = new zh(12, mutableState);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
            }
            Modifier modifierOnFocusChanged = FocusChangedModifierKt.onFocusChanged(modifierM1064size3ABfNKs, (Function1) objRememberedValue3);
            boolean zChanged = composerStartRestartGroup.changed(iRint);
            int i8 = i4 & Input.Keys.FORWARD_DEL;
            boolean z2 = zChanged | (i8 == 32);
            Object objRememberedValue4 = composerStartRestartGroup.rememberedValue();
            if (z2 || objRememberedValue4 == companion.getEmpty()) {
                objRememberedValue4 = new uy(iRint, function1, 0);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue4);
            }
            IconButtonKt.IconButton((Function0) objRememberedValue4, modifierOnFocusChanged, z, null, null, null, ComposableLambdaKt.rememberComposableLambda(173560132, true, new vy(iRint, i5), composerStartRestartGroup, 54), composerStartRestartGroup, 1572864, 56);
            composerStartRestartGroup.endNode();
            Modifier modifierM1001paddingVpY3zN4$default = PaddingKt.m1001paddingVpY3zN4$default(kb0.v(6.0f, SizeKt.m1069width3ABfNKs(companion2, Dp.m7813constructorimpl(70.0f)), ColorKt.Color(4281545523L)), 0.0f, Dp.m7813constructorimpl(4.0f), 1, null);
            MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy2 = BoxKt.maybeCachedBoxMeasurePolicy(companion3.getCenter(), false);
            long currentCompositeKeyHashCode3 = ComposablesKt.getCurrentCompositeKeyHashCode(composerStartRestartGroup, 0);
            int i9 = (int) (currentCompositeKeyHashCode3 ^ (currentCompositeKeyHashCode3 >>> 32));
            CompositionLocalMap currentCompositionLocalMap3 = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier3 = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifierM1001paddingVpY3zN4$default);
            Function0<ComposeUiNode> constructor3 = companion4.getConstructor();
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
            mr.z(companion4, composerM4318constructorimpl3, measurePolicyMaybeCachedBoxMeasurePolicy2, composerM4318constructorimpl3, currentCompositionLocalMap3);
            Updater.m4326setimpl(composerM4318constructorimpl3, modifierMaterializeModifier3, (Function2<? super T, ? super Modifier, Unit>) id.h(companion4, composerM4318constructorimpl3, Integer.valueOf(i9), composerM4318constructorimpl3));
            StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
            String str = String.format("%.1fx", Arrays.copyOf(new Object[]{Float.valueOf(iRint / 10.0f)}, 1));
            long sp = TextUnitKt.getSp(14);
            Color.Companion companion5 = Color.INSTANCE;
            i3 = 0;
            TextKt.m3048TextNvy7gAk(str, null, companion5.m5189getWhite0d7_KjU(), null, sp, null, FontWeight.INSTANCE.getBold(), null, 0L, null, null, 0L, 0, false, 0, 0, null, null, composerStartRestartGroup, 1597824, 0, 262058);
            composerStartRestartGroup.endNode();
            Modifier modifierThen2 = ScaleKt.scale(companion2, stateAnimateFloatAsState2.getValue().floatValue()).then(((Boolean) mutableState2.getValue()).booleanValue() ? BorderKt.m286borderxT4_qwU(companion2, Dp.m7813constructorimpl(2.0f), companion5.m5189getWhite0d7_KjU(), RoundedCornerShapeKt.getCircleShape()) : companion2);
            MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy3 = BoxKt.maybeCachedBoxMeasurePolicy(companion3.getTopStart(), false);
            long currentCompositeKeyHashCode4 = ComposablesKt.getCurrentCompositeKeyHashCode(composerStartRestartGroup, 0);
            int i10 = (int) (currentCompositeKeyHashCode4 ^ (currentCompositeKeyHashCode4 >>> 32));
            CompositionLocalMap currentCompositionLocalMap4 = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier4 = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifierThen2);
            Function0<ComposeUiNode> constructor4 = companion4.getConstructor();
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
            mr.z(companion4, composerM4318constructorimpl4, measurePolicyMaybeCachedBoxMeasurePolicy3, composerM4318constructorimpl4, currentCompositionLocalMap4);
            Updater.m4326setimpl(composerM4318constructorimpl4, modifierMaterializeModifier4, (Function2<? super T, ? super Modifier, Unit>) id.h(companion4, composerM4318constructorimpl4, Integer.valueOf(i10), composerM4318constructorimpl4));
            boolean z3 = iRint < 30;
            Modifier modifierM1064size3ABfNKs2 = SizeKt.m1064size3ABfNKs(companion2, Dp.m7813constructorimpl(30.0f));
            Object objRememberedValue5 = composerStartRestartGroup.rememberedValue();
            if (objRememberedValue5 == companion.getEmpty()) {
                objRememberedValue5 = new zh(13, mutableState2);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue5);
            }
            Modifier modifierOnFocusChanged2 = FocusChangedModifierKt.onFocusChanged(modifierM1064size3ABfNKs2, (Function1) objRememberedValue5);
            boolean zChanged2 = composerStartRestartGroup.changed(iRint) | (i8 == 32);
            Object objRememberedValue6 = composerStartRestartGroup.rememberedValue();
            if (zChanged2 || objRememberedValue6 == companion.getEmpty()) {
                r3 = 1;
                objRememberedValue6 = new uy(iRint, function1, 1);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue6);
            } else {
                r3 = 1;
            }
            IconButtonKt.IconButton((Function0) objRememberedValue6, modifierOnFocusChanged2, z3, null, null, null, ComposableLambdaKt.rememberComposableLambda(1434985932, r3, new vy(iRint, r3), composerStartRestartGroup, 54), composerStartRestartGroup, 1572864, 56);
            composerStartRestartGroup = composerStartRestartGroup;
            if (x2.m(composerStartRestartGroup)) {
                ComposerKt.traceEventEnd();
            }
        } else {
            i3 = 0;
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new ty(f, function1, i, i3));
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void f(float f, Function1 function1, Composer composer, int i) {
        int i2;
        int i3;
        int i4;
        Composer composerStartRestartGroup = composer.startRestartGroup(-935790730);
        if ((i & 6) == 0) {
            i2 = i | (composerStartRestartGroup.changed(f) ? 4 : 2);
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= composerStartRestartGroup.changedInstance(function1) ? 32 : 16;
        }
        int i5 = i2;
        if (composerStartRestartGroup.shouldExecute((i5 & 19) != 18, i5 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-935790730, i5, -1, "com.dh.myembyapp.ui.components.SpeedSelector (DanmakuSettingsDialog.kt:424)");
            }
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            Composer.Companion companion = Composer.INSTANCE;
            if (objRememberedValue == companion.getEmpty()) {
                objRememberedValue = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Boolean.FALSE, null, 2, null);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            MutableState mutableState = (MutableState) objRememberedValue;
            Object objRememberedValue2 = composerStartRestartGroup.rememberedValue();
            if (objRememberedValue2 == companion.getEmpty()) {
                objRememberedValue2 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Boolean.FALSE, null, 2, null);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
            }
            MutableState mutableState2 = (MutableState) objRememberedValue2;
            State<Float> stateAnimateFloatAsState = AnimateAsStateKt.animateFloatAsState(((Boolean) mutableState.getValue()).booleanValue() ? 1.06f : 1.0f, null, 0.0f, null, null, composerStartRestartGroup, 0, 30);
            State<Float> stateAnimateFloatAsState2 = AnimateAsStateKt.animateFloatAsState(((Boolean) mutableState2.getValue()).booleanValue() ? 1.06f : 1.0f, null, 0.0f, null, null, composerStartRestartGroup, 0, 30);
            int iRint = (int) Math.rint(f * 10.0f);
            Modifier.Companion companion2 = Modifier.INSTANCE;
            Modifier modifierFillMaxWidth$default = SizeKt.fillMaxWidth$default(companion2, 0.0f, 1, null);
            Alignment.Companion companion3 = Alignment.INSTANCE;
            MeasurePolicy measurePolicyQ = mr.q(8.0f, Arrangement.INSTANCE, companion3.getCenterVertically(), composerStartRestartGroup, 54);
            long currentCompositeKeyHashCode = ComposablesKt.getCurrentCompositeKeyHashCode(composerStartRestartGroup, 0);
            int i6 = (int) (currentCompositeKeyHashCode ^ (currentCompositeKeyHashCode >>> 32));
            CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifierFillMaxWidth$default);
            ComposeUiNode.Companion companion4 = ComposeUiNode.INSTANCE;
            Function0<ComposeUiNode> constructor = companion4.getConstructor();
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
            mr.z(companion4, composerM4318constructorimpl, measurePolicyQ, composerM4318constructorimpl, currentCompositionLocalMap);
            Updater.m4326setimpl(composerM4318constructorimpl, modifierMaterializeModifier, (Function2<? super T, ? super Modifier, Unit>) id.h(companion4, composerM4318constructorimpl, Integer.valueOf(i6), composerM4318constructorimpl));
            RowScopeInstance rowScopeInstance = RowScopeInstance.INSTANCE;
            Modifier modifierThen = ScaleKt.scale(companion2, stateAnimateFloatAsState.getValue().floatValue()).then(((Boolean) mutableState.getValue()).booleanValue() ? BorderKt.m286borderxT4_qwU(companion2, Dp.m7813constructorimpl(2.0f), Color.INSTANCE.m5189getWhite0d7_KjU(), RoundedCornerShapeKt.getCircleShape()) : companion2);
            MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(companion3.getTopStart(), false);
            long currentCompositeKeyHashCode2 = ComposablesKt.getCurrentCompositeKeyHashCode(composerStartRestartGroup, 0);
            int i7 = (int) (currentCompositeKeyHashCode2 ^ (currentCompositeKeyHashCode2 >>> 32));
            CompositionLocalMap currentCompositionLocalMap2 = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier2 = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifierThen);
            Function0<ComposeUiNode> constructor2 = companion4.getConstructor();
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
            mr.z(companion4, composerM4318constructorimpl2, measurePolicyMaybeCachedBoxMeasurePolicy, composerM4318constructorimpl2, currentCompositionLocalMap2);
            Updater.m4326setimpl(composerM4318constructorimpl2, modifierMaterializeModifier2, (Function2<? super T, ? super Modifier, Unit>) id.h(companion4, composerM4318constructorimpl2, Integer.valueOf(i7), composerM4318constructorimpl2));
            BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
            boolean z = iRint > 3;
            Modifier modifierM1064size3ABfNKs = SizeKt.m1064size3ABfNKs(companion2, Dp.m7813constructorimpl(30.0f));
            Object objRememberedValue3 = composerStartRestartGroup.rememberedValue();
            if (objRememberedValue3 == companion.getEmpty()) {
                objRememberedValue3 = new zh(16, mutableState);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
            }
            Modifier modifierOnFocusChanged = FocusChangedModifierKt.onFocusChanged(modifierM1064size3ABfNKs, (Function1) objRememberedValue3);
            boolean zChanged = composerStartRestartGroup.changed(iRint);
            int i8 = i5 & Input.Keys.FORWARD_DEL;
            boolean z2 = zChanged | (i8 == 32);
            Object objRememberedValue4 = composerStartRestartGroup.rememberedValue();
            if (z2 || objRememberedValue4 == companion.getEmpty()) {
                i4 = 4;
                objRememberedValue4 = new uy(iRint, function1, 4);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue4);
            } else {
                i4 = 4;
            }
            IconButtonKt.IconButton((Function0) objRememberedValue4, modifierOnFocusChanged, z, null, null, null, ComposableLambdaKt.rememberComposableLambda(512031614, true, new vy(iRint, i4), composerStartRestartGroup, 54), composerStartRestartGroup, 1572864, 56);
            composerStartRestartGroup.endNode();
            Modifier modifierM1001paddingVpY3zN4$default = PaddingKt.m1001paddingVpY3zN4$default(kb0.v(6.0f, SizeKt.m1069width3ABfNKs(companion2, Dp.m7813constructorimpl(70.0f)), ColorKt.Color(4281545523L)), 0.0f, Dp.m7813constructorimpl(4.0f), 1, null);
            MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy2 = BoxKt.maybeCachedBoxMeasurePolicy(companion3.getCenter(), false);
            long currentCompositeKeyHashCode3 = ComposablesKt.getCurrentCompositeKeyHashCode(composerStartRestartGroup, 0);
            int i9 = (int) (currentCompositeKeyHashCode3 ^ (currentCompositeKeyHashCode3 >>> 32));
            CompositionLocalMap currentCompositionLocalMap3 = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier3 = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifierM1001paddingVpY3zN4$default);
            Function0<ComposeUiNode> constructor3 = companion4.getConstructor();
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
            mr.z(companion4, composerM4318constructorimpl3, measurePolicyMaybeCachedBoxMeasurePolicy2, composerM4318constructorimpl3, currentCompositionLocalMap3);
            Updater.m4326setimpl(composerM4318constructorimpl3, modifierMaterializeModifier3, (Function2<? super T, ? super Modifier, Unit>) id.h(companion4, composerM4318constructorimpl3, Integer.valueOf(i9), composerM4318constructorimpl3));
            StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
            String str = String.format("%.1fx", Arrays.copyOf(new Object[]{Float.valueOf(iRint / 10.0f)}, 1));
            long sp = TextUnitKt.getSp(14);
            Color.Companion companion5 = Color.INSTANCE;
            TextKt.m3048TextNvy7gAk(str, null, companion5.m5189getWhite0d7_KjU(), null, sp, null, FontWeight.INSTANCE.getBold(), null, 0L, null, null, 0L, 0, false, 0, 0, null, null, composerStartRestartGroup, 1597824, 0, 262058);
            composerStartRestartGroup.endNode();
            Modifier modifierThen2 = ScaleKt.scale(companion2, stateAnimateFloatAsState2.getValue().floatValue()).then(((Boolean) mutableState2.getValue()).booleanValue() ? BorderKt.m286borderxT4_qwU(companion2, Dp.m7813constructorimpl(2.0f), companion5.m5189getWhite0d7_KjU(), RoundedCornerShapeKt.getCircleShape()) : companion2);
            MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy3 = BoxKt.maybeCachedBoxMeasurePolicy(companion3.getTopStart(), false);
            long currentCompositeKeyHashCode4 = ComposablesKt.getCurrentCompositeKeyHashCode(composerStartRestartGroup, 0);
            int i10 = (int) (currentCompositeKeyHashCode4 ^ (currentCompositeKeyHashCode4 >>> 32));
            CompositionLocalMap currentCompositionLocalMap4 = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier4 = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifierThen2);
            Function0<ComposeUiNode> constructor4 = companion4.getConstructor();
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
            mr.z(companion4, composerM4318constructorimpl4, measurePolicyMaybeCachedBoxMeasurePolicy3, composerM4318constructorimpl4, currentCompositionLocalMap4);
            Updater.m4326setimpl(composerM4318constructorimpl4, modifierMaterializeModifier4, (Function2<? super T, ? super Modifier, Unit>) id.h(companion4, composerM4318constructorimpl4, Integer.valueOf(i10), composerM4318constructorimpl4));
            boolean z3 = iRint < 20;
            Modifier modifierM1064size3ABfNKs2 = SizeKt.m1064size3ABfNKs(companion2, Dp.m7813constructorimpl(30.0f));
            Object objRememberedValue5 = composerStartRestartGroup.rememberedValue();
            if (objRememberedValue5 == companion.getEmpty()) {
                objRememberedValue5 = new zh(17, mutableState2);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue5);
            }
            Modifier modifierOnFocusChanged2 = FocusChangedModifierKt.onFocusChanged(modifierM1064size3ABfNKs2, (Function1) objRememberedValue5);
            boolean zChanged2 = composerStartRestartGroup.changed(iRint) | (i8 == 32);
            Object objRememberedValue6 = composerStartRestartGroup.rememberedValue();
            int i11 = 5;
            if (zChanged2 || objRememberedValue6 == companion.getEmpty()) {
                objRememberedValue6 = new uy(iRint, function1, 5);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue6);
            }
            i3 = 1;
            IconButtonKt.IconButton((Function0) objRememberedValue6, modifierOnFocusChanged2, z3, null, null, null, ComposableLambdaKt.rememberComposableLambda(961525750, true, new vy(iRint, i11), composerStartRestartGroup, 54), composerStartRestartGroup, 1572864, 56);
            composerStartRestartGroup = composerStartRestartGroup;
            if (x2.m(composerStartRestartGroup)) {
                ComposerKt.traceEventEnd();
            }
        } else {
            i3 = 1;
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new ty(f, function1, i, i3));
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void g(Function1 function1, int i, Composer composer, int i2) {
        int i3;
        Function1 function2;
        Composer composerStartRestartGroup = composer.startRestartGroup(1192840734);
        if ((i2 & 6) == 0) {
            i3 = i2 | (composerStartRestartGroup.changed(i) ? 4 : 2);
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= composerStartRestartGroup.changedInstance(function1) ? 32 : 16;
        }
        int i4 = i3;
        if (composerStartRestartGroup.shouldExecute((i4 & 19) != 18, i4 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1192840734, i4, -1, "com.dh.myembyapp.ui.components.TimeOffsetSelector (DanmakuSettingsDialog.kt:616)");
            }
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            Composer.Companion companion = Composer.INSTANCE;
            if (objRememberedValue == companion.getEmpty()) {
                objRememberedValue = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Boolean.FALSE, null, 2, null);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            MutableState mutableState = (MutableState) objRememberedValue;
            Object objRememberedValue2 = composerStartRestartGroup.rememberedValue();
            if (objRememberedValue2 == companion.getEmpty()) {
                objRememberedValue2 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Boolean.FALSE, null, 2, null);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
            }
            MutableState mutableState2 = (MutableState) objRememberedValue2;
            State<Float> stateAnimateFloatAsState = AnimateAsStateKt.animateFloatAsState(((Boolean) mutableState.getValue()).booleanValue() ? 1.06f : 1.0f, null, 0.0f, null, null, composerStartRestartGroup, 0, 30);
            State<Float> stateAnimateFloatAsState2 = AnimateAsStateKt.animateFloatAsState(((Boolean) mutableState2.getValue()).booleanValue() ? 1.06f : 1.0f, null, 0.0f, null, null, composerStartRestartGroup, 0, 30);
            Modifier.Companion companion2 = Modifier.INSTANCE;
            Modifier modifierFillMaxWidth$default = SizeKt.fillMaxWidth$default(companion2, 0.0f, 1, null);
            Alignment.Companion companion3 = Alignment.INSTANCE;
            MeasurePolicy measurePolicyQ = mr.q(8.0f, Arrangement.INSTANCE, companion3.getCenterVertically(), composerStartRestartGroup, 54);
            long currentCompositeKeyHashCode = ComposablesKt.getCurrentCompositeKeyHashCode(composerStartRestartGroup, 0);
            int i5 = (int) (currentCompositeKeyHashCode ^ (currentCompositeKeyHashCode >>> 32));
            CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifierFillMaxWidth$default);
            ComposeUiNode.Companion companion4 = ComposeUiNode.INSTANCE;
            Function0<ComposeUiNode> constructor = companion4.getConstructor();
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
            mr.z(companion4, composerM4318constructorimpl, measurePolicyQ, composerM4318constructorimpl, currentCompositionLocalMap);
            Updater.m4326setimpl(composerM4318constructorimpl, modifierMaterializeModifier, (Function2<? super T, ? super Modifier, Unit>) id.h(companion4, composerM4318constructorimpl, Integer.valueOf(i5), composerM4318constructorimpl));
            RowScopeInstance rowScopeInstance = RowScopeInstance.INSTANCE;
            Modifier modifierThen = ScaleKt.scale(companion2, stateAnimateFloatAsState.getValue().floatValue()).then(((Boolean) mutableState.getValue()).booleanValue() ? BorderKt.m286borderxT4_qwU(companion2, Dp.m7813constructorimpl(2.0f), Color.INSTANCE.m5189getWhite0d7_KjU(), RoundedCornerShapeKt.getCircleShape()) : companion2);
            MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(companion3.getTopStart(), false);
            long currentCompositeKeyHashCode2 = ComposablesKt.getCurrentCompositeKeyHashCode(composerStartRestartGroup, 0);
            int i6 = (int) (currentCompositeKeyHashCode2 ^ (currentCompositeKeyHashCode2 >>> 32));
            CompositionLocalMap currentCompositionLocalMap2 = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier2 = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifierThen);
            Function0<ComposeUiNode> constructor2 = companion4.getConstructor();
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
            mr.z(companion4, composerM4318constructorimpl2, measurePolicyMaybeCachedBoxMeasurePolicy, composerM4318constructorimpl2, currentCompositionLocalMap2);
            Updater.m4326setimpl(composerM4318constructorimpl2, modifierMaterializeModifier2, (Function2<? super T, ? super Modifier, Unit>) id.h(companion4, composerM4318constructorimpl2, Integer.valueOf(i6), composerM4318constructorimpl2));
            BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
            boolean z = i > -600;
            int i7 = i4 & Input.Keys.FORWARD_DEL;
            int i8 = i4 & 14;
            boolean z2 = (i7 == 32) | (i8 == 4);
            Object objRememberedValue3 = composerStartRestartGroup.rememberedValue();
            if (z2 || objRememberedValue3 == companion.getEmpty()) {
                objRememberedValue3 = new uy(function1, i, 6);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
            }
            Function0 function0 = (Function0) objRememberedValue3;
            Modifier modifierM1064size3ABfNKs = SizeKt.m1064size3ABfNKs(companion2, Dp.m7813constructorimpl(30.0f));
            Object objRememberedValue4 = composerStartRestartGroup.rememberedValue();
            if (objRememberedValue4 == companion.getEmpty()) {
                objRememberedValue4 = new zh(18, mutableState);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue4);
            }
            c(6, composerStartRestartGroup, FocusChangedModifierKt.onFocusChanged(modifierM1064size3ABfNKs, (Function1) objRememberedValue4), "−", function0, z);
            composerStartRestartGroup.endNode();
            Modifier modifierM1001paddingVpY3zN4$default = PaddingKt.m1001paddingVpY3zN4$default(kb0.v(6.0f, SizeKt.m1069width3ABfNKs(companion2, Dp.m7813constructorimpl(88.0f)), ColorKt.Color(4281545523L)), 0.0f, Dp.m7813constructorimpl(4.0f), 1, null);
            MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy2 = BoxKt.maybeCachedBoxMeasurePolicy(companion3.getCenter(), false);
            long currentCompositeKeyHashCode3 = ComposablesKt.getCurrentCompositeKeyHashCode(composerStartRestartGroup, 0);
            int i9 = (int) (currentCompositeKeyHashCode3 ^ (currentCompositeKeyHashCode3 >>> 32));
            CompositionLocalMap currentCompositionLocalMap3 = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier3 = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifierM1001paddingVpY3zN4$default);
            Function0<ComposeUiNode> constructor3 = companion4.getConstructor();
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
            mr.z(companion4, composerM4318constructorimpl3, measurePolicyMaybeCachedBoxMeasurePolicy2, composerM4318constructorimpl3, currentCompositionLocalMap3);
            Updater.m4326setimpl(composerM4318constructorimpl3, modifierMaterializeModifier3, (Function2<? super T, ? super Modifier, Unit>) id.h(companion4, composerM4318constructorimpl3, Integer.valueOf(i9), composerM4318constructorimpl3));
            String str = (i >= 0 ? "+" : "") + i + CmcdData.STREAMING_FORMAT_SS;
            long sp = TextUnitKt.getSp(14);
            Color.Companion companion5 = Color.INSTANCE;
            boolean z3 = false;
            TextKt.m3048TextNvy7gAk(str, null, companion5.m5189getWhite0d7_KjU(), null, sp, null, FontWeight.INSTANCE.getBold(), null, 0L, null, null, 0L, 0, false, 0, 0, null, null, composerStartRestartGroup, 1597824, 0, 262058);
            composerStartRestartGroup = composerStartRestartGroup;
            composerStartRestartGroup.endNode();
            Modifier modifierThen2 = ScaleKt.scale(companion2, stateAnimateFloatAsState2.getValue().floatValue()).then(((Boolean) mutableState2.getValue()).booleanValue() ? BorderKt.m286borderxT4_qwU(companion2, Dp.m7813constructorimpl(2.0f), companion5.m5189getWhite0d7_KjU(), RoundedCornerShapeKt.getCircleShape()) : companion2);
            MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy3 = BoxKt.maybeCachedBoxMeasurePolicy(companion3.getTopStart(), false);
            long currentCompositeKeyHashCode4 = ComposablesKt.getCurrentCompositeKeyHashCode(composerStartRestartGroup, 0);
            int i10 = (int) (currentCompositeKeyHashCode4 ^ (currentCompositeKeyHashCode4 >>> 32));
            CompositionLocalMap currentCompositionLocalMap4 = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier4 = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifierThen2);
            Function0<ComposeUiNode> constructor4 = companion4.getConstructor();
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
            mr.z(companion4, composerM4318constructorimpl4, measurePolicyMaybeCachedBoxMeasurePolicy3, composerM4318constructorimpl4, currentCompositionLocalMap4);
            Updater.m4326setimpl(composerM4318constructorimpl4, modifierMaterializeModifier4, (Function2<? super T, ? super Modifier, Unit>) id.h(companion4, composerM4318constructorimpl4, Integer.valueOf(i10), composerM4318constructorimpl4));
            boolean z4 = i < 600;
            boolean z5 = i7 == 32;
            if (i8 == 4) {
                z3 = true;
            }
            boolean z6 = z3 | z5;
            Object objRememberedValue5 = composerStartRestartGroup.rememberedValue();
            if (z6 || objRememberedValue5 == companion.getEmpty()) {
                function2 = function1;
                objRememberedValue5 = new uy(function2, i, 7);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue5);
            } else {
                function2 = function1;
            }
            Function0 function3 = (Function0) objRememberedValue5;
            Modifier modifierM1064size3ABfNKs2 = SizeKt.m1064size3ABfNKs(companion2, Dp.m7813constructorimpl(30.0f));
            Object objRememberedValue6 = composerStartRestartGroup.rememberedValue();
            if (objRememberedValue6 == companion.getEmpty()) {
                objRememberedValue6 = new zh(19, mutableState2);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue6);
            }
            c(6, composerStartRestartGroup, FocusChangedModifierKt.onFocusChanged(modifierM1064size3ABfNKs2, (Function1) objRememberedValue6), "+", function3, z4);
            if (x2.m(composerStartRestartGroup)) {
                ComposerKt.traceEventEnd();
            }
        } else {
            function2 = function1;
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new xy(i, i2, 1, function2));
        }
    }
}
