package defpackage;

import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.material.icons.Icons;
import androidx.compose.material.icons.filled.DeleteOutlineKt;
import androidx.compose.material.icons.filled.EditKt;
import androidx.compose.material.icons.filled.PlayArrowKt;
import androidx.compose.material3.BottomAppBarState;
import androidx.compose.material3.IconKt;
import androidx.compose.material3.ProgressIndicatorKt;
import androidx.compose.material3.TextKt;
import androidx.compose.material3.carousel.CarouselPagerState;
import androidx.compose.material3.carousel.CarouselState;
import androidx.compose.material3.internal.AnchoredDraggableState;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.saveable.SaverScope;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.unit.Dp;
import com.dh.myembyapp.data.model.MediaItem;
import kotlin.Unit;
import kotlin.coroutines.CombinedContext;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class f9 implements Function2 {
    public final /* synthetic */ int a;

    public /* synthetic */ f9(int i) {
        this.a = i;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.a) {
            case 0:
                return AnchoredDraggableState.Companion.Saver$lambda$0((SaverScope) obj, (AnchoredDraggableState) obj2);
            case 1:
                return androidx.compose.foundation.gestures.AnchoredDraggableState.Companion.Saver$lambda$6((SaverScope) obj, (androidx.compose.foundation.gestures.AnchoredDraggableState) obj2);
            case 2:
                return androidx.compose.foundation.gestures.AnchoredDraggableState.Companion.Saver$lambda$3((SaverScope) obj, (androidx.compose.foundation.gestures.AnchoredDraggableState) obj2);
            case 3:
                return androidx.compose.foundation.gestures.AnchoredDraggableState.Companion.Saver$lambda$0((SaverScope) obj, (androidx.compose.foundation.gestures.AnchoredDraggableState) obj2);
            case 4:
                return BottomAppBarState.Companion.Saver$lambda$0((SaverScope) obj, (BottomAppBarState) obj2);
            case 5:
                return CarouselPagerState.Saver$lambda$0((SaverScope) obj, (CarouselPagerState) obj2);
            case 6:
                return CarouselState.Saver$lambda$1((SaverScope) obj, (CarouselState) obj2);
            case 7:
                ((Integer) obj).intValue();
                MediaItem mediaItem = (MediaItem) obj2;
                mediaItem.getClass();
                return mediaItem.getId();
            case 8:
                return CombinedContext.toString$lambda$0((String) obj, (CoroutineContext.Element) obj2);
            case 9:
                Composer composer = (Composer) obj;
                int iIntValue = ((Integer) obj2).intValue();
                if (composer.shouldExecute((iIntValue & 3) != 2, iIntValue & 1)) {
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-880441101, iIntValue, -1, "com.dh.myembyapp.ui.screens.addserver.ComposableSingletons$AddServerScreenKt.lambda$-880441101.<anonymous> (AddServerScreen.kt:824)");
                    }
                    TextKt.m3048TextNvy7gAk("确认删除", null, 0L, null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, composer, 6, 0, 262142);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                } else {
                    composer.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 10:
                Composer composer2 = (Composer) obj;
                int iIntValue2 = ((Integer) obj2).intValue();
                if (composer2.shouldExecute((iIntValue2 & 3) != 2, iIntValue2 & 1)) {
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-379195620, iIntValue2, -1, "com.dh.myembyapp.ui.screens.addserver.ComposableSingletons$AddServerScreenKt.lambda$-379195620.<anonymous> (AddServerScreen.kt:858)");
                    }
                    TextKt.m3048TextNvy7gAk("连接失败", null, 0L, null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, composer2, 6, 0, 262142);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                } else {
                    composer2.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 11:
                Composer composer3 = (Composer) obj;
                int iIntValue3 = ((Integer) obj2).intValue();
                if (composer3.shouldExecute((iIntValue3 & 3) != 2, iIntValue3 & 1)) {
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(1626641094, iIntValue3, -1, "com.dh.myembyapp.ui.screens.aggregate.ComposableSingletons$AggregateHubScreenKt.lambda$1626641094.<anonymous> (AggregateHubScreen.kt:1025)");
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                } else {
                    composer3.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 12:
                Composer composer4 = (Composer) obj;
                int iIntValue4 = ((Integer) obj2).intValue();
                if (composer4.shouldExecute((iIntValue4 & 3) != 2, iIntValue4 & 1)) {
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-706824638, iIntValue4, -1, "com.dh.myembyapp.ui.screens.aggregate.ComposableSingletons$AggregateHubScreenKt.lambda$-706824638.<anonymous> (AggregateHubScreen.kt:1016)");
                    }
                    TextKt.m3048TextNvy7gAk("正在清除缓存", null, 0L, null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, composer4, 6, 0, 262142);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                } else {
                    composer4.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 13:
                Composer composer5 = (Composer) obj;
                int iIntValue5 = ((Integer) obj2).intValue();
                if (composer5.shouldExecute((iIntValue5 & 3) != 2, iIntValue5 & 1)) {
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(1931034401, iIntValue5, -1, "com.dh.myembyapp.ui.screens.aggregate.ComposableSingletons$AggregateHubScreenKt.lambda$1931034401.<anonymous> (AggregateHubScreen.kt:1018)");
                    }
                    Modifier modifierFillMaxWidth$default = SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null);
                    MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.INSTANCE.getCenter(), false);
                    long currentCompositeKeyHashCode = ComposablesKt.getCurrentCompositeKeyHashCode(composer5, 0);
                    int i = (int) (currentCompositeKeyHashCode ^ (currentCompositeKeyHashCode >>> 32));
                    CompositionLocalMap currentCompositionLocalMap = composer5.getCurrentCompositionLocalMap();
                    Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(composer5, modifierFillMaxWidth$default);
                    ComposeUiNode.Companion companion = ComposeUiNode.INSTANCE;
                    Function0<ComposeUiNode> constructor = companion.getConstructor();
                    if (composer5.getApplier() == null) {
                        ComposablesKt.invalidApplier();
                    }
                    composer5.startReusableNode();
                    if (composer5.getInserting()) {
                        composer5.createNode(constructor);
                    } else {
                        composer5.useNode();
                    }
                    Composer composerM4318constructorimpl = Updater.m4318constructorimpl(composer5);
                    mr.z(companion, composerM4318constructorimpl, measurePolicyMaybeCachedBoxMeasurePolicy, composerM4318constructorimpl, currentCompositionLocalMap);
                    Updater.m4326setimpl(composerM4318constructorimpl, modifierMaterializeModifier, (Function2<? super T, ? super Modifier, Unit>) id.h(companion, composerM4318constructorimpl, Integer.valueOf(i), composerM4318constructorimpl));
                    BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
                    ProgressIndicatorKt.m2703CircularProgressIndicator4lLiAd8(null, 0L, 0.0f, 0L, 0, 0.0f, composer5, 0, 63);
                    composer5.endNode();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                } else {
                    composer5.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 14:
                Composer composer6 = (Composer) obj;
                int iIntValue6 = ((Integer) obj2).intValue();
                if (composer6.shouldExecute((iIntValue6 & 3) != 2, iIntValue6 & 1)) {
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(1004453729, iIntValue6, -1, "com.dh.myembyapp.ui.screens.aggregate.ComposableSingletons$AggregateHubScreenKt.lambda$1004453729.<anonymous> (AggregateHubScreen.kt:1032)");
                    }
                    TextKt.m3048TextNvy7gAk("清除完成", null, 0L, null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, composer6, 6, 0, 262142);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                } else {
                    composer6.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 15:
                Composer composer7 = (Composer) obj;
                int iIntValue7 = ((Integer) obj2).intValue();
                if (composer7.shouldExecute((iIntValue7 & 3) != 2, iIntValue7 & 1)) {
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-652654528, iIntValue7, -1, "com.dh.myembyapp.ui.screens.aggregate.ComposableSingletons$AggregateHubScreenKt.lambda$-652654528.<anonymous> (AggregateHubScreen.kt:1033)");
                    }
                    TextKt.m3048TextNvy7gAk("缓存已清除完毕", null, 0L, null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, composer7, 6, 0, 262142);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                } else {
                    composer7.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 16:
                Composer composer8 = (Composer) obj;
                int iIntValue8 = ((Integer) obj2).intValue();
                if (composer8.shouldExecute((iIntValue8 & 3) != 2, iIntValue8 & 1)) {
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-1579235200, iIntValue8, -1, "com.dh.myembyapp.ui.screens.aggregate.ComposableSingletons$AggregateHubScreenKt.lambda$-1579235200.<anonymous> (AggregateHubScreen.kt:1048)");
                    }
                    TextKt.m3048TextNvy7gAk("导入字体失败", null, 0L, null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, composer8, 6, 0, 262142);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                } else {
                    composer8.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 17:
                Composer composer9 = (Composer) obj;
                int iIntValue9 = ((Integer) obj2).intValue();
                if (composer9.shouldExecute((iIntValue9 & 3) != 2, iIntValue9 & 1)) {
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(1709150506, iIntValue9, -1, "com.dh.myembyapp.ui.screens.aggregate.ComposableSingletons$AggregateHubScreenKt.lambda$1709150506.<anonymous> (AggregateHubScreen.kt:1062)");
                    }
                    TextKt.m3048TextNvy7gAk("字体导入", null, 0L, null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, composer9, 6, 0, 262142);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                } else {
                    composer9.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 18:
                Composer composer10 = (Composer) obj;
                int iIntValue10 = ((Integer) obj2).intValue();
                if (composer10.shouldExecute((iIntValue10 & 3) != 2, iIntValue10 & 1)) {
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-2040497669, iIntValue10, -1, "com.dh.myembyapp.ui.screens.aggregate.ComposableSingletons$AggregateHubScreenKt.lambda$-2040497669.<anonymous> (AggregateHubScreen.kt:1942)");
                    }
                    IconKt.m2496Iconww6aTOc(PlayArrowKt.getPlayArrow(Icons.INSTANCE.getDefault()), "播放", PaddingKt.m999padding3ABfNKs(SizeKt.fillMaxSize$default(Modifier.INSTANCE, 0.0f, 1, null), Dp.m7813constructorimpl(8.0f)), Color.m5151copywmQWz5c$default(Color.INSTANCE.m5178getBlack0d7_KjU(), 0.7f, 0.0f, 0.0f, 0.0f, 14, null), composer10, 3504, 0);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                } else {
                    composer10.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 19:
                Composer composer11 = (Composer) obj;
                int iIntValue11 = ((Integer) obj2).intValue();
                if (composer11.shouldExecute((iIntValue11 & 3) != 2, iIntValue11 & 1)) {
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-61395937, iIntValue11, -1, "com.dh.myembyapp.ui.components.ComposableSingletons$AppUpdateSupportKt.lambda$-61395937.<anonymous> (AppUpdateSupport.kt:452)");
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                } else {
                    composer11.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 20:
                Composer composer12 = (Composer) obj;
                int iIntValue12 = ((Integer) obj2).intValue();
                if (composer12.shouldExecute((iIntValue12 & 3) != 2, iIntValue12 & 1)) {
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-1957499869, iIntValue12, -1, "com.dh.myembyapp.ui.components.ComposableSingletons$AppUpdateSupportKt.lambda$-1957499869.<anonymous> (AppUpdateSupport.kt:443)");
                    }
                    TextKt.m3048TextNvy7gAk("检查更新中", null, 0L, null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, composer12, 6, 0, 262142);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                } else {
                    composer12.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 21:
                Composer composer13 = (Composer) obj;
                int iIntValue13 = ((Integer) obj2).intValue();
                if (composer13.shouldExecute((iIntValue13 & 3) != 2, iIntValue13 & 1)) {
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(1863441444, iIntValue13, -1, "com.dh.myembyapp.ui.components.ComposableSingletons$AppUpdateSupportKt.lambda$1863441444.<anonymous> (AppUpdateSupport.kt:445)");
                    }
                    Modifier modifierFillMaxWidth$default2 = SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null);
                    MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy2 = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.INSTANCE.getCenter(), false);
                    long currentCompositeKeyHashCode2 = ComposablesKt.getCurrentCompositeKeyHashCode(composer13, 0);
                    int i2 = (int) (currentCompositeKeyHashCode2 ^ (currentCompositeKeyHashCode2 >>> 32));
                    CompositionLocalMap currentCompositionLocalMap2 = composer13.getCurrentCompositionLocalMap();
                    Modifier modifierMaterializeModifier2 = ComposedModifierKt.materializeModifier(composer13, modifierFillMaxWidth$default2);
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
                    mr.z(companion2, composerM4318constructorimpl2, measurePolicyMaybeCachedBoxMeasurePolicy2, composerM4318constructorimpl2, currentCompositionLocalMap2);
                    Updater.m4326setimpl(composerM4318constructorimpl2, modifierMaterializeModifier2, (Function2<? super T, ? super Modifier, Unit>) id.h(companion2, composerM4318constructorimpl2, Integer.valueOf(i2), composerM4318constructorimpl2));
                    BoxScopeInstance boxScopeInstance2 = BoxScopeInstance.INSTANCE;
                    ProgressIndicatorKt.m2703CircularProgressIndicator4lLiAd8(null, 0L, 0.0f, 0L, 0, 0.0f, composer13, 0, 63);
                    composer13.endNode();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                } else {
                    composer13.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 22:
                Composer composer14 = (Composer) obj;
                int iIntValue14 = ((Integer) obj2).intValue();
                if (composer14.shouldExecute((iIntValue14 & 3) != 2, iIntValue14 & 1)) {
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(567521996, iIntValue14, -1, "com.dh.myembyapp.ui.components.ComposableSingletons$AppUpdateSupportKt.lambda$567521996.<anonymous> (AppUpdateSupport.kt:459)");
                    }
                    TextKt.m3048TextNvy7gAk("下载更新中", null, 0L, null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, composer14, 6, 0, 262142);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                } else {
                    composer14.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 23:
                Composer composer15 = (Composer) obj;
                int iIntValue15 = ((Integer) obj2).intValue();
                if (composer15.shouldExecute((iIntValue15 & 3) != 2, iIntValue15 & 1)) {
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(986867047, iIntValue15, -1, "com.dh.myembyapp.ui.components.ComposableSingletons$BackupRouteManagerDialogKt.lambda$986867047.<anonymous> (BackupRouteManagerDialog.kt:478)");
                    }
                    pi.b("清空备选线路", DeleteOutlineKt.getDeleteOutline(Icons.INSTANCE.getDefault()), composer15, 6, 0);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                } else {
                    composer15.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 24:
                Composer composer16 = (Composer) obj;
                int iIntValue16 = ((Integer) obj2).intValue();
                if (composer16.shouldExecute((iIntValue16 & 3) != 2, iIntValue16 & 1)) {
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-1145906189, iIntValue16, -1, "com.dh.myembyapp.ui.components.ComposableSingletons$BackupRouteManagerDialogKt.lambda$-1145906189.<anonymous> (BackupRouteManagerDialog.kt:1005)");
                    }
                    pi.b("编辑", EditKt.getEdit(Icons.INSTANCE.getDefault()), composer16, 6, 0);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                } else {
                    composer16.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 25:
                Composer composer17 = (Composer) obj;
                int iIntValue17 = ((Integer) obj2).intValue();
                if (composer17.shouldExecute((iIntValue17 & 3) != 2, iIntValue17 & 1)) {
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(458718954, iIntValue17, -1, "com.dh.myembyapp.ui.components.ComposableSingletons$BackupRouteManagerDialogKt.lambda$458718954.<anonymous> (BackupRouteManagerDialog.kt:1012)");
                    }
                    pi.b("删除", DeleteOutlineKt.getDeleteOutline(Icons.INSTANCE.getDefault()), composer17, 6, 0);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                } else {
                    composer17.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 26:
                Composer composer18 = (Composer) obj;
                int iIntValue18 = ((Integer) obj2).intValue();
                if (composer18.shouldExecute((iIntValue18 & 3) != 2, iIntValue18 & 1)) {
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(1723069391, iIntValue18, -1, "com.dh.myembyapp.ui.components.ComposableSingletons$BackupRouteManagerDialogKt.lambda$1723069391.<anonymous> (BackupRouteManagerDialog.kt:1020)");
                    }
                    pi.b("取消", null, composer18, 6, 2);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                } else {
                    composer18.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 27:
                Composer composer19 = (Composer) obj;
                int iIntValue19 = ((Integer) obj2).intValue();
                if (composer19.shouldExecute((iIntValue19 & 3) != 2, iIntValue19 & 1)) {
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-68270054, iIntValue19, -1, "com.dh.myembyapp.ui.components.ComposableSingletons$BackupRouteManagerDialogKt.lambda$-68270054.<anonymous> (BackupRouteManagerDialog.kt:1099)");
                    }
                    pi.b("取消", null, composer19, 6, 2);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                } else {
                    composer19.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 28:
                Composer composer20 = (Composer) obj;
                int iIntValue20 = ((Integer) obj2).intValue();
                if (composer20.shouldExecute((iIntValue20 & 3) != 2, iIntValue20 & 1)) {
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(77710993, iIntValue20, -1, "com.dh.myembyapp.ui.components.ComposableSingletons$BackupRouteManagerDialogKt.lambda$77710993.<anonymous> (BackupRouteManagerDialog.kt:1106)");
                    }
                    pi.b("删除", null, composer20, 6, 2);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                } else {
                    composer20.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            default:
                Composer composer21 = (Composer) obj;
                int iIntValue21 = ((Integer) obj2).intValue();
                if (composer21.shouldExecute((iIntValue21 & 3) != 2, iIntValue21 & 1)) {
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(1537369756, iIntValue21, -1, "com.dh.myembyapp.ui.components.ComposableSingletons$BackupRouteManagerDialogKt.lambda$1537369756.<anonymous> (BackupRouteManagerDialog.kt:1182)");
                    }
                    pi.b("手动选择", null, composer21, 6, 2);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                } else {
                    composer21.skipToGroupEnd();
                }
                return Unit.INSTANCE;
        }
    }
}
