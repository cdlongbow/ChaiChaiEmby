package defpackage;

import android.content.Context;
import androidx.compose.foundation.BasicMarqueeKt;
import androidx.compose.foundation.BorderStrokeKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.BoxScope;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnScope;
import androidx.compose.foundation.layout.ColumnScopeInstance;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.RowKt;
import androidx.compose.foundation.layout.RowScopeInstance;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.lazy.LazyItemScope;
import androidx.compose.material.icons.Icons;
import androidx.compose.material.icons.automirrored.filled.CompareArrowsKt;
import androidx.compose.material.icons.automirrored.filled.SortKt;
import androidx.compose.material.icons.filled.VisibilityOffKt;
import androidx.compose.material3.MaterialTheme;
import androidx.compose.material3.TextKt;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.ProvidableCompositionLocal;
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
import androidx.compose.ui.geometry.Size;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.ColorKt;
import androidx.compose.ui.graphics.Path;
import androidx.compose.ui.graphics.Shape;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.text.font.FontWeight;
import androidx.compose.ui.text.style.TextOverflow;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.Dp;
import androidx.compose.ui.unit.LayoutDirection;
import androidx.media3.exoplayer.RendererCapabilities;
import androidx.media3.extractor.ts.PsExtractor;
import com.dh.myembyapp.data.model.ItemCounts;
import com.dh.myembyapp.data.preferences.ServerPreferences;
import com.dh.myembyapp.data.preferences.UserPreferences;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class n1 implements Function3 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object g;

    public /* synthetic */ n1(FocusRequester focusRequester, u61 u61Var, c00 c00Var, MutableState mutableState, MutableState mutableState2) {
        this.a = 2;
        this.b = focusRequester;
        this.c = u61Var;
        this.g = c00Var;
        this.d = mutableState;
        this.e = mutableState2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.jvm.functions.Function3
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        Object obj4;
        int i;
        long jU;
        Modifier modifier;
        int i2 = this.a;
        Object obj5 = this.d;
        Object obj6 = this.g;
        Object obj7 = this.e;
        Object obj8 = this.c;
        Object obj9 = this.b;
        switch (i2) {
            case 0:
                FocusRequester focusRequester = (FocusRequester) obj9;
                u61 u61Var = (u61) obj8;
                MutableState mutableState = (MutableState) obj5;
                MutableState mutableState2 = (MutableState) obj7;
                MutableState mutableState3 = (MutableState) obj6;
                Composer composer = (Composer) obj2;
                int iIntValue = ((Integer) obj3).intValue();
                ((LazyItemScope) obj).getClass();
                if (composer.shouldExecute((iIntValue & 17) != 16, iIntValue & 1)) {
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(715650360, iIntValue, -1, "com.dh.myembyapp.ui.screens.addserver.AddServerScreen.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (AddServerScreen.kt:423)");
                    }
                    Object objRememberedValue = composer.rememberedValue();
                    Composer.Companion companion = Composer.INSTANCE;
                    if (objRememberedValue == companion.getEmpty()) {
                        obj4 = null;
                        objRememberedValue = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Boolean.FALSE, null, 2, null);
                        composer.updateRememberedValue(objRememberedValue);
                    } else {
                        obj4 = null;
                    }
                    MutableState mutableState4 = (MutableState) objRememberedValue;
                    Modifier.Companion companion2 = Modifier.INSTANCE;
                    Modifier modifierFillMaxWidth$default = SizeKt.fillMaxWidth$default(companion2, 0.0f, 1, obj4);
                    Arrangement arrangement = Arrangement.INSTANCE;
                    Arrangement.HorizontalOrVertical horizontalOrVerticalM712spacedBy0680j_4 = arrangement.m712spacedBy0680j_4(Dp.m7813constructorimpl(12.0f));
                    Alignment.Companion companion3 = Alignment.INSTANCE;
                    MeasurePolicy measurePolicyRowMeasurePolicy = RowKt.rowMeasurePolicy(horizontalOrVerticalM712spacedBy0680j_4, companion3.getCenterVertically(), composer, 54);
                    long currentCompositeKeyHashCode = ComposablesKt.getCurrentCompositeKeyHashCode(composer, 0);
                    int i3 = (int) (currentCompositeKeyHashCode ^ (currentCompositeKeyHashCode >>> 32));
                    CompositionLocalMap currentCompositionLocalMap = composer.getCurrentCompositionLocalMap();
                    Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(composer, modifierFillMaxWidth$default);
                    ComposeUiNode.Companion companion4 = ComposeUiNode.INSTANCE;
                    Function0<ComposeUiNode> constructor = companion4.getConstructor();
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
                    mr.z(companion4, composerM4318constructorimpl, measurePolicyRowMeasurePolicy, composerM4318constructorimpl, currentCompositionLocalMap);
                    Updater.m4326setimpl(composerM4318constructorimpl, modifierMaterializeModifier, (Function2<? super T, ? super Modifier, Unit>) id.h(companion4, composerM4318constructorimpl, Integer.valueOf(i3), composerM4318constructorimpl));
                    RowScopeInstance rowScopeInstance = RowScopeInstance.INSTANCE;
                    Modifier modifierM1069width3ABfNKs = SizeKt.m1069width3ABfNKs(companion2, Dp.m7813constructorimpl(120.0f));
                    MeasurePolicy measurePolicyColumnMeasurePolicy = ColumnKt.columnMeasurePolicy(arrangement.getTop(), companion3.getStart(), composer, 0);
                    long currentCompositeKeyHashCode2 = ComposablesKt.getCurrentCompositeKeyHashCode(composer, 0);
                    int i4 = (int) (currentCompositeKeyHashCode2 ^ (currentCompositeKeyHashCode2 >>> 32));
                    CompositionLocalMap currentCompositionLocalMap2 = composer.getCurrentCompositionLocalMap();
                    Modifier modifierMaterializeModifier2 = ComposedModifierKt.materializeModifier(composer, modifierM1069width3ABfNKs);
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
                    Composer composerM4318constructorimpl2 = Updater.m4318constructorimpl(composer);
                    mr.z(companion4, composerM4318constructorimpl2, measurePolicyColumnMeasurePolicy, composerM4318constructorimpl2, currentCompositionLocalMap2);
                    Updater.m4326setimpl(composerM4318constructorimpl2, modifierMaterializeModifier2, (Function2<? super T, ? super Modifier, Unit>) id.h(companion4, composerM4318constructorimpl2, Integer.valueOf(i4), composerM4318constructorimpl2));
                    ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.INSTANCE;
                    MaterialTheme materialTheme = MaterialTheme.INSTANCE;
                    int i5 = MaterialTheme.$stable;
                    TextKt.m3048TextNvy7gAk("协议", PaddingKt.m1003paddingqDBjuR0$default(companion2, Dp.m7813constructorimpl(4.0f), 0.0f, 0.0f, Dp.m7813constructorimpl(4.0f), 6, null), Color.m5151copywmQWz5c$default(materialTheme.getColorScheme(composer, i5).getOnSurface(), 0.6f, 0.0f, 0.0f, 0.0f, 14, null), null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, materialTheme.getTypography(composer, i5).getBodySmall(), composer, 54, 0, 131064);
                    Modifier modifierM1050height3ABfNKs = SizeKt.m1050height3ABfNKs(SizeKt.fillMaxWidth$default(companion2, 0.0f, 1, null), Dp.m7813constructorimpl(40.0f));
                    Object objRememberedValue2 = composer.rememberedValue();
                    if (objRememberedValue2 == companion.getEmpty()) {
                        i = 6;
                        objRememberedValue2 = new t1(6, mutableState4);
                        composer.updateRememberedValue(objRememberedValue2);
                    } else {
                        i = 6;
                    }
                    Modifier modifierOnFocusChanged = FocusChangedModifierKt.onFocusChanged(modifierM1050height3ABfNKs, (Function1) objRememberedValue2);
                    ButtonColors buttonColorsI = hc2.i(jc2.a, false, composer, i, 2);
                    ButtonScale buttonScaleL = hc2.l(1.05f);
                    ButtonGlow buttonGlowA = el0.a(u61Var);
                    ButtonBorder buttonBorderH = hc2.h(composer);
                    Object objRememberedValue3 = composer.rememberedValue();
                    if (objRememberedValue3 == companion.getEmpty()) {
                        objRememberedValue3 = new r1(3, mutableState);
                        composer.updateRememberedValue(objRememberedValue3);
                    }
                    ButtonKt.m8231ButtonTCVpFMg((Function0) objRememberedValue3, modifierOnFocusChanged, null, false, buttonScaleL, buttonGlowA, null, buttonColorsI, 0.0f, buttonBorderH, null, null, ComposableLambdaKt.rememberComposableLambda(150784046, true, new x1(0, mutableState, mutableState4), composer, 54), composer, 6, RendererCapabilities.DECODER_SUPPORT_MASK, 3404);
                    composer.endNode();
                    String str = (String) mutableState2.getValue();
                    Object objRememberedValue4 = composer.rememberedValue();
                    if (objRememberedValue4 == companion.getEmpty()) {
                        objRememberedValue4 = new y1(mutableState2, mutableState, mutableState3, 0);
                        composer.updateRememberedValue(objRememberedValue4);
                    }
                    p2.b(str, (Function1) objRememberedValue4, "服务器地址", "192.168.1.100 或 emby.example.com", FocusRequesterModifierKt.focusRequester(zs1.E(rowScopeInstance, companion2, 1.0f, false, 2, null), focusRequester), null, null, composer, 3504, 224);
                    composer.endNode();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                } else {
                    composer.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 1:
                String str2 = (String) obj8;
                Function0 function0 = (Function0) obj5;
                FocusRequester focusRequester2 = (FocusRequester) obj9;
                Function0 function1 = (Function0) obj7;
                Function0 function2 = (Function0) obj6;
                Composer composer2 = (Composer) obj2;
                int iIntValue2 = ((Integer) obj3).intValue();
                ((ColumnScope) obj).getClass();
                if (composer2.shouldExecute((iIntValue2 & 17) != 16, iIntValue2 & 1)) {
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(790353723, iIntValue2, -1, "com.dh.myembyapp.ui.components.BackupRouteImportConfirmDialog.<anonymous>.<anonymous>.<anonymous> (BackupRouteManagerDialog.kt:1154)");
                    }
                    Modifier.Companion companion5 = Modifier.INSTANCE;
                    Modifier modifierM999padding3ABfNKs = PaddingKt.m999padding3ABfNKs(SizeKt.fillMaxWidth$default(companion5, 0.0f, 1, null), Dp.m7813constructorimpl(20.0f));
                    Arrangement arrangement2 = Arrangement.INSTANCE;
                    Arrangement.HorizontalOrVertical horizontalOrVerticalM712spacedBy0680j_5 = arrangement2.m712spacedBy0680j_4(Dp.m7813constructorimpl(12.0f));
                    Alignment.Companion companion6 = Alignment.INSTANCE;
                    MeasurePolicy measurePolicyColumnMeasurePolicy2 = ColumnKt.columnMeasurePolicy(horizontalOrVerticalM712spacedBy0680j_5, companion6.getStart(), composer2, 6);
                    long currentCompositeKeyHashCode3 = ComposablesKt.getCurrentCompositeKeyHashCode(composer2, 0);
                    int i6 = (int) (currentCompositeKeyHashCode3 ^ (currentCompositeKeyHashCode3 >>> 32));
                    CompositionLocalMap currentCompositionLocalMap3 = composer2.getCurrentCompositionLocalMap();
                    Modifier modifierMaterializeModifier3 = ComposedModifierKt.materializeModifier(composer2, modifierM999padding3ABfNKs);
                    ComposeUiNode.Companion companion7 = ComposeUiNode.INSTANCE;
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
                    mr.z(companion7, composerM4318constructorimpl3, measurePolicyColumnMeasurePolicy2, composerM4318constructorimpl3, currentCompositionLocalMap3);
                    Updater.m4326setimpl(composerM4318constructorimpl3, modifierMaterializeModifier3, (Function2<? super T, ? super Modifier, Unit>) id.h(companion7, composerM4318constructorimpl3, Integer.valueOf(i6), composerM4318constructorimpl3));
                    ColumnScopeInstance columnScopeInstance2 = ColumnScopeInstance.INSTANCE;
                    MaterialTheme materialTheme2 = MaterialTheme.INSTANCE;
                    int i7 = MaterialTheme.$stable;
                    TextKt.m3048TextNvy7gAk("导入服务器备选线路", null, 0L, null, 0L, null, FontWeight.INSTANCE.getSemiBold(), null, 0L, null, null, 0L, 0, false, 0, 0, null, materialTheme2.getTypography(composer2, i7).getTitleMedium(), composer2, 1572870, 0, 131006);
                    TextKt.m3048TextNvy7gAk(str2, null, Color.m5151copywmQWz5c$default(materialTheme2.getColorScheme(composer2, i7).getOnSurface(), 0.78f, 0.0f, 0.0f, 0.0f, 14, null), null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, materialTheme2.getTypography(composer2, i7).getBodyMedium(), composer2, 0, 0, 131066);
                    Modifier modifierFillMaxWidth$default2 = SizeKt.fillMaxWidth$default(companion5, 0.0f, 1, null);
                    MeasurePolicy measurePolicyRowMeasurePolicy2 = RowKt.rowMeasurePolicy(arrangement2.getEnd(), companion6.getTop(), composer2, 6);
                    long currentCompositeKeyHashCode4 = ComposablesKt.getCurrentCompositeKeyHashCode(composer2, 0);
                    int i8 = (int) (currentCompositeKeyHashCode4 ^ (currentCompositeKeyHashCode4 >>> 32));
                    CompositionLocalMap currentCompositionLocalMap4 = composer2.getCurrentCompositionLocalMap();
                    Modifier modifierMaterializeModifier4 = ComposedModifierKt.materializeModifier(composer2, modifierFillMaxWidth$default2);
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
                    Updater.m4326setimpl(composerM4318constructorimpl4, modifierMaterializeModifier4, (Function2<? super T, ? super Modifier, Unit>) id.h(companion7, composerM4318constructorimpl4, Integer.valueOf(i8), composerM4318constructorimpl4));
                    RowScopeInstance rowScopeInstance2 = RowScopeInstance.INSTANCE;
                    MeasurePolicy measurePolicyRowMeasurePolicy3 = RowKt.rowMeasurePolicy(arrangement2.m712spacedBy0680j_4(Dp.m7813constructorimpl(8.0f)), companion6.getTop(), composer2, 6);
                    long currentCompositeKeyHashCode5 = ComposablesKt.getCurrentCompositeKeyHashCode(composer2, 0);
                    int i9 = (int) ((currentCompositeKeyHashCode5 >>> 32) ^ currentCompositeKeyHashCode5);
                    CompositionLocalMap currentCompositionLocalMap5 = composer2.getCurrentCompositionLocalMap();
                    Modifier modifierMaterializeModifier5 = ComposedModifierKt.materializeModifier(composer2, companion5);
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
                    Updater.m4326setimpl(composerM4318constructorimpl5, modifierMaterializeModifier5, (Function2<? super T, ? super Modifier, Unit>) id.h(companion7, composerM4318constructorimpl5, Integer.valueOf(i9), composerM4318constructorimpl5));
                    pi.a(function0, FocusRequesterModifierKt.focusRequester(SizeKt.m1069width3ABfNKs(companion5, Dp.m7813constructorimpl(118.0f)), focusRequester2), bh.a, vs.j, composer2, 3456);
                    pi.a(function1, SizeKt.m1069width3ABfNKs(companion5, Dp.m7813constructorimpl(118.0f)), bh.c, vs.k, composer2, 3504);
                    pi.a(function2, SizeKt.m1069width3ABfNKs(companion5, Dp.m7813constructorimpl(96.0f)), bh.b, vs.l, composer2, 3504);
                    if (i02.w(composer2)) {
                        ComposerKt.traceEventEnd();
                    }
                } else {
                    composer2.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 2:
                FocusRequester focusRequester3 = (FocusRequester) obj9;
                u61 u61Var2 = (u61) obj8;
                c00 c00Var = (c00) obj6;
                MutableState mutableState5 = (MutableState) obj5;
                MutableState mutableState6 = (MutableState) obj7;
                Composer composer3 = (Composer) obj2;
                int iIntValue3 = ((Integer) obj3).intValue();
                ((LazyItemScope) obj).getClass();
                if (composer3.shouldExecute((iIntValue3 & 17) != 16, iIntValue3 & 1)) {
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(163617396, iIntValue3, -1, "com.dh.myembyapp.ui.screens.danmaku.DanmakuSettingsScreen.ScreenContent.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (DanmakuSettingsScreen.kt:216)");
                    }
                    Modifier modifierFocusRequester = FocusRequesterModifierKt.focusRequester(SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null), focusRequester3);
                    Object objRememberedValue5 = composer3.rememberedValue();
                    Composer.Companion companion8 = Composer.INSTANCE;
                    if (objRememberedValue5 == companion8.getEmpty()) {
                        objRememberedValue5 = new zh(29, mutableState5);
                        composer3.updateRememberedValue(objRememberedValue5);
                    }
                    Modifier modifierOnFocusChanged2 = FocusChangedModifierKt.onFocusChanged(modifierFocusRequester, (Function1) objRememberedValue5);
                    ClickableSurfaceDefaults clickableSurfaceDefaults = ClickableSurfaceDefaults.INSTANCE;
                    long j = u61Var2.C;
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-1159792958, 6, -1, "com.dh.myembyapp.ui.theme.MyEmbyTheme.<get-accentFollowsTheme> (Theme.kt:147)");
                    }
                    ProvidableCompositionLocal providableCompositionLocal = n72.g;
                    boolean zBooleanValue = ((Boolean) composer3.consume(providableCompositionLocal)).booleanValue();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    long jM5189getWhite0d7_KjU = !zBooleanValue ? Color.INSTANCE.m5189getWhite0d7_KjU() : u61Var2.D;
                    MaterialTheme materialTheme3 = MaterialTheme.INSTANCE;
                    int i10 = MaterialTheme.$stable;
                    long onSurface = materialTheme3.getColorScheme(composer3, i10).getOnSurface();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-1159792958, 6, -1, "com.dh.myembyapp.ui.theme.MyEmbyTheme.<get-accentFollowsTheme> (Theme.kt:147)");
                    }
                    boolean zBooleanValue2 = ((Boolean) composer3.consume(providableCompositionLocal)).booleanValue();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    if (zBooleanValue2) {
                        jU = kb0.u(composer3, -460810269, materialTheme3, composer3, i10);
                    } else {
                        composer3.startReplaceGroup(-460905067);
                        composer3.endReplaceGroup();
                        jU = ColorKt.Color(4279308561L);
                    }
                    long j2 = jU;
                    int i11 = ClickableSurfaceDefaults.$stable;
                    ClickableSurfaceColors clickableSurfaceColorsM8292colorsoq7We08 = clickableSurfaceDefaults.m8292colorsoq7We08(j, onSurface, jM5189getWhite0d7_KjU, j2, 0L, 0L, 0L, 0L, composer3, i11 << 24, PsExtractor.VIDEO_STREAM_MASK);
                    ClickableSurfaceBorder clickableSurfaceBorderBorder = clickableSurfaceDefaults.border(null, new Border(BorderStrokeKt.m301BorderStrokecXLIe8U(Dp.m7813constructorimpl(2.0f), u61Var2.b), 0.0f, null, 6, null), null, null, null, composer3, i11 << 15, 29);
                    ClickableSurfaceScale clickableSurfaceScaleScale$default = ClickableSurfaceDefaults.scale$default(clickableSurfaceDefaults, 0.0f, 1.02f, 0.0f, 0.0f, 0.0f, 29, null);
                    ClickableSurfaceGlow clickableSurfaceGlowC = el0.c(u61Var2);
                    boolean zChangedInstance = composer3.changedInstance(c00Var);
                    Object objRememberedValue6 = composer3.rememberedValue();
                    if (zChangedInstance || objRememberedValue6 == companion8.getEmpty()) {
                        objRememberedValue6 = new z7(12, c00Var, mutableState6);
                        composer3.updateRememberedValue(objRememberedValue6);
                    }
                    SurfaceKt.m8520Surface05tvjtU((Function0) objRememberedValue6, modifierOnFocusChanged2, null, false, 0.0f, null, clickableSurfaceColorsM8292colorsoq7We08, clickableSurfaceScaleScale$default, clickableSurfaceBorderBorder, clickableSurfaceGlowC, null, ComposableLambdaKt.rememberComposableLambda(1701101365, true, new x1(1, mutableState5, mutableState6), composer3, 54), composer3, 0, 48, 1084);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                } else {
                    composer3.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 3:
                FocusRequester focusRequester4 = (FocusRequester) obj9;
                Function0 function3 = (Function0) obj8;
                Function0 function4 = (Function0) obj5;
                Function0 function5 = (Function0) obj7;
                ItemCounts itemCounts = (ItemCounts) obj6;
                Composer composer4 = (Composer) obj2;
                int iIntValue4 = ((Integer) obj3).intValue();
                ((ColumnScope) obj).getClass();
                if (composer4.shouldExecute((iIntValue4 & 17) != 16, iIntValue4 & 1)) {
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-1290611607, iIntValue4, -1, "com.dh.myembyapp.ui.components.HomeMediaMenuDialog.<anonymous>.<anonymous>.<anonymous> (HomeMediaMenuDialog.kt:135)");
                    }
                    Modifier.Companion companion9 = Modifier.INSTANCE;
                    Modifier modifierM1000paddingVpY3zN4 = PaddingKt.m1000paddingVpY3zN4(SizeKt.fillMaxWidth$default(companion9, 0.0f, 1, null), Dp.m7813constructorimpl(18.0f), Dp.m7813constructorimpl(16.0f));
                    MeasurePolicy measurePolicyColumnMeasurePolicy3 = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.m712spacedBy0680j_4(Dp.m7813constructorimpl(12.0f)), Alignment.INSTANCE.getStart(), composer4, 6);
                    long currentCompositeKeyHashCode6 = ComposablesKt.getCurrentCompositeKeyHashCode(composer4, 0);
                    int i12 = (int) (currentCompositeKeyHashCode6 ^ (currentCompositeKeyHashCode6 >>> 32));
                    CompositionLocalMap currentCompositionLocalMap6 = composer4.getCurrentCompositionLocalMap();
                    Modifier modifierMaterializeModifier6 = ComposedModifierKt.materializeModifier(composer4, modifierM1000paddingVpY3zN4);
                    ComposeUiNode.Companion companion10 = ComposeUiNode.INSTANCE;
                    Function0<ComposeUiNode> constructor6 = companion10.getConstructor();
                    if (composer4.getApplier() == null) {
                        ComposablesKt.invalidApplier();
                    }
                    composer4.startReusableNode();
                    if (composer4.getInserting()) {
                        composer4.createNode(constructor6);
                    } else {
                        composer4.useNode();
                    }
                    Composer composerM4318constructorimpl6 = Updater.m4318constructorimpl(composer4);
                    mr.z(companion10, composerM4318constructorimpl6, measurePolicyColumnMeasurePolicy3, composerM4318constructorimpl6, currentCompositionLocalMap6);
                    Updater.m4326setimpl(composerM4318constructorimpl6, modifierMaterializeModifier6, (Function2<? super T, ? super Modifier, Unit>) id.h(companion10, composerM4318constructorimpl6, Integer.valueOf(i12), composerM4318constructorimpl6));
                    ColumnScopeInstance columnScopeInstance3 = ColumnScopeInstance.INSTANCE;
                    MaterialTheme materialTheme4 = MaterialTheme.INSTANCE;
                    int i13 = MaterialTheme.$stable;
                    TextKt.m3048TextNvy7gAk("媒体菜单", null, materialTheme4.getColorScheme(composer4, i13).getPrimary(), null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, materialTheme4.getTypography(composer4, i13).getTitleMedium(), composer4, 6, 0, 131066);
                    Icons.AutoMirrored.Filled filled = Icons.AutoMirrored.Filled.INSTANCE;
                    qn0.b("切换备选线路", CompareArrowsKt.getCompareArrows(filled), FocusRequesterModifierKt.focusRequester(companion9, focusRequester4), function3, composer4, 6, 0);
                    qn0.b("隐藏媒体库", VisibilityOffKt.getVisibilityOff(Icons.INSTANCE.getDefault()), null, function4, composer4, 6, 4);
                    qn0.b("媒体库排序", SortKt.getSort(filled), null, function5, composer4, 6, 4);
                    qn0.c(itemCounts, composer4, 0);
                    composer4.endNode();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                } else {
                    composer4.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 4:
                String str3 = (String) obj;
                String str4 = (String) obj2;
                String str5 = (String) obj3;
                s01.D(str3, str4, str5);
                e31.d((NavHostController) obj9, (MutableState) obj5, (ServerPreferences) obj8, (Context) obj7, (UserPreferences) obj6, str3, str4, (896 & 128) != 0 ? null : str5, null, false);
                return Unit.INSTANCE;
            case 5:
                qe qeVar = (qe) obj9;
                MutableState mutableState7 = (MutableState) obj5;
                String str6 = (String) obj8;
                MutableState mutableState8 = (MutableState) obj7;
                MutableState mutableState9 = (MutableState) obj6;
                Composer composer5 = (Composer) obj2;
                int iIntValue5 = ((Integer) obj3).intValue();
                ((BoxScope) obj).getClass();
                if (composer5.shouldExecute((iIntValue5 & 17) != 16, iIntValue5 & 1)) {
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-2081481515, iIntValue5, -1, "com.dh.myembyapp.ui.components.OnlineSubtitleSearchDialog.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (OnlineSubtitleSearchDialog.kt:530)");
                    }
                    Modifier modifierM281basicMarquee1Mj1MLw$default = Modifier.INSTANCE;
                    Modifier modifierM1000paddingVpY3zN5 = PaddingKt.m1000paddingVpY3zN4(SizeKt.fillMaxWidth$default(modifierM281basicMarquee1Mj1MLw$default, 0.0f, 1, null), Dp.m7813constructorimpl(10.0f), Dp.m7813constructorimpl(8.0f));
                    MeasurePolicy measurePolicyColumnMeasurePolicy4 = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.m712spacedBy0680j_4(Dp.m7813constructorimpl(3.0f)), Alignment.INSTANCE.getStart(), composer5, 6);
                    long currentCompositeKeyHashCode7 = ComposablesKt.getCurrentCompositeKeyHashCode(composer5, 0);
                    int i14 = (int) (currentCompositeKeyHashCode7 ^ (currentCompositeKeyHashCode7 >>> 32));
                    CompositionLocalMap currentCompositionLocalMap7 = composer5.getCurrentCompositionLocalMap();
                    Modifier modifierMaterializeModifier7 = ComposedModifierKt.materializeModifier(composer5, modifierM1000paddingVpY3zN5);
                    ComposeUiNode.Companion companion11 = ComposeUiNode.INSTANCE;
                    Function0<ComposeUiNode> constructor7 = companion11.getConstructor();
                    if (composer5.getApplier() == null) {
                        ComposablesKt.invalidApplier();
                    }
                    composer5.startReusableNode();
                    if (composer5.getInserting()) {
                        composer5.createNode(constructor7);
                    } else {
                        composer5.useNode();
                    }
                    Composer composerM4318constructorimpl7 = Updater.m4318constructorimpl(composer5);
                    mr.z(companion11, composerM4318constructorimpl7, measurePolicyColumnMeasurePolicy4, composerM4318constructorimpl7, currentCompositionLocalMap7);
                    Updater.m4326setimpl(composerM4318constructorimpl7, modifierMaterializeModifier7, (Function2<? super T, ? super Modifier, Unit>) id.h(companion11, composerM4318constructorimpl7, Integer.valueOf(i14), composerM4318constructorimpl7));
                    ColumnScopeInstance columnScopeInstance4 = ColumnScopeInstance.INSTANCE;
                    String str7 = qeVar.b;
                    String str8 = qeVar.a;
                    String str9 = qeVar.g;
                    String str10 = qeVar.e;
                    Modifier modifierFillMaxWidth$default3 = SizeKt.fillMaxWidth$default(modifierM281basicMarquee1Mj1MLw$default, 0.0f, 1, null);
                    if (((Boolean) mutableState7.getValue()).booleanValue()) {
                        modifierM281basicMarquee1Mj1MLw$default = BasicMarqueeKt.m281basicMarquee1Mj1MLw$default(modifierM281basicMarquee1Mj1MLw$default, Integer.MAX_VALUE, 0, 0, 0, null, ra1.a, 30, null);
                        modifier = modifierM281basicMarquee1Mj1MLw$default;
                    } else {
                        modifier = modifierM281basicMarquee1Mj1MLw$default;
                    }
                    Modifier modifierThen = modifierFillMaxWidth$default3.then(modifierM281basicMarquee1Mj1MLw$default);
                    MaterialTheme materialTheme5 = MaterialTheme.INSTANCE;
                    int i15 = MaterialTheme.$stable;
                    TextStyle bodyMedium = materialTheme5.getTypography(composer5, i15).getBodyMedium();
                    long jM5189getWhite0d7_KjU2 = Color.INSTANCE.m5189getWhite0d7_KjU();
                    TextOverflow.Companion companion12 = TextOverflow.INSTANCE;
                    TextKt.m3048TextNvy7gAk(str7, modifierThen, jM5189getWhite0d7_KjU2, null, 0L, null, null, null, 0L, null, null, 0L, companion12.m7761getEllipsisgIe3tQ8(), false, 1, 0, null, bodyMedium, composer5, RendererCapabilities.DECODER_SUPPORT_MASK, 24960, 110584);
                    StringBuilder sb = new StringBuilder();
                    sb.append("语言: " + qeVar.d);
                    sb.append("  |  格式: ".concat(str6));
                    if (!StringsKt.isBlank(str10)) {
                        sb.append("  |  来源: " + str10);
                    }
                    if (!StringsKt.isBlank(str9)) {
                        sb.append("  |  时间: " + str9);
                    }
                    TextKt.m3048TextNvy7gAk(sb.toString(), null, ColorKt.Color(4291546059L), null, 0L, null, null, null, 0L, null, null, 0L, companion12.m7761getEllipsisgIe3tQ8(), false, 1, 0, null, materialTheme5.getTypography(composer5, i15).getLabelMedium(), composer5, RendererCapabilities.DECODER_SUPPORT_MASK, 24960, 110586);
                    if (StringsKt.isBlank(qeVar.f)) {
                        composer5.startReplaceGroup(-1075573149);
                        composer5.endReplaceGroup();
                    } else {
                        composer5.startReplaceGroup(-1076995057);
                        TextKt.m3048TextNvy7gAk(qeVar.f, SizeKt.fillMaxWidth$default(modifier, 0.0f, 1, null).then(((Boolean) mutableState7.getValue()).booleanValue() ? BasicMarqueeKt.m281basicMarquee1Mj1MLw$default(modifier, Integer.MAX_VALUE, 0, 0, 0, null, ra1.a, 30, null) : modifier), ColorKt.Color(4289045925L), null, 0L, null, null, null, 0L, null, null, 0L, companion12.m7761getEllipsisgIe3tQ8(), false, 1, 0, null, materialTheme5.getTypography(composer5, i15).getLabelMedium(), composer5, RendererCapabilities.DECODER_SUPPORT_MASK, 24960, 110584);
                        composer5.endReplaceGroup();
                    }
                    if (Intrinsics.areEqual((String) mutableState8.getValue(), str8)) {
                        composer5.startReplaceGroup(-1075427232);
                        TextKt.m3048TextNvy7gAk("正在加载字幕文件列表...", null, ColorKt.Color(4287679225L), null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, materialTheme5.getTypography(composer5, i15).getLabelMedium(), composer5, 390, 0, 131066);
                        composer5.endReplaceGroup();
                    } else if (Intrinsics.areEqual((String) mutableState9.getValue(), str8)) {
                        composer5.startReplaceGroup(-1074966076);
                        TextKt.m3048TextNvy7gAk("下载并加载中...", null, ColorKt.Color(4287679225L), null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, materialTheme5.getTypography(composer5, i15).getLabelMedium(), composer5, 390, 0, 131066);
                        composer5.endReplaceGroup();
                    } else {
                        composer5.startReplaceGroup(-1074609917);
                        composer5.endReplaceGroup();
                    }
                    composer5.endNode();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                } else {
                    composer5.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 6:
                String str11 = (String) obj8;
                String str12 = (String) obj5;
                FocusRequester focusRequester5 = (FocusRequester) obj9;
                State state = (State) obj7;
                State state2 = (State) obj6;
                Composer composer6 = (Composer) obj2;
                int iIntValue6 = ((Integer) obj3).intValue();
                ((LazyItemScope) obj).getClass();
                if (composer6.shouldExecute((iIntValue6 & 17) != 16, iIntValue6 & 1)) {
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-815152629, iIntValue6, -1, "com.dh.myembyapp.ui.screens.person.PersonScreen.<anonymous>.<anonymous>.<anonymous>.<anonymous> (PersonScreen.kt:100)");
                    }
                    ld1.b(str11, str12, (Integer) state.getValue(), (String) state2.getValue(), focusRequester5, composer6, 24576);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                } else {
                    composer6.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            default:
                return SearchBarKt.FullScreenSearchBarLayout_EQC0FA8$lambda$62$lambda$61((Shape) obj9, (Shape) obj8, (Density) obj7, (SearchBarState) obj6, (MutableState) obj5, (Path) obj, (Size) obj2, (LayoutDirection) obj3);
        }
    }

    public /* synthetic */ n1(FocusRequester focusRequester, Object obj, Object obj2, Object obj3, Object obj4, int i) {
        this.a = i;
        this.b = focusRequester;
        this.c = obj;
        this.d = obj2;
        this.e = obj3;
        this.g = obj4;
    }

    public /* synthetic */ n1(Shape shape, Shape shape2, Density density, SearchBarState searchBarState, MutableState mutableState) {
        this.a = 7;
        this.b = shape;
        this.c = shape2;
        this.e = density;
        this.g = searchBarState;
        this.d = mutableState;
    }

    public /* synthetic */ n1(Object obj, MutableState mutableState, Object obj2, Object obj3, Object obj4, int i) {
        this.a = i;
        this.b = obj;
        this.d = mutableState;
        this.c = obj2;
        this.e = obj3;
        this.g = obj4;
    }

    public /* synthetic */ n1(String str, Object obj, FocusRequester focusRequester, Object obj2, Object obj3, int i) {
        this.a = i;
        this.c = str;
        this.d = obj;
        this.b = focusRequester;
        this.e = obj2;
        this.g = obj3;
    }
}
