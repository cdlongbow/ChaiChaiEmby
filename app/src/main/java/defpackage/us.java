package defpackage;

import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.RowKt;
import androidx.compose.foundation.layout.RowScopeInstance;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.material.icons.Icons;
import androidx.compose.material.icons.filled.AddKt;
import androidx.compose.material.icons.filled.PlayArrowKt;
import androidx.compose.material3.IconKt;
import androidx.compose.material3.MaterialTheme;
import androidx.compose.material3.ProgressIndicatorKt;
import androidx.compose.material3.TextKt;
import androidx.compose.runtime.ComposableSingletons$CompositionKt;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.Updater;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.text.font.FontWeight;
import androidx.compose.ui.unit.Dp;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class us implements Function2 {
    public final /* synthetic */ int a;

    public /* synthetic */ us(int i) {
        this.a = i;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.a) {
            case 0:
                Composer composer = (Composer) obj;
                int iIntValue = ((Integer) obj2).intValue();
                if (composer.shouldExecute((iIntValue & 3) != 2, iIntValue & 1)) {
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(718497925, iIntValue, -1, "com.dh.myembyapp.ui.components.ComposableSingletons$BackupRouteManagerDialogKt.lambda$718497925.<anonymous> (BackupRouteManagerDialog.kt:1189)");
                    }
                    pi.b("全部导入", null, composer, 6, 2);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                } else {
                    composer.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 1:
                Composer composer2 = (Composer) obj;
                int iIntValue2 = ((Integer) obj2).intValue();
                if (composer2.shouldExecute((iIntValue2 & 3) != 2, iIntValue2 & 1)) {
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-1768055708, iIntValue2, -1, "com.dh.myembyapp.ui.components.ComposableSingletons$BackupRouteManagerDialogKt.lambda$-1768055708.<anonymous> (BackupRouteManagerDialog.kt:1196)");
                    }
                    pi.b("取消", null, composer2, 6, 2);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                } else {
                    composer2.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 2:
                Composer composer3 = (Composer) obj;
                int iIntValue3 = ((Integer) obj2).intValue();
                if (composer3.shouldExecute((iIntValue3 & 3) != 2, iIntValue3 & 1)) {
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(1407780136, iIntValue3, -1, "com.dh.myembyapp.ui.components.ComposableSingletons$BackupRouteManagerDialogKt.lambda$1407780136.<anonymous> (BackupRouteManagerDialog.kt:1308)");
                    }
                    pi.b("取消", null, composer3, 6, 2);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                } else {
                    composer3.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 3:
                Composer composer4 = (Composer) obj;
                int iIntValue4 = ((Integer) obj2).intValue();
                if (composer4.shouldExecute((iIntValue4 & 3) != 2, iIntValue4 & 1)) {
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(45316049, iIntValue4, -1, "com.dh.myembyapp.ui.components.ComposableSingletons$BackupRouteManagerDialogKt.lambda$45316049.<anonymous> (BackupRouteManagerDialog.kt:1315)");
                    }
                    pi.b("保存", null, composer4, 6, 2);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                } else {
                    composer4.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 4:
                Composer composer5 = (Composer) obj;
                int iIntValue5 = ((Integer) obj2).intValue();
                if (composer5.shouldExecute((iIntValue5 & 3) != 2, iIntValue5 & 1)) {
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-1956175704, iIntValue5, -1, "com.dh.myembyapp.ui.components.ComposableSingletons$BackupRouteManagerDialogKt.lambda$-1956175704.<anonymous> (BackupRouteManagerDialog.kt:1479)");
                    }
                    pi.b("取消", null, composer5, 6, 2);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                } else {
                    composer5.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 5:
                Composer composer6 = (Composer) obj;
                int iIntValue6 = ((Integer) obj2).intValue();
                if (composer6.shouldExecute((iIntValue6 & 3) != 2, iIntValue6 & 1)) {
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-532978927, iIntValue6, -1, "com.dh.myembyapp.ui.components.ComposableSingletons$BackupRouteManagerDialogKt.lambda$-532978927.<anonymous> (BackupRouteManagerDialog.kt:1486)");
                    }
                    pi.b("清空", null, composer6, 6, 2);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                } else {
                    composer6.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 6:
                Composer composer7 = (Composer) obj;
                int iIntValue7 = ((Integer) obj2).intValue();
                if (composer7.shouldExecute((iIntValue7 & 3) != 2, iIntValue7 & 1)) {
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(845578743, iIntValue7, -1, "com.dh.myembyapp.ui.components.ComposableSingletons$BackupRouteManagerDialogKt.lambda$845578743.<anonymous> (BackupRouteManagerDialog.kt:591)");
                    }
                    pi.b("新增线路", AddKt.getAdd(Icons.INSTANCE.getDefault()), composer7, 6, 0);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                } else {
                    composer7.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 7:
                Composer composer8 = (Composer) obj;
                int iIntValue8 = ((Integer) obj2).intValue();
                if (composer8.shouldExecute((iIntValue8 & 3) != 2, iIntValue8 & 1)) {
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(732212708, iIntValue8, -1, "com.dh.myembyapp.ui.components.ComposableSingletons$BackupRouteManagerDialogKt.lambda$732212708.<anonymous> (BackupRouteManagerDialog.kt:751)");
                    }
                    pi.b("取消", null, composer8, 6, 2);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                } else {
                    composer8.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 8:
                Composer composer9 = (Composer) obj;
                int iIntValue9 = ((Integer) obj2).intValue();
                if (composer9.shouldExecute((iIntValue9 & 3) != 2, iIntValue9 & 1)) {
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-1112643173, iIntValue9, -1, "com.dh.myembyapp.ui.components.ComposableSingletons$BackupRouteManagerDialogKt.lambda$-1112643173.<anonymous> (BackupRouteManagerDialog.kt:759)");
                    }
                    pi.b("保存", null, composer9, 6, 2);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                } else {
                    composer9.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 9:
                return ComposableSingletons$CompositionKt.lambda_954879418$lambda$0((Composer) obj, ((Integer) obj2).intValue());
            case 10:
                return ComposableSingletons$CompositionKt.lambda_1918065384$lambda$0((Composer) obj, ((Integer) obj2).intValue());
            case 11:
                Composer composer10 = (Composer) obj;
                int iIntValue10 = ((Integer) obj2).intValue();
                if (composer10.shouldExecute((iIntValue10 & 3) != 2, iIntValue10 & 1)) {
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-2055160554, iIntValue10, -1, "com.dh.myembyapp.ui.screens.danmaku.ComposableSingletons$DanmakuSettingsScreenKt.lambda$-2055160554.<anonymous> (DanmakuSettingsScreen.kt:341)");
                    }
                    TextKt.m3048TextNvy7gAk("https://api.dandanplay.net", null, 0L, null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, MaterialTheme.INSTANCE.getTypography(composer10, MaterialTheme.$stable).getBodySmall(), composer10, 6, 0, 131070);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                } else {
                    composer10.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 12:
                Composer composer11 = (Composer) obj;
                int iIntValue11 = ((Integer) obj2).intValue();
                if (composer11.shouldExecute((iIntValue11 & 3) != 2, iIntValue11 & 1)) {
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-65275447, iIntValue11, -1, "com.dh.myembyapp.ui.screens.detail.ComposableSingletons$DetailScreenKt.lambda$-65275447.<anonymous> (DetailScreen.kt:3388)");
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                } else {
                    composer11.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 13:
                Composer composer12 = (Composer) obj;
                int iIntValue12 = ((Integer) obj2).intValue();
                if (composer12.shouldExecute((iIntValue12 & 3) != 2, iIntValue12 & 1)) {
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(611299653, iIntValue12, -1, "com.dh.myembyapp.ui.screens.detail.ComposableSingletons$DetailScreenKt.lambda$611299653.<anonymous> (DetailScreen.kt:3309)");
                    }
                    TextKt.m3048TextNvy7gAk("选择季", null, 0L, null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, MaterialTheme.INSTANCE.getTypography(composer12, MaterialTheme.$stable).getTitleLarge(), composer12, 6, 0, 131070);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                } else {
                    composer12.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 14:
                Composer composer13 = (Composer) obj;
                int iIntValue13 = ((Integer) obj2).intValue();
                if (composer13.shouldExecute((iIntValue13 & 3) != 2, iIntValue13 & 1)) {
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(1670940151, iIntValue13, -1, "com.dh.myembyapp.ui.screens.detail.ComposableSingletons$DetailScreenKt.lambda$1670940151.<anonymous> (DetailScreen.kt:3723)");
                    }
                    TextKt.m3048TextNvy7gAk("当前服", PaddingKt.m1000paddingVpY3zN4(Modifier.INSTANCE, Dp.m7813constructorimpl(10.0f), Dp.m7813constructorimpl(6.0f)), Color.INSTANCE.m5189getWhite0d7_KjU(), null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, TextStyle.m7288copyp1EtxEg$default(MaterialTheme.INSTANCE.getTypography(composer13, MaterialTheme.$stable).getLabelMedium(), 0L, 0L, FontWeight.INSTANCE.getSemiBold(), null, null, null, null, 0L, null, null, null, 0L, null, null, null, 0, 0, 0L, null, null, null, 0, 0, null, 16777211, null), composer13, 438, 0, 131064);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                } else {
                    composer13.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 15:
                Composer composer14 = (Composer) obj;
                int iIntValue14 = ((Integer) obj2).intValue();
                if (composer14.shouldExecute((iIntValue14 & 3) != 2, iIntValue14 & 1)) {
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(1769309976, iIntValue14, -1, "com.dh.myembyapp.ui.screens.detail.ComposableSingletons$DetailScreenKt.lambda$1769309976.<anonymous> (DetailScreen.kt:7856)");
                    }
                    TextKt.m3048TextNvy7gAk("继续观看", PaddingKt.m1000paddingVpY3zN4(Modifier.INSTANCE, Dp.m7813constructorimpl(6.0f), Dp.m7813constructorimpl(2.0f)), Color.INSTANCE.m5189getWhite0d7_KjU(), null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, MaterialTheme.INSTANCE.getTypography(composer14, MaterialTheme.$stable).getLabelSmall(), composer14, 438, 0, 131064);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                } else {
                    composer14.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 16:
                Composer composer15 = (Composer) obj;
                int iIntValue15 = ((Integer) obj2).intValue();
                if (composer15.shouldExecute((iIntValue15 & 3) != 2, iIntValue15 & 1)) {
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-1973395357, iIntValue15, -1, "com.dh.myembyapp.ui.screens.detail.ComposableSingletons$DetailScreenKt.lambda$-1973395357.<anonymous> (DetailScreen.kt:7925)");
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                } else {
                    composer15.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 17:
                Composer composer16 = (Composer) obj;
                int iIntValue16 = ((Integer) obj2).intValue();
                if (composer16.shouldExecute((iIntValue16 & 3) != 2, iIntValue16 & 1)) {
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(40855628, iIntValue16, -1, "com.dh.myembyapp.ui.screens.detail.ComposableSingletons$DetailScreenKt.lambda$40855628.<anonymous> (DetailScreen.kt:7931)");
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                } else {
                    composer16.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 18:
                Composer composer17 = (Composer) obj;
                int iIntValue17 = ((Integer) obj2).intValue();
                if (composer17.shouldExecute((iIntValue17 & 3) != 2, iIntValue17 & 1)) {
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-456773486, iIntValue17, -1, "com.dh.myembyapp.ui.screens.detail.ComposableSingletons$DetailScreenKt.lambda$-456773486.<anonymous> (DetailScreen.kt:9115)");
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                } else {
                    composer17.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 19:
                Composer composer18 = (Composer) obj;
                int iIntValue18 = ((Integer) obj2).intValue();
                if (composer18.shouldExecute((iIntValue18 & 3) != 2, iIntValue18 & 1)) {
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-1679311602, iIntValue18, -1, "com.dh.myembyapp.ui.screens.detail.ComposableSingletons$DetailScreenKt.lambda$-1679311602.<anonymous> (DetailScreen.kt:9001)");
                    }
                    TextKt.m3048TextNvy7gAk("选择版本", null, 0L, null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, MaterialTheme.INSTANCE.getTypography(composer18, MaterialTheme.$stable).getTitleLarge(), composer18, 6, 0, 131070);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                } else {
                    composer18.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 20:
                Composer composer19 = (Composer) obj;
                int iIntValue19 = ((Integer) obj2).intValue();
                if (composer19.shouldExecute((iIntValue19 & 3) != 2, iIntValue19 & 1)) {
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-487780468, iIntValue19, -1, "com.dh.myembyapp.ui.screens.home.ComposableSingletons$HomeScreenKt.lambda$-487780468.<anonymous> (HomeScreen.kt:1213)");
                    }
                    TextKt.m3048TextNvy7gAk("媒体库排序", null, 0L, null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, composer19, 6, 0, 262142);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                } else {
                    composer19.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 21:
                Composer composer20 = (Composer) obj;
                int iIntValue20 = ((Integer) obj2).intValue();
                if (composer20.shouldExecute((iIntValue20 & 3) != 2, iIntValue20 & 1)) {
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-1054692501, iIntValue20, -1, "com.dh.myembyapp.ui.screens.home.ComposableSingletons$HomeScreenKt.lambda$-1054692501.<anonymous> (HomeScreen.kt:1216)");
                    }
                    Arrangement.HorizontalOrVertical horizontalOrVerticalM712spacedBy0680j_4 = Arrangement.INSTANCE.m712spacedBy0680j_4(Dp.m7813constructorimpl(12.0f));
                    Alignment.Vertical centerVertically = Alignment.INSTANCE.getCenterVertically();
                    Modifier.Companion companion = Modifier.INSTANCE;
                    MeasurePolicy measurePolicyRowMeasurePolicy = RowKt.rowMeasurePolicy(horizontalOrVerticalM712spacedBy0680j_4, centerVertically, composer20, 54);
                    long currentCompositeKeyHashCode = ComposablesKt.getCurrentCompositeKeyHashCode(composer20, 0);
                    int i = (int) (currentCompositeKeyHashCode ^ (currentCompositeKeyHashCode >>> 32));
                    CompositionLocalMap currentCompositionLocalMap = composer20.getCurrentCompositionLocalMap();
                    Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(composer20, companion);
                    ComposeUiNode.Companion companion2 = ComposeUiNode.INSTANCE;
                    Function0<ComposeUiNode> constructor = companion2.getConstructor();
                    if (composer20.getApplier() == null) {
                        ComposablesKt.invalidApplier();
                    }
                    composer20.startReusableNode();
                    if (composer20.getInserting()) {
                        composer20.createNode(constructor);
                    } else {
                        composer20.useNode();
                    }
                    Composer composerM4318constructorimpl = Updater.m4318constructorimpl(composer20);
                    mr.z(companion2, composerM4318constructorimpl, measurePolicyRowMeasurePolicy, composerM4318constructorimpl, currentCompositionLocalMap);
                    Updater.m4326setimpl(composerM4318constructorimpl, modifierMaterializeModifier, (Function2<? super T, ? super Modifier, Unit>) id.h(companion2, composerM4318constructorimpl, Integer.valueOf(i), composerM4318constructorimpl));
                    RowScopeInstance rowScopeInstance = RowScopeInstance.INSTANCE;
                    ProgressIndicatorKt.m2703CircularProgressIndicator4lLiAd8(SizeKt.m1064size3ABfNKs(companion, Dp.m7813constructorimpl(20.0f)), 0L, Dp.m7813constructorimpl(2.0f), 0L, 0, 0.0f, composer20, 390, 58);
                    TextKt.m3048TextNvy7gAk("正在准备排序数据…", null, 0L, null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, composer20, 6, 0, 262142);
                    composer20.endNode();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                } else {
                    composer20.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 22:
                Composer composer21 = (Composer) obj;
                int iIntValue21 = ((Integer) obj2).intValue();
                if (composer21.shouldExecute((iIntValue21 & 3) != 2, iIntValue21 & 1)) {
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(1154040908, iIntValue21, -1, "com.dh.myembyapp.ui.screens.home.ComposableSingletons$HomeScreenKt.lambda$1154040908.<anonymous> (HomeScreen.kt:1565)");
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                } else {
                    composer21.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 23:
                Composer composer22 = (Composer) obj;
                int iIntValue22 = ((Integer) obj2).intValue();
                if (composer22.shouldExecute((iIntValue22 & 3) != 2, iIntValue22 & 1)) {
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-423574448, iIntValue22, -1, "com.dh.myembyapp.ui.screens.home.ComposableSingletons$HomeScreenKt.lambda$-423574448.<anonymous> (HomeScreen.kt:1556)");
                    }
                    TextKt.m3048TextNvy7gAk("正在清除缓存", null, 0L, null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, composer22, 6, 0, 262142);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                } else {
                    composer22.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 24:
                Composer composer23 = (Composer) obj;
                int iIntValue23 = ((Integer) obj2).intValue();
                if (composer23.shouldExecute((iIntValue23 & 3) != 2, iIntValue23 & 1)) {
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-817978287, iIntValue23, -1, "com.dh.myembyapp.ui.screens.home.ComposableSingletons$HomeScreenKt.lambda$-817978287.<anonymous> (HomeScreen.kt:1558)");
                    }
                    Modifier modifierFillMaxWidth$default = SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null);
                    MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.INSTANCE.getCenter(), false);
                    long currentCompositeKeyHashCode2 = ComposablesKt.getCurrentCompositeKeyHashCode(composer23, 0);
                    int i2 = (int) ((currentCompositeKeyHashCode2 >>> 32) ^ currentCompositeKeyHashCode2);
                    CompositionLocalMap currentCompositionLocalMap2 = composer23.getCurrentCompositionLocalMap();
                    Modifier modifierMaterializeModifier2 = ComposedModifierKt.materializeModifier(composer23, modifierFillMaxWidth$default);
                    ComposeUiNode.Companion companion3 = ComposeUiNode.INSTANCE;
                    Function0<ComposeUiNode> constructor2 = companion3.getConstructor();
                    if (composer23.getApplier() == null) {
                        ComposablesKt.invalidApplier();
                    }
                    composer23.startReusableNode();
                    if (composer23.getInserting()) {
                        composer23.createNode(constructor2);
                    } else {
                        composer23.useNode();
                    }
                    Composer composerM4318constructorimpl2 = Updater.m4318constructorimpl(composer23);
                    mr.z(companion3, composerM4318constructorimpl2, measurePolicyMaybeCachedBoxMeasurePolicy, composerM4318constructorimpl2, currentCompositionLocalMap2);
                    Updater.m4326setimpl(composerM4318constructorimpl2, modifierMaterializeModifier2, (Function2<? super T, ? super Modifier, Unit>) id.h(companion3, composerM4318constructorimpl2, Integer.valueOf(i2), composerM4318constructorimpl2));
                    BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
                    ProgressIndicatorKt.m2703CircularProgressIndicator4lLiAd8(null, 0L, 0.0f, 0L, 0, 0.0f, composer23, 0, 63);
                    composer23.endNode();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                } else {
                    composer23.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 25:
                Composer composer24 = (Composer) obj;
                int iIntValue24 = ((Integer) obj2).intValue();
                if (composer24.shouldExecute((iIntValue24 & 3) != 2, iIntValue24 & 1)) {
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(503180305, iIntValue24, -1, "com.dh.myembyapp.ui.screens.home.ComposableSingletons$HomeScreenKt.lambda$503180305.<anonymous> (HomeScreen.kt:1572)");
                    }
                    TextKt.m3048TextNvy7gAk("清除完成", null, 0L, null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, composer24, 6, 0, 262142);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                } else {
                    composer24.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 26:
                Composer composer25 = (Composer) obj;
                int iIntValue25 = ((Integer) obj2).intValue();
                if (composer25.shouldExecute((iIntValue25 & 3) != 2, iIntValue25 & 1)) {
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(108776466, iIntValue25, -1, "com.dh.myembyapp.ui.screens.home.ComposableSingletons$HomeScreenKt.lambda$108776466.<anonymous> (HomeScreen.kt:1573)");
                    }
                    TextKt.m3048TextNvy7gAk("缓存已清除完毕", null, 0L, null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, composer25, 6, 0, 262142);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                } else {
                    composer25.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 27:
                Composer composer26 = (Composer) obj;
                int iIntValue26 = ((Integer) obj2).intValue();
                if (composer26.shouldExecute((iIntValue26 & 3) != 2, iIntValue26 & 1)) {
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(1429935058, iIntValue26, -1, "com.dh.myembyapp.ui.screens.home.ComposableSingletons$HomeScreenKt.lambda$1429935058.<anonymous> (HomeScreen.kt:1585)");
                    }
                    TextKt.m3048TextNvy7gAk("导入字体失败", null, 0L, null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, composer26, 6, 0, 262142);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                } else {
                    composer26.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 28:
                Composer composer27 = (Composer) obj;
                int iIntValue27 = ((Integer) obj2).intValue();
                if (composer27.shouldExecute((iIntValue27 & 3) != 2, iIntValue27 & 1)) {
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-1938277485, iIntValue27, -1, "com.dh.myembyapp.ui.screens.home.ComposableSingletons$HomeScreenKt.lambda$-1938277485.<anonymous> (HomeScreen.kt:1598)");
                    }
                    TextKt.m3048TextNvy7gAk("字体导入", null, 0L, null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, composer27, 6, 0, 262142);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                } else {
                    composer27.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            default:
                Composer composer28 = (Composer) obj;
                int iIntValue28 = ((Integer) obj2).intValue();
                if (composer28.shouldExecute((iIntValue28 & 3) != 2, iIntValue28 & 1)) {
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(2067792302, iIntValue28, -1, "com.dh.myembyapp.ui.screens.home.ComposableSingletons$HomeScreenKt.lambda$2067792302.<anonymous> (HomeScreen.kt:3536)");
                    }
                    IconKt.m2496Iconww6aTOc(PlayArrowKt.getPlayArrow(Icons.INSTANCE.getDefault()), "播放", PaddingKt.m999padding3ABfNKs(SizeKt.fillMaxSize$default(Modifier.INSTANCE, 0.0f, 1, null), Dp.m7813constructorimpl(8.0f)), Color.m5151copywmQWz5c$default(Color.INSTANCE.m5178getBlack0d7_KjU(), 0.7f, 0.0f, 0.0f, 0.0f, 14, null), composer28, 3504, 0);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                } else {
                    composer28.skipToGroupEnd();
                }
                return Unit.INSTANCE;
        }
    }
}
