package defpackage;

import android.content.Context;
import androidx.compose.foundation.BackgroundKt;
import androidx.compose.foundation.BorderKt;
import androidx.compose.foundation.ScrollKt;
import androidx.compose.foundation.ScrollState;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnScope;
import androidx.compose.foundation.layout.ColumnScopeInstance;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.foundation.layout.RowKt;
import androidx.compose.foundation.layout.RowScopeInstance;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.SpacerKt;
import androidx.compose.foundation.lazy.LazyDslKt;
import androidx.compose.foundation.lazy.LazyListState;
import androidx.compose.foundation.shape.RoundedCornerShapeKt;
import androidx.compose.material3.CardColors;
import androidx.compose.material3.CardDefaults;
import androidx.compose.material3.CardKt;
import androidx.compose.material3.MaterialTheme;
import androidx.compose.material3.ProgressIndicatorKt;
import androidx.compose.material3.SwitchColors;
import androidx.compose.material3.SwitchKt;
import androidx.compose.material3.TextKt;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.MutableFloatState;
import androidx.compose.runtime.MutableIntState;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.SnapshotMutationPolicy;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.runtime.snapshots.SnapshotStateMap;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.draw.ScaleKt;
import androidx.compose.ui.focus.FocusChangedModifierKt;
import androidx.compose.ui.focus.FocusRequester;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.ColorKt;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.text.font.FontWeight;
import androidx.compose.ui.unit.Dp;
import androidx.compose.ui.unit.TextUnitKt;
import com.dh.myembyapp.data.model.MediaItem;
import com.dh.myembyapp.data.model.MediaSource;
import java.util.List;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class wy implements Function2 {
    public final /* synthetic */ int a = 1;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ MutableState e;
    public final /* synthetic */ MutableState g;
    public final /* synthetic */ Object h;
    public final /* synthetic */ Object i;
    public final /* synthetic */ Object j;
    public final /* synthetic */ Object k;
    public final /* synthetic */ Object l;
    public final /* synthetic */ Object m;
    public final /* synthetic */ Object n;

    public /* synthetic */ wy(u61 u61Var, LazyListState lazyListState, MutableState mutableState, SnapshotStateMap snapshotStateMap, SnapshotStateMap snapshotStateMap2, CoroutineScope coroutineScope, Function2 function2, Function1 function1, MutableState mutableState2, MutableState mutableState3, MutableState mutableState4, MutableState mutableState5) {
        this.d = u61Var;
        this.j = lazyListState;
        this.e = mutableState;
        this.k = snapshotStateMap;
        this.l = snapshotStateMap2;
        this.i = coroutineScope;
        this.h = function2;
        this.c = function1;
        this.g = mutableState2;
        this.n = mutableState3;
        this.m = mutableState4;
        this.b = mutableState5;
    }

    /* JADX WARN: Code duplicated, block: B:64:0x031f  */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        MutableIntState mutableIntState;
        CoroutineScope coroutineScope;
        SnapshotMutationPolicy snapshotMutationPolicy;
        int i;
        int i2;
        Modifier modifierM286borderxT4_qwU;
        int i3 = this.a;
        boolean z = true;
        Object obj3 = this.m;
        Object obj4 = this.i;
        Object obj5 = this.b;
        Object obj6 = this.h;
        Object obj7 = this.l;
        Object obj8 = this.k;
        Object obj9 = this.j;
        int i4 = 12;
        Object obj10 = this.n;
        Object obj11 = this.d;
        Object obj12 = this.c;
        switch (i3) {
            case 0:
                CoroutineScope coroutineScope2 = (CoroutineScope) obj4;
                Function1 function1 = (Function1) obj12;
                final MutableFloatState mutableFloatState = (MutableFloatState) obj9;
                final MutableFloatState mutableFloatState2 = (MutableFloatState) obj8;
                final MutableFloatState mutableFloatState3 = (MutableFloatState) obj7;
                MutableIntState mutableIntState2 = (MutableIntState) obj6;
                MutableIntState mutableIntState3 = (MutableIntState) obj3;
                MutableState mutableState = (MutableState) obj10;
                Function0 function0 = (Function0) obj5;
                Function1 function2 = (Function1) obj11;
                Composer composer = (Composer) obj;
                int iIntValue = ((Integer) obj2).intValue();
                if (composer.shouldExecute((iIntValue & 3) != 2, iIntValue & 1)) {
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-1976416560, iIntValue, -1, "com.dh.myembyapp.ui.components.DanmakuSettingsDialog.<anonymous> (DanmakuSettingsDialog.kt:76)");
                    }
                    Modifier.Companion companion = Modifier.INSTANCE;
                    Modifier modifierFillMaxSize$default = SizeKt.fillMaxSize$default(companion, 0.0f, 1, null);
                    Color.Companion companion2 = Color.INSTANCE;
                    Modifier modifierM275backgroundbw27NRU$default = BackgroundKt.m275backgroundbw27NRU$default(modifierFillMaxSize$default, Color.m5151copywmQWz5c$default(companion2.m5178getBlack0d7_KjU(), 0.1f, 0.0f, 0.0f, 0.0f, 14, null), null, 2, null);
                    Alignment.Companion companion3 = Alignment.INSTANCE;
                    MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(companion3.getCenter(), false);
                    long currentCompositeKeyHashCode = ComposablesKt.getCurrentCompositeKeyHashCode(composer, 0);
                    int i5 = (int) (currentCompositeKeyHashCode ^ (currentCompositeKeyHashCode >>> 32));
                    CompositionLocalMap currentCompositionLocalMap = composer.getCurrentCompositionLocalMap();
                    Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(composer, modifierM275backgroundbw27NRU$default);
                    ComposeUiNode.Companion companion4 = ComposeUiNode.INSTANCE;
                    Function0<ComposeUiNode> constructor = companion4.getConstructor();
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
                    mr.z(companion4, composerM4318constructorimpl, measurePolicyMaybeCachedBoxMeasurePolicy, composerM4318constructorimpl, currentCompositionLocalMap);
                    Updater.m4326setimpl(composerM4318constructorimpl, modifierMaterializeModifier, (Function2<? super T, ? super Modifier, Unit>) id.h(companion4, composerM4318constructorimpl, Integer.valueOf(i5), composerM4318constructorimpl));
                    BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
                    Modifier modifierM999padding3ABfNKs = PaddingKt.m999padding3ABfNKs(ScrollKt.verticalScroll$default(kb0.v(12.0f, SizeKt.m1052heightInVpY3zN4$default(SizeKt.m1069width3ABfNKs(companion, Dp.m7813constructorimpl(480.0f)), 0.0f, Dp.m7813constructorimpl(480.0f), 1, null), ColorKt.Color(4280032284L)), ScrollKt.rememberScrollState(0, composer, 0, 1), false, null, false, 14, null), Dp.m7813constructorimpl(16.0f));
                    Arrangement arrangement = Arrangement.INSTANCE;
                    MeasurePolicy measurePolicyColumnMeasurePolicy = ColumnKt.columnMeasurePolicy(arrangement.getTop(), companion3.getStart(), composer, 0);
                    long currentCompositeKeyHashCode2 = ComposablesKt.getCurrentCompositeKeyHashCode(composer, 0);
                    int i6 = (int) (currentCompositeKeyHashCode2 ^ (currentCompositeKeyHashCode2 >>> 32));
                    CompositionLocalMap currentCompositionLocalMap2 = composer.getCurrentCompositionLocalMap();
                    Modifier modifierMaterializeModifier2 = ComposedModifierKt.materializeModifier(composer, modifierM999padding3ABfNKs);
                    Function0<ComposeUiNode> constructor2 = companion4.getConstructor();
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
                    mr.z(companion4, composerM4318constructorimpl2, measurePolicyColumnMeasurePolicy, composerM4318constructorimpl2, currentCompositionLocalMap2);
                    Updater.m4326setimpl(composerM4318constructorimpl2, modifierMaterializeModifier2, (Function2<? super T, ? super Modifier, Unit>) id.h(companion4, composerM4318constructorimpl2, Integer.valueOf(i6), composerM4318constructorimpl2));
                    ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.INSTANCE;
                    TextKt.m3048TextNvy7gAk("弹幕设置", PaddingKt.m1003paddingqDBjuR0$default(companion, 0.0f, 0.0f, 0.0f, Dp.m7813constructorimpl(10.0f), 7, null), companion2.m5189getWhite0d7_KjU(), null, TextUnitKt.getSp(18), null, FontWeight.INSTANCE.getBold(), null, 0L, null, null, 0L, 0, false, 0, 0, null, null, composer, 1597878, 0, 262056);
                    Alignment.Vertical centerVertically = companion3.getCenterVertically();
                    Modifier modifierM1003paddingqDBjuR0$default = PaddingKt.m1003paddingqDBjuR0$default(companion, 0.0f, 0.0f, 0.0f, Dp.m7813constructorimpl(6.0f), 7, null);
                    MeasurePolicy measurePolicyRowMeasurePolicy = RowKt.rowMeasurePolicy(arrangement.getStart(), centerVertically, composer, 48);
                    long currentCompositeKeyHashCode3 = ComposablesKt.getCurrentCompositeKeyHashCode(composer, 0);
                    int i7 = (int) (currentCompositeKeyHashCode3 ^ (currentCompositeKeyHashCode3 >>> 32));
                    CompositionLocalMap currentCompositionLocalMap3 = composer.getCurrentCompositionLocalMap();
                    Modifier modifierMaterializeModifier3 = ComposedModifierKt.materializeModifier(composer, modifierM1003paddingqDBjuR0$default);
                    Function0<ComposeUiNode> constructor3 = companion4.getConstructor();
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
                    mr.z(companion4, composerM4318constructorimpl3, measurePolicyRowMeasurePolicy, composerM4318constructorimpl3, currentCompositionLocalMap3);
                    Updater.m4326setimpl(composerM4318constructorimpl3, modifierMaterializeModifier3, (Function2<? super T, ? super Modifier, Unit>) id.h(companion4, composerM4318constructorimpl3, Integer.valueOf(i7), composerM4318constructorimpl3));
                    RowScopeInstance rowScopeInstance = RowScopeInstance.INSTANCE;
                    TextKt.m3048TextNvy7gAk("弹幕速度", null, companion2.m5189getWhite0d7_KjU(), null, TextUnitKt.getSp(15), null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, composer, 24966, 0, 262122);
                    TextKt.m3048TextNvy7gAk("（值越大滚动越快，范围 0.3-2.0）", PaddingKt.m1003paddingqDBjuR0$default(companion, Dp.m7813constructorimpl(8.0f), 0.0f, 0.0f, 0.0f, 14, null), companion2.m5182getGray0d7_KjU(), null, TextUnitKt.getSp(12), null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, composer, 25014, 0, 262120);
                    composer.endNode();
                    float floatValue = mutableFloatState.getFloatValue();
                    Object objRememberedValue = composer.rememberedValue();
                    Composer.Companion companion5 = Composer.INSTANCE;
                    if (objRememberedValue == companion5.getEmpty()) {
                        final int i8 = 0;
                        objRememberedValue = new Function1() { // from class: ry
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj13) {
                                int i9 = i8;
                                float fFloatValue = ((Float) obj13).floatValue();
                                switch (i9) {
                                    case 0:
                                        mutableFloatState.setFloatValue(fFloatValue);
                                        break;
                                    case 1:
                                        mutableFloatState.setFloatValue(fFloatValue);
                                        break;
                                    default:
                                        mutableFloatState.setFloatValue(fFloatValue);
                                        break;
                                }
                                return Unit.INSTANCE;
                            }
                        };
                        composer.updateRememberedValue(objRememberedValue);
                    }
                    gz.f(floatValue, (Function1) objRememberedValue, composer, 48);
                    SpacerKt.Spacer(SizeKt.m1050height3ABfNKs(companion, Dp.m7813constructorimpl(10.0f)), composer, 6);
                    Alignment.Vertical centerVertically2 = companion3.getCenterVertically();
                    Modifier modifierM1003paddingqDBjuR0$default2 = PaddingKt.m1003paddingqDBjuR0$default(companion, 0.0f, 0.0f, 0.0f, Dp.m7813constructorimpl(6.0f), 7, null);
                    MeasurePolicy measurePolicyRowMeasurePolicy2 = RowKt.rowMeasurePolicy(arrangement.getStart(), centerVertically2, composer, 48);
                    long currentCompositeKeyHashCode4 = ComposablesKt.getCurrentCompositeKeyHashCode(composer, 0);
                    int i9 = (int) (currentCompositeKeyHashCode4 ^ (currentCompositeKeyHashCode4 >>> 32));
                    CompositionLocalMap currentCompositionLocalMap4 = composer.getCurrentCompositionLocalMap();
                    Modifier modifierMaterializeModifier4 = ComposedModifierKt.materializeModifier(composer, modifierM1003paddingqDBjuR0$default2);
                    Function0<ComposeUiNode> constructor4 = companion4.getConstructor();
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
                    mr.z(companion4, composerM4318constructorimpl4, measurePolicyRowMeasurePolicy2, composerM4318constructorimpl4, currentCompositionLocalMap4);
                    Updater.m4326setimpl(composerM4318constructorimpl4, modifierMaterializeModifier4, (Function2<? super T, ? super Modifier, Unit>) id.h(companion4, composerM4318constructorimpl4, Integer.valueOf(i9), composerM4318constructorimpl4));
                    TextKt.m3048TextNvy7gAk("弹幕大小", null, companion2.m5189getWhite0d7_KjU(), null, TextUnitKt.getSp(15), null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, composer, 24966, 0, 262122);
                    TextKt.m3048TextNvy7gAk("（1.0 为默认大小，范围 0.5-3.0）", PaddingKt.m1003paddingqDBjuR0$default(companion, Dp.m7813constructorimpl(8.0f), 0.0f, 0.0f, 0.0f, 14, null), companion2.m5182getGray0d7_KjU(), null, TextUnitKt.getSp(12), null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, composer, 25014, 0, 262120);
                    composer.endNode();
                    float floatValue2 = mutableFloatState2.getFloatValue();
                    Object objRememberedValue2 = composer.rememberedValue();
                    if (objRememberedValue2 == companion5.getEmpty()) {
                        final int i10 = 1;
                        objRememberedValue2 = new Function1() { // from class: ry
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj13) {
                                int i11 = i10;
                                float fFloatValue = ((Float) obj13).floatValue();
                                switch (i11) {
                                    case 0:
                                        mutableFloatState2.setFloatValue(fFloatValue);
                                        break;
                                    case 1:
                                        mutableFloatState2.setFloatValue(fFloatValue);
                                        break;
                                    default:
                                        mutableFloatState2.setFloatValue(fFloatValue);
                                        break;
                                }
                                return Unit.INSTANCE;
                            }
                        };
                        composer.updateRememberedValue(objRememberedValue2);
                    }
                    gz.e(floatValue2, (Function1) objRememberedValue2, composer, 48);
                    SpacerKt.Spacer(SizeKt.m1050height3ABfNKs(companion, Dp.m7813constructorimpl(10.0f)), composer, 6);
                    Alignment.Vertical centerVertically3 = companion3.getCenterVertically();
                    Modifier modifierM1003paddingqDBjuR0$default3 = PaddingKt.m1003paddingqDBjuR0$default(companion, 0.0f, 0.0f, 0.0f, Dp.m7813constructorimpl(6.0f), 7, null);
                    MeasurePolicy measurePolicyRowMeasurePolicy3 = RowKt.rowMeasurePolicy(arrangement.getStart(), centerVertically3, composer, 48);
                    long currentCompositeKeyHashCode5 = ComposablesKt.getCurrentCompositeKeyHashCode(composer, 0);
                    int i11 = (int) (currentCompositeKeyHashCode5 ^ (currentCompositeKeyHashCode5 >>> 32));
                    CompositionLocalMap currentCompositionLocalMap5 = composer.getCurrentCompositionLocalMap();
                    Modifier modifierMaterializeModifier5 = ComposedModifierKt.materializeModifier(composer, modifierM1003paddingqDBjuR0$default3);
                    Function0<ComposeUiNode> constructor5 = companion4.getConstructor();
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
                    mr.z(companion4, composerM4318constructorimpl5, measurePolicyRowMeasurePolicy3, composerM4318constructorimpl5, currentCompositionLocalMap5);
                    Updater.m4326setimpl(composerM4318constructorimpl5, modifierMaterializeModifier5, (Function2<? super T, ? super Modifier, Unit>) id.h(companion4, composerM4318constructorimpl5, Integer.valueOf(i11), composerM4318constructorimpl5));
                    TextKt.m3048TextNvy7gAk("弹幕显示区域", null, companion2.m5189getWhite0d7_KjU(), null, TextUnitKt.getSp(15), null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, composer, 24966, 0, 262122);
                    TextKt.m3048TextNvy7gAk("（1.0 为全屏，范围 0.05-1.0，步长 0.05）", PaddingKt.m1003paddingqDBjuR0$default(companion, Dp.m7813constructorimpl(8.0f), 0.0f, 0.0f, 0.0f, 14, null), companion2.m5182getGray0d7_KjU(), null, TextUnitKt.getSp(12), null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, composer, 25014, 0, 262120);
                    composer.endNode();
                    float floatValue3 = mutableFloatState3.getFloatValue();
                    Object objRememberedValue3 = composer.rememberedValue();
                    if (objRememberedValue3 == companion5.getEmpty()) {
                        final int i12 = 2;
                        objRememberedValue3 = new Function1() { // from class: ry
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj13) {
                                int i13 = i12;
                                float fFloatValue = ((Float) obj13).floatValue();
                                switch (i13) {
                                    case 0:
                                        mutableFloatState3.setFloatValue(fFloatValue);
                                        break;
                                    case 1:
                                        mutableFloatState3.setFloatValue(fFloatValue);
                                        break;
                                    default:
                                        mutableFloatState3.setFloatValue(fFloatValue);
                                        break;
                                }
                                return Unit.INSTANCE;
                            }
                        };
                        composer.updateRememberedValue(objRememberedValue3);
                    }
                    gz.d(floatValue3, (Function1) objRememberedValue3, composer, 48);
                    SpacerKt.Spacer(SizeKt.m1050height3ABfNKs(companion, Dp.m7813constructorimpl(10.0f)), composer, 6);
                    Alignment.Vertical centerVertically4 = companion3.getCenterVertically();
                    Modifier modifierM1003paddingqDBjuR0$default4 = PaddingKt.m1003paddingqDBjuR0$default(companion, 0.0f, 0.0f, 0.0f, Dp.m7813constructorimpl(6.0f), 7, null);
                    MeasurePolicy measurePolicyRowMeasurePolicy4 = RowKt.rowMeasurePolicy(arrangement.getStart(), centerVertically4, composer, 48);
                    long currentCompositeKeyHashCode6 = ComposablesKt.getCurrentCompositeKeyHashCode(composer, 0);
                    int i13 = (int) (currentCompositeKeyHashCode6 ^ (currentCompositeKeyHashCode6 >>> 32));
                    CompositionLocalMap currentCompositionLocalMap6 = composer.getCurrentCompositionLocalMap();
                    Modifier modifierMaterializeModifier6 = ComposedModifierKt.materializeModifier(composer, modifierM1003paddingqDBjuR0$default4);
                    Function0<ComposeUiNode> constructor6 = companion4.getConstructor();
                    if (composer.getApplier() == null) {
                        ComposablesKt.invalidApplier();
                    }
                    composer.startReusableNode();
                    if (composer.getInserting()) {
                        composer.createNode(constructor6);
                    } else {
                        composer.useNode();
                    }
                    Composer composerM4318constructorimpl6 = Updater.m4318constructorimpl(composer);
                    mr.z(companion4, composerM4318constructorimpl6, measurePolicyRowMeasurePolicy4, composerM4318constructorimpl6, currentCompositionLocalMap6);
                    Updater.m4326setimpl(composerM4318constructorimpl6, modifierMaterializeModifier6, (Function2<? super T, ? super Modifier, Unit>) id.h(companion4, composerM4318constructorimpl6, Integer.valueOf(i13), composerM4318constructorimpl6));
                    TextKt.m3048TextNvy7gAk("透明度", null, companion2.m5189getWhite0d7_KjU(), null, TextUnitKt.getSp(15), null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, composer, 24966, 0, 262122);
                    TextKt.m3048TextNvy7gAk("（100 为完全不透明，范围 0-100）", PaddingKt.m1003paddingqDBjuR0$default(companion, Dp.m7813constructorimpl(8.0f), 0.0f, 0.0f, 0.0f, 14, null), companion2.m5182getGray0d7_KjU(), null, TextUnitKt.getSp(12), null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, composer, 25014, 0, 262120);
                    composer.endNode();
                    int intValue = mutableIntState2.getIntValue();
                    Object objRememberedValue4 = composer.rememberedValue();
                    if (objRememberedValue4 == companion5.getEmpty()) {
                        objRememberedValue4 = new sy(mutableIntState2, 0);
                        composer.updateRememberedValue(objRememberedValue4);
                    }
                    gz.b((Function1) objRememberedValue4, intValue, composer, 48);
                    SpacerKt.Spacer(SizeKt.m1050height3ABfNKs(companion, Dp.m7813constructorimpl(10.0f)), composer, 6);
                    Alignment.Vertical centerVertically5 = companion3.getCenterVertically();
                    Modifier modifierM1003paddingqDBjuR0$default5 = PaddingKt.m1003paddingqDBjuR0$default(companion, 0.0f, 0.0f, 0.0f, Dp.m7813constructorimpl(6.0f), 7, null);
                    MeasurePolicy measurePolicyRowMeasurePolicy5 = RowKt.rowMeasurePolicy(arrangement.getStart(), centerVertically5, composer, 48);
                    long currentCompositeKeyHashCode7 = ComposablesKt.getCurrentCompositeKeyHashCode(composer, 0);
                    int i14 = (int) (currentCompositeKeyHashCode7 ^ (currentCompositeKeyHashCode7 >>> 32));
                    CompositionLocalMap currentCompositionLocalMap7 = composer.getCurrentCompositionLocalMap();
                    Modifier modifierMaterializeModifier7 = ComposedModifierKt.materializeModifier(composer, modifierM1003paddingqDBjuR0$default5);
                    Function0<ComposeUiNode> constructor7 = companion4.getConstructor();
                    if (composer.getApplier() == null) {
                        ComposablesKt.invalidApplier();
                    }
                    composer.startReusableNode();
                    if (composer.getInserting()) {
                        composer.createNode(constructor7);
                    } else {
                        composer.useNode();
                    }
                    Composer composerM4318constructorimpl7 = Updater.m4318constructorimpl(composer);
                    mr.z(companion4, composerM4318constructorimpl7, measurePolicyRowMeasurePolicy5, composerM4318constructorimpl7, currentCompositionLocalMap7);
                    Updater.m4326setimpl(composerM4318constructorimpl7, modifierMaterializeModifier7, (Function2<? super T, ? super Modifier, Unit>) id.h(companion4, composerM4318constructorimpl7, Integer.valueOf(i14), composerM4318constructorimpl7));
                    TextKt.m3048TextNvy7gAk("弹幕延迟", null, companion2.m5189getWhite0d7_KjU(), null, TextUnitKt.getSp(15), null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, composer, 24966, 0, 262122);
                    TextKt.m3048TextNvy7gAk("（正值延后，负值提前）", PaddingKt.m1003paddingqDBjuR0$default(companion, Dp.m7813constructorimpl(8.0f), 0.0f, 0.0f, 0.0f, 14, null), companion2.m5182getGray0d7_KjU(), null, TextUnitKt.getSp(12), null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, composer, 25014, 0, 262120);
                    composer.endNode();
                    int intValue2 = mutableIntState3.getIntValue();
                    boolean zChangedInstance = composer.changedInstance(coroutineScope2) | composer.changed(function1);
                    Object objRememberedValue5 = composer.rememberedValue();
                    if (zChangedInstance || objRememberedValue5 == companion5.getEmpty()) {
                        mutableIntState = mutableIntState3;
                        coroutineScope = coroutineScope2;
                        g9 g9Var = new g9(mutableIntState, coroutineScope, this.e, function1, 6);
                        composer.updateRememberedValue(g9Var);
                        objRememberedValue5 = g9Var;
                    } else {
                        mutableIntState = mutableIntState3;
                        coroutineScope = coroutineScope2;
                    }
                    gz.g((Function1) objRememberedValue5, intValue2, composer, 0);
                    id.i(10.0f, companion, composer, 6);
                    Modifier modifierFillMaxWidth$default = SizeKt.fillMaxWidth$default(companion, 0.0f, 1, null);
                    MeasurePolicy measurePolicyRowMeasurePolicy6 = RowKt.rowMeasurePolicy(arrangement.getSpaceBetween(), companion3.getCenterVertically(), composer, 54);
                    long currentCompositeKeyHashCode8 = ComposablesKt.getCurrentCompositeKeyHashCode(composer, 0);
                    int i15 = (int) (currentCompositeKeyHashCode8 ^ (currentCompositeKeyHashCode8 >>> 32));
                    CompositionLocalMap currentCompositionLocalMap8 = composer.getCurrentCompositionLocalMap();
                    Modifier modifierMaterializeModifier8 = ComposedModifierKt.materializeModifier(composer, modifierFillMaxWidth$default);
                    Function0<ComposeUiNode> constructor8 = companion4.getConstructor();
                    if (composer.getApplier() == null) {
                        ComposablesKt.invalidApplier();
                    }
                    composer.startReusableNode();
                    if (composer.getInserting()) {
                        composer.createNode(constructor8);
                    } else {
                        composer.useNode();
                    }
                    Composer composerM4318constructorimpl8 = Updater.m4318constructorimpl(composer);
                    mr.z(companion4, composerM4318constructorimpl8, measurePolicyRowMeasurePolicy6, composerM4318constructorimpl8, currentCompositionLocalMap8);
                    Updater.m4326setimpl(composerM4318constructorimpl8, modifierMaterializeModifier8, (Function2<? super T, ? super Modifier, Unit>) id.h(companion4, composerM4318constructorimpl8, Integer.valueOf(i15), composerM4318constructorimpl8));
                    Alignment.Vertical centerVertically6 = companion3.getCenterVertically();
                    Modifier modifierE = zs1.E(rowScopeInstance, companion, 1.0f, false, 2, null);
                    MeasurePolicy measurePolicyRowMeasurePolicy7 = RowKt.rowMeasurePolicy(arrangement.getStart(), centerVertically6, composer, 48);
                    long currentCompositeKeyHashCode9 = ComposablesKt.getCurrentCompositeKeyHashCode(composer, 0);
                    int i16 = (int) (currentCompositeKeyHashCode9 ^ (currentCompositeKeyHashCode9 >>> 32));
                    CompositionLocalMap currentCompositionLocalMap9 = composer.getCurrentCompositionLocalMap();
                    Modifier modifierMaterializeModifier9 = ComposedModifierKt.materializeModifier(composer, modifierE);
                    Function0<ComposeUiNode> constructor9 = companion4.getConstructor();
                    if (composer.getApplier() == null) {
                        ComposablesKt.invalidApplier();
                    }
                    composer.startReusableNode();
                    if (composer.getInserting()) {
                        composer.createNode(constructor9);
                    } else {
                        composer.useNode();
                    }
                    Composer composerM4318constructorimpl9 = Updater.m4318constructorimpl(composer);
                    mr.z(companion4, composerM4318constructorimpl9, measurePolicyRowMeasurePolicy7, composerM4318constructorimpl9, currentCompositionLocalMap9);
                    Updater.m4326setimpl(composerM4318constructorimpl9, modifierMaterializeModifier9, (Function2<? super T, ? super Modifier, Unit>) id.h(companion4, composerM4318constructorimpl9, Integer.valueOf(i16), composerM4318constructorimpl9));
                    TextKt.m3048TextNvy7gAk("顶部弹幕", null, companion2.m5189getWhite0d7_KjU(), null, TextUnitKt.getSp(14), null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, composer, 24966, 0, 262122);
                    SpacerKt.Spacer(SizeKt.m1069width3ABfNKs(companion, Dp.m7813constructorimpl(8.0f)), composer, 6);
                    MutableState mutableState2 = this.g;
                    boolean zBooleanValue = ((Boolean) mutableState2.getValue()).booleanValue();
                    SwitchColors switchColorsA = zc2.a(composer);
                    Modifier modifierScale = ScaleKt.scale(companion, 0.85f);
                    Object objRememberedValue6 = composer.rememberedValue();
                    if (objRememberedValue6 == companion5.getEmpty()) {
                        objRememberedValue6 = new zh(23, mutableState2);
                        composer.updateRememberedValue(objRememberedValue6);
                    }
                    SwitchKt.Switch(zBooleanValue, (Function1) objRememberedValue6, modifierScale, null, false, switchColorsA, null, composer, 432, 88);
                    composer.endNode();
                    Alignment.Vertical centerVertically7 = companion3.getCenterVertically();
                    Modifier modifierE2 = zs1.E(rowScopeInstance, companion, 1.0f, false, 2, null);
                    MeasurePolicy measurePolicyRowMeasurePolicy8 = RowKt.rowMeasurePolicy(arrangement.getStart(), centerVertically7, composer, 48);
                    long currentCompositeKeyHashCode10 = ComposablesKt.getCurrentCompositeKeyHashCode(composer, 0);
                    int i17 = (int) (currentCompositeKeyHashCode10 ^ (currentCompositeKeyHashCode10 >>> 32));
                    CompositionLocalMap currentCompositionLocalMap10 = composer.getCurrentCompositionLocalMap();
                    Modifier modifierMaterializeModifier10 = ComposedModifierKt.materializeModifier(composer, modifierE2);
                    Function0<ComposeUiNode> constructor10 = companion4.getConstructor();
                    if (composer.getApplier() == null) {
                        ComposablesKt.invalidApplier();
                    }
                    composer.startReusableNode();
                    if (composer.getInserting()) {
                        composer.createNode(constructor10);
                    } else {
                        composer.useNode();
                    }
                    Composer composerM4318constructorimpl10 = Updater.m4318constructorimpl(composer);
                    mr.z(companion4, composerM4318constructorimpl10, measurePolicyRowMeasurePolicy8, composerM4318constructorimpl10, currentCompositionLocalMap10);
                    Updater.m4326setimpl(composerM4318constructorimpl10, modifierMaterializeModifier10, (Function2<? super T, ? super Modifier, Unit>) id.h(companion4, composerM4318constructorimpl10, Integer.valueOf(i17), composerM4318constructorimpl10));
                    TextKt.m3048TextNvy7gAk("底部弹幕", null, companion2.m5189getWhite0d7_KjU(), null, TextUnitKt.getSp(14), null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, composer, 24966, 0, 262122);
                    SpacerKt.Spacer(SizeKt.m1069width3ABfNKs(companion, Dp.m7813constructorimpl(8.0f)), composer, 6);
                    boolean zBooleanValue2 = ((Boolean) mutableState.getValue()).booleanValue();
                    SwitchColors switchColorsA2 = zc2.a(composer);
                    Modifier modifierScale2 = ScaleKt.scale(companion, 0.85f);
                    Object objRememberedValue7 = composer.rememberedValue();
                    if (objRememberedValue7 == companion5.getEmpty()) {
                        objRememberedValue7 = new zh(24, mutableState);
                        composer.updateRememberedValue(objRememberedValue7);
                    }
                    SwitchKt.Switch(zBooleanValue2, (Function1) objRememberedValue7, modifierScale2, null, false, switchColorsA2, null, composer, 432, 88);
                    composer.endNode();
                    composer.endNode();
                    SpacerKt.Spacer(SizeKt.m1050height3ABfNKs(companion, Dp.m7813constructorimpl(12.0f)), composer, 6);
                    Modifier modifierFillMaxWidth$default2 = SizeKt.fillMaxWidth$default(companion, 0.0f, 1, null);
                    MeasurePolicy measurePolicyRowMeasurePolicy9 = RowKt.rowMeasurePolicy(arrangement.getEnd(), companion3.getTop(), composer, 6);
                    long currentCompositeKeyHashCode11 = ComposablesKt.getCurrentCompositeKeyHashCode(composer, 0);
                    int i18 = (int) (currentCompositeKeyHashCode11 ^ (currentCompositeKeyHashCode11 >>> 32));
                    CompositionLocalMap currentCompositionLocalMap11 = composer.getCurrentCompositionLocalMap();
                    Modifier modifierMaterializeModifier11 = ComposedModifierKt.materializeModifier(composer, modifierFillMaxWidth$default2);
                    Function0<ComposeUiNode> constructor11 = companion4.getConstructor();
                    if (composer.getApplier() == null) {
                        ComposablesKt.invalidApplier();
                    }
                    composer.startReusableNode();
                    if (composer.getInserting()) {
                        composer.createNode(constructor11);
                    } else {
                        composer.useNode();
                    }
                    Composer composerM4318constructorimpl11 = Updater.m4318constructorimpl(composer);
                    mr.z(companion4, composerM4318constructorimpl11, measurePolicyRowMeasurePolicy9, composerM4318constructorimpl11, currentCompositionLocalMap11);
                    Updater.m4326setimpl(composerM4318constructorimpl11, modifierMaterializeModifier11, (Function2<? super T, ? super Modifier, Unit>) id.h(companion4, composerM4318constructorimpl11, Integer.valueOf(i18), composerM4318constructorimpl11));
                    Object objRememberedValue8 = composer.rememberedValue();
                    if (objRememberedValue8 == companion5.getEmpty()) {
                        snapshotMutationPolicy = null;
                        i = 2;
                        objRememberedValue8 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Boolean.FALSE, null, 2, null);
                        composer.updateRememberedValue(objRememberedValue8);
                    } else {
                        snapshotMutationPolicy = null;
                        i = 2;
                    }
                    MutableState mutableState3 = (MutableState) objRememberedValue8;
                    Object objRememberedValue9 = composer.rememberedValue();
                    if (objRememberedValue9 == companion5.getEmpty()) {
                        objRememberedValue9 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Boolean.FALSE, snapshotMutationPolicy, i, snapshotMutationPolicy);
                        composer.updateRememberedValue(objRememberedValue9);
                    }
                    MutableState mutableState4 = (MutableState) objRememberedValue9;
                    if (((Boolean) mutableState3.getValue()).booleanValue()) {
                        i2 = 50;
                        modifierM286borderxT4_qwU = BorderKt.m286borderxT4_qwU(companion, Dp.m7813constructorimpl(2.0f), companion2.m5189getWhite0d7_KjU(), RoundedCornerShapeKt.RoundedCornerShape(50));
                    } else {
                        i2 = 50;
                        modifierM286borderxT4_qwU = companion;
                    }
                    Modifier modifierThen = companion.then(modifierM286borderxT4_qwU);
                    MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy2 = BoxKt.maybeCachedBoxMeasurePolicy(companion3.getTopStart(), false);
                    long currentCompositeKeyHashCode12 = ComposablesKt.getCurrentCompositeKeyHashCode(composer, 0);
                    int i19 = (int) (currentCompositeKeyHashCode12 ^ (currentCompositeKeyHashCode12 >>> 32));
                    CompositionLocalMap currentCompositionLocalMap12 = composer.getCurrentCompositionLocalMap();
                    Modifier modifierMaterializeModifier12 = ComposedModifierKt.materializeModifier(composer, modifierThen);
                    Function0<ComposeUiNode> constructor12 = companion4.getConstructor();
                    if (composer.getApplier() == null) {
                        ComposablesKt.invalidApplier();
                    }
                    composer.startReusableNode();
                    if (composer.getInserting()) {
                        composer.createNode(constructor12);
                    } else {
                        composer.useNode();
                    }
                    Composer composerM4318constructorimpl12 = Updater.m4318constructorimpl(composer);
                    mr.z(companion4, composerM4318constructorimpl12, measurePolicyMaybeCachedBoxMeasurePolicy2, composerM4318constructorimpl12, currentCompositionLocalMap12);
                    Updater.m4326setimpl(composerM4318constructorimpl12, modifierMaterializeModifier12, (Function2<? super T, ? super Modifier, Unit>) id.h(companion4, composerM4318constructorimpl12, Integer.valueOf(i19), composerM4318constructorimpl12));
                    Object objRememberedValue10 = composer.rememberedValue();
                    if (objRememberedValue10 == companion5.getEmpty()) {
                        objRememberedValue10 = new zh(25, mutableState3);
                        composer.updateRememberedValue(objRememberedValue10);
                    }
                    Modifier modifierOnFocusChanged = FocusChangedModifierKt.onFocusChanged(companion, (Function1) objRememberedValue10);
                    ButtonDefaults buttonDefaults = ButtonDefaults.INSTANCE;
                    ButtonKt.m8231ButtonTCVpFMg(function0, modifierOnFocusChanged, null, false, ButtonDefaults.scale$default(buttonDefaults, 1.0f, 1.0f, 0.0f, 0.0f, 0.0f, 28, null), null, null, hc2.p(false, composer, 0, 1), 0.0f, null, PaddingKt.m993PaddingValuesYgX7TsA(Dp.m7813constructorimpl(14.0f), Dp.m7813constructorimpl(6.0f)), null, ComposableLambdaKt.rememberComposableLambda(-1374830302, true, new p1(i4, mutableState3), composer, 54), composer, 0, 390, 2924);
                    composer.endNode();
                    SpacerKt.Spacer(SizeKt.m1069width3ABfNKs(companion, Dp.m7813constructorimpl(12.0f)), composer, 6);
                    Modifier modifierThen2 = companion.then(((Boolean) mutableState4.getValue()).booleanValue() ? BorderKt.m286borderxT4_qwU(companion, Dp.m7813constructorimpl(2.0f), companion2.m5189getWhite0d7_KjU(), RoundedCornerShapeKt.RoundedCornerShape(i2)) : companion);
                    MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy3 = BoxKt.maybeCachedBoxMeasurePolicy(companion3.getTopStart(), false);
                    long currentCompositeKeyHashCode13 = ComposablesKt.getCurrentCompositeKeyHashCode(composer, 0);
                    int i20 = (int) (currentCompositeKeyHashCode13 ^ (currentCompositeKeyHashCode13 >>> 32));
                    CompositionLocalMap currentCompositionLocalMap13 = composer.getCurrentCompositionLocalMap();
                    Modifier modifierMaterializeModifier13 = ComposedModifierKt.materializeModifier(composer, modifierThen2);
                    Function0<ComposeUiNode> constructor13 = companion4.getConstructor();
                    if (composer.getApplier() == null) {
                        ComposablesKt.invalidApplier();
                    }
                    composer.startReusableNode();
                    if (composer.getInserting()) {
                        composer.createNode(constructor13);
                    } else {
                        composer.useNode();
                    }
                    Composer composerM4318constructorimpl13 = Updater.m4318constructorimpl(composer);
                    mr.z(companion4, composerM4318constructorimpl13, measurePolicyMaybeCachedBoxMeasurePolicy3, composerM4318constructorimpl13, currentCompositionLocalMap13);
                    Updater.m4326setimpl(composerM4318constructorimpl13, modifierMaterializeModifier13, (Function2<? super T, ? super Modifier, Unit>) id.h(companion4, composerM4318constructorimpl13, Integer.valueOf(i20), composerM4318constructorimpl13));
                    boolean zChangedInstance2 = composer.changedInstance(coroutineScope) | composer.changed(function2) | composer.changed(function0);
                    Object objRememberedValue11 = composer.rememberedValue();
                    if (zChangedInstance2 || objRememberedValue11 == companion5.getEmpty()) {
                        objRememberedValue11 = new ih(coroutineScope, function2, function0, mutableFloatState, mutableFloatState2, mutableIntState2, mutableFloatState3, mutableIntState, mutableState2, mutableState);
                        composer.updateRememberedValue(objRememberedValue11);
                    }
                    Function0 function3 = (Function0) objRememberedValue11;
                    Object objRememberedValue12 = composer.rememberedValue();
                    if (objRememberedValue12 == companion5.getEmpty()) {
                        objRememberedValue12 = new zh(26, mutableState4);
                        composer.updateRememberedValue(objRememberedValue12);
                    }
                    ButtonKt.m8231ButtonTCVpFMg(function3, FocusChangedModifierKt.onFocusChanged(companion, (Function1) objRememberedValue12), null, false, ButtonDefaults.scale$default(buttonDefaults, 1.0f, 1.0f, 0.0f, 0.0f, 0.0f, 28, null), null, null, hc2.m(false, composer, 1), 0.0f, null, PaddingKt.m993PaddingValuesYgX7TsA(Dp.m7813constructorimpl(14.0f), Dp.m7813constructorimpl(6.0f)), null, ComposableLambdaKt.rememberComposableLambda(1672985625, true, new p1(11, mutableState4), composer, 54), composer, 0, 390, 2924);
                    composer.endNode();
                    composer.endNode();
                    composer.endNode();
                    composer.endNode();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                } else {
                    composer.skipToGroupEnd();
                }
                break;
            case 1:
                MediaSource mediaSource = (MediaSource) obj4;
                List list = (List) obj9;
                ce1 ce1Var = (ce1) obj8;
                MediaItem mediaItem = (MediaItem) obj7;
                Function0 function4 = (Function0) obj5;
                Function1 function5 = (Function1) obj12;
                Function1 function6 = (Function1) obj11;
                Function1 function7 = (Function1) obj3;
                Function0 function8 = (Function0) obj10;
                MutableIntState mutableIntState4 = (MutableIntState) obj6;
                MediaSource mediaSource2 = (MediaSource) obj;
                boolean zBooleanValue3 = ((Boolean) obj2).booleanValue();
                mediaSource2.getClass();
                if (zBooleanValue3) {
                    String id = mediaSource != null ? mediaSource.getId() : null;
                    MediaSource mediaSource3 = (MediaSource) CollectionsKt.firstOrNull(list);
                    if (Intrinsics.areEqual(id, mediaSource3 != null ? mediaSource3.getId() : null)) {
                        z = false;
                    }
                } else {
                    if (Intrinsics.areEqual(mediaSource != null ? mediaSource.getId() : null, mediaSource2.getId())) {
                        z = false;
                    }
                }
                if (zBooleanValue3) {
                    ce1Var.b(mediaItem);
                    function4.invoke();
                } else {
                    ce1Var.k(mediaItem, mediaSource2, list);
                    function5.invoke(mediaSource2.getId());
                }
                if (z) {
                    function6.invoke(null);
                    function7.invoke(null);
                }
                function8.invoke();
                u90.i0(this.e, this.g, mutableIntState4, v51.a);
                break;
            case 2:
                final u61 u61Var = (u61) obj11;
                final LazyListState lazyListState = (LazyListState) obj9;
                final SnapshotStateMap snapshotStateMap = (SnapshotStateMap) obj8;
                final SnapshotStateMap snapshotStateMap2 = (SnapshotStateMap) obj7;
                final CoroutineScope coroutineScope3 = (CoroutineScope) obj4;
                final Function2 function9 = (Function2) obj6;
                final Function1 function10 = (Function1) obj12;
                final MutableState mutableState5 = (MutableState) obj10;
                final MutableState mutableState6 = (MutableState) obj3;
                final MutableState mutableState7 = (MutableState) obj5;
                Composer composer2 = (Composer) obj;
                int iIntValue2 = ((Integer) obj2).intValue();
                if (composer2.shouldExecute((iIntValue2 & 3) != 2, iIntValue2 & 1)) {
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(820646903, iIntValue2, -1, "com.dh.myembyapp.ui.components.LibrarySortDialog.<anonymous> (LibrarySortDialog.kt:196)");
                    }
                    Modifier.Companion companion6 = Modifier.INSTANCE;
                    Modifier modifierM275backgroundbw27NRU$default2 = BackgroundKt.m275backgroundbw27NRU$default(SizeKt.fillMaxSize$default(companion6, 0.0f, 1, null), u61Var.a, null, 2, null);
                    MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy4 = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.INSTANCE.getCenter(), false);
                    long currentCompositeKeyHashCode14 = ComposablesKt.getCurrentCompositeKeyHashCode(composer2, 0);
                    int i21 = (int) (currentCompositeKeyHashCode14 ^ (currentCompositeKeyHashCode14 >>> 32));
                    CompositionLocalMap currentCompositionLocalMap14 = composer2.getCurrentCompositionLocalMap();
                    Modifier modifierMaterializeModifier14 = ComposedModifierKt.materializeModifier(composer2, modifierM275backgroundbw27NRU$default2);
                    ComposeUiNode.Companion companion7 = ComposeUiNode.INSTANCE;
                    Function0<ComposeUiNode> constructor14 = companion7.getConstructor();
                    if (composer2.getApplier() == null) {
                        ComposablesKt.invalidApplier();
                    }
                    composer2.startReusableNode();
                    if (composer2.getInserting()) {
                        composer2.createNode(constructor14);
                    } else {
                        composer2.useNode();
                    }
                    Composer composerM4318constructorimpl14 = Updater.m4318constructorimpl(composer2);
                    mr.z(companion7, composerM4318constructorimpl14, measurePolicyMaybeCachedBoxMeasurePolicy4, composerM4318constructorimpl14, currentCompositionLocalMap14);
                    Updater.m4326setimpl(composerM4318constructorimpl14, modifierMaterializeModifier14, (Function2<? super T, ? super Modifier, Unit>) id.h(companion7, composerM4318constructorimpl14, Integer.valueOf(i21), composerM4318constructorimpl14));
                    BoxScopeInstance boxScopeInstance2 = BoxScopeInstance.INSTANCE;
                    Modifier modifierM1052heightInVpY3zN4$default = SizeKt.m1052heightInVpY3zN4$default(SizeKt.m1069width3ABfNKs(companion6, Dp.m7813constructorimpl(520.0f)), 0.0f, Dp.m7813constructorimpl(560.0f), 1, null);
                    CardColors cardColorsM2119cardColorsro_MJ88 = CardDefaults.INSTANCE.m2119cardColorsro_MJ88(MaterialTheme.INSTANCE.getColorScheme(composer2, MaterialTheme.$stable).getSurface(), 0L, 0L, 0L, composer2, CardDefaults.$stable << 12, 14);
                    final MutableState mutableState8 = this.e;
                    final MutableState mutableState9 = this.g;
                    CardKt.Card(modifierM1052heightInVpY3zN4$default, null, cardColorsM2119cardColorsro_MJ88, null, null, ComposableLambdaKt.rememberComposableLambda(-1109482497, true, new Function3() { // from class: iy0
                        /* JADX WARN: Multi-variable type inference failed */
                        @Override // kotlin.jvm.functions.Function3
                        public final Object invoke(Object obj13, Object obj14, Object obj15) {
                            Modifier.Companion companion8;
                            MutableState mutableState10;
                            u61 u61Var2;
                            MaterialTheme materialTheme;
                            int i22;
                            iy0 iy0Var;
                            MutableState mutableState11;
                            Composer composer3;
                            Composer composer4 = (Composer) obj14;
                            int iIntValue3 = ((Integer) obj15).intValue();
                            ((ColumnScope) obj13).getClass();
                            if (composer4.shouldExecute((iIntValue3 & 17) != 16, iIntValue3 & 1)) {
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventStart(-1109482497, iIntValue3, -1, "com.dh.myembyapp.ui.components.LibrarySortDialog.<anonymous>.<anonymous>.<anonymous> (LibrarySortDialog.kt:208)");
                                }
                                Modifier.Companion companion9 = Modifier.INSTANCE;
                                Modifier modifierM1000paddingVpY3zN4 = PaddingKt.m1000paddingVpY3zN4(SizeKt.fillMaxWidth$default(companion9, 0.0f, 1, null), Dp.m7813constructorimpl(18.0f), Dp.m7813constructorimpl(16.0f));
                                Arrangement arrangement2 = Arrangement.INSTANCE;
                                Arrangement.HorizontalOrVertical horizontalOrVerticalM712spacedBy0680j_4 = arrangement2.m712spacedBy0680j_4(Dp.m7813constructorimpl(12.0f));
                                Alignment.Companion companion10 = Alignment.INSTANCE;
                                MeasurePolicy measurePolicyColumnMeasurePolicy2 = ColumnKt.columnMeasurePolicy(horizontalOrVerticalM712spacedBy0680j_4, companion10.getStart(), composer4, 6);
                                long currentCompositeKeyHashCode15 = ComposablesKt.getCurrentCompositeKeyHashCode(composer4, 0);
                                int i23 = (int) (currentCompositeKeyHashCode15 ^ (currentCompositeKeyHashCode15 >>> 32));
                                CompositionLocalMap currentCompositionLocalMap15 = composer4.getCurrentCompositionLocalMap();
                                Modifier modifierMaterializeModifier15 = ComposedModifierKt.materializeModifier(composer4, modifierM1000paddingVpY3zN4);
                                ComposeUiNode.Companion companion11 = ComposeUiNode.INSTANCE;
                                Function0<ComposeUiNode> constructor15 = companion11.getConstructor();
                                if (composer4.getApplier() == null) {
                                    ComposablesKt.invalidApplier();
                                }
                                composer4.startReusableNode();
                                if (composer4.getInserting()) {
                                    composer4.createNode(constructor15);
                                } else {
                                    composer4.useNode();
                                }
                                Composer composerM4318constructorimpl15 = Updater.m4318constructorimpl(composer4);
                                mr.z(companion11, composerM4318constructorimpl15, measurePolicyColumnMeasurePolicy2, composerM4318constructorimpl15, currentCompositionLocalMap15);
                                Updater.m4326setimpl(composerM4318constructorimpl15, modifierMaterializeModifier15, (Function2<? super T, ? super Modifier, Unit>) id.h(companion11, composerM4318constructorimpl15, Integer.valueOf(i23), composerM4318constructorimpl15));
                                ColumnScopeInstance columnScopeInstance2 = ColumnScopeInstance.INSTANCE;
                                Modifier modifierFillMaxWidth$default3 = SizeKt.fillMaxWidth$default(companion9, 0.0f, 1, null);
                                MeasurePolicy measurePolicyRowMeasurePolicy10 = RowKt.rowMeasurePolicy(arrangement2.getSpaceBetween(), companion10.getCenterVertically(), composer4, 54);
                                long currentCompositeKeyHashCode16 = ComposablesKt.getCurrentCompositeKeyHashCode(composer4, 0);
                                int i24 = (int) (currentCompositeKeyHashCode16 ^ (currentCompositeKeyHashCode16 >>> 32));
                                CompositionLocalMap currentCompositionLocalMap16 = composer4.getCurrentCompositionLocalMap();
                                Modifier modifierMaterializeModifier16 = ComposedModifierKt.materializeModifier(composer4, modifierFillMaxWidth$default3);
                                Function0<ComposeUiNode> constructor16 = companion11.getConstructor();
                                if (composer4.getApplier() == null) {
                                    ComposablesKt.invalidApplier();
                                }
                                composer4.startReusableNode();
                                if (composer4.getInserting()) {
                                    composer4.createNode(constructor16);
                                } else {
                                    composer4.useNode();
                                }
                                Composer composerM4318constructorimpl16 = Updater.m4318constructorimpl(composer4);
                                mr.z(companion11, composerM4318constructorimpl16, measurePolicyRowMeasurePolicy10, composerM4318constructorimpl16, currentCompositionLocalMap16);
                                Updater.m4326setimpl(composerM4318constructorimpl16, modifierMaterializeModifier16, (Function2<? super T, ? super Modifier, Unit>) id.h(companion11, composerM4318constructorimpl16, Integer.valueOf(i24), composerM4318constructorimpl16));
                                RowScopeInstance rowScopeInstance2 = RowScopeInstance.INSTANCE;
                                MaterialTheme materialTheme2 = MaterialTheme.INSTANCE;
                                int i25 = MaterialTheme.$stable;
                                TextKt.m3048TextNvy7gAk("媒体库排序", null, materialTheme2.getColorScheme(composer4, i25).getPrimary(), null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, materialTheme2.getTypography(composer4, i25).getTitleMedium(), composer4, 6, 0, 131066);
                                Composer composer5 = composer4;
                                MutableState mutableState12 = mutableState9;
                                boolean zBooleanValue4 = ((Boolean) mutableState12.getValue()).booleanValue();
                                u61 u61Var3 = u61Var;
                                if (zBooleanValue4) {
                                    composer5.startReplaceGroup(1110832718);
                                    MeasurePolicy measurePolicyRowMeasurePolicy11 = RowKt.rowMeasurePolicy(arrangement2.m712spacedBy0680j_4(Dp.m7813constructorimpl(8.0f)), companion10.getCenterVertically(), composer5, 54);
                                    long currentCompositeKeyHashCode17 = ComposablesKt.getCurrentCompositeKeyHashCode(composer5, 0);
                                    int i26 = (int) (currentCompositeKeyHashCode17 ^ (currentCompositeKeyHashCode17 >>> 32));
                                    CompositionLocalMap currentCompositionLocalMap17 = composer5.getCurrentCompositionLocalMap();
                                    Modifier modifierMaterializeModifier17 = ComposedModifierKt.materializeModifier(composer5, companion9);
                                    Function0<ComposeUiNode> constructor17 = companion11.getConstructor();
                                    if (composer5.getApplier() == null) {
                                        ComposablesKt.invalidApplier();
                                    }
                                    composer5.startReusableNode();
                                    if (composer5.getInserting()) {
                                        composer5.createNode(constructor17);
                                    } else {
                                        composer5.useNode();
                                    }
                                    Composer composerM4318constructorimpl17 = Updater.m4318constructorimpl(composer5);
                                    mr.z(companion11, composerM4318constructorimpl17, measurePolicyRowMeasurePolicy11, composerM4318constructorimpl17, currentCompositionLocalMap17);
                                    Updater.m4326setimpl(composerM4318constructorimpl17, modifierMaterializeModifier17, (Function2<? super T, ? super Modifier, Unit>) id.h(companion11, composerM4318constructorimpl17, Integer.valueOf(i26), composerM4318constructorimpl17));
                                    companion8 = companion9;
                                    ProgressIndicatorKt.m2703CircularProgressIndicator4lLiAd8(SizeKt.m1064size3ABfNKs(companion9, Dp.m7813constructorimpl(16.0f)), 0L, Dp.m7813constructorimpl(2.0f), 0L, 0, 0.0f, composer5, 390, 58);
                                    mutableState10 = mutableState12;
                                    u61Var2 = u61Var3;
                                    materialTheme = materialTheme2;
                                    i22 = i25;
                                    TextKt.m3048TextNvy7gAk("保存中", null, u61Var3.B, null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, materialTheme2.getTypography(composer5, i25).getBodySmall(), composer5, 6, 0, 131066);
                                    composer5 = composer5;
                                    composer5.endNode();
                                    composer5.endReplaceGroup();
                                } else {
                                    companion8 = companion9;
                                    mutableState10 = mutableState12;
                                    u61Var2 = u61Var3;
                                    materialTheme = materialTheme2;
                                    i22 = i25;
                                    composer5.startReplaceGroup(1111585181);
                                    composer5.endReplaceGroup();
                                }
                                composer5.endNode();
                                u61 u61Var4 = u61Var2;
                                Composer composer6 = composer5;
                                TextKt.m3048TextNvy7gAk("需要服务器支持媒体库顺序配置，部分服务器可能无法使用。", null, u61Var4.B, null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, materialTheme.getTypography(composer5, i22).getBodySmall(), composer6, 6, 0, 131066);
                                Composer composer7 = composer6;
                                MutableState mutableState13 = mutableState5;
                                if (((String) mutableState13.getValue()) != null) {
                                    composer7.startReplaceGroup(-788596333);
                                    String str = (String) mutableState13.getValue();
                                    if (str == null) {
                                        str = "";
                                    }
                                    TextStyle bodySmall = materialTheme.getTypography(composer7, i22).getBodySmall();
                                    long error = materialTheme.getColorScheme(composer7, i22).getError();
                                    mutableState11 = mutableState13;
                                    iy0Var = this;
                                    TextKt.m3048TextNvy7gAk(str, null, error, null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, bodySmall, composer7, 0, 0, 131066);
                                    composer7 = composer7;
                                    composer7.endReplaceGroup();
                                } else {
                                    iy0Var = this;
                                    mutableState11 = mutableState13;
                                    composer7.startReplaceGroup(-788353479);
                                    composer7.endReplaceGroup();
                                }
                                MutableState mutableState14 = mutableState8;
                                if (((List) mutableState14.getValue()).isEmpty()) {
                                    composer7.startReplaceGroup(-788281838);
                                    Modifier modifierM1050height3ABfNKs = SizeKt.m1050height3ABfNKs(SizeKt.fillMaxWidth$default(companion8, 0.0f, 1, null), Dp.m7813constructorimpl(160.0f));
                                    MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy5 = BoxKt.maybeCachedBoxMeasurePolicy(companion10.getCenter(), false);
                                    long currentCompositeKeyHashCode18 = ComposablesKt.getCurrentCompositeKeyHashCode(composer7, 0);
                                    int i27 = (int) (currentCompositeKeyHashCode18 ^ (currentCompositeKeyHashCode18 >>> 32));
                                    CompositionLocalMap currentCompositionLocalMap18 = composer7.getCurrentCompositionLocalMap();
                                    Modifier modifierMaterializeModifier18 = ComposedModifierKt.materializeModifier(composer7, modifierM1050height3ABfNKs);
                                    Function0<ComposeUiNode> constructor18 = companion11.getConstructor();
                                    if (composer7.getApplier() == null) {
                                        ComposablesKt.invalidApplier();
                                    }
                                    composer7.startReusableNode();
                                    if (composer7.getInserting()) {
                                        composer7.createNode(constructor18);
                                    } else {
                                        composer7.useNode();
                                    }
                                    Composer composerM4318constructorimpl18 = Updater.m4318constructorimpl(composer7);
                                    mr.z(companion11, composerM4318constructorimpl18, measurePolicyMaybeCachedBoxMeasurePolicy5, composerM4318constructorimpl18, currentCompositionLocalMap18);
                                    Updater.m4326setimpl(composerM4318constructorimpl18, modifierMaterializeModifier18, (Function2<? super T, ? super Modifier, Unit>) id.h(companion11, composerM4318constructorimpl18, Integer.valueOf(i27), composerM4318constructorimpl18));
                                    BoxScopeInstance boxScopeInstance3 = BoxScopeInstance.INSTANCE;
                                    composer3 = composer7;
                                    TextKt.m3048TextNvy7gAk("暂无可排序的媒体库", null, u61Var4.B, null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, materialTheme.getTypography(composer7, i22).getBodyMedium(), composer3, 6, 0, 131066);
                                    composer3.endNode();
                                    composer3.endReplaceGroup();
                                } else {
                                    composer7.startReplaceGroup(-787584059);
                                    Modifier modifierM1051heightInVpY3zN4 = SizeKt.m1051heightInVpY3zN4(SizeKt.fillMaxWidth$default(companion8, 0.0f, 1, null), Dp.m7813constructorimpl(200.0f), Dp.m7813constructorimpl(460.0f));
                                    Arrangement.HorizontalOrVertical horizontalOrVerticalM712spacedBy0680j_5 = arrangement2.m712spacedBy0680j_4(Dp.m7813constructorimpl(8.0f));
                                    PaddingValues paddingValuesM994PaddingValuesYgX7TsA$default = PaddingKt.m994PaddingValuesYgX7TsA$default(0.0f, Dp.m7813constructorimpl(6.0f), 1, null);
                                    boolean zChanged = composer7.changed(mutableState14);
                                    SnapshotStateMap snapshotStateMap3 = snapshotStateMap;
                                    boolean zChanged2 = zChanged | composer7.changed(snapshotStateMap3);
                                    SnapshotStateMap snapshotStateMap4 = snapshotStateMap2;
                                    boolean zChanged3 = zChanged2 | composer7.changed(snapshotStateMap4);
                                    CoroutineScope coroutineScope4 = coroutineScope3;
                                    boolean zChangedInstance3 = zChanged3 | composer7.changedInstance(coroutineScope4);
                                    Function2 function11 = function9;
                                    boolean zChangedInstance4 = zChangedInstance3 | composer7.changedInstance(function11);
                                    Function1 function12 = function10;
                                    boolean zChanged4 = zChangedInstance4 | composer7.changed(function12);
                                    Object objRememberedValue13 = composer7.rememberedValue();
                                    if (zChanged4 || objRememberedValue13 == Composer.INSTANCE.getEmpty()) {
                                        un0 un0Var = new un0(mutableState14, mutableState6, mutableState10, mutableState7, mutableState11, snapshotStateMap3, snapshotStateMap4, function12, function11, coroutineScope4);
                                        composer7.updateRememberedValue(un0Var);
                                        objRememberedValue13 = un0Var;
                                    }
                                    LazyDslKt.LazyColumn(modifierM1051heightInVpY3zN4, lazyListState, paddingValuesM994PaddingValuesYgX7TsA$default, false, horizontalOrVerticalM712spacedBy0680j_5, null, null, false, null, (Function1) objRememberedValue13, composer7, 24966, 488);
                                    composer3 = composer7;
                                    composer3.endReplaceGroup();
                                }
                                composer3.endNode();
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventEnd();
                                }
                            } else {
                                composer4.skipToGroupEnd();
                            }
                            return Unit.INSTANCE;
                        }
                    }, composer2, 54), composer2, 196614, 26);
                    composer2.endNode();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                } else {
                    composer2.skipToGroupEnd();
                }
                break;
            case 3:
                wg1 wg1Var = (wg1) obj11;
                dn1.Y((CoroutineScope) obj4, this.e, (MutableIntState) obj6, (og1) obj9, (og1) obj8, this.g, (sh1) obj7, (Function1) obj12, (on1) obj3, (Context) obj5, (MutableState) obj10, 3.0f, false, false, "确认键长按触发临时倍速", new vo(wg1Var, ((Integer) obj).intValue(), 4), new a02(((Float) obj2).floatValue(), 2, wg1Var));
                break;
            default:
                u61 u61Var2 = (u61) obj12;
                FocusRequester focusRequester = (FocusRequester) obj11;
                MutableState mutableState10 = (MutableState) obj10;
                MutableState mutableState11 = (MutableState) obj9;
                MutableState mutableState12 = (MutableState) obj8;
                MutableState mutableState13 = (MutableState) obj7;
                MutableState mutableState14 = (MutableState) obj6;
                Function0 function11 = (Function0) obj5;
                CoroutineScope coroutineScope4 = (CoroutineScope) obj4;
                q72 q72Var = (q72) obj3;
                Composer composer3 = (Composer) obj;
                int iIntValue3 = ((Integer) obj2).intValue();
                if (composer3.shouldExecute((iIntValue3 & 3) != 2, iIntValue3 & 1)) {
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(914818544, iIntValue3, -1, "com.dh.myembyapp.ui.components.ThemeSettingsDialog.<anonymous> (ThemeSettingsDialog.kt:124)");
                    }
                    ScrollState scrollStateRememberScrollState = ScrollKt.rememberScrollState(0, composer3, 0, 1);
                    Modifier.Companion companion8 = Modifier.INSTANCE;
                    Modifier modifierM275backgroundbw27NRU$default3 = BackgroundKt.m275backgroundbw27NRU$default(SizeKt.fillMaxSize$default(companion8, 0.0f, 1, null), u61Var2.a, null, 2, null);
                    MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy5 = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.INSTANCE.getCenter(), false);
                    long currentCompositeKeyHashCode15 = ComposablesKt.getCurrentCompositeKeyHashCode(composer3, 0);
                    int i22 = (int) (currentCompositeKeyHashCode15 ^ (currentCompositeKeyHashCode15 >>> 32));
                    CompositionLocalMap currentCompositionLocalMap15 = composer3.getCurrentCompositionLocalMap();
                    Modifier modifierMaterializeModifier15 = ComposedModifierKt.materializeModifier(composer3, modifierM275backgroundbw27NRU$default3);
                    ComposeUiNode.Companion companion9 = ComposeUiNode.INSTANCE;
                    Function0<ComposeUiNode> constructor15 = companion9.getConstructor();
                    if (composer3.getApplier() == null) {
                        ComposablesKt.invalidApplier();
                    }
                    composer3.startReusableNode();
                    if (composer3.getInserting()) {
                        composer3.createNode(constructor15);
                    } else {
                        composer3.useNode();
                    }
                    Composer composerM4318constructorimpl15 = Updater.m4318constructorimpl(composer3);
                    mr.z(companion9, composerM4318constructorimpl15, measurePolicyMaybeCachedBoxMeasurePolicy5, composerM4318constructorimpl15, currentCompositionLocalMap15);
                    Updater.m4326setimpl(composerM4318constructorimpl15, modifierMaterializeModifier15, (Function2<? super T, ? super Modifier, Unit>) id.h(companion9, composerM4318constructorimpl15, Integer.valueOf(i22), composerM4318constructorimpl15));
                    BoxScopeInstance boxScopeInstance3 = BoxScopeInstance.INSTANCE;
                    CardKt.Card(SizeKt.m1052heightInVpY3zN4$default(SizeKt.m1069width3ABfNKs(companion8, Dp.m7813constructorimpl(520.0f)), 0.0f, Dp.m7813constructorimpl(560.0f), 1, null), RoundedCornerShapeKt.m1312RoundedCornerShape0680j_4(Dp.m7813constructorimpl(14.0f)), CardDefaults.INSTANCE.m2119cardColorsro_MJ88(MaterialTheme.INSTANCE.getColorScheme(composer3, MaterialTheme.$stable).getSurface(), 0L, 0L, 0L, composer3, CardDefaults.$stable << 12, 14), null, null, ComposableLambdaKt.rememberComposableLambda(-857369880, true, new u91(scrollStateRememberScrollState, focusRequester, this.e, this.g, mutableState10, mutableState11, mutableState12, mutableState13, mutableState14, u61Var2, function11, coroutineScope4, q72Var), composer3, 54), composer3, 196614, 24);
                    composer3.endNode();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                } else {
                    composer3.skipToGroupEnd();
                }
                break;
        }
        return Unit.INSTANCE;
    }

    public /* synthetic */ wy(u61 u61Var, FocusRequester focusRequester, MutableState mutableState, MutableState mutableState2, MutableState mutableState3, MutableState mutableState4, MutableState mutableState5, MutableState mutableState6, MutableState mutableState7, Function0 function0, CoroutineScope coroutineScope, q72 q72Var) {
        this.c = u61Var;
        this.d = focusRequester;
        this.e = mutableState;
        this.g = mutableState2;
        this.n = mutableState3;
        this.j = mutableState4;
        this.k = mutableState5;
        this.l = mutableState6;
        this.h = mutableState7;
        this.b = function0;
        this.i = coroutineScope;
        this.m = q72Var;
    }

    public /* synthetic */ wy(wg1 wg1Var, CoroutineScope coroutineScope, MutableState mutableState, MutableIntState mutableIntState, og1 og1Var, og1 og1Var2, MutableState mutableState2, sh1 sh1Var, Function1 function1, on1 on1Var, Context context, MutableState mutableState3) {
        this.d = wg1Var;
        this.i = coroutineScope;
        this.e = mutableState;
        this.h = mutableIntState;
        this.j = og1Var;
        this.k = og1Var2;
        this.g = mutableState2;
        this.l = sh1Var;
        this.c = function1;
        this.m = on1Var;
        this.b = context;
        this.n = mutableState3;
    }

    public /* synthetic */ wy(MediaSource mediaSource, List list, ce1 ce1Var, MediaItem mediaItem, Function0 function0, Function1 function1, Function1 function2, Function1 function3, Function0 function4, MutableState mutableState, MutableState mutableState2, MutableIntState mutableIntState) {
        this.i = mediaSource;
        this.j = list;
        this.k = ce1Var;
        this.l = mediaItem;
        this.b = function0;
        this.c = function1;
        this.d = function2;
        this.m = function3;
        this.n = function4;
        this.e = mutableState;
        this.g = mutableState2;
        this.h = mutableIntState;
    }

    public /* synthetic */ wy(CoroutineScope coroutineScope, Function1 function1, MutableFloatState mutableFloatState, MutableFloatState mutableFloatState2, MutableFloatState mutableFloatState3, MutableIntState mutableIntState, MutableIntState mutableIntState2, MutableState mutableState, MutableState mutableState2, MutableState mutableState3, Function0 function0, Function1 function2) {
        this.i = coroutineScope;
        this.c = function1;
        this.j = mutableFloatState;
        this.k = mutableFloatState2;
        this.l = mutableFloatState3;
        this.h = mutableIntState;
        this.m = mutableIntState2;
        this.e = mutableState;
        this.g = mutableState2;
        this.n = mutableState3;
        this.b = function0;
        this.d = function2;
    }
}
