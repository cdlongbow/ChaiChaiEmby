package defpackage;

import androidx.compose.animation.core.AnimateAsStateKt;
import androidx.compose.foundation.BackgroundKt;
import androidx.compose.foundation.BorderKt;
import androidx.compose.foundation.ScrollKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnScopeInstance;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.foundation.layout.RowKt;
import androidx.compose.foundation.layout.RowScope;
import androidx.compose.foundation.layout.RowScopeInstance;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.SpacerKt;
import androidx.compose.foundation.shape.RoundedCornerShape;
import androidx.compose.foundation.shape.RoundedCornerShapeKt;
import androidx.compose.material3.IconButtonKt;
import androidx.compose.material3.MaterialTheme;
import androidx.compose.material3.TextKt;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.MutableIntState;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SnapshotIntStateKt;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.State;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.draw.ClipKt;
import androidx.compose.ui.draw.ScaleKt;
import androidx.compose.ui.focus.FocusChangedModifierKt;
import androidx.compose.ui.focus.FocusRequester;
import androidx.compose.ui.focus.FocusRequesterModifierKt;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.ColorKt;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.text.PlatformTextStyle;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.unit.Dp;
import androidx.compose.ui.unit.TextUnitKt;
import androidx.compose.ui.window.AndroidDialog_androidKt;
import androidx.compose.ui.window.DialogProperties;
import androidx.media3.exoplayer.RendererCapabilities;
import androidx.media3.extractor.ts.PsExtractor;

import com.dh.myembyapp.data.model.AudioLanguagePreference;
import com.dh.myembyapp.data.model.AudioPrioritySortType;
import com.dh.myembyapp.data.model.AudioVersionPrioritySettings;
import com.dh.myembyapp.data.model.PlayerDefaultViewMode;
import com.dh.myembyapp.data.model.PlayerFrameRateMatchingMode;
import com.dh.myembyapp.data.model.PlayerResizeMode;
import com.dh.myembyapp.data.model.SubtitleFormatPriorityType;
import com.dh.myembyapp.data.model.SubtitleLanguagePriorityType;
import com.dh.myembyapp.data.model.SubtitlePrioritySortType;
import com.dh.myembyapp.data.model.SubtitleVersionPrioritySettings;
import com.dh.myembyapp.data.model.SystemNetworkSpeedDisplayMode;
import com.dh.myembyapp.data.model.SystemNetworkSpeedPosition;
import com.dh.myembyapp.data.model.SystemDurationDisplayMode;
import com.dh.myembyapp.data.model.SystemTimeDisplayMode;
import com.dh.myembyapp.data.model.VideoPriorityRule;
import com.dh.myembyapp.data.model.VideoPrioritySortType;
import com.dh.myembyapp.data.model.VideoQualityStandard;
import com.dh.myembyapp.data.model.VideoVersionPrioritySettings;
import com.dh.myembyapp.data.preferences.UserPreferences;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.CollectionsKt;
import kotlin.collections.IntIterator;
import kotlin.coroutines.Continuation;
import kotlin.enums.EnumEntries;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function11;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.StringCompanionObject;
import kotlin.ranges.IntRange;
import kotlin.ranges.RangesKt;
import kotlin.text.StringsKt;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: loaded from: classes4.dex */
public abstract class cc1 {
    public static final void A(SubtitlePrioritySortType subtitlePrioritySortType, Function1 function1, Function0 function0, Composer composer, int i) {
        int i2;
        Composer composerStartRestartGroup = composer.startRestartGroup(-2104084687);
        if ((i & 6) == 0) {
            i2 = (composerStartRestartGroup.changed(subtitlePrioritySortType.ordinal()) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= composerStartRestartGroup.changedInstance(function1) ? 32 : 16;
        }
        if ((i & RendererCapabilities.DECODER_SUPPORT_MASK) == 0) {
            i2 |= composerStartRestartGroup.changedInstance(function0) ? 256 : 128;
        }
        if (composerStartRestartGroup.shouldExecute((i2 & Input.Keys.NUMPAD_3) != 146, i2 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-2104084687, i2, -1, "com.dh.myembyapp.ui.components.SubtitlePriorityTypeDialog (OtherSettingsOverlay.kt:1892)");
            }
            int i3 = i2 & 14;
            boolean z = i3 == 4;
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            if (z || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                objRememberedValue = mr.n(composerStartRestartGroup);
            }
            FocusRequester focusRequester = (FocusRequester) objRememberedValue;
            AndroidDialog_androidKt.Dialog(function0, new DialogProperties(true, false, false), ComposableLambdaKt.rememberComposableLambda(-1839967430, true, new r5(subtitlePrioritySortType, focusRequester, function1, 15), composerStartRestartGroup, 54), composerStartRestartGroup, ((i2 >> 6) & 14) | 432, 0);
            boolean zChanged = composerStartRestartGroup.changed(focusRequester);
            Object objRememberedValue2 = composerStartRestartGroup.rememberedValue();
            if (zChanged || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                objRememberedValue2 = new ng(focusRequester, null, 7);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
            }
            EffectsKt.LaunchedEffect(subtitlePrioritySortType, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) objRememberedValue2, composerStartRestartGroup, i3);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new x7(i, 23, subtitlePrioritySortType, function1, function0));
        }
    }

    public static final void B(SubtitleVersionPrioritySettings subtitleVersionPrioritySettings, Function1 function1, Composer composer, int i) {
        Composer composerStartRestartGroup = composer.startRestartGroup(1150617);
        int i2 = (i & 6) == 0 ? (composerStartRestartGroup.changedInstance(subtitleVersionPrioritySettings) ? 4 : 2) | i : i;
        if ((i & 48) == 0) {
            i2 |= composerStartRestartGroup.changedInstance(function1) ? 32 : 16;
        }
        int i3 = i2;
        if (composerStartRestartGroup.shouldExecute((i3 & 19) != 18, i3 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1150617, i3, -1, "com.dh.myembyapp.ui.components.SubtitleVersionPrioritySelector (OtherSettingsOverlay.kt:1797)");
            }
            SubtitleVersionPrioritySettings subtitleVersionPrioritySettingsNormalized = subtitleVersionPrioritySettings.normalized();
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                int size = SubtitleVersionPrioritySettings.INSTANCE.getDEFAULT_SORT_TYPES().size();
                ArrayList arrayList = new ArrayList(size);
                for (int i4 = 0; i4 < size; i4++) {
                    arrayList.add(new FocusRequester());
                }
                composerStartRestartGroup.updateRememberedValue(arrayList);
                objRememberedValue = arrayList;
            }
            List list = (List) objRememberedValue;
            Arrangement.HorizontalOrVertical horizontalOrVerticalM712spacedBy0680j_4 = Arrangement.INSTANCE.m712spacedBy0680j_4(Dp.m7813constructorimpl(8.0f));
            Modifier.Companion companion = Modifier.INSTANCE;
            MeasurePolicy measurePolicyColumnMeasurePolicy = ColumnKt.columnMeasurePolicy(horizontalOrVerticalM712spacedBy0680j_4, Alignment.INSTANCE.getStart(), composerStartRestartGroup, 6);
            long currentCompositeKeyHashCode = ComposablesKt.getCurrentCompositeKeyHashCode(composerStartRestartGroup, 0);
            int i5 = (int) (currentCompositeKeyHashCode ^ (currentCompositeKeyHashCode >>> 32));
            CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(composerStartRestartGroup, companion);
            ComposeUiNode.Companion companion2 = ComposeUiNode.INSTANCE;
            Function0<ComposeUiNode> constructor = companion2.getConstructor();
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
            mr.z(companion2, composerM4318constructorimpl, measurePolicyColumnMeasurePolicy, composerM4318constructorimpl, currentCompositionLocalMap);
            Updater.m4326setimpl(composerM4318constructorimpl, modifierMaterializeModifier, (Function2<? super T, ? super Modifier, Unit>) id.h(companion2, composerM4318constructorimpl, Integer.valueOf(i5), composerM4318constructorimpl));
            ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.INSTANCE;
            composerStartRestartGroup.startReplaceGroup(1349576573);
            int i6 = 0;
            for (Object obj : subtitleVersionPrioritySettingsNormalized.getSortTypes()) {
                int i7 = i6 + 1;
                if (i6 < 0) {
                    CollectionsKt.throwIndexOverflow();
                }
                SubtitlePrioritySortType subtitlePrioritySortType = (SubtitlePrioritySortType) obj;
                FocusRequester focusRequester = (FocusRequester) list.get(i6);
                int i8 = i3 & Input.Keys.FORWARD_DEL;
                boolean zChangedInstance = (i8 == 32) | composerStartRestartGroup.changedInstance(subtitleVersionPrioritySettingsNormalized) | composerStartRestartGroup.changed(i6);
                Object objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                if (zChangedInstance || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                    objRememberedValue2 = new ns0(function1, subtitleVersionPrioritySettingsNormalized, i6, 3);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                }
                Function1 function2 = (Function1) objRememberedValue2;
                boolean z = i8 == 32;
                Object objRememberedValue3 = composerStartRestartGroup.rememberedValue();
                if (z || objRememberedValue3 == Composer.INSTANCE.getEmpty()) {
                    objRememberedValue3 = new f5(function1, 18);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
                }
                z(subtitlePrioritySortType, subtitleVersionPrioritySettingsNormalized, focusRequester, function2, (Function1) objRememberedValue3, composerStartRestartGroup, 0);
                i6 = i7;
            }
            if (i9.s(composerStartRestartGroup)) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new e81(subtitleVersionPrioritySettings, function1, i, 7));
        }
    }

    public static final void C(SystemNetworkSpeedDisplayMode systemNetworkSpeedDisplayMode, Function1 function1, Composer composer, int i) {
        Composer composerStartRestartGroup = composer.startRestartGroup(-1329497334);
        int i2 = (i & 6) == 0 ? (composerStartRestartGroup.changed(systemNetworkSpeedDisplayMode.ordinal()) ? 4 : 2) | i : i;
        if ((i & 48) == 0) {
            i2 |= composerStartRestartGroup.changedInstance(function1) ? 32 : 16;
        }
        if (composerStartRestartGroup.shouldExecute((i2 & 19) != 18, i2 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1329497334, i2, -1, "com.dh.myembyapp.ui.components.SystemNetworkSpeedDisplayModeSelector (OtherSettingsOverlay.kt:803)");
            }
            List<SystemNetworkSpeedDisplayMode> listListOf = CollectionsKt.listOf((Object[]) new SystemNetworkSpeedDisplayMode[]{SystemNetworkSpeedDisplayMode.MENU_ONLY, SystemNetworkSpeedDisplayMode.ALWAYS, SystemNetworkSpeedDisplayMode.OFF});
            Modifier modifierFillMaxWidth$default = SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null);
            MeasurePolicy measurePolicyRowMeasurePolicy = RowKt.rowMeasurePolicy(Arrangement.INSTANCE.m712spacedBy0680j_4(Dp.m7813constructorimpl(8.0f)), Alignment.INSTANCE.getTop(), composerStartRestartGroup, 6);
            long currentCompositeKeyHashCode = ComposablesKt.getCurrentCompositeKeyHashCode(composerStartRestartGroup, 0);
            int i3 = (int) (currentCompositeKeyHashCode ^ (currentCompositeKeyHashCode >>> 32));
            CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifierFillMaxWidth$default);
            ComposeUiNode.Companion companion = ComposeUiNode.INSTANCE;
            Function0<ComposeUiNode> constructor = companion.getConstructor();
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
            mr.z(companion, composerM4318constructorimpl, measurePolicyRowMeasurePolicy, composerM4318constructorimpl, currentCompositionLocalMap);
            Updater.m4326setimpl(composerM4318constructorimpl, modifierMaterializeModifier, (Function2<? super T, ? super Modifier, Unit>) id.h(companion, composerM4318constructorimpl, Integer.valueOf(i3), composerM4318constructorimpl));
            RowScopeInstance rowScopeInstance = RowScopeInstance.INSTANCE;
            composerStartRestartGroup.startReplaceGroup(-373727393);
            for (SystemNetworkSpeedDisplayMode systemNetworkSpeedDisplayMode2 : listListOf) {
                String label = systemNetworkSpeedDisplayMode2.getLabel();
                boolean z = systemNetworkSpeedDisplayMode == systemNetworkSpeedDisplayMode2;
                boolean zChanged = ((i2 & Input.Keys.FORWARD_DEL) == 32) | composerStartRestartGroup.changed(systemNetworkSpeedDisplayMode2.ordinal());
                Object objRememberedValue = composerStartRestartGroup.rememberedValue();
                if (zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                    objRememberedValue = new jx0(13, function1, systemNetworkSpeedDisplayMode2);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                }
                h(label, z, (Function0) objRememberedValue, composerStartRestartGroup, 0);
            }
            if (i9.s(composerStartRestartGroup)) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new e81(systemNetworkSpeedDisplayMode, function1, i, 1));
        }
    }

    public static final void D(SystemNetworkSpeedPosition systemNetworkSpeedPosition, Function1 function1, Composer composer, int i) {
        int i2;
        Composer composerStartRestartGroup = composer.startRestartGroup(1521264562);
        if ((i & 6) == 0) {
            i2 = (composerStartRestartGroup.changed(systemNetworkSpeedPosition.ordinal()) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= composerStartRestartGroup.changedInstance(function1) ? 32 : 16;
        }
        if (composerStartRestartGroup.shouldExecute((i2 & 19) != 18, i2 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1521264562, i2, -1, "com.dh.myembyapp.ui.components.SystemNetworkSpeedPositionSelector (OtherSettingsOverlay.kt:827)");
            }
            Modifier modifierFillMaxWidth$default = SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null);
            MeasurePolicy measurePolicyRowMeasurePolicy = RowKt.rowMeasurePolicy(Arrangement.INSTANCE.m712spacedBy0680j_4(Dp.m7813constructorimpl(8.0f)), Alignment.INSTANCE.getTop(), composerStartRestartGroup, 6);
            long currentCompositeKeyHashCode = ComposablesKt.getCurrentCompositeKeyHashCode(composerStartRestartGroup, 0);
            int i3 = (int) (currentCompositeKeyHashCode ^ (currentCompositeKeyHashCode >>> 32));
            CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifierFillMaxWidth$default);
            ComposeUiNode.Companion companion = ComposeUiNode.INSTANCE;
            Function0<ComposeUiNode> constructor = companion.getConstructor();
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
            mr.z(companion, composerM4318constructorimpl, measurePolicyRowMeasurePolicy, composerM4318constructorimpl, currentCompositionLocalMap);
            Updater.m4326setimpl(composerM4318constructorimpl, modifierMaterializeModifier, (Function2<? super T, ? super Modifier, Unit>) id.h(companion, composerM4318constructorimpl, Integer.valueOf(i3), composerM4318constructorimpl));
            RowScopeInstance rowScopeInstance = RowScopeInstance.INSTANCE;
            composerStartRestartGroup.startReplaceGroup(1499302363);
            Iterator<SystemNetworkSpeedPosition> it = SystemNetworkSpeedPosition.getEntries().iterator();
            while (it.hasNext()) {
                SystemNetworkSpeedPosition next = it.next();
                String label = next.getLabel();
                boolean z = systemNetworkSpeedPosition == next;
                boolean zChanged = ((i2 & Input.Keys.FORWARD_DEL) == 32) | composerStartRestartGroup.changed(next.ordinal());
                Object objRememberedValue = composerStartRestartGroup.rememberedValue();
                if (zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                    objRememberedValue = new jx0(15, function1, next);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                }
                h(label, z, (Function0) objRememberedValue, composerStartRestartGroup, 0);
            }
            if (i9.s(composerStartRestartGroup)) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new e81(systemNetworkSpeedPosition, function1, i, 3));
        }
    }

    public static final void F(SystemDurationDisplayMode systemDurationDisplayMode, Function1 function1, Composer composer, int i) {
        Composer composerStartRestartGroup = composer.startRestartGroup(-1329497335);
        int i2 = (i & 6) == 0 ? (composerStartRestartGroup.changed(systemDurationDisplayMode.ordinal()) ? 4 : 2) | i : i;
        if ((i & 48) == 0) {
            i2 |= composerStartRestartGroup.changedInstance(function1) ? 32 : 16;
        }
        if (composerStartRestartGroup.shouldExecute((i2 & 19) != 18, i2 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1329497335, i2, -1, "com.dh.myembyapp.ui.components.SystemDurationDisplayModeSelector (OtherSettingsOverlay.kt)");
            }
            List<SystemDurationDisplayMode> listListOf = CollectionsKt.listOf((Object[]) new SystemDurationDisplayMode[]{SystemDurationDisplayMode.MENU_ONLY, SystemDurationDisplayMode.ALWAYS, SystemDurationDisplayMode.OFF});
            Modifier modifierFillMaxWidth$default = SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null);
            MeasurePolicy measurePolicyRowMeasurePolicy = RowKt.rowMeasurePolicy(Arrangement.INSTANCE.m712spacedBy0680j_4(Dp.m7813constructorimpl(8.0f)), Alignment.INSTANCE.getTop(), composerStartRestartGroup, 6);
            long currentCompositeKeyHashCode = ComposablesKt.getCurrentCompositeKeyHashCode(composerStartRestartGroup, 0);
            int i3 = (int) (currentCompositeKeyHashCode ^ (currentCompositeKeyHashCode >>> 32));
            CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifierFillMaxWidth$default);
            ComposeUiNode.Companion companion = ComposeUiNode.INSTANCE;
            Function0<ComposeUiNode> constructor = companion.getConstructor();
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
            mr.z(companion, composerM4318constructorimpl, measurePolicyRowMeasurePolicy, composerM4318constructorimpl, currentCompositionLocalMap);
            Updater.m4326setimpl(composerM4318constructorimpl, modifierMaterializeModifier, (Function2<? super T, ? super Modifier, Unit>) id.h(companion, composerM4318constructorimpl, Integer.valueOf(i3), composerM4318constructorimpl));
            RowScopeInstance rowScopeInstance = RowScopeInstance.INSTANCE;
            composerStartRestartGroup.startReplaceGroup(-373727394);
            for (SystemDurationDisplayMode systemDurationDisplayMode2 : listListOf) {
                String label = systemDurationDisplayMode2.getLabel();
                boolean z = systemDurationDisplayMode == systemDurationDisplayMode2;
                boolean zChanged = ((i2 & 32) == 32) | composerStartRestartGroup.changed(systemDurationDisplayMode2.ordinal());
                Object objRememberedValue = composerStartRestartGroup.rememberedValue();
                if (zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                    objRememberedValue = new jx0(23, function1, systemDurationDisplayMode2);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                }
                h(label, z, (Function0) objRememberedValue, composerStartRestartGroup, 0);
            }
            if (i9.s(composerStartRestartGroup)) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new e81(systemDurationDisplayMode, function1, i, 4));
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void E(SystemTimeDisplayMode systemTimeDisplayMode, FocusRequester focusRequester, FocusRequester focusRequester2, FocusRequester focusRequester3, Function1 function1, Composer composer, int i) {
        int i2;
        Composer composer2;
        MutableState mutableState;
        MutableState mutableState2;
        MutableState mutableState3;
        Composer composerStartRestartGroup = composer.startRestartGroup(-1412627425);
        if ((i & 6) == 0) {
            i2 = (composerStartRestartGroup.changed(systemTimeDisplayMode.ordinal()) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= composerStartRestartGroup.changed(focusRequester) ? 32 : 16;
        }
        if ((i & RendererCapabilities.DECODER_SUPPORT_MASK) == 0) {
            i2 |= composerStartRestartGroup.changed(focusRequester2) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= composerStartRestartGroup.changed(focusRequester3) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i2 |= composerStartRestartGroup.changedInstance(function1) ? 16384 : 8192;
        }
        if (composerStartRestartGroup.shouldExecute((i2 & 9363) != 9362, i2 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1412627425, i2, -1, "com.dh.myembyapp.ui.components.SystemTimePinnedSelector (OtherSettingsOverlay.kt:671)");
            }
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            Composer.Companion companion = Composer.INSTANCE;
            if (objRememberedValue == companion.getEmpty()) {
                objRememberedValue = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Boolean.FALSE, null, 2, null);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            MutableState mutableState4 = (MutableState) objRememberedValue;
            Object objRememberedValue2 = composerStartRestartGroup.rememberedValue();
            if (objRememberedValue2 == companion.getEmpty()) {
                objRememberedValue2 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Boolean.FALSE, null, 2, null);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
            }
            MutableState mutableState5 = (MutableState) objRememberedValue2;
            Object objRememberedValue3 = composerStartRestartGroup.rememberedValue();
            if (objRememberedValue3 == companion.getEmpty()) {
                objRememberedValue3 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Boolean.FALSE, null, 2, null);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
            }
            MutableState mutableState6 = (MutableState) objRememberedValue3;
            int i3 = i2;
            State<Float> stateAnimateFloatAsState = AnimateAsStateKt.animateFloatAsState(((Boolean) mutableState4.getValue()).booleanValue() ? 1.06f : 1.0f, null, 0.0f, null, null, composerStartRestartGroup, 0, 30);
            State<Float> stateAnimateFloatAsState2 = AnimateAsStateKt.animateFloatAsState(((Boolean) mutableState5.getValue()).booleanValue() ? 1.06f : 1.0f, null, 0.0f, null, null, composerStartRestartGroup, 0, 30);
            State<Float> stateAnimateFloatAsState3 = AnimateAsStateKt.animateFloatAsState(((Boolean) mutableState6.getValue()).booleanValue() ? 1.06f : 1.0f, null, 0.0f, null, null, composerStartRestartGroup, 0, 30);
            Modifier.Companion companion2 = Modifier.INSTANCE;
            Modifier modifierFillMaxWidth$default = SizeKt.fillMaxWidth$default(companion2, 0.0f, 1, null);
            Arrangement.HorizontalOrVertical horizontalOrVerticalM712spacedBy0680j_4 = Arrangement.INSTANCE.m712spacedBy0680j_4(Dp.m7813constructorimpl(8.0f));
            Alignment.Companion companion3 = Alignment.INSTANCE;
            MeasurePolicy measurePolicyRowMeasurePolicy = RowKt.rowMeasurePolicy(horizontalOrVerticalM712spacedBy0680j_4, companion3.getTop(), composerStartRestartGroup, 6);
            long currentCompositeKeyHashCode = ComposablesKt.getCurrentCompositeKeyHashCode(composerStartRestartGroup, 0);
            int i4 = (int) (currentCompositeKeyHashCode ^ (currentCompositeKeyHashCode >>> 32));
            CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifierFillMaxWidth$default);
            ComposeUiNode.Companion companion4 = ComposeUiNode.INSTANCE;
            Function0<ComposeUiNode> constructor = companion4.getConstructor();
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
            mr.z(companion4, composerM4318constructorimpl, measurePolicyRowMeasurePolicy, composerM4318constructorimpl, currentCompositionLocalMap);
            Updater.m4326setimpl(composerM4318constructorimpl, modifierMaterializeModifier, (Function2<? super T, ? super Modifier, Unit>) id.h(companion4, composerM4318constructorimpl, Integer.valueOf(i4), composerM4318constructorimpl));
            RowScopeInstance rowScopeInstance = RowScopeInstance.INSTANCE;
            Modifier modifierThen = ScaleKt.scale(companion2, stateAnimateFloatAsState2.getValue().floatValue()).then(((Boolean) mutableState5.getValue()).booleanValue() ? BorderKt.m286borderxT4_qwU(companion2, Dp.m7813constructorimpl(2.0f), Color.INSTANCE.m5189getWhite0d7_KjU(), RoundedCornerShapeKt.RoundedCornerShape(50)) : companion2);
            MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(companion3.getTopStart(), false);
            long currentCompositeKeyHashCode2 = ComposablesKt.getCurrentCompositeKeyHashCode(composerStartRestartGroup, 0);
            int i5 = (int) (currentCompositeKeyHashCode2 ^ (currentCompositeKeyHashCode2 >>> 32));
            CompositionLocalMap currentCompositionLocalMap2 = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier2 = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifierThen);
            Function0<ComposeUiNode> constructor2 = companion4.getConstructor();
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
            mr.z(companion4, composerM4318constructorimpl2, measurePolicyMaybeCachedBoxMeasurePolicy, composerM4318constructorimpl2, currentCompositionLocalMap2);
            Updater.m4326setimpl(composerM4318constructorimpl2, modifierMaterializeModifier2, (Function2<? super T, ? super Modifier, Unit>) id.h(companion4, composerM4318constructorimpl2, Integer.valueOf(i5), composerM4318constructorimpl2));
            BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
            int i6 = i3 & 57344;
            boolean z = i6 == 16384;
            Object objRememberedValue4 = composerStartRestartGroup.rememberedValue();
            if (z || objRememberedValue4 == companion.getEmpty()) {
                objRememberedValue4 = new t4(function1, 6);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue4);
            }
            Function0 function0 = (Function0) objRememberedValue4;
            Modifier modifierFocusRequester = FocusRequesterModifierKt.focusRequester(SizeKt.m1069width3ABfNKs(companion2, Dp.m7813constructorimpl(110.0f)), focusRequester2);
            Object objRememberedValue5 = composerStartRestartGroup.rememberedValue();
            if (objRememberedValue5 == companion.getEmpty()) {
                mutableState = mutableState5;
                objRememberedValue5 = new p21(24, mutableState);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue5);
            } else {
                mutableState = mutableState5;
            }
            Modifier modifierOnFocusChanged = FocusChangedModifierKt.onFocusChanged(modifierFocusRequester, (Function1) objRememberedValue5);
            ButtonDefaults buttonDefaults = ButtonDefaults.INSTANCE;
            ButtonKt.m8231ButtonTCVpFMg(function0, modifierOnFocusChanged, null, false, ButtonDefaults.scale$default(buttonDefaults, 1.0f, 1.0f, 0.0f, 0.0f, 0.0f, 28, null), null, null, hc2.r(systemTimeDisplayMode == SystemTimeDisplayMode.MENU_ONLY, 0L, composerStartRestartGroup, 0, 6), 0.0f, null, PaddingKt.m993PaddingValuesYgX7TsA(Dp.m7813constructorimpl(14.0f), Dp.m7813constructorimpl(6.0f)), null, ComposableLambdaKt.rememberComposableLambda(-385165435, true, new w91(9, mutableState), composerStartRestartGroup, 54), composerStartRestartGroup, 0, 390, 2924);
            composerStartRestartGroup.endNode();
            Modifier modifierThen2 = ScaleKt.scale(companion2, stateAnimateFloatAsState3.getValue().floatValue()).then(((Boolean) mutableState6.getValue()).booleanValue() ? BorderKt.m286borderxT4_qwU(companion2, Dp.m7813constructorimpl(2.0f), Color.INSTANCE.m5189getWhite0d7_KjU(), RoundedCornerShapeKt.RoundedCornerShape(50)) : companion2);
            MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy2 = BoxKt.maybeCachedBoxMeasurePolicy(companion3.getTopStart(), false);
            long currentCompositeKeyHashCode3 = ComposablesKt.getCurrentCompositeKeyHashCode(composerStartRestartGroup, 0);
            int i7 = (int) (currentCompositeKeyHashCode3 ^ (currentCompositeKeyHashCode3 >>> 32));
            CompositionLocalMap currentCompositionLocalMap3 = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier3 = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifierThen2);
            Function0<ComposeUiNode> constructor3 = companion4.getConstructor();
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
            mr.z(companion4, composerM4318constructorimpl3, measurePolicyMaybeCachedBoxMeasurePolicy2, composerM4318constructorimpl3, currentCompositionLocalMap3);
            Updater.m4326setimpl(composerM4318constructorimpl3, modifierMaterializeModifier3, (Function2<? super T, ? super Modifier, Unit>) id.h(companion4, composerM4318constructorimpl3, Integer.valueOf(i7), composerM4318constructorimpl3));
            boolean z2 = i6 == 16384;
            Object objRememberedValue6 = composerStartRestartGroup.rememberedValue();
            if (z2 || objRememberedValue6 == companion.getEmpty()) {
                objRememberedValue6 = new t4(function1, 7);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue6);
            }
            Function0 function2 = (Function0) objRememberedValue6;
            Modifier modifierFocusRequester2 = FocusRequesterModifierKt.focusRequester(SizeKt.m1069width3ABfNKs(companion2, Dp.m7813constructorimpl(110.0f)), focusRequester3);
            Object objRememberedValue7 = composerStartRestartGroup.rememberedValue();
            if (objRememberedValue7 == companion.getEmpty()) {
                mutableState2 = mutableState6;
                objRememberedValue7 = new p21(25, mutableState2);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue7);
            } else {
                mutableState2 = mutableState6;
            }
            ButtonKt.m8231ButtonTCVpFMg(function2, FocusChangedModifierKt.onFocusChanged(modifierFocusRequester2, (Function1) objRememberedValue7), null, false, ButtonDefaults.scale$default(buttonDefaults, 1.0f, 1.0f, 0.0f, 0.0f, 0.0f, 28, null), null, null, hc2.r(systemTimeDisplayMode == SystemTimeDisplayMode.ALWAYS, 0L, composerStartRestartGroup, 0, 6), 0.0f, null, PaddingKt.m993PaddingValuesYgX7TsA(Dp.m7813constructorimpl(14.0f), Dp.m7813constructorimpl(6.0f)), null, ComposableLambdaKt.rememberComposableLambda(1950858478, true, new w91(10, mutableState2), composerStartRestartGroup, 54), composerStartRestartGroup, 0, 390, 2924);
            composerStartRestartGroup.endNode();
            Modifier modifierThen3 = ScaleKt.scale(companion2, stateAnimateFloatAsState.getValue().floatValue()).then(((Boolean) mutableState4.getValue()).booleanValue() ? BorderKt.m286borderxT4_qwU(companion2, Dp.m7813constructorimpl(2.0f), Color.INSTANCE.m5189getWhite0d7_KjU(), RoundedCornerShapeKt.RoundedCornerShape(50)) : companion2);
            MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy3 = BoxKt.maybeCachedBoxMeasurePolicy(companion3.getTopStart(), false);
            long currentCompositeKeyHashCode4 = ComposablesKt.getCurrentCompositeKeyHashCode(composerStartRestartGroup, 0);
            int i8 = (int) (currentCompositeKeyHashCode4 ^ (currentCompositeKeyHashCode4 >>> 32));
            CompositionLocalMap currentCompositionLocalMap4 = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier4 = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifierThen3);
            Function0<ComposeUiNode> constructor4 = companion4.getConstructor();
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
            mr.z(companion4, composerM4318constructorimpl4, measurePolicyMaybeCachedBoxMeasurePolicy3, composerM4318constructorimpl4, currentCompositionLocalMap4);
            Updater.m4326setimpl(composerM4318constructorimpl4, modifierMaterializeModifier4, (Function2<? super T, ? super Modifier, Unit>) id.h(companion4, composerM4318constructorimpl4, Integer.valueOf(i8), composerM4318constructorimpl4));
            boolean z3 = i6 == 16384;
            Object objRememberedValue8 = composerStartRestartGroup.rememberedValue();
            if (z3 || objRememberedValue8 == companion.getEmpty()) {
                objRememberedValue8 = new t4(function1, 5);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue8);
            }
            Function0 function3 = (Function0) objRememberedValue8;
            Modifier modifierFocusRequester3 = FocusRequesterModifierKt.focusRequester(SizeKt.m1069width3ABfNKs(companion2, Dp.m7813constructorimpl(110.0f)), focusRequester);
            Object objRememberedValue9 = composerStartRestartGroup.rememberedValue();
            if (objRememberedValue9 == companion.getEmpty()) {
                mutableState3 = mutableState4;
                objRememberedValue9 = new p21(22, mutableState3);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue9);
            } else {
                mutableState3 = mutableState4;
            }
            ButtonKt.m8231ButtonTCVpFMg(function3, FocusChangedModifierKt.onFocusChanged(modifierFocusRequester3, (Function1) objRememberedValue9), null, false, ButtonDefaults.scale$default(buttonDefaults, 1.0f, 1.0f, 0.0f, 0.0f, 0.0f, 28, null), null, null, hc2.r(systemTimeDisplayMode == SystemTimeDisplayMode.OFF, 0L, composerStartRestartGroup, 0, 6), 0.0f, null, PaddingKt.m993PaddingValuesYgX7TsA(Dp.m7813constructorimpl(14.0f), Dp.m7813constructorimpl(6.0f)), null, ComposableLambdaKt.rememberComposableLambda(-1049689971, true, new w91(8, mutableState3), composerStartRestartGroup, 54), composerStartRestartGroup, 0, 390, 2924);
            composer2 = composerStartRestartGroup;
            if (x2.m(composer2)) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composer2 = composerStartRestartGroup;
            composer2.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new eh((Object) systemTimeDisplayMode, (Object) focusRequester, (Object) focusRequester2, (Object) focusRequester3, function1, i, 7));
        }
    }

    public static final void F(VideoPriorityRule videoPriorityRule, Function1 function1, Function0 function0, Composer composer, int i) {
        int i2;
        String str;
        Composer composerStartRestartGroup = composer.startRestartGroup(672458281);
        if ((i & 6) == 0) {
            i2 = (composerStartRestartGroup.changedInstance(videoPriorityRule) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= composerStartRestartGroup.changedInstance(function1) ? 32 : 16;
        }
        if ((i & RendererCapabilities.DECODER_SUPPORT_MASK) == 0) {
            i2 |= composerStartRestartGroup.changedInstance(function0) ? 256 : 128;
        }
        if (composerStartRestartGroup.shouldExecute((i2 & Input.Keys.NUMPAD_3) != 146, i2 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(672458281, i2, -1, "com.dh.myembyapp.ui.components.VideoPriorityOrderDialog (OtherSettingsOverlay.kt:1372)");
            }
            int i3 = bc1.$EnumSwitchMapping$0[videoPriorityRule.getSortType().ordinal()];
            if (i3 == 1) {
                str = "画质标准顺序";
            } else if (i3 == 2) {
                str = "码率大小顺序";
            } else if (i3 == 3) {
                str = "文件大小顺序";
            } else if (i3 == 4) {
                str = "分辨率大小顺序";
            } else {
                if (i3 != 5) {
                    qu.f();
                    return;
                }
                str = "视频顺序";
            }
            String str2 = str;
            boolean zChanged = composerStartRestartGroup.changed(videoPriorityRule.getSortType().ordinal());
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            if (zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                objRememberedValue = mr.n(composerStartRestartGroup);
            }
            FocusRequester focusRequester = (FocusRequester) objRememberedValue;
            boolean zChanged2 = composerStartRestartGroup.changed(videoPriorityRule.getQualityPriorities());
            Object objRememberedValue2 = composerStartRestartGroup.rememberedValue();
            if (zChanged2 || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                VideoVersionPrioritySettings.Companion companion = VideoVersionPrioritySettings.INSTANCE;
                Map<VideoQualityStandard, Integer> qualityPriorities = videoPriorityRule.getQualityPriorities();
                if (qualityPriorities == null) {
                    qualityPriorities = companion.getDEFAULT_QUALITY_PRIORITIES();
                }
                objRememberedValue2 = companion.normalizeQualityPriorities(qualityPriorities);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
            }
            AndroidDialog_androidKt.Dialog(function0, new DialogProperties(true, false, false), ComposableLambdaKt.rememberComposableLambda(426404864, true, new f2(str2, videoPriorityRule, focusRequester, function1, function0, (Map) objRememberedValue2), composerStartRestartGroup, 54), composerStartRestartGroup, ((i2 >> 6) & 14) | 432, 0);
            VideoPrioritySortType sortType = videoPriorityRule.getSortType();
            boolean zChanged3 = composerStartRestartGroup.changed(focusRequester);
            Object objRememberedValue3 = composerStartRestartGroup.rememberedValue();
            if (zChanged3 || objRememberedValue3 == Composer.INSTANCE.getEmpty()) {
                objRememberedValue3 = new ng(focusRequester, null, 8);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
            }
            EffectsKt.LaunchedEffect(sortType, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) objRememberedValue3, composerStartRestartGroup, 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new x7(i, 18, videoPriorityRule, function1, function0));
        }
    }

    /* JADX WARN: Code duplicated, block: B:101:0x01fa  */
    /* JADX WARN: Code duplicated, block: B:103:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:23:0x003f  */
    /* JADX WARN: Code duplicated, block: B:25:0x0044  */
    /* JADX WARN: Code duplicated, block: B:27:0x0048  */
    /* JADX WARN: Code duplicated, block: B:29:0x0050  */
    /* JADX WARN: Code duplicated, block: B:30:0x0053  */
    /* JADX WARN: Code duplicated, block: B:34:0x005a  */
    /* JADX WARN: Code duplicated, block: B:36:0x0060  */
    /* JADX WARN: Code duplicated, block: B:37:0x0063  */
    /* JADX WARN: Code duplicated, block: B:41:0x006d  */
    /* JADX WARN: Code duplicated, block: B:42:0x006f  */
    /* JADX WARN: Code duplicated, block: B:45:0x0078 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:46:0x007a  */
    /* JADX WARN: Code duplicated, block: B:49:0x007e  */
    /* JADX WARN: Code duplicated, block: B:52:0x0085  */
    /* JADX WARN: Code duplicated, block: B:55:0x0097  */
    /* JADX WARN: Code duplicated, block: B:58:0x00ae A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:61:0x00b5  */
    /* JADX WARN: Code duplicated, block: B:64:0x00f6 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:66:0x010d  */
    /* JADX WARN: Code duplicated, block: B:70:0x013a  */
    /* JADX WARN: Code duplicated, block: B:73:0x0146  */
    /* JADX WARN: Code duplicated, block: B:74:0x014a  */
    /* JADX WARN: Code duplicated, block: B:77:0x016b  */
    /* JADX WARN: Code duplicated, block: B:80:0x017d  */
    /* JADX WARN: Code duplicated, block: B:83:0x0193  */
    /* JADX WARN: Code duplicated, block: B:84:0x0195  */
    /* JADX WARN: Code duplicated, block: B:87:0x019c  */
    /* JADX WARN: Code duplicated, block: B:88:0x019f  */
    /* JADX WARN: Code duplicated, block: B:91:0x01a9  */
    /* JADX WARN: Code duplicated, block: B:93:0x01af  */
    /* JADX WARN: Code duplicated, block: B:96:0x01e8  */
    /* JADX WARN: Code duplicated, block: B:98:0x01ef  */
    /* JADX WARN: Multi-variable type inference failed */
    public static final void G(String str, boolean z, FocusRequester focusRequester, Function0 function0, Composer composer, int i, int i2) {
        int i3;
        boolean z2;
        int i4;
        FocusRequester focusRequester2;
        int i5;
        boolean z3;
        boolean z4;
        FocusRequester focusRequester3;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Object objRememberedValue;
        Composer.Companion companion;
        MutableState mutableState;
        float f;
        boolean z5;
        FocusRequester focusRequester4;
        Modifier modifierFocusRequester;
        Modifier modifierM286borderxT4_qwU;
        Function0<ComposeUiNode> constructor;
        Object objRememberedValue2;
        boolean z6;
        boolean z7;
        boolean z8;
        Object objRememberedValue3;
        int i6;
        Composer composerStartRestartGroup = composer.startRestartGroup(194376196);
        if ((i & 6) == 0) {
            i3 = (composerStartRestartGroup.changed(str) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        int i7 = i2 & 2;
        if (i7 == 0) {
            if ((i & 48) == 0) {
                z2 = z;
                i3 |= composerStartRestartGroup.changed(z2) ? 32 : 16;
            }
            i4 = i2 & 4;
            if (i4 != 0) {
                if ((i & RendererCapabilities.DECODER_SUPPORT_MASK) == 0) {
                    focusRequester2 = focusRequester;
                    if (composerStartRestartGroup.changed(focusRequester2)) {
                        i5 = 256;
                    } else {
                        i5 = 128;
                    }
                    i3 |= i5;
                }
                if ((i & 3072) == 0) {
                    if (composerStartRestartGroup.changedInstance(function0)) {
                        i6 = 2048;
                    } else {
                        i6 = 1024;
                    }
                    i3 |= i6;
                }
                if ((i3 & 1171) != 1170) {
                    z3 = true;
                } else {
                    z3 = false;
                }
                if (composerStartRestartGroup.shouldExecute(z3, i3 & 1)) {
                    if (i7 != 0) {
                        z2 = true;
                    }
                    if (i4 != 0) {
                        focusRequester2 = null;
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(194376196, i3, -1, "com.dh.myembyapp.ui.components.VideoPriorityRoundButton (OtherSettingsOverlay.kt:1276)");
                    }
                    objRememberedValue = composerStartRestartGroup.rememberedValue();
                    companion = Composer.INSTANCE;
                    if (objRememberedValue == companion.getEmpty()) {
                        objRememberedValue = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Boolean.FALSE, null, 2, null);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                    }
                    mutableState = (MutableState) objRememberedValue;
                    if (((Boolean) mutableState.getValue()).booleanValue() || !z2) {
                        f = 1.0f;
                    } else {
                        f = 1.08f;
                    }
                    z5 = z2;
                    focusRequester4 = focusRequester2;
                    State<Float> stateAnimateFloatAsState = AnimateAsStateKt.animateFloatAsState(f, null, 0.0f, null, null, composerStartRestartGroup, 0, 30);
                    modifierFocusRequester = Modifier.INSTANCE;
                    Modifier modifierScale = ScaleKt.scale(SizeKt.m1064size3ABfNKs(modifierFocusRequester, Dp.m7813constructorimpl(30.0f)), stateAnimateFloatAsState.getValue().floatValue());
                    if (((Boolean) mutableState.getValue()).booleanValue() || !z5) {
                        modifierM286borderxT4_qwU = modifierFocusRequester;
                    } else {
                        modifierM286borderxT4_qwU = BorderKt.m286borderxT4_qwU(modifierFocusRequester, Dp.m7813constructorimpl(2.0f), Color.INSTANCE.m5189getWhite0d7_KjU(), RoundedCornerShapeKt.getCircleShape());
                    }
                    Modifier modifierThen = modifierScale.then(modifierM286borderxT4_qwU);
                    MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.INSTANCE.getTopStart(), false);
                    long currentCompositeKeyHashCode = ComposablesKt.getCurrentCompositeKeyHashCode(composerStartRestartGroup, 0);
                    int i8 = (int) (currentCompositeKeyHashCode ^ (currentCompositeKeyHashCode >>> 32));
                    CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
                    Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifierThen);
                    ComposeUiNode.Companion companion2 = ComposeUiNode.INSTANCE;
                    constructor = companion2.getConstructor();
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
                    mr.z(companion2, composerM4318constructorimpl, measurePolicyMaybeCachedBoxMeasurePolicy, composerM4318constructorimpl, currentCompositionLocalMap);
                    Updater.m4326setimpl(composerM4318constructorimpl, modifierMaterializeModifier, (Function2<? super T, ? super Modifier, Unit>) id.h(companion2, composerM4318constructorimpl, Integer.valueOf(i8), composerM4318constructorimpl));
                    BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
                    Modifier modifierM1064size3ABfNKs = SizeKt.m1064size3ABfNKs(modifierFocusRequester, Dp.m7813constructorimpl(30.0f));
                    if (focusRequester4 != null) {
                        modifierFocusRequester = FocusRequesterModifierKt.focusRequester(modifierFocusRequester, focusRequester4);
                    }
                    Modifier modifierThen2 = modifierM1064size3ABfNKs.then(modifierFocusRequester);
                    objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                    if (objRememberedValue2 == companion.getEmpty()) {
                        objRememberedValue2 = new p21(12, mutableState);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                    }
                    Modifier modifierOnFocusChanged = FocusChangedModifierKt.onFocusChanged(modifierThen2, (Function1) objRememberedValue2);
                    if ((i3 & Input.Keys.FORWARD_DEL) == 32) {
                        z6 = true;
                    } else {
                        z6 = false;
                    }
                    if ((i3 & 7168) == 2048) {
                        z7 = true;
                    } else {
                        z7 = false;
                    }
                    z8 = z6 | z7;
                    objRememberedValue3 = composerStartRestartGroup.rememberedValue();
                    if (z8 || objRememberedValue3 == companion.getEmpty()) {
                        objRememberedValue3 = new fv(z5, function0, 7);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
                    }
                    IconButtonKt.IconButton((Function0) objRememberedValue3, modifierOnFocusChanged, z5, null, null, null, ComposableLambdaKt.rememberComposableLambda(805847720, true, new az(1, str, z5), composerStartRestartGroup, 54), composerStartRestartGroup, ((i3 << 3) & 896) | 1572864, 56);
                    composerStartRestartGroup = composerStartRestartGroup;
                    composerStartRestartGroup.endNode();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    z4 = z5;
                    focusRequester3 = focusRequester4;
                } else {
                    composerStartRestartGroup.skipToGroupEnd();
                    z4 = z2;
                    focusRequester3 = focusRequester2;
                }
                scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup != null) {
                    scopeUpdateScopeEndRestartGroup.updateScope(new lb1(str, z4, focusRequester3, function0, i, i2, 0));
                }
            }
            i3 |= RendererCapabilities.DECODER_SUPPORT_MASK;
            focusRequester2 = focusRequester;
            if ((i & 3072) == 0) {
                if (composerStartRestartGroup.changedInstance(function0)) {
                    i6 = 2048;
                } else {
                    i6 = 1024;
                }
                i3 |= i6;
            }
            if ((i3 & 1171) != 1170) {
                z3 = true;
            } else {
                z3 = false;
            }
            if (composerStartRestartGroup.shouldExecute(z3, i3 & 1)) {
                if (i7 != 0) {
                    z2 = true;
                }
                if (i4 != 0) {
                    focusRequester2 = null;
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(194376196, i3, -1, "com.dh.myembyapp.ui.components.VideoPriorityRoundButton (OtherSettingsOverlay.kt:1276)");
                }
                objRememberedValue = composerStartRestartGroup.rememberedValue();
                companion = Composer.INSTANCE;
                if (objRememberedValue == companion.getEmpty()) {
                    objRememberedValue = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Boolean.FALSE, null, 2, null);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                }
                mutableState = (MutableState) objRememberedValue;
                if (((Boolean) mutableState.getValue()).booleanValue()) {
                    f = 1.0f;
                } else {
                    f = 1.0f;
                }
                z5 = z2;
                focusRequester4 = focusRequester2;
                State<Float> stateAnimateFloatAsState2 = AnimateAsStateKt.animateFloatAsState(f, null, 0.0f, null, null, composerStartRestartGroup, 0, 30);
                modifierFocusRequester = Modifier.INSTANCE;
                Modifier modifierScale2 = ScaleKt.scale(SizeKt.m1064size3ABfNKs(modifierFocusRequester, Dp.m7813constructorimpl(30.0f)), stateAnimateFloatAsState2.getValue().floatValue());
                if (((Boolean) mutableState.getValue()).booleanValue()) {
                    modifierM286borderxT4_qwU = modifierFocusRequester;
                } else {
                    modifierM286borderxT4_qwU = modifierFocusRequester;
                }
                Modifier modifierThen3 = modifierScale2.then(modifierM286borderxT4_qwU);
                MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy2 = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.INSTANCE.getTopStart(), false);
                long currentCompositeKeyHashCode2 = ComposablesKt.getCurrentCompositeKeyHashCode(composerStartRestartGroup, 0);
                int i9 = (int) (currentCompositeKeyHashCode2 ^ (currentCompositeKeyHashCode2 >>> 32));
                CompositionLocalMap currentCompositionLocalMap2 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                Modifier modifierMaterializeModifier2 = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifierThen3);
                ComposeUiNode.Companion companion3 = ComposeUiNode.INSTANCE;
                constructor = companion3.getConstructor();
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
                mr.z(companion3, composerM4318constructorimpl2, measurePolicyMaybeCachedBoxMeasurePolicy2, composerM4318constructorimpl2, currentCompositionLocalMap2);
                Updater.m4326setimpl(composerM4318constructorimpl2, modifierMaterializeModifier2, (Function2<? super T, ? super Modifier, Unit>) id.h(companion3, composerM4318constructorimpl2, Integer.valueOf(i9), composerM4318constructorimpl2));
                BoxScopeInstance boxScopeInstance2 = BoxScopeInstance.INSTANCE;
                Modifier modifierM1064size3ABfNKs2 = SizeKt.m1064size3ABfNKs(modifierFocusRequester, Dp.m7813constructorimpl(30.0f));
                if (focusRequester4 != null) {
                    modifierFocusRequester = FocusRequesterModifierKt.focusRequester(modifierFocusRequester, focusRequester4);
                }
                Modifier modifierThen4 = modifierM1064size3ABfNKs2.then(modifierFocusRequester);
                objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                if (objRememberedValue2 == companion.getEmpty()) {
                    objRememberedValue2 = new p21(12, mutableState);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                }
                Modifier modifierOnFocusChanged2 = FocusChangedModifierKt.onFocusChanged(modifierThen4, (Function1) objRememberedValue2);
                if ((i3 & Input.Keys.FORWARD_DEL) == 32) {
                    z6 = true;
                } else {
                    z6 = false;
                }
                if ((i3 & 7168) == 2048) {
                    z7 = true;
                } else {
                    z7 = false;
                }
                z8 = z6 | z7;
                objRememberedValue3 = composerStartRestartGroup.rememberedValue();
                if (z8) {
                    objRememberedValue3 = new fv(z5, function0, 7);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
                } else {
                    objRememberedValue3 = new fv(z5, function0, 7);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
                }
                IconButtonKt.IconButton((Function0) objRememberedValue3, modifierOnFocusChanged2, z5, null, null, null, ComposableLambdaKt.rememberComposableLambda(805847720, true, new az(1, str, z5), composerStartRestartGroup, 54), composerStartRestartGroup, ((i3 << 3) & 896) | 1572864, 56);
                composerStartRestartGroup = composerStartRestartGroup;
                composerStartRestartGroup.endNode();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                z4 = z5;
                focusRequester3 = focusRequester4;
            } else {
                composerStartRestartGroup.skipToGroupEnd();
                z4 = z2;
                focusRequester3 = focusRequester2;
            }
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup != null) {
                scopeUpdateScopeEndRestartGroup.updateScope(new lb1(str, z4, focusRequester3, function0, i, i2, 0));
            }
        }
        i3 |= 48;
        z2 = z;
        i4 = i2 & 4;
        if (i4 != 0) {
            if ((i & RendererCapabilities.DECODER_SUPPORT_MASK) == 0) {
                focusRequester2 = focusRequester;
                if (composerStartRestartGroup.changed(focusRequester2)) {
                    i5 = 256;
                } else {
                    i5 = 128;
                }
                i3 |= i5;
            }
            if ((i & 3072) == 0) {
                if (composerStartRestartGroup.changedInstance(function0)) {
                    i6 = 2048;
                } else {
                    i6 = 1024;
                }
                i3 |= i6;
            }
            if ((i3 & 1171) != 1170) {
                z3 = true;
            } else {
                z3 = false;
            }
            if (composerStartRestartGroup.shouldExecute(z3, i3 & 1)) {
                if (i7 != 0) {
                    z2 = true;
                }
                if (i4 != 0) {
                    focusRequester2 = null;
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(194376196, i3, -1, "com.dh.myembyapp.ui.components.VideoPriorityRoundButton (OtherSettingsOverlay.kt:1276)");
                }
                objRememberedValue = composerStartRestartGroup.rememberedValue();
                companion = Composer.INSTANCE;
                if (objRememberedValue == companion.getEmpty()) {
                    objRememberedValue = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Boolean.FALSE, null, 2, null);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                }
                mutableState = (MutableState) objRememberedValue;
                if (((Boolean) mutableState.getValue()).booleanValue()) {
                    f = 1.0f;
                } else {
                    f = 1.0f;
                }
                z5 = z2;
                focusRequester4 = focusRequester2;
                State<Float> stateAnimateFloatAsState3 = AnimateAsStateKt.animateFloatAsState(f, null, 0.0f, null, null, composerStartRestartGroup, 0, 30);
                modifierFocusRequester = Modifier.INSTANCE;
                Modifier modifierScale3 = ScaleKt.scale(SizeKt.m1064size3ABfNKs(modifierFocusRequester, Dp.m7813constructorimpl(30.0f)), stateAnimateFloatAsState3.getValue().floatValue());
                if (((Boolean) mutableState.getValue()).booleanValue()) {
                    modifierM286borderxT4_qwU = modifierFocusRequester;
                } else {
                    modifierM286borderxT4_qwU = modifierFocusRequester;
                }
                Modifier modifierThen5 = modifierScale3.then(modifierM286borderxT4_qwU);
                MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy3 = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.INSTANCE.getTopStart(), false);
                long currentCompositeKeyHashCode3 = ComposablesKt.getCurrentCompositeKeyHashCode(composerStartRestartGroup, 0);
                int i10 = (int) (currentCompositeKeyHashCode3 ^ (currentCompositeKeyHashCode3 >>> 32));
                CompositionLocalMap currentCompositionLocalMap3 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                Modifier modifierMaterializeModifier3 = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifierThen5);
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
                Composer composerM4318constructorimpl3 = Updater.m4318constructorimpl(composerStartRestartGroup);
                mr.z(companion4, composerM4318constructorimpl3, measurePolicyMaybeCachedBoxMeasurePolicy3, composerM4318constructorimpl3, currentCompositionLocalMap3);
                Updater.m4326setimpl(composerM4318constructorimpl3, modifierMaterializeModifier3, (Function2<? super T, ? super Modifier, Unit>) id.h(companion4, composerM4318constructorimpl3, Integer.valueOf(i10), composerM4318constructorimpl3));
                BoxScopeInstance boxScopeInstance3 = BoxScopeInstance.INSTANCE;
                Modifier modifierM1064size3ABfNKs3 = SizeKt.m1064size3ABfNKs(modifierFocusRequester, Dp.m7813constructorimpl(30.0f));
                if (focusRequester4 != null) {
                    modifierFocusRequester = FocusRequesterModifierKt.focusRequester(modifierFocusRequester, focusRequester4);
                }
                Modifier modifierThen6 = modifierM1064size3ABfNKs3.then(modifierFocusRequester);
                objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                if (objRememberedValue2 == companion.getEmpty()) {
                    objRememberedValue2 = new p21(12, mutableState);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                }
                Modifier modifierOnFocusChanged3 = FocusChangedModifierKt.onFocusChanged(modifierThen6, (Function1) objRememberedValue2);
                if ((i3 & Input.Keys.FORWARD_DEL) == 32) {
                    z6 = true;
                } else {
                    z6 = false;
                }
                if ((i3 & 7168) == 2048) {
                    z7 = true;
                } else {
                    z7 = false;
                }
                z8 = z6 | z7;
                objRememberedValue3 = composerStartRestartGroup.rememberedValue();
                if (z8) {
                    objRememberedValue3 = new fv(z5, function0, 7);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
                } else {
                    objRememberedValue3 = new fv(z5, function0, 7);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
                }
                IconButtonKt.IconButton((Function0) objRememberedValue3, modifierOnFocusChanged3, z5, null, null, null, ComposableLambdaKt.rememberComposableLambda(805847720, true, new az(1, str, z5), composerStartRestartGroup, 54), composerStartRestartGroup, ((i3 << 3) & 896) | 1572864, 56);
                composerStartRestartGroup = composerStartRestartGroup;
                composerStartRestartGroup.endNode();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                z4 = z5;
                focusRequester3 = focusRequester4;
            } else {
                composerStartRestartGroup.skipToGroupEnd();
                z4 = z2;
                focusRequester3 = focusRequester2;
            }
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup != null) {
                scopeUpdateScopeEndRestartGroup.updateScope(new lb1(str, z4, focusRequester3, function0, i, i2, 0));
            }
        }
        i3 |= RendererCapabilities.DECODER_SUPPORT_MASK;
        focusRequester2 = focusRequester;
        if ((i & 3072) == 0) {
            if (composerStartRestartGroup.changedInstance(function0)) {
                i6 = 2048;
            } else {
                i6 = 1024;
            }
            i3 |= i6;
        }
        if ((i3 & 1171) != 1170) {
            z3 = true;
        } else {
            z3 = false;
        }
        if (composerStartRestartGroup.shouldExecute(z3, i3 & 1)) {
            if (i7 != 0) {
                z2 = true;
            }
            if (i4 != 0) {
                focusRequester2 = null;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(194376196, i3, -1, "com.dh.myembyapp.ui.components.VideoPriorityRoundButton (OtherSettingsOverlay.kt:1276)");
            }
            objRememberedValue = composerStartRestartGroup.rememberedValue();
            companion = Composer.INSTANCE;
            if (objRememberedValue == companion.getEmpty()) {
                objRememberedValue = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Boolean.FALSE, null, 2, null);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            mutableState = (MutableState) objRememberedValue;
            if (((Boolean) mutableState.getValue()).booleanValue()) {
                f = 1.0f;
            } else {
                f = 1.0f;
            }
            z5 = z2;
            focusRequester4 = focusRequester2;
            State<Float> stateAnimateFloatAsState4 = AnimateAsStateKt.animateFloatAsState(f, null, 0.0f, null, null, composerStartRestartGroup, 0, 30);
            modifierFocusRequester = Modifier.INSTANCE;
            Modifier modifierScale4 = ScaleKt.scale(SizeKt.m1064size3ABfNKs(modifierFocusRequester, Dp.m7813constructorimpl(30.0f)), stateAnimateFloatAsState4.getValue().floatValue());
            if (((Boolean) mutableState.getValue()).booleanValue()) {
                modifierM286borderxT4_qwU = modifierFocusRequester;
            } else {
                modifierM286borderxT4_qwU = modifierFocusRequester;
            }
            Modifier modifierThen7 = modifierScale4.then(modifierM286borderxT4_qwU);
            MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy4 = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.INSTANCE.getTopStart(), false);
            long currentCompositeKeyHashCode4 = ComposablesKt.getCurrentCompositeKeyHashCode(composerStartRestartGroup, 0);
            int i11 = (int) (currentCompositeKeyHashCode4 ^ (currentCompositeKeyHashCode4 >>> 32));
            CompositionLocalMap currentCompositionLocalMap4 = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier4 = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifierThen7);
            ComposeUiNode.Companion companion5 = ComposeUiNode.INSTANCE;
            constructor = companion5.getConstructor();
            if (composerStartRestartGroup.getApplier() == null) {
                ComposablesKt.invalidApplier();
            }
            composerStartRestartGroup.startReusableNode();
            if (composerStartRestartGroup.getInserting()) {
                composerStartRestartGroup.createNode(constructor);
            } else {
                composerStartRestartGroup.useNode();
            }
            Composer composerM4318constructorimpl4 = Updater.m4318constructorimpl(composerStartRestartGroup);
            mr.z(companion5, composerM4318constructorimpl4, measurePolicyMaybeCachedBoxMeasurePolicy4, composerM4318constructorimpl4, currentCompositionLocalMap4);
            Updater.m4326setimpl(composerM4318constructorimpl4, modifierMaterializeModifier4, (Function2<? super T, ? super Modifier, Unit>) id.h(companion5, composerM4318constructorimpl4, Integer.valueOf(i11), composerM4318constructorimpl4));
            BoxScopeInstance boxScopeInstance4 = BoxScopeInstance.INSTANCE;
            Modifier modifierM1064size3ABfNKs4 = SizeKt.m1064size3ABfNKs(modifierFocusRequester, Dp.m7813constructorimpl(30.0f));
            if (focusRequester4 != null) {
                modifierFocusRequester = FocusRequesterModifierKt.focusRequester(modifierFocusRequester, focusRequester4);
            }
            Modifier modifierThen8 = modifierM1064size3ABfNKs4.then(modifierFocusRequester);
            objRememberedValue2 = composerStartRestartGroup.rememberedValue();
            if (objRememberedValue2 == companion.getEmpty()) {
                objRememberedValue2 = new p21(12, mutableState);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
            }
            Modifier modifierOnFocusChanged4 = FocusChangedModifierKt.onFocusChanged(modifierThen8, (Function1) objRememberedValue2);
            if ((i3 & Input.Keys.FORWARD_DEL) == 32) {
                z6 = true;
            } else {
                z6 = false;
            }
            if ((i3 & 7168) == 2048) {
                z7 = true;
            } else {
                z7 = false;
            }
            z8 = z6 | z7;
            objRememberedValue3 = composerStartRestartGroup.rememberedValue();
            if (z8) {
                objRememberedValue3 = new fv(z5, function0, 7);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
            } else {
                objRememberedValue3 = new fv(z5, function0, 7);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
            }
            IconButtonKt.IconButton((Function0) objRememberedValue3, modifierOnFocusChanged4, z5, null, null, null, ComposableLambdaKt.rememberComposableLambda(805847720, true, new az(1, str, z5), composerStartRestartGroup, 54), composerStartRestartGroup, ((i3 << 3) & 896) | 1572864, 56);
            composerStartRestartGroup = composerStartRestartGroup;
            composerStartRestartGroup.endNode();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            z4 = z5;
            focusRequester3 = focusRequester4;
        } else {
            composerStartRestartGroup.skipToGroupEnd();
            z4 = z2;
            focusRequester3 = focusRequester2;
        }
        scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new lb1(str, z4, focusRequester3, function0, i, i2, 0));
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void H(VideoPriorityRule videoPriorityRule, boolean z, boolean z2, FocusRequester focusRequester, FocusRequester focusRequester2, Function1 function1, Function0 function0, Function0 function2, Composer composer, int i) {
        VideoPriorityRule videoPriorityRule2;
        int i2;
        Modifier.Companion companion;
        Composer composerStartRestartGroup = composer.startRestartGroup(1675804957);
        if ((i & 6) == 0) {
            videoPriorityRule2 = videoPriorityRule;
            i2 = (composerStartRestartGroup.changedInstance(videoPriorityRule2) ? 4 : 2) | i;
        } else {
            videoPriorityRule2 = videoPriorityRule;
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= composerStartRestartGroup.changed(z) ? 32 : 16;
        }
        if ((i & RendererCapabilities.DECODER_SUPPORT_MASK) == 0) {
            i2 |= composerStartRestartGroup.changed(z2) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= composerStartRestartGroup.changed(focusRequester) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i2 |= composerStartRestartGroup.changed(focusRequester2) ? 16384 : 8192;
        }
        if ((196608 & i) == 0) {
            i2 |= composerStartRestartGroup.changedInstance(function1) ? 131072 : 65536;
        }
        if ((1572864 & i) == 0) {
            i2 |= composerStartRestartGroup.changedInstance(function0) ? 1048576 : 524288;
        }
        if ((12582912 & i) == 0) {
            i2 |= composerStartRestartGroup.changedInstance(function2) ? 8388608 : 4194304;
        }
        if (composerStartRestartGroup.shouldExecute((4793491 & i2) != 4793490, i2 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1675804957, i2, -1, "com.dh.myembyapp.ui.components.VideoPriorityRuleRow (OtherSettingsOverlay.kt:1199)");
            }
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            Composer.Companion companion2 = Composer.INSTANCE;
            if (objRememberedValue == companion2.getEmpty()) {
                objRememberedValue = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Boolean.FALSE, null, 2, null);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            MutableState mutableState = (MutableState) objRememberedValue;
            Object objRememberedValue2 = composerStartRestartGroup.rememberedValue();
            if (objRememberedValue2 == companion2.getEmpty()) {
                objRememberedValue2 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Boolean.FALSE, null, 2, null);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
            }
            MutableState mutableState2 = (MutableState) objRememberedValue2;
            VideoPriorityRule videoPriorityRuleNormalized = videoPriorityRule2.normalized();
            Modifier.Companion companion3 = Modifier.INSTANCE;
            Modifier modifierFillMaxWidth$default = SizeKt.fillMaxWidth$default(companion3, 0.0f, 1, null);
            MeasurePolicy measurePolicyRowMeasurePolicy = RowKt.rowMeasurePolicy(Arrangement.INSTANCE.m712spacedBy0680j_4(Dp.m7813constructorimpl(8.0f)), Alignment.INSTANCE.getCenterVertically(), composerStartRestartGroup, 54);
            long currentCompositeKeyHashCode = ComposablesKt.getCurrentCompositeKeyHashCode(composerStartRestartGroup, 0);
            int i3 = (int) (currentCompositeKeyHashCode ^ (currentCompositeKeyHashCode >>> 32));
            CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifierFillMaxWidth$default);
            ComposeUiNode.Companion companion4 = ComposeUiNode.INSTANCE;
            Function0<ComposeUiNode> constructor = companion4.getConstructor();
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
            mr.z(companion4, composerM4318constructorimpl, measurePolicyRowMeasurePolicy, composerM4318constructorimpl, currentCompositionLocalMap);
            Updater.m4326setimpl(composerM4318constructorimpl, modifierMaterializeModifier, (Function2<? super T, ? super Modifier, Unit>) id.h(companion4, composerM4318constructorimpl, Integer.valueOf(i3), composerM4318constructorimpl));
            RowScopeInstance rowScopeInstance = RowScopeInstance.INSTANCE;
            String label = videoPriorityRuleNormalized.getSortType().getLabel();
            VideoPrioritySortType sortType = videoPriorityRuleNormalized.getSortType();
            VideoPrioritySortType videoPrioritySortType = VideoPrioritySortType.NONE;
            boolean z3 = sortType != videoPrioritySortType;
            Modifier modifierM1050height3ABfNKs = SizeKt.m1050height3ABfNKs(SizeKt.m1069width3ABfNKs(companion3, Dp.m7813constructorimpl(150.0f)), Dp.m7813constructorimpl(42.0f));
            Object objRememberedValue3 = composerStartRestartGroup.rememberedValue();
            if (objRememberedValue3 == companion2.getEmpty()) {
                objRememberedValue3 = new lu0(24, mutableState);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
            }
            v((i2 & 7168) | 24960, 0, composerStartRestartGroup, modifierM1050height3ABfNKs, focusRequester, label, (Function0) objRememberedValue3, z3);
            if (videoPriorityRuleNormalized.getSortType() != videoPrioritySortType) {
                composerStartRestartGroup.startReplaceGroup(-947995237);
                String strBuildOrderText = videoPriorityRuleNormalized.buildOrderText();
                boolean zHasOrder = videoPriorityRuleNormalized.hasOrder();
                Modifier modifierM1050height3ABfNKs2 = SizeKt.m1050height3ABfNKs(zs1.E(rowScopeInstance, companion3, 1.0f, false, 2, null), Dp.m7813constructorimpl(42.0f));
                Object objRememberedValue4 = composerStartRestartGroup.rememberedValue();
                if (objRememberedValue4 == companion2.getEmpty()) {
                    objRememberedValue4 = new lu0(25, mutableState2);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue4);
                }
                v(24576, 8, composerStartRestartGroup, modifierM1050height3ABfNKs2, null, strBuildOrderText, (Function0) objRememberedValue4, zHasOrder);
                composerStartRestartGroup.endReplaceGroup();
                companion = companion3;
            } else {
                composerStartRestartGroup.startReplaceGroup(-947671411);
                companion = companion3;
                SpacerKt.Spacer(SizeKt.m1050height3ABfNKs(zs1.E(rowScopeInstance, companion3, 1.0f, false, 2, null), Dp.m7813constructorimpl(42.0f)), composerStartRestartGroup, 0);
                composerStartRestartGroup.endReplaceGroup();
            }
            if (z) {
                composerStartRestartGroup.startReplaceGroup(-947495827);
                G("+", z2, null, function0, composerStartRestartGroup, ((i2 >> 3) & Input.Keys.FORWARD_DEL) | 6 | ((i2 >> 9) & 7168), 4);
                G("-", false, focusRequester2, function2, composerStartRestartGroup, 6 | ((i2 >> 6) & 896) | ((i2 >> 12) & 7168), 2);
                composerStartRestartGroup = composerStartRestartGroup;
                composerStartRestartGroup.endReplaceGroup();
            } else {
                composerStartRestartGroup.startReplaceGroup(-947222655);
                SpacerKt.Spacer(SizeKt.m1069width3ABfNKs(companion, Dp.m7813constructorimpl(68.0f)), composerStartRestartGroup, 6);
                composerStartRestartGroup.endReplaceGroup();
            }
            composerStartRestartGroup.endNode();
            if (((Boolean) mutableState.getValue()).booleanValue()) {
                composerStartRestartGroup.startReplaceGroup(-792435262);
                VideoPrioritySortType sortType2 = videoPriorityRuleNormalized.getSortType();
                boolean z4 = (i2 & 458752) == 131072;
                Object objRememberedValue5 = composerStartRestartGroup.rememberedValue();
                if (z4 || objRememberedValue5 == companion2.getEmpty()) {
                    objRememberedValue5 = new r7(function1, mutableState, 13);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue5);
                }
                Function1 function3 = (Function1) objRememberedValue5;
                Object objRememberedValue6 = composerStartRestartGroup.rememberedValue();
                if (objRememberedValue6 == companion2.getEmpty()) {
                    objRememberedValue6 = new lu0(26, mutableState);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue6);
                }
                I(sortType2, function3, (Function0) objRememberedValue6, composerStartRestartGroup, RendererCapabilities.DECODER_SUPPORT_MASK);
                composerStartRestartGroup.endReplaceGroup();
            } else {
                composerStartRestartGroup.startReplaceGroup(-792094107);
                composerStartRestartGroup.endReplaceGroup();
            }
            if (!((Boolean) mutableState2.getValue()).booleanValue() || videoPriorityRuleNormalized.getSortType() == videoPrioritySortType) {
                composerStartRestartGroup.startReplaceGroup(-791812379);
                composerStartRestartGroup.endReplaceGroup();
            } else {
                composerStartRestartGroup.startReplaceGroup(-792004579);
                boolean z5 = (i2 & 458752) == 131072;
                Object objRememberedValue7 = composerStartRestartGroup.rememberedValue();
                if (z5 || objRememberedValue7 == companion2.getEmpty()) {
                    objRememberedValue7 = new f5(function1, 20);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue7);
                }
                Function1 function4 = (Function1) objRememberedValue7;
                Object objRememberedValue8 = composerStartRestartGroup.rememberedValue();
                if (objRememberedValue8 == companion2.getEmpty()) {
                    objRememberedValue8 = new lu0(27, mutableState2);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue8);
                }
                F(videoPriorityRuleNormalized, function4, (Function0) objRememberedValue8, composerStartRestartGroup, RendererCapabilities.DECODER_SUPPORT_MASK);
                composerStartRestartGroup.endReplaceGroup();
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new q7(videoPriorityRule, z, z2, focusRequester, focusRequester2, function1, function0, function2, i));
        }
    }

    public static final void I(VideoPrioritySortType videoPrioritySortType, Function1 function1, Function0 function0, Composer composer, int i) {
        int i2;
        Composer composerStartRestartGroup = composer.startRestartGroup(1960242623);
        if ((i & 6) == 0) {
            i2 = (composerStartRestartGroup.changed(videoPrioritySortType.ordinal()) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= composerStartRestartGroup.changedInstance(function1) ? 32 : 16;
        }
        if ((i & RendererCapabilities.DECODER_SUPPORT_MASK) == 0) {
            i2 |= composerStartRestartGroup.changedInstance(function0) ? 256 : 128;
        }
        if (composerStartRestartGroup.shouldExecute((i2 & Input.Keys.NUMPAD_3) != 146, i2 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1960242623, i2, -1, "com.dh.myembyapp.ui.components.VideoPriorityTypeDialog (OtherSettingsOverlay.kt:1317)");
            }
            int i3 = i2 & 14;
            boolean z = i3 == 4;
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            if (z || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                objRememberedValue = mr.n(composerStartRestartGroup);
            }
            FocusRequester focusRequester = (FocusRequester) objRememberedValue;
            AndroidDialog_androidKt.Dialog(function0, new DialogProperties(true, false, false), ComposableLambdaKt.rememberComposableLambda(-1002896248, true, new r5(videoPrioritySortType, focusRequester, function1, 13), composerStartRestartGroup, 54), composerStartRestartGroup, ((i2 >> 6) & 14) | 432, 0);
            boolean zChanged = composerStartRestartGroup.changed(focusRequester);
            Object objRememberedValue2 = composerStartRestartGroup.rememberedValue();
            if (zChanged || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                objRememberedValue2 = new ng(focusRequester, null, 9);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
            }
            EffectsKt.LaunchedEffect(videoPrioritySortType, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) objRememberedValue2, composerStartRestartGroup, i3);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new x7(i, 21, videoPrioritySortType, function1, function0));
        }
    }

    /* JADX WARN: Code duplicated, block: B:103:0x0226  */
    /* JADX WARN: Code duplicated, block: B:84:0x01de  */
    /* JADX WARN: Code duplicated, block: B:85:0x01e0  */
    /* JADX WARN: Code duplicated, block: B:92:0x01f8  */
    /* JADX WARN: Code duplicated, block: B:95:0x0210  */
    /* JADX WARN: Code duplicated, block: B:96:0x0212  */
    /* JADX WARN: Multi-variable type inference failed */
    public static final void J(VideoVersionPrioritySettings videoVersionPrioritySettings, final Function1 function1, Composer composer, int i) {
        Object obj;
        Object obj2;
        List list;
        boolean z;
        boolean z2;
        Object objRememberedValue;
        final MutableState mutableState;
        boolean z3;
        boolean z4;
        Object objRememberedValue2;
        Composer composerStartRestartGroup = composer.startRestartGroup(-244693745);
        int i2 = 4;
        int i3 = (i & 6) == 0 ? (composerStartRestartGroup.changedInstance(videoVersionPrioritySettings) ? 4 : 2) | i : i;
        if ((i & 48) == 0) {
            i3 |= composerStartRestartGroup.changedInstance(function1) ? 32 : 16;
        }
        if (composerStartRestartGroup.shouldExecute((i3 & 19) != 18, i3 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-244693745, i3, -1, "com.dh.myembyapp.ui.components.VideoVersionPrioritySelector (OtherSettingsOverlay.kt:1120)");
            }
            final VideoVersionPrioritySettings videoVersionPrioritySettingsNormalized = videoVersionPrioritySettings.normalized();
            boolean zChanged = composerStartRestartGroup.changed(videoVersionPrioritySettingsNormalized.getRules().size());
            Object objRememberedValue3 = composerStartRestartGroup.rememberedValue();
            if (zChanged || objRememberedValue3 == Composer.INSTANCE.getEmpty()) {
                obj = objRememberedValue3;
                int size = videoVersionPrioritySettingsNormalized.getRules().size();
                ArrayList arrayList = new ArrayList(size);
                for (int i4 = 0; i4 < size; i4++) {
                    arrayList.add(new FocusRequester());
                }
                composerStartRestartGroup.updateRememberedValue(arrayList);
                obj = arrayList;
            }
            obj = objRememberedValue3;
            List list2 = (List) obj;
            boolean zChanged2 = composerStartRestartGroup.changed(videoVersionPrioritySettingsNormalized.getRules().size());
            Object objRememberedValue4 = composerStartRestartGroup.rememberedValue();
            if (zChanged2 || objRememberedValue4 == Composer.INSTANCE.getEmpty()) {
                obj2 = objRememberedValue4;
                int size2 = videoVersionPrioritySettingsNormalized.getRules().size();
                ArrayList arrayList2 = new ArrayList(size2);
                for (int i5 = 0; i5 < size2; i5++) {
                    arrayList2.add(new FocusRequester());
                }
                composerStartRestartGroup.updateRememberedValue(arrayList2);
                obj2 = arrayList2;
            }
            obj2 = objRememberedValue4;
            List list3 = (List) obj2;
            Object objRememberedValue5 = composerStartRestartGroup.rememberedValue();
            Composer.Companion companion = Composer.INSTANCE;
            int i6 = 32;
            if (objRememberedValue5 == companion.getEmpty()) {
                objRememberedValue5 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(null, null, 2, null);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue5);
            }
            MutableState mutableState2 = (MutableState) objRememberedValue5;
            Object objRememberedValue6 = composerStartRestartGroup.rememberedValue();
            if (objRememberedValue6 == companion.getEmpty()) {
                objRememberedValue6 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(null, null, 2, null);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue6);
            }
            final MutableState mutableState3 = (MutableState) objRememberedValue6;
            Arrangement.HorizontalOrVertical horizontalOrVerticalM712spacedBy0680j_4 = Arrangement.INSTANCE.m712spacedBy0680j_4(Dp.m7813constructorimpl(8.0f));
            Modifier.Companion companion2 = Modifier.INSTANCE;
            MeasurePolicy measurePolicyColumnMeasurePolicy = ColumnKt.columnMeasurePolicy(horizontalOrVerticalM712spacedBy0680j_4, Alignment.INSTANCE.getStart(), composerStartRestartGroup, 6);
            long currentCompositeKeyHashCode = ComposablesKt.getCurrentCompositeKeyHashCode(composerStartRestartGroup, 0);
            MutableState mutableState4 = mutableState2;
            int i7 = (int) (currentCompositeKeyHashCode ^ (currentCompositeKeyHashCode >>> 32));
            CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(composerStartRestartGroup, companion2);
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
            mr.z(companion3, composerM4318constructorimpl, measurePolicyColumnMeasurePolicy, composerM4318constructorimpl, currentCompositionLocalMap);
            Updater.m4326setimpl(composerM4318constructorimpl, modifierMaterializeModifier, (Function2<? super T, ? super Modifier, Unit>) id.h(companion3, composerM4318constructorimpl, Integer.valueOf(i7), composerM4318constructorimpl));
            ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.INSTANCE;
            composerStartRestartGroup.startReplaceGroup(-1299203318);
            Iterator it = videoVersionPrioritySettingsNormalized.getRules().iterator();
            int i8 = 0;
            while (it.hasNext()) {
                Object next = it.next();
                int i9 = i8 + 1;
                if (i8 < 0) {
                    CollectionsKt.throwIndexOverflow();
                }
                VideoPriorityRule videoPriorityRule = (VideoPriorityRule) next;
                boolean z5 = i8 == CollectionsKt.getLastIndex(videoVersionPrioritySettingsNormalized.getRules());
                boolean z6 = videoVersionPrioritySettingsNormalized.getRules().size() < i2;
                FocusRequester focusRequester = (FocusRequester) list2.get(i8);
                FocusRequester focusRequester2 = (FocusRequester) list3.get(i8);
                int i10 = i3 & Input.Keys.FORWARD_DEL;
                int i11 = i3;
                boolean zChangedInstance = (i10 == i6) | composerStartRestartGroup.changedInstance(videoVersionPrioritySettingsNormalized) | composerStartRestartGroup.changed(i8);
                Object objRememberedValue7 = composerStartRestartGroup.rememberedValue();
                if (zChangedInstance) {
                    list = list2;
                } else {
                    list = list2;
                    if (objRememberedValue7 == Composer.INSTANCE.getEmpty()) {
                    }
                    Function1 function2 = (Function1) objRememberedValue7;
                    boolean zChangedInstance2 = composerStartRestartGroup.changedInstance(videoVersionPrioritySettingsNormalized);
                    if (i10 == 32) {
                        z = true;
                    } else {
                        z = false;
                    }
                    z2 = z | zChangedInstance2;
                    objRememberedValue = composerStartRestartGroup.rememberedValue();
                    if (!z2 || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                        mutableState = mutableState4;
                        final int i12 = 0;
                        objRememberedValue = new Function0() { // from class: tb1
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                int i13 = i12;
                                MutableState mutableState5 = mutableState;
                                Function1 function3 = function1;
                                VideoVersionPrioritySettings videoVersionPrioritySettings2 = videoVersionPrioritySettingsNormalized;
                                switch (i13) {
                                    case 0:
                                        if (videoVersionPrioritySettings2.getRules().size() < 4) {
                                            mutableState5.setValue(Integer.valueOf(videoVersionPrioritySettings2.getRules().size()));
                                            function3.invoke(videoVersionPrioritySettings2.copy(CollectionsKt.plus((Collection<? extends VideoPriorityRule>) videoVersionPrioritySettings2.getRules(), new VideoPriorityRule(null, null, null, 7, null))).normalized());
                                        }
                                        break;
                                    default:
                                        List<VideoPriorityRule> listListOf = videoVersionPrioritySettings2.getRules().size() <= 1 ? CollectionsKt.listOf(new VideoPriorityRule(null, null, null, 7, null)) : CollectionsKt___CollectionsKt.dropLast(videoVersionPrioritySettings2.getRules(), 1);
                                        mutableState5.setValue(Integer.valueOf(CollectionsKt.getLastIndex(listListOf)));
                                        function3.invoke(videoVersionPrioritySettings2.copy(listListOf).normalized());
                                        break;
                                }
                                return Unit.INSTANCE;
                            }
                        };
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                    } else {
                        mutableState = mutableState4;
                    }
                    Function0 function0 = (Function0) objRememberedValue;
                    boolean zChangedInstance3 = composerStartRestartGroup.changedInstance(videoVersionPrioritySettingsNormalized);
                    if (i10 == 32) {
                        z3 = true;
                    } else {
                        z3 = false;
                    }
                    z4 = zChangedInstance3 | z3;
                    objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                    if (z4 || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                        final int i13 = 1;
                        objRememberedValue2 = new Function0() { // from class: tb1
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                int i14 = i13;
                                MutableState mutableState5 = mutableState3;
                                Function1 function3 = function1;
                                VideoVersionPrioritySettings videoVersionPrioritySettings2 = videoVersionPrioritySettingsNormalized;
                                switch (i14) {
                                    case 0:
                                        if (videoVersionPrioritySettings2.getRules().size() < 4) {
                                            mutableState5.setValue(Integer.valueOf(videoVersionPrioritySettings2.getRules().size()));
                                            function3.invoke(videoVersionPrioritySettings2.copy(CollectionsKt.plus((Collection<? extends VideoPriorityRule>) videoVersionPrioritySettings2.getRules(), new VideoPriorityRule(null, null, null, 7, null))).normalized());
                                        }
                                        break;
                                    default:
                                        List<VideoPriorityRule> listListOf = videoVersionPrioritySettings2.getRules().size() <= 1 ? CollectionsKt.listOf(new VideoPriorityRule(null, null, null, 7, null)) : CollectionsKt___CollectionsKt.dropLast(videoVersionPrioritySettings2.getRules(), 1);
                                        mutableState5.setValue(Integer.valueOf(CollectionsKt.getLastIndex(listListOf)));
                                        function3.invoke(videoVersionPrioritySettings2.copy(listListOf).normalized());
                                        break;
                                }
                                return Unit.INSTANCE;
                            }
                        };
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                    }
                    mutableState4 = mutableState;
                    H(videoPriorityRule, z5, z6, focusRequester, focusRequester2, function2, function0, (Function0) objRememberedValue2, composerStartRestartGroup, 0);
                    list3 = list3;
                    list2 = list;
                    mutableState3 = mutableState3;
                    i6 = 32;
                    it = it;
                    i8 = i9;
                    i3 = i11;
                    i2 = 4;
                    videoVersionPrioritySettingsNormalized = videoVersionPrioritySettingsNormalized;
                }
                objRememberedValue7 = new ns0(function1, videoVersionPrioritySettingsNormalized, i8, 2);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue7);
                Function1 function3 = (Function1) objRememberedValue7;
                boolean zChangedInstance4 = composerStartRestartGroup.changedInstance(videoVersionPrioritySettingsNormalized);
                if (i10 == 32) {
                    z = true;
                } else {
                    z = false;
                }
                z2 = z | zChangedInstance4;
                objRememberedValue = composerStartRestartGroup.rememberedValue();
                if (z2) {
                    mutableState = mutableState4;
                    final int i14 = 0;
                    objRememberedValue = new Function0() { // from class: tb1
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            int i15 = i14;
                            MutableState mutableState5 = mutableState;
                            Function1 function4 = function1;
                            VideoVersionPrioritySettings videoVersionPrioritySettings2 = videoVersionPrioritySettingsNormalized;
                            switch (i15) {
                                case 0:
                                    if (videoVersionPrioritySettings2.getRules().size() < 4) {
                                        mutableState5.setValue(Integer.valueOf(videoVersionPrioritySettings2.getRules().size()));
                                        function4.invoke(videoVersionPrioritySettings2.copy(CollectionsKt.plus((Collection<? extends VideoPriorityRule>) videoVersionPrioritySettings2.getRules(), new VideoPriorityRule(null, null, null, 7, null))).normalized());
                                    }
                                    break;
                                default:
                                    List<VideoPriorityRule> listListOf = videoVersionPrioritySettings2.getRules().size() <= 1 ? CollectionsKt.listOf(new VideoPriorityRule(null, null, null, 7, null)) : CollectionsKt___CollectionsKt.dropLast(videoVersionPrioritySettings2.getRules(), 1);
                                    mutableState5.setValue(Integer.valueOf(CollectionsKt.getLastIndex(listListOf)));
                                    function4.invoke(videoVersionPrioritySettings2.copy(listListOf).normalized());
                                    break;
                            }
                            return Unit.INSTANCE;
                        }
                    };
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                } else {
                    mutableState = mutableState4;
                    final int i15 = 0;
                    objRememberedValue = new Function0() { // from class: tb1
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            int i16 = i15;
                            MutableState mutableState5 = mutableState;
                            Function1 function4 = function1;
                            VideoVersionPrioritySettings videoVersionPrioritySettings2 = videoVersionPrioritySettingsNormalized;
                            switch (i16) {
                                case 0:
                                    if (videoVersionPrioritySettings2.getRules().size() < 4) {
                                        mutableState5.setValue(Integer.valueOf(videoVersionPrioritySettings2.getRules().size()));
                                        function4.invoke(videoVersionPrioritySettings2.copy(CollectionsKt.plus((Collection<? extends VideoPriorityRule>) videoVersionPrioritySettings2.getRules(), new VideoPriorityRule(null, null, null, 7, null))).normalized());
                                    }
                                    break;
                                default:
                                    List<VideoPriorityRule> listListOf = videoVersionPrioritySettings2.getRules().size() <= 1 ? CollectionsKt.listOf(new VideoPriorityRule(null, null, null, 7, null)) : CollectionsKt___CollectionsKt.dropLast(videoVersionPrioritySettings2.getRules(), 1);
                                    mutableState5.setValue(Integer.valueOf(CollectionsKt.getLastIndex(listListOf)));
                                    function4.invoke(videoVersionPrioritySettings2.copy(listListOf).normalized());
                                    break;
                            }
                            return Unit.INSTANCE;
                        }
                    };
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                }
                Function0 function4 = (Function0) objRememberedValue;
                boolean zChangedInstance5 = composerStartRestartGroup.changedInstance(videoVersionPrioritySettingsNormalized);
                if (i10 == 32) {
                    z3 = true;
                } else {
                    z3 = false;
                }
                z4 = zChangedInstance5 | z3;
                objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                if (z4) {
                    final int i16 = 1;
                    objRememberedValue2 = new Function0() { // from class: tb1
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            int i17 = i16;
                            MutableState mutableState5 = mutableState3;
                            Function1 function5 = function1;
                            VideoVersionPrioritySettings videoVersionPrioritySettings2 = videoVersionPrioritySettingsNormalized;
                            switch (i17) {
                                case 0:
                                    if (videoVersionPrioritySettings2.getRules().size() < 4) {
                                        mutableState5.setValue(Integer.valueOf(videoVersionPrioritySettings2.getRules().size()));
                                        function5.invoke(videoVersionPrioritySettings2.copy(CollectionsKt.plus((Collection<? extends VideoPriorityRule>) videoVersionPrioritySettings2.getRules(), new VideoPriorityRule(null, null, null, 7, null))).normalized());
                                    }
                                    break;
                                default:
                                    List<VideoPriorityRule> listListOf = videoVersionPrioritySettings2.getRules().size() <= 1 ? CollectionsKt.listOf(new VideoPriorityRule(null, null, null, 7, null)) : CollectionsKt___CollectionsKt.dropLast(videoVersionPrioritySettings2.getRules(), 1);
                                    mutableState5.setValue(Integer.valueOf(CollectionsKt.getLastIndex(listListOf)));
                                    function5.invoke(videoVersionPrioritySettings2.copy(listListOf).normalized());
                                    break;
                            }
                            return Unit.INSTANCE;
                        }
                    };
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                } else {
                    final int i17 = 1;
                    objRememberedValue2 = new Function0() { // from class: tb1
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            int i18 = i17;
                            MutableState mutableState5 = mutableState3;
                            Function1 function5 = function1;
                            VideoVersionPrioritySettings videoVersionPrioritySettings2 = videoVersionPrioritySettingsNormalized;
                            switch (i18) {
                                case 0:
                                    if (videoVersionPrioritySettings2.getRules().size() < 4) {
                                        mutableState5.setValue(Integer.valueOf(videoVersionPrioritySettings2.getRules().size()));
                                        function5.invoke(videoVersionPrioritySettings2.copy(CollectionsKt.plus((Collection<? extends VideoPriorityRule>) videoVersionPrioritySettings2.getRules(), new VideoPriorityRule(null, null, null, 7, null))).normalized());
                                    }
                                    break;
                                default:
                                    List<VideoPriorityRule> listListOf = videoVersionPrioritySettings2.getRules().size() <= 1 ? CollectionsKt.listOf(new VideoPriorityRule(null, null, null, 7, null)) : CollectionsKt___CollectionsKt.dropLast(videoVersionPrioritySettings2.getRules(), 1);
                                    mutableState5.setValue(Integer.valueOf(CollectionsKt.getLastIndex(listListOf)));
                                    function5.invoke(videoVersionPrioritySettings2.copy(listListOf).normalized());
                                    break;
                            }
                            return Unit.INSTANCE;
                        }
                    };
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                }
                mutableState4 = mutableState;
                H(videoPriorityRule, z5, z6, focusRequester, focusRequester2, function3, function4, (Function0) objRememberedValue2, composerStartRestartGroup, 0);
                list3 = list3;
                list2 = list;
                mutableState3 = mutableState3;
                i6 = 32;
                it = it;
                i8 = i9;
                i3 = i11;
                i2 = 4;
                videoVersionPrioritySettingsNormalized = videoVersionPrioritySettingsNormalized;
            }
            VideoVersionPrioritySettings videoVersionPrioritySettings2 = videoVersionPrioritySettingsNormalized;
            List list4 = list2;
            List list5 = list3;
            MutableState mutableState5 = mutableState3;
            composerStartRestartGroup.endReplaceGroup();
            composerStartRestartGroup.endNode();
            Integer numValueOf = Integer.valueOf(videoVersionPrioritySettings2.getRules().size());
            Integer num = (Integer) mutableState4.getValue();
            boolean zChangedInstance6 = composerStartRestartGroup.changedInstance(list4);
            Object objRememberedValue8 = composerStartRestartGroup.rememberedValue();
            if (zChangedInstance6 || objRememberedValue8 == Composer.INSTANCE.getEmpty()) {
                objRememberedValue8 = new ac1(list4, mutableState4, null, 0);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue8);
            }
            EffectsKt.LaunchedEffect(numValueOf, num, (Function2) objRememberedValue8, composerStartRestartGroup, 0);
            Integer numValueOf2 = Integer.valueOf(videoVersionPrioritySettings2.getRules().size());
            Integer num2 = (Integer) mutableState5.getValue();
            boolean zChangedInstance7 = composerStartRestartGroup.changedInstance(list5);
            Object objRememberedValue9 = composerStartRestartGroup.rememberedValue();
            if (zChangedInstance7 || objRememberedValue9 == Composer.INSTANCE.getEmpty()) {
                objRememberedValue9 = new ac1(list5, mutableState5, null, 1);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue9);
            }
            EffectsKt.LaunchedEffect(numValueOf2, num2, (Function2) objRememberedValue9, composerStartRestartGroup, 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new e81(videoVersionPrioritySettings, function1, i, 6));
        }
    }

    public static final ArrayList K(int i, Function1 function1) {
        IntRange intRange = new IntRange(1, i);
        ArrayList arrayList = new ArrayList();
        Iterator<Integer> it = intRange.iterator();
        while (it.hasNext()) {
            Object objInvoke = function1.invoke(Integer.valueOf(((IntIterator) it).nextInt()));
            if (StringsKt.isBlank((String) objInvoke)) {
                objInvoke = null;
            }
            String str = (String) objInvoke;
            if (str != null) {
                arrayList.add(str);
            }
        }
        return arrayList;
    }

    public static final int L(AudioVersionPrioritySettings audioVersionPrioritySettings, xf xfVar) {
        switch (bc1.$EnumSwitchMapping$2[xfVar.ordinal()]) {
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
            default:
                qu.f();
                return 0;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void a(Function1 function1, int i, Composer composer, int i2) {
        int i3;
        String str;
        MutableState mutableState;
        Composer composerStartRestartGroup = composer.startRestartGroup(-1023093460);
        if ((i2 & 6) == 0) {
            i3 = i2 | (composerStartRestartGroup.changed(i) ? 4 : 2);
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= composerStartRestartGroup.changedInstance(function1) ? 32 : 16;
        }
        int i4 = i3;
        if (composerStartRestartGroup.shouldExecute((i4 & 19) != 18, i4 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1023093460, i4, -1, "com.dh.myembyapp.ui.components.AudioDelaySelector (OtherSettingsOverlay.kt:977)");
            }
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            Composer.Companion companion = Composer.INSTANCE;
            if (objRememberedValue == companion.getEmpty()) {
                objRememberedValue = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Boolean.FALSE, null, 2, null);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            MutableState mutableState2 = (MutableState) objRememberedValue;
            Object objRememberedValue2 = composerStartRestartGroup.rememberedValue();
            if (objRememberedValue2 == companion.getEmpty()) {
                objRememberedValue2 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Boolean.FALSE, null, 2, null);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
            }
            MutableState mutableState3 = (MutableState) objRememberedValue2;
            Object objRememberedValue3 = composerStartRestartGroup.rememberedValue();
            if (objRememberedValue3 == companion.getEmpty()) {
                objRememberedValue3 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Boolean.FALSE, null, 2, null);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
            }
            MutableState mutableState4 = (MutableState) objRememberedValue3;
            State<Float> stateAnimateFloatAsState = AnimateAsStateKt.animateFloatAsState(((Boolean) mutableState2.getValue()).booleanValue() ? 1.06f : 1.0f, null, 0.0f, null, null, composerStartRestartGroup, 0, 30);
            State<Float> stateAnimateFloatAsState2 = AnimateAsStateKt.animateFloatAsState(((Boolean) mutableState3.getValue()).booleanValue() ? 1.06f : 1.0f, null, 0.0f, null, null, composerStartRestartGroup, 0, 30);
            State<Float> stateAnimateFloatAsState3 = AnimateAsStateKt.animateFloatAsState(((Boolean) mutableState4.getValue()).booleanValue() ? 1.06f : 1.0f, null, 0.0f, null, null, composerStartRestartGroup, 0, 30);
            int iNormalizeAudioDelayMs = UserPreferences.INSTANCE.normalizeAudioDelayMs(i);
            Modifier.Companion companion2 = Modifier.INSTANCE;
            Modifier modifierFillMaxWidth$default = SizeKt.fillMaxWidth$default(companion2, 0.0f, 1, null);
            Alignment.Companion companion3 = Alignment.INSTANCE;
            MeasurePolicy measurePolicyQ = mr.q(8.0f, Arrangement.INSTANCE, companion3.getCenterVertically(), composerStartRestartGroup, 54);
            long currentCompositeKeyHashCode = ComposablesKt.getCurrentCompositeKeyHashCode(composerStartRestartGroup, 0);
            int i5 = (int) (currentCompositeKeyHashCode ^ (currentCompositeKeyHashCode >>> 32));
            CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifierFillMaxWidth$default);
            ComposeUiNode.Companion companion4 = ComposeUiNode.INSTANCE;
            Function0<ComposeUiNode> constructor = companion4.getConstructor();
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
            mr.z(companion4, composerM4318constructorimpl, measurePolicyQ, composerM4318constructorimpl, currentCompositionLocalMap);
            Updater.m4326setimpl(composerM4318constructorimpl, modifierMaterializeModifier, (Function2<? super T, ? super Modifier, Unit>) id.h(companion4, composerM4318constructorimpl, Integer.valueOf(i5), composerM4318constructorimpl));
            RowScopeInstance rowScopeInstance = RowScopeInstance.INSTANCE;
            Modifier modifierThen = ScaleKt.scale(companion2, stateAnimateFloatAsState.getValue().floatValue()).then(((Boolean) mutableState2.getValue()).booleanValue() ? BorderKt.m286borderxT4_qwU(companion2, Dp.m7813constructorimpl(2.0f), Color.INSTANCE.m5189getWhite0d7_KjU(), RoundedCornerShapeKt.getCircleShape()) : companion2);
            MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(companion3.getTopStart(), false);
            long currentCompositeKeyHashCode2 = ComposablesKt.getCurrentCompositeKeyHashCode(composerStartRestartGroup, 0);
            int i6 = (int) (currentCompositeKeyHashCode2 ^ (currentCompositeKeyHashCode2 >>> 32));
            CompositionLocalMap currentCompositionLocalMap2 = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier2 = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifierThen);
            Function0<ComposeUiNode> constructor2 = companion4.getConstructor();
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
            mr.z(companion4, composerM4318constructorimpl2, measurePolicyMaybeCachedBoxMeasurePolicy, composerM4318constructorimpl2, currentCompositionLocalMap2);
            Updater.m4326setimpl(composerM4318constructorimpl2, modifierMaterializeModifier2, (Function2<? super T, ? super Modifier, Unit>) id.h(companion4, composerM4318constructorimpl2, Integer.valueOf(i6), composerM4318constructorimpl2));
            BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
            boolean z = iNormalizeAudioDelayMs > -10000;
            Modifier modifierM1064size3ABfNKs = SizeKt.m1064size3ABfNKs(companion2, Dp.m7813constructorimpl(30.0f));
            Object objRememberedValue4 = composerStartRestartGroup.rememberedValue();
            if (objRememberedValue4 == companion.getEmpty()) {
                objRememberedValue4 = new p21(27, mutableState2);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue4);
            }
            Modifier modifierOnFocusChanged = FocusChangedModifierKt.onFocusChanged(modifierM1064size3ABfNKs, (Function1) objRememberedValue4);
            int i7 = i4 & Input.Keys.FORWARD_DEL;
            boolean zChanged = (i7 == 32) | composerStartRestartGroup.changed(iNormalizeAudioDelayMs);
            Object objRememberedValue5 = composerStartRestartGroup.rememberedValue();
            if (zChanged || objRememberedValue5 == companion.getEmpty()) {
                objRememberedValue5 = new uy(function1, iNormalizeAudioDelayMs, 10);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue5);
            }
            IconButtonKt.IconButton((Function0) objRememberedValue5, modifierOnFocusChanged, z, null, null, null, ComposableLambdaKt.rememberComposableLambda(-1235224780, true, new vy(iNormalizeAudioDelayMs, 8), composerStartRestartGroup, 54), composerStartRestartGroup, 1572864, 56);
            composerStartRestartGroup.endNode();
            Modifier modifierM1001paddingVpY3zN4$default = PaddingKt.m1001paddingVpY3zN4$default(kb0.v(6.0f, SizeKt.m1069width3ABfNKs(companion2, Dp.m7813constructorimpl(86.0f)), ColorKt.Color(4281545523L)), 0.0f, Dp.m7813constructorimpl(4.0f), 1, null);
            MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy2 = BoxKt.maybeCachedBoxMeasurePolicy(companion3.getCenter(), false);
            long currentCompositeKeyHashCode3 = ComposablesKt.getCurrentCompositeKeyHashCode(composerStartRestartGroup, 0);
            int i8 = (int) (currentCompositeKeyHashCode3 ^ (currentCompositeKeyHashCode3 >>> 32));
            CompositionLocalMap currentCompositionLocalMap3 = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier3 = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifierM1001paddingVpY3zN4$default);
            Function0<ComposeUiNode> constructor3 = companion4.getConstructor();
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
            mr.z(companion4, composerM4318constructorimpl3, measurePolicyMaybeCachedBoxMeasurePolicy2, composerM4318constructorimpl3, currentCompositionLocalMap3);
            Updater.m4326setimpl(composerM4318constructorimpl3, modifierMaterializeModifier3, (Function2<? super T, ? super Modifier, Unit>) id.h(companion4, composerM4318constructorimpl3, Integer.valueOf(i8), composerM4318constructorimpl3));
            if (iNormalizeAudioDelayMs == 0) {
                str = "0.0秒";
            } else {
                StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
                str = String.format("%+.1f秒", Arrays.copyOf(new Object[]{Float.valueOf(iNormalizeAudioDelayMs / 1000.0f)}, 1));
            }
            long sp = TextUnitKt.getSp(14);
            Color.Companion companion5 = Color.INSTANCE;
            TextKt.m3048TextNvy7gAk(str, null, companion5.m5189getWhite0d7_KjU(), null, sp, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, composerStartRestartGroup, 24960, 0, 262122);
            composerStartRestartGroup.endNode();
            Modifier modifierThen2 = ScaleKt.scale(companion2, stateAnimateFloatAsState2.getValue().floatValue()).then(((Boolean) mutableState3.getValue()).booleanValue() ? BorderKt.m286borderxT4_qwU(companion2, Dp.m7813constructorimpl(2.0f), companion5.m5189getWhite0d7_KjU(), RoundedCornerShapeKt.getCircleShape()) : companion2);
            MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy3 = BoxKt.maybeCachedBoxMeasurePolicy(companion3.getTopStart(), false);
            long currentCompositeKeyHashCode4 = ComposablesKt.getCurrentCompositeKeyHashCode(composerStartRestartGroup, 0);
            int i9 = (int) (currentCompositeKeyHashCode4 ^ (currentCompositeKeyHashCode4 >>> 32));
            CompositionLocalMap currentCompositionLocalMap4 = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier4 = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifierThen2);
            Function0<ComposeUiNode> constructor4 = companion4.getConstructor();
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
            mr.z(companion4, composerM4318constructorimpl4, measurePolicyMaybeCachedBoxMeasurePolicy3, composerM4318constructorimpl4, currentCompositionLocalMap4);
            Updater.m4326setimpl(composerM4318constructorimpl4, modifierMaterializeModifier4, (Function2<? super T, ? super Modifier, Unit>) id.h(companion4, composerM4318constructorimpl4, Integer.valueOf(i9), composerM4318constructorimpl4));
            boolean z2 = iNormalizeAudioDelayMs < 10000;
            Modifier modifierM1064size3ABfNKs2 = SizeKt.m1064size3ABfNKs(companion2, Dp.m7813constructorimpl(30.0f));
            Object objRememberedValue6 = composerStartRestartGroup.rememberedValue();
            if (objRememberedValue6 == companion.getEmpty()) {
                objRememberedValue6 = new p21(29, mutableState3);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue6);
            }
            Modifier modifierOnFocusChanged2 = FocusChangedModifierKt.onFocusChanged(modifierM1064size3ABfNKs2, (Function1) objRememberedValue6);
            boolean zChanged2 = (i7 == 32) | composerStartRestartGroup.changed(iNormalizeAudioDelayMs);
            Object objRememberedValue7 = composerStartRestartGroup.rememberedValue();
            if (zChanged2 || objRememberedValue7 == companion.getEmpty()) {
                objRememberedValue7 = new uy(function1, iNormalizeAudioDelayMs, 11);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue7);
            }
            IconButtonKt.IconButton((Function0) objRememberedValue7, modifierOnFocusChanged2, z2, null, null, null, ComposableLambdaKt.rememberComposableLambda(1231910316, true, new vy(iNormalizeAudioDelayMs, 9), composerStartRestartGroup, 54), composerStartRestartGroup, 1572864, 56);
            composerStartRestartGroup.endNode();
            Modifier modifierThen3 = ScaleKt.scale(companion2, stateAnimateFloatAsState3.getValue().floatValue()).then(((Boolean) mutableState4.getValue()).booleanValue() ? BorderKt.m286borderxT4_qwU(companion2, Dp.m7813constructorimpl(2.0f), companion5.m5189getWhite0d7_KjU(), RoundedCornerShapeKt.RoundedCornerShape(50)) : companion2);
            MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy4 = BoxKt.maybeCachedBoxMeasurePolicy(companion3.getTopStart(), false);
            long currentCompositeKeyHashCode5 = ComposablesKt.getCurrentCompositeKeyHashCode(composerStartRestartGroup, 0);
            int i10 = (int) (currentCompositeKeyHashCode5 ^ (currentCompositeKeyHashCode5 >>> 32));
            CompositionLocalMap currentCompositionLocalMap5 = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier5 = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifierThen3);
            Function0<ComposeUiNode> constructor5 = companion4.getConstructor();
            if (composerStartRestartGroup.getApplier() == null) {
                ComposablesKt.invalidApplier();
            }
            composerStartRestartGroup.startReusableNode();
            if (composerStartRestartGroup.getInserting()) {
                composerStartRestartGroup.createNode(constructor5);
            } else {
                composerStartRestartGroup.useNode();
            }
            Composer composerM4318constructorimpl5 = Updater.m4318constructorimpl(composerStartRestartGroup);
            mr.z(companion4, composerM4318constructorimpl5, measurePolicyMaybeCachedBoxMeasurePolicy4, composerM4318constructorimpl5, currentCompositionLocalMap5);
            Updater.m4326setimpl(composerM4318constructorimpl5, modifierMaterializeModifier5, (Function2<? super T, ? super Modifier, Unit>) id.h(companion4, composerM4318constructorimpl5, Integer.valueOf(i10), composerM4318constructorimpl5));
            boolean z3 = iNormalizeAudioDelayMs != 0;
            Modifier modifierM1069width3ABfNKs = SizeKt.m1069width3ABfNKs(companion2, Dp.m7813constructorimpl(72.0f));
            Object objRememberedValue8 = composerStartRestartGroup.rememberedValue();
            if (objRememberedValue8 == companion.getEmpty()) {
                mutableState = mutableState4;
                objRememberedValue8 = new p21(26, mutableState);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue8);
            } else {
                mutableState = mutableState4;
            }
            Modifier modifierOnFocusChanged3 = FocusChangedModifierKt.onFocusChanged(modifierM1069width3ABfNKs, (Function1) objRememberedValue8);
            ButtonScale buttonScaleScale$default = ButtonDefaults.scale$default(ButtonDefaults.INSTANCE, 1.0f, 1.0f, 0.0f, 0.0f, 0.0f, 28, null);
            ButtonColors buttonColorsP = hc2.p(iNormalizeAudioDelayMs != 0, composerStartRestartGroup, 0, 0);
            PaddingValues paddingValuesM993PaddingValuesYgX7TsA = PaddingKt.m993PaddingValuesYgX7TsA(Dp.m7813constructorimpl(10.0f), Dp.m7813constructorimpl(6.0f));
            boolean z4 = i7 == 32;
            Object objRememberedValue9 = composerStartRestartGroup.rememberedValue();
            if (z4 || objRememberedValue9 == companion.getEmpty()) {
                objRememberedValue9 = new t4(function1, 8);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue9);
            }
            ButtonKt.m8231ButtonTCVpFMg((Function0) objRememberedValue9, modifierOnFocusChanged3, null, z3, buttonScaleScale$default, null, null, buttonColorsP, 0.0f, null, paddingValuesM993PaddingValuesYgX7TsA, null, ComposableLambdaKt.rememberComposableLambda(1618286847, true, new rw0(iNormalizeAudioDelayMs, mutableState), composerStartRestartGroup, 54), composerStartRestartGroup, 0, 390, 2916);
            composerStartRestartGroup = composerStartRestartGroup;
            if (x2.m(composerStartRestartGroup)) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new xy(i, i2, 3, function1));
        }
    }

    public static final void b(AudioVersionPrioritySettings audioVersionPrioritySettings, Function1 function1, Function0 function0, Composer composer, int i) {
        int i2;
        Composer composerStartRestartGroup = composer.startRestartGroup(-99215365);
        if ((i & 6) == 0) {
            i2 = (composerStartRestartGroup.changedInstance(audioVersionPrioritySettings) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= composerStartRestartGroup.changedInstance(function1) ? 32 : 16;
        }
        if ((i & RendererCapabilities.DECODER_SUPPORT_MASK) == 0) {
            i2 |= composerStartRestartGroup.changedInstance(function0) ? 256 : 128;
        }
        if (composerStartRestartGroup.shouldExecute((i2 & Input.Keys.NUMPAD_3) != 146, i2 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-99215365, i2, -1, "com.dh.myembyapp.ui.components.AudioFormatPriorityDialog (OtherSettingsOverlay.kt:1639)");
            }
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            Composer.Companion companion = Composer.INSTANCE;
            if (objRememberedValue == companion.getEmpty()) {
                objRememberedValue = mr.n(composerStartRestartGroup);
            }
            FocusRequester focusRequester = (FocusRequester) objRememberedValue;
            AndroidDialog_androidKt.Dialog(function0, new DialogProperties(true, false, false), ComposableLambdaKt.rememberComposableLambda(-162098350, true, new r5(audioVersionPrioritySettings, focusRequester, function1, 11), composerStartRestartGroup, 54), composerStartRestartGroup, ((i2 >> 6) & 14) | 432, 0);
            Unit unit = Unit.INSTANCE;
            Object objRememberedValue2 = composerStartRestartGroup.rememberedValue();
            if (objRememberedValue2 == companion.getEmpty()) {
                objRememberedValue2 = new ng(focusRequester, null, 2);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
            }
            EffectsKt.LaunchedEffect(unit, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) objRememberedValue2, composerStartRestartGroup, 6);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new x7(i, 19, audioVersionPrioritySettings, function1, function0));
        }
    }

    public static final void c(AudioLanguagePreference audioLanguagePreference, Function1 function1, Function0 function0, Composer composer, int i) {
        int i2;
        Composer composerStartRestartGroup = composer.startRestartGroup(111132701);
        if ((i & 6) == 0) {
            i2 = (composerStartRestartGroup.changed(audioLanguagePreference.ordinal()) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= composerStartRestartGroup.changedInstance(function1) ? 32 : 16;
        }
        if ((i & RendererCapabilities.DECODER_SUPPORT_MASK) == 0) {
            i2 |= composerStartRestartGroup.changedInstance(function0) ? 256 : 128;
        }
        if (composerStartRestartGroup.shouldExecute((i2 & Input.Keys.NUMPAD_3) != 146, i2 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(111132701, i2, -1, "com.dh.myembyapp.ui.components.AudioLanguagePreferenceDialog (OtherSettingsOverlay.kt:2237)");
            }
            int i3 = i2 & 14;
            boolean z = i3 == 4;
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            if (z || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                objRememberedValue = mr.n(composerStartRestartGroup);
            }
            FocusRequester focusRequester = (FocusRequester) objRememberedValue;
            AndroidDialog_androidKt.Dialog(function0, new DialogProperties(true, false, false), ComposableLambdaKt.rememberComposableLambda(524746214, true, new r5(audioLanguagePreference, focusRequester, function1, 12), composerStartRestartGroup, 54), composerStartRestartGroup, ((i2 >> 6) & 14) | 432, 0);
            boolean zChanged = composerStartRestartGroup.changed(focusRequester);
            Object objRememberedValue2 = composerStartRestartGroup.rememberedValue();
            if (zChanged || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                objRememberedValue2 = new ng(focusRequester, null, 3);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
            }
            EffectsKt.LaunchedEffect(audioLanguagePreference, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) objRememberedValue2, composerStartRestartGroup, i3);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new x7(i, 20, audioLanguagePreference, function1, function0));
        }
    }

    /* JADX WARN: Code duplicated, block: B:31:0x0054  */
    /* JADX WARN: Code duplicated, block: B:33:0x005a  */
    /* JADX WARN: Code duplicated, block: B:34:0x005d  */
    /* JADX WARN: Code duplicated, block: B:38:0x0068  */
    /* JADX WARN: Code duplicated, block: B:39:0x006a  */
    /* JADX WARN: Code duplicated, block: B:42:0x0073  */
    /* JADX WARN: Code duplicated, block: B:44:0x0076  */
    /* JADX WARN: Code duplicated, block: B:47:0x007d  */
    /* JADX WARN: Code duplicated, block: B:50:0x008f  */
    /* JADX WARN: Code duplicated, block: B:53:0x00a6  */
    /* JADX WARN: Code duplicated, block: B:55:0x00ac  */
    /* JADX WARN: Code duplicated, block: B:58:0x00fd  */
    /* JADX WARN: Code duplicated, block: B:59:0x0110  */
    /* JADX WARN: Code duplicated, block: B:63:0x0140  */
    /* JADX WARN: Code duplicated, block: B:66:0x014c  */
    /* JADX WARN: Code duplicated, block: B:67:0x0150  */
    /* JADX WARN: Code duplicated, block: B:70:0x016e  */
    /* JADX WARN: Code duplicated, block: B:71:0x0175  */
    /* JADX WARN: Code duplicated, block: B:74:0x0185  */
    /* JADX WARN: Code duplicated, block: B:77:0x0214  */
    /* JADX WARN: Code duplicated, block: B:78:0x0218  */
    /* JADX WARN: Code duplicated, block: B:81:0x0222  */
    /* JADX WARN: Code duplicated, block: B:83:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Multi-variable type inference failed */
    public static final void d(String str, boolean z, FocusRequester focusRequester, Function0 function0, Composer composer, int i, int i2) {
        int i3;
        boolean z2;
        FocusRequester focusRequester2;
        boolean z3;
        FocusRequester focusRequester3;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Object objRememberedValue;
        Composer.Companion companion;
        MutableState mutableState;
        float f;
        FocusRequester focusRequester4;
        RoundedCornerShape roundedCornerShapeM1312RoundedCornerShape0680j_4;
        Modifier modifierFocusRequester;
        Modifier modifierM286borderxT4_qwU;
        Function0<ComposeUiNode> constructor;
        Object objRememberedValue2;
        int i4;
        Composer composerStartRestartGroup = composer.startRestartGroup(-1896526543);
        if ((i & 6) == 0) {
            i3 = (composerStartRestartGroup.changed(str) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            z2 = z;
            i3 |= composerStartRestartGroup.changed(z2) ? 32 : 16;
        } else {
            z2 = z;
        }
        int i5 = i2 & 4;
        if (i5 == 0) {
            if ((i & RendererCapabilities.DECODER_SUPPORT_MASK) == 0) {
                focusRequester2 = focusRequester;
                i3 |= composerStartRestartGroup.changed(focusRequester2) ? 256 : 128;
            }
            if ((i & 3072) == 0) {
                if (composerStartRestartGroup.changedInstance(function0)) {
                    i4 = 2048;
                } else {
                    i4 = 1024;
                }
                i3 |= i4;
            }
            if ((i3 & 1171) != 1170) {
                z3 = true;
            } else {
                z3 = false;
            }
            if (composerStartRestartGroup.shouldExecute(z3, i3 & 1)) {
                if (i5 != 0) {
                    focusRequester2 = null;
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-1896526543, i3, -1, "com.dh.myembyapp.ui.components.AudioLanguagePreferenceOptionButton (OtherSettingsOverlay.kt:2299)");
                }
                objRememberedValue = composerStartRestartGroup.rememberedValue();
                companion = Composer.INSTANCE;
                if (objRememberedValue == companion.getEmpty()) {
                    objRememberedValue = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Boolean.FALSE, null, 2, null);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                }
                mutableState = (MutableState) objRememberedValue;
                if (((Boolean) mutableState.getValue()).booleanValue()) {
                    f = 1.06f;
                } else {
                    f = 1.0f;
                }
                focusRequester4 = focusRequester2;
                int i6 = i3;
                State<Float> stateAnimateFloatAsState = AnimateAsStateKt.animateFloatAsState(f, null, 0.0f, null, null, composerStartRestartGroup, 0, 30);
                roundedCornerShapeM1312RoundedCornerShape0680j_4 = RoundedCornerShapeKt.m1312RoundedCornerShape0680j_4(Dp.m7813constructorimpl(14.0f));
                modifierFocusRequester = Modifier.INSTANCE;
                Modifier modifierClip = ClipKt.clip(ScaleKt.scale(SizeKt.fillMaxWidth$default(modifierFocusRequester, 0.0f, 1, null), stateAnimateFloatAsState.getValue().floatValue()), roundedCornerShapeM1312RoundedCornerShape0680j_4);
                if (((Boolean) mutableState.getValue()).booleanValue()) {
                    modifierM286borderxT4_qwU = BorderKt.m286borderxT4_qwU(modifierFocusRequester, Dp.m7813constructorimpl(2.0f), Color.INSTANCE.m5189getWhite0d7_KjU(), roundedCornerShapeM1312RoundedCornerShape0680j_4);
                } else {
                    modifierM286borderxT4_qwU = modifierFocusRequester;
                }
                Modifier modifierThen = modifierClip.then(modifierM286borderxT4_qwU);
                MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.INSTANCE.getTopStart(), false);
                long currentCompositeKeyHashCode = ComposablesKt.getCurrentCompositeKeyHashCode(composerStartRestartGroup, 0);
                int i7 = (int) (currentCompositeKeyHashCode ^ (currentCompositeKeyHashCode >>> 32));
                CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
                Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifierThen);
                ComposeUiNode.Companion companion2 = ComposeUiNode.INSTANCE;
                constructor = companion2.getConstructor();
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
                mr.z(companion2, composerM4318constructorimpl, measurePolicyMaybeCachedBoxMeasurePolicy, composerM4318constructorimpl, currentCompositionLocalMap);
                Updater.m4326setimpl(composerM4318constructorimpl, modifierMaterializeModifier, (Function2<? super T, ? super Modifier, Unit>) id.h(companion2, composerM4318constructorimpl, Integer.valueOf(i7), composerM4318constructorimpl));
                BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
                Modifier modifierFillMaxWidth$default = SizeKt.fillMaxWidth$default(modifierFocusRequester, 0.0f, 1, null);
                if (r3 != 0) {
                    focusRequester3 = focusRequester4;
                    modifierFocusRequester = FocusRequesterModifierKt.focusRequester(modifierFocusRequester, focusRequester3);
                } else {
                    focusRequester3 = r3;
                }
                Modifier modifierThen2 = modifierFillMaxWidth$default.then(modifierFocusRequester);
                objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                if (objRememberedValue2 == companion.getEmpty()) {
                    objRememberedValue2 = new p21(15, mutableState);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                }
                Modifier modifierOnFocusChanged = FocusChangedModifierKt.onFocusChanged(modifierThen2, (Function1) objRememberedValue2);
                ButtonDefaults buttonDefaults = ButtonDefaults.INSTANCE;
                ButtonKt.m8231ButtonTCVpFMg(function0, modifierOnFocusChanged, null, false, ButtonDefaults.scale$default(buttonDefaults, 1.0f, 1.0f, 0.0f, 0.0f, 0.0f, 28, null), null, ButtonDefaults.shape$default(buttonDefaults, roundedCornerShapeM1312RoundedCornerShape0680j_4, null, null, null, null, 30, null), hc2.r(z2, ColorKt.Color(4282532418L), composerStartRestartGroup, ((i6 >> 3) & 14) | RendererCapabilities.DECODER_SUPPORT_MASK, 2), 0.0f, null, PaddingKt.m993PaddingValuesYgX7TsA(Dp.m7813constructorimpl(10.0f), Dp.m7813constructorimpl(8.0f)), null, ComposableLambdaKt.rememberComposableLambda(1497390203, true, new rb1(str, 0), composerStartRestartGroup, 54), composerStartRestartGroup, (i6 >> 9) & 14, 390, 2860);
                composerStartRestartGroup = composerStartRestartGroup;
                composerStartRestartGroup.endNode();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
            } else {
                composerStartRestartGroup.skipToGroupEnd();
                focusRequester3 = focusRequester2;
            }
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup != null) {
                scopeUpdateScopeEndRestartGroup.updateScope(new lb1(str, z, focusRequester3, function0, i, i2, 1));
            }
        }
        i3 |= RendererCapabilities.DECODER_SUPPORT_MASK;
        focusRequester2 = focusRequester;
        if ((i & 3072) == 0) {
            if (composerStartRestartGroup.changedInstance(function0)) {
                i4 = 2048;
            } else {
                i4 = 1024;
            }
            i3 |= i4;
        }
        if ((i3 & 1171) != 1170) {
            z3 = true;
        } else {
            z3 = false;
        }
        if (composerStartRestartGroup.shouldExecute(z3, i3 & 1)) {
            if (i5 != 0) {
                focusRequester2 = null;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1896526543, i3, -1, "com.dh.myembyapp.ui.components.AudioLanguagePreferenceOptionButton (OtherSettingsOverlay.kt:2299)");
            }
            objRememberedValue = composerStartRestartGroup.rememberedValue();
            companion = Composer.INSTANCE;
            if (objRememberedValue == companion.getEmpty()) {
                objRememberedValue = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Boolean.FALSE, null, 2, null);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            mutableState = (MutableState) objRememberedValue;
            if (((Boolean) mutableState.getValue()).booleanValue()) {
                f = 1.06f;
            } else {
                f = 1.0f;
            }
            focusRequester4 = focusRequester2;
            int i8 = i3;
            State<Float> stateAnimateFloatAsState2 = AnimateAsStateKt.animateFloatAsState(f, null, 0.0f, null, null, composerStartRestartGroup, 0, 30);
            roundedCornerShapeM1312RoundedCornerShape0680j_4 = RoundedCornerShapeKt.m1312RoundedCornerShape0680j_4(Dp.m7813constructorimpl(14.0f));
            modifierFocusRequester = Modifier.INSTANCE;
            Modifier modifierClip2 = ClipKt.clip(ScaleKt.scale(SizeKt.fillMaxWidth$default(modifierFocusRequester, 0.0f, 1, null), stateAnimateFloatAsState2.getValue().floatValue()), roundedCornerShapeM1312RoundedCornerShape0680j_4);
            if (((Boolean) mutableState.getValue()).booleanValue()) {
                modifierM286borderxT4_qwU = BorderKt.m286borderxT4_qwU(modifierFocusRequester, Dp.m7813constructorimpl(2.0f), Color.INSTANCE.m5189getWhite0d7_KjU(), roundedCornerShapeM1312RoundedCornerShape0680j_4);
            } else {
                modifierM286borderxT4_qwU = modifierFocusRequester;
            }
            Modifier modifierThen3 = modifierClip2.then(modifierM286borderxT4_qwU);
            MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy2 = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.INSTANCE.getTopStart(), false);
            long currentCompositeKeyHashCode2 = ComposablesKt.getCurrentCompositeKeyHashCode(composerStartRestartGroup, 0);
            int i9 = (int) (currentCompositeKeyHashCode2 ^ (currentCompositeKeyHashCode2 >>> 32));
            CompositionLocalMap currentCompositionLocalMap2 = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier2 = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifierThen3);
            ComposeUiNode.Companion companion3 = ComposeUiNode.INSTANCE;
            constructor = companion3.getConstructor();
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
            mr.z(companion3, composerM4318constructorimpl2, measurePolicyMaybeCachedBoxMeasurePolicy2, composerM4318constructorimpl2, currentCompositionLocalMap2);
            Updater.m4326setimpl(composerM4318constructorimpl2, modifierMaterializeModifier2, (Function2<? super T, ? super Modifier, Unit>) id.h(companion3, composerM4318constructorimpl2, Integer.valueOf(i9), composerM4318constructorimpl2));
            BoxScopeInstance boxScopeInstance2 = BoxScopeInstance.INSTANCE;
            Modifier modifierFillMaxWidth$default2 = SizeKt.fillMaxWidth$default(modifierFocusRequester, 0.0f, 1, null);
            if (r3 != 0) {
                focusRequester3 = focusRequester4;
                modifierFocusRequester = FocusRequesterModifierKt.focusRequester(modifierFocusRequester, focusRequester3);
            } else {
                focusRequester3 = r3;
            }
            Modifier modifierThen4 = modifierFillMaxWidth$default2.then(modifierFocusRequester);
            objRememberedValue2 = composerStartRestartGroup.rememberedValue();
            if (objRememberedValue2 == companion.getEmpty()) {
                objRememberedValue2 = new p21(15, mutableState);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
            }
            Modifier modifierOnFocusChanged2 = FocusChangedModifierKt.onFocusChanged(modifierThen4, (Function1) objRememberedValue2);
            ButtonDefaults buttonDefaults2 = ButtonDefaults.INSTANCE;
            ButtonKt.m8231ButtonTCVpFMg(function0, modifierOnFocusChanged2, null, false, ButtonDefaults.scale$default(buttonDefaults2, 1.0f, 1.0f, 0.0f, 0.0f, 0.0f, 28, null), null, ButtonDefaults.shape$default(buttonDefaults2, roundedCornerShapeM1312RoundedCornerShape0680j_4, null, null, null, null, 30, null), hc2.r(z2, ColorKt.Color(4282532418L), composerStartRestartGroup, ((i8 >> 3) & 14) | RendererCapabilities.DECODER_SUPPORT_MASK, 2), 0.0f, null, PaddingKt.m993PaddingValuesYgX7TsA(Dp.m7813constructorimpl(10.0f), Dp.m7813constructorimpl(8.0f)), null, ComposableLambdaKt.rememberComposableLambda(1497390203, true, new rb1(str, 0), composerStartRestartGroup, 54), composerStartRestartGroup, (i8 >> 9) & 14, 390, 2860);
            composerStartRestartGroup = composerStartRestartGroup;
            composerStartRestartGroup.endNode();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
            focusRequester3 = focusRequester2;
        }
        scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new lb1(str, z, focusRequester3, function0, i, i2, 1));
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void e(AudioPrioritySortType audioPrioritySortType, AudioVersionPrioritySettings audioVersionPrioritySettings, FocusRequester focusRequester, Function1 function1, Function1 function2, Composer composer, int i) {
        AudioPrioritySortType audioPrioritySortType2;
        String label;
        boolean zHasDistinctFormatPriorities;
        Composer composerStartRestartGroup = composer.startRestartGroup(-252348023);
        int i2 = (i & 6) == 0 ? (composerStartRestartGroup.changed(audioPrioritySortType.ordinal()) ? 4 : 2) | i : i;
        if ((i & 48) == 0) {
            i2 |= composerStartRestartGroup.changedInstance(audioVersionPrioritySettings) ? 32 : 16;
        }
        if ((i & RendererCapabilities.DECODER_SUPPORT_MASK) == 0) {
            i2 |= composerStartRestartGroup.changed(focusRequester) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= composerStartRestartGroup.changedInstance(function1) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i2 |= composerStartRestartGroup.changedInstance(function2) ? 16384 : 8192;
        }
        if (composerStartRestartGroup.shouldExecute((i2 & 9363) != 9362, i2 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-252348023, i2, -1, "com.dh.myembyapp.ui.components.AudioPriorityRuleRow (OtherSettingsOverlay.kt:1514)");
            }
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            Composer.Companion companion = Composer.INSTANCE;
            if (objRememberedValue == companion.getEmpty()) {
                objRememberedValue = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Boolean.FALSE, null, 2, null);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            MutableState mutableState = (MutableState) objRememberedValue;
            Object objRememberedValue2 = composerStartRestartGroup.rememberedValue();
            if (objRememberedValue2 == companion.getEmpty()) {
                objRememberedValue2 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Boolean.FALSE, null, 2, null);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
            }
            MutableState mutableState2 = (MutableState) objRememberedValue2;
            AudioVersionPrioritySettings audioVersionPrioritySettingsNormalized = audioVersionPrioritySettings.normalized();
            Modifier.Companion companion2 = Modifier.INSTANCE;
            Modifier modifierFillMaxWidth$default = SizeKt.fillMaxWidth$default(companion2, 0.0f, 1, null);
            MeasurePolicy measurePolicyRowMeasurePolicy = RowKt.rowMeasurePolicy(Arrangement.INSTANCE.m712spacedBy0680j_4(Dp.m7813constructorimpl(8.0f)), Alignment.INSTANCE.getCenterVertically(), composerStartRestartGroup, 54);
            long currentCompositeKeyHashCode = ComposablesKt.getCurrentCompositeKeyHashCode(composerStartRestartGroup, 0);
            int i3 = (int) (currentCompositeKeyHashCode ^ (currentCompositeKeyHashCode >>> 32));
            CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifierFillMaxWidth$default);
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
            mr.z(companion3, composerM4318constructorimpl, measurePolicyRowMeasurePolicy, composerM4318constructorimpl, currentCompositionLocalMap);
            Updater.m4326setimpl(composerM4318constructorimpl, modifierMaterializeModifier, (Function2<? super T, ? super Modifier, Unit>) id.h(companion3, composerM4318constructorimpl, Integer.valueOf(i3), composerM4318constructorimpl));
            RowScopeInstance rowScopeInstance = RowScopeInstance.INSTANCE;
            String label2 = audioPrioritySortType.getLabel();
            Modifier modifierM1050height3ABfNKs = SizeKt.m1050height3ABfNKs(SizeKt.m1069width3ABfNKs(companion2, Dp.m7813constructorimpl(150.0f)), Dp.m7813constructorimpl(42.0f));
            Object objRememberedValue3 = composerStartRestartGroup.rememberedValue();
            if (objRememberedValue3 == companion.getEmpty()) {
                objRememberedValue3 = new vb1(3, mutableState);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
            }
            v(((i2 << 3) & 7168) | 25008, 0, composerStartRestartGroup, modifierM1050height3ABfNKs, focusRequester, label2, (Function0) objRememberedValue3, true);
            int i4 = bc1.$EnumSwitchMapping$1[audioPrioritySortType.ordinal()];
            if (i4 == 1) {
                label = audioVersionPrioritySettingsNormalized.getPreferredLanguage().getLabel();
            } else {
                if (i4 != 2) {
                    qu.f();
                    return;
                }
                if (AudioVersionPrioritySettings.INSTANCE.hasDistinctFormatPriorities(audioVersionPrioritySettingsNormalized)) {
                    AudioVersionPrioritySettings audioVersionPrioritySettingsNormalized2 = audioVersionPrioritySettingsNormalized.normalized();
                    IntRange intRange = new IntRange(1, 6);
                    ArrayList arrayList = new ArrayList();
                    Iterator<Integer> it = intRange.iterator();
                    while (it.hasNext()) {
                        int iNextInt = ((IntIterator) it).nextInt();
                        EnumEntries enumEntries = xf.c;
                        ArrayList arrayList2 = new ArrayList();
                        for (Object obj : enumEntries) {
                            if (L(audioVersionPrioritySettingsNormalized2, (xf) obj) == iNextInt) {
                                arrayList2.add(obj);
                            }
                        }
                        ArrayList arrayList3 = !arrayList2.isEmpty() ? arrayList2 : null;
                        String strJoinToString$default = arrayList3 != null ? CollectionsKt___CollectionsKt.joinToString$default(arrayList3, "/", null, null, 0, null, new d71(28), 30, null) : null;
                        if (strJoinToString$default != null) {
                            arrayList.add(strJoinToString$default);
                        }
                    }
                    label = CollectionsKt___CollectionsKt.joinToString$default(arrayList, " -> ", null, null, 0, null, null, 62, null);
                } else {
                    label = "默认";
                }
            }
            String str = label;
            int[] iArr = bc1.$EnumSwitchMapping$1;
            int i5 = iArr[audioPrioritySortType.ordinal()];
            if (i5 == 1) {
                zHasDistinctFormatPriorities = audioVersionPrioritySettingsNormalized.getPreferredLanguage() != AudioLanguagePreference.DEFAULT;
            } else {
                if (i5 != 2) {
                    qu.f();
                    return;
                }
                zHasDistinctFormatPriorities = AudioVersionPrioritySettings.INSTANCE.hasDistinctFormatPriorities(audioVersionPrioritySettingsNormalized);
            }
            Modifier modifierM1050height3ABfNKs2 = SizeKt.m1050height3ABfNKs(zs1.E(rowScopeInstance, Modifier.INSTANCE, 1.0f, false, 2, null), Dp.m7813constructorimpl(42.0f));
            Object objRememberedValue4 = composerStartRestartGroup.rememberedValue();
            Composer.Companion companion4 = Composer.INSTANCE;
            if (objRememberedValue4 == companion4.getEmpty()) {
                objRememberedValue4 = new vb1(4, mutableState2);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue4);
            }
            v(24576, 8, composerStartRestartGroup, modifierM1050height3ABfNKs2, null, str, (Function0) objRememberedValue4, zHasDistinctFormatPriorities);
            composerStartRestartGroup.endNode();
            if (((Boolean) mutableState.getValue()).booleanValue()) {
                composerStartRestartGroup.startReplaceGroup(-1505939115);
                boolean z = (i2 & 7168) == 2048;
                Object objRememberedValue5 = composerStartRestartGroup.rememberedValue();
                if (z || objRememberedValue5 == companion4.getEmpty()) {
                    objRememberedValue5 = new r7(function1, mutableState, 15);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue5);
                }
                Function1 function3 = (Function1) objRememberedValue5;
                Object objRememberedValue6 = composerStartRestartGroup.rememberedValue();
                if (objRememberedValue6 == companion4.getEmpty()) {
                    objRememberedValue6 = new vb1(5, mutableState);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue6);
                }
                audioPrioritySortType2 = audioPrioritySortType;
                f(audioPrioritySortType2, function3, (Function0) objRememberedValue6, composerStartRestartGroup, (i2 & 14) | RendererCapabilities.DECODER_SUPPORT_MASK);
                composerStartRestartGroup.endReplaceGroup();
            } else {
                audioPrioritySortType2 = audioPrioritySortType;
                composerStartRestartGroup.startReplaceGroup(-1505658503);
                composerStartRestartGroup.endReplaceGroup();
            }
            if (((Boolean) mutableState2.getValue()).booleanValue()) {
                composerStartRestartGroup.startReplaceGroup(-1505601804);
                int i6 = iArr[audioPrioritySortType2.ordinal()];
                if (i6 == 1) {
                    composerStartRestartGroup.startReplaceGroup(-1988228710);
                    AudioLanguagePreference preferredLanguage = audioVersionPrioritySettingsNormalized.getPreferredLanguage();
                    boolean zChangedInstance = composerStartRestartGroup.changedInstance(audioVersionPrioritySettingsNormalized) | ((i2 & 57344) == 16384);
                    Object objRememberedValue7 = composerStartRestartGroup.rememberedValue();
                    if (zChangedInstance || objRememberedValue7 == companion4.getEmpty()) {
                        objRememberedValue7 = new c1(function2, (Object) audioVersionPrioritySettingsNormalized, mutableState2, 27);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue7);
                    }
                    Function1 function4 = (Function1) objRememberedValue7;
                    Object objRememberedValue8 = composerStartRestartGroup.rememberedValue();
                    if (objRememberedValue8 == companion4.getEmpty()) {
                        objRememberedValue8 = new vb1(6, mutableState2);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue8);
                    }
                    c(preferredLanguage, function4, (Function0) objRememberedValue8, composerStartRestartGroup, RendererCapabilities.DECODER_SUPPORT_MASK);
                    composerStartRestartGroup.endReplaceGroup();
                    Unit unit = Unit.INSTANCE;
                } else {
                    if (i6 != 2) {
                        composerStartRestartGroup.startReplaceGroup(-1988230450);
                        composerStartRestartGroup.endReplaceGroup();
                        qu.f();
                        return;
                    }
                    composerStartRestartGroup.startReplaceGroup(-1988216603);
                    Object objRememberedValue9 = composerStartRestartGroup.rememberedValue();
                    if (objRememberedValue9 == companion4.getEmpty()) {
                        objRememberedValue9 = new vb1(7, mutableState2);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue9);
                    }
                    b(audioVersionPrioritySettingsNormalized, function2, (Function0) objRememberedValue9, composerStartRestartGroup, ((i2 >> 9) & Input.Keys.FORWARD_DEL) | RendererCapabilities.DECODER_SUPPORT_MASK);
                    composerStartRestartGroup.endReplaceGroup();
                    Unit unit2 = Unit.INSTANCE;
                }
                composerStartRestartGroup.endReplaceGroup();
            } else {
                composerStartRestartGroup.startReplaceGroup(-1504976007);
                composerStartRestartGroup.endReplaceGroup();
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            audioPrioritySortType2 = audioPrioritySortType;
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new eh((Object) audioPrioritySortType2, (Object) audioVersionPrioritySettings, (Object) focusRequester, (Object) function1, (Object) function2, i, 9));
        }
    }

    public static final void f(AudioPrioritySortType audioPrioritySortType, Function1 function1, Function0 function0, Composer composer, int i) {
        int i2;
        Function0 function2;
        Composer composerStartRestartGroup = composer.startRestartGroup(1833604297);
        if ((i & 6) == 0) {
            i2 = (composerStartRestartGroup.changed(audioPrioritySortType.ordinal()) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= composerStartRestartGroup.changedInstance(function1) ? 32 : 16;
        }
        if ((i & RendererCapabilities.DECODER_SUPPORT_MASK) == 0) {
            function2 = function0;
            i2 |= composerStartRestartGroup.changedInstance(function2) ? 256 : 128;
        } else {
            function2 = function0;
        }
        if (composerStartRestartGroup.shouldExecute((i2 & Input.Keys.NUMPAD_3) != 146, i2 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1833604297, i2, -1, "com.dh.myembyapp.ui.components.AudioPriorityTypeDialog (OtherSettingsOverlay.kt:1580)");
            }
            int i3 = i2 & 14;
            boolean z = i3 == 4;
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            if (z || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                objRememberedValue = mr.n(composerStartRestartGroup);
            }
            FocusRequester focusRequester = (FocusRequester) objRememberedValue;
            AndroidDialog_androidKt.Dialog(function2, new DialogProperties(true, false, false), ComposableLambdaKt.rememberComposableLambda(-1129534574, true, new r5(audioPrioritySortType, focusRequester, function1, 14), composerStartRestartGroup, 54), composerStartRestartGroup, ((i2 >> 6) & 14) | 432, 0);
            boolean zChanged = composerStartRestartGroup.changed(focusRequester);
            Object objRememberedValue2 = composerStartRestartGroup.rememberedValue();
            if (zChanged || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                objRememberedValue2 = new ng(focusRequester, null, 4);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
            }
            EffectsKt.LaunchedEffect(audioPrioritySortType, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) objRememberedValue2, composerStartRestartGroup, i3);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new x7(i, 22, audioPrioritySortType, function1, function0));
        }
    }

    public static final void g(AudioVersionPrioritySettings audioVersionPrioritySettings, Function1 function1, Composer composer, int i) {
        Composer composerStartRestartGroup = composer.startRestartGroup(246759151);
        int i2 = 4;
        int i3 = (i & 6) == 0 ? (composerStartRestartGroup.changedInstance(audioVersionPrioritySettings) ? 4 : 2) | i : i;
        if ((i & 48) == 0) {
            i3 |= composerStartRestartGroup.changedInstance(function1) ? 32 : 16;
        }
        int i4 = i3;
        if (composerStartRestartGroup.shouldExecute((i4 & 19) != 18, i4 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(246759151, i4, -1, "com.dh.myembyapp.ui.components.AudioVersionPrioritySelector (OtherSettingsOverlay.kt:1482)");
            }
            AudioVersionPrioritySettings audioVersionPrioritySettingsNormalized = audioVersionPrioritySettings.normalized();
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                int size = AudioVersionPrioritySettings.INSTANCE.getDEFAULT_SORT_TYPES().size();
                ArrayList arrayList = new ArrayList(size);
                for (int i5 = 0; i5 < size; i5++) {
                    arrayList.add(new FocusRequester());
                }
                composerStartRestartGroup.updateRememberedValue(arrayList);
                objRememberedValue = arrayList;
            }
            List list = (List) objRememberedValue;
            Arrangement.HorizontalOrVertical horizontalOrVerticalM712spacedBy0680j_4 = Arrangement.INSTANCE.m712spacedBy0680j_4(Dp.m7813constructorimpl(8.0f));
            Modifier.Companion companion = Modifier.INSTANCE;
            MeasurePolicy measurePolicyColumnMeasurePolicy = ColumnKt.columnMeasurePolicy(horizontalOrVerticalM712spacedBy0680j_4, Alignment.INSTANCE.getStart(), composerStartRestartGroup, 6);
            long currentCompositeKeyHashCode = ComposablesKt.getCurrentCompositeKeyHashCode(composerStartRestartGroup, 0);
            int i6 = (int) (currentCompositeKeyHashCode ^ (currentCompositeKeyHashCode >>> 32));
            CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(composerStartRestartGroup, companion);
            ComposeUiNode.Companion companion2 = ComposeUiNode.INSTANCE;
            Function0<ComposeUiNode> constructor = companion2.getConstructor();
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
            mr.z(companion2, composerM4318constructorimpl, measurePolicyColumnMeasurePolicy, composerM4318constructorimpl, currentCompositionLocalMap);
            Updater.m4326setimpl(composerM4318constructorimpl, modifierMaterializeModifier, (Function2<? super T, ? super Modifier, Unit>) id.h(companion2, composerM4318constructorimpl, Integer.valueOf(i6), composerM4318constructorimpl));
            ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.INSTANCE;
            composerStartRestartGroup.startReplaceGroup(-1459373619);
            int i7 = 0;
            for (Object obj : audioVersionPrioritySettingsNormalized.getSortTypes()) {
                int i8 = i7 + 1;
                if (i7 < 0) {
                    CollectionsKt.throwIndexOverflow();
                }
                AudioPrioritySortType audioPrioritySortType = (AudioPrioritySortType) obj;
                FocusRequester focusRequester = (FocusRequester) list.get(i7);
                int i9 = i4 & Input.Keys.FORWARD_DEL;
                boolean zChangedInstance = (i9 == 32) | composerStartRestartGroup.changedInstance(audioVersionPrioritySettingsNormalized) | composerStartRestartGroup.changed(i7);
                Object objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                if (zChangedInstance || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                    objRememberedValue2 = new ns0(function1, audioVersionPrioritySettingsNormalized, i7, i2);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                }
                Function1 function2 = (Function1) objRememberedValue2;
                boolean z = i9 == 32;
                Object objRememberedValue3 = composerStartRestartGroup.rememberedValue();
                if (z || objRememberedValue3 == Composer.INSTANCE.getEmpty()) {
                    objRememberedValue3 = new f5(function1, 19);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
                }
                e(audioPrioritySortType, audioVersionPrioritySettingsNormalized, focusRequester, function2, (Function1) objRememberedValue3, composerStartRestartGroup, 0);
                i7 = i8;
            }
            if (i9.s(composerStartRestartGroup)) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new e81(audioVersionPrioritySettings, function1, i, 8));
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void h(String str, boolean z, Function0 function0, Composer composer, int i) {
        int i2;
        Composer composer2;
        Composer composerStartRestartGroup = composer.startRestartGroup(218118198);
        if ((i & 6) == 0) {
            i2 = (composerStartRestartGroup.changed(str) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= composerStartRestartGroup.changed(z) ? 32 : 16;
        }
        if ((i & RendererCapabilities.DECODER_SUPPORT_MASK) == 0) {
            i2 |= composerStartRestartGroup.changedInstance(function0) ? 256 : 128;
        }
        if (composerStartRestartGroup.shouldExecute((i2 & Input.Keys.NUMPAD_3) != 146, i2 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(218118198, i2, -1, "com.dh.myembyapp.ui.components.FixedWidthSelectableOptionButton (OtherSettingsOverlay.kt:847)");
            }
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            Composer.Companion companion = Composer.INSTANCE;
            if (objRememberedValue == companion.getEmpty()) {
                objRememberedValue = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Boolean.FALSE, null, 2, null);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            MutableState mutableState = (MutableState) objRememberedValue;
            State<Float> stateAnimateFloatAsState = AnimateAsStateKt.animateFloatAsState(((Boolean) mutableState.getValue()).booleanValue() ? 1.06f : 1.0f, null, 0.0f, null, null, composerStartRestartGroup, 0, 30);
            Modifier.Companion companion2 = Modifier.INSTANCE;
            Modifier modifierThen = ScaleKt.scale(companion2, stateAnimateFloatAsState.getValue().floatValue()).then(((Boolean) mutableState.getValue()).booleanValue() ? BorderKt.m286borderxT4_qwU(companion2, Dp.m7813constructorimpl(2.0f), Color.INSTANCE.m5189getWhite0d7_KjU(), RoundedCornerShapeKt.RoundedCornerShape(50)) : companion2);
            MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.INSTANCE.getTopStart(), false);
            long currentCompositeKeyHashCode = ComposablesKt.getCurrentCompositeKeyHashCode(composerStartRestartGroup, 0);
            int i3 = (int) (currentCompositeKeyHashCode ^ (currentCompositeKeyHashCode >>> 32));
            CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifierThen);
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
            Updater.m4326setimpl(composerM4318constructorimpl, modifierMaterializeModifier, (Function2<? super T, ? super Modifier, Unit>) id.h(companion3, composerM4318constructorimpl, Integer.valueOf(i3), composerM4318constructorimpl));
            BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
            Modifier modifierM1069width3ABfNKs = SizeKt.m1069width3ABfNKs(companion2, Dp.m7813constructorimpl(110.0f));
            Object objRememberedValue2 = composerStartRestartGroup.rememberedValue();
            if (objRememberedValue2 == companion.getEmpty()) {
                objRememberedValue2 = new ub1(1, mutableState);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
            }
            composer2 = composerStartRestartGroup;
            ButtonKt.m8231ButtonTCVpFMg(function0, FocusChangedModifierKt.onFocusChanged(modifierM1069width3ABfNKs, (Function1) objRememberedValue2), null, false, ButtonDefaults.scale$default(ButtonDefaults.INSTANCE, 1.0f, 1.0f, 0.0f, 0.0f, 0.0f, 28, null), null, null, hc2.r(z, 0L, composerStartRestartGroup, (i2 >> 3) & 14, 6), 0.0f, null, PaddingKt.m993PaddingValuesYgX7TsA(Dp.m7813constructorimpl(14.0f), Dp.m7813constructorimpl(6.0f)), null, ComposableLambdaKt.rememberComposableLambda(-2140445184, true, new e8(2, mutableState, str), composerStartRestartGroup, 54), composer2, (i2 >> 6) & 14, 390, 2924);
            composer2.endNode();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composer2 = composerStartRestartGroup;
            composer2.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new yh(str, z, function0, i, 2));
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void i(final SystemNetworkSpeedDisplayMode systemNetworkSpeedDisplayMode, final SystemNetworkSpeedPosition systemNetworkSpeedPosition, final SystemTimeDisplayMode systemTimeDisplayMode, final int i, final int i2, PlayerResizeMode playerResizeMode, PlayerDefaultViewMode playerDefaultViewMode, PlayerFrameRateMatchingMode playerFrameRateMatchingMode, final VideoVersionPrioritySettings videoVersionPrioritySettings, final AudioVersionPrioritySettings audioVersionPrioritySettings, final SubtitleVersionPrioritySettings subtitleVersionPrioritySettings, final Function11 function11, final Function0 function0, Composer composer, final int i3, final int i4) {
        int i5;
        int i6;
        Function0 function1;
        final PlayerResizeMode playerResizeMode2;
        final PlayerDefaultViewMode playerDefaultViewMode2;
        Composer composer2;
        PlayerFrameRateMatchingMode playerFrameRateMatchingMode2;
        Object objMutableStateOf$default;
        Object objMutableStateOf$default2;
        systemNetworkSpeedDisplayMode.getClass();
        systemNetworkSpeedPosition.getClass();
        systemTimeDisplayMode.getClass();
        playerResizeMode.getClass();
        playerDefaultViewMode.getClass();
        playerFrameRateMatchingMode.getClass();
        videoVersionPrioritySettings.getClass();
        audioVersionPrioritySettings.getClass();
        subtitleVersionPrioritySettings.getClass();
        function11.getClass();
        function0.getClass();
        Composer composerStartRestartGroup = composer.startRestartGroup(-1739710070);
        if ((i3 & 6) == 0) {
            i5 = (composerStartRestartGroup.changed(systemNetworkSpeedDisplayMode.ordinal()) ? 4 : 2) | i3;
        } else {
            i5 = i3;
        }
        if ((i3 & 48) == 0) {
            i5 |= composerStartRestartGroup.changed(systemNetworkSpeedPosition.ordinal()) ? 32 : 16;
        }
        if ((i3 & RendererCapabilities.DECODER_SUPPORT_MASK) == 0) {
            i5 |= composerStartRestartGroup.changed(systemTimeDisplayMode.ordinal()) ? 256 : 128;
        }
        if ((i3 & 3072) == 0) {
            i5 |= composerStartRestartGroup.changed(i) ? 2048 : 1024;
        }
        if ((i3 & 24576) == 0) {
            i5 |= composerStartRestartGroup.changed(i2) ? 16384 : 8192;
        }
        if ((196608 & i3) == 0) {
            i5 |= composerStartRestartGroup.changed(playerResizeMode.ordinal()) ? 131072 : 65536;
        }
        if ((1572864 & i3) == 0) {
            i5 |= composerStartRestartGroup.changed(playerDefaultViewMode.ordinal()) ? 1048576 : 524288;
        }
        if ((12582912 & i3) == 0) {
            i5 |= composerStartRestartGroup.changed(playerFrameRateMatchingMode.ordinal()) ? 8388608 : 4194304;
        }
        if ((100663296 & i3) == 0) {
            i5 |= composerStartRestartGroup.changedInstance(videoVersionPrioritySettings) ? 67108864 : GroupFlagsKt.HasAuxSlotFlag;
        }
        if ((805306368 & i3) == 0) {
            i5 |= composerStartRestartGroup.changedInstance(audioVersionPrioritySettings) ? 536870912 : 268435456;
        }
        if ((i4 & 6) == 0) {
            i6 = (composerStartRestartGroup.changedInstance(subtitleVersionPrioritySettings) ? 4 : 2) | i4;
        } else {
            i6 = i4;
        }
        if ((i4 & 48) == 0) {
            i6 |= composerStartRestartGroup.changedInstance(function11) ? 32 : 16;
        }
        if ((i4 & RendererCapabilities.DECODER_SUPPORT_MASK) == 0) {
            function1 = function0;
            i6 |= composerStartRestartGroup.changedInstance(function1) ? 256 : 128;
        } else {
            function1 = function0;
        }
        if (composerStartRestartGroup.shouldExecute(((i5 & 306783379) == 306783378 && (i6 & Input.Keys.NUMPAD_3) == 146) ? false : true, i5 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1739710070, i5, i6, "com.dh.myembyapp.ui.components.OtherSettingsOverlay (OtherSettingsOverlay.kt:104)");
            }
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            Composer.Companion companion = Composer.INSTANCE;
            if (objRememberedValue == companion.getEmpty()) {
                objRememberedValue = mr.n(composerStartRestartGroup);
            }
            final FocusRequester focusRequester = (FocusRequester) objRememberedValue;
            Object objRememberedValue2 = composerStartRestartGroup.rememberedValue();
            if (objRememberedValue2 == companion.getEmpty()) {
                objRememberedValue2 = mr.n(composerStartRestartGroup);
            }
            final FocusRequester focusRequester2 = (FocusRequester) objRememberedValue2;
            Object objRememberedValue3 = composerStartRestartGroup.rememberedValue();
            if (objRememberedValue3 == companion.getEmpty()) {
                objRememberedValue3 = mr.n(composerStartRestartGroup);
            }
            final FocusRequester focusRequester3 = (FocusRequester) objRememberedValue3;
            Object objRememberedValue4 = composerStartRestartGroup.rememberedValue();
            if (objRememberedValue4 == companion.getEmpty()) {
                objRememberedValue4 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Boolean.FALSE, null, 2, null);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue4);
            }
            final MutableState mutableState = (MutableState) objRememberedValue4;
            Object objRememberedValue5 = composerStartRestartGroup.rememberedValue();
            if (objRememberedValue5 == companion.getEmpty()) {
                objRememberedValue5 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Boolean.FALSE, null, 2, null);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue5);
            }
            final MutableState mutableState2 = (MutableState) objRememberedValue5;
            final State<Float> stateAnimateFloatAsState = AnimateAsStateKt.animateFloatAsState(((Boolean) mutableState.getValue()).booleanValue() ? 1.06f : 1.0f, null, 0.0f, null, null, composerStartRestartGroup, 0, 30);
            final State<Float> stateAnimateFloatAsState2 = AnimateAsStateKt.animateFloatAsState(((Boolean) mutableState2.getValue()).booleanValue() ? 1.06f : 1.0f, null, 0.0f, null, null, composerStartRestartGroup, 0, 30);
            composer2 = composerStartRestartGroup;
            boolean z = (i5 & 14) == 4;
            Object objRememberedValue6 = composer2.rememberedValue();
            if (z || objRememberedValue6 == companion.getEmpty()) {
                MutableState mutableStateMutableStateOf$default = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(systemNetworkSpeedDisplayMode, null, 2, null);
                composer2.updateRememberedValue(mutableStateMutableStateOf$default);
                objRememberedValue6 = mutableStateMutableStateOf$default;
            }
            final MutableState mutableState3 = (MutableState) objRememberedValue6;
            boolean z2 = (i5 & Input.Keys.FORWARD_DEL) == 32;
            Object objRememberedValue7 = composer2.rememberedValue();
            if (z2 || objRememberedValue7 == companion.getEmpty()) {
                MutableState mutableStateMutableStateOf$default2 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(systemNetworkSpeedPosition, null, 2, null);
                composer2.updateRememberedValue(mutableStateMutableStateOf$default2);
                objRememberedValue7 = mutableStateMutableStateOf$default2;
            }
            final MutableState mutableState4 = (MutableState) objRememberedValue7;
            boolean z3 = (i5 & 896) == 256;
            Object objRememberedValue8 = composer2.rememberedValue();
            if (z3 || objRememberedValue8 == companion.getEmpty()) {
                objMutableStateOf$default = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(systemTimeDisplayMode, null, 2, null);
                composer2.updateRememberedValue(objMutableStateOf$default);
            } else {
                objMutableStateOf$default = objRememberedValue8;
            }
            final MutableState mutableState5 = (MutableState) objMutableStateOf$default;
            boolean z4 = (i5 & 7168) == 2048;
            Object objRememberedValue9 = composer2.rememberedValue();
            if (z4 || objRememberedValue9 == companion.getEmpty()) {
                objRememberedValue9 = SnapshotIntStateKt.mutableIntStateOf((RangesKt.coerceIn(i, 5, 60) / 5) * 5);
                composer2.updateRememberedValue(objRememberedValue9);
            }
            final MutableIntState mutableIntState = (MutableIntState) objRememberedValue9;
            boolean z5 = (57344 & i5) == 16384;
            Object objRememberedValue10 = composer2.rememberedValue();
            if (z5 || objRememberedValue10 == companion.getEmpty()) {
                objRememberedValue10 = SnapshotIntStateKt.mutableIntStateOf(UserPreferences.INSTANCE.normalizeAudioDelayMs(i2));
                composer2.updateRememberedValue(objRememberedValue10);
            }
            final MutableIntState mutableIntState2 = (MutableIntState) objRememberedValue10;
            boolean z6 = (458752 & i5) == 131072;
            Object objRememberedValue11 = composer2.rememberedValue();
            if (z6 || objRememberedValue11 == companion.getEmpty()) {
                playerResizeMode2 = playerResizeMode;
                objMutableStateOf$default2 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(playerResizeMode2, null, 2, null);
                composer2.updateRememberedValue(objMutableStateOf$default2);
            } else {
                objMutableStateOf$default2 = objRememberedValue11;
                playerResizeMode2 = playerResizeMode;
            }
            final MutableState mutableState6 = (MutableState) objMutableStateOf$default2;
            boolean z7 = (i5 & 3670016) == 1048576;
            Object objRememberedValue12 = composer2.rememberedValue();
            if (z7 || objRememberedValue12 == companion.getEmpty()) {
                playerDefaultViewMode2 = playerDefaultViewMode;
                MutableState mutableStateMutableStateOf$default3 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(playerDefaultViewMode2, null, 2, null);
                composer2.updateRememberedValue(mutableStateMutableStateOf$default3);
                objRememberedValue12 = mutableStateMutableStateOf$default3;
            } else {
                playerDefaultViewMode2 = playerDefaultViewMode;
            }
            final MutableState mutableState7 = (MutableState) objRememberedValue12;
            boolean z8 = (i5 & 29360128) == 8388608;
            Object objRememberedValue13 = composer2.rememberedValue();
            if (z8 || objRememberedValue13 == companion.getEmpty()) {
                playerFrameRateMatchingMode2 = playerFrameRateMatchingMode;
                MutableState mutableStateMutableStateOf$default4 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(playerFrameRateMatchingMode2, null, 2, null);
                composer2.updateRememberedValue(mutableStateMutableStateOf$default4);
                objRememberedValue13 = mutableStateMutableStateOf$default4;
            } else {
                playerFrameRateMatchingMode2 = playerFrameRateMatchingMode;
            }
            final MutableState mutableState8 = (MutableState) objRememberedValue13;
            boolean zChanged = composer2.changed(videoVersionPrioritySettings);
            Object objRememberedValue14 = composer2.rememberedValue();
            if (zChanged || objRememberedValue14 == companion.getEmpty()) {
                MutableState mutableStateMutableStateOf$default5 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(videoVersionPrioritySettings.normalized(), null, 2, null);
                composer2.updateRememberedValue(mutableStateMutableStateOf$default5);
                objRememberedValue14 = mutableStateMutableStateOf$default5;
            }
            final MutableState mutableState9 = (MutableState) objRememberedValue14;
            boolean zChanged2 = composer2.changed(audioVersionPrioritySettings);
            Object objRememberedValue15 = composer2.rememberedValue();
            if (zChanged2 || objRememberedValue15 == companion.getEmpty()) {
                MutableState mutableStateMutableStateOf$default6 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(audioVersionPrioritySettings.normalized(), null, 2, null);
                composer2.updateRememberedValue(mutableStateMutableStateOf$default6);
                objRememberedValue15 = mutableStateMutableStateOf$default6;
            }
            final MutableState mutableState10 = (MutableState) objRememberedValue15;
            boolean zChanged3 = composer2.changed(subtitleVersionPrioritySettings);
            Object objRememberedValue16 = composer2.rememberedValue();
            if (zChanged3 || objRememberedValue16 == companion.getEmpty()) {
                objRememberedValue16 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(subtitleVersionPrioritySettings.normalized(), null, 2, null);
                composer2.updateRememberedValue(objRememberedValue16);
            }
            final MutableState mutableState11 = (MutableState) objRememberedValue16;
            final Function0 function2 = function1;
            AndroidDialog_androidKt.Dialog(function0, new DialogProperties(true, false, false), ComposableLambdaKt.rememberComposableLambda(1295075539, true, new Function2() { // from class: kb1
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    int iIntValue = ((Integer) obj2).intValue();
                    return cc1.p(focusRequester, focusRequester2, focusRequester3, mutableState5, mutableState3, mutableState4, mutableIntState, mutableIntState2, mutableState6, mutableState7, mutableState8, mutableState9, mutableState10, mutableState11, stateAnimateFloatAsState, mutableState, function2, stateAnimateFloatAsState2, mutableState2, function11, (Composer) obj, iIntValue);
                }
            }, composer2, 54), composer2, ((i6 >> 6) & 14) | 432, 0);
            Unit unit = Unit.INSTANCE;
            boolean zChanged4 = composer2.changed(mutableState5);
            Object objRememberedValue17 = composer2.rememberedValue();
            if (zChanged4 || objRememberedValue17 == companion.getEmpty()) {
                objRememberedValue17 = new q3(focusRequester, focusRequester2, focusRequester3, mutableState5, (Continuation) null, 11);
                composer2.updateRememberedValue(objRememberedValue17);
            }
            EffectsKt.LaunchedEffect(unit, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) objRememberedValue17, composer2, 6);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            playerResizeMode2 = playerResizeMode;
            playerDefaultViewMode2 = playerDefaultViewMode;
            composer2 = composerStartRestartGroup;
            playerFrameRateMatchingMode2 = playerFrameRateMatchingMode;
            composer2.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            final PlayerFrameRateMatchingMode playerFrameRateMatchingMode3 = playerFrameRateMatchingMode2;
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: sb1
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).intValue();
                    int iUpdateChangedFlags = RecomposeScopeImplKt.updateChangedFlags(i3 | 1);
                    int iUpdateChangedFlags2 = RecomposeScopeImplKt.updateChangedFlags(i4);
                    cc1.i(systemNetworkSpeedDisplayMode, systemNetworkSpeedPosition, systemTimeDisplayMode, i, i2, playerResizeMode2, playerDefaultViewMode2, playerFrameRateMatchingMode3, videoVersionPrioritySettings, audioVersionPrioritySettings, subtitleVersionPrioritySettings, function11, function0, (Composer) obj, iUpdateChangedFlags, iUpdateChangedFlags2);
                    return Unit.INSTANCE;
                }
            });
        }
    }

    public static final float j(State state) {
        return ((Number) state.getValue()).floatValue();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final SystemNetworkSpeedDisplayMode k(MutableState mutableState) {
        return (SystemNetworkSpeedDisplayMode) mutableState.getValue();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final SystemNetworkSpeedPosition l(MutableState mutableState) {
        return (SystemNetworkSpeedPosition) mutableState.getValue();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final SystemTimeDisplayMode m(MutableState mutableState) {
        return (SystemTimeDisplayMode) mutableState.getValue();
    }

    public static final int n(MutableIntState mutableIntState) {
        return mutableIntState.getIntValue();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final PlayerFrameRateMatchingMode o(MutableState mutableState) {
        return (PlayerFrameRateMatchingMode) mutableState.getValue();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final Unit p(FocusRequester focusRequester, FocusRequester focusRequester2, FocusRequester focusRequester3, final MutableState mutableState, final MutableState mutableState2, final MutableState mutableState3, final MutableIntState mutableIntState, final MutableIntState mutableIntState2, final MutableState mutableState4, final MutableState mutableState5, final MutableState mutableState6, final MutableState mutableState7, final MutableState mutableState8, final MutableState mutableState9, State state, MutableState mutableState10, Function0 function0, State state2, MutableState mutableState11, final Function11 function11, Composer composer, int i) {
        Modifier.Companion companion;
        int i2;
        MutableState mutableState12;
        Object obj;
        Modifier.Companion companion2;
        float f;
        MutableState mutableState13;
        if (composer.shouldExecute((i & 3) != 2, i & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1295075539, i, -1, "com.dh.myembyapp.ui.components.OtherSettingsOverlay.<anonymous> (OtherSettingsOverlay.kt:154)");
            }
            Modifier.Companion companion3 = Modifier.INSTANCE;
            Modifier modifierFillMaxSize$default = SizeKt.fillMaxSize$default(companion3, 0.0f, 1, null);
            Color.Companion companion4 = Color.INSTANCE;
            Modifier modifierM275backgroundbw27NRU$default = BackgroundKt.m275backgroundbw27NRU$default(modifierFillMaxSize$default, Color.m5151copywmQWz5c$default(companion4.m5178getBlack0d7_KjU(), 0.1f, 0.0f, 0.0f, 0.0f, 14, null), null, 2, null);
            Alignment.Companion companion5 = Alignment.INSTANCE;
            MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(companion5.getCenter(), false);
            int iB = id.b(ComposablesKt.getCurrentCompositeKeyHashCode(composer, 0));
            CompositionLocalMap currentCompositionLocalMap = composer.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(composer, modifierM275backgroundbw27NRU$default);
            ComposeUiNode.Companion companion6 = ComposeUiNode.INSTANCE;
            Function0<ComposeUiNode> constructor = companion6.getConstructor();
            if (!id.n(composer.getApplier())) {
                ComposablesKt.invalidApplier();
            }
            composer.startReusableNode();
            if (composer.getInserting()) {
                composer.createNode(constructor);
            } else {
                composer.useNode();
            }
            Composer composerM4318constructorimpl = Updater.m4318constructorimpl(composer);
            mr.z(companion6, composerM4318constructorimpl, measurePolicyMaybeCachedBoxMeasurePolicy, composerM4318constructorimpl, currentCompositionLocalMap);
            Updater.m4326setimpl(composerM4318constructorimpl, modifierMaterializeModifier, (Function2<? super T, ? super Modifier, Unit>) id.h(companion6, composerM4318constructorimpl, Integer.valueOf(iB), composerM4318constructorimpl));
            BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
            Modifier modifierM999padding3ABfNKs = PaddingKt.m999padding3ABfNKs(ScrollKt.verticalScroll$default(kb0.v(12.0f, SizeKt.m1052heightInVpY3zN4$default(SizeKt.m1069width3ABfNKs(companion3, Dp.m7813constructorimpl(540.0f)), 0.0f, Dp.m7813constructorimpl(560.0f), 1, null), ColorKt.Color(4280032284L)), ScrollKt.rememberScrollState(0, composer, 0, 1), false, null, false, 14, null), Dp.m7813constructorimpl(16.0f));
            Arrangement arrangement = Arrangement.INSTANCE;
            MeasurePolicy measurePolicyColumnMeasurePolicy = ColumnKt.columnMeasurePolicy(arrangement.getTop(), companion5.getStart(), composer, 0);
            int iB2 = id.b(ComposablesKt.getCurrentCompositeKeyHashCode(composer, 0));
            CompositionLocalMap currentCompositionLocalMap2 = composer.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier2 = ComposedModifierKt.materializeModifier(composer, modifierM999padding3ABfNKs);
            Function0<ComposeUiNode> constructor2 = companion6.getConstructor();
            if (!id.n(composer.getApplier())) {
                ComposablesKt.invalidApplier();
            }
            composer.startReusableNode();
            if (composer.getInserting()) {
                composer.createNode(constructor2);
            } else {
                composer.useNode();
            }
            Composer composerM4318constructorimpl2 = Updater.m4318constructorimpl(composer);
            mr.z(companion6, composerM4318constructorimpl2, measurePolicyColumnMeasurePolicy, composerM4318constructorimpl2, currentCompositionLocalMap2);
            Updater.m4326setimpl(composerM4318constructorimpl2, modifierMaterializeModifier2, (Function2<? super T, ? super Modifier, Unit>) id.h(companion6, composerM4318constructorimpl2, Integer.valueOf(iB2), composerM4318constructorimpl2));
            ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.INSTANCE;
            TextKt.m3048TextNvy7gAk("播放杂项", null, companion4.m5189getWhite0d7_KjU(), null, TextUnitKt.getSp(17), null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, composer, 24966, 0, 262122);
            SpacerKt.Spacer(SizeKt.m1050height3ABfNKs(companion3, Dp.m7813constructorimpl(10.0f)), composer, 6);
            Alignment.Vertical centerVertically = companion5.getCenterVertically();
            Modifier modifierM1003paddingqDBjuR0$default = PaddingKt.m1003paddingqDBjuR0$default(companion3, 0.0f, 0.0f, 0.0f, Dp.m7813constructorimpl(6.0f), 7, null);
            MeasurePolicy measurePolicyRowMeasurePolicy = RowKt.rowMeasurePolicy(arrangement.getStart(), centerVertically, composer, 48);
            int iB3 = id.b(ComposablesKt.getCurrentCompositeKeyHashCode(composer, 0));
            CompositionLocalMap currentCompositionLocalMap3 = composer.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier3 = ComposedModifierKt.materializeModifier(composer, modifierM1003paddingqDBjuR0$default);
            Function0<ComposeUiNode> constructor3 = companion6.getConstructor();
            if (!id.n(composer.getApplier())) {
                ComposablesKt.invalidApplier();
            }
            composer.startReusableNode();
            if (composer.getInserting()) {
                composer.createNode(constructor3);
            } else {
                composer.useNode();
            }
            Composer composerM4318constructorimpl3 = Updater.m4318constructorimpl(composer);
            mr.z(companion6, composerM4318constructorimpl3, measurePolicyRowMeasurePolicy, composerM4318constructorimpl3, currentCompositionLocalMap3);
            Updater.m4326setimpl(composerM4318constructorimpl3, modifierMaterializeModifier3, (Function2<? super T, ? super Modifier, Unit>) id.h(companion6, composerM4318constructorimpl3, Integer.valueOf(iB3), composerM4318constructorimpl3));
            RowScopeInstance rowScopeInstance = RowScopeInstance.INSTANCE;
            TextKt.m3048TextNvy7gAk("系统时间常驻", null, companion4.m5189getWhite0d7_KjU(), null, TextUnitKt.getSp(15), null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, composer, 24966, 0, 262122);
            composer.endNode();
            SystemTimeDisplayMode systemTimeDisplayModeM = m(mutableState);
            boolean zChanged = composer.changed(mutableState);
            Object objRememberedValue = composer.rememberedValue();
            if (zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                objRememberedValue = new p21(16, mutableState);
                composer.updateRememberedValue(objRememberedValue);
            }
            E(systemTimeDisplayModeM, focusRequester, focusRequester2, focusRequester3, (Function1) objRememberedValue, composer, 3504);
            SpacerKt.Spacer(SizeKt.m1050height3ABfNKs(companion3, Dp.m7813constructorimpl(14.0f)), composer, 6);
            Alignment.Vertical centerVerticallyDuration = companion5.getCenterVertically();
            Modifier modifierM1003paddingqDBjuR0$defaultDuration = PaddingKt.m1003paddingqDBjuR0$default(companion3, 0.0f, 0.0f, 0.0f, Dp.m7813constructorimpl(6.0f), 7, null);
            MeasurePolicy measurePolicyRowMeasurePolicyDuration = RowKt.rowMeasurePolicy(arrangement.getStart(), centerVerticallyDuration, composer, 48);
            int iBDuration = id.b(ComposablesKt.getCurrentCompositeKeyHashCode(composer, 0));
            CompositionLocalMap currentCompositionLocalMapDuration = composer.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifierDuration = ComposedModifierKt.materializeModifier(composer, modifierM1003paddingqDBjuR0$defaultDuration);
            Function0<ComposeUiNode> constructorDuration = companion6.getConstructor();
            if (!id.n(composer.getApplier())) {
                ComposablesKt.invalidApplier();
            }
            composer.startReusableNode();
            if (composer.getInserting()) {
                composer.createNode(constructorDuration);
            } else {
                composer.useNode();
            }
            Composer composerM4318constructorimplDuration = Updater.m4318constructorimpl(composer);
            mr.z(companion6, composerM4318constructorimplDuration, measurePolicyRowMeasurePolicyDuration, composerM4318constructorimplDuration, currentCompositionLocalMapDuration);
            Updater.m4326setimpl(composerM4318constructorimplDuration, modifierMaterializeModifierDuration, (Function2<? super T, ? super Modifier, Unit>) id.h(companion6, composerM4318constructorimplDuration, Integer.valueOf(iBDuration), composerM4318constructorimplDuration));
            RowScopeInstance rowScopeInstanceDuration = RowScopeInstance.INSTANCE;
            TextKt.m3048TextNvy7gAk("播放时长常驻", null, companion4.m5189getWhite0d7_KjU(), null, TextUnitKt.getSp(15), null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, composer, 24966, 0, 262122);
            composer.endNode();
            SystemDurationDisplayMode systemDurationDisplayMode = (SystemDurationDisplayMode) mutableStateDuration.getValue();
            boolean zChangedDuration = composer.changed(mutableStateDuration);
            Object objRememberedValueDuration = composer.rememberedValue();
            if (zChangedDuration || objRememberedValueDuration == Composer.INSTANCE.getEmpty()) {
                objRememberedValueDuration = new p21(22, mutableStateDuration);
                composer.updateRememberedValue(objRememberedValueDuration);
            }
            F(systemDurationDisplayMode, (Function1) objRememberedValueDuration, composer, 0);
            SpacerKt.Spacer(SizeKt.m1050height3ABfNKs(companion3, Dp.m7813constructorimpl(12.0f)), composer, 6);
            Alignment.Vertical centerVertically2 = companion5.getCenterVertically();
            Modifier modifierM1003paddingqDBjuR0$default2 = PaddingKt.m1003paddingqDBjuR0$default(companion3, 0.0f, 0.0f, 0.0f, Dp.m7813constructorimpl(6.0f), 7, null);
            MeasurePolicy measurePolicyRowMeasurePolicy2 = RowKt.rowMeasurePolicy(arrangement.getStart(), centerVertically2, composer, 48);
            int iB4 = id.b(ComposablesKt.getCurrentCompositeKeyHashCode(composer, 0));
            CompositionLocalMap currentCompositionLocalMap4 = composer.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier4 = ComposedModifierKt.materializeModifier(composer, modifierM1003paddingqDBjuR0$default2);
            Function0<ComposeUiNode> constructor4 = companion6.getConstructor();
            if (!id.n(composer.getApplier())) {
                ComposablesKt.invalidApplier();
            }
            composer.startReusableNode();
            if (composer.getInserting()) {
                composer.createNode(constructor4);
            } else {
                composer.useNode();
            }
            Composer composerM4318constructorimpl4 = Updater.m4318constructorimpl(composer);
            mr.z(companion6, composerM4318constructorimpl4, measurePolicyRowMeasurePolicy2, composerM4318constructorimpl4, currentCompositionLocalMap4);
            Updater.m4326setimpl(composerM4318constructorimpl4, modifierMaterializeModifier4, (Function2<? super T, ? super Modifier, Unit>) id.h(companion6, composerM4318constructorimpl4, Integer.valueOf(iB4), composerM4318constructorimpl4));
            TextKt.m3048TextNvy7gAk("系统网速", null, companion4.m5189getWhite0d7_KjU(), null, TextUnitKt.getSp(15), null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, composer, 24966, 0, 262122);
            composer.endNode();
            SystemNetworkSpeedDisplayMode systemNetworkSpeedDisplayModeK = k(mutableState2);
            boolean zChanged2 = composer.changed(mutableState2);
            Object objRememberedValue2 = composer.rememberedValue();
            if (zChanged2 || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                objRememberedValue2 = new p21(17, mutableState2);
                composer.updateRememberedValue(objRememberedValue2);
            }
            C(systemNetworkSpeedDisplayModeK, (Function1) objRememberedValue2, composer, 0);
            SpacerKt.Spacer(SizeKt.m1050height3ABfNKs(companion3, Dp.m7813constructorimpl(10.0f)), composer, 6);
            Alignment.Vertical centerVertically3 = companion5.getCenterVertically();
            Modifier modifierM1003paddingqDBjuR0$default3 = PaddingKt.m1003paddingqDBjuR0$default(companion3, 0.0f, 0.0f, 0.0f, Dp.m7813constructorimpl(6.0f), 7, null);
            MeasurePolicy measurePolicyRowMeasurePolicy3 = RowKt.rowMeasurePolicy(arrangement.getStart(), centerVertically3, composer, 48);
            int iB5 = id.b(ComposablesKt.getCurrentCompositeKeyHashCode(composer, 0));
            CompositionLocalMap currentCompositionLocalMap5 = composer.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier5 = ComposedModifierKt.materializeModifier(composer, modifierM1003paddingqDBjuR0$default3);
            Function0<ComposeUiNode> constructor5 = companion6.getConstructor();
            if (!id.n(composer.getApplier())) {
                ComposablesKt.invalidApplier();
            }
            composer.startReusableNode();
            if (composer.getInserting()) {
                composer.createNode(constructor5);
            } else {
                composer.useNode();
            }
            Composer composerM4318constructorimpl5 = Updater.m4318constructorimpl(composer);
            mr.z(companion6, composerM4318constructorimpl5, measurePolicyRowMeasurePolicy3, composerM4318constructorimpl5, currentCompositionLocalMap5);
            Updater.m4326setimpl(composerM4318constructorimpl5, modifierMaterializeModifier5, (Function2<? super T, ? super Modifier, Unit>) id.h(companion6, composerM4318constructorimpl5, Integer.valueOf(iB5), composerM4318constructorimpl5));
            TextKt.m3048TextNvy7gAk("网速位置", null, companion4.m5189getWhite0d7_KjU(), null, TextUnitKt.getSp(15), null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, composer, 24966, 0, 262122);
            composer.endNode();
            SystemNetworkSpeedPosition systemNetworkSpeedPositionL = l(mutableState3);
            boolean zChanged3 = composer.changed(mutableState3);
            Object objRememberedValue3 = composer.rememberedValue();
            if (zChanged3 || objRememberedValue3 == Composer.INSTANCE.getEmpty()) {
                objRememberedValue3 = new p21(18, mutableState3);
                composer.updateRememberedValue(objRememberedValue3);
            }
            D(systemNetworkSpeedPositionL, (Function1) objRememberedValue3, composer, 0);
            SpacerKt.Spacer(SizeKt.m1050height3ABfNKs(companion3, Dp.m7813constructorimpl(12.0f)), composer, 6);
            Alignment.Vertical centerVertically4 = companion5.getCenterVertically();
            Modifier modifierM1003paddingqDBjuR0$default4 = PaddingKt.m1003paddingqDBjuR0$default(companion3, 0.0f, 0.0f, 0.0f, Dp.m7813constructorimpl(6.0f), 7, null);
            MeasurePolicy measurePolicyRowMeasurePolicy4 = RowKt.rowMeasurePolicy(arrangement.getStart(), centerVertically4, composer, 48);
            int iB6 = id.b(ComposablesKt.getCurrentCompositeKeyHashCode(composer, 0));
            CompositionLocalMap currentCompositionLocalMap6 = composer.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier6 = ComposedModifierKt.materializeModifier(composer, modifierM1003paddingqDBjuR0$default4);
            Function0<ComposeUiNode> constructor6 = companion6.getConstructor();
            if (!id.n(composer.getApplier())) {
                ComposablesKt.invalidApplier();
            }
            composer.startReusableNode();
            if (composer.getInserting()) {
                composer.createNode(constructor6);
            } else {
                composer.useNode();
            }
            Composer composerM4318constructorimpl6 = Updater.m4318constructorimpl(composer);
            mr.z(companion6, composerM4318constructorimpl6, measurePolicyRowMeasurePolicy4, composerM4318constructorimpl6, currentCompositionLocalMap6);
            Updater.m4326setimpl(composerM4318constructorimpl6, modifierMaterializeModifier6, (Function2<? super T, ? super Modifier, Unit>) id.h(companion6, composerM4318constructorimpl6, Integer.valueOf(iB6), composerM4318constructorimpl6));
            TextKt.m3048TextNvy7gAk("快进/快退间隔", null, companion4.m5189getWhite0d7_KjU(), null, TextUnitKt.getSp(15), null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, composer, 24966, 0, 262122);
            TextKt.m3048TextNvy7gAk("（范围 5-60 秒，步长 5 秒，默认 10 秒）", PaddingKt.m1003paddingqDBjuR0$default(companion3, Dp.m7813constructorimpl(8.0f), 0.0f, 0.0f, 0.0f, 14, null), companion4.m5182getGray0d7_KjU(), null, TextUnitKt.getSp(12), null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, composer, 25014, 0, 262120);
            composer.endNode();
            int iN = n(mutableIntState);
            boolean zChanged4 = composer.changed(mutableIntState);
            Object objRememberedValue4 = composer.rememberedValue();
            if (zChanged4 || objRememberedValue4 == Composer.INSTANCE.getEmpty()) {
                objRememberedValue4 = new sy(mutableIntState, 4);
                composer.updateRememberedValue(objRememberedValue4);
            }
            w((Function1) objRememberedValue4, iN, composer, 0);
            SpacerKt.Spacer(SizeKt.m1050height3ABfNKs(companion3, Dp.m7813constructorimpl(14.0f)), composer, 6);
            Alignment.Vertical centerVertically5 = companion5.getCenterVertically();
            Modifier modifierM1003paddingqDBjuR0$default5 = PaddingKt.m1003paddingqDBjuR0$default(companion3, 0.0f, 0.0f, 0.0f, Dp.m7813constructorimpl(6.0f), 7, null);
            MeasurePolicy measurePolicyRowMeasurePolicy5 = RowKt.rowMeasurePolicy(arrangement.getStart(), centerVertically5, composer, 48);
            int iB7 = id.b(ComposablesKt.getCurrentCompositeKeyHashCode(composer, 0));
            CompositionLocalMap currentCompositionLocalMap7 = composer.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier7 = ComposedModifierKt.materializeModifier(composer, modifierM1003paddingqDBjuR0$default5);
            Function0<ComposeUiNode> constructor7 = companion6.getConstructor();
            if (!id.n(composer.getApplier())) {
                ComposablesKt.invalidApplier();
            }
            composer.startReusableNode();
            if (composer.getInserting()) {
                composer.createNode(constructor7);
            } else {
                composer.useNode();
            }
            Composer composerM4318constructorimpl7 = Updater.m4318constructorimpl(composer);
            mr.z(companion6, composerM4318constructorimpl7, measurePolicyRowMeasurePolicy5, composerM4318constructorimpl7, currentCompositionLocalMap7);
            Updater.m4326setimpl(composerM4318constructorimpl7, modifierMaterializeModifier7, (Function2<? super T, ? super Modifier, Unit>) id.h(companion6, composerM4318constructorimpl7, Integer.valueOf(iB7), composerM4318constructorimpl7));
            TextKt.m3048TextNvy7gAk("音频偏移", null, companion4.m5189getWhite0d7_KjU(), null, TextUnitKt.getSp(15), null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, composer, 24966, 0, 262122);
            TextKt.m3048TextNvy7gAk("（+延后，-提前，步长 0.1 秒，默认 0）", PaddingKt.m1003paddingqDBjuR0$default(companion3, Dp.m7813constructorimpl(8.0f), 0.0f, 0.0f, 0.0f, 14, null), companion4.m5182getGray0d7_KjU(), null, TextUnitKt.getSp(12), null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, composer, 25014, 0, 262120);
            composer.endNode();
            int intValue = mutableIntState2.getIntValue();
            boolean zChanged5 = composer.changed(mutableIntState2);
            Object objRememberedValue5 = composer.rememberedValue();
            if (zChanged5 || objRememberedValue5 == Composer.INSTANCE.getEmpty()) {
                objRememberedValue5 = new sy(mutableIntState2, 5);
                composer.updateRememberedValue(objRememberedValue5);
            }
            a((Function1) objRememberedValue5, intValue, composer, 0);
            if (mutableIntState2.getIntValue() != 0) {
                composer.startReplaceGroup(-1975949252);
                SpacerKt.Spacer(SizeKt.m1050height3ABfNKs(companion3, Dp.m7813constructorimpl(8.0f)), composer, 6);
                TextKt.m3048TextNvy7gAk("非 0 偏移已启用：播放时会临时关闭音频直通，改为解码输出，功放可能不再显示原始杜比/DTS。", PaddingKt.m1000paddingVpY3zN4(kb0.v(8.0f, SizeKt.fillMaxWidth$default(companion3, 0.0f, 1, null), ColorKt.Color(4280953386L)), Dp.m7813constructorimpl(12.0f), Dp.m7813constructorimpl(10.0f)), Color.m5151copywmQWz5c$default(companion4.m5189getWhite0d7_KjU(), 0.82f, 0.0f, 0.0f, 0.0f, 14, null), null, TextUnitKt.getSp(12), null, null, null, 0L, null, null, TextUnitKt.getSp(18), 0, false, 0, 0, null, null, composer, 24966, 48, 260072);
                composer.endReplaceGroup();
            } else {
                composer.startReplaceGroup(-1975258293);
                composer.endReplaceGroup();
            }
            SpacerKt.Spacer(SizeKt.m1050height3ABfNKs(companion3, Dp.m7813constructorimpl(14.0f)), composer, 6);
            Alignment.Vertical centerVertically6 = companion5.getCenterVertically();
            Modifier modifierM1003paddingqDBjuR0$default6 = PaddingKt.m1003paddingqDBjuR0$default(companion3, 0.0f, 0.0f, 0.0f, Dp.m7813constructorimpl(6.0f), 7, null);
            MeasurePolicy measurePolicyRowMeasurePolicy6 = RowKt.rowMeasurePolicy(arrangement.getStart(), centerVertically6, composer, 48);
            int iB8 = id.b(ComposablesKt.getCurrentCompositeKeyHashCode(composer, 0));
            CompositionLocalMap currentCompositionLocalMap8 = composer.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier8 = ComposedModifierKt.materializeModifier(composer, modifierM1003paddingqDBjuR0$default6);
            Function0<ComposeUiNode> constructor8 = companion6.getConstructor();
            if (!id.n(composer.getApplier())) {
                ComposablesKt.invalidApplier();
            }
            composer.startReusableNode();
            if (composer.getInserting()) {
                composer.createNode(constructor8);
            } else {
                composer.useNode();
            }
            Composer composerM4318constructorimpl8 = Updater.m4318constructorimpl(composer);
            mr.z(companion6, composerM4318constructorimpl8, measurePolicyRowMeasurePolicy6, composerM4318constructorimpl8, currentCompositionLocalMap8);
            Updater.m4326setimpl(composerM4318constructorimpl8, modifierMaterializeModifier8, (Function2<? super T, ? super Modifier, Unit>) id.h(companion6, composerM4318constructorimpl8, Integer.valueOf(iB8), composerM4318constructorimpl8));
            TextKt.m3048TextNvy7gAk("全屏方式", null, companion4.m5189getWhite0d7_KjU(), null, TextUnitKt.getSp(15), null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, composer, 24966, 0, 262122);
            TextKt.m3048TextNvy7gAk("（默认保留比例，拉伸会变形，裁切会放大并裁边）", PaddingKt.m1003paddingqDBjuR0$default(companion3, Dp.m7813constructorimpl(8.0f), 0.0f, 0.0f, 0.0f, 14, null), companion4.m5182getGray0d7_KjU(), null, TextUnitKt.getSp(12), null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, composer, 25014, 0, 262120);
            composer.endNode();
            PlayerResizeMode playerResizeMode = (PlayerResizeMode) mutableState4.getValue();
            boolean zChanged6 = composer.changed(mutableState4);
            Object objRememberedValue6 = composer.rememberedValue();
            if (zChanged6 || objRememberedValue6 == Composer.INSTANCE.getEmpty()) {
                objRememberedValue6 = new p21(21, mutableState4);
                composer.updateRememberedValue(objRememberedValue6);
            }
            t(playerResizeMode, (Function1) objRememberedValue6, composer, 0);
            SpacerKt.Spacer(SizeKt.m1050height3ABfNKs(companion3, Dp.m7813constructorimpl(10.0f)), composer, 6);
            TextKt.m3048TextNvy7gAk(((PlayerResizeMode) mutableState4.getValue()).getDescription(), PaddingKt.m1000paddingVpY3zN4(kb0.v(8.0f, SizeKt.fillMaxWidth$default(companion3, 0.0f, 1, null), ColorKt.Color(4280953386L)), Dp.m7813constructorimpl(12.0f), Dp.m7813constructorimpl(10.0f)), Color.m5151copywmQWz5c$default(companion4.m5189getWhite0d7_KjU(), 0.82f, 0.0f, 0.0f, 0.0f, 14, null), null, TextUnitKt.getSp(12), null, null, null, 0L, null, null, TextUnitKt.getSp(18), 0, false, 0, 0, null, null, composer, 24960, 48, 260072);
            Composer composer2 = composer;
            if (((PlayerResizeMode) mutableState4.getValue()) == PlayerResizeMode.DEFAULT) {
                composer2.startReplaceGroup(-1973642046);
                SpacerKt.Spacer(SizeKt.m1050height3ABfNKs(companion3, Dp.m7813constructorimpl(14.0f)), composer2, 6);
                Alignment.Vertical centerVertically7 = companion5.getCenterVertically();
                Modifier modifierM1003paddingqDBjuR0$default7 = PaddingKt.m1003paddingqDBjuR0$default(companion3, 0.0f, 0.0f, 0.0f, Dp.m7813constructorimpl(6.0f), 7, null);
                companion = companion3;
                MeasurePolicy measurePolicyRowMeasurePolicy7 = RowKt.rowMeasurePolicy(arrangement.getStart(), centerVertically7, composer2, 48);
                int iB9 = id.b(ComposablesKt.getCurrentCompositeKeyHashCode(composer2, 0));
                CompositionLocalMap currentCompositionLocalMap9 = composer2.getCurrentCompositionLocalMap();
                Modifier modifierMaterializeModifier9 = ComposedModifierKt.materializeModifier(composer2, modifierM1003paddingqDBjuR0$default7);
                Function0<ComposeUiNode> constructor9 = companion6.getConstructor();
                if (!id.n(composer2.getApplier())) {
                    ComposablesKt.invalidApplier();
                }
                composer2.startReusableNode();
                if (composer2.getInserting()) {
                    composer2.createNode(constructor9);
                } else {
                    composer2.useNode();
                }
                Composer composerM4318constructorimpl9 = Updater.m4318constructorimpl(composer2);
                mr.z(companion6, composerM4318constructorimpl9, measurePolicyRowMeasurePolicy7, composerM4318constructorimpl9, currentCompositionLocalMap9);
                Updater.m4326setimpl(composerM4318constructorimpl9, modifierMaterializeModifier9, (Function2<? super T, ? super Modifier, Unit>) id.h(companion6, composerM4318constructorimpl9, Integer.valueOf(iB9), composerM4318constructorimpl9));
                TextKt.m3048TextNvy7gAk("默认模式渲染", null, companion4.m5189getWhite0d7_KjU(), null, TextUnitKt.getSp(15), null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, composer2, 24966, 0, 262122);
                TextKt.m3048TextNvy7gAk("（仅在全屏方式为默认时生效）", PaddingKt.m1003paddingqDBjuR0$default(companion, Dp.m7813constructorimpl(8.0f), 0.0f, 0.0f, 0.0f, 14, null), companion4.m5182getGray0d7_KjU(), null, TextUnitKt.getSp(12), null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, composer, 25014, 0, 262120);
                composer.endNode();
                PlayerDefaultViewMode playerDefaultViewMode = (PlayerDefaultViewMode) mutableState5.getValue();
                boolean zChanged7 = composer.changed(mutableState5);
                Object objRememberedValue7 = composer.rememberedValue();
                if (zChanged7 || objRememberedValue7 == Composer.INSTANCE.getEmpty()) {
                    objRememberedValue7 = new p21(23, mutableState5);
                    composer.updateRememberedValue(objRememberedValue7);
                }
                r(playerDefaultViewMode, (Function1) objRememberedValue7, composer, 0);
                SpacerKt.Spacer(SizeKt.m1050height3ABfNKs(companion, Dp.m7813constructorimpl(10.0f)), composer, 6);
                TextKt.m3048TextNvy7gAk(((PlayerDefaultViewMode) mutableState5.getValue()).getDescription(), PaddingKt.m1000paddingVpY3zN4(kb0.v(8.0f, SizeKt.fillMaxWidth$default(companion, 0.0f, 1, null), ColorKt.Color(4280953386L)), Dp.m7813constructorimpl(12.0f), Dp.m7813constructorimpl(10.0f)), Color.m5151copywmQWz5c$default(companion4.m5189getWhite0d7_KjU(), 0.82f, 0.0f, 0.0f, 0.0f, 14, null), null, TextUnitKt.getSp(12), null, null, null, 0L, null, null, TextUnitKt.getSp(18), 0, false, 0, 0, null, null, composer, 24960, 48, 260072);
                composer2 = composer;
                composer2.endReplaceGroup();
            } else {
                companion = companion3;
                composer2.startReplaceGroup(-1972034293);
                composer2.endReplaceGroup();
            }
            SpacerKt.Spacer(SizeKt.m1050height3ABfNKs(companion, Dp.m7813constructorimpl(14.0f)), composer2, 6);
            Alignment.Vertical centerVertically8 = companion5.getCenterVertically();
            Modifier.Companion companion7 = companion;
            Modifier modifierM1003paddingqDBjuR0$default8 = PaddingKt.m1003paddingqDBjuR0$default(companion7, 0.0f, 0.0f, 0.0f, Dp.m7813constructorimpl(6.0f), 7, null);
            MeasurePolicy measurePolicyRowMeasurePolicy8 = RowKt.rowMeasurePolicy(arrangement.getStart(), centerVertically8, composer2, 48);
            int iB10 = id.b(ComposablesKt.getCurrentCompositeKeyHashCode(composer2, 0));
            CompositionLocalMap currentCompositionLocalMap10 = composer2.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier10 = ComposedModifierKt.materializeModifier(composer2, modifierM1003paddingqDBjuR0$default8);
            Function0<ComposeUiNode> constructor10 = companion6.getConstructor();
            if (!id.n(composer2.getApplier())) {
                ComposablesKt.invalidApplier();
            }
            composer2.startReusableNode();
            if (composer2.getInserting()) {
                composer2.createNode(constructor10);
            } else {
                composer2.useNode();
            }
            Composer composerM4318constructorimpl10 = Updater.m4318constructorimpl(composer2);
            mr.z(companion6, composerM4318constructorimpl10, measurePolicyRowMeasurePolicy8, composerM4318constructorimpl10, currentCompositionLocalMap10);
            Updater.m4326setimpl(composerM4318constructorimpl10, modifierMaterializeModifier10, (Function2<? super T, ? super Modifier, Unit>) id.h(companion6, composerM4318constructorimpl10, Integer.valueOf(iB10), composerM4318constructorimpl10));
            TextKt.m3048TextNvy7gAk("自动匹配帧率", null, companion4.m5189getWhite0d7_KjU(), null, TextUnitKt.getSp(15), null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, composer2, 24966, 0, 262122);
            TextKt.m3048TextNvy7gAk("（积极匹配会优先按视频帧率显示，电视可能会黑屏1-2秒）", PaddingKt.m1003paddingqDBjuR0$default(companion7, Dp.m7813constructorimpl(8.0f), 0.0f, 0.0f, 0.0f, 14, null), companion4.m5182getGray0d7_KjU(), null, TextUnitKt.getSp(12), null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, composer, 25014, 0, 262120);
            composer.endNode();
            PlayerFrameRateMatchingMode playerFrameRateMatchingModeO = o(mutableState6);
            boolean zChanged8 = composer.changed(mutableState6);
            Object objRememberedValue8 = composer.rememberedValue();
            if (zChanged8 || objRememberedValue8 == Composer.INSTANCE.getEmpty()) {
                objRememberedValue8 = new p21(28, mutableState6);
                composer.updateRememberedValue(objRememberedValue8);
            }
            s(playerFrameRateMatchingModeO, (Function1) objRememberedValue8, composer, 0);
            SpacerKt.Spacer(SizeKt.m1050height3ABfNKs(companion7, Dp.m7813constructorimpl(14.0f)), composer, 6);
            Alignment.Vertical centerVertically9 = companion5.getCenterVertically();
            Modifier modifierM1003paddingqDBjuR0$default9 = PaddingKt.m1003paddingqDBjuR0$default(companion7, 0.0f, 0.0f, 0.0f, Dp.m7813constructorimpl(6.0f), 7, null);
            MeasurePolicy measurePolicyRowMeasurePolicy9 = RowKt.rowMeasurePolicy(arrangement.getStart(), centerVertically9, composer, 48);
            int iB11 = id.b(ComposablesKt.getCurrentCompositeKeyHashCode(composer, 0));
            CompositionLocalMap currentCompositionLocalMap11 = composer.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier11 = ComposedModifierKt.materializeModifier(composer, modifierM1003paddingqDBjuR0$default9);
            Function0<ComposeUiNode> constructor11 = companion6.getConstructor();
            if (!id.n(composer.getApplier())) {
                ComposablesKt.invalidApplier();
            }
            composer.startReusableNode();
            if (composer.getInserting()) {
                composer.createNode(constructor11);
            } else {
                composer.useNode();
            }
            Composer composerM4318constructorimpl11 = Updater.m4318constructorimpl(composer);
            mr.z(companion6, composerM4318constructorimpl11, measurePolicyRowMeasurePolicy9, composerM4318constructorimpl11, currentCompositionLocalMap11);
            Updater.m4326setimpl(composerM4318constructorimpl11, modifierMaterializeModifier11, (Function2<? super T, ? super Modifier, Unit>) id.h(companion6, composerM4318constructorimpl11, Integer.valueOf(iB11), composerM4318constructorimpl11));
            TextKt.m3048TextNvy7gAk("视频优先级调整", null, companion4.m5189getWhite0d7_KjU(), null, TextUnitKt.getSp(15), null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, composer, 24966, 0, 262122);
            TextKt.m3048TextNvy7gAk("（先选排序类型，再调整该类型的顺序）", PaddingKt.m1003paddingqDBjuR0$default(companion7, Dp.m7813constructorimpl(8.0f), 0.0f, 0.0f, 0.0f, 14, null), companion4.m5182getGray0d7_KjU(), null, TextUnitKt.getSp(12), null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, composer, 25014, 0, 262120);
            composer.endNode();
            VideoVersionPrioritySettings videoVersionPrioritySettings = (VideoVersionPrioritySettings) mutableState7.getValue();
            boolean zChanged9 = composer.changed(mutableState7);
            Object objRememberedValue9 = composer.rememberedValue();
            if (zChanged9 || objRememberedValue9 == Composer.INSTANCE.getEmpty()) {
                i2 = 0;
                objRememberedValue9 = new ub1(0, mutableState7);
                composer.updateRememberedValue(objRememberedValue9);
            } else {
                i2 = 0;
            }
            J(videoVersionPrioritySettings, (Function1) objRememberedValue9, composer, i2);
            SpacerKt.Spacer(SizeKt.m1050height3ABfNKs(companion7, Dp.m7813constructorimpl(10.0f)), composer, 6);
            TextKt.m3048TextNvy7gAk(((VideoVersionPrioritySettings) mutableState7.getValue()).buildPreviewText(), PaddingKt.m1000paddingVpY3zN4(kb0.v(8.0f, SizeKt.fillMaxWidth$default(companion7, 0.0f, 1, null), ColorKt.Color(4280953386L)), Dp.m7813constructorimpl(12.0f), Dp.m7813constructorimpl(10.0f)), Color.m5151copywmQWz5c$default(companion4.m5189getWhite0d7_KjU(), 0.82f, 0.0f, 0.0f, 0.0f, 14, null), null, TextUnitKt.getSp(12), null, null, null, 0L, null, null, TextUnitKt.getSp(18), 0, false, 0, 0, null, null, composer, 24960, 48, 260072);
            SpacerKt.Spacer(SizeKt.m1050height3ABfNKs(companion7, Dp.m7813constructorimpl(14.0f)), composer, 6);
            Alignment.Vertical centerVertically10 = companion5.getCenterVertically();
            Modifier modifierM1003paddingqDBjuR0$default10 = PaddingKt.m1003paddingqDBjuR0$default(companion7, 0.0f, 0.0f, 0.0f, Dp.m7813constructorimpl(6.0f), 7, null);
            MeasurePolicy measurePolicyRowMeasurePolicy10 = RowKt.rowMeasurePolicy(arrangement.getStart(), centerVertically10, composer, 48);
            int iB12 = id.b(ComposablesKt.getCurrentCompositeKeyHashCode(composer, 0));
            CompositionLocalMap currentCompositionLocalMap12 = composer.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier12 = ComposedModifierKt.materializeModifier(composer, modifierM1003paddingqDBjuR0$default10);
            Function0<ComposeUiNode> constructor12 = companion6.getConstructor();
            if (!id.n(composer.getApplier())) {
                ComposablesKt.invalidApplier();
            }
            composer.startReusableNode();
            if (composer.getInserting()) {
                composer.createNode(constructor12);
            } else {
                composer.useNode();
            }
            Composer composerM4318constructorimpl12 = Updater.m4318constructorimpl(composer);
            mr.z(companion6, composerM4318constructorimpl12, measurePolicyRowMeasurePolicy10, composerM4318constructorimpl12, currentCompositionLocalMap12);
            Updater.m4326setimpl(composerM4318constructorimpl12, modifierMaterializeModifier12, (Function2<? super T, ? super Modifier, Unit>) id.h(companion6, composerM4318constructorimpl12, Integer.valueOf(iB12), composerM4318constructorimpl12));
            TextKt.m3048TextNvy7gAk("音频优先级调整", null, companion4.m5189getWhite0d7_KjU(), null, TextUnitKt.getSp(15), null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, composer, 24966, 0, 262122);
            TextKt.m3048TextNvy7gAk("（先选排序类型，再调整该类型的顺序）", PaddingKt.m1003paddingqDBjuR0$default(companion7, Dp.m7813constructorimpl(8.0f), 0.0f, 0.0f, 0.0f, 14, null), companion4.m5182getGray0d7_KjU(), null, TextUnitKt.getSp(12), null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, composer, 25014, 0, 262120);
            composer.endNode();
            AudioVersionPrioritySettings audioVersionPrioritySettings = (AudioVersionPrioritySettings) mutableState8.getValue();
            boolean zChanged10 = composer.changed(mutableState8);
            Object objRememberedValue10 = composer.rememberedValue();
            if (zChanged10 || objRememberedValue10 == Composer.INSTANCE.getEmpty()) {
                objRememberedValue10 = new ub1(2, mutableState8);
                composer.updateRememberedValue(objRememberedValue10);
            }
            g(audioVersionPrioritySettings, (Function1) objRememberedValue10, composer, 0);
            SpacerKt.Spacer(SizeKt.m1050height3ABfNKs(companion7, Dp.m7813constructorimpl(10.0f)), composer, 6);
            TextKt.m3048TextNvy7gAk(((AudioVersionPrioritySettings) mutableState8.getValue()).buildPreviewText(), PaddingKt.m1000paddingVpY3zN4(kb0.v(8.0f, SizeKt.fillMaxWidth$default(companion7, 0.0f, 1, null), ColorKt.Color(4280953386L)), Dp.m7813constructorimpl(12.0f), Dp.m7813constructorimpl(10.0f)), Color.m5151copywmQWz5c$default(companion4.m5189getWhite0d7_KjU(), 0.82f, 0.0f, 0.0f, 0.0f, 14, null), null, TextUnitKt.getSp(12), null, null, null, 0L, null, null, TextUnitKt.getSp(18), 0, false, 0, 0, null, null, composer, 24960, 48, 260072);
            SpacerKt.Spacer(SizeKt.m1050height3ABfNKs(companion7, Dp.m7813constructorimpl(14.0f)), composer, 6);
            Alignment.Vertical centerVertically11 = companion5.getCenterVertically();
            Modifier modifierM1003paddingqDBjuR0$default11 = PaddingKt.m1003paddingqDBjuR0$default(companion7, 0.0f, 0.0f, 0.0f, Dp.m7813constructorimpl(6.0f), 7, null);
            MeasurePolicy measurePolicyRowMeasurePolicy11 = RowKt.rowMeasurePolicy(arrangement.getStart(), centerVertically11, composer, 48);
            int iB13 = id.b(ComposablesKt.getCurrentCompositeKeyHashCode(composer, 0));
            CompositionLocalMap currentCompositionLocalMap13 = composer.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier13 = ComposedModifierKt.materializeModifier(composer, modifierM1003paddingqDBjuR0$default11);
            Function0<ComposeUiNode> constructor13 = companion6.getConstructor();
            if (!id.n(composer.getApplier())) {
                ComposablesKt.invalidApplier();
            }
            composer.startReusableNode();
            if (composer.getInserting()) {
                composer.createNode(constructor13);
            } else {
                composer.useNode();
            }
            Composer composerM4318constructorimpl13 = Updater.m4318constructorimpl(composer);
            mr.z(companion6, composerM4318constructorimpl13, measurePolicyRowMeasurePolicy11, composerM4318constructorimpl13, currentCompositionLocalMap13);
            Updater.m4326setimpl(composerM4318constructorimpl13, modifierMaterializeModifier13, (Function2<? super T, ? super Modifier, Unit>) id.h(companion6, composerM4318constructorimpl13, Integer.valueOf(iB13), composerM4318constructorimpl13));
            TextKt.m3048TextNvy7gAk("字幕优先级调整", null, companion4.m5189getWhite0d7_KjU(), null, TextUnitKt.getSp(15), null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, composer, 24966, 0, 262122);
            TextKt.m3048TextNvy7gAk("（先选排序类型，再调整该类型的顺序）", PaddingKt.m1003paddingqDBjuR0$default(companion7, Dp.m7813constructorimpl(8.0f), 0.0f, 0.0f, 0.0f, 14, null), companion4.m5182getGray0d7_KjU(), null, TextUnitKt.getSp(12), null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, composer, 25014, 0, 262120);
            composer.endNode();
            SubtitleVersionPrioritySettings subtitleVersionPrioritySettings = (SubtitleVersionPrioritySettings) mutableState9.getValue();
            boolean zChanged11 = composer.changed(mutableState9);
            Object objRememberedValue11 = composer.rememberedValue();
            if (zChanged11 || objRememberedValue11 == Composer.INSTANCE.getEmpty()) {
                objRememberedValue11 = new ub1(3, mutableState9);
                composer.updateRememberedValue(objRememberedValue11);
            }
            B(subtitleVersionPrioritySettings, (Function1) objRememberedValue11, composer, 0);
            SpacerKt.Spacer(SizeKt.m1050height3ABfNKs(companion7, Dp.m7813constructorimpl(10.0f)), composer, 6);
            TextKt.m3048TextNvy7gAk(((SubtitleVersionPrioritySettings) mutableState9.getValue()).buildPreviewText(), PaddingKt.m1000paddingVpY3zN4(kb0.v(8.0f, SizeKt.fillMaxWidth$default(companion7, 0.0f, 1, null), ColorKt.Color(4280953386L)), Dp.m7813constructorimpl(12.0f), Dp.m7813constructorimpl(10.0f)), Color.m5151copywmQWz5c$default(companion4.m5189getWhite0d7_KjU(), 0.82f, 0.0f, 0.0f, 0.0f, 14, null), null, TextUnitKt.getSp(12), null, null, null, 0L, null, null, TextUnitKt.getSp(18), 0, false, 0, 0, null, null, composer, 24960, 48, 260072);
            id.i(14.0f, companion7, composer, 6);
            Modifier modifierFillMaxWidth$default = SizeKt.fillMaxWidth$default(companion7, 0.0f, 1, null);
            MeasurePolicy measurePolicyRowMeasurePolicy12 = RowKt.rowMeasurePolicy(arrangement.getEnd(), companion5.getTop(), composer, 6);
            int iB14 = id.b(ComposablesKt.getCurrentCompositeKeyHashCode(composer, 0));
            CompositionLocalMap currentCompositionLocalMap14 = composer.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier14 = ComposedModifierKt.materializeModifier(composer, modifierFillMaxWidth$default);
            Function0<ComposeUiNode> constructor14 = companion6.getConstructor();
            if (!id.n(composer.getApplier())) {
                ComposablesKt.invalidApplier();
            }
            composer.startReusableNode();
            if (composer.getInserting()) {
                composer.createNode(constructor14);
            } else {
                composer.useNode();
            }
            Composer composerM4318constructorimpl14 = Updater.m4318constructorimpl(composer);
            mr.z(companion6, composerM4318constructorimpl14, measurePolicyRowMeasurePolicy12, composerM4318constructorimpl14, currentCompositionLocalMap14);
            Updater.m4326setimpl(composerM4318constructorimpl14, modifierMaterializeModifier14, (Function2<? super T, ? super Modifier, Unit>) id.h(companion6, composerM4318constructorimpl14, Integer.valueOf(iB14), composerM4318constructorimpl14));
            Modifier modifierThen = ScaleKt.scale(companion7, q(state)).then(((Boolean) mutableState10.getValue()).booleanValue() ? BorderKt.m286borderxT4_qwU(companion7, Dp.m7813constructorimpl(2.0f), companion4.m5189getWhite0d7_KjU(), RoundedCornerShapeKt.RoundedCornerShape(50)) : companion7);
            MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy2 = BoxKt.maybeCachedBoxMeasurePolicy(companion5.getTopStart(), false);
            int iB15 = id.b(ComposablesKt.getCurrentCompositeKeyHashCode(composer, 0));
            CompositionLocalMap currentCompositionLocalMap15 = composer.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier15 = ComposedModifierKt.materializeModifier(composer, modifierThen);
            Function0<ComposeUiNode> constructor15 = companion6.getConstructor();
            if (!id.n(composer.getApplier())) {
                ComposablesKt.invalidApplier();
            }
            composer.startReusableNode();
            if (composer.getInserting()) {
                composer.createNode(constructor15);
            } else {
                composer.useNode();
            }
            Composer composerM4318constructorimpl15 = Updater.m4318constructorimpl(composer);
            mr.z(companion6, composerM4318constructorimpl15, measurePolicyMaybeCachedBoxMeasurePolicy2, composerM4318constructorimpl15, currentCompositionLocalMap15);
            Updater.m4326setimpl(composerM4318constructorimpl15, modifierMaterializeModifier15, (Function2<? super T, ? super Modifier, Unit>) id.h(companion6, composerM4318constructorimpl15, Integer.valueOf(iB15), composerM4318constructorimpl15));
            Object objRememberedValue12 = composer.rememberedValue();
            Composer.Companion companion8 = Composer.INSTANCE;
            if (objRememberedValue12 == companion8.getEmpty()) {
                mutableState12 = mutableState10;
                objRememberedValue12 = new ub1(5, mutableState12);
                composer.updateRememberedValue(objRememberedValue12);
            } else {
                mutableState12 = mutableState10;
            }
            Modifier modifierOnFocusChanged = FocusChangedModifierKt.onFocusChanged(companion7, (Function1) objRememberedValue12);
            ButtonDefaults buttonDefaults = ButtonDefaults.INSTANCE;
            ButtonKt.m8231ButtonTCVpFMg(function0, modifierOnFocusChanged, null, false, ButtonDefaults.scale$default(buttonDefaults, 1.0f, 1.0f, 0.0f, 0.0f, 0.0f, 28, null), null, null, hc2.p(false, composer, 0, 1), 0.0f, null, PaddingKt.m993PaddingValuesYgX7TsA(Dp.m7813constructorimpl(14.0f), Dp.m7813constructorimpl(6.0f)), null, ComposableLambdaKt.rememberComposableLambda(842422966, true, new w91(6, mutableState12), composer, 54), composer, 0, 390, 2924);
            composer.endNode();
            SpacerKt.Spacer(SizeKt.m1069width3ABfNKs(companion7, Dp.m7813constructorimpl(12.0f)), composer, 6);
            Modifier modifierThen2 = ScaleKt.scale(companion7, j(state2)).then(((Boolean) mutableState11.getValue()).booleanValue() ? BorderKt.m286borderxT4_qwU(companion7, Dp.m7813constructorimpl(2.0f), companion4.m5189getWhite0d7_KjU(), RoundedCornerShapeKt.RoundedCornerShape(50)) : companion7);
            MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy3 = BoxKt.maybeCachedBoxMeasurePolicy(companion5.getTopStart(), false);
            int iB16 = id.b(ComposablesKt.getCurrentCompositeKeyHashCode(composer, 0));
            CompositionLocalMap currentCompositionLocalMap16 = composer.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier16 = ComposedModifierKt.materializeModifier(composer, modifierThen2);
            Function0<ComposeUiNode> constructor16 = companion6.getConstructor();
            if (!id.n(composer.getApplier())) {
                ComposablesKt.invalidApplier();
            }
            composer.startReusableNode();
            if (composer.getInserting()) {
                composer.createNode(constructor16);
            } else {
                composer.useNode();
            }
            Composer composerM4318constructorimpl16 = Updater.m4318constructorimpl(composer);
            mr.z(companion6, composerM4318constructorimpl16, measurePolicyMaybeCachedBoxMeasurePolicy3, composerM4318constructorimpl16, currentCompositionLocalMap16);
            Updater.m4326setimpl(composerM4318constructorimpl16, modifierMaterializeModifier16, (Function2<? super T, ? super Modifier, Unit>) id.h(companion6, composerM4318constructorimpl16, Integer.valueOf(iB16), composerM4318constructorimpl16));
            boolean zChanged12 = composer.changed(function11) | composer.changed(mutableState2) | composer.changed(mutableState3) | composer.changed(mutableState) | composer.changed(mutableIntState) | composer.changed(mutableIntState2) | composer.changed(mutableState4) | composer.changed(mutableState5) | composer.changed(mutableState6) | composer.changed(mutableState7) | composer.changed(mutableState8) | composer.changed(mutableState9);
            Object objRememberedValue13 = composer.rememberedValue();
            if (zChanged12 || objRememberedValue13 == companion8.getEmpty()) {
                companion2 = companion7;
                f = 14.0f;
                obj = new Function0() { // from class: nb1
                    /* JADX WARN: Multi-variable type inference failed */
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        function11.invoke((SystemNetworkSpeedDisplayMode) mutableState2.getValue(), (SystemNetworkSpeedPosition) mutableState3.getValue(), (SystemTimeDisplayMode) mutableState.getValue(), Integer.valueOf(mutableIntState.getIntValue()), Integer.valueOf(mutableIntState2.getIntValue()), (PlayerResizeMode) mutableState4.getValue(), (PlayerDefaultViewMode) mutableState5.getValue(), (PlayerFrameRateMatchingMode) mutableState6.getValue(), ((VideoVersionPrioritySettings) mutableState7.getValue()).normalized(), ((AudioVersionPrioritySettings) mutableState8.getValue()).normalized(), ((SubtitleVersionPrioritySettings) mutableState9.getValue()).normalized());
                        return Unit.INSTANCE;
                    }
                };
                composer.updateRememberedValue(obj);
            } else {
                companion2 = companion7;
                obj = objRememberedValue13;
                f = 14.0f;
            }
            Function0 function1 = (Function0) obj;
            Object objRememberedValue14 = composer.rememberedValue();
            if (objRememberedValue14 == companion8.getEmpty()) {
                mutableState13 = mutableState11;
                objRememberedValue14 = new p21(14, mutableState13);
                composer.updateRememberedValue(objRememberedValue14);
            } else {
                mutableState13 = mutableState11;
            }
            ButtonKt.m8231ButtonTCVpFMg(function1, FocusChangedModifierKt.onFocusChanged(companion2, (Function1) objRememberedValue14), null, false, ButtonDefaults.scale$default(buttonDefaults, 1.0f, 1.0f, 0.0f, 0.0f, 0.0f, 28, null), null, null, hc2.m(false, composer, 1), 0.0f, null, PaddingKt.m993PaddingValuesYgX7TsA(Dp.m7813constructorimpl(f), Dp.m7813constructorimpl(6.0f)), null, ComposableLambdaKt.rememberComposableLambda(914052845, true, new w91(7, mutableState13), composer, 54), composer, 0, 390, 2924);
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
        return Unit.INSTANCE;
    }

    public static final float q(State state) {
        return ((Number) state.getValue()).floatValue();
    }

    public static final void r(PlayerDefaultViewMode playerDefaultViewMode, Function1 function1, Composer composer, int i) {
        int i2;
        Composer composerStartRestartGroup = composer.startRestartGroup(2035728628);
        if ((i & 6) == 0) {
            i2 = (composerStartRestartGroup.changed(playerDefaultViewMode.ordinal()) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= composerStartRestartGroup.changedInstance(function1) ? 32 : 16;
        }
        if (composerStartRestartGroup.shouldExecute((i2 & 19) != 18, i2 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(2035728628, i2, -1, "com.dh.myembyapp.ui.components.PlayerDefaultViewModeSelector (OtherSettingsOverlay.kt:630)");
            }
            Modifier modifierFillMaxWidth$default = SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null);
            MeasurePolicy measurePolicyRowMeasurePolicy = RowKt.rowMeasurePolicy(Arrangement.INSTANCE.m712spacedBy0680j_4(Dp.m7813constructorimpl(8.0f)), Alignment.INSTANCE.getTop(), composerStartRestartGroup, 6);
            long currentCompositeKeyHashCode = ComposablesKt.getCurrentCompositeKeyHashCode(composerStartRestartGroup, 0);
            int i3 = (int) (currentCompositeKeyHashCode ^ (currentCompositeKeyHashCode >>> 32));
            CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifierFillMaxWidth$default);
            ComposeUiNode.Companion companion = ComposeUiNode.INSTANCE;
            Function0<ComposeUiNode> constructor = companion.getConstructor();
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
            mr.z(companion, composerM4318constructorimpl, measurePolicyRowMeasurePolicy, composerM4318constructorimpl, currentCompositionLocalMap);
            Updater.m4326setimpl(composerM4318constructorimpl, modifierMaterializeModifier, (Function2<? super T, ? super Modifier, Unit>) id.h(companion, composerM4318constructorimpl, Integer.valueOf(i3), composerM4318constructorimpl));
            RowScopeInstance rowScopeInstance = RowScopeInstance.INSTANCE;
            composerStartRestartGroup.startReplaceGroup(-263811859);
            Iterator<PlayerDefaultViewMode> it = PlayerDefaultViewMode.getEntries().iterator();
            while (it.hasNext()) {
                PlayerDefaultViewMode next = it.next();
                String label = next.getLabel();
                boolean z = playerDefaultViewMode == next;
                boolean zChanged = ((i2 & Input.Keys.FORWARD_DEL) == 32) | composerStartRestartGroup.changed(next.ordinal());
                Object objRememberedValue = composerStartRestartGroup.rememberedValue();
                if (zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                    objRememberedValue = new jx0(14, function1, next);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                }
                h(label, z, (Function0) objRememberedValue, composerStartRestartGroup, 0);
            }
            if (i9.s(composerStartRestartGroup)) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new e81(playerDefaultViewMode, function1, i, 2));
        }
    }

    public static final void s(PlayerFrameRateMatchingMode playerFrameRateMatchingMode, Function1 function1, Composer composer, int i) {
        Composer composerStartRestartGroup = composer.startRestartGroup(73481644);
        int i2 = (i & 6) == 0 ? (composerStartRestartGroup.changed(playerFrameRateMatchingMode.ordinal()) ? 4 : 2) | i : i;
        if ((i & 48) == 0) {
            i2 |= composerStartRestartGroup.changedInstance(function1) ? 32 : 16;
        }
        if (composerStartRestartGroup.shouldExecute((i2 & 19) != 18, i2 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(73481644, i2, -1, "com.dh.myembyapp.ui.components.PlayerFrameRateMatchingModeSelector (OtherSettingsOverlay.kt:611)");
            }
            Modifier modifierFillMaxWidth$default = SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null);
            MeasurePolicy measurePolicyRowMeasurePolicy = RowKt.rowMeasurePolicy(Arrangement.INSTANCE.m712spacedBy0680j_4(Dp.m7813constructorimpl(8.0f)), Alignment.INSTANCE.getTop(), composerStartRestartGroup, 6);
            long currentCompositeKeyHashCode = ComposablesKt.getCurrentCompositeKeyHashCode(composerStartRestartGroup, 0);
            int i3 = (int) (currentCompositeKeyHashCode ^ (currentCompositeKeyHashCode >>> 32));
            CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifierFillMaxWidth$default);
            ComposeUiNode.Companion companion = ComposeUiNode.INSTANCE;
            Function0<ComposeUiNode> constructor = companion.getConstructor();
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
            mr.z(companion, composerM4318constructorimpl, measurePolicyRowMeasurePolicy, composerM4318constructorimpl, currentCompositionLocalMap);
            Updater.m4326setimpl(composerM4318constructorimpl, modifierMaterializeModifier, (Function2<? super T, ? super Modifier, Unit>) id.h(companion, composerM4318constructorimpl, Integer.valueOf(i3), composerM4318constructorimpl));
            RowScopeInstance rowScopeInstance = RowScopeInstance.INSTANCE;
            composerStartRestartGroup.startReplaceGroup(-1991970171);
            PlayerFrameRateMatchingMode[] playerFrameRateMatchingModeArrValues = PlayerFrameRateMatchingMode.values();
            int length = playerFrameRateMatchingModeArrValues.length;
            for (int i4 = 0; i4 < length; i4++) {
                PlayerFrameRateMatchingMode playerFrameRateMatchingMode2 = playerFrameRateMatchingModeArrValues[i4];
                String label = playerFrameRateMatchingMode2.getLabel();
                boolean z = playerFrameRateMatchingMode == playerFrameRateMatchingMode2;
                boolean zChanged = ((i2 & Input.Keys.FORWARD_DEL) == 32) | composerStartRestartGroup.changed(playerFrameRateMatchingMode2.ordinal());
                Object objRememberedValue = composerStartRestartGroup.rememberedValue();
                if (zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                    objRememberedValue = new jx0(17, function1, playerFrameRateMatchingMode2);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                }
                h(label, z, (Function0) objRememberedValue, composerStartRestartGroup, 0);
            }
            if (i9.s(composerStartRestartGroup)) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new e81(playerFrameRateMatchingMode, function1, i, 5));
        }
    }

    public static final void t(PlayerResizeMode playerResizeMode, Function1 function1, Composer composer, int i) {
        int i2;
        Composer composerStartRestartGroup = composer.startRestartGroup(-1034131758);
        if ((i & 6) == 0) {
            i2 = (composerStartRestartGroup.changed(playerResizeMode.ordinal()) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        int i3 = 16;
        int i4 = 32;
        if ((i & 48) == 0) {
            i2 |= composerStartRestartGroup.changedInstance(function1) ? 32 : 16;
        }
        boolean z = true;
        if (composerStartRestartGroup.shouldExecute((i2 & 19) != 18, i2 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1034131758, i2, -1, "com.dh.myembyapp.ui.components.PlayerResizeModeSelector (OtherSettingsOverlay.kt:649)");
            }
            Modifier modifierFillMaxWidth$default = SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null);
            MeasurePolicy measurePolicyRowMeasurePolicy = RowKt.rowMeasurePolicy(Arrangement.INSTANCE.m712spacedBy0680j_4(Dp.m7813constructorimpl(8.0f)), Alignment.INSTANCE.getTop(), composerStartRestartGroup, 6);
            long currentCompositeKeyHashCode = ComposablesKt.getCurrentCompositeKeyHashCode(composerStartRestartGroup, 0);
            int i5 = (int) (currentCompositeKeyHashCode ^ (currentCompositeKeyHashCode >>> 32));
            CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifierFillMaxWidth$default);
            ComposeUiNode.Companion companion = ComposeUiNode.INSTANCE;
            Function0<ComposeUiNode> constructor = companion.getConstructor();
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
            mr.z(companion, composerM4318constructorimpl, measurePolicyRowMeasurePolicy, composerM4318constructorimpl, currentCompositionLocalMap);
            Updater.m4326setimpl(composerM4318constructorimpl, modifierMaterializeModifier, (Function2<? super T, ? super Modifier, Unit>) id.h(companion, composerM4318constructorimpl, Integer.valueOf(i5), composerM4318constructorimpl));
            RowScopeInstance rowScopeInstance = RowScopeInstance.INSTANCE;
            composerStartRestartGroup.startReplaceGroup(653141451);
            PlayerResizeMode[] playerResizeModeArrValues = PlayerResizeMode.values();
            int length = playerResizeModeArrValues.length;
            int i6 = 0;
            while (i6 < length) {
                PlayerResizeMode playerResizeMode2 = playerResizeModeArrValues[i6];
                String label = playerResizeMode2.getLabel();
                boolean z2 = playerResizeMode == playerResizeMode2 ? z : false;
                boolean zChanged = composerStartRestartGroup.changed(playerResizeMode2.ordinal()) | ((i2 & Input.Keys.FORWARD_DEL) == i4);
                Object objRememberedValue = composerStartRestartGroup.rememberedValue();
                if (zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                    objRememberedValue = new jx0(i3, function1, playerResizeMode2);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                }
                h(label, z2, (Function0) objRememberedValue, composerStartRestartGroup, 0);
                i6++;
                i4 = 32;
                z = true;
            }
            if (i9.s(composerStartRestartGroup)) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new e81(playerResizeMode, function1, i, 4));
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void u(final String str, final int i, final int i2, Modifier modifier, final FocusRequester focusRequester, final Function0 function0, Composer composer, final int i3) {
        int i4;
        Composer composer2;
        final Modifier modifier2;
        long primary;
        Composer composerStartRestartGroup = composer.startRestartGroup(-87540474);
        if ((i3 & 6) == 0) {
            i4 = (composerStartRestartGroup.changed(str) ? 4 : 2) | i3;
        } else {
            i4 = i3;
        }
        if ((i3 & 48) == 0) {
            i4 |= composerStartRestartGroup.changed(i) ? 32 : 16;
        }
        if ((i3 & RendererCapabilities.DECODER_SUPPORT_MASK) == 0) {
            i4 |= composerStartRestartGroup.changed(i2) ? 256 : 128;
        }
        int i5 = i4 | 3072;
        if ((i3 & 24576) == 0) {
            i5 |= composerStartRestartGroup.changed(focusRequester) ? 16384 : 8192;
        }
        if ((196608 & i3) == 0) {
            i5 |= composerStartRestartGroup.changedInstance(function0) ? 131072 : 65536;
        }
        if (composerStartRestartGroup.shouldExecute((74899 & i5) != 74898, i5 & 1)) {
            Modifier.Companion companion = Modifier.INSTANCE;
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-87540474, i5, -1, "com.dh.myembyapp.ui.components.PriorityLevelButton (OtherSettingsOverlay.kt:2353)");
            }
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            Composer.Companion companion2 = Composer.INSTANCE;
            if (objRememberedValue == companion2.getEmpty()) {
                objRememberedValue = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Boolean.FALSE, null, 2, null);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            MutableState mutableState = (MutableState) objRememberedValue;
            modifier2 = companion;
            State<Float> stateAnimateFloatAsState = AnimateAsStateKt.animateFloatAsState(((Boolean) mutableState.getValue()).booleanValue() ? 1.06f : 1.0f, null, 0.0f, null, null, composerStartRestartGroup, 0, 30);
            final int iCoerceIn = RangesKt.coerceIn(i, 1, i2);
            RoundedCornerShape roundedCornerShapeM1312RoundedCornerShape0680j_4 = RoundedCornerShapeKt.m1312RoundedCornerShape0680j_4(Dp.m7813constructorimpl(14.0f));
            if (hc2.t(composerStartRestartGroup)) {
                composerStartRestartGroup.startReplaceGroup(-872636565);
                primary = MaterialTheme.INSTANCE.getColorScheme(composerStartRestartGroup, MaterialTheme.$stable).getPrimary();
                composerStartRestartGroup.endReplaceGroup();
            } else {
                composerStartRestartGroup.startReplaceGroup(-872582408);
                composerStartRestartGroup.endReplaceGroup();
                primary = xq.d;
            }
            long j = primary;
            float f = i2 <= 1 ? 0.0f : (iCoerceIn - 1.0f) / (i2 - 1.0f);
            float f2 = 0.82f - (0.28f * f);
            float f3 = 0.92f - (0.18f * f);
            float f4 = 0.92f - (f * 0.2f);
            long jM5151copywmQWz5c$default = Color.m5151copywmQWz5c$default(j, RangesKt.coerceIn(f2, 0.52f, 0.82f), 0.0f, 0.0f, 0.0f, 14, null);
            final long jM5151copywmQWz5c$default2 = ((Boolean) mutableState.getValue()).booleanValue() ? Color.m5151copywmQWz5c$default(ColorKt.Color(4280163870L), 0.9f, 0.0f, 0.0f, 0.0f, 14, null) : Color.m5151copywmQWz5c$default(Color.INSTANCE.m5189getWhite0d7_KjU(), RangesKt.coerceIn(f3, 0.68f, 0.92f), 0.0f, 0.0f, 0.0f, 14, null);
            final long jM5189getWhite0d7_KjU = ((Boolean) mutableState.getValue()).booleanValue() ? Color.INSTANCE.m5189getWhite0d7_KjU() : Color.m5151copywmQWz5c$default(j, RangesKt.coerceIn(f4, 0.72f, 0.92f), 0.0f, 0.0f, 0.0f, 14, null);
            final TextStyle textStyleM7288copyp1EtxEg$default = TextStyle.m7288copyp1EtxEg$default(MaterialTheme.INSTANCE.getTypography(composerStartRestartGroup, MaterialTheme.$stable).getLabelSmall(), 0L, 0L, null, null, null, null, null, 0L, null, null, null, 0L, null, null, null, 0, 0, 0L, null, new PlatformTextStyle(false), null, 0, 0, null, 16252927, null);
            Modifier modifierThen = ClipKt.clip(ScaleKt.scale(modifier2, stateAnimateFloatAsState.getValue().floatValue()), roundedCornerShapeM1312RoundedCornerShape0680j_4).then(((Boolean) mutableState.getValue()).booleanValue() ? BorderKt.m286borderxT4_qwU(modifier2, Dp.m7813constructorimpl(2.0f), Color.INSTANCE.m5189getWhite0d7_KjU(), roundedCornerShapeM1312RoundedCornerShape0680j_4) : modifier2);
            MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.INSTANCE.getTopStart(), false);
            long currentCompositeKeyHashCode = ComposablesKt.getCurrentCompositeKeyHashCode(composerStartRestartGroup, 0);
            int i6 = (int) (currentCompositeKeyHashCode ^ (currentCompositeKeyHashCode >>> 32));
            CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifierThen);
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
            Updater.m4326setimpl(composerM4318constructorimpl, modifierMaterializeModifier, (Function2<? super T, ? super Modifier, Unit>) id.h(companion3, composerM4318constructorimpl, Integer.valueOf(i6), composerM4318constructorimpl));
            BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
            Modifier modifierThen2 = SizeKt.fillMaxWidth$default(modifier2, 0.0f, 1, null).then(focusRequester != null ? FocusRequesterModifierKt.focusRequester(modifier2, focusRequester) : modifier2);
            Object objRememberedValue2 = composerStartRestartGroup.rememberedValue();
            if (objRememberedValue2 == companion2.getEmpty()) {
                objRememberedValue2 = new p21(13, mutableState);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
            }
            Modifier modifierOnFocusChanged = FocusChangedModifierKt.onFocusChanged(modifierThen2, (Function1) objRememberedValue2);
            ButtonDefaults buttonDefaults = ButtonDefaults.INSTANCE;
            ButtonScale buttonScaleScale$default = ButtonDefaults.scale$default(buttonDefaults, 1.0f, 1.0f, 0.0f, 0.0f, 0.0f, 28, null);
            Color.Companion companion4 = Color.INSTANCE;
            composer2 = composerStartRestartGroup;
            ButtonKt.m8231ButtonTCVpFMg(function0, modifierOnFocusChanged, null, false, buttonScaleScale$default, null, ButtonDefaults.shape$default(buttonDefaults, roundedCornerShapeM1312RoundedCornerShape0680j_4, null, null, null, null, 30, null), buttonDefaults.m8228colorsoq7We08(jM5151copywmQWz5c$default, companion4.m5189getWhite0d7_KjU(), companion4.m5189getWhite0d7_KjU(), ColorKt.Color(4279308561L), 0L, 0L, 0L, 0L, composerStartRestartGroup, (ButtonDefaults.$stable << 24) | 3504, PsExtractor.VIDEO_STREAM_MASK), 0.0f, null, PaddingKt.m993PaddingValuesYgX7TsA(Dp.m7813constructorimpl(10.0f), Dp.m7813constructorimpl(8.0f)), null, ComposableLambdaKt.rememberComposableLambda(314273020, true, new Function3() { // from class: pb1
                @Override // kotlin.jvm.functions.Function3
                public final Object invoke(Object obj, Object obj2, Object obj3) {
                    Composer composer3 = (Composer) obj2;
                    int iIntValue = ((Integer) obj3).intValue();
                    ((RowScope) obj).getClass();
                    if (composer3.shouldExecute((iIntValue & 17) != 16, iIntValue & 1)) {
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(314273020, iIntValue, -1, "com.dh.myembyapp.ui.components.PriorityLevelButton.<anonymous>.<anonymous> (OtherSettingsOverlay.kt:2416)");
                        }
                        Modifier.Companion companion5 = Modifier.INSTANCE;
                        Modifier modifierFillMaxWidth$default = SizeKt.fillMaxWidth$default(companion5, 0.0f, 1, null);
                        Alignment.Companion companion6 = Alignment.INSTANCE;
                        MeasurePolicy measurePolicyRowMeasurePolicy = RowKt.rowMeasurePolicy(Arrangement.INSTANCE.getSpaceBetween(), companion6.getCenterVertically(), composer3, 54);
                        long currentCompositeKeyHashCode2 = ComposablesKt.getCurrentCompositeKeyHashCode(composer3, 0);
                        int i7 = (int) (currentCompositeKeyHashCode2 ^ (currentCompositeKeyHashCode2 >>> 32));
                        CompositionLocalMap currentCompositionLocalMap2 = composer3.getCurrentCompositionLocalMap();
                        Modifier modifierMaterializeModifier2 = ComposedModifierKt.materializeModifier(composer3, modifierFillMaxWidth$default);
                        ComposeUiNode.Companion companion7 = ComposeUiNode.INSTANCE;
                        Function0<ComposeUiNode> constructor2 = companion7.getConstructor();
                        if (composer3.getApplier() == null) {
                            ComposablesKt.invalidApplier();
                        }
                        composer3.startReusableNode();
                        if (composer3.getInserting()) {
                            composer3.createNode(constructor2);
                        } else {
                            composer3.useNode();
                        }
                        Composer composerM4318constructorimpl2 = Updater.m4318constructorimpl(composer3);
                        mr.z(companion7, composerM4318constructorimpl2, measurePolicyRowMeasurePolicy, composerM4318constructorimpl2, currentCompositionLocalMap2);
                        Updater.m4326setimpl(composerM4318constructorimpl2, modifierMaterializeModifier2, (Function2<? super T, ? super Modifier, Unit>) id.h(companion7, composerM4318constructorimpl2, Integer.valueOf(i7), composerM4318constructorimpl2));
                        RowScopeInstance rowScopeInstance = RowScopeInstance.INSTANCE;
                        TextKt.m3048TextNvy7gAk(str, null, 0L, null, TextUnitKt.getSp(13), null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, composer3, 24576, 0, 262126);
                        Modifier modifierM286borderxT4_qwU = BorderKt.m286borderxT4_qwU(BackgroundKt.m274backgroundbw27NRU(SizeKt.m1064size3ABfNKs(companion5, Dp.m7813constructorimpl(24.0f)), jM5151copywmQWz5c$default2, RoundedCornerShapeKt.getCircleShape()), Dp.m7813constructorimpl(1.0f), Color.m5151copywmQWz5c$default(Color.INSTANCE.m5189getWhite0d7_KjU(), 0.28f, 0.0f, 0.0f, 0.0f, 14, null), RoundedCornerShapeKt.getCircleShape());
                        MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy2 = BoxKt.maybeCachedBoxMeasurePolicy(companion6.getCenter(), false);
                        long currentCompositeKeyHashCode3 = ComposablesKt.getCurrentCompositeKeyHashCode(composer3, 0);
                        int i8 = (int) (currentCompositeKeyHashCode3 ^ (currentCompositeKeyHashCode3 >>> 32));
                        CompositionLocalMap currentCompositionLocalMap3 = composer3.getCurrentCompositionLocalMap();
                        Modifier modifierMaterializeModifier3 = ComposedModifierKt.materializeModifier(composer3, modifierM286borderxT4_qwU);
                        Function0<ComposeUiNode> constructor3 = companion7.getConstructor();
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
                        mr.z(companion7, composerM4318constructorimpl3, measurePolicyMaybeCachedBoxMeasurePolicy2, composerM4318constructorimpl3, currentCompositionLocalMap3);
                        Updater.m4326setimpl(composerM4318constructorimpl3, modifierMaterializeModifier3, (Function2<? super T, ? super Modifier, Unit>) id.h(companion7, composerM4318constructorimpl3, Integer.valueOf(i8), composerM4318constructorimpl3));
                        BoxScopeInstance boxScopeInstance2 = BoxScopeInstance.INSTANCE;
                        TextKt.m3048TextNvy7gAk(String.valueOf(iCoerceIn), null, jM5189getWhite0d7_KjU, null, TextUnitKt.getSp(12), null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, textStyleM7288copyp1EtxEg$default, composer3, 24576, 0, 131050);
                        if (x2.m(composer3)) {
                            ComposerKt.traceEventEnd();
                        }
                    } else {
                        composer3.skipToGroupEnd();
                    }
                    return Unit.INSTANCE;
                }
            }, composerStartRestartGroup, 54), composer2, (i5 >> 15) & 14, 390, 2860);
            composer2.endNode();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composer2 = composerStartRestartGroup;
            composer2.skipToGroupEnd();
            modifier2 = modifier;
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: qb1
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    cc1.u(str, i, i2, modifier2, focusRequester, function0, (Composer) obj, RecomposeScopeImplKt.updateChangedFlags(i3 | 1));
                    return Unit.INSTANCE;
                }
            });
        }
    }

    /* JADX WARN: Code duplicated, block: B:38:0x0064  */
    /* JADX WARN: Code duplicated, block: B:40:0x006c  */
    /* JADX WARN: Code duplicated, block: B:41:0x006f  */
    /* JADX WARN: Code duplicated, block: B:43:0x0073  */
    /* JADX WARN: Code duplicated, block: B:46:0x007f  */
    /* JADX WARN: Code duplicated, block: B:47:0x0081  */
    /* JADX WARN: Code duplicated, block: B:50:0x008a  */
    /* JADX WARN: Code duplicated, block: B:52:0x008d  */
    /* JADX WARN: Code duplicated, block: B:55:0x0094  */
    /* JADX WARN: Code duplicated, block: B:58:0x00a6  */
    /* JADX WARN: Code duplicated, block: B:61:0x00bd  */
    /* JADX WARN: Code duplicated, block: B:62:0x00c1  */
    /* JADX WARN: Code duplicated, block: B:65:0x0105  */
    /* JADX WARN: Code duplicated, block: B:66:0x0118  */
    /* JADX WARN: Code duplicated, block: B:70:0x0146  */
    /* JADX WARN: Code duplicated, block: B:73:0x0152  */
    /* JADX WARN: Code duplicated, block: B:74:0x0156  */
    /* JADX WARN: Code duplicated, block: B:77:0x0177  */
    /* JADX WARN: Code duplicated, block: B:80:0x0189  */
    /* JADX WARN: Code duplicated, block: B:83:0x0218  */
    /* JADX WARN: Code duplicated, block: B:84:0x021c  */
    /* JADX WARN: Code duplicated, block: B:87:0x0226  */
    /* JADX WARN: Code duplicated, block: B:89:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Multi-variable type inference failed */
    public static final void v(int i, int i2, Composer composer, Modifier modifier, FocusRequester focusRequester, String str, Function0 function0, boolean z) {
        int i3;
        FocusRequester focusRequester2;
        boolean z2;
        FocusRequester focusRequester3;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Object objRememberedValue;
        Composer.Companion companion;
        MutableState mutableState;
        float f;
        RoundedCornerShape roundedCornerShapeM1312RoundedCornerShape0680j_4;
        Modifier modifierM286borderxT4_qwU;
        Function0<ComposeUiNode> constructor;
        Modifier modifierFocusRequester;
        Object objRememberedValue2;
        int i4;
        Composer composerStartRestartGroup = composer.startRestartGroup(-1539178846);
        if ((i & 6) == 0) {
            i3 = (composerStartRestartGroup.changed(str) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            i3 |= composerStartRestartGroup.changed(z) ? 32 : 16;
        }
        if ((i & RendererCapabilities.DECODER_SUPPORT_MASK) == 0) {
            i3 |= composerStartRestartGroup.changed(modifier) ? 256 : 128;
        }
        int i5 = i2 & 8;
        if (i5 == 0) {
            if ((i & 3072) == 0) {
                focusRequester2 = focusRequester;
                i3 |= composerStartRestartGroup.changed(focusRequester2) ? 2048 : 1024;
            }
            if ((i & 24576) != 0) {
                if (composerStartRestartGroup.changedInstance(function0)) {
                    i4 = 16384;
                } else {
                    i4 = 8192;
                }
                i3 |= i4;
            }
            if ((i3 & 9363) != 9362) {
                z2 = true;
            } else {
                z2 = false;
            }
            if (composerStartRestartGroup.shouldExecute(z2, i3 & 1)) {
                if (i5 != 0) {
                    focusRequester2 = null;
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-1539178846, i3, -1, "com.dh.myembyapp.ui.components.SecondarySortButton (OtherSettingsOverlay.kt:2454)");
                }
                objRememberedValue = composerStartRestartGroup.rememberedValue();
                companion = Composer.INSTANCE;
                if (objRememberedValue == companion.getEmpty()) {
                    objRememberedValue = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Boolean.FALSE, null, 2, null);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                }
                mutableState = (MutableState) objRememberedValue;
                if (((Boolean) mutableState.getValue()).booleanValue()) {
                    f = 1.06f;
                } else {
                    f = 1.0f;
                }
                float f2 = f;
                focusRequester3 = focusRequester2;
                State<Float> stateAnimateFloatAsState = AnimateAsStateKt.animateFloatAsState(f2, null, 0.0f, null, null, composerStartRestartGroup, 0, 30);
                roundedCornerShapeM1312RoundedCornerShape0680j_4 = RoundedCornerShapeKt.m1312RoundedCornerShape0680j_4(Dp.m7813constructorimpl(14.0f));
                Modifier modifierClip = ClipKt.clip(ScaleKt.scale(modifier, stateAnimateFloatAsState.getValue().floatValue()), roundedCornerShapeM1312RoundedCornerShape0680j_4);
                if (((Boolean) mutableState.getValue()).booleanValue()) {
                    modifierM286borderxT4_qwU = BorderKt.m286borderxT4_qwU(Modifier.INSTANCE, Dp.m7813constructorimpl(2.0f), Color.INSTANCE.m5189getWhite0d7_KjU(), roundedCornerShapeM1312RoundedCornerShape0680j_4);
                } else {
                    modifierM286borderxT4_qwU = Modifier.INSTANCE;
                }
                Modifier modifierThen = modifierClip.then(modifierM286borderxT4_qwU);
                MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.INSTANCE.getTopStart(), false);
                long currentCompositeKeyHashCode = ComposablesKt.getCurrentCompositeKeyHashCode(composerStartRestartGroup, 0);
                int i6 = (int) (currentCompositeKeyHashCode ^ (currentCompositeKeyHashCode >>> 32));
                CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
                Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifierThen);
                ComposeUiNode.Companion companion2 = ComposeUiNode.INSTANCE;
                constructor = companion2.getConstructor();
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
                mr.z(companion2, composerM4318constructorimpl, measurePolicyMaybeCachedBoxMeasurePolicy, composerM4318constructorimpl, currentCompositionLocalMap);
                Updater.m4326setimpl(composerM4318constructorimpl, modifierMaterializeModifier, (Function2<? super T, ? super Modifier, Unit>) id.h(companion2, composerM4318constructorimpl, Integer.valueOf(i6), composerM4318constructorimpl));
                BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
                modifierFocusRequester = Modifier.INSTANCE;
                Modifier modifierFillMaxWidth$default = SizeKt.fillMaxWidth$default(modifierFocusRequester, 0.0f, 1, null);
                if (focusRequester3 != null) {
                    modifierFocusRequester = FocusRequesterModifierKt.focusRequester(modifierFocusRequester, focusRequester3);
                }
                Modifier modifierThen2 = modifierFillMaxWidth$default.then(modifierFocusRequester);
                objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                if (objRememberedValue2 == companion.getEmpty()) {
                    objRememberedValue2 = new ub1(4, mutableState);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                }
                Modifier modifierOnFocusChanged = FocusChangedModifierKt.onFocusChanged(modifierThen2, (Function1) objRememberedValue2);
                ButtonDefaults buttonDefaults = ButtonDefaults.INSTANCE;
                ButtonKt.m8231ButtonTCVpFMg(function0, modifierOnFocusChanged, null, false, ButtonDefaults.scale$default(buttonDefaults, 1.0f, 1.0f, 0.0f, 0.0f, 0.0f, 28, null), null, ButtonDefaults.shape$default(buttonDefaults, roundedCornerShapeM1312RoundedCornerShape0680j_4, null, null, null, null, 30, null), hc2.r(z, ColorKt.Color(4282532418L), composerStartRestartGroup, ((i3 >> 3) & 14) | RendererCapabilities.DECODER_SUPPORT_MASK, 2), 0.0f, null, PaddingKt.m993PaddingValuesYgX7TsA(Dp.m7813constructorimpl(8.0f), Dp.m7813constructorimpl(8.0f)), null, ComposableLambdaKt.rememberComposableLambda(-1137365352, true, new e8(3, mutableState, str), composerStartRestartGroup, 54), composerStartRestartGroup, (i3 >> 12) & 14, 390, 2860);
                composerStartRestartGroup = composerStartRestartGroup;
                composerStartRestartGroup.endNode();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
            } else {
                composerStartRestartGroup.skipToGroupEnd();
                focusRequester3 = focusRequester2;
            }
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup != null) {
                scopeUpdateScopeEndRestartGroup.updateScope(new yb1(str, z, modifier, focusRequester3, function0, i, i2));
            }
        }
        i3 |= 3072;
        focusRequester2 = focusRequester;
        if ((i & 24576) != 0) {
            if (composerStartRestartGroup.changedInstance(function0)) {
                i4 = 16384;
            } else {
                i4 = 8192;
            }
            i3 |= i4;
        }
        if ((i3 & 9363) != 9362) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (composerStartRestartGroup.shouldExecute(z2, i3 & 1)) {
            if (i5 != 0) {
                focusRequester2 = null;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1539178846, i3, -1, "com.dh.myembyapp.ui.components.SecondarySortButton (OtherSettingsOverlay.kt:2454)");
            }
            objRememberedValue = composerStartRestartGroup.rememberedValue();
            companion = Composer.INSTANCE;
            if (objRememberedValue == companion.getEmpty()) {
                objRememberedValue = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Boolean.FALSE, null, 2, null);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            mutableState = (MutableState) objRememberedValue;
            if (((Boolean) mutableState.getValue()).booleanValue()) {
                f = 1.06f;
            } else {
                f = 1.0f;
            }
            float f3 = f;
            focusRequester3 = focusRequester2;
            State<Float> stateAnimateFloatAsState2 = AnimateAsStateKt.animateFloatAsState(f3, null, 0.0f, null, null, composerStartRestartGroup, 0, 30);
            roundedCornerShapeM1312RoundedCornerShape0680j_4 = RoundedCornerShapeKt.m1312RoundedCornerShape0680j_4(Dp.m7813constructorimpl(14.0f));
            Modifier modifierClip2 = ClipKt.clip(ScaleKt.scale(modifier, stateAnimateFloatAsState2.getValue().floatValue()), roundedCornerShapeM1312RoundedCornerShape0680j_4);
            if (((Boolean) mutableState.getValue()).booleanValue()) {
                modifierM286borderxT4_qwU = BorderKt.m286borderxT4_qwU(Modifier.INSTANCE, Dp.m7813constructorimpl(2.0f), Color.INSTANCE.m5189getWhite0d7_KjU(), roundedCornerShapeM1312RoundedCornerShape0680j_4);
            } else {
                modifierM286borderxT4_qwU = Modifier.INSTANCE;
            }
            Modifier modifierThen3 = modifierClip2.then(modifierM286borderxT4_qwU);
            MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy2 = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.INSTANCE.getTopStart(), false);
            long currentCompositeKeyHashCode2 = ComposablesKt.getCurrentCompositeKeyHashCode(composerStartRestartGroup, 0);
            int i7 = (int) (currentCompositeKeyHashCode2 ^ (currentCompositeKeyHashCode2 >>> 32));
            CompositionLocalMap currentCompositionLocalMap2 = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier2 = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifierThen3);
            ComposeUiNode.Companion companion3 = ComposeUiNode.INSTANCE;
            constructor = companion3.getConstructor();
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
            mr.z(companion3, composerM4318constructorimpl2, measurePolicyMaybeCachedBoxMeasurePolicy2, composerM4318constructorimpl2, currentCompositionLocalMap2);
            Updater.m4326setimpl(composerM4318constructorimpl2, modifierMaterializeModifier2, (Function2<? super T, ? super Modifier, Unit>) id.h(companion3, composerM4318constructorimpl2, Integer.valueOf(i7), composerM4318constructorimpl2));
            BoxScopeInstance boxScopeInstance2 = BoxScopeInstance.INSTANCE;
            modifierFocusRequester = Modifier.INSTANCE;
            Modifier modifierFillMaxWidth$default2 = SizeKt.fillMaxWidth$default(modifierFocusRequester, 0.0f, 1, null);
            if (focusRequester3 != null) {
                modifierFocusRequester = FocusRequesterModifierKt.focusRequester(modifierFocusRequester, focusRequester3);
            }
            Modifier modifierThen4 = modifierFillMaxWidth$default2.then(modifierFocusRequester);
            objRememberedValue2 = composerStartRestartGroup.rememberedValue();
            if (objRememberedValue2 == companion.getEmpty()) {
                objRememberedValue2 = new ub1(4, mutableState);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
            }
            Modifier modifierOnFocusChanged2 = FocusChangedModifierKt.onFocusChanged(modifierThen4, (Function1) objRememberedValue2);
            ButtonDefaults buttonDefaults2 = ButtonDefaults.INSTANCE;
            ButtonKt.m8231ButtonTCVpFMg(function0, modifierOnFocusChanged2, null, false, ButtonDefaults.scale$default(buttonDefaults2, 1.0f, 1.0f, 0.0f, 0.0f, 0.0f, 28, null), null, ButtonDefaults.shape$default(buttonDefaults2, roundedCornerShapeM1312RoundedCornerShape0680j_4, null, null, null, null, 30, null), hc2.r(z, ColorKt.Color(4282532418L), composerStartRestartGroup, ((i3 >> 3) & 14) | RendererCapabilities.DECODER_SUPPORT_MASK, 2), 0.0f, null, PaddingKt.m993PaddingValuesYgX7TsA(Dp.m7813constructorimpl(8.0f), Dp.m7813constructorimpl(8.0f)), null, ComposableLambdaKt.rememberComposableLambda(-1137365352, true, new e8(3, mutableState, str), composerStartRestartGroup, 54), composerStartRestartGroup, (i3 >> 12) & 14, 390, 2860);
            composerStartRestartGroup = composerStartRestartGroup;
            composerStartRestartGroup.endNode();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
            focusRequester3 = focusRequester2;
        }
        scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new yb1(str, z, modifier, focusRequester3, function0, i, i2));
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void w(Function1 function1, int i, Composer composer, int i2) {
        int i3;
        Function1 function2;
        Composer composerStartRestartGroup = composer.startRestartGroup(-1870064996);
        if ((i2 & 6) == 0) {
            i3 = i2 | (composerStartRestartGroup.changed(i) ? 4 : 2);
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= composerStartRestartGroup.changedInstance(function1) ? 32 : 16;
        }
        int i4 = i3;
        if (composerStartRestartGroup.shouldExecute((i4 & 19) != 18, i4 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1870064996, i4, -1, "com.dh.myembyapp.ui.components.SeekIntervalSelector (OtherSettingsOverlay.kt:891)");
            }
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            Composer.Companion companion = Composer.INSTANCE;
            if (objRememberedValue == companion.getEmpty()) {
                objRememberedValue = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Boolean.FALSE, null, 2, null);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            MutableState mutableState = (MutableState) objRememberedValue;
            Object objRememberedValue2 = composerStartRestartGroup.rememberedValue();
            if (objRememberedValue2 == companion.getEmpty()) {
                objRememberedValue2 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Boolean.FALSE, null, 2, null);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
            }
            MutableState mutableState2 = (MutableState) objRememberedValue2;
            State<Float> stateAnimateFloatAsState = AnimateAsStateKt.animateFloatAsState(((Boolean) mutableState.getValue()).booleanValue() ? 1.06f : 1.0f, null, 0.0f, null, null, composerStartRestartGroup, 0, 30);
            State<Float> stateAnimateFloatAsState2 = AnimateAsStateKt.animateFloatAsState(((Boolean) mutableState2.getValue()).booleanValue() ? 1.06f : 1.0f, null, 0.0f, null, null, composerStartRestartGroup, 0, 30);
            int iCoerceIn = (RangesKt.coerceIn(i, 5, 60) / 5) * 5;
            Modifier.Companion companion2 = Modifier.INSTANCE;
            Modifier modifierFillMaxWidth$default = SizeKt.fillMaxWidth$default(companion2, 0.0f, 1, null);
            Alignment.Companion companion3 = Alignment.INSTANCE;
            MeasurePolicy measurePolicyQ = mr.q(8.0f, Arrangement.INSTANCE, companion3.getCenterVertically(), composerStartRestartGroup, 54);
            long currentCompositeKeyHashCode = ComposablesKt.getCurrentCompositeKeyHashCode(composerStartRestartGroup, 0);
            int i5 = (int) (currentCompositeKeyHashCode ^ (currentCompositeKeyHashCode >>> 32));
            CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifierFillMaxWidth$default);
            ComposeUiNode.Companion companion4 = ComposeUiNode.INSTANCE;
            Function0<ComposeUiNode> constructor = companion4.getConstructor();
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
            mr.z(companion4, composerM4318constructorimpl, measurePolicyQ, composerM4318constructorimpl, currentCompositionLocalMap);
            Updater.m4326setimpl(composerM4318constructorimpl, modifierMaterializeModifier, (Function2<? super T, ? super Modifier, Unit>) id.h(companion4, composerM4318constructorimpl, Integer.valueOf(i5), composerM4318constructorimpl));
            RowScopeInstance rowScopeInstance = RowScopeInstance.INSTANCE;
            Modifier modifierThen = ScaleKt.scale(companion2, stateAnimateFloatAsState.getValue().floatValue()).then(((Boolean) mutableState.getValue()).booleanValue() ? BorderKt.m286borderxT4_qwU(companion2, Dp.m7813constructorimpl(2.0f), Color.INSTANCE.m5189getWhite0d7_KjU(), RoundedCornerShapeKt.getCircleShape()) : companion2);
            MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(companion3.getTopStart(), false);
            long currentCompositeKeyHashCode2 = ComposablesKt.getCurrentCompositeKeyHashCode(composerStartRestartGroup, 0);
            int i6 = (int) (currentCompositeKeyHashCode2 ^ (currentCompositeKeyHashCode2 >>> 32));
            CompositionLocalMap currentCompositionLocalMap2 = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier2 = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifierThen);
            Function0<ComposeUiNode> constructor2 = companion4.getConstructor();
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
            mr.z(companion4, composerM4318constructorimpl2, measurePolicyMaybeCachedBoxMeasurePolicy, composerM4318constructorimpl2, currentCompositionLocalMap2);
            Updater.m4326setimpl(composerM4318constructorimpl2, modifierMaterializeModifier2, (Function2<? super T, ? super Modifier, Unit>) id.h(companion4, composerM4318constructorimpl2, Integer.valueOf(i6), composerM4318constructorimpl2));
            BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
            boolean z = iCoerceIn > 5;
            Modifier modifierM1064size3ABfNKs = SizeKt.m1064size3ABfNKs(companion2, Dp.m7813constructorimpl(30.0f));
            Object objRememberedValue3 = composerStartRestartGroup.rememberedValue();
            if (objRememberedValue3 == companion.getEmpty()) {
                objRememberedValue3 = new p21(19, mutableState);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
            }
            Modifier modifierOnFocusChanged = FocusChangedModifierKt.onFocusChanged(modifierM1064size3ABfNKs, (Function1) objRememberedValue3);
            int i7 = i4 & Input.Keys.FORWARD_DEL;
            boolean zChanged = (i7 == 32) | composerStartRestartGroup.changed(iCoerceIn);
            Object objRememberedValue4 = composerStartRestartGroup.rememberedValue();
            if (zChanged || objRememberedValue4 == companion.getEmpty()) {
                objRememberedValue4 = new uy(function1, iCoerceIn, 8);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue4);
            }
            IconButtonKt.IconButton((Function0) objRememberedValue4, modifierOnFocusChanged, z, null, null, null, ComposableLambdaKt.rememberComposableLambda(430166692, true, new vy(iCoerceIn, 6), composerStartRestartGroup, 54), composerStartRestartGroup, 1572864, 56);
            composerStartRestartGroup.endNode();
            Modifier modifierM1001paddingVpY3zN4$default = PaddingKt.m1001paddingVpY3zN4$default(kb0.v(6.0f, SizeKt.m1069width3ABfNKs(companion2, Dp.m7813constructorimpl(72.0f)), ColorKt.Color(4281545523L)), 0.0f, Dp.m7813constructorimpl(4.0f), 1, null);
            MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy2 = BoxKt.maybeCachedBoxMeasurePolicy(companion3.getCenter(), false);
            long currentCompositeKeyHashCode3 = ComposablesKt.getCurrentCompositeKeyHashCode(composerStartRestartGroup, 0);
            int i8 = (int) (currentCompositeKeyHashCode3 ^ (currentCompositeKeyHashCode3 >>> 32));
            CompositionLocalMap currentCompositionLocalMap3 = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier3 = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifierM1001paddingVpY3zN4$default);
            Function0<ComposeUiNode> constructor3 = companion4.getConstructor();
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
            mr.z(companion4, composerM4318constructorimpl3, measurePolicyMaybeCachedBoxMeasurePolicy2, composerM4318constructorimpl3, currentCompositionLocalMap3);
            Updater.m4326setimpl(composerM4318constructorimpl3, modifierMaterializeModifier3, (Function2<? super T, ? super Modifier, Unit>) id.h(companion4, composerM4318constructorimpl3, Integer.valueOf(i8), composerM4318constructorimpl3));
            long sp = TextUnitKt.getSp(14);
            Color.Companion companion5 = Color.INSTANCE;
            TextKt.m3048TextNvy7gAk(iCoerceIn + "秒", null, companion5.m5189getWhite0d7_KjU(), null, sp, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, composerStartRestartGroup, 24960, 0, 262122);
            composerStartRestartGroup.endNode();
            Modifier modifierThen2 = ScaleKt.scale(companion2, stateAnimateFloatAsState2.getValue().floatValue()).then(((Boolean) mutableState2.getValue()).booleanValue() ? BorderKt.m286borderxT4_qwU(companion2, Dp.m7813constructorimpl(2.0f), companion5.m5189getWhite0d7_KjU(), RoundedCornerShapeKt.getCircleShape()) : companion2);
            MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy3 = BoxKt.maybeCachedBoxMeasurePolicy(companion3.getTopStart(), false);
            long currentCompositeKeyHashCode4 = ComposablesKt.getCurrentCompositeKeyHashCode(composerStartRestartGroup, 0);
            int i9 = (int) (currentCompositeKeyHashCode4 ^ (currentCompositeKeyHashCode4 >>> 32));
            CompositionLocalMap currentCompositionLocalMap4 = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier4 = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifierThen2);
            Function0<ComposeUiNode> constructor4 = companion4.getConstructor();
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
            mr.z(companion4, composerM4318constructorimpl4, measurePolicyMaybeCachedBoxMeasurePolicy3, composerM4318constructorimpl4, currentCompositionLocalMap4);
            Updater.m4326setimpl(composerM4318constructorimpl4, modifierMaterializeModifier4, (Function2<? super T, ? super Modifier, Unit>) id.h(companion4, composerM4318constructorimpl4, Integer.valueOf(i9), composerM4318constructorimpl4));
            boolean z2 = iCoerceIn < 60;
            Modifier modifierM1064size3ABfNKs2 = SizeKt.m1064size3ABfNKs(companion2, Dp.m7813constructorimpl(30.0f));
            Object objRememberedValue5 = composerStartRestartGroup.rememberedValue();
            if (objRememberedValue5 == companion.getEmpty()) {
                objRememberedValue5 = new p21(20, mutableState2);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue5);
            }
            Modifier modifierOnFocusChanged2 = FocusChangedModifierKt.onFocusChanged(modifierM1064size3ABfNKs2, (Function1) objRememberedValue5);
            boolean zChanged2 = composerStartRestartGroup.changed(iCoerceIn) | (i7 == 32);
            Object objRememberedValue6 = composerStartRestartGroup.rememberedValue();
            if (zChanged2 || objRememberedValue6 == companion.getEmpty()) {
                function2 = function1;
                objRememberedValue6 = new uy(function2, iCoerceIn, 9);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue6);
            } else {
                function2 = function1;
            }
            IconButtonKt.IconButton((Function0) objRememberedValue6, modifierOnFocusChanged2, z2, null, null, null, ComposableLambdaKt.rememberComposableLambda(525046556, true, new vy(iCoerceIn, 7), composerStartRestartGroup, 54), composerStartRestartGroup, 1572864, 56);
            composerStartRestartGroup = composerStartRestartGroup;
            if (x2.m(composerStartRestartGroup)) {
                ComposerKt.traceEventEnd();
            }
        } else {
            function2 = function1;
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new xy(i, i2, 2, function2));
        }
    }

    public static final void x(SubtitleVersionPrioritySettings subtitleVersionPrioritySettings, Function1 function1, Function0 function0, Composer composer, int i) {
        int i2;
        Composer composerStartRestartGroup = composer.startRestartGroup(-954668423);
        if ((i & 6) == 0) {
            i2 = (composerStartRestartGroup.changedInstance(subtitleVersionPrioritySettings) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= composerStartRestartGroup.changedInstance(function1) ? 32 : 16;
        }
        if ((i & RendererCapabilities.DECODER_SUPPORT_MASK) == 0) {
            i2 |= composerStartRestartGroup.changedInstance(function0) ? 256 : 128;
        }
        int i3 = 0;
        if (composerStartRestartGroup.shouldExecute((i2 & Input.Keys.NUMPAD_3) != 146, i2 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-954668423, i2, -1, "com.dh.myembyapp.ui.components.SubtitleFormatPriorityDialog (OtherSettingsOverlay.kt:2025)");
            }
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            Composer.Companion companion = Composer.INSTANCE;
            if (objRememberedValue == companion.getEmpty()) {
                objRememberedValue = mr.n(composerStartRestartGroup);
            }
            FocusRequester focusRequester = (FocusRequester) objRememberedValue;
            AndroidDialog_androidKt.Dialog(function0, new DialogProperties(true, false, false), ComposableLambdaKt.rememberComposableLambda(739199120, true, new wb1(subtitleVersionPrioritySettings.normalized(), focusRequester, function1, i3), composerStartRestartGroup, 54), composerStartRestartGroup, ((i2 >> 6) & 14) | 432, 0);
            Unit unit = Unit.INSTANCE;
            Object objRememberedValue2 = composerStartRestartGroup.rememberedValue();
            if (objRememberedValue2 == companion.getEmpty()) {
                objRememberedValue2 = new ng(focusRequester, null, 5);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
            }
            EffectsKt.LaunchedEffect(unit, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) objRememberedValue2, composerStartRestartGroup, 6);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new xb1(subtitleVersionPrioritySettings, function1, function0, i, 0));
        }
    }

    public static final void y(SubtitleVersionPrioritySettings subtitleVersionPrioritySettings, Function1 function1, Function0 function0, Composer composer, int i) {
        int i2;
        Composer composerStartRestartGroup = composer.startRestartGroup(219754872);
        if ((i & 6) == 0) {
            i2 = (composerStartRestartGroup.changedInstance(subtitleVersionPrioritySettings) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= composerStartRestartGroup.changedInstance(function1) ? 32 : 16;
        }
        if ((i & RendererCapabilities.DECODER_SUPPORT_MASK) == 0) {
            i2 |= composerStartRestartGroup.changedInstance(function0) ? 256 : 128;
        }
        int i3 = 1;
        if (composerStartRestartGroup.shouldExecute((i2 & Input.Keys.NUMPAD_3) != 146, i2 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(219754872, i2, -1, "com.dh.myembyapp.ui.components.SubtitleLanguagePriorityDialog (OtherSettingsOverlay.kt:1951)");
            }
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            Composer.Companion companion = Composer.INSTANCE;
            if (objRememberedValue == companion.getEmpty()) {
                objRememberedValue = mr.n(composerStartRestartGroup);
            }
            FocusRequester focusRequester = (FocusRequester) objRememberedValue;
            AndroidDialog_androidKt.Dialog(function0, new DialogProperties(true, false, false), ComposableLambdaKt.rememberComposableLambda(233858511, true, new wb1(subtitleVersionPrioritySettings.normalized(), focusRequester, function1, i3), composerStartRestartGroup, 54), composerStartRestartGroup, ((i2 >> 6) & 14) | 432, 0);
            Unit unit = Unit.INSTANCE;
            Object objRememberedValue2 = composerStartRestartGroup.rememberedValue();
            if (objRememberedValue2 == companion.getEmpty()) {
                objRememberedValue2 = new ng(focusRequester, null, 6);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
            }
            EffectsKt.LaunchedEffect(unit, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) objRememberedValue2, composerStartRestartGroup, 6);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new xb1(subtitleVersionPrioritySettings, function1, function0, i, 1));
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void z(SubtitlePrioritySortType subtitlePrioritySortType, SubtitleVersionPrioritySettings subtitleVersionPrioritySettings, FocusRequester focusRequester, Function1 function1, Function1 function2, Composer composer, int i) {
        int i2;
        SubtitlePrioritySortType subtitlePrioritySortType2;
        final SubtitleVersionPrioritySettings subtitleVersionPrioritySettings2;
        boolean zHasLanguagePriority;
        Composer composerStartRestartGroup = composer.startRestartGroup(-1071167565);
        if ((i & 6) == 0) {
            i2 = (composerStartRestartGroup.changed(subtitlePrioritySortType.ordinal()) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= composerStartRestartGroup.changedInstance(subtitleVersionPrioritySettings) ? 32 : 16;
        }
        if ((i & RendererCapabilities.DECODER_SUPPORT_MASK) == 0) {
            i2 |= composerStartRestartGroup.changed(focusRequester) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= composerStartRestartGroup.changedInstance(function1) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i2 |= composerStartRestartGroup.changedInstance(function2) ? 16384 : 8192;
        }
        if (composerStartRestartGroup.shouldExecute((i2 & 9363) != 9362, i2 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1071167565, i2, -1, "com.dh.myembyapp.ui.components.SubtitlePriorityRuleRow (OtherSettingsOverlay.kt:1829)");
            }
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            Composer.Companion companion = Composer.INSTANCE;
            if (objRememberedValue == companion.getEmpty()) {
                objRememberedValue = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Boolean.FALSE, null, 2, null);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            MutableState mutableState = (MutableState) objRememberedValue;
            Object objRememberedValue2 = composerStartRestartGroup.rememberedValue();
            if (objRememberedValue2 == companion.getEmpty()) {
                objRememberedValue2 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Boolean.FALSE, null, 2, null);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
            }
            MutableState mutableState2 = (MutableState) objRememberedValue2;
            SubtitleVersionPrioritySettings subtitleVersionPrioritySettingsNormalized = subtitleVersionPrioritySettings.normalized();
            Modifier.Companion companion2 = Modifier.INSTANCE;
            Modifier modifierFillMaxWidth$default = SizeKt.fillMaxWidth$default(companion2, 0.0f, 1, null);
            MeasurePolicy measurePolicyRowMeasurePolicy = RowKt.rowMeasurePolicy(Arrangement.INSTANCE.m712spacedBy0680j_4(Dp.m7813constructorimpl(8.0f)), Alignment.INSTANCE.getCenterVertically(), composerStartRestartGroup, 54);
            long currentCompositeKeyHashCode = ComposablesKt.getCurrentCompositeKeyHashCode(composerStartRestartGroup, 0);
            int i3 = (int) (currentCompositeKeyHashCode ^ (currentCompositeKeyHashCode >>> 32));
            CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifierFillMaxWidth$default);
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
            mr.z(companion3, composerM4318constructorimpl, measurePolicyRowMeasurePolicy, composerM4318constructorimpl, currentCompositionLocalMap);
            Updater.m4326setimpl(composerM4318constructorimpl, modifierMaterializeModifier, (Function2<? super T, ? super Modifier, Unit>) id.h(companion3, composerM4318constructorimpl, Integer.valueOf(i3), composerM4318constructorimpl));
            RowScopeInstance rowScopeInstance = RowScopeInstance.INSTANCE;
            String label = subtitlePrioritySortType.getLabel();
            Modifier modifierM1050height3ABfNKs = SizeKt.m1050height3ABfNKs(SizeKt.m1069width3ABfNKs(companion2, Dp.m7813constructorimpl(150.0f)), Dp.m7813constructorimpl(42.0f));
            Object objRememberedValue3 = composerStartRestartGroup.rememberedValue();
            if (objRememberedValue3 == companion.getEmpty()) {
                objRememberedValue3 = new lu0(28, mutableState);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
            }
            Function0 function0 = (Function0) objRememberedValue3;
            final int i4 = 1;
            v(((i2 << 3) & 7168) | 25008, 0, composerStartRestartGroup, modifierM1050height3ABfNKs, focusRequester, label, function0, true);
            int[] iArr = bc1.$EnumSwitchMapping$3;
            int i5 = iArr[subtitlePrioritySortType.ordinal()];
            String strN = "默认";
            if (i5 == 1) {
                subtitleVersionPrioritySettings2 = subtitleVersionPrioritySettingsNormalized;
                if (subtitleVersionPrioritySettings2.hasLanguagePriority()) {
                    ArrayList arrayListK = K(10, new Function1() { // from class: mb1
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            int i6 = i4;
                            SubtitleVersionPrioritySettings subtitleVersionPrioritySettings3 = subtitleVersionPrioritySettings2;
                            int iIntValue = ((Integer) obj).intValue();
                            switch (i6) {
                                case 0:
                                    EnumEntries<SubtitleFormatPriorityType> entries = SubtitleFormatPriorityType.getEntries();
                                    ArrayList arrayList = new ArrayList();
                                    for (SubtitleFormatPriorityType subtitleFormatPriorityType : entries) {
                                        if (subtitleVersionPrioritySettings3.formatPriorityFor(subtitleFormatPriorityType) == iIntValue) {
                                            arrayList.add(subtitleFormatPriorityType);
                                        }
                                    }
                                    return CollectionsKt___CollectionsKt.joinToString$default(arrayList, "/", null, null, 0, null, new d71(26), 30, null);
                                default:
                                    EnumEntries<SubtitleLanguagePriorityType> entries2 = SubtitleLanguagePriorityType.getEntries();
                                    ArrayList arrayList2 = new ArrayList();
                                    for (SubtitleLanguagePriorityType subtitleLanguagePriorityType : entries2) {
                                        if (subtitleVersionPrioritySettings3.languagePriorityFor(subtitleLanguagePriorityType) == iIntValue) {
                                            arrayList2.add(subtitleLanguagePriorityType);
                                        }
                                    }
                                    return CollectionsKt___CollectionsKt.joinToString$default(arrayList2, "/", null, null, 0, null, new d71(27), 30, null);
                            }
                        }
                    });
                    strN = c61.n(CollectionsKt___CollectionsKt.joinToString$default(CollectionsKt.take(arrayListK, 3), " -> ", null, null, 0, null, null, 62, null), arrayListK.size() > 3 ? " -> ..." : "");
                }
            } else if (i5 != 2) {
                qu.f();
                return;
            } else if (subtitleVersionPrioritySettingsNormalized.hasFormatPriority()) {
                subtitleVersionPrioritySettings2 = subtitleVersionPrioritySettingsNormalized;
                final int i6 = 0;
                ArrayList arrayListK2 = K(7, new Function1() { // from class: mb1
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        int i7 = i6;
                        SubtitleVersionPrioritySettings subtitleVersionPrioritySettings3 = subtitleVersionPrioritySettings2;
                        int iIntValue = ((Integer) obj).intValue();
                        switch (i7) {
                            case 0:
                                EnumEntries<SubtitleFormatPriorityType> entries = SubtitleFormatPriorityType.getEntries();
                                ArrayList arrayList = new ArrayList();
                                for (SubtitleFormatPriorityType subtitleFormatPriorityType : entries) {
                                    if (subtitleVersionPrioritySettings3.formatPriorityFor(subtitleFormatPriorityType) == iIntValue) {
                                        arrayList.add(subtitleFormatPriorityType);
                                    }
                                }
                                return CollectionsKt___CollectionsKt.joinToString$default(arrayList, "/", null, null, 0, null, new d71(26), 30, null);
                            default:
                                EnumEntries<SubtitleLanguagePriorityType> entries2 = SubtitleLanguagePriorityType.getEntries();
                                ArrayList arrayList2 = new ArrayList();
                                for (SubtitleLanguagePriorityType subtitleLanguagePriorityType : entries2) {
                                    if (subtitleVersionPrioritySettings3.languagePriorityFor(subtitleLanguagePriorityType) == iIntValue) {
                                        arrayList2.add(subtitleLanguagePriorityType);
                                    }
                                }
                                return CollectionsKt___CollectionsKt.joinToString$default(arrayList2, "/", null, null, 0, null, new d71(27), 30, null);
                        }
                    }
                });
                strN = c61.n(CollectionsKt___CollectionsKt.joinToString$default(CollectionsKt.take(arrayListK2, 4), " -> ", null, null, 0, null, null, 62, null), arrayListK2.size() > 4 ? " -> ..." : "");
            } else {
                subtitleVersionPrioritySettings2 = subtitleVersionPrioritySettingsNormalized;
            }
            int i7 = iArr[subtitlePrioritySortType.ordinal()];
            if (i7 == 1) {
                zHasLanguagePriority = subtitleVersionPrioritySettings2.hasLanguagePriority();
            } else {
                if (i7 != 2) {
                    qu.f();
                    return;
                }
                zHasLanguagePriority = subtitleVersionPrioritySettings2.hasFormatPriority();
            }
            boolean z = zHasLanguagePriority;
            Modifier modifierM1050height3ABfNKs2 = SizeKt.m1050height3ABfNKs(zs1.E(rowScopeInstance, companion2, 1.0f, false, 2, null), Dp.m7813constructorimpl(42.0f));
            Object objRememberedValue4 = composerStartRestartGroup.rememberedValue();
            if (objRememberedValue4 == companion.getEmpty()) {
                objRememberedValue4 = new lu0(29, mutableState2);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue4);
            }
            SubtitleVersionPrioritySettings subtitleVersionPrioritySettings3 = subtitleVersionPrioritySettings2;
            v(24576, 8, composerStartRestartGroup, modifierM1050height3ABfNKs2, null, strN, (Function0) objRememberedValue4, z);
            composerStartRestartGroup.endNode();
            if (((Boolean) mutableState.getValue()).booleanValue()) {
                composerStartRestartGroup.startReplaceGroup(455347368);
                boolean z2 = (i2 & 7168) == 2048;
                Object objRememberedValue5 = composerStartRestartGroup.rememberedValue();
                if (z2 || objRememberedValue5 == companion.getEmpty()) {
                    objRememberedValue5 = new r7(function1, mutableState, 14);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue5);
                }
                Function1 function3 = (Function1) objRememberedValue5;
                Object objRememberedValue6 = composerStartRestartGroup.rememberedValue();
                if (objRememberedValue6 == companion.getEmpty()) {
                    objRememberedValue6 = new vb1(0, mutableState);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue6);
                }
                subtitlePrioritySortType2 = subtitlePrioritySortType;
                A(subtitlePrioritySortType2, function3, (Function0) objRememberedValue6, composerStartRestartGroup, (i2 & 14) | RendererCapabilities.DECODER_SUPPORT_MASK);
                composerStartRestartGroup.endReplaceGroup();
            } else {
                subtitlePrioritySortType2 = subtitlePrioritySortType;
                composerStartRestartGroup.startReplaceGroup(455630863);
                composerStartRestartGroup.endReplaceGroup();
            }
            if (((Boolean) mutableState2.getValue()).booleanValue()) {
                composerStartRestartGroup.startReplaceGroup(455683377);
                int i8 = iArr[subtitlePrioritySortType2.ordinal()];
                if (i8 == 1) {
                    composerStartRestartGroup.startReplaceGroup(1400174612);
                    Object objRememberedValue7 = composerStartRestartGroup.rememberedValue();
                    if (objRememberedValue7 == companion.getEmpty()) {
                        objRememberedValue7 = new vb1(1, mutableState2);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue7);
                    }
                    y(subtitleVersionPrioritySettings3, function2, (Function0) objRememberedValue7, composerStartRestartGroup, ((i2 >> 9) & Input.Keys.FORWARD_DEL) | RendererCapabilities.DECODER_SUPPORT_MASK);
                    composerStartRestartGroup.endReplaceGroup();
                } else if (i8 != 2) {
                    composerStartRestartGroup.startReplaceGroup(1400172785);
                    composerStartRestartGroup.endReplaceGroup();
                    qu.f();
                    return;
                } else {
                    composerStartRestartGroup.startReplaceGroup(1400182354);
                    Object objRememberedValue8 = composerStartRestartGroup.rememberedValue();
                    if (objRememberedValue8 == companion.getEmpty()) {
                        objRememberedValue8 = new vb1(2, mutableState2);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue8);
                    }
                    x(subtitleVersionPrioritySettings3, function2, (Function0) objRememberedValue8, composerStartRestartGroup, ((i2 >> 9) & Input.Keys.FORWARD_DEL) | RendererCapabilities.DECODER_SUPPORT_MASK);
                    composerStartRestartGroup.endReplaceGroup();
                }
                composerStartRestartGroup.endReplaceGroup();
            } else {
                composerStartRestartGroup.startReplaceGroup(456179439);
                composerStartRestartGroup.endReplaceGroup();
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            subtitlePrioritySortType2 = subtitlePrioritySortType;
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new eh((Object) subtitlePrioritySortType2, (Object) subtitleVersionPrioritySettings, (Object) focusRequester, (Object) function1, (Object) function2, i, 8));
        }
    }
}
