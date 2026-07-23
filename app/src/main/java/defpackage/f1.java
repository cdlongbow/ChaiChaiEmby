package defpackage;

import androidx.compose.foundation.BackgroundKt;
import androidx.compose.foundation.contextmenu.ComposableSingletons$ContextMenuUiKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScope;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnScope;
import androidx.compose.foundation.layout.ColumnScopeInstance;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.RowScope;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.lazy.LazyItemScope;
import androidx.compose.foundation.lazy.grid.LazyGridItemScope;
import androidx.compose.foundation.text.ComposableSingletons$BasicTextFieldKt;
import androidx.compose.foundation.text.ComposableSingletons$CoreTextFieldKt;
import androidx.compose.material.icons.Icons;
import androidx.compose.material.icons.filled.AddKt;
import androidx.compose.material.icons.filled.RemoveKt;
import androidx.compose.material3.BadgeKt;
import androidx.compose.material3.IconKt;
import androidx.compose.material3.MaterialTheme;
import androidx.compose.material3.ProgressIndicatorKt;
import androidx.compose.material3.TextKt;
import androidx.compose.material3.internal.AccessibilityUtilKt;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.Updater;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.Brush;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.layout.Measurable;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.layout.MeasureScope;
import androidx.compose.ui.layout.Placeable;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.text.font.FontWeight;
import androidx.compose.ui.unit.Constraints;
import androidx.compose.ui.unit.Dp;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class f1 implements Function3 {
    public final /* synthetic */ int a;

    public /* synthetic */ f1(int i) {
        this.a = i;
    }

    private final Object a(Object obj, Object obj2, Object obj3) {
        Composer composer = (Composer) obj2;
        int iIntValue = ((Integer) obj3).intValue();
        ((RowScope) obj).getClass();
        if (composer.shouldExecute((iIntValue & 17) != 16, iIntValue & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(171945740, iIntValue, -1, "com.dh.myembyapp.ui.screens.home.ComposableSingletons$HomeScreenKt.lambda$171945740.<anonymous> (HomeScreen.kt:1602)");
            }
            TextKt.m3048TextNvy7gAk("知道了", null, 0L, null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, composer, 6, 0, 262142);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composer.skipToGroupEnd();
        }
        return Unit.INSTANCE;
    }

    private final Object b(Object obj, Object obj2, Object obj3) {
        Composer composer = (Composer) obj2;
        int iIntValue = ((Integer) obj3).intValue();
        ((ColumnScope) obj).getClass();
        if (composer.shouldExecute((iIntValue & 17) != 16, iIntValue & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-371741525, iIntValue, -1, "com.dh.myembyapp.ui.screens.home.ComposableSingletons$HomeScreenKt.lambda$-371741525.<anonymous> (HomeScreen.kt:2869)");
            }
            Modifier.Companion companion = Modifier.INSTANCE;
            Modifier modifierFillMaxSize$default = SizeKt.fillMaxSize$default(companion, 0.0f, 1, null);
            Brush.Companion companion2 = Brush.INSTANCE;
            MaterialTheme materialTheme = MaterialTheme.INSTANCE;
            int i = MaterialTheme.$stable;
            Modifier modifierBackground$default = BackgroundKt.background$default(modifierFillMaxSize$default, Brush.Companion.m5107linearGradientmHitzGk$default(companion2, CollectionsKt.listOf((Object[]) new Color[]{Color.m5142boximpl(Color.m5151copywmQWz5c$default(materialTheme.getColorScheme(composer, i).getSurfaceVariant(), 0.3f, 0.0f, 0.0f, 0.0f, 14, null)), Color.m5142boximpl(Color.m5151copywmQWz5c$default(materialTheme.getColorScheme(composer, i).getSurfaceVariant(), 0.5f, 0.0f, 0.0f, 0.0f, 14, null)), Color.m5142boximpl(Color.m5151copywmQWz5c$default(materialTheme.getColorScheme(composer, i).getSurfaceVariant(), 0.3f, 0.0f, 0.0f, 0.0f, 14, null))}), 0L, 0L, 0, 14, (Object) null), null, 0.0f, 6, null);
            MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.INSTANCE.getCenter(), false);
            long currentCompositeKeyHashCode = ComposablesKt.getCurrentCompositeKeyHashCode(composer, 0);
            int i2 = (int) (currentCompositeKeyHashCode ^ (currentCompositeKeyHashCode >>> 32));
            CompositionLocalMap currentCompositionLocalMap = composer.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(composer, modifierBackground$default);
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
            mr.z(companion3, composerM4318constructorimpl, measurePolicyMaybeCachedBoxMeasurePolicy, composerM4318constructorimpl, currentCompositionLocalMap);
            Updater.m4326setimpl(composerM4318constructorimpl, modifierMaterializeModifier, (Function2<? super T, ? super Modifier, Unit>) id.h(companion3, composerM4318constructorimpl, Integer.valueOf(i2), composerM4318constructorimpl));
            BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
            ProgressIndicatorKt.m2703CircularProgressIndicator4lLiAd8(SizeKt.m1064size3ABfNKs(companion, Dp.m7813constructorimpl(32.0f)), Color.m5151copywmQWz5c$default(materialTheme.getColorScheme(composer, i).getPrimary(), 0.6f, 0.0f, 0.0f, 0.0f, 14, null), Dp.m7813constructorimpl(2.0f), 0L, 0, 0.0f, composer, 390, 56);
            composer.endNode();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composer.skipToGroupEnd();
        }
        return Unit.INSTANCE;
    }

    private final Object c(Object obj, Object obj2, Object obj3) {
        Composer composer = (Composer) obj2;
        int iIntValue = ((Integer) obj3).intValue();
        ((RowScope) obj).getClass();
        if (composer.shouldExecute((iIntValue & 17) != 16, iIntValue & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(663224497, iIntValue, -1, "com.dh.myembyapp.ui.screens.home.ComposableSingletons$HomeScreenKt.lambda$663224497.<anonymous> (HomeScreen.kt:1230)");
            }
            TextKt.m3048TextNvy7gAk("取消", null, 0L, null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, composer, 6, 0, 262142);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composer.skipToGroupEnd();
        }
        return Unit.INSTANCE;
    }

    @Override // kotlin.jvm.functions.Function3
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        switch (this.a) {
            case 0:
                return AccessibilityUtilKt.IncreaseHorizontalSemanticsBounds$lambda$1((MeasureScope) obj, (Measurable) obj2, (Constraints) obj3);
            case 1:
                return AccessibilityUtilKt.IncreaseVerticalSemanticsBounds$lambda$4((MeasureScope) obj, (Measurable) obj2, (Constraints) obj3);
            case 2:
                MeasureScope measureScope = (MeasureScope) obj;
                Measurable measurable = (Measurable) obj2;
                Constraints constraints = (Constraints) obj3;
                measureScope.getClass();
                measurable.getClass();
                int iMo414roundToPx0680j_4 = measureScope.mo414roundToPx0680j_4(f7.a);
                int iM7778getMaxWidthimpl = (iMo414roundToPx0680j_4 * 2) + Constraints.m7778getMaxWidthimpl(constraints.getValue());
                Placeable placeableMo6509measureBRTryo0 = measurable.mo6509measureBRTryo0(Constraints.m7768copyZbe2FdA$default(constraints.getValue(), iM7778getMaxWidthimpl, iM7778getMaxWidthimpl, 0, 0, 12, null));
                return s01.m(measureScope, Constraints.m7778getMaxWidthimpl(constraints.getValue()), placeableMo6509measureBRTryo0.getHeight(), null, new e1(iMo414roundToPx0680j_4, 2, placeableMo6509measureBRTryo0), 4, null);
            case 3:
                return BadgeKt.badgeBounds$lambda$7((MeasureScope) obj, (Measurable) obj2, (Constraints) obj3);
            case 4:
                return ComposableSingletons$BasicTextFieldKt.lambda_759698998$lambda$0((Function2) obj, (Composer) obj2, ((Integer) obj3).intValue());
            case 5:
                return ComposableSingletons$BasicTextFieldKt.lambda_486633673$lambda$0((Function2) obj, (Composer) obj2, ((Integer) obj3).intValue());
            case 6:
                return ComposableSingletons$BasicTextFieldKt.lambda_444370233$lambda$0((Function2) obj, (Composer) obj2, ((Integer) obj3).intValue());
            case 7:
                return ComposableSingletons$BasicTextFieldKt.lambda__665310900$lambda$0((Function2) obj, (Composer) obj2, ((Integer) obj3).intValue());
            case 8:
                Composer composer = (Composer) obj2;
                int iIntValue = ((Integer) obj3).intValue();
                ((BoxScope) obj).getClass();
                if (composer.shouldExecute((iIntValue & 17) != 16, iIntValue & 1)) {
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-1608408395, iIntValue, -1, "com.dh.myembyapp.ui.components.ComposableSingletons$BufferSettingsDialogKt.lambda$-1608408395.<anonymous> (BufferSettingsDialog.kt:318)");
                    }
                    IconKt.m2496Iconww6aTOc(RemoveKt.getRemove(Icons.INSTANCE.getDefault()), "减少", SizeKt.m1064size3ABfNKs(Modifier.INSTANCE, Dp.m7813constructorimpl(24.0f)), 0L, composer, 432, 8);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                } else {
                    composer.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 9:
                Composer composer2 = (Composer) obj2;
                int iIntValue2 = ((Integer) obj3).intValue();
                ((BoxScope) obj).getClass();
                if (composer2.shouldExecute((iIntValue2 & 17) != 16, iIntValue2 & 1)) {
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-1886397538, iIntValue2, -1, "com.dh.myembyapp.ui.components.ComposableSingletons$BufferSettingsDialogKt.lambda$-1886397538.<anonymous> (BufferSettingsDialog.kt:365)");
                    }
                    IconKt.m2496Iconww6aTOc(AddKt.getAdd(Icons.INSTANCE.getDefault()), "增加", SizeKt.m1064size3ABfNKs(Modifier.INSTANCE, Dp.m7813constructorimpl(24.0f)), 0L, composer2, 432, 8);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                } else {
                    composer2.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 10:
                Composer composer3 = (Composer) obj2;
                int iIntValue3 = ((Integer) obj3).intValue();
                ((LazyItemScope) obj).getClass();
                if (composer3.shouldExecute((iIntValue3 & 17) != 16, iIntValue3 & 1)) {
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-317907812, iIntValue3, -1, "com.dh.myembyapp.ui.screens.collection.ComposableSingletons$CollectionDetailScreenKt.lambda$-317907812.<anonymous> (CollectionDetailScreen.kt:193)");
                    }
                    TextKt.m3048TextNvy7gAk("这个合集还没有可显示的电影或剧集", null, Color.m5151copywmQWz5c$default(Color.INSTANCE.m5189getWhite0d7_KjU(), 0.72f, 0.0f, 0.0f, 0.0f, 14, null), null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, MaterialTheme.INSTANCE.getTypography(composer3, MaterialTheme.$stable).getTitleMedium(), composer3, 390, 0, 131066);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                } else {
                    composer3.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 11:
                return ComposableSingletons$ContextMenuUiKt.lambda__1455401925$lambda$0((ContextMenuColors) obj, (Composer) obj2, ((Integer) obj3).intValue());
            case 12:
                return ComposableSingletons$CoreTextFieldKt.lambda_559628295$lambda$0((Function2) obj, (Composer) obj2, ((Integer) obj3).intValue());
            case 13:
                Composer composer4 = (Composer) obj2;
                int iIntValue4 = ((Integer) obj3).intValue();
                ((LazyItemScope) obj).getClass();
                if (composer4.shouldExecute((iIntValue4 & 17) != 16, iIntValue4 & 1)) {
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(1940358013, iIntValue4, -1, "com.dh.myembyapp.ui.screens.danmaku.ComposableSingletons$DanmakuSettingsScreenKt.lambda$1940358013.<anonymous> (DanmakuSettingsScreen.kt:207)");
                    }
                    MaterialTheme materialTheme = MaterialTheme.INSTANCE;
                    int i = MaterialTheme.$stable;
                    TextKt.m3048TextNvy7gAk("弹幕功能配置", null, materialTheme.getColorScheme(composer4, i).getPrimary(), null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, materialTheme.getTypography(composer4, i).getHeadlineSmall(), composer4, 6, 0, 131066);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                } else {
                    composer4.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 14:
                Composer composer5 = (Composer) obj2;
                int iIntValue5 = ((Integer) obj3).intValue();
                ((LazyItemScope) obj).getClass();
                if (composer5.shouldExecute((iIntValue5 & 17) != 16, iIntValue5 & 1)) {
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(949968053, iIntValue5, -1, "com.dh.myembyapp.ui.screens.danmaku.ComposableSingletons$DanmakuSettingsScreenKt.lambda$949968053.<anonymous> (DanmakuSettingsScreen.kt:294)");
                    }
                    MaterialTheme materialTheme2 = MaterialTheme.INSTANCE;
                    int i2 = MaterialTheme.$stable;
                    TextKt.m3048TextNvy7gAk("弹幕API地址（最多5个，按顺序轮询）", PaddingKt.m1003paddingqDBjuR0$default(Modifier.INSTANCE, 0.0f, Dp.m7813constructorimpl(8.0f), 0.0f, 0.0f, 13, null), Color.m5151copywmQWz5c$default(materialTheme2.getColorScheme(composer5, i2).getOnSurface(), 0.7f, 0.0f, 0.0f, 0.0f, 14, null), null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, materialTheme2.getTypography(composer5, i2).getBodyMedium(), composer5, 54, 0, 131064);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                } else {
                    composer5.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 15:
                Composer composer6 = (Composer) obj2;
                int iIntValue6 = ((Integer) obj3).intValue();
                ((LazyItemScope) obj).getClass();
                if (composer6.shouldExecute((iIntValue6 & 17) != 16, iIntValue6 & 1)) {
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-19120015, iIntValue6, -1, "com.dh.myembyapp.ui.screens.player.components.ComposableSingletons$DecoderSelectionOverlayKt.lambda$-19120015.<anonymous> (DecoderSelectionOverlay.kt:136)");
                    }
                    TextKt.m3048TextNvy7gAk("解码模式", PaddingKt.m1003paddingqDBjuR0$default(Modifier.INSTANCE, 0.0f, 0.0f, 0.0f, Dp.m7813constructorimpl(8.0f), 7, null), Color.INSTANCE.m5189getWhite0d7_KjU(), null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, MaterialTheme.INSTANCE.getTypography(composer6, MaterialTheme.$stable).getHeadlineSmall(), composer6, 438, 0, 131064);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                } else {
                    composer6.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 16:
                Composer composer7 = (Composer) obj2;
                int iIntValue7 = ((Integer) obj3).intValue();
                ((LazyItemScope) obj).getClass();
                if (composer7.shouldExecute((iIntValue7 & 17) != 16, iIntValue7 & 1)) {
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-1275597734, iIntValue7, -1, "com.dh.myembyapp.ui.screens.player.components.ComposableSingletons$DecoderSelectionOverlayKt.lambda$-1275597734.<anonymous> (DecoderSelectionOverlay.kt:146)");
                    }
                    TextKt.m3048TextNvy7gAk("视频解码", PaddingKt.m1003paddingqDBjuR0$default(Modifier.INSTANCE, 0.0f, Dp.m7813constructorimpl(8.0f), 0.0f, Dp.m7813constructorimpl(8.0f), 5, null), Color.m5151copywmQWz5c$default(Color.INSTANCE.m5189getWhite0d7_KjU(), 0.8f, 0.0f, 0.0f, 0.0f, 14, null), null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, MaterialTheme.INSTANCE.getTypography(composer7, MaterialTheme.$stable).getTitleMedium(), composer7, 438, 0, 131064);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                } else {
                    composer7.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 17:
                Composer composer8 = (Composer) obj2;
                int iIntValue8 = ((Integer) obj3).intValue();
                ((LazyItemScope) obj).getClass();
                if (composer8.shouldExecute((iIntValue8 & 17) != 16, iIntValue8 & 1)) {
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(1565044281, iIntValue8, -1, "com.dh.myembyapp.ui.screens.player.components.ComposableSingletons$DecoderSelectionOverlayKt.lambda$1565044281.<anonymous> (DecoderSelectionOverlay.kt:216)");
                    }
                    Arrangement.HorizontalOrVertical horizontalOrVerticalM712spacedBy0680j_4 = Arrangement.INSTANCE.m712spacedBy0680j_4(Dp.m7813constructorimpl(8.0f));
                    Modifier.Companion companion = Modifier.INSTANCE;
                    MeasurePolicy measurePolicyColumnMeasurePolicy = ColumnKt.columnMeasurePolicy(horizontalOrVerticalM712spacedBy0680j_4, Alignment.INSTANCE.getStart(), composer8, 6);
                    long currentCompositeKeyHashCode = ComposablesKt.getCurrentCompositeKeyHashCode(composer8, 0);
                    int i3 = (int) (currentCompositeKeyHashCode ^ (currentCompositeKeyHashCode >>> 32));
                    CompositionLocalMap currentCompositionLocalMap = composer8.getCurrentCompositionLocalMap();
                    Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(composer8, companion);
                    ComposeUiNode.Companion companion2 = ComposeUiNode.INSTANCE;
                    Function0<ComposeUiNode> constructor = companion2.getConstructor();
                    if (composer8.getApplier() == null) {
                        ComposablesKt.invalidApplier();
                    }
                    composer8.startReusableNode();
                    if (composer8.getInserting()) {
                        composer8.createNode(constructor);
                    } else {
                        composer8.useNode();
                    }
                    Composer composerM4318constructorimpl = Updater.m4318constructorimpl(composer8);
                    mr.z(companion2, composerM4318constructorimpl, measurePolicyColumnMeasurePolicy, composerM4318constructorimpl, currentCompositionLocalMap);
                    Updater.m4326setimpl(composerM4318constructorimpl, modifierMaterializeModifier, (Function2<? super T, ? super Modifier, Unit>) id.h(companion2, composerM4318constructorimpl, Integer.valueOf(i3), composerM4318constructorimpl));
                    ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.INSTANCE;
                    MaterialTheme materialTheme3 = MaterialTheme.INSTANCE;
                    int i4 = MaterialTheme.$stable;
                    TextStyle textStyleM7288copyp1EtxEg$default = TextStyle.m7288copyp1EtxEg$default(materialTheme3.getTypography(composer8, i4).getBodySmall(), 0L, 0L, FontWeight.INSTANCE.getBold(), null, null, null, null, 0L, null, null, null, 0L, null, null, null, 0, 0, 0L, null, null, null, 0, 0, null, 16777211, null);
                    Color.Companion companion3 = Color.INSTANCE;
                    TextKt.m3048TextNvy7gAk("视频解码说明：", null, Color.m5151copywmQWz5c$default(companion3.m5189getWhite0d7_KjU(), 0.9f, 0.0f, 0.0f, 0.0f, 14, null), null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, textStyleM7288copyp1EtxEg$default, composer8, 390, 0, 131066);
                    TextKt.m3048TextNvy7gAk("• 硬解码：使用GPU，省电，性能高", null, Color.m5151copywmQWz5c$default(companion3.m5189getWhite0d7_KjU(), 0.7f, 0.0f, 0.0f, 0.0f, 14, null), null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, materialTheme3.getTypography(composer8, i4).getBodySmall(), composer8, 390, 0, 131066);
                    TextKt.m3048TextNvy7gAk("• 软解码：使用CPU，兼容性好", null, Color.m5151copywmQWz5c$default(companion3.m5189getWhite0d7_KjU(), 0.7f, 0.0f, 0.0f, 0.0f, 14, null), null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, materialTheme3.getTypography(composer8, i4).getBodySmall(), composer8, 390, 0, 131066);
                    TextKt.m3048TextNvy7gAk("• 自动：根据设备自动选择", null, Color.m5151copywmQWz5c$default(companion3.m5189getWhite0d7_KjU(), 0.7f, 0.0f, 0.0f, 0.0f, 14, null), null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, materialTheme3.getTypography(composer8, i4).getBodySmall(), composer8, 390, 0, 131066);
                    composer8.endNode();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                } else {
                    composer8.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 18:
                Composer composer9 = (Composer) obj2;
                int iIntValue9 = ((Integer) obj3).intValue();
                ((LazyItemScope) obj).getClass();
                if (composer9.shouldExecute((iIntValue9 & 17) != 16, iIntValue9 & 1)) {
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(110719000, iIntValue9, -1, "com.dh.myembyapp.ui.screens.player.components.ComposableSingletons$DecoderSelectionOverlayKt.lambda$110719000.<anonymous> (DecoderSelectionOverlay.kt:244)");
                    }
                    TextKt.m3048TextNvy7gAk("音频解码", PaddingKt.m1003paddingqDBjuR0$default(Modifier.INSTANCE, 0.0f, Dp.m7813constructorimpl(16.0f), 0.0f, Dp.m7813constructorimpl(8.0f), 5, null), Color.m5151copywmQWz5c$default(Color.INSTANCE.m5189getWhite0d7_KjU(), 0.8f, 0.0f, 0.0f, 0.0f, 14, null), null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, MaterialTheme.INSTANCE.getTypography(composer9, MaterialTheme.$stable).getTitleMedium(), composer9, 438, 0, 131064);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                } else {
                    composer9.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 19:
                Composer composer10 = (Composer) obj2;
                int iIntValue10 = ((Integer) obj3).intValue();
                ((LazyItemScope) obj).getClass();
                if (composer10.shouldExecute((iIntValue10 & 17) != 16, iIntValue10 & 1)) {
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(42710453, iIntValue10, -1, "com.dh.myembyapp.ui.screens.player.components.ComposableSingletons$DecoderSelectionOverlayKt.lambda$42710453.<anonymous> (DecoderSelectionOverlay.kt:385)");
                    }
                    Arrangement.HorizontalOrVertical horizontalOrVerticalM712spacedBy0680j_5 = Arrangement.INSTANCE.m712spacedBy0680j_4(Dp.m7813constructorimpl(8.0f));
                    Modifier.Companion companion4 = Modifier.INSTANCE;
                    MeasurePolicy measurePolicyColumnMeasurePolicy2 = ColumnKt.columnMeasurePolicy(horizontalOrVerticalM712spacedBy0680j_5, Alignment.INSTANCE.getStart(), composer10, 6);
                    long currentCompositeKeyHashCode2 = ComposablesKt.getCurrentCompositeKeyHashCode(composer10, 0);
                    int i5 = (int) (currentCompositeKeyHashCode2 ^ (currentCompositeKeyHashCode2 >>> 32));
                    CompositionLocalMap currentCompositionLocalMap2 = composer10.getCurrentCompositionLocalMap();
                    Modifier modifierMaterializeModifier2 = ComposedModifierKt.materializeModifier(composer10, companion4);
                    ComposeUiNode.Companion companion5 = ComposeUiNode.INSTANCE;
                    Function0<ComposeUiNode> constructor2 = companion5.getConstructor();
                    if (composer10.getApplier() == null) {
                        ComposablesKt.invalidApplier();
                    }
                    composer10.startReusableNode();
                    if (composer10.getInserting()) {
                        composer10.createNode(constructor2);
                    } else {
                        composer10.useNode();
                    }
                    Composer composerM4318constructorimpl2 = Updater.m4318constructorimpl(composer10);
                    mr.z(companion5, composerM4318constructorimpl2, measurePolicyColumnMeasurePolicy2, composerM4318constructorimpl2, currentCompositionLocalMap2);
                    Updater.m4326setimpl(composerM4318constructorimpl2, modifierMaterializeModifier2, (Function2<? super T, ? super Modifier, Unit>) id.h(companion5, composerM4318constructorimpl2, Integer.valueOf(i5), composerM4318constructorimpl2));
                    ColumnScopeInstance columnScopeInstance2 = ColumnScopeInstance.INSTANCE;
                    MaterialTheme materialTheme4 = MaterialTheme.INSTANCE;
                    int i6 = MaterialTheme.$stable;
                    TextStyle textStyleM7288copyp1EtxEg$default2 = TextStyle.m7288copyp1EtxEg$default(materialTheme4.getTypography(composer10, i6).getBodySmall(), 0L, 0L, FontWeight.INSTANCE.getBold(), null, null, null, null, 0L, null, null, null, 0L, null, null, null, 0, 0, 0L, null, null, null, 0, 0, null, 16777211, null);
                    Color.Companion companion6 = Color.INSTANCE;
                    TextKt.m3048TextNvy7gAk("音频解码说明：", null, Color.m5151copywmQWz5c$default(companion6.m5189getWhite0d7_KjU(), 0.9f, 0.0f, 0.0f, 0.0f, 14, null), null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, textStyleM7288copyp1EtxEg$default2, composer10, 390, 0, 131066);
                    TextKt.m3048TextNvy7gAk("• 强制FFmpeg：优先使用FFmpeg解码音频", null, Color.m5151copywmQWz5c$default(companion6.m5189getWhite0d7_KjU(), 0.7f, 0.0f, 0.0f, 0.0f, 14, null), null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, materialTheme4.getTypography(composer10, i6).getBodySmall(), composer10, 390, 0, 131066);
                    TextKt.m3048TextNvy7gAk("• 音频直通优先：让支持的设备显示 Dolby/DTS，倍速播放时可能不生效", null, Color.m5151copywmQWz5c$default(companion6.m5189getWhite0d7_KjU(), 0.7f, 0.0f, 0.0f, 0.0f, 14, null), null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, materialTheme4.getTypography(composer10, i6).getBodySmall(), composer10, 390, 0, 131066);
                    composer10.endNode();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                } else {
                    composer10.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 20:
                Composer composer11 = (Composer) obj2;
                int iIntValue11 = ((Integer) obj3).intValue();
                ((LazyItemScope) obj).getClass();
                if (composer11.shouldExecute((iIntValue11 & 17) != 16, iIntValue11 & 1)) {
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-1411614828, iIntValue11, -1, "com.dh.myembyapp.ui.screens.player.components.ComposableSingletons$DecoderSelectionOverlayKt.lambda$-1411614828.<anonymous> (DecoderSelectionOverlay.kt:408)");
                    }
                    TextKt.m3048TextNvy7gAk("其他解码", PaddingKt.m1003paddingqDBjuR0$default(Modifier.INSTANCE, 0.0f, Dp.m7813constructorimpl(16.0f), 0.0f, Dp.m7813constructorimpl(8.0f), 5, null), Color.m5151copywmQWz5c$default(Color.INSTANCE.m5189getWhite0d7_KjU(), 0.8f, 0.0f, 0.0f, 0.0f, 14, null), null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, MaterialTheme.INSTANCE.getTypography(composer11, MaterialTheme.$stable).getTitleMedium(), composer11, 438, 0, 131064);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                } else {
                    composer11.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 21:
                Composer composer12 = (Composer) obj2;
                int iIntValue12 = ((Integer) obj3).intValue();
                ((LazyItemScope) obj).getClass();
                if (composer12.shouldExecute((iIntValue12 & 17) != 16, iIntValue12 & 1)) {
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-25298094, iIntValue12, -1, "com.dh.myembyapp.ui.screens.player.components.ComposableSingletons$DecoderSelectionOverlayKt.lambda$-25298094.<anonymous> (DecoderSelectionOverlay.kt:484)");
                    }
                    Arrangement.HorizontalOrVertical horizontalOrVerticalM712spacedBy0680j_6 = Arrangement.INSTANCE.m712spacedBy0680j_4(Dp.m7813constructorimpl(8.0f));
                    Modifier.Companion companion7 = Modifier.INSTANCE;
                    MeasurePolicy measurePolicyColumnMeasurePolicy3 = ColumnKt.columnMeasurePolicy(horizontalOrVerticalM712spacedBy0680j_6, Alignment.INSTANCE.getStart(), composer12, 6);
                    long currentCompositeKeyHashCode3 = ComposablesKt.getCurrentCompositeKeyHashCode(composer12, 0);
                    int i7 = (int) (currentCompositeKeyHashCode3 ^ (currentCompositeKeyHashCode3 >>> 32));
                    CompositionLocalMap currentCompositionLocalMap3 = composer12.getCurrentCompositionLocalMap();
                    Modifier modifierMaterializeModifier3 = ComposedModifierKt.materializeModifier(composer12, companion7);
                    ComposeUiNode.Companion companion8 = ComposeUiNode.INSTANCE;
                    Function0<ComposeUiNode> constructor3 = companion8.getConstructor();
                    if (composer12.getApplier() == null) {
                        ComposablesKt.invalidApplier();
                    }
                    composer12.startReusableNode();
                    if (composer12.getInserting()) {
                        composer12.createNode(constructor3);
                    } else {
                        composer12.useNode();
                    }
                    Composer composerM4318constructorimpl3 = Updater.m4318constructorimpl(composer12);
                    mr.z(companion8, composerM4318constructorimpl3, measurePolicyColumnMeasurePolicy3, composerM4318constructorimpl3, currentCompositionLocalMap3);
                    Updater.m4326setimpl(composerM4318constructorimpl3, modifierMaterializeModifier3, (Function2<? super T, ? super Modifier, Unit>) id.h(companion8, composerM4318constructorimpl3, Integer.valueOf(i7), composerM4318constructorimpl3));
                    ColumnScopeInstance columnScopeInstance3 = ColumnScopeInstance.INSTANCE;
                    MaterialTheme materialTheme5 = MaterialTheme.INSTANCE;
                    int i8 = MaterialTheme.$stable;
                    TextStyle textStyleM7288copyp1EtxEg$default3 = TextStyle.m7288copyp1EtxEg$default(materialTheme5.getTypography(composer12, i8).getBodySmall(), 0L, 0L, FontWeight.INSTANCE.getBold(), null, null, null, null, 0L, null, null, null, 0L, null, null, null, 0, 0, 0L, null, null, null, 0, 0, null, 16777211, null);
                    Color.Companion companion9 = Color.INSTANCE;
                    TextKt.m3048TextNvy7gAk("其他解码说明：", null, Color.m5151copywmQWz5c$default(companion9.m5189getWhite0d7_KjU(), 0.9f, 0.0f, 0.0f, 0.0f, 14, null), null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, textStyleM7288copyp1EtxEg$default3, composer12, 390, 0, 131066);
                    TextKt.m3048TextNvy7gAk("• 若设备原生支持 Dolby Vision，请关闭", null, Color.m5151copywmQWz5c$default(companion9.m5189getWhite0d7_KjU(), 0.7f, 0.0f, 0.0f, 0.0f, 14, null), null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, materialTheme5.getTypography(composer12, i8).getBodySmall(), composer12, 390, 0, 131066);
                    composer12.endNode();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                } else {
                    composer12.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 22:
                Composer composer13 = (Composer) obj2;
                int iIntValue13 = ((Integer) obj3).intValue();
                ((RowScope) obj).getClass();
                if (composer13.shouldExecute((iIntValue13 & 17) != 16, iIntValue13 & 1)) {
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(841376554, iIntValue13, -1, "com.dh.myembyapp.ui.screens.home.ComposableSingletons$HomeScreenKt.lambda$841376554.<anonymous> (HomeScreen.kt:910)");
                    }
                    TextKt.m3048TextNvy7gAk("重试", null, 0L, null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, composer13, 6, 0, 262142);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                } else {
                    composer13.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 23:
                Composer composer14 = (Composer) obj2;
                int iIntValue14 = ((Integer) obj3).intValue();
                ((RowScope) obj).getClass();
                if (composer14.shouldExecute((iIntValue14 & 17) != 16, iIntValue14 & 1)) {
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-481675267, iIntValue14, -1, "com.dh.myembyapp.ui.screens.home.ComposableSingletons$HomeScreenKt.lambda$-481675267.<anonymous> (HomeScreen.kt:1576)");
                    }
                    TextKt.m3048TextNvy7gAk("确定", null, 0L, null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, composer14, 6, 0, 262142);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                } else {
                    composer14.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 24:
                Composer composer15 = (Composer) obj2;
                int iIntValue15 = ((Integer) obj3).intValue();
                ((RowScope) obj).getClass();
                if (composer15.shouldExecute((iIntValue15 & 17) != 16, iIntValue15 & 1)) {
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-754809013, iIntValue15, -1, "com.dh.myembyapp.ui.screens.home.ComposableSingletons$HomeScreenKt.lambda$-754809013.<anonymous> (HomeScreen.kt:1589)");
                    }
                    TextKt.m3048TextNvy7gAk("知道了", null, 0L, null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, composer15, 6, 0, 262142);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                } else {
                    composer15.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 25:
                return a(obj, obj2, obj3);
            case 26:
                return b(obj, obj2, obj3);
            case 27:
                return c(obj, obj2, obj3);
            default:
                Composer composer16 = (Composer) obj2;
                int iIntValue16 = ((Integer) obj3).intValue();
                ((LazyGridItemScope) obj).getClass();
                if (composer16.shouldExecute((iIntValue16 & 17) != 16, iIntValue16 & 1)) {
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(1611200139, iIntValue16, -1, "com.dh.myembyapp.ui.screens.library.ComposableSingletons$LibraryScreenKt.lambda$1611200139.<anonymous> (LibraryScreen.kt:596)");
                    }
                    Modifier.Companion companion10 = Modifier.INSTANCE;
                    Modifier modifierM999padding3ABfNKs = PaddingKt.m999padding3ABfNKs(SizeKt.fillMaxWidth$default(companion10, 0.0f, 1, null), Dp.m7813constructorimpl(16.0f));
                    MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.INSTANCE.getCenter(), false);
                    long currentCompositeKeyHashCode4 = ComposablesKt.getCurrentCompositeKeyHashCode(composer16, 0);
                    int i9 = (int) ((currentCompositeKeyHashCode4 >>> 32) ^ currentCompositeKeyHashCode4);
                    CompositionLocalMap currentCompositionLocalMap4 = composer16.getCurrentCompositionLocalMap();
                    Modifier modifierMaterializeModifier4 = ComposedModifierKt.materializeModifier(composer16, modifierM999padding3ABfNKs);
                    ComposeUiNode.Companion companion11 = ComposeUiNode.INSTANCE;
                    Function0<ComposeUiNode> constructor4 = companion11.getConstructor();
                    if (composer16.getApplier() == null) {
                        ComposablesKt.invalidApplier();
                    }
                    composer16.startReusableNode();
                    if (composer16.getInserting()) {
                        composer16.createNode(constructor4);
                    } else {
                        composer16.useNode();
                    }
                    Composer composerM4318constructorimpl4 = Updater.m4318constructorimpl(composer16);
                    mr.z(companion11, composerM4318constructorimpl4, measurePolicyMaybeCachedBoxMeasurePolicy, composerM4318constructorimpl4, currentCompositionLocalMap4);
                    Updater.m4326setimpl(composerM4318constructorimpl4, modifierMaterializeModifier4, (Function2<? super T, ? super Modifier, Unit>) id.h(companion11, composerM4318constructorimpl4, Integer.valueOf(i9), composerM4318constructorimpl4));
                    BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
                    ProgressIndicatorKt.m2703CircularProgressIndicator4lLiAd8(SizeKt.m1064size3ABfNKs(companion10, Dp.m7813constructorimpl(32.0f)), 0L, Dp.m7813constructorimpl(3.0f), 0L, 0, 0.0f, composer16, 390, 58);
                    composer16.endNode();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                } else {
                    composer16.skipToGroupEnd();
                }
                return Unit.INSTANCE;
        }
    }
}
