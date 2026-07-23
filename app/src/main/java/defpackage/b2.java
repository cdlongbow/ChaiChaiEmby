package defpackage;

import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.material3.AndroidMenu_androidKt;
import androidx.compose.material3.ButtonKt;
import androidx.compose.material3.ExposedDropdownMenuBoxScope;
import androidx.compose.material3.MaterialTheme;
import androidx.compose.material3.TextKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.MutableState;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.unit.Dp;
import androidx.compose.ui.unit.IntRect;
import androidx.compose.ui.unit.TextUnitKt;
import com.dh.myembyapp.data.model.MediaSourcePriorityKt;
import com.dh.myembyapp.data.model.VideoVersionPrioritySettings;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class b2 implements Function2 {
    public final /* synthetic */ int a;
    public final /* synthetic */ MutableState b;

    public /* synthetic */ b2(int i, MutableState mutableState) {
        this.a = i;
        this.b = mutableState;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        int i = this.a;
        int i2 = 9;
        MutableState mutableState = this.b;
        switch (i) {
            case 0:
                Composer composer = (Composer) obj;
                int iIntValue = ((Integer) obj2).intValue();
                if (composer.shouldExecute((iIntValue & 3) != 2, iIntValue & 1)) {
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-1083058595, iIntValue, -1, "com.dh.myembyapp.ui.screens.addserver.AddServerScreen.<anonymous> (AddServerScreen.kt:859)");
                    }
                    TextKt.m3048TextNvy7gAk((String) mutableState.getValue(), null, 0L, null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, composer, 0, 0, 262142);
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
                        ComposerKt.traceEventStart(1042809329, iIntValue2, -1, "com.dh.myembyapp.ui.screens.addserver.AddServerScreen.<anonymous> (AddServerScreen.kt:842)");
                    }
                    Object objRememberedValue = composer2.rememberedValue();
                    if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                        objRememberedValue = new r1(4, mutableState);
                        composer2.updateRememberedValue(objRememberedValue);
                    }
                    hc2.b("取消", (Function0) objRememberedValue, SizeKt.m1069width3ABfNKs(Modifier.INSTANCE, Dp.m7813constructorimpl(120.0f)), false, 0L, 0.0f, 0.0f, composer2, 438, 120);
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
                        ComposerKt.traceEventStart(-1842066316, iIntValue3, -1, "com.dh.myembyapp.ui.screens.addserver.AddServerScreen.<anonymous> (AddServerScreen.kt:825)");
                    }
                    TextKt.m3048TextNvy7gAk(mr.r("确定要删除服务器 \"", (String) mutableState.getValue(), "\" 吗？此操作无法撤销。"), null, 0L, null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, composer3, 0, 0, 262142);
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
                        ComposerKt.traceEventStart(754230532, iIntValue4, -1, "com.dh.myembyapp.ui.screens.aggregate.AggregateHubScreen.<anonymous> (AggregateHubScreen.kt:1051)");
                    }
                    Object objRememberedValue2 = composer4.rememberedValue();
                    if (objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                        objRememberedValue2 = new r1(i2, mutableState);
                        composer4.updateRememberedValue(objRememberedValue2);
                    }
                    hc2.c("知道了", (Function0) objRememberedValue2, null, false, null, 0L, 0.0f, 0.0f, composer4, 54, 252);
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
                        ComposerKt.traceEventStart(1058623839, iIntValue5, -1, "com.dh.myembyapp.ui.screens.aggregate.AggregateHubScreen.<anonymous> (AggregateHubScreen.kt:1049)");
                    }
                    String str = (String) mutableState.getValue();
                    TextKt.m3048TextNvy7gAk(str != null ? str : "", null, 0L, null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, composer5, 0, 0, 262142);
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
                        ComposerKt.traceEventStart(-252351058, iIntValue6, -1, "com.dh.myembyapp.ui.screens.aggregate.AggregateHubScreen.<anonymous> (AggregateHubScreen.kt:1065)");
                    }
                    Object objRememberedValue3 = composer6.rememberedValue();
                    if (objRememberedValue3 == Composer.INSTANCE.getEmpty()) {
                        objRememberedValue3 = new r1(16, mutableState);
                        composer6.updateRememberedValue(objRememberedValue3);
                    }
                    hc2.c("知道了", (Function0) objRememberedValue3, null, false, null, 0L, 0.0f, 0.0f, composer6, 54, 252);
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
                        ComposerKt.traceEventStart(52042249, iIntValue7, -1, "com.dh.myembyapp.ui.screens.aggregate.AggregateHubScreen.<anonymous> (AggregateHubScreen.kt:1063)");
                    }
                    String str2 = (String) mutableState.getValue();
                    TextKt.m3048TextNvy7gAk(str2 != null ? str2 : "", null, 0L, null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, composer7, 0, 0, 262142);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                } else {
                    composer7.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 7:
                Pair pair = (Pair) obj;
                Pair pair2 = (Pair) obj2;
                int iCompareMediaItemsByBestSourcePriority = MediaSourcePriorityKt.compareMediaItemsByBestSourcePriority(((t8) pair.getSecond()).b, ((t8) pair2.getSecond()).b, (VideoVersionPrioritySettings) mutableState.getValue(), true);
                if (iCompareMediaItemsByBestSourcePriority == 0) {
                    iCompareMediaItemsByBestSourcePriority = Intrinsics.compare(((Number) pair.getFirst()).intValue(), ((Number) pair2.getFirst()).intValue());
                }
                return Integer.valueOf(iCompareMediaItemsByBestSourcePriority);
            case 8:
                return AndroidMenu_androidKt.DropdownMenu_IlH_yew$lambda$3$lambda$2(mutableState, (IntRect) obj, (IntRect) obj2);
            case 9:
                Composer composer8 = (Composer) obj;
                int iIntValue8 = ((Integer) obj2).intValue();
                if (composer8.shouldExecute((iIntValue8 & 3) != 2, iIntValue8 & 1)) {
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-721610512, iIntValue8, -1, "com.dh.myembyapp.ui.components.BackupRouteManagerDialog.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (BackupRouteManagerDialog.kt:468)");
                    }
                    pi.b(((Boolean) mutableState.getValue()).booleanValue() ? "获取中..." : "获取备选线路", null, composer8, 0, 2);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                } else {
                    composer8.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 10:
                return ExposedDropdownMenuBoxScope.ExposedDropdownMenu_vNxi1II$lambda$6$lambda$5(mutableState, (IntRect) obj, (IntRect) obj2);
            case 11:
                Composer composer9 = (Composer) obj;
                int iIntValue9 = ((Integer) obj2).intValue();
                if (composer9.shouldExecute((iIntValue9 & 3) != 2, iIntValue9 & 1)) {
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-1287416882, iIntValue9, -1, "com.dh.myembyapp.ui.screens.home.HomeScreen.<anonymous> (HomeScreen.kt:1588)");
                    }
                    Object objRememberedValue4 = composer9.rememberedValue();
                    if (objRememberedValue4 == Composer.INSTANCE.getEmpty()) {
                        objRememberedValue4 = new a50(18, mutableState);
                        composer9.updateRememberedValue(objRememberedValue4);
                    }
                    ButtonKt.TextButton((Function0) objRememberedValue4, null, false, null, null, null, null, null, null, et.l, composer9, 805306374, 510);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                } else {
                    composer9.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 12:
                Composer composer10 = (Composer) obj;
                int iIntValue10 = ((Integer) obj2).intValue();
                if (composer10.shouldExecute((iIntValue10 & 3) != 2, iIntValue10 & 1)) {
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(1035531219, iIntValue10, -1, "com.dh.myembyapp.ui.screens.home.HomeScreen.<anonymous> (HomeScreen.kt:1586)");
                    }
                    String str3 = (String) mutableState.getValue();
                    TextKt.m3048TextNvy7gAk(str3 != null ? str3 : "", null, 0L, null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, composer10, 0, 0, 262142);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                } else {
                    composer10.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 13:
                Composer composer11 = (Composer) obj;
                int iIntValue11 = ((Integer) obj2).intValue();
                if (composer11.shouldExecute((iIntValue11 & 3) != 2, iIntValue11 & 1)) {
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-360662129, iIntValue11, -1, "com.dh.myembyapp.ui.screens.home.HomeScreen.<anonymous> (HomeScreen.kt:1601)");
                    }
                    Object objRememberedValue5 = composer11.rememberedValue();
                    if (objRememberedValue5 == Composer.INSTANCE.getEmpty()) {
                        objRememberedValue5 = new a50(19, mutableState);
                        composer11.updateRememberedValue(objRememberedValue5);
                    }
                    ButtonKt.TextButton((Function0) objRememberedValue5, null, false, null, null, null, null, null, null, et.n, composer11, 805306374, 510);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                } else {
                    composer11.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 14:
                Composer composer12 = (Composer) obj;
                int iIntValue12 = ((Integer) obj2).intValue();
                if (composer12.shouldExecute((iIntValue12 & 3) != 2, iIntValue12 & 1)) {
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(1962285972, iIntValue12, -1, "com.dh.myembyapp.ui.screens.home.HomeScreen.<anonymous> (HomeScreen.kt:1599)");
                    }
                    String str4 = (String) mutableState.getValue();
                    TextKt.m3048TextNvy7gAk(str4 != null ? str4 : "", null, 0L, null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, composer12, 0, 0, 262142);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                } else {
                    composer12.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 15:
                Composer composer13 = (Composer) obj;
                int iIntValue13 = ((Integer) obj2).intValue();
                if (composer13.shouldExecute((iIntValue13 & 3) != 2, iIntValue13 & 1)) {
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-373711526, iIntValue13, -1, "com.dh.myembyapp.MainNavigation.<anonymous> (MainActivity.kt:497)");
                    }
                    Object objRememberedValue6 = composer13.rememberedValue();
                    if (objRememberedValue6 == Composer.INSTANCE.getEmpty()) {
                        objRememberedValue6 = new lu0(18, mutableState);
                        composer13.updateRememberedValue(objRememberedValue6);
                    }
                    ButtonKt.TextButton((Function0) objRememberedValue6, null, false, null, null, null, null, null, null, ht.a, composer13, 805306374, 510);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                } else {
                    composer13.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 16:
                Composer composer14 = (Composer) obj;
                int iIntValue14 = ((Integer) obj2).intValue();
                if (composer14.shouldExecute((iIntValue14 & 3) != 2, iIntValue14 & 1)) {
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-1494669259, iIntValue14, -1, "com.dh.myembyapp.MainNavigation.<anonymous> (MainActivity.kt:491)");
                    }
                    String str5 = (String) mutableState.getValue();
                    TextKt.m3048TextNvy7gAk(str5 != null ? str5 : "", null, 0L, null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, MaterialTheme.INSTANCE.getTypography(composer14, MaterialTheme.$stable).getBodyMedium(), composer14, 0, 0, 131070);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                } else {
                    composer14.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 17:
                Composer composer15 = (Composer) obj;
                int iIntValue15 = ((Integer) obj2).intValue();
                if (composer15.shouldExecute((iIntValue15 & 3) != 2, iIntValue15 & 1)) {
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(222315454, iIntValue15, -1, "com.dh.myembyapp.ui.screens.serverlist.ServerListScreen.<anonymous> (ServerListScreen.kt:860)");
                    }
                    Object objRememberedValue7 = composer15.rememberedValue();
                    if (objRememberedValue7 == Composer.INSTANCE.getEmpty()) {
                        objRememberedValue7 = new zq1(18, mutableState);
                        composer15.updateRememberedValue(objRememberedValue7);
                    }
                    hc2.c("知道了", (Function0) objRememberedValue7, null, false, null, 0L, 0.0f, 0.0f, composer15, 54, 252);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                } else {
                    composer15.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 18:
                Composer composer16 = (Composer) obj;
                int iIntValue16 = ((Integer) obj2).intValue();
                if (composer16.shouldExecute((iIntValue16 & 3) != 2, iIntValue16 & 1)) {
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-1006226173, iIntValue16, -1, "com.dh.myembyapp.ui.screens.serverlist.ServerListScreen.<anonymous> (ServerListScreen.kt:858)");
                    }
                    String str6 = (String) mutableState.getValue();
                    TextKt.m3048TextNvy7gAk(str6 != null ? str6 : "", null, 0L, null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, composer16, 0, 0, 262142);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                } else {
                    composer16.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 19:
                Composer composer17 = (Composer) obj;
                int iIntValue17 = ((Integer) obj2).intValue();
                if (composer17.shouldExecute((iIntValue17 & 3) != 2, iIntValue17 & 1)) {
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-817976385, iIntValue17, -1, "com.dh.myembyapp.ui.screens.serverlist.ServerListScreen.<anonymous> (ServerListScreen.kt:874)");
                    }
                    Object objRememberedValue8 = composer17.rememberedValue();
                    if (objRememberedValue8 == Composer.INSTANCE.getEmpty()) {
                        objRememberedValue8 = new zq1(9, mutableState);
                        composer17.updateRememberedValue(objRememberedValue8);
                    }
                    hc2.c("知道了", (Function0) objRememberedValue8, null, false, null, 0L, 0.0f, 0.0f, composer17, 54, 252);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                } else {
                    composer17.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 20:
                Composer composer18 = (Composer) obj;
                int iIntValue18 = ((Integer) obj2).intValue();
                if (composer18.shouldExecute((iIntValue18 & 3) != 2, iIntValue18 & 1)) {
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-2046518012, iIntValue18, -1, "com.dh.myembyapp.ui.screens.serverlist.ServerListScreen.<anonymous> (ServerListScreen.kt:872)");
                    }
                    String str7 = (String) mutableState.getValue();
                    TextKt.m3048TextNvy7gAk(str7 != null ? str7 : "", null, 0L, null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, composer18, 0, 0, 262142);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                } else {
                    composer18.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 21:
                Composer composer19 = (Composer) obj;
                int iIntValue19 = ((Integer) obj2).intValue();
                if (composer19.shouldExecute((iIntValue19 & 3) != 2, iIntValue19 & 1)) {
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-1858268224, iIntValue19, -1, "com.dh.myembyapp.ui.screens.serverlist.ServerListScreen.<anonymous> (ServerListScreen.kt:888)");
                    }
                    Object objRememberedValue9 = composer19.rememberedValue();
                    if (objRememberedValue9 == Composer.INSTANCE.getEmpty()) {
                        objRememberedValue9 = new zq1(15, mutableState);
                        composer19.updateRememberedValue(objRememberedValue9);
                    }
                    hc2.c("知道了", (Function0) objRememberedValue9, SizeKt.m1050height3ABfNKs(SizeKt.m1069width3ABfNKs(Modifier.INSTANCE, Dp.m7813constructorimpl(132.0f)), Dp.m7813constructorimpl(44.0f)), false, null, TextUnitKt.getSp(18), Dp.m7813constructorimpl(10.0f), Dp.m7813constructorimpl(6.0f), composer19, 14352822, 24);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                } else {
                    composer19.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 22:
                Composer composer20 = (Composer) obj;
                int iIntValue20 = ((Integer) obj2).intValue();
                if (composer20.shouldExecute((iIntValue20 & 3) != 2, iIntValue20 & 1)) {
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(1208157445, iIntValue20, -1, "com.dh.myembyapp.ui.screens.serverlist.ServerListScreen.<anonymous> (ServerListScreen.kt:886)");
                    }
                    String str8 = (String) mutableState.getValue();
                    TextKt.m3048TextNvy7gAk(str8 != null ? str8 : "", null, 0L, null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, composer20, 0, 0, 262142);
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
                        ComposerKt.traceEventStart(-2023368018, iIntValue21, -1, "com.dh.myembyapp.ui.components.SubtitleFontManagerDialog.<anonymous>.<anonymous> (SubtitleFontManagerDialog.kt:207)");
                    }
                    Object objRememberedValue10 = composer21.rememberedValue();
                    if (objRememberedValue10 == Composer.INSTANCE.getEmpty()) {
                        objRememberedValue10 = new zq1(28, mutableState);
                        composer21.updateRememberedValue(objRememberedValue10);
                    }
                    q32.b("取消", false, (Function0) objRememberedValue10, composer21, 390, 2);
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
