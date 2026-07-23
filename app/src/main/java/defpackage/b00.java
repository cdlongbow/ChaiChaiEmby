package defpackage;

import android.content.Context;
import android.graphics.Bitmap;
import androidx.compose.foundation.BorderKt;
import androidx.compose.foundation.ImageKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnScopeInstance;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.RowKt;
import androidx.compose.foundation.layout.RowScopeInstance;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.SpacerKt;
import androidx.compose.foundation.lazy.LazyDslKt;
import androidx.compose.material3.MaterialTheme;
import androidx.compose.material3.TextKt;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.DisposableEffectResult;
import androidx.compose.runtime.DisposableEffectScope;
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
import androidx.compose.ui.focus.FocusChangedModifierKt;
import androidx.compose.ui.focus.FocusRequester;
import androidx.compose.ui.focus.FocusRequesterModifierKt;
import androidx.compose.ui.graphics.AndroidImageBitmap_androidKt;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.text.style.TextAlign;
import androidx.compose.ui.unit.Dp;
import androidx.compose.ui.window.AndroidDialog_androidKt;
import androidx.compose.ui.window.DialogProperties;
import androidx.lifecycle.HasDefaultViewModelProviderFactory;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStoreOwner;
import androidx.lifecycle.viewmodel.CreationExtras;
import androidx.lifecycle.viewmodel.compose.LocalViewModelStoreOwner;
import androidx.lifecycle.viewmodel.compose.ViewModelKt;
import androidx.media3.exoplayer.RendererCapabilities;

import com.dh.myembyapp.data.model.DanmakuConfig;
import com.dh.myembyapp.server.DanmakuConfigServerManager;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.CollectionsKt;
import kotlin.collections.IntIterator;
import kotlin.collections.MapsKt;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Reflection;
import kotlin.ranges.IntRange;
import kotlin.ranges.RangesKt;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: loaded from: classes4.dex */
public abstract class b00 {
    /* JADX WARN: Code duplicated, block: B:100:0x0291  */
    /* JADX WARN: Code duplicated, block: B:107:0x02b9  */
    /* JADX WARN: Code duplicated, block: B:112:0x02e6  */
    /* JADX WARN: Code duplicated, block: B:115:0x02f7  */
    /* JADX WARN: Code duplicated, block: B:116:0x0342  */
    /* JADX WARN: Code duplicated, block: B:119:0x0386  */
    /* JADX WARN: Code duplicated, block: B:122:0x0392  */
    /* JADX WARN: Code duplicated, block: B:123:0x0396  */
    /* JADX WARN: Code duplicated, block: B:127:0x03df  */
    /* JADX WARN: Code duplicated, block: B:130:0x03f4  */
    /* JADX WARN: Code duplicated, block: B:132:0x03fb  */
    /* JADX WARN: Code duplicated, block: B:134:0x0401  */
    /* JADX WARN: Code duplicated, block: B:137:0x040d  */
    /* JADX WARN: Code duplicated, block: B:140:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:23:0x0042  */
    /* JADX WARN: Code duplicated, block: B:26:0x004d  */
    /* JADX WARN: Code duplicated, block: B:27:0x004f  */
    /* JADX WARN: Code duplicated, block: B:30:0x0058  */
    /* JADX WARN: Code duplicated, block: B:36:0x0076 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:37:0x0078  */
    /* JADX WARN: Code duplicated, block: B:38:0x007b  */
    /* JADX WARN: Code duplicated, block: B:41:0x0085  */
    /* JADX WARN: Code duplicated, block: B:43:0x0089  */
    /* JADX WARN: Code duplicated, block: B:44:0x0091  */
    /* JADX WARN: Code duplicated, block: B:48:0x00c4  */
    /* JADX WARN: Code duplicated, block: B:51:0x00d9  */
    /* JADX WARN: Code duplicated, block: B:54:0x00f0  */
    /* JADX WARN: Code duplicated, block: B:57:0x0106  */
    /* JADX WARN: Code duplicated, block: B:60:0x0129  */
    /* JADX WARN: Code duplicated, block: B:63:0x014c  */
    /* JADX WARN: Code duplicated, block: B:66:0x016f  */
    /* JADX WARN: Code duplicated, block: B:69:0x0192 A[LOOP:0: B:67:0x018c->B:69:0x0192, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:73:0x01d9  */
    /* JADX WARN: Code duplicated, block: B:76:0x01ef  */
    /* JADX WARN: Code duplicated, block: B:79:0x0203  */
    /* JADX WARN: Code duplicated, block: B:82:0x021a  */
    /* JADX WARN: Code duplicated, block: B:85:0x022f  */
    /* JADX WARN: Code duplicated, block: B:88:0x0241  */
    /* JADX WARN: Code duplicated, block: B:91:0x0253  */
    /* JADX WARN: Code duplicated, block: B:94:0x0265  */
    /* JADX WARN: Code duplicated, block: B:97:0x027a  */
    public static final void a(Function0 function0, boolean z, c00 c00Var, Composer composer, int i, int i2) {
        Function0 function1;
        int i3;
        boolean z2;
        int i4;
        boolean z3;
        c00 c00Var2;
        boolean z4;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        boolean z5;
        ViewModelStoreOwner current;
        CreationExtras defaultViewModelCreationExtras;
        int i5;
        int i6;
        int i7;
        char c;
        c00 c00Var3;
        int i8;
        boolean z6;
        Context context;
        u61 u61Var;
        State stateCollectAsState;
        Object objRememberedValue;
        Composer.Companion companion;
        MutableState mutableState;
        Object objRememberedValue2;
        MutableState mutableState2;
        Object objRememberedValue3;
        MutableState mutableState3;
        Object objRememberedValue4;
        MutableState mutableState4;
        Object objRememberedValue5;
        Composer.Companion companion2;
        MutableState mutableState5;
        Object objRememberedValue6;
        DanmakuConfigServerManager danmakuConfigServerManager;
        Object objRememberedValue7;
        MutableState mutableState6;
        Object objRememberedValue8;
        MutableState mutableState7;
        Object objRememberedValue9;
        FocusRequester focusRequester;
        Object objRememberedValue10;
        FocusRequester focusRequester2;
        Object objRememberedValue11;
        FocusRequester focusRequester3;
        Object objRememberedValue12;
        MutableState mutableState8;
        Object objRememberedValue13;
        MutableState mutableState9;
        Object objRememberedValue14;
        MutableState mutableState10;
        boolean zChanged;
        Object objRememberedValue15;
        boolean zChangedInstance;
        Object objRememberedValue16;
        Function0<ComposeUiNode> constructor;
        Continuation continuation;
        FocusRequester focusRequester4;
        Object objRememberedValue17;
        LinkedHashMap linkedHashMap;
        Iterator<Integer> it;
        function0.getClass();
        Composer composerStartRestartGroup = composer.startRestartGroup(1364449561);
        if ((i & 6) == 0) {
            function1 = function0;
            i3 = (composerStartRestartGroup.changedInstance(function1) ? 4 : 2) | i;
        } else {
            function1 = function0;
            i3 = i;
        }
        int i9 = i2 & 2;
        if (i9 == 0) {
            if ((i & 48) == 0) {
                z2 = z;
                i3 |= composerStartRestartGroup.changed(z2) ? 32 : 16;
            }
            if ((i & RendererCapabilities.DECODER_SUPPORT_MASK) == 0) {
                i3 |= 128;
            }
            i4 = i3;
            if ((i4 & Input.Keys.NUMPAD_3) != 146) {
                z3 = true;
            } else {
                z3 = false;
            }
            if (composerStartRestartGroup.shouldExecute(z3, i4 & 1)) {
                composerStartRestartGroup.startDefaults();
                if ((i & 1) != 0 || composerStartRestartGroup.getDefaultsInvalid()) {
                    if (i9 != 0) {
                        z5 = false;
                    } else {
                        z5 = z2;
                    }
                    current = LocalViewModelStoreOwner.INSTANCE.getCurrent(composerStartRestartGroup, 6);
                    if (current == null) {
                        rd1.o("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner");
                        return;
                    }
                    if (current instanceof HasDefaultViewModelProviderFactory) {
                        defaultViewModelCreationExtras = ((HasDefaultViewModelProviderFactory) current).getDefaultViewModelCreationExtras();
                    } else {
                        defaultViewModelCreationExtras = CreationExtras.Empty.INSTANCE;
                    }
                    i5 = 1;
                    i6 = 0;
                    i7 = 6;
                    c = ' ';
                    c00Var3 = (c00) ViewModelKt.viewModel(Reflection.getOrCreateKotlinClass(c00.class), current, (String) null, (ViewModelProvider.Factory) null, defaultViewModelCreationExtras, composerStartRestartGroup, 0, 0);
                    i8 = i4 & (-897);
                    z6 = z5;
                } else {
                    composerStartRestartGroup.skipToGroupEnd();
                    i8 = i4 & (-897);
                    c00Var3 = c00Var;
                    z6 = z2;
                    i7 = 6;
                    i6 = 0;
                    i5 = 1;
                    c = ' ';
                }
                composerStartRestartGroup.endDefaults();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(1364449561, i8, -1, "com.dh.myembyapp.ui.screens.danmaku.DanmakuSettingsScreen (DanmakuSettingsScreen.kt:62)");
                }
                context = (Context) composerStartRestartGroup.consume(AndroidCompositionLocals_androidKt.getLocalContext());
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-175699322, i7, -1, "com.dh.myembyapp.ui.theme.MyEmbyTheme.<get-colors> (Theme.kt:122)");
                }
                u61Var = (u61) composerStartRestartGroup.consume(n72.b);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                stateCollectAsState = SnapshotStateKt.collectAsState(c00Var3.c, null, composerStartRestartGroup, i6, i5);
                objRememberedValue = composerStartRestartGroup.rememberedValue();
                companion = Composer.INSTANCE;
                if (objRememberedValue == companion.getEmpty()) {
                    objRememberedValue = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Boolean.valueOf(((DanmakuConfig) stateCollectAsState.getValue()).getEnabled()), null, 2, null);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                }
                mutableState = (MutableState) objRememberedValue;
                objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                if (objRememberedValue2 == companion.getEmpty()) {
                    objRememberedValue2 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(CollectionsKt.toMutableList((Collection) ((DanmakuConfig) stateCollectAsState.getValue()).getApiSlotNames()), null, 2, null);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                }
                mutableState2 = (MutableState) objRememberedValue2;
                objRememberedValue3 = composerStartRestartGroup.rememberedValue();
                if (objRememberedValue3 == companion.getEmpty()) {
                    objRememberedValue3 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(CollectionsKt.toMutableList((Collection) ((DanmakuConfig) stateCollectAsState.getValue()).getApiSlotUrls()), null, 2, null);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
                }
                mutableState3 = (MutableState) objRememberedValue3;
                objRememberedValue4 = composerStartRestartGroup.rememberedValue();
                if (objRememberedValue4 == companion.getEmpty()) {
                    IntRange intRange = new IntRange(i6, 4);
                    linkedHashMap = new LinkedHashMap(RangesKt.coerceAtLeast(MapsKt.mapCapacity(CollectionsKt__IterablesKt.collectionSizeOrDefault(intRange, 10)), 16));
                    it = intRange.iterator();
                    while (it.hasNext()) {
                        int iNextInt = ((IntIterator) it).nextInt();
                        Pair pair = TuplesKt.to(Integer.valueOf(iNextInt), Boolean.valueOf(((DanmakuConfig) stateCollectAsState.getValue()).isApiUseProxy(iNextInt)));
                        linkedHashMap.put(pair.getFirst(), pair.getSecond());
                    }
                    objRememberedValue4 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(MapsKt.toMutableMap(linkedHashMap), null, 2, null);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue4);
                }
                mutableState4 = (MutableState) objRememberedValue4;
                objRememberedValue5 = composerStartRestartGroup.rememberedValue();
                companion2 = Composer.INSTANCE;
                if (objRememberedValue5 == companion2.getEmpty()) {
                    objRememberedValue5 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Boolean.FALSE, null, 2, null);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue5);
                }
                mutableState5 = (MutableState) objRememberedValue5;
                objRememberedValue6 = composerStartRestartGroup.rememberedValue();
                if (objRememberedValue6 == companion2.getEmpty()) {
                    objRememberedValue6 = new DanmakuConfigServerManager(context);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue6);
                }
                danmakuConfigServerManager = (DanmakuConfigServerManager) objRememberedValue6;
                objRememberedValue7 = composerStartRestartGroup.rememberedValue();
                if (objRememberedValue7 == companion2.getEmpty()) {
                    objRememberedValue7 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default("", null, 2, null);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue7);
                }
                mutableState6 = (MutableState) objRememberedValue7;
                objRememberedValue8 = composerStartRestartGroup.rememberedValue();
                if (objRememberedValue8 == companion2.getEmpty()) {
                    objRememberedValue8 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(null, null, 2, null);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue8);
                }
                mutableState7 = (MutableState) objRememberedValue8;
                objRememberedValue9 = composerStartRestartGroup.rememberedValue();
                if (objRememberedValue9 == companion2.getEmpty()) {
                    objRememberedValue9 = mr.n(composerStartRestartGroup);
                }
                focusRequester = (FocusRequester) objRememberedValue9;
                objRememberedValue10 = composerStartRestartGroup.rememberedValue();
                if (objRememberedValue10 == companion2.getEmpty()) {
                    objRememberedValue10 = mr.n(composerStartRestartGroup);
                }
                focusRequester2 = (FocusRequester) objRememberedValue10;
                objRememberedValue11 = composerStartRestartGroup.rememberedValue();
                if (objRememberedValue11 == companion2.getEmpty()) {
                    objRememberedValue11 = mr.n(composerStartRestartGroup);
                }
                focusRequester3 = (FocusRequester) objRememberedValue11;
                objRememberedValue12 = composerStartRestartGroup.rememberedValue();
                if (objRememberedValue12 == companion2.getEmpty()) {
                    objRememberedValue12 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Boolean.FALSE, null, 2, null);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue12);
                }
                mutableState8 = (MutableState) objRememberedValue12;
                objRememberedValue13 = composerStartRestartGroup.rememberedValue();
                if (objRememberedValue13 == companion2.getEmpty()) {
                    objRememberedValue13 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Boolean.FALSE, null, 2, null);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue13);
                }
                mutableState9 = (MutableState) objRememberedValue13;
                objRememberedValue14 = composerStartRestartGroup.rememberedValue();
                if (objRememberedValue14 == companion2.getEmpty()) {
                    objRememberedValue14 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Boolean.FALSE, null, 2, null);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue14);
                }
                mutableState10 = (MutableState) objRememberedValue14;
                Unit unit = Unit.INSTANCE;
                zChanged = composerStartRestartGroup.changed(stateCollectAsState) | composerStartRestartGroup.changedInstance(danmakuConfigServerManager);
                objRememberedValue15 = composerStartRestartGroup.rememberedValue();
                if (zChanged || objRememberedValue15 == companion2.getEmpty()) {
                    objRememberedValue15 = new cz(danmakuConfigServerManager, stateCollectAsState, mutableState, mutableState2, mutableState3, mutableState4, focusRequester3, mutableState6, mutableState7, (Continuation) null);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue15);
                }
                EffectsKt.LaunchedEffect(unit, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) objRememberedValue15, composerStartRestartGroup, i7);
                zChangedInstance = composerStartRestartGroup.changedInstance(danmakuConfigServerManager);
                objRememberedValue16 = composerStartRestartGroup.rememberedValue();
                if (zChangedInstance || objRememberedValue16 == companion2.getEmpty()) {
                    objRememberedValue16 = new c(danmakuConfigServerManager, 24);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue16);
                }
                EffectsKt.DisposableEffect(unit, (Function1<? super DisposableEffectScope, ? extends DisposableEffectResult>) objRememberedValue16, composerStartRestartGroup, i7);
                if (z6) {
                    composerStartRestartGroup.startReplaceGroup(769421516);
                    AndroidDialog_androidKt.Dialog(function0, new DialogProperties(true, false, false), ComposableLambdaKt.rememberComposableLambda(1485818827, true, new rz(c00Var3, u61Var, mutableState7, mutableState6, mutableState8, mutableState, mutableState3, mutableState2, mutableState5, mutableState4, mutableState9, mutableState10, focusRequester, focusRequester2, focusRequester3, function1), composerStartRestartGroup, 54), composerStartRestartGroup, (i8 & 14) | 432, 0);
                    composerStartRestartGroup = composerStartRestartGroup;
                    composerStartRestartGroup.endReplaceGroup();
                    continuation = null;
                    focusRequester4 = focusRequester;
                } else {
                    composerStartRestartGroup.startReplaceGroup(770414787);
                    Modifier.Companion companion3 = Modifier.INSTANCE;
                    Modifier modifierM999padding3ABfNKs = PaddingKt.m999padding3ABfNKs(SizeKt.fillMaxSize$default(companion3, 0.0f, 1, null), Dp.m7813constructorimpl(48.0f));
                    MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.INSTANCE.getTopStart(), false);
                    long currentCompositeKeyHashCode = ComposablesKt.getCurrentCompositeKeyHashCode(composerStartRestartGroup, 0);
                    int i10 = (int) (currentCompositeKeyHashCode ^ (currentCompositeKeyHashCode >>> c));
                    CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
                    Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifierM999padding3ABfNKs);
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
                    Composer composerM4318constructorimpl = Updater.m4318constructorimpl(composerStartRestartGroup);
                    mr.z(companion4, composerM4318constructorimpl, measurePolicyMaybeCachedBoxMeasurePolicy, composerM4318constructorimpl, currentCompositionLocalMap);
                    Updater.m4326setimpl(composerM4318constructorimpl, modifierMaterializeModifier, (Function2<? super T, ? super Modifier, Unit>) id.h(companion4, composerM4318constructorimpl, Integer.valueOf(i10), composerM4318constructorimpl));
                    BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
                    continuation = null;
                    c00 c00Var4 = c00Var3;
                    focusRequester4 = focusRequester;
                    b(mutableState7, mutableState6, u61Var, c00Var4, focusRequester4, mutableState8, mutableState, mutableState3, mutableState2, mutableState5, mutableState4, focusRequester2, function0, focusRequester3, mutableState9, mutableState10, SizeKt.fillMaxSize$default(companion3, 0.0f, 1, null), composerStartRestartGroup);
                    c00Var3 = c00Var4;
                    composerStartRestartGroup = composerStartRestartGroup;
                    composerStartRestartGroup.endNode();
                    composerStartRestartGroup.endReplaceGroup();
                }
                objRememberedValue17 = composerStartRestartGroup.rememberedValue();
                if (objRememberedValue17 == companion2.getEmpty()) {
                    objRememberedValue17 = new vm(focusRequester4, continuation, 4);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue17);
                }
                EffectsKt.LaunchedEffect(unit, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) objRememberedValue17, composerStartRestartGroup, 6);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                c00Var2 = c00Var3;
                z4 = z6;
            } else {
                composerStartRestartGroup.skipToGroupEnd();
                c00Var2 = c00Var;
                z4 = z2;
            }
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup != null) {
                scopeUpdateScopeEndRestartGroup.updateScope(new pj(function0, z4, c00Var2, i, i2));
            }
        }
        i3 |= 48;
        z2 = z;
        if ((i & RendererCapabilities.DECODER_SUPPORT_MASK) == 0) {
            i3 |= 128;
        }
        i4 = i3;
        if ((i4 & Input.Keys.NUMPAD_3) != 146) {
            z3 = true;
        } else {
            z3 = false;
        }
        if (composerStartRestartGroup.shouldExecute(z3, i4 & 1)) {
            composerStartRestartGroup.startDefaults();
            if ((i & 1) != 0) {
                if (i9 != 0) {
                    z5 = false;
                } else {
                    z5 = z2;
                }
                current = LocalViewModelStoreOwner.INSTANCE.getCurrent(composerStartRestartGroup, 6);
                if (current == null) {
                    rd1.o("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner");
                    return;
                }
                if (current instanceof HasDefaultViewModelProviderFactory) {
                    defaultViewModelCreationExtras = ((HasDefaultViewModelProviderFactory) current).getDefaultViewModelCreationExtras();
                } else {
                    defaultViewModelCreationExtras = CreationExtras.Empty.INSTANCE;
                }
                i5 = 1;
                i6 = 0;
                i7 = 6;
                c = ' ';
                c00Var3 = (c00) ViewModelKt.viewModel(Reflection.getOrCreateKotlinClass(c00.class), current, (String) null, (ViewModelProvider.Factory) null, defaultViewModelCreationExtras, composerStartRestartGroup, 0, 0);
                i8 = i4 & (-897);
                z6 = z5;
            } else {
                if (i9 != 0) {
                    z5 = false;
                } else {
                    z5 = z2;
                }
                current = LocalViewModelStoreOwner.INSTANCE.getCurrent(composerStartRestartGroup, 6);
                if (current == null) {
                    rd1.o("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner");
                    return;
                }
                if (current instanceof HasDefaultViewModelProviderFactory) {
                    defaultViewModelCreationExtras = ((HasDefaultViewModelProviderFactory) current).getDefaultViewModelCreationExtras();
                } else {
                    defaultViewModelCreationExtras = CreationExtras.Empty.INSTANCE;
                }
                i5 = 1;
                i6 = 0;
                i7 = 6;
                c = ' ';
                c00Var3 = (c00) ViewModelKt.viewModel(Reflection.getOrCreateKotlinClass(c00.class), current, (String) null, (ViewModelProvider.Factory) null, defaultViewModelCreationExtras, composerStartRestartGroup, 0, 0);
                i8 = i4 & (-897);
                z6 = z5;
            }
            composerStartRestartGroup.endDefaults();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1364449561, i8, -1, "com.dh.myembyapp.ui.screens.danmaku.DanmakuSettingsScreen (DanmakuSettingsScreen.kt:62)");
            }
            context = (Context) composerStartRestartGroup.consume(AndroidCompositionLocals_androidKt.getLocalContext());
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-175699322, i7, -1, "com.dh.myembyapp.ui.theme.MyEmbyTheme.<get-colors> (Theme.kt:122)");
            }
            u61Var = (u61) composerStartRestartGroup.consume(n72.b);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            stateCollectAsState = SnapshotStateKt.collectAsState(c00Var3.c, null, composerStartRestartGroup, i6, i5);
            objRememberedValue = composerStartRestartGroup.rememberedValue();
            companion = Composer.INSTANCE;
            if (objRememberedValue == companion.getEmpty()) {
                objRememberedValue = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Boolean.valueOf(((DanmakuConfig) stateCollectAsState.getValue()).getEnabled()), null, 2, null);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            mutableState = (MutableState) objRememberedValue;
            objRememberedValue2 = composerStartRestartGroup.rememberedValue();
            if (objRememberedValue2 == companion.getEmpty()) {
                objRememberedValue2 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(CollectionsKt.toMutableList((Collection) ((DanmakuConfig) stateCollectAsState.getValue()).getApiSlotNames()), null, 2, null);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
            }
            mutableState2 = (MutableState) objRememberedValue2;
            objRememberedValue3 = composerStartRestartGroup.rememberedValue();
            if (objRememberedValue3 == companion.getEmpty()) {
                objRememberedValue3 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(CollectionsKt.toMutableList((Collection) ((DanmakuConfig) stateCollectAsState.getValue()).getApiSlotUrls()), null, 2, null);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
            }
            mutableState3 = (MutableState) objRememberedValue3;
            objRememberedValue4 = composerStartRestartGroup.rememberedValue();
            if (objRememberedValue4 == companion.getEmpty()) {
                IntRange intRange2 = new IntRange(i6, 4);
                linkedHashMap = new LinkedHashMap(RangesKt.coerceAtLeast(MapsKt.mapCapacity(CollectionsKt__IterablesKt.collectionSizeOrDefault(intRange2, 10)), 16));
                it = intRange2.iterator();
                while (it.hasNext()) {
                    int iNextInt2 = ((IntIterator) it).nextInt();
                    Pair pair2 = TuplesKt.to(Integer.valueOf(iNextInt2), Boolean.valueOf(((DanmakuConfig) stateCollectAsState.getValue()).isApiUseProxy(iNextInt2)));
                    linkedHashMap.put(pair2.getFirst(), pair2.getSecond());
                }
                objRememberedValue4 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(MapsKt.toMutableMap(linkedHashMap), null, 2, null);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue4);
            }
            mutableState4 = (MutableState) objRememberedValue4;
            objRememberedValue5 = composerStartRestartGroup.rememberedValue();
            companion2 = Composer.INSTANCE;
            if (objRememberedValue5 == companion2.getEmpty()) {
                objRememberedValue5 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Boolean.FALSE, null, 2, null);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue5);
            }
            mutableState5 = (MutableState) objRememberedValue5;
            objRememberedValue6 = composerStartRestartGroup.rememberedValue();
            if (objRememberedValue6 == companion2.getEmpty()) {
                objRememberedValue6 = new DanmakuConfigServerManager(context);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue6);
            }
            danmakuConfigServerManager = (DanmakuConfigServerManager) objRememberedValue6;
            objRememberedValue7 = composerStartRestartGroup.rememberedValue();
            if (objRememberedValue7 == companion2.getEmpty()) {
                objRememberedValue7 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default("", null, 2, null);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue7);
            }
            mutableState6 = (MutableState) objRememberedValue7;
            objRememberedValue8 = composerStartRestartGroup.rememberedValue();
            if (objRememberedValue8 == companion2.getEmpty()) {
                objRememberedValue8 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(null, null, 2, null);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue8);
            }
            mutableState7 = (MutableState) objRememberedValue8;
            objRememberedValue9 = composerStartRestartGroup.rememberedValue();
            if (objRememberedValue9 == companion2.getEmpty()) {
                objRememberedValue9 = mr.n(composerStartRestartGroup);
            }
            focusRequester = (FocusRequester) objRememberedValue9;
            objRememberedValue10 = composerStartRestartGroup.rememberedValue();
            if (objRememberedValue10 == companion2.getEmpty()) {
                objRememberedValue10 = mr.n(composerStartRestartGroup);
            }
            focusRequester2 = (FocusRequester) objRememberedValue10;
            objRememberedValue11 = composerStartRestartGroup.rememberedValue();
            if (objRememberedValue11 == companion2.getEmpty()) {
                objRememberedValue11 = mr.n(composerStartRestartGroup);
            }
            focusRequester3 = (FocusRequester) objRememberedValue11;
            objRememberedValue12 = composerStartRestartGroup.rememberedValue();
            if (objRememberedValue12 == companion2.getEmpty()) {
                objRememberedValue12 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Boolean.FALSE, null, 2, null);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue12);
            }
            mutableState8 = (MutableState) objRememberedValue12;
            objRememberedValue13 = composerStartRestartGroup.rememberedValue();
            if (objRememberedValue13 == companion2.getEmpty()) {
                objRememberedValue13 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Boolean.FALSE, null, 2, null);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue13);
            }
            mutableState9 = (MutableState) objRememberedValue13;
            objRememberedValue14 = composerStartRestartGroup.rememberedValue();
            if (objRememberedValue14 == companion2.getEmpty()) {
                objRememberedValue14 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Boolean.FALSE, null, 2, null);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue14);
            }
            mutableState10 = (MutableState) objRememberedValue14;
            Unit unit2 = Unit.INSTANCE;
            zChanged = composerStartRestartGroup.changed(stateCollectAsState) | composerStartRestartGroup.changedInstance(danmakuConfigServerManager);
            objRememberedValue15 = composerStartRestartGroup.rememberedValue();
            if (zChanged) {
                objRememberedValue15 = new cz(danmakuConfigServerManager, stateCollectAsState, mutableState, mutableState2, mutableState3, mutableState4, focusRequester3, mutableState6, mutableState7, (Continuation) null);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue15);
            } else {
                objRememberedValue15 = new cz(danmakuConfigServerManager, stateCollectAsState, mutableState, mutableState2, mutableState3, mutableState4, focusRequester3, mutableState6, mutableState7, (Continuation) null);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue15);
            }
            EffectsKt.LaunchedEffect(unit2, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) objRememberedValue15, composerStartRestartGroup, i7);
            zChangedInstance = composerStartRestartGroup.changedInstance(danmakuConfigServerManager);
            objRememberedValue16 = composerStartRestartGroup.rememberedValue();
            if (zChangedInstance) {
                objRememberedValue16 = new c(danmakuConfigServerManager, 24);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue16);
            } else {
                objRememberedValue16 = new c(danmakuConfigServerManager, 24);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue16);
            }
            EffectsKt.DisposableEffect(unit2, (Function1<? super DisposableEffectScope, ? extends DisposableEffectResult>) objRememberedValue16, composerStartRestartGroup, i7);
            if (z6) {
                composerStartRestartGroup.startReplaceGroup(769421516);
                AndroidDialog_androidKt.Dialog(function0, new DialogProperties(true, false, false), ComposableLambdaKt.rememberComposableLambda(1485818827, true, new rz(c00Var3, u61Var, mutableState7, mutableState6, mutableState8, mutableState, mutableState3, mutableState2, mutableState5, mutableState4, mutableState9, mutableState10, focusRequester, focusRequester2, focusRequester3, function1), composerStartRestartGroup, 54), composerStartRestartGroup, (i8 & 14) | 432, 0);
                composerStartRestartGroup = composerStartRestartGroup;
                composerStartRestartGroup.endReplaceGroup();
                continuation = null;
                focusRequester4 = focusRequester;
            } else {
                composerStartRestartGroup.startReplaceGroup(770414787);
                Modifier.Companion companion5 = Modifier.INSTANCE;
                Modifier modifierM999padding3ABfNKs2 = PaddingKt.m999padding3ABfNKs(SizeKt.fillMaxSize$default(companion5, 0.0f, 1, null), Dp.m7813constructorimpl(48.0f));
                MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy2 = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.INSTANCE.getTopStart(), false);
                long currentCompositeKeyHashCode2 = ComposablesKt.getCurrentCompositeKeyHashCode(composerStartRestartGroup, 0);
                int i11 = (int) (currentCompositeKeyHashCode2 ^ (currentCompositeKeyHashCode2 >>> c));
                CompositionLocalMap currentCompositionLocalMap2 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                Modifier modifierMaterializeModifier2 = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifierM999padding3ABfNKs2);
                ComposeUiNode.Companion companion6 = ComposeUiNode.INSTANCE;
                constructor = companion6.getConstructor();
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
                mr.z(companion6, composerM4318constructorimpl2, measurePolicyMaybeCachedBoxMeasurePolicy2, composerM4318constructorimpl2, currentCompositionLocalMap2);
                Updater.m4326setimpl(composerM4318constructorimpl2, modifierMaterializeModifier2, (Function2<? super T, ? super Modifier, Unit>) id.h(companion6, composerM4318constructorimpl2, Integer.valueOf(i11), composerM4318constructorimpl2));
                BoxScopeInstance boxScopeInstance2 = BoxScopeInstance.INSTANCE;
                continuation = null;
                c00 c00Var5 = c00Var3;
                focusRequester4 = focusRequester;
                b(mutableState7, mutableState6, u61Var, c00Var5, focusRequester4, mutableState8, mutableState, mutableState3, mutableState2, mutableState5, mutableState4, focusRequester2, function0, focusRequester3, mutableState9, mutableState10, SizeKt.fillMaxSize$default(companion5, 0.0f, 1, null), composerStartRestartGroup);
                c00Var3 = c00Var5;
                composerStartRestartGroup = composerStartRestartGroup;
                composerStartRestartGroup.endNode();
                composerStartRestartGroup.endReplaceGroup();
            }
            objRememberedValue17 = composerStartRestartGroup.rememberedValue();
            if (objRememberedValue17 == companion2.getEmpty()) {
                objRememberedValue17 = new vm(focusRequester4, continuation, 4);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue17);
            }
            EffectsKt.LaunchedEffect(unit2, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) objRememberedValue17, composerStartRestartGroup, 6);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            c00Var2 = c00Var3;
            z4 = z6;
        } else {
            composerStartRestartGroup.skipToGroupEnd();
            c00Var2 = c00Var;
            z4 = z2;
        }
        scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new pj(function0, z4, c00Var2, i, i2));
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void b(MutableState mutableState, MutableState mutableState2, u61 u61Var, c00 c00Var, FocusRequester focusRequester, MutableState mutableState3, MutableState mutableState4, MutableState mutableState5, MutableState mutableState6, MutableState mutableState7, MutableState mutableState8, FocusRequester focusRequester2, Function0 function0, FocusRequester focusRequester3, MutableState mutableState9, MutableState mutableState10, Modifier modifier, Composer composer) {
        MutableState mutableState11;
        c00 c00Var2 = c00Var;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(47496407, 6, -1, "com.dh.myembyapp.ui.screens.danmaku.DanmakuSettingsScreen.ScreenContent (DanmakuSettingsScreen.kt:142)");
        }
        Arrangement arrangement = Arrangement.INSTANCE;
        Arrangement.HorizontalOrVertical horizontalOrVerticalM712spacedBy0680j_4 = arrangement.m712spacedBy0680j_4(Dp.m7813constructorimpl(48.0f));
        Alignment.Companion companion = Alignment.INSTANCE;
        MeasurePolicy measurePolicyRowMeasurePolicy = RowKt.rowMeasurePolicy(horizontalOrVerticalM712spacedBy0680j_4, companion.getTop(), composer, 6);
        long currentCompositeKeyHashCode = ComposablesKt.getCurrentCompositeKeyHashCode(composer, 0);
        int i = (int) (currentCompositeKeyHashCode ^ (currentCompositeKeyHashCode >>> 32));
        CompositionLocalMap currentCompositionLocalMap = composer.getCurrentCompositionLocalMap();
        Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(composer, modifier);
        ComposeUiNode.Companion companion2 = ComposeUiNode.INSTANCE;
        Function0<ComposeUiNode> constructor = companion2.getConstructor();
        if (composer.getApplier() == null) {
            ComposablesKt.invalidApplier();
        }
        composer.startReusableNode();
        if (composer.getInserting()) {
            composer.createNode(constructor);
        } else {
            composer.useNode();
        }
        Composer composerM4318constructorimpl = Updater.m4318constructorimpl(composer);
        mr.z(companion2, composerM4318constructorimpl, measurePolicyRowMeasurePolicy, composerM4318constructorimpl, currentCompositionLocalMap);
        Updater.m4326setimpl(composerM4318constructorimpl, modifierMaterializeModifier, (Function2<? super T, ? super Modifier, Unit>) id.h(companion2, composerM4318constructorimpl, Integer.valueOf(i), composerM4318constructorimpl));
        RowScopeInstance rowScopeInstance = RowScopeInstance.INSTANCE;
        Modifier.Companion companion3 = Modifier.INSTANCE;
        Modifier modifierFillMaxHeight$default = SizeKt.fillMaxHeight$default(zs1.E(rowScopeInstance, companion3, 0.4f, false, 2, null), 0.0f, 1, null);
        MeasurePolicy measurePolicyColumnMeasurePolicy = ColumnKt.columnMeasurePolicy(arrangement.getTop(), companion.getCenterHorizontally(), composer, 54);
        long currentCompositeKeyHashCode2 = ComposablesKt.getCurrentCompositeKeyHashCode(composer, 0);
        int i2 = (int) (currentCompositeKeyHashCode2 ^ (currentCompositeKeyHashCode2 >>> 32));
        CompositionLocalMap currentCompositionLocalMap2 = composer.getCurrentCompositionLocalMap();
        Modifier modifierMaterializeModifier2 = ComposedModifierKt.materializeModifier(composer, modifierFillMaxHeight$default);
        Function0<ComposeUiNode> constructor2 = companion2.getConstructor();
        if (composer.getApplier() == null) {
            ComposablesKt.invalidApplier();
        }
        composer.startReusableNode();
        if (composer.getInserting()) {
            composer.createNode(constructor2);
        } else {
            composer.useNode();
        }
        Composer composerM4318constructorimpl2 = Updater.m4318constructorimpl(composer);
        mr.z(companion2, composerM4318constructorimpl2, measurePolicyColumnMeasurePolicy, composerM4318constructorimpl2, currentCompositionLocalMap2);
        Updater.m4326setimpl(composerM4318constructorimpl2, modifierMaterializeModifier2, (Function2<? super T, ? super Modifier, Unit>) id.h(companion2, composerM4318constructorimpl2, Integer.valueOf(i2), composerM4318constructorimpl2));
        ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.INSTANCE;
        MaterialTheme materialTheme = MaterialTheme.INSTANCE;
        int i3 = MaterialTheme.$stable;
        TextKt.m3048TextNvy7gAk("弹幕配置", null, materialTheme.getColorScheme(composer, i3).getPrimary(), null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, materialTheme.getTypography(composer, i3).getHeadlineMedium(), composer, 6, 0, 131066);
        id.i(16.0f, companion3, composer, 6);
        TextKt.m3048TextNvy7gAk("使用手机扫码配置", null, Color.m5151copywmQWz5c$default(materialTheme.getColorScheme(composer, i3).getOnSurface(), 0.7f, 0.0f, 0.0f, 0.0f, 14, null), null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, materialTheme.getTypography(composer, i3).getBodyMedium(), composer, 6, 0, 131066);
        Composer composer2 = composer;
        SpacerKt.Spacer(SizeKt.m1050height3ABfNKs(companion3, Dp.m7813constructorimpl(24.0f)), composer2, 6);
        Bitmap bitmap = (Bitmap) mutableState.getValue();
        if (bitmap == null) {
            composer2.startReplaceGroup(-2080583136);
            composer2.endReplaceGroup();
        } else {
            composer2.startReplaceGroup(-2080583135);
            ImageKt.m332Image5hnEew(AndroidImageBitmap_androidKt.asImageBitmap(bitmap), "配置二维码", PaddingKt.m999padding3ABfNKs(BorderKt.m287borderxT4_qwU$default(SizeKt.m1064size3ABfNKs(companion3, Dp.m7813constructorimpl(280.0f)), Dp.m7813constructorimpl(2.0f), materialTheme.getColorScheme(composer2, i3).getOutline(), null, 4, null), Dp.m7813constructorimpl(16.0f)), null, null, 0.0f, null, 0, composer, 48, 248);
            composer2 = composer;
            Unit unit = Unit.INSTANCE;
            composer2.endReplaceGroup();
        }
        SpacerKt.Spacer(SizeKt.m1050height3ABfNKs(companion3, Dp.m7813constructorimpl(16.0f)), composer2, 6);
        String str = (String) mutableState2.getValue();
        TextStyle bodySmall = materialTheme.getTypography(composer2, i3).getBodySmall();
        Composer composer3 = composer2;
        TextKt.m3048TextNvy7gAk(str, PaddingKt.m1001paddingVpY3zN4$default(companion3, Dp.m7813constructorimpl(16.0f), 0.0f, 2, null), Color.m5151copywmQWz5c$default(materialTheme.getColorScheme(composer2, i3).getOnSurface(), 0.6f, 0.0f, 0.0f, 0.0f, 14, null), null, 0L, null, null, null, 0L, null, TextAlign.m7696boximpl(TextAlign.INSTANCE.m7703getCentere0LSkKk()), 0L, 0, false, 0, 0, null, bodySmall, composer3, 48, 0, 130040);
        composer3.endNode();
        Modifier modifierFillMaxHeight$default2 = SizeKt.fillMaxHeight$default(zs1.E(rowScopeInstance, companion3, 0.6f, false, 2, null), 0.0f, 1, null);
        MeasurePolicy measurePolicyColumnMeasurePolicy2 = ColumnKt.columnMeasurePolicy(arrangement.getTop(), companion.getStart(), composer3, 6);
        long currentCompositeKeyHashCode3 = ComposablesKt.getCurrentCompositeKeyHashCode(composer3, 0);
        int i4 = (int) (currentCompositeKeyHashCode3 ^ (currentCompositeKeyHashCode3 >>> 32));
        CompositionLocalMap currentCompositionLocalMap3 = composer3.getCurrentCompositionLocalMap();
        Modifier modifierMaterializeModifier3 = ComposedModifierKt.materializeModifier(composer3, modifierFillMaxHeight$default2);
        Function0<ComposeUiNode> constructor3 = companion2.getConstructor();
        if (composer3.getApplier() == null) {
            ComposablesKt.invalidApplier();
        }
        composer3.startReusableNode();
        if (composer3.getInserting()) {
            composer3.createNode(constructor3);
        } else {
            composer3.useNode();
        }
        Composer composerM4318constructorimpl3 = Updater.m4318constructorimpl(composer3);
        mr.z(companion2, composerM4318constructorimpl3, measurePolicyColumnMeasurePolicy2, composerM4318constructorimpl3, currentCompositionLocalMap3);
        Updater.m4326setimpl(composerM4318constructorimpl3, modifierMaterializeModifier3, (Function2<? super T, ? super Modifier, Unit>) id.h(companion2, composerM4318constructorimpl3, Integer.valueOf(i4), composerM4318constructorimpl3));
        Modifier modifierF = wn.F(columnScopeInstance, companion3, 1.0f, false, 2, null);
        Arrangement.HorizontalOrVertical horizontalOrVerticalM712spacedBy0680j_5 = arrangement.m712spacedBy0680j_4(Dp.m7813constructorimpl(12.0f));
        boolean zChanged = composer3.changed(u61Var) | composer3.changedInstance(c00Var2);
        Object objRememberedValue = composer3.rememberedValue();
        if (zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
            qz qzVar = new qz(focusRequester, u61Var, c00Var2, mutableState3, mutableState4, mutableState5, mutableState6, mutableState7, mutableState8, 0);
            c00Var2 = c00Var2;
            composer3.updateRememberedValue(qzVar);
            objRememberedValue = qzVar;
        }
        LazyDslKt.LazyColumn(modifierF, null, null, false, horizontalOrVerticalM712spacedBy0680j_5, null, null, false, null, (Function1) objRememberedValue, composer3, 24576, 494);
        id.i(24.0f, companion3, composer3, 6);
        Modifier modifierFillMaxWidth$default = SizeKt.fillMaxWidth$default(companion3, 0.0f, 1, null);
        MeasurePolicy measurePolicyRowMeasurePolicy2 = RowKt.rowMeasurePolicy(arrangement.m712spacedBy0680j_4(Dp.m7813constructorimpl(16.0f)), companion.getTop(), composer3, 6);
        long currentCompositeKeyHashCode4 = ComposablesKt.getCurrentCompositeKeyHashCode(composer3, 0);
        int i5 = (int) (currentCompositeKeyHashCode4 ^ (currentCompositeKeyHashCode4 >>> 32));
        CompositionLocalMap currentCompositionLocalMap4 = composer3.getCurrentCompositionLocalMap();
        Modifier modifierMaterializeModifier4 = ComposedModifierKt.materializeModifier(composer3, modifierFillMaxWidth$default);
        Function0<ComposeUiNode> constructor4 = companion2.getConstructor();
        if (composer3.getApplier() == null) {
            ComposablesKt.invalidApplier();
        }
        composer3.startReusableNode();
        if (composer3.getInserting()) {
            composer3.createNode(constructor4);
        } else {
            composer3.useNode();
        }
        Composer composerM4318constructorimpl4 = Updater.m4318constructorimpl(composer3);
        mr.z(companion2, composerM4318constructorimpl4, measurePolicyRowMeasurePolicy2, composerM4318constructorimpl4, currentCompositionLocalMap4);
        Updater.m4326setimpl(composerM4318constructorimpl4, modifierMaterializeModifier4, (Function2<? super T, ? super Modifier, Unit>) id.h(companion2, composerM4318constructorimpl4, Integer.valueOf(i5), composerM4318constructorimpl4));
        Modifier modifierFocusRequester = FocusRequesterModifierKt.focusRequester(SizeKt.m1050height3ABfNKs(zs1.E(rowScopeInstance, companion3, 1.0f, false, 2, null), Dp.m7813constructorimpl(48.0f)), focusRequester2);
        Object objRememberedValue2 = composer3.rememberedValue();
        Composer.Companion companion4 = Composer.INSTANCE;
        if (objRememberedValue2 == companion4.getEmpty()) {
            mutableState11 = mutableState9;
            objRememberedValue2 = new zh(27, mutableState11);
            composer3.updateRememberedValue(objRememberedValue2);
        } else {
            mutableState11 = mutableState9;
        }
        ButtonKt.m8231ButtonTCVpFMg(function0, FocusChangedModifierKt.onFocusChanged(modifierFocusRequester, (Function1) objRememberedValue2), null, false, hc2.l(1.05f), el0.a(u61Var), null, hc2.i(jc2.c, false, composer3, 6, 2), 0.0f, hc2.h(composer3), null, null, ComposableLambdaKt.rememberComposableLambda(-443694660, true, new p1(13, mutableState11), composer3, 54), composer3, 0, RendererCapabilities.DECODER_SUPPORT_MASK, 3404);
        Modifier modifierFocusRequester2 = FocusRequesterModifierKt.focusRequester(SizeKt.m1050height3ABfNKs(zs1.E(rowScopeInstance, companion3, 1.0f, false, 2, null), Dp.m7813constructorimpl(48.0f)), focusRequester3);
        Object objRememberedValue3 = composer3.rememberedValue();
        if (objRememberedValue3 == companion4.getEmpty()) {
            objRememberedValue3 = new zh(28, mutableState10);
            composer3.updateRememberedValue(objRememberedValue3);
        }
        Modifier modifierOnFocusChanged = FocusChangedModifierKt.onFocusChanged(modifierFocusRequester2, (Function1) objRememberedValue3);
        ButtonColors buttonColorsI = hc2.i(jc2.b, false, composer3, 6, 2);
        ButtonScale buttonScaleL = hc2.l(1.05f);
        ButtonGlow buttonGlowA = el0.a(u61Var);
        ButtonBorder buttonBorderH = hc2.h(composer3);
        boolean zChangedInstance = composer3.changedInstance(c00Var2) | composer3.changed(function0);
        Object objRememberedValue4 = composer3.rememberedValue();
        if (zChangedInstance || objRememberedValue4 == companion4.getEmpty()) {
            sz szVar = new sz(c00Var2, function0, mutableState5, mutableState6, mutableState4, mutableState7, mutableState8);
            composer3.updateRememberedValue(szVar);
            objRememberedValue4 = szVar;
        }
        ButtonKt.m8231ButtonTCVpFMg((Function0) objRememberedValue4, modifierOnFocusChanged, null, false, buttonScaleL, buttonGlowA, null, buttonColorsI, 0.0f, buttonBorderH, null, null, ComposableLambdaKt.rememberComposableLambda(1174907763, true, new p1(14, mutableState10), composer3, 54), composer3, 0, RendererCapabilities.DECODER_SUPPORT_MASK, 3404);
        if (i02.w(composer)) {
            ComposerKt.traceEventEnd();
        }
    }
}
