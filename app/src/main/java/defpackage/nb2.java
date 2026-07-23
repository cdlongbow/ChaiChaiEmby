package defpackage;

import androidx.compose.foundation.BackgroundKt;
import androidx.compose.foundation.FocusableKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnScopeInstance;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.lazy.LazyDslKt;
import androidx.compose.foundation.lazy.LazyListState;
import androidx.compose.foundation.lazy.LazyListStateKt;
import androidx.compose.material3.TextKt;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.Updater;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.focus.FocusRequester;
import androidx.compose.ui.focus.FocusRequesterModifierKt;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.ColorKt;
import androidx.compose.ui.input.key.KeyInputModifierKt;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.text.font.FontWeight;
import androidx.compose.ui.unit.Dp;
import androidx.compose.ui.unit.TextUnitKt;
import androidx.media3.exoplayer.RendererCapabilities;
import com.dh.myembyapp.data.model.TranscodeQualityOption;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: loaded from: classes4.dex */
public abstract class nb2 {
    public static final void a(final List list, final TranscodeQualityOption transcodeQualityOption, final Function1 function1, final Function0 function0, Composer composer, final int i) {
        int i2;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Function2<? super Composer, ? super Integer, Unit> function2;
        TranscodeQualityOption transcodeQualityOption2;
        char c;
        Object objPrevious;
        list.getClass();
        function1.getClass();
        function0.getClass();
        Composer composerStartRestartGroup = composer.startRestartGroup(-98810003);
        if ((i & 6) == 0) {
            i2 = (composerStartRestartGroup.changedInstance(list) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= composerStartRestartGroup.changed(transcodeQualityOption) ? 32 : 16;
        }
        if ((i & RendererCapabilities.DECODER_SUPPORT_MASK) == 0) {
            i2 |= composerStartRestartGroup.changedInstance(function1) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= composerStartRestartGroup.changedInstance(function0) ? 2048 : 1024;
        }
        if (composerStartRestartGroup.shouldExecute((i2 & 1171) != 1170, i2 & 1)) {
            int i3 = -1;
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-98810003, i2, -1, "com.dh.myembyapp.ui.screens.player.components.TranscodeQualitySelectionOverlay (TranscodeQualitySelectionOverlay.kt:55)");
            }
            if (list.isEmpty()) {
                function0.invoke();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup == null) {
                    return;
                }
                final int i4 = 0;
                function2 = new Function2() { // from class: lb2
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        switch (i4) {
                            case 0:
                                ((Integer) obj2).intValue();
                                nb2.a(list, transcodeQualityOption, function1, function0, (Composer) obj, RecomposeScopeImplKt.updateChangedFlags(i | 1));
                                break;
                            default:
                                ((Integer) obj2).intValue();
                                nb2.a(list, transcodeQualityOption, function1, function0, (Composer) obj, RecomposeScopeImplKt.updateChangedFlags(i | 1));
                                break;
                        }
                        return Unit.INSTANCE;
                    }
                };
            } else {
                if (transcodeQualityOption == null) {
                    ListIterator listIterator = list.listIterator(list.size());
                    do {
                        if (!listIterator.hasPrevious()) {
                            objPrevious = null;
                            break;
                        }
                        objPrevious = listIterator.previous();
                    } while (!((TranscodeQualityOption) objPrevious).isAuto());
                    transcodeQualityOption2 = (TranscodeQualityOption) objPrevious;
                    if (transcodeQualityOption2 == null) {
                        transcodeQualityOption2 = (TranscodeQualityOption) CollectionsKt.first(list);
                    }
                } else {
                    transcodeQualityOption2 = transcodeQualityOption;
                }
                String strC = c(transcodeQualityOption2);
                Iterator it = list.iterator();
                int i5 = 0;
                while (true) {
                    if (!it.hasNext()) {
                        c = ' ';
                        break;
                    }
                    c = ' ';
                    if (Intrinsics.areEqual(c((TranscodeQualityOption) it.next()), strC)) {
                        i3 = i5;
                        break;
                    }
                    i5++;
                }
                Integer numValueOf = Integer.valueOf(i3);
                if (i3 < 0) {
                    numValueOf = null;
                }
                int iIntValue = numValueOf != null ? numValueOf.intValue() : 0;
                boolean zChanged = composerStartRestartGroup.changed(strC);
                Object objRememberedValue = composerStartRestartGroup.rememberedValue();
                if (zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                    objRememberedValue = mr.l(iIntValue, null, 2, null, composerStartRestartGroup);
                }
                MutableState mutableState = (MutableState) objRememberedValue;
                Object objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                Composer.Companion companion = Composer.INSTANCE;
                if (objRememberedValue2 == companion.getEmpty()) {
                    objRememberedValue2 = mr.n(composerStartRestartGroup);
                }
                FocusRequester focusRequester = (FocusRequester) objRememberedValue2;
                LazyListState lazyListStateRememberLazyListState = LazyListStateKt.rememberLazyListState(iIntValue, 0, composerStartRestartGroup, 0, 2);
                Modifier.Companion companion2 = Modifier.INSTANCE;
                Modifier modifierFillMaxSize$default = SizeKt.fillMaxSize$default(companion2, 0.0f, 1, null);
                Color.Companion companion3 = Color.INSTANCE;
                Modifier modifierFocusable$default = FocusableKt.focusable$default(FocusRequesterModifierKt.focusRequester(BackgroundKt.m275backgroundbw27NRU$default(modifierFillMaxSize$default, Color.m5151copywmQWz5c$default(companion3.m5178getBlack0d7_KjU(), 0.7f, 0.0f, 0.0f, 0.0f, 14, null), null, 2, null), focusRequester), false, null, 3, null);
                boolean zChanged2 = ((i2 & 896) == 256) | composerStartRestartGroup.changed(mutableState) | composerStartRestartGroup.changedInstance(list) | ((i2 & 7168) == 2048);
                Object objRememberedValue3 = composerStartRestartGroup.rememberedValue();
                if (zChanged2 || objRememberedValue3 == companion.getEmpty()) {
                    objRememberedValue3 = new mb2(list, function1, function0, mutableState);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
                }
                Modifier modifierOnPreviewKeyEvent = KeyInputModifierKt.onPreviewKeyEvent(modifierFocusable$default, (Function1) objRememberedValue3);
                Alignment.Companion companion4 = Alignment.INSTANCE;
                MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(companion4.getCenterEnd(), false);
                long currentCompositeKeyHashCode = ComposablesKt.getCurrentCompositeKeyHashCode(composerStartRestartGroup, 0);
                int i6 = (int) (currentCompositeKeyHashCode ^ (currentCompositeKeyHashCode >>> c));
                CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
                Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifierOnPreviewKeyEvent);
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
                Updater.m4326setimpl(composerM4318constructorimpl, modifierMaterializeModifier, (Function2<? super T, ? super Modifier, Unit>) id.h(companion5, composerM4318constructorimpl, Integer.valueOf(i6), composerM4318constructorimpl));
                BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
                Modifier modifierM999padding3ABfNKs = PaddingKt.m999padding3ABfNKs(kb0.v(12.0f, PaddingKt.m999padding3ABfNKs(SizeKt.m1069width3ABfNKs(companion2, Dp.m7813constructorimpl(340.0f)), Dp.m7813constructorimpl(24.0f)), ColorKt.Color(4280163870L)), Dp.m7813constructorimpl(16.0f));
                Arrangement arrangement = Arrangement.INSTANCE;
                MeasurePolicy measurePolicyColumnMeasurePolicy = ColumnKt.columnMeasurePolicy(arrangement.getTop(), companion4.getStart(), composerStartRestartGroup, 0);
                long currentCompositeKeyHashCode2 = ComposablesKt.getCurrentCompositeKeyHashCode(composerStartRestartGroup, 0);
                int i7 = (int) (currentCompositeKeyHashCode2 ^ (currentCompositeKeyHashCode2 >>> c));
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
                Updater.m4326setimpl(composerM4318constructorimpl2, modifierMaterializeModifier2, (Function2<? super T, ? super Modifier, Unit>) id.h(companion5, composerM4318constructorimpl2, Integer.valueOf(i7), composerM4318constructorimpl2));
                ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.INSTANCE;
                TextKt.m3048TextNvy7gAk("转码质量", PaddingKt.m1003paddingqDBjuR0$default(companion2, 0.0f, 0.0f, 0.0f, Dp.m7813constructorimpl(16.0f), 7, null), companion3.m5189getWhite0d7_KjU(), null, TextUnitKt.getSp(18), null, FontWeight.INSTANCE.getBold(), null, 0L, null, null, 0L, 0, false, 0, 0, null, null, composerStartRestartGroup, 1597878, 0, 262056);
                composerStartRestartGroup = composerStartRestartGroup;
                int i8 = 1;
                Continuation continuation = null;
                Modifier modifierM1052heightInVpY3zN4$default = SizeKt.m1052heightInVpY3zN4$default(companion2, 0.0f, Dp.m7813constructorimpl(420.0f), 1, null);
                Arrangement.HorizontalOrVertical horizontalOrVerticalM712spacedBy0680j_4 = arrangement.m712spacedBy0680j_4(Dp.m7813constructorimpl(4.0f));
                boolean zChangedInstance = composerStartRestartGroup.changedInstance(list) | composerStartRestartGroup.changed(strC) | composerStartRestartGroup.changed(mutableState);
                Object objRememberedValue4 = composerStartRestartGroup.rememberedValue();
                if (zChangedInstance || objRememberedValue4 == companion.getEmpty()) {
                    objRememberedValue4 = new sg0(list, strC, mutableState, i8);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue4);
                }
                LazyDslKt.LazyColumn(modifierM1052heightInVpY3zN4$default, lazyListStateRememberLazyListState, null, false, horizontalOrVerticalM712spacedBy0680j_4, null, null, false, null, (Function1) objRememberedValue4, composerStartRestartGroup, 24582, 492);
                composerStartRestartGroup.endNode();
                composerStartRestartGroup.endNode();
                Integer numValueOf2 = Integer.valueOf(b(mutableState));
                boolean zChanged3 = composerStartRestartGroup.changed(lazyListStateRememberLazyListState) | composerStartRestartGroup.changed(mutableState);
                Object objRememberedValue5 = composerStartRestartGroup.rememberedValue();
                int i9 = 6;
                if (zChanged3 || objRememberedValue5 == companion.getEmpty()) {
                    objRememberedValue5 = new mg(lazyListStateRememberLazyListState, mutableState, continuation, i9);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue5);
                }
                EffectsKt.LaunchedEffect(numValueOf2, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) objRememberedValue5, composerStartRestartGroup, 0);
                Unit unit = Unit.INSTANCE;
                Object objRememberedValue6 = composerStartRestartGroup.rememberedValue();
                if (objRememberedValue6 == companion.getEmpty()) {
                    objRememberedValue6 = new ng(focusRequester, null, 14);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue6);
                }
                EffectsKt.LaunchedEffect(unit, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) objRememberedValue6, composerStartRestartGroup, 6);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
            }
            scopeUpdateScopeEndRestartGroup.updateScope(function2);
        }
        composerStartRestartGroup.skipToGroupEnd();
        scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            final int i10 = 1;
            function2 = new Function2() { // from class: lb2
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    switch (i10) {
                        case 0:
                            ((Integer) obj2).intValue();
                            nb2.a(list, transcodeQualityOption, function1, function0, (Composer) obj, RecomposeScopeImplKt.updateChangedFlags(i | 1));
                            break;
                        default:
                            ((Integer) obj2).intValue();
                            nb2.a(list, transcodeQualityOption, function1, function0, (Composer) obj, RecomposeScopeImplKt.updateChangedFlags(i | 1));
                            break;
                    }
                    return Unit.INSTANCE;
                }
            };
            scopeUpdateScopeEndRestartGroup.updateScope(function2);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final int b(MutableState mutableState) {
        return ((Number) mutableState.getValue()).intValue();
    }

    public static final String c(TranscodeQualityOption transcodeQualityOption) {
        Integer maxHeight = transcodeQualityOption.getMaxHeight();
        int iIntValue = maxHeight != null ? maxHeight.intValue() : 0;
        Integer maxWidth = transcodeQualityOption.getMaxWidth();
        return iIntValue + "_" + (maxWidth != null ? maxWidth.intValue() : 0) + "_" + transcodeQualityOption.getBitrate() + "_" + transcodeQualityOption.isAuto() + "_" + transcodeQualityOption.getDisablesTranscoding();
    }
}
