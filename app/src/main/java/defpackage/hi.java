package defpackage;

import androidx.compose.foundation.BackgroundKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScope;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnScopeInstance;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.RowKt;
import androidx.compose.foundation.layout.RowScope;
import androidx.compose.foundation.layout.RowScopeInstance;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.shape.RoundedCornerShapeKt;
import androidx.compose.material.icons.Icons;
import androidx.compose.material.icons.filled.ArrowDownwardKt;
import androidx.compose.material.icons.filled.ArrowUpwardKt;
import androidx.compose.material.icons.filled.CheckKt;
import androidx.compose.material3.IconKt;
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
import androidx.compose.ui.graphics.vector.ImageVector;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.text.style.TextOverflow;
import androidx.compose.ui.unit.Dp;
import com.dh.myembyapp.data.model.BackupRouteConfig;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.text.StringsKt;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class hi implements Function3 {
    public final /* synthetic */ int a = 1;
    public final /* synthetic */ long b;
    public final /* synthetic */ boolean c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;

    public /* synthetic */ hi(uy0 uy0Var, long j, boolean z, MutableState mutableState) {
        this.d = uy0Var;
        this.b = j;
        this.c = z;
        this.e = mutableState;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.jvm.functions.Function3
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        long jM5151copywmQWz5c$default;
        Composer composer;
        long jK;
        int i = this.a;
        Object obj4 = this.e;
        boolean z = this.c;
        Object obj5 = this.d;
        switch (i) {
            case 0:
                u61 u61Var = (u61) obj5;
                BackupRouteConfig backupRouteConfig = (BackupRouteConfig) obj4;
                Composer composer2 = (Composer) obj2;
                int iIntValue = ((Integer) obj3).intValue();
                ((BoxScope) obj).getClass();
                if (composer2.shouldExecute((iIntValue & 17) != 16, iIntValue & 1)) {
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-1848920769, iIntValue, -1, "com.dh.myembyapp.ui.components.BackupRouteImportSelectableItem.<anonymous> (BackupRouteManagerDialog.kt:1369)");
                    }
                    Modifier.Companion companion = Modifier.INSTANCE;
                    Modifier modifierM1000paddingVpY3zN4 = PaddingKt.m1000paddingVpY3zN4(SizeKt.fillMaxWidth$default(companion, 0.0f, 1, null), Dp.m7813constructorimpl(12.0f), Dp.m7813constructorimpl(10.0f));
                    Arrangement arrangement = Arrangement.INSTANCE;
                    Arrangement.HorizontalOrVertical horizontalOrVerticalM712spacedBy0680j_4 = arrangement.m712spacedBy0680j_4(Dp.m7813constructorimpl(10.0f));
                    Alignment.Companion companion2 = Alignment.INSTANCE;
                    MeasurePolicy measurePolicyRowMeasurePolicy = RowKt.rowMeasurePolicy(horizontalOrVerticalM712spacedBy0680j_4, companion2.getCenterVertically(), composer2, 54);
                    long currentCompositeKeyHashCode = ComposablesKt.getCurrentCompositeKeyHashCode(composer2, 0);
                    int i2 = (int) (currentCompositeKeyHashCode ^ (currentCompositeKeyHashCode >>> 32));
                    CompositionLocalMap currentCompositionLocalMap = composer2.getCurrentCompositionLocalMap();
                    Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(composer2, modifierM1000paddingVpY3zN4);
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
                    Updater.m4326setimpl(composerM4318constructorimpl, modifierMaterializeModifier, (Function2<? super T, ? super Modifier, Unit>) id.h(companion3, composerM4318constructorimpl, Integer.valueOf(i2), composerM4318constructorimpl));
                    RowScopeInstance rowScopeInstance = RowScopeInstance.INSTANCE;
                    Modifier modifierM1064size3ABfNKs = SizeKt.m1064size3ABfNKs(companion, Dp.m7813constructorimpl(24.0f));
                    if (z) {
                        composer2.startReplaceGroup(-942864829);
                        composer2.endReplaceGroup();
                        jM5151copywmQWz5c$default = u61Var.P;
                    } else {
                        composer2.startReplaceGroup(-942863218);
                        jM5151copywmQWz5c$default = Color.m5151copywmQWz5c$default(MaterialTheme.INSTANCE.getColorScheme(composer2, MaterialTheme.$stable).getOnSurface(), 0.12f, 0.0f, 0.0f, 0.0f, 14, null);
                        composer2.endReplaceGroup();
                    }
                    Modifier modifierM274backgroundbw27NRU = BackgroundKt.m274backgroundbw27NRU(modifierM1064size3ABfNKs, jM5151copywmQWz5c$default, RoundedCornerShapeKt.getCircleShape());
                    MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(companion2.getCenter(), false);
                    long currentCompositeKeyHashCode2 = ComposablesKt.getCurrentCompositeKeyHashCode(composer2, 0);
                    int i3 = (int) (currentCompositeKeyHashCode2 ^ (currentCompositeKeyHashCode2 >>> 32));
                    CompositionLocalMap currentCompositionLocalMap2 = composer2.getCurrentCompositionLocalMap();
                    Modifier modifierMaterializeModifier2 = ComposedModifierKt.materializeModifier(composer2, modifierM274backgroundbw27NRU);
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
                    mr.z(companion3, composerM4318constructorimpl2, measurePolicyMaybeCachedBoxMeasurePolicy, composerM4318constructorimpl2, currentCompositionLocalMap2);
                    Updater.m4326setimpl(composerM4318constructorimpl2, modifierMaterializeModifier2, (Function2<? super T, ? super Modifier, Unit>) id.h(companion3, composerM4318constructorimpl2, Integer.valueOf(i3), composerM4318constructorimpl2));
                    BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
                    if (z) {
                        composer2.startReplaceGroup(-893481430);
                        IconKt.m2496Iconww6aTOc(CheckKt.getCheck(Icons.INSTANCE.getDefault()), (String) null, SizeKt.m1064size3ABfNKs(companion, Dp.m7813constructorimpl(16.0f)), u61Var.p, composer2, 432, 0);
                        composer = composer2;
                        composer.endReplaceGroup();
                    } else {
                        composer = composer2;
                        composer.startReplaceGroup(-893214675);
                        composer.endReplaceGroup();
                    }
                    composer.endNode();
                    Modifier modifierE = zs1.E(rowScopeInstance, companion, 1.0f, false, 2, null);
                    MeasurePolicy measurePolicyColumnMeasurePolicy = ColumnKt.columnMeasurePolicy(arrangement.m712spacedBy0680j_4(Dp.m7813constructorimpl(4.0f)), companion2.getStart(), composer, 6);
                    long currentCompositeKeyHashCode3 = ComposablesKt.getCurrentCompositeKeyHashCode(composer, 0);
                    int i4 = (int) (currentCompositeKeyHashCode3 ^ (currentCompositeKeyHashCode3 >>> 32));
                    CompositionLocalMap currentCompositionLocalMap3 = composer.getCurrentCompositionLocalMap();
                    Modifier modifierMaterializeModifier3 = ComposedModifierKt.materializeModifier(composer, modifierE);
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
                    mr.z(companion3, composerM4318constructorimpl3, measurePolicyColumnMeasurePolicy, composerM4318constructorimpl3, currentCompositionLocalMap3);
                    Updater.m4326setimpl(composerM4318constructorimpl3, modifierMaterializeModifier3, (Function2<? super T, ? super Modifier, Unit>) id.h(companion3, composerM4318constructorimpl3, Integer.valueOf(i4), composerM4318constructorimpl3));
                    ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.INSTANCE;
                    String alias = backupRouteConfig.getAlias();
                    if (StringsKt.isBlank(alias)) {
                        alias = "未命名线路";
                    }
                    String str = alias;
                    MaterialTheme materialTheme = MaterialTheme.INSTANCE;
                    int i5 = MaterialTheme.$stable;
                    TextStyle bodyMedium = materialTheme.getTypography(composer, i5).getBodyMedium();
                    TextOverflow.Companion companion4 = TextOverflow.INSTANCE;
                    int iM7761getEllipsisgIe3tQ8 = companion4.m7761getEllipsisgIe3tQ8();
                    long j = this.b;
                    Composer composer3 = composer;
                    TextKt.m3048TextNvy7gAk(str, null, j, null, 0L, null, null, null, 0L, null, null, 0L, iM7761getEllipsisgIe3tQ8, false, 1, 0, null, bodyMedium, composer3, 0, 24960, 110586);
                    TextKt.m3048TextNvy7gAk(backupRouteConfig.getDisplayAddress(), null, Color.m5151copywmQWz5c$default(j, 0.68f, 0.0f, 0.0f, 0.0f, 14, null), null, 0L, null, null, null, 0L, null, null, 0L, companion4.m7761getEllipsisgIe3tQ8(), false, 1, 0, null, materialTheme.getTypography(composer, i5).getBodySmall(), composer3, 0, 24960, 110586);
                    if (backupRouteConfig.getDirectOnly()) {
                        composer.startReplaceGroup(-1854522347);
                        pi.q("仅直连", u61Var.h, u61Var.j, composer, 6);
                        composer.endReplaceGroup();
                    } else {
                        composer.startReplaceGroup(-1854268643);
                        composer.endReplaceGroup();
                    }
                    if (x2.m(composer)) {
                        ComposerKt.traceEventEnd();
                    }
                } else {
                    composer2.skipToGroupEnd();
                }
                break;
            default:
                uy0 uy0Var = (uy0) obj5;
                MutableState mutableState = (MutableState) obj4;
                Composer composer4 = (Composer) obj2;
                int iIntValue2 = ((Integer) obj3).intValue();
                ((RowScope) obj).getClass();
                if (composer4.shouldExecute((iIntValue2 & 17) != 16, iIntValue2 & 1)) {
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-347937680, iIntValue2, -1, "com.dh.myembyapp.ui.screens.library.LibraryContent.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (LibraryScreen.kt:398)");
                    }
                    Alignment.Vertical centerVertically = Alignment.INSTANCE.getCenterVertically();
                    Arrangement.HorizontalOrVertical horizontalOrVerticalM712spacedBy0680j_5 = Arrangement.INSTANCE.m712spacedBy0680j_4(Dp.m7813constructorimpl(5.0f));
                    Modifier.Companion companion5 = Modifier.INSTANCE;
                    MeasurePolicy measurePolicyRowMeasurePolicy2 = RowKt.rowMeasurePolicy(horizontalOrVerticalM712spacedBy0680j_5, centerVertically, composer4, 54);
                    long currentCompositeKeyHashCode4 = ComposablesKt.getCurrentCompositeKeyHashCode(composer4, 0);
                    int i6 = (int) (currentCompositeKeyHashCode4 ^ (currentCompositeKeyHashCode4 >>> 32));
                    CompositionLocalMap currentCompositionLocalMap4 = composer4.getCurrentCompositionLocalMap();
                    Modifier modifierMaterializeModifier4 = ComposedModifierKt.materializeModifier(composer4, companion5);
                    ComposeUiNode.Companion companion6 = ComposeUiNode.INSTANCE;
                    Function0<ComposeUiNode> constructor4 = companion6.getConstructor();
                    if (composer4.getApplier() == null) {
                        ComposablesKt.invalidApplier();
                    }
                    composer4.startReusableNode();
                    if (composer4.getInserting()) {
                        composer4.createNode(constructor4);
                    } else {
                        composer4.useNode();
                    }
                    Composer composerM4318constructorimpl4 = Updater.m4318constructorimpl(composer4);
                    mr.z(companion6, composerM4318constructorimpl4, measurePolicyRowMeasurePolicy2, composerM4318constructorimpl4, currentCompositionLocalMap4);
                    Updater.m4326setimpl(composerM4318constructorimpl4, modifierMaterializeModifier4, (Function2<? super T, ? super Modifier, Unit>) id.h(companion6, composerM4318constructorimpl4, Integer.valueOf(i6), composerM4318constructorimpl4));
                    RowScopeInstance rowScopeInstance2 = RowScopeInstance.INSTANCE;
                    String strConcat = "排序：".concat(uy0Var.a);
                    TextStyle titleSmall = MaterialTheme.INSTANCE.getTypography(composer4, MaterialTheme.$stable).getTitleSmall();
                    boolean zBooleanValue = ((Boolean) mutableState.getValue()).booleanValue();
                    long jK2 = this.b;
                    if (zBooleanValue) {
                        composer4.startReplaceGroup(-1251560374);
                        jK = hc2.k(jc2.a, true, false, composer4, 54, 4);
                        composer4.endReplaceGroup();
                    } else {
                        composer4.startReplaceGroup(-1251301834);
                        composer4.endReplaceGroup();
                        jK = jK2;
                    }
                    TextKt.m3048TextNvy7gAk(strConcat, null, jK, null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, titleSmall, composer4, 0, 0, 131066);
                    Icons.Filled filled = Icons.INSTANCE.getDefault();
                    ImageVector arrowDownward = z ? ArrowDownwardKt.getArrowDownward(filled) : ArrowUpwardKt.getArrowUpward(filled);
                    Modifier modifierM1064size3ABfNKs2 = SizeKt.m1064size3ABfNKs(companion5, Dp.m7813constructorimpl(14.0f));
                    if (((Boolean) mutableState.getValue()).booleanValue()) {
                        composer4.startReplaceGroup(-1250835222);
                        jK2 = hc2.k(jc2.a, true, false, composer4, 54, 4);
                        composer4.endReplaceGroup();
                    } else {
                        composer4.startReplaceGroup(-1250576682);
                        composer4.endReplaceGroup();
                    }
                    IconKt.m2496Iconww6aTOc(arrowDownward, (String) null, modifierM1064size3ABfNKs2, jK2, composer4, 432, 0);
                    composer4.endNode();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                } else {
                    composer4.skipToGroupEnd();
                }
                break;
        }
        return Unit.INSTANCE;
    }

    public /* synthetic */ hi(boolean z, u61 u61Var, BackupRouteConfig backupRouteConfig, long j) {
        this.c = z;
        this.d = u61Var;
        this.e = backupRouteConfig;
        this.b = j;
    }
}
