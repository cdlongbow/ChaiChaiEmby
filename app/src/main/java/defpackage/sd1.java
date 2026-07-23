package defpackage;

import androidx.compose.foundation.BackgroundKt;
import androidx.compose.foundation.FocusableKt;
import androidx.compose.foundation.ScrollKt;
import androidx.compose.foundation.ScrollState;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnScopeInstance;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.RowKt;
import androidx.compose.foundation.layout.RowScopeInstance;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.shape.RoundedCornerShapeKt;
import androidx.compose.material.icons.Icons;
import androidx.compose.material.icons.filled.ErrorOutlineKt;
import androidx.compose.material3.CardDefaults;
import androidx.compose.material3.CardKt;
import androidx.compose.material3.IconKt;
import androidx.compose.material3.MaterialTheme;
import androidx.compose.material3.TextKt;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.focus.FocusRequester;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.ColorKt;
import androidx.compose.ui.input.key.KeyInputModifierKt;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.text.font.FontWeight;
import androidx.compose.ui.unit.Dp;
import androidx.compose.ui.unit.TextUnitKt;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class sd1 implements Function2 {
    public final /* synthetic */ int a = 1;
    public final /* synthetic */ FocusRequester b;
    public final /* synthetic */ Function0 c;
    public final /* synthetic */ Function1 d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object g;
    public final /* synthetic */ Object h;
    public final /* synthetic */ Object i;
    public final /* synthetic */ Object j;

    public /* synthetic */ sd1(u61 u61Var, wr1 wr1Var, wr1 wr1Var2, MutableState mutableState, FocusRequester focusRequester, List list, Function0 function0, Function1 function1) {
        this.e = u61Var;
        this.g = wr1Var;
        this.b = focusRequester;
        this.h = mutableState;
        this.i = list;
        this.j = wr1Var2;
        this.c = function0;
        this.d = function1;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        Function0 function0;
        FocusRequester focusRequester;
        int i = this.a;
        Object obj3 = this.j;
        Object obj4 = this.i;
        Object obj5 = this.h;
        Object obj6 = this.g;
        Object obj7 = this.e;
        switch (i) {
            case 0:
                vd1 vd1Var = (vd1) obj7;
                FocusRequester focusRequester2 = (FocusRequester) obj4;
                ScrollState scrollState = (ScrollState) obj3;
                Function0 function1 = (Function0) obj6;
                Function0 function2 = (Function0) obj5;
                Composer composer = (Composer) obj;
                int iIntValue = ((Integer) obj2).intValue();
                if (composer.shouldExecute((iIntValue & 3) != 2, iIntValue & 1)) {
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(230385986, iIntValue, -1, "com.dh.myembyapp.ui.screens.player.components.PlaybackErrorDialog.<anonymous> (PlaybackErrorDialog.kt:183)");
                    }
                    Function0 function3 = this.c;
                    Boolean boolValueOf = Boolean.valueOf(function3 != null);
                    boolean zChanged = composer.changed(function3);
                    Object objRememberedValue = composer.rememberedValue();
                    FocusRequester focusRequester3 = this.b;
                    if (zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                        function0 = function3;
                        focusRequester = focusRequester3;
                        objRememberedValue = new q3(function0, focusRequester, focusRequester2, (Continuation) null, 13);
                        composer.updateRememberedValue(objRememberedValue);
                    } else {
                        function0 = function3;
                        focusRequester = focusRequester3;
                    }
                    EffectsKt.LaunchedEffect(vd1Var, boolValueOf, (Function2) objRememberedValue, composer, 0);
                    Modifier.Companion companion = Modifier.INSTANCE;
                    Modifier modifierFocusable$default = FocusableKt.focusable$default(BackgroundKt.m275backgroundbw27NRU$default(SizeKt.fillMaxSize$default(companion, 0.0f, 1, r20), ud1.a, null, 2, null), false, 0, 3, r20);
                    Function1 function4 = this.d;
                    Modifier modifierOnPreviewKeyEvent = KeyInputModifierKt.onPreviewKeyEvent(modifierFocusable$default, function4);
                    Alignment.Companion companion2 = Alignment.INSTANCE;
                    MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(companion2.getCenter(), false);
                    long currentCompositeKeyHashCode = ComposablesKt.getCurrentCompositeKeyHashCode(composer, 0);
                    int i2 = (int) (currentCompositeKeyHashCode ^ (currentCompositeKeyHashCode >>> 32));
                    CompositionLocalMap currentCompositionLocalMap = composer.getCurrentCompositionLocalMap();
                    Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(composer, modifierOnPreviewKeyEvent);
                    ComposeUiNode.Companion companion3 = ComposeUiNode.INSTANCE;
                    Function0<ComposeUiNode> constructor = companion3.getConstructor();
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
                    mr.z(companion3, composerM4318constructorimpl, measurePolicyMaybeCachedBoxMeasurePolicy, composerM4318constructorimpl, currentCompositionLocalMap);
                    Updater.m4326setimpl(composerM4318constructorimpl, modifierMaterializeModifier, (Function2<? super T, ? super Modifier, Unit>) id.h(companion3, composerM4318constructorimpl, Integer.valueOf(i2), composerM4318constructorimpl));
                    BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
                    Modifier modifierM1000paddingVpY3zN4 = PaddingKt.m1000paddingVpY3zN4(kb0.v(8.0f, SizeKt.m1052heightInVpY3zN4$default(SizeKt.m1069width3ABfNKs(companion, Dp.m7813constructorimpl(560.0f)), 0.0f, Dp.m7813constructorimpl(560.0f), 1, null), ud1.b), Dp.m7813constructorimpl(24.0f), Dp.m7813constructorimpl(22.0f));
                    Arrangement arrangement = Arrangement.INSTANCE;
                    MeasurePolicy measurePolicyColumnMeasurePolicy = ColumnKt.columnMeasurePolicy(arrangement.m712spacedBy0680j_4(Dp.m7813constructorimpl(10.0f)), companion2.getStart(), composer, 6);
                    long currentCompositeKeyHashCode2 = ComposablesKt.getCurrentCompositeKeyHashCode(composer, 0);
                    int i3 = (int) (currentCompositeKeyHashCode2 ^ (currentCompositeKeyHashCode2 >>> 32));
                    CompositionLocalMap currentCompositionLocalMap2 = composer.getCurrentCompositionLocalMap();
                    Modifier modifierMaterializeModifier2 = ComposedModifierKt.materializeModifier(composer, modifierM1000paddingVpY3zN4);
                    Function0<ComposeUiNode> constructor2 = companion3.getConstructor();
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
                    mr.z(companion3, composerM4318constructorimpl2, measurePolicyColumnMeasurePolicy, composerM4318constructorimpl2, currentCompositionLocalMap2);
                    Updater.m4326setimpl(composerM4318constructorimpl2, modifierMaterializeModifier2, (Function2<? super T, ? super Modifier, Unit>) id.h(companion3, composerM4318constructorimpl2, Integer.valueOf(i3), composerM4318constructorimpl2));
                    ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.INSTANCE;
                    MeasurePolicy measurePolicyRowMeasurePolicy = RowKt.rowMeasurePolicy(arrangement.m712spacedBy0680j_4(Dp.m7813constructorimpl(12.0f)), companion2.getCenterVertically(), composer, 54);
                    long currentCompositeKeyHashCode3 = ComposablesKt.getCurrentCompositeKeyHashCode(composer, 0);
                    int i4 = (int) (currentCompositeKeyHashCode3 ^ (currentCompositeKeyHashCode3 >>> 32));
                    CompositionLocalMap currentCompositionLocalMap3 = composer.getCurrentCompositionLocalMap();
                    Modifier modifierMaterializeModifier3 = ComposedModifierKt.materializeModifier(composer, companion);
                    Function0<ComposeUiNode> constructor3 = companion3.getConstructor();
                    if (composer.getApplier() == null) {
                        ComposablesKt.invalidApplier();
                    }
                    composer.startReusableNode();
                    if (composer.getInserting()) {
                        composer.createNode(constructor3);
                    } else {
                        composer.useNode();
                    }
                    Composer composerM4318constructorimpl3 = Updater.m4318constructorimpl(composer);
                    mr.z(companion3, composerM4318constructorimpl3, measurePolicyRowMeasurePolicy, composerM4318constructorimpl3, currentCompositionLocalMap3);
                    Updater.m4326setimpl(composerM4318constructorimpl3, modifierMaterializeModifier3, (Function2<? super T, ? super Modifier, Unit>) id.h(companion3, composerM4318constructorimpl3, Integer.valueOf(i4), composerM4318constructorimpl3));
                    RowScopeInstance rowScopeInstance = RowScopeInstance.INSTANCE;
                    IconKt.m2496Iconww6aTOc(ErrorOutlineKt.getErrorOutline(Icons.INSTANCE.getDefault()), (String) null, (Modifier) null, ColorKt.Color(4294948011L), composer, 3120, 4);
                    Color.Companion companion4 = Color.INSTANCE;
                    long jM5189getWhite0d7_KjU = companion4.m5189getWhite0d7_KjU();
                    long sp = TextUnitKt.getSp(22);
                    FontWeight.Companion companion5 = FontWeight.INSTANCE;
                    TextKt.m3048TextNvy7gAk("播放失败", null, jM5189getWhite0d7_KjU, null, sp, null, companion5.getBold(), null, 0L, null, null, 0L, 0, false, 0, 0, null, null, composer, 1597830, 0, 262058);
                    composer.endNode();
                    TextKt.m3048TextNvy7gAk(vd1Var.a, null, companion4.m5189getWhite0d7_KjU(), null, TextUnitKt.getSp(16), null, null, null, 0L, null, null, TextUnitKt.getSp(21), 0, false, 0, 0, null, null, composer, 24960, 48, 260074);
                    TextKt.m3048TextNvy7gAk(vd1Var.b, null, Color.m5151copywmQWz5c$default(companion4.m5189getWhite0d7_KjU(), 0.76f, 0.0f, 0.0f, 0.0f, 14, null), null, TextUnitKt.getSp(13), null, null, null, 0L, null, null, TextUnitKt.getSp(18), 0, false, 0, 0, null, null, composer, 24960, 48, 260074);
                    Modifier modifierVerticalScroll$default = ScrollKt.verticalScroll$default(PaddingKt.m999padding3ABfNKs(kb0.v(6.0f, SizeKt.m1052heightInVpY3zN4$default(SizeKt.fillMaxWidth$default(companion, 0.0f, 1, null), 0.0f, Dp.m7813constructorimpl(270.0f), 1, null), ud1.c), Dp.m7813constructorimpl(14.0f)), scrollState, false, null, false, 14, null);
                    MeasurePolicy measurePolicyColumnMeasurePolicy2 = ColumnKt.columnMeasurePolicy(arrangement.m712spacedBy0680j_4(Dp.m7813constructorimpl(8.0f)), companion2.getStart(), composer, 6);
                    long currentCompositeKeyHashCode4 = ComposablesKt.getCurrentCompositeKeyHashCode(composer, 0);
                    int i5 = (int) (currentCompositeKeyHashCode4 ^ (currentCompositeKeyHashCode4 >>> 32));
                    CompositionLocalMap currentCompositionLocalMap4 = composer.getCurrentCompositionLocalMap();
                    Modifier modifierMaterializeModifier4 = ComposedModifierKt.materializeModifier(composer, modifierVerticalScroll$default);
                    Function0<ComposeUiNode> constructor4 = companion3.getConstructor();
                    if (composer.getApplier() == null) {
                        ComposablesKt.invalidApplier();
                    }
                    composer.startReusableNode();
                    if (composer.getInserting()) {
                        composer.createNode(constructor4);
                    } else {
                        composer.useNode();
                    }
                    Composer composerM4318constructorimpl4 = Updater.m4318constructorimpl(composer);
                    mr.z(companion3, composerM4318constructorimpl4, measurePolicyColumnMeasurePolicy2, composerM4318constructorimpl4, currentCompositionLocalMap4);
                    Updater.m4326setimpl(composerM4318constructorimpl4, modifierMaterializeModifier4, (Function2<? super T, ? super Modifier, Unit>) id.h(companion3, composerM4318constructorimpl4, Integer.valueOf(i5), composerM4318constructorimpl4));
                    TextKt.m3048TextNvy7gAk("错误详情", null, Color.m5151copywmQWz5c$default(companion4.m5189getWhite0d7_KjU(), 0.9f, 0.0f, 0.0f, 0.0f, 14, null), null, TextUnitKt.getSp(13), null, companion5.getMedium(), null, 0L, null, null, 0L, 0, false, 0, 0, null, null, composer, 1597830, 0, 262058);
                    composer.startReplaceGroup(1859376002);
                    Iterator it = vd1Var.c.iterator();
                    while (it.hasNext()) {
                        TextKt.m3048TextNvy7gAk((String) it.next(), null, Color.m5151copywmQWz5c$default(Color.INSTANCE.m5189getWhite0d7_KjU(), 0.72f, 0.0f, 0.0f, 0.0f, 14, null), null, TextUnitKt.getSp(13), null, null, null, 0L, null, null, TextUnitKt.getSp(18), 0, false, 0, 0, null, null, composer, 24960, 48, 260074);
                    }
                    composer.endReplaceGroup();
                    composer.endNode();
                    Modifier.Companion companion6 = Modifier.INSTANCE;
                    id.i(0.0f, companion6, composer, 6);
                    Modifier modifierFillMaxWidth$default = SizeKt.fillMaxWidth$default(companion6, 0.0f, 1, null);
                    Arrangement arrangement2 = Arrangement.INSTANCE;
                    float fM7813constructorimpl = Dp.m7813constructorimpl(12.0f);
                    Alignment.Companion companion7 = Alignment.INSTANCE;
                    MeasurePolicy measurePolicyRowMeasurePolicy2 = RowKt.rowMeasurePolicy(arrangement2.m713spacedByD5KLDUw(fM7813constructorimpl, companion7.getEnd()), companion7.getTop(), composer, 6);
                    long currentCompositeKeyHashCode5 = ComposablesKt.getCurrentCompositeKeyHashCode(composer, 0);
                    int i6 = (int) (currentCompositeKeyHashCode5 ^ (currentCompositeKeyHashCode5 >>> 32));
                    CompositionLocalMap currentCompositionLocalMap5 = composer.getCurrentCompositionLocalMap();
                    Modifier modifierMaterializeModifier5 = ComposedModifierKt.materializeModifier(composer, modifierFillMaxWidth$default);
                    ComposeUiNode.Companion companion8 = ComposeUiNode.INSTANCE;
                    Function0<ComposeUiNode> constructor5 = companion8.getConstructor();
                    if (composer.getApplier() == null) {
                        ComposablesKt.invalidApplier();
                    }
                    composer.startReusableNode();
                    if (composer.getInserting()) {
                        composer.createNode(constructor5);
                    } else {
                        composer.useNode();
                    }
                    Composer composerM4318constructorimpl5 = Updater.m4318constructorimpl(composer);
                    mr.z(companion8, composerM4318constructorimpl5, measurePolicyRowMeasurePolicy2, composerM4318constructorimpl5, currentCompositionLocalMap5);
                    Updater.m4326setimpl(composerM4318constructorimpl5, modifierMaterializeModifier5, (Function2<? super T, ? super Modifier, Unit>) id.h(companion8, composerM4318constructorimpl5, Integer.valueOf(i6), composerM4318constructorimpl5));
                    RowScopeInstance rowScopeInstance2 = RowScopeInstance.INSTANCE;
                    ud1.a("返回详情", function1, function0 == null, SizeKt.m1069width3ABfNKs(companion6, Dp.m7813constructorimpl(132.0f)), function0 == null ? focusRequester2 : null, function4, null, composer, 3078, 64);
                    if (function0 != null) {
                        composer.startReplaceGroup(-1617440572);
                        ud1.a("转码播放", function0, true, SizeKt.m1069width3ABfNKs(companion6, Dp.m7813constructorimpl(148.0f)), focusRequester, function4, null, composer, 28038, 64);
                        composer.endReplaceGroup();
                    } else {
                        composer.startReplaceGroup(-1617044919);
                        composer.endReplaceGroup();
                    }
                    ud1.a("重试播放", function2, false, SizeKt.m1069width3ABfNKs(companion6, Dp.m7813constructorimpl(148.0f)), null, function4, ot.a, composer, 1576326, 16);
                    if (i02.w(composer)) {
                        ComposerKt.traceEventEnd();
                    }
                } else {
                    composer.skipToGroupEnd();
                }
                break;
            default:
                u61 u61Var = (u61) obj7;
                wr1 wr1Var = (wr1) obj6;
                MutableState mutableState = (MutableState) obj5;
                List list = (List) obj4;
                wr1 wr1Var2 = (wr1) obj3;
                Composer composer2 = (Composer) obj;
                int iIntValue2 = ((Integer) obj2).intValue();
                if (composer2.shouldExecute((iIntValue2 & 3) != 2, iIntValue2 & 1)) {
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(1069693744, iIntValue2, -1, "com.dh.myembyapp.ui.components.QrNetworkSettingsDialog.<anonymous> (QrNetworkSettingsDialog.kt:91)");
                    }
                    Modifier.Companion companion9 = Modifier.INSTANCE;
                    Modifier modifierM275backgroundbw27NRU$default = BackgroundKt.m275backgroundbw27NRU$default(SizeKt.fillMaxSize$default(companion9, 0.0f, 1, null), u61Var.a, null, 2, null);
                    MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy2 = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.INSTANCE.getCenter(), false);
                    long currentCompositeKeyHashCode6 = ComposablesKt.getCurrentCompositeKeyHashCode(composer2, 0);
                    int i7 = (int) (currentCompositeKeyHashCode6 ^ (currentCompositeKeyHashCode6 >>> 32));
                    CompositionLocalMap currentCompositionLocalMap6 = composer2.getCurrentCompositionLocalMap();
                    Modifier modifierMaterializeModifier6 = ComposedModifierKt.materializeModifier(composer2, modifierM275backgroundbw27NRU$default);
                    ComposeUiNode.Companion companion10 = ComposeUiNode.INSTANCE;
                    Function0<ComposeUiNode> constructor6 = companion10.getConstructor();
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
                    mr.z(companion10, composerM4318constructorimpl6, measurePolicyMaybeCachedBoxMeasurePolicy2, composerM4318constructorimpl6, currentCompositionLocalMap6);
                    Updater.m4326setimpl(composerM4318constructorimpl6, modifierMaterializeModifier6, (Function2<? super T, ? super Modifier, Unit>) id.h(companion10, composerM4318constructorimpl6, Integer.valueOf(i7), composerM4318constructorimpl6));
                    BoxScopeInstance boxScopeInstance2 = BoxScopeInstance.INSTANCE;
                    CardKt.Card(SizeKt.m1052heightInVpY3zN4$default(SizeKt.m1069width3ABfNKs(companion9, Dp.m7813constructorimpl(560.0f)), 0.0f, Dp.m7813constructorimpl(620.0f), 1, null), RoundedCornerShapeKt.m1312RoundedCornerShape0680j_4(Dp.m7813constructorimpl(12.0f)), CardDefaults.INSTANCE.m2119cardColorsro_MJ88(MaterialTheme.INSTANCE.getColorScheme(composer2, MaterialTheme.$stable).getSurface(), 0L, 0L, 0L, composer2, CardDefaults.$stable << 12, 14), null, null, ComposableLambdaKt.rememberComposableLambda(-1826507464, true, new mi1(u61Var, wr1Var, wr1Var2, mutableState, this.b, list, this.c, this.d), composer2, 54), composer2, 196614, 24);
                    composer2.endNode();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                } else {
                    composer2.skipToGroupEnd();
                }
                break;
        }
        return Unit.INSTANCE;
    }

    public /* synthetic */ sd1(vd1 vd1Var, Function0 function0, Function1 function1, FocusRequester focusRequester, FocusRequester focusRequester2, ScrollState scrollState, Function0 function2, Function0 function3) {
        this.e = vd1Var;
        this.c = function0;
        this.d = function1;
        this.b = focusRequester;
        this.i = focusRequester2;
        this.j = scrollState;
        this.g = function2;
        this.h = function3;
    }
}
