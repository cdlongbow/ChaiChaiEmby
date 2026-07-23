package defpackage;

import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScope;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnScopeInstance;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.RowKt;
import androidx.compose.foundation.layout.RowScopeInstance;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.lazy.LazyItemScope;
import androidx.compose.material.icons.Icons;
import androidx.compose.material.icons.filled.CheckKt;
import androidx.compose.material3.IconKt;
import androidx.compose.material3.MaterialTheme;
import androidx.compose.material3.TextKt;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.Updater;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.ColorKt;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.unit.Dp;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class g2 implements Function3 {
    public final /* synthetic */ int a;
    public final /* synthetic */ boolean b;

    public /* synthetic */ g2(boolean z, int i) {
        this.a = i;
        this.b = z;
    }

    @Override // kotlin.jvm.functions.Function3
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        long jD;
        int i = this.a;
        boolean z = this.b;
        switch (i) {
            case 0:
                Composer composer = (Composer) obj2;
                int iIntValue = ((Integer) obj3).intValue();
                ((LazyItemScope) obj).getClass();
                if (composer.shouldExecute((iIntValue & 17) != 16, iIntValue & 1)) {
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(1871802193, iIntValue, -1, "com.dh.myembyapp.ui.screens.addserver.AddServerScreen.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (AddServerScreen.kt:391)");
                    }
                    String str = z ? "编辑服务器" : "添加服务器";
                    MaterialTheme materialTheme = MaterialTheme.INSTANCE;
                    int i2 = MaterialTheme.$stable;
                    TextKt.m3048TextNvy7gAk(str, null, materialTheme.getColorScheme(composer, i2).getPrimary(), null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, materialTheme.getTypography(composer, i2).getTitleSmall(), composer, 0, 0, 131066);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                } else {
                    composer.skipToGroupEnd();
                }
                break;
            case 1:
                Composer composer2 = (Composer) obj2;
                int iIntValue2 = ((Integer) obj3).intValue();
                ((BoxScope) obj).getClass();
                if (composer2.shouldExecute((iIntValue2 & 17) != 16, iIntValue2 & 1)) {
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-1250236206, iIntValue2, -1, "com.dh.myembyapp.ui.screens.player.components.DecoderSelectionOverlay.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (DecoderSelectionOverlay.kt:448)");
                    }
                    Modifier.Companion companion = Modifier.INSTANCE;
                    Modifier modifierM999padding3ABfNKs = PaddingKt.m999padding3ABfNKs(SizeKt.fillMaxWidth$default(companion, 0.0f, 1, null), Dp.m7813constructorimpl(16.0f));
                    Arrangement arrangement = Arrangement.INSTANCE;
                    Arrangement.HorizontalOrVertical spaceBetween = arrangement.getSpaceBetween();
                    Alignment.Companion companion2 = Alignment.INSTANCE;
                    MeasurePolicy measurePolicyRowMeasurePolicy = RowKt.rowMeasurePolicy(spaceBetween, companion2.getCenterVertically(), composer2, 54);
                    long currentCompositeKeyHashCode = ComposablesKt.getCurrentCompositeKeyHashCode(composer2, 0);
                    int i3 = (int) (currentCompositeKeyHashCode ^ (currentCompositeKeyHashCode >>> 32));
                    CompositionLocalMap currentCompositionLocalMap = composer2.getCurrentCompositionLocalMap();
                    Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(composer2, modifierM999padding3ABfNKs);
                    ComposeUiNode.Companion companion3 = ComposeUiNode.INSTANCE;
                    Function0<ComposeUiNode> constructor = companion3.getConstructor();
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
                    mr.z(companion3, composerM4318constructorimpl, measurePolicyRowMeasurePolicy, composerM4318constructorimpl, currentCompositionLocalMap);
                    Updater.m4326setimpl(composerM4318constructorimpl, modifierMaterializeModifier, (Function2<? super T, ? super Modifier, Unit>) id.h(companion3, composerM4318constructorimpl, Integer.valueOf(i3), composerM4318constructorimpl));
                    Modifier modifierE = zs1.E(RowScopeInstance.INSTANCE, companion, 1.0f, false, 2, null);
                    MeasurePolicy measurePolicyColumnMeasurePolicy = ColumnKt.columnMeasurePolicy(arrangement.m712spacedBy0680j_4(Dp.m7813constructorimpl(4.0f)), companion2.getStart(), composer2, 6);
                    long currentCompositeKeyHashCode2 = ComposablesKt.getCurrentCompositeKeyHashCode(composer2, 0);
                    int i4 = (int) (currentCompositeKeyHashCode2 ^ (currentCompositeKeyHashCode2 >>> 32));
                    CompositionLocalMap currentCompositionLocalMap2 = composer2.getCurrentCompositionLocalMap();
                    Modifier modifierMaterializeModifier2 = ComposedModifierKt.materializeModifier(composer2, modifierE);
                    Function0<ComposeUiNode> constructor2 = companion3.getConstructor();
                    if (composer2.getApplier() == null) {
                        ComposablesKt.invalidApplier();
                    }
                    composer2.startReusableNode();
                    if (composer2.getInserting()) {
                        composer2.createNode(constructor2);
                    } else {
                        composer2.useNode();
                    }
                    Composer composerM4318constructorimpl2 = Updater.m4318constructorimpl(composer2);
                    mr.z(companion3, composerM4318constructorimpl2, measurePolicyColumnMeasurePolicy, composerM4318constructorimpl2, currentCompositionLocalMap2);
                    Updater.m4326setimpl(composerM4318constructorimpl2, modifierMaterializeModifier2, (Function2<? super T, ? super Modifier, Unit>) id.h(companion3, composerM4318constructorimpl2, Integer.valueOf(i4), composerM4318constructorimpl2));
                    ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.INSTANCE;
                    MaterialTheme materialTheme2 = MaterialTheme.INSTANCE;
                    int i5 = MaterialTheme.$stable;
                    TextStyle bodyLarge = materialTheme2.getTypography(composer2, i5).getBodyLarge();
                    Color.Companion companion4 = Color.INSTANCE;
                    TextKt.m3048TextNvy7gAk("DV7 兼容播放", null, z ? companion4.m5189getWhite0d7_KjU() : companion4.m5182getGray0d7_KjU(), null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, bodyLarge, composer2, 6, 0, 131066);
                    TextKt.m3048TextNvy7gAk("非杜比设备建议开启，若原生支持请关闭", null, Color.m5151copywmQWz5c$default(Color.INSTANCE.m5189getWhite0d7_KjU(), 0.6f, 0.0f, 0.0f, 0.0f, 14, null), null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, materialTheme2.getTypography(composer2, i5).getBodySmall(), composer2, 390, 0, 131066);
                    composer2.endNode();
                    if (z) {
                        composer2.startReplaceGroup(1579514832);
                        IconKt.m2496Iconww6aTOc(CheckKt.getCheck(Icons.INSTANCE.getDefault()), "已启用", SizeKt.m1064size3ABfNKs(companion, Dp.m7813constructorimpl(24.0f)), ColorKt.Color(4283215696L), composer2, 3504, 0);
                        composer2.endReplaceGroup();
                    } else {
                        composer2.startReplaceGroup(1579813548);
                        composer2.endReplaceGroup();
                    }
                    composer2.endNode();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                } else {
                    composer2.skipToGroupEnd();
                }
                break;
            case 2:
                Composer composer3 = (Composer) obj2;
                int iIntValue3 = ((Integer) obj3).intValue();
                ((BoxScope) obj).getClass();
                if (composer3.shouldExecute((iIntValue3 & 17) != 16, iIntValue3 & 1)) {
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-1182227659, iIntValue3, -1, "com.dh.myembyapp.ui.screens.player.components.DecoderSelectionOverlay.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (DecoderSelectionOverlay.kt:349)");
                    }
                    Modifier.Companion companion5 = Modifier.INSTANCE;
                    Modifier modifierM999padding3ABfNKs2 = PaddingKt.m999padding3ABfNKs(SizeKt.fillMaxWidth$default(companion5, 0.0f, 1, null), Dp.m7813constructorimpl(16.0f));
                    Arrangement arrangement2 = Arrangement.INSTANCE;
                    Arrangement.HorizontalOrVertical spaceBetween2 = arrangement2.getSpaceBetween();
                    Alignment.Companion companion6 = Alignment.INSTANCE;
                    MeasurePolicy measurePolicyRowMeasurePolicy2 = RowKt.rowMeasurePolicy(spaceBetween2, companion6.getCenterVertically(), composer3, 54);
                    long currentCompositeKeyHashCode3 = ComposablesKt.getCurrentCompositeKeyHashCode(composer3, 0);
                    int i6 = (int) (currentCompositeKeyHashCode3 ^ (currentCompositeKeyHashCode3 >>> 32));
                    CompositionLocalMap currentCompositionLocalMap3 = composer3.getCurrentCompositionLocalMap();
                    Modifier modifierMaterializeModifier3 = ComposedModifierKt.materializeModifier(composer3, modifierM999padding3ABfNKs2);
                    ComposeUiNode.Companion companion7 = ComposeUiNode.INSTANCE;
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
                    mr.z(companion7, composerM4318constructorimpl3, measurePolicyRowMeasurePolicy2, composerM4318constructorimpl3, currentCompositionLocalMap3);
                    Updater.m4326setimpl(composerM4318constructorimpl3, modifierMaterializeModifier3, (Function2<? super T, ? super Modifier, Unit>) id.h(companion7, composerM4318constructorimpl3, Integer.valueOf(i6), composerM4318constructorimpl3));
                    Modifier modifierE2 = zs1.E(RowScopeInstance.INSTANCE, companion5, 1.0f, false, 2, null);
                    MeasurePolicy measurePolicyColumnMeasurePolicy2 = ColumnKt.columnMeasurePolicy(arrangement2.m712spacedBy0680j_4(Dp.m7813constructorimpl(4.0f)), companion6.getStart(), composer3, 6);
                    long currentCompositeKeyHashCode4 = ComposablesKt.getCurrentCompositeKeyHashCode(composer3, 0);
                    int i7 = (int) (currentCompositeKeyHashCode4 ^ (currentCompositeKeyHashCode4 >>> 32));
                    CompositionLocalMap currentCompositionLocalMap4 = composer3.getCurrentCompositionLocalMap();
                    Modifier modifierMaterializeModifier4 = ComposedModifierKt.materializeModifier(composer3, modifierE2);
                    Function0<ComposeUiNode> constructor4 = companion7.getConstructor();
                    if (composer3.getApplier() == null) {
                        ComposablesKt.invalidApplier();
                    }
                    composer3.startReusableNode();
                    if (composer3.getInserting()) {
                        composer3.createNode(constructor4);
                    } else {
                        composer3.useNode();
                    }
                    Composer composerM4318constructorimpl4 = Updater.m4318constructorimpl(composer3);
                    mr.z(companion7, composerM4318constructorimpl4, measurePolicyColumnMeasurePolicy2, composerM4318constructorimpl4, currentCompositionLocalMap4);
                    Updater.m4326setimpl(composerM4318constructorimpl4, modifierMaterializeModifier4, (Function2<? super T, ? super Modifier, Unit>) id.h(companion7, composerM4318constructorimpl4, Integer.valueOf(i7), composerM4318constructorimpl4));
                    ColumnScopeInstance columnScopeInstance2 = ColumnScopeInstance.INSTANCE;
                    MaterialTheme materialTheme3 = MaterialTheme.INSTANCE;
                    int i8 = MaterialTheme.$stable;
                    TextStyle bodyLarge2 = materialTheme3.getTypography(composer3, i8).getBodyLarge();
                    Color.Companion companion8 = Color.INSTANCE;
                    TextKt.m3048TextNvy7gAk("音频直通优先", null, z ? companion8.m5189getWhite0d7_KjU() : companion8.m5182getGray0d7_KjU(), null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, bodyLarge2, composer3, 6, 0, 131066);
                    TextKt.m3048TextNvy7gAk("外接功放/回音壁时尝试优先让系统直通", null, Color.m5151copywmQWz5c$default(Color.INSTANCE.m5189getWhite0d7_KjU(), 0.6f, 0.0f, 0.0f, 0.0f, 14, null), null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, materialTheme3.getTypography(composer3, i8).getBodySmall(), composer3, 390, 0, 131066);
                    composer3.endNode();
                    if (z) {
                        composer3.startReplaceGroup(397588685);
                        IconKt.m2496Iconww6aTOc(CheckKt.getCheck(Icons.INSTANCE.getDefault()), "已启用", SizeKt.m1064size3ABfNKs(companion5, Dp.m7813constructorimpl(24.0f)), ColorKt.Color(4283215696L), composer3, 3504, 0);
                        composer3.endReplaceGroup();
                    } else {
                        composer3.startReplaceGroup(397887401);
                        composer3.endReplaceGroup();
                    }
                    composer3.endNode();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                } else {
                    composer3.skipToGroupEnd();
                }
                break;
            case 3:
                Composer composer4 = (Composer) obj2;
                int iIntValue4 = ((Integer) obj3).intValue();
                ((BoxScope) obj).getClass();
                if (composer4.shouldExecute((iIntValue4 & 17) != 16, iIntValue4 & 1)) {
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(272097622, iIntValue4, -1, "com.dh.myembyapp.ui.screens.player.components.DecoderSelectionOverlay.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (DecoderSelectionOverlay.kt:292)");
                    }
                    Modifier.Companion companion9 = Modifier.INSTANCE;
                    Modifier modifierM999padding3ABfNKs3 = PaddingKt.m999padding3ABfNKs(SizeKt.fillMaxWidth$default(companion9, 0.0f, 1, null), Dp.m7813constructorimpl(16.0f));
                    MeasurePolicy measurePolicyRowMeasurePolicy3 = RowKt.rowMeasurePolicy(Arrangement.INSTANCE.getSpaceBetween(), Alignment.INSTANCE.getCenterVertically(), composer4, 54);
                    long currentCompositeKeyHashCode5 = ComposablesKt.getCurrentCompositeKeyHashCode(composer4, 0);
                    int i9 = (int) (currentCompositeKeyHashCode5 ^ (currentCompositeKeyHashCode5 >>> 32));
                    CompositionLocalMap currentCompositionLocalMap5 = composer4.getCurrentCompositionLocalMap();
                    Modifier modifierMaterializeModifier5 = ComposedModifierKt.materializeModifier(composer4, modifierM999padding3ABfNKs3);
                    ComposeUiNode.Companion companion10 = ComposeUiNode.INSTANCE;
                    Function0<ComposeUiNode> constructor5 = companion10.getConstructor();
                    if (composer4.getApplier() == null) {
                        ComposablesKt.invalidApplier();
                    }
                    composer4.startReusableNode();
                    if (composer4.getInserting()) {
                        composer4.createNode(constructor5);
                    } else {
                        composer4.useNode();
                    }
                    Composer composerM4318constructorimpl5 = Updater.m4318constructorimpl(composer4);
                    mr.z(companion10, composerM4318constructorimpl5, measurePolicyRowMeasurePolicy3, composerM4318constructorimpl5, currentCompositionLocalMap5);
                    Updater.m4326setimpl(composerM4318constructorimpl5, modifierMaterializeModifier5, (Function2<? super T, ? super Modifier, Unit>) id.h(companion10, composerM4318constructorimpl5, Integer.valueOf(i9), composerM4318constructorimpl5));
                    RowScopeInstance rowScopeInstance = RowScopeInstance.INSTANCE;
                    TextStyle bodyLarge3 = MaterialTheme.INSTANCE.getTypography(composer4, MaterialTheme.$stable).getBodyLarge();
                    Color.Companion companion11 = Color.INSTANCE;
                    TextKt.m3048TextNvy7gAk("强制FFmpeg解码音频", null, z ? companion11.m5189getWhite0d7_KjU() : companion11.m5182getGray0d7_KjU(), null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, bodyLarge3, composer4, 6, 0, 131066);
                    if (z) {
                        composer4.startReplaceGroup(-1428573844);
                        IconKt.m2496Iconww6aTOc(CheckKt.getCheck(Icons.INSTANCE.getDefault()), "已启用", SizeKt.m1064size3ABfNKs(companion9, Dp.m7813constructorimpl(24.0f)), ColorKt.Color(4283215696L), composer4, 3504, 0);
                        composer4.endReplaceGroup();
                    } else {
                        composer4.startReplaceGroup(-1428275128);
                        composer4.endReplaceGroup();
                    }
                    composer4.endNode();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                } else {
                    composer4.skipToGroupEnd();
                }
                break;
            default:
                Composer composer5 = (Composer) obj2;
                int iIntValue5 = ((Integer) obj3).intValue();
                ((BoxScope) obj).getClass();
                if (composer5.shouldExecute((iIntValue5 & 17) != 16, iIntValue5 & 1)) {
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-2115543552, iIntValue5, -1, "com.dh.myembyapp.ui.components.ProxySwitch.<anonymous> (ProxyConfigDialog.kt:696)");
                    }
                    Modifier.Companion companion12 = Modifier.INSTANCE;
                    Modifier modifierM999padding3ABfNKs4 = PaddingKt.m999padding3ABfNKs(SizeKt.fillMaxWidth$default(companion12, 0.0f, 1, null), Dp.m7813constructorimpl(12.0f));
                    Arrangement.HorizontalOrVertical spaceBetween3 = Arrangement.INSTANCE.getSpaceBetween();
                    Alignment.Companion companion13 = Alignment.INSTANCE;
                    MeasurePolicy measurePolicyRowMeasurePolicy4 = RowKt.rowMeasurePolicy(spaceBetween3, companion13.getCenterVertically(), composer5, 54);
                    long currentCompositeKeyHashCode6 = ComposablesKt.getCurrentCompositeKeyHashCode(composer5, 0);
                    int i10 = (int) (currentCompositeKeyHashCode6 ^ (currentCompositeKeyHashCode6 >>> 32));
                    CompositionLocalMap currentCompositionLocalMap6 = composer5.getCurrentCompositionLocalMap();
                    Modifier modifierMaterializeModifier6 = ComposedModifierKt.materializeModifier(composer5, modifierM999padding3ABfNKs4);
                    ComposeUiNode.Companion companion14 = ComposeUiNode.INSTANCE;
                    Function0<ComposeUiNode> constructor6 = companion14.getConstructor();
                    if (composer5.getApplier() == null) {
                        ComposablesKt.invalidApplier();
                    }
                    composer5.startReusableNode();
                    if (composer5.getInserting()) {
                        composer5.createNode(constructor6);
                    } else {
                        composer5.useNode();
                    }
                    Composer composerM4318constructorimpl6 = Updater.m4318constructorimpl(composer5);
                    mr.z(companion14, composerM4318constructorimpl6, measurePolicyRowMeasurePolicy4, composerM4318constructorimpl6, currentCompositionLocalMap6);
                    Updater.m4326setimpl(composerM4318constructorimpl6, modifierMaterializeModifier6, (Function2<? super T, ? super Modifier, Unit>) id.h(companion14, composerM4318constructorimpl6, Integer.valueOf(i10), composerM4318constructorimpl6));
                    RowScopeInstance rowScopeInstance2 = RowScopeInstance.INSTANCE;
                    MaterialTheme materialTheme4 = MaterialTheme.INSTANCE;
                    int i11 = MaterialTheme.$stable;
                    TextKt.m3048TextNvy7gAk("启用代理", null, materialTheme4.getColorScheme(composer5, i11).getOnSurface(), null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, materialTheme4.getTypography(composer5, i11).getBodyMedium(), composer5, 6, 0, 131066);
                    Modifier modifierM1050height3ABfNKs = SizeKt.m1050height3ABfNKs(SizeKt.m1069width3ABfNKs(companion12, Dp.m7813constructorimpl(44.0f)), Dp.m7813constructorimpl(24.0f));
                    if (z) {
                        composer5.startReplaceGroup(358526995);
                        jD = zc2.b(false, composer5, 1);
                        composer5.endReplaceGroup();
                    } else {
                        composer5.startReplaceGroup(358615345);
                        jD = zc2.d(false, composer5, 1);
                        composer5.endReplaceGroup();
                    }
                    Modifier modifierM999padding3ABfNKs5 = PaddingKt.m999padding3ABfNKs(kb0.v(12.0f, modifierM1050height3ABfNKs, jD), Dp.m7813constructorimpl(2.0f));
                    MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(z ? companion13.getCenterEnd() : companion13.getCenterStart(), false);
                    long currentCompositeKeyHashCode7 = ComposablesKt.getCurrentCompositeKeyHashCode(composer5, 0);
                    int i12 = (int) (currentCompositeKeyHashCode7 ^ (currentCompositeKeyHashCode7 >>> 32));
                    CompositionLocalMap currentCompositionLocalMap7 = composer5.getCurrentCompositionLocalMap();
                    Modifier modifierMaterializeModifier7 = ComposedModifierKt.materializeModifier(composer5, modifierM999padding3ABfNKs5);
                    Function0<ComposeUiNode> constructor7 = companion14.getConstructor();
                    if (composer5.getApplier() == null) {
                        ComposablesKt.invalidApplier();
                    }
                    composer5.startReusableNode();
                    if (composer5.getInserting()) {
                        composer5.createNode(constructor7);
                    } else {
                        composer5.useNode();
                    }
                    Composer composerM4318constructorimpl7 = Updater.m4318constructorimpl(composer5);
                    mr.z(companion14, composerM4318constructorimpl7, measurePolicyMaybeCachedBoxMeasurePolicy, composerM4318constructorimpl7, currentCompositionLocalMap7);
                    Updater.m4326setimpl(composerM4318constructorimpl7, modifierMaterializeModifier7, (Function2<? super T, ? super Modifier, Unit>) id.h(companion14, composerM4318constructorimpl7, Integer.valueOf(i12), composerM4318constructorimpl7));
                    BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
                    BoxKt.Box(kb0.v(10.0f, SizeKt.m1064size3ABfNKs(companion12, Dp.m7813constructorimpl(20.0f)), zc2.c(true)), composer5, 0);
                    composer5.endNode();
                    composer5.endNode();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                } else {
                    composer5.skipToGroupEnd();
                }
                break;
        }
        return Unit.INSTANCE;
    }
}
