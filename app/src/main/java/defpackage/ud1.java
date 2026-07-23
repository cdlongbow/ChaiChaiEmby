package defpackage;

import androidx.activity.compose.BackHandlerKt;
import androidx.compose.animation.core.AnimateAsStateKt;
import androidx.compose.foundation.BorderKt;
import androidx.compose.foundation.ScrollKt;
import androidx.compose.foundation.ScrollState;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.shape.RoundedCornerShape;
import androidx.compose.foundation.shape.RoundedCornerShapeKt;
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
import androidx.compose.ui.input.key.KeyInputModifierKt;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.unit.Dp;
import androidx.compose.ui.window.AndroidDialog_androidKt;
import androidx.compose.ui.window.DialogProperties;
import androidx.media3.exoplayer.RendererCapabilities;

import kotlin.Unit;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.text.Regex;
import kotlin.text.StringsKt;
import kotlin.text.StringsKt;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: loaded from: classes4.dex */
public abstract class ud1 {
    public static final long a;
    public static final long b;
    public static final long c;
    public static final /* synthetic */ int d = 0;

    static {
        Color.Companion companion = Color.INSTANCE;
        a = Color.m5151copywmQWz5c$default(companion.m5178getBlack0d7_KjU(), 0.68f, 0.0f, 0.0f, 0.0f, 14, null);
        b = Color.m5151copywmQWz5c$default(ColorKt.Color(4280558628L), 0.96f, 0.0f, 0.0f, 0.0f, 14, null);
        c = Color.m5151copywmQWz5c$default(companion.m5178getBlack0d7_KjU(), 0.24f, 0.0f, 0.0f, 0.0f, 14, null);
    }

    /* JADX WARN: Code duplicated, block: B:100:0x01d7  */
    /* JADX WARN: Code duplicated, block: B:103:0x026d  */
    /* JADX WARN: Code duplicated, block: B:105:0x0274  */
    /* JADX WARN: Code duplicated, block: B:108:0x0281  */
    /* JADX WARN: Code duplicated, block: B:110:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:46:0x007c  */
    /* JADX WARN: Code duplicated, block: B:48:0x0082  */
    /* JADX WARN: Code duplicated, block: B:49:0x0085  */
    /* JADX WARN: Code duplicated, block: B:53:0x008e  */
    /* JADX WARN: Code duplicated, block: B:55:0x0092  */
    /* JADX WARN: Code duplicated, block: B:57:0x0095  */
    /* JADX WARN: Code duplicated, block: B:59:0x009d  */
    /* JADX WARN: Code duplicated, block: B:60:0x00a0  */
    /* JADX WARN: Code duplicated, block: B:64:0x00b1  */
    /* JADX WARN: Code duplicated, block: B:65:0x00b3  */
    /* JADX WARN: Code duplicated, block: B:68:0x00bc  */
    /* JADX WARN: Code duplicated, block: B:70:0x00bf  */
    /* JADX WARN: Code duplicated, block: B:72:0x00c2  */
    /* JADX WARN: Code duplicated, block: B:75:0x00c9  */
    /* JADX WARN: Code duplicated, block: B:78:0x00db  */
    /* JADX WARN: Code duplicated, block: B:81:0x00f2  */
    /* JADX WARN: Code duplicated, block: B:82:0x00f6  */
    /* JADX WARN: Code duplicated, block: B:85:0x0152  */
    /* JADX WARN: Code duplicated, block: B:86:0x0165  */
    /* JADX WARN: Code duplicated, block: B:90:0x0193  */
    /* JADX WARN: Code duplicated, block: B:93:0x019f  */
    /* JADX WARN: Code duplicated, block: B:94:0x01a3  */
    /* JADX WARN: Code duplicated, block: B:97:0x01c5  */
    /* JADX WARN: Multi-variable type inference failed */
    public static final void a(String str, Function0 function0, boolean z, Modifier modifier, FocusRequester focusRequester, Function1 function1, Function2 function2, Composer composer, int i, int i2) {
        int i3;
        Function0 function3;
        FocusRequester focusRequester2;
        int i4;
        Function2 function4;
        int i5;
        boolean z2;
        Composer composer2;
        FocusRequester focusRequester3;
        Function2 function5;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Object objRememberedValue;
        Composer.Companion companion;
        MutableState mutableState;
        float f;
        FocusRequester focusRequester4;
        RoundedCornerShape RoundedCornerShape;
        Modifier modifierM286borderxT4_qwU;
        Function0<ComposeUiNode> constructor;
        Modifier modifierFocusRequester;
        Object objRememberedValue2;
        int i6;
        Composer composerStartRestartGroup = composer.startRestartGroup(-2029571771);
        if ((i & 6) == 0) {
            i3 = (composerStartRestartGroup.changed(str) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            function3 = function0;
            i3 |= composerStartRestartGroup.changedInstance(function3) ? 32 : 16;
        } else {
            function3 = function0;
        }
        if ((i & RendererCapabilities.DECODER_SUPPORT_MASK) == 0) {
            i3 |= composerStartRestartGroup.changed(z) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i3 |= composerStartRestartGroup.changed(modifier) ? 2048 : 1024;
        }
        int i7 = i2 & 16;
        if (i7 == 0) {
            if ((i & 24576) == 0) {
                focusRequester2 = focusRequester;
                i3 |= composerStartRestartGroup.changed(focusRequester2) ? 16384 : 8192;
            }
            if ((196608 & i) == 0) {
                if (composerStartRestartGroup.changedInstance(function1)) {
                    i6 = 131072;
                } else {
                    i6 = 65536;
                }
                i3 |= i6;
            }
            i4 = i2 & 64;
            if (i4 != 0) {
                if ((1572864 & i) == 0) {
                    function4 = function2;
                    if (composerStartRestartGroup.changedInstance(function4)) {
                        i5 = 1048576;
                    } else {
                        i5 = 524288;
                    }
                    i3 |= i5;
                }
                if ((599187 & i3) != 599186) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                if (composerStartRestartGroup.shouldExecute(z2, i3 & 1)) {
                    if (i7 != 0) {
                        focusRequester2 = null;
                    }
                    if (i4 != 0) {
                        function4 = null;
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-2029571771, i3, -1, "com.dh.myembyapp.ui.screens.player.components.PlaybackErrorActionButton (PlaybackErrorDialog.kt:324)");
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
                    focusRequester4 = focusRequester2;
                    int i8 = i3;
                    Function2 function6 = function4;
                    State<Float> stateAnimateFloatAsState = AnimateAsStateKt.animateFloatAsState(f, null, 0.0f, null, null, composerStartRestartGroup, 0, 30);
                    RoundedCornerShape = RoundedCornerShapeKt.RoundedCornerShape(50);
                    long jS = hc2.s(((Boolean) mutableState.getValue()).booleanValue());
                    Modifier modifierClip = ClipKt.clip(ScaleKt.scale(SizeKt.m1050height3ABfNKs(modifier, Dp.m7813constructorimpl(44.0f)), stateAnimateFloatAsState.getValue().floatValue()), RoundedCornerShape);
                    if (((Boolean) mutableState.getValue()).booleanValue()) {
                        modifierM286borderxT4_qwU = BorderKt.m286borderxT4_qwU(Modifier.INSTANCE, Dp.m7813constructorimpl(2.0f), Color.INSTANCE.m5189getWhite0d7_KjU(), RoundedCornerShape);
                    } else {
                        modifierM286borderxT4_qwU = Modifier.INSTANCE;
                    }
                    Modifier modifierThen = modifierClip.then(modifierM286borderxT4_qwU);
                    MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.INSTANCE.getTopStart(), false);
                    long currentCompositeKeyHashCode = ComposablesKt.getCurrentCompositeKeyHashCode(composerStartRestartGroup, 0);
                    int i9 = (int) (currentCompositeKeyHashCode ^ (currentCompositeKeyHashCode >>> 32));
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
                    Updater.m4326setimpl(composerM4318constructorimpl, modifierMaterializeModifier, (Function2<? super T, ? super Modifier, Unit>) id.h(companion2, composerM4318constructorimpl, Integer.valueOf(i9), composerM4318constructorimpl));
                    BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
                    modifierFocusRequester = Modifier.INSTANCE;
                    Modifier modifierFillMaxSize$default = SizeKt.fillMaxSize$default(modifierFocusRequester, 0.0f, 1, null);
                    if (focusRequester4 != null) {
                        modifierFocusRequester = FocusRequesterModifierKt.focusRequester(modifierFocusRequester, focusRequester4);
                    }
                    Modifier modifierThen2 = modifierFillMaxSize$default.then(modifierFocusRequester);
                    objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                    if (objRememberedValue2 == companion.getEmpty()) {
                        objRememberedValue2 = new ub1(7, mutableState);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                    }
                    Modifier modifierOnPreviewKeyEvent = KeyInputModifierKt.onPreviewKeyEvent(FocusChangedModifierKt.onFocusChanged(modifierThen2, (Function1) objRememberedValue2), function1);
                    ButtonColors buttonColorsR = hc2.r(z, ColorKt.Color(4282532418L), composerStartRestartGroup, ((i8 >> 6) & 14) | RendererCapabilities.DECODER_SUPPORT_MASK, 2);
                    ButtonDefaults buttonDefaults = ButtonDefaults.INSTANCE;
                    composer2 = composerStartRestartGroup;
                    ButtonKt.m8231ButtonTCVpFMg(function3, modifierOnPreviewKeyEvent, null, false, ButtonDefaults.scale$default(buttonDefaults, 1.0f, 1.0f, 0.0f, 0.0f, 0.0f, 28, null), null, ButtonDefaults.shape$default(buttonDefaults, RoundedCornerShape, null, null, null, null, 30, null), buttonColorsR, 0.0f, null, PaddingKt.m993PaddingValuesYgX7TsA(Dp.m7813constructorimpl(12.0f), Dp.m7813constructorimpl(8.0f)), null, ComposableLambdaKt.rememberComposableLambda(-1906362437, true, new d2(function6, str, jS), composerStartRestartGroup, 54), composer2, (i8 >> 3) & 14, 390, 2860);
                    composer2.endNode();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    focusRequester3 = focusRequester4;
                    function5 = function6;
                } else {
                    composer2 = composerStartRestartGroup;
                    composer2.skipToGroupEnd();
                    focusRequester3 = focusRequester2;
                    function5 = function4;
                }
                scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup != null) {
                    scopeUpdateScopeEndRestartGroup.updateScope(new bv(str, function0, z, modifier, focusRequester3, function1, function5, i, i2));
                }
            }
            i3 |= 1572864;
            function4 = function2;
            if ((599187 & i3) != 599186) {
                z2 = true;
            } else {
                z2 = false;
            }
            if (composerStartRestartGroup.shouldExecute(z2, i3 & 1)) {
                if (i7 != 0) {
                    focusRequester2 = null;
                }
                if (i4 != 0) {
                    function4 = null;
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-2029571771, i3, -1, "com.dh.myembyapp.ui.screens.player.components.PlaybackErrorActionButton (PlaybackErrorDialog.kt:324)");
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
                focusRequester4 = focusRequester2;
                int i10 = i3;
                Function2 function7 = function4;
                State<Float> stateAnimateFloatAsState2 = AnimateAsStateKt.animateFloatAsState(f, null, 0.0f, null, null, composerStartRestartGroup, 0, 30);
                RoundedCornerShape = RoundedCornerShapeKt.RoundedCornerShape(50);
                long jS2 = hc2.s(((Boolean) mutableState.getValue()).booleanValue());
                Modifier modifierClip2 = ClipKt.clip(ScaleKt.scale(SizeKt.m1050height3ABfNKs(modifier, Dp.m7813constructorimpl(44.0f)), stateAnimateFloatAsState2.getValue().floatValue()), RoundedCornerShape);
                if (((Boolean) mutableState.getValue()).booleanValue()) {
                    modifierM286borderxT4_qwU = BorderKt.m286borderxT4_qwU(Modifier.INSTANCE, Dp.m7813constructorimpl(2.0f), Color.INSTANCE.m5189getWhite0d7_KjU(), RoundedCornerShape);
                } else {
                    modifierM286borderxT4_qwU = Modifier.INSTANCE;
                }
                Modifier modifierThen3 = modifierClip2.then(modifierM286borderxT4_qwU);
                MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy2 = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.INSTANCE.getTopStart(), false);
                long currentCompositeKeyHashCode2 = ComposablesKt.getCurrentCompositeKeyHashCode(composerStartRestartGroup, 0);
                int i11 = (int) (currentCompositeKeyHashCode2 ^ (currentCompositeKeyHashCode2 >>> 32));
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
                Updater.m4326setimpl(composerM4318constructorimpl2, modifierMaterializeModifier2, (Function2<? super T, ? super Modifier, Unit>) id.h(companion3, composerM4318constructorimpl2, Integer.valueOf(i11), composerM4318constructorimpl2));
                BoxScopeInstance boxScopeInstance2 = BoxScopeInstance.INSTANCE;
                modifierFocusRequester = Modifier.INSTANCE;
                Modifier modifierFillMaxSize$default2 = SizeKt.fillMaxSize$default(modifierFocusRequester, 0.0f, 1, null);
                if (focusRequester4 != null) {
                    modifierFocusRequester = FocusRequesterModifierKt.focusRequester(modifierFocusRequester, focusRequester4);
                }
                Modifier modifierThen4 = modifierFillMaxSize$default2.then(modifierFocusRequester);
                objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                if (objRememberedValue2 == companion.getEmpty()) {
                    objRememberedValue2 = new ub1(7, mutableState);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                }
                Modifier modifierOnPreviewKeyEvent2 = KeyInputModifierKt.onPreviewKeyEvent(FocusChangedModifierKt.onFocusChanged(modifierThen4, (Function1) objRememberedValue2), function1);
                ButtonColors buttonColorsR2 = hc2.r(z, ColorKt.Color(4282532418L), composerStartRestartGroup, ((i10 >> 6) & 14) | RendererCapabilities.DECODER_SUPPORT_MASK, 2);
                ButtonDefaults buttonDefaults2 = ButtonDefaults.INSTANCE;
                composer2 = composerStartRestartGroup;
                ButtonKt.m8231ButtonTCVpFMg(function3, modifierOnPreviewKeyEvent2, null, false, ButtonDefaults.scale$default(buttonDefaults2, 1.0f, 1.0f, 0.0f, 0.0f, 0.0f, 28, null), null, ButtonDefaults.shape$default(buttonDefaults2, RoundedCornerShape, null, null, null, null, 30, null), buttonColorsR2, 0.0f, null, PaddingKt.m993PaddingValuesYgX7TsA(Dp.m7813constructorimpl(12.0f), Dp.m7813constructorimpl(8.0f)), null, ComposableLambdaKt.rememberComposableLambda(-1906362437, true, new d2(function7, str, jS2), composerStartRestartGroup, 54), composer2, (i10 >> 3) & 14, 390, 2860);
                composer2.endNode();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                focusRequester3 = focusRequester4;
                function5 = function7;
            } else {
                composer2 = composerStartRestartGroup;
                composer2.skipToGroupEnd();
                focusRequester3 = focusRequester2;
                function5 = function4;
            }
            scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup != null) {
                scopeUpdateScopeEndRestartGroup.updateScope(new bv(str, function0, z, modifier, focusRequester3, function1, function5, i, i2));
            }
        }
        i3 |= 24576;
        focusRequester2 = focusRequester;
        if ((196608 & i) == 0) {
            if (composerStartRestartGroup.changedInstance(function1)) {
                i6 = 131072;
            } else {
                i6 = 65536;
            }
            i3 |= i6;
        }
        i4 = i2 & 64;
        if (i4 != 0) {
            if ((1572864 & i) == 0) {
                function4 = function2;
                if (composerStartRestartGroup.changedInstance(function4)) {
                    i5 = 1048576;
                } else {
                    i5 = 524288;
                }
                i3 |= i5;
            }
            if ((599187 & i3) != 599186) {
                z2 = true;
            } else {
                z2 = false;
            }
            if (composerStartRestartGroup.shouldExecute(z2, i3 & 1)) {
                if (i7 != 0) {
                    focusRequester2 = null;
                }
                if (i4 != 0) {
                    function4 = null;
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-2029571771, i3, -1, "com.dh.myembyapp.ui.screens.player.components.PlaybackErrorActionButton (PlaybackErrorDialog.kt:324)");
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
                focusRequester4 = focusRequester2;
                int i12 = i3;
                Function2 function8 = function4;
                State<Float> stateAnimateFloatAsState3 = AnimateAsStateKt.animateFloatAsState(f, null, 0.0f, null, null, composerStartRestartGroup, 0, 30);
                RoundedCornerShape = RoundedCornerShapeKt.RoundedCornerShape(50);
                long jS3 = hc2.s(((Boolean) mutableState.getValue()).booleanValue());
                Modifier modifierClip3 = ClipKt.clip(ScaleKt.scale(SizeKt.m1050height3ABfNKs(modifier, Dp.m7813constructorimpl(44.0f)), stateAnimateFloatAsState3.getValue().floatValue()), RoundedCornerShape);
                if (((Boolean) mutableState.getValue()).booleanValue()) {
                    modifierM286borderxT4_qwU = BorderKt.m286borderxT4_qwU(Modifier.INSTANCE, Dp.m7813constructorimpl(2.0f), Color.INSTANCE.m5189getWhite0d7_KjU(), RoundedCornerShape);
                } else {
                    modifierM286borderxT4_qwU = Modifier.INSTANCE;
                }
                Modifier modifierThen5 = modifierClip3.then(modifierM286borderxT4_qwU);
                MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy3 = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.INSTANCE.getTopStart(), false);
                long currentCompositeKeyHashCode3 = ComposablesKt.getCurrentCompositeKeyHashCode(composerStartRestartGroup, 0);
                int i13 = (int) (currentCompositeKeyHashCode3 ^ (currentCompositeKeyHashCode3 >>> 32));
                CompositionLocalMap currentCompositionLocalMap3 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                Modifier modifierMaterializeModifier3 = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifierThen5);
                ComposeUiNode.Companion companion4 = ComposeUiNode.INSTANCE;
                constructor = companion4.getConstructor();
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
                mr.z(companion4, composerM4318constructorimpl3, measurePolicyMaybeCachedBoxMeasurePolicy3, composerM4318constructorimpl3, currentCompositionLocalMap3);
                Updater.m4326setimpl(composerM4318constructorimpl3, modifierMaterializeModifier3, (Function2<? super T, ? super Modifier, Unit>) id.h(companion4, composerM4318constructorimpl3, Integer.valueOf(i13), composerM4318constructorimpl3));
                BoxScopeInstance boxScopeInstance3 = BoxScopeInstance.INSTANCE;
                modifierFocusRequester = Modifier.INSTANCE;
                Modifier modifierFillMaxSize$default3 = SizeKt.fillMaxSize$default(modifierFocusRequester, 0.0f, 1, null);
                if (focusRequester4 != null) {
                    modifierFocusRequester = FocusRequesterModifierKt.focusRequester(modifierFocusRequester, focusRequester4);
                }
                Modifier modifierThen6 = modifierFillMaxSize$default3.then(modifierFocusRequester);
                objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                if (objRememberedValue2 == companion.getEmpty()) {
                    objRememberedValue2 = new ub1(7, mutableState);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                }
                Modifier modifierOnPreviewKeyEvent3 = KeyInputModifierKt.onPreviewKeyEvent(FocusChangedModifierKt.onFocusChanged(modifierThen6, (Function1) objRememberedValue2), function1);
                ButtonColors buttonColorsR3 = hc2.r(z, ColorKt.Color(4282532418L), composerStartRestartGroup, ((i12 >> 6) & 14) | RendererCapabilities.DECODER_SUPPORT_MASK, 2);
                ButtonDefaults buttonDefaults3 = ButtonDefaults.INSTANCE;
                composer2 = composerStartRestartGroup;
                ButtonKt.m8231ButtonTCVpFMg(function3, modifierOnPreviewKeyEvent3, null, false, ButtonDefaults.scale$default(buttonDefaults3, 1.0f, 1.0f, 0.0f, 0.0f, 0.0f, 28, null), null, ButtonDefaults.shape$default(buttonDefaults3, RoundedCornerShape, null, null, null, null, 30, null), buttonColorsR3, 0.0f, null, PaddingKt.m993PaddingValuesYgX7TsA(Dp.m7813constructorimpl(12.0f), Dp.m7813constructorimpl(8.0f)), null, ComposableLambdaKt.rememberComposableLambda(-1906362437, true, new d2(function8, str, jS3), composerStartRestartGroup, 54), composer2, (i12 >> 3) & 14, 390, 2860);
                composer2.endNode();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                focusRequester3 = focusRequester4;
                function5 = function8;
            } else {
                composer2 = composerStartRestartGroup;
                composer2.skipToGroupEnd();
                focusRequester3 = focusRequester2;
                function5 = function4;
            }
            scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup != null) {
                scopeUpdateScopeEndRestartGroup.updateScope(new bv(str, function0, z, modifier, focusRequester3, function1, function5, i, i2));
            }
        }
        i3 |= 1572864;
        function4 = function2;
        if ((599187 & i3) != 599186) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (composerStartRestartGroup.shouldExecute(z2, i3 & 1)) {
            if (i7 != 0) {
                focusRequester2 = null;
            }
            if (i4 != 0) {
                function4 = null;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-2029571771, i3, -1, "com.dh.myembyapp.ui.screens.player.components.PlaybackErrorActionButton (PlaybackErrorDialog.kt:324)");
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
            focusRequester4 = focusRequester2;
            int i14 = i3;
            Function2 function9 = function4;
            State<Float> stateAnimateFloatAsState4 = AnimateAsStateKt.animateFloatAsState(f, null, 0.0f, null, null, composerStartRestartGroup, 0, 30);
            RoundedCornerShape = RoundedCornerShapeKt.RoundedCornerShape(50);
            long jS4 = hc2.s(((Boolean) mutableState.getValue()).booleanValue());
            Modifier modifierClip4 = ClipKt.clip(ScaleKt.scale(SizeKt.m1050height3ABfNKs(modifier, Dp.m7813constructorimpl(44.0f)), stateAnimateFloatAsState4.getValue().floatValue()), RoundedCornerShape);
            if (((Boolean) mutableState.getValue()).booleanValue()) {
                modifierM286borderxT4_qwU = BorderKt.m286borderxT4_qwU(Modifier.INSTANCE, Dp.m7813constructorimpl(2.0f), Color.INSTANCE.m5189getWhite0d7_KjU(), RoundedCornerShape);
            } else {
                modifierM286borderxT4_qwU = Modifier.INSTANCE;
            }
            Modifier modifierThen7 = modifierClip4.then(modifierM286borderxT4_qwU);
            MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy4 = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.INSTANCE.getTopStart(), false);
            long currentCompositeKeyHashCode4 = ComposablesKt.getCurrentCompositeKeyHashCode(composerStartRestartGroup, 0);
            int i15 = (int) (currentCompositeKeyHashCode4 ^ (currentCompositeKeyHashCode4 >>> 32));
            CompositionLocalMap currentCompositionLocalMap4 = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier4 = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifierThen7);
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
            Composer composerM4318constructorimpl4 = Updater.m4318constructorimpl(composerStartRestartGroup);
            mr.z(companion5, composerM4318constructorimpl4, measurePolicyMaybeCachedBoxMeasurePolicy4, composerM4318constructorimpl4, currentCompositionLocalMap4);
            Updater.m4326setimpl(composerM4318constructorimpl4, modifierMaterializeModifier4, (Function2<? super T, ? super Modifier, Unit>) id.h(companion5, composerM4318constructorimpl4, Integer.valueOf(i15), composerM4318constructorimpl4));
            BoxScopeInstance boxScopeInstance4 = BoxScopeInstance.INSTANCE;
            modifierFocusRequester = Modifier.INSTANCE;
            Modifier modifierFillMaxSize$default4 = SizeKt.fillMaxSize$default(modifierFocusRequester, 0.0f, 1, null);
            if (focusRequester4 != null) {
                modifierFocusRequester = FocusRequesterModifierKt.focusRequester(modifierFocusRequester, focusRequester4);
            }
            Modifier modifierThen8 = modifierFillMaxSize$default4.then(modifierFocusRequester);
            objRememberedValue2 = composerStartRestartGroup.rememberedValue();
            if (objRememberedValue2 == companion.getEmpty()) {
                objRememberedValue2 = new ub1(7, mutableState);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
            }
            Modifier modifierOnPreviewKeyEvent4 = KeyInputModifierKt.onPreviewKeyEvent(FocusChangedModifierKt.onFocusChanged(modifierThen8, (Function1) objRememberedValue2), function1);
            ButtonColors buttonColorsR4 = hc2.r(z, ColorKt.Color(4282532418L), composerStartRestartGroup, ((i14 >> 6) & 14) | RendererCapabilities.DECODER_SUPPORT_MASK, 2);
            ButtonDefaults buttonDefaults4 = ButtonDefaults.INSTANCE;
            composer2 = composerStartRestartGroup;
            ButtonKt.m8231ButtonTCVpFMg(function3, modifierOnPreviewKeyEvent4, null, false, ButtonDefaults.scale$default(buttonDefaults4, 1.0f, 1.0f, 0.0f, 0.0f, 0.0f, 28, null), null, ButtonDefaults.shape$default(buttonDefaults4, RoundedCornerShape, null, null, null, null, 30, null), buttonColorsR4, 0.0f, null, PaddingKt.m993PaddingValuesYgX7TsA(Dp.m7813constructorimpl(12.0f), Dp.m7813constructorimpl(8.0f)), null, ComposableLambdaKt.rememberComposableLambda(-1906362437, true, new d2(function9, str, jS4), composerStartRestartGroup, 54), composer2, (i14 >> 3) & 14, 390, 2860);
            composer2.endNode();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            focusRequester3 = focusRequester4;
            function5 = function9;
        } else {
            composer2 = composerStartRestartGroup;
            composer2.skipToGroupEnd();
            focusRequester3 = focusRequester2;
            function5 = function4;
        }
        scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new bv(str, function0, z, modifier, focusRequester3, function1, function5, i, i2));
        }
    }

    public static final void b(vd1 vd1Var, Function0 function0, Function0 function1, Function0 function2, Function0 function3, Composer composer, int i) {
        int i2;
        vd1Var.getClass();
        function0.getClass();
        function2.getClass();
        function3.getClass();
        Composer composerStartRestartGroup = composer.startRestartGroup(-1341013269);
        if ((i & 6) == 0) {
            i2 = (composerStartRestartGroup.changedInstance(vd1Var) ? 4 : 2) | i;
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
            i2 |= composerStartRestartGroup.changedInstance(function2) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i2 |= composerStartRestartGroup.changedInstance(function3) ? 16384 : 8192;
        }
        if (composerStartRestartGroup.shouldExecute((i2 & 9363) != 9362, i2 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1341013269, i2, -1, "com.dh.myembyapp.ui.screens.player.components.PlaybackErrorDialog (PlaybackErrorDialog.kt:143)");
            }
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            Composer.Companion companion = Composer.INSTANCE;
            if (objRememberedValue == companion.getEmpty()) {
                objRememberedValue = mr.n(composerStartRestartGroup);
            }
            FocusRequester focusRequester = (FocusRequester) objRememberedValue;
            Object objRememberedValue2 = composerStartRestartGroup.rememberedValue();
            if (objRememberedValue2 == companion.getEmpty()) {
                objRememberedValue2 = mr.n(composerStartRestartGroup);
            }
            FocusRequester focusRequester2 = (FocusRequester) objRememberedValue2;
            ScrollState scrollStateRememberScrollState = ScrollKt.rememberScrollState(0, composerStartRestartGroup, 0, 1);
            Object objRememberedValue3 = composerStartRestartGroup.rememberedValue();
            if (objRememberedValue3 == companion.getEmpty()) {
                objRememberedValue3 = EffectsKt.createCompositionCoroutineScope(EmptyCoroutineContext.INSTANCE, composerStartRestartGroup);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
            }
            CoroutineScope coroutineScope = (CoroutineScope) objRememberedValue3;
            boolean zChangedInstance = composerStartRestartGroup.changedInstance(coroutineScope) | composerStartRestartGroup.changed(scrollStateRememberScrollState);
            Object objRememberedValue4 = composerStartRestartGroup.rememberedValue();
            if (zChangedInstance || objRememberedValue4 == companion.getEmpty()) {
                objRememberedValue4 = new td1(coroutineScope, scrollStateRememberScrollState);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue4);
            }
            BackHandlerKt.BackHandler(false, function3, composerStartRestartGroup, (i2 >> 9) & Input.Keys.FORWARD_DEL, 1);
            AndroidDialog_androidKt.Dialog(function3, new DialogProperties(false, false, false, 3, (DefaultConstructorMarker) null), ComposableLambdaKt.rememberComposableLambda(230385986, true, new sd1(vd1Var, function1, (Function1) objRememberedValue4, focusRequester2, focusRequester, scrollStateRememberScrollState, function2, function0), composerStartRestartGroup, 54), composerStartRestartGroup, ((i2 >> 12) & 14) | 432, 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new eh(vd1Var, function0, function1, function2, function3, i));
        }
    }

    public static final String c(int i, String str) {
        String strReplace = new Regex("\\s+").replace(StringsKt.trim((CharSequence) str).toString(), " ");
        return strReplace.length() <= i ? strReplace : c61.n(StringsKt__StringsKt.trimEnd((CharSequence) StringsKt.take(strReplace, i)).toString(), "...");
    }

    public static final String d(String str) {
        int iIndexOf$default = StringsKt__StringsKt.indexOf$default((CharSequence) str, '?', 0, false, 6, (Object) null);
        if (iIndexOf$default >= 0) {
            str = c61.n(StringsKt.take(str, iIndexOf$default), "?...");
        }
        return c(220, str);
    }

    public static final String e(Throwable th) {
        String simpleName = th.getClass().getSimpleName();
        if (StringsKt.isBlank(simpleName)) {
            simpleName = null;
        }
        return simpleName == null ? StringsKt__StringsKt.substringAfterLast$default(th.getClass().getName(), '.', (String) null, 2, (Object) null) : simpleName;
    }
}
