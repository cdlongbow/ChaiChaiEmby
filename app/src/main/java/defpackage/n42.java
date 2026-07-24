package defpackage;

import android.content.Context;
import android.util.Log;
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
import androidx.compose.ui.input.key.KeyInputModifierKt;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.text.font.FontWeight;
import androidx.compose.ui.unit.Dp;
import androidx.compose.ui.unit.TextUnitKt;
import androidx.core.text.util.LocalePreferences;
import androidx.media3.common.Format;
import androidx.media3.common.TrackGroup;
import androidx.media3.common.TrackSelectionOverride;
import androidx.media3.common.TrackSelectionParameters;
import androidx.media3.common.Tracks;
import androidx.media3.exoplayer.ExoPlayer;
import androidx.media3.exoplayer.RendererCapabilities;

import com.dh.myembyapp.data.SubtitlePreferences;
import com.dh.myembyapp.data.model.MediaItem;
import com.dh.myembyapp.data.model.MediaSource;
import com.dh.myembyapp.data.model.MediaStream;
import com.dh.myembyapp.data.model.SubtitleFormatPriorityType;
import com.dh.myembyapp.data.model.SubtitleLanguagePriorityType;
import com.dh.myembyapp.data.model.SubtitleVersionPrioritySettings;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.CollectionsKt;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Regex;
import kotlin.text.StringsKt;
import kotlin.text.StringsKt;
import kotlin.text.StringsKt;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: loaded from: classes4.dex */
public abstract class n42 {
    public static final void a(final ArrayList arrayList, final String str, final String str2, final Function1 function1, final Function0 function0, Composer composer, final int i) {
        int i2;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Function2<? super Composer, ? super Integer, Unit> function2;
        Object obj;
        MutableState mutableState;
        function1.getClass();
        function0.getClass();
        Composer composerStartRestartGroup = composer.startRestartGroup(-179908316);
        if ((i & 6) == 0) {
            i2 = (composerStartRestartGroup.changedInstance(arrayList) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= composerStartRestartGroup.changed(str) ? 32 : 16;
        }
        if ((i & RendererCapabilities.DECODER_SUPPORT_MASK) == 0) {
            i2 |= composerStartRestartGroup.changed(str2) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= composerStartRestartGroup.changedInstance(function1) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i2 |= composerStartRestartGroup.changedInstance(function0) ? 16384 : 8192;
        }
        if (composerStartRestartGroup.shouldExecute((i2 & 9363) != 9362, i2 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-179908316, i2, -1, "com.dh.myembyapp.ui.screens.player.components.SubtitleSelectionOverlay (SubtitleSelection.kt:97)");
            }
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            Composer.Companion companion = Composer.INSTANCE;
            if (objRememberedValue == companion.getEmpty()) {
                objRememberedValue = mr.n(composerStartRestartGroup);
            }
            FocusRequester focusRequester = (FocusRequester) objRememberedValue;
            if (arrayList.isEmpty()) {
                composerStartRestartGroup.startReplaceGroup(470876859);
                Modifier.Companion companion2 = Modifier.INSTANCE;
                Modifier modifierFillMaxSize$default = SizeKt.fillMaxSize$default(companion2, 0.0f, 1, null);
                Color.Companion companion3 = Color.INSTANCE;
                Modifier modifierFocusable$default = FocusableKt.focusable$default(FocusRequesterModifierKt.focusRequester(BackgroundKt.m275backgroundbw27NRU$default(modifierFillMaxSize$default, Color.m5151copywmQWz5c$default(companion3.m5178getBlack0d7_KjU(), 0.7f, 0.0f, 0.0f, 0.0f, 14, null), null, 2, null), focusRequester), false, null, 3, null);
                boolean z = (i2 & 57344) == 16384;
                Object objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                if (z || objRememberedValue2 == companion.getEmpty()) {
                    objRememberedValue2 = new k42(function0);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                }
                Modifier modifierOnPreviewKeyEvent = KeyInputModifierKt.onPreviewKeyEvent(modifierFocusable$default, (Function1) objRememberedValue2);
                Alignment.Companion companion4 = Alignment.INSTANCE;
                MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(companion4.getCenterEnd(), false);
                long currentCompositeKeyHashCode = ComposablesKt.getCurrentCompositeKeyHashCode(composerStartRestartGroup, 0);
                int i3 = (int) (currentCompositeKeyHashCode ^ (currentCompositeKeyHashCode >>> 32));
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
                Updater.m4326setimpl(composerM4318constructorimpl, modifierMaterializeModifier, (Function2<? super T, ? super Modifier, Unit>) id.h(companion5, composerM4318constructorimpl, Integer.valueOf(i3), composerM4318constructorimpl));
                BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
                Modifier modifierM1000paddingVpY3zN4 = PaddingKt.m1000paddingVpY3zN4(SizeKt.m1069width3ABfNKs(SizeKt.fillMaxHeight$default(companion2, 0.0f, 1, null), Dp.m7813constructorimpl(380.0f)), Dp.m7813constructorimpl(24.0f), Dp.m7813constructorimpl(48.0f));
                MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy2 = BoxKt.maybeCachedBoxMeasurePolicy(companion4.getCenter(), false);
                long currentCompositeKeyHashCode2 = ComposablesKt.getCurrentCompositeKeyHashCode(composerStartRestartGroup, 0);
                int i4 = (int) (currentCompositeKeyHashCode2 ^ (currentCompositeKeyHashCode2 >>> 32));
                CompositionLocalMap currentCompositionLocalMap2 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                Modifier modifierMaterializeModifier2 = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifierM1000paddingVpY3zN4);
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
                mr.z(companion5, composerM4318constructorimpl2, measurePolicyMaybeCachedBoxMeasurePolicy2, composerM4318constructorimpl2, currentCompositionLocalMap2);
                Updater.m4326setimpl(composerM4318constructorimpl2, modifierMaterializeModifier2, (Function2<? super T, ? super Modifier, Unit>) id.h(companion5, composerM4318constructorimpl2, Integer.valueOf(i4), composerM4318constructorimpl2));
                TextKt.m3048TextNvy7gAk("暂无可选字幕", null, Color.m5151copywmQWz5c$default(companion3.m5189getWhite0d7_KjU(), 0.82f, 0.0f, 0.0f, 0.0f, 14, null), null, TextUnitKt.getSp(20), null, FontWeight.INSTANCE.getMedium(), null, 0L, null, null, 0L, 0, false, 0, 0, null, null, composerStartRestartGroup, 1597830, 0, 262058);
                composerStartRestartGroup.endNode();
                composerStartRestartGroup.endNode();
                Unit unit = Unit.INSTANCE;
                Object objRememberedValue3 = composerStartRestartGroup.rememberedValue();
                if (objRememberedValue3 == companion.getEmpty()) {
                    objRememberedValue3 = new ng(focusRequester, null, 12);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
                }
                EffectsKt.LaunchedEffect(unit, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) objRememberedValue3, composerStartRestartGroup, 6);
                composerStartRestartGroup.endReplaceGroup();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup == null) {
                    return;
                }
                final int i5 = 0;
                function2 = new Function2() { // from class: i42
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj2, Object obj3) {
                        int i6 = i5;
                        int i7 = i;
                        switch (i6) {
                            case 0:
                                ((Integer) obj3).getClass();
                                n42.a(arrayList, str, str2, function1, function0, (Composer) obj2, RecomposeScopeImplKt.updateChangedFlags(i7 | 1));
                                break;
                            default:
                                ((Integer) obj3).getClass();
                                n42.a(arrayList, str, str2, function1, function0, (Composer) obj2, RecomposeScopeImplKt.updateChangedFlags(i7 | 1));
                                break;
                        }
                        return Unit.INSTANCE;
                    }
                };
            } else {
                composerStartRestartGroup.startReplaceGroup(472109822);
                composerStartRestartGroup.endReplaceGroup();
                int size = arrayList.size();
                int i6 = 0;
                int i7 = 0;
                while (true) {
                    if (i6 >= size) {
                        i7 = -1;
                        break;
                    }
                    Object obj2 = arrayList.get(i6);
                    i6++;
                    if (Intrinsics.areEqual(((h42) obj2).a, str)) {
                        break;
                    } else {
                        i7++;
                    }
                }
                Integer numValueOf = Integer.valueOf(i7);
                if (i7 < 0) {
                    numValueOf = null;
                }
                int iIntValue = numValueOf != null ? numValueOf.intValue() : 0;
                int i8 = i2 & Input.Keys.FORWARD_DEL;
                boolean z2 = i8 == 32;
                Object objRememberedValue4 = composerStartRestartGroup.rememberedValue();
                if (z2 || objRememberedValue4 == Composer.INSTANCE.getEmpty()) {
                    obj = null;
                    objRememberedValue4 = mr.l(iIntValue, null, 2, null, composerStartRestartGroup);
                } else {
                    obj = null;
                }
                MutableState mutableState2 = (MutableState) objRememberedValue4;
                LazyListState lazyListStateRememberLazyListState = LazyListStateKt.rememberLazyListState(iIntValue, 0, composerStartRestartGroup, 0, 2);
                Modifier.Companion companion6 = Modifier.INSTANCE;
                Modifier modifierFocusable$default2 = FocusableKt.focusable$default(FocusRequesterModifierKt.focusRequester(BackgroundKt.m275backgroundbw27NRU$default(SizeKt.fillMaxSize$default(companion6, 0.0f, 1, obj), Color.m5151copywmQWz5c$default(Color.INSTANCE.m5178getBlack0d7_KjU(), 0.7f, 0.0f, 0.0f, 0.0f, 14, null), null, 2, null), focusRequester), false, null, 3, null);
                boolean zChanged = composerStartRestartGroup.changed(mutableState2) | composerStartRestartGroup.changedInstance(arrayList) | ((i2 & 7168) == 2048) | ((i2 & 57344) == 16384);
                Object objRememberedValue5 = composerStartRestartGroup.rememberedValue();
                if (zChanged || objRememberedValue5 == Composer.INSTANCE.getEmpty()) {
                    objRememberedValue5 = new l42(arrayList, function1, function0, mutableState2);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue5);
                }
                Modifier modifierOnPreviewKeyEvent2 = KeyInputModifierKt.onPreviewKeyEvent(modifierFocusable$default2, (Function1) objRememberedValue5);
                Alignment.Companion companion7 = Alignment.INSTANCE;
                MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy3 = BoxKt.maybeCachedBoxMeasurePolicy(companion7.getCenterEnd(), false);
                long currentCompositeKeyHashCode3 = ComposablesKt.getCurrentCompositeKeyHashCode(composerStartRestartGroup, 0);
                int i9 = (int) (currentCompositeKeyHashCode3 ^ (currentCompositeKeyHashCode3 >>> 32));
                CompositionLocalMap currentCompositionLocalMap3 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                Modifier modifierMaterializeModifier3 = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifierOnPreviewKeyEvent2);
                ComposeUiNode.Companion companion8 = ComposeUiNode.INSTANCE;
                Function0<ComposeUiNode> constructor3 = companion8.getConstructor();
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
                mr.z(companion8, composerM4318constructorimpl3, measurePolicyMaybeCachedBoxMeasurePolicy3, composerM4318constructorimpl3, currentCompositionLocalMap3);
                Updater.m4326setimpl(composerM4318constructorimpl3, modifierMaterializeModifier3, (Function2<? super T, ? super Modifier, Unit>) id.h(companion8, composerM4318constructorimpl3, Integer.valueOf(i9), composerM4318constructorimpl3));
                BoxScopeInstance boxScopeInstance2 = BoxScopeInstance.INSTANCE;
                Modifier modifierM1000paddingVpY3zN5 = PaddingKt.m1000paddingVpY3zN4(SizeKt.m1069width3ABfNKs(SizeKt.fillMaxHeight$default(companion6, 0.0f, 1, null), Dp.m7813constructorimpl(380.0f)), Dp.m7813constructorimpl(24.0f), Dp.m7813constructorimpl(48.0f));
                Arrangement arrangement = Arrangement.INSTANCE;
                MeasurePolicy measurePolicyColumnMeasurePolicy = ColumnKt.columnMeasurePolicy(arrangement.getTop(), companion7.getStart(), composerStartRestartGroup, 0);
                long currentCompositeKeyHashCode4 = ComposablesKt.getCurrentCompositeKeyHashCode(composerStartRestartGroup, 0);
                int i10 = (int) (currentCompositeKeyHashCode4 ^ (currentCompositeKeyHashCode4 >>> 32));
                CompositionLocalMap currentCompositionLocalMap4 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                Modifier modifierMaterializeModifier4 = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifierM1000paddingVpY3zN5);
                Function0<ComposeUiNode> constructor4 = companion8.getConstructor();
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
                mr.z(companion8, composerM4318constructorimpl4, measurePolicyColumnMeasurePolicy, composerM4318constructorimpl4, currentCompositionLocalMap4);
                Updater.m4326setimpl(composerM4318constructorimpl4, modifierMaterializeModifier4, (Function2<? super T, ? super Modifier, Unit>) id.h(companion8, composerM4318constructorimpl4, Integer.valueOf(i10), composerM4318constructorimpl4));
                ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.INSTANCE;
                Modifier modifierFillMaxSize$default2 = SizeKt.fillMaxSize$default(companion6, 0.0f, 1, null);
                Arrangement.HorizontalOrVertical horizontalOrVerticalM712spacedBy0680j_4 = arrangement.m712spacedBy0680j_4(Dp.m7813constructorimpl(4.0f));
                boolean zChangedInstance = ((i2 & 896) == 256) | composerStartRestartGroup.changedInstance(arrayList) | composerStartRestartGroup.changed(mutableState2) | (i8 == 32);
                Object objRememberedValue6 = composerStartRestartGroup.rememberedValue();
                if (zChangedInstance || objRememberedValue6 == Composer.INSTANCE.getEmpty()) {
                    mutableState = mutableState2;
                    g9 g9Var = new g9(20, arrayList, str, str2, mutableState);
                    composerStartRestartGroup.updateRememberedValue(g9Var);
                    objRememberedValue6 = g9Var;
                } else {
                    mutableState = mutableState2;
                }
                MutableState mutableState3 = mutableState;
                LazyDslKt.LazyColumn(modifierFillMaxSize$default2, lazyListStateRememberLazyListState, null, false, horizontalOrVerticalM712spacedBy0680j_4, null, null, false, null, (Function1) objRememberedValue6, composerStartRestartGroup, 24582, 492);
                composerStartRestartGroup.endNode();
                composerStartRestartGroup.endNode();
                Integer numValueOf2 = Integer.valueOf(b(mutableState3));
                boolean zChanged2 = composerStartRestartGroup.changed(lazyListStateRememberLazyListState) | composerStartRestartGroup.changed(mutableState3);
                Object objRememberedValue7 = composerStartRestartGroup.rememberedValue();
                if (zChanged2 || objRememberedValue7 == Composer.INSTANCE.getEmpty()) {
                    objRememberedValue7 = new mg(lazyListStateRememberLazyListState, mutableState3, 0, 5);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue7);
                }
                EffectsKt.LaunchedEffect(numValueOf2, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) objRememberedValue7, composerStartRestartGroup, 0);
                Unit unit2 = Unit.INSTANCE;
                Object objRememberedValue8 = composerStartRestartGroup.rememberedValue();
                if (objRememberedValue8 == Composer.INSTANCE.getEmpty()) {
                    objRememberedValue8 = new ng(focusRequester, r10, 13);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue8);
                }
                EffectsKt.LaunchedEffect(unit2, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) objRememberedValue8, composerStartRestartGroup, 6);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
            }
            scopeUpdateScopeEndRestartGroup.updateScope(function2);
        }
        composerStartRestartGroup.skipToGroupEnd();
        scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            final int i11 = 1;
            function2 = new Function2() { // from class: i42
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj3, Object obj4) {
                    int i12 = i11;
                    int i13 = i;
                    switch (i12) {
                        case 0:
                            ((Integer) obj4).getClass();
                            n42.a(arrayList, str, str2, function1, function0, (Composer) obj3, RecomposeScopeImplKt.updateChangedFlags(i13 | 1));
                            break;
                        default:
                            ((Integer) obj4).getClass();
                            n42.a(arrayList, str, str2, function1, function0, (Composer) obj3, RecomposeScopeImplKt.updateChangedFlags(i13 | 1));
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

    public static final void c(ExoPlayer exoPlayer, h42 h42Var, Context context) {
        exoPlayer.getClass();
        h42Var.getClass();
        TrackSelectionParameters.Builder builderBuildUpon = exoPlayer.getTrackSelectionParameters().buildUpon();
        builderBuildUpon.getClass();
        builderBuildUpon.clearOverridesOfType(3);
        g52 g52Var = h42Var.d;
        if (g52Var == null) {
            builderBuildUpon.setTrackTypeDisabled(3, true).getClass();
        } else {
            builderBuildUpon.setTrackTypeDisabled(3, false);
            builderBuildUpon.addOverride(new TrackSelectionOverride(g52Var.a, (List<Integer>) CollectionsKt.listOf(Integer.valueOf(g52Var.b))));
            if (StringsKt__StringsKt.contains(h42Var.b, (CharSequence) "PGS", true) && context != null) {
                Log.w("SubtitleSelection", "警告: PGS 字幕可能显示不完整（仅显示单语言层）");
            }
        }
        exoPlayer.setTrackSelectionParameters(builderBuildUpon.build());
    }

    public static final void d(ExoPlayer exoPlayer, List list, SubtitlePreferences subtitlePreferences, MediaItem mediaItem, String str, SubtitleVersionPrioritySettings subtitleVersionPrioritySettings) {
        String id;
        SubtitlePreferences.MovieSubtitlePref movieSubtitlePref;
        MediaSource mediaSource;
        Object obj;
        exoPlayer.getClass();
        list.getClass();
        subtitleVersionPrioritySettings.getClass();
        if (subtitlePreferences != null && !subtitlePreferences.isSubtitlesEnabled()) {
            Log.d("SubtitleAuto", "全局字幕开关已关闭，跳过自动字幕选择");
            c(exoPlayer, new h42(), null);
            return;
        }
        ArrayList arrayListF = f(exoPlayer, list);
        Log.d("SubtitleAuto", "========== 可用字幕轨道 ==========");
        Log.d("SubtitleAuto", "字幕轨道数量: " + arrayListF.size());
        Log.d("SubtitleAuto", "API字幕流数量: " + list.size());
        int i = 0;
        for (Object obj2 : list) {
            int i2 = i + 1;
            if (i < 0) {
                CollectionsKt.throwIndexOverflow();
            }
            MediaStream mediaStream = (MediaStream) obj2;
            int index = mediaStream.getIndex();
            String language = mediaStream.getLanguage();
            String title = mediaStream.getTitle();
            String displayTitle = mediaStream.getDisplayTitle();
            StringBuilder sbO = c61.o("API字幕[", i, index, "]: index=", ", lang=");
            i02.v(sbO, language, ", title=", title, ", displayTitle=");
            sbO.append(displayTitle);
            Log.d("SubtitleAuto", sbO.toString());
            i = i2;
        }
        int size = arrayListF.size();
        int i3 = 0;
        int i4 = 0;
        while (i4 < size) {
            Object obj3 = arrayListF.get(i4);
            i4++;
            int i5 = i3 + 1;
            if (i3 < 0) {
                CollectionsKt.throwIndexOverflow();
            }
            h42 h42Var = (h42) obj3;
            if (h42Var.d != null) {
                Log.d("SubtitleAuto", "ExoPlayer字幕[" + i3 + "] title=" + h42Var.b + ", desc=" + h42Var.c);
            }
            i3 = i5;
        }
        Log.d("SubtitleAuto", "===================================");
        if (arrayListF.isEmpty()) {
            return;
        }
        if (subtitlePreferences != null && mediaItem != null) {
            boolean zAreEqual = Intrinsics.areEqual(mediaItem.getType(), "Episode");
            if (zAreEqual && mediaItem.getSeriesId() != null) {
                String seriesId = mediaItem.getSeriesId();
                seriesId.getClass();
                SubtitlePreferences.SeriesSubtitlePref seriesSubtitlePref = subtitlePreferences.getSeriesSubtitlePref(seriesId);
                if (seriesSubtitlePref != null && !Intrinsics.areEqual(seriesSubtitlePref.getMemoryEnabled(), Boolean.FALSE)) {
                    s01.E("找到剧集字幕偏好: language=", seriesSubtitlePref.getCurrentLanguageType(), ", title=", seriesSubtitlePref.getCurrentSubtitleTitle(), "SubtitleAuto");
                    if (seriesSubtitlePref.getCurrentSubtitleTitle() != null) {
                        h42 h42VarL = l(arrayListF, seriesSubtitlePref);
                        if (h42VarL != null) {
                            s01.E("精确匹配成功（语言+标题）: ", h42VarL.b, " - ", h42VarL.c, "SubtitleAuto");
                            c(exoPlayer, h42VarL, null);
                            return;
                        }
                        Log.d("SubtitleAuto", "精确匹配失败，尝试语言类型匹配");
                    }
                    int size2 = arrayListF.size();
                    int i6 = 0;
                    while (true) {
                        if (i6 >= size2) {
                            obj = null;
                            break;
                        }
                        obj = arrayListF.get(i6);
                        i6++;
                        h42 h42Var2 = (h42) obj;
                        if (h42Var2.d != null && Intrinsics.areEqual(g(h42Var2), seriesSubtitlePref.getCurrentLanguageType())) {
                            break;
                        }
                    }
                    h42 h42Var3 = (h42) obj;
                    if (h42Var3 != null) {
                        s01.E("语言类型匹配成功: ", h42Var3.b, " - ", h42Var3.c, "SubtitleAuto");
                        c(exoPlayer, h42Var3, null);
                        return;
                    }
                    Log.d("SubtitleAuto", "语言类型匹配也失败，使用默认打分选择");
                }
            } else if (!zAreEqual) {
                if (str == null) {
                    List<MediaSource> mediaSources = mediaItem.getMediaSources();
                    id = (mediaSources == null || (mediaSource = (MediaSource) CollectionsKt.firstOrNull((List) mediaSources)) == null) ? null : mediaSource.getId();
                } else {
                    id = str;
                }
                if (id != null && (movieSubtitlePref = subtitlePreferences.getMovieSubtitlePref(mediaItem.getId(), id)) != null && !Intrinsics.areEqual(movieSubtitlePref.getMemoryEnabled(), Boolean.FALSE)) {
                    Log.d("SubtitleAuto", "找到电影字幕偏好: trackIndex=" + movieSubtitlePref.getCurrentTrackIndex() + ", apiStreamIndex=" + movieSubtitlePref.getCurrentApiStreamIndex() + ", title=" + movieSubtitlePref.getCurrentTrackTitle());
                    h42 h42VarI = i(arrayListF, movieSubtitlePref);
                    if (h42VarI != null) {
                        ll0.l("应用电影字幕偏好: ", h42VarI.b, "SubtitleAuto");
                        c(exoPlayer, h42VarI, null);
                        return;
                    }
                    Log.d("SubtitleAuto", "轨道索引不匹配（可能字幕轨道变化），使用默认选择");
                }
            }
        }
        SubtitleVersionPrioritySettings subtitleVersionPrioritySettingsNormalized = subtitleVersionPrioritySettings.normalized();
        Log.d("SubtitleAuto", "字幕优先级规则: " + subtitleVersionPrioritySettingsNormalized.buildPreviewText());
        ArrayList arrayList = new ArrayList();
        int size3 = arrayListF.size();
        int i7 = 0;
        while (i7 < size3) {
            Object obj4 = arrayListF.get(i7);
            i7++;
            if (((h42) obj4).d != null) {
                arrayList.add(obj4);
            }
        }
        int i8 = 0;
        for (int size4 = arrayList.size(); i8 < size4; size4 = size4) {
            Object obj5 = arrayList.get(i8);
            i8++;
            h42 h42Var4 = (h42) obj5;
            String str2 = h42Var4.b;
            SubtitleFormatPriorityType subtitleFormatPriorityType = h42Var4.g;
            SubtitleLanguagePriorityType subtitleLanguagePriorityType = h42Var4.f;
            String label = subtitleLanguagePriorityType.getLabel();
            int iLanguagePriorityFor = subtitleVersionPrioritySettingsNormalized.languagePriorityFor(subtitleLanguagePriorityType);
            String label2 = subtitleFormatPriorityType.getLabel();
            int priorityFor = subtitleVersionPrioritySettingsNormalized.formatPriorityFor(subtitleFormatPriorityType);
            String str3 = h42Var4.c;
            if (str3 == null) {
                str3 = "-";
            }
            StringBuilder sbZ = kb0.z("优先级候选: ", str2, ", language=", label, ", languagePriority=");
            sbZ.append(iLanguagePriorityFor);
            sbZ.append(", format=");
            sbZ.append(label2);
            sbZ.append(", formatPriority=");
            sbZ.append(priorityFor);
            sbZ.append(", desc=");
            sbZ.append(str3);
            Log.d("SubtitleAuto", sbZ.toString());
            arrayList = arrayList;
        }
        ArrayList arrayList2 = new ArrayList();
        int size5 = arrayListF.size();
        int i9 = 0;
        while (i9 < size5) {
            Object obj6 = arrayListF.get(i9);
            i9++;
            if (((h42) obj6).d != null) {
                arrayList2.add(obj6);
            }
        }
        ArrayList arrayList3 = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(arrayList2, 10));
        int size6 = arrayList2.size();
        int i10 = 0;
        int i11 = 0;
        while (i11 < size6) {
            Object obj7 = arrayList2.get(i11);
            i11++;
            int i12 = i10 + 1;
            if (i10 < 0) {
                CollectionsKt.throwIndexOverflow();
            }
            arrayList3.add(TuplesKt.to(Integer.valueOf(i10), (h42) obj7));
            i10 = i12;
        }
        Pair pair = (Pair) CollectionsKt.firstOrNull(CollectionsKt.sortedWith(arrayList3, new b5(10, new l60(subtitleVersionPrioritySettingsNormalized, 1))));
        h42 h42Var5 = pair != null ? (h42) pair.getSecond() : null;
        if (h42Var5 != null) {
            String str4 = h42Var5.b;
            boolean zContains = StringsKt__StringsKt.contains(str4, (CharSequence) "PGS", true);
            String str5 = h42Var5.c;
            if (str5 == null) {
                str5 = "";
            }
            String label3 = h42Var5.f.getLabel();
            String label4 = h42Var5.g.getLabel();
            StringBuilder sbZ2 = kb0.z("自动选择字幕: ", str4, " (", str5, "), language=");
            sbZ2.append(label3);
            sbZ2.append(", format=");
            sbZ2.append(label4);
            Log.d("SubtitleAuto", sbZ2.toString());
            if (zContains) {
                Log.w("SubtitleAuto", "警告: 已选择 PGS 图形字幕，可能仅显示部分内容（Media3 对 PGS 支持有限）");
            }
            c(exoPlayer, h42Var5, null);
        }
    }

    public static final f42 e(String str, String str2) {
        Locale locale = Locale.ROOT;
        String lowerCase = str.toLowerCase(locale);
        lowerCase.getClass();
        String lowerCase2 = str2.toLowerCase(locale);
        lowerCase2.getClass();
        String strC = mr.C(lowerCase, " ", lowerCase2);
        boolean zM = m(lowerCase);
        boolean zN = n(lowerCase);
        boolean zM2 = m(lowerCase2);
        boolean zN2 = n(lowerCase2);
        boolean z = (zM2 && !zN2) || ((!zN2 || zM2) && ((zM && !zN) || ((!zN || zM) && m(strC) && !n(strC))));
        boolean z2 = (zN2 && !zM2) || ((!zM2 || zN2) && ((zN && !zM) || ((!zM || zN) && n(strC) && !m(strC))));
        boolean z3 = z || z2 || StringsKt__StringsKt.contains$default(strC, (CharSequence) LocalePreferences.CalendarType.CHINESE, false, 2, (Object) null) || StringsKt__strC.contains("中文") || StringsKt__strC.contains("chi") || StringsKt__strC.contains("zho");
        boolean z4 = StringsKt__strC.contains("english") || StringsKt__strC.contains("英") || StringsKt__strC.contains("eng") || StringsKt__StringsJVMKt.startsWith$default(lowerCase, "en", false, 2, null);
        return new f42(z, z2, z3, z4, StringsKt__strC.contains("japanese") || StringsKt__strC.contains("日") || StringsKt__strC.contains("jpn") || StringsKt__strC.contains("ja"), StringsKt__strC.contains("korean") || StringsKt__strC.contains("韩") || StringsKt__strC.contains("kor") || StringsKt__strC.contains("ko"), StringsKt__strC.contains("双语") || StringsKt__strC.contains("bilingual") || StringsKt__strC.contains("&") || StringsKt__strC.contains("+") || (z3 && z4));
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:106:0x0227  */
    /* JADX WARN: Code duplicated, block: B:111:0x0235  */
    /* JADX WARN: Code duplicated, block: B:124:0x0262  */
    /* JADX WARN: Code duplicated, block: B:128:0x0270  */
    /* JADX WARN: Code duplicated, block: B:131:0x0276  */
    /* JADX WARN: Code duplicated, block: B:132:0x027b  */
    /* JADX WARN: Code duplicated, block: B:136:0x0286  */
    /* JADX WARN: Code duplicated, block: B:138:0x0296  */
    /* JADX WARN: Code duplicated, block: B:139:0x0299  */
    /* JADX WARN: Code duplicated, block: B:152:0x02c2  */
    /* JADX WARN: Code duplicated, block: B:157:0x02d0  */
    /* JADX WARN: Code duplicated, block: B:170:0x02fd  */
    /* JADX WARN: Code duplicated, block: B:174:0x030b  */
    /* JADX WARN: Code duplicated, block: B:177:0x0311  */
    /* JADX WARN: Code duplicated, block: B:178:0x0316  */
    /* JADX WARN: Code duplicated, block: B:183:0x0326  */
    /* JADX WARN: Code duplicated, block: B:184:0x032b  */
    /* JADX WARN: Code duplicated, block: B:195:0x0387  */
    /* JADX WARN: Code duplicated, block: B:198:0x038d  */
    /* JADX WARN: Code duplicated, block: B:201:0x0397  */
    /* JADX WARN: Code duplicated, block: B:206:0x03a5  */
    /* JADX WARN: Code duplicated, block: B:208:0x03ab  */
    /* JADX WARN: Code duplicated, block: B:233:0x0460  */
    /* JADX WARN: Code duplicated, block: B:235:0x046b  */
    /* JADX WARN: Code duplicated, block: B:238:0x0473  */
    /* JADX WARN: Code duplicated, block: B:240:0x0477  */
    /* JADX WARN: Code duplicated, block: B:243:0x047e  */
    /* JADX WARN: Code duplicated, block: B:245:0x0481  */
    /* JADX WARN: Code duplicated, block: B:248:0x0493  */
    /* JADX WARN: Code duplicated, block: B:251:0x049d  */
    /* JADX WARN: Code duplicated, block: B:254:0x04a7  */
    /* JADX WARN: Code duplicated, block: B:257:0x04b1  */
    /* JADX WARN: Code duplicated, block: B:260:0x04bb  */
    /* JADX WARN: Code duplicated, block: B:263:0x04c5  */
    /* JADX WARN: Code duplicated, block: B:266:0x04ce  */
    /* JADX WARN: Code duplicated, block: B:269:0x04d7  */
    /* JADX WARN: Code duplicated, block: B:272:0x04e0  */
    /* JADX WARN: Code duplicated, block: B:275:0x04e9  */
    /* JADX WARN: Code duplicated, block: B:278:0x04f2  */
    /* JADX WARN: Code duplicated, block: B:279:0x04f5  */
    /* JADX WARN: Code duplicated, block: B:282:0x04fe  */
    /* JADX WARN: Code duplicated, block: B:283:0x0501  */
    /* JADX WARN: Code duplicated, block: B:286:0x050a  */
    /* JADX WARN: Code duplicated, block: B:287:0x050d  */
    /* JADX WARN: Code duplicated, block: B:290:0x0516  */
    /* JADX WARN: Code duplicated, block: B:291:0x0519  */
    /* JADX WARN: Code duplicated, block: B:293:0x0521  */
    /* JADX WARN: Code duplicated, block: B:294:0x0529  */
    /* JADX WARN: Code duplicated, block: B:295:0x052c  */
    /* JADX WARN: Code duplicated, block: B:298:0x0534  */
    /* JADX WARN: Code duplicated, block: B:301:0x0539  */
    /* JADX WARN: Code duplicated, block: B:302:0x0543  */
    /* JADX WARN: Code duplicated, block: B:305:0x0548  */
    /* JADX WARN: Code duplicated, block: B:306:0x0552  */
    /* JADX WARN: Code duplicated, block: B:311:0x0567  */
    /* JADX WARN: Code duplicated, block: B:314:0x0574  */
    /* JADX WARN: Code duplicated, block: B:317:0x0588  */
    /* JADX WARN: Code duplicated, block: B:321:0x059c  */
    /* JADX WARN: Code duplicated, block: B:334:0x05e3  */
    /* JADX WARN: Code duplicated, block: B:395:0x06a0  */
    /* JADX WARN: Code duplicated, block: B:398:0x06aa  */
    /* JADX WARN: Code duplicated, block: B:399:0x06c4  */
    /* JADX WARN: Code duplicated, block: B:401:0x06c7  */
    /* JADX WARN: Code duplicated, block: B:408:0x06d7  */
    /* JADX WARN: Code duplicated, block: B:409:0x06d9  */
    /* JADX WARN: Code duplicated, block: B:414:0x06e6  */
    /* JADX WARN: Code duplicated, block: B:416:0x06e9  */
    /* JADX WARN: Code duplicated, block: B:426:0x0718  */
    /* JADX WARN: Code duplicated, block: B:427:0x0723  */
    /* JADX WARN: Code duplicated, block: B:429:0x0740  */
    /* JADX WARN: Code duplicated, block: B:458:0x03ad A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:463:0x01ca A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:465:0x01b7 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:468:0x0321 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:470:0x0280 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:474:0x030c A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:477:0x0271 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:47:0x00d6  */
    /* JADX WARN: Code duplicated, block: B:48:0x00e4  */
    /* JADX WARN: Code duplicated, block: B:83:0x01bd  */
    /* JADX WARN: Code duplicated, block: B:88:0x01dc  */
    /* JADX WARN: Code duplicated, block: B:89:0x01df  */
    /* JADX WARN: Code duplicated, block: B:91:0x01f3  */
    /* JADX WARN: Code duplicated, block: B:93:0x01fa  */
    /* JADX WARN: Instruction removed from duplicated block: B:398:0x06aa, please report this as an issue */
    public static final ArrayList f(ExoPlayer exoPlayer, List list) {
        int i;
        String str;
        boolean z;
        ArrayList arrayList;
        Tracks.Group group;
        int i2;
        MediaStream mediaStream;
        int i3;
        Integer numValueOf;
        int iIntValue;
        String strSubstringAfterLast$default;
        ArrayList arrayList2;
        List listDistinct;
        Iterator it;
        String str2;
        Iterator it2;
        int i4;
        Integer numValueOf2;
        int i5;
        Integer numValueOf3;
        Iterator it3;
        int iIntValue2;
        Integer numValueOf4;
        String str3;
        Iterator it4;
        int i6;
        Integer numValueOf5;
        int i7;
        Integer numValueOf6;
        int iIntValue3;
        Integer numValueOf7;
        int iIntValue4;
        String strP;
        String strO;
        int i8;
        int i9;
        String str4;
        boolean z2;
        String str5;
        String string;
        int i10;
        int i11;
        int i12;
        String language;
        String upperCase;
        String str6;
        String str7;
        String lowerCase;
        String str8;
        String lowerCase2;
        String lowerCase3;
        MediaStream mediaStream2;
        ArrayList arrayList3;
        String upperCase2;
        String str9;
        String displayTitle;
        Integer numValueOf8;
        String codec;
        Locale locale;
        String lowerCase4;
        String deliveryUrl;
        exoPlayer.getClass();
        list.getClass();
        ArrayList arrayList4 = new ArrayList();
        ArrayList arrayList5 = new ArrayList();
        for (Object obj : list) {
            if (!((MediaStream) obj).isExternal()) {
                arrayList5.add(obj);
            }
        }
        ArrayList arrayList6 = new ArrayList();
        for (Object obj2 : list) {
            MediaStream mediaStream3 = (MediaStream) obj2;
            if (mediaStream3.isExternal() || mediaStream3.getSupportsExternalStream() || ((deliveryUrl = mediaStream3.getDeliveryUrl()) != null && !StringsKt.isBlank(deliveryUrl))) {
                arrayList6.add(obj2);
            }
        }
        List mutableList = CollectionsKt.toMutableList((Collection) arrayList6);
        at0 groups = exoPlayer.getCurrentTracks().getGroups();
        groups.getClass();
        int size = groups.size();
        int i13 = 0;
        int i14 = 0;
        int i15 = 0;
        while (i15 < size) {
            Object obj3 = groups.get(i15);
            int i16 = i15 + 1;
            int i17 = i13 + 1;
            if (i13 < 0) {
                CollectionsKt.throwIndexOverflow();
            }
            Tracks.Group group2 = (Tracks.Group) obj3;
            if (group2.getType() == 3) {
                TrackGroup mediaTrackGroup = group2.getMediaTrackGroup();
                mediaTrackGroup.getClass();
                int i18 = 0;
                for (int i19 = group2.length; i18 < i19; i19 = i12) {
                    Format trackFormat = group2.getTrackFormat(i18);
                    trackFormat.getClass();
                    boolean zIsTrackSupported = group2.isTrackSupported(i18);
                    String str10 = trackFormat.id;
                    at0 at0Var = groups;
                    int i20 = size;
                    if (str10 == null || !StringsKt__str10.contains("external")) {
                        String str11 = trackFormat.label;
                        i = i16;
                        z = (str11 != null && StringsKt__str11.contains("外挂")) || ((str = trackFormat.label) != null && StringsKt__str.contains("external"));
                        if (!z) {
                            mediaStream = (MediaStream) CollectionsKt.getOrNull(arrayList5, i14);
                            i2 = i14 + 1;
                            arrayList = arrayList5;
                            group = group2;
                        } else if (z || !zIsTrackSupported) {
                            arrayList = arrayList5;
                            group = group2;
                            i2 = i14;
                            mediaStream = null;
                        } else {
                            if (mutableList.isEmpty()) {
                                arrayList = arrayList5;
                                i3 = i14;
                                group = group2;
                            } else {
                                ArrayList arrayList7 = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(mutableList, 10));
                                Iterator it5 = mutableList.iterator();
                                int i21 = 0;
                                while (it5.hasNext()) {
                                    Object next = it5.next();
                                    int i22 = i21 + 1;
                                    if (i21 < 0) {
                                        CollectionsKt.throwIndexOverflow();
                                    }
                                    MediaStream mediaStream4 = (MediaStream) next;
                                    Integer numValueOf9 = Integer.valueOf(i21);
                                    ArrayList arrayList8 = arrayList5;
                                    List listListOfNotNull = CollectionsKt.listOfNotNull((Object[]) new String[]{q(trackFormat.label), q(trackFormat.id)});
                                    ArrayList arrayList9 = new ArrayList();
                                    Iterator it6 = listListOfNotNull.iterator();
                                    while (it6.hasNext()) {
                                        Iterator it7 = it6;
                                        Object next2 = it7.next();
                                        if (!StringsKt.isBlank((String) next2)) {
                                            arrayList9.add(next2);
                                        }
                                        it6 = it7;
                                    }
                                    String strQ = q(mediaStream4.getDisplayTitle());
                                    String strQ2 = q(mediaStream4.getTitle());
                                    String path = mediaStream4.getPath();
                                    if (path == null || (string = StringsKt.trim((CharSequence) path).toString()) == null) {
                                        i14 = i14;
                                    } else {
                                        String str12 = !StringsKt.isBlank(string) ? string : null;
                                        if (str12 != null) {
                                            strSubstringAfterLast$default = StringsKt__StringsKt.substringAfterLast$default(StringsKt__StringsKt.substringAfterLast$default(str12, '/', (String) null, 2, (Object) null), '\\', (String) null, 2, (Object) null);
                                        }
                                        List listListOfNotNull2 = CollectionsKt.listOfNotNull((Object[]) new String[]{strQ, strQ2, q(strSubstringAfterLast$default)});
                                        arrayList2 = new ArrayList();
                                        for (Object obj4 : listListOfNotNull2) {
                                            if (!StringsKt.isBlank((String) obj4)) {
                                                arrayList2.add(obj4);
                                            }
                                        }
                                        listDistinct = CollectionsKt___CollectionsKt.distinct(arrayList2);
                                        it = arrayList9.iterator();
                                        if (it.hasNext()) {
                                            str2 = (String) it.next();
                                            it2 = listDistinct.iterator();
                                            if (it2.hasNext()) {
                                                String str13 = (String) it2.next();
                                                if (!StringsKt.isBlank(str2) || StringsKt.isBlank(str13)) {
                                                    i4 = 0;
                                                } else if (Intrinsics.areEqual(str2, str13)) {
                                                    i4 = 320;
                                                } else if (StringsKt__StringsKt.contains$default(str2, (CharSequence) str13, false, 2, (Object) null) || StringsKt__StringsKt.contains$default(str13, (CharSequence) str2, false, 2, (Object) null)) {
                                                    i4 = 220;
                                                } else {
                                                    i4 = 0;
                                                }
                                                numValueOf2 = Integer.valueOf(i4);
                                                while (it2.hasNext()) {
                                                    Iterator it8 = it;
                                                    String str14 = (String) it2.next();
                                                    if (!StringsKt.isBlank(str2) || StringsKt.isBlank(str14)) {
                                                        i5 = 0;
                                                    } else if (Intrinsics.areEqual(str2, str14)) {
                                                        i5 = 320;
                                                    } else if (StringsKt__StringsKt.contains$default(str2, (CharSequence) str14, false, 2, (Object) null) || StringsKt__StringsKt.contains$default(str14, (CharSequence) str2, false, 2, (Object) null)) {
                                                        i5 = 220;
                                                    } else {
                                                        i5 = 0;
                                                    }
                                                    numValueOf3 = Integer.valueOf(i5);
                                                    if (numValueOf2.compareTo(numValueOf3) < 0) {
                                                        numValueOf2 = numValueOf3;
                                                    }
                                                    it = it8;
                                                }
                                            } else {
                                                numValueOf2 = null;
                                            }
                                            it3 = it;
                                            if (numValueOf2 != null) {
                                                iIntValue2 = numValueOf2.intValue();
                                            } else {
                                                iIntValue2 = 0;
                                            }
                                            numValueOf4 = Integer.valueOf(iIntValue2);
                                            while (it3.hasNext()) {
                                                str3 = (String) it3.next();
                                                it4 = listDistinct.iterator();
                                                if (it4.hasNext()) {
                                                    String str15 = (String) it4.next();
                                                    if (!StringsKt.isBlank(str3) || StringsKt.isBlank(str15)) {
                                                        i6 = 0;
                                                    } else if (Intrinsics.areEqual(str3, str15)) {
                                                        i6 = 320;
                                                    } else if (StringsKt__StringsKt.contains$default(str3, (CharSequence) str15, false, 2, (Object) null) || StringsKt__StringsKt.contains$default(str15, (CharSequence) str3, false, 2, (Object) null)) {
                                                        i6 = 220;
                                                    } else {
                                                        i6 = 0;
                                                    }
                                                    numValueOf5 = Integer.valueOf(i6);
                                                    while (it4.hasNext()) {
                                                        Iterator it9 = it4;
                                                        String str16 = (String) it4.next();
                                                        if (!StringsKt.isBlank(str3) || StringsKt.isBlank(str16)) {
                                                            i7 = 0;
                                                        } else if (Intrinsics.areEqual(str3, str16)) {
                                                            i7 = 320;
                                                        } else if (StringsKt__StringsKt.contains$default(str3, (CharSequence) str16, false, 2, (Object) null) || StringsKt__StringsKt.contains$default(str16, (CharSequence) str3, false, 2, (Object) null)) {
                                                            i7 = 220;
                                                        } else {
                                                            i7 = 0;
                                                        }
                                                        numValueOf6 = Integer.valueOf(i7);
                                                        if (numValueOf5.compareTo(numValueOf6) < 0) {
                                                            numValueOf5 = numValueOf6;
                                                        }
                                                        it4 = it9;
                                                    }
                                                } else {
                                                    numValueOf5 = null;
                                                }
                                                if (numValueOf5 != null) {
                                                    iIntValue3 = numValueOf5.intValue();
                                                } else {
                                                    iIntValue3 = 0;
                                                }
                                                numValueOf7 = Integer.valueOf(iIntValue3);
                                                if (numValueOf4.compareTo(numValueOf7) < 0) {
                                                    numValueOf4 = numValueOf7;
                                                }
                                            }
                                        } else {
                                            numValueOf4 = null;
                                        }
                                        if (numValueOf4 != null) {
                                            iIntValue4 = numValueOf4.intValue();
                                        } else {
                                            iIntValue4 = 0;
                                        }
                                        strP = p(trackFormat.language);
                                        String strP2 = p(mediaStream4.getLanguage());
                                        if (strP != null && Intrinsics.areEqual(strP, strP2)) {
                                            iIntValue4 += 90;
                                        }
                                        strO = o(trackFormat.sampleMimeType, trackFormat.codecs, trackFormat.label);
                                        i8 = iIntValue4;
                                        Tracks.Group group3 = group2;
                                        String strO2 = o(mediaStream4.getCodec(), mediaStream4.getCodec(), CollectionsKt___CollectionsKt.joinToString$default(CollectionsKt.listOfNotNull((Object[]) new String[]{mediaStream4.getDisplayTitle(), mediaStream4.getTitle()}), " ", null, null, 0, null, null, 62, null));
                                        if (strO == null && Intrinsics.areEqual(strO, strO2)) {
                                            i9 = i8 + 60;
                                        } else {
                                            i9 = i8;
                                        }
                                        str4 = trackFormat.label;
                                        if (str4 != null) {
                                            z2 = true;
                                            if (StringsKt__StringsKt.contains(str4, (CharSequence) "forced", true)) {
                                                if (mediaStream4.isForced()) {
                                                    i9 += 20;
                                                }
                                            }
                                            arrayList7.add(TuplesKt.to(numValueOf9, Integer.valueOf(i9)));
                                            i21 = i22;
                                            arrayList5 = arrayList8;
                                            i14 = i14;
                                            it5 = it5;
                                            group2 = group3;
                                        } else {
                                            z2 = true;
                                        }
                                        str5 = trackFormat.label;
                                        if (str5 == null && StringsKt__str5.contains("强制") == z2) {
                                            if (mediaStream4.isForced()) {
                                                i9 += 20;
                                            }
                                        }
                                        arrayList7.add(TuplesKt.to(numValueOf9, Integer.valueOf(i9)));
                                        i21 = i22;
                                        arrayList5 = arrayList8;
                                        i14 = i14;
                                        it5 = it5;
                                        group2 = group3;
                                    }
                                    strSubstringAfterLast$default = null;
                                    List listListOfNotNull3 = CollectionsKt.listOfNotNull((Object[]) new String[]{strQ, strQ2, q(strSubstringAfterLast$default)});
                                    arrayList2 = new ArrayList();
                                    while (r1.hasNext()) {
                                        if (!StringsKt.isBlank((String) obj4)) {
                                            arrayList2.add(obj4);
                                        }
                                    }
                                    listDistinct = CollectionsKt___CollectionsKt.distinct(arrayList2);
                                    it = arrayList9.iterator();
                                    if (it.hasNext()) {
                                        numValueOf4 = null;
                                    } else {
                                        str2 = (String) it.next();
                                        it2 = listDistinct.iterator();
                                        if (it2.hasNext()) {
                                            numValueOf2 = null;
                                        } else {
                                            String str17 = (String) it2.next();
                                            if (StringsKt.isBlank(str2)) {
                                                i4 = 0;
                                            } else {
                                                i4 = 0;
                                            }
                                            numValueOf2 = Integer.valueOf(i4);
                                            while (it2.hasNext()) {
                                                Iterator it10 = it;
                                                String str18 = (String) it2.next();
                                                if (StringsKt.isBlank(str2)) {
                                                    i5 = 0;
                                                } else {
                                                    i5 = 0;
                                                }
                                                numValueOf3 = Integer.valueOf(i5);
                                                if (numValueOf2.compareTo(numValueOf3) < 0) {
                                                    numValueOf2 = numValueOf3;
                                                }
                                                it = it10;
                                            }
                                        }
                                        it3 = it;
                                        if (numValueOf2 != null) {
                                            iIntValue2 = numValueOf2.intValue();
                                        } else {
                                            iIntValue2 = 0;
                                        }
                                        numValueOf4 = Integer.valueOf(iIntValue2);
                                        while (it3.hasNext()) {
                                            str3 = (String) it3.next();
                                            it4 = listDistinct.iterator();
                                            if (it4.hasNext()) {
                                                numValueOf5 = null;
                                            } else {
                                                String str19 = (String) it4.next();
                                                if (StringsKt.isBlank(str3)) {
                                                    i6 = 0;
                                                } else {
                                                    i6 = 0;
                                                }
                                                numValueOf5 = Integer.valueOf(i6);
                                                while (it4.hasNext()) {
                                                    Iterator it11 = it4;
                                                    String str110 = (String) it4.next();
                                                    if (StringsKt.isBlank(str3)) {
                                                        i7 = 0;
                                                    } else {
                                                        i7 = 0;
                                                    }
                                                    numValueOf6 = Integer.valueOf(i7);
                                                    if (numValueOf5.compareTo(numValueOf6) < 0) {
                                                        numValueOf5 = numValueOf6;
                                                    }
                                                    it4 = it11;
                                                }
                                            }
                                            if (numValueOf5 != null) {
                                                iIntValue3 = numValueOf5.intValue();
                                            } else {
                                                iIntValue3 = 0;
                                            }
                                            numValueOf7 = Integer.valueOf(iIntValue3);
                                            if (numValueOf4.compareTo(numValueOf7) < 0) {
                                                numValueOf4 = numValueOf7;
                                            }
                                        }
                                    }
                                    if (numValueOf4 != null) {
                                        iIntValue4 = numValueOf4.intValue();
                                    } else {
                                        iIntValue4 = 0;
                                    }
                                    strP = p(trackFormat.language);
                                    String strP3 = p(mediaStream4.getLanguage());
                                    if (strP != null) {
                                        iIntValue4 += 90;
                                    }
                                    strO = o(trackFormat.sampleMimeType, trackFormat.codecs, trackFormat.label);
                                    i8 = iIntValue4;
                                    Tracks.Group group4 = group2;
                                    String strO3 = o(mediaStream4.getCodec(), mediaStream4.getCodec(), CollectionsKt___CollectionsKt.joinToString$default(CollectionsKt.listOfNotNull((Object[]) new String[]{mediaStream4.getDisplayTitle(), mediaStream4.getTitle()}), " ", null, null, 0, null, null, 62, null));
                                    if (strO == null) {
                                        i9 = i8;
                                    } else {
                                        i9 = i8;
                                    }
                                    str4 = trackFormat.label;
                                    if (str4 != null) {
                                        z2 = true;
                                        if (StringsKt__StringsKt.contains(str4, (CharSequence) "forced", true)) {
                                            if (mediaStream4.isForced()) {
                                                i9 += 20;
                                            }
                                        }
                                        arrayList7.add(TuplesKt.to(numValueOf9, Integer.valueOf(i9)));
                                        i21 = i22;
                                        arrayList5 = arrayList8;
                                        i14 = i14;
                                        it5 = it5;
                                        group2 = group4;
                                    } else {
                                        z2 = true;
                                    }
                                    str5 = trackFormat.label;
                                    if (str5 == null) {
                                    }
                                    arrayList7.add(TuplesKt.to(numValueOf9, Integer.valueOf(i9)));
                                    i21 = i22;
                                    arrayList5 = arrayList8;
                                    i14 = i14;
                                    it5 = it5;
                                    group2 = group4;
                                }
                                arrayList = arrayList5;
                                i3 = i14;
                                group = group2;
                                Iterator it12 = arrayList7.iterator();
                                if (it12.hasNext()) {
                                    numValueOf = Integer.valueOf(((Number) ((Pair) it12.next()).getSecond()).intValue());
                                    while (it12.hasNext()) {
                                        Integer numValueOf10 = Integer.valueOf(((Number) ((Pair) it12.next()).getSecond()).intValue());
                                        if (numValueOf.compareTo(numValueOf10) < 0) {
                                            numValueOf = numValueOf10;
                                        }
                                    }
                                } else {
                                    numValueOf = null;
                                }
                                if (numValueOf != null && (iIntValue = numValueOf.intValue()) >= 200) {
                                    ArrayList arrayList10 = new ArrayList();
                                    int size2 = arrayList7.size();
                                    int i23 = 0;
                                    while (i23 < size2) {
                                        Object obj5 = arrayList7.get(i23);
                                        i23++;
                                        if (((Number) ((Pair) obj5).getSecond()).intValue() == iIntValue) {
                                            arrayList10.add(obj5);
                                        }
                                    }
                                    if (arrayList10.size() == 1) {
                                        mediaStream = (MediaStream) mutableList.remove(((Number) ((Pair) CollectionsKt.single((List) arrayList10)).getFirst()).intValue());
                                    }
                                }
                                i2 = i3;
                            }
                            mediaStream = null;
                            i2 = i3;
                        }
                        if (zIsTrackSupported) {
                            if (mediaStream != null || (language = mediaStream.getLanguage()) == null) {
                                language = trackFormat.language;
                            }
                            if (language == null) {
                                upperCase = "Unknown";
                            } else {
                                if (StringsKt.isBlank(language)) {
                                    language = null;
                                }
                                if (language != null) {
                                    locale = Locale.ROOT;
                                    lowerCase4 = language.toLowerCase(locale);
                                    lowerCase4.getClass();
                                    switch (lowerCase4) {
                                        case "zh-hans":
                                            upperCase = "Chinese Simplified";
                                            break;
                                        case "zh-hant":
                                            upperCase = "Chinese Traditional";
                                            break;
                                        case "en":
                                            upperCase = "English";
                                            break;
                                        case "ja":
                                            upperCase = "Japanese";
                                            break;
                                        case "ko":
                                            upperCase = "Korean";
                                            break;
                                        case "zh":
                                        case "chi":
                                            upperCase = "Chinese Simplified";
                                            break;
                                        case "eng":
                                            upperCase = "English";
                                            break;
                                        case "jpn":
                                            upperCase = "Japanese";
                                            break;
                                        case "kor":
                                            upperCase = "Korean";
                                            break;
                                        case "zho":
                                        case "zh-cn":
                                            upperCase = "Chinese Simplified";
                                            break;
                                        case "zh-hk":
                                        case "zh-tw":
                                            upperCase = "Chinese Traditional";
                                            break;
                                        default:
                                            upperCase = language.toUpperCase(locale);
                                            upperCase.getClass();
                                            break;
                                    }
                                } else {
                                    upperCase = "Unknown";
                                }
                            }
                            str6 = trackFormat.sampleMimeType;
                            if (str6 == null) {
                                str6 = "";
                            }
                            str7 = trackFormat.label;
                            if (str7 != null) {
                                lowerCase = str7.toLowerCase(Locale.ROOT);
                                lowerCase.getClass();
                            } else {
                                lowerCase = "";
                            }
                            str8 = trackFormat.codecs;
                            if (str8 != null) {
                                lowerCase2 = str8.toLowerCase(Locale.ROOT);
                                lowerCase2.getClass();
                            } else {
                                lowerCase2 = "";
                            }
                            if (mediaStream != null || (codec = mediaStream.getCodec()) == null) {
                                lowerCase3 = "";
                            } else {
                                lowerCase3 = codec.toLowerCase(Locale.ROOT);
                                lowerCase3.getClass();
                            }
                            if (StringsKt__lowerCase3.contains("pgs")) {
                                mediaStream2 = mediaStream;
                            } else {
                                mediaStream2 = mediaStream;
                                if (StringsKt__lowerCase3.contains("hdmv_pgs")) {
                                    if (!StringsKt__lowerCase3.contains("ass") || StringsKt__lowerCase3.contains("ssa")) {
                                        arrayList3 = arrayList4;
                                        i10 = i2;
                                        i11 = i17;
                                        i12 = i19;
                                    } else {
                                        i10 = i2;
                                        if (StringsKt__lowerCase3.contains("srt")) {
                                            i11 = i17;
                                        } else {
                                            i11 = i17;
                                            if (!StringsKt__lowerCase3.contains("subrip")) {
                                                i12 = i19;
                                                if (StringsKt__lowerCase3.contains("vtt")) {
                                                    arrayList3 = arrayList4;
                                                } else {
                                                    arrayList3 = arrayList4;
                                                    if (!StringsKt__lowerCase3.contains("webvtt")) {
                                                        if (StringsKt__lowerCase3.contains("dvb")) {
                                                            upperCase2 = "DVB";
                                                        } else if (!StringsKt__str6.contains("ass") && !StringsKt__str6.contains("ssa")) {
                                                            if (!StringsKt__str6.contains("subrip") && !StringsKt__str6.contains("srt")) {
                                                                if (!StringsKt__str6.contains("vtt")) {
                                                                    if (!StringsKt__str6.contains("pgs")) {
                                                                        if (StringsKt__str6.contains("dvbsub")) {
                                                                            upperCase2 = "DVB";
                                                                        } else {
                                                                            if (StringsKt__str6.contains("x-media3-cues")) {
                                                                                if (!StringsKt__lowerCase.contains("ass") && !StringsKt__lowerCase.contains("ssa")) {
                                                                                    if (!StringsKt__lowerCase.contains("srt") && !StringsKt__lowerCase.contains("subrip")) {
                                                                                        if (!StringsKt__lowerCase.contains("vtt")) {
                                                                                            if (!StringsKt__lowerCase.contains("pgs")) {
                                                                                                if (StringsKt__lowerCase.contains("dvb")) {
                                                                                                    upperCase2 = "DVB";
                                                                                                } else if (!StringsKt__lowerCase2.contains("ass") && !StringsKt__lowerCase2.contains("ssa")) {
                                                                                                    if (StringsKt__lowerCase2.contains("srt") || StringsKt__lowerCase2.contains("subrip")) {
                                                                                                    }
                                                                                                }
                                                                                            }
                                                                                        }
                                                                                    }
                                                                                }
                                                                            } else if (!StringsKt.isBlank(str6) && !StringsKt__str6.contains("x-media3")) {
                                                                                upperCase2 = StringsKt__StringsKt.substringAfter$default(str6, "/", (String) null, 2, (Object) null).toUpperCase(Locale.ROOT);
                                                                                upperCase2.getClass();
                                                                            }
                                                                            upperCase2 = "";
                                                                        }
                                                                    }
                                                                }
                                                            }
                                                        }
                                                    }
                                                    if (StringsKt.isBlank(upperCase2)) {
                                                        str9 = upperCase;
                                                    } else {
                                                        str9 = upperCase + " (" + upperCase2 + ")";
                                                    }
                                                    if (mediaStream2 != null || (displayTitle = mediaStream2.getTitle()) == null) {
                                                        if (mediaStream2 != null || (displayTitle = mediaStream2.getDisplayTitle()) == null || StringsKt.isBlank(displayTitle)) {
                                                            displayTitle = null;
                                                        }
                                                        if (displayTitle == null && ((displayTitle = trackFormat.label) == null || StringsKt.isBlank(displayTitle) || Intrinsics.areEqual(displayTitle, upperCase))) {
                                                            displayTitle = null;
                                                        }
                                                    } else {
                                                        if (StringsKt.isBlank(displayTitle)) {
                                                            displayTitle = null;
                                                        }
                                                        if (displayTitle == null) {
                                                            if (mediaStream2 != null) {
                                                                displayTitle = null;
                                                            } else {
                                                                displayTitle = null;
                                                            }
                                                            if (displayTitle == null) {
                                                                displayTitle = null;
                                                            }
                                                        }
                                                    }
                                                    String str20 = i13 + "_" + i18;
                                                    g52 g52Var = new g52(mediaTrackGroup, i18);
                                                    if (mediaStream2 != null) {
                                                        numValueOf8 = Integer.valueOf(mediaStream2.getIndex());
                                                    } else {
                                                        numValueOf8 = null;
                                                    }
                                                    h42 h42Var = new h42(str20, str9, displayTitle, g52Var, numValueOf8, r(str9, displayTitle), SubtitleFormatPriorityType.INSTANCE.fromLabel(upperCase2));
                                                    arrayList4 = arrayList3;
                                                    arrayList4.add(h42Var);
                                                }
                                                upperCase2 = "VTT";
                                                if (StringsKt.isBlank(upperCase2)) {
                                                    str9 = upperCase + " (" + upperCase2 + ")";
                                                } else {
                                                    str9 = upperCase;
                                                }
                                                if (mediaStream2 != null) {
                                                    if (mediaStream2 != null) {
                                                        displayTitle = null;
                                                    } else {
                                                        displayTitle = null;
                                                    }
                                                    if (displayTitle == null) {
                                                        displayTitle = null;
                                                    }
                                                } else {
                                                    if (mediaStream2 != null) {
                                                        displayTitle = null;
                                                    } else {
                                                        displayTitle = null;
                                                    }
                                                    if (displayTitle == null) {
                                                        displayTitle = null;
                                                    }
                                                }
                                                String str21 = i13 + "_" + i18;
                                                g52 g52Var2 = new g52(mediaTrackGroup, i18);
                                                if (mediaStream2 != null) {
                                                    numValueOf8 = Integer.valueOf(mediaStream2.getIndex());
                                                } else {
                                                    numValueOf8 = null;
                                                }
                                                h42 h42Var2 = new h42(str21, str9, displayTitle, g52Var2, numValueOf8, r(str9, displayTitle), SubtitleFormatPriorityType.INSTANCE.fromLabel(upperCase2));
                                                arrayList4 = arrayList3;
                                                arrayList4.add(h42Var2);
                                            }
                                            upperCase2 = "SRT";
                                            if (StringsKt.isBlank(upperCase2)) {
                                                str9 = upperCase + " (" + upperCase2 + ")";
                                            } else {
                                                str9 = upperCase;
                                            }
                                            if (mediaStream2 != null) {
                                                if (mediaStream2 != null) {
                                                    displayTitle = null;
                                                } else {
                                                    displayTitle = null;
                                                }
                                                if (displayTitle == null) {
                                                    displayTitle = null;
                                                }
                                            } else {
                                                if (mediaStream2 != null) {
                                                    displayTitle = null;
                                                } else {
                                                    displayTitle = null;
                                                }
                                                if (displayTitle == null) {
                                                    displayTitle = null;
                                                }
                                            }
                                            String str22 = i13 + "_" + i18;
                                            g52 g52Var3 = new g52(mediaTrackGroup, i18);
                                            if (mediaStream2 != null) {
                                                numValueOf8 = Integer.valueOf(mediaStream2.getIndex());
                                            } else {
                                                numValueOf8 = null;
                                            }
                                            h42 h42Var3 = new h42(str22, str9, displayTitle, g52Var3, numValueOf8, r(str9, displayTitle), SubtitleFormatPriorityType.INSTANCE.fromLabel(upperCase2));
                                            arrayList4 = arrayList3;
                                            arrayList4.add(h42Var3);
                                        }
                                        arrayList3 = arrayList4;
                                        i12 = i19;
                                        upperCase2 = "SRT";
                                        if (StringsKt.isBlank(upperCase2)) {
                                            str9 = upperCase + " (" + upperCase2 + ")";
                                        } else {
                                            str9 = upperCase;
                                        }
                                        if (mediaStream2 != null) {
                                            if (mediaStream2 != null) {
                                                displayTitle = null;
                                            } else {
                                                displayTitle = null;
                                            }
                                            if (displayTitle == null) {
                                                displayTitle = null;
                                            }
                                        } else {
                                            if (mediaStream2 != null) {
                                                displayTitle = null;
                                            } else {
                                                displayTitle = null;
                                            }
                                            if (displayTitle == null) {
                                                displayTitle = null;
                                            }
                                        }
                                        String str23 = i13 + "_" + i18;
                                        g52 g52Var4 = new g52(mediaTrackGroup, i18);
                                        if (mediaStream2 != null) {
                                            numValueOf8 = Integer.valueOf(mediaStream2.getIndex());
                                        } else {
                                            numValueOf8 = null;
                                        }
                                        h42 h42Var4 = new h42(str23, str9, displayTitle, g52Var4, numValueOf8, r(str9, displayTitle), SubtitleFormatPriorityType.INSTANCE.fromLabel(upperCase2));
                                        arrayList4 = arrayList3;
                                        arrayList4.add(h42Var4);
                                    }
                                    upperCase2 = "ASS";
                                    if (StringsKt.isBlank(upperCase2)) {
                                        str9 = upperCase + " (" + upperCase2 + ")";
                                    } else {
                                        str9 = upperCase;
                                    }
                                    if (mediaStream2 != null) {
                                        if (mediaStream2 != null) {
                                            displayTitle = null;
                                        } else {
                                            displayTitle = null;
                                        }
                                        if (displayTitle == null) {
                                            displayTitle = null;
                                        }
                                    } else {
                                        if (mediaStream2 != null) {
                                            displayTitle = null;
                                        } else {
                                            displayTitle = null;
                                        }
                                        if (displayTitle == null) {
                                            displayTitle = null;
                                        }
                                    }
                                    String str24 = i13 + "_" + i18;
                                    g52 g52Var5 = new g52(mediaTrackGroup, i18);
                                    if (mediaStream2 != null) {
                                        numValueOf8 = Integer.valueOf(mediaStream2.getIndex());
                                    } else {
                                        numValueOf8 = null;
                                    }
                                    h42 h42Var5 = new h42(str24, str9, displayTitle, g52Var5, numValueOf8, r(str9, displayTitle), SubtitleFormatPriorityType.INSTANCE.fromLabel(upperCase2));
                                    arrayList4 = arrayList3;
                                    arrayList4.add(h42Var5);
                                }
                                upperCase2 = "PGS";
                                if (StringsKt.isBlank(upperCase2)) {
                                    str9 = upperCase + " (" + upperCase2 + ")";
                                } else {
                                    str9 = upperCase;
                                }
                                if (mediaStream2 != null) {
                                    if (mediaStream2 != null) {
                                        displayTitle = null;
                                    } else {
                                        displayTitle = null;
                                    }
                                    if (displayTitle == null) {
                                        displayTitle = null;
                                    }
                                } else {
                                    if (mediaStream2 != null) {
                                        displayTitle = null;
                                    } else {
                                        displayTitle = null;
                                    }
                                    if (displayTitle == null) {
                                        displayTitle = null;
                                    }
                                }
                                String str25 = i13 + "_" + i18;
                                g52 g52Var6 = new g52(mediaTrackGroup, i18);
                                if (mediaStream2 != null) {
                                    numValueOf8 = Integer.valueOf(mediaStream2.getIndex());
                                } else {
                                    numValueOf8 = null;
                                }
                                h42 h42Var6 = new h42(str25, str9, displayTitle, g52Var6, numValueOf8, r(str9, displayTitle), SubtitleFormatPriorityType.INSTANCE.fromLabel(upperCase2));
                                arrayList4 = arrayList3;
                                arrayList4.add(h42Var6);
                            }
                            arrayList3 = arrayList4;
                            i10 = i2;
                            i11 = i17;
                            i12 = i19;
                            upperCase2 = "PGS";
                            if (StringsKt.isBlank(upperCase2)) {
                                str9 = upperCase + " (" + upperCase2 + ")";
                            } else {
                                str9 = upperCase;
                            }
                            if (mediaStream2 != null) {
                                if (mediaStream2 != null) {
                                    displayTitle = null;
                                } else {
                                    displayTitle = null;
                                }
                                if (displayTitle == null) {
                                    displayTitle = null;
                                }
                            } else {
                                if (mediaStream2 != null) {
                                    displayTitle = null;
                                } else {
                                    displayTitle = null;
                                }
                                if (displayTitle == null) {
                                    displayTitle = null;
                                }
                            }
                            String str26 = i13 + "_" + i18;
                            g52 g52Var7 = new g52(mediaTrackGroup, i18);
                            if (mediaStream2 != null) {
                                numValueOf8 = Integer.valueOf(mediaStream2.getIndex());
                            } else {
                                numValueOf8 = null;
                            }
                            h42 h42Var7 = new h42(str26, str9, displayTitle, g52Var7, numValueOf8, r(str9, displayTitle), SubtitleFormatPriorityType.INSTANCE.fromLabel(upperCase2));
                            arrayList4 = arrayList3;
                            arrayList4.add(h42Var7);
                        } else {
                            mutableList = mutableList;
                            i10 = i2;
                            i11 = i17;
                            i12 = i19;
                        }
                        i18++;
                        groups = at0Var;
                        size = i20;
                        i16 = i;
                        mutableList = mutableList;
                        arrayList5 = arrayList;
                        i14 = i10;
                        group2 = group;
                        i17 = i11;
                    } else {
                        i = i16;
                    }
                    if (!z) {
                        mediaStream = (MediaStream) CollectionsKt.getOrNull(arrayList5, i14);
                        i2 = i14 + 1;
                        arrayList = arrayList5;
                        group = group2;
                    } else if (z) {
                        arrayList = arrayList5;
                        group = group2;
                        i2 = i14;
                        mediaStream = null;
                    } else {
                        arrayList = arrayList5;
                        group = group2;
                        i2 = i14;
                        mediaStream = null;
                    }
                    if (zIsTrackSupported) {
                        if (mediaStream != null) {
                            language = trackFormat.language;
                        } else {
                            language = trackFormat.language;
                        }
                        if (language == null) {
                            upperCase = "Unknown";
                        } else {
                            if (StringsKt.isBlank(language)) {
                                language = null;
                            }
                            if (language != null) {
                                locale = Locale.ROOT;
                                lowerCase4 = language.toLowerCase(locale);
                                lowerCase4.getClass();
                                switch (lowerCase4) {
                                    case -371515459:
                                        if (!lowerCase4.equals("zh-hans")) {
                                            upperCase = language.toUpperCase(locale);
                                            upperCase.getClass();
                                        } else {
                                            upperCase = "Chinese Simplified";
                                        }
                                        break;
                                    case -371515458:
                                        if (!lowerCase4.equals("zh-hant")) {
                                            upperCase = language.toUpperCase(locale);
                                            upperCase.getClass();
                                        } else {
                                            upperCase = "Chinese Traditional";
                                        }
                                        break;
                                    case 3241:
                                        if (!lowerCase4.equals("en")) {
                                            upperCase = language.toUpperCase(locale);
                                            upperCase.getClass();
                                        } else {
                                            upperCase = "English";
                                        }
                                        break;
                                    case 3383:
                                        if (!lowerCase4.equals("ja")) {
                                            upperCase = language.toUpperCase(locale);
                                            upperCase.getClass();
                                        } else {
                                            upperCase = "Japanese";
                                        }
                                        break;
                                    case 3428:
                                        if (!lowerCase4.equals("ko")) {
                                            upperCase = language.toUpperCase(locale);
                                            upperCase.getClass();
                                        } else {
                                            upperCase = "Korean";
                                        }
                                        break;
                                    case 3886:
                                        if (!lowerCase4.equals("zh")) {
                                            upperCase = language.toUpperCase(locale);
                                            upperCase.getClass();
                                        } else {
                                            upperCase = "Chinese Simplified";
                                        }
                                        break;
                                    case 98468:
                                        if (!lowerCase4.equals("chi")) {
                                            upperCase = language.toUpperCase(locale);
                                            upperCase.getClass();
                                        } else {
                                            upperCase = "Chinese Simplified";
                                        }
                                        break;
                                    case 100574:
                                        if (!lowerCase4.equals("eng")) {
                                            upperCase = language.toUpperCase(locale);
                                            upperCase.getClass();
                                        } else {
                                            upperCase = "English";
                                        }
                                        break;
                                    case 105448:
                                        if (!lowerCase4.equals("jpn")) {
                                            upperCase = language.toUpperCase(locale);
                                            upperCase.getClass();
                                        } else {
                                            upperCase = "Japanese";
                                        }
                                        break;
                                    case 106382:
                                        if (!lowerCase4.equals("kor")) {
                                            upperCase = language.toUpperCase(locale);
                                            upperCase.getClass();
                                        } else {
                                            upperCase = "Korean";
                                        }
                                        break;
                                    case 120577:
                                        if (!lowerCase4.equals("zho")) {
                                            upperCase = language.toUpperCase(locale);
                                            upperCase.getClass();
                                        } else {
                                            upperCase = "Chinese Simplified";
                                        }
                                        break;
                                    case 115814250:
                                        if (!lowerCase4.equals("zh-cn")) {
                                            upperCase = language.toUpperCase(locale);
                                            upperCase.getClass();
                                        } else {
                                            upperCase = "Chinese Simplified";
                                        }
                                        break;
                                    case 115814402:
                                        if (!lowerCase4.equals("zh-hk")) {
                                            upperCase = language.toUpperCase(locale);
                                            upperCase.getClass();
                                        } else {
                                            upperCase = "Chinese Traditional";
                                        }
                                        break;
                                    case 115814786:
                                        if (!lowerCase4.equals("zh-tw")) {
                                            upperCase = language.toUpperCase(locale);
                                            upperCase.getClass();
                                        } else {
                                            upperCase = "Chinese Traditional";
                                        }
                                        break;
                                    default:
                                        upperCase = language.toUpperCase(locale);
                                        upperCase.getClass();
                                        break;
                                }
                            } else {
                                upperCase = "Unknown";
                            }
                        }
                        str6 = trackFormat.sampleMimeType;
                        if (str6 == null) {
                            str6 = "";
                        }
                        str7 = trackFormat.label;
                        if (str7 != null) {
                            lowerCase = str7.toLowerCase(Locale.ROOT);
                            lowerCase.getClass();
                        } else {
                            lowerCase = "";
                        }
                        str8 = trackFormat.codecs;
                        if (str8 != null) {
                            lowerCase2 = str8.toLowerCase(Locale.ROOT);
                            lowerCase2.getClass();
                        } else {
                            lowerCase2 = "";
                        }
                        if (mediaStream != null) {
                            lowerCase3 = "";
                        } else {
                            lowerCase3 = "";
                        }
                        if (StringsKt__lowerCase3.contains("pgs")) {
                            mediaStream2 = mediaStream;
                            if (StringsKt__lowerCase3.contains("hdmv_pgs")) {
                                if (StringsKt__lowerCase3.contains("ass")) {
                                    arrayList3 = arrayList4;
                                    i10 = i2;
                                    i11 = i17;
                                    i12 = i19;
                                    upperCase2 = "ASS";
                                } else {
                                    arrayList3 = arrayList4;
                                    i10 = i2;
                                    i11 = i17;
                                    i12 = i19;
                                    upperCase2 = "ASS";
                                }
                                if (StringsKt.isBlank(upperCase2)) {
                                    str9 = upperCase + " (" + upperCase2 + ")";
                                } else {
                                    str9 = upperCase;
                                }
                                if (mediaStream2 != null) {
                                    if (mediaStream2 != null) {
                                        displayTitle = null;
                                    } else {
                                        displayTitle = null;
                                    }
                                    if (displayTitle == null) {
                                        displayTitle = null;
                                    }
                                } else {
                                    if (mediaStream2 != null) {
                                        displayTitle = null;
                                    } else {
                                        displayTitle = null;
                                    }
                                    if (displayTitle == null) {
                                        displayTitle = null;
                                    }
                                }
                                String str27 = i13 + "_" + i18;
                                g52 g52Var8 = new g52(mediaTrackGroup, i18);
                                if (mediaStream2 != null) {
                                    numValueOf8 = Integer.valueOf(mediaStream2.getIndex());
                                } else {
                                    numValueOf8 = null;
                                }
                                h42 h42Var8 = new h42(str27, str9, displayTitle, g52Var8, numValueOf8, r(str9, displayTitle), SubtitleFormatPriorityType.INSTANCE.fromLabel(upperCase2));
                                arrayList4 = arrayList3;
                                arrayList4.add(h42Var8);
                            }
                            upperCase2 = "PGS";
                            if (StringsKt.isBlank(upperCase2)) {
                                str9 = upperCase + " (" + upperCase2 + ")";
                            } else {
                                str9 = upperCase;
                            }
                            if (mediaStream2 != null) {
                                if (mediaStream2 != null) {
                                    displayTitle = null;
                                } else {
                                    displayTitle = null;
                                }
                                if (displayTitle == null) {
                                    displayTitle = null;
                                }
                            } else {
                                if (mediaStream2 != null) {
                                    displayTitle = null;
                                } else {
                                    displayTitle = null;
                                }
                                if (displayTitle == null) {
                                    displayTitle = null;
                                }
                            }
                            String str28 = i13 + "_" + i18;
                            g52 g52Var9 = new g52(mediaTrackGroup, i18);
                            if (mediaStream2 != null) {
                                numValueOf8 = Integer.valueOf(mediaStream2.getIndex());
                            } else {
                                numValueOf8 = null;
                            }
                            h42 h42Var9 = new h42(str28, str9, displayTitle, g52Var9, numValueOf8, r(str9, displayTitle), SubtitleFormatPriorityType.INSTANCE.fromLabel(upperCase2));
                            arrayList4 = arrayList3;
                            arrayList4.add(h42Var9);
                        } else {
                            mediaStream2 = mediaStream;
                        }
                        arrayList3 = arrayList4;
                        i10 = i2;
                        i11 = i17;
                        i12 = i19;
                        upperCase2 = "PGS";
                        if (StringsKt.isBlank(upperCase2)) {
                            str9 = upperCase + " (" + upperCase2 + ")";
                        } else {
                            str9 = upperCase;
                        }
                        if (mediaStream2 != null) {
                            if (mediaStream2 != null) {
                                displayTitle = null;
                            } else {
                                displayTitle = null;
                            }
                            if (displayTitle == null) {
                                displayTitle = null;
                            }
                        } else {
                            if (mediaStream2 != null) {
                                displayTitle = null;
                            } else {
                                displayTitle = null;
                            }
                            if (displayTitle == null) {
                                displayTitle = null;
                            }
                        }
                        String str29 = i13 + "_" + i18;
                        g52 g52Var10 = new g52(mediaTrackGroup, i18);
                        if (mediaStream2 != null) {
                            numValueOf8 = Integer.valueOf(mediaStream2.getIndex());
                        } else {
                            numValueOf8 = null;
                        }
                        h42 h42Var10 = new h42(str29, str9, displayTitle, g52Var10, numValueOf8, r(str9, displayTitle), SubtitleFormatPriorityType.INSTANCE.fromLabel(upperCase2));
                        arrayList4 = arrayList3;
                        arrayList4.add(h42Var10);
                    } else {
                        mutableList = mutableList;
                        i10 = i2;
                        i11 = i17;
                        i12 = i19;
                    }
                    i18++;
                    groups = at0Var;
                    size = i20;
                    i16 = i;
                    mutableList = mutableList;
                    arrayList5 = arrayList;
                    i14 = i10;
                    group2 = group;
                    i17 = i11;
                }
            }
            groups = groups;
            size = size;
            i15 = i16;
            mutableList = mutableList;
            arrayList5 = arrayList5;
            i13 = i17;
        }
        return arrayList4;
    }

    public static final String g(h42 h42Var) {
        h42Var.getClass();
        String str = h42Var.b;
        String str2 = h42Var.c;
        if (str2 == null) {
            str2 = "";
        }
        f42 f42VarE = e(str, str2);
        boolean z = f42VarE.d;
        boolean z2 = f42VarE.g;
        boolean z3 = f42VarE.a;
        if (z3 && z && z2) {
            return "简体中文+英文双语";
        }
        if (z3 && z2) {
            return "简体中文双语";
        }
        if (z3) {
            return "简体中文";
        }
        boolean z4 = f42VarE.b;
        if (z4 && z && z2) {
            return "繁体中文+英文双语";
        }
        if (z4 && z2) {
            return "繁体中文双语";
        }
        if (z4) {
            return "繁体中文";
        }
        boolean z5 = f42VarE.c;
        if (z5 && z && z2) {
            return "中文+英文双语";
        }
        if (z5 && z2) {
            return "中文双语";
        }
        if (z5) {
            return "中文";
        }
        if (z) {
            return "英文";
        }
        if (f42VarE.e) {
            return "日文";
        }
        return f42VarE.f ? "韩文" : "其他";
    }

    public static final String h(String str) {
        str.getClass();
        f42 f42VarE = e(str, "");
        boolean z = f42VarE.d;
        boolean z2 = f42VarE.g;
        boolean z3 = f42VarE.a;
        if (z3 && z && z2) {
            return "简体中文+英文双语";
        }
        if (z3 && z2) {
            return "简体中文双语";
        }
        if (z3) {
            return "简体中文";
        }
        boolean z4 = f42VarE.b;
        if (z4 && z && z2) {
            return "繁体中文+英文双语";
        }
        if (z4 && z2) {
            return "繁体中文双语";
        }
        if (z4) {
            return "繁体中文";
        }
        boolean z5 = f42VarE.c;
        if (z5 && z && z2) {
            return "中文+英文双语";
        }
        if (z5 && z2) {
            return "中文双语";
        }
        if (z5) {
            return "中文";
        }
        if (z) {
            return "英文";
        }
        if (f42VarE.e) {
            return "日文";
        }
        return f42VarE.f ? "韩文" : "其他";
    }

    public static final h42 i(ArrayList arrayList, SubtitlePreferences.MovieSubtitlePref movieSubtitlePref) {
        boolean z;
        Object obj;
        Integer num;
        Integer currentApiStreamIndex = movieSubtitlePref.getCurrentApiStreamIndex();
        Object obj2 = null;
        if (currentApiStreamIndex != null) {
            int iIntValue = currentApiStreamIndex.intValue();
            int size = arrayList.size();
            int i = 0;
            while (true) {
                if (i >= size) {
                    obj = null;
                    break;
                }
                obj = arrayList.get(i);
                i++;
                h42 h42Var = (h42) obj;
                if (h42Var.d != null && (num = h42Var.e) != null && num.intValue() == iIntValue) {
                    break;
                }
            }
            h42 h42Var2 = (h42) obj;
            if (h42Var2 != null) {
                return h42Var2;
            }
        }
        int size2 = arrayList.size();
        int i2 = 0;
        int i3 = 0;
        while (i3 < size2) {
            Object obj3 = arrayList.get(i3);
            i3++;
            if (((h42) obj3).d != null) {
                z = i2 == movieSubtitlePref.getCurrentTrackIndex();
                i2++;
            } else {
                z = false;
            }
            if (z) {
                obj2 = obj3;
                break;
            }
        }
        return (h42) obj2;
    }

    public static final String j(ArrayList arrayList, SubtitlePreferences.SeriesSubtitlePref seriesSubtitlePref, SubtitlePreferences.MovieSubtitlePref movieSubtitlePref) {
        h42 h42VarI;
        Object obj;
        if (seriesSubtitlePref != null && !Intrinsics.areEqual(seriesSubtitlePref.getMemoryEnabled(), Boolean.FALSE)) {
            h42 h42VarL = l(arrayList, seriesSubtitlePref);
            if (h42VarL == null) {
                int size = arrayList.size();
                int i = 0;
                while (true) {
                    if (i >= size) {
                        obj = null;
                        break;
                    }
                    obj = arrayList.get(i);
                    i++;
                    h42 h42Var = (h42) obj;
                    if (h42Var.d != null && Intrinsics.areEqual(g(h42Var), seriesSubtitlePref.getCurrentLanguageType())) {
                        break;
                    }
                }
                h42VarL = (h42) obj;
            }
            if (h42VarL != null) {
                return h42VarL.a;
            }
        }
        if (movieSubtitlePref == null || Intrinsics.areEqual(movieSubtitlePref.getMemoryEnabled(), Boolean.FALSE) || (h42VarI = i(arrayList, movieSubtitlePref)) == null) {
            return null;
        }
        return h42VarI.a;
    }

    public static final String k(ExoPlayer exoPlayer, ArrayList arrayList) {
        exoPlayer.getClass();
        at0 groups = exoPlayer.getCurrentTracks().getGroups();
        groups.getClass();
        int size = groups.size();
        int i = 0;
        int i2 = 0;
        while (i2 < size) {
            Object obj = groups.get(i2);
            i2++;
            int i3 = i + 1;
            if (i < 0) {
                CollectionsKt.throwIndexOverflow();
            }
            Tracks.Group group = (Tracks.Group) obj;
            if (group.getType() == 3) {
                int i4 = group.length;
                for (int i5 = 0; i5 < i4; i5++) {
                    if (group.isTrackSelected(i5)) {
                        String str = i + "_" + i5;
                        if (arrayList.isEmpty()) {
                            continue;
                        } else {
                            int size2 = arrayList.size();
                            int i6 = 0;
                            while (i6 < size2) {
                                Object obj2 = arrayList.get(i6);
                                i6++;
                                if (Intrinsics.areEqual(((h42) obj2).a, str)) {
                                    return str;
                                }
                            }
                        }
                    }
                }
            }
            i = i3;
        }
        return "subtitle_off";
    }

    public static final h42 l(ArrayList arrayList, SubtitlePreferences.SeriesSubtitlePref seriesSubtitlePref) {
        String str;
        String currentSubtitleTitle = seriesSubtitlePref.getCurrentSubtitleTitle();
        Object obj = null;
        if (currentSubtitleTitle == null) {
            return null;
        }
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            Object obj2 = arrayList.get(i);
            i++;
            h42 h42Var = (h42) obj2;
            if (h42Var.d != null && Intrinsics.areEqual(g(h42Var), seriesSubtitlePref.getCurrentLanguageType()) && (((str = h42Var.c) != null && StringsKt__StringsKt.contains(str, (CharSequence) currentSubtitleTitle, true)) || StringsKt__StringsKt.contains(h42Var.b, (CharSequence) currentSubtitleTitle, true))) {
                obj = obj2;
                break;
            }
        }
        return (h42) obj;
    }

    public static final boolean m(String str) {
        return StringsKt__str.contains("simplified") || StringsKt__str.contains("简体") || StringsKt__str.contains("chs") || StringsKt__str.contains("zh-hans") || StringsKt__str.contains("zh-cn") || StringsKt__str.contains("sc") || StringsKt__str.contains("简中");
    }

    public static final boolean n(String str) {
        return StringsKt__str.contains("traditional") || StringsKt__str.contains("繁体") || StringsKt__str.contains("cht") || StringsKt__str.contains("zh-hant") || StringsKt__str.contains("zh-tw") || StringsKt__str.contains("zh-hk") || StringsKt__str.contains("tc") || StringsKt__str.contains("繁中");
    }

    public static final String o(String str, String str2, String str3) {
        String lowerCase = CollectionsKt___CollectionsKt.joinToString$default(CollectionsKt.listOfNotNull((Object[]) new String[]{str, str2, str3}), " ", null, null, 0, null, null, 62, null).toLowerCase(Locale.ROOT);
        lowerCase.getClass();
        String strReplace$default = StringsKt__StringsJVMKt.replace$default(StringsKt__StringsJVMKt.replace$default(StringsKt__StringsJVMKt.replace$default(lowerCase, "-", "", false, 4, (Object) null), "_", "", false, 4, (Object) null), " ", "", false, 4, (Object) null);
        if (StringsKt.isBlank(strReplace$default)) {
            return null;
        }
        if (StringsKt__StringsKt.contains$default(strReplace$default, (CharSequence) "ass", false, 2, (Object) null) || StringsKt__StringsKt.contains$default(strReplace$default, (CharSequence) "ssa", false, 2, (Object) null)) {
            return "ass";
        }
        String str4 = "srt";
        if (!StringsKt__StringsKt.contains$default(strReplace$default, (CharSequence) "subrip", false, 2, (Object) null) && !StringsKt__StringsKt.contains$default(strReplace$default, (CharSequence) "srt", false, 2, (Object) null)) {
            str4 = "vtt";
            if (!StringsKt__StringsKt.contains$default(strReplace$default, (CharSequence) "webvtt", false, 2, (Object) null) && !StringsKt__StringsKt.contains$default(strReplace$default, (CharSequence) "vtt", false, 2, (Object) null)) {
                if (StringsKt__StringsKt.contains$default(strReplace$default, (CharSequence) "pgs", false, 2, (Object) null) || StringsKt__StringsKt.contains$default(strReplace$default, (CharSequence) "hdmvpgs", false, 2, (Object) null)) {
                    return "pgs";
                }
                return StringsKt__StringsKt.contains$default(strReplace$default, (CharSequence) "dvb", false, 2, (Object) null) ? "dvb" : strReplace$default;
            }
        }
        return str4;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:47:0x0091 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:51:0x0099 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:55:0x00a1 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:59:0x00a9 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:63:0x00b3 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:66:0x00bc A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:67:0x00bd A[RETURN] */
    public static final String p(String str) {
        String lowerCase;
        String string;
        if (str == null || (string = StringsKt.trim((CharSequence) str).toString()) == null) {
            lowerCase = null;
        } else {
            lowerCase = string.toLowerCase(Locale.ROOT);
            lowerCase.getClass();
        }
        if (lowerCase == null) {
            lowerCase = "";
        }
        switch (lowerCase) {
            case "zh-hans":
                return "zh";
            case "zh-hant":
                return "zh";
            case "":
                return null;
            case "en":
                return "en";
            case "ja":
                return "ja";
            case "ko":
                return "ko";
            case "zh":
            case "chi":
                return "zh";
            case "eng":
                return "en";
            case "jpn":
                return "ja";
            case "kor":
                return "ko";
            case "und":
                return null;
            case "zho":
            case "zh-cn":
                return "zh";
            case "zh-hk":
            case "zh-tw":
                return "zh";
            default:
                return lowerCase;
        }
    }

    /* JADX WARN: Code duplicated, block: B:15:0x0043  */
    public static final String q(String str) {
        String strReplace;
        String strReplace$default;
        String strReplace$default2;
        String strReplace$default3;
        String strReplace$default4;
        if (str != null) {
            String lowerCase = str.toLowerCase(Locale.ROOT);
            lowerCase.getClass();
            String strReplace$default5 = StringsKt__StringsJVMKt.replace$default(lowerCase, "external", "", false, 4, (Object) null);
            if (strReplace$default5 == null || (strReplace$default = StringsKt__StringsJVMKt.replace$default(strReplace$default5, "外挂", "", false, 4, (Object) null)) == null || (strReplace$default2 = StringsKt__StringsJVMKt.replace$default(strReplace$default, "subtitles", "", false, 4, (Object) null)) == null || (strReplace$default3 = StringsKt__StringsJVMKt.replace$default(strReplace$default2, "subtitle", "", false, 4, (Object) null)) == null || (strReplace$default4 = StringsKt__StringsJVMKt.replace$default(strReplace$default3, "字幕", "", false, 4, (Object) null)) == null) {
                strReplace = null;
            } else {
                strReplace = new Regex("[^a-z0-9\\u4e00-\\u9fa5]+").replace(strReplace$default4, "");
            }
        } else {
            strReplace = null;
        }
        return strReplace == null ? "" : strReplace;
    }

    public static final SubtitleLanguagePriorityType r(String str, String str2) {
        if (str2 == null) {
            str2 = "";
        }
        f42 f42VarE = e(str, str2);
        boolean z = f42VarE.g;
        boolean z2 = f42VarE.a;
        if (z2 && z) {
            return SubtitleLanguagePriorityType.SIMPLIFIED_CHINESE_BILINGUAL;
        }
        if (z2) {
            return SubtitleLanguagePriorityType.SIMPLIFIED_CHINESE;
        }
        boolean z3 = f42VarE.b;
        if (z3 && z) {
            return SubtitleLanguagePriorityType.TRADITIONAL_CHINESE_BILINGUAL;
        }
        if (z3) {
            return SubtitleLanguagePriorityType.TRADITIONAL_CHINESE;
        }
        boolean z4 = f42VarE.c;
        if (z4 && z) {
            return SubtitleLanguagePriorityType.CHINESE_BILINGUAL;
        }
        if (z4) {
            return SubtitleLanguagePriorityType.CHINESE;
        }
        if (f42VarE.d) {
            return SubtitleLanguagePriorityType.ENGLISH;
        }
        if (f42VarE.e) {
            return SubtitleLanguagePriorityType.JAPANESE;
        }
        return f42VarE.f ? SubtitleLanguagePriorityType.KOREAN : SubtitleLanguagePriorityType.OTHER;
    }
}
