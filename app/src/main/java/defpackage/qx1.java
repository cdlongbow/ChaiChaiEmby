package defpackage;

import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnScopeInstance;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.RowKt;
import androidx.compose.foundation.layout.RowScopeInstance;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.SpacerKt;
import androidx.compose.material3.MaterialTheme;
import androidx.compose.material3.SurfaceKt;
import androidx.compose.material3.TextKt;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.unit.Dp;
import androidx.compose.ui.unit.TextUnitKt;
import com.dh.myembyapp.data.model.ServerConfig;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class qx1 implements Function2 {
    public final /* synthetic */ int a;
    public final /* synthetic */ ServerConfig b;
    public final /* synthetic */ Function0 c;
    public final /* synthetic */ MutableState d;

    public /* synthetic */ qx1(ServerConfig serverConfig, Function0 function0, MutableState mutableState, int i) {
        this.a = i;
        this.b = serverConfig;
        this.c = function0;
        this.d = mutableState;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        int i = this.a;
        MutableState mutableState = this.d;
        Function0 function0 = this.c;
        ServerConfig serverConfig = this.b;
        int i2 = 1;
        switch (i) {
            case 0:
                Composer composer = (Composer) obj;
                int iIntValue = ((Integer) obj2).intValue();
                if (composer.shouldExecute((iIntValue & 3) != 2, iIntValue & 1)) {
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-953638030, iIntValue, -1, "com.dh.myembyapp.ui.screens.serverlist.ServerCard.<anonymous> (ServerListScreen.kt:1250)");
                    }
                    Modifier modifierWrapContentHeight$default = SizeKt.wrapContentHeight$default(SizeKt.m1069width3ABfNKs(Modifier.INSTANCE, Dp.m7813constructorimpl(360.0f)), null, false, 3, null);
                    MaterialTheme materialTheme = MaterialTheme.INSTANCE;
                    int i3 = MaterialTheme.$stable;
                    SurfaceKt.m2905SurfaceT9BRK9s(modifierWrapContentHeight$default, materialTheme.getShapes(composer, i3).getLarge(), materialTheme.getColorScheme(composer, i3).getSurface(), 0L, Dp.m7813constructorimpl(8.0f), 0.0f, null, ComposableLambdaKt.rememberComposableLambda(853144845, true, new qx1(serverConfig, function0, mutableState, i2), composer, 54), composer, 12607494, 104);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                } else {
                    composer.skipToGroupEnd();
                }
                break;
            default:
                Composer composer2 = (Composer) obj;
                int iIntValue2 = ((Integer) obj2).intValue();
                if (composer2.shouldExecute((iIntValue2 & 3) != 2, iIntValue2 & 1)) {
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(853144845, iIntValue2, -1, "com.dh.myembyapp.ui.screens.serverlist.ServerCard.<anonymous>.<anonymous> (ServerListScreen.kt:1258)");
                    }
                    Modifier.Companion companion = Modifier.INSTANCE;
                    Modifier modifierM999padding3ABfNKs = PaddingKt.m999padding3ABfNKs(companion, Dp.m7813constructorimpl(24.0f));
                    Alignment.Companion companion2 = Alignment.INSTANCE;
                    Alignment.Horizontal centerHorizontally = companion2.getCenterHorizontally();
                    Arrangement arrangement = Arrangement.INSTANCE;
                    MeasurePolicy measurePolicyColumnMeasurePolicy = ColumnKt.columnMeasurePolicy(arrangement.getTop(), centerHorizontally, composer2, 48);
                    long currentCompositeKeyHashCode = ComposablesKt.getCurrentCompositeKeyHashCode(composer2, 0);
                    int i4 = (int) (currentCompositeKeyHashCode ^ (currentCompositeKeyHashCode >>> 32));
                    CompositionLocalMap currentCompositionLocalMap = composer2.getCurrentCompositionLocalMap();
                    Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(composer2, modifierM999padding3ABfNKs);
                    ComposeUiNode.Companion companion3 = ComposeUiNode.INSTANCE;
                    Function0<ComposeUiNode> constructor = companion3.getConstructor();
                    if (composer2.getApplier() == null) {
                        ComposablesKt.invalidApplier();
                    }
                    composer2.startReusableNode();
                    if (composer2.getInserting()) {
                        composer2.createNode(constructor);
                    } else {
                        composer2.useNode();
                    }
                    Composer composerM4318constructorimpl = Updater.m4318constructorimpl(composer2);
                    mr.z(companion3, composerM4318constructorimpl, measurePolicyColumnMeasurePolicy, composerM4318constructorimpl, currentCompositionLocalMap);
                    Updater.m4326setimpl(composerM4318constructorimpl, modifierMaterializeModifier, (Function2<? super T, ? super Modifier, Unit>) id.h(companion3, composerM4318constructorimpl, Integer.valueOf(i4), composerM4318constructorimpl));
                    ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.INSTANCE;
                    MaterialTheme materialTheme2 = MaterialTheme.INSTANCE;
                    int i5 = MaterialTheme.$stable;
                    TextKt.m3048TextNvy7gAk("确认删除", null, materialTheme2.getColorScheme(composer2, i5).getOnSurface(), null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, materialTheme2.getTypography(composer2, i5).getTitleLarge(), composer2, 6, 0, 131066);
                    SpacerKt.Spacer(SizeKt.m1050height3ABfNKs(companion, Dp.m7813constructorimpl(16.0f)), composer2, 6);
                    TextKt.m3048TextNvy7gAk(mr.r("确定要删除服务器 \"", serverConfig.getAlias(), "\" 吗？"), null, Color.m5151copywmQWz5c$default(materialTheme2.getColorScheme(composer2, i5).getOnSurface(), 0.8f, 0.0f, 0.0f, 0.0f, 14, null), null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, materialTheme2.getTypography(composer2, i5).getBodyLarge(), composer2, 0, 0, 131066);
                    id.i(24.0f, companion, composer2, 6);
                    Modifier modifierFillMaxWidth$default = SizeKt.fillMaxWidth$default(companion, 0.0f, 1, null);
                    MeasurePolicy measurePolicyRowMeasurePolicy = RowKt.rowMeasurePolicy(arrangement.m713spacedByD5KLDUw(Dp.m7813constructorimpl(16.0f), companion2.getCenterHorizontally()), companion2.getTop(), composer2, 6);
                    long currentCompositeKeyHashCode2 = ComposablesKt.getCurrentCompositeKeyHashCode(composer2, 0);
                    int i6 = (int) (currentCompositeKeyHashCode2 ^ (currentCompositeKeyHashCode2 >>> 32));
                    CompositionLocalMap currentCompositionLocalMap2 = composer2.getCurrentCompositionLocalMap();
                    Modifier modifierMaterializeModifier2 = ComposedModifierKt.materializeModifier(composer2, modifierFillMaxWidth$default);
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
                    mr.z(companion3, composerM4318constructorimpl2, measurePolicyRowMeasurePolicy, composerM4318constructorimpl2, currentCompositionLocalMap2);
                    Updater.m4326setimpl(composerM4318constructorimpl2, modifierMaterializeModifier2, (Function2<? super T, ? super Modifier, Unit>) id.h(companion3, composerM4318constructorimpl2, Integer.valueOf(i6), composerM4318constructorimpl2));
                    RowScopeInstance rowScopeInstance = RowScopeInstance.INSTANCE;
                    Object objRememberedValue = composer2.rememberedValue();
                    Composer.Companion companion4 = Composer.INSTANCE;
                    if (objRememberedValue == companion4.getEmpty()) {
                        objRememberedValue = new zq1(14, mutableState);
                        composer2.updateRememberedValue(objRememberedValue);
                    }
                    hc2.b("取消", (Function0) objRememberedValue, SizeKt.m1050height3ABfNKs(zs1.E(rowScopeInstance, companion, 1.0f, false, 2, null), Dp.m7813constructorimpl(48.0f)), false, TextUnitKt.getSp(18), 0.0f, 0.0f, composer2, 24630, 104);
                    boolean zChanged = composer2.changed(function0);
                    Object objRememberedValue2 = composer2.rememberedValue();
                    if (zChanged || objRememberedValue2 == companion4.getEmpty()) {
                        objRememberedValue2 = new o5(function0, mutableState, 8);
                        composer2.updateRememberedValue(objRememberedValue2);
                    }
                    hc2.d("删除", (Function0) objRememberedValue2, SizeKt.m1050height3ABfNKs(zs1.E(rowScopeInstance, companion, 1.0f, false, 2, null), Dp.m7813constructorimpl(48.0f)), false, TextUnitKt.getSp(18), 0.0f, 0.0f, composer2, 24582, 104);
                    if (x2.m(composer2)) {
                        ComposerKt.traceEventEnd();
                    }
                } else {
                    composer2.skipToGroupEnd();
                }
                break;
        }
        return Unit.INSTANCE;
    }
}
