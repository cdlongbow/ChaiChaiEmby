package defpackage;

import androidx.compose.foundation.ImageKt;
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
import androidx.compose.foundation.layout.SpacerKt;
import androidx.compose.material.icons.Icons;
import androidx.compose.material.icons.filled.CheckKt;
import androidx.compose.material3.ExposedDropdownMenuKt$ExposedDropdownMenuBox$scope$1$1;
import androidx.compose.material3.IconKt;
import androidx.compose.material3.MaterialTheme;
import androidx.compose.material3.TextKt;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.MutableIntState;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.Updater;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.ColorFilter;
import androidx.compose.ui.graphics.painter.Painter;
import androidx.compose.ui.layout.ContentScale;
import androidx.compose.ui.layout.Measurable;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.layout.MeasureScope;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.res.PainterResources_androidKt;
import androidx.compose.ui.text.PlatformTextStyle;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.text.style.TextOverflow;
import androidx.compose.ui.unit.Constraints;
import androidx.compose.ui.unit.Dp;
import androidx.compose.ui.unit.TextUnitKt;
import androidx.media3.exoplayer.RendererCapabilities;
import com.dh.myembyapp.data.model.MediaItem;
import com.dh.myembyapp.data.model.ServerPingState;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.text.StringsKt;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class r60 implements Function3 {
    public final /* synthetic */ int a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ r60(tn0 tn0Var, u61 u61Var, boolean z) {
        this.a = 2;
        this.c = tn0Var;
        this.d = u61Var;
        this.b = z;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.jvm.functions.Function3
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        long j;
        RowScopeInstance rowScopeInstance;
        boolean z;
        Alignment.Companion companion;
        int i = this.a;
        boolean z2 = this.b;
        Object obj4 = this.d;
        Object obj5 = this.c;
        switch (i) {
            case 0:
                MediaItem mediaItem = (MediaItem) obj5;
                MutableState mutableState = (MutableState) obj4;
                Composer composer = (Composer) obj2;
                int iIntValue = ((Integer) obj3).intValue();
                long j2 = u90.m;
                long j3 = u90.c;
                ((RowScope) obj).getClass();
                if (composer.shouldExecute((iIntValue & 17) != 16, iIntValue & 1)) {
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-272728618, iIntValue, -1, "com.dh.myembyapp.ui.screens.detail.SeasonSelectionDialog.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (DetailScreen.kt:3349)");
                    }
                    Modifier.Companion companion2 = Modifier.INSTANCE;
                    Modifier modifierFillMaxWidth$default = SizeKt.fillMaxWidth$default(companion2, 0.0f, 1, null);
                    Arrangement.HorizontalOrVertical spaceBetween = Arrangement.INSTANCE.getSpaceBetween();
                    Alignment.Companion companion3 = Alignment.INSTANCE;
                    MeasurePolicy measurePolicyRowMeasurePolicy = RowKt.rowMeasurePolicy(spaceBetween, companion3.getCenterVertically(), composer, 54);
                    long currentCompositeKeyHashCode = ComposablesKt.getCurrentCompositeKeyHashCode(composer, 0);
                    int i2 = (int) (currentCompositeKeyHashCode ^ (currentCompositeKeyHashCode >>> 32));
                    CompositionLocalMap currentCompositionLocalMap = composer.getCurrentCompositionLocalMap();
                    Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(composer, modifierFillMaxWidth$default);
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
                    mr.z(companion4, composerM4318constructorimpl, measurePolicyRowMeasurePolicy, composerM4318constructorimpl, currentCompositionLocalMap);
                    Updater.m4326setimpl(composerM4318constructorimpl, modifierMaterializeModifier, (Function2<? super T, ? super Modifier, Unit>) id.h(companion4, composerM4318constructorimpl, Integer.valueOf(i2), composerM4318constructorimpl));
                    Modifier modifierFillMaxHeight$default = SizeKt.fillMaxHeight$default(zs1.E(RowScopeInstance.INSTANCE, companion2, 1.0f, false, 2, null), 0.0f, 1, null);
                    MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(companion3.getCenterStart(), false);
                    long currentCompositeKeyHashCode2 = ComposablesKt.getCurrentCompositeKeyHashCode(composer, 0);
                    int i3 = (int) (currentCompositeKeyHashCode2 ^ (currentCompositeKeyHashCode2 >>> 32));
                    CompositionLocalMap currentCompositionLocalMap2 = composer.getCurrentCompositionLocalMap();
                    Modifier modifierMaterializeModifier2 = ComposedModifierKt.materializeModifier(composer, modifierFillMaxHeight$default);
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
                    mr.z(companion4, composerM4318constructorimpl2, measurePolicyMaybeCachedBoxMeasurePolicy, composerM4318constructorimpl2, currentCompositionLocalMap2);
                    Updater.m4326setimpl(composerM4318constructorimpl2, modifierMaterializeModifier2, (Function2<? super T, ? super Modifier, Unit>) id.h(companion4, composerM4318constructorimpl2, Integer.valueOf(i3), composerM4318constructorimpl2));
                    BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
                    String name = mediaItem.getName();
                    TextStyle textStyleM7288copyp1EtxEg$default = TextStyle.m7288copyp1EtxEg$default(MaterialTheme.INSTANCE.getTypography(composer, MaterialTheme.$stable).getTitleMedium(), 0L, 0L, null, null, null, null, null, 0L, null, null, null, 0L, null, null, null, 0, 0, 0L, null, new PlatformTextStyle(false), null, 0, 0, null, 16252927, null);
                    if (((Boolean) mutableState.getValue()).booleanValue()) {
                        j = j3;
                    } else {
                        j = z2 ? j2 : u90.j;
                    }
                    TextKt.m3048TextNvy7gAk(name, null, j, null, 0L, null, null, null, 0L, null, null, 0L, TextOverflow.INSTANCE.m7761getEllipsisgIe3tQ8(), false, 1, 0, null, textStyleM7288copyp1EtxEg$default, composer, 0, 24960, 110586);
                    composer.endNode();
                    if (z2) {
                        composer.startReplaceGroup(-1333938942);
                        SpacerKt.Spacer(SizeKt.m1069width3ABfNKs(companion2, Dp.m7813constructorimpl(8.0f)), composer, 6);
                        IconKt.m2496Iconww6aTOc(CheckKt.getCheck(Icons.INSTANCE.getDefault()), (String) null, SizeKt.m1064size3ABfNKs(companion2, Dp.m7813constructorimpl(18.0f)), ((Boolean) mutableState.getValue()).booleanValue() ? j3 : j2, composer, 432, 0);
                        composer.endReplaceGroup();
                    } else {
                        composer.startReplaceGroup(-1333464208);
                        composer.endReplaceGroup();
                    }
                    composer.endNode();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                } else {
                    composer.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 1:
                return ExposedDropdownMenuKt$ExposedDropdownMenuBox$scope$1$1.exposedDropdownSize$lambda$3(this.b, (MutableIntState) obj5, (MutableIntState) obj4, (MeasureScope) obj, (Measurable) obj2, (Constraints) obj3);
            default:
                tn0 tn0Var = (tn0) obj5;
                u61 u61Var = (u61) obj4;
                Composer composer2 = (Composer) obj2;
                int iIntValue2 = ((Integer) obj3).intValue();
                ((BoxScope) obj).getClass();
                if (composer2.shouldExecute((iIntValue2 & 17) != 16, iIntValue2 & 1)) {
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-1429292450, iIntValue2, -1, "com.dh.myembyapp.ui.components.HomeRouteSwitchRow.<anonymous> (HomeMediaMenuDialog.kt:403)");
                    }
                    Modifier.Companion companion5 = Modifier.INSTANCE;
                    Modifier modifierM1001paddingVpY3zN4$default = PaddingKt.m1001paddingVpY3zN4$default(SizeKt.fillMaxSize$default(companion5, 0.0f, 1, null), Dp.m7813constructorimpl(14.0f), 0.0f, 2, null);
                    Alignment.Companion companion6 = Alignment.INSTANCE;
                    Alignment.Vertical centerVertically = companion6.getCenterVertically();
                    Arrangement arrangement = Arrangement.INSTANCE;
                    MeasurePolicy measurePolicyQ = mr.q(12.0f, arrangement, centerVertically, composer2, 54);
                    long currentCompositeKeyHashCode3 = ComposablesKt.getCurrentCompositeKeyHashCode(composer2, 0);
                    int i4 = (int) (currentCompositeKeyHashCode3 ^ (currentCompositeKeyHashCode3 >>> 32));
                    CompositionLocalMap currentCompositionLocalMap3 = composer2.getCurrentCompositionLocalMap();
                    Modifier modifierMaterializeModifier3 = ComposedModifierKt.materializeModifier(composer2, modifierM1001paddingVpY3zN4$default);
                    ComposeUiNode.Companion companion7 = ComposeUiNode.INSTANCE;
                    Function0<ComposeUiNode> constructor3 = companion7.getConstructor();
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
                    mr.z(companion7, composerM4318constructorimpl3, measurePolicyQ, composerM4318constructorimpl3, currentCompositionLocalMap3);
                    Updater.m4326setimpl(composerM4318constructorimpl3, modifierMaterializeModifier3, (Function2<? super T, ? super Modifier, Unit>) id.h(companion7, composerM4318constructorimpl3, Integer.valueOf(i4), composerM4318constructorimpl3));
                    RowScopeInstance rowScopeInstance2 = RowScopeInstance.INSTANCE;
                    boolean z3 = tn0Var.g;
                    boolean z4 = tn0Var.d;
                    String str = tn0Var.c;
                    String str2 = tn0Var.b;
                    Integer num = tn0Var.i;
                    String str3 = tn0Var.k;
                    ServerPingState serverPingState = tn0Var.j;
                    if (z3) {
                        composer2.startReplaceGroup(981527940);
                        Modifier modifierM1064size3ABfNKs = SizeKt.m1064size3ABfNKs(companion5, Dp.m7813constructorimpl(30.0f));
                        rowScopeInstance = rowScopeInstance2;
                        z = z4;
                        MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy2 = BoxKt.maybeCachedBoxMeasurePolicy(companion6.getCenter(), false);
                        long currentCompositeKeyHashCode4 = ComposablesKt.getCurrentCompositeKeyHashCode(composer2, 0);
                        companion = companion6;
                        int i5 = (int) (currentCompositeKeyHashCode4 ^ (currentCompositeKeyHashCode4 >>> 32));
                        CompositionLocalMap currentCompositionLocalMap4 = composer2.getCurrentCompositionLocalMap();
                        Modifier modifierMaterializeModifier4 = ComposedModifierKt.materializeModifier(composer2, modifierM1064size3ABfNKs);
                        Function0<ComposeUiNode> constructor4 = companion7.getConstructor();
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
                        mr.z(companion7, composerM4318constructorimpl4, measurePolicyMaybeCachedBoxMeasurePolicy2, composerM4318constructorimpl4, currentCompositionLocalMap4);
                        Updater.m4326setimpl(composerM4318constructorimpl4, modifierMaterializeModifier4, (Function2<? super T, ? super Modifier, Unit>) id.h(companion7, composerM4318constructorimpl4, Integer.valueOf(i5), composerM4318constructorimpl4));
                        BoxScopeInstance boxScopeInstance2 = BoxScopeInstance.INSTANCE;
                        if (num != null) {
                            composer2.startReplaceGroup(194695847);
                            ImageKt.Image(PainterResources_androidKt.painterResource(num.intValue(), composer2, 0), c61.n(str2, " 图标"), SizeKt.m1064size3ABfNKs(companion5, Dp.m7813constructorimpl(30.0f)), (Alignment) null, (ContentScale) null, 0.0f, (ColorFilter) null, composer2, Painter.$stable | RendererCapabilities.DECODER_SUPPORT_MASK, 120);
                            composer2.endReplaceGroup();
                        } else {
                            composer2.startReplaceGroup(195017875);
                            lx1.c(tn0Var.h, c61.n(str2, " 图标"), SizeKt.m1064size3ABfNKs(companion5, Dp.m7813constructorimpl(30.0f)), null, composer2, RendererCapabilities.DECODER_SUPPORT_MASK, 8);
                            composer2.endReplaceGroup();
                        }
                        composer2.endNode();
                        composer2.endReplaceGroup();
                    } else {
                        rowScopeInstance = rowScopeInstance2;
                        z = z4;
                        companion = companion6;
                        if (tn0Var.f != null) {
                            composer2.startReplaceGroup(982470743);
                            IconKt.m2496Iconww6aTOc(tn0Var.f, (String) null, SizeKt.m1064size3ABfNKs(companion5, Dp.m7813constructorimpl(20.0f)), Color.m5151copywmQWz5c$default(u61Var.A, 0.8f, 0.0f, 0.0f, 0.0f, 14, null), composer2, 432, 0);
                            composer2.endReplaceGroup();
                        } else {
                            composer2.startReplaceGroup(982764840);
                            composer2.endReplaceGroup();
                        }
                    }
                    Modifier modifierE = zs1.E(rowScopeInstance, companion5, 1.0f, false, 2, null);
                    MeasurePolicy measurePolicyColumnMeasurePolicy = ColumnKt.columnMeasurePolicy(StringsKt.isBlank(str) ? arrangement.getCenter() : arrangement.m712spacedBy0680j_4(Dp.m7813constructorimpl(2.0f)), companion.getStart(), composer2, 0);
                    long currentCompositeKeyHashCode5 = ComposablesKt.getCurrentCompositeKeyHashCode(composer2, 0);
                    int i6 = (int) (currentCompositeKeyHashCode5 ^ (currentCompositeKeyHashCode5 >>> 32));
                    CompositionLocalMap currentCompositionLocalMap5 = composer2.getCurrentCompositionLocalMap();
                    Modifier modifierMaterializeModifier5 = ComposedModifierKt.materializeModifier(composer2, modifierE);
                    Function0<ComposeUiNode> constructor5 = companion7.getConstructor();
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
                    mr.z(companion7, composerM4318constructorimpl5, measurePolicyColumnMeasurePolicy, composerM4318constructorimpl5, currentCompositionLocalMap5);
                    Updater.m4326setimpl(composerM4318constructorimpl5, modifierMaterializeModifier5, (Function2<? super T, ? super Modifier, Unit>) id.h(companion7, composerM4318constructorimpl5, Integer.valueOf(i6), composerM4318constructorimpl5));
                    ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.INSTANCE;
                    String str4 = tn0Var.b;
                    MaterialTheme materialTheme = MaterialTheme.INSTANCE;
                    int i7 = MaterialTheme.$stable;
                    TextKt.m3048TextNvy7gAk(str4, null, z ? u61Var.P : u61Var.A, null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 1, 0, null, materialTheme.getTypography(composer2, i7).getBodyLarge(), composer2, 0, 24576, 114682);
                    if (StringsKt.isBlank(str)) {
                        composer2.startReplaceGroup(2093187006);
                        composer2.endReplaceGroup();
                    } else {
                        composer2.startReplaceGroup(2092930822);
                        TextKt.m3048TextNvy7gAk(tn0Var.c, null, u61Var.B, null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 1, 0, null, materialTheme.getTypography(composer2, i7).getBodySmall(), composer2, 0, 24576, 114682);
                        composer2.endReplaceGroup();
                    }
                    composer2.endNode();
                    if (z2 && z) {
                        composer2.startReplaceGroup(983785391);
                        MeasurePolicy measurePolicyRowMeasurePolicy2 = RowKt.rowMeasurePolicy(arrangement.m712spacedBy0680j_4(Dp.m7813constructorimpl(8.0f)), companion.getCenterVertically(), composer2, 54);
                        long currentCompositeKeyHashCode6 = ComposablesKt.getCurrentCompositeKeyHashCode(composer2, 0);
                        int i8 = (int) ((currentCompositeKeyHashCode6 >>> 32) ^ currentCompositeKeyHashCode6);
                        CompositionLocalMap currentCompositionLocalMap6 = composer2.getCurrentCompositionLocalMap();
                        Modifier modifierMaterializeModifier6 = ComposedModifierKt.materializeModifier(composer2, companion5);
                        Function0<ComposeUiNode> constructor6 = companion7.getConstructor();
                        if (composer2.getApplier() == null) {
                            ComposablesKt.invalidApplier();
                        }
                        composer2.startReusableNode();
                        if (composer2.getInserting()) {
                            composer2.createNode(constructor6);
                        } else {
                            composer2.useNode();
                        }
                        Composer composerM4318constructorimpl6 = Updater.m4318constructorimpl(composer2);
                        mr.z(companion7, composerM4318constructorimpl6, measurePolicyRowMeasurePolicy2, composerM4318constructorimpl6, currentCompositionLocalMap6);
                        Updater.m4326setimpl(composerM4318constructorimpl6, modifierMaterializeModifier6, (Function2<? super T, ? super Modifier, Unit>) id.h(companion7, composerM4318constructorimpl6, Integer.valueOf(i8), composerM4318constructorimpl6));
                        if (serverPingState == null && str3 == null) {
                            composer2.startReplaceGroup(1423284647);
                            composer2.endReplaceGroup();
                        } else {
                            composer2.startReplaceGroup(1422355639);
                            MeasurePolicy measurePolicyP = mr.p(2.0f, arrangement, companion.getEnd(), composer2, 54);
                            long currentCompositeKeyHashCode7 = ComposablesKt.getCurrentCompositeKeyHashCode(composer2, 0);
                            int i9 = (int) (currentCompositeKeyHashCode7 ^ (currentCompositeKeyHashCode7 >>> 32));
                            CompositionLocalMap currentCompositionLocalMap7 = composer2.getCurrentCompositionLocalMap();
                            Modifier modifierMaterializeModifier7 = ComposedModifierKt.materializeModifier(composer2, companion5);
                            Function0<ComposeUiNode> constructor7 = companion7.getConstructor();
                            if (composer2.getApplier() == null) {
                                ComposablesKt.invalidApplier();
                            }
                            composer2.startReusableNode();
                            if (composer2.getInserting()) {
                                composer2.createNode(constructor7);
                            } else {
                                composer2.useNode();
                            }
                            Composer composerM4318constructorimpl7 = Updater.m4318constructorimpl(composer2);
                            mr.z(companion7, composerM4318constructorimpl7, measurePolicyP, composerM4318constructorimpl7, currentCompositionLocalMap7);
                            Updater.m4326setimpl(composerM4318constructorimpl7, modifierMaterializeModifier7, (Function2<? super T, ? super Modifier, Unit>) id.h(companion7, composerM4318constructorimpl7, Integer.valueOf(i9), composerM4318constructorimpl7));
                            if (serverPingState == null) {
                                composer2.startReplaceGroup(-1678411867);
                                composer2.endReplaceGroup();
                            } else {
                                composer2.startReplaceGroup(-1678411866);
                                ny1.a(serverPingState, null, TextUnitKt.getSp(12), null, composer2, RendererCapabilities.DECODER_SUPPORT_MASK);
                                Unit unit = Unit.INSTANCE;
                                composer2.endReplaceGroup();
                            }
                            if (str3 == null) {
                                composer2.startReplaceGroup(-1678113399);
                                composer2.endReplaceGroup();
                            } else {
                                composer2.startReplaceGroup(-1678113398);
                                TextKt.m3048TextNvy7gAk(str3, null, u61Var.B, null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 1, 0, null, materialTheme.getTypography(composer2, i7).getLabelSmall(), composer2, 0, 24576, 114682);
                                Unit unit2 = Unit.INSTANCE;
                                composer2.endReplaceGroup();
                            }
                            composer2.endNode();
                            composer2.endReplaceGroup();
                        }
                        IconKt.m2496Iconww6aTOc(CheckKt.getCheck(Icons.INSTANCE.getDefault()), "当前服务器", SizeKt.m1064size3ABfNKs(companion5, Dp.m7813constructorimpl(18.0f)), u61Var.P, composer2, 432, 0);
                        composer2.endNode();
                        composer2.endReplaceGroup();
                    } else {
                        composer2.startReplaceGroup(985322743);
                        if (serverPingState == null && str3 == null) {
                            composer2.startReplaceGroup(986278504);
                            composer2.endReplaceGroup();
                        } else {
                            composer2.startReplaceGroup(985422656);
                            MeasurePolicy measurePolicyP2 = mr.p(2.0f, arrangement, companion.getEnd(), composer2, 54);
                            long currentCompositeKeyHashCode8 = ComposablesKt.getCurrentCompositeKeyHashCode(composer2, 0);
                            int i10 = (int) (currentCompositeKeyHashCode8 ^ (currentCompositeKeyHashCode8 >>> 32));
                            CompositionLocalMap currentCompositionLocalMap8 = composer2.getCurrentCompositionLocalMap();
                            Modifier modifierMaterializeModifier8 = ComposedModifierKt.materializeModifier(composer2, companion5);
                            Function0<ComposeUiNode> constructor8 = companion7.getConstructor();
                            if (composer2.getApplier() == null) {
                                ComposablesKt.invalidApplier();
                            }
                            composer2.startReusableNode();
                            if (composer2.getInserting()) {
                                composer2.createNode(constructor8);
                            } else {
                                composer2.useNode();
                            }
                            Composer composerM4318constructorimpl8 = Updater.m4318constructorimpl(composer2);
                            mr.z(companion7, composerM4318constructorimpl8, measurePolicyP2, composerM4318constructorimpl8, currentCompositionLocalMap8);
                            Updater.m4326setimpl(composerM4318constructorimpl8, modifierMaterializeModifier8, (Function2<? super T, ? super Modifier, Unit>) id.h(companion7, composerM4318constructorimpl8, Integer.valueOf(i10), composerM4318constructorimpl8));
                            if (serverPingState == null) {
                                composer2.startReplaceGroup(1971028510);
                                composer2.endReplaceGroup();
                            } else {
                                composer2.startReplaceGroup(1971028511);
                                ny1.a(serverPingState, null, TextUnitKt.getSp(12), null, composer2, RendererCapabilities.DECODER_SUPPORT_MASK);
                                Unit unit3 = Unit.INSTANCE;
                                composer2.endReplaceGroup();
                            }
                            if (str3 == null) {
                                composer2.startReplaceGroup(1971302922);
                                composer2.endReplaceGroup();
                            } else {
                                composer2.startReplaceGroup(1971302923);
                                TextKt.m3048TextNvy7gAk(str3, null, u61Var.B, null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 1, 0, null, materialTheme.getTypography(composer2, i7).getLabelSmall(), composer2, 0, 24576, 114682);
                                Unit unit4 = Unit.INSTANCE;
                                composer2.endReplaceGroup();
                            }
                            composer2.endNode();
                            composer2.endReplaceGroup();
                        }
                        composer2.endReplaceGroup();
                    }
                    composer2.endNode();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                } else {
                    composer2.skipToGroupEnd();
                }
                return Unit.INSTANCE;
        }
    }

    public /* synthetic */ r60(boolean z, Object obj, MutableState mutableState, int i) {
        this.a = i;
        this.b = z;
        this.c = obj;
        this.d = mutableState;
    }
}
