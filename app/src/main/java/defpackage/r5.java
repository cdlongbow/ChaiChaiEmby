package defpackage;

import android.content.Context;
import android.util.Log;
import androidx.compose.foundation.BackgroundKt;
import androidx.compose.foundation.ScrollKt;
import androidx.compose.foundation.ScrollState;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnScopeInstance;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridDslKt;
import androidx.compose.foundation.lazy.staggeredgrid.StaggeredGridCells;
import androidx.compose.foundation.text.input.internal.selection.TextFieldSelectionState;
import androidx.compose.material3.CardDefaults;
import androidx.compose.material3.CardKt;
import androidx.compose.material3.MaterialTheme;
import androidx.compose.material3.TextKt;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.focus.FocusChangedModifierKt;
import androidx.compose.ui.focus.FocusRequester;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.ColorKt;
import androidx.compose.ui.input.key.KeyInputModifierKt;
import androidx.compose.ui.input.pointer.PointerInputChange;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.unit.Constraints;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.Dp;
import androidx.compose.ui.unit.TextUnitKt;
import androidx.lifecycle.ViewModelKt;
import androidx.media3.exoplayer.RendererCapabilities;
import com.dh.myembyapp.data.model.AudioLanguagePreference;
import com.dh.myembyapp.data.model.AudioPrioritySortType;
import com.dh.myembyapp.data.model.AudioVersionPrioritySettings;
import com.dh.myembyapp.data.model.BackupRouteConfig;
import com.dh.myembyapp.data.model.ServerConfig;
import com.dh.myembyapp.data.model.SubtitlePrioritySortType;
import com.dh.myembyapp.data.model.VideoPrioritySortType;
import java.util.Iterator;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class r5 implements Function2 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ r5(Modifier modifier, MutableState mutableState, Function2 function2) {
        this.a = 1;
        this.c = modifier;
        this.d = mutableState;
        this.b = function2;
    }

    private final Object a(Object obj, Object obj2) {
        Function1 function1 = (Function1) this.c;
        o32 o32Var = (o32) this.b;
        MutableState mutableState = (MutableState) this.d;
        Composer composer = (Composer) obj;
        int iIntValue = ((Integer) obj2).intValue();
        if (composer.shouldExecute((iIntValue & 3) != 2, iIntValue & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(736202608, iIntValue, -1, "com.dh.myembyapp.ui.components.SubtitleFontManagerDialog.<anonymous>.<anonymous> (SubtitleFontManagerDialog.kt:197)");
            }
            boolean zChanged = composer.changed(function1) | composer.changed(o32Var);
            Object objRememberedValue = composer.rememberedValue();
            if (zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                objRememberedValue = new ug(function1, o32Var, mutableState, 25);
                composer.updateRememberedValue(objRememberedValue);
            }
            q32.b("删除", true, (Function0) objRememberedValue, composer, 54, 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composer.skipToGroupEnd();
        }
        return Unit.INSTANCE;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        int i = this.a;
        int i2 = 12;
        boolean z = false;
        int i3 = 0;
        int i4 = 3;
        Object obj3 = this.d;
        Object obj4 = this.b;
        Object obj5 = this.c;
        switch (i) {
            case 0:
                Function2 function2 = (Function2) obj4;
                Function3 function3 = (Function3) obj3;
                String str = (String) obj;
                h3 h3Var = (h3) obj2;
                str.getClass();
                h3Var.getClass();
                ((p7) obj5).g.setValue(str);
                String str2 = h3Var.d;
                String str3 = h3Var.c;
                ServerConfig serverConfig = h3Var.a;
                if (str2 != null) {
                    function3.invoke(serverConfig.getId(), str3, str2);
                } else {
                    function2.invoke(serverConfig.getId(), str3);
                }
                return Unit.INSTANCE;
            case 1:
                return AndroidTextContextMenuToolbarProvider_androidKt.ProvidePlatformTextContextMenuToolbar$lambda$5((Modifier) obj5, (MutableState) obj3, (Function2) obj4, (Composer) obj, ((Integer) obj2).intValue());
            case 2:
                CoroutineScope coroutineScope = (CoroutineScope) obj5;
                ScrollState scrollState = (ScrollState) obj4;
                vc vcVar = (vc) obj3;
                Composer composer = (Composer) obj;
                int iIntValue = ((Integer) obj2).intValue();
                if (composer.shouldExecute((iIntValue & 3) != 2, iIntValue & 1)) {
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(723912807, iIntValue, -1, "com.dh.myembyapp.ui.components.AppUpdateDialogs.<anonymous> (AppUpdateSupport.kt:544)");
                    }
                    Object objRememberedValue = composer.rememberedValue();
                    Composer.Companion companion = Composer.INSTANCE;
                    if (objRememberedValue == companion.getEmpty()) {
                        objRememberedValue = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Boolean.FALSE, null, 2, null);
                        composer.updateRememberedValue(objRememberedValue);
                    }
                    MutableState mutableState = (MutableState) objRememberedValue;
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-175699322, 6, -1, "com.dh.myembyapp.ui.theme.MyEmbyTheme.<get-colors> (Theme.kt:122)");
                    }
                    u61 u61Var = (u61) composer.consume(n72.b);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    ButtonColors buttonColorsI = hc2.i(jc2.b, false, composer, 6, 2);
                    ButtonScale buttonScaleL = hc2.l(1.05f);
                    ButtonGlow buttonGlowA = el0.a(u61Var);
                    ButtonBorder buttonBorderH = hc2.h(composer);
                    Modifier.Companion companion2 = Modifier.INSTANCE;
                    Object objRememberedValue2 = composer.rememberedValue();
                    if (objRememberedValue2 == companion.getEmpty()) {
                        objRememberedValue2 = new t1(26, mutableState);
                        composer.updateRememberedValue(objRememberedValue2);
                    }
                    Modifier modifierOnFocusChanged = FocusChangedModifierKt.onFocusChanged(companion2, (Function1) objRememberedValue2);
                    boolean zChangedInstance = composer.changedInstance(coroutineScope) | composer.changed(scrollState);
                    Object objRememberedValue3 = composer.rememberedValue();
                    if (zChangedInstance || objRememberedValue3 == companion.getEmpty()) {
                        objRememberedValue3 = new ad(coroutineScope, scrollState);
                        composer.updateRememberedValue(objRememberedValue3);
                    }
                    Modifier modifierM1071widthInVpY3zN4$default = SizeKt.m1071widthInVpY3zN4$default(KeyInputModifierKt.onPreviewKeyEvent(modifierOnFocusChanged, (Function1) objRememberedValue3), Dp.m7813constructorimpl(108.0f), 0.0f, 2, null);
                    boolean zChanged = composer.changed(vcVar);
                    Object objRememberedValue4 = composer.rememberedValue();
                    if (zChanged || objRememberedValue4 == companion.getEmpty()) {
                        objRememberedValue4 = new wc(vcVar, i4);
                        composer.updateRememberedValue(objRememberedValue4);
                    }
                    ButtonKt.m8231ButtonTCVpFMg((Function0) objRememberedValue4, modifierM1071widthInVpY3zN4$default, null, false, buttonScaleL, buttonGlowA, null, buttonColorsI, 0.0f, buttonBorderH, null, null, ComposableLambdaKt.rememberComposableLambda(1724388951, true, new p8(1, vcVar, mutableState), composer, 54), composer, 0, RendererCapabilities.DECODER_SUPPORT_MASK, 3404);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                } else {
                    composer.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 3:
                BackupRouteConfig backupRouteConfig = (BackupRouteConfig) obj5;
                Function0 function0 = (Function0) obj4;
                Function0 function1 = (Function0) obj3;
                Composer composer2 = (Composer) obj;
                int iIntValue2 = ((Integer) obj2).intValue();
                if (composer2.shouldExecute((iIntValue2 & 3) != 2, iIntValue2 & 1)) {
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-1982080733, iIntValue2, -1, "com.dh.myembyapp.ui.components.BackupRouteDeleteConfirmDialog.<anonymous> (BackupRouteManagerDialog.kt:1063)");
                    }
                    Modifier.Companion companion3 = Modifier.INSTANCE;
                    Modifier modifierM275backgroundbw27NRU$default = BackgroundKt.m275backgroundbw27NRU$default(SizeKt.fillMaxSize$default(companion3, 0.0f, 1, null), Color.m5151copywmQWz5c$default(Color.INSTANCE.m5178getBlack0d7_KjU(), 0.38f, 0.0f, 0.0f, 0.0f, 14, null), null, 2, null);
                    MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.INSTANCE.getCenter(), false);
                    long currentCompositeKeyHashCode = ComposablesKt.getCurrentCompositeKeyHashCode(composer2, 0);
                    int i5 = (int) (currentCompositeKeyHashCode ^ (currentCompositeKeyHashCode >>> 32));
                    CompositionLocalMap currentCompositionLocalMap = composer2.getCurrentCompositionLocalMap();
                    Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(composer2, modifierM275backgroundbw27NRU$default);
                    ComposeUiNode.Companion companion4 = ComposeUiNode.INSTANCE;
                    Function0<ComposeUiNode> constructor = companion4.getConstructor();
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
                    mr.z(companion4, composerM4318constructorimpl, measurePolicyMaybeCachedBoxMeasurePolicy, composerM4318constructorimpl, currentCompositionLocalMap);
                    Updater.m4326setimpl(composerM4318constructorimpl, modifierMaterializeModifier, (Function2<? super T, ? super Modifier, Unit>) id.h(companion4, composerM4318constructorimpl, Integer.valueOf(i5), composerM4318constructorimpl));
                    BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
                    CardKt.Card(SizeKt.m1069width3ABfNKs(companion3, Dp.m7813constructorimpl(420.0f)), null, CardDefaults.INSTANCE.m2119cardColorsro_MJ88(MaterialTheme.INSTANCE.getColorScheme(composer2, MaterialTheme.$stable).getSurface(), 0L, 0L, 0L, composer2, CardDefaults.$stable << 12, 14), null, null, ComposableLambdaKt.rememberComposableLambda(1096077851, true, new ph(backupRouteConfig, function0, function1, z ? 1 : 0), composer2, 54), composer2, 196614, 26);
                    composer2.endNode();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                } else {
                    composer2.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 4:
                return ContextMenuUiKt.ContextMenuPopup$lambda$1((Modifier) obj5, (ContextMenuColors) obj4, (Function1) obj3, (Composer) obj, ((Integer) obj2).intValue());
            case 5:
                va0 va0Var = (va0) obj5;
                Context context = (Context) obj4;
                String str4 = (String) obj;
                boolean zBooleanValue = ((Boolean) obj2).booleanValue();
                str4.getClass();
                boolean zAreEqual = Intrinsics.areEqual(((ea0) obj3).a.getType(), "Series");
                context.getClass();
                BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(va0Var), null, null, new ua0(va0Var, zBooleanValue, str4, zAreEqual, context, null), 3, null);
                return Unit.INSTANCE;
            case 6:
                String str5 = (String) obj;
                boolean zBooleanValue2 = ((Boolean) obj2).booleanValue();
                str5.getClass();
                BuildersKt__Builders_commonKt.launch$default((CoroutineScope) obj5, null, null, new r8((lz0) obj4, str5, zBooleanValue2, (MutableState) obj3, (Continuation) null), 3, null);
                return Unit.INSTANCE;
            case 7:
                MutableState mutableState2 = (MutableState) obj5;
                MutableState mutableState3 = (MutableState) obj4;
                MutableState mutableState4 = (MutableState) obj3;
                Composer composer3 = (Composer) obj;
                int iIntValue3 = ((Integer) obj2).intValue();
                if (composer3.shouldExecute((iIntValue3 & 3) != 2, iIntValue3 & 1)) {
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(646043598, iIntValue3, -1, "com.dh.myembyapp.ui.screens.home.HomeScreen.<anonymous> (HomeScreen.kt:1229)");
                    }
                    Object objRememberedValue5 = composer3.rememberedValue();
                    if (objRememberedValue5 == Composer.INSTANCE.getEmpty()) {
                        objRememberedValue5 = new ii(mutableState2, mutableState3, mutableState4, 3);
                        composer3.updateRememberedValue(objRememberedValue5);
                    }
                    androidx.compose.material3.ButtonKt.TextButton((Function0) objRememberedValue5, null, false, null, null, null, null, null, null, et.c, composer3, 805306374, 510);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                } else {
                    composer3.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 8:
                return LazyStaggeredGridDslKt.rememberColumnSlots$lambda$0$0((PaddingValues) obj5, (StaggeredGridCells) obj4, (Arrangement.Horizontal) obj3, (Density) obj, (Constraints) obj2);
            case 9:
                return LazyStaggeredGridDslKt.rememberRowSlots$lambda$0$0((PaddingValues) obj5, (StaggeredGridCells) obj4, (Arrangement.Vertical) obj3, (Density) obj, (Constraints) obj2);
            case 10:
                NavHostController navHostController = (NavHostController) obj5;
                va0 va0Var2 = (va0) obj4;
                NavBackStackEntry navBackStackEntry = (NavBackStackEntry) obj3;
                String str6 = (String) obj;
                String str7 = (String) obj2;
                str6.getClass();
                if (str7 != null && va0Var2 != null) {
                    va0Var2.x(str6, str7, true);
                }
                String strE = str7 != null ? ll0.e("player/", str6, "?mediaSourceId=", str7) : "player/".concat(str6);
                Log.d("MainActivity", "播放器版本切换重开: itemId=" + str6 + ", mediaSourceId=" + str7);
                navHostController.navigate(strE, (Function1<? super NavOptionsBuilder, Unit>) new mc0(navBackStackEntry, 16));
                return Unit.INSTANCE;
            case 11:
                int i6 = 16;
                AudioVersionPrioritySettings audioVersionPrioritySettings = (AudioVersionPrioritySettings) obj5;
                FocusRequester focusRequester = (FocusRequester) obj4;
                Function1 function4 = (Function1) obj3;
                Composer composer4 = (Composer) obj;
                int iIntValue4 = ((Integer) obj2).intValue();
                if (composer4.shouldExecute((iIntValue4 & 3) != 2, iIntValue4 & 1)) {
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-162098350, iIntValue4, -1, "com.dh.myembyapp.ui.components.AudioFormatPriorityDialog.<anonymous> (OtherSettingsOverlay.kt:1650)");
                    }
                    Modifier.Companion companion5 = Modifier.INSTANCE;
                    Modifier modifierFillMaxSize$default = SizeKt.fillMaxSize$default(companion5, 0.0f, 1, null);
                    Color.Companion companion6 = Color.INSTANCE;
                    Modifier modifierM275backgroundbw27NRU$default2 = BackgroundKt.m275backgroundbw27NRU$default(modifierFillMaxSize$default, Color.m5151copywmQWz5c$default(companion6.m5178getBlack0d7_KjU(), 0.35f, 0.0f, 0.0f, 0.0f, 14, null), null, 2, null);
                    Alignment.Companion companion7 = Alignment.INSTANCE;
                    MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy2 = BoxKt.maybeCachedBoxMeasurePolicy(companion7.getCenter(), false);
                    long currentCompositeKeyHashCode2 = ComposablesKt.getCurrentCompositeKeyHashCode(composer4, 0);
                    int i7 = (int) (currentCompositeKeyHashCode2 ^ (currentCompositeKeyHashCode2 >>> 32));
                    CompositionLocalMap currentCompositionLocalMap2 = composer4.getCurrentCompositionLocalMap();
                    Modifier modifierMaterializeModifier2 = ComposedModifierKt.materializeModifier(composer4, modifierM275backgroundbw27NRU$default2);
                    ComposeUiNode.Companion companion8 = ComposeUiNode.INSTANCE;
                    Function0<ComposeUiNode> constructor2 = companion8.getConstructor();
                    if (composer4.getApplier() == null) {
                        ComposablesKt.invalidApplier();
                    }
                    composer4.startReusableNode();
                    if (composer4.getInserting()) {
                        composer4.createNode(constructor2);
                    } else {
                        composer4.useNode();
                    }
                    Composer composerM4318constructorimpl2 = Updater.m4318constructorimpl(composer4);
                    mr.z(companion8, composerM4318constructorimpl2, measurePolicyMaybeCachedBoxMeasurePolicy2, composerM4318constructorimpl2, currentCompositionLocalMap2);
                    Updater.m4326setimpl(composerM4318constructorimpl2, modifierMaterializeModifier2, (Function2<? super T, ? super Modifier, Unit>) id.h(companion8, composerM4318constructorimpl2, Integer.valueOf(i7), composerM4318constructorimpl2));
                    BoxScopeInstance boxScopeInstance2 = BoxScopeInstance.INSTANCE;
                    Modifier modifierM999padding3ABfNKs = PaddingKt.m999padding3ABfNKs(kb0.v(12.0f, SizeKt.m1069width3ABfNKs(companion5, Dp.m7813constructorimpl(320.0f)), ColorKt.Color(4280032284L)), Dp.m7813constructorimpl(16.0f));
                    MeasurePolicy measurePolicyColumnMeasurePolicy = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.m712spacedBy0680j_4(Dp.m7813constructorimpl(8.0f)), companion7.getStart(), composer4, 6);
                    long currentCompositeKeyHashCode3 = ComposablesKt.getCurrentCompositeKeyHashCode(composer4, 0);
                    int i8 = (int) (currentCompositeKeyHashCode3 ^ (currentCompositeKeyHashCode3 >>> 32));
                    CompositionLocalMap currentCompositionLocalMap3 = composer4.getCurrentCompositionLocalMap();
                    Modifier modifierMaterializeModifier3 = ComposedModifierKt.materializeModifier(composer4, modifierM999padding3ABfNKs);
                    Function0<ComposeUiNode> constructor3 = companion8.getConstructor();
                    if (composer4.getApplier() == null) {
                        ComposablesKt.invalidApplier();
                    }
                    composer4.startReusableNode();
                    if (composer4.getInserting()) {
                        composer4.createNode(constructor3);
                    } else {
                        composer4.useNode();
                    }
                    Composer composerM4318constructorimpl3 = Updater.m4318constructorimpl(composer4);
                    mr.z(companion8, composerM4318constructorimpl3, measurePolicyColumnMeasurePolicy, composerM4318constructorimpl3, currentCompositionLocalMap3);
                    Updater.m4326setimpl(composerM4318constructorimpl3, modifierMaterializeModifier3, (Function2<? super T, ? super Modifier, Unit>) id.h(companion8, composerM4318constructorimpl3, Integer.valueOf(i8), composerM4318constructorimpl3));
                    ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.INSTANCE;
                    TextKt.m3048TextNvy7gAk("音频格式顺序", null, companion6.m5189getWhite0d7_KjU(), null, TextUnitKt.getSp(16), null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, composer4, 24966, 0, 262122);
                    TextKt.m3048TextNvy7gAk("数字越小越优先；全部相同则跳过格式比较。", null, companion6.m5182getGray0d7_KjU(), null, TextUnitKt.getSp(12), null, null, null, 0L, null, null, TextUnitKt.getSp(16), 0, false, 0, 0, null, null, composer4, 24966, 48, 260074);
                    composer4.startReplaceGroup(2114975786);
                    for (Object obj6 : xf.c) {
                        int i9 = i3 + 1;
                        if (i3 < 0) {
                            CollectionsKt.throwIndexOverflow();
                        }
                        xf xfVar = (xf) obj6;
                        String str8 = xfVar.a;
                        int iL = cc1.L(audioVersionPrioritySettings, xfVar);
                        FocusRequester focusRequester2 = i3 == 0 ? focusRequester : null;
                        boolean zChangedInstance2 = composer4.changedInstance(audioVersionPrioritySettings) | composer4.changed(xfVar.ordinal()) | composer4.changed(function4);
                        Object objRememberedValue6 = composer4.rememberedValue();
                        if (zChangedInstance2 || objRememberedValue6 == Composer.INSTANCE.getEmpty()) {
                            objRememberedValue6 = new ug(audioVersionPrioritySettings, xfVar, function4, i6);
                            composer4.updateRememberedValue(objRememberedValue6);
                        }
                        cc1.u(str8, iL, 6, null, focusRequester2, (Function0) objRememberedValue6, composer4, RendererCapabilities.DECODER_SUPPORT_MASK);
                        i3 = i9;
                        i6 = 16;
                    }
                    composer4.endReplaceGroup();
                    composer4.endNode();
                    composer4.endNode();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                } else {
                    composer4.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 12:
                AudioLanguagePreference audioLanguagePreference = (AudioLanguagePreference) obj5;
                FocusRequester focusRequester3 = (FocusRequester) obj4;
                Function1 function5 = (Function1) obj3;
                Composer composer5 = (Composer) obj;
                int iIntValue5 = ((Integer) obj2).intValue();
                if (composer5.shouldExecute((iIntValue5 & 3) != 2, iIntValue5 & 1)) {
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(524746214, iIntValue5, -1, "com.dh.myembyapp.ui.components.AudioLanguagePreferenceDialog.<anonymous> (OtherSettingsOverlay.kt:2248)");
                    }
                    Modifier.Companion companion9 = Modifier.INSTANCE;
                    Modifier modifierFillMaxSize$default2 = SizeKt.fillMaxSize$default(companion9, 0.0f, 1, null);
                    Color.Companion companion10 = Color.INSTANCE;
                    Modifier modifierM275backgroundbw27NRU$default3 = BackgroundKt.m275backgroundbw27NRU$default(modifierFillMaxSize$default2, Color.m5151copywmQWz5c$default(companion10.m5178getBlack0d7_KjU(), 0.35f, 0.0f, 0.0f, 0.0f, 14, null), null, 2, null);
                    Alignment.Companion companion11 = Alignment.INSTANCE;
                    MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy3 = BoxKt.maybeCachedBoxMeasurePolicy(companion11.getCenter(), false);
                    long currentCompositeKeyHashCode4 = ComposablesKt.getCurrentCompositeKeyHashCode(composer5, 0);
                    int i10 = (int) (currentCompositeKeyHashCode4 ^ (currentCompositeKeyHashCode4 >>> 32));
                    CompositionLocalMap currentCompositionLocalMap4 = composer5.getCurrentCompositionLocalMap();
                    Modifier modifierMaterializeModifier4 = ComposedModifierKt.materializeModifier(composer5, modifierM275backgroundbw27NRU$default3);
                    ComposeUiNode.Companion companion12 = ComposeUiNode.INSTANCE;
                    Function0<ComposeUiNode> constructor4 = companion12.getConstructor();
                    if (composer5.getApplier() == null) {
                        ComposablesKt.invalidApplier();
                    }
                    composer5.startReusableNode();
                    if (composer5.getInserting()) {
                        composer5.createNode(constructor4);
                    } else {
                        composer5.useNode();
                    }
                    Composer composerM4318constructorimpl4 = Updater.m4318constructorimpl(composer5);
                    mr.z(companion12, composerM4318constructorimpl4, measurePolicyMaybeCachedBoxMeasurePolicy3, composerM4318constructorimpl4, currentCompositionLocalMap4);
                    Updater.m4326setimpl(composerM4318constructorimpl4, modifierMaterializeModifier4, (Function2<? super T, ? super Modifier, Unit>) id.h(companion12, composerM4318constructorimpl4, Integer.valueOf(i10), composerM4318constructorimpl4));
                    BoxScopeInstance boxScopeInstance3 = BoxScopeInstance.INSTANCE;
                    Modifier modifierM999padding3ABfNKs2 = PaddingKt.m999padding3ABfNKs(ScrollKt.verticalScroll$default(kb0.v(12.0f, SizeKt.m1052heightInVpY3zN4$default(SizeKt.m1069width3ABfNKs(companion9, Dp.m7813constructorimpl(280.0f)), 0.0f, Dp.m7813constructorimpl(460.0f), 1, null), ColorKt.Color(4280032284L)), ScrollKt.rememberScrollState(0, composer5, 0, 1), false, null, false, 14, null), Dp.m7813constructorimpl(16.0f));
                    MeasurePolicy measurePolicyColumnMeasurePolicy2 = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.m712spacedBy0680j_4(Dp.m7813constructorimpl(8.0f)), companion11.getStart(), composer5, 6);
                    long currentCompositeKeyHashCode5 = ComposablesKt.getCurrentCompositeKeyHashCode(composer5, 0);
                    int i11 = (int) (currentCompositeKeyHashCode5 ^ (currentCompositeKeyHashCode5 >>> 32));
                    CompositionLocalMap currentCompositionLocalMap5 = composer5.getCurrentCompositionLocalMap();
                    Modifier modifierMaterializeModifier5 = ComposedModifierKt.materializeModifier(composer5, modifierM999padding3ABfNKs2);
                    Function0<ComposeUiNode> constructor5 = companion12.getConstructor();
                    if (composer5.getApplier() == null) {
                        ComposablesKt.invalidApplier();
                    }
                    composer5.startReusableNode();
                    if (composer5.getInserting()) {
                        composer5.createNode(constructor5);
                    } else {
                        composer5.useNode();
                    }
                    Composer composerM4318constructorimpl5 = Updater.m4318constructorimpl(composer5);
                    mr.z(companion12, composerM4318constructorimpl5, measurePolicyColumnMeasurePolicy2, composerM4318constructorimpl5, currentCompositionLocalMap5);
                    Updater.m4326setimpl(composerM4318constructorimpl5, modifierMaterializeModifier5, (Function2<? super T, ? super Modifier, Unit>) id.h(companion12, composerM4318constructorimpl5, Integer.valueOf(i11), composerM4318constructorimpl5));
                    ColumnScopeInstance columnScopeInstance2 = ColumnScopeInstance.INSTANCE;
                    TextKt.m3048TextNvy7gAk("音频语言优先", null, companion10.m5189getWhite0d7_KjU(), null, TextUnitKt.getSp(16), null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, composer5, 24966, 0, 262122);
                    composer5.startReplaceGroup(212946593);
                    Iterator<AudioLanguagePreference> it = AudioLanguagePreference.getEntries().iterator();
                    while (it.hasNext()) {
                        AudioLanguagePreference next = it.next();
                        String label = next.getLabel();
                        boolean z2 = next == audioLanguagePreference;
                        FocusRequester focusRequester4 = next == audioLanguagePreference ? focusRequester3 : null;
                        boolean zChanged2 = composer5.changed(function5) | composer5.changed(next.ordinal());
                        Object objRememberedValue7 = composer5.rememberedValue();
                        if (zChanged2 || objRememberedValue7 == Composer.INSTANCE.getEmpty()) {
                            objRememberedValue7 = new jx0(9, function5, next);
                            composer5.updateRememberedValue(objRememberedValue7);
                        }
                        cc1.d(label, z2, focusRequester4, (Function0) objRememberedValue7, composer5, 0, 0);
                    }
                    composer5.endReplaceGroup();
                    composer5.endNode();
                    composer5.endNode();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                } else {
                    composer5.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 13:
                VideoPrioritySortType videoPrioritySortType = (VideoPrioritySortType) obj5;
                FocusRequester focusRequester5 = (FocusRequester) obj4;
                Function1 function6 = (Function1) obj3;
                Composer composer6 = (Composer) obj;
                int iIntValue6 = ((Integer) obj2).intValue();
                if (composer6.shouldExecute((iIntValue6 & 3) != 2, iIntValue6 & 1)) {
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-1002896248, iIntValue6, -1, "com.dh.myembyapp.ui.components.VideoPriorityTypeDialog.<anonymous> (OtherSettingsOverlay.kt:1328)");
                    }
                    Modifier.Companion companion13 = Modifier.INSTANCE;
                    Modifier modifierFillMaxSize$default3 = SizeKt.fillMaxSize$default(companion13, 0.0f, 1, null);
                    Color.Companion companion14 = Color.INSTANCE;
                    Modifier modifierM275backgroundbw27NRU$default4 = BackgroundKt.m275backgroundbw27NRU$default(modifierFillMaxSize$default3, Color.m5151copywmQWz5c$default(companion14.m5178getBlack0d7_KjU(), 0.35f, 0.0f, 0.0f, 0.0f, 14, null), null, 2, null);
                    Alignment.Companion companion15 = Alignment.INSTANCE;
                    MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy4 = BoxKt.maybeCachedBoxMeasurePolicy(companion15.getCenter(), false);
                    long currentCompositeKeyHashCode6 = ComposablesKt.getCurrentCompositeKeyHashCode(composer6, 0);
                    int i12 = (int) (currentCompositeKeyHashCode6 ^ (currentCompositeKeyHashCode6 >>> 32));
                    CompositionLocalMap currentCompositionLocalMap6 = composer6.getCurrentCompositionLocalMap();
                    Modifier modifierMaterializeModifier6 = ComposedModifierKt.materializeModifier(composer6, modifierM275backgroundbw27NRU$default4);
                    ComposeUiNode.Companion companion16 = ComposeUiNode.INSTANCE;
                    Function0<ComposeUiNode> constructor6 = companion16.getConstructor();
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
                    mr.z(companion16, composerM4318constructorimpl6, measurePolicyMaybeCachedBoxMeasurePolicy4, composerM4318constructorimpl6, currentCompositionLocalMap6);
                    Updater.m4326setimpl(composerM4318constructorimpl6, modifierMaterializeModifier6, (Function2<? super T, ? super Modifier, Unit>) id.h(companion16, composerM4318constructorimpl6, Integer.valueOf(i12), composerM4318constructorimpl6));
                    BoxScopeInstance boxScopeInstance4 = BoxScopeInstance.INSTANCE;
                    Modifier modifierM999padding3ABfNKs3 = PaddingKt.m999padding3ABfNKs(kb0.v(12.0f, SizeKt.m1069width3ABfNKs(companion13, Dp.m7813constructorimpl(280.0f)), ColorKt.Color(4280032284L)), Dp.m7813constructorimpl(16.0f));
                    MeasurePolicy measurePolicyColumnMeasurePolicy3 = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.m712spacedBy0680j_4(Dp.m7813constructorimpl(8.0f)), companion15.getStart(), composer6, 6);
                    long currentCompositeKeyHashCode7 = ComposablesKt.getCurrentCompositeKeyHashCode(composer6, 0);
                    int i13 = (int) (currentCompositeKeyHashCode7 ^ (currentCompositeKeyHashCode7 >>> 32));
                    CompositionLocalMap currentCompositionLocalMap7 = composer6.getCurrentCompositionLocalMap();
                    Modifier modifierMaterializeModifier7 = ComposedModifierKt.materializeModifier(composer6, modifierM999padding3ABfNKs3);
                    Function0<ComposeUiNode> constructor7 = companion16.getConstructor();
                    if (composer6.getApplier() == null) {
                        ComposablesKt.invalidApplier();
                    }
                    composer6.startReusableNode();
                    if (composer6.getInserting()) {
                        composer6.createNode(constructor7);
                    } else {
                        composer6.useNode();
                    }
                    Composer composerM4318constructorimpl7 = Updater.m4318constructorimpl(composer6);
                    mr.z(companion16, composerM4318constructorimpl7, measurePolicyColumnMeasurePolicy3, composerM4318constructorimpl7, currentCompositionLocalMap7);
                    Updater.m4326setimpl(composerM4318constructorimpl7, modifierMaterializeModifier7, (Function2<? super T, ? super Modifier, Unit>) id.h(companion16, composerM4318constructorimpl7, Integer.valueOf(i13), composerM4318constructorimpl7));
                    ColumnScopeInstance columnScopeInstance3 = ColumnScopeInstance.INSTANCE;
                    TextKt.m3048TextNvy7gAk("选择排序类型", null, companion14.m5189getWhite0d7_KjU(), null, TextUnitKt.getSp(16), null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, composer6, 24966, 0, 262122);
                    composer6.startReplaceGroup(91027481);
                    Iterator<VideoPrioritySortType> it2 = VideoPrioritySortType.getEntries().iterator();
                    while (it2.hasNext()) {
                        VideoPrioritySortType next2 = it2.next();
                        String label2 = next2.getLabel();
                        boolean z3 = next2 == videoPrioritySortType;
                        FocusRequester focusRequester6 = next2 == videoPrioritySortType ? focusRequester5 : null;
                        boolean zChanged3 = composer6.changed(function6) | composer6.changed(next2.ordinal());
                        Object objRememberedValue8 = composer6.rememberedValue();
                        if (zChanged3 || objRememberedValue8 == Composer.INSTANCE.getEmpty()) {
                            objRememberedValue8 = new jx0(10, function6, next2);
                            composer6.updateRememberedValue(objRememberedValue8);
                        }
                        cc1.d(label2, z3, focusRequester6, (Function0) objRememberedValue8, composer6, 0, 0);
                    }
                    composer6.endReplaceGroup();
                    composer6.endNode();
                    composer6.endNode();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                } else {
                    composer6.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 14:
                AudioPrioritySortType audioPrioritySortType = (AudioPrioritySortType) obj5;
                FocusRequester focusRequester7 = (FocusRequester) obj4;
                Function1 function7 = (Function1) obj3;
                Composer composer7 = (Composer) obj;
                int iIntValue7 = ((Integer) obj2).intValue();
                if (composer7.shouldExecute((iIntValue7 & 3) != 2, iIntValue7 & 1)) {
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-1129534574, iIntValue7, -1, "com.dh.myembyapp.ui.components.AudioPriorityTypeDialog.<anonymous> (OtherSettingsOverlay.kt:1591)");
                    }
                    Modifier.Companion companion17 = Modifier.INSTANCE;
                    Modifier modifierFillMaxSize$default4 = SizeKt.fillMaxSize$default(companion17, 0.0f, 1, null);
                    Color.Companion companion18 = Color.INSTANCE;
                    Modifier modifierM275backgroundbw27NRU$default5 = BackgroundKt.m275backgroundbw27NRU$default(modifierFillMaxSize$default4, Color.m5151copywmQWz5c$default(companion18.m5178getBlack0d7_KjU(), 0.35f, 0.0f, 0.0f, 0.0f, 14, null), null, 2, null);
                    Alignment.Companion companion19 = Alignment.INSTANCE;
                    MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy5 = BoxKt.maybeCachedBoxMeasurePolicy(companion19.getCenter(), false);
                    long currentCompositeKeyHashCode8 = ComposablesKt.getCurrentCompositeKeyHashCode(composer7, 0);
                    int i14 = (int) (currentCompositeKeyHashCode8 ^ (currentCompositeKeyHashCode8 >>> 32));
                    CompositionLocalMap currentCompositionLocalMap8 = composer7.getCurrentCompositionLocalMap();
                    Modifier modifierMaterializeModifier8 = ComposedModifierKt.materializeModifier(composer7, modifierM275backgroundbw27NRU$default5);
                    ComposeUiNode.Companion companion20 = ComposeUiNode.INSTANCE;
                    Function0<ComposeUiNode> constructor8 = companion20.getConstructor();
                    if (composer7.getApplier() == null) {
                        ComposablesKt.invalidApplier();
                    }
                    composer7.startReusableNode();
                    if (composer7.getInserting()) {
                        composer7.createNode(constructor8);
                    } else {
                        composer7.useNode();
                    }
                    Composer composerM4318constructorimpl8 = Updater.m4318constructorimpl(composer7);
                    mr.z(companion20, composerM4318constructorimpl8, measurePolicyMaybeCachedBoxMeasurePolicy5, composerM4318constructorimpl8, currentCompositionLocalMap8);
                    Updater.m4326setimpl(composerM4318constructorimpl8, modifierMaterializeModifier8, (Function2<? super T, ? super Modifier, Unit>) id.h(companion20, composerM4318constructorimpl8, Integer.valueOf(i14), composerM4318constructorimpl8));
                    BoxScopeInstance boxScopeInstance5 = BoxScopeInstance.INSTANCE;
                    Modifier modifierM999padding3ABfNKs4 = PaddingKt.m999padding3ABfNKs(kb0.v(12.0f, SizeKt.m1069width3ABfNKs(companion17, Dp.m7813constructorimpl(280.0f)), ColorKt.Color(4280032284L)), Dp.m7813constructorimpl(16.0f));
                    MeasurePolicy measurePolicyColumnMeasurePolicy4 = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.m712spacedBy0680j_4(Dp.m7813constructorimpl(8.0f)), companion19.getStart(), composer7, 6);
                    long currentCompositeKeyHashCode9 = ComposablesKt.getCurrentCompositeKeyHashCode(composer7, 0);
                    int i15 = (int) (currentCompositeKeyHashCode9 ^ (currentCompositeKeyHashCode9 >>> 32));
                    CompositionLocalMap currentCompositionLocalMap9 = composer7.getCurrentCompositionLocalMap();
                    Modifier modifierMaterializeModifier9 = ComposedModifierKt.materializeModifier(composer7, modifierM999padding3ABfNKs4);
                    Function0<ComposeUiNode> constructor9 = companion20.getConstructor();
                    if (composer7.getApplier() == null) {
                        ComposablesKt.invalidApplier();
                    }
                    composer7.startReusableNode();
                    if (composer7.getInserting()) {
                        composer7.createNode(constructor9);
                    } else {
                        composer7.useNode();
                    }
                    Composer composerM4318constructorimpl9 = Updater.m4318constructorimpl(composer7);
                    mr.z(companion20, composerM4318constructorimpl9, measurePolicyColumnMeasurePolicy4, composerM4318constructorimpl9, currentCompositionLocalMap9);
                    Updater.m4326setimpl(composerM4318constructorimpl9, modifierMaterializeModifier9, (Function2<? super T, ? super Modifier, Unit>) id.h(companion20, composerM4318constructorimpl9, Integer.valueOf(i15), composerM4318constructorimpl9));
                    ColumnScopeInstance columnScopeInstance4 = ColumnScopeInstance.INSTANCE;
                    TextKt.m3048TextNvy7gAk("选择排序类型", null, companion18.m5189getWhite0d7_KjU(), null, TextUnitKt.getSp(16), null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, composer7, 24966, 0, 262122);
                    composer7.startReplaceGroup(-1349319405);
                    Iterator<AudioPrioritySortType> it3 = AudioPrioritySortType.getEntries().iterator();
                    while (it3.hasNext()) {
                        AudioPrioritySortType next3 = it3.next();
                        String label3 = next3.getLabel();
                        boolean z4 = next3 == audioPrioritySortType;
                        FocusRequester focusRequester8 = next3 == audioPrioritySortType ? focusRequester7 : null;
                        boolean zChanged4 = composer7.changed(function7) | composer7.changed(next3.ordinal());
                        Object objRememberedValue9 = composer7.rememberedValue();
                        if (zChanged4 || objRememberedValue9 == Composer.INSTANCE.getEmpty()) {
                            objRememberedValue9 = new jx0(11, function7, next3);
                            composer7.updateRememberedValue(objRememberedValue9);
                        }
                        cc1.d(label3, z4, focusRequester8, (Function0) objRememberedValue9, composer7, 0, 0);
                    }
                    composer7.endReplaceGroup();
                    composer7.endNode();
                    composer7.endNode();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                } else {
                    composer7.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 15:
                SubtitlePrioritySortType subtitlePrioritySortType = (SubtitlePrioritySortType) obj5;
                FocusRequester focusRequester9 = (FocusRequester) obj4;
                Function1 function8 = (Function1) obj3;
                Composer composer8 = (Composer) obj;
                int iIntValue8 = ((Integer) obj2).intValue();
                if (composer8.shouldExecute((iIntValue8 & 3) != 2, iIntValue8 & 1)) {
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-1839967430, iIntValue8, -1, "com.dh.myembyapp.ui.components.SubtitlePriorityTypeDialog.<anonymous> (OtherSettingsOverlay.kt:1903)");
                    }
                    Modifier.Companion companion21 = Modifier.INSTANCE;
                    Modifier modifierFillMaxSize$default5 = SizeKt.fillMaxSize$default(companion21, 0.0f, 1, null);
                    Color.Companion companion22 = Color.INSTANCE;
                    Modifier modifierM275backgroundbw27NRU$default6 = BackgroundKt.m275backgroundbw27NRU$default(modifierFillMaxSize$default5, Color.m5151copywmQWz5c$default(companion22.m5178getBlack0d7_KjU(), 0.35f, 0.0f, 0.0f, 0.0f, 14, null), null, 2, null);
                    Alignment.Companion companion23 = Alignment.INSTANCE;
                    MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy6 = BoxKt.maybeCachedBoxMeasurePolicy(companion23.getCenter(), false);
                    long currentCompositeKeyHashCode10 = ComposablesKt.getCurrentCompositeKeyHashCode(composer8, 0);
                    int i16 = (int) (currentCompositeKeyHashCode10 ^ (currentCompositeKeyHashCode10 >>> 32));
                    CompositionLocalMap currentCompositionLocalMap10 = composer8.getCurrentCompositionLocalMap();
                    Modifier modifierMaterializeModifier10 = ComposedModifierKt.materializeModifier(composer8, modifierM275backgroundbw27NRU$default6);
                    ComposeUiNode.Companion companion24 = ComposeUiNode.INSTANCE;
                    Function0<ComposeUiNode> constructor10 = companion24.getConstructor();
                    if (composer8.getApplier() == null) {
                        ComposablesKt.invalidApplier();
                    }
                    composer8.startReusableNode();
                    if (composer8.getInserting()) {
                        composer8.createNode(constructor10);
                    } else {
                        composer8.useNode();
                    }
                    Composer composerM4318constructorimpl10 = Updater.m4318constructorimpl(composer8);
                    mr.z(companion24, composerM4318constructorimpl10, measurePolicyMaybeCachedBoxMeasurePolicy6, composerM4318constructorimpl10, currentCompositionLocalMap10);
                    Updater.m4326setimpl(composerM4318constructorimpl10, modifierMaterializeModifier10, (Function2<? super T, ? super Modifier, Unit>) id.h(companion24, composerM4318constructorimpl10, Integer.valueOf(i16), composerM4318constructorimpl10));
                    BoxScopeInstance boxScopeInstance6 = BoxScopeInstance.INSTANCE;
                    Modifier modifierM999padding3ABfNKs5 = PaddingKt.m999padding3ABfNKs(kb0.v(12.0f, SizeKt.m1069width3ABfNKs(companion21, Dp.m7813constructorimpl(280.0f)), ColorKt.Color(4280032284L)), Dp.m7813constructorimpl(16.0f));
                    MeasurePolicy measurePolicyColumnMeasurePolicy5 = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.m712spacedBy0680j_4(Dp.m7813constructorimpl(8.0f)), companion23.getStart(), composer8, 6);
                    long currentCompositeKeyHashCode11 = ComposablesKt.getCurrentCompositeKeyHashCode(composer8, 0);
                    int i17 = (int) (currentCompositeKeyHashCode11 ^ (currentCompositeKeyHashCode11 >>> 32));
                    CompositionLocalMap currentCompositionLocalMap11 = composer8.getCurrentCompositionLocalMap();
                    Modifier modifierMaterializeModifier11 = ComposedModifierKt.materializeModifier(composer8, modifierM999padding3ABfNKs5);
                    Function0<ComposeUiNode> constructor11 = companion24.getConstructor();
                    if (composer8.getApplier() == null) {
                        ComposablesKt.invalidApplier();
                    }
                    composer8.startReusableNode();
                    if (composer8.getInserting()) {
                        composer8.createNode(constructor11);
                    } else {
                        composer8.useNode();
                    }
                    Composer composerM4318constructorimpl11 = Updater.m4318constructorimpl(composer8);
                    mr.z(companion24, composerM4318constructorimpl11, measurePolicyColumnMeasurePolicy5, composerM4318constructorimpl11, currentCompositionLocalMap11);
                    Updater.m4326setimpl(composerM4318constructorimpl11, modifierMaterializeModifier11, (Function2<? super T, ? super Modifier, Unit>) id.h(companion24, composerM4318constructorimpl11, Integer.valueOf(i17), composerM4318constructorimpl11));
                    ColumnScopeInstance columnScopeInstance5 = ColumnScopeInstance.INSTANCE;
                    TextKt.m3048TextNvy7gAk("选择排序类型", null, companion22.m5189getWhite0d7_KjU(), null, TextUnitKt.getSp(16), null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, composer8, 24966, 0, 262122);
                    composer8.startReplaceGroup(2107273243);
                    Iterator<SubtitlePrioritySortType> it4 = SubtitlePrioritySortType.getEntries().iterator();
                    while (it4.hasNext()) {
                        SubtitlePrioritySortType next4 = it4.next();
                        String label4 = next4.getLabel();
                        boolean z5 = next4 == subtitlePrioritySortType;
                        FocusRequester focusRequester10 = next4 == subtitlePrioritySortType ? focusRequester9 : null;
                        boolean zChanged5 = composer8.changed(function8) | composer8.changed(next4.ordinal());
                        Object objRememberedValue10 = composer8.rememberedValue();
                        if (zChanged5 || objRememberedValue10 == Composer.INSTANCE.getEmpty()) {
                            objRememberedValue10 = new jx0(i2, function8, next4);
                            composer8.updateRememberedValue(objRememberedValue10);
                        }
                        cc1.d(label4, z5, focusRequester10, (Function0) objRememberedValue10, composer8, 0, 0);
                    }
                    composer8.endReplaceGroup();
                    composer8.endNode();
                    composer8.endNode();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                } else {
                    composer8.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 16:
                return a(obj, obj2);
            default:
                return TextFieldSelectionState.detectCursorHandleDragGestures$lambda$3((Ref.LongRef) obj5, (TextFieldSelectionState) obj4, (Ref.LongRef) obj3, (PointerInputChange) obj, (Offset) obj2);
        }
    }

    public /* synthetic */ r5(Object obj, Object obj2, Object obj3, int i) {
        this.a = i;
        this.c = obj;
        this.b = obj2;
        this.d = obj3;
    }
}
