package defpackage;

import android.content.Context;
import androidx.activity.compose.ActivityResultRegistryKt;
import androidx.activity.compose.BackHandlerKt;
import androidx.activity.result.contract.ActivityResultContracts;
import androidx.compose.foundation.ScrollKt;
import androidx.compose.foundation.ScrollState;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnScopeInstance;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.material3.AndroidAlertDialog_androidKt;
import androidx.compose.material3.MaterialTheme;
import androidx.compose.material3.ProgressIndicatorKt;
import androidx.compose.material3.TextKt;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambda;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.focus.FocusChangedModifierKt;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.ui.unit.Dp;
import androidx.media3.exoplayer.RendererCapabilities;

import kotlin.Unit;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.ranges.RangesKt;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: loaded from: classes4.dex */
public abstract class bd {
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v4 */
    /* JADX WARN: Type inference failed for: r2v5, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r2v8 */
    /* JADX WARN: Type inference failed for: r30v0 */
    /* JADX WARN: Type inference failed for: r30v1 */
    /* JADX WARN: Type inference failed for: r7v12 */
    /* JADX WARN: Type inference failed for: r7v13 */
    /* JADX WARN: Type inference failed for: r7v14 */
    /* JADX WARN: Type inference failed for: r7v7 */
    /* JADX WARN: Type inference failed for: r7v8, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r8v23 */
    /* JADX WARN: Type inference failed for: r8v5 */
    /* JADX WARN: Type inference failed for: r8v6 */
    /* JADX WARN: Type inference failed for: r9v4 */
    /* JADX WARN: Type inference failed for: r9v5 */
    /* JADX WARN: Type inference failed for: r9v7 */
    public static final void a(final vc vcVar, Composer composer, int i) {
        int i2;
        int i3;
        int i4;
        Object r2;
        int i5;
        final int i6;
        final Object r7;
        vcVar.getClass();
        MutableState mutableState = vcVar.g;
        Composer composerStartRestartGroup = composer.startRestartGroup(-2033521774);
        if ((i & 6) == 0) {
            i2 = (composerStartRestartGroup.changed(vcVar) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        int i7 = 0;
        if (composerStartRestartGroup.shouldExecute((i2 & 3) != 2, i2 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-2033521774, i2, -1, "com.dh.myembyapp.ui.components.AppUpdateDialogs (AppUpdateSupport.kt:435)");
            }
            boolean zE = vcVar.e();
            int i8 = i2 & 14;
            Object r8 = i8 == 4;
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            if (r8 != false || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                objRememberedValue = new wc(vcVar, i7);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            BackHandlerKt.BackHandler(zE, (Function0) objRememberedValue, composerStartRestartGroup, 0, 0);
            if (((Boolean) vcVar.e.getValue()).booleanValue()) {
                composerStartRestartGroup.startReplaceGroup(-133277120);
                Object objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                if (objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                    objRememberedValue2 = new b1(15);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                }
                i4 = 4;
                i3 = i8;
                AndroidAlertDialog_androidKt.m2041AlertDialogOix01E0((Function0) objRememberedValue2, ts.a, null, null, null, ts.b, ts.c, null, 0L, 0L, 0L, 0L, 0.0f, null, composerStartRestartGroup, 1769526, 0, 16284);
                composerStartRestartGroup = composerStartRestartGroup;
                composerStartRestartGroup.endReplaceGroup();
            } else {
                i3 = i8;
                i4 = 4;
                composerStartRestartGroup.startReplaceGroup(-132892720);
                composerStartRestartGroup.endReplaceGroup();
            }
            if (vcVar.e()) {
                composerStartRestartGroup.startReplaceGroup(-132793768);
                boolean z = i3 == i4;
                Object objRememberedValue3 = composerStartRestartGroup.rememberedValue();
                if (z || objRememberedValue3 == Composer.INSTANCE.getEmpty()) {
                    r7 = 1;
                    objRememberedValue3 = new wc(vcVar, 1 == true ? 1 : 0);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
                } else {
                    r7 = 1;
                }
                final int i9 = 0;
                ComposableLambda composableLambdaRememberComposableLambda = ComposableLambdaKt.rememberComposableLambda(1657267144, r7, new Function2() { // from class: xc
                    /* JADX WARN: Multi-variable type inference failed */
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        int i10 = i9;
                        vc vcVar2 = vcVar;
                        switch (i10) {
                            case 0:
                                Composer composer2 = (Composer) obj;
                                int iIntValue = ((Integer) obj2).intValue();
                                if (composer2.shouldExecute((iIntValue & 3) != 2, iIntValue & 1)) {
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventStart(1657267144, iIntValue, -1, "com.dh.myembyapp.ui.components.AppUpdateDialogs.<anonymous> (AppUpdateSupport.kt:481)");
                                    }
                                    Object objRememberedValue4 = composer2.rememberedValue();
                                    Composer.Companion companion = Composer.INSTANCE;
                                    if (objRememberedValue4 == companion.getEmpty()) {
                                        objRememberedValue4 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Boolean.FALSE, null, 2, null);
                                        composer2.updateRememberedValue(objRememberedValue4);
                                    }
                                    MutableState mutableState2 = (MutableState) objRememberedValue4;
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventStart(-175699322, 6, -1, "com.dh.myembyapp.ui.theme.MyEmbyTheme.<get-colors> (Theme.kt:122)");
                                    }
                                    u61 u61Var = (u61) composer2.consume(n72.b);
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventEnd();
                                    }
                                    ButtonColors buttonColorsI = hc2.i(jc2.c, false, composer2, 6, 2);
                                    ButtonScale buttonScaleL = hc2.l(1.05f);
                                    ButtonGlow buttonGlowA = el0.a(u61Var);
                                    ButtonBorder buttonBorderH = hc2.h(composer2);
                                    Modifier.Companion companion2 = Modifier.INSTANCE;
                                    Object objRememberedValue5 = composer2.rememberedValue();
                                    if (objRememberedValue5 == companion.getEmpty()) {
                                        objRememberedValue5 = new t1(27, mutableState2);
                                        composer2.updateRememberedValue(objRememberedValue5);
                                    }
                                    Modifier modifierM1071widthInVpY3zN4$default = SizeKt.m1071widthInVpY3zN4$default(FocusChangedModifierKt.onFocusChanged(companion2, (Function1) objRememberedValue5), Dp.m7813constructorimpl(96.0f), 0.0f, 2, null);
                                    boolean zChanged = composer2.changed(vcVar2);
                                    Object objRememberedValue6 = composer2.rememberedValue();
                                    if (zChanged || objRememberedValue6 == companion.getEmpty()) {
                                        objRememberedValue6 = new wc(vcVar2, 5);
                                        composer2.updateRememberedValue(objRememberedValue6);
                                    }
                                    ButtonKt.m8231ButtonTCVpFMg((Function0) objRememberedValue6, modifierM1071widthInVpY3zN4$default, null, false, buttonScaleL, buttonGlowA, null, buttonColorsI, 0.0f, buttonBorderH, null, null, ComposableLambdaKt.rememberComposableLambda(-1637224008, true, new p1(6, mutableState2), composer2, 54), composer2, 0, RendererCapabilities.DECODER_SUPPORT_MASK, 3404);
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventEnd();
                                    }
                                } else {
                                    composer2.skipToGroupEnd();
                                }
                                break;
                            case 1:
                                Composer composer3 = (Composer) obj;
                                int iIntValue2 = ((Integer) obj2).intValue();
                                if (composer3.shouldExecute((iIntValue2 & 3) != 2, iIntValue2 & 1)) {
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventStart(295085709, iIntValue2, -1, "com.dh.myembyapp.ui.components.AppUpdateDialogs.<anonymous> (AppUpdateSupport.kt:461)");
                                    }
                                    Modifier.Companion companion3 = Modifier.INSTANCE;
                                    Modifier modifierFillMaxWidth$default = SizeKt.fillMaxWidth$default(companion3, 0.0f, 1, null);
                                    MeasurePolicy measurePolicyColumnMeasurePolicy = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.m712spacedBy0680j_4(Dp.m7813constructorimpl(10.0f)), Alignment.INSTANCE.getStart(), composer3, 6);
                                    long currentCompositeKeyHashCode = ComposablesKt.getCurrentCompositeKeyHashCode(composer3, 0);
                                    int i11 = (int) (currentCompositeKeyHashCode ^ (currentCompositeKeyHashCode >>> 32));
                                    CompositionLocalMap currentCompositionLocalMap = composer3.getCurrentCompositionLocalMap();
                                    Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(composer3, modifierFillMaxWidth$default);
                                    ComposeUiNode.Companion companion4 = ComposeUiNode.INSTANCE;
                                    Function0<ComposeUiNode> constructor = companion4.getConstructor();
                                    if (composer3.getApplier() == null) {
                                        ComposablesKt.invalidApplier();
                                    }
                                    composer3.startReusableNode();
                                    if (composer3.getInserting()) {
                                        composer3.createNode(constructor);
                                    } else {
                                        composer3.useNode();
                                    }
                                    Composer composerM4318constructorimpl = Updater.m4318constructorimpl(composer3);
                                    mr.z(companion4, composerM4318constructorimpl, measurePolicyColumnMeasurePolicy, composerM4318constructorimpl, currentCompositionLocalMap);
                                    Updater.m4326setimpl(composerM4318constructorimpl, modifierMaterializeModifier, (Function2<? super T, ? super Modifier, Unit>) id.h(companion4, composerM4318constructorimpl, Integer.valueOf(i11), composerM4318constructorimpl));
                                    ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.INSTANCE;
                                    boolean zChanged2 = composer3.changed(vcVar2);
                                    Object objRememberedValue7 = composer3.rememberedValue();
                                    if (zChanged2 || objRememberedValue7 == Composer.INSTANCE.getEmpty()) {
                                        objRememberedValue7 = new wc(vcVar2, 4);
                                        composer3.updateRememberedValue(objRememberedValue7);
                                    }
                                    ProgressIndicatorKt.m2711LinearProgressIndicatorGJbTh5U((Function0) objRememberedValue7, SizeKt.fillMaxWidth$default(companion3, 0.0f, 1, null), 0L, 0L, 0, 0.0f, null, composer3, 48, Input.Keys.INSERT);
                                    String str = RangesKt.coerceIn(vcVar2.n.getIntValue(), 0, 100) + "%";
                                    MaterialTheme materialTheme = MaterialTheme.INSTANCE;
                                    int i12 = MaterialTheme.$stable;
                                    TextKt.m3048TextNvy7gAk(str, null, 0L, null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, materialTheme.getTypography(composer3, i12).getBodyMedium(), composer3, 0, 0, 131070);
                                    TextKt.m3048TextNvy7gAk("按返回键或选择“取消下载”可中断当前下载", null, Color.m5151copywmQWz5c$default(materialTheme.getColorScheme(composer3, i12).getOnSurface(), 0.7f, 0.0f, 0.0f, 0.0f, 14, null), null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, materialTheme.getTypography(composer3, i12).getBodySmall(), composer3, 6, 0, 131066);
                                    composer3.endNode();
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventEnd();
                                    }
                                } else {
                                    composer3.skipToGroupEnd();
                                }
                                break;
                            default:
                                Composer composer4 = (Composer) obj;
                                int iIntValue3 = ((Integer) obj2).intValue();
                                if (composer4.shouldExecute((iIntValue3 & 3) != 2, iIntValue3 & 1)) {
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventStart(-365832341, iIntValue3, -1, "com.dh.myembyapp.ui.components.AppUpdateDialogs.<anonymous> (AppUpdateSupport.kt:519)");
                                    }
                                    String str2 = (String) vcVar2.g.getValue();
                                    if (str2 == null) {
                                        str2 = "";
                                    }
                                    TextKt.m3048TextNvy7gAk(str2, null, 0L, null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, composer4, 0, 0, 262142);
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventEnd();
                                    }
                                } else {
                                    composer4.skipToGroupEnd();
                                }
                                break;
                        }
                        return Unit.INSTANCE;
                    }
                }, composerStartRestartGroup, 54);
                ComposableLambda composableLambda = ts.d;
                ComposableLambda composableLambdaRememberComposableLambda2 = ComposableLambdaKt.rememberComposableLambda(295085709, r7, new Function2() { // from class: xc
                    /* JADX WARN: Multi-variable type inference failed */
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        int i10 = r7;
                        vc vcVar2 = vcVar;
                        switch (i10) {
                            case 0:
                                Composer composer2 = (Composer) obj;
                                int iIntValue = ((Integer) obj2).intValue();
                                if (composer2.shouldExecute((iIntValue & 3) != 2, iIntValue & 1)) {
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventStart(1657267144, iIntValue, -1, "com.dh.myembyapp.ui.components.AppUpdateDialogs.<anonymous> (AppUpdateSupport.kt:481)");
                                    }
                                    Object objRememberedValue4 = composer2.rememberedValue();
                                    Composer.Companion companion = Composer.INSTANCE;
                                    if (objRememberedValue4 == companion.getEmpty()) {
                                        objRememberedValue4 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Boolean.FALSE, null, 2, null);
                                        composer2.updateRememberedValue(objRememberedValue4);
                                    }
                                    MutableState mutableState2 = (MutableState) objRememberedValue4;
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventStart(-175699322, 6, -1, "com.dh.myembyapp.ui.theme.MyEmbyTheme.<get-colors> (Theme.kt:122)");
                                    }
                                    u61 u61Var = (u61) composer2.consume(n72.b);
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventEnd();
                                    }
                                    ButtonColors buttonColorsI = hc2.i(jc2.c, false, composer2, 6, 2);
                                    ButtonScale buttonScaleL = hc2.l(1.05f);
                                    ButtonGlow buttonGlowA = el0.a(u61Var);
                                    ButtonBorder buttonBorderH = hc2.h(composer2);
                                    Modifier.Companion companion2 = Modifier.INSTANCE;
                                    Object objRememberedValue5 = composer2.rememberedValue();
                                    if (objRememberedValue5 == companion.getEmpty()) {
                                        objRememberedValue5 = new t1(27, mutableState2);
                                        composer2.updateRememberedValue(objRememberedValue5);
                                    }
                                    Modifier modifierM1071widthInVpY3zN4$default = SizeKt.m1071widthInVpY3zN4$default(FocusChangedModifierKt.onFocusChanged(companion2, (Function1) objRememberedValue5), Dp.m7813constructorimpl(96.0f), 0.0f, 2, null);
                                    boolean zChanged = composer2.changed(vcVar2);
                                    Object objRememberedValue6 = composer2.rememberedValue();
                                    if (zChanged || objRememberedValue6 == companion.getEmpty()) {
                                        objRememberedValue6 = new wc(vcVar2, 5);
                                        composer2.updateRememberedValue(objRememberedValue6);
                                    }
                                    ButtonKt.m8231ButtonTCVpFMg((Function0) objRememberedValue6, modifierM1071widthInVpY3zN4$default, null, false, buttonScaleL, buttonGlowA, null, buttonColorsI, 0.0f, buttonBorderH, null, null, ComposableLambdaKt.rememberComposableLambda(-1637224008, true, new p1(6, mutableState2), composer2, 54), composer2, 0, RendererCapabilities.DECODER_SUPPORT_MASK, 3404);
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventEnd();
                                    }
                                } else {
                                    composer2.skipToGroupEnd();
                                }
                                break;
                            case 1:
                                Composer composer3 = (Composer) obj;
                                int iIntValue2 = ((Integer) obj2).intValue();
                                if (composer3.shouldExecute((iIntValue2 & 3) != 2, iIntValue2 & 1)) {
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventStart(295085709, iIntValue2, -1, "com.dh.myembyapp.ui.components.AppUpdateDialogs.<anonymous> (AppUpdateSupport.kt:461)");
                                    }
                                    Modifier.Companion companion3 = Modifier.INSTANCE;
                                    Modifier modifierFillMaxWidth$default = SizeKt.fillMaxWidth$default(companion3, 0.0f, 1, null);
                                    MeasurePolicy measurePolicyColumnMeasurePolicy = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.m712spacedBy0680j_4(Dp.m7813constructorimpl(10.0f)), Alignment.INSTANCE.getStart(), composer3, 6);
                                    long currentCompositeKeyHashCode = ComposablesKt.getCurrentCompositeKeyHashCode(composer3, 0);
                                    int i11 = (int) (currentCompositeKeyHashCode ^ (currentCompositeKeyHashCode >>> 32));
                                    CompositionLocalMap currentCompositionLocalMap = composer3.getCurrentCompositionLocalMap();
                                    Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(composer3, modifierFillMaxWidth$default);
                                    ComposeUiNode.Companion companion4 = ComposeUiNode.INSTANCE;
                                    Function0<ComposeUiNode> constructor = companion4.getConstructor();
                                    if (composer3.getApplier() == null) {
                                        ComposablesKt.invalidApplier();
                                    }
                                    composer3.startReusableNode();
                                    if (composer3.getInserting()) {
                                        composer3.createNode(constructor);
                                    } else {
                                        composer3.useNode();
                                    }
                                    Composer composerM4318constructorimpl = Updater.m4318constructorimpl(composer3);
                                    mr.z(companion4, composerM4318constructorimpl, measurePolicyColumnMeasurePolicy, composerM4318constructorimpl, currentCompositionLocalMap);
                                    Updater.m4326setimpl(composerM4318constructorimpl, modifierMaterializeModifier, (Function2<? super T, ? super Modifier, Unit>) id.h(companion4, composerM4318constructorimpl, Integer.valueOf(i11), composerM4318constructorimpl));
                                    ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.INSTANCE;
                                    boolean zChanged2 = composer3.changed(vcVar2);
                                    Object objRememberedValue7 = composer3.rememberedValue();
                                    if (zChanged2 || objRememberedValue7 == Composer.INSTANCE.getEmpty()) {
                                        objRememberedValue7 = new wc(vcVar2, 4);
                                        composer3.updateRememberedValue(objRememberedValue7);
                                    }
                                    ProgressIndicatorKt.m2711LinearProgressIndicatorGJbTh5U((Function0) objRememberedValue7, SizeKt.fillMaxWidth$default(companion3, 0.0f, 1, null), 0L, 0L, 0, 0.0f, null, composer3, 48, Input.Keys.INSERT);
                                    String str = RangesKt.coerceIn(vcVar2.n.getIntValue(), 0, 100) + "%";
                                    MaterialTheme materialTheme = MaterialTheme.INSTANCE;
                                    int i12 = MaterialTheme.$stable;
                                    TextKt.m3048TextNvy7gAk(str, null, 0L, null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, materialTheme.getTypography(composer3, i12).getBodyMedium(), composer3, 0, 0, 131070);
                                    TextKt.m3048TextNvy7gAk("按返回键或选择“取消下载”可中断当前下载", null, Color.m5151copywmQWz5c$default(materialTheme.getColorScheme(composer3, i12).getOnSurface(), 0.7f, 0.0f, 0.0f, 0.0f, 14, null), null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, materialTheme.getTypography(composer3, i12).getBodySmall(), composer3, 6, 0, 131066);
                                    composer3.endNode();
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventEnd();
                                    }
                                } else {
                                    composer3.skipToGroupEnd();
                                }
                                break;
                            default:
                                Composer composer4 = (Composer) obj;
                                int iIntValue3 = ((Integer) obj2).intValue();
                                if (composer4.shouldExecute((iIntValue3 & 3) != 2, iIntValue3 & 1)) {
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventStart(-365832341, iIntValue3, -1, "com.dh.myembyapp.ui.components.AppUpdateDialogs.<anonymous> (AppUpdateSupport.kt:519)");
                                    }
                                    String str2 = (String) vcVar2.g.getValue();
                                    if (str2 == null) {
                                        str2 = "";
                                    }
                                    TextKt.m3048TextNvy7gAk(str2, null, 0L, null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, composer4, 0, 0, 262142);
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventEnd();
                                    }
                                } else {
                                    composer4.skipToGroupEnd();
                                }
                                break;
                        }
                        return Unit.INSTANCE;
                    }
                }, composerStartRestartGroup, 54);
                Composer composer2 = composerStartRestartGroup;
                r2 = r7 == true ? 1 : 0;
                AndroidAlertDialog_androidKt.m2041AlertDialogOix01E0((Function0) objRememberedValue3, composableLambdaRememberComposableLambda, null, null, null, composableLambda, composableLambdaRememberComposableLambda2, null, 0L, 0L, 0L, 0L, 0.0f, null, composer2, 1769520, 0, 16284);
                composerStartRestartGroup = composer2;
                composerStartRestartGroup.endReplaceGroup();
            } else {
                r2 = 1;
                composerStartRestartGroup.startReplaceGroup(-130864080);
                composerStartRestartGroup.endReplaceGroup();
            }
            if (((String) mutableState.getValue()) == null || vcVar.e()) {
                composerStartRestartGroup.startReplaceGroup(-127178800);
                composerStartRestartGroup.endReplaceGroup();
            } else {
                composerStartRestartGroup.startReplaceGroup(-130684528);
                ScrollState scrollStateRememberScrollState = ScrollKt.rememberScrollState(0, composerStartRestartGroup, 0, r2);
                Object objRememberedValue4 = composerStartRestartGroup.rememberedValue();
                Composer.Companion companion = Composer.INSTANCE;
                if (objRememberedValue4 == companion.getEmpty()) {
                    objRememberedValue4 = EffectsKt.createCompositionCoroutineScope(EmptyCoroutineContext.INSTANCE, composerStartRestartGroup);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue4);
                }
                CoroutineScope coroutineScope = (CoroutineScope) objRememberedValue4;
                String str = (String) mutableState.getValue();
                String str2 = (String) vcVar.h.getValue();
                boolean zChanged = composerStartRestartGroup.changed(scrollStateRememberScrollState);
                Object objRememberedValue5 = composerStartRestartGroup.rememberedValue();
                if (zChanged || objRememberedValue5 == companion.getEmpty()) {
                    i5 = 0;
                    objRememberedValue5 = new zc(scrollStateRememberScrollState, null, 0);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue5);
                } else {
                    i5 = 0;
                }
                EffectsKt.LaunchedEffect(str, str2, (Function2) objRememberedValue5, composerStartRestartGroup, i5);
                Object r9 = i3 == 4 ? r2 : 0;
                Object objRememberedValue6 = composerStartRestartGroup.rememberedValue();
                if (r9 != 0 || objRememberedValue6 == companion.getEmpty()) {
                    i6 = 2;
                    objRememberedValue6 = new wc(vcVar, i6);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue6);
                } else {
                    i6 = 2;
                }
                Composer composer3 = composerStartRestartGroup;
                AndroidAlertDialog_androidKt.m2041AlertDialogOix01E0((Function0) objRememberedValue6, ComposableLambdaKt.rememberComposableLambda(723912807, r2, new r5(coroutineScope, scrollStateRememberScrollState, vcVar, i6), composerStartRestartGroup, 54), null, null, null, ComposableLambdaKt.rememberComposableLambda(-365832341, r2, new Function2() { // from class: xc
                    /* JADX WARN: Multi-variable type inference failed */
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        int i10 = i6;
                        vc vcVar2 = vcVar;
                        switch (i10) {
                            case 0:
                                Composer composer4 = (Composer) obj;
                                int iIntValue = ((Integer) obj2).intValue();
                                if (composer4.shouldExecute((iIntValue & 3) != 2, iIntValue & 1)) {
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventStart(1657267144, iIntValue, -1, "com.dh.myembyapp.ui.components.AppUpdateDialogs.<anonymous> (AppUpdateSupport.kt:481)");
                                    }
                                    Object objRememberedValue7 = composer4.rememberedValue();
                                    Composer.Companion companion2 = Composer.INSTANCE;
                                    if (objRememberedValue7 == companion2.getEmpty()) {
                                        objRememberedValue7 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Boolean.FALSE, null, 2, null);
                                        composer4.updateRememberedValue(objRememberedValue7);
                                    }
                                    MutableState mutableState2 = (MutableState) objRememberedValue7;
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventStart(-175699322, 6, -1, "com.dh.myembyapp.ui.theme.MyEmbyTheme.<get-colors> (Theme.kt:122)");
                                    }
                                    u61 u61Var = (u61) composer4.consume(n72.b);
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventEnd();
                                    }
                                    ButtonColors buttonColorsI = hc2.i(jc2.c, false, composer4, 6, 2);
                                    ButtonScale buttonScaleL = hc2.l(1.05f);
                                    ButtonGlow buttonGlowA = el0.a(u61Var);
                                    ButtonBorder buttonBorderH = hc2.h(composer4);
                                    Modifier.Companion companion3 = Modifier.INSTANCE;
                                    Object objRememberedValue8 = composer4.rememberedValue();
                                    if (objRememberedValue8 == companion2.getEmpty()) {
                                        objRememberedValue8 = new t1(27, mutableState2);
                                        composer4.updateRememberedValue(objRememberedValue8);
                                    }
                                    Modifier modifierM1071widthInVpY3zN4$default = SizeKt.m1071widthInVpY3zN4$default(FocusChangedModifierKt.onFocusChanged(companion3, (Function1) objRememberedValue8), Dp.m7813constructorimpl(96.0f), 0.0f, 2, null);
                                    boolean zChanged2 = composer4.changed(vcVar2);
                                    Object objRememberedValue9 = composer4.rememberedValue();
                                    if (zChanged2 || objRememberedValue9 == companion2.getEmpty()) {
                                        objRememberedValue9 = new wc(vcVar2, 5);
                                        composer4.updateRememberedValue(objRememberedValue9);
                                    }
                                    ButtonKt.m8231ButtonTCVpFMg((Function0) objRememberedValue9, modifierM1071widthInVpY3zN4$default, null, false, buttonScaleL, buttonGlowA, null, buttonColorsI, 0.0f, buttonBorderH, null, null, ComposableLambdaKt.rememberComposableLambda(-1637224008, true, new p1(6, mutableState2), composer4, 54), composer4, 0, RendererCapabilities.DECODER_SUPPORT_MASK, 3404);
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventEnd();
                                    }
                                } else {
                                    composer4.skipToGroupEnd();
                                }
                                break;
                            case 1:
                                Composer composer5 = (Composer) obj;
                                int iIntValue2 = ((Integer) obj2).intValue();
                                if (composer5.shouldExecute((iIntValue2 & 3) != 2, iIntValue2 & 1)) {
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventStart(295085709, iIntValue2, -1, "com.dh.myembyapp.ui.components.AppUpdateDialogs.<anonymous> (AppUpdateSupport.kt:461)");
                                    }
                                    Modifier.Companion companion4 = Modifier.INSTANCE;
                                    Modifier modifierFillMaxWidth$default = SizeKt.fillMaxWidth$default(companion4, 0.0f, 1, null);
                                    MeasurePolicy measurePolicyColumnMeasurePolicy = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.m712spacedBy0680j_4(Dp.m7813constructorimpl(10.0f)), Alignment.INSTANCE.getStart(), composer5, 6);
                                    long currentCompositeKeyHashCode = ComposablesKt.getCurrentCompositeKeyHashCode(composer5, 0);
                                    int i11 = (int) (currentCompositeKeyHashCode ^ (currentCompositeKeyHashCode >>> 32));
                                    CompositionLocalMap currentCompositionLocalMap = composer5.getCurrentCompositionLocalMap();
                                    Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(composer5, modifierFillMaxWidth$default);
                                    ComposeUiNode.Companion companion5 = ComposeUiNode.INSTANCE;
                                    Function0<ComposeUiNode> constructor = companion5.getConstructor();
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
                                    mr.z(companion5, composerM4318constructorimpl, measurePolicyColumnMeasurePolicy, composerM4318constructorimpl, currentCompositionLocalMap);
                                    Updater.m4326setimpl(composerM4318constructorimpl, modifierMaterializeModifier, (Function2<? super T, ? super Modifier, Unit>) id.h(companion5, composerM4318constructorimpl, Integer.valueOf(i11), composerM4318constructorimpl));
                                    ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.INSTANCE;
                                    boolean zChanged3 = composer5.changed(vcVar2);
                                    Object objRememberedValue10 = composer5.rememberedValue();
                                    if (zChanged3 || objRememberedValue10 == Composer.INSTANCE.getEmpty()) {
                                        objRememberedValue10 = new wc(vcVar2, 4);
                                        composer5.updateRememberedValue(objRememberedValue10);
                                    }
                                    ProgressIndicatorKt.m2711LinearProgressIndicatorGJbTh5U((Function0) objRememberedValue10, SizeKt.fillMaxWidth$default(companion4, 0.0f, 1, null), 0L, 0L, 0, 0.0f, null, composer5, 48, Input.Keys.INSERT);
                                    String str3 = RangesKt.coerceIn(vcVar2.n.getIntValue(), 0, 100) + "%";
                                    MaterialTheme materialTheme = MaterialTheme.INSTANCE;
                                    int i12 = MaterialTheme.$stable;
                                    TextKt.m3048TextNvy7gAk(str3, null, 0L, null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, materialTheme.getTypography(composer5, i12).getBodyMedium(), composer5, 0, 0, 131070);
                                    TextKt.m3048TextNvy7gAk("按返回键或选择“取消下载”可中断当前下载", null, Color.m5151copywmQWz5c$default(materialTheme.getColorScheme(composer5, i12).getOnSurface(), 0.7f, 0.0f, 0.0f, 0.0f, 14, null), null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, materialTheme.getTypography(composer5, i12).getBodySmall(), composer5, 6, 0, 131066);
                                    composer5.endNode();
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventEnd();
                                    }
                                } else {
                                    composer5.skipToGroupEnd();
                                }
                                break;
                            default:
                                Composer composer6 = (Composer) obj;
                                int iIntValue3 = ((Integer) obj2).intValue();
                                if (composer6.shouldExecute((iIntValue3 & 3) != 2, iIntValue3 & 1)) {
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventStart(-365832341, iIntValue3, -1, "com.dh.myembyapp.ui.components.AppUpdateDialogs.<anonymous> (AppUpdateSupport.kt:519)");
                                    }
                                    String str4 = (String) vcVar2.g.getValue();
                                    if (str4 == null) {
                                        str4 = "";
                                    }
                                    TextKt.m3048TextNvy7gAk(str4, null, 0L, null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, composer6, 0, 0, 262142);
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventEnd();
                                    }
                                } else {
                                    composer6.skipToGroupEnd();
                                }
                                break;
                        }
                        return Unit.INSTANCE;
                    }
                }, composerStartRestartGroup, 54), ComposableLambdaKt.rememberComposableLambda(-638268628, r2, new a2(5, scrollStateRememberScrollState, vcVar), composerStartRestartGroup, 54), null, 0L, 0L, 0L, 0L, 0.0f, null, composer3, 1769520, 0, 16284);
                composerStartRestartGroup = composer3;
                composerStartRestartGroup.endReplaceGroup();
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new yc(vcVar, i, 0));
        }
    }

    public static final vc b(Composer composer) {
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-269871473, 0, -1, "com.dh.myembyapp.ui.components.rememberAppUpdateState (AppUpdateSupport.kt:413)");
        }
        Context context = (Context) composer.consume(AndroidCompositionLocals_androidKt.getLocalContext());
        Object objRememberedValue = composer.rememberedValue();
        Composer.Companion companion = Composer.INSTANCE;
        if (objRememberedValue == companion.getEmpty()) {
            objRememberedValue = EffectsKt.createCompositionCoroutineScope(EmptyCoroutineContext.INSTANCE, composer);
            composer.updateRememberedValue(objRememberedValue);
        }
        CoroutineScope coroutineScope = (CoroutineScope) objRememberedValue;
        boolean zChanged = composer.changed(context) | composer.changed(coroutineScope);
        Object objRememberedValue2 = composer.rememberedValue();
        if (zChanged || objRememberedValue2 == companion.getEmpty()) {
            objRememberedValue2 = new vc(context, coroutineScope);
            composer.updateRememberedValue(objRememberedValue2);
        }
        vc vcVar = (vc) objRememberedValue2;
        ActivityResultContracts.StartActivityForResult startActivityForResult = new ActivityResultContracts.StartActivityForResult();
        boolean zChanged2 = composer.changed(vcVar);
        Object objRememberedValue3 = composer.rememberedValue();
        if (zChanged2 || objRememberedValue3 == companion.getEmpty()) {
            objRememberedValue3 = new rc(vcVar, 2);
            composer.updateRememberedValue(objRememberedValue3);
        }
        Object objRememberLauncherForActivityResult = ActivityResultRegistryKt.rememberLauncherForActivityResult(startActivityForResult, (Function1) objRememberedValue3, composer, 0);
        boolean zChanged3 = composer.changed(vcVar) | composer.changedInstance(objRememberLauncherForActivityResult);
        Object objRememberedValue4 = composer.rememberedValue();
        if (zChanged3 || objRememberedValue4 == companion.getEmpty()) {
            objRememberedValue4 = new z7(5, vcVar, objRememberLauncherForActivityResult);
            composer.updateRememberedValue(objRememberedValue4);
        }
        EffectsKt.SideEffect((Function0) objRememberedValue4, composer, 0);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return vcVar;
    }
}
