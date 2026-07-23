package defpackage;

import androidx.compose.foundation.BackgroundKt;
import androidx.compose.foundation.BorderStrokeKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.lazy.LazyDslKt;
import androidx.compose.foundation.lazy.LazyItemScope;
import androidx.compose.foundation.lazy.LazyListScope;
import androidx.compose.foundation.lazy.LazyListState;
import androidx.compose.foundation.lazy.LazyListStateKt;
import androidx.compose.foundation.lazy.d;
import androidx.compose.foundation.shape.RoundedCornerShape;
import androidx.compose.foundation.shape.RoundedCornerShapeKt;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.focus.FocusChangedModifierKt;
import androidx.compose.ui.focus.FocusRequester;
import androidx.compose.ui.focus.FocusRequesterModifierKt;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.input.key.KeyInputModifierKt;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.unit.Dp;
import androidx.media3.exoplayer.RendererCapabilities;

import com.dh.myembyapp.data.DecoderSettings;
import java.util.ArrayList;
import java.util.List;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.ranges.RangesKt;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: loaded from: classes4.dex */
public abstract class m20 {
    public static final void a(final String str, final String str2, final boolean z, final boolean z2, Function1 function1, final Function1 function2, final Function1 function3, final Function1 function4, Function0 function0, Composer composer, int i) {
        Function1 function5;
        int i2;
        Object obj;
        int i3;
        Object obj2;
        Object obj3;
        int i4;
        List list;
        MutableState mutableState;
        str.getClass();
        function1.getClass();
        function2.getClass();
        function3.getClass();
        function4.getClass();
        function0.getClass();
        Composer composerStartRestartGroup = composer.startRestartGroup(-1098962900);
        int i5 = (i & 6) == 0 ? (composerStartRestartGroup.changed(str) ? 4 : 2) | i : i;
        if ((i & 48) == 0) {
            i5 |= composerStartRestartGroup.changed(str2) ? 32 : 16;
        }
        if ((i & RendererCapabilities.DECODER_SUPPORT_MASK) == 0) {
            i5 |= composerStartRestartGroup.changed(z) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i5 |= composerStartRestartGroup.changed(z2) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i5 |= composerStartRestartGroup.changed(0) ? 16384 : 8192;
        }
        if ((196608 & i) == 0) {
            function5 = function1;
            i5 |= composerStartRestartGroup.changedInstance(function5) ? 131072 : 65536;
        } else {
            function5 = function1;
        }
        if ((i & 1572864) == 0) {
            i5 |= composerStartRestartGroup.changedInstance(function2) ? 1048576 : 524288;
        }
        if ((i & 12582912) == 0) {
            i5 |= composerStartRestartGroup.changedInstance(function3) ? 8388608 : 4194304;
        }
        if ((i & 100663296) == 0) {
            i5 |= composerStartRestartGroup.changedInstance(function4) ? 67108864 : GroupFlagsKt.HasAuxSlotFlag;
        }
        if ((i & 805306368) == 0) {
            i5 |= composerStartRestartGroup.changedInstance(function0) ? 536870912 : 268435456;
        }
        if (composerStartRestartGroup.shouldExecute((i5 & 306783379) != 306783378, i5 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1098962900, i5, -1, "com.dh.myembyapp.ui.screens.player.components.DecoderSelectionOverlay (DecoderSelectionOverlay.kt:64)");
            }
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                ArrayList arrayList = new ArrayList(6);
                for (int i6 = 0; i6 < 6; i6++) {
                    arrayList.add(new FocusRequester());
                }
                i2 = 1;
                composerStartRestartGroup.updateRememberedValue(arrayList);
                obj = arrayList;
            } else {
                i2 = 1;
                obj = objRememberedValue;
            }
            final List list2 = (List) obj;
            Object objRememberedValue2 = composerStartRestartGroup.rememberedValue();
            Composer.Companion companion = Composer.INSTANCE;
            if (objRememberedValue2 == companion.getEmpty()) {
                i3 = 3;
                Integer[] numArr = new Integer[6];
                numArr[0] = 2;
                numArr[i2] = 3;
                numArr[2] = 4;
                numArr[3] = 7;
                numArr[4] = 8;
                numArr[5] = 11;
                objRememberedValue2 = CollectionsKt.listOf((Object[]) numArr);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
            } else {
                i3 = 3;
            }
            List list3 = (List) objRememberedValue2;
            Object objRememberedValue3 = composerStartRestartGroup.rememberedValue();
            if (objRememberedValue3 == companion.getEmpty()) {
                Pair pair = TuplesKt.to("auto", "自动");
                Pair pair2 = TuplesKt.to(DecoderSettings.DECODER_MODE_HARDWARE, "硬解码 (HW/GPU)");
                Pair pair3 = TuplesKt.to(DecoderSettings.DECODER_MODE_SOFTWARE, "软解码 (SW/CPU)");
                Pair[] pairArr = new Pair[i3];
                pairArr[0] = pair;
                pairArr[i2] = pair2;
                pairArr[2] = pair3;
                objRememberedValue3 = CollectionsKt.listOf((Object[]) pairArr);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
            }
            final List list4 = (List) objRememberedValue3;
            int i7 = (composerStartRestartGroup.changed(list2.size()) ? 1 : 0) | ((57344 & i5) == 16384 ? i2 : 0);
            Object objRememberedValue4 = composerStartRestartGroup.rememberedValue();
            if (i7 != 0 || objRememberedValue4 == companion.getEmpty()) {
                objRememberedValue4 = Integer.valueOf(RangesKt.coerceIn(0, 0, CollectionsKt.getLastIndex(list2)));
                composerStartRestartGroup.updateRememberedValue(objRememberedValue4);
            }
            int iIntValue = ((Number) objRememberedValue4).intValue();
            Object objRememberedValue5 = composerStartRestartGroup.rememberedValue();
            if (objRememberedValue5 == companion.getEmpty()) {
                objRememberedValue5 = mr.l(iIntValue, null, 2, null, composerStartRestartGroup);
            }
            final MutableState mutableState2 = (MutableState) objRememberedValue5;
            LazyListState lazyListStateRememberLazyListState = LazyListStateKt.rememberLazyListState(0, 0, composerStartRestartGroup, 0, 3);
            Integer numValueOf = Integer.valueOf(iIntValue);
            boolean zChanged = composerStartRestartGroup.changed(iIntValue);
            Object objRememberedValue6 = composerStartRestartGroup.rememberedValue();
            if (zChanged || objRememberedValue6 == companion.getEmpty()) {
                obj2 = null;
                objRememberedValue6 = new j20(iIntValue, mutableState2, (Continuation) null);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue6);
            } else {
                obj2 = null;
            }
            EffectsKt.LaunchedEffect(numValueOf, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) objRememberedValue6, composerStartRestartGroup, 0);
            Modifier.Companion companion2 = Modifier.INSTANCE;
            Modifier modifierFillMaxSize$default = SizeKt.fillMaxSize$default(companion2, 0.0f, i2, obj2);
            boolean zChangedInstance = ((1879048192 & i5) == 536870912) | composerStartRestartGroup.changedInstance(list2);
            Object objRememberedValue7 = composerStartRestartGroup.rememberedValue();
            if (zChangedInstance || objRememberedValue7 == companion.getEmpty()) {
                objRememberedValue7 = new k20(function0, list2, mutableState2);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue7);
            }
            Modifier modifierOnPreviewKeyEvent = KeyInputModifierKt.onPreviewKeyEvent(modifierFillMaxSize$default, (Function1) objRememberedValue7);
            MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.INSTANCE.getCenterEnd(), false);
            long currentCompositeKeyHashCode = ComposablesKt.getCurrentCompositeKeyHashCode(composerStartRestartGroup, 0);
            int i8 = (int) (currentCompositeKeyHashCode ^ (currentCompositeKeyHashCode >>> 32));
            CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifierOnPreviewKeyEvent);
            ComposeUiNode.Companion companion3 = ComposeUiNode.INSTANCE;
            Function0<ComposeUiNode> constructor = companion3.getConstructor();
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
            mr.z(companion3, composerM4318constructorimpl, measurePolicyMaybeCachedBoxMeasurePolicy, composerM4318constructorimpl, currentCompositionLocalMap);
            Updater.m4326setimpl(composerM4318constructorimpl, modifierMaterializeModifier, (Function2<? super T, ? super Modifier, Unit>) id.h(companion3, composerM4318constructorimpl, Integer.valueOf(i8), composerM4318constructorimpl));
            BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
            Modifier modifierM999padding3ABfNKs = PaddingKt.m999padding3ABfNKs(BackgroundKt.m274backgroundbw27NRU(PaddingKt.m1003paddingqDBjuR0$default(SizeKt.fillMaxHeight$default(SizeKt.m1069width3ABfNKs(companion2, Dp.m7813constructorimpl(340.0f)), 0.0f, 1, null), 0.0f, Dp.m7813constructorimpl(24.0f), Dp.m7813constructorimpl(24.0f), Dp.m7813constructorimpl(24.0f), 1, null), tg1.a, tg1.b), Dp.m7813constructorimpl(24.0f));
            Arrangement.HorizontalOrVertical horizontalOrVerticalM712spacedBy0680j_4 = Arrangement.INSTANCE.m712spacedBy0680j_4(Dp.m7813constructorimpl(12.0f));
            boolean zChangedInstance2 = composerStartRestartGroup.changedInstance(list4) | ((i5 & 14) == 4) | composerStartRestartGroup.changedInstance(list2) | ((458752 & i5) == 131072) | ((i5 & Input.Keys.FORWARD_DEL) == 32) | ((3670016 & i5) == 1048576) | ((29360128 & i5) == 8388608) | ((i5 & 896) == 256) | ((234881024 & i5) == 67108864) | ((i5 & 7168) == 2048);
            Object objRememberedValue8 = composerStartRestartGroup.rememberedValue();
            if (zChangedInstance2 || objRememberedValue8 == companion.getEmpty()) {
                final Function1 function6 = function5;
                i4 = 0;
                obj3 = new Function1() { // from class: d20
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj4) {
                        LazyListScope lazyListScope = (LazyListScope) obj4;
                        lazyListScope.getClass();
                        d.a(lazyListScope, null, null, at.a, 3, null);
                        d.a(lazyListScope, null, null, at.b, 3, null);
                        List list5 = list4;
                        int size = list5.size();
                        String str3 = str;
                        final List list6 = list2;
                        Function1 function7 = function6;
                        final MutableState mutableState3 = mutableState2;
                        d.b(lazyListScope, size, null, null, ComposableLambdaKt.composableLambdaInstance(744178952, true, new w21(list5, str3, list6, function7, mutableState3)), 6, null);
                        d.a(lazyListScope, null, null, at.c, 3, null);
                        d.a(lazyListScope, null, null, at.d, 3, null);
                        d.a(lazyListScope, null, null, ComposableLambdaKt.composableLambdaInstance(-1343606281, true, new f20(0, str2, list6, function2, mutableState3)), 3, null);
                        final int i9 = 0;
                        final Function1 function8 = function3;
                        final boolean z3 = z;
                        d.a(lazyListScope, null, null, ComposableLambdaKt.composableLambdaInstance(1497035734, true, new Function3() { // from class: g20
                            @Override // kotlin.jvm.functions.Function3
                            public final Object invoke(Object obj5, Object obj6, Object obj7) {
                                int i10 = i9;
                                MutableState mutableState4 = mutableState3;
                                boolean z4 = z3;
                                Function1 function9 = function8;
                                List list7 = list6;
                                int i11 = 1;
                                switch (i10) {
                                    case 0:
                                        Composer composer2 = (Composer) obj6;
                                        int iIntValue2 = ((Integer) obj7).intValue();
                                        ((LazyItemScope) obj5).getClass();
                                        if (composer2.shouldExecute((iIntValue2 & 17) != 16, iIntValue2 & 1)) {
                                            if (ComposerKt.isTraceInProgress()) {
                                                ComposerKt.traceEventStart(1497035734, iIntValue2, -1, "com.dh.myembyapp.ui.screens.player.components.DecoderSelectionOverlay.<anonymous>.<anonymous>.<anonymous>.<anonymous> (DecoderSelectionOverlay.kt:318)");
                                            }
                                            Modifier modifierFocusRequester = FocusRequesterModifierKt.focusRequester(SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null), (FocusRequester) list7.get(4));
                                            Object objRememberedValue9 = composer2.rememberedValue();
                                            Composer.Companion companion4 = Composer.INSTANCE;
                                            if (objRememberedValue9 == companion4.getEmpty()) {
                                                objRememberedValue9 = new u00(i11, mutableState4);
                                                composer2.updateRememberedValue(objRememberedValue9);
                                            }
                                            Modifier modifierOnFocusChanged = FocusChangedModifierKt.onFocusChanged(modifierFocusRequester, (Function1) objRememberedValue9);
                                            ClickableSurfaceDefaults clickableSurfaceDefaults = ClickableSurfaceDefaults.INSTANCE;
                                            RoundedCornerShape roundedCornerShapeM1312RoundedCornerShape0680j_4 = RoundedCornerShapeKt.m1312RoundedCornerShape0680j_4(Dp.m7813constructorimpl(8.0f));
                                            int i12 = ClickableSurfaceDefaults.$stable;
                                            int i13 = i12 << 15;
                                            ClickableSurfaceShape clickableSurfaceShapeShape = clickableSurfaceDefaults.shape(roundedCornerShapeM1312RoundedCornerShape0680j_4, null, null, null, null, composer2, i13, 30);
                                            long jM5151copywmQWz5c$default = m20.b(mutableState4) == 4 ? Color.m5151copywmQWz5c$default(Color.INSTANCE.m5189getWhite0d7_KjU(), 0.2f, 0.0f, 0.0f, 0.0f, 14, null) : Color.INSTANCE.m5187getTransparent0d7_KjU();
                                            Color.Companion companion5 = Color.INSTANCE;
                                            ClickableSurfaceColors clickableSurfaceColorsM8292colorsoq7We08 = clickableSurfaceDefaults.m8292colorsoq7We08(jM5151copywmQWz5c$default, 0L, Color.m5151copywmQWz5c$default(companion5.m5189getWhite0d7_KjU(), 0.3f, 0.0f, 0.0f, 0.0f, 14, null), 0L, 0L, 0L, 0L, 0L, composer2, (i12 << 24) | RendererCapabilities.DECODER_SUPPORT_MASK, 250);
                                            ClickableSurfaceBorder clickableSurfaceBorderBorder = clickableSurfaceDefaults.border(null, new Border(BorderStrokeKt.m301BorderStrokecXLIe8U(Dp.m7813constructorimpl(2.0f), Color.m5151copywmQWz5c$default(companion5.m5189getWhite0d7_KjU(), 0.9f, 0.0f, 0.0f, 0.0f, 14, null)), 0.0f, null, 6, null), null, null, null, composer2, i13 | 48, 29);
                                            ClickableSurfaceScale clickableSurfaceScaleScale$default = ClickableSurfaceDefaults.scale$default(clickableSurfaceDefaults, 0.0f, 1.05f, 0.0f, 0.0f, 0.0f, 29, null);
                                            boolean zChanged2 = composer2.changed(function9) | composer2.changed(z4);
                                            Object objRememberedValue10 = composer2.rememberedValue();
                                            if (zChanged2 || objRememberedValue10 == companion4.getEmpty()) {
                                                objRememberedValue10 = new jp(4, z4, function9);
                                                composer2.updateRememberedValue(objRememberedValue10);
                                            }
                                            SurfaceKt.m8520Surface05tvjtU((Function0) objRememberedValue10, modifierOnFocusChanged, null, false, 0.0f, clickableSurfaceShapeShape, clickableSurfaceColorsM8292colorsoq7We08, clickableSurfaceScaleScale$default, clickableSurfaceBorderBorder, null, null, ComposableLambdaKt.rememberComposableLambda(-1182227659, true, new g2(z4, 2), composer2, 54), composer2, 0, 48, 1564);
                                            if (ComposerKt.isTraceInProgress()) {
                                                ComposerKt.traceEventEnd();
                                            }
                                        } else {
                                            composer2.skipToGroupEnd();
                                        }
                                        break;
                                    default:
                                        Composer composer3 = (Composer) obj6;
                                        int iIntValue3 = ((Integer) obj7).intValue();
                                        ((LazyItemScope) obj5).getClass();
                                        if (composer3.shouldExecute((iIntValue3 & 17) != 16, iIntValue3 & 1)) {
                                            if (ComposerKt.isTraceInProgress()) {
                                                ComposerKt.traceEventStart(1429027187, iIntValue3, -1, "com.dh.myembyapp.ui.screens.player.components.DecoderSelectionOverlay.<anonymous>.<anonymous>.<anonymous>.<anonymous> (DecoderSelectionOverlay.kt:417)");
                                            }
                                            Modifier modifierFocusRequester2 = FocusRequesterModifierKt.focusRequester(SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null), (FocusRequester) list7.get(5));
                                            Object objRememberedValue11 = composer3.rememberedValue();
                                            Composer.Companion companion6 = Composer.INSTANCE;
                                            int i14 = 3;
                                            if (objRememberedValue11 == companion6.getEmpty()) {
                                                objRememberedValue11 = new u00(i14, mutableState4);
                                                composer3.updateRememberedValue(objRememberedValue11);
                                            }
                                            Modifier modifierOnFocusChanged2 = FocusChangedModifierKt.onFocusChanged(modifierFocusRequester2, (Function1) objRememberedValue11);
                                            ClickableSurfaceDefaults clickableSurfaceDefaults2 = ClickableSurfaceDefaults.INSTANCE;
                                            RoundedCornerShape roundedCornerShapeM1312RoundedCornerShape0680j_5 = RoundedCornerShapeKt.m1312RoundedCornerShape0680j_4(Dp.m7813constructorimpl(8.0f));
                                            int i15 = ClickableSurfaceDefaults.$stable;
                                            int i16 = i15 << 15;
                                            ClickableSurfaceShape clickableSurfaceShapeShape2 = clickableSurfaceDefaults2.shape(roundedCornerShapeM1312RoundedCornerShape0680j_5, null, null, null, null, composer3, i16, 30);
                                            long jM5151copywmQWz5c$default2 = m20.b(mutableState4) == 5 ? Color.m5151copywmQWz5c$default(Color.INSTANCE.m5189getWhite0d7_KjU(), 0.2f, 0.0f, 0.0f, 0.0f, 14, null) : Color.INSTANCE.m5187getTransparent0d7_KjU();
                                            Color.Companion companion7 = Color.INSTANCE;
                                            ClickableSurfaceColors clickableSurfaceColorsM8292colorsoq7We09 = clickableSurfaceDefaults2.m8292colorsoq7We08(jM5151copywmQWz5c$default2, 0L, Color.m5151copywmQWz5c$default(companion7.m5189getWhite0d7_KjU(), 0.3f, 0.0f, 0.0f, 0.0f, 14, null), 0L, 0L, 0L, 0L, 0L, composer3, (i15 << 24) | RendererCapabilities.DECODER_SUPPORT_MASK, 250);
                                            ClickableSurfaceBorder clickableSurfaceBorderBorder2 = clickableSurfaceDefaults2.border(null, new Border(BorderStrokeKt.m301BorderStrokecXLIe8U(Dp.m7813constructorimpl(2.0f), Color.m5151copywmQWz5c$default(companion7.m5189getWhite0d7_KjU(), 0.9f, 0.0f, 0.0f, 0.0f, 14, null)), 0.0f, null, 6, null), null, null, null, composer3, i16 | 48, 29);
                                            ClickableSurfaceScale clickableSurfaceScaleScale$default2 = ClickableSurfaceDefaults.scale$default(clickableSurfaceDefaults2, 0.0f, 1.05f, 0.0f, 0.0f, 0.0f, 29, null);
                                            boolean zChanged3 = composer3.changed(function9) | composer3.changed(z4);
                                            Object objRememberedValue12 = composer3.rememberedValue();
                                            if (zChanged3 || objRememberedValue12 == companion6.getEmpty()) {
                                                objRememberedValue12 = new jp(3, z4, function9);
                                                composer3.updateRememberedValue(objRememberedValue12);
                                            }
                                            SurfaceKt.m8520Surface05tvjtU((Function0) objRememberedValue12, modifierOnFocusChanged2, null, false, 0.0f, clickableSurfaceShapeShape2, clickableSurfaceColorsM8292colorsoq7We09, clickableSurfaceScaleScale$default2, clickableSurfaceBorderBorder2, null, null, ComposableLambdaKt.rememberComposableLambda(-1250236206, true, new g2(z4, i11), composer3, 54), composer3, 0, 48, 1564);
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
                        }), 3, null);
                        d.a(lazyListScope, null, null, at.e, 3, null);
                        d.a(lazyListScope, null, null, at.f, 3, null);
                        final int i10 = 1;
                        final Function1 function9 = function4;
                        final boolean z4 = z2;
                        d.a(lazyListScope, null, null, ComposableLambdaKt.composableLambdaInstance(1429027187, true, new Function3() { // from class: g20
                            @Override // kotlin.jvm.functions.Function3
                            public final Object invoke(Object obj5, Object obj6, Object obj7) {
                                int i11 = i10;
                                MutableState mutableState4 = mutableState3;
                                boolean z5 = z4;
                                Function1 function10 = function9;
                                List list7 = list6;
                                int i12 = 1;
                                switch (i11) {
                                    case 0:
                                        Composer composer2 = (Composer) obj6;
                                        int iIntValue2 = ((Integer) obj7).intValue();
                                        ((LazyItemScope) obj5).getClass();
                                        if (composer2.shouldExecute((iIntValue2 & 17) != 16, iIntValue2 & 1)) {
                                            if (ComposerKt.isTraceInProgress()) {
                                                ComposerKt.traceEventStart(1497035734, iIntValue2, -1, "com.dh.myembyapp.ui.screens.player.components.DecoderSelectionOverlay.<anonymous>.<anonymous>.<anonymous>.<anonymous> (DecoderSelectionOverlay.kt:318)");
                                            }
                                            Modifier modifierFocusRequester = FocusRequesterModifierKt.focusRequester(SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null), (FocusRequester) list7.get(4));
                                            Object objRememberedValue9 = composer2.rememberedValue();
                                            Composer.Companion companion4 = Composer.INSTANCE;
                                            if (objRememberedValue9 == companion4.getEmpty()) {
                                                objRememberedValue9 = new u00(i12, mutableState4);
                                                composer2.updateRememberedValue(objRememberedValue9);
                                            }
                                            Modifier modifierOnFocusChanged = FocusChangedModifierKt.onFocusChanged(modifierFocusRequester, (Function1) objRememberedValue9);
                                            ClickableSurfaceDefaults clickableSurfaceDefaults = ClickableSurfaceDefaults.INSTANCE;
                                            RoundedCornerShape roundedCornerShapeM1312RoundedCornerShape0680j_4 = RoundedCornerShapeKt.m1312RoundedCornerShape0680j_4(Dp.m7813constructorimpl(8.0f));
                                            int i13 = ClickableSurfaceDefaults.$stable;
                                            int i14 = i13 << 15;
                                            ClickableSurfaceShape clickableSurfaceShapeShape = clickableSurfaceDefaults.shape(roundedCornerShapeM1312RoundedCornerShape0680j_4, null, null, null, null, composer2, i14, 30);
                                            long jM5151copywmQWz5c$default = m20.b(mutableState4) == 4 ? Color.m5151copywmQWz5c$default(Color.INSTANCE.m5189getWhite0d7_KjU(), 0.2f, 0.0f, 0.0f, 0.0f, 14, null) : Color.INSTANCE.m5187getTransparent0d7_KjU();
                                            Color.Companion companion5 = Color.INSTANCE;
                                            ClickableSurfaceColors clickableSurfaceColorsM8292colorsoq7We08 = clickableSurfaceDefaults.m8292colorsoq7We08(jM5151copywmQWz5c$default, 0L, Color.m5151copywmQWz5c$default(companion5.m5189getWhite0d7_KjU(), 0.3f, 0.0f, 0.0f, 0.0f, 14, null), 0L, 0L, 0L, 0L, 0L, composer2, (i13 << 24) | RendererCapabilities.DECODER_SUPPORT_MASK, 250);
                                            ClickableSurfaceBorder clickableSurfaceBorderBorder = clickableSurfaceDefaults.border(null, new Border(BorderStrokeKt.m301BorderStrokecXLIe8U(Dp.m7813constructorimpl(2.0f), Color.m5151copywmQWz5c$default(companion5.m5189getWhite0d7_KjU(), 0.9f, 0.0f, 0.0f, 0.0f, 14, null)), 0.0f, null, 6, null), null, null, null, composer2, i14 | 48, 29);
                                            ClickableSurfaceScale clickableSurfaceScaleScale$default = ClickableSurfaceDefaults.scale$default(clickableSurfaceDefaults, 0.0f, 1.05f, 0.0f, 0.0f, 0.0f, 29, null);
                                            boolean zChanged2 = composer2.changed(function10) | composer2.changed(z5);
                                            Object objRememberedValue10 = composer2.rememberedValue();
                                            if (zChanged2 || objRememberedValue10 == companion4.getEmpty()) {
                                                objRememberedValue10 = new jp(4, z5, function10);
                                                composer2.updateRememberedValue(objRememberedValue10);
                                            }
                                            SurfaceKt.m8520Surface05tvjtU((Function0) objRememberedValue10, modifierOnFocusChanged, null, false, 0.0f, clickableSurfaceShapeShape, clickableSurfaceColorsM8292colorsoq7We08, clickableSurfaceScaleScale$default, clickableSurfaceBorderBorder, null, null, ComposableLambdaKt.rememberComposableLambda(-1182227659, true, new g2(z5, 2), composer2, 54), composer2, 0, 48, 1564);
                                            if (ComposerKt.isTraceInProgress()) {
                                                ComposerKt.traceEventEnd();
                                            }
                                        } else {
                                            composer2.skipToGroupEnd();
                                        }
                                        break;
                                    default:
                                        Composer composer3 = (Composer) obj6;
                                        int iIntValue3 = ((Integer) obj7).intValue();
                                        ((LazyItemScope) obj5).getClass();
                                        if (composer3.shouldExecute((iIntValue3 & 17) != 16, iIntValue3 & 1)) {
                                            if (ComposerKt.isTraceInProgress()) {
                                                ComposerKt.traceEventStart(1429027187, iIntValue3, -1, "com.dh.myembyapp.ui.screens.player.components.DecoderSelectionOverlay.<anonymous>.<anonymous>.<anonymous>.<anonymous> (DecoderSelectionOverlay.kt:417)");
                                            }
                                            Modifier modifierFocusRequester2 = FocusRequesterModifierKt.focusRequester(SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null), (FocusRequester) list7.get(5));
                                            Object objRememberedValue11 = composer3.rememberedValue();
                                            Composer.Companion companion6 = Composer.INSTANCE;
                                            int i15 = 3;
                                            if (objRememberedValue11 == companion6.getEmpty()) {
                                                objRememberedValue11 = new u00(i15, mutableState4);
                                                composer3.updateRememberedValue(objRememberedValue11);
                                            }
                                            Modifier modifierOnFocusChanged2 = FocusChangedModifierKt.onFocusChanged(modifierFocusRequester2, (Function1) objRememberedValue11);
                                            ClickableSurfaceDefaults clickableSurfaceDefaults2 = ClickableSurfaceDefaults.INSTANCE;
                                            RoundedCornerShape roundedCornerShapeM1312RoundedCornerShape0680j_5 = RoundedCornerShapeKt.m1312RoundedCornerShape0680j_4(Dp.m7813constructorimpl(8.0f));
                                            int i16 = ClickableSurfaceDefaults.$stable;
                                            int i17 = i16 << 15;
                                            ClickableSurfaceShape clickableSurfaceShapeShape2 = clickableSurfaceDefaults2.shape(roundedCornerShapeM1312RoundedCornerShape0680j_5, null, null, null, null, composer3, i17, 30);
                                            long jM5151copywmQWz5c$default2 = m20.b(mutableState4) == 5 ? Color.m5151copywmQWz5c$default(Color.INSTANCE.m5189getWhite0d7_KjU(), 0.2f, 0.0f, 0.0f, 0.0f, 14, null) : Color.INSTANCE.m5187getTransparent0d7_KjU();
                                            Color.Companion companion7 = Color.INSTANCE;
                                            ClickableSurfaceColors clickableSurfaceColorsM8292colorsoq7We09 = clickableSurfaceDefaults2.m8292colorsoq7We08(jM5151copywmQWz5c$default2, 0L, Color.m5151copywmQWz5c$default(companion7.m5189getWhite0d7_KjU(), 0.3f, 0.0f, 0.0f, 0.0f, 14, null), 0L, 0L, 0L, 0L, 0L, composer3, (i16 << 24) | RendererCapabilities.DECODER_SUPPORT_MASK, 250);
                                            ClickableSurfaceBorder clickableSurfaceBorderBorder2 = clickableSurfaceDefaults2.border(null, new Border(BorderStrokeKt.m301BorderStrokecXLIe8U(Dp.m7813constructorimpl(2.0f), Color.m5151copywmQWz5c$default(companion7.m5189getWhite0d7_KjU(), 0.9f, 0.0f, 0.0f, 0.0f, 14, null)), 0.0f, null, 6, null), null, null, null, composer3, i17 | 48, 29);
                                            ClickableSurfaceScale clickableSurfaceScaleScale$default2 = ClickableSurfaceDefaults.scale$default(clickableSurfaceDefaults2, 0.0f, 1.05f, 0.0f, 0.0f, 0.0f, 29, null);
                                            boolean zChanged3 = composer3.changed(function10) | composer3.changed(z5);
                                            Object objRememberedValue12 = composer3.rememberedValue();
                                            if (zChanged3 || objRememberedValue12 == companion6.getEmpty()) {
                                                objRememberedValue12 = new jp(3, z5, function10);
                                                composer3.updateRememberedValue(objRememberedValue12);
                                            }
                                            SurfaceKt.m8520Surface05tvjtU((Function0) objRememberedValue12, modifierOnFocusChanged2, null, false, 0.0f, clickableSurfaceShapeShape2, clickableSurfaceColorsM8292colorsoq7We09, clickableSurfaceScaleScale$default2, clickableSurfaceBorderBorder2, null, null, ComposableLambdaKt.rememberComposableLambda(-1250236206, true, new g2(z5, i12), composer3, 54), composer3, 0, 48, 1564);
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
                        }), 3, null);
                        d.a(lazyListScope, null, null, at.g, 3, null);
                        return Unit.INSTANCE;
                    }
                };
                list = list2;
                mutableState = mutableState2;
                composerStartRestartGroup.updateRememberedValue(obj3);
            } else {
                list = list2;
                obj3 = objRememberedValue8;
                mutableState = mutableState2;
                i4 = 0;
            }
            LazyDslKt.LazyColumn(modifierM999padding3ABfNKs, lazyListStateRememberLazyListState, null, false, horizontalOrVerticalM712spacedBy0680j_4, null, null, false, null, (Function1) obj3, composerStartRestartGroup, 24576, 492);
            composerStartRestartGroup.endNode();
            Integer numValueOf2 = Integer.valueOf(b(mutableState));
            boolean zChangedInstance3 = composerStartRestartGroup.changedInstance(list3) | composerStartRestartGroup.changed(lazyListStateRememberLazyListState) | composerStartRestartGroup.changedInstance(list);
            Object objRememberedValue9 = composerStartRestartGroup.rememberedValue();
            if (zChangedInstance3 || objRememberedValue9 == companion.getEmpty()) {
                l20 l20Var = new l20(list3, lazyListStateRememberLazyListState, mutableState, list, (Continuation) null);
                composerStartRestartGroup.updateRememberedValue(l20Var);
                objRememberedValue9 = l20Var;
            }
            EffectsKt.LaunchedEffect(numValueOf2, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) objRememberedValue9, composerStartRestartGroup, i4);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new e20(str, str2, z, z2, function1, function2, function3, function4, function0, i));
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final int b(MutableState mutableState) {
        return ((Number) mutableState.getValue()).intValue();
    }

    public static final void c(int i, MutableState mutableState) {
        mutableState.setValue(Integer.valueOf(i));
    }
}
