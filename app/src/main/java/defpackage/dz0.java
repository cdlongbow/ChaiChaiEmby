package defpackage;

import androidx.compose.foundation.BasicMarqueeKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScope;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnScope;
import androidx.compose.foundation.layout.ColumnScopeInstance;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.RowKt;
import androidx.compose.foundation.layout.RowScopeInstance;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.material.icons.Icons;
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
import androidx.compose.ui.focus.FocusRequester;
import androidx.compose.ui.focus.FocusRequesterModifierKt;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.ColorKt;
import androidx.compose.ui.graphics.vector.ImageVector;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.text.font.FontWeight;
import androidx.compose.ui.text.style.TextOverflow;
import androidx.compose.ui.unit.Dp;
import androidx.media3.exoplayer.RendererCapabilities;
import java.util.List;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class dz0 implements Function3 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ boolean c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object g;

    public /* synthetic */ dz0(se seVar, String str, boolean z, MutableState mutableState, List list) {
        this.a = 1;
        this.e = seVar;
        this.b = str;
        this.c = z;
        this.d = mutableState;
        this.g = list;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.jvm.functions.Function3
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        int i = this.a;
        Object obj4 = this.d;
        Object obj5 = this.b;
        Object obj6 = this.g;
        Object obj7 = this.e;
        boolean z = this.c;
        switch (i) {
            case 0:
                u61 u61Var = (u61) obj7;
                ImageVector imageVector = (ImageVector) obj6;
                String str = (String) obj5;
                MutableState mutableState = (MutableState) obj4;
                Composer composer = (Composer) obj2;
                int iIntValue = ((Integer) obj3).intValue();
                ((BoxScope) obj).getClass();
                if (composer.shouldExecute((iIntValue & 17) != 16, iIntValue & 1)) {
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-1162479348, iIntValue, -1, "com.dh.myembyapp.ui.components.LibraryVisibilityRow.<anonymous> (LibraryVisibilityDialog.kt:167)");
                    }
                    Modifier.Companion companion = Modifier.INSTANCE;
                    Modifier modifierM1001paddingVpY3zN4$default = PaddingKt.m1001paddingVpY3zN4$default(SizeKt.fillMaxSize$default(companion, 0.0f, 1, null), Dp.m7813constructorimpl(12.0f), 0.0f, 2, null);
                    MeasurePolicy measurePolicyQ = mr.q(10.0f, Arrangement.INSTANCE, Alignment.INSTANCE.getCenterVertically(), composer, 54);
                    long currentCompositeKeyHashCode = ComposablesKt.getCurrentCompositeKeyHashCode(composer, 0);
                    int i2 = (int) (currentCompositeKeyHashCode ^ (currentCompositeKeyHashCode >>> 32));
                    CompositionLocalMap currentCompositionLocalMap = composer.getCurrentCompositionLocalMap();
                    Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(composer, modifierM1001paddingVpY3zN4$default);
                    ComposeUiNode.Companion companion2 = ComposeUiNode.INSTANCE;
                    Function0<ComposeUiNode> constructor = companion2.getConstructor();
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
                    mr.z(companion2, composerM4318constructorimpl, measurePolicyQ, composerM4318constructorimpl, currentCompositionLocalMap);
                    Updater.m4326setimpl(composerM4318constructorimpl, modifierMaterializeModifier, (Function2<? super T, ? super Modifier, Unit>) id.h(companion2, composerM4318constructorimpl, Integer.valueOf(i2), composerM4318constructorimpl));
                    RowScopeInstance rowScopeInstance = RowScopeInstance.INSTANCE;
                    IconKt.m2496Iconww6aTOc(CheckKt.getCheck(Icons.INSTANCE.getDefault()), (String) null, SizeKt.m1064size3ABfNKs(companion, Dp.m7813constructorimpl(18.0f)), z ? u61Var.P : Color.m5151copywmQWz5c$default(u61Var.A, 0.2f, 0.0f, 0.0f, 0.0f, 14, null), composer, 432, 0);
                    IconKt.m2496Iconww6aTOc(imageVector, (String) null, SizeKt.m1064size3ABfNKs(companion, Dp.m7813constructorimpl(20.0f)), Color.m5151copywmQWz5c$default(u61Var.A, ((Boolean) mutableState.getValue()).booleanValue() ? 1.0f : 0.9f, 0.0f, 0.0f, 0.0f, 14, null), composer, 432, 0);
                    TextKt.m3048TextNvy7gAk(str, null, u61Var.A, null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 1, 0, null, MaterialTheme.INSTANCE.getTypography(composer, MaterialTheme.$stable).getBodyMedium(), composer, 0, 24576, 114682);
                    composer.endNode();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                } else {
                    composer.skipToGroupEnd();
                }
                break;
            case 1:
                se seVar = (se) obj7;
                String str2 = (String) obj5;
                MutableState mutableState2 = (MutableState) obj4;
                List list = (List) obj6;
                Composer composer2 = (Composer) obj2;
                int iIntValue2 = ((Integer) obj3).intValue();
                ((BoxScope) obj).getClass();
                if (composer2.shouldExecute((iIntValue2 & 17) != 16, iIntValue2 & 1)) {
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-1737841589, iIntValue2, -1, "com.dh.myembyapp.ui.components.OnlineSubtitleFilePickerDialog.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (OnlineSubtitleSearchDialog.kt:808)");
                    }
                    Modifier modifierM281basicMarquee1Mj1MLw$default = Modifier.INSTANCE;
                    Modifier modifierM1000paddingVpY3zN4 = PaddingKt.m1000paddingVpY3zN4(SizeKt.fillMaxWidth$default(modifierM281basicMarquee1Mj1MLw$default, 0.0f, 1, null), Dp.m7813constructorimpl(12.0f), Dp.m7813constructorimpl(10.0f));
                    MeasurePolicy measurePolicyColumnMeasurePolicy = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.m712spacedBy0680j_4(Dp.m7813constructorimpl(4.0f)), Alignment.INSTANCE.getStart(), composer2, 6);
                    long currentCompositeKeyHashCode2 = ComposablesKt.getCurrentCompositeKeyHashCode(composer2, 0);
                    int i3 = (int) (currentCompositeKeyHashCode2 ^ (currentCompositeKeyHashCode2 >>> 32));
                    CompositionLocalMap currentCompositionLocalMap2 = composer2.getCurrentCompositionLocalMap();
                    Modifier modifierMaterializeModifier2 = ComposedModifierKt.materializeModifier(composer2, modifierM1000paddingVpY3zN4);
                    ComposeUiNode.Companion companion3 = ComposeUiNode.INSTANCE;
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
                    Updater.m4326setimpl(composerM4318constructorimpl2, modifierMaterializeModifier2, (Function2<? super T, ? super Modifier, Unit>) id.h(companion3, composerM4318constructorimpl2, Integer.valueOf(i3), composerM4318constructorimpl2));
                    ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.INSTANCE;
                    String str3 = seVar.a;
                    Modifier modifierFillMaxWidth$default = SizeKt.fillMaxWidth$default(modifierM281basicMarquee1Mj1MLw$default, 0.0f, 1, null);
                    if (((Boolean) mutableState2.getValue()).booleanValue()) {
                        modifierM281basicMarquee1Mj1MLw$default = BasicMarqueeKt.m281basicMarquee1Mj1MLw$default(modifierM281basicMarquee1Mj1MLw$default, Integer.MAX_VALUE, 0, 0, 0, null, ra1.a, 30, null);
                    }
                    Modifier modifierThen = modifierFillMaxWidth$default.then(modifierM281basicMarquee1Mj1MLw$default);
                    MaterialTheme materialTheme = MaterialTheme.INSTANCE;
                    int i4 = MaterialTheme.$stable;
                    TextKt.m3048TextNvy7gAk(str3, modifierThen, Color.INSTANCE.m5189getWhite0d7_KjU(), null, 0L, null, null, null, 0L, null, null, 0L, TextOverflow.INSTANCE.m7761getEllipsisgIe3tQ8(), false, 1, 0, null, materialTheme.getTypography(composer2, i4).getBodyMedium(), composer2, RendererCapabilities.DECODER_SUPPORT_MASK, 24960, 110584);
                    StringBuilder sb = new StringBuilder();
                    sb.append("格式: " + seVar.c);
                    if (!list.isEmpty()) {
                        sb.append("  |  ");
                        sb.append(CollectionsKt___CollectionsKt.joinToString$default(list, " / ", null, null, 0, null, null, 62, null));
                    }
                    if (Intrinsics.areEqual(str2, str3) && z) {
                        sb.append("  |  下载中...");
                    }
                    TextKt.m3048TextNvy7gAk(sb.toString(), null, ColorKt.Color((Intrinsics.areEqual(str2, str3) && z) ? 4287679225L : 4289045925L), null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, materialTheme.getTypography(composer2, i4).getLabelMedium(), composer2, 0, 0, 131066);
                    composer2.endNode();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                } else {
                    composer2.skipToGroupEnd();
                }
                break;
            default:
                List list2 = (List) obj7;
                FocusRequester focusRequester = (FocusRequester) obj6;
                Function0 function0 = (Function0) obj5;
                Function0 function1 = (Function0) obj4;
                Composer composer3 = (Composer) obj2;
                int iIntValue3 = ((Integer) obj3).intValue();
                ((ColumnScope) obj).getClass();
                if (composer3.shouldExecute((iIntValue3 & 17) != 16, iIntValue3 & 1)) {
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-1333321964, iIntValue3, -1, "com.dh.myembyapp.ui.components.WebDavUploadConfirmDialog.<anonymous>.<anonymous>.<anonymous> (WebDavSyncDialog.kt:925)");
                    }
                    Modifier.Companion companion4 = Modifier.INSTANCE;
                    Modifier modifierM999padding3ABfNKs = PaddingKt.m999padding3ABfNKs(SizeKt.fillMaxWidth$default(companion4, 0.0f, 1, null), Dp.m7813constructorimpl(20.0f));
                    Arrangement arrangement = Arrangement.INSTANCE;
                    Arrangement.HorizontalOrVertical horizontalOrVerticalM712spacedBy0680j_4 = arrangement.m712spacedBy0680j_4(Dp.m7813constructorimpl(12.0f));
                    Alignment.Companion companion5 = Alignment.INSTANCE;
                    MeasurePolicy measurePolicyColumnMeasurePolicy2 = ColumnKt.columnMeasurePolicy(horizontalOrVerticalM712spacedBy0680j_4, companion5.getStart(), composer3, 6);
                    long currentCompositeKeyHashCode3 = ComposablesKt.getCurrentCompositeKeyHashCode(composer3, 0);
                    int i5 = (int) (currentCompositeKeyHashCode3 ^ (currentCompositeKeyHashCode3 >>> 32));
                    CompositionLocalMap currentCompositionLocalMap3 = composer3.getCurrentCompositionLocalMap();
                    Modifier modifierMaterializeModifier3 = ComposedModifierKt.materializeModifier(composer3, modifierM999padding3ABfNKs);
                    ComposeUiNode.Companion companion6 = ComposeUiNode.INSTANCE;
                    Function0<ComposeUiNode> constructor3 = companion6.getConstructor();
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
                    mr.z(companion6, composerM4318constructorimpl3, measurePolicyColumnMeasurePolicy2, composerM4318constructorimpl3, currentCompositionLocalMap3);
                    Updater.m4326setimpl(composerM4318constructorimpl3, modifierMaterializeModifier3, (Function2<? super T, ? super Modifier, Unit>) id.h(companion6, composerM4318constructorimpl3, Integer.valueOf(i5), composerM4318constructorimpl3));
                    ColumnScopeInstance columnScopeInstance2 = ColumnScopeInstance.INSTANCE;
                    MaterialTheme materialTheme2 = MaterialTheme.INSTANCE;
                    int i6 = MaterialTheme.$stable;
                    TextKt.m3048TextNvy7gAk("确认上传配置", null, 0L, null, 0L, null, FontWeight.INSTANCE.getBold(), null, 0L, null, null, 0L, 0, false, 0, 0, null, materialTheme2.getTypography(composer3, i6).getTitleLarge(), composer3, 1572870, 0, 131006);
                    TextKt.m3048TextNvy7gAk("确认后会把当前电视上已勾选的配置上传到 WebDAV，并更新远端同步文件。", null, Color.m5151copywmQWz5c$default(materialTheme2.getColorScheme(composer3, i6).getOnSurface(), 0.72f, 0.0f, 0.0f, 0.0f, 14, null), null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, materialTheme2.getTypography(composer3, i6).getBodySmall(), composer3, 6, 0, 131066);
                    List listCreateListBuilder = CollectionsKt.createListBuilder();
                    listCreateListBuilder.add("已勾选：" + CollectionsKt___CollectionsKt.joinToString$default(list2, "、", null, null, 0, null, null, 62, null));
                    listCreateListBuilder.add("固定目录：ChaiChaiEmby");
                    listCreateListBuilder.add("文件名称：sync-config.json");
                    Unit unit = Unit.INSTANCE;
                    ef2.e(null, "本次上传范围", CollectionsKt.build(listCreateListBuilder), composer3, 48, 1);
                    if (z) {
                        composer3.startReplaceGroup(-1383086794);
                        TextKt.m3048TextNvy7gAk("上传配置进行中，请稍候...", null, materialTheme2.getColorScheme(composer3, i6).getPrimary(), null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, materialTheme2.getTypography(composer3, i6).getBodySmall(), composer3, 6, 0, 131066);
                        composer3.endReplaceGroup();
                    } else {
                        composer3.startReplaceGroup(-1382847784);
                        composer3.endReplaceGroup();
                    }
                    Modifier modifierFillMaxWidth$default2 = SizeKt.fillMaxWidth$default(companion4, 0.0f, 1, null);
                    MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(companion5.getCenter(), false);
                    long currentCompositeKeyHashCode4 = ComposablesKt.getCurrentCompositeKeyHashCode(composer3, 0);
                    int i7 = (int) (currentCompositeKeyHashCode4 ^ (currentCompositeKeyHashCode4 >>> 32));
                    CompositionLocalMap currentCompositionLocalMap4 = composer3.getCurrentCompositionLocalMap();
                    Modifier modifierMaterializeModifier4 = ComposedModifierKt.materializeModifier(composer3, modifierFillMaxWidth$default2);
                    Function0<ComposeUiNode> constructor4 = companion6.getConstructor();
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
                    mr.z(companion6, composerM4318constructorimpl4, measurePolicyMaybeCachedBoxMeasurePolicy, composerM4318constructorimpl4, currentCompositionLocalMap4);
                    Updater.m4326setimpl(composerM4318constructorimpl4, modifierMaterializeModifier4, (Function2<? super T, ? super Modifier, Unit>) id.h(companion6, composerM4318constructorimpl4, Integer.valueOf(i7), composerM4318constructorimpl4));
                    BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
                    MeasurePolicy measurePolicyRowMeasurePolicy = RowKt.rowMeasurePolicy(arrangement.m712spacedBy0680j_4(Dp.m7813constructorimpl(12.0f)), companion5.getTop(), composer3, 6);
                    long currentCompositeKeyHashCode5 = ComposablesKt.getCurrentCompositeKeyHashCode(composer3, 0);
                    int i8 = (int) (currentCompositeKeyHashCode5 ^ (currentCompositeKeyHashCode5 >>> 32));
                    CompositionLocalMap currentCompositionLocalMap5 = composer3.getCurrentCompositionLocalMap();
                    Modifier modifierMaterializeModifier5 = ComposedModifierKt.materializeModifier(composer3, companion4);
                    Function0<ComposeUiNode> constructor5 = companion6.getConstructor();
                    if (composer3.getApplier() == null) {
                        ComposablesKt.invalidApplier();
                    }
                    composer3.startReusableNode();
                    if (composer3.getInserting()) {
                        composer3.createNode(constructor5);
                    } else {
                        composer3.useNode();
                    }
                    Composer composerM4318constructorimpl5 = Updater.m4318constructorimpl(composer3);
                    mr.z(companion6, composerM4318constructorimpl5, measurePolicyRowMeasurePolicy, composerM4318constructorimpl5, currentCompositionLocalMap5);
                    Updater.m4326setimpl(composerM4318constructorimpl5, modifierMaterializeModifier5, (Function2<? super T, ? super Modifier, Unit>) id.h(companion6, composerM4318constructorimpl5, Integer.valueOf(i8), composerM4318constructorimpl5));
                    RowScopeInstance rowScopeInstance2 = RowScopeInstance.INSTANCE;
                    boolean z2 = !z;
                    ef2.a(48, 8, null, composer3, FocusRequesterModifierKt.focusRequester(SizeKt.m1069width3ABfNKs(companion4, Dp.m7813constructorimpl(176.0f)), focusRequester), "取消", function0, z2);
                    ef2.a(3126, 0, jc2.d, composer3, SizeKt.m1069width3ABfNKs(companion4, Dp.m7813constructorimpl(176.0f)), "确认上传", function1, z2);
                    if (i02.w(composer3)) {
                        ComposerKt.traceEventEnd();
                    }
                } else {
                    composer3.skipToGroupEnd();
                }
                break;
        }
        return Unit.INSTANCE;
    }

    public /* synthetic */ dz0(boolean z, Object obj, Object obj2, Object obj3, Object obj4, int i) {
        this.a = i;
        this.c = z;
        this.e = obj;
        this.g = obj2;
        this.b = obj3;
        this.d = obj4;
    }
}
