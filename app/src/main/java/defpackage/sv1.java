package defpackage;

import androidx.compose.foundation.ScrollKt;
import androidx.compose.foundation.ScrollState;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.BoxWithConstraintsKt;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnScopeInstance;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.lazy.grid.LazyGridState;
import androidx.compose.foundation.lazy.grid.LazyGridStateKt;
import androidx.compose.material3.MaterialTheme;
import androidx.compose.material3.ProgressIndicatorKt;
import androidx.compose.material3.SurfaceKt;
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
import androidx.compose.runtime.saveable.RememberSaveableKt;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.focus.FocusPropertiesKt;
import androidx.compose.ui.focus.FocusRequester;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.unit.Dp;
import androidx.media3.exoplayer.RendererCapabilities;

import java.util.List;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.ranges.RangesKt;
import kotlin.ranges.RangesKt;
import kotlin.text.StringsKt;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: loaded from: classes4.dex */
public abstract class sv1 {
    /* JADX WARN: Multi-variable type inference failed */
    public static final void a(String str, Function1 function1, FocusRequester focusRequester, Modifier modifier, Composer composer, int i) {
        int i2;
        Composer composer2;
        Composer composerStartRestartGroup = composer.startRestartGroup(827793716);
        if ((i & 6) == 0) {
            i2 = (composerStartRestartGroup.changed(str) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= composerStartRestartGroup.changedInstance(function1) ? 32 : 16;
        }
        if ((i & RendererCapabilities.DECODER_SUPPORT_MASK) == 0) {
            i2 |= composerStartRestartGroup.changed(focusRequester) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= composerStartRestartGroup.changed(modifier) ? 2048 : 1024;
        }
        if (composerStartRestartGroup.shouldExecute((i2 & 1171) != 1170, i2 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(827793716, i2, -1, "com.dh.myembyapp.ui.screens.home.SearchBar (SearchPage.kt:475)");
            }
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                objRememberedValue = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Boolean.FALSE, null, 2, null);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            MutableState mutableState = (MutableState) objRememberedValue;
            composer2 = composerStartRestartGroup;
            SurfaceKt.m2905SurfaceT9BRK9s(SizeKt.m1050height3ABfNKs(modifier, Dp.m7813constructorimpl(56.0f)), MaterialTheme.INSTANCE.getShapes(composerStartRestartGroup, MaterialTheme.$stable).getMedium(), yc2.l(((Boolean) mutableState.getValue()).booleanValue(), composerStartRestartGroup), 0L, 0.0f, 0.0f, yc2.k(((Boolean) mutableState.getValue()).booleanValue(), composerStartRestartGroup), ComposableLambdaKt.rememberComposableLambda(1600286351, true, new zj(4, mutableState, (Object) str, (Object) function1, (Object) focusRequester), composerStartRestartGroup, 54), composer2, 12582912, 56);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composer2 = composerStartRestartGroup;
            composer2.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new l5(str, function1, (Object) focusRequester, modifier, i, 20));
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void b(boolean z, Function1 function1, Modifier modifier, Composer composer, int i) {
        int i2;
        Modifier modifier2;
        int i3;
        int i4;
        MutableState mutableState;
        Modifier.Companion companion;
        LazyGridState lazyGridState;
        float f;
        Modifier.Companion companion2;
        FocusRequester focusRequester;
        MutableState mutableState2;
        MutableState mutableState3;
        MutableState mutableState4;
        function1.getClass();
        Composer composerStartRestartGroup = composer.startRestartGroup(2046741471);
        if ((i & 6) == 0) {
            i2 = i | (composerStartRestartGroup.changed(z) ? 4 : 2);
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= composerStartRestartGroup.changedInstance(function1) ? 32 : 16;
        }
        int i5 = i2 | RendererCapabilities.DECODER_SUPPORT_MASK;
        if (composerStartRestartGroup.shouldExecute((i5 & Input.Keys.NUMPAD_3) != 146, i5 & 1)) {
            Modifier.Companion companion3 = Modifier.INSTANCE;
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(2046741471, i5, -1, "com.dh.myembyapp.ui.screens.home.SearchPage (SearchPage.kt:52)");
            }
            Object[] objArr = new Object[0];
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            Composer.Companion companion4 = Composer.INSTANCE;
            if (objRememberedValue == companion4.getEmpty()) {
                objRememberedValue = new mu1(6);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            MutableState mutableState5 = (MutableState) RememberSaveableKt.rememberSaveable(objArr, (Function0) objRememberedValue, composerStartRestartGroup, 48);
            Object objRememberedValue2 = composerStartRestartGroup.rememberedValue();
            if (objRememberedValue2 == companion4.getEmpty()) {
                objRememberedValue2 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(CollectionsKt.emptyList(), null, 2, null);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
            }
            MutableState mutableState6 = (MutableState) objRememberedValue2;
            Object objRememberedValue3 = composerStartRestartGroup.rememberedValue();
            if (objRememberedValue3 == companion4.getEmpty()) {
                objRememberedValue3 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(CollectionsKt.emptyList(), null, 2, null);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
            }
            MutableState mutableState7 = (MutableState) objRememberedValue3;
            Object objRememberedValue4 = composerStartRestartGroup.rememberedValue();
            if (objRememberedValue4 == companion4.getEmpty()) {
                objRememberedValue4 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Boolean.FALSE, null, 2, null);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue4);
            }
            MutableState mutableState8 = (MutableState) objRememberedValue4;
            Object objRememberedValue5 = composerStartRestartGroup.rememberedValue();
            if (objRememberedValue5 == companion4.getEmpty()) {
                objRememberedValue5 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Boolean.TRUE, null, 2, null);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue5);
            }
            MutableState mutableState9 = (MutableState) objRememberedValue5;
            Object objRememberedValue6 = composerStartRestartGroup.rememberedValue();
            if (objRememberedValue6 == companion4.getEmpty()) {
                objRememberedValue6 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default("", null, 2, null);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue6);
            }
            MutableState mutableState10 = (MutableState) objRememberedValue6;
            Object[] objArr2 = new Object[0];
            Object objRememberedValue7 = composerStartRestartGroup.rememberedValue();
            if (objRememberedValue7 == companion4.getEmpty()) {
                objRememberedValue7 = new mu1(2);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue7);
            }
            MutableState mutableState11 = (MutableState) RememberSaveableKt.rememberSaveable(objArr2, (Function0) objRememberedValue7, composerStartRestartGroup, 48);
            Object[] objArr3 = new Object[0];
            Object objRememberedValue8 = composerStartRestartGroup.rememberedValue();
            if (objRememberedValue8 == companion4.getEmpty()) {
                objRememberedValue8 = new mu1(3);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue8);
            }
            MutableState mutableState12 = (MutableState) RememberSaveableKt.rememberSaveable(objArr3, (Function0) objRememberedValue8, composerStartRestartGroup, 48);
            Object[] objArr4 = new Object[0];
            Object objRememberedValue9 = composerStartRestartGroup.rememberedValue();
            if (objRememberedValue9 == companion4.getEmpty()) {
                objRememberedValue9 = new mu1(4);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue9);
            }
            MutableState mutableState13 = (MutableState) RememberSaveableKt.rememberSaveable(objArr4, (Function0) objRememberedValue9, composerStartRestartGroup, 48);
            Object[] objArr5 = new Object[0];
            Object objRememberedValue10 = composerStartRestartGroup.rememberedValue();
            if (objRememberedValue10 == companion4.getEmpty()) {
                objRememberedValue10 = new mu1(5);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue10);
            }
            MutableState mutableState14 = (MutableState) RememberSaveableKt.rememberSaveable(objArr5, (Function0) objRememberedValue10, composerStartRestartGroup, 48);
            Object objRememberedValue11 = composerStartRestartGroup.rememberedValue();
            if (objRememberedValue11 == companion4.getEmpty()) {
                objRememberedValue11 = mr.n(composerStartRestartGroup);
            }
            FocusRequester focusRequester2 = (FocusRequester) objRememberedValue11;
            Object objRememberedValue12 = composerStartRestartGroup.rememberedValue();
            if (objRememberedValue12 == companion4.getEmpty()) {
                objRememberedValue12 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Boolean.FALSE, null, 2, null);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue12);
            }
            MutableState mutableState15 = (MutableState) objRememberedValue12;
            Object objRememberedValue13 = composerStartRestartGroup.rememberedValue();
            if (objRememberedValue13 == companion4.getEmpty()) {
                objRememberedValue13 = mr.n(composerStartRestartGroup);
            }
            FocusRequester focusRequester3 = (FocusRequester) objRememberedValue13;
            Object objRememberedValue14 = composerStartRestartGroup.rememberedValue();
            if (objRememberedValue14 == companion4.getEmpty()) {
                objRememberedValue14 = EffectsKt.createCompositionCoroutineScope(EmptyCoroutineContext.INSTANCE, composerStartRestartGroup);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue14);
            }
            CoroutineScope coroutineScope = (CoroutineScope) objRememberedValue14;
            Object objRememberedValue15 = composerStartRestartGroup.rememberedValue();
            if (objRememberedValue15 == companion4.getEmpty()) {
                objRememberedValue15 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(null, null, 2, null);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue15);
            }
            MutableState mutableState16 = (MutableState) objRememberedValue15;
            io ioVar = (io) composerStartRestartGroup.consume(jo.a);
            float fM7813constructorimpl = Dp.m7813constructorimpl(Dp.m7813constructorimpl(16.0f) + ioVar.f);
            Unit unit = Unit.INSTANCE;
            boolean zChangedInstance = composerStartRestartGroup.changedInstance(coroutineScope);
            Object objRememberedValue16 = composerStartRestartGroup.rememberedValue();
            if (zChangedInstance || objRememberedValue16 == companion4.getEmpty()) {
                objRememberedValue16 = new e6((Object) coroutineScope, mutableState7, (State) mutableState9, (Continuation) null, 14);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue16);
            }
            EffectsKt.LaunchedEffect(unit, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) objRememberedValue16, composerStartRestartGroup, 6);
            String str = (String) mutableState5.getValue();
            boolean zChanged = composerStartRestartGroup.changed(mutableState5) | composerStartRestartGroup.changedInstance(r18);
            Object objRememberedValue17 = composerStartRestartGroup.rememberedValue();
            if (zChanged || objRememberedValue17 == companion4.getEmpty()) {
                objRememberedValue17 = new qv1(coroutineScope, mutableState16, mutableState5, mutableState6, mutableState10, mutableState8, null);
                mutableState6 = mutableState6;
                composerStartRestartGroup.updateRememberedValue(objRememberedValue17);
            }
            EffectsKt.LaunchedEffect(str, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) objRememberedValue17, composerStartRestartGroup, 0);
            Modifier modifierM1003paddingqDBjuR0$default = PaddingKt.m1003paddingqDBjuR0$default(SizeKt.fillMaxSize$default(companion3, 0.0f, 1, null), 0.0f, Dp.m7813constructorimpl(80.0f), 0.0f, 0.0f, 13, null);
            Arrangement.Vertical top = Arrangement.INSTANCE.getTop();
            Alignment.Companion companion5 = Alignment.INSTANCE;
            MeasurePolicy measurePolicyColumnMeasurePolicy = ColumnKt.columnMeasurePolicy(top, companion5.getStart(), composerStartRestartGroup, 0);
            long currentCompositeKeyHashCode = ComposablesKt.getCurrentCompositeKeyHashCode(composerStartRestartGroup, 0);
            int i6 = (int) (currentCompositeKeyHashCode ^ (currentCompositeKeyHashCode >>> 32));
            CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifierM1003paddingqDBjuR0$default);
            ComposeUiNode.Companion companion6 = ComposeUiNode.INSTANCE;
            Function0<ComposeUiNode> constructor = companion6.getConstructor();
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
            mr.z(companion6, composerM4318constructorimpl, measurePolicyColumnMeasurePolicy, composerM4318constructorimpl, currentCompositionLocalMap);
            Updater.m4326setimpl(composerM4318constructorimpl, modifierMaterializeModifier, (Function2<? super T, ? super Modifier, Unit>) id.h(companion6, composerM4318constructorimpl, Integer.valueOf(i6), composerM4318constructorimpl));
            ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.INSTANCE;
            String str2 = (String) mutableState5.getValue();
            boolean zChanged2 = composerStartRestartGroup.changed(mutableState5);
            Object objRememberedValue18 = composerStartRestartGroup.rememberedValue();
            if (zChanged2 || objRememberedValue18 == companion4.getEmpty()) {
                objRememberedValue18 = new li1(17, mutableState5);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue18);
            }
            Continuation continuation = null;
            a(str2, (Function1) objRememberedValue18, focusRequester3, PaddingKt.m1003paddingqDBjuR0$default(SizeKt.fillMaxWidth$default(companion3, 0.0f, 1, null), Dp.m7813constructorimpl(48.0f), 0.0f, Dp.m7813constructorimpl(48.0f), Dp.m7813constructorimpl(8.0f), 2, null), composerStartRestartGroup, 3456);
            if (StringsKt.isBlank((String) mutableState5.getValue())) {
                composerStartRestartGroup.startReplaceGroup(-1654883276);
                if (((Boolean) mutableState9.getValue()).booleanValue()) {
                    composerStartRestartGroup.startReplaceGroup(-1655047824);
                    Modifier modifierFillMaxSize$default = SizeKt.fillMaxSize$default(companion3, 0.0f, 1, null);
                    MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(companion5.getCenter(), false);
                    long currentCompositeKeyHashCode2 = ComposablesKt.getCurrentCompositeKeyHashCode(composerStartRestartGroup, 0);
                    int i7 = (int) (currentCompositeKeyHashCode2 ^ (currentCompositeKeyHashCode2 >>> 32));
                    CompositionLocalMap currentCompositionLocalMap2 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                    Modifier modifierMaterializeModifier2 = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifierFillMaxSize$default);
                    Function0<ComposeUiNode> constructor2 = companion6.getConstructor();
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
                    mr.z(companion6, composerM4318constructorimpl2, measurePolicyMaybeCachedBoxMeasurePolicy, composerM4318constructorimpl2, currentCompositionLocalMap2);
                    Updater.m4326setimpl(composerM4318constructorimpl2, modifierMaterializeModifier2, (Function2<? super T, ? super Modifier, Unit>) id.h(companion6, composerM4318constructorimpl2, Integer.valueOf(i7), composerM4318constructorimpl2));
                    BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
                    ProgressIndicatorKt.m2703CircularProgressIndicator4lLiAd8(null, 0L, 0.0f, 0L, 0, 0.0f, composerStartRestartGroup, 0, 63);
                    composerStartRestartGroup.endNode();
                    composerStartRestartGroup.endReplaceGroup();
                    composerStartRestartGroup = composerStartRestartGroup;
                    companion = companion3;
                } else {
                    composerStartRestartGroup.startReplaceGroup(-1654615467);
                    ScrollState scrollStateRememberScrollState = ScrollKt.rememberScrollState(((Number) mutableState14.getValue()).intValue(), composerStartRestartGroup, 0, 0);
                    Integer numValueOf = Integer.valueOf(scrollStateRememberScrollState.getValue());
                    boolean zChanged3 = composerStartRestartGroup.changed(mutableState14) | composerStartRestartGroup.changed(scrollStateRememberScrollState);
                    Object objRememberedValue19 = composerStartRestartGroup.rememberedValue();
                    if (zChanged3 || objRememberedValue19 == companion4.getEmpty()) {
                        objRememberedValue19 = new gq(scrollStateRememberScrollState, mutableState14, continuation, 12);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue19);
                    }
                    EffectsKt.LaunchedEffect(numValueOf, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) objRememberedValue19, composerStartRestartGroup, 0);
                    Object objRememberedValue20 = composerStartRestartGroup.rememberedValue();
                    if (objRememberedValue20 == companion4.getEmpty()) {
                        objRememberedValue20 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Boolean.FALSE, null, 2, null);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue20);
                    }
                    MutableState mutableState17 = (MutableState) objRememberedValue20;
                    Boolean boolValueOf = Boolean.valueOf(z);
                    int i8 = i5 & 14;
                    boolean z2 = i8 == 4;
                    Object objRememberedValue21 = composerStartRestartGroup.rememberedValue();
                    if (z2 || objRememberedValue21 == companion4.getEmpty()) {
                        objRememberedValue21 = new jp0(z, mutableState17, null, 2);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue21);
                    }
                    EffectsKt.LaunchedEffect(boolValueOf, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) objRememberedValue21, composerStartRestartGroup, i8);
                    Boolean boolValueOf2 = Boolean.valueOf(z);
                    String str3 = (String) mutableState11.getValue();
                    Integer numValueOf2 = Integer.valueOf(((List) mutableState7.getValue()).size());
                    boolean zChanged4 = composerStartRestartGroup.changed(mutableState11) | (i8 == 4);
                    Object objRememberedValue22 = composerStartRestartGroup.rememberedValue();
                    if (zChanged4 || objRememberedValue22 == companion4.getEmpty()) {
                        i3 = 1;
                        rv1 rv1Var = new rv1(z, focusRequester2, mutableState17, mutableState7, mutableState11, mutableState15, null, 0);
                        i4 = i8;
                        mutableState = mutableState11;
                        composerStartRestartGroup.updateRememberedValue(rv1Var);
                        objRememberedValue22 = rv1Var;
                    } else {
                        mutableState = mutableState11;
                        i4 = i8;
                        i3 = 1;
                    }
                    composerStartRestartGroup = composerStartRestartGroup;
                    EffectsKt.LaunchedEffect(boolValueOf2, str3, numValueOf2, (Function2) objRememberedValue22, composerStartRestartGroup, i4);
                    companion = companion3;
                    BoxWithConstraintsKt.BoxWithConstraints(SizeKt.fillMaxSize$default(companion3, 0.0f, i3, null), null, false, ComposableLambdaKt.rememberComposableLambda(1717711179, i3, new pv1(ioVar, scrollStateRememberScrollState, fM7813constructorimpl, mutableState7, mutableState15, mutableState, focusRequester2, function1), composerStartRestartGroup, 54), composerStartRestartGroup, 3078, 6);
                    composerStartRestartGroup.endReplaceGroup();
                }
                composerStartRestartGroup.endReplaceGroup();
            } else {
                composerStartRestartGroup.startReplaceGroup(-1660990648);
                if (((Boolean) mutableState8.getValue()).booleanValue()) {
                    composerStartRestartGroup.startReplaceGroup(-1661122832);
                    Modifier modifierFillMaxSize$default2 = SizeKt.fillMaxSize$default(companion3, 0.0f, 1, null);
                    MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy2 = BoxKt.maybeCachedBoxMeasurePolicy(companion5.getCenter(), false);
                    long currentCompositeKeyHashCode3 = ComposablesKt.getCurrentCompositeKeyHashCode(composerStartRestartGroup, 0);
                    int i9 = (int) (currentCompositeKeyHashCode3 ^ (currentCompositeKeyHashCode3 >>> 32));
                    CompositionLocalMap currentCompositionLocalMap3 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                    Modifier modifierMaterializeModifier3 = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifierFillMaxSize$default2);
                    Function0<ComposeUiNode> constructor3 = companion6.getConstructor();
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
                    mr.z(companion6, composerM4318constructorimpl3, measurePolicyMaybeCachedBoxMeasurePolicy2, composerM4318constructorimpl3, currentCompositionLocalMap3);
                    Updater.m4326setimpl(composerM4318constructorimpl3, modifierMaterializeModifier3, (Function2<? super T, ? super Modifier, Unit>) id.h(companion6, composerM4318constructorimpl3, Integer.valueOf(i9), composerM4318constructorimpl3));
                    BoxScopeInstance boxScopeInstance2 = BoxScopeInstance.INSTANCE;
                    ProgressIndicatorKt.m2703CircularProgressIndicator4lLiAd8(null, 0L, 0.0f, 0L, 0, 0.0f, composerStartRestartGroup, 0, 63);
                    composerStartRestartGroup = composerStartRestartGroup;
                    composerStartRestartGroup.endNode();
                    composerStartRestartGroup.endReplaceGroup();
                    companion2 = companion3;
                } else if (((List) mutableState6.getValue()).isEmpty()) {
                    composerStartRestartGroup.startReplaceGroup(-1660850776);
                    Modifier modifierFillMaxSize$default3 = SizeKt.fillMaxSize$default(companion3, 0.0f, 1, null);
                    MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy3 = BoxKt.maybeCachedBoxMeasurePolicy(companion5.getCenter(), false);
                    long currentCompositeKeyHashCode4 = ComposablesKt.getCurrentCompositeKeyHashCode(composerStartRestartGroup, 0);
                    int i10 = (int) (currentCompositeKeyHashCode4 ^ (currentCompositeKeyHashCode4 >>> 32));
                    CompositionLocalMap currentCompositionLocalMap4 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                    Modifier modifierMaterializeModifier4 = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifierFillMaxSize$default3);
                    Function0<ComposeUiNode> constructor4 = companion6.getConstructor();
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
                    mr.z(companion6, composerM4318constructorimpl4, measurePolicyMaybeCachedBoxMeasurePolicy3, composerM4318constructorimpl4, currentCompositionLocalMap4);
                    Updater.m4326setimpl(composerM4318constructorimpl4, modifierMaterializeModifier4, (Function2<? super T, ? super Modifier, Unit>) id.h(companion6, composerM4318constructorimpl4, Integer.valueOf(i10), composerM4318constructorimpl4));
                    BoxScopeInstance boxScopeInstance3 = BoxScopeInstance.INSTANCE;
                    MaterialTheme materialTheme = MaterialTheme.INSTANCE;
                    int i11 = MaterialTheme.$stable;
                    TextKt.m3048TextNvy7gAk("未找到相关内容", null, Color.m5151copywmQWz5c$default(materialTheme.getColorScheme(composerStartRestartGroup, i11).getOnBackground(), 0.6f, 0.0f, 0.0f, 0.0f, 14, null), null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, materialTheme.getTypography(composerStartRestartGroup, i11).getBodyLarge(), composerStartRestartGroup, 6, 0, 131066);
                    composerStartRestartGroup.endNode();
                    composerStartRestartGroup.endReplaceGroup();
                    companion2 = companion3;
                    composerStartRestartGroup = composerStartRestartGroup;
                } else {
                    composerStartRestartGroup.startReplaceGroup(-1660262520);
                    LazyGridState lazyGridStateRememberLazyGridState = LazyGridStateKt.rememberLazyGridState(((Number) mutableState12.getValue()).intValue(), ((Number) mutableState13.getValue()).intValue(), composerStartRestartGroup, 0, 0);
                    Integer numValueOf3 = Integer.valueOf(lazyGridStateRememberLazyGridState.getFirstVisibleItemIndex());
                    Integer numValueOf4 = Integer.valueOf(lazyGridStateRememberLazyGridState.getFirstVisibleItemScrollOffset());
                    boolean zChanged5 = composerStartRestartGroup.changed(mutableState12) | composerStartRestartGroup.changed(lazyGridStateRememberLazyGridState) | composerStartRestartGroup.changed(mutableState13);
                    Object objRememberedValue23 = composerStartRestartGroup.rememberedValue();
                    if (zChanged5 || objRememberedValue23 == companion4.getEmpty()) {
                        objRememberedValue23 = new zx0(lazyGridStateRememberLazyGridState, mutableState12, mutableState13, null, 1);
                        lazyGridState = lazyGridStateRememberLazyGridState;
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue23);
                    } else {
                        lazyGridState = lazyGridStateRememberLazyGridState;
                    }
                    EffectsKt.LaunchedEffect(numValueOf3, numValueOf4, (Function2) objRememberedValue23, composerStartRestartGroup, 0);
                    Object objRememberedValue24 = composerStartRestartGroup.rememberedValue();
                    if (objRememberedValue24 == companion4.getEmpty()) {
                        objRememberedValue24 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Boolean.FALSE, null, 2, null);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue24);
                    }
                    MutableState mutableState18 = (MutableState) objRememberedValue24;
                    Boolean boolValueOf3 = Boolean.valueOf(z);
                    int i12 = i5 & 14;
                    boolean z3 = i12 == 4;
                    Object objRememberedValue25 = composerStartRestartGroup.rememberedValue();
                    if (z3 || objRememberedValue25 == companion4.getEmpty()) {
                        objRememberedValue25 = new jp0(z, mutableState18, null, 3);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue25);
                    }
                    EffectsKt.LaunchedEffect(boolValueOf3, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) objRememberedValue25, composerStartRestartGroup, i12);
                    Boolean boolValueOf4 = Boolean.valueOf(z);
                    String str4 = (String) mutableState11.getValue();
                    Integer numValueOf5 = Integer.valueOf(((List) mutableState6.getValue()).size());
                    boolean zChanged6 = (i12 == 4) | composerStartRestartGroup.changed(mutableState11);
                    Object objRememberedValue26 = composerStartRestartGroup.rememberedValue();
                    if (zChanged6 || objRememberedValue26 == companion4.getEmpty()) {
                        f = 0.0f;
                        companion2 = companion3;
                        MutableState mutableState19 = mutableState6;
                        rv1 rv1Var2 = new rv1(z, focusRequester2, mutableState18, mutableState19, mutableState11, mutableState15, null, 1);
                        focusRequester = focusRequester2;
                        mutableState2 = mutableState19;
                        mutableState3 = mutableState15;
                        mutableState4 = mutableState11;
                        composerStartRestartGroup.updateRememberedValue(rv1Var2);
                        objRememberedValue26 = rv1Var2;
                    } else {
                        mutableState2 = mutableState6;
                        focusRequester = focusRequester2;
                        mutableState3 = mutableState15;
                        f = 0.0f;
                        mutableState4 = mutableState11;
                        companion2 = companion3;
                    }
                    Function2 function2 = (Function2) objRememberedValue26;
                    composerStartRestartGroup = composerStartRestartGroup;
                    EffectsKt.LaunchedEffect(boolValueOf4, str4, numValueOf5, function2, composerStartRestartGroup, i12);
                    BoxWithConstraintsKt.BoxWithConstraints(SizeKt.fillMaxSize$default(companion2, f, 1, null), null, false, ComposableLambdaKt.rememberComposableLambda(499393140, true, new pv1(ioVar, fM7813constructorimpl, lazyGridState, mutableState4, function1, mutableState2, mutableState3, focusRequester), composerStartRestartGroup, 54), composerStartRestartGroup, 3078, 6);
                    composerStartRestartGroup.endReplaceGroup();
                }
                composerStartRestartGroup.endReplaceGroup();
                companion = companion2;
            }
            composerStartRestartGroup.endNode();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            modifier2 = companion;
        } else {
            composerStartRestartGroup.skipToGroupEnd();
            modifier2 = modifier;
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new kw0(z, function1, modifier2, i, 3));
        }
    }

    public static final tv1 c(float f, float f2) {
        float fM7813constructorimpl = Dp.m7813constructorimpl(24.0f);
        float fM7813constructorimpl2 = Dp.m7813constructorimpl(24.0f);
        if (Dp.m7812compareTo0680j_4(f, Dp.m7813constructorimpl(0.0f)) <= 0 || Dp.m7812compareTo0680j_4(f2, Dp.m7813constructorimpl(0.0f)) <= 0) {
            return new tv1(1, fM7813constructorimpl, fM7813constructorimpl2);
        }
        int iCoerceAtMost = RangesKt.coerceAtMost(RangesKt.coerceAtLeast((int) (Dp.m7813constructorimpl(((Dp) RangesKt___RangesKt.coerceAtLeast(Dp.m7811boximpl(Dp.m7813constructorimpl(f - Dp.m7813constructorimpl(fM7813constructorimpl * 2.0f))), Dp.m7811boximpl(f2))).m7827unboximpl() + fM7813constructorimpl2) / Dp.m7813constructorimpl(f2 + fM7813constructorimpl2)), 1), 12);
        return new tv1(iCoerceAtMost, ((Dp) RangesKt___RangesKt.coerceAtLeast(Dp.m7811boximpl(Dp.m7813constructorimpl(Dp.m7813constructorimpl(f - Dp.m7813constructorimpl(Dp.m7813constructorimpl((iCoerceAtMost - 1) * fM7813constructorimpl2) + Dp.m7813constructorimpl(f2 * iCoerceAtMost))) / 2.0f)), Dp.m7811boximpl(fM7813constructorimpl))).m7827unboximpl(), fM7813constructorimpl2);
    }

    public static final Modifier d(Modifier modifier, int i, int i2, int i3) {
        boolean z = true;
        int iCoerceAtLeast = RangesKt.coerceAtLeast(i3, 1);
        int i4 = i % iCoerceAtLeast;
        boolean z2 = i4 == 0;
        if (i4 != iCoerceAtLeast - 1 && i != i2 - 1) {
            z = false;
        }
        return (z2 || z) ? FocusPropertiesKt.focusProperties(modifier, new b8(z2, z, 2)) : modifier;
    }
}
