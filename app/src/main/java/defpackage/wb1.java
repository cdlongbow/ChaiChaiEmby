package defpackage;

import androidx.compose.foundation.BackgroundKt;
import androidx.compose.foundation.ScrollKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnScopeInstance;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.material3.TextKt;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.Updater;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.focus.FocusRequester;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.ColorKt;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.unit.Dp;
import androidx.compose.ui.unit.TextUnitKt;
import androidx.media3.exoplayer.RendererCapabilities;
import com.dh.myembyapp.data.model.SubtitleFormatPriorityType;
import com.dh.myembyapp.data.model.SubtitleLanguagePriorityType;
import com.dh.myembyapp.data.model.SubtitleVersionPrioritySettings;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class wb1 implements Function2 {
    public final /* synthetic */ int a;
    public final /* synthetic */ SubtitleVersionPrioritySettings b;
    public final /* synthetic */ FocusRequester c;
    public final /* synthetic */ Function1 d;

    public /* synthetic */ wb1(SubtitleVersionPrioritySettings subtitleVersionPrioritySettings, FocusRequester focusRequester, Function1 function1, int i) {
        this.a = i;
        this.b = subtitleVersionPrioritySettings;
        this.c = focusRequester;
        this.d = function1;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        int i = this.a;
        Function1 function1 = this.d;
        FocusRequester focusRequester = this.c;
        SubtitleVersionPrioritySettings subtitleVersionPrioritySettings = this.b;
        switch (i) {
            case 0:
                Composer composer = (Composer) obj;
                int iIntValue = ((Integer) obj2).intValue();
                if (composer.shouldExecute((iIntValue & 3) != 2, iIntValue & 1)) {
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(739199120, iIntValue, -1, "com.dh.myembyapp.ui.components.SubtitleFormatPriorityDialog.<anonymous> (OtherSettingsOverlay.kt:2037)");
                    }
                    Modifier.Companion companion = Modifier.INSTANCE;
                    Modifier modifierFillMaxSize$default = SizeKt.fillMaxSize$default(companion, 0.0f, 1, null);
                    Color.Companion companion2 = Color.INSTANCE;
                    Modifier modifierM275backgroundbw27NRU$default = BackgroundKt.m275backgroundbw27NRU$default(modifierFillMaxSize$default, Color.m5151copywmQWz5c$default(companion2.m5178getBlack0d7_KjU(), 0.35f, 0.0f, 0.0f, 0.0f, 14, null), null, 2, null);
                    Alignment.Companion companion3 = Alignment.INSTANCE;
                    MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(companion3.getCenter(), false);
                    long currentCompositeKeyHashCode = ComposablesKt.getCurrentCompositeKeyHashCode(composer, 0);
                    int i2 = (int) (currentCompositeKeyHashCode ^ (currentCompositeKeyHashCode >>> 32));
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
                    Updater.m4326setimpl(composerM4318constructorimpl, modifierMaterializeModifier, (Function2<? super T, ? super Modifier, Unit>) id.h(companion4, composerM4318constructorimpl, Integer.valueOf(i2), composerM4318constructorimpl));
                    BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
                    Modifier modifierM999padding3ABfNKs = PaddingKt.m999padding3ABfNKs(kb0.v(12.0f, SizeKt.m1069width3ABfNKs(companion, Dp.m7813constructorimpl(320.0f)), ColorKt.Color(4280032284L)), Dp.m7813constructorimpl(16.0f));
                    MeasurePolicy measurePolicyColumnMeasurePolicy = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.m712spacedBy0680j_4(Dp.m7813constructorimpl(8.0f)), companion3.getStart(), composer, 6);
                    int i3 = 0;
                    long currentCompositeKeyHashCode2 = ComposablesKt.getCurrentCompositeKeyHashCode(composer, 0);
                    int i4 = (int) (currentCompositeKeyHashCode2 ^ (currentCompositeKeyHashCode2 >>> 32));
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
                    Updater.m4326setimpl(composerM4318constructorimpl2, modifierMaterializeModifier2, (Function2<? super T, ? super Modifier, Unit>) id.h(companion4, composerM4318constructorimpl2, Integer.valueOf(i4), composerM4318constructorimpl2));
                    ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.INSTANCE;
                    TextKt.m3048TextNvy7gAk("字幕格式顺序", null, companion2.m5189getWhite0d7_KjU(), null, TextUnitKt.getSp(16), null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, composer, 24966, 0, 262122);
                    TextKt.m3048TextNvy7gAk("数字越小越优先；全部相同则跳过格式比较。", null, companion2.m5182getGray0d7_KjU(), null, TextUnitKt.getSp(12), null, null, null, 0L, null, null, TextUnitKt.getSp(16), 0, false, 0, 0, null, null, composer, 24966, 48, 260074);
                    composer.startReplaceGroup(266594647);
                    for (SubtitleFormatPriorityType subtitleFormatPriorityType : SubtitleFormatPriorityType.getEntries()) {
                        int i5 = i3 + 1;
                        if (i3 < 0) {
                            CollectionsKt.throwIndexOverflow();
                        }
                        SubtitleFormatPriorityType subtitleFormatPriorityType2 = subtitleFormatPriorityType;
                        String label = subtitleFormatPriorityType2.getLabel();
                        int priorityFor = subtitleVersionPrioritySettings.formatPriorityFor(subtitleFormatPriorityType2);
                        FocusRequester focusRequester2 = i3 == 0 ? focusRequester : null;
                        boolean zChanged = composer.changed(function1) | composer.changedInstance(subtitleVersionPrioritySettings) | composer.changed(subtitleFormatPriorityType2.ordinal());
                        Object objRememberedValue = composer.rememberedValue();
                        if (zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                            objRememberedValue = new ug(function1, subtitleVersionPrioritySettings, subtitleFormatPriorityType2, 17);
                            composer.updateRememberedValue(objRememberedValue);
                        }
                        cc1.u(label, priorityFor, 7, null, focusRequester2, (Function0) objRememberedValue, composer, RendererCapabilities.DECODER_SUPPORT_MASK);
                        i3 = i5;
                    }
                    composer.endReplaceGroup();
                    composer.endNode();
                    composer.endNode();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                } else {
                    composer.skipToGroupEnd();
                }
                break;
            default:
                Composer composer2 = (Composer) obj;
                int iIntValue2 = ((Integer) obj2).intValue();
                if (composer2.shouldExecute((iIntValue2 & 3) != 2, iIntValue2 & 1)) {
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(233858511, iIntValue2, -1, "com.dh.myembyapp.ui.components.SubtitleLanguagePriorityDialog.<anonymous> (OtherSettingsOverlay.kt:1963)");
                    }
                    Modifier.Companion companion5 = Modifier.INSTANCE;
                    Modifier modifierFillMaxSize$default2 = SizeKt.fillMaxSize$default(companion5, 0.0f, 1, null);
                    Color.Companion companion6 = Color.INSTANCE;
                    Modifier modifierM275backgroundbw27NRU$default2 = BackgroundKt.m275backgroundbw27NRU$default(modifierFillMaxSize$default2, Color.m5151copywmQWz5c$default(companion6.m5178getBlack0d7_KjU(), 0.35f, 0.0f, 0.0f, 0.0f, 14, null), null, 2, null);
                    Alignment.Companion companion7 = Alignment.INSTANCE;
                    MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy2 = BoxKt.maybeCachedBoxMeasurePolicy(companion7.getCenter(), false);
                    long currentCompositeKeyHashCode3 = ComposablesKt.getCurrentCompositeKeyHashCode(composer2, 0);
                    int i6 = (int) (currentCompositeKeyHashCode3 ^ (currentCompositeKeyHashCode3 >>> 32));
                    CompositionLocalMap currentCompositionLocalMap3 = composer2.getCurrentCompositionLocalMap();
                    Modifier modifierMaterializeModifier3 = ComposedModifierKt.materializeModifier(composer2, modifierM275backgroundbw27NRU$default2);
                    ComposeUiNode.Companion companion8 = ComposeUiNode.INSTANCE;
                    Function0<ComposeUiNode> constructor3 = companion8.getConstructor();
                    if (composer2.getApplier() == null) {
                        ComposablesKt.invalidApplier();
                    }
                    composer2.startReusableNode();
                    if (composer2.getInserting()) {
                        composer2.createNode(constructor3);
                    } else {
                        composer2.useNode();
                    }
                    Composer composerM4318constructorimpl3 = Updater.m4318constructorimpl(composer2);
                    mr.z(companion8, composerM4318constructorimpl3, measurePolicyMaybeCachedBoxMeasurePolicy2, composerM4318constructorimpl3, currentCompositionLocalMap3);
                    Updater.m4326setimpl(composerM4318constructorimpl3, modifierMaterializeModifier3, (Function2<? super T, ? super Modifier, Unit>) id.h(companion8, composerM4318constructorimpl3, Integer.valueOf(i6), composerM4318constructorimpl3));
                    BoxScopeInstance boxScopeInstance2 = BoxScopeInstance.INSTANCE;
                    Modifier modifierM999padding3ABfNKs2 = PaddingKt.m999padding3ABfNKs(ScrollKt.verticalScroll$default(kb0.v(12.0f, SizeKt.m1052heightInVpY3zN4$default(SizeKt.m1069width3ABfNKs(companion5, Dp.m7813constructorimpl(360.0f)), 0.0f, Dp.m7813constructorimpl(560.0f), 1, null), ColorKt.Color(4280032284L)), ScrollKt.rememberScrollState(0, composer2, 0, 1), false, null, false, 14, null), Dp.m7813constructorimpl(16.0f));
                    MeasurePolicy measurePolicyColumnMeasurePolicy2 = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.m712spacedBy0680j_4(Dp.m7813constructorimpl(8.0f)), companion7.getStart(), composer2, 6);
                    long currentCompositeKeyHashCode4 = ComposablesKt.getCurrentCompositeKeyHashCode(composer2, 0);
                    int i7 = (int) ((currentCompositeKeyHashCode4 >>> 32) ^ currentCompositeKeyHashCode4);
                    CompositionLocalMap currentCompositionLocalMap4 = composer2.getCurrentCompositionLocalMap();
                    Modifier modifierMaterializeModifier4 = ComposedModifierKt.materializeModifier(composer2, modifierM999padding3ABfNKs2);
                    Function0<ComposeUiNode> constructor4 = companion8.getConstructor();
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
                    mr.z(companion8, composerM4318constructorimpl4, measurePolicyColumnMeasurePolicy2, composerM4318constructorimpl4, currentCompositionLocalMap4);
                    Updater.m4326setimpl(composerM4318constructorimpl4, modifierMaterializeModifier4, (Function2<? super T, ? super Modifier, Unit>) id.h(companion8, composerM4318constructorimpl4, Integer.valueOf(i7), composerM4318constructorimpl4));
                    ColumnScopeInstance columnScopeInstance2 = ColumnScopeInstance.INSTANCE;
                    TextKt.m3048TextNvy7gAk("字幕语言顺序", null, companion6.m5189getWhite0d7_KjU(), null, TextUnitKt.getSp(16), null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, composer2, 24966, 0, 262122);
                    TextKt.m3048TextNvy7gAk("数字越小越优先；全部相同则跳过语言比较。", null, companion6.m5182getGray0d7_KjU(), null, TextUnitKt.getSp(12), null, null, null, 0L, null, null, TextUnitKt.getSp(16), 0, false, 0, 0, null, null, composer2, 24966, 48, 260074);
                    composer2.startReplaceGroup(1846764588);
                    int i8 = 0;
                    for (SubtitleLanguagePriorityType subtitleLanguagePriorityType : SubtitleLanguagePriorityType.getEntries()) {
                        int i9 = i8 + 1;
                        if (i8 < 0) {
                            CollectionsKt.throwIndexOverflow();
                        }
                        SubtitleLanguagePriorityType subtitleLanguagePriorityType2 = subtitleLanguagePriorityType;
                        String label2 = subtitleLanguagePriorityType2.getLabel();
                        int iLanguagePriorityFor = subtitleVersionPrioritySettings.languagePriorityFor(subtitleLanguagePriorityType2);
                        FocusRequester focusRequester3 = i8 == 0 ? focusRequester : null;
                        boolean zChanged2 = composer2.changed(function1) | composer2.changedInstance(subtitleVersionPrioritySettings) | composer2.changed(subtitleLanguagePriorityType2.ordinal());
                        Object objRememberedValue2 = composer2.rememberedValue();
                        if (zChanged2 || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                            objRememberedValue2 = new ug(function1, subtitleVersionPrioritySettings, subtitleLanguagePriorityType2, 18);
                            composer2.updateRememberedValue(objRememberedValue2);
                        }
                        cc1.u(label2, iLanguagePriorityFor, 10, null, focusRequester3, (Function0) objRememberedValue2, composer2, RendererCapabilities.DECODER_SUPPORT_MASK);
                        i8 = i9;
                    }
                    composer2.endReplaceGroup();
                    composer2.endNode();
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
}
