package defpackage;

import androidx.compose.foundation.ImageKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScope;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.RowKt;
import androidx.compose.foundation.layout.RowScope;
import androidx.compose.foundation.layout.RowScopeInstance;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.SpacerKt;
import androidx.compose.material3.MaterialTheme;
import androidx.compose.material3.TextKt;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.Updater;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.ColorFilter;
import androidx.compose.ui.graphics.painter.Painter;
import androidx.compose.ui.layout.ContentScale;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.res.PainterResources_androidKt;
import androidx.compose.ui.text.font.FontWeight;
import androidx.compose.ui.text.input.TextFieldValue;
import androidx.compose.ui.text.style.TextAlign;
import androidx.compose.ui.unit.Dp;
import androidx.compose.ui.unit.TextUnitKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class w91 implements Function3 {
    public final /* synthetic */ int a;
    public final /* synthetic */ MutableState b;

    public /* synthetic */ w91(int i, MutableState mutableState) {
        this.a = i;
        this.b = mutableState;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final Object a(Object obj, Object obj2, Object obj3) {
        Composer composer = (Composer) obj2;
        int iIntValue = ((Integer) obj3).intValue();
        ((RowScope) obj).getClass();
        if (composer.shouldExecute((iIntValue & 17) != 16, iIntValue & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(176377419, iIntValue, -1, "com.dh.myembyapp.ui.components.SettingsDialog.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (SettingsDialog.kt:323)");
            }
            Modifier modifierFillMaxSize$default = SizeKt.fillMaxSize$default(Modifier.INSTANCE, 0.0f, 1, null);
            MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.INSTANCE.getCenter(), false);
            long currentCompositeKeyHashCode = ComposablesKt.getCurrentCompositeKeyHashCode(composer, 0);
            int i = (int) (currentCompositeKeyHashCode ^ (currentCompositeKeyHashCode >>> 32));
            CompositionLocalMap currentCompositionLocalMap = composer.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(composer, modifierFillMaxSize$default);
            ComposeUiNode.Companion companion = ComposeUiNode.INSTANCE;
            Function0<ComposeUiNode> constructor = companion.getConstructor();
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
            mr.z(companion, composerM4318constructorimpl, measurePolicyMaybeCachedBoxMeasurePolicy, composerM4318constructorimpl, currentCompositionLocalMap);
            Updater.m4326setimpl(composerM4318constructorimpl, modifierMaterializeModifier, (Function2<? super T, ? super Modifier, Unit>) id.h(companion, composerM4318constructorimpl, Integer.valueOf(i), composerM4318constructorimpl));
            BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
            TextKt.m3048TextNvy7gAk("关闭", null, hc2.k(jc2.c, ((Boolean) this.b.getValue()).booleanValue(), false, composer, 6, 4), null, 0L, null, null, null, 0L, null, TextAlign.m7696boximpl(TextAlign.INSTANCE.m7703getCentere0LSkKk()), 0L, 0, false, 0, 0, null, MaterialTheme.INSTANCE.getTypography(composer, MaterialTheme.$stable).getBodyMedium(), composer, 6, 0, 130042);
            composer.endNode();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composer.skipToGroupEnd();
        }
        return Unit.INSTANCE;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final Object b(Object obj, Object obj2, Object obj3) {
        Composer composer = (Composer) obj2;
        int iIntValue = ((Integer) obj3).intValue();
        ((RowScope) obj).getClass();
        if (composer.shouldExecute((iIntValue & 17) != 16, iIntValue & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-192207725, iIntValue, -1, "com.dh.myembyapp.ui.components.SubtitleFontUploadDialog.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (SubtitleFontUploadDialog.kt:117)");
            }
            TextKt.m3048TextNvy7gAk("关闭", null, hc2.k(jc2.c, ((Boolean) this.b.getValue()).booleanValue(), false, composer, 6, 4), null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, composer, 6, 0, 262138);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composer.skipToGroupEnd();
        }
        return Unit.INSTANCE;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final Object c(Object obj, Object obj2, Object obj3) {
        Composer composer = (Composer) obj2;
        int iIntValue = ((Integer) obj3).intValue();
        ((RowScope) obj).getClass();
        if (composer.shouldExecute((iIntValue & 17) != 16, iIntValue & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-2035803214, iIntValue, -1, "com.dh.myembyapp.ui.components.ThemeSettingsDialog.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (ThemeSettingsDialog.kt:320)");
            }
            Modifier modifierFillMaxSize$default = SizeKt.fillMaxSize$default(Modifier.INSTANCE, 0.0f, 1, null);
            MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.INSTANCE.getCenter(), false);
            long currentCompositeKeyHashCode = ComposablesKt.getCurrentCompositeKeyHashCode(composer, 0);
            int i = (int) (currentCompositeKeyHashCode ^ (currentCompositeKeyHashCode >>> 32));
            CompositionLocalMap currentCompositionLocalMap = composer.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(composer, modifierFillMaxSize$default);
            ComposeUiNode.Companion companion = ComposeUiNode.INSTANCE;
            Function0<ComposeUiNode> constructor = companion.getConstructor();
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
            mr.z(companion, composerM4318constructorimpl, measurePolicyMaybeCachedBoxMeasurePolicy, composerM4318constructorimpl, currentCompositionLocalMap);
            Updater.m4326setimpl(composerM4318constructorimpl, modifierMaterializeModifier, (Function2<? super T, ? super Modifier, Unit>) id.h(companion, composerM4318constructorimpl, Integer.valueOf(i), composerM4318constructorimpl));
            BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
            TextKt.m3048TextNvy7gAk("取消", null, hc2.k(jc2.c, ((Boolean) this.b.getValue()).booleanValue(), false, composer, 6, 4), null, 0L, null, null, null, 0L, null, TextAlign.m7696boximpl(TextAlign.INSTANCE.m7703getCentere0LSkKk()), 0L, 0, false, 0, 0, null, MaterialTheme.INSTANCE.getTypography(composer, MaterialTheme.$stable).getBodySmall(), composer, 6, 0, 130042);
            composer.endNode();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composer.skipToGroupEnd();
        }
        return Unit.INSTANCE;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.jvm.functions.Function3
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        int i = this.a;
        MutableState mutableState = this.b;
        switch (i) {
            case 0:
                Composer composer = (Composer) obj2;
                int iIntValue = ((Integer) obj3).intValue();
                ((RowScope) obj).getClass();
                if (composer.shouldExecute((iIntValue & 17) != 16, iIntValue & 1)) {
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(608076356, iIntValue, -1, "com.dh.myembyapp.ui.components.OnlineSubtitleConfigDialog.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (OnlineSubtitleConfigDialog.kt:304)");
                    }
                    TextKt.m3048TextNvy7gAk("取消", null, hc2.k(jc2.c, ((Boolean) mutableState.getValue()).booleanValue(), false, composer, 6, 4), null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, composer, 6, 0, 262138);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                } else {
                    composer.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 1:
                Composer composer2 = (Composer) obj2;
                int iIntValue2 = ((Integer) obj3).intValue();
                ((BoxScope) obj).getClass();
                if (composer2.shouldExecute((iIntValue2 & 17) != 16, iIntValue2 & 1)) {
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(1068716069, iIntValue2, -1, "com.dh.myembyapp.ui.components.OnlineSubtitleConfigDialog.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (OnlineSubtitleConfigDialog.kt:224)");
                    }
                    Modifier modifierM1000paddingVpY3zN4 = PaddingKt.m1000paddingVpY3zN4(SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null), Dp.m7813constructorimpl(12.0f), Dp.m7813constructorimpl(10.0f));
                    MeasurePolicy measurePolicyRowMeasurePolicy = RowKt.rowMeasurePolicy(Arrangement.INSTANCE.getSpaceBetween(), Alignment.INSTANCE.getCenterVertically(), composer2, 54);
                    long currentCompositeKeyHashCode = ComposablesKt.getCurrentCompositeKeyHashCode(composer2, 0);
                    int i2 = (int) (currentCompositeKeyHashCode ^ (currentCompositeKeyHashCode >>> 32));
                    CompositionLocalMap currentCompositionLocalMap = composer2.getCurrentCompositionLocalMap();
                    Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(composer2, modifierM1000paddingVpY3zN4);
                    ComposeUiNode.Companion companion = ComposeUiNode.INSTANCE;
                    Function0<ComposeUiNode> constructor = companion.getConstructor();
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
                    mr.z(companion, composerM4318constructorimpl, measurePolicyRowMeasurePolicy, composerM4318constructorimpl, currentCompositionLocalMap);
                    Updater.m4326setimpl(composerM4318constructorimpl, modifierMaterializeModifier, (Function2<? super T, ? super Modifier, Unit>) id.h(companion, composerM4318constructorimpl, Integer.valueOf(i2), composerM4318constructorimpl));
                    RowScopeInstance rowScopeInstance = RowScopeInstance.INSTANCE;
                    MaterialTheme materialTheme = MaterialTheme.INSTANCE;
                    int i3 = MaterialTheme.$stable;
                    TextKt.m3048TextNvy7gAk("启用在线字幕", null, materialTheme.getColorScheme(composer2, i3).getOnSurface(), null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, materialTheme.getTypography(composer2, i3).getBodyMedium(), composer2, 6, 0, 131066);
                    y91.b(((Boolean) mutableState.getValue()).booleanValue(), composer2, 0);
                    composer2.endNode();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                } else {
                    composer2.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 2:
                Composer composer3 = (Composer) obj2;
                int iIntValue3 = ((Integer) obj3).intValue();
                ((RowScope) obj).getClass();
                if (composer3.shouldExecute((iIntValue3 & 17) != 16, iIntValue3 & 1)) {
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(932953219, iIntValue3, -1, "com.dh.myembyapp.ui.components.OnlineSubtitleSearchDialog.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (OnlineSubtitleSearchDialog.kt:426)");
                    }
                    TextKt.m3048TextNvy7gAk("搜索", null, hc2.n(((Boolean) mutableState.getValue()).booleanValue(), false, 2), null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, MaterialTheme.INSTANCE.getTypography(composer3, MaterialTheme.$stable).getBodyMedium(), composer3, 6, 0, 131066);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                } else {
                    composer3.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 3:
                Composer composer4 = (Composer) obj2;
                int iIntValue4 = ((Integer) obj3).intValue();
                ((RowScope) obj).getClass();
                if (composer4.shouldExecute((iIntValue4 & 17) != 16, iIntValue4 & 1)) {
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-349957894, iIntValue4, -1, "com.dh.myembyapp.ui.components.OnlineSubtitleSearchDialog.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (OnlineSubtitleSearchDialog.kt:651)");
                    }
                    TextKt.m3048TextNvy7gAk("关闭", null, hc2.q(0, 2, ((Boolean) mutableState.getValue()).booleanValue(), false), null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, MaterialTheme.INSTANCE.getTypography(composer4, MaterialTheme.$stable).getBodyMedium(), composer4, 6, 0, 131066);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                } else {
                    composer4.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 4:
                Function2 function2 = (Function2) obj;
                Composer composer5 = (Composer) obj2;
                int iIntValue5 = ((Integer) obj3).intValue();
                function2.getClass();
                if ((iIntValue5 & 6) == 0) {
                    iIntValue5 |= composer5.changedInstance(function2) ? 4 : 2;
                }
                if (composer5.shouldExecute((iIntValue5 & 19) != 18, iIntValue5 & 1)) {
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-788971163, iIntValue5, -1, "com.dh.myembyapp.ui.components.OnlineSubtitleSearchDialog.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (OnlineSubtitleSearchDialog.kt:400)");
                    }
                    if (((TextFieldValue) mutableState.getValue()).getText().length() == 0) {
                        composer5.startReplaceGroup(2116240645);
                        TextKt.m3048TextNvy7gAk("点击确认后输入关键词", null, Color.INSTANCE.m5182getGray0d7_KjU(), null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, MaterialTheme.INSTANCE.getTypography(composer5, MaterialTheme.$stable).getBodyMedium(), composer5, 390, 0, 131066);
                        composer5.endReplaceGroup();
                    } else {
                        composer5.startReplaceGroup(2116551389);
                        composer5.endReplaceGroup();
                    }
                    if (id.u(composer5, iIntValue5 & 14, function2)) {
                        ComposerKt.traceEventEnd();
                    }
                } else {
                    composer5.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 5:
                Composer composer6 = (Composer) obj2;
                int iIntValue6 = ((Integer) obj3).intValue();
                ((RowScope) obj).getClass();
                if (composer6.shouldExecute((iIntValue6 & 17) != 16, iIntValue6 & 1)) {
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-49367946, iIntValue6, -1, "com.dh.myembyapp.ui.components.OnlineSubtitleFilePickerDialog.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (OnlineSubtitleSearchDialog.kt:867)");
                    }
                    TextKt.m3048TextNvy7gAk("返回", null, hc2.q(0, 2, ((Boolean) mutableState.getValue()).booleanValue(), false), null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, composer6, 6, 0, 262138);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                } else {
                    composer6.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 6:
                Composer composer7 = (Composer) obj2;
                int iIntValue7 = ((Integer) obj3).intValue();
                ((RowScope) obj).getClass();
                if (composer7.shouldExecute((iIntValue7 & 17) != 16, iIntValue7 & 1)) {
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(842422966, iIntValue7, -1, "com.dh.myembyapp.ui.components.OtherSettingsOverlay.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (OtherSettingsOverlay.kt:540)");
                    }
                    TextKt.m3048TextNvy7gAk("关闭", null, hc2.q(0, 2, ((Boolean) mutableState.getValue()).booleanValue(), false), null, TextUnitKt.getSp(14), null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, composer7, 24582, 0, 262122);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                } else {
                    composer7.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 7:
                Composer composer8 = (Composer) obj2;
                int iIntValue8 = ((Integer) obj3).intValue();
                ((RowScope) obj).getClass();
                if (composer8.shouldExecute((iIntValue8 & 17) != 16, iIntValue8 & 1)) {
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(914052845, iIntValue8, -1, "com.dh.myembyapp.ui.components.OtherSettingsOverlay.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (OtherSettingsOverlay.kt:585)");
                    }
                    TextKt.m3048TextNvy7gAk("保存", null, hc2.n(((Boolean) mutableState.getValue()).booleanValue(), false, 2), null, TextUnitKt.getSp(14), null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, composer8, 24582, 0, 262122);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                } else {
                    composer8.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 8:
                Composer composer9 = (Composer) obj2;
                int iIntValue9 = ((Integer) obj3).intValue();
                ((RowScope) obj).getClass();
                if (composer9.shouldExecute((iIntValue9 & 17) != 16, iIntValue9 & 1)) {
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-1049689971, iIntValue9, -1, "com.dh.myembyapp.ui.components.SystemTimePinnedSelector.<anonymous>.<anonymous>.<anonymous> (OtherSettingsOverlay.kt:785)");
                    }
                    TextKt.m3048TextNvy7gAk("完全关闭", SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null), hc2.s(((Boolean) mutableState.getValue()).booleanValue()), null, TextUnitKt.getSp(14), null, null, null, 0L, null, TextAlign.m7696boximpl(TextAlign.INSTANCE.m7703getCentere0LSkKk()), 0L, 0, false, 1, 0, null, null, composer9, 24630, 27648, 236520);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                } else {
                    composer9.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 9:
                Composer composer10 = (Composer) obj2;
                int iIntValue10 = ((Integer) obj3).intValue();
                ((RowScope) obj).getClass();
                if (composer10.shouldExecute((iIntValue10 & 17) != 16, iIntValue10 & 1)) {
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-385165435, iIntValue10, -1, "com.dh.myembyapp.ui.components.SystemTimePinnedSelector.<anonymous>.<anonymous>.<anonymous> (OtherSettingsOverlay.kt:709)");
                    }
                    TextKt.m3048TextNvy7gAk("关闭常驻", SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null), hc2.s(((Boolean) mutableState.getValue()).booleanValue()), null, TextUnitKt.getSp(14), null, null, null, 0L, null, TextAlign.m7696boximpl(TextAlign.INSTANCE.m7703getCentere0LSkKk()), 0L, 0, false, 1, 0, null, null, composer10, 24630, 27648, 236520);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                } else {
                    composer10.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 10:
                Composer composer11 = (Composer) obj2;
                int iIntValue11 = ((Integer) obj3).intValue();
                ((RowScope) obj).getClass();
                if (composer11.shouldExecute((iIntValue11 & 17) != 16, iIntValue11 & 1)) {
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(1950858478, iIntValue11, -1, "com.dh.myembyapp.ui.components.SystemTimePinnedSelector.<anonymous>.<anonymous>.<anonymous> (OtherSettingsOverlay.kt:747)");
                    }
                    TextKt.m3048TextNvy7gAk("开启常驻", SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null), hc2.s(((Boolean) mutableState.getValue()).booleanValue()), null, TextUnitKt.getSp(14), null, null, null, 0L, null, TextAlign.m7696boximpl(TextAlign.INSTANCE.m7703getCentere0LSkKk()), 0L, 0, false, 1, 0, null, null, composer11, 24630, 27648, 236520);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                } else {
                    composer11.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 11:
                Composer composer12 = (Composer) obj2;
                int iIntValue12 = ((Integer) obj3).intValue();
                ((RowScope) obj).getClass();
                if (composer12.shouldExecute((iIntValue12 & 17) != 16, iIntValue12 & 1)) {
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-897920071, iIntValue12, -1, "com.dh.myembyapp.ui.screens.player.components.VersionSelectionDialog.<anonymous>.<anonymous> (PlayerControls.kt:2607)");
                    }
                    TextKt.m3048TextNvy7gAk("取消", null, ((Boolean) mutableState.getValue()).booleanValue() ? jg1.e : jg1.f, null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, composer12, 6, 0, 262138);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                } else {
                    composer12.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 12:
                Composer composer13 = (Composer) obj2;
                int iIntValue13 = ((Integer) obj3).intValue();
                ((RowScope) obj).getClass();
                if (composer13.shouldExecute((iIntValue13 & 17) != 16, iIntValue13 & 1)) {
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-1281341464, iIntValue13, -1, "com.dh.myembyapp.ui.components.ProxyConfigDialog.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (ProxyConfigDialog.kt:433)");
                    }
                    Modifier modifierFillMaxSize$default = SizeKt.fillMaxSize$default(Modifier.INSTANCE, 0.0f, 1, null);
                    MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.INSTANCE.getCenter(), false);
                    long currentCompositeKeyHashCode2 = ComposablesKt.getCurrentCompositeKeyHashCode(composer13, 0);
                    int i4 = (int) (currentCompositeKeyHashCode2 ^ (currentCompositeKeyHashCode2 >>> 32));
                    CompositionLocalMap currentCompositionLocalMap2 = composer13.getCurrentCompositionLocalMap();
                    Modifier modifierMaterializeModifier2 = ComposedModifierKt.materializeModifier(composer13, modifierFillMaxSize$default);
                    ComposeUiNode.Companion companion2 = ComposeUiNode.INSTANCE;
                    Function0<ComposeUiNode> constructor2 = companion2.getConstructor();
                    if (composer13.getApplier() == null) {
                        ComposablesKt.invalidApplier();
                    }
                    composer13.startReusableNode();
                    if (composer13.getInserting()) {
                        composer13.createNode(constructor2);
                    } else {
                        composer13.useNode();
                    }
                    Composer composerM4318constructorimpl2 = Updater.m4318constructorimpl(composer13);
                    mr.z(companion2, composerM4318constructorimpl2, measurePolicyMaybeCachedBoxMeasurePolicy, composerM4318constructorimpl2, currentCompositionLocalMap2);
                    Updater.m4326setimpl(composerM4318constructorimpl2, modifierMaterializeModifier2, (Function2<? super T, ? super Modifier, Unit>) id.h(companion2, composerM4318constructorimpl2, Integer.valueOf(i4), composerM4318constructorimpl2));
                    BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
                    TextKt.m3048TextNvy7gAk("保存", null, hc2.k(jc2.b, ((Boolean) mutableState.getValue()).booleanValue(), false, composer13, 6, 4), null, 0L, null, null, null, 0L, null, TextAlign.m7696boximpl(TextAlign.INSTANCE.m7703getCentere0LSkKk()), 0L, 0, false, 0, 0, null, MaterialTheme.INSTANCE.getTypography(composer13, MaterialTheme.$stable).getBodyMedium(), composer13, 6, 0, 130042);
                    composer13.endNode();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                } else {
                    composer13.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 13:
                Composer composer14 = (Composer) obj2;
                int iIntValue14 = ((Integer) obj3).intValue();
                ((RowScope) obj).getClass();
                if (composer14.shouldExecute((iIntValue14 & 17) != 16, iIntValue14 & 1)) {
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-762738592, iIntValue14, -1, "com.dh.myembyapp.ui.components.ProxyConfigDialog.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (ProxyConfigDialog.kt:328)");
                    }
                    Modifier modifierFillMaxSize$default2 = SizeKt.fillMaxSize$default(Modifier.INSTANCE, 0.0f, 1, null);
                    MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy2 = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.INSTANCE.getCenter(), false);
                    long currentCompositeKeyHashCode3 = ComposablesKt.getCurrentCompositeKeyHashCode(composer14, 0);
                    int i5 = (int) (currentCompositeKeyHashCode3 ^ (currentCompositeKeyHashCode3 >>> 32));
                    CompositionLocalMap currentCompositionLocalMap3 = composer14.getCurrentCompositionLocalMap();
                    Modifier modifierMaterializeModifier3 = ComposedModifierKt.materializeModifier(composer14, modifierFillMaxSize$default2);
                    ComposeUiNode.Companion companion3 = ComposeUiNode.INSTANCE;
                    Function0<ComposeUiNode> constructor3 = companion3.getConstructor();
                    if (composer14.getApplier() == null) {
                        ComposablesKt.invalidApplier();
                    }
                    composer14.startReusableNode();
                    if (composer14.getInserting()) {
                        composer14.createNode(constructor3);
                    } else {
                        composer14.useNode();
                    }
                    Composer composerM4318constructorimpl3 = Updater.m4318constructorimpl(composer14);
                    mr.z(companion3, composerM4318constructorimpl3, measurePolicyMaybeCachedBoxMeasurePolicy2, composerM4318constructorimpl3, currentCompositionLocalMap3);
                    Updater.m4326setimpl(composerM4318constructorimpl3, modifierMaterializeModifier3, (Function2<? super T, ? super Modifier, Unit>) id.h(companion3, composerM4318constructorimpl3, Integer.valueOf(i5), composerM4318constructorimpl3));
                    BoxScopeInstance boxScopeInstance2 = BoxScopeInstance.INSTANCE;
                    TextKt.m3048TextNvy7gAk("取消", null, hc2.k(jc2.c, ((Boolean) mutableState.getValue()).booleanValue(), false, composer14, 6, 4), null, 0L, null, null, null, 0L, null, TextAlign.m7696boximpl(TextAlign.INSTANCE.m7703getCentere0LSkKk()), 0L, 0, false, 0, 0, null, MaterialTheme.INSTANCE.getTypography(composer14, MaterialTheme.$stable).getBodyMedium(), composer14, 6, 0, 130042);
                    composer14.endNode();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                } else {
                    composer14.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 14:
                Composer composer15 = (Composer) obj2;
                int iIntValue15 = ((Integer) obj3).intValue();
                ((RowScope) obj).getClass();
                if (composer15.shouldExecute((iIntValue15 & 17) != 16, iIntValue15 & 1)) {
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-515652690, iIntValue15, -1, "com.dh.myembyapp.ui.components.QrNetworkSettingsDialog.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (QrNetworkSettingsDialog.kt:189)");
                    }
                    Modifier modifierFillMaxSize$default3 = SizeKt.fillMaxSize$default(Modifier.INSTANCE, 0.0f, 1, null);
                    MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy3 = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.INSTANCE.getCenter(), false);
                    long currentCompositeKeyHashCode4 = ComposablesKt.getCurrentCompositeKeyHashCode(composer15, 0);
                    int i6 = (int) (currentCompositeKeyHashCode4 ^ (currentCompositeKeyHashCode4 >>> 32));
                    CompositionLocalMap currentCompositionLocalMap4 = composer15.getCurrentCompositionLocalMap();
                    Modifier modifierMaterializeModifier4 = ComposedModifierKt.materializeModifier(composer15, modifierFillMaxSize$default3);
                    ComposeUiNode.Companion companion4 = ComposeUiNode.INSTANCE;
                    Function0<ComposeUiNode> constructor4 = companion4.getConstructor();
                    if (composer15.getApplier() == null) {
                        ComposablesKt.invalidApplier();
                    }
                    composer15.startReusableNode();
                    if (composer15.getInserting()) {
                        composer15.createNode(constructor4);
                    } else {
                        composer15.useNode();
                    }
                    Composer composerM4318constructorimpl4 = Updater.m4318constructorimpl(composer15);
                    mr.z(companion4, composerM4318constructorimpl4, measurePolicyMaybeCachedBoxMeasurePolicy3, composerM4318constructorimpl4, currentCompositionLocalMap4);
                    Updater.m4326setimpl(composerM4318constructorimpl4, modifierMaterializeModifier4, (Function2<? super T, ? super Modifier, Unit>) id.h(companion4, composerM4318constructorimpl4, Integer.valueOf(i6), composerM4318constructorimpl4));
                    BoxScopeInstance boxScopeInstance3 = BoxScopeInstance.INSTANCE;
                    TextKt.m3048TextNvy7gAk("取消", null, hc2.k(jc2.c, ((Boolean) mutableState.getValue()).booleanValue(), false, composer15, 6, 4), null, 0L, null, null, null, 0L, null, TextAlign.m7696boximpl(TextAlign.INSTANCE.m7703getCentere0LSkKk()), 0L, 0, false, 0, 0, null, MaterialTheme.INSTANCE.getTypography(composer15, MaterialTheme.$stable).getBodyMedium(), composer15, 6, 0, 130042);
                    composer15.endNode();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                } else {
                    composer15.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 15:
                Composer composer16 = (Composer) obj2;
                int iIntValue16 = ((Integer) obj3).intValue();
                ((RowScope) obj).getClass();
                if (composer16.shouldExecute((iIntValue16 & 17) != 16, iIntValue16 & 1)) {
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-515053033, iIntValue16, -1, "com.dh.myembyapp.ui.components.QrNetworkSettingsDialog.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (QrNetworkSettingsDialog.kt:216)");
                    }
                    Modifier modifierFillMaxSize$default4 = SizeKt.fillMaxSize$default(Modifier.INSTANCE, 0.0f, 1, null);
                    MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy4 = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.INSTANCE.getCenter(), false);
                    long currentCompositeKeyHashCode5 = ComposablesKt.getCurrentCompositeKeyHashCode(composer16, 0);
                    int i7 = (int) (currentCompositeKeyHashCode5 ^ (currentCompositeKeyHashCode5 >>> 32));
                    CompositionLocalMap currentCompositionLocalMap5 = composer16.getCurrentCompositionLocalMap();
                    Modifier modifierMaterializeModifier5 = ComposedModifierKt.materializeModifier(composer16, modifierFillMaxSize$default4);
                    ComposeUiNode.Companion companion5 = ComposeUiNode.INSTANCE;
                    Function0<ComposeUiNode> constructor5 = companion5.getConstructor();
                    if (composer16.getApplier() == null) {
                        ComposablesKt.invalidApplier();
                    }
                    composer16.startReusableNode();
                    if (composer16.getInserting()) {
                        composer16.createNode(constructor5);
                    } else {
                        composer16.useNode();
                    }
                    Composer composerM4318constructorimpl5 = Updater.m4318constructorimpl(composer16);
                    mr.z(companion5, composerM4318constructorimpl5, measurePolicyMaybeCachedBoxMeasurePolicy4, composerM4318constructorimpl5, currentCompositionLocalMap5);
                    Updater.m4326setimpl(composerM4318constructorimpl5, modifierMaterializeModifier5, (Function2<? super T, ? super Modifier, Unit>) id.h(companion5, composerM4318constructorimpl5, Integer.valueOf(i7), composerM4318constructorimpl5));
                    BoxScopeInstance boxScopeInstance4 = BoxScopeInstance.INSTANCE;
                    TextKt.m3048TextNvy7gAk("保存", null, hc2.k(jc2.b, ((Boolean) mutableState.getValue()).booleanValue(), false, composer16, 6, 4), null, 0L, null, null, null, 0L, null, TextAlign.m7696boximpl(TextAlign.INSTANCE.m7703getCentere0LSkKk()), 0L, 0, false, 0, 0, null, MaterialTheme.INSTANCE.getTypography(composer16, MaterialTheme.$stable).getBodyMedium(), composer16, 6, 0, 130042);
                    composer16.endNode();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                } else {
                    composer16.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 16:
                Composer composer17 = (Composer) obj2;
                int iIntValue17 = ((Integer) obj3).intValue();
                ((RowScope) obj).getClass();
                if (composer17.shouldExecute((iIntValue17 & 17) != 16, iIntValue17 & 1)) {
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(1928564499, iIntValue17, -1, "com.dh.myembyapp.ui.screens.serverlist.AggregateSearchButton.<anonymous> (ServerListScreen.kt:1516)");
                    }
                    Modifier.Companion companion6 = Modifier.INSTANCE;
                    Modifier modifierM1001paddingVpY3zN4$default = PaddingKt.m1001paddingVpY3zN4$default(SizeKt.fillMaxSize$default(companion6, 0.0f, 1, null), Dp.m7813constructorimpl(24.0f), 0.0f, 2, null);
                    MeasurePolicy measurePolicyRowMeasurePolicy2 = RowKt.rowMeasurePolicy(Arrangement.INSTANCE.getCenter(), Alignment.INSTANCE.getCenterVertically(), composer17, 54);
                    long currentCompositeKeyHashCode6 = ComposablesKt.getCurrentCompositeKeyHashCode(composer17, 0);
                    int i8 = (int) ((currentCompositeKeyHashCode6 >>> 32) ^ currentCompositeKeyHashCode6);
                    CompositionLocalMap currentCompositionLocalMap6 = composer17.getCurrentCompositionLocalMap();
                    Modifier modifierMaterializeModifier6 = ComposedModifierKt.materializeModifier(composer17, modifierM1001paddingVpY3zN4$default);
                    ComposeUiNode.Companion companion7 = ComposeUiNode.INSTANCE;
                    Function0<ComposeUiNode> constructor6 = companion7.getConstructor();
                    if (composer17.getApplier() == null) {
                        ComposablesKt.invalidApplier();
                    }
                    composer17.startReusableNode();
                    if (composer17.getInserting()) {
                        composer17.createNode(constructor6);
                    } else {
                        composer17.useNode();
                    }
                    Composer composerM4318constructorimpl6 = Updater.m4318constructorimpl(composer17);
                    mr.z(companion7, composerM4318constructorimpl6, measurePolicyRowMeasurePolicy2, composerM4318constructorimpl6, currentCompositionLocalMap6);
                    Updater.m4326setimpl(composerM4318constructorimpl6, modifierMaterializeModifier6, (Function2<? super T, ? super Modifier, Unit>) id.h(companion7, composerM4318constructorimpl6, Integer.valueOf(i8), composerM4318constructorimpl6));
                    RowScopeInstance rowScopeInstance2 = RowScopeInstance.INSTANCE;
                    ImageKt.Image(PainterResources_androidKt.painterResource(zr1.chaichai, composer17, 0), "聚合视界", SizeKt.m1064size3ABfNKs(companion6, Dp.m7813constructorimpl(40.0f)), (Alignment) null, (ContentScale) null, 0.0f, (ColorFilter) null, composer17, Painter.$stable | 432, 120);
                    SpacerKt.Spacer(SizeKt.m1069width3ABfNKs(companion6, Dp.m7813constructorimpl(16.0f)), composer17, 6);
                    TextKt.m3048TextNvy7gAk("聚合视界", null, hc2.k(jc2.b, ((Boolean) mutableState.getValue()).booleanValue(), false, composer17, 6, 4), null, 0L, null, FontWeight.INSTANCE.getMedium(), null, 0L, null, null, 0L, 0, false, 0, 0, null, MaterialTheme.INSTANCE.getTypography(composer17, MaterialTheme.$stable).getTitleLarge(), composer17, 1572870, 0, 131002);
                    composer17.endNode();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                } else {
                    composer17.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 17:
                return a(obj, obj2, obj3);
            case 18:
                return b(obj, obj2, obj3);
            case 19:
                return c(obj, obj2, obj3);
            default:
                Composer composer18 = (Composer) obj2;
                int iIntValue18 = ((Integer) obj3).intValue();
                ((RowScope) obj).getClass();
                if (composer18.shouldExecute((iIntValue18 & 17) != 16, iIntValue18 & 1)) {
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(250558761, iIntValue18, -1, "com.dh.myembyapp.ui.components.ThemeSettingsDialog.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (ThemeSettingsDialog.kt:360)");
                    }
                    Modifier modifierFillMaxSize$default5 = SizeKt.fillMaxSize$default(Modifier.INSTANCE, 0.0f, 1, null);
                    MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy5 = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.INSTANCE.getCenter(), false);
                    long currentCompositeKeyHashCode7 = ComposablesKt.getCurrentCompositeKeyHashCode(composer18, 0);
                    int i9 = (int) (currentCompositeKeyHashCode7 ^ (currentCompositeKeyHashCode7 >>> 32));
                    CompositionLocalMap currentCompositionLocalMap7 = composer18.getCurrentCompositionLocalMap();
                    Modifier modifierMaterializeModifier7 = ComposedModifierKt.materializeModifier(composer18, modifierFillMaxSize$default5);
                    ComposeUiNode.Companion companion8 = ComposeUiNode.INSTANCE;
                    Function0<ComposeUiNode> constructor7 = companion8.getConstructor();
                    if (composer18.getApplier() == null) {
                        ComposablesKt.invalidApplier();
                    }
                    composer18.startReusableNode();
                    if (composer18.getInserting()) {
                        composer18.createNode(constructor7);
                    } else {
                        composer18.useNode();
                    }
                    Composer composerM4318constructorimpl7 = Updater.m4318constructorimpl(composer18);
                    mr.z(companion8, composerM4318constructorimpl7, measurePolicyMaybeCachedBoxMeasurePolicy5, composerM4318constructorimpl7, currentCompositionLocalMap7);
                    Updater.m4326setimpl(composerM4318constructorimpl7, modifierMaterializeModifier7, (Function2<? super T, ? super Modifier, Unit>) id.h(companion8, composerM4318constructorimpl7, Integer.valueOf(i9), composerM4318constructorimpl7));
                    BoxScopeInstance boxScopeInstance5 = BoxScopeInstance.INSTANCE;
                    TextKt.m3048TextNvy7gAk("保存", null, hc2.k(jc2.b, ((Boolean) mutableState.getValue()).booleanValue(), false, composer18, 6, 4), null, 0L, null, null, null, 0L, null, TextAlign.m7696boximpl(TextAlign.INSTANCE.m7703getCentere0LSkKk()), 0L, 0, false, 0, 0, null, MaterialTheme.INSTANCE.getTypography(composer18, MaterialTheme.$stable).getBodySmall(), composer18, 6, 0, 130042);
                    composer18.endNode();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                } else {
                    composer18.skipToGroupEnd();
                }
                return Unit.INSTANCE;
        }
    }
}
