package defpackage;

import androidx.compose.foundation.BackgroundKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnScopeInstance;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.material3.CardDefaults;
import androidx.compose.material3.CardKt;
import androidx.compose.material3.MaterialTheme;
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
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.unit.Dp;
import androidx.compose.ui.unit.TextUnitKt;
import java.util.List;
import kotlin.Function;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class ln0 implements Function2 {
    public final /* synthetic */ int a = 1;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object g;
    public final /* synthetic */ Function h;
    public final /* synthetic */ Object i;

    public /* synthetic */ ln0(u61 u61Var, ve2 ve2Var, FocusRequester focusRequester, String str, Function0 function0, Function0 function1, boolean z) {
        this.c = u61Var;
        this.b = z;
        this.e = ve2Var;
        this.d = str;
        this.i = focusRequester;
        this.g = function0;
        this.h = function1;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        int i = this.a;
        Function function = this.h;
        Object obj3 = this.g;
        Object obj4 = this.i;
        Object obj5 = this.d;
        Object obj6 = this.e;
        Object obj7 = this.c;
        switch (i) {
            case 0:
                u61 u61Var = (u61) obj7;
                String str = (String) obj5;
                List list = (List) obj3;
                String str2 = (String) obj6;
                Function1 function1 = (Function1) function;
                FocusRequester focusRequester = (FocusRequester) obj4;
                Composer composer = (Composer) obj;
                int iIntValue = ((Integer) obj2).intValue();
                if (composer.shouldExecute((iIntValue & 3) != 2, iIntValue & 1)) {
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-954526848, iIntValue, -1, "com.dh.myembyapp.ui.components.HomeRouteSwitchDialog.<anonymous> (HomeMediaMenuDialog.kt:270)");
                    }
                    Modifier.Companion companion = Modifier.INSTANCE;
                    Modifier modifierM275backgroundbw27NRU$default = BackgroundKt.m275backgroundbw27NRU$default(SizeKt.fillMaxSize$default(companion, 0.0f, 1, null), u61Var.a, null, 2, null);
                    MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.INSTANCE.getCenter(), false);
                    long currentCompositeKeyHashCode = ComposablesKt.getCurrentCompositeKeyHashCode(composer, 0);
                    int i2 = (int) (currentCompositeKeyHashCode ^ (currentCompositeKeyHashCode >>> 32));
                    CompositionLocalMap currentCompositionLocalMap = composer.getCurrentCompositionLocalMap();
                    Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(composer, modifierM275backgroundbw27NRU$default);
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
                    mr.z(companion2, composerM4318constructorimpl, measurePolicyMaybeCachedBoxMeasurePolicy, composerM4318constructorimpl, currentCompositionLocalMap);
                    Updater.m4326setimpl(composerM4318constructorimpl, modifierMaterializeModifier, (Function2<? super T, ? super Modifier, Unit>) id.h(companion2, composerM4318constructorimpl, Integer.valueOf(i2), composerM4318constructorimpl));
                    BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
                    CardKt.Card(SizeKt.m1052heightInVpY3zN4$default(SizeKt.m1069width3ABfNKs(companion, Dp.m7813constructorimpl(460.0f)), 0.0f, Dp.m7813constructorimpl(560.0f), 1, null), null, CardDefaults.INSTANCE.m2119cardColorsro_MJ88(MaterialTheme.INSTANCE.getColorScheme(composer, MaterialTheme.$stable).getSurface(), 0L, 0L, 0L, composer, CardDefaults.$stable << 12, 14), null, null, ComposableLambdaKt.rememberComposableLambda(1229439096, true, new ev(str, list, this.b, str2, function1, focusRequester), composer, 54), composer, 196614, 26);
                    composer.endNode();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                } else {
                    composer.skipToGroupEnd();
                }
                break;
            case 1:
                Function0 function0 = (Function0) obj7;
                Function0 function2 = (Function0) obj5;
                Function0 function3 = (Function0) obj6;
                Function0 function4 = (Function0) obj3;
                Function0 function5 = (Function0) function;
                Function0 function6 = (Function0) obj4;
                Composer composer2 = (Composer) obj;
                int iIntValue2 = ((Integer) obj2).intValue();
                if (composer2.shouldExecute((iIntValue2 & 3) != 2, iIntValue2 & 1)) {
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-167495422, iIntValue2, -1, "com.dh.myembyapp.ui.screens.serverlist.ServerMenuDialog.<anonymous>.<anonymous> (ServerListScreen.kt:1402)");
                    }
                    Modifier.Companion companion3 = Modifier.INSTANCE;
                    Modifier modifierM999padding3ABfNKs = PaddingKt.m999padding3ABfNKs(companion3, Dp.m7813constructorimpl(16.0f));
                    MeasurePolicy measurePolicyColumnMeasurePolicy = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.m712spacedBy0680j_4(Dp.m7813constructorimpl(12.0f)), Alignment.INSTANCE.getStart(), composer2, 6);
                    long currentCompositeKeyHashCode2 = ComposablesKt.getCurrentCompositeKeyHashCode(composer2, 0);
                    int i3 = (int) (currentCompositeKeyHashCode2 ^ (currentCompositeKeyHashCode2 >>> 32));
                    CompositionLocalMap currentCompositionLocalMap2 = composer2.getCurrentCompositionLocalMap();
                    Modifier modifierMaterializeModifier2 = ComposedModifierKt.materializeModifier(composer2, modifierM999padding3ABfNKs);
                    ComposeUiNode.Companion companion4 = ComposeUiNode.INSTANCE;
                    Function0<ComposeUiNode> constructor2 = companion4.getConstructor();
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
                    mr.z(companion4, composerM4318constructorimpl2, measurePolicyColumnMeasurePolicy, composerM4318constructorimpl2, currentCompositionLocalMap2);
                    Updater.m4326setimpl(composerM4318constructorimpl2, modifierMaterializeModifier2, (Function2<? super T, ? super Modifier, Unit>) id.h(companion4, composerM4318constructorimpl2, Integer.valueOf(i3), composerM4318constructorimpl2));
                    ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.INSTANCE;
                    MaterialTheme materialTheme = MaterialTheme.INSTANCE;
                    int i4 = MaterialTheme.$stable;
                    TextKt.m3048TextNvy7gAk("服务器操作", PaddingKt.m1003paddingqDBjuR0$default(companion3, 0.0f, 0.0f, 0.0f, Dp.m7813constructorimpl(8.0f), 7, null), materialTheme.getColorScheme(composer2, i4).getOnSurface(), null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, materialTheme.getTypography(composer2, i4).getTitleLarge(), composer2, 54, 0, 131064);
                    boolean zChanged = composer2.changed(function0) | composer2.changed(function2);
                    Object objRememberedValue = composer2.rememberedValue();
                    if (zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                        objRememberedValue = new hh0(20, function0, function2);
                        composer2.updateRememberedValue(objRememberedValue);
                    }
                    Modifier modifierM1050height3ABfNKs = SizeKt.m1050height3ABfNKs(SizeKt.fillMaxWidth$default(companion3, 0.0f, 1, null), Dp.m7813constructorimpl(56.0f));
                    jc2 jc2Var = jc2.a;
                    hc2.a("服务器配置", (Function0) objRememberedValue, modifierM1050height3ABfNKs, jc2Var, false, null, TextUnitKt.getSp(22), 0.0f, 0.0f, composer2, 1576326, 432);
                    boolean zChanged2 = composer2.changed(function0) | composer2.changed(function3);
                    Object objRememberedValue2 = composer2.rememberedValue();
                    if (zChanged2 || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                        objRememberedValue2 = new hh0(21, function0, function3);
                        composer2.updateRememberedValue(objRememberedValue2);
                    }
                    hc2.a("更换图标", (Function0) objRememberedValue2, SizeKt.m1050height3ABfNKs(SizeKt.fillMaxWidth$default(companion3, 0.0f, 1, null), Dp.m7813constructorimpl(56.0f)), jc2Var, false, null, TextUnitKt.getSp(22), 0.0f, 0.0f, composer2, 1576326, 432);
                    boolean zChanged3 = composer2.changed(function0) | composer2.changed(function4);
                    Object objRememberedValue3 = composer2.rememberedValue();
                    if (zChanged3 || objRememberedValue3 == Composer.INSTANCE.getEmpty()) {
                        objRememberedValue3 = new hh0(22, function0, function4);
                        composer2.updateRememberedValue(objRememberedValue3);
                    }
                    hc2.a("备用线路管理", (Function0) objRememberedValue3, SizeKt.m1050height3ABfNKs(SizeKt.fillMaxWidth$default(companion3, 0.0f, 1, null), Dp.m7813constructorimpl(56.0f)), jc2Var, false, null, TextUnitKt.getSp(22), 0.0f, 0.0f, composer2, 1576326, 432);
                    if (this.b) {
                        composer2.startReplaceGroup(-1555117823);
                        boolean zChanged4 = composer2.changed(function0) | composer2.changed(function5);
                        Object objRememberedValue4 = composer2.rememberedValue();
                        if (zChanged4 || objRememberedValue4 == Composer.INSTANCE.getEmpty()) {
                            objRememberedValue4 = new hh0(23, function0, function5);
                            composer2.updateRememberedValue(objRememberedValue4);
                        }
                        hc2.a("服务器排序", (Function0) objRememberedValue4, SizeKt.m1050height3ABfNKs(SizeKt.fillMaxWidth$default(companion3, 0.0f, 1, null), Dp.m7813constructorimpl(56.0f)), jc2Var, false, null, TextUnitKt.getSp(22), 0.0f, 0.0f, composer2, 1576326, 432);
                        composer2.endReplaceGroup();
                    } else {
                        composer2.startReplaceGroup(-1554605610);
                        composer2.endReplaceGroup();
                    }
                    boolean zChanged5 = composer2.changed(function0) | composer2.changed(function6);
                    Object objRememberedValue5 = composer2.rememberedValue();
                    if (zChanged5 || objRememberedValue5 == Composer.INSTANCE.getEmpty()) {
                        objRememberedValue5 = new hh0(24, function0, function6);
                        composer2.updateRememberedValue(objRememberedValue5);
                    }
                    hc2.d("删除", (Function0) objRememberedValue5, SizeKt.m1050height3ABfNKs(SizeKt.fillMaxWidth$default(companion3, 0.0f, 1, null), Dp.m7813constructorimpl(56.0f)), false, TextUnitKt.getSp(22), 0.0f, 0.0f, composer2, 24966, 104);
                    composer2.endNode();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                } else {
                    composer2.skipToGroupEnd();
                }
                break;
            default:
                u61 u61Var2 = (u61) obj7;
                ve2 ve2Var = (ve2) obj6;
                String str3 = (String) obj5;
                FocusRequester focusRequester2 = (FocusRequester) obj4;
                Function0 function7 = (Function0) obj3;
                Function0 function8 = (Function0) function;
                Composer composer3 = (Composer) obj;
                int iIntValue3 = ((Integer) obj2).intValue();
                if (composer3.shouldExecute((iIntValue3 & 3) != 2, iIntValue3 & 1)) {
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(17856996, iIntValue3, -1, "com.dh.myembyapp.ui.components.WebDavDownloadConfirmDialog.<anonymous> (WebDavSyncDialog.kt:746)");
                    }
                    Modifier.Companion companion5 = Modifier.INSTANCE;
                    Modifier modifierM275backgroundbw27NRU$default2 = BackgroundKt.m275backgroundbw27NRU$default(SizeKt.fillMaxSize$default(companion5, 0.0f, 1, null), u61Var2.a, null, 2, null);
                    MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy2 = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.INSTANCE.getCenter(), false);
                    long currentCompositeKeyHashCode3 = ComposablesKt.getCurrentCompositeKeyHashCode(composer3, 0);
                    int i5 = (int) (currentCompositeKeyHashCode3 ^ (currentCompositeKeyHashCode3 >>> 32));
                    CompositionLocalMap currentCompositionLocalMap3 = composer3.getCurrentCompositionLocalMap();
                    Modifier modifierMaterializeModifier3 = ComposedModifierKt.materializeModifier(composer3, modifierM275backgroundbw27NRU$default2);
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
                    mr.z(companion6, composerM4318constructorimpl3, measurePolicyMaybeCachedBoxMeasurePolicy2, composerM4318constructorimpl3, currentCompositionLocalMap3);
                    Updater.m4326setimpl(composerM4318constructorimpl3, modifierMaterializeModifier3, (Function2<? super T, ? super Modifier, Unit>) id.h(companion6, composerM4318constructorimpl3, Integer.valueOf(i5), composerM4318constructorimpl3));
                    BoxScopeInstance boxScopeInstance2 = BoxScopeInstance.INSTANCE;
                    CardKt.Card(SizeKt.fillMaxHeight(SizeKt.m1069width3ABfNKs(companion5, Dp.m7813constructorimpl(720.0f)), 0.88f), null, CardDefaults.INSTANCE.m2119cardColorsro_MJ88(MaterialTheme.INSTANCE.getColorScheme(composer3, MaterialTheme.$stable).getSurface(), 0L, 0L, 0L, composer3, CardDefaults.$stable << 12, 14), null, null, ComposableLambdaKt.rememberComposableLambda(951492588, true, new aq(u61Var2, ve2Var, focusRequester2, str3, function7, function8, this.b), composer3, 54), composer3, 196614, 26);
                    composer3.endNode();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                } else {
                    composer3.skipToGroupEnd();
                }
                break;
        }
        return Unit.INSTANCE;
    }

    public /* synthetic */ ln0(u61 u61Var, String str, List list, boolean z, String str2, Function1 function1, FocusRequester focusRequester) {
        this.c = u61Var;
        this.d = str;
        this.g = list;
        this.b = z;
        this.e = str2;
        this.h = function1;
        this.i = focusRequester;
    }

    public /* synthetic */ ln0(Function0 function0, Function0 function1, Function0 function2, Function0 function3, boolean z, Function0 function4, Function0 function5) {
        this.c = function0;
        this.d = function1;
        this.e = function2;
        this.g = function3;
        this.b = z;
        this.h = function4;
        this.i = function5;
    }
}
