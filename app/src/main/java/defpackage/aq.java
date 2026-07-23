package defpackage;

import androidx.compose.foundation.ClickableKt;
import androidx.compose.foundation.ScrollKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnScope;
import androidx.compose.foundation.layout.ColumnScopeInstance;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.foundation.layout.RowKt;
import androidx.compose.foundation.layout.RowScopeInstance;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.SpacerKt;
import androidx.compose.foundation.lazy.LazyDslKt;
import androidx.compose.material3.CardDefaults;
import androidx.compose.material3.CardKt;
import androidx.compose.material3.MaterialTheme;
import androidx.compose.material3.ProgressIndicatorKt;
import androidx.compose.material3.TextKt;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.focus.FocusRequester;
import androidx.compose.ui.focus.FocusRequesterModifierKt;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.semantics.Role;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.text.font.FontWeight;
import androidx.compose.ui.text.style.TextOverflow;
import androidx.compose.ui.unit.Dp;
import androidx.media3.exoplayer.RendererCapabilities;
import java.util.ArrayList;
import java.util.List;
import kotlin.Function;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.text.StringsKt;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class aq implements Function3 {
    public final /* synthetic */ int a = 2;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ String c;
    public final /* synthetic */ Function0 d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object g;
    public final /* synthetic */ Object h;
    public final /* synthetic */ Object i;

    public /* synthetic */ aq(u61 u61Var, ve2 ve2Var, FocusRequester focusRequester, String str, Function0 function0, Function0 function1, boolean z) {
        this.b = z;
        this.e = u61Var;
        this.g = ve2Var;
        this.c = str;
        this.i = focusRequester;
        this.d = function0;
        this.h = function1;
    }

    @Override // kotlin.jvm.functions.Function3
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        int i = this.a;
        boolean z = this.b;
        Object obj4 = this.h;
        Object obj5 = this.i;
        Object obj6 = this.g;
        Object obj7 = this.e;
        switch (i) {
            case 0:
                return ClickableKt.combinedClickable_cJG_KMw$lambda$1(this.b, this.c, (Role) obj6, (String) obj7, this.d, (Function0) obj4, (Function0) obj5, (Modifier) obj, (Composer) obj2, ((Integer) obj3).intValue());
            case 1:
                List list = (List) obj7;
                FocusRequester focusRequester = (FocusRequester) obj6;
                FocusRequester focusRequester2 = (FocusRequester) obj4;
                Function1 function1 = (Function1) obj5;
                Composer composer = (Composer) obj2;
                int iIntValue = ((Integer) obj3).intValue();
                ((ColumnScope) obj).getClass();
                if (composer.shouldExecute((iIntValue & 17) != 16, iIntValue & 1)) {
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(1333481291, iIntValue, -1, "com.dh.myembyapp.ui.screens.detail.ExternalPlayerPickerDialog.<anonymous>.<anonymous>.<anonymous> (DetailScreen.kt:4362)");
                    }
                    Modifier.Companion companion = Modifier.INSTANCE;
                    Modifier modifierM999padding3ABfNKs = PaddingKt.m999padding3ABfNKs(SizeKt.fillMaxWidth$default(companion, 0.0f, 1, null), Dp.m7813constructorimpl(24.0f));
                    Arrangement arrangement = Arrangement.INSTANCE;
                    Arrangement.HorizontalOrVertical horizontalOrVerticalM712spacedBy0680j_4 = arrangement.m712spacedBy0680j_4(Dp.m7813constructorimpl(18.0f));
                    Alignment.Companion companion2 = Alignment.INSTANCE;
                    MeasurePolicy measurePolicyColumnMeasurePolicy = ColumnKt.columnMeasurePolicy(horizontalOrVerticalM712spacedBy0680j_4, companion2.getStart(), composer, 6);
                    long currentCompositeKeyHashCode = ComposablesKt.getCurrentCompositeKeyHashCode(composer, 0);
                    int i2 = (int) (currentCompositeKeyHashCode ^ (currentCompositeKeyHashCode >>> 32));
                    CompositionLocalMap currentCompositionLocalMap = composer.getCurrentCompositionLocalMap();
                    Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(composer, modifierM999padding3ABfNKs);
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
                    mr.z(companion3, composerM4318constructorimpl, measurePolicyColumnMeasurePolicy, composerM4318constructorimpl, currentCompositionLocalMap);
                    Updater.m4326setimpl(composerM4318constructorimpl, modifierMaterializeModifier, (Function2<? super T, ? super Modifier, Unit>) id.h(companion3, composerM4318constructorimpl, Integer.valueOf(i2), composerM4318constructorimpl));
                    ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.INSTANCE;
                    MaterialTheme materialTheme = MaterialTheme.INSTANCE;
                    int i3 = MaterialTheme.$stable;
                    TextStyle titleLarge = materialTheme.getTypography(composer, i3).getTitleLarge();
                    Color.Companion companion4 = Color.INSTANCE;
                    long jM5189getWhite0d7_KjU = companion4.m5189getWhite0d7_KjU();
                    TextOverflow.Companion companion5 = TextOverflow.INSTANCE;
                    TextKt.m3048TextNvy7gAk("选择外部播放器", null, jM5189getWhite0d7_KjU, null, 0L, null, null, null, 0L, null, null, 0L, companion5.m7761getEllipsisgIe3tQ8(), false, 1, 0, null, titleLarge, composer, 390, 24960, 110586);
                    if (z) {
                        composer.startReplaceGroup(-904154620);
                        Modifier modifierM1050height3ABfNKs = SizeKt.m1050height3ABfNKs(SizeKt.fillMaxWidth$default(companion, 0.0f, 1, null), Dp.m7813constructorimpl(130.0f));
                        MeasurePolicy measurePolicyRowMeasurePolicy = RowKt.rowMeasurePolicy(arrangement.getCenter(), companion2.getCenterVertically(), composer, 54);
                        long currentCompositeKeyHashCode2 = ComposablesKt.getCurrentCompositeKeyHashCode(composer, 0);
                        int i4 = (int) (currentCompositeKeyHashCode2 ^ (currentCompositeKeyHashCode2 >>> 32));
                        CompositionLocalMap currentCompositionLocalMap2 = composer.getCurrentCompositionLocalMap();
                        Modifier modifierMaterializeModifier2 = ComposedModifierKt.materializeModifier(composer, modifierM1050height3ABfNKs);
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
                        mr.z(companion3, composerM4318constructorimpl2, measurePolicyRowMeasurePolicy, composerM4318constructorimpl2, currentCompositionLocalMap2);
                        Updater.m4326setimpl(composerM4318constructorimpl2, modifierMaterializeModifier2, (Function2<? super T, ? super Modifier, Unit>) id.h(companion3, composerM4318constructorimpl2, Integer.valueOf(i4), composerM4318constructorimpl2));
                        RowScopeInstance rowScopeInstance = RowScopeInstance.INSTANCE;
                        ProgressIndicatorKt.m2703CircularProgressIndicator4lLiAd8(null, companion4.m5189getWhite0d7_KjU(), 0.0f, 0L, 0, 0.0f, composer, 48, 61);
                        SpacerKt.Spacer(SizeKt.m1069width3ABfNKs(companion, Dp.m7813constructorimpl(14.0f)), composer, 6);
                        TextKt.m3048TextNvy7gAk("正在准备播放地址...", null, Color.m5151copywmQWz5c$default(companion4.m5189getWhite0d7_KjU(), 0.86f, 0.0f, 0.0f, 0.0f, 14, null), null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, materialTheme.getTypography(composer, i3).getBodyMedium(), composer, 390, 0, 131066);
                        composer.endNode();
                        composer.endReplaceGroup();
                        Unit unit = Unit.INSTANCE;
                    } else {
                        String str = this.c;
                        Function0 function0 = this.d;
                        if (str != null && list.isEmpty()) {
                            composer.startReplaceGroup(-903239097);
                            u90.a0(str, focusRequester, function0, composer, 0);
                            composer.endReplaceGroup();
                            Unit unit2 = Unit.INSTANCE;
                        } else if (list.isEmpty()) {
                            composer.startReplaceGroup(-902903677);
                            u90.a0("未找到可打开视频的外部播放器", focusRequester, function0, composer, 6);
                            composer.endReplaceGroup();
                            Unit unit3 = Unit.INSTANCE;
                        } else {
                            composer.startReplaceGroup(-902537164);
                            Modifier modifierFillMaxWidth$default = SizeKt.fillMaxWidth$default(companion, 0.0f, 1, null);
                            Arrangement.HorizontalOrVertical horizontalOrVerticalM712spacedBy0680j_5 = arrangement.m712spacedBy0680j_4(Dp.m7813constructorimpl(14.0f));
                            PaddingValues paddingValuesM993PaddingValuesYgX7TsA = PaddingKt.m993PaddingValuesYgX7TsA(Dp.m7813constructorimpl(12.0f), Dp.m7813constructorimpl(8.0f));
                            boolean zChangedInstance = composer.changedInstance(list) | composer.changed(focusRequester2) | composer.changed(function1);
                            Object objRememberedValue = composer.rememberedValue();
                            if (zChangedInstance || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                                objRememberedValue = new c1((Object) list, (Object) focusRequester2, (Function) function1, 10);
                                composer.updateRememberedValue(objRememberedValue);
                            }
                            LazyDslKt.LazyRow(modifierFillMaxWidth$default, null, paddingValuesM993PaddingValuesYgX7TsA, false, horizontalOrVerticalM712spacedBy0680j_5, null, null, false, null, (Function1) objRememberedValue, composer, 24966, 490);
                            if (str == null) {
                                composer.startReplaceGroup(-901552946);
                                composer.endReplaceGroup();
                            } else {
                                composer.startReplaceGroup(-901552945);
                                TextKt.m3048TextNvy7gAk(str, null, Color.m5151copywmQWz5c$default(companion4.m5189getWhite0d7_KjU(), 0.72f, 0.0f, 0.0f, 0.0f, 14, null), null, 0L, null, null, null, 0L, null, null, 0L, companion5.m7761getEllipsisgIe3tQ8(), false, 1, 0, null, materialTheme.getTypography(composer, i3).getBodySmall(), composer, RendererCapabilities.DECODER_SUPPORT_MASK, 24960, 110586);
                                Unit unit4 = Unit.INSTANCE;
                                composer.endReplaceGroup();
                            }
                            composer.endReplaceGroup();
                        }
                    }
                    composer.endNode();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                } else {
                    composer.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            default:
                u61 u61Var = (u61) obj7;
                ve2 ve2Var = (ve2) obj6;
                FocusRequester focusRequester3 = (FocusRequester) obj5;
                Function0 function2 = (Function0) obj4;
                Composer composer2 = (Composer) obj2;
                int iIntValue2 = ((Integer) obj3).intValue();
                ((ColumnScope) obj).getClass();
                if (composer2.shouldExecute((iIntValue2 & 17) != 16, iIntValue2 & 1)) {
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(951492588, iIntValue2, -1, "com.dh.myembyapp.ui.components.WebDavDownloadConfirmDialog.<anonymous>.<anonymous>.<anonymous> (WebDavSyncDialog.kt:758)");
                    }
                    Modifier.Companion companion6 = Modifier.INSTANCE;
                    Modifier modifierM999padding3ABfNKs2 = PaddingKt.m999padding3ABfNKs(SizeKt.fillMaxSize$default(companion6, 0.0f, 1, null), Dp.m7813constructorimpl(20.0f));
                    Arrangement arrangement2 = Arrangement.INSTANCE;
                    Arrangement.HorizontalOrVertical horizontalOrVerticalM712spacedBy0680j_6 = arrangement2.m712spacedBy0680j_4(Dp.m7813constructorimpl(12.0f));
                    Alignment.Companion companion7 = Alignment.INSTANCE;
                    MeasurePolicy measurePolicyColumnMeasurePolicy2 = ColumnKt.columnMeasurePolicy(horizontalOrVerticalM712spacedBy0680j_6, companion7.getStart(), composer2, 6);
                    long currentCompositeKeyHashCode3 = ComposablesKt.getCurrentCompositeKeyHashCode(composer2, 0);
                    int i5 = (int) (currentCompositeKeyHashCode3 ^ (currentCompositeKeyHashCode3 >>> 32));
                    CompositionLocalMap currentCompositionLocalMap3 = composer2.getCurrentCompositionLocalMap();
                    Modifier modifierMaterializeModifier3 = ComposedModifierKt.materializeModifier(composer2, modifierM999padding3ABfNKs2);
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
                    mr.z(companion8, composerM4318constructorimpl3, measurePolicyColumnMeasurePolicy2, composerM4318constructorimpl3, currentCompositionLocalMap3);
                    Updater.m4326setimpl(composerM4318constructorimpl3, modifierMaterializeModifier3, (Function2<? super T, ? super Modifier, Unit>) id.h(companion8, composerM4318constructorimpl3, Integer.valueOf(i5), composerM4318constructorimpl3));
                    Modifier modifierVerticalScroll$default = ScrollKt.verticalScroll$default(wn.F(ColumnScopeInstance.INSTANCE, companion6, 1.0f, false, 2, null), ScrollKt.rememberScrollState(0, composer2, 0, 1), false, null, false, 14, null);
                    MeasurePolicy measurePolicyColumnMeasurePolicy3 = ColumnKt.columnMeasurePolicy(arrangement2.m712spacedBy0680j_4(Dp.m7813constructorimpl(12.0f)), companion7.getStart(), composer2, 6);
                    long currentCompositeKeyHashCode4 = ComposablesKt.getCurrentCompositeKeyHashCode(composer2, 0);
                    int i6 = (int) (currentCompositeKeyHashCode4 ^ (currentCompositeKeyHashCode4 >>> 32));
                    CompositionLocalMap currentCompositionLocalMap4 = composer2.getCurrentCompositionLocalMap();
                    Modifier modifierMaterializeModifier4 = ComposedModifierKt.materializeModifier(composer2, modifierVerticalScroll$default);
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
                    mr.z(companion8, composerM4318constructorimpl4, measurePolicyColumnMeasurePolicy3, composerM4318constructorimpl4, currentCompositionLocalMap4);
                    Updater.m4326setimpl(composerM4318constructorimpl4, modifierMaterializeModifier4, (Function2<? super T, ? super Modifier, Unit>) id.h(companion8, composerM4318constructorimpl4, Integer.valueOf(i6), composerM4318constructorimpl4));
                    MaterialTheme materialTheme2 = MaterialTheme.INSTANCE;
                    int i7 = MaterialTheme.$stable;
                    TextKt.m3048TextNvy7gAk("确认下载配置", null, 0L, null, 0L, null, FontWeight.INSTANCE.getBold(), null, 0L, null, null, 0L, 0, false, 0, 0, null, materialTheme2.getTypography(composer2, i7).getTitleLarge(), composer2, 1572870, 0, 131006);
                    TextKt.m3048TextNvy7gAk("下载后会覆盖当前电视上已勾选的本地配置，请先确认远端快照来源和同步范围。", null, Color.m5151copywmQWz5c$default(materialTheme2.getColorScheme(composer2, i7).getOnSurface(), 0.72f, 0.0f, 0.0f, 0.0f, 14, null), null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, materialTheme2.getTypography(composer2, i7).getBodySmall(), composer2, 6, 0, 131066);
                    Modifier modifierFillMaxWidth$default2 = SizeKt.fillMaxWidth$default(companion6, 0.0f, 1, null);
                    MeasurePolicy measurePolicyRowMeasurePolicy2 = RowKt.rowMeasurePolicy(arrangement2.m712spacedBy0680j_4(Dp.m7813constructorimpl(12.0f)), companion7.getTop(), composer2, 54);
                    long currentCompositeKeyHashCode5 = ComposablesKt.getCurrentCompositeKeyHashCode(composer2, 0);
                    int i8 = (int) (currentCompositeKeyHashCode5 ^ (currentCompositeKeyHashCode5 >>> 32));
                    CompositionLocalMap currentCompositionLocalMap5 = composer2.getCurrentCompositionLocalMap();
                    Modifier modifierMaterializeModifier5 = ComposedModifierKt.materializeModifier(composer2, modifierFillMaxWidth$default2);
                    Function0<ComposeUiNode> constructor5 = companion8.getConstructor();
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
                    mr.z(companion8, composerM4318constructorimpl5, measurePolicyRowMeasurePolicy2, composerM4318constructorimpl5, currentCompositionLocalMap5);
                    Updater.m4326setimpl(composerM4318constructorimpl5, modifierMaterializeModifier5, (Function2<? super T, ? super Modifier, Unit>) id.h(companion8, composerM4318constructorimpl5, Integer.valueOf(i8), composerM4318constructorimpl5));
                    RowScopeInstance rowScopeInstance2 = RowScopeInstance.INSTANCE;
                    Modifier modifierE = zs1.E(rowScopeInstance2, companion6, 1.0f, false, 2, null);
                    List listCreateListBuilder = CollectionsKt.createListBuilder();
                    rf2 rf2Var = ve2Var.a;
                    ArrayList arrayList = ve2Var.e;
                    String deviceModel = rf2Var.getDeviceModel();
                    if (StringsKt.isBlank(deviceModel)) {
                        deviceModel = "未知设备";
                    }
                    listCreateListBuilder.add("上传设备：" + ((Object) deviceModel));
                    String appVersionName = rf2Var.getAppVersionName();
                    if (StringsKt.isBlank(appVersionName)) {
                        appVersionName = "未知版本";
                    }
                    listCreateListBuilder.add("应用版本：" + ((Object) appVersionName));
                    listCreateListBuilder.add("导出时间：" + this.c);
                    we2 serverState = rf2Var.getServerState();
                    if (serverState != null) {
                        listCreateListBuilder.add("远端服务器数：" + serverState.getServers().size());
                        Unit unit5 = Unit.INSTANCE;
                    }
                    Unit unit6 = Unit.INSTANCE;
                    ef2.e(modifierE, "远端快照", CollectionsKt.build(listCreateListBuilder), composer2, 48, 0);
                    Modifier modifierE2 = zs1.E(rowScopeInstance2, companion6, 1.0f, false, 2, null);
                    List listCreateListBuilder2 = CollectionsKt.createListBuilder();
                    listCreateListBuilder2.add("你已勾选：" + CollectionsKt___CollectionsKt.joinToString$default(ve2Var.c, "、", null, null, 0, null, null, 62, null));
                    listCreateListBuilder2.add("远端包含：" + CollectionsKt___CollectionsKt.joinToString$default(ve2Var.b, "、", null, null, 0, null, null, 62, null));
                    listCreateListBuilder2.add("本次将覆盖：" + CollectionsKt___CollectionsKt.joinToString$default(ve2Var.d, "、", null, null, 0, null, null, 62, null));
                    if (!arrayList.isEmpty()) {
                        listCreateListBuilder2.add("远端未包含：" + CollectionsKt___CollectionsKt.joinToString$default(arrayList, "、", null, null, 0, null, null, 62, null));
                    }
                    ef2.e(modifierE2, "本次下载范围", CollectionsKt.build(listCreateListBuilder2), composer2, 48, 0);
                    composer2.endNode();
                    CardKt.Card(null, null, CardDefaults.INSTANCE.m2119cardColorsro_MJ88(u61Var.C, 0L, 0L, 0L, composer2, CardDefaults.$stable << 12, 14), null, null, ComposableLambdaKt.rememberComposableLambda(1492766286, true, new i2(ve2Var, 22), composer2, 54), composer2, ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE, 27);
                    composer2.endNode();
                    if (z) {
                        composer2.startReplaceGroup(124886570);
                        TextKt.m3048TextNvy7gAk("下载配置进行中，请稍候...", null, materialTheme2.getColorScheme(composer2, i7).getPrimary(), null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, materialTheme2.getTypography(composer2, i7).getBodySmall(), composer2, 6, 0, 131066);
                        composer2.endReplaceGroup();
                    } else {
                        composer2.startReplaceGroup(125125580);
                        composer2.endReplaceGroup();
                    }
                    Modifier modifierFillMaxWidth$default3 = SizeKt.fillMaxWidth$default(companion6, 0.0f, 1, null);
                    MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(companion7.getCenter(), false);
                    long currentCompositeKeyHashCode6 = ComposablesKt.getCurrentCompositeKeyHashCode(composer2, 0);
                    int i9 = (int) (currentCompositeKeyHashCode6 ^ (currentCompositeKeyHashCode6 >>> 32));
                    CompositionLocalMap currentCompositionLocalMap6 = composer2.getCurrentCompositionLocalMap();
                    Modifier modifierMaterializeModifier6 = ComposedModifierKt.materializeModifier(composer2, modifierFillMaxWidth$default3);
                    Function0<ComposeUiNode> constructor6 = companion8.getConstructor();
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
                    mr.z(companion8, composerM4318constructorimpl6, measurePolicyMaybeCachedBoxMeasurePolicy, composerM4318constructorimpl6, currentCompositionLocalMap6);
                    Updater.m4326setimpl(composerM4318constructorimpl6, modifierMaterializeModifier6, (Function2<? super T, ? super Modifier, Unit>) id.h(companion8, composerM4318constructorimpl6, Integer.valueOf(i9), composerM4318constructorimpl6));
                    BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
                    MeasurePolicy measurePolicyRowMeasurePolicy3 = RowKt.rowMeasurePolicy(arrangement2.m712spacedBy0680j_4(Dp.m7813constructorimpl(12.0f)), companion7.getTop(), composer2, 6);
                    long currentCompositeKeyHashCode7 = ComposablesKt.getCurrentCompositeKeyHashCode(composer2, 0);
                    int i10 = (int) (currentCompositeKeyHashCode7 ^ (currentCompositeKeyHashCode7 >>> 32));
                    CompositionLocalMap currentCompositionLocalMap7 = composer2.getCurrentCompositionLocalMap();
                    Modifier modifierMaterializeModifier7 = ComposedModifierKt.materializeModifier(composer2, companion6);
                    Function0<ComposeUiNode> constructor7 = companion8.getConstructor();
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
                    mr.z(companion8, composerM4318constructorimpl7, measurePolicyRowMeasurePolicy3, composerM4318constructorimpl7, currentCompositionLocalMap7);
                    Updater.m4326setimpl(composerM4318constructorimpl7, modifierMaterializeModifier7, (Function2<? super T, ? super Modifier, Unit>) id.h(companion8, composerM4318constructorimpl7, Integer.valueOf(i10), composerM4318constructorimpl7));
                    boolean z2 = !z;
                    ef2.a(48, 8, null, composer2, FocusRequesterModifierKt.focusRequester(SizeKt.m1069width3ABfNKs(companion6, Dp.m7813constructorimpl(176.0f)), focusRequester3), "取消", this.d, z2);
                    ef2.a(3126, 0, jc2.d, composer2, SizeKt.m1069width3ABfNKs(companion6, Dp.m7813constructorimpl(176.0f)), "确认下载", function2, z2);
                    if (i02.w(composer2)) {
                        ComposerKt.traceEventEnd();
                    }
                } else {
                    composer2.skipToGroupEnd();
                }
                return Unit.INSTANCE;
        }
    }

    public /* synthetic */ aq(boolean z, String str, Role role, Function0 function0, Function0 function1, Function0 function2, String str2) {
        this.b = z;
        this.c = str;
        this.g = role;
        this.e = str2;
        this.d = function0;
        this.h = function1;
        this.i = function2;
    }

    public /* synthetic */ aq(boolean z, String str, List list, FocusRequester focusRequester, Function0 function0, FocusRequester focusRequester2, Function1 function1) {
        this.b = z;
        this.c = str;
        this.e = list;
        this.g = focusRequester;
        this.d = function0;
        this.h = focusRequester2;
        this.i = function1;
    }
}
