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
import androidx.media3.common.Format;
import androidx.media3.common.TrackGroup;
import androidx.media3.common.TrackSelectionOverride;
import androidx.media3.common.TrackSelectionParameters;
import androidx.media3.common.Tracks;
import androidx.media3.exoplayer.ExoPlayer;
import androidx.media3.exoplayer.RendererCapabilities;

import com.dh.myembyapp.data.AudioTrackMemory;
import com.dh.myembyapp.data.model.AudioCodecPriorityType;
import com.dh.myembyapp.data.model.AudioLanguagePreference;
import com.dh.myembyapp.data.model.AudioStreamDetectionKt;
import com.dh.myembyapp.data.model.AudioVersionPrioritySettings;
import com.dh.myembyapp.data.model.MediaStream;
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
import kotlin.ranges.RangesKt;
import kotlin.text.Regex;
import kotlin.text.StringsKt;
import kotlin.text.StringsKt;
import kotlin.text.StringsKt;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: loaded from: classes4.dex */
public abstract class pg {
    public static final void a(List list, String str, String str2, Function1 function1, Function0 function0, Composer composer, int i) {
        int i2;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        ig igVar;
        int i3;
        str.getClass();
        function1.getClass();
        function0.getClass();
        Composer composerStartRestartGroup = composer.startRestartGroup(-1486073890);
        if ((i & 6) == 0) {
            i2 = (composerStartRestartGroup.changedInstance(list) ? 4 : 2) | i;
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
            int i4 = -1;
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1486073890, i2, -1, "com.dh.myembyapp.ui.screens.player.components.AudioSelectionOverlay (AudioSelection.kt:100)");
            }
            if (list.isEmpty()) {
                function0.invoke();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup == null) {
                    return;
                } else {
                    igVar = new ig(list, str, str2, function1, function0, i, 0);
                }
            } else {
                Iterator it = list.iterator();
                int i5 = 0;
                while (it.hasNext()) {
                    if (Intrinsics.areEqual(((yf) it.next()).a, str)) {
                        i4 = i5;
                        break;
                    }
                    i5++;
                }
                int iCoerceAtLeast = RangesKt.coerceAtLeast(i4, 0);
                int i6 = i2 & Input.Keys.FORWARD_DEL;
                boolean z = i6 == 32;
                Object objRememberedValue = composerStartRestartGroup.rememberedValue();
                if (z || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                    objRememberedValue = mr.l(iCoerceAtLeast, null, 2, null, composerStartRestartGroup);
                }
                MutableState mutableState = (MutableState) objRememberedValue;
                Object objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                Composer.Companion companion = Composer.INSTANCE;
                if (objRememberedValue2 == companion.getEmpty()) {
                    objRememberedValue2 = mr.n(composerStartRestartGroup);
                }
                FocusRequester focusRequester = (FocusRequester) objRememberedValue2;
                LazyListState lazyListStateRememberLazyListState = LazyListStateKt.rememberLazyListState(iCoerceAtLeast, 0, composerStartRestartGroup, 0, 2);
                Modifier.Companion companion2 = Modifier.INSTANCE;
                Modifier modifierFillMaxSize$default = SizeKt.fillMaxSize$default(companion2, 0.0f, 1, null);
                Color.Companion companion3 = Color.INSTANCE;
                Modifier modifierFocusable$default = FocusableKt.focusable$default(FocusRequesterModifierKt.focusRequester(BackgroundKt.m275backgroundbw27NRU$default(modifierFillMaxSize$default, Color.m5151copywmQWz5c$default(companion3.m5178getBlack0d7_KjU(), 0.7f, 0.0f, 0.0f, 0.0f, 14, null), null, 2, null), focusRequester), false, null, 3, null);
                boolean zChanged = composerStartRestartGroup.changed(mutableState) | composerStartRestartGroup.changedInstance(list) | ((i2 & 7168) == 2048) | ((57344 & i2) == 16384);
                Object objRememberedValue3 = composerStartRestartGroup.rememberedValue();
                if (zChanged || objRememberedValue3 == companion.getEmpty()) {
                    objRememberedValue3 = new lg(list, function1, function0, mutableState);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
                }
                Modifier modifierOnPreviewKeyEvent = KeyInputModifierKt.onPreviewKeyEvent(modifierFocusable$default, (Function1) objRememberedValue3);
                Alignment.Companion companion4 = Alignment.INSTANCE;
                MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(companion4.getCenterEnd(), false);
                long currentCompositeKeyHashCode = ComposablesKt.getCurrentCompositeKeyHashCode(composerStartRestartGroup, 0);
                int i7 = (int) (currentCompositeKeyHashCode ^ (currentCompositeKeyHashCode >>> 32));
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
                Updater.m4326setimpl(composerM4318constructorimpl, modifierMaterializeModifier, (Function2<? super T, ? super Modifier, Unit>) id.h(companion5, composerM4318constructorimpl, Integer.valueOf(i7), composerM4318constructorimpl));
                BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
                Modifier modifierM999padding3ABfNKs = PaddingKt.m999padding3ABfNKs(kb0.v(12.0f, PaddingKt.m999padding3ABfNKs(SizeKt.m1069width3ABfNKs(companion2, Dp.m7813constructorimpl(320.0f)), Dp.m7813constructorimpl(24.0f)), ColorKt.Color(4280163870L)), Dp.m7813constructorimpl(16.0f));
                Arrangement arrangement = Arrangement.INSTANCE;
                MeasurePolicy measurePolicyColumnMeasurePolicy = ColumnKt.columnMeasurePolicy(arrangement.getTop(), companion4.getStart(), composerStartRestartGroup, 0);
                long currentCompositeKeyHashCode2 = ComposablesKt.getCurrentCompositeKeyHashCode(composerStartRestartGroup, 0);
                int i8 = (int) (currentCompositeKeyHashCode2 ^ (currentCompositeKeyHashCode2 >>> 32));
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
                Updater.m4326setimpl(composerM4318constructorimpl2, modifierMaterializeModifier2, (Function2<? super T, ? super Modifier, Unit>) id.h(companion5, composerM4318constructorimpl2, Integer.valueOf(i8), composerM4318constructorimpl2));
                ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.INSTANCE;
                long jM5189getWhite0d7_KjU = companion3.m5189getWhite0d7_KjU();
                long sp = TextUnitKt.getSp(18);
                FontWeight bold = FontWeight.INSTANCE.getBold();
                Modifier modifierM1003paddingqDBjuR0$default = PaddingKt.m1003paddingqDBjuR0$default(companion2, 0.0f, 0.0f, 0.0f, Dp.m7813constructorimpl(16.0f), 7, null);
                int i9 = i2;
                TextKt.m3048TextNvy7gAk("音轨选择", modifierM1003paddingqDBjuR0$default, jM5189getWhite0d7_KjU, null, sp, null, bold, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, composerStartRestartGroup, 1597878, 0, 262056);
                composerStartRestartGroup = composerStartRestartGroup;
                Continuation continuation = null;
                Modifier modifierM1052heightInVpY3zN4$default = SizeKt.m1052heightInVpY3zN4$default(companion2, 0.0f, Dp.m7813constructorimpl(400.0f), 1, null);
                Arrangement.HorizontalOrVertical horizontalOrVerticalM712spacedBy0680j_4 = arrangement.m712spacedBy0680j_4(Dp.m7813constructorimpl(4.0f));
                boolean zChangedInstance = composerStartRestartGroup.changedInstance(list) | (i6 == 32) | ((i9 & 896) == 256) | composerStartRestartGroup.changed(mutableState);
                Object objRememberedValue4 = composerStartRestartGroup.rememberedValue();
                if (zChangedInstance || objRememberedValue4 == companion.getEmpty()) {
                    g9 g9Var = new g9(1, list, str, str2, mutableState);
                    composerStartRestartGroup.updateRememberedValue(g9Var);
                    objRememberedValue4 = g9Var;
                }
                LazyDslKt.LazyColumn(modifierM1052heightInVpY3zN4$default, lazyListStateRememberLazyListState, null, false, horizontalOrVerticalM712spacedBy0680j_4, null, null, false, null, (Function1) objRememberedValue4, composerStartRestartGroup, 24582, 492);
                composerStartRestartGroup.endNode();
                composerStartRestartGroup.endNode();
                Integer numValueOf = Integer.valueOf(b(r5));
                boolean zChanged2 = composerStartRestartGroup.changed(lazyListStateRememberLazyListState) | composerStartRestartGroup.changed(r5);
                Object objRememberedValue5 = composerStartRestartGroup.rememberedValue();
                if (zChanged2 || objRememberedValue5 == companion.getEmpty()) {
                    i3 = 0;
                    objRememberedValue5 = new mg(lazyListStateRememberLazyListState, mutableState, continuation, i3);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue5);
                } else {
                    i3 = 0;
                }
                EffectsKt.LaunchedEffect(numValueOf, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) objRememberedValue5, composerStartRestartGroup, i3);
                Unit unit = Unit.INSTANCE;
                Object objRememberedValue6 = composerStartRestartGroup.rememberedValue();
                if (objRememberedValue6 == companion.getEmpty()) {
                    objRememberedValue6 = new ng(focusRequester, null, i3);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue6);
                }
                EffectsKt.LaunchedEffect(unit, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) objRememberedValue6, composerStartRestartGroup, 6);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
            }
            scopeUpdateScopeEndRestartGroup.updateScope(igVar);
        }
        composerStartRestartGroup.skipToGroupEnd();
        scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            igVar = new ig(list, str, str2, function1, function0, i, 1);
            scopeUpdateScopeEndRestartGroup.updateScope(igVar);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final int b(MutableState mutableState) {
        return ((Number) mutableState.getValue()).intValue();
    }

    public static final void c(ExoPlayer exoPlayer, yf yfVar) {
        exoPlayer.getClass();
        yfVar.getClass();
        if (yfVar.c == null) {
            return;
        }
        TrackSelectionParameters.Builder builderBuildUpon = exoPlayer.getTrackSelectionParameters().buildUpon();
        builderBuildUpon.getClass();
        builderBuildUpon.clearOverridesOfType(1);
        qg qgVar = yfVar.c;
        builderBuildUpon.addOverride(new TrackSelectionOverride(qgVar.a, (List<Integer>) CollectionsKt.listOf(Integer.valueOf(qgVar.b))));
        exoPlayer.setTrackSelectionParameters(builderBuildUpon.build());
    }

    /* JADX WARN: Code duplicated, block: B:12:0x0014 A[PHI: r1
      0x0014: PHI (r1v29 java.lang.String) = (r1v1 java.lang.String), (r1v30 java.lang.String) binds: [B:17:0x0022, B:11:0x0012] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:13:0x0016  */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public static final String d(String str, MediaStream mediaStream, AudioLanguagePreference audioLanguagePreference) {
        if (audioLanguagePreference != null) {
            return audioLanguagePreference.getLabel();
        }
        String str2 = null;
        if (str != null) {
            if (StringsKt.isBlank(str)) {
                str = null;
            }
            if (str != null) {
                str2 = str;
            } else if (mediaStream != null) {
                str2 = str;
            }
        } else if (mediaStream != null && (str = mediaStream.getLanguage()) != null && !StringsKt.isBlank(str)) {
            str2 = str;
        }
        String strNormalizeAudioLanguage = AudioStreamDetectionKt.normalizeAudioLanguage(str2);
        if (strNormalizeAudioLanguage != null) {
            switch (strNormalizeAudioLanguage.hashCode()) {
                case 3201:
                    if (strNormalizeAudioLanguage.equals("de")) {
                        return "德语";
                    }
                    break;
                case 3241:
                    if (strNormalizeAudioLanguage.equals("en")) {
                        return "英语";
                    }
                    break;
                case 3246:
                    if (strNormalizeAudioLanguage.equals("es")) {
                        return "西班牙语";
                    }
                    break;
                case 3276:
                    if (strNormalizeAudioLanguage.equals("fr")) {
                        return "法语";
                    }
                    break;
                case 3371:
                    if (strNormalizeAudioLanguage.equals("it")) {
                        return "意大利语";
                    }
                    break;
                case 3383:
                    if (strNormalizeAudioLanguage.equals("ja")) {
                        return "日语";
                    }
                    break;
                case 3428:
                    if (strNormalizeAudioLanguage.equals("ko")) {
                        return "韩语";
                    }
                    break;
                case 3651:
                    if (strNormalizeAudioLanguage.equals("ru")) {
                        return "俄语";
                    }
                    break;
                case 3700:
                    if (strNormalizeAudioLanguage.equals("th")) {
                        return "泰语";
                    }
                    break;
                case 3886:
                    if (strNormalizeAudioLanguage.equals("zh")) {
                        return "中文";
                    }
                    break;
                case 120009:
                    if (strNormalizeAudioLanguage.equals("yue")) {
                        return "粤语";
                    }
                    break;
            }
        }
        if (str2 == null) {
            return "未知语言";
        }
        String upperCase = str2.toUpperCase(Locale.ROOT);
        upperCase.getClass();
        return upperCase == null ? "未知语言" : upperCase;
    }

    /* JADX WARN: Code duplicated, block: B:100:0x024f  */
    /* JADX WARN: Code duplicated, block: B:106:0x0278  */
    /* JADX WARN: Code duplicated, block: B:109:0x027e  */
    /* JADX WARN: Code duplicated, block: B:111:0x0281  */
    /* JADX WARN: Code duplicated, block: B:113:0x0284  */
    /* JADX WARN: Code duplicated, block: B:115:0x0288 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:116:0x028a  */
    /* JADX WARN: Code duplicated, block: B:117:0x029d  */
    /* JADX WARN: Code duplicated, block: B:118:0x02a0  */
    /* JADX WARN: Code duplicated, block: B:119:0x02a3  */
    /* JADX WARN: Code duplicated, block: B:120:0x02a7  */
    /* JADX WARN: Code duplicated, block: B:126:0x02b5  */
    /* JADX WARN: Code duplicated, block: B:129:0x02bd  */
    /* JADX WARN: Code duplicated, block: B:130:0x02c1  */
    /* JADX WARN: Code duplicated, block: B:133:0x02cc  */
    /* JADX WARN: Code duplicated, block: B:136:0x02d9  */
    /* JADX WARN: Code duplicated, block: B:139:0x0303  */
    /* JADX WARN: Code duplicated, block: B:140:0x0306  */
    /* JADX WARN: Code duplicated, block: B:144:0x0311  */
    /* JADX WARN: Code duplicated, block: B:147:0x0317  */
    /* JADX WARN: Code duplicated, block: B:148:0x031e  */
    /* JADX WARN: Code duplicated, block: B:152:0x0329  */
    /* JADX WARN: Code duplicated, block: B:154:0x032c  */
    /* JADX WARN: Code duplicated, block: B:157:0x0334  */
    /* JADX WARN: Code duplicated, block: B:158:0x033f  */
    /* JADX WARN: Code duplicated, block: B:92:0x0224  */
    /* JADX WARN: Code duplicated, block: B:93:0x0229  */
    /* JADX WARN: Code duplicated, block: B:95:0x022c  */
    /* JADX WARN: Code duplicated, block: B:96:0x0231  */
    /* JADX WARN: Code duplicated, block: B:99:0x024a  */
    /* JADX WARN: Instruction removed from duplicated block: B:116:0x028a, please report this as an issue */
    public static final List e(ExoPlayer exoPlayer, AudioVersionPrioritySettings audioVersionPrioritySettings, List list) {
        at0 at0Var;
        int i;
        int i2;
        Tracks.Group group;
        int i3;
        Integer numValueOf;
        int iIntValue;
        MediaStream mediaStream;
        int i4;
        String displayTitle;
        String title;
        String language;
        String strD;
        String str;
        String str2;
        String upperCase;
        int i5;
        String str3;
        StringBuilder sb;
        boolean z;
        int i6;
        Integer numValueOf2;
        int iIntValue2;
        int i7;
        Integer numValueOf3;
        Integer numValueOf4;
        String strSubstringAfter$default;
        exoPlayer.getClass();
        list.getClass();
        ArrayList arrayList = new ArrayList();
        List mutableList = CollectionsKt.toMutableList((Collection) list);
        at0 groups = exoPlayer.getCurrentTracks().getGroups();
        groups.getClass();
        int size = groups.size();
        int i8 = 0;
        int i9 = 0;
        while (i9 < size) {
            Object obj = groups.get(i9);
            int i10 = i9 + 1;
            int i11 = i8 + 1;
            if (i8 < 0) {
                CollectionsKt.throwIndexOverflow();
            }
            Tracks.Group group2 = (Tracks.Group) obj;
            int i12 = 1;
            if (group2.getType() == 1) {
                TrackGroup mediaTrackGroup = group2.getMediaTrackGroup();
                mediaTrackGroup.getClass();
                int i13 = group2.length;
                int i14 = 0;
                while (i14 < i13) {
                    if (group2.isTrackSupported(i14)) {
                        Format trackFormat = group2.getTrackFormat(i14);
                        trackFormat.getClass();
                        if (mutableList.isEmpty()) {
                            at0Var = groups;
                            i = size;
                            i2 = i10;
                            group = group2;
                        } else {
                            ArrayList arrayList2 = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(mutableList, 10));
                            Iterator it = mutableList.iterator();
                            int i15 = 0;
                            while (it.hasNext()) {
                                Object next = it.next();
                                int i16 = i15 + 1;
                                if (i15 < 0) {
                                    CollectionsKt.throwIndexOverflow();
                                }
                                MediaStream mediaStream2 = (MediaStream) next;
                                Integer numValueOf5 = Integer.valueOf(i15);
                                int i17 = i12;
                                String strNormalizeAudioLanguage = AudioStreamDetectionKt.normalizeAudioLanguage(trackFormat.language);
                                at0 at0Var2 = groups;
                                int i18 = (strNormalizeAudioLanguage == null || !Intrinsics.areEqual(strNormalizeAudioLanguage, AudioStreamDetectionKt.normalizeAudioLanguage(mediaStream2.getLanguage()))) ? 0 : 500;
                                int i19 = size;
                                Iterator it2 = it;
                                String strJ = j(trackFormat.sampleMimeType, trackFormat.codecs, trackFormat.label);
                                int i20 = i10;
                                Tracks.Group group3 = group2;
                                String strJ2 = j(mediaStream2.getCodec(), mediaStream2.getCodec(), CollectionsKt___CollectionsKt.joinToString$default(CollectionsKt.listOfNotNull((Object[]) new String[]{mediaStream2.getDisplayTitle(), mediaStream2.getTitle()}), " ", null, null, 0, null, null, 62, null));
                                if (strJ != null && Intrinsics.areEqual(strJ, strJ2)) {
                                    i18 += 350;
                                }
                                int i21 = trackFormat.channelCount;
                                Integer numValueOf6 = Integer.valueOf(i21);
                                if (i21 <= 0) {
                                    numValueOf6 = null;
                                }
                                Integer numL = l(mediaStream2);
                                if (numValueOf6 != null && numL != null && Intrinsics.areEqual(numValueOf6, numL)) {
                                    i18 += Input.Keys.NUMPAD_6;
                                }
                                String strK = k(trackFormat.label);
                                String strK2 = k(CollectionsKt___CollectionsKt.joinToString$default(CollectionsKt.listOfNotNull((Object[]) new String[]{mediaStream2.getDisplayTitle(), mediaStream2.getTitle()}), " ", null, null, 0, null, null, 62, null));
                                if (!StringsKt.isBlank(strK) && !StringsKt.isBlank(strK2)) {
                                    if (Intrinsics.areEqual(strK, strK2)) {
                                        i4 = 300;
                                    } else {
                                        i4 = (StringsKt__StringsKt.contains$default(strK, (CharSequence) strK2, false, 2, (Object) null) || StringsKt__StringsKt.contains$default(strK2, (CharSequence) strK, false, 2, (Object) null)) ? 180 : 0;
                                    }
                                    i18 += i4;
                                }
                                int i22 = (trackFormat.selectionFlags & 1) != 0 ? i17 : 0;
                                if (mediaStream2.isDefault() && i22 != 0) {
                                    i18 += 40;
                                }
                                arrayList2.add(TuplesKt.to(numValueOf5, Integer.valueOf(i18)));
                                i12 = i17;
                                i15 = i16;
                                size = i19;
                                groups = at0Var2;
                                it = it2;
                                i10 = i20;
                                group2 = group3;
                            }
                            at0Var = groups;
                            i = size;
                            i2 = i10;
                            group = group2;
                            int i23 = i12;
                            Iterator it3 = arrayList2.iterator();
                            if (it3.hasNext()) {
                                numValueOf = Integer.valueOf(((Number) ((Pair) it3.next()).getSecond()).intValue());
                                while (it3.hasNext()) {
                                    Integer numValueOf7 = Integer.valueOf(((Number) ((Pair) it3.next()).getSecond()).intValue());
                                    if (numValueOf.compareTo(numValueOf7) < 0) {
                                        numValueOf = numValueOf7;
                                    }
                                }
                            } else {
                                numValueOf = null;
                            }
                            if (numValueOf != null && (iIntValue = numValueOf.intValue()) > 40) {
                                ArrayList arrayList3 = new ArrayList();
                                int size2 = arrayList2.size();
                                int i24 = 0;
                                while (i24 < size2) {
                                    Object obj2 = arrayList2.get(i24);
                                    i24++;
                                    if (((Number) ((Pair) obj2).getSecond()).intValue() == iIntValue) {
                                        arrayList3.add(obj2);
                                    }
                                }
                                if (arrayList3.size() == i23) {
                                    mediaStream = (MediaStream) mutableList.remove(((Number) ((Pair) CollectionsKt.single((List) arrayList3)).getFirst()).intValue());
                                }
                            }
                            String str4 = trackFormat.label;
                            if (mediaStream != null) {
                                displayTitle = mediaStream.getDisplayTitle();
                            } else {
                                displayTitle = null;
                            }
                            if (mediaStream != null) {
                                title = mediaStream.getTitle();
                            } else {
                                title = null;
                            }
                            String strJoinToString$default = CollectionsKt___CollectionsKt.joinToString$default(CollectionsKt.listOfNotNull((Object[]) new String[]{str4, displayTitle, title}), " ", null, null, 0, null, null, 62, null);
                            if (mediaStream != null) {
                                language = mediaStream.getLanguage();
                            } else {
                                language = null;
                            }
                            AudioLanguagePreference audioLanguagePreferenceResolveAudioLanguagePreference = AudioStreamDetectionKt.resolveAudioLanguagePreference(strJoinToString$default, language, trackFormat.language);
                            strD = d(trackFormat.language, mediaStream, audioLanguagePreferenceResolveAudioLanguagePreference);
                            str = trackFormat.sampleMimeType;
                            str2 = "";
                            if (str != null || (strSubstringAfter$default = StringsKt__StringsKt.substringAfter$default(str, "audio/", (String) null, 2, (Object) null)) == null) {
                                upperCase = "";
                            } else {
                                upperCase = strSubstringAfter$default.toUpperCase(Locale.ROOT);
                                upperCase.getClass();
                            }
                            i5 = trackFormat.channelCount;
                            if (i5 != 1) {
                                str2 = "单声道";
                            } else if (i5 != 2) {
                                str2 = "立体声";
                            } else if (i5 != 6) {
                                str2 = "5.1声道";
                            } else if (i5 != 8) {
                                str2 = "7.1声道";
                            } else if (i5 > 0) {
                                str2 = i5 + "声道";
                            }
                            str3 = trackFormat.label;
                            if (str3 != null || StringsKt.isBlank(str3)) {
                                str3 = null;
                            }
                            sb = new StringBuilder();
                            if (str3 != null) {
                                sb.append(str3);
                            } else {
                                sb.append(strD);
                            }
                            if (!StringsKt.isBlank(upperCase)) {
                                sb.append(" ".concat(upperCase));
                            }
                            if (!StringsKt.isBlank(str2)) {
                                sb.append(" ".concat(str2));
                            }
                            String string = sb.toString();
                            String strO = i02.o(i8, i14, "audio_", "_");
                            qg qgVar = new qg(mediaTrackGroup, i14);
                            AudioCodecPriorityType audioCodecPriorityTypeResolveAudioCodecPriorityType = AudioStreamDetectionKt.resolveAudioCodecPriorityType(trackFormat.sampleMimeType, trackFormat.codecs, str3, trackFormat.label);
                            i3 = 1;
                            if ((trackFormat.selectionFlags & 1) != 0) {
                                z = true;
                            } else {
                                z = false;
                            }
                            i6 = trackFormat.channelCount;
                            numValueOf2 = Integer.valueOf(i6);
                            if (i6 <= 0) {
                                numValueOf2 = null;
                            }
                            if (numValueOf2 != null) {
                                iIntValue2 = numValueOf2.intValue();
                            } else {
                                iIntValue2 = Integer.MAX_VALUE;
                            }
                            i7 = trackFormat.bitrate;
                            numValueOf3 = Integer.valueOf(i7);
                            if (i7 <= 0) {
                                numValueOf3 = null;
                            }
                            int iIntValue3 = numValueOf3 != null ? numValueOf3.intValue() : Integer.MAX_VALUE;
                            if (mediaStream != null) {
                                numValueOf4 = Integer.valueOf(mediaStream.getIndex());
                            } else {
                                numValueOf4 = null;
                            }
                            arrayList.add(new yf(strO, string, qgVar, audioLanguagePreferenceResolveAudioLanguagePreference, audioCodecPriorityTypeResolveAudioCodecPriorityType, z, iIntValue2, iIntValue3, numValueOf4));
                        }
                        mediaStream = null;
                        String str5 = trackFormat.label;
                        if (mediaStream != null) {
                            displayTitle = mediaStream.getDisplayTitle();
                        } else {
                            displayTitle = null;
                        }
                        if (mediaStream != null) {
                            title = mediaStream.getTitle();
                        } else {
                            title = null;
                        }
                        String strJoinToString$default2 = CollectionsKt___CollectionsKt.joinToString$default(CollectionsKt.listOfNotNull((Object[]) new String[]{str5, displayTitle, title}), " ", null, null, 0, null, null, 62, null);
                        if (mediaStream != null) {
                            language = mediaStream.getLanguage();
                        } else {
                            language = null;
                        }
                        AudioLanguagePreference audioLanguagePreferenceResolveAudioLanguagePreference2 = AudioStreamDetectionKt.resolveAudioLanguagePreference(strJoinToString$default2, language, trackFormat.language);
                        strD = d(trackFormat.language, mediaStream, audioLanguagePreferenceResolveAudioLanguagePreference2);
                        str = trackFormat.sampleMimeType;
                        str2 = "";
                        if (str != null) {
                            upperCase = "";
                        } else {
                            upperCase = "";
                        }
                        i5 = trackFormat.channelCount;
                        if (i5 != 1) {
                            str2 = "单声道";
                        } else if (i5 != 2) {
                            str2 = "立体声";
                        } else if (i5 != 6) {
                            str2 = "5.1声道";
                        } else if (i5 != 8) {
                            str2 = "7.1声道";
                        } else if (i5 > 0) {
                            str2 = i5 + "声道";
                        }
                        str3 = trackFormat.label;
                        if (str3 != null) {
                            str3 = null;
                        } else {
                            str3 = null;
                        }
                        sb = new StringBuilder();
                        if (str3 != null) {
                            sb.append(str3);
                        } else {
                            sb.append(strD);
                        }
                        if (!StringsKt.isBlank(upperCase)) {
                            sb.append(" ".concat(upperCase));
                        }
                        if (!StringsKt.isBlank(str2)) {
                            sb.append(" ".concat(str2));
                        }
                        String string2 = sb.toString();
                        String strO2 = i02.o(i8, i14, "audio_", "_");
                        qg qgVar2 = new qg(mediaTrackGroup, i14);
                        AudioCodecPriorityType audioCodecPriorityTypeResolveAudioCodecPriorityType2 = AudioStreamDetectionKt.resolveAudioCodecPriorityType(trackFormat.sampleMimeType, trackFormat.codecs, str3, trackFormat.label);
                        i3 = 1;
                        if ((trackFormat.selectionFlags & 1) != 0) {
                            z = true;
                        } else {
                            z = false;
                        }
                        i6 = trackFormat.channelCount;
                        numValueOf2 = Integer.valueOf(i6);
                        if (i6 <= 0) {
                            numValueOf2 = null;
                        }
                        if (numValueOf2 != null) {
                            iIntValue2 = numValueOf2.intValue();
                        } else {
                            iIntValue2 = Integer.MAX_VALUE;
                        }
                        i7 = trackFormat.bitrate;
                        numValueOf3 = Integer.valueOf(i7);
                        if (i7 <= 0) {
                            numValueOf3 = null;
                        }
                        int iIntValue4 = numValueOf3 != null ? numValueOf3.intValue() : Integer.MAX_VALUE;
                        if (mediaStream != null) {
                            numValueOf4 = Integer.valueOf(mediaStream.getIndex());
                        } else {
                            numValueOf4 = null;
                        }
                        arrayList.add(new yf(strO2, string2, qgVar2, audioLanguagePreferenceResolveAudioLanguagePreference2, audioCodecPriorityTypeResolveAudioCodecPriorityType2, z, iIntValue2, iIntValue4, numValueOf4));
                    } else {
                        at0Var = groups;
                        i = size;
                        i2 = i10;
                        group = group2;
                        i3 = i12;
                    }
                    i14++;
                    i12 = i3;
                    size = i;
                    groups = at0Var;
                    i10 = i2;
                    group2 = group;
                }
            }
            i8 = i11;
            size = size;
            groups = groups;
            i9 = i10;
        }
        return o(arrayList, audioVersionPrioritySettings);
    }

    /* JADX WARN: Code duplicated, block: B:13:0x0062  */
    /* JADX WARN: Code duplicated, block: B:46:0x00bf  */
    /* JADX WARN: Code duplicated, block: B:51:0x00cc  */
    public static final List f(List list, AudioVersionPrioritySettings audioVersionPrioritySettings) {
        String upperCase;
        list.getClass();
        ArrayList arrayList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(list, 10));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            MediaStream mediaStream = (MediaStream) it.next();
            AudioLanguagePreference audioLanguagePreferenceResolveAudioLanguagePreference = AudioStreamDetectionKt.resolveAudioLanguagePreference(CollectionsKt___CollectionsKt.joinToString$default(CollectionsKt.listOfNotNull((Object[]) new String[]{mediaStream.getDisplayTitle(), mediaStream.getTitle()}), " ", null, null, 0, null, null, 62, null), mediaStream.getLanguage(), null);
            String strD = d(null, mediaStream, audioLanguagePreferenceResolveAudioLanguagePreference);
            String codec = mediaStream.getCodec();
            if (codec == null) {
                upperCase = null;
            } else {
                if (StringsKt.isBlank(codec)) {
                    codec = null;
                }
                if (codec != null) {
                    upperCase = codec.toUpperCase(Locale.ROOT);
                    upperCase.getClass();
                } else {
                    upperCase = null;
                }
            }
            String str = "";
            if (upperCase == null) {
                upperCase = "";
            }
            Integer channels = mediaStream.getChannels();
            int iIntValue = Integer.MAX_VALUE;
            int iIntValue2 = (channels == null && (channels = l(mediaStream)) == null) ? Integer.MAX_VALUE : channels.intValue();
            if (iIntValue2 == 1) {
                str = "单声道";
            } else if (iIntValue2 == 2) {
                str = "立体声";
            } else if (iIntValue2 == 6) {
                str = "5.1声道";
            } else if (iIntValue2 == 8) {
                str = "7.1声道";
            } else if (iIntValue2 != Integer.MAX_VALUE) {
                str = iIntValue2 + "声道";
            }
            String displayTitle = mediaStream.getDisplayTitle();
            if (displayTitle == null) {
                displayTitle = mediaStream.getTitle();
                if (displayTitle != null || StringsKt.isBlank(displayTitle)) {
                    displayTitle = null;
                }
            } else {
                if (StringsKt.isBlank(displayTitle)) {
                    displayTitle = null;
                }
                if (displayTitle == null) {
                    displayTitle = mediaStream.getTitle();
                    if (displayTitle != null) {
                        displayTitle = null;
                    } else {
                        displayTitle = null;
                    }
                }
            }
            String strF = i9.f(mediaStream.getIndex(), "audio_api_");
            if (displayTitle == null) {
                StringBuilder sbT = mr.t(strD);
                if (!StringsKt.isBlank(upperCase)) {
                    sbT.append(" ".concat(upperCase));
                }
                if (!StringsKt.isBlank(str)) {
                    sbT.append(" ".concat(str));
                }
                displayTitle = sbT.toString();
            }
            AudioCodecPriorityType audioCodecPriorityTypeResolveAudioCodecPriorityType = AudioStreamDetectionKt.resolveAudioCodecPriorityType(mediaStream);
            boolean zIsDefault = mediaStream.isDefault();
            Integer bitRate = mediaStream.getBitRate();
            if (bitRate != null) {
                Integer num = bitRate.intValue() > 0 ? bitRate : null;
                if (num != null) {
                    iIntValue = num.intValue();
                }
            }
            arrayList.add(new yf(strF, displayTitle, null, audioLanguagePreferenceResolveAudioLanguagePreference, audioCodecPriorityTypeResolveAudioCodecPriorityType, zIsDefault, iIntValue2, iIntValue, Integer.valueOf(mediaStream.getIndex())));
        }
        return o(arrayList, audioVersionPrioritySettings);
    }

    public static final String g(List list, AudioTrackMemory audioTrackMemory, AudioVersionPrioritySettings audioVersionPrioritySettings) {
        audioVersionPrioritySettings.getClass();
        yf yfVarN = n(list, audioTrackMemory, audioVersionPrioritySettings);
        if (yfVarN != null) {
            return yfVarN.a;
        }
        return null;
    }

    public static final String h(ExoPlayer exoPlayer, List list) {
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
            if (group.getType() == 1) {
                int i4 = group.length;
                for (int i5 = 0; i5 < i4; i5++) {
                    if (group.isTrackSelected(i5)) {
                        String strO = i02.o(i, i5, "audio_", "_");
                        if (list.isEmpty()) {
                            continue;
                        } else {
                            Iterator it = list.iterator();
                            while (it.hasNext()) {
                                if (Intrinsics.areEqual(((yf) it.next()).a, strO)) {
                                    return strO;
                                }
                            }
                        }
                    }
                }
            }
            i = i3;
        }
        yf yfVar = (yf) CollectionsKt.firstOrNull(list);
        return yfVar != null ? yfVar.a : "";
    }

    public static final boolean i(List list, AudioVersionPrioritySettings audioVersionPrioritySettings) {
        AudioLanguagePreference preferredLanguage = audioVersionPrioritySettings.normalized().getPreferredLanguage();
        if (preferredLanguage == AudioLanguagePreference.DEFAULT || list.isEmpty()) {
            return false;
        }
        Iterator it = list.iterator();
        while (it.hasNext()) {
            if (((yf) it.next()).d == preferredLanguage) {
                return true;
            }
        }
        return false;
    }

    public static final String j(String str, String str2, String str3) {
        String lowerCase = CollectionsKt___CollectionsKt.joinToString$default(CollectionsKt.listOfNotNull((Object[]) new String[]{str, str2, str3}), " ", null, null, 0, null, null, 62, null).toLowerCase(Locale.ROOT);
        lowerCase.getClass();
        String strReplace$default = StringsKt__StringsJVMKt.replace$default(StringsKt__StringsJVMKt.replace$default(StringsKt__StringsJVMKt.replace$default(lowerCase, "-", "", false, 4, (Object) null), "_", "", false, 4, (Object) null), " ", "", false, 4, (Object) null);
        if (StringsKt.isBlank(strReplace$default)) {
            return null;
        }
        String str4 = "truehd";
        if (!StringsKt__StringsKt.contains$default(strReplace$default, (CharSequence) "truehd", false, 2, (Object) null) && !StringsKt__StringsKt.contains$default(strReplace$default, (CharSequence) "mlp", false, 2, (Object) null)) {
            str4 = "eac3";
            if (!StringsKt__StringsKt.contains$default(strReplace$default, (CharSequence) "eac3", false, 2, (Object) null) && !StringsKt__StringsKt.contains$default(strReplace$default, (CharSequence) "ec3", false, 2, (Object) null)) {
                if (StringsKt__StringsKt.contains$default(strReplace$default, (CharSequence) "ac3", false, 2, (Object) null)) {
                    return "ac3";
                }
                if (StringsKt__StringsKt.contains$default(strReplace$default, (CharSequence) "dts", false, 2, (Object) null)) {
                    return "dts";
                }
                if (StringsKt__StringsKt.contains$default(strReplace$default, (CharSequence) "flac", false, 2, (Object) null)) {
                    return "flac";
                }
                str4 = "aac";
                if (!StringsKt__StringsKt.contains$default(strReplace$default, (CharSequence) "aac", false, 2, (Object) null) && !StringsKt__StringsKt.contains$default(strReplace$default, (CharSequence) "mp4a", false, 2, (Object) null)) {
                    str4 = "pcm";
                    if (!StringsKt__StringsKt.contains$default(strReplace$default, (CharSequence) "pcm", false, 2, (Object) null) && !StringsKt__StringsKt.contains$default(strReplace$default, (CharSequence) "raw", false, 2, (Object) null) && !StringsKt__StringsKt.contains$default(strReplace$default, (CharSequence) "s16le", false, 2, (Object) null) && !StringsKt__StringsKt.contains$default(strReplace$default, (CharSequence) "s24le", false, 2, (Object) null)) {
                        return strReplace$default;
                    }
                }
            }
        }
        return str4;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x001b  */
    public static final String k(String str) {
        String strReplace;
        if (str != null) {
            String lowerCase = str.toLowerCase(Locale.ROOT);
            lowerCase.getClass();
            if (lowerCase != null) {
                strReplace = new Regex("[^a-z0-9\\u4e00-\\u9fa5]+").replace(lowerCase, "");
            } else {
                strReplace = null;
            }
        } else {
            strReplace = null;
        }
        return strReplace == null ? "" : strReplace;
    }

    public static final Integer l(MediaStream mediaStream) {
        String lowerCase = CollectionsKt___CollectionsKt.joinToString$default(CollectionsKt.listOfNotNull((Object[]) new String[]{mediaStream.getDisplayTitle(), mediaStream.getTitle()}), " ", null, null, 0, null, null, 62, null).toLowerCase(Locale.ROOT);
        lowerCase.getClass();
        if (new Regex("7(?:\\.|_)1|7\\s*ch|8\\s*ch").containsMatchIn(lowerCase)) {
            return 8;
        }
        if (new Regex("5(?:\\.|_)1|6\\s*ch").containsMatchIn(lowerCase)) {
            return 6;
        }
        if (new Regex("2(?:\\.|_)0|2\\s*ch|stereo").containsMatchIn(lowerCase)) {
            return 2;
        }
        return new Regex("1(?:\\.|_)0|1\\s*ch|mono").containsMatchIn(lowerCase) ? 1 : null;
    }

    public static final int m(yf yfVar, AudioVersionPrioritySettings audioVersionPrioritySettings) {
        switch (og.$EnumSwitchMapping$1[yfVar.e.ordinal()]) {
            case 1:
                return audioVersionPrioritySettings.getAacPriority();
            case 2:
                return audioVersionPrioritySettings.getAc3Priority();
            case 3:
                return audioVersionPrioritySettings.getEac3Priority();
            case 4:
                return audioVersionPrioritySettings.getDtsPriority();
            case 5:
                return audioVersionPrioritySettings.getTruehdPriority();
            case 6:
                return audioVersionPrioritySettings.getFlacPriority();
            case 7:
                return 7;
            default:
                qu.f();
                return 0;
        }
    }

    public static final yf n(List list, AudioTrackMemory audioTrackMemory, AudioVersionPrioritySettings audioVersionPrioritySettings) {
        audioVersionPrioritySettings.getClass();
        ArrayList arrayList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(list, 10));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            yf yfVar = (yf) it.next();
            boolean z = (yfVar.c == null && yfVar.i == null) ? false : true;
            Integer num = yfVar.i;
            AudioLanguagePreference audioLanguagePreference = yfVar.d;
            AudioCodecPriorityType audioCodecPriorityType = yfVar.e;
            int i = yfVar.g;
            Integer numValueOf = Integer.valueOf(i);
            if (i <= 0 || i == Integer.MAX_VALUE) {
                numValueOf = null;
            }
            arrayList.add(new rg(yfVar, z, num, audioLanguagePreference, audioCodecPriorityType, numValueOf, tg.a(yfVar.b)));
        }
        return (yf) tg.c(arrayList, audioTrackMemory, audioVersionPrioritySettings);
    }

    public static final List o(ArrayList arrayList, AudioVersionPrioritySettings audioVersionPrioritySettings) {
        AudioVersionPrioritySettings audioVersionPrioritySettingsNormalized;
        if (arrayList.size() <= 1) {
            return arrayList;
        }
        if (audioVersionPrioritySettings == null || (audioVersionPrioritySettingsNormalized = audioVersionPrioritySettings.normalized()) == null) {
            audioVersionPrioritySettingsNormalized = AudioVersionPrioritySettings.INSTANCE.getDEFAULT();
        }
        ArrayList arrayList2 = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(arrayList, 10));
        int size = arrayList.size();
        int i = 0;
        int i2 = 0;
        while (i2 < size) {
            Object obj = arrayList.get(i2);
            i2++;
            int i3 = i + 1;
            if (i < 0) {
                CollectionsKt.throwIndexOverflow();
            }
            arrayList2.add(TuplesKt.to(Integer.valueOf(i), (yf) obj));
            i = i3;
        }
        List listSortedWith = CollectionsKt.sortedWith(arrayList2, new b5(2, new hg(audioVersionPrioritySettingsNormalized, 0)));
        ArrayList arrayList3 = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(listSortedWith, 10));
        Iterator it = listSortedWith.iterator();
        while (it.hasNext()) {
            arrayList3.add((yf) ((Pair) it.next()).getSecond());
        }
        return arrayList3;
    }
}
