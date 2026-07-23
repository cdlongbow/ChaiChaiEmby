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
import androidx.compose.foundation.layout.SpacerKt;
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
import androidx.compose.ui.text.font.FontWeight;
import androidx.compose.ui.unit.Dp;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class mu0 implements Function3 {
    public final /* synthetic */ int a;
    public final /* synthetic */ String b;
    public final /* synthetic */ String c;
    public final /* synthetic */ boolean d;

    public /* synthetic */ mu0(String str, String str2, boolean z) {
        this.a = 1;
        this.b = str;
        this.c = str2;
        this.d = z;
    }

    /* JADX WARN: Type inference failed for: r3v1 */
    /* JADX WARN: Type inference failed for: r3v2, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r3v9 */
    @Override // kotlin.jvm.functions.Function3
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        Object r3;
        long jD;
        long jD2;
        long jD3;
        int i = this.a;
        boolean z = this.d;
        switch (i) {
            case 0:
                Composer composer = (Composer) obj2;
                int iIntValue = ((Integer) obj3).intValue();
                ((BoxScope) obj).getClass();
                if (composer.shouldExecute((iIntValue & 17) != 16, iIntValue & 1)) {
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-1662618424, iIntValue, -1, "com.dh.myembyapp.ui.components.InterfaceToggleRow.<anonymous> (InterfaceSettingsDialog.kt:417)");
                    }
                    Modifier.Companion companion = Modifier.INSTANCE;
                    Modifier modifierM1000paddingVpY3zN4 = PaddingKt.m1000paddingVpY3zN4(SizeKt.fillMaxWidth$default(companion, 0.0f, 1, null), Dp.m7813constructorimpl(14.0f), Dp.m7813constructorimpl(12.0f));
                    Alignment.Companion companion2 = Alignment.INSTANCE;
                    Alignment.Vertical centerVertically = companion2.getCenterVertically();
                    Arrangement arrangement = Arrangement.INSTANCE;
                    MeasurePolicy measurePolicyRowMeasurePolicy = RowKt.rowMeasurePolicy(arrangement.getSpaceBetween(), centerVertically, composer, 54);
                    long currentCompositeKeyHashCode = ComposablesKt.getCurrentCompositeKeyHashCode(composer, 0);
                    int i2 = (int) (currentCompositeKeyHashCode ^ (currentCompositeKeyHashCode >>> 32));
                    CompositionLocalMap currentCompositionLocalMap = composer.getCurrentCompositionLocalMap();
                    Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(composer, modifierM1000paddingVpY3zN4);
                    ComposeUiNode.Companion companion3 = ComposeUiNode.INSTANCE;
                    Function0<ComposeUiNode> constructor = companion3.getConstructor();
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
                    mr.z(companion3, composerM4318constructorimpl, measurePolicyRowMeasurePolicy, composerM4318constructorimpl, currentCompositionLocalMap);
                    Updater.m4326setimpl(composerM4318constructorimpl, modifierMaterializeModifier, (Function2<? super T, ? super Modifier, Unit>) id.h(companion3, composerM4318constructorimpl, Integer.valueOf(i2), composerM4318constructorimpl));
                    Modifier modifierE = zs1.E(RowScopeInstance.INSTANCE, companion, 1.0f, false, 2, null);
                    MeasurePolicy measurePolicyColumnMeasurePolicy = ColumnKt.columnMeasurePolicy(arrangement.m712spacedBy0680j_4(Dp.m7813constructorimpl(4.0f)), companion2.getStart(), composer, 6);
                    long currentCompositeKeyHashCode2 = ComposablesKt.getCurrentCompositeKeyHashCode(composer, 0);
                    int i3 = (int) ((currentCompositeKeyHashCode2 >>> 32) ^ currentCompositeKeyHashCode2);
                    CompositionLocalMap currentCompositionLocalMap2 = composer.getCurrentCompositionLocalMap();
                    Modifier modifierMaterializeModifier2 = ComposedModifierKt.materializeModifier(composer, modifierE);
                    Function0<ComposeUiNode> constructor2 = companion3.getConstructor();
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
                    mr.z(companion3, composerM4318constructorimpl2, measurePolicyColumnMeasurePolicy, composerM4318constructorimpl2, currentCompositionLocalMap2);
                    Updater.m4326setimpl(composerM4318constructorimpl2, modifierMaterializeModifier2, (Function2<? super T, ? super Modifier, Unit>) id.h(companion3, composerM4318constructorimpl2, Integer.valueOf(i3), composerM4318constructorimpl2));
                    ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.INSTANCE;
                    MaterialTheme materialTheme = MaterialTheme.INSTANCE;
                    int i4 = MaterialTheme.$stable;
                    TextKt.m3048TextNvy7gAk(this.b, null, materialTheme.getColorScheme(composer, i4).getOnSurface(), null, 0L, null, FontWeight.INSTANCE.getSemiBold(), null, 0L, null, null, 0L, 0, false, 0, 0, null, materialTheme.getTypography(composer, i4).getBodyMedium(), composer, 1572864, 0, 131002);
                    TextKt.m3048TextNvy7gAk(this.c, null, Color.m5151copywmQWz5c$default(materialTheme.getColorScheme(composer, i4).getOnSurface(), 0.68f, 0.0f, 0.0f, 0.0f, 14, null), null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, materialTheme.getTypography(composer, i4).getBodySmall(), composer, 0, 0, 131066);
                    composer.endNode();
                    SpacerKt.Spacer(SizeKt.m1069width3ABfNKs(companion, Dp.m7813constructorimpl(12.0f)), composer, 6);
                    Modifier modifierM1050height3ABfNKs = SizeKt.m1050height3ABfNKs(SizeKt.m1069width3ABfNKs(companion, Dp.m7813constructorimpl(44.0f)), Dp.m7813constructorimpl(24.0f));
                    if (z) {
                        composer.startReplaceGroup(1402812811);
                        r3 = 0;
                        jD = zc2.b(false, composer, 1);
                        composer.endReplaceGroup();
                    } else {
                        r3 = 0;
                        composer.startReplaceGroup(1402901161);
                        jD = zc2.d(false, composer, 1);
                        composer.endReplaceGroup();
                    }
                    Modifier modifierM999padding3ABfNKs = PaddingKt.m999padding3ABfNKs(kb0.v(12.0f, modifierM1050height3ABfNKs, jD), Dp.m7813constructorimpl(2.0f));
                    MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(companion2.getTopStart(), r3);
                    long currentCompositeKeyHashCode3 = ComposablesKt.getCurrentCompositeKeyHashCode(composer, r3);
                    int i5 = (int) (currentCompositeKeyHashCode3 ^ (currentCompositeKeyHashCode3 >>> 32));
                    CompositionLocalMap currentCompositionLocalMap3 = composer.getCurrentCompositionLocalMap();
                    Modifier modifierMaterializeModifier3 = ComposedModifierKt.materializeModifier(composer, modifierM999padding3ABfNKs);
                    Function0<ComposeUiNode> constructor3 = companion3.getConstructor();
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
                    mr.z(companion3, composerM4318constructorimpl3, measurePolicyMaybeCachedBoxMeasurePolicy, composerM4318constructorimpl3, currentCompositionLocalMap3);
                    Updater.m4326setimpl(composerM4318constructorimpl3, modifierMaterializeModifier3, (Function2<? super T, ? super Modifier, Unit>) id.h(companion3, composerM4318constructorimpl3, Integer.valueOf(i5), composerM4318constructorimpl3));
                    BoxKt.Box(kb0.v(10.0f, BoxScopeInstance.INSTANCE.align(SizeKt.m1064size3ABfNKs(companion, Dp.m7813constructorimpl(20.0f)), z ? companion2.getCenterEnd() : companion2.getCenterStart()), zc2.c(true)), composer, 0);
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
                Composer composer2 = (Composer) obj2;
                int iIntValue2 = ((Integer) obj3).intValue();
                ((BoxScope) obj).getClass();
                if (composer2.shouldExecute((iIntValue2 & 17) != 16, iIntValue2 & 1)) {
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-737295842, iIntValue2, -1, "com.dh.myembyapp.ui.components.AssrtProtocolOption.<anonymous> (OnlineSubtitleConfigDialog.kt:395)");
                    }
                    Modifier.Companion companion4 = Modifier.INSTANCE;
                    Modifier modifierM1000paddingVpY3zN5 = PaddingKt.m1000paddingVpY3zN4(SizeKt.fillMaxWidth$default(companion4, 0.0f, 1, null), Dp.m7813constructorimpl(12.0f), Dp.m7813constructorimpl(10.0f));
                    Arrangement arrangement2 = Arrangement.INSTANCE;
                    Arrangement.HorizontalOrVertical horizontalOrVerticalM712spacedBy0680j_4 = arrangement2.m712spacedBy0680j_4(Dp.m7813constructorimpl(4.0f));
                    Alignment.Companion companion5 = Alignment.INSTANCE;
                    MeasurePolicy measurePolicyColumnMeasurePolicy2 = ColumnKt.columnMeasurePolicy(horizontalOrVerticalM712spacedBy0680j_4, companion5.getStart(), composer2, 6);
                    long currentCompositeKeyHashCode4 = ComposablesKt.getCurrentCompositeKeyHashCode(composer2, 0);
                    int i6 = (int) (currentCompositeKeyHashCode4 ^ (currentCompositeKeyHashCode4 >>> 32));
                    CompositionLocalMap currentCompositionLocalMap4 = composer2.getCurrentCompositionLocalMap();
                    Modifier modifierMaterializeModifier4 = ComposedModifierKt.materializeModifier(composer2, modifierM1000paddingVpY3zN5);
                    ComposeUiNode.Companion companion6 = ComposeUiNode.INSTANCE;
                    Function0<ComposeUiNode> constructor4 = companion6.getConstructor();
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
                    mr.z(companion6, composerM4318constructorimpl4, measurePolicyColumnMeasurePolicy2, composerM4318constructorimpl4, currentCompositionLocalMap4);
                    Updater.m4326setimpl(composerM4318constructorimpl4, modifierMaterializeModifier4, (Function2<? super T, ? super Modifier, Unit>) id.h(companion6, composerM4318constructorimpl4, Integer.valueOf(i6), composerM4318constructorimpl4));
                    ColumnScopeInstance columnScopeInstance2 = ColumnScopeInstance.INSTANCE;
                    MeasurePolicy measurePolicyRowMeasurePolicy2 = RowKt.rowMeasurePolicy(arrangement2.m712spacedBy0680j_4(Dp.m7813constructorimpl(6.0f)), companion5.getCenterVertically(), composer2, 54);
                    long currentCompositeKeyHashCode5 = ComposablesKt.getCurrentCompositeKeyHashCode(composer2, 0);
                    int i7 = (int) (currentCompositeKeyHashCode5 ^ (currentCompositeKeyHashCode5 >>> 32));
                    CompositionLocalMap currentCompositionLocalMap5 = composer2.getCurrentCompositionLocalMap();
                    Modifier modifierMaterializeModifier5 = ComposedModifierKt.materializeModifier(composer2, companion4);
                    Function0<ComposeUiNode> constructor5 = companion6.getConstructor();
                    if (composer2.getApplier() == null) {
                        ComposablesKt.invalidApplier();
                    }
                    composer2.startReusableNode();
                    if (composer2.getInserting()) {
                        composer2.createNode(constructor5);
                    } else {
                        composer2.useNode();
                    }
                    Composer composerM4318constructorimpl5 = Updater.m4318constructorimpl(composer2);
                    mr.z(companion6, composerM4318constructorimpl5, measurePolicyRowMeasurePolicy2, composerM4318constructorimpl5, currentCompositionLocalMap5);
                    Updater.m4326setimpl(composerM4318constructorimpl5, modifierMaterializeModifier5, (Function2<? super T, ? super Modifier, Unit>) id.h(companion6, composerM4318constructorimpl5, Integer.valueOf(i7), composerM4318constructorimpl5));
                    RowScopeInstance rowScopeInstance = RowScopeInstance.INSTANCE;
                    MaterialTheme materialTheme2 = MaterialTheme.INSTANCE;
                    int i8 = MaterialTheme.$stable;
                    TextStyle bodyMedium = materialTheme2.getTypography(composer2, i8).getBodyMedium();
                    long onSurface = materialTheme2.getColorScheme(composer2, i8).getOnSurface();
                    FontWeight.Companion companion7 = FontWeight.INSTANCE;
                    TextKt.m3048TextNvy7gAk(this.c, null, onSurface, null, 0L, null, companion7.getSemiBold(), null, 0L, null, null, 0L, 0, false, 0, 0, null, bodyMedium, composer2, 1572864, 0, 131002);
                    if (z) {
                        composer2.startReplaceGroup(1080830130);
                        TextKt.m3048TextNvy7gAk("✓", null, ColorKt.Color(4281648985L), null, 0L, null, companion7.getBold(), null, 0L, null, null, 0L, 0, false, 0, 0, null, materialTheme2.getTypography(composer2, i8).getBodyMedium(), composer2, 1573254, 0, 131002);
                        composer2.endReplaceGroup();
                    } else {
                        composer2.startReplaceGroup(1081074782);
                        composer2.endReplaceGroup();
                    }
                    composer2.endNode();
                    TextKt.m3048TextNvy7gAk(this.b, null, Color.m5151copywmQWz5c$default(materialTheme2.getColorScheme(composer2, i8).getOnSurface(), 0.72f, 0.0f, 0.0f, 0.0f, 14, null), null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, materialTheme2.getTypography(composer2, i8).getBodySmall(), composer2, 0, 0, 131066);
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
                        ComposerKt.traceEventStart(196392169, iIntValue3, -1, "com.dh.myembyapp.ui.components.QrNetworkOptionRow.<anonymous> (QrNetworkSettingsDialog.kt:281)");
                    }
                    Modifier.Companion companion8 = Modifier.INSTANCE;
                    Modifier modifierM1000paddingVpY3zN6 = PaddingKt.m1000paddingVpY3zN4(SizeKt.fillMaxWidth$default(companion8, 0.0f, 1, null), Dp.m7813constructorimpl(14.0f), Dp.m7813constructorimpl(12.0f));
                    Arrangement arrangement3 = Arrangement.INSTANCE;
                    Arrangement.HorizontalOrVertical horizontalOrVerticalM712spacedBy0680j_5 = arrangement3.m712spacedBy0680j_4(Dp.m7813constructorimpl(4.0f));
                    Alignment.Companion companion9 = Alignment.INSTANCE;
                    MeasurePolicy measurePolicyColumnMeasurePolicy3 = ColumnKt.columnMeasurePolicy(horizontalOrVerticalM712spacedBy0680j_5, companion9.getStart(), composer3, 6);
                    long currentCompositeKeyHashCode6 = ComposablesKt.getCurrentCompositeKeyHashCode(composer3, 0);
                    int i9 = (int) (currentCompositeKeyHashCode6 ^ (currentCompositeKeyHashCode6 >>> 32));
                    CompositionLocalMap currentCompositionLocalMap6 = composer3.getCurrentCompositionLocalMap();
                    Modifier modifierMaterializeModifier6 = ComposedModifierKt.materializeModifier(composer3, modifierM1000paddingVpY3zN6);
                    ComposeUiNode.Companion companion10 = ComposeUiNode.INSTANCE;
                    Function0<ComposeUiNode> constructor6 = companion10.getConstructor();
                    if (composer3.getApplier() == null) {
                        ComposablesKt.invalidApplier();
                    }
                    composer3.startReusableNode();
                    if (composer3.getInserting()) {
                        composer3.createNode(constructor6);
                    } else {
                        composer3.useNode();
                    }
                    Composer composerM4318constructorimpl6 = Updater.m4318constructorimpl(composer3);
                    mr.z(companion10, composerM4318constructorimpl6, measurePolicyColumnMeasurePolicy3, composerM4318constructorimpl6, currentCompositionLocalMap6);
                    Updater.m4326setimpl(composerM4318constructorimpl6, modifierMaterializeModifier6, (Function2<? super T, ? super Modifier, Unit>) id.h(companion10, composerM4318constructorimpl6, Integer.valueOf(i9), composerM4318constructorimpl6));
                    ColumnScopeInstance columnScopeInstance3 = ColumnScopeInstance.INSTANCE;
                    Modifier modifierFillMaxWidth$default = SizeKt.fillMaxWidth$default(companion8, 0.0f, 1, null);
                    MeasurePolicy measurePolicyRowMeasurePolicy3 = RowKt.rowMeasurePolicy(arrangement3.getSpaceBetween(), companion9.getCenterVertically(), composer3, 54);
                    long currentCompositeKeyHashCode7 = ComposablesKt.getCurrentCompositeKeyHashCode(composer3, 0);
                    int i10 = (int) (currentCompositeKeyHashCode7 ^ (currentCompositeKeyHashCode7 >>> 32));
                    CompositionLocalMap currentCompositionLocalMap7 = composer3.getCurrentCompositionLocalMap();
                    Modifier modifierMaterializeModifier7 = ComposedModifierKt.materializeModifier(composer3, modifierFillMaxWidth$default);
                    Function0<ComposeUiNode> constructor7 = companion10.getConstructor();
                    if (composer3.getApplier() == null) {
                        ComposablesKt.invalidApplier();
                    }
                    composer3.startReusableNode();
                    if (composer3.getInserting()) {
                        composer3.createNode(constructor7);
                    } else {
                        composer3.useNode();
                    }
                    Composer composerM4318constructorimpl7 = Updater.m4318constructorimpl(composer3);
                    mr.z(companion10, composerM4318constructorimpl7, measurePolicyRowMeasurePolicy3, composerM4318constructorimpl7, currentCompositionLocalMap7);
                    Updater.m4326setimpl(composerM4318constructorimpl7, modifierMaterializeModifier7, (Function2<? super T, ? super Modifier, Unit>) id.h(companion10, composerM4318constructorimpl7, Integer.valueOf(i10), composerM4318constructorimpl7));
                    RowScopeInstance rowScopeInstance2 = RowScopeInstance.INSTANCE;
                    MaterialTheme materialTheme3 = MaterialTheme.INSTANCE;
                    int i11 = MaterialTheme.$stable;
                    TextStyle bodyMedium2 = materialTheme3.getTypography(composer3, i11).getBodyMedium();
                    FontWeight.Companion companion11 = FontWeight.INSTANCE;
                    TextKt.m3048TextNvy7gAk(this.c, null, materialTheme3.getColorScheme(composer3, i11).getOnSurface(), null, 0L, null, z ? companion11.getBold() : companion11.getNormal(), null, 0L, null, null, 0L, 0, false, 0, 0, null, bodyMedium2, composer3, 0, 0, 131002);
                    if (z) {
                        composer3.startReplaceGroup(210613899);
                        TextKt.m3048TextNvy7gAk("已选中", null, materialTheme3.getColorScheme(composer3, i11).getPrimary(), null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, materialTheme3.getTypography(composer3, i11).getLabelSmall(), composer3, 6, 0, 131066);
                        composer3.endReplaceGroup();
                    } else {
                        composer3.startReplaceGroup(210823955);
                        composer3.endReplaceGroup();
                    }
                    composer3.endNode();
                    TextKt.m3048TextNvy7gAk(this.b, null, Color.m5151copywmQWz5c$default(materialTheme3.getColorScheme(composer3, i11).getOnSurface(), 0.76f, 0.0f, 0.0f, 0.0f, 14, null), null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, materialTheme3.getTypography(composer3, i11).getBodySmall(), composer3, 0, 0, 131066);
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
                        ComposerKt.traceEventStart(1946920573, iIntValue4, -1, "com.dh.myembyapp.ui.components.ThemeToggleOptionCard.<anonymous> (ThemeSettingsDialog.kt:671)");
                    }
                    Modifier.Companion companion12 = Modifier.INSTANCE;
                    Modifier modifierM1000paddingVpY3zN7 = PaddingKt.m1000paddingVpY3zN4(SizeKt.fillMaxSize$default(companion12, 0.0f, 1, null), Dp.m7813constructorimpl(10.0f), Dp.m7813constructorimpl(8.0f));
                    Alignment.Companion companion13 = Alignment.INSTANCE;
                    Alignment.Vertical centerVertically2 = companion13.getCenterVertically();
                    Arrangement arrangement4 = Arrangement.INSTANCE;
                    MeasurePolicy measurePolicyRowMeasurePolicy4 = RowKt.rowMeasurePolicy(arrangement4.getSpaceBetween(), centerVertically2, composer4, 54);
                    long currentCompositeKeyHashCode8 = ComposablesKt.getCurrentCompositeKeyHashCode(composer4, 0);
                    int i12 = (int) (currentCompositeKeyHashCode8 ^ (currentCompositeKeyHashCode8 >>> 32));
                    CompositionLocalMap currentCompositionLocalMap8 = composer4.getCurrentCompositionLocalMap();
                    Modifier modifierMaterializeModifier8 = ComposedModifierKt.materializeModifier(composer4, modifierM1000paddingVpY3zN7);
                    ComposeUiNode.Companion companion14 = ComposeUiNode.INSTANCE;
                    Function0<ComposeUiNode> constructor8 = companion14.getConstructor();
                    if (composer4.getApplier() == null) {
                        ComposablesKt.invalidApplier();
                    }
                    composer4.startReusableNode();
                    if (composer4.getInserting()) {
                        composer4.createNode(constructor8);
                    } else {
                        composer4.useNode();
                    }
                    Composer composerM4318constructorimpl8 = Updater.m4318constructorimpl(composer4);
                    mr.z(companion14, composerM4318constructorimpl8, measurePolicyRowMeasurePolicy4, composerM4318constructorimpl8, currentCompositionLocalMap8);
                    Updater.m4326setimpl(composerM4318constructorimpl8, modifierMaterializeModifier8, (Function2<? super T, ? super Modifier, Unit>) id.h(companion14, composerM4318constructorimpl8, Integer.valueOf(i12), composerM4318constructorimpl8));
                    Modifier modifierE2 = zs1.E(RowScopeInstance.INSTANCE, companion12, 1.0f, false, 2, null);
                    MeasurePolicy measurePolicyColumnMeasurePolicy4 = ColumnKt.columnMeasurePolicy(arrangement4.m712spacedBy0680j_4(Dp.m7813constructorimpl(2.0f)), companion13.getStart(), composer4, 6);
                    long currentCompositeKeyHashCode9 = ComposablesKt.getCurrentCompositeKeyHashCode(composer4, 0);
                    int i13 = (int) (currentCompositeKeyHashCode9 ^ (currentCompositeKeyHashCode9 >>> 32));
                    CompositionLocalMap currentCompositionLocalMap9 = composer4.getCurrentCompositionLocalMap();
                    Modifier modifierMaterializeModifier9 = ComposedModifierKt.materializeModifier(composer4, modifierE2);
                    Function0<ComposeUiNode> constructor9 = companion14.getConstructor();
                    if (composer4.getApplier() == null) {
                        ComposablesKt.invalidApplier();
                    }
                    composer4.startReusableNode();
                    if (composer4.getInserting()) {
                        composer4.createNode(constructor9);
                    } else {
                        composer4.useNode();
                    }
                    Composer composerM4318constructorimpl9 = Updater.m4318constructorimpl(composer4);
                    mr.z(companion14, composerM4318constructorimpl9, measurePolicyColumnMeasurePolicy4, composerM4318constructorimpl9, currentCompositionLocalMap9);
                    Updater.m4326setimpl(composerM4318constructorimpl9, modifierMaterializeModifier9, (Function2<? super T, ? super Modifier, Unit>) id.h(companion14, composerM4318constructorimpl9, Integer.valueOf(i13), composerM4318constructorimpl9));
                    ColumnScopeInstance columnScopeInstance4 = ColumnScopeInstance.INSTANCE;
                    MaterialTheme materialTheme4 = MaterialTheme.INSTANCE;
                    int i14 = MaterialTheme.$stable;
                    TextStyle labelLarge = materialTheme4.getTypography(composer4, i14).getLabelLarge();
                    TextKt.m3048TextNvy7gAk(this.b, null, materialTheme4.getColorScheme(composer4, i14).getOnSurface(), null, 0L, null, FontWeight.INSTANCE.getSemiBold(), null, 0L, null, null, 0L, 0, false, 1, 0, null, labelLarge, composer4, 1572864, 24576, 114618);
                    TextKt.m3048TextNvy7gAk(this.c, null, Color.m5151copywmQWz5c$default(materialTheme4.getColorScheme(composer4, i14).getOnSurface(), 0.64f, 0.0f, 0.0f, 0.0f, 14, null), null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, materialTheme4.getTypography(composer4, i14).getLabelSmall(), composer4, 0, 0, 131066);
                    composer4.endNode();
                    SpacerKt.Spacer(SizeKt.m1069width3ABfNKs(companion12, Dp.m7813constructorimpl(8.0f)), composer4, 6);
                    Modifier modifierM1050height3ABfNKs2 = SizeKt.m1050height3ABfNKs(SizeKt.m1069width3ABfNKs(companion12, Dp.m7813constructorimpl(38.0f)), Dp.m7813constructorimpl(22.0f));
                    if (z) {
                        composer4.startReplaceGroup(-1758085490);
                        jD2 = zc2.b(false, composer4, 1);
                        composer4.endReplaceGroup();
                    } else {
                        composer4.startReplaceGroup(-1757997140);
                        jD2 = zc2.d(false, composer4, 1);
                        composer4.endReplaceGroup();
                    }
                    Modifier modifierM999padding3ABfNKs2 = PaddingKt.m999padding3ABfNKs(kb0.v(11.0f, modifierM1050height3ABfNKs2, jD2), Dp.m7813constructorimpl(2.0f));
                    MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy2 = BoxKt.maybeCachedBoxMeasurePolicy(z ? companion13.getCenterEnd() : companion13.getCenterStart(), false);
                    long currentCompositeKeyHashCode10 = ComposablesKt.getCurrentCompositeKeyHashCode(composer4, 0);
                    int i15 = (int) (currentCompositeKeyHashCode10 ^ (currentCompositeKeyHashCode10 >>> 32));
                    CompositionLocalMap currentCompositionLocalMap10 = composer4.getCurrentCompositionLocalMap();
                    Modifier modifierMaterializeModifier10 = ComposedModifierKt.materializeModifier(composer4, modifierM999padding3ABfNKs2);
                    Function0<ComposeUiNode> constructor10 = companion14.getConstructor();
                    if (composer4.getApplier() == null) {
                        ComposablesKt.invalidApplier();
                    }
                    composer4.startReusableNode();
                    if (composer4.getInserting()) {
                        composer4.createNode(constructor10);
                    } else {
                        composer4.useNode();
                    }
                    Composer composerM4318constructorimpl10 = Updater.m4318constructorimpl(composer4);
                    mr.z(companion14, composerM4318constructorimpl10, measurePolicyMaybeCachedBoxMeasurePolicy2, composerM4318constructorimpl10, currentCompositionLocalMap10);
                    Updater.m4326setimpl(composerM4318constructorimpl10, modifierMaterializeModifier10, (Function2<? super T, ? super Modifier, Unit>) id.h(companion14, composerM4318constructorimpl10, Integer.valueOf(i15), composerM4318constructorimpl10));
                    BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
                    BoxKt.Box(kb0.v(9.0f, SizeKt.m1064size3ABfNKs(companion12, Dp.m7813constructorimpl(18.0f)), zc2.c(true)), composer4, 0);
                    composer4.endNode();
                    composer4.endNode();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                } else {
                    composer4.skipToGroupEnd();
                }
                break;
            case 4:
                Composer composer5 = (Composer) obj2;
                int iIntValue5 = ((Integer) obj3).intValue();
                ((BoxScope) obj).getClass();
                if (composer5.shouldExecute((iIntValue5 & 17) != 16, iIntValue5 & 1)) {
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(1156354928, iIntValue5, -1, "com.dh.myembyapp.ui.components.TraktToggleRow.<anonymous> (TraktSyncDialog.kt:568)");
                    }
                    Modifier.Companion companion15 = Modifier.INSTANCE;
                    Modifier modifierM1000paddingVpY3zN8 = PaddingKt.m1000paddingVpY3zN4(SizeKt.fillMaxWidth$default(companion15, 0.0f, 1, null), Dp.m7813constructorimpl(14.0f), Dp.m7813constructorimpl(10.0f));
                    Alignment.Companion companion16 = Alignment.INSTANCE;
                    Alignment.Vertical centerVertically3 = companion16.getCenterVertically();
                    Arrangement arrangement5 = Arrangement.INSTANCE;
                    MeasurePolicy measurePolicyRowMeasurePolicy5 = RowKt.rowMeasurePolicy(arrangement5.getSpaceBetween(), centerVertically3, composer5, 54);
                    long currentCompositeKeyHashCode11 = ComposablesKt.getCurrentCompositeKeyHashCode(composer5, 0);
                    int i16 = (int) (currentCompositeKeyHashCode11 ^ (currentCompositeKeyHashCode11 >>> 32));
                    CompositionLocalMap currentCompositionLocalMap11 = composer5.getCurrentCompositionLocalMap();
                    Modifier modifierMaterializeModifier11 = ComposedModifierKt.materializeModifier(composer5, modifierM1000paddingVpY3zN8);
                    ComposeUiNode.Companion companion17 = ComposeUiNode.INSTANCE;
                    Function0<ComposeUiNode> constructor11 = companion17.getConstructor();
                    if (composer5.getApplier() == null) {
                        ComposablesKt.invalidApplier();
                    }
                    composer5.startReusableNode();
                    if (composer5.getInserting()) {
                        composer5.createNode(constructor11);
                    } else {
                        composer5.useNode();
                    }
                    Composer composerM4318constructorimpl11 = Updater.m4318constructorimpl(composer5);
                    mr.z(companion17, composerM4318constructorimpl11, measurePolicyRowMeasurePolicy5, composerM4318constructorimpl11, currentCompositionLocalMap11);
                    Updater.m4326setimpl(composerM4318constructorimpl11, modifierMaterializeModifier11, (Function2<? super T, ? super Modifier, Unit>) id.h(companion17, composerM4318constructorimpl11, Integer.valueOf(i16), composerM4318constructorimpl11));
                    Modifier modifierE3 = zs1.E(RowScopeInstance.INSTANCE, companion15, 1.0f, false, 2, null);
                    MeasurePolicy measurePolicyColumnMeasurePolicy5 = ColumnKt.columnMeasurePolicy(arrangement5.m712spacedBy0680j_4(Dp.m7813constructorimpl(3.0f)), companion16.getStart(), composer5, 6);
                    long currentCompositeKeyHashCode12 = ComposablesKt.getCurrentCompositeKeyHashCode(composer5, 0);
                    int i17 = (int) (currentCompositeKeyHashCode12 ^ (currentCompositeKeyHashCode12 >>> 32));
                    CompositionLocalMap currentCompositionLocalMap12 = composer5.getCurrentCompositionLocalMap();
                    Modifier modifierMaterializeModifier12 = ComposedModifierKt.materializeModifier(composer5, modifierE3);
                    Function0<ComposeUiNode> constructor12 = companion17.getConstructor();
                    if (composer5.getApplier() == null) {
                        ComposablesKt.invalidApplier();
                    }
                    composer5.startReusableNode();
                    if (composer5.getInserting()) {
                        composer5.createNode(constructor12);
                    } else {
                        composer5.useNode();
                    }
                    Composer composerM4318constructorimpl12 = Updater.m4318constructorimpl(composer5);
                    mr.z(companion17, composerM4318constructorimpl12, measurePolicyColumnMeasurePolicy5, composerM4318constructorimpl12, currentCompositionLocalMap12);
                    Updater.m4326setimpl(composerM4318constructorimpl12, modifierMaterializeModifier12, (Function2<? super T, ? super Modifier, Unit>) id.h(companion17, composerM4318constructorimpl12, Integer.valueOf(i17), composerM4318constructorimpl12));
                    ColumnScopeInstance columnScopeInstance5 = ColumnScopeInstance.INSTANCE;
                    MaterialTheme materialTheme5 = MaterialTheme.INSTANCE;
                    int i18 = MaterialTheme.$stable;
                    TextKt.m3048TextNvy7gAk(this.b, null, materialTheme5.getColorScheme(composer5, i18).getOnSurface(), null, 0L, null, FontWeight.INSTANCE.getSemiBold(), null, 0L, null, null, 0L, 0, false, 0, 0, null, materialTheme5.getTypography(composer5, i18).getBodyMedium(), composer5, 1572864, 0, 131002);
                    TextKt.m3048TextNvy7gAk(this.c, null, Color.m5151copywmQWz5c$default(materialTheme5.getColorScheme(composer5, i18).getOnSurface(), 0.68f, 0.0f, 0.0f, 0.0f, 14, null), null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, materialTheme5.getTypography(composer5, i18).getBodySmall(), composer5, 0, 0, 131066);
                    composer5.endNode();
                    SpacerKt.Spacer(SizeKt.m1069width3ABfNKs(companion15, Dp.m7813constructorimpl(12.0f)), composer5, 6);
                    Modifier modifierM1050height3ABfNKs3 = SizeKt.m1050height3ABfNKs(SizeKt.m1069width3ABfNKs(companion15, Dp.m7813constructorimpl(44.0f)), Dp.m7813constructorimpl(24.0f));
                    if (z) {
                        composer5.startReplaceGroup(-852348957);
                        jD3 = zc2.b(false, composer5, 1);
                        composer5.endReplaceGroup();
                    } else {
                        composer5.startReplaceGroup(-852260607);
                        jD3 = zc2.d(false, composer5, 1);
                        composer5.endReplaceGroup();
                    }
                    Modifier modifierM999padding3ABfNKs3 = PaddingKt.m999padding3ABfNKs(kb0.v(12.0f, modifierM1050height3ABfNKs3, jD3), Dp.m7813constructorimpl(2.0f));
                    MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy3 = BoxKt.maybeCachedBoxMeasurePolicy(companion16.getTopStart(), false);
                    long currentCompositeKeyHashCode13 = ComposablesKt.getCurrentCompositeKeyHashCode(composer5, 0);
                    int i19 = (int) (currentCompositeKeyHashCode13 ^ (currentCompositeKeyHashCode13 >>> 32));
                    CompositionLocalMap currentCompositionLocalMap13 = composer5.getCurrentCompositionLocalMap();
                    Modifier modifierMaterializeModifier13 = ComposedModifierKt.materializeModifier(composer5, modifierM999padding3ABfNKs3);
                    Function0<ComposeUiNode> constructor13 = companion17.getConstructor();
                    if (composer5.getApplier() == null) {
                        ComposablesKt.invalidApplier();
                    }
                    composer5.startReusableNode();
                    if (composer5.getInserting()) {
                        composer5.createNode(constructor13);
                    } else {
                        composer5.useNode();
                    }
                    Composer composerM4318constructorimpl13 = Updater.m4318constructorimpl(composer5);
                    mr.z(companion17, composerM4318constructorimpl13, measurePolicyMaybeCachedBoxMeasurePolicy3, composerM4318constructorimpl13, currentCompositionLocalMap13);
                    Updater.m4326setimpl(composerM4318constructorimpl13, modifierMaterializeModifier13, (Function2<? super T, ? super Modifier, Unit>) id.h(companion17, composerM4318constructorimpl13, Integer.valueOf(i19), composerM4318constructorimpl13));
                    BoxKt.Box(kb0.v(10.0f, BoxScopeInstance.INSTANCE.align(SizeKt.m1064size3ABfNKs(companion15, Dp.m7813constructorimpl(20.0f)), z ? companion16.getCenterEnd() : companion16.getCenterStart()), zc2.c(true)), composer5, 0);
                    composer5.endNode();
                    composer5.endNode();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                } else {
                    composer5.skipToGroupEnd();
                }
                break;
            default:
                Composer composer6 = (Composer) obj2;
                int iIntValue6 = ((Integer) obj3).intValue();
                ((BoxScope) obj).getClass();
                if (composer6.shouldExecute((iIntValue6 & 17) != 16, iIntValue6 & 1)) {
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(1843123023, iIntValue6, -1, "com.dh.myembyapp.ui.components.WebDavToggleRow.<anonymous> (WebDavSyncDialog.kt:1060)");
                    }
                    Modifier.Companion companion18 = Modifier.INSTANCE;
                    Modifier modifierM1000paddingVpY3zN9 = PaddingKt.m1000paddingVpY3zN4(SizeKt.fillMaxWidth$default(companion18, 0.0f, 1, null), Dp.m7813constructorimpl(12.0f), Dp.m7813constructorimpl(10.0f));
                    Alignment.Companion companion19 = Alignment.INSTANCE;
                    Alignment.Vertical centerVertically4 = companion19.getCenterVertically();
                    Arrangement arrangement6 = Arrangement.INSTANCE;
                    MeasurePolicy measurePolicyRowMeasurePolicy6 = RowKt.rowMeasurePolicy(arrangement6.getSpaceBetween(), centerVertically4, composer6, 54);
                    long currentCompositeKeyHashCode14 = ComposablesKt.getCurrentCompositeKeyHashCode(composer6, 0);
                    int i20 = (int) (currentCompositeKeyHashCode14 ^ (currentCompositeKeyHashCode14 >>> 32));
                    CompositionLocalMap currentCompositionLocalMap14 = composer6.getCurrentCompositionLocalMap();
                    Modifier modifierMaterializeModifier14 = ComposedModifierKt.materializeModifier(composer6, modifierM1000paddingVpY3zN9);
                    ComposeUiNode.Companion companion20 = ComposeUiNode.INSTANCE;
                    Function0<ComposeUiNode> constructor14 = companion20.getConstructor();
                    if (composer6.getApplier() == null) {
                        ComposablesKt.invalidApplier();
                    }
                    composer6.startReusableNode();
                    if (composer6.getInserting()) {
                        composer6.createNode(constructor14);
                    } else {
                        composer6.useNode();
                    }
                    Composer composerM4318constructorimpl14 = Updater.m4318constructorimpl(composer6);
                    mr.z(companion20, composerM4318constructorimpl14, measurePolicyRowMeasurePolicy6, composerM4318constructorimpl14, currentCompositionLocalMap14);
                    Updater.m4326setimpl(composerM4318constructorimpl14, modifierMaterializeModifier14, (Function2<? super T, ? super Modifier, Unit>) id.h(companion20, composerM4318constructorimpl14, Integer.valueOf(i20), composerM4318constructorimpl14));
                    Modifier modifierE4 = zs1.E(RowScopeInstance.INSTANCE, companion18, 1.0f, false, 2, null);
                    MeasurePolicy measurePolicyColumnMeasurePolicy6 = ColumnKt.columnMeasurePolicy(arrangement6.m712spacedBy0680j_4(Dp.m7813constructorimpl(4.0f)), companion19.getStart(), composer6, 6);
                    long currentCompositeKeyHashCode15 = ComposablesKt.getCurrentCompositeKeyHashCode(composer6, 0);
                    int i21 = (int) (currentCompositeKeyHashCode15 ^ (currentCompositeKeyHashCode15 >>> 32));
                    CompositionLocalMap currentCompositionLocalMap15 = composer6.getCurrentCompositionLocalMap();
                    Modifier modifierMaterializeModifier15 = ComposedModifierKt.materializeModifier(composer6, modifierE4);
                    Function0<ComposeUiNode> constructor15 = companion20.getConstructor();
                    if (composer6.getApplier() == null) {
                        ComposablesKt.invalidApplier();
                    }
                    composer6.startReusableNode();
                    if (composer6.getInserting()) {
                        composer6.createNode(constructor15);
                    } else {
                        composer6.useNode();
                    }
                    Composer composerM4318constructorimpl15 = Updater.m4318constructorimpl(composer6);
                    mr.z(companion20, composerM4318constructorimpl15, measurePolicyColumnMeasurePolicy6, composerM4318constructorimpl15, currentCompositionLocalMap15);
                    Updater.m4326setimpl(composerM4318constructorimpl15, modifierMaterializeModifier15, (Function2<? super T, ? super Modifier, Unit>) id.h(companion20, composerM4318constructorimpl15, Integer.valueOf(i21), composerM4318constructorimpl15));
                    ColumnScopeInstance columnScopeInstance6 = ColumnScopeInstance.INSTANCE;
                    MaterialTheme materialTheme6 = MaterialTheme.INSTANCE;
                    int i22 = MaterialTheme.$stable;
                    TextKt.m3048TextNvy7gAk(this.b, null, materialTheme6.getColorScheme(composer6, i22).getOnSurface(), null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, materialTheme6.getTypography(composer6, i22).getBodyMedium(), composer6, 0, 0, 131066);
                    TextKt.m3048TextNvy7gAk(this.c, null, Color.m5151copywmQWz5c$default(materialTheme6.getColorScheme(composer6, i22).getOnSurface(), 0.72f, 0.0f, 0.0f, 0.0f, 14, null), null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, materialTheme6.getTypography(composer6, i22).getBodySmall(), composer6, 0, 0, 131066);
                    composer6.endNode();
                    SpacerKt.Spacer(SizeKt.m1069width3ABfNKs(companion18, Dp.m7813constructorimpl(12.0f)), composer6, 6);
                    ef2.b(z, composer6, 0);
                    composer6.endNode();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                } else {
                    composer6.skipToGroupEnd();
                }
                break;
        }
        return Unit.INSTANCE;
    }

    public /* synthetic */ mu0(String str, String str2, int i, boolean z) {
        this.a = i;
        this.d = z;
        this.b = str;
        this.c = str2;
    }

    public /* synthetic */ mu0(String str, boolean z, String str2) {
        this.a = 2;
        this.b = str;
        this.d = z;
        this.c = str2;
    }
}
