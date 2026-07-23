package defpackage;

import android.os.Bundle;
import android.view.View;
import androidx.collection.MutableIntIntMap;
import androidx.compose.animation.core.AnimationScope;
import androidx.compose.foundation.BackgroundKt;
import androidx.compose.foundation.BorderKt;
import androidx.compose.foundation.BorderStrokeKt;
import androidx.compose.foundation.gestures.MouseWheelScrollingLogic;
import androidx.compose.foundation.gestures.NestedScrollScope;
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
import androidx.compose.foundation.lazy.LazyItemScope;
import androidx.compose.foundation.lazy.LazyListScope;
import androidx.compose.foundation.lazy.d;
import androidx.compose.foundation.lazy.grid.LazyGridScope;
import androidx.compose.foundation.lazy.layout.LazyLayoutItemContentFactory;
import androidx.compose.foundation.lazy.layout.LazyLayoutKt;
import androidx.compose.foundation.lazy.layout.LazyLayoutPrefetchState;
import androidx.compose.foundation.lazy.layout.PrefetchScheduler;
import androidx.compose.foundation.shape.RoundedCornerShape;
import androidx.compose.foundation.shape.RoundedCornerShapeKt;
import androidx.compose.foundation.text.CoreTextFieldKt;
import androidx.compose.foundation.text.LegacyTextFieldState;
import androidx.compose.foundation.text.input.internal.selection.TextFieldSelectionState;
import androidx.compose.foundation.text.input.internal.selection.TextFieldSelectionStateKt;
import androidx.compose.foundation.text.input.internal.selection.TextFieldSelectionState_androidKt;
import androidx.compose.foundation.text.input.internal.selection.TextToolbarState;
import androidx.compose.material.icons.Icons;
import androidx.compose.material.icons.filled.CheckKt;
import androidx.compose.material3.IconKt;
import androidx.compose.material3.MaterialTheme;
import androidx.compose.material3.TextKt;
import androidx.compose.material3.internal.AnchoredDraggableState;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.DisposableEffectScope;
import androidx.compose.runtime.MutableIntState;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.State;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.focus.FocusRequester;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.ColorKt;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.layout.SubcomposeLayoutState;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.platform.SoftwareKeyboardController;
import androidx.compose.ui.text.AnnotatedString;
import androidx.compose.ui.text.JvmAnnotatedString_jvmAndAndroidKt;
import androidx.compose.ui.text.font.FontWeight;
import androidx.compose.ui.text.input.ImeOptions;
import androidx.compose.ui.text.input.TextFieldValue;
import androidx.compose.ui.text.input.TextInputService;
import androidx.compose.ui.unit.Dp;
import androidx.compose.ui.unit.TextUnitKt;

import com.dh.myembyapp.data.model.MediaItem;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.CancellationException;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.functions.Function4;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import kotlin.text.StringsKt;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Job;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class g9 implements Function1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;

    public /* synthetic */ g9(yj0 yj0Var, Function1 function1, MutableState mutableState, MutableState mutableState2) {
        this.a = 10;
        this.c = yj0Var;
        this.b = function1;
        this.d = mutableState;
        this.e = mutableState2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i = this.a;
        int i2 = 5;
        int i3 = 0;
        Object[] objArr = 0;
        Object obj2 = this.c;
        Object obj3 = this.b;
        Object obj4 = this.e;
        Object obj5 = this.d;
        switch (i) {
            case 0:
                return AnchoredDraggableState.Companion.Saver$lambda$1((Function1) obj3, (Function0) obj5, (Function0) obj4, (Function1) obj2, obj);
            case 1:
                final List list = (List) obj3;
                final String str = (String) obj2;
                final String str2 = (String) obj5;
                final MutableState mutableState = (MutableState) obj4;
                LazyListScope lazyListScope = (LazyListScope) obj;
                lazyListScope.getClass();
                final int i4 = 0;
                d.b(lazyListScope, list.size(), new jg(list, i3), null, ComposableLambdaKt.composableLambdaInstance(-854866300, true, new Function4() { // from class: kg
                    @Override // kotlin.jvm.functions.Function4
                    public final Object invoke(Object obj6, Object obj7, Object obj8, Object obj9) {
                        long jM5151copywmQWz5c$default;
                        Composer composer;
                        long jM5183getGreen0d7_KjU;
                        long jM5187getTransparent0d7_KjU;
                        Composer composer2;
                        int i5 = i4;
                        MutableState mutableState2 = mutableState;
                        String str3 = str2;
                        String str4 = str;
                        List list2 = list;
                        switch (i5) {
                            case 0:
                                int iIntValue = ((Integer) obj7).intValue();
                                Composer composer3 = (Composer) obj8;
                                int iIntValue2 = ((Integer) obj9).intValue();
                                ((LazyItemScope) obj6).getClass();
                                if ((iIntValue2 & 48) == 0) {
                                    iIntValue2 |= composer3.changed(iIntValue) ? 32 : 16;
                                }
                                if (composer3.shouldExecute((iIntValue2 & Input.Keys.NUMPAD_1) != 144, iIntValue2 & 1)) {
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventStart(-854866300, iIntValue2, -1, "com.dh.myembyapp.ui.screens.player.components.AudioSelectionOverlay.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (AudioSelection.kt:172)");
                                    }
                                    yf yfVar = (yf) list2.get(iIntValue);
                                    boolean zAreEqual = Intrinsics.areEqual(yfVar.a, str4);
                                    boolean zAreEqual2 = Intrinsics.areEqual(yfVar.a, str3);
                                    boolean z = iIntValue == pg.b(mutableState2);
                                    Modifier.Companion companion = Modifier.INSTANCE;
                                    Modifier modifierFillMaxWidth$default = SizeKt.fillMaxWidth$default(companion, 0.0f, 1, null);
                                    if (z) {
                                        jM5151copywmQWz5c$default = Color.m5151copywmQWz5c$default(Color.INSTANCE.m5189getWhite0d7_KjU(), 0.2f, 0.0f, 0.0f, 0.0f, 14, null);
                                    } else {
                                        jM5151copywmQWz5c$default = zAreEqual ? Color.m5151copywmQWz5c$default(Color.INSTANCE.m5189getWhite0d7_KjU(), 0.1f, 0.0f, 0.0f, 0.0f, 14, null) : Color.INSTANCE.m5187getTransparent0d7_KjU();
                                    }
                                    Modifier modifierM1000paddingVpY3zN4 = PaddingKt.m1000paddingVpY3zN4(BorderKt.border(kb0.v(8.0f, modifierFillMaxWidth$default, jM5151copywmQWz5c$default), z ? BorderStrokeKt.m301BorderStrokecXLIe8U(Dp.m7813constructorimpl(2.0f), Color.m5151copywmQWz5c$default(Color.INSTANCE.m5189getWhite0d7_KjU(), 0.9f, 0.0f, 0.0f, 0.0f, 14, null)) : BorderStrokeKt.m301BorderStrokecXLIe8U(Dp.m7813constructorimpl(0.0f), Color.INSTANCE.m5187getTransparent0d7_KjU()), RoundedCornerShapeKt.m1312RoundedCornerShape0680j_4(Dp.m7813constructorimpl(8.0f))), Dp.m7813constructorimpl(12.0f), Dp.m7813constructorimpl(10.0f));
                                    MeasurePolicy measurePolicyRowMeasurePolicy = RowKt.rowMeasurePolicy(Arrangement.INSTANCE.getStart(), Alignment.INSTANCE.getCenterVertically(), composer3, 48);
                                    long currentCompositeKeyHashCode = ComposablesKt.getCurrentCompositeKeyHashCode(composer3, 0);
                                    int i6 = (int) (currentCompositeKeyHashCode ^ (currentCompositeKeyHashCode >>> 32));
                                    CompositionLocalMap currentCompositionLocalMap = composer3.getCurrentCompositionLocalMap();
                                    Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(composer3, modifierM1000paddingVpY3zN4);
                                    ComposeUiNode.Companion companion2 = ComposeUiNode.INSTANCE;
                                    Function0<ComposeUiNode> constructor = companion2.getConstructor();
                                    if (composer3.getApplier() == null) {
                                        ComposablesKt.invalidApplier();
                                    }
                                    composer3.startReusableNode();
                                    if (composer3.getInserting()) {
                                        composer3.createNode(constructor);
                                    } else {
                                        composer3.useNode();
                                    }
                                    Composer composerM4318constructorimpl = Updater.m4318constructorimpl(composer3);
                                    mr.z(companion2, composerM4318constructorimpl, measurePolicyRowMeasurePolicy, composerM4318constructorimpl, currentCompositionLocalMap);
                                    Updater.m4326setimpl(composerM4318constructorimpl, modifierMaterializeModifier, (Function2<? super T, ? super Modifier, Unit>) id.h(companion2, composerM4318constructorimpl, Integer.valueOf(i6), composerM4318constructorimpl));
                                    RowScopeInstance rowScopeInstance = RowScopeInstance.INSTANCE;
                                    if (zAreEqual) {
                                        composer3.startReplaceGroup(335241393);
                                        IconKt.m2496Iconww6aTOc(CheckKt.getCheck(Icons.INSTANCE.getDefault()), (String) null, SizeKt.m1064size3ABfNKs(companion, Dp.m7813constructorimpl(20.0f)), Color.INSTANCE.m5183getGreen0d7_KjU(), composer3, 3504, 0);
                                        composer = composer3;
                                        SpacerKt.Spacer(SizeKt.m1069width3ABfNKs(companion, Dp.m7813constructorimpl(8.0f)), composer, 6);
                                        composer.endReplaceGroup();
                                    } else {
                                        composer = composer3;
                                        composer.startReplaceGroup(335626754);
                                        composer.endReplaceGroup();
                                    }
                                    String str5 = yfVar.b;
                                    if (zAreEqual2) {
                                        jM5183getGreen0d7_KjU = ColorKt.Color(4294953047L);
                                    } else {
                                        jM5183getGreen0d7_KjU = zAreEqual ? Color.INSTANCE.m5183getGreen0d7_KjU() : Color.INSTANCE.m5189getWhite0d7_KjU();
                                    }
                                    Composer composer4 = composer;
                                    TextKt.m3048TextNvy7gAk(str5, null, jM5183getGreen0d7_KjU, null, TextUnitKt.getSp(14), null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, composer4, 24576, 0, 262122);
                                    composer4.endNode();
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventEnd();
                                    }
                                } else {
                                    composer3.skipToGroupEnd();
                                }
                                break;
                            default:
                                ArrayList arrayList = (ArrayList) list2;
                                int iIntValue3 = ((Integer) obj7).intValue();
                                Composer composer5 = (Composer) obj8;
                                int iIntValue4 = ((Integer) obj9).intValue();
                                ((LazyItemScope) obj6).getClass();
                                if ((iIntValue4 & 48) == 0) {
                                    iIntValue4 |= composer5.changed(iIntValue3) ? 32 : 16;
                                }
                                int i7 = iIntValue4;
                                if (composer5.shouldExecute((i7 & Input.Keys.NUMPAD_1) != 144, i7 & 1)) {
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventStart(-1807731894, i7, -1, "com.dh.myembyapp.ui.screens.player.components.SubtitleSelectionOverlay.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (SubtitleSelection.kt:194)");
                                    }
                                    h42 h42Var = (h42) arrayList.get(iIntValue3);
                                    boolean z2 = iIntValue3 == n42.b(mutableState2);
                                    boolean zAreEqual3 = Intrinsics.areEqual(h42Var.a, str4);
                                    boolean zAreEqual4 = Intrinsics.areEqual(h42Var.a, str3);
                                    RoundedCornerShape roundedCornerShapeM1312RoundedCornerShape0680j_4 = RoundedCornerShapeKt.m1312RoundedCornerShape0680j_4(Dp.m7813constructorimpl(4.0f));
                                    Modifier.Companion companion3 = Modifier.INSTANCE;
                                    Modifier modifierFillMaxWidth$default2 = SizeKt.fillMaxWidth$default(companion3, 0.0f, 1, null);
                                    if (zAreEqual3) {
                                        composer5.startReplaceGroup(-2063543684);
                                        jM5187getTransparent0d7_KjU = Color.m5151copywmQWz5c$default(MaterialTheme.INSTANCE.getColorScheme(composer5, MaterialTheme.$stable).getPrimary(), 0.3f, 0.0f, 0.0f, 0.0f, 14, null);
                                        composer5.endReplaceGroup();
                                    } else if (z2) {
                                        composer5.startReplaceGroup(-2063541123);
                                        composer5.endReplaceGroup();
                                        jM5187getTransparent0d7_KjU = Color.m5151copywmQWz5c$default(Color.INSTANCE.m5189getWhite0d7_KjU(), 0.06f, 0.0f, 0.0f, 0.0f, 14, null);
                                    } else {
                                        composer5.startReplaceGroup(-2063539019);
                                        composer5.endReplaceGroup();
                                        jM5187getTransparent0d7_KjU = Color.INSTANCE.m5187getTransparent0d7_KjU();
                                    }
                                    Modifier modifierM1000paddingVpY3zN5 = PaddingKt.m1000paddingVpY3zN4(BorderKt.border(BackgroundKt.m274backgroundbw27NRU(modifierFillMaxWidth$default2, jM5187getTransparent0d7_KjU, roundedCornerShapeM1312RoundedCornerShape0680j_4), z2 ? BorderStrokeKt.m301BorderStrokecXLIe8U(Dp.m7813constructorimpl(2.0f), Color.INSTANCE.m5189getWhite0d7_KjU()) : BorderStrokeKt.m301BorderStrokecXLIe8U(Dp.m7813constructorimpl(0.0f), Color.INSTANCE.m5187getTransparent0d7_KjU()), roundedCornerShapeM1312RoundedCornerShape0680j_4), Dp.m7813constructorimpl(16.0f), Dp.m7813constructorimpl(12.0f));
                                    Alignment.Companion companion4 = Alignment.INSTANCE;
                                    Alignment.Vertical centerVertically = companion4.getCenterVertically();
                                    Arrangement arrangement = Arrangement.INSTANCE;
                                    MeasurePolicy measurePolicyRowMeasurePolicy2 = RowKt.rowMeasurePolicy(arrangement.getStart(), centerVertically, composer5, 48);
                                    long currentCompositeKeyHashCode2 = ComposablesKt.getCurrentCompositeKeyHashCode(composer5, 0);
                                    int i8 = (int) (currentCompositeKeyHashCode2 ^ (currentCompositeKeyHashCode2 >>> 32));
                                    CompositionLocalMap currentCompositionLocalMap2 = composer5.getCurrentCompositionLocalMap();
                                    Modifier modifierMaterializeModifier2 = ComposedModifierKt.materializeModifier(composer5, modifierM1000paddingVpY3zN5);
                                    ComposeUiNode.Companion companion5 = ComposeUiNode.INSTANCE;
                                    Function0<ComposeUiNode> constructor2 = companion5.getConstructor();
                                    if (composer5.getApplier() == null) {
                                        ComposablesKt.invalidApplier();
                                    }
                                    composer5.startReusableNode();
                                    if (composer5.getInserting()) {
                                        composer5.createNode(constructor2);
                                    } else {
                                        composer5.useNode();
                                    }
                                    Composer composerM4318constructorimpl2 = Updater.m4318constructorimpl(composer5);
                                    mr.z(companion5, composerM4318constructorimpl2, measurePolicyRowMeasurePolicy2, composerM4318constructorimpl2, currentCompositionLocalMap2);
                                    Updater.m4326setimpl(composerM4318constructorimpl2, modifierMaterializeModifier2, (Function2<? super T, ? super Modifier, Unit>) id.h(companion5, composerM4318constructorimpl2, Integer.valueOf(i8), composerM4318constructorimpl2));
                                    RowScopeInstance rowScopeInstance2 = RowScopeInstance.INSTANCE;
                                    Modifier modifierM1069width3ABfNKs = SizeKt.m1069width3ABfNKs(companion3, Dp.m7813constructorimpl(32.0f));
                                    MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(companion4.getTopStart(), false);
                                    long currentCompositeKeyHashCode3 = ComposablesKt.getCurrentCompositeKeyHashCode(composer5, 0);
                                    int i9 = (int) (currentCompositeKeyHashCode3 ^ (currentCompositeKeyHashCode3 >>> 32));
                                    CompositionLocalMap currentCompositionLocalMap3 = composer5.getCurrentCompositionLocalMap();
                                    Modifier modifierMaterializeModifier3 = ComposedModifierKt.materializeModifier(composer5, modifierM1069width3ABfNKs);
                                    Function0<ComposeUiNode> constructor3 = companion5.getConstructor();
                                    if (composer5.getApplier() == null) {
                                        ComposablesKt.invalidApplier();
                                    }
                                    composer5.startReusableNode();
                                    if (composer5.getInserting()) {
                                        composer5.createNode(constructor3);
                                    } else {
                                        composer5.useNode();
                                    }
                                    Composer composerM4318constructorimpl3 = Updater.m4318constructorimpl(composer5);
                                    mr.z(companion5, composerM4318constructorimpl3, measurePolicyMaybeCachedBoxMeasurePolicy, composerM4318constructorimpl3, currentCompositionLocalMap3);
                                    Updater.m4326setimpl(composerM4318constructorimpl3, modifierMaterializeModifier3, (Function2<? super T, ? super Modifier, Unit>) id.h(companion5, composerM4318constructorimpl3, Integer.valueOf(i9), composerM4318constructorimpl3));
                                    BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
                                    if (zAreEqual3) {
                                        composer5.startReplaceGroup(530197241);
                                        IconKt.m2496Iconww6aTOc(CheckKt.getCheck(Icons.INSTANCE.getDefault()), (String) null, SizeKt.m1064size3ABfNKs(companion3, Dp.m7813constructorimpl(24.0f)), Color.INSTANCE.m5189getWhite0d7_KjU(), composer5, 3504, 0);
                                        composer2 = composer5;
                                        composer2.endReplaceGroup();
                                    } else {
                                        composer2 = composer5;
                                        composer2.startReplaceGroup(530512418);
                                        composer2.endReplaceGroup();
                                    }
                                    composer2.endNode();
                                    Modifier modifierE = zs1.E(rowScopeInstance2, companion3, 1.0f, false, 2, null);
                                    MeasurePolicy measurePolicyColumnMeasurePolicy = ColumnKt.columnMeasurePolicy(arrangement.getTop(), companion4.getStart(), composer2, 0);
                                    long currentCompositeKeyHashCode4 = ComposablesKt.getCurrentCompositeKeyHashCode(composer2, 0);
                                    int i10 = (int) (currentCompositeKeyHashCode4 ^ (currentCompositeKeyHashCode4 >>> 32));
                                    CompositionLocalMap currentCompositionLocalMap4 = composer2.getCurrentCompositionLocalMap();
                                    Modifier modifierMaterializeModifier4 = ComposedModifierKt.materializeModifier(composer2, modifierE);
                                    Function0<ComposeUiNode> constructor4 = companion5.getConstructor();
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
                                    mr.z(companion5, composerM4318constructorimpl4, measurePolicyColumnMeasurePolicy, composerM4318constructorimpl4, currentCompositionLocalMap4);
                                    Updater.m4326setimpl(composerM4318constructorimpl4, modifierMaterializeModifier4, (Function2<? super T, ? super Modifier, Unit>) id.h(companion5, composerM4318constructorimpl4, Integer.valueOf(i10), composerM4318constructorimpl4));
                                    ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.INSTANCE;
                                    TextKt.m3048TextNvy7gAk(h42Var.b, null, zAreEqual4 ? ColorKt.Color(4294953047L) : Color.INSTANCE.m5189getWhite0d7_KjU(), null, TextUnitKt.getSp(18), null, FontWeight.INSTANCE.getMedium(), null, 0L, null, null, 0L, 0, false, 0, 0, null, null, composer2, 1597440, 0, 262058);
                                    String str6 = h42Var.c;
                                    if (str6 == null || StringsKt.isBlank(str6)) {
                                        composer2.startReplaceGroup(-953277646);
                                        composer2.endReplaceGroup();
                                    } else {
                                        composer2.startReplaceGroup(-953824455);
                                        SpacerKt.Spacer(SizeKt.m1050height3ABfNKs(companion3, Dp.m7813constructorimpl(4.0f)), composer2, 6);
                                        TextKt.m3048TextNvy7gAk(h42Var.c, null, zAreEqual4 ? Color.m5151copywmQWz5c$default(ColorKt.Color(4294953047L), 0.72f, 0.0f, 0.0f, 0.0f, 14, null) : Color.INSTANCE.m5182getGray0d7_KjU(), null, TextUnitKt.getSp(14), null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, composer2, 24576, 0, 262122);
                                        composer2.endReplaceGroup();
                                    }
                                    if (x2.m(composer2)) {
                                        ComposerKt.traceEventEnd();
                                    }
                                } else {
                                    composer5.skipToGroupEnd();
                                }
                                break;
                        }
                        return Unit.INSTANCE;
                    }
                }), 4, null);
                return Unit.INSTANCE;
            case 2:
                ch chVar = (ch) obj2;
                Function1 function1 = (Function1) obj3;
                LazyListScope lazyListScope2 = (LazyListScope) obj;
                lazyListScope2.getClass();
                List list2 = chVar.b;
                lazyListScope2.items(list2.size(), new w5(i2, new vb(i2), list2), new x5(list2, 4), ComposableLambdaKt.composableLambdaInstance(802480018, true, new oi(list2, (Set) obj5, chVar, (FocusRequester) obj4, function1, 0)));
                return Unit.INSTANCE;
            case 3:
                List list3 = (List) obj2;
                LazyListScope lazyListScope3 = (LazyListScope) obj;
                lazyListScope3.getClass();
                lazyListScope3.items(list3.size(), new w5(6, new f9(7), list3), new x5(list3, 5), ComposableLambdaKt.composableLambdaInstance(2039820996, true, new oi(list3, list3, (String) obj5, (FocusRequester) obj4, (Function1) obj3, 1)));
                return Unit.INSTANCE;
            case 4:
                return CoreTextFieldKt.CoreTextField$lambda$18$0((LegacyTextFieldState) obj3, (TextInputService) obj2, (TextFieldValue) obj5, (ImeOptions) obj4, (DisposableEffectScope) obj);
            case 5:
                ((DisposableEffectScope) obj).getClass();
                return new o2(BuildersKt__Builders_commonKt.launch$default((CoroutineScope) obj3, null, null, new ay((View) obj2, (SoftwareKeyboardController) obj5, (MutableState) obj4, null), 3, null), 3);
            case 6:
                CoroutineScope coroutineScope = (CoroutineScope) obj5;
                MutableState mutableState2 = (MutableState) obj4;
                Function1 function2 = (Function1) obj3;
                int iIntValue = ((Integer) obj).intValue();
                ((MutableIntState) obj2).setIntValue(iIntValue);
                Job job = (Job) mutableState2.getValue();
                if (job != null) {
                    Job.DefaultImpls.cancel$default(job, (CancellationException) null, 1, (Object) null);
                }
                mutableState2.setValue(BuildersKt__Builders_commonKt.launch$default(coroutineScope, null, null, new dz(function2, iIntValue, objArr == true ? 1 : 0, i3), 3, null));
                return Unit.INSTANCE;
            case 7:
                MediaItem mediaItem = (MediaItem) obj3;
                MutableState mutableState3 = (MutableState) obj5;
                MutableState mutableState4 = (MutableState) obj4;
                MediaItem mediaItem2 = (MediaItem) obj;
                mediaItem2.getClass();
                ((MutableState) obj2).setValue(Boolean.FALSE);
                mutableState3.setValue(u90.R0(mediaItem2, mediaItem != null ? mediaItem.getIndexNumber() : null, false));
                mutableState4.setValue(Boolean.TRUE);
                return Unit.INSTANCE;
            case 8:
                MutableState mutableState5 = (MutableState) obj5;
                MutableState mutableState6 = (MutableState) obj4;
                String str3 = (String) obj;
                str3.getClass();
                ((MutableState) obj2).setValue(str3);
                String str4 = (String) ((Map) obj3).get(str3);
                if (str4 != null && !Intrinsics.areEqual(str4, (String) mutableState5.getValue())) {
                    mutableState5.setValue(str4);
                }
                if (Intrinsics.areEqual((String) mutableState6.getValue(), str3)) {
                    mutableState6.setValue(null);
                }
                return Unit.INSTANCE;
            case 9:
                Function1 function3 = (Function1) obj3;
                MutableState mutableState7 = (MutableState) obj5;
                MutableState mutableState8 = (MutableState) obj4;
                String str5 = (String) obj;
                str5.getClass();
                ((MutableState) obj2).setValue(str5);
                if (Intrinsics.areEqual((String) mutableState7.getValue(), str5)) {
                    mutableState7.setValue(null);
                }
                if (Intrinsics.areEqual((String) mutableState8.getValue(), str5)) {
                    mutableState8.setValue(null);
                    function3.invoke(str5);
                }
                return Unit.INSTANCE;
            case 10:
                yj0 yj0Var = (yj0) obj2;
                ((MutableState) obj5).setValue((String) obj);
                ((MutableState) obj4).setValue(yj0Var.b);
                ((Function1) obj3).invoke(yj0Var.a.name());
                return Unit.INSTANCE;
            case 11:
                return JvmAnnotatedString_jvmAndAndroidKt.transform$lambda$0((Ref.ObjectRef) obj3, (Function3) obj2, (AnnotatedString) obj5, (MutableIntIntMap) obj4, (List) obj);
            case 12:
                return LazyLayoutKt.LazyLayout$lambda$1$2$0((LazyLayoutPrefetchState) obj3, (LazyLayoutItemContentFactory) obj2, (SubcomposeLayoutState) obj5, (PrefetchScheduler) obj4, (DisposableEffectScope) obj);
            case 13:
                uy0 uy0Var = (uy0) obj2;
                Function0 function0 = (Function0) obj5;
                Function1 function4 = (Function1) obj3;
                MutableState mutableState9 = (MutableState) obj4;
                uy0 uy0Var2 = (uy0) obj;
                uy0Var2.getClass();
                if (uy0Var2 == uy0Var) {
                    function0.invoke();
                } else {
                    function4.invoke(uy0Var2);
                }
                mutableState9.setValue(Boolean.FALSE);
                return Unit.INSTANCE;
            case 14:
                return MouseWheelScrollingLogic.animateMouseWheelScroll$lambda$0((Ref.FloatRef) obj2, (MouseWheelScrollingLogic) obj5, (NestedScrollScope) obj4, (Function1) obj3, (AnimationScope) obj);
            case 15:
                return NavControllerImpl.navigate$lambda$44((Ref.BooleanRef) obj3, (NavControllerImpl) obj2, (NavDestination) obj5, (Bundle) obj4, (NavBackStackEntry) obj);
            case 16:
                t91 t91Var = (t91) obj;
                ((MutableState) obj3).setValue(Boolean.valueOf(t91Var.getEnabled()));
                ((MutableState) obj2).setValue(t91Var.getAssrtApiToken());
                ((MutableState) obj5).setValue(t91Var.getAssrtApiProtocol());
                ((MutableState) obj4).setValue("已通过扫码导入配置（启用状态 + API Key + 协议）");
                return Unit.INSTANCE;
            case 17:
                ((DisposableEffectScope) obj).getClass();
                return new zg1((State) obj3, (State) obj2, (State) obj5, (State) obj4);
            case 18:
                List list4 = (List) obj3;
                LazyGridScope lazyGridScope = (LazyGridScope) obj;
                lazyGridScope.getClass();
                lazyGridScope.items(list4.size(), new w5(26, new qu1(10), list4), null, new x5(list4, 26), ComposableLambdaKt.composableLambdaInstance(-1117249557, true, new kx1(list4, (ks1) obj2, (MutableState) obj5, (MutableState) obj4)));
                return Unit.INSTANCE;
            case 19:
                List list5 = (List) obj2;
                String str6 = (String) obj5;
                Function1 function5 = (Function1) obj3;
                MutableState mutableState10 = (MutableState) obj4;
                LazyListScope lazyListScope4 = (LazyListScope) obj;
                lazyListScope4.getClass();
                d.a(lazyListScope4, null, null, ComposableLambdaKt.composableLambdaInstance(1459410124, true, new p8(15, str6, function5)), 3, null);
                if (list5.isEmpty()) {
                    d.a(lazyListScope4, null, null, tt.b, 3, null);
                } else {
                    lazyListScope4.items(list5.size(), new w5(28, new qu1(17), list5), new x5(list5, 28), ComposableLambdaKt.composableLambdaInstance(802480018, true, new kx1(list5, str6, function5, mutableState10)));
                }
                return Unit.INSTANCE;
            case 20:
                final ArrayList arrayList = (ArrayList) obj3;
                final String str7 = (String) obj2;
                final String str8 = (String) obj5;
                final MutableState mutableState11 = (MutableState) obj4;
                LazyListScope lazyListScope5 = (LazyListScope) obj;
                lazyListScope5.getClass();
                final int i5 = 1;
                d.b(lazyListScope5, arrayList.size(), new j42(arrayList, 0), null, ComposableLambdaKt.composableLambdaInstance(-1807731894, true, new Function4() { // from class: kg
                    @Override // kotlin.jvm.functions.Function4
                    public final Object invoke(Object obj6, Object obj7, Object obj8, Object obj9) {
                        long jM5151copywmQWz5c$default;
                        Composer composer;
                        long jM5183getGreen0d7_KjU;
                        long jM5187getTransparent0d7_KjU;
                        Composer composer2;
                        int i6 = i5;
                        MutableState mutableState12 = mutableState11;
                        String str9 = str8;
                        String str10 = str7;
                        List list6 = arrayList;
                        switch (i6) {
                            case 0:
                                int iIntValue2 = ((Integer) obj7).intValue();
                                Composer composer3 = (Composer) obj8;
                                int iIntValue3 = ((Integer) obj9).intValue();
                                ((LazyItemScope) obj6).getClass();
                                if ((iIntValue3 & 48) == 0) {
                                    iIntValue3 |= composer3.changed(iIntValue2) ? 32 : 16;
                                }
                                if (composer3.shouldExecute((iIntValue3 & Input.Keys.NUMPAD_1) != 144, iIntValue3 & 1)) {
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventStart(-854866300, iIntValue3, -1, "com.dh.myembyapp.ui.screens.player.components.AudioSelectionOverlay.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (AudioSelection.kt:172)");
                                    }
                                    yf yfVar = (yf) list6.get(iIntValue2);
                                    boolean zAreEqual = Intrinsics.areEqual(yfVar.a, str10);
                                    boolean zAreEqual2 = Intrinsics.areEqual(yfVar.a, str9);
                                    boolean z = iIntValue2 == pg.b(mutableState12);
                                    Modifier.Companion companion = Modifier.INSTANCE;
                                    Modifier modifierFillMaxWidth$default = SizeKt.fillMaxWidth$default(companion, 0.0f, 1, null);
                                    if (z) {
                                        jM5151copywmQWz5c$default = Color.m5151copywmQWz5c$default(Color.INSTANCE.m5189getWhite0d7_KjU(), 0.2f, 0.0f, 0.0f, 0.0f, 14, null);
                                    } else {
                                        jM5151copywmQWz5c$default = zAreEqual ? Color.m5151copywmQWz5c$default(Color.INSTANCE.m5189getWhite0d7_KjU(), 0.1f, 0.0f, 0.0f, 0.0f, 14, null) : Color.INSTANCE.m5187getTransparent0d7_KjU();
                                    }
                                    Modifier modifierM1000paddingVpY3zN4 = PaddingKt.m1000paddingVpY3zN4(BorderKt.border(kb0.v(8.0f, modifierFillMaxWidth$default, jM5151copywmQWz5c$default), z ? BorderStrokeKt.m301BorderStrokecXLIe8U(Dp.m7813constructorimpl(2.0f), Color.m5151copywmQWz5c$default(Color.INSTANCE.m5189getWhite0d7_KjU(), 0.9f, 0.0f, 0.0f, 0.0f, 14, null)) : BorderStrokeKt.m301BorderStrokecXLIe8U(Dp.m7813constructorimpl(0.0f), Color.INSTANCE.m5187getTransparent0d7_KjU()), RoundedCornerShapeKt.m1312RoundedCornerShape0680j_4(Dp.m7813constructorimpl(8.0f))), Dp.m7813constructorimpl(12.0f), Dp.m7813constructorimpl(10.0f));
                                    MeasurePolicy measurePolicyRowMeasurePolicy = RowKt.rowMeasurePolicy(Arrangement.INSTANCE.getStart(), Alignment.INSTANCE.getCenterVertically(), composer3, 48);
                                    long currentCompositeKeyHashCode = ComposablesKt.getCurrentCompositeKeyHashCode(composer3, 0);
                                    int i7 = (int) (currentCompositeKeyHashCode ^ (currentCompositeKeyHashCode >>> 32));
                                    CompositionLocalMap currentCompositionLocalMap = composer3.getCurrentCompositionLocalMap();
                                    Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(composer3, modifierM1000paddingVpY3zN4);
                                    ComposeUiNode.Companion companion2 = ComposeUiNode.INSTANCE;
                                    Function0<ComposeUiNode> constructor = companion2.getConstructor();
                                    if (composer3.getApplier() == null) {
                                        ComposablesKt.invalidApplier();
                                    }
                                    composer3.startReusableNode();
                                    if (composer3.getInserting()) {
                                        composer3.createNode(constructor);
                                    } else {
                                        composer3.useNode();
                                    }
                                    Composer composerM4318constructorimpl = Updater.m4318constructorimpl(composer3);
                                    mr.z(companion2, composerM4318constructorimpl, measurePolicyRowMeasurePolicy, composerM4318constructorimpl, currentCompositionLocalMap);
                                    Updater.m4326setimpl(composerM4318constructorimpl, modifierMaterializeModifier, (Function2<? super T, ? super Modifier, Unit>) id.h(companion2, composerM4318constructorimpl, Integer.valueOf(i7), composerM4318constructorimpl));
                                    RowScopeInstance rowScopeInstance = RowScopeInstance.INSTANCE;
                                    if (zAreEqual) {
                                        composer3.startReplaceGroup(335241393);
                                        IconKt.m2496Iconww6aTOc(CheckKt.getCheck(Icons.INSTANCE.getDefault()), (String) null, SizeKt.m1064size3ABfNKs(companion, Dp.m7813constructorimpl(20.0f)), Color.INSTANCE.m5183getGreen0d7_KjU(), composer3, 3504, 0);
                                        composer = composer3;
                                        SpacerKt.Spacer(SizeKt.m1069width3ABfNKs(companion, Dp.m7813constructorimpl(8.0f)), composer, 6);
                                        composer.endReplaceGroup();
                                    } else {
                                        composer = composer3;
                                        composer.startReplaceGroup(335626754);
                                        composer.endReplaceGroup();
                                    }
                                    String str11 = yfVar.b;
                                    if (zAreEqual2) {
                                        jM5183getGreen0d7_KjU = ColorKt.Color(4294953047L);
                                    } else {
                                        jM5183getGreen0d7_KjU = zAreEqual ? Color.INSTANCE.m5183getGreen0d7_KjU() : Color.INSTANCE.m5189getWhite0d7_KjU();
                                    }
                                    Composer composer4 = composer;
                                    TextKt.m3048TextNvy7gAk(str11, null, jM5183getGreen0d7_KjU, null, TextUnitKt.getSp(14), null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, composer4, 24576, 0, 262122);
                                    composer4.endNode();
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventEnd();
                                    }
                                } else {
                                    composer3.skipToGroupEnd();
                                }
                                break;
                            default:
                                ArrayList arrayList2 = (ArrayList) list6;
                                int iIntValue4 = ((Integer) obj7).intValue();
                                Composer composer5 = (Composer) obj8;
                                int iIntValue5 = ((Integer) obj9).intValue();
                                ((LazyItemScope) obj6).getClass();
                                if ((iIntValue5 & 48) == 0) {
                                    iIntValue5 |= composer5.changed(iIntValue4) ? 32 : 16;
                                }
                                int i8 = iIntValue5;
                                if (composer5.shouldExecute((i8 & Input.Keys.NUMPAD_1) != 144, i8 & 1)) {
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventStart(-1807731894, i8, -1, "com.dh.myembyapp.ui.screens.player.components.SubtitleSelectionOverlay.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (SubtitleSelection.kt:194)");
                                    }
                                    h42 h42Var = (h42) arrayList2.get(iIntValue4);
                                    boolean z2 = iIntValue4 == n42.b(mutableState12);
                                    boolean zAreEqual3 = Intrinsics.areEqual(h42Var.a, str10);
                                    boolean zAreEqual4 = Intrinsics.areEqual(h42Var.a, str9);
                                    RoundedCornerShape roundedCornerShapeM1312RoundedCornerShape0680j_4 = RoundedCornerShapeKt.m1312RoundedCornerShape0680j_4(Dp.m7813constructorimpl(4.0f));
                                    Modifier.Companion companion3 = Modifier.INSTANCE;
                                    Modifier modifierFillMaxWidth$default2 = SizeKt.fillMaxWidth$default(companion3, 0.0f, 1, null);
                                    if (zAreEqual3) {
                                        composer5.startReplaceGroup(-2063543684);
                                        jM5187getTransparent0d7_KjU = Color.m5151copywmQWz5c$default(MaterialTheme.INSTANCE.getColorScheme(composer5, MaterialTheme.$stable).getPrimary(), 0.3f, 0.0f, 0.0f, 0.0f, 14, null);
                                        composer5.endReplaceGroup();
                                    } else if (z2) {
                                        composer5.startReplaceGroup(-2063541123);
                                        composer5.endReplaceGroup();
                                        jM5187getTransparent0d7_KjU = Color.m5151copywmQWz5c$default(Color.INSTANCE.m5189getWhite0d7_KjU(), 0.06f, 0.0f, 0.0f, 0.0f, 14, null);
                                    } else {
                                        composer5.startReplaceGroup(-2063539019);
                                        composer5.endReplaceGroup();
                                        jM5187getTransparent0d7_KjU = Color.INSTANCE.m5187getTransparent0d7_KjU();
                                    }
                                    Modifier modifierM1000paddingVpY3zN5 = PaddingKt.m1000paddingVpY3zN4(BorderKt.border(BackgroundKt.m274backgroundbw27NRU(modifierFillMaxWidth$default2, jM5187getTransparent0d7_KjU, roundedCornerShapeM1312RoundedCornerShape0680j_4), z2 ? BorderStrokeKt.m301BorderStrokecXLIe8U(Dp.m7813constructorimpl(2.0f), Color.INSTANCE.m5189getWhite0d7_KjU()) : BorderStrokeKt.m301BorderStrokecXLIe8U(Dp.m7813constructorimpl(0.0f), Color.INSTANCE.m5187getTransparent0d7_KjU()), roundedCornerShapeM1312RoundedCornerShape0680j_4), Dp.m7813constructorimpl(16.0f), Dp.m7813constructorimpl(12.0f));
                                    Alignment.Companion companion4 = Alignment.INSTANCE;
                                    Alignment.Vertical centerVertically = companion4.getCenterVertically();
                                    Arrangement arrangement = Arrangement.INSTANCE;
                                    MeasurePolicy measurePolicyRowMeasurePolicy2 = RowKt.rowMeasurePolicy(arrangement.getStart(), centerVertically, composer5, 48);
                                    long currentCompositeKeyHashCode2 = ComposablesKt.getCurrentCompositeKeyHashCode(composer5, 0);
                                    int i9 = (int) (currentCompositeKeyHashCode2 ^ (currentCompositeKeyHashCode2 >>> 32));
                                    CompositionLocalMap currentCompositionLocalMap2 = composer5.getCurrentCompositionLocalMap();
                                    Modifier modifierMaterializeModifier2 = ComposedModifierKt.materializeModifier(composer5, modifierM1000paddingVpY3zN5);
                                    ComposeUiNode.Companion companion5 = ComposeUiNode.INSTANCE;
                                    Function0<ComposeUiNode> constructor2 = companion5.getConstructor();
                                    if (composer5.getApplier() == null) {
                                        ComposablesKt.invalidApplier();
                                    }
                                    composer5.startReusableNode();
                                    if (composer5.getInserting()) {
                                        composer5.createNode(constructor2);
                                    } else {
                                        composer5.useNode();
                                    }
                                    Composer composerM4318constructorimpl2 = Updater.m4318constructorimpl(composer5);
                                    mr.z(companion5, composerM4318constructorimpl2, measurePolicyRowMeasurePolicy2, composerM4318constructorimpl2, currentCompositionLocalMap2);
                                    Updater.m4326setimpl(composerM4318constructorimpl2, modifierMaterializeModifier2, (Function2<? super T, ? super Modifier, Unit>) id.h(companion5, composerM4318constructorimpl2, Integer.valueOf(i9), composerM4318constructorimpl2));
                                    RowScopeInstance rowScopeInstance2 = RowScopeInstance.INSTANCE;
                                    Modifier modifierM1069width3ABfNKs = SizeKt.m1069width3ABfNKs(companion3, Dp.m7813constructorimpl(32.0f));
                                    MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(companion4.getTopStart(), false);
                                    long currentCompositeKeyHashCode3 = ComposablesKt.getCurrentCompositeKeyHashCode(composer5, 0);
                                    int i10 = (int) (currentCompositeKeyHashCode3 ^ (currentCompositeKeyHashCode3 >>> 32));
                                    CompositionLocalMap currentCompositionLocalMap3 = composer5.getCurrentCompositionLocalMap();
                                    Modifier modifierMaterializeModifier3 = ComposedModifierKt.materializeModifier(composer5, modifierM1069width3ABfNKs);
                                    Function0<ComposeUiNode> constructor3 = companion5.getConstructor();
                                    if (composer5.getApplier() == null) {
                                        ComposablesKt.invalidApplier();
                                    }
                                    composer5.startReusableNode();
                                    if (composer5.getInserting()) {
                                        composer5.createNode(constructor3);
                                    } else {
                                        composer5.useNode();
                                    }
                                    Composer composerM4318constructorimpl3 = Updater.m4318constructorimpl(composer5);
                                    mr.z(companion5, composerM4318constructorimpl3, measurePolicyMaybeCachedBoxMeasurePolicy, composerM4318constructorimpl3, currentCompositionLocalMap3);
                                    Updater.m4326setimpl(composerM4318constructorimpl3, modifierMaterializeModifier3, (Function2<? super T, ? super Modifier, Unit>) id.h(companion5, composerM4318constructorimpl3, Integer.valueOf(i10), composerM4318constructorimpl3));
                                    BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
                                    if (zAreEqual3) {
                                        composer5.startReplaceGroup(530197241);
                                        IconKt.m2496Iconww6aTOc(CheckKt.getCheck(Icons.INSTANCE.getDefault()), (String) null, SizeKt.m1064size3ABfNKs(companion3, Dp.m7813constructorimpl(24.0f)), Color.INSTANCE.m5189getWhite0d7_KjU(), composer5, 3504, 0);
                                        composer2 = composer5;
                                        composer2.endReplaceGroup();
                                    } else {
                                        composer2 = composer5;
                                        composer2.startReplaceGroup(530512418);
                                        composer2.endReplaceGroup();
                                    }
                                    composer2.endNode();
                                    Modifier modifierE = zs1.E(rowScopeInstance2, companion3, 1.0f, false, 2, null);
                                    MeasurePolicy measurePolicyColumnMeasurePolicy = ColumnKt.columnMeasurePolicy(arrangement.getTop(), companion4.getStart(), composer2, 0);
                                    long currentCompositeKeyHashCode4 = ComposablesKt.getCurrentCompositeKeyHashCode(composer2, 0);
                                    int i11 = (int) (currentCompositeKeyHashCode4 ^ (currentCompositeKeyHashCode4 >>> 32));
                                    CompositionLocalMap currentCompositionLocalMap4 = composer2.getCurrentCompositionLocalMap();
                                    Modifier modifierMaterializeModifier4 = ComposedModifierKt.materializeModifier(composer2, modifierE);
                                    Function0<ComposeUiNode> constructor4 = companion5.getConstructor();
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
                                    mr.z(companion5, composerM4318constructorimpl4, measurePolicyColumnMeasurePolicy, composerM4318constructorimpl4, currentCompositionLocalMap4);
                                    Updater.m4326setimpl(composerM4318constructorimpl4, modifierMaterializeModifier4, (Function2<? super T, ? super Modifier, Unit>) id.h(companion5, composerM4318constructorimpl4, Integer.valueOf(i11), composerM4318constructorimpl4));
                                    ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.INSTANCE;
                                    TextKt.m3048TextNvy7gAk(h42Var.b, null, zAreEqual4 ? ColorKt.Color(4294953047L) : Color.INSTANCE.m5189getWhite0d7_KjU(), null, TextUnitKt.getSp(18), null, FontWeight.INSTANCE.getMedium(), null, 0L, null, null, 0L, 0, false, 0, 0, null, null, composer2, 1597440, 0, 262058);
                                    String str12 = h42Var.c;
                                    if (str12 == null || StringsKt.isBlank(str12)) {
                                        composer2.startReplaceGroup(-953277646);
                                        composer2.endReplaceGroup();
                                    } else {
                                        composer2.startReplaceGroup(-953824455);
                                        SpacerKt.Spacer(SizeKt.m1050height3ABfNKs(companion3, Dp.m7813constructorimpl(4.0f)), composer2, 6);
                                        TextKt.m3048TextNvy7gAk(h42Var.c, null, zAreEqual4 ? Color.m5151copywmQWz5c$default(ColorKt.Color(4294953047L), 0.72f, 0.0f, 0.0f, 0.0f, 14, null) : Color.INSTANCE.m5182getGray0d7_KjU(), null, TextUnitKt.getSp(14), null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, composer2, 24576, 0, 262122);
                                        composer2.endReplaceGroup();
                                    }
                                    if (x2.m(composer2)) {
                                        ComposerKt.traceEventEnd();
                                    }
                                } else {
                                    composer5.skipToGroupEnd();
                                }
                                break;
                        }
                        return Unit.INSTANCE;
                    }
                }), 4, null);
                return Unit.INSTANCE;
            case 21:
                return TextFieldSelectionStateKt.contextMenuBuilder$lambda$0((State) obj3, (ContextMenuState) obj2, (Function2) obj5, (TextFieldSelectionState) obj4, (ContextMenuScope) obj);
            default:
                return TextFieldSelectionState_androidKt.addBasicTextFieldTextContextMenuComponents$lambda$0$textFieldItem$0((Function0) obj5, (Function0) obj4, (TextFieldSelectionState) obj3, (TextToolbarState) obj2, (TextContextMenuSession) obj);
        }
    }

    public /* synthetic */ g9(int i, Object obj, Object obj2, Object obj3, Object obj4) {
        this.a = i;
        this.b = obj;
        this.c = obj2;
        this.d = obj3;
        this.e = obj4;
    }

    public /* synthetic */ g9(Object obj, Object obj2, Object obj3, Function1 function1, int i) {
        this.a = i;
        this.c = obj;
        this.d = obj2;
        this.e = obj3;
        this.b = function1;
    }

    public /* synthetic */ g9(Object obj, Object obj2, Function1 function1, MutableState mutableState, int i) {
        this.a = i;
        this.c = obj;
        this.d = obj2;
        this.b = function1;
        this.e = mutableState;
    }

    public /* synthetic */ g9(Function0 function0, Function0 function1, TextFieldSelectionState textFieldSelectionState, TextToolbarState textToolbarState) {
        this.a = 22;
        this.d = function0;
        this.e = function1;
        this.b = textFieldSelectionState;
        this.c = textToolbarState;
    }

    public /* synthetic */ g9(Function0 function0, Function1 function1, Function1 function2, Function0 function3) {
        this.a = 0;
        this.b = function1;
        this.d = function0;
        this.e = function3;
        this.c = function2;
    }
}
