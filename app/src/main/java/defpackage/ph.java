package defpackage;

import androidx.compose.foundation.BackgroundKt;
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
import androidx.compose.foundation.shape.RoundedCornerShapeKt;
import androidx.compose.material3.DragHandleKt;
import androidx.compose.material3.DragHandleSizes;
import androidx.compose.material3.IconKt;
import androidx.compose.material3.MaterialTheme;
import androidx.compose.material3.TextKt;
import androidx.compose.material3.carousel.CarouselItemScopeImpl;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.State;
import androidx.compose.runtime.Updater;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.draw.ClipKt;
import androidx.compose.ui.geometry.Size;
import androidx.compose.ui.graphics.Brush;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.ColorKt;
import androidx.compose.ui.graphics.Path;
import androidx.compose.ui.graphics.Shape;
import androidx.compose.ui.graphics.vector.ImageVector;
import androidx.compose.ui.layout.Measurable;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.layout.MeasureScope;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.text.font.FontWeight;
import androidx.compose.ui.unit.Constraints;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.Dp;
import androidx.compose.ui.unit.LayoutDirection;
import androidx.media3.exoplayer.RendererCapabilities;
import com.dh.myembyapp.data.model.BackupRouteConfig;
import com.dh.myembyapp.data.model.DarkThemeGlowPosition;
import com.dh.myembyapp.data.model.DarkThemeStyle;
import com.dh.myembyapp.data.model.LightThemeBackgroundStyle;
import java.util.Objects;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.text.StringsKt;
import kotlinx.coroutines.channels.BufferedChannel;
import kotlinx.coroutines.selects.SelectInstance;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class ph implements Function3 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ ph(Object obj, Object obj2, Object obj3, int i) {
        this.a = i;
        this.b = obj;
        this.c = obj2;
        this.d = obj3;
    }

    /* JADX WARN: Code duplicated, block: B:46:0x01ed  */
    /* JADX WARN: Code duplicated, block: B:49:0x01f9  */
    /* JADX WARN: Code duplicated, block: B:50:0x01fd  */
    /* JADX WARN: Code duplicated, block: B:53:0x02c9  */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.jvm.functions.Function3
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        Modifier.Companion companion;
        Modifier modifierBackground$default;
        Function0<ComposeUiNode> constructor;
        int i = this.a;
        Object obj4 = this.b;
        Object obj5 = this.d;
        Object obj6 = this.c;
        switch (i) {
            case 0:
                BackupRouteConfig backupRouteConfig = (BackupRouteConfig) obj4;
                Function0 function0 = (Function0) obj6;
                Function0 function1 = (Function0) obj5;
                Composer composer = (Composer) obj2;
                int iIntValue = ((Integer) obj3).intValue();
                ((ColumnScope) obj).getClass();
                if (composer.shouldExecute((iIntValue & 17) != 16, iIntValue & 1)) {
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(1096077851, iIntValue, -1, "com.dh.myembyapp.ui.components.BackupRouteDeleteConfirmDialog.<anonymous>.<anonymous>.<anonymous> (BackupRouteManagerDialog.kt:1073)");
                    }
                    Modifier.Companion companion2 = Modifier.INSTANCE;
                    Modifier modifierM999padding3ABfNKs = PaddingKt.m999padding3ABfNKs(SizeKt.fillMaxWidth$default(companion2, 0.0f, 1, null), Dp.m7813constructorimpl(20.0f));
                    Arrangement arrangement = Arrangement.INSTANCE;
                    Arrangement.HorizontalOrVertical horizontalOrVerticalM712spacedBy0680j_4 = arrangement.m712spacedBy0680j_4(Dp.m7813constructorimpl(12.0f));
                    Alignment.Companion companion3 = Alignment.INSTANCE;
                    MeasurePolicy measurePolicyColumnMeasurePolicy = ColumnKt.columnMeasurePolicy(horizontalOrVerticalM712spacedBy0680j_4, companion3.getStart(), composer, 6);
                    long currentCompositeKeyHashCode = ComposablesKt.getCurrentCompositeKeyHashCode(composer, 0);
                    int i2 = (int) (currentCompositeKeyHashCode ^ (currentCompositeKeyHashCode >>> 32));
                    CompositionLocalMap currentCompositionLocalMap = composer.getCurrentCompositionLocalMap();
                    Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(composer, modifierM999padding3ABfNKs);
                    ComposeUiNode.Companion companion4 = ComposeUiNode.INSTANCE;
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
                    Composer composerM4318constructorimpl = Updater.m4318constructorimpl(composer);
                    mr.z(companion4, composerM4318constructorimpl, measurePolicyColumnMeasurePolicy, composerM4318constructorimpl, currentCompositionLocalMap);
                    Updater.m4326setimpl(composerM4318constructorimpl, modifierMaterializeModifier, (Function2<? super T, ? super Modifier, Unit>) id.h(companion4, composerM4318constructorimpl, Integer.valueOf(i2), composerM4318constructorimpl));
                    ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.INSTANCE;
                    MaterialTheme materialTheme = MaterialTheme.INSTANCE;
                    int i3 = MaterialTheme.$stable;
                    TextKt.m3048TextNvy7gAk("删除备用线路", null, 0L, null, 0L, null, FontWeight.INSTANCE.getSemiBold(), null, 0L, null, null, 0L, 0, false, 0, 0, null, materialTheme.getTypography(composer, i3).getTitleMedium(), composer, 1572870, 0, 131006);
                    String alias = backupRouteConfig.getAlias();
                    if (StringsKt.isBlank(alias)) {
                        alias = "未命名线路";
                    }
                    TextKt.m3048TextNvy7gAk("确认删除“" + ((Object) alias) + "”吗？", null, Color.m5151copywmQWz5c$default(materialTheme.getColorScheme(composer, i3).getOnSurface(), 0.78f, 0.0f, 0.0f, 0.0f, 14, null), null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, materialTheme.getTypography(composer, i3).getBodyMedium(), composer, 0, 0, 131066);
                    Modifier modifierFillMaxWidth$default = SizeKt.fillMaxWidth$default(companion2, 0.0f, 1, null);
                    MeasurePolicy measurePolicyRowMeasurePolicy = RowKt.rowMeasurePolicy(arrangement.getEnd(), companion3.getTop(), composer, 6);
                    long currentCompositeKeyHashCode2 = ComposablesKt.getCurrentCompositeKeyHashCode(composer, 0);
                    int i4 = (int) (currentCompositeKeyHashCode2 ^ (currentCompositeKeyHashCode2 >>> 32));
                    CompositionLocalMap currentCompositionLocalMap2 = composer.getCurrentCompositionLocalMap();
                    Modifier modifierMaterializeModifier2 = ComposedModifierKt.materializeModifier(composer, modifierFillMaxWidth$default);
                    Function0<ComposeUiNode> constructor3 = companion4.getConstructor();
                    if (composer.getApplier() == null) {
                        ComposablesKt.invalidApplier();
                    }
                    composer.startReusableNode();
                    if (composer.getInserting()) {
                        composer.createNode(constructor3);
                    } else {
                        composer.useNode();
                    }
                    Composer composerM4318constructorimpl2 = Updater.m4318constructorimpl(composer);
                    mr.z(companion4, composerM4318constructorimpl2, measurePolicyRowMeasurePolicy, composerM4318constructorimpl2, currentCompositionLocalMap2);
                    Updater.m4326setimpl(composerM4318constructorimpl2, modifierMaterializeModifier2, (Function2<? super T, ? super Modifier, Unit>) id.h(companion4, composerM4318constructorimpl2, Integer.valueOf(i4), composerM4318constructorimpl2));
                    RowScopeInstance rowScopeInstance = RowScopeInstance.INSTANCE;
                    MeasurePolicy measurePolicyRowMeasurePolicy2 = RowKt.rowMeasurePolicy(arrangement.m712spacedBy0680j_4(Dp.m7813constructorimpl(8.0f)), companion3.getTop(), composer, 6);
                    long currentCompositeKeyHashCode3 = ComposablesKt.getCurrentCompositeKeyHashCode(composer, 0);
                    int i5 = (int) (currentCompositeKeyHashCode3 ^ (currentCompositeKeyHashCode3 >>> 32));
                    CompositionLocalMap currentCompositionLocalMap3 = composer.getCurrentCompositionLocalMap();
                    Modifier modifierMaterializeModifier3 = ComposedModifierKt.materializeModifier(composer, companion2);
                    Function0<ComposeUiNode> constructor4 = companion4.getConstructor();
                    if (composer.getApplier() == null) {
                        ComposablesKt.invalidApplier();
                    }
                    composer.startReusableNode();
                    if (composer.getInserting()) {
                        composer.createNode(constructor4);
                    } else {
                        composer.useNode();
                    }
                    Composer composerM4318constructorimpl3 = Updater.m4318constructorimpl(composer);
                    mr.z(companion4, composerM4318constructorimpl3, measurePolicyRowMeasurePolicy2, composerM4318constructorimpl3, currentCompositionLocalMap3);
                    Updater.m4326setimpl(composerM4318constructorimpl3, modifierMaterializeModifier3, (Function2<? super T, ? super Modifier, Unit>) id.h(companion4, composerM4318constructorimpl3, Integer.valueOf(i5), composerM4318constructorimpl3));
                    pi.a(function0, SizeKt.m1069width3ABfNKs(companion2, Dp.m7813constructorimpl(110.0f)), bh.b, vs.h, composer, 3504);
                    pi.a(function1, SizeKt.m1069width3ABfNKs(companion2, Dp.m7813constructorimpl(110.0f)), bh.d, vs.i, composer, 3504);
                    if (i02.w(composer)) {
                        ComposerKt.traceEventEnd();
                    }
                } else {
                    composer.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 1:
                return BufferedChannel.onUndeliveredElementReceiveCancellationConstructor$lambda$57$lambda$56$lambda$55(this.b, (BufferedChannel) obj6, (SelectInstance) obj5, (Throwable) obj, obj2, (CoroutineContext) obj3);
            case 2:
                return CarouselItemScopeImpl.rememberMaskShape$lambda$1$lambda$0((CarouselItemScopeImpl) obj4, (Shape) obj6, (Density) obj5, (Path) obj, (Size) obj2, (LayoutDirection) obj3);
            case 3:
                return DragHandleKt.VerticalDragHandle$lambda$13$lambda$12((DragHandleSizes) obj4, (State) obj6, (MutableState) obj5, (MeasureScope) obj, (Measurable) obj2, (Constraints) obj3);
            case 4:
                ImageVector imageVector = (ImageVector) obj4;
                u61 u61Var = (u61) obj6;
                String str = (String) obj5;
                Composer composer2 = (Composer) obj2;
                int iIntValue2 = ((Integer) obj3).intValue();
                ((BoxScope) obj).getClass();
                if (composer2.shouldExecute((iIntValue2 & 17) != 16, iIntValue2 & 1)) {
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-1888480686, iIntValue2, -1, "com.dh.myembyapp.ui.components.HomeMediaMenuRow.<anonymous> (HomeMediaMenuDialog.kt:348)");
                    }
                    Modifier.Companion companion5 = Modifier.INSTANCE;
                    Modifier modifierM1001paddingVpY3zN4$default = PaddingKt.m1001paddingVpY3zN4$default(SizeKt.fillMaxSize$default(companion5, 0.0f, 1, null), Dp.m7813constructorimpl(14.0f), 0.0f, 2, null);
                    MeasurePolicy measurePolicyQ = mr.q(12.0f, Arrangement.INSTANCE, Alignment.INSTANCE.getCenterVertically(), composer2, 54);
                    long currentCompositeKeyHashCode4 = ComposablesKt.getCurrentCompositeKeyHashCode(composer2, 0);
                    int i6 = (int) (currentCompositeKeyHashCode4 ^ (currentCompositeKeyHashCode4 >>> 32));
                    CompositionLocalMap currentCompositionLocalMap4 = composer2.getCurrentCompositionLocalMap();
                    Modifier modifierMaterializeModifier4 = ComposedModifierKt.materializeModifier(composer2, modifierM1001paddingVpY3zN4$default);
                    ComposeUiNode.Companion companion6 = ComposeUiNode.INSTANCE;
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
                    Composer composerM4318constructorimpl4 = Updater.m4318constructorimpl(composer2);
                    mr.z(companion6, composerM4318constructorimpl4, measurePolicyQ, composerM4318constructorimpl4, currentCompositionLocalMap4);
                    Updater.m4326setimpl(composerM4318constructorimpl4, modifierMaterializeModifier4, (Function2<? super T, ? super Modifier, Unit>) id.h(companion6, composerM4318constructorimpl4, Integer.valueOf(i6), composerM4318constructorimpl4));
                    RowScopeInstance rowScopeInstance2 = RowScopeInstance.INSTANCE;
                    IconKt.m2496Iconww6aTOc(imageVector, (String) null, SizeKt.m1064size3ABfNKs(companion5, Dp.m7813constructorimpl(22.0f)), 0L, composer2, 432, 8);
                    TextKt.m3048TextNvy7gAk(str, null, u61Var.A, null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, MaterialTheme.INSTANCE.getTypography(composer2, MaterialTheme.$stable).getBodyLarge(), composer2, 0, 0, 131066);
                    composer2.endNode();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                } else {
                    composer2.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 5:
                zq0 zq0Var = (zq0) obj4;
                MutableState mutableState = (MutableState) obj5;
                String str2 = (String) obj;
                String str3 = (String) obj2;
                Integer num = (Integer) obj3;
                num.getClass();
                str2.getClass();
                str3.getClass();
                Objects.toString((rn0) mutableState.getValue());
                zq0Var.P((rn0) mutableState.getValue());
                zq0Var.N(str3, "继续观看", num, str2, sn0.c);
                ((Function2) obj6).invoke(str2, str3);
                return Unit.INSTANCE;
            case 6:
                zq0 zq0Var2 = (zq0) obj4;
                Function1 function2 = (Function1) obj6;
                MutableState mutableState2 = (MutableState) obj5;
                String str4 = (String) obj;
                String str5 = (String) obj2;
                String strConcat = (String) obj3;
                str4.getClass();
                str5.getClass();
                Objects.toString((rn0) mutableState2.getValue());
                zq0Var2.P((rn0) mutableState2.getValue());
                if (strConcat == null) {
                    strConcat = "header_".concat(str4);
                }
                zq0.O(zq0Var2, strConcat, str5, sn0.c, 12);
                function2.invoke(str4);
                return Unit.INSTANCE;
            case 7:
                gb gbVar = (gb) obj4;
                Brush brush = (Brush) obj6;
                LightThemeBackgroundStyle lightThemeBackgroundStyle = (LightThemeBackgroundStyle) obj5;
                Composer composer3 = (Composer) obj2;
                int iIntValue3 = ((Integer) obj3).intValue();
                ((BoxScope) obj).getClass();
                if (composer3.shouldExecute((iIntValue3 & 17) != 16, iIntValue3 & 1)) {
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(24357138, iIntValue3, -1, "com.dh.myembyapp.ui.components.LightBackgroundOptionCard.<anonymous> (ThemeSettingsDialog.kt:897)");
                    }
                    Modifier.Companion companion7 = Modifier.INSTANCE;
                    Modifier modifierV = kb0.v(12.0f, PaddingKt.m999padding3ABfNKs(SizeKt.fillMaxSize$default(companion7, 0.0f, 1, null), Dp.m7813constructorimpl(5.0f)), gbVar.a);
                    if (brush != null) {
                        modifierBackground$default = BackgroundKt.background$default(companion7, brush, RoundedCornerShapeKt.m1312RoundedCornerShape0680j_4(Dp.m7813constructorimpl(12.0f)), 0.0f, 4, null);
                        companion = companion7;
                        if (modifierBackground$default == null) {
                        }
                        Modifier modifierThen = modifierV.then(modifierBackground$default);
                        Alignment.Companion companion8 = Alignment.INSTANCE;
                        MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(companion8.getTopStart(), false);
                        long currentCompositeKeyHashCode5 = ComposablesKt.getCurrentCompositeKeyHashCode(composer3, 0);
                        int i7 = (int) (currentCompositeKeyHashCode5 ^ (currentCompositeKeyHashCode5 >>> 32));
                        CompositionLocalMap currentCompositionLocalMap5 = composer3.getCurrentCompositionLocalMap();
                        Modifier modifierMaterializeModifier5 = ComposedModifierKt.materializeModifier(composer3, modifierThen);
                        ComposeUiNode.Companion companion9 = ComposeUiNode.INSTANCE;
                        constructor = companion9.getConstructor();
                        if (composer3.getApplier() == null) {
                            ComposablesKt.invalidApplier();
                        }
                        composer3.startReusableNode();
                        if (composer3.getInserting()) {
                            composer3.createNode(constructor);
                        } else {
                            composer3.useNode();
                        }
                        Composer composerM4318constructorimpl5 = Updater.m4318constructorimpl(composer3);
                        mr.z(companion9, composerM4318constructorimpl5, measurePolicyMaybeCachedBoxMeasurePolicy, composerM4318constructorimpl5, currentCompositionLocalMap5);
                        Updater.m4326setimpl(composerM4318constructorimpl5, modifierMaterializeModifier5, (Function2<? super T, ? super Modifier, Unit>) id.h(companion9, composerM4318constructorimpl5, Integer.valueOf(i7), composerM4318constructorimpl5));
                        BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
                        Modifier modifierFillMaxSize$default = SizeKt.fillMaxSize$default(companion, 0.0f, 1, null);
                        Brush.Companion companion10 = Brush.INSTANCE;
                        Color.Companion companion11 = Color.INSTANCE;
                        BoxKt.Box(BackgroundKt.background$default(modifierFillMaxSize$default, Brush.Companion.m5113verticalGradient8A3gB4$default(companion10, CollectionsKt.listOf((Object[]) new Color[]{Color.m5142boximpl(companion11.m5187getTransparent0d7_KjU()), Color.m5142boximpl(Color.m5151copywmQWz5c$default(companion11.m5189getWhite0d7_KjU(), 0.16f, 0.0f, 0.0f, 0.0f, 14, null))}), 0.0f, 0.0f, 0, 14, (Object) null), RoundedCornerShapeKt.m1312RoundedCornerShape0680j_4(Dp.m7813constructorimpl(12.0f)), 0.0f, 4, null), composer3, 0);
                        TextKt.m3048TextNvy7gAk(lightThemeBackgroundStyle.getDisplayName(), PaddingKt.m1000paddingVpY3zN4(boxScopeInstance.align(companion, companion8.getBottomStart()), Dp.m7813constructorimpl(8.0f), Dp.m7813constructorimpl(7.0f)), ColorKt.Color(4279374871L), null, 0L, null, FontWeight.INSTANCE.getSemiBold(), null, 0L, null, null, 0L, 0, false, 0, 0, null, MaterialTheme.INSTANCE.getTypography(composer3, MaterialTheme.$stable).getLabelMedium(), composer3, 1573248, 0, 131000);
                        composer3.endNode();
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                    } else {
                        companion = companion7;
                    }
                    modifierBackground$default = companion;
                    Modifier modifierThen2 = modifierV.then(modifierBackground$default);
                    Alignment.Companion companion12 = Alignment.INSTANCE;
                    MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy2 = BoxKt.maybeCachedBoxMeasurePolicy(companion12.getTopStart(), false);
                    long currentCompositeKeyHashCode6 = ComposablesKt.getCurrentCompositeKeyHashCode(composer3, 0);
                    int i8 = (int) (currentCompositeKeyHashCode6 ^ (currentCompositeKeyHashCode6 >>> 32));
                    CompositionLocalMap currentCompositionLocalMap6 = composer3.getCurrentCompositionLocalMap();
                    Modifier modifierMaterializeModifier6 = ComposedModifierKt.materializeModifier(composer3, modifierThen2);
                    ComposeUiNode.Companion companion13 = ComposeUiNode.INSTANCE;
                    constructor = companion13.getConstructor();
                    if (composer3.getApplier() == null) {
                        ComposablesKt.invalidApplier();
                    }
                    composer3.startReusableNode();
                    if (composer3.getInserting()) {
                        composer3.createNode(constructor);
                    } else {
                        composer3.useNode();
                    }
                    Composer composerM4318constructorimpl6 = Updater.m4318constructorimpl(composer3);
                    mr.z(companion13, composerM4318constructorimpl6, measurePolicyMaybeCachedBoxMeasurePolicy2, composerM4318constructorimpl6, currentCompositionLocalMap6);
                    Updater.m4326setimpl(composerM4318constructorimpl6, modifierMaterializeModifier6, (Function2<? super T, ? super Modifier, Unit>) id.h(companion13, composerM4318constructorimpl6, Integer.valueOf(i8), composerM4318constructorimpl6));
                    BoxScopeInstance boxScopeInstance2 = BoxScopeInstance.INSTANCE;
                    Modifier modifierFillMaxSize$default2 = SizeKt.fillMaxSize$default(companion, 0.0f, 1, null);
                    Brush.Companion companion14 = Brush.INSTANCE;
                    Color.Companion companion15 = Color.INSTANCE;
                    BoxKt.Box(BackgroundKt.background$default(modifierFillMaxSize$default2, Brush.Companion.m5113verticalGradient8A3gB4$default(companion14, CollectionsKt.listOf((Object[]) new Color[]{Color.m5142boximpl(companion15.m5187getTransparent0d7_KjU()), Color.m5142boximpl(Color.m5151copywmQWz5c$default(companion15.m5189getWhite0d7_KjU(), 0.16f, 0.0f, 0.0f, 0.0f, 14, null))}), 0.0f, 0.0f, 0, 14, (Object) null), RoundedCornerShapeKt.m1312RoundedCornerShape0680j_4(Dp.m7813constructorimpl(12.0f)), 0.0f, 4, null), composer3, 0);
                    TextKt.m3048TextNvy7gAk(lightThemeBackgroundStyle.getDisplayName(), PaddingKt.m1000paddingVpY3zN4(boxScopeInstance2.align(companion, companion12.getBottomStart()), Dp.m7813constructorimpl(8.0f), Dp.m7813constructorimpl(7.0f)), ColorKt.Color(4279374871L), null, 0L, null, FontWeight.INSTANCE.getSemiBold(), null, 0L, null, null, 0L, 0, false, 0, 0, null, MaterialTheme.INSTANCE.getTypography(composer3, MaterialTheme.$stable).getLabelMedium(), composer3, 1573248, 0, 131000);
                    composer3.endNode();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                } else {
                    composer3.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            default:
                DarkThemeStyle darkThemeStyle = (DarkThemeStyle) obj4;
                DarkThemeGlowPosition darkThemeGlowPosition = (DarkThemeGlowPosition) obj6;
                gb gbVar2 = (gb) obj5;
                Composer composer4 = (Composer) obj2;
                int iIntValue4 = ((Integer) obj3).intValue();
                ((BoxScope) obj).getClass();
                if (composer4.shouldExecute((iIntValue4 & 17) != 16, iIntValue4 & 1)) {
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-411697186, iIntValue4, -1, "com.dh.myembyapp.ui.components.DarkThemeOptionCard.<anonymous> (ThemeSettingsDialog.kt:523)");
                    }
                    Modifier.Companion companion16 = Modifier.INSTANCE;
                    Modifier modifierClip = ClipKt.clip(PaddingKt.m999padding3ABfNKs(SizeKt.fillMaxSize$default(companion16, 0.0f, 1, null), Dp.m7813constructorimpl(5.0f)), RoundedCornerShapeKt.m1312RoundedCornerShape0680j_4(Dp.m7813constructorimpl(12.0f)));
                    Alignment.Companion companion17 = Alignment.INSTANCE;
                    MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy3 = BoxKt.maybeCachedBoxMeasurePolicy(companion17.getTopStart(), false);
                    long currentCompositeKeyHashCode7 = ComposablesKt.getCurrentCompositeKeyHashCode(composer4, 0);
                    int i9 = (int) (currentCompositeKeyHashCode7 ^ (currentCompositeKeyHashCode7 >>> 32));
                    CompositionLocalMap currentCompositionLocalMap7 = composer4.getCurrentCompositionLocalMap();
                    Modifier modifierMaterializeModifier7 = ComposedModifierKt.materializeModifier(composer4, modifierClip);
                    ComposeUiNode.Companion companion18 = ComposeUiNode.INSTANCE;
                    Function0<ComposeUiNode> constructor6 = companion18.getConstructor();
                    if (composer4.getApplier() == null) {
                        ComposablesKt.invalidApplier();
                    }
                    composer4.startReusableNode();
                    if (composer4.getInserting()) {
                        composer4.createNode(constructor6);
                    } else {
                        composer4.useNode();
                    }
                    Composer composerM4318constructorimpl7 = Updater.m4318constructorimpl(composer4);
                    mr.z(companion18, composerM4318constructorimpl7, measurePolicyMaybeCachedBoxMeasurePolicy3, composerM4318constructorimpl7, currentCompositionLocalMap7);
                    Updater.m4326setimpl(composerM4318constructorimpl7, modifierMaterializeModifier7, (Function2<? super T, ? super Modifier, Unit>) id.h(companion18, composerM4318constructorimpl7, Integer.valueOf(i9), composerM4318constructorimpl7));
                    BoxScopeInstance boxScopeInstance3 = BoxScopeInstance.INSTANCE;
                    l72.a(darkThemeStyle, darkThemeGlowPosition, SizeKt.fillMaxSize$default(companion16, 0.0f, 1, null), composer4, RendererCapabilities.DECODER_SUPPORT_MASK);
                    BoxKt.Box(BackgroundKt.m275backgroundbw27NRU$default(SizeKt.fillMaxSize$default(companion16, 0.0f, 1, null), Color.m5151copywmQWz5c$default(gbVar2.a, 0.04f, 0.0f, 0.0f, 0.0f, 14, null), null, 2, null), composer4, 0);
                    TextKt.m3048TextNvy7gAk(darkThemeStyle.getDisplayName(), PaddingKt.m1000paddingVpY3zN4(boxScopeInstance3.align(companion16, companion17.getBottomStart()), Dp.m7813constructorimpl(8.0f), Dp.m7813constructorimpl(7.0f)), ColorKt.Color(4294375674L), null, 0L, null, FontWeight.INSTANCE.getSemiBold(), null, 0L, null, null, 0L, 0, false, 0, 0, null, MaterialTheme.INSTANCE.getTypography(composer4, MaterialTheme.$stable).getLabelMedium(), composer4, 1573248, 0, 131000);
                    composer4.endNode();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                } else {
                    composer4.skipToGroupEnd();
                }
                return Unit.INSTANCE;
        }
    }
}
