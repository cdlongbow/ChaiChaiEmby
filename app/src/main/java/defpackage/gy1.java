package defpackage;

import androidx.activity.compose.BackHandlerKt;
import androidx.compose.foundation.BorderKt;
import androidx.compose.foundation.BorderStrokeKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnScope;
import androidx.compose.foundation.layout.ColumnScopeInstance;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.RowKt;
import androidx.compose.foundation.layout.RowScopeInstance;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.SpacerKt;
import androidx.compose.material.icons.Icons;
import androidx.compose.material.icons.filled.CheckKt;
import androidx.compose.material.icons.filled.VpnKeyKt;
import androidx.compose.material3.IconKt;
import androidx.compose.material3.MaterialTheme;
import androidx.compose.material3.SurfaceKt;
import androidx.compose.material3.TextKt;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SnapshotMutationPolicy;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.State;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.focus.FocusChangedModifierKt;
import androidx.compose.ui.focus.FocusRequester;
import androidx.compose.ui.focus.FocusRequesterModifierKt;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.ColorKt;
import androidx.compose.ui.input.key.KeyInputModifierKt;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.text.style.TextAlign;
import androidx.compose.ui.text.style.TextOverflow;
import androidx.compose.ui.unit.Dp;
import androidx.compose.ui.unit.TextUnitKt;
import androidx.compose.ui.window.AndroidDialog_androidKt;
import androidx.media3.exoplayer.RendererCapabilities;
import com.dh.myembyapp.data.ProxyConfig;
import com.dh.myembyapp.data.model.ServerConfig;
import com.dh.myembyapp.data.model.ServerPingState;
import java.util.List;
import kotlin.Unit;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.text.StringsKt;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: loaded from: classes4.dex */
public abstract class gy1 {
    public static final String A(State state) {
        return (String) state.getValue();
    }

    public static final void B(MutableState mutableState, boolean z) {
        mutableState.setValue(Boolean.valueOf(z));
    }

    public static final void C(final boolean z, Function0 function0, Function0 function1, Function0 function2, Function0 function3, Function0 function4, boolean z2, Function0 function5, Function0 function6, Composer composer, int i) {
        int i2;
        Function0 function7;
        Function0 function8;
        Function0 function9;
        Function0 function10;
        boolean z3;
        Function0 function11;
        Function0 function12;
        Composer composer2;
        Composer composerStartRestartGroup = composer.startRestartGroup(1372953424);
        if ((i & 6) == 0) {
            i2 = (composerStartRestartGroup.changed(z) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            function7 = function0;
            i2 |= composerStartRestartGroup.changedInstance(function7) ? 32 : 16;
        } else {
            function7 = function0;
        }
        if ((i & RendererCapabilities.DECODER_SUPPORT_MASK) == 0) {
            i2 |= composerStartRestartGroup.changedInstance(function1) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            function8 = function2;
            i2 |= composerStartRestartGroup.changedInstance(function8) ? 2048 : 1024;
        } else {
            function8 = function2;
        }
        if ((i & 24576) == 0) {
            function9 = function3;
            i2 |= composerStartRestartGroup.changedInstance(function9) ? 16384 : 8192;
        } else {
            function9 = function3;
        }
        if ((196608 & i) == 0) {
            function10 = function4;
            i2 |= composerStartRestartGroup.changedInstance(function10) ? 131072 : 65536;
        } else {
            function10 = function4;
        }
        if ((1572864 & i) == 0) {
            z3 = z2;
            i2 |= composerStartRestartGroup.changed(z3) ? 1048576 : 524288;
        } else {
            z3 = z2;
        }
        if ((12582912 & i) == 0) {
            function11 = function5;
            i2 |= composerStartRestartGroup.changedInstance(function11) ? 8388608 : 4194304;
        } else {
            function11 = function5;
        }
        if ((100663296 & i) == 0) {
            function12 = function6;
            i2 |= composerStartRestartGroup.changedInstance(function12) ? 67108864 : GroupFlagsKt.HasAuxSlotFlag;
        } else {
            function12 = function6;
        }
        if (composerStartRestartGroup.shouldExecute((i2 & 38347923) != 38347922, i2 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1372953424, i2, -1, "com.dh.myembyapp.ui.screens.serverlist.ServerMenuDialog (ServerListScreen.kt:1371)");
            }
            boolean z4 = (i2 & 14) == 4;
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            if (z4 || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                objRememberedValue = new Function0() { // from class: tx1
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return Boolean.valueOf(!z);
                    }
                };
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            final Function0 function13 = (Function0) objRememberedValue;
            boolean z5 = (i2 & 896) == 256;
            Object objRememberedValue2 = composerStartRestartGroup.rememberedValue();
            if (z5 || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                objRememberedValue2 = new eq1(2, function1);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
            }
            BackHandlerKt.BackHandler(true, (Function0) objRememberedValue2, composerStartRestartGroup, 6, 0);
            final boolean z6 = z3;
            int i3 = i2;
            final Function0 function14 = function7;
            final Function0 function15 = function9;
            final Function0 function16 = function11;
            final Function0 function17 = function8;
            final Function0 function18 = function10;
            final Function0 function19 = function12;
            composer2 = composerStartRestartGroup;
            AndroidDialog_androidKt.Dialog(function1, null, ComposableLambdaKt.rememberComposableLambda(-1178928473, true, new Function2() { // from class: ux1
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    Composer composer3 = (Composer) obj;
                    int iIntValue = ((Integer) obj2).intValue();
                    if (composer3.shouldExecute((iIntValue & 3) != 2, iIntValue & 1)) {
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(-1178928473, iIntValue, -1, "com.dh.myembyapp.ui.screens.serverlist.ServerMenuDialog.<anonymous> (ServerListScreen.kt:1381)");
                        }
                        Modifier modifierWrapContentHeight$default = SizeKt.wrapContentHeight$default(SizeKt.m1069width3ABfNKs(Modifier.INSTANCE, Dp.m7813constructorimpl(300.0f)), null, false, 3, null);
                        boolean z7 = z;
                        boolean zChanged = composer3.changed(z7);
                        Function0 function20 = function14;
                        boolean zChanged2 = zChanged | composer3.changed(function20);
                        Object objRememberedValue3 = composer3.rememberedValue();
                        if (zChanged2 || objRememberedValue3 == Composer.INSTANCE.getEmpty()) {
                            objRememberedValue3 = new fy1(z7, function20);
                            composer3.updateRememberedValue(objRememberedValue3);
                        }
                        Modifier modifierOnPreviewKeyEvent = KeyInputModifierKt.onPreviewKeyEvent(modifierWrapContentHeight$default, (Function1) objRememberedValue3);
                        MaterialTheme materialTheme = MaterialTheme.INSTANCE;
                        int i4 = MaterialTheme.$stable;
                        SurfaceKt.m2905SurfaceT9BRK9s(modifierOnPreviewKeyEvent, materialTheme.getShapes(composer3, i4).getLarge(), materialTheme.getColorScheme(composer3, i4).getSurface(), 0L, Dp.m7813constructorimpl(8.0f), 0.0f, null, ComposableLambdaKt.rememberComposableLambda(-167495422, true, new ln0(function13, function17, function15, function18, z6, function16, function19), composer3, 54), composer3, 12607488, 104);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                    } else {
                        composer3.skipToGroupEnd();
                    }
                    return Unit.INSTANCE;
                }
            }, composerStartRestartGroup, 54), composer2, ((i3 >> 6) & 14) | RendererCapabilities.DECODER_SUPPORT_MASK, 2);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composer2 = composerStartRestartGroup;
            composer2.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new e20(z, function0, function1, function2, function3, function4, z2, function5, function6, i));
        }
    }

    public static final void a(Function0 function0, Composer composer, int i) {
        int i2;
        int i3;
        Composer composerStartRestartGroup = composer.startRestartGroup(1184354786);
        if ((i & 6) == 0) {
            i2 = (composerStartRestartGroup.changedInstance(function0) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if (composerStartRestartGroup.shouldExecute((i2 & 3) != 2, i2 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1184354786, i2, -1, "com.dh.myembyapp.ui.screens.serverlist.AddServerCard (ServerListScreen.kt:1314)");
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-175699322, 6, -1, "com.dh.myembyapp.ui.theme.MyEmbyTheme.<get-colors> (Theme.kt:122)");
            }
            u61 u61Var = (u61) composerStartRestartGroup.consume(n72.b);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            Modifier modifierM1050height3ABfNKs = SizeKt.m1050height3ABfNKs(SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null), Dp.m7813constructorimpl(120.0f));
            CardDefaults cardDefaults = CardDefaults.INSTANCE;
            long secondaryContainer = MaterialTheme.INSTANCE.getColorScheme(composerStartRestartGroup, MaterialTheme.$stable).getSecondaryContainer();
            int i4 = CardDefaults.$stable;
            i3 = 6;
            CardKt.Card(function0, modifierM1050height3ABfNKs, null, null, cardDefaults.m8247colors5tl4gsc(secondaryContainer, 0L, 0L, 0L, 0L, 0L, composerStartRestartGroup, i4 << 18, 62), null, cardDefaults.border(null, new Border(BorderStrokeKt.m301BorderStrokecXLIe8U(Dp.m7813constructorimpl(2.0f), u61Var.b), 0.0f, null, 6, null), null, composerStartRestartGroup, i4 << 9, 5), null, null, st.k, composerStartRestartGroup, (i2 & 14) | 805306416, 428);
            composerStartRestartGroup = composerStartRestartGroup;
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            i3 = 6;
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new tm(i, i3, function0));
        }
    }

    public static final void b(Function0 function0, FocusRequester focusRequester, Composer composer, int i) {
        int i2;
        Composer composerStartRestartGroup = composer.startRestartGroup(757269795);
        if ((i & 6) == 0) {
            i2 = i | (composerStartRestartGroup.changedInstance(function0) ? 4 : 2);
        } else {
            i2 = i;
        }
        int i3 = 16;
        if ((i & 48) == 0) {
            i2 |= composerStartRestartGroup.changed(focusRequester) ? 32 : 16;
        }
        if (composerStartRestartGroup.shouldExecute((i2 & 19) != 18, i2 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(757269795, i2, -1, "com.dh.myembyapp.ui.screens.serverlist.AggregateSearchButton (ServerListScreen.kt:1500)");
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-175699322, 6, -1, "com.dh.myembyapp.ui.theme.MyEmbyTheme.<get-colors> (Theme.kt:122)");
            }
            u61 u61Var = (u61) composerStartRestartGroup.consume(n72.b);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            Composer.Companion companion = Composer.INSTANCE;
            if (objRememberedValue == companion.getEmpty()) {
                objRememberedValue = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Boolean.FALSE, null, 2, null);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            MutableState mutableState = (MutableState) objRememberedValue;
            Modifier modifierFocusRequester = Modifier.INSTANCE;
            Modifier modifierM1001paddingVpY3zN4$default = PaddingKt.m1001paddingVpY3zN4$default(SizeKt.m1050height3ABfNKs(SizeKt.fillMaxWidth$default(modifierFocusRequester, 0.0f, 1, null), Dp.m7813constructorimpl(72.0f)), Dp.m7813constructorimpl(24.0f), 0.0f, 2, null);
            if (focusRequester != null) {
                modifierFocusRequester = FocusRequesterModifierKt.focusRequester(modifierFocusRequester, focusRequester);
            }
            Modifier modifierThen = modifierM1001paddingVpY3zN4$default.then(modifierFocusRequester);
            Object objRememberedValue2 = composerStartRestartGroup.rememberedValue();
            if (objRememberedValue2 == companion.getEmpty()) {
                objRememberedValue2 = new li1(27, mutableState);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
            }
            ButtonKt.m8231ButtonTCVpFMg(function0, FocusChangedModifierKt.onFocusChanged(modifierThen, (Function1) objRememberedValue2), null, false, hc2.l(1.02f), el0.a(u61Var), null, hc2.i(jc2.b, false, composerStartRestartGroup, 6, 2), 0.0f, hc2.h(composerStartRestartGroup), null, null, ComposableLambdaKt.rememberComposableLambda(1928564499, true, new w91(i3, mutableState), composerStartRestartGroup, 54), composerStartRestartGroup, i2 & 14, RendererCapabilities.DECODER_SUPPORT_MASK, 3404);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new e81(function0, focusRequester, i, 14));
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void c(Function0 function0, Composer composer, int i) {
        int i2;
        Composer composerStartRestartGroup = composer.startRestartGroup(69993704);
        if ((i & 6) == 0) {
            i2 = (composerStartRestartGroup.changedInstance(function0) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if (composerStartRestartGroup.shouldExecute((i2 & 3) != 2, i2 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(69993704, i2, -1, "com.dh.myembyapp.ui.screens.serverlist.EmptyServerList (ServerListScreen.kt:916)");
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-175699322, 6, -1, "com.dh.myembyapp.ui.theme.MyEmbyTheme.<get-colors> (Theme.kt:122)");
            }
            u61 u61Var = (u61) composerStartRestartGroup.consume(n72.b);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            Composer.Companion companion = Composer.INSTANCE;
            if (objRememberedValue == companion.getEmpty()) {
                objRememberedValue = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Boolean.FALSE, null, 2, null);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            MutableState mutableState = (MutableState) objRememberedValue;
            Modifier modifierM286borderxT4_qwU = Modifier.INSTANCE;
            Modifier modifierFillMaxSize$default = SizeKt.fillMaxSize$default(modifierM286borderxT4_qwU, 0.0f, 1, null);
            MeasurePolicy measurePolicyColumnMeasurePolicy = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getCenter(), Alignment.INSTANCE.getCenterHorizontally(), composerStartRestartGroup, 54);
            long currentCompositeKeyHashCode = ComposablesKt.getCurrentCompositeKeyHashCode(composerStartRestartGroup, 0);
            int i3 = (int) (currentCompositeKeyHashCode ^ (currentCompositeKeyHashCode >>> 32));
            CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifierFillMaxSize$default);
            ComposeUiNode.Companion companion2 = ComposeUiNode.INSTANCE;
            Function0<ComposeUiNode> constructor = companion2.getConstructor();
            if (composerStartRestartGroup.getApplier() == null) {
                ComposablesKt.invalidApplier();
            }
            composerStartRestartGroup.startReusableNode();
            if (composerStartRestartGroup.getInserting()) {
                composerStartRestartGroup.createNode(constructor);
            } else {
                composerStartRestartGroup.useNode();
            }
            Composer composerM4318constructorimpl = Updater.m4318constructorimpl(composerStartRestartGroup);
            mr.z(companion2, composerM4318constructorimpl, measurePolicyColumnMeasurePolicy, composerM4318constructorimpl, currentCompositionLocalMap);
            Updater.m4326setimpl(composerM4318constructorimpl, modifierMaterializeModifier, (Function2<? super T, ? super Modifier, Unit>) id.h(companion2, composerM4318constructorimpl, Integer.valueOf(i3), composerM4318constructorimpl));
            ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.INSTANCE;
            MaterialTheme materialTheme = MaterialTheme.INSTANCE;
            int i4 = MaterialTheme.$stable;
            TextKt.m3048TextNvy7gAk("还没有保存的服务器", null, Color.m5151copywmQWz5c$default(materialTheme.getColorScheme(composerStartRestartGroup, i4).getOnBackground(), 0.6f, 0.0f, 0.0f, 0.0f, 14, null), null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, materialTheme.getTypography(composerStartRestartGroup, i4).getHeadlineMedium(), composerStartRestartGroup, 6, 0, 131066);
            SpacerKt.Spacer(SizeKt.m1050height3ABfNKs(modifierM286borderxT4_qwU, Dp.m7813constructorimpl(32.0f)), composerStartRestartGroup, 6);
            Modifier modifierM1050height3ABfNKs = SizeKt.m1050height3ABfNKs(SizeKt.m1069width3ABfNKs(modifierM286borderxT4_qwU, Dp.m7813constructorimpl(300.0f)), Dp.m7813constructorimpl(64.0f));
            Object objRememberedValue2 = composerStartRestartGroup.rememberedValue();
            if (objRememberedValue2 == companion.getEmpty()) {
                objRememberedValue2 = new li1(25, mutableState);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
            }
            Modifier modifierOnFocusChanged = FocusChangedModifierKt.onFocusChanged(modifierM1050height3ABfNKs, (Function1) objRememberedValue2);
            if (((Boolean) mutableState.getValue()).booleanValue()) {
                composerStartRestartGroup.startReplaceGroup(1637813167);
                modifierM286borderxT4_qwU = BorderKt.m286borderxT4_qwU(modifierM286borderxT4_qwU, Dp.m7813constructorimpl(2.0f), u61Var.b, materialTheme.getShapes(composerStartRestartGroup, i4).getMedium());
                composerStartRestartGroup.endReplaceGroup();
            } else {
                composerStartRestartGroup.startReplaceGroup(1638067832);
                composerStartRestartGroup.endReplaceGroup();
            }
            androidx.compose.material3.ButtonKt.Button(function0, modifierOnFocusChanged.then(modifierM286borderxT4_qwU), false, null, null, null, null, null, null, st.j, composerStartRestartGroup, (i2 & 14) | 805306368, 508);
            composerStartRestartGroup.endNode();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new tm(i, 7, function0));
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void d(final ServerConfig serverConfig, ProxyConfig proxyConfig, final ServerPingState serverPingState, final boolean z, FocusRequester focusRequester, Function0 function0, Function0 function1, final Function0 function2, final Function0 function3, boolean z2, Function0 function4, Function0 function5, Composer composer, int i, int i2) {
        int i3;
        ProxyConfig proxyConfig2;
        int i4;
        final Function0 function6;
        final Function0 function7;
        Function0 function8;
        int i5;
        SnapshotMutationPolicy snapshotMutationPolicy;
        int i6;
        String str;
        long surfaceVariant;
        final MutableState mutableState;
        final MutableState mutableState2;
        ServerConfig serverConfig2 = serverConfig;
        Composer composerStartRestartGroup = composer.startRestartGroup(1430502336);
        if ((i & 6) == 0) {
            i3 = (composerStartRestartGroup.changedInstance(serverConfig2) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            proxyConfig2 = proxyConfig;
            i3 |= composerStartRestartGroup.changed(proxyConfig2) ? 32 : 16;
        } else {
            proxyConfig2 = proxyConfig;
        }
        if ((i & RendererCapabilities.DECODER_SUPPORT_MASK) == 0) {
            i3 |= composerStartRestartGroup.changed(serverPingState) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i3 |= composerStartRestartGroup.changed(z) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i3 |= composerStartRestartGroup.changed(focusRequester) ? 16384 : 8192;
        }
        if ((196608 & i) == 0) {
            i3 |= composerStartRestartGroup.changedInstance(function0) ? 131072 : 65536;
        }
        if ((1572864 & i) == 0) {
            i3 |= composerStartRestartGroup.changedInstance(function1) ? 1048576 : 524288;
        }
        if ((12582912 & i) == 0) {
            i3 |= composerStartRestartGroup.changedInstance(function2) ? 8388608 : 4194304;
        }
        if ((100663296 & i) == 0) {
            i3 |= composerStartRestartGroup.changedInstance(function3) ? 67108864 : GroupFlagsKt.HasAuxSlotFlag;
        }
        if ((805306368 & i) == 0) {
            i3 |= composerStartRestartGroup.changed(z2) ? 536870912 : 268435456;
        }
        if ((i2 & 6) == 0) {
            i4 = i2 | (composerStartRestartGroup.changedInstance(function4) ? 4 : 2);
        } else {
            i4 = i2;
        }
        if ((i2 & 48) == 0) {
            i4 |= composerStartRestartGroup.changedInstance(function5) ? 32 : 16;
        }
        int i7 = i4;
        if (composerStartRestartGroup.shouldExecute(((i3 & 306783379) == 306783378 && (i7 & 19) == 18) ? false : true, i3 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1430502336, i3, i7, "com.dh.myembyapp.ui.screens.serverlist.ServerCard (ServerListScreen.kt:978)");
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-175699322, 6, -1, "com.dh.myembyapp.ui.theme.MyEmbyTheme.<get-colors> (Theme.kt:122)");
            }
            u61 u61Var = (u61) composerStartRestartGroup.consume(n72.b);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            Composer.Companion companion = Composer.INSTANCE;
            if (objRememberedValue == companion.getEmpty()) {
                i5 = 2;
                objRememberedValue = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Boolean.FALSE, null, 2, null);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            } else {
                i5 = 2;
            }
            MutableState mutableState3 = (MutableState) objRememberedValue;
            Object objRememberedValue2 = composerStartRestartGroup.rememberedValue();
            if (objRememberedValue2 == companion.getEmpty()) {
                objRememberedValue2 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Boolean.FALSE, null, i5, null);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
            }
            MutableState mutableState4 = (MutableState) objRememberedValue2;
            Object objRememberedValue3 = composerStartRestartGroup.rememberedValue();
            if (objRememberedValue3 == companion.getEmpty()) {
                objRememberedValue3 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Boolean.FALSE, null, 2, null);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
            }
            MutableState mutableState5 = (MutableState) objRememberedValue3;
            Object objRememberedValue4 = composerStartRestartGroup.rememberedValue();
            if (objRememberedValue4 == companion.getEmpty()) {
                objRememberedValue4 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Boolean.FALSE, null, 2, null);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue4);
            }
            MutableState mutableState6 = (MutableState) objRememberedValue4;
            Object objRememberedValue5 = composerStartRestartGroup.rememberedValue();
            if (objRememberedValue5 == companion.getEmpty()) {
                objRememberedValue5 = EffectsKt.createCompositionCoroutineScope(EmptyCoroutineContext.INSTANCE, composerStartRestartGroup);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue5);
            }
            CoroutineScope coroutineScope = (CoroutineScope) objRememberedValue5;
            Object objRememberedValue6 = composerStartRestartGroup.rememberedValue();
            if (objRememberedValue6 == companion.getEmpty()) {
                snapshotMutationPolicy = null;
                objRememberedValue6 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Boolean.FALSE, null, 2, null);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue6);
            } else {
                snapshotMutationPolicy = null;
            }
            MutableState mutableState7 = (MutableState) objRememberedValue6;
            Object objRememberedValue7 = composerStartRestartGroup.rememberedValue();
            if (objRememberedValue7 == companion.getEmpty()) {
                i6 = 2;
                objRememberedValue7 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Boolean.FALSE, snapshotMutationPolicy, 2, snapshotMutationPolicy);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue7);
            } else {
                i6 = 2;
            }
            MutableState mutableState8 = (MutableState) objRememberedValue7;
            Object objRememberedValue8 = composerStartRestartGroup.rememberedValue();
            if (objRememberedValue8 == companion.getEmpty()) {
                objRememberedValue8 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(snapshotMutationPolicy, snapshotMutationPolicy, i6, snapshotMutationPolicy);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue8);
            }
            MutableState mutableState9 = (MutableState) objRememberedValue8;
            ServerConfig effectiveServerConfig = serverConfig.getEffectiveServerConfig();
            String note = effectiveServerConfig.getNote();
            String string = note != null ? StringsKt.trim((CharSequence) note).toString() : null;
            if (string == null) {
                string = "";
            }
            final String strE = ig2.E(serverConfig.getLastPlaybackAccessTime());
            boolean z3 = proxyConfig2.getEnabled() && proxyConfig2.getBypassLan() && !effectiveServerConfig.getDirectOnly() && lr1.b(effectiveServerConfig.getHost());
            final boolean enabled = proxyConfig2.getEnabled();
            boolean z4 = (!proxyConfig2.getEnabled() || effectiveServerConfig.getDirectOnly() || z3) ? false : true;
            if (z4) {
                str = "代理已启用";
            } else {
                str = effectiveServerConfig.getDirectOnly() ? "代理已禁用（仅直连）" : "代理已禁用（局域网不代理）";
            }
            final String str2 = str;
            final long jColor = ColorKt.Color(z4 ? 4281652121L : 4287931320L);
            Modifier modifierFocusRequester = Modifier.INSTANCE;
            final String str3 = string;
            MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.INSTANCE.getTopStart(), false);
            long currentCompositeKeyHashCode = ComposablesKt.getCurrentCompositeKeyHashCode(composerStartRestartGroup, 0);
            int i8 = (int) (currentCompositeKeyHashCode ^ (currentCompositeKeyHashCode >>> 32));
            CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifierFocusRequester);
            ComposeUiNode.Companion companion2 = ComposeUiNode.INSTANCE;
            Function0<ComposeUiNode> constructor = companion2.getConstructor();
            if (composerStartRestartGroup.getApplier() == null) {
                ComposablesKt.invalidApplier();
            }
            composerStartRestartGroup.startReusableNode();
            if (composerStartRestartGroup.getInserting()) {
                composerStartRestartGroup.createNode(constructor);
            } else {
                composerStartRestartGroup.useNode();
            }
            Composer composerM4318constructorimpl = Updater.m4318constructorimpl(composerStartRestartGroup);
            mr.z(companion2, composerM4318constructorimpl, measurePolicyMaybeCachedBoxMeasurePolicy, composerM4318constructorimpl, currentCompositionLocalMap);
            Updater.m4326setimpl(composerM4318constructorimpl, modifierMaterializeModifier, (Function2<? super T, ? super Modifier, Unit>) id.h(companion2, composerM4318constructorimpl, Integer.valueOf(i8), composerM4318constructorimpl));
            BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
            boolean z5 = (i3 & 458752) == 131072;
            Object objRememberedValue9 = composerStartRestartGroup.rememberedValue();
            if (z5 || objRememberedValue9 == companion.getEmpty()) {
                objRememberedValue9 = new o5(function0, mutableState5, 7);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue9);
            }
            Function0 function9 = (Function0) objRememberedValue9;
            Modifier modifierM1050height3ABfNKs = SizeKt.m1050height3ABfNKs(SizeKt.fillMaxWidth$default(modifierFocusRequester, 0.0f, 1, null), Dp.m7813constructorimpl(120.0f));
            if (focusRequester != null) {
                modifierFocusRequester = FocusRequesterModifierKt.focusRequester(modifierFocusRequester, focusRequester);
            }
            Modifier modifierThen = modifierM1050height3ABfNKs.then(modifierFocusRequester);
            boolean zChangedInstance = composerStartRestartGroup.changedInstance(coroutineScope);
            Object objRememberedValue10 = composerStartRestartGroup.rememberedValue();
            if (zChangedInstance || objRememberedValue10 == companion.getEmpty()) {
                objRememberedValue10 = new yx1(coroutineScope, mutableState3, mutableState6, mutableState7, mutableState8, mutableState9, mutableState5);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue10);
            }
            Modifier modifierOnPreviewKeyEvent = KeyInputModifierKt.onPreviewKeyEvent(modifierThen, (Function1) objRememberedValue10);
            CardDefaults cardDefaults = CardDefaults.INSTANCE;
            if (z) {
                composerStartRestartGroup.startReplaceGroup(-1658642838);
                surfaceVariant = MaterialTheme.INSTANCE.getColorScheme(composerStartRestartGroup, MaterialTheme.$stable).getPrimaryContainer();
                composerStartRestartGroup.endReplaceGroup();
            } else {
                composerStartRestartGroup.startReplaceGroup(-1658555604);
                surfaceVariant = MaterialTheme.INSTANCE.getColorScheme(composerStartRestartGroup, MaterialTheme.$stable).getSurfaceVariant();
                composerStartRestartGroup.endReplaceGroup();
            }
            long j = surfaceVariant;
            int i9 = CardDefaults.$stable;
            function8 = function5;
            serverConfig2 = serverConfig;
            CardKt.Card(function9, modifierOnPreviewKeyEvent, null, null, cardDefaults.m8247colors5tl4gsc(j, 0L, 0L, 0L, 0L, 0L, composerStartRestartGroup, i9 << 18, 62), null, cardDefaults.border(null, new Border(BorderStrokeKt.m301BorderStrokecXLIe8U(Dp.m7813constructorimpl(2.0f), u61Var.b), 0.0f, null, 6, null), null, composerStartRestartGroup, i9 << 9, 5), null, null, ComposableLambdaKt.rememberComposableLambda(2014563516, true, new Function3() { // from class: rx1
                @Override // kotlin.jvm.functions.Function3
                public final Object invoke(Object obj, Object obj2, Object obj3) {
                    Modifier.Companion companion3;
                    int i10;
                    Object obj4;
                    Modifier.Companion companion4;
                    int i11;
                    Composer composer2 = (Composer) obj2;
                    int iIntValue = ((Integer) obj3).intValue();
                    ((ColumnScope) obj).getClass();
                    if (composer2.shouldExecute((iIntValue & 17) != 16, iIntValue & 1)) {
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(2014563516, iIntValue, -1, "com.dh.myembyapp.ui.screens.serverlist.ServerCard.<anonymous>.<anonymous> (ServerListScreen.kt:1079)");
                        }
                        Modifier.Companion companion5 = Modifier.INSTANCE;
                        Modifier modifierM999padding3ABfNKs = PaddingKt.m999padding3ABfNKs(SizeKt.fillMaxSize$default(companion5, 0.0f, 1, null), Dp.m7813constructorimpl(12.0f));
                        Arrangement arrangement = Arrangement.INSTANCE;
                        Arrangement.Vertical top = arrangement.getTop();
                        Alignment.Companion companion6 = Alignment.INSTANCE;
                        MeasurePolicy measurePolicyColumnMeasurePolicy = ColumnKt.columnMeasurePolicy(top, companion6.getStart(), composer2, 6);
                        long currentCompositeKeyHashCode2 = ComposablesKt.getCurrentCompositeKeyHashCode(composer2, 0);
                        int i12 = (int) (currentCompositeKeyHashCode2 ^ (currentCompositeKeyHashCode2 >>> 32));
                        CompositionLocalMap currentCompositionLocalMap2 = composer2.getCurrentCompositionLocalMap();
                        Modifier modifierMaterializeModifier2 = ComposedModifierKt.materializeModifier(composer2, modifierM999padding3ABfNKs);
                        ComposeUiNode.Companion companion7 = ComposeUiNode.INSTANCE;
                        Function0<ComposeUiNode> constructor2 = companion7.getConstructor();
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
                        mr.z(companion7, composerM4318constructorimpl2, measurePolicyColumnMeasurePolicy, composerM4318constructorimpl2, currentCompositionLocalMap2);
                        Updater.m4326setimpl(composerM4318constructorimpl2, modifierMaterializeModifier2, (Function2<? super T, ? super Modifier, Unit>) id.h(companion7, composerM4318constructorimpl2, Integer.valueOf(i12), composerM4318constructorimpl2));
                        ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.INSTANCE;
                        Modifier modifierFillMaxWidth$default = SizeKt.fillMaxWidth$default(companion5, 0.0f, 1, null);
                        MeasurePolicy measurePolicyRowMeasurePolicy = RowKt.rowMeasurePolicy(arrangement.getSpaceBetween(), companion6.getCenterVertically(), composer2, 54);
                        long currentCompositeKeyHashCode3 = ComposablesKt.getCurrentCompositeKeyHashCode(composer2, 0);
                        int i13 = (int) (currentCompositeKeyHashCode3 ^ (currentCompositeKeyHashCode3 >>> 32));
                        CompositionLocalMap currentCompositionLocalMap3 = composer2.getCurrentCompositionLocalMap();
                        Modifier modifierMaterializeModifier3 = ComposedModifierKt.materializeModifier(composer2, modifierFillMaxWidth$default);
                        Function0<ComposeUiNode> constructor3 = companion7.getConstructor();
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
                        mr.z(companion7, composerM4318constructorimpl3, measurePolicyRowMeasurePolicy, composerM4318constructorimpl3, currentCompositionLocalMap3);
                        Updater.m4326setimpl(composerM4318constructorimpl3, modifierMaterializeModifier3, (Function2<? super T, ? super Modifier, Unit>) id.h(companion7, composerM4318constructorimpl3, Integer.valueOf(i13), composerM4318constructorimpl3));
                        RowScopeInstance rowScopeInstance = RowScopeInstance.INSTANCE;
                        Alignment.Vertical centerVertically = companion6.getCenterVertically();
                        Modifier modifierE = zs1.E(rowScopeInstance, companion5, 1.0f, false, 2, null);
                        MeasurePolicy measurePolicyRowMeasurePolicy2 = RowKt.rowMeasurePolicy(arrangement.getStart(), centerVertically, composer2, 48);
                        long currentCompositeKeyHashCode4 = ComposablesKt.getCurrentCompositeKeyHashCode(composer2, 0);
                        int i14 = (int) (currentCompositeKeyHashCode4 ^ (currentCompositeKeyHashCode4 >>> 32));
                        CompositionLocalMap currentCompositionLocalMap4 = composer2.getCurrentCompositionLocalMap();
                        Modifier modifierMaterializeModifier4 = ComposedModifierKt.materializeModifier(composer2, modifierE);
                        Function0<ComposeUiNode> constructor4 = companion7.getConstructor();
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
                        mr.z(companion7, composerM4318constructorimpl4, measurePolicyRowMeasurePolicy2, composerM4318constructorimpl4, currentCompositionLocalMap4);
                        Updater.m4326setimpl(composerM4318constructorimpl4, modifierMaterializeModifier4, (Function2<? super T, ? super Modifier, Unit>) id.h(companion7, composerM4318constructorimpl4, Integer.valueOf(i14), composerM4318constructorimpl4));
                        ServerConfig serverConfig3 = serverConfig;
                        lx1.c(serverConfig3.getCustomIconPath(), c61.n(serverConfig3.getAlias(), " 图标"), SizeKt.m1064size3ABfNKs(companion5, Dp.m7813constructorimpl(40.0f)), null, composer2, RendererCapabilities.DECODER_SUPPORT_MASK, 8);
                        SpacerKt.Spacer(SizeKt.m1069width3ABfNKs(companion5, Dp.m7813constructorimpl(8.0f)), composer2, 6);
                        String alias = serverConfig3.getAlias();
                        MaterialTheme materialTheme = MaterialTheme.INSTANCE;
                        int i15 = MaterialTheme.$stable;
                        TextStyle bodyMedium = materialTheme.getTypography(composer2, i15).getBodyMedium();
                        long onSurface = materialTheme.getColorScheme(composer2, i15).getOnSurface();
                        TextOverflow.Companion companion8 = TextOverflow.INSTANCE;
                        TextKt.m3048TextNvy7gAk(alias, null, onSurface, null, 0L, null, null, null, 0L, null, null, 0L, companion8.m7761getEllipsisgIe3tQ8(), false, 1, 0, null, bodyMedium, composer2, 0, 24960, 110586);
                        composer2.endNode();
                        if (z) {
                            composer2.startReplaceGroup(-1321737773);
                            i10 = i15;
                            companion3 = companion5;
                            IconKt.m2496Iconww6aTOc(CheckKt.getCheck(Icons.INSTANCE.getDefault()), "上次使用", SizeKt.m1064size3ABfNKs(companion3, Dp.m7813constructorimpl(16.0f)), materialTheme.getColorScheme(composer2, i10).getPrimary(), composer2, 432, 0);
                            composer2.endReplaceGroup();
                        } else {
                            companion3 = companion5;
                            i10 = i15;
                            composer2.startReplaceGroup(-1321445908);
                            composer2.endReplaceGroup();
                        }
                        composer2.endNode();
                        SpacerKt.Spacer(SizeKt.m1050height3ABfNKs(companion3, Dp.m7813constructorimpl(1.0f)), composer2, 6);
                        Modifier modifierFillMaxWidth$default2 = SizeKt.fillMaxWidth$default(companion3, 0.0f, 1, null);
                        MeasurePolicy measurePolicyRowMeasurePolicy3 = RowKt.rowMeasurePolicy(arrangement.m712spacedBy0680j_4(Dp.m7813constructorimpl(8.0f)), companion6.getCenterVertically(), composer2, 54);
                        long currentCompositeKeyHashCode5 = ComposablesKt.getCurrentCompositeKeyHashCode(composer2, 0);
                        int i16 = (int) (currentCompositeKeyHashCode5 ^ (currentCompositeKeyHashCode5 >>> 32));
                        CompositionLocalMap currentCompositionLocalMap5 = composer2.getCurrentCompositionLocalMap();
                        Modifier modifierMaterializeModifier5 = ComposedModifierKt.materializeModifier(composer2, modifierFillMaxWidth$default2);
                        Function0<ComposeUiNode> constructor5 = companion7.getConstructor();
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
                        mr.z(companion7, composerM4318constructorimpl5, measurePolicyRowMeasurePolicy3, composerM4318constructorimpl5, currentCompositionLocalMap5);
                        Updater.m4326setimpl(composerM4318constructorimpl5, modifierMaterializeModifier5, (Function2<? super T, ? super Modifier, Unit>) id.h(companion7, composerM4318constructorimpl5, Integer.valueOf(i16), composerM4318constructorimpl5));
                        int i17 = i10;
                        Modifier.Companion companion9 = companion3;
                        TextKt.m3048TextNvy7gAk(kb0.x("线路：", serverConfig3.getCurrentRouteDisplayName()), zs1.E(rowScopeInstance, companion3, 1.0f, false, 2, null), Color.m5151copywmQWz5c$default(materialTheme.getColorScheme(composer2, i10).getOnSurface(), 0.6f, 0.0f, 0.0f, 0.0f, 14, null), null, 0L, null, null, null, 0L, null, null, 0L, companion8.m7761getEllipsisgIe3tQ8(), false, 1, 0, null, materialTheme.getTypography(composer2, i10).getLabelSmall(), composer2, 0, 24960, 110584);
                        TextKt.m3048TextNvy7gAk(strE, null, Color.m5151copywmQWz5c$default(materialTheme.getColorScheme(composer2, i17).getOnSurface(), 0.6f, 0.0f, 0.0f, 0.0f, 14, null), null, 0L, null, null, null, 0L, null, TextAlign.m7696boximpl(TextAlign.INSTANCE.m7704getEnde0LSkKk()), 0L, 0, false, 1, 0, null, materialTheme.getTypography(composer2, i17).getLabelSmall(), composer2, 0, 24576, 113658);
                        Composer composer3 = composer2;
                        composer3.endNode();
                        SpacerKt.Spacer(SizeKt.m1050height3ABfNKs(companion9, Dp.m7813constructorimpl(1.0f)), composer3, 6);
                        Modifier modifierM1050height3ABfNKs2 = SizeKt.m1050height3ABfNKs(SizeKt.fillMaxWidth$default(companion9, 0.0f, 1, null), Dp.m7813constructorimpl(16.0f));
                        MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy2 = BoxKt.maybeCachedBoxMeasurePolicy(companion6.getCenterStart(), false);
                        long currentCompositeKeyHashCode6 = ComposablesKt.getCurrentCompositeKeyHashCode(composer3, 0);
                        int i18 = (int) (currentCompositeKeyHashCode6 ^ (currentCompositeKeyHashCode6 >>> 32));
                        CompositionLocalMap currentCompositionLocalMap6 = composer3.getCurrentCompositionLocalMap();
                        Modifier modifierMaterializeModifier6 = ComposedModifierKt.materializeModifier(composer3, modifierM1050height3ABfNKs2);
                        Function0<ComposeUiNode> constructor6 = companion7.getConstructor();
                        if (composer3.getApplier() == null) {
                            ComposablesKt.invalidApplier();
                        }
                        composer3.startReusableNode();
                        if (composer3.getInserting()) {
                            composer3.createNode(constructor6);
                        } else {
                            composer3.useNode();
                        }
                        Composer composerM4318constructorimpl6 = Updater.m4318constructorimpl(composer3);
                        mr.z(companion7, composerM4318constructorimpl6, measurePolicyMaybeCachedBoxMeasurePolicy2, composerM4318constructorimpl6, currentCompositionLocalMap6);
                        Updater.m4326setimpl(composerM4318constructorimpl6, modifierMaterializeModifier6, (Function2<? super T, ? super Modifier, Unit>) id.h(companion7, composerM4318constructorimpl6, Integer.valueOf(i18), composerM4318constructorimpl6));
                        BoxScopeInstance boxScopeInstance2 = BoxScopeInstance.INSTANCE;
                        String str4 = str3;
                        if (str4.length() > 0) {
                            composer3.startReplaceGroup(-823743472);
                            obj4 = null;
                            companion4 = companion9;
                            i11 = i17;
                            TextKt.m3048TextNvy7gAk(str4, null, Color.m5151copywmQWz5c$default(materialTheme.getColorScheme(composer3, i17).getOnSurface(), 0.6f, 0.0f, 0.0f, 0.0f, 14, null), null, 0L, null, null, null, 0L, null, null, 0L, companion8.m7761getEllipsisgIe3tQ8(), false, 1, 0, null, materialTheme.getTypography(composer3, i17).getLabelSmall(), composer3, 0, 24960, 110586);
                            composer3 = composer3;
                            composer3.endReplaceGroup();
                        } else {
                            obj4 = null;
                            companion4 = companion9;
                            i11 = i17;
                            composer3.startReplaceGroup(-823389142);
                            composer3.endReplaceGroup();
                        }
                        composer3.endNode();
                        SpacerKt.Spacer(SizeKt.m1050height3ABfNKs(companion4, Dp.m7813constructorimpl(1.0f)), composer3, 6);
                        Modifier modifierFillMaxWidth$default3 = SizeKt.fillMaxWidth$default(companion4, 0.0f, 1, obj4);
                        MeasurePolicy measurePolicyRowMeasurePolicy4 = RowKt.rowMeasurePolicy(arrangement.getSpaceBetween(), companion6.getCenterVertically(), composer3, 54);
                        long currentCompositeKeyHashCode7 = ComposablesKt.getCurrentCompositeKeyHashCode(composer3, 0);
                        int i19 = (int) (currentCompositeKeyHashCode7 ^ (currentCompositeKeyHashCode7 >>> 32));
                        CompositionLocalMap currentCompositionLocalMap7 = composer3.getCurrentCompositionLocalMap();
                        Modifier modifierMaterializeModifier7 = ComposedModifierKt.materializeModifier(composer3, modifierFillMaxWidth$default3);
                        Function0<ComposeUiNode> constructor7 = r12.getConstructor();
                        if (composer3.getApplier() == null) {
                            ComposablesKt.invalidApplier();
                        }
                        composer3.startReusableNode();
                        if (composer3.getInserting()) {
                            composer3.createNode(constructor7);
                        } else {
                            composer3.useNode();
                        }
                        Composer composerM4318constructorimpl7 = Updater.m4318constructorimpl(composer3);
                        mr.z(r12, composerM4318constructorimpl7, measurePolicyRowMeasurePolicy4, composerM4318constructorimpl7, currentCompositionLocalMap7);
                        Updater.m4326setimpl(composerM4318constructorimpl7, modifierMaterializeModifier7, (Function2<? super T, ? super Modifier, Unit>) id.h(r12, composerM4318constructorimpl7, Integer.valueOf(i19), composerM4318constructorimpl7));
                        int i20 = i11;
                        Modifier.Companion companion10 = companion4;
                        Composer composer4 = composer3;
                        TextKt.m3048TextNvy7gAk(serverConfig3.getUsername(), zs1.E(rowScopeInstance, companion10, 1.0f, false, 2, null), Color.m5151copywmQWz5c$default(materialTheme.getColorScheme(composer3, i20).getOnSurface(), 0.6f, 0.0f, 0.0f, 0.0f, 14, null), null, 0L, null, null, null, 0L, null, null, 0L, companion8.m7761getEllipsisgIe3tQ8(), false, 1, 0, null, materialTheme.getTypography(composer3, i20).getLabelSmall(), composer4, 0, 24960, 110584);
                        MeasurePolicy measurePolicyRowMeasurePolicy5 = RowKt.rowMeasurePolicy(arrangement.m712spacedBy0680j_4(Dp.m7813constructorimpl(6.0f)), companion6.getCenterVertically(), composer4, 54);
                        long currentCompositeKeyHashCode8 = ComposablesKt.getCurrentCompositeKeyHashCode(composer4, 0);
                        int i21 = (int) (currentCompositeKeyHashCode8 ^ (currentCompositeKeyHashCode8 >>> 32));
                        CompositionLocalMap currentCompositionLocalMap8 = composer4.getCurrentCompositionLocalMap();
                        Modifier modifierMaterializeModifier8 = ComposedModifierKt.materializeModifier(composer4, companion10);
                        Function0<ComposeUiNode> constructor8 = r12.getConstructor();
                        if (composer4.getApplier() == null) {
                            ComposablesKt.invalidApplier();
                        }
                        composer4.startReusableNode();
                        if (composer4.getInserting()) {
                            composer4.createNode(constructor8);
                        } else {
                            composer4.useNode();
                        }
                        Composer composerM4318constructorimpl8 = Updater.m4318constructorimpl(composer4);
                        mr.z(companion7, composerM4318constructorimpl8, measurePolicyRowMeasurePolicy5, composerM4318constructorimpl8, currentCompositionLocalMap8);
                        Updater.m4326setimpl(composerM4318constructorimpl8, modifierMaterializeModifier8, (Function2<? super T, ? super Modifier, Unit>) id.h(companion7, composerM4318constructorimpl8, Integer.valueOf(i21), composerM4318constructorimpl8));
                        ny1.a(serverPingState, null, TextUnitKt.getSp(11), null, composer4, RendererCapabilities.DECODER_SUPPORT_MASK);
                        if (enabled) {
                            composer4.startReplaceGroup(1618108074);
                            IconKt.m2496Iconww6aTOc(VpnKeyKt.getVpnKey(Icons.INSTANCE.getDefault()), str2, SizeKt.m1064size3ABfNKs(companion10, Dp.m7813constructorimpl(15.0f)), jColor, composer4, RendererCapabilities.DECODER_SUPPORT_MASK, 0);
                            composer4.endReplaceGroup();
                        } else {
                            composer4.startReplaceGroup(1618416400);
                            composer4.endReplaceGroup();
                        }
                        if (i02.w(composer4)) {
                            ComposerKt.traceEventEnd();
                        }
                    } else {
                        composer2.skipToGroupEnd();
                    }
                    return Unit.INSTANCE;
                }
            }, composerStartRestartGroup, 54), composerStartRestartGroup, 805306368, 428);
            composerStartRestartGroup = composerStartRestartGroup;
            if (((Boolean) mutableState3.getValue()).booleanValue()) {
                composerStartRestartGroup.startReplaceGroup(-1652882604);
                boolean zBooleanValue = ((Boolean) mutableState6.getValue()).booleanValue();
                Object objRememberedValue11 = composerStartRestartGroup.rememberedValue();
                if (objRememberedValue11 == companion.getEmpty()) {
                    mutableState = mutableState6;
                    objRememberedValue11 = new zq1(13, mutableState);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue11);
                } else {
                    mutableState = mutableState6;
                }
                Function0 function10 = (Function0) objRememberedValue11;
                Object objRememberedValue12 = composerStartRestartGroup.rememberedValue();
                if (objRememberedValue12 == companion.getEmpty()) {
                    mutableState2 = mutableState3;
                    objRememberedValue12 = new ao0(5, mutableState2, mutableState);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue12);
                } else {
                    mutableState2 = mutableState3;
                }
                Function0 function11 = (Function0) objRememberedValue12;
                boolean z6 = (i3 & 3670016) == 1048576;
                Object objRememberedValue13 = composerStartRestartGroup.rememberedValue();
                if (z6 || objRememberedValue13 == companion.getEmpty()) {
                    function6 = function1;
                    final int i10 = 0;
                    objRememberedValue13 = new Function0() { // from class: sx1
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            int i11 = i10;
                            MutableState mutableState10 = mutableState;
                            MutableState mutableState11 = mutableState2;
                            Function0 function12 = function6;
                            switch (i11) {
                                case 0:
                                    Boolean bool = Boolean.FALSE;
                                    mutableState11.setValue(bool);
                                    mutableState10.setValue(bool);
                                    function12.invoke();
                                    break;
                                case 1:
                                    Boolean bool2 = Boolean.FALSE;
                                    mutableState11.setValue(bool2);
                                    mutableState10.setValue(bool2);
                                    function12.invoke();
                                    break;
                                case 2:
                                    Boolean bool3 = Boolean.FALSE;
                                    mutableState11.setValue(bool3);
                                    mutableState10.setValue(bool3);
                                    function12.invoke();
                                    break;
                                default:
                                    Boolean bool4 = Boolean.FALSE;
                                    mutableState11.setValue(bool4);
                                    mutableState10.setValue(bool4);
                                    function12.invoke();
                                    break;
                            }
                            return Unit.INSTANCE;
                        }
                    };
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue13);
                } else {
                    function6 = function1;
                }
                Function0 function12 = (Function0) objRememberedValue13;
                boolean z7 = (i3 & 29360128) == 8388608;
                Object objRememberedValue14 = composerStartRestartGroup.rememberedValue();
                if (z7 || objRememberedValue14 == companion.getEmpty()) {
                    final int i11 = 1;
                    objRememberedValue14 = new Function0() { // from class: sx1
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            int i12 = i11;
                            MutableState mutableState10 = mutableState;
                            MutableState mutableState11 = mutableState2;
                            Function0 function13 = function2;
                            switch (i12) {
                                case 0:
                                    Boolean bool = Boolean.FALSE;
                                    mutableState11.setValue(bool);
                                    mutableState10.setValue(bool);
                                    function13.invoke();
                                    break;
                                case 1:
                                    Boolean bool2 = Boolean.FALSE;
                                    mutableState11.setValue(bool2);
                                    mutableState10.setValue(bool2);
                                    function13.invoke();
                                    break;
                                case 2:
                                    Boolean bool3 = Boolean.FALSE;
                                    mutableState11.setValue(bool3);
                                    mutableState10.setValue(bool3);
                                    function13.invoke();
                                    break;
                                default:
                                    Boolean bool4 = Boolean.FALSE;
                                    mutableState11.setValue(bool4);
                                    mutableState10.setValue(bool4);
                                    function13.invoke();
                                    break;
                            }
                            return Unit.INSTANCE;
                        }
                    };
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue14);
                }
                Function0 function13 = (Function0) objRememberedValue14;
                boolean z8 = (i3 & 234881024) == 67108864;
                Object objRememberedValue15 = composerStartRestartGroup.rememberedValue();
                if (z8 || objRememberedValue15 == companion.getEmpty()) {
                    final int i12 = 2;
                    objRememberedValue15 = new Function0() { // from class: sx1
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            int i13 = i12;
                            MutableState mutableState10 = mutableState;
                            MutableState mutableState11 = mutableState2;
                            Function0 function14 = function3;
                            switch (i13) {
                                case 0:
                                    Boolean bool = Boolean.FALSE;
                                    mutableState11.setValue(bool);
                                    mutableState10.setValue(bool);
                                    function14.invoke();
                                    break;
                                case 1:
                                    Boolean bool2 = Boolean.FALSE;
                                    mutableState11.setValue(bool2);
                                    mutableState10.setValue(bool2);
                                    function14.invoke();
                                    break;
                                case 2:
                                    Boolean bool3 = Boolean.FALSE;
                                    mutableState11.setValue(bool3);
                                    mutableState10.setValue(bool3);
                                    function14.invoke();
                                    break;
                                default:
                                    Boolean bool4 = Boolean.FALSE;
                                    mutableState11.setValue(bool4);
                                    mutableState10.setValue(bool4);
                                    function14.invoke();
                                    break;
                            }
                            return Unit.INSTANCE;
                        }
                    };
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue15);
                }
                Function0 function14 = (Function0) objRememberedValue15;
                boolean z9 = (i7 & 14) == 4;
                Object objRememberedValue16 = composerStartRestartGroup.rememberedValue();
                if (z9 || objRememberedValue16 == companion.getEmpty()) {
                    final int i13 = 3;
                    function7 = function4;
                    objRememberedValue16 = new Function0() { // from class: sx1
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            int i14 = i13;
                            MutableState mutableState10 = mutableState;
                            MutableState mutableState11 = mutableState2;
                            Function0 function15 = function7;
                            switch (i14) {
                                case 0:
                                    Boolean bool = Boolean.FALSE;
                                    mutableState11.setValue(bool);
                                    mutableState10.setValue(bool);
                                    function15.invoke();
                                    break;
                                case 1:
                                    Boolean bool2 = Boolean.FALSE;
                                    mutableState11.setValue(bool2);
                                    mutableState10.setValue(bool2);
                                    function15.invoke();
                                    break;
                                case 2:
                                    Boolean bool3 = Boolean.FALSE;
                                    mutableState11.setValue(bool3);
                                    mutableState10.setValue(bool3);
                                    function15.invoke();
                                    break;
                                default:
                                    Boolean bool4 = Boolean.FALSE;
                                    mutableState11.setValue(bool4);
                                    mutableState10.setValue(bool4);
                                    function15.invoke();
                                    break;
                            }
                            return Unit.INSTANCE;
                        }
                    };
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue16);
                } else {
                    function7 = function4;
                }
                Function0 function15 = (Function0) objRememberedValue16;
                Object objRememberedValue17 = composerStartRestartGroup.rememberedValue();
                if (objRememberedValue17 == companion.getEmpty()) {
                    objRememberedValue17 = new ii(mutableState2, mutableState, mutableState4, 11);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue17);
                }
                C(zBooleanValue, function10, function11, function12, function13, function14, z2, function15, (Function0) objRememberedValue17, composerStartRestartGroup, (3670016 & (i3 >> 9)) | 100663728);
                composerStartRestartGroup.endReplaceGroup();
            } else {
                function6 = function1;
                function7 = function4;
                composerStartRestartGroup.startReplaceGroup(-1651644836);
                composerStartRestartGroup.endReplaceGroup();
            }
            composerStartRestartGroup.endNode();
            if (((Boolean) mutableState4.getValue()).booleanValue()) {
                composerStartRestartGroup.startReplaceGroup(1441488989);
                Object objRememberedValue18 = composerStartRestartGroup.rememberedValue();
                if (objRememberedValue18 == companion.getEmpty()) {
                    objRememberedValue18 = new zq1(11, mutableState4);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue18);
                }
                BackHandlerKt.BackHandler(false, (Function0) objRememberedValue18, composerStartRestartGroup, 48, 1);
                Object objRememberedValue19 = composerStartRestartGroup.rememberedValue();
                if (objRememberedValue19 == companion.getEmpty()) {
                    objRememberedValue19 = new zq1(12, mutableState4);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue19);
                }
                AndroidDialog_androidKt.Dialog((Function0) objRememberedValue19, null, ComposableLambdaKt.rememberComposableLambda(-953638030, true, new qx1(serverConfig2, function8, mutableState4, 0), composerStartRestartGroup, 54), composerStartRestartGroup, 390, 2);
                composerStartRestartGroup.endReplaceGroup();
            } else {
                composerStartRestartGroup.startReplaceGroup(1443830946);
                composerStartRestartGroup.endReplaceGroup();
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            function6 = function1;
            function7 = function4;
            function8 = function5;
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new xg1(serverConfig2, proxyConfig, serverPingState, z, focusRequester, function0, function6, function2, function3, z2, function7, function8, i, i2));
        }
    }

    public static final void e(MutableState mutableState, boolean z) {
        mutableState.setValue(Boolean.valueOf(z));
    }

    public static final void f(MutableState mutableState, boolean z) {
        mutableState.setValue(Boolean.valueOf(z));
    }

    /* JADX WARN: Failed to calculate best type for var: r1v134 Object
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r1v134 Object, new type: boolean
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.calculateFromBounds(FixTypesVisitor.java:159)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.setBestType(FixTypesVisitor.java:136)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.deduceType(FixTypesVisitor.java:241)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryDeduceTypes(FixTypesVisitor.java:224)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
    Caused by: java.lang.NullPointerException
     */
    /* JADX WARN: Failed to calculate best type for var: r1v134 Object
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r1v134 Object, new type: boolean
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1511)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException
     */
    /* JADX WARN: Failed to calculate best type for var: r1v135 Object
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r1v135 Object, new type: boolean
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1511)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException
     */
    /* JADX WARN: Failed to calculate best type for var: r1v417 Object
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r1v417 Object, new type: boolean
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1511)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException
     */
    /* JADX WARN: Failed to calculate best type for var: r6v45 Object
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r6v45 Object, new type: boolean
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1511)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException
     */
    /* JADX WARN: Failed to calculate best type for var: r6v46 Object
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r6v46 Object, new type: boolean
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1511)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException
     */
    /* JADX WARN: Failed to calculate best type for var: r6v47 Object
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r6v47 Object, new type: boolean
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1511)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException
     */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    /*  JADX ERROR: Types fix failed
        jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r1v134 Object, new type: boolean
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryPossibleTypes(FixTypesVisitor.java:186)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.deduceType(FixTypesVisitor.java:245)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryDeduceTypes(FixTypesVisitor.java:224)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
        Caused by: java.lang.NullPointerException
        */
    public static final void g(kotlin.jvm.functions.Function1 r136, kotlin.jvm.functions.Function0 r137, kotlin.jvm.functions.Function1 r138, kotlin.jvm.functions.Function0 r139, kotlin.jvm.functions.Function0 r140, kotlin.jvm.functions.Function0 r141, boolean r142, kotlin.jvm.functions.Function0 r143, defpackage.hy1 r144, androidx.compose.runtime.Composer r145, int r146) {
        /*
            Method dump skipped, instruction units count: 7332
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.gy1.g(kotlin.jvm.functions.Function1, kotlin.jvm.functions.Function0, kotlin.jvm.functions.Function1, kotlin.jvm.functions.Function0, kotlin.jvm.functions.Function0, kotlin.jvm.functions.Function0, boolean, kotlin.jvm.functions.Function0, hy1, androidx.compose.runtime.Composer, int):void");
    }

    public static final t91 h(State state) {
        return (t91) state.getValue();
    }

    public static final ye2 i(State state) {
        return (ye2) state.getValue();
    }

    public static final i92 j(State state) {
        return (i92) state.getValue();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final String k(MutableState mutableState) {
        return (String) mutableState.getValue();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final boolean l(MutableState mutableState) {
        return ((Boolean) mutableState.getValue()).booleanValue();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final boolean m(MutableState mutableState) {
        return ((Boolean) mutableState.getValue()).booleanValue();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final boolean n(MutableState mutableState) {
        return ((Boolean) mutableState.getValue()).booleanValue();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final boolean o(MutableState mutableState) {
        return ((Boolean) mutableState.getValue()).booleanValue();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final boolean p(MutableState mutableState) {
        return ((Boolean) mutableState.getValue()).booleanValue();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final boolean q(MutableState mutableState) {
        return ((Boolean) mutableState.getValue()).booleanValue();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final boolean r(MutableState mutableState) {
        return ((Boolean) mutableState.getValue()).booleanValue();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final boolean s(MutableState mutableState) {
        return ((Boolean) mutableState.getValue()).booleanValue();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final boolean t(MutableState mutableState) {
        return ((Boolean) mutableState.getValue()).booleanValue();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final boolean u(MutableState mutableState) {
        return ((Boolean) mutableState.getValue()).booleanValue();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final boolean v(MutableState mutableState) {
        return ((Boolean) mutableState.getValue()).booleanValue();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final boolean w(MutableState mutableState) {
        return ((Boolean) mutableState.getValue()).booleanValue();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final boolean x(MutableState mutableState) {
        return ((Boolean) mutableState.getValue()).booleanValue();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final boolean y(MutableState mutableState) {
        return ((Boolean) mutableState.getValue()).booleanValue();
    }

    public static final List z(State state) {
        return (List) state.getValue();
    }
}
