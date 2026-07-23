package defpackage;

import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnScopeInstance;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.material.icons.Icons;
import androidx.compose.material.icons.filled.RefreshKt;
import androidx.compose.material.icons.filled.SettingsKt;
import androidx.compose.material3.IconKt;
import androidx.compose.material3.MaterialTheme;
import androidx.compose.material3.ProgressIndicatorKt;
import androidx.compose.material3.TextKt;
import androidx.compose.runtime.ComposableSingletons$RecomposerKt;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.Updater;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.ColorKt;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.unit.Dp;
import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineContextKt;
import kotlinx.coroutines.debug.internal.ConcurrentWeakMap;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class dt implements Function2 {
    public final /* synthetic */ int a;

    public /* synthetic */ dt(int i) {
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
                        ComposerKt.traceEventStart(1779867664, iIntValue, -1, "com.dh.myembyapp.ui.screens.home.ComposableSingletons$HomeScreenKt.lambda$1779867664.<anonymous> (HomeScreen.kt:1227)");
                    }
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
                        ComposerKt.traceEventStart(447509206, iIntValue2, -1, "com.dh.myembyapp.ComposableSingletons$MainActivityKt.lambda$447509206.<anonymous> (MainActivity.kt:485)");
                    }
                    TextKt.m3048TextNvy7gAk("上次运行发生错误", null, 0L, null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, MaterialTheme.INSTANCE.getTypography(composer2, MaterialTheme.$stable).getTitleMedium(), composer2, 6, 0, 131070);
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
                        ComposerKt.traceEventStart(-1632524116, iIntValue3, -1, "com.dh.myembyapp.ui.components.ComposableSingletons$OnlineSubtitleConfigDialogKt.lambda$-1632524116.<anonymous> (OnlineSubtitleConfigDialog.kt:244)");
                    }
                    TextKt.m3048TextNvy7gAk("assrt API Key（可选）", null, 0L, null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, composer3, 6, 0, 262142);
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
                        ComposerKt.traceEventStart(-1829897494, iIntValue4, -1, "com.dh.myembyapp.ui.components.ComposableSingletons$OnlineSubtitleConfigDialogKt.lambda$-1829897494.<anonymous> (OnlineSubtitleConfigDialog.kt:247)");
                    }
                    Arrangement.HorizontalOrVertical horizontalOrVerticalM712spacedBy0680j_4 = Arrangement.INSTANCE.m712spacedBy0680j_4(Dp.m7813constructorimpl(2.0f));
                    Modifier.Companion companion = Modifier.INSTANCE;
                    MeasurePolicy measurePolicyColumnMeasurePolicy = ColumnKt.columnMeasurePolicy(horizontalOrVerticalM712spacedBy0680j_4, Alignment.INSTANCE.getStart(), composer4, 6);
                    long currentCompositeKeyHashCode = ComposablesKt.getCurrentCompositeKeyHashCode(composer4, 0);
                    int i = (int) (currentCompositeKeyHashCode ^ (currentCompositeKeyHashCode >>> 32));
                    CompositionLocalMap currentCompositionLocalMap = composer4.getCurrentCompositionLocalMap();
                    Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(composer4, companion);
                    ComposeUiNode.Companion companion2 = ComposeUiNode.INSTANCE;
                    Function0<ComposeUiNode> constructor = companion2.getConstructor();
                    if (composer4.getApplier() == null) {
                        ComposablesKt.invalidApplier();
                    }
                    composer4.startReusableNode();
                    if (composer4.getInserting()) {
                        composer4.createNode(constructor);
                    } else {
                        composer4.useNode();
                    }
                    Composer composerM4318constructorimpl = Updater.m4318constructorimpl(composer4);
                    mr.z(companion2, composerM4318constructorimpl, measurePolicyColumnMeasurePolicy, composerM4318constructorimpl, currentCompositionLocalMap);
                    Updater.m4326setimpl(composerM4318constructorimpl, modifierMaterializeModifier, (Function2<? super T, ? super Modifier, Unit>) id.h(companion2, composerM4318constructorimpl, Integer.valueOf(i), composerM4318constructorimpl));
                    ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.INSTANCE;
                    TextKt.m3048TextNvy7gAk("留空则使用内置 Key；若填写你自己的 Key，会优先使用你的配置", null, 0L, null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, composer4, 6, 0, 262142);
                    TextKt.m3048TextNvy7gAk("你也可以前往 https://assrt.net/usercp.php 申请 API Key", null, ColorKt.Color(4280391411L), null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, MaterialTheme.INSTANCE.getTypography(composer4, MaterialTheme.$stable).getBodySmall(), composer4, 390, 0, 131066);
                    composer4.endNode();
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
                        ComposerKt.traceEventStart(782646132, iIntValue5, -1, "com.dh.myembyapp.ui.screens.player.components.ComposableSingletons$PlaybackErrorDialogKt.lambda$782646132.<anonymous> (PlaybackErrorDialog.kt:301)");
                    }
                    IconKt.m2496Iconww6aTOc(RefreshKt.getRefresh(Icons.INSTANCE.getDefault()), (String) null, SizeKt.m1050height3ABfNKs(Modifier.INSTANCE, Dp.m7813constructorimpl(18.0f)), 0L, composer5, 432, 8);
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
                        ComposerKt.traceEventStart(-712735801, iIntValue6, -1, "com.dh.myembyapp.ui.screens.player.components.ComposableSingletons$PlayerControlsKt.lambda$-712735801.<anonymous> (PlayerControls.kt:2589)");
                    }
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
                        ComposerKt.traceEventStart(-532615221, iIntValue7, -1, "com.dh.myembyapp.ui.screens.player.components.ComposableSingletons$PlayerControlsKt.lambda$-532615221.<anonymous> (PlayerControls.kt:2463)");
                    }
                    TextKt.m3048TextNvy7gAk("选择版本", null, 0L, null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, MaterialTheme.INSTANCE.getTypography(composer7, MaterialTheme.$stable).getTitleLarge(), composer7, 6, 0, 131070);
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
                        ComposerKt.traceEventStart(-1967593554, iIntValue8, -1, "com.dh.myembyapp.ui.components.ComposableSingletons$ProxyConfigDialogKt.lambda$-1967593554.<anonymous> (ProxyConfigDialog.kt:239)");
                    }
                    TextKt.m3048TextNvy7gAk("代理服务器", null, 0L, null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, MaterialTheme.INSTANCE.getTypography(composer8, MaterialTheme.$stable).getBodySmall(), composer8, 6, 0, 131070);
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
                        ComposerKt.traceEventStart(-1132613033, iIntValue9, -1, "com.dh.myembyapp.ui.components.ComposableSingletons$ProxyConfigDialogKt.lambda$-1132613033.<anonymous> (ProxyConfigDialog.kt:255)");
                    }
                    TextKt.m3048TextNvy7gAk("端口", null, 0L, null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, MaterialTheme.INSTANCE.getTypography(composer9, MaterialTheme.$stable).getBodySmall(), composer9, 6, 0, 131070);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                } else {
                    composer9.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 9:
                Composer composer10 = (Composer) obj;
                int iIntValue10 = ((Integer) obj2).intValue();
                if (composer10.shouldExecute((iIntValue10 & 3) != 2, iIntValue10 & 1)) {
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(1652378391, iIntValue10, -1, "com.dh.myembyapp.ui.components.ComposableSingletons$ProxyConfigDialogKt.lambda$1652378391.<anonymous> (ProxyConfigDialog.kt:274)");
                    }
                    TextKt.m3048TextNvy7gAk("用户名（可选）", null, 0L, null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, MaterialTheme.INSTANCE.getTypography(composer10, MaterialTheme.$stable).getBodySmall(), composer10, 6, 0, 131070);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                } else {
                    composer10.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 10:
                Composer composer11 = (Composer) obj;
                int iIntValue11 = ((Integer) obj2).intValue();
                if (composer11.shouldExecute((iIntValue11 & 3) != 2, iIntValue11 & 1)) {
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(909774720, iIntValue11, -1, "com.dh.myembyapp.ui.components.ComposableSingletons$ProxyConfigDialogKt.lambda$909774720.<anonymous> (ProxyConfigDialog.kt:286)");
                    }
                    TextKt.m3048TextNvy7gAk("密码（可选）", null, 0L, null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, MaterialTheme.INSTANCE.getTypography(composer11, MaterialTheme.$stable).getBodySmall(), composer11, 6, 0, 131070);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                } else {
                    composer11.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 11:
                return ComposableSingletons$RecomposerKt.lambda__1091980426$lambda$0((Composer) obj, ((Integer) obj2).intValue());
            case 12:
                Composer composer12 = (Composer) obj;
                int iIntValue12 = ((Integer) obj2).intValue();
                if (composer12.shouldExecute((iIntValue12 & 3) != 2, iIntValue12 & 1)) {
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(1370182548, iIntValue12, -1, "com.dh.myembyapp.ui.components.ComposableSingletons$ServerIconDialogsKt.lambda$1370182548.<anonymous> (ServerIconDialogs.kt:284)");
                    }
                    TextKt.m3048TextNvy7gAk("图标库 URL", null, 0L, null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, composer12, 6, 0, 262142);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                } else {
                    composer12.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 13:
                Composer composer13 = (Composer) obj;
                int iIntValue13 = ((Integer) obj2).intValue();
                if (composer13.shouldExecute((iIntValue13 & 3) != 2, iIntValue13 & 1)) {
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-884570542, iIntValue13, -1, "com.dh.myembyapp.ui.components.ComposableSingletons$ServerIconDialogsKt.lambda$-884570542.<anonymous> (ServerIconDialogs.kt:287)");
                    }
                    TextKt.m3048TextNvy7gAk("保存后会立即拉取图标库 JSON 并展示图标列表", null, 0L, null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, composer13, 6, 0, 262142);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                } else {
                    composer13.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 14:
                Composer composer14 = (Composer) obj;
                int iIntValue14 = ((Integer) obj2).intValue();
                if (composer14.shouldExecute((iIntValue14 & 3) != 2, iIntValue14 & 1)) {
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(1063666554, iIntValue14, -1, "com.dh.myembyapp.ui.components.ComposableSingletons$ServerIconDialogsKt.lambda$1063666554.<anonymous> (ServerIconDialogs.kt:565)");
                    }
                    TextKt.m3048TextNvy7gAk("按名称过滤", null, 0L, null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, MaterialTheme.INSTANCE.getTypography(composer14, MaterialTheme.$stable).getLabelMedium(), composer14, 6, 0, 131070);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                } else {
                    composer14.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 15:
                Composer composer15 = (Composer) obj;
                int iIntValue15 = ((Integer) obj2).intValue();
                if (composer15.shouldExecute((iIntValue15 & 3) != 2, iIntValue15 & 1)) {
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(1378570682, iIntValue15, -1, "com.dh.myembyapp.ui.screens.serverlist.ComposableSingletons$ServerListScreenKt.lambda$1378570682.<anonymous> (ServerListScreen.kt:523)");
                    }
                    IconKt.m2496Iconww6aTOc(SettingsKt.getSettings(Icons.INSTANCE.getDefault()), "设置", SizeKt.m1064size3ABfNKs(Modifier.INSTANCE, Dp.m7813constructorimpl(32.0f)), MaterialTheme.INSTANCE.getColorScheme(composer15, MaterialTheme.$stable).getOnSurface(), composer15, 432, 0);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                } else {
                    composer15.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 16:
                Composer composer16 = (Composer) obj;
                int iIntValue16 = ((Integer) obj2).intValue();
                if (composer16.shouldExecute((iIntValue16 & 3) != 2, iIntValue16 & 1)) {
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-1992068164, iIntValue16, -1, "com.dh.myembyapp.ui.screens.serverlist.ComposableSingletons$ServerListScreenKt.lambda$-1992068164.<anonymous> (ServerListScreen.kt:833)");
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                } else {
                    composer16.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 17:
                Composer composer17 = (Composer) obj;
                int iIntValue17 = ((Integer) obj2).intValue();
                if (composer17.shouldExecute((iIntValue17 & 3) != 2, iIntValue17 & 1)) {
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-397921088, iIntValue17, -1, "com.dh.myembyapp.ui.screens.serverlist.ComposableSingletons$ServerListScreenKt.lambda$-397921088.<anonymous> (ServerListScreen.kt:824)");
                    }
                    TextKt.m3048TextNvy7gAk("正在清除缓存", null, 0L, null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, composer17, 6, 0, 262142);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                } else {
                    composer17.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 18:
                Composer composer18 = (Composer) obj;
                int iIntValue18 = ((Integer) obj2).intValue();
                if (composer18.shouldExecute((iIntValue18 & 3) != 2, iIntValue18 & 1)) {
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(1074357505, iIntValue18, -1, "com.dh.myembyapp.ui.screens.serverlist.ComposableSingletons$ServerListScreenKt.lambda$1074357505.<anonymous> (ServerListScreen.kt:826)");
                    }
                    Modifier modifierFillMaxWidth$default = SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null);
                    MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.INSTANCE.getCenter(), false);
                    long currentCompositeKeyHashCode2 = ComposablesKt.getCurrentCompositeKeyHashCode(composer18, 0);
                    int i2 = (int) (currentCompositeKeyHashCode2 ^ (currentCompositeKeyHashCode2 >>> 32));
                    CompositionLocalMap currentCompositionLocalMap2 = composer18.getCurrentCompositionLocalMap();
                    Modifier modifierMaterializeModifier2 = ComposedModifierKt.materializeModifier(composer18, modifierFillMaxWidth$default);
                    ComposeUiNode.Companion companion3 = ComposeUiNode.INSTANCE;
                    Function0<ComposeUiNode> constructor2 = companion3.getConstructor();
                    if (composer18.getApplier() == null) {
                        ComposablesKt.invalidApplier();
                    }
                    composer18.startReusableNode();
                    if (composer18.getInserting()) {
                        composer18.createNode(constructor2);
                    } else {
                        composer18.useNode();
                    }
                    Composer composerM4318constructorimpl2 = Updater.m4318constructorimpl(composer18);
                    mr.z(companion3, composerM4318constructorimpl2, measurePolicyMaybeCachedBoxMeasurePolicy, composerM4318constructorimpl2, currentCompositionLocalMap2);
                    Updater.m4326setimpl(composerM4318constructorimpl2, modifierMaterializeModifier2, (Function2<? super T, ? super Modifier, Unit>) id.h(companion3, composerM4318constructorimpl2, Integer.valueOf(i2), composerM4318constructorimpl2));
                    BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
                    ProgressIndicatorKt.m2703CircularProgressIndicator4lLiAd8(null, 0L, 0.0f, 0L, 0, 0.0f, composer18, 0, 63);
                    composer18.endNode();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                } else {
                    composer18.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 19:
                Composer composer19 = (Composer) obj;
                int iIntValue19 = ((Integer) obj2).intValue();
                if (composer19.shouldExecute((iIntValue19 & 3) != 2, iIntValue19 & 1)) {
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-1438212927, iIntValue19, -1, "com.dh.myembyapp.ui.screens.serverlist.ComposableSingletons$ServerListScreenKt.lambda$-1438212927.<anonymous> (ServerListScreen.kt:841)");
                    }
                    TextKt.m3048TextNvy7gAk("清除完成", null, 0L, null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, composer19, 6, 0, 262142);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                } else {
                    composer19.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 20:
                Composer composer20 = (Composer) obj;
                int iIntValue20 = ((Integer) obj2).intValue();
                if (composer20.shouldExecute((iIntValue20 & 3) != 2, iIntValue20 & 1)) {
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(34065666, iIntValue20, -1, "com.dh.myembyapp.ui.screens.serverlist.ComposableSingletons$ServerListScreenKt.lambda$34065666.<anonymous> (ServerListScreen.kt:842)");
                    }
                    TextKt.m3048TextNvy7gAk("缓存已清除完毕", null, 0L, null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, composer20, 6, 0, 262142);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                } else {
                    composer20.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 21:
                Composer composer21 = (Composer) obj;
                int iIntValue21 = ((Integer) obj2).intValue();
                if (composer21.shouldExecute((iIntValue21 & 3) != 2, iIntValue21 & 1)) {
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(1816462530, iIntValue21, -1, "com.dh.myembyapp.ui.screens.serverlist.ComposableSingletons$ServerListScreenKt.lambda$1816462530.<anonymous> (ServerListScreen.kt:857)");
                    }
                    TextKt.m3048TextNvy7gAk("导入字体失败", null, 0L, null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, composer21, 6, 0, 262142);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                } else {
                    composer21.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 22:
                Composer composer22 = (Composer) obj;
                int iIntValue22 = ((Integer) obj2).intValue();
                if (composer22.shouldExecute((iIntValue22 & 3) != 2, iIntValue22 & 1)) {
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(776170691, iIntValue22, -1, "com.dh.myembyapp.ui.screens.serverlist.ComposableSingletons$ServerListScreenKt.lambda$776170691.<anonymous> (ServerListScreen.kt:871)");
                    }
                    TextKt.m3048TextNvy7gAk("字体导入", null, 0L, null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, composer22, 6, 0, 262142);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                } else {
                    composer22.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 23:
                Composer composer23 = (Composer) obj;
                int iIntValue23 = ((Integer) obj2).intValue();
                if (composer23.shouldExecute((iIntValue23 & 3) != 2, iIntValue23 & 1)) {
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-264121148, iIntValue23, -1, "com.dh.myembyapp.ui.screens.serverlist.ComposableSingletons$ServerListScreenKt.lambda$-264121148.<anonymous> (ServerListScreen.kt:885)");
                    }
                    TextKt.m3048TextNvy7gAk("服务器图标", null, 0L, null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, composer23, 6, 0, 262142);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                } else {
                    composer23.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 24:
                Composer composer24 = (Composer) obj;
                int iIntValue24 = ((Integer) obj2).intValue();
                if (composer24.shouldExecute((iIntValue24 & 3) != 2, iIntValue24 & 1)) {
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-487971348, iIntValue24, -1, "com.dh.myembyapp.ui.components.ComposableSingletons$SubtitleFontManagerDialogKt.lambda$-487971348.<anonymous> (SubtitleFontManagerDialog.kt:194)");
                    }
                    TextKt.m3048TextNvy7gAk("确认删除", null, 0L, null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, composer24, 6, 0, 262142);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                } else {
                    composer24.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 25:
                return ConcurrentWeakMap._get_keys_$lambda$0(obj, obj2);
            case 26:
                return ConcurrentWeakMap._get_entries_$lambda$1(obj, obj2);
            case 27:
                return CoroutineContext.DefaultImpls.plus$lambda$0((CoroutineContext) obj, (CoroutineContext.Element) obj2);
            case 28:
                return Boolean.valueOf(CoroutineContextKt.hasCopyableElements$lambda$0(((Boolean) obj).booleanValue(), (CoroutineContext.Element) obj2));
            default:
                return CoroutineContextKt.foldCopies$lambda$2((CoroutineContext) obj, (CoroutineContext.Element) obj2);
        }
    }
}
