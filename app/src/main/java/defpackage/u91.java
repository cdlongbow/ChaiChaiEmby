package defpackage;

import android.graphics.Bitmap;
import androidx.compose.foundation.BorderStrokeKt;
import androidx.compose.foundation.ImageKt;
import androidx.compose.foundation.ScrollKt;
import androidx.compose.foundation.ScrollState;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnScope;
import androidx.compose.foundation.layout.ColumnScopeInstance;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.RowKt;
import androidx.compose.foundation.layout.RowScopeInstance;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.SpacerKt;
import androidx.compose.foundation.shape.RoundedCornerShape;
import androidx.compose.foundation.shape.RoundedCornerShapeKt;
import androidx.compose.material3.MaterialTheme;
import androidx.compose.material3.TextKt;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.SnapshotMutationPolicy;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambda;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.focus.FocusChangedModifierKt;
import androidx.compose.ui.focus.FocusRequester;
import androidx.compose.ui.focus.FocusRequesterModifierKt;
import androidx.compose.ui.graphics.AndroidImageBitmap_androidKt;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.ColorKt;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.text.font.FontWeight;
import androidx.compose.ui.unit.Dp;
import androidx.media3.exoplayer.RendererCapabilities;
import com.dh.myembyapp.data.model.AppThemePreset;
import com.dh.myembyapp.data.model.DarkThemeGlowPosition;
import com.dh.myembyapp.data.model.DarkThemeStyle;
import com.dh.myembyapp.data.model.LightThemeBackgroundStyle;
import java.util.Collection;
import java.util.List;
import kotlin.Unit;
import kotlin.collections.ArraysKt;
import kotlin.collections.CollectionsKt;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.text.StringsKt;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class u91 implements Function3 {
    public final /* synthetic */ int a = 1;
    public final /* synthetic */ FocusRequester b;
    public final /* synthetic */ MutableState c;
    public final /* synthetic */ MutableState d;
    public final /* synthetic */ MutableState e;
    public final /* synthetic */ MutableState g;
    public final /* synthetic */ MutableState h;
    public final /* synthetic */ MutableState i;
    public final /* synthetic */ MutableState j;
    public final /* synthetic */ u61 k;
    public final /* synthetic */ Function0 l;
    public final /* synthetic */ Object m;
    public final /* synthetic */ Object n;
    public final /* synthetic */ Object o;

    public /* synthetic */ u91(u61 u61Var, Bitmap bitmap, MutableState mutableState, MutableState mutableState2, MutableState mutableState3, MutableState mutableState4, MutableState mutableState5, MutableState mutableState6, MutableState mutableState7, MutableState mutableState8, FocusRequester focusRequester, Function0 function0, Function1 function1) {
        this.m = bitmap;
        this.c = mutableState;
        this.d = mutableState2;
        this.k = u61Var;
        this.e = mutableState3;
        this.g = mutableState4;
        this.h = mutableState5;
        this.i = mutableState6;
        this.b = focusRequester;
        this.o = function1;
        this.l = function0;
        this.j = mutableState7;
        this.n = mutableState8;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final Object a(Object obj, Object obj2, Object obj3) {
        long jU;
        Composer composer;
        Composer composer2;
        MutableState mutableState;
        int i;
        Bitmap bitmap = (Bitmap) this.m;
        Function1 function1 = (Function1) this.o;
        MutableState mutableState2 = (MutableState) this.n;
        Composer composer3 = (Composer) obj2;
        int iIntValue = ((Integer) obj3).intValue();
        ((ColumnScope) obj).getClass();
        if (composer3.shouldExecute((iIntValue & 17) != 16, iIntValue & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1902454473, iIntValue, -1, "com.dh.myembyapp.ui.components.OnlineSubtitleConfigDialog.<anonymous>.<anonymous>.<anonymous> (OnlineSubtitleConfigDialog.kt:125)");
            }
            Modifier.Companion companion = Modifier.INSTANCE;
            Modifier modifierM999padding3ABfNKs = PaddingKt.m999padding3ABfNKs(SizeKt.fillMaxWidth$default(companion, 0.0f, 1, null), Dp.m7813constructorimpl(20.0f));
            Arrangement arrangement = Arrangement.INSTANCE;
            Arrangement.HorizontalOrVertical horizontalOrVerticalM712spacedBy0680j_4 = arrangement.m712spacedBy0680j_4(Dp.m7813constructorimpl(18.0f));
            Alignment.Companion companion2 = Alignment.INSTANCE;
            MeasurePolicy measurePolicyRowMeasurePolicy = RowKt.rowMeasurePolicy(horizontalOrVerticalM712spacedBy0680j_4, companion2.getTop(), composer3, 6);
            long currentCompositeKeyHashCode = ComposablesKt.getCurrentCompositeKeyHashCode(composer3, 0);
            int i2 = (int) (currentCompositeKeyHashCode ^ (currentCompositeKeyHashCode >>> 32));
            CompositionLocalMap currentCompositionLocalMap = composer3.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(composer3, modifierM999padding3ABfNKs);
            ComposeUiNode.Companion companion3 = ComposeUiNode.INSTANCE;
            Function0<ComposeUiNode> constructor = companion3.getConstructor();
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
            mr.z(companion3, composerM4318constructorimpl, measurePolicyRowMeasurePolicy, composerM4318constructorimpl, currentCompositionLocalMap);
            Updater.m4326setimpl(composerM4318constructorimpl, modifierMaterializeModifier, (Function2<? super T, ? super Modifier, Unit>) id.h(companion3, composerM4318constructorimpl, Integer.valueOf(i2), composerM4318constructorimpl));
            RowScopeInstance rowScopeInstance = RowScopeInstance.INSTANCE;
            Modifier modifierM1069width3ABfNKs = SizeKt.m1069width3ABfNKs(companion, Dp.m7813constructorimpl(320.0f));
            MeasurePolicy measurePolicyP = mr.p(10.0f, arrangement, companion2.getCenterHorizontally(), composer3, 54);
            long currentCompositeKeyHashCode2 = ComposablesKt.getCurrentCompositeKeyHashCode(composer3, 0);
            int i3 = (int) (currentCompositeKeyHashCode2 ^ (currentCompositeKeyHashCode2 >>> 32));
            CompositionLocalMap currentCompositionLocalMap2 = composer3.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier2 = ComposedModifierKt.materializeModifier(composer3, modifierM1069width3ABfNKs);
            Function0<ComposeUiNode> constructor2 = companion3.getConstructor();
            if (composer3.getApplier() == null) {
                ComposablesKt.invalidApplier();
            }
            composer3.startReusableNode();
            if (composer3.getInserting()) {
                composer3.createNode(constructor2);
            } else {
                composer3.useNode();
            }
            Composer composerM4318constructorimpl2 = Updater.m4318constructorimpl(composer3);
            mr.z(companion3, composerM4318constructorimpl2, measurePolicyP, composerM4318constructorimpl2, currentCompositionLocalMap2);
            Updater.m4326setimpl(composerM4318constructorimpl2, modifierMaterializeModifier2, (Function2<? super T, ? super Modifier, Unit>) id.h(companion3, composerM4318constructorimpl2, Integer.valueOf(i3), composerM4318constructorimpl2));
            ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.INSTANCE;
            MaterialTheme materialTheme = MaterialTheme.INSTANCE;
            int i4 = MaterialTheme.$stable;
            TextKt.m3048TextNvy7gAk("手机扫码导入", null, materialTheme.getColorScheme(composer3, i4).getPrimary(), null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, materialTheme.getTypography(composer3, i4).getTitleMedium(), composer3, 6, 0, 131066);
            if (bitmap != null) {
                composer3.startReplaceGroup(-1290070608);
                ImageKt.m332Image5hnEew(AndroidImageBitmap_androidKt.asImageBitmap(bitmap), "在线字幕配置二维码", SizeKt.m1064size3ABfNKs(companion, Dp.m7813constructorimpl(220.0f)), null, null, 0.0f, null, 0, composer3, 432, 248);
                String str = (String) this.c.getValue();
                if (str == null) {
                    str = "";
                }
                TextKt.m3048TextNvy7gAk(str, null, Color.m5151copywmQWz5c$default(materialTheme.getColorScheme(composer3, i4).getOnSurface(), 0.65f, 0.0f, 0.0f, 0.0f, 14, null), null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, materialTheme.getTypography(composer3, i4).getBodySmall(), composer3, 0, 0, 131066);
                TextKt.m3048TextNvy7gAk("手机浏览器打开后输入 assrt API Key", null, Color.m5151copywmQWz5c$default(materialTheme.getColorScheme(composer3, i4).getOnSurface(), 0.65f, 0.0f, 0.0f, 0.0f, 14, null), null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, materialTheme.getTypography(composer3, i4).getBodySmall(), composer3, 6, 0, 131066);
                composer = composer3;
                composer.endReplaceGroup();
            } else {
                composer3.startReplaceGroup(-1289174119);
                MutableState mutableState3 = this.d;
                String str2 = ((Boolean) mutableState3.getValue()).booleanValue() ? "配置服务启动失败" : "正在启动配置服务...";
                TextStyle bodySmall = materialTheme.getTypography(composer3, i4).getBodySmall();
                if (((Boolean) mutableState3.getValue()).booleanValue()) {
                    composer3.startReplaceGroup(-1149957054);
                    jU = materialTheme.getColorScheme(composer3, i4).getError();
                    composer3.endReplaceGroup();
                } else {
                    jU = kb0.u(composer3, -1149955866, materialTheme, composer3, i4);
                }
                TextKt.m3048TextNvy7gAk(str2, null, jU, null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, bodySmall, composer3, 0, 0, 131066);
                composer = composer3;
                composer.endReplaceGroup();
            }
            composer.endNode();
            Modifier modifierE = zs1.E(rowScopeInstance, companion, 1.0f, false, 2, null);
            MeasurePolicy measurePolicyColumnMeasurePolicy = ColumnKt.columnMeasurePolicy(arrangement.m712spacedBy0680j_4(Dp.m7813constructorimpl(12.0f)), companion2.getStart(), composer, 6);
            long currentCompositeKeyHashCode3 = ComposablesKt.getCurrentCompositeKeyHashCode(composer, 0);
            int i5 = (int) (currentCompositeKeyHashCode3 ^ (currentCompositeKeyHashCode3 >>> 32));
            CompositionLocalMap currentCompositionLocalMap3 = composer.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier3 = ComposedModifierKt.materializeModifier(composer, modifierE);
            Function0<ComposeUiNode> constructor3 = companion3.getConstructor();
            if (composer.getApplier() == null) {
                ComposablesKt.invalidApplier();
            }
            composer.startReusableNode();
            if (composer.getInserting()) {
                composer.createNode(constructor3);
            } else {
                composer.useNode();
            }
            Composer composerM4318constructorimpl3 = Updater.m4318constructorimpl(composer);
            mr.z(companion3, composerM4318constructorimpl3, measurePolicyColumnMeasurePolicy, composerM4318constructorimpl3, currentCompositionLocalMap3);
            Updater.m4326setimpl(composerM4318constructorimpl3, modifierMaterializeModifier3, (Function2<? super T, ? super Modifier, Unit>) id.h(companion3, composerM4318constructorimpl3, Integer.valueOf(i5), composerM4318constructorimpl3));
            Composer composer4 = composer;
            TextKt.m3048TextNvy7gAk("在线字幕配置", null, 0L, null, 0L, null, FontWeight.INSTANCE.getBold(), null, 0L, null, null, 0L, 0, false, 0, 0, null, materialTheme.getTypography(composer, i4).getTitleLarge(), composer4, 1572870, 0, 131006);
            TextKt.m3048TextNvy7gAk("字幕服务由 assrt.net 提供", null, Color.m5151copywmQWz5c$default(materialTheme.getColorScheme(composer4, i4).getOnSurface(), 0.7f, 0.0f, 0.0f, 0.0f, 14, null), null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, materialTheme.getTypography(composer4, i4).getBodySmall(), composer4, 6, 0, 131066);
            TextKt.m3048TextNvy7gAk("ASSRT 接口协议", null, materialTheme.getColorScheme(composer4, i4).getOnSurface(), null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, materialTheme.getTypography(composer4, i4).getBodyMedium(), composer4, 6, 0, 131066);
            Modifier modifierFillMaxWidth$default = SizeKt.fillMaxWidth$default(companion, 0.0f, 1, null);
            MeasurePolicy measurePolicyRowMeasurePolicy2 = RowKt.rowMeasurePolicy(arrangement.m712spacedBy0680j_4(Dp.m7813constructorimpl(12.0f)), companion2.getTop(), composer4, 6);
            long currentCompositeKeyHashCode4 = ComposablesKt.getCurrentCompositeKeyHashCode(composer4, 0);
            int i6 = (int) (currentCompositeKeyHashCode4 ^ (currentCompositeKeyHashCode4 >>> 32));
            CompositionLocalMap currentCompositionLocalMap4 = composer4.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier4 = ComposedModifierKt.materializeModifier(composer4, modifierFillMaxWidth$default);
            Function0<ComposeUiNode> constructor4 = companion3.getConstructor();
            if (composer4.getApplier() == null) {
                ComposablesKt.invalidApplier();
            }
            composer4.startReusableNode();
            if (composer4.getInserting()) {
                composer4.createNode(constructor4);
            } else {
                composer4.useNode();
            }
            Composer composerM4318constructorimpl4 = Updater.m4318constructorimpl(composer4);
            mr.z(companion3, composerM4318constructorimpl4, measurePolicyRowMeasurePolicy2, composerM4318constructorimpl4, currentCompositionLocalMap4);
            Updater.m4326setimpl(composerM4318constructorimpl4, modifierMaterializeModifier4, (Function2<? super T, ? super Modifier, Unit>) id.h(companion3, composerM4318constructorimpl4, Integer.valueOf(i6), composerM4318constructorimpl4));
            Modifier modifierE2 = zs1.E(rowScopeInstance, companion, 1.0f, false, 2, null);
            MutableState mutableState4 = this.e;
            boolean z = ((ne) mutableState4.getValue()) == ne.HTTPS;
            Object objRememberedValue = composer4.rememberedValue();
            Composer.Companion companion4 = Composer.INSTANCE;
            if (objRememberedValue == companion4.getEmpty()) {
                objRememberedValue = new lu0(20, mutableState4);
                composer4.updateRememberedValue(objRememberedValue);
            }
            y91.a(25008, composer4, modifierE2, "HTTPS", "默认推荐", (Function0) objRememberedValue, z);
            Modifier modifierE3 = zs1.E(rowScopeInstance, companion, 1.0f, false, 2, null);
            boolean z2 = ((ne) mutableState4.getValue()) == ne.HTTP;
            Object objRememberedValue2 = composer4.rememberedValue();
            if (objRememberedValue2 == companion4.getEmpty()) {
                objRememberedValue2 = new lu0(21, mutableState4);
                composer4.updateRememberedValue(objRememberedValue2);
            }
            y91.a(25008, composer4, modifierE3, "HTTP", "老电视证书不全时可用", (Function0) objRememberedValue2, z2);
            composer4.endNode();
            Object objRememberedValue3 = composer4.rememberedValue();
            Object empty = companion4.getEmpty();
            MutableState mutableState5 = this.g;
            if (objRememberedValue3 == empty) {
                objRememberedValue3 = new lu0(22, mutableState5);
                composer4.updateRememberedValue(objRememberedValue3);
            }
            Function0 function0 = (Function0) objRememberedValue3;
            ClickableSurfaceDefaults clickableSurfaceDefaults = ClickableSurfaceDefaults.INSTANCE;
            RoundedCornerShape roundedCornerShapeM1312RoundedCornerShape0680j_4 = RoundedCornerShapeKt.m1312RoundedCornerShape0680j_4(Dp.m7813constructorimpl(10.0f));
            int i7 = ClickableSurfaceDefaults.$stable;
            int i8 = i7 << 15;
            ClickableSurfaceShape clickableSurfaceShapeShape = clickableSurfaceDefaults.shape(roundedCornerShapeM1312RoundedCornerShape0680j_4, null, null, null, null, composer4, i8, 30);
            u61 u61Var = this.k;
            SurfaceKt.m8520Surface05tvjtU(function0, null, null, false, 0.0f, clickableSurfaceShapeShape, clickableSurfaceDefaults.m8292colorsoq7We08(u61Var.C, 0L, u61Var.D, 0L, 0L, 0L, 0L, 0L, composer4, i7 << 24, 250), ClickableSurfaceDefaults.scale$default(clickableSurfaceDefaults, 0.0f, 1.02f, 0.0f, 0.0f, 0.0f, 29, null), clickableSurfaceDefaults.border(null, new Border(BorderStrokeKt.m301BorderStrokecXLIe8U(Dp.m7813constructorimpl(2.0f), u61Var.b), 0.0f, null, 6, null), null, null, null, composer4, i8, 29), el0.c(u61Var), null, ComposableLambdaKt.rememberComposableLambda(1068716069, true, new w91(1, mutableState5), composer4, 54), composer4, 6, 48, 1054);
            MutableState mutableState6 = this.h;
            String str3 = (String) mutableState6.getValue();
            Modifier modifierFillMaxWidth$default2 = SizeKt.fillMaxWidth$default(companion, 0.0f, 1, null);
            Object objRememberedValue4 = composer4.rememberedValue();
            if (objRememberedValue4 == companion4.getEmpty()) {
                objRememberedValue4 = new p21(4, mutableState6);
                composer4.updateRememberedValue(objRememberedValue4);
            }
            yc2.d(str3, (Function1) objRememberedValue4, modifierFillMaxWidth$default2, false, mt.a, null, mt.b, null, null, null, null, false, null, null, composer4, 1597872, 6, 31656);
            MutableState mutableState7 = this.i;
            String str4 = (String) mutableState7.getValue();
            if (str4 == null || StringsKt.isBlank(str4)) {
                composer2 = composer4;
                composer2.startReplaceGroup(-496142596);
                composer2.endReplaceGroup();
            } else {
                composer4.startReplaceGroup(-496391340);
                String str5 = (String) mutableState7.getValue();
                if (str5 == null) {
                    str5 = "";
                }
                TextKt.m3048TextNvy7gAk(str5, null, ColorKt.Color(4281236786L), null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, materialTheme.getTypography(composer4, i4).getBodySmall(), composer4, RendererCapabilities.DECODER_SUPPORT_MASK, 0, 131066);
                composer2 = composer4;
                composer2.endReplaceGroup();
            }
            SpacerKt.Spacer(SizeKt.m1050height3ABfNKs(companion, Dp.m7813constructorimpl(8.0f)), composer2, 6);
            MeasurePolicy measurePolicyRowMeasurePolicy3 = RowKt.rowMeasurePolicy(arrangement.m712spacedBy0680j_4(Dp.m7813constructorimpl(12.0f)), companion2.getTop(), composer2, 6);
            long currentCompositeKeyHashCode5 = ComposablesKt.getCurrentCompositeKeyHashCode(composer2, 0);
            int i9 = (int) (currentCompositeKeyHashCode5 ^ (currentCompositeKeyHashCode5 >>> 32));
            CompositionLocalMap currentCompositionLocalMap5 = composer2.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier5 = ComposedModifierKt.materializeModifier(composer2, companion);
            Function0<ComposeUiNode> constructor5 = companion3.getConstructor();
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
            mr.z(companion3, composerM4318constructorimpl5, measurePolicyRowMeasurePolicy3, composerM4318constructorimpl5, currentCompositionLocalMap5);
            Updater.m4326setimpl(composerM4318constructorimpl5, modifierMaterializeModifier5, (Function2<? super T, ? super Modifier, Unit>) id.h(companion3, composerM4318constructorimpl5, Integer.valueOf(i9), composerM4318constructorimpl5));
            Modifier modifierFocusRequester = FocusRequesterModifierKt.focusRequester(companion, this.b);
            Object objRememberedValue5 = composer2.rememberedValue();
            Object empty2 = companion4.getEmpty();
            MutableState mutableState8 = this.j;
            if (objRememberedValue5 == empty2) {
                objRememberedValue5 = new p21(5, mutableState8);
                composer2.updateRememberedValue(objRememberedValue5);
            }
            Modifier modifierOnFocusChanged = FocusChangedModifierKt.onFocusChanged(modifierFocusRequester, (Function1) objRememberedValue5);
            ButtonColors buttonColorsI = hc2.i(jc2.b, false, composer2, 6, 2);
            ButtonBorder buttonBorderH = hc2.h(composer2);
            ButtonScale buttonScaleL = hc2.l(1.05f);
            ButtonGlow buttonGlowA = el0.a(u61Var);
            boolean zChanged = composer2.changed(function1);
            Object objRememberedValue6 = composer2.rememberedValue();
            if (zChanged || objRememberedValue6 == companion4.getEmpty()) {
                gh ghVar = new gh(function1, mutableState5, mutableState6, mutableState4, 11);
                composer2.updateRememberedValue(ghVar);
                objRememberedValue6 = ghVar;
            }
            Composer composer5 = composer2;
            ButtonKt.m8231ButtonTCVpFMg((Function0) objRememberedValue6, modifierOnFocusChanged, null, false, buttonScaleL, buttonGlowA, null, buttonColorsI, 0.0f, buttonBorderH, null, null, ComposableLambdaKt.rememberComposableLambda(-731807525, true, new p1(29, mutableState8), composer2, 54), composer5, 0, RendererCapabilities.DECODER_SUPPORT_MASK, 3404);
            Object objRememberedValue7 = composer5.rememberedValue();
            if (objRememberedValue7 == companion4.getEmpty()) {
                mutableState = mutableState2;
                i = 6;
                objRememberedValue7 = new p21(6, mutableState);
                composer5.updateRememberedValue(objRememberedValue7);
            } else {
                mutableState = mutableState2;
                i = 6;
            }
            ButtonKt.m8231ButtonTCVpFMg(this.l, FocusChangedModifierKt.onFocusChanged(companion, (Function1) objRememberedValue7), null, false, hc2.l(1.05f), el0.a(u61Var), null, hc2.i(jc2.c, false, composer5, i, 2), 0.0f, hc2.h(composer5), null, null, ComposableLambdaKt.rememberComposableLambda(608076356, true, new w91(0, mutableState), composer5, 54), composer5, 0, RendererCapabilities.DECODER_SUPPORT_MASK, 3404);
            if (i02.w(composer5)) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composer3.skipToGroupEnd();
        }
        return Unit.INSTANCE;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.jvm.functions.Function3
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        MutableState mutableState;
        int i;
        MutableState mutableState2;
        MutableState mutableState3;
        SnapshotMutationPolicy snapshotMutationPolicy;
        switch (this.a) {
            case 0:
                return a(obj, obj2, obj3);
            default:
                ScrollState scrollState = (ScrollState) this.m;
                CoroutineScope coroutineScope = (CoroutineScope) this.n;
                q72 q72Var = (q72) this.o;
                Composer composer = (Composer) obj2;
                int iIntValue = ((Integer) obj3).intValue();
                ((ColumnScope) obj).getClass();
                if (composer.shouldExecute((iIntValue & 17) != 16, iIntValue & 1)) {
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-857369880, iIntValue, -1, "com.dh.myembyapp.ui.components.ThemeSettingsDialog.<anonymous>.<anonymous>.<anonymous> (ThemeSettingsDialog.kt:140)");
                    }
                    Modifier modifierM999padding3ABfNKs = PaddingKt.m999padding3ABfNKs(ScrollKt.verticalScroll$default(SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null), scrollState, false, null, false, 14, null), Dp.m7813constructorimpl(12.0f));
                    MeasurePolicy measurePolicyColumnMeasurePolicy = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.m712spacedBy0680j_4(Dp.m7813constructorimpl(7.0f)), Alignment.INSTANCE.getStart(), composer, 6);
                    long currentCompositeKeyHashCode = ComposablesKt.getCurrentCompositeKeyHashCode(composer, 0);
                    char c = ' ';
                    int i2 = (int) (currentCompositeKeyHashCode ^ (currentCompositeKeyHashCode >>> 32));
                    CompositionLocalMap currentCompositionLocalMap = composer.getCurrentCompositionLocalMap();
                    Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(composer, modifierM999padding3ABfNKs);
                    ComposeUiNode.Companion companion = ComposeUiNode.INSTANCE;
                    Function0<ComposeUiNode> constructor = companion.getConstructor();
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
                    mr.z(companion, composerM4318constructorimpl, measurePolicyColumnMeasurePolicy, composerM4318constructorimpl, currentCompositionLocalMap);
                    Updater.m4326setimpl(composerM4318constructorimpl, modifierMaterializeModifier, (Function2<? super T, ? super Modifier, Unit>) id.h(companion, composerM4318constructorimpl, Integer.valueOf(i2), composerM4318constructorimpl));
                    ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.INSTANCE;
                    MaterialTheme materialTheme = MaterialTheme.INSTANCE;
                    int i3 = MaterialTheme.$stable;
                    TextStyle titleSmall = materialTheme.getTypography(composer, i3).getTitleSmall();
                    long primary = materialTheme.getColorScheme(composer, i3).getPrimary();
                    int i4 = 1;
                    boolean z = false;
                    TextKt.m3048TextNvy7gAk("主题", null, primary, null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, titleSmall, composer, 6, 0, 131066);
                    Composer composer2 = composer;
                    composer2.startReplaceGroup(630499716);
                    AppThemePreset[] appThemePresetArrValues = AppThemePreset.values();
                    int length = appThemePresetArrValues.length;
                    int i5 = 0;
                    int i6 = 0;
                    while (true) {
                        MutableState mutableState4 = this.c;
                        if (i5 < length) {
                            int i7 = length;
                            AppThemePreset appThemePreset = appThemePresetArrValues[i5];
                            int i8 = i6 + 1;
                            boolean z2 = appThemePreset == ((AppThemePreset) mutableState4.getValue()) ? true : z;
                            char c2 = c;
                            Modifier modifierFocusRequester = Modifier.INSTANCE;
                            Modifier modifierFillMaxWidth$default = SizeKt.fillMaxWidth$default(modifierFocusRequester, 0.0f, 1, null);
                            if (i6 == 0) {
                                modifierFocusRequester = FocusRequesterModifierKt.focusRequester(modifierFocusRequester, this.b);
                            }
                            Modifier modifierThen = modifierFillMaxWidth$default.then(modifierFocusRequester);
                            boolean zChanged = composer2.changed(mutableState4) | composer2.changed(appThemePreset.ordinal());
                            Object objRememberedValue = composer2.rememberedValue();
                            if (zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                                objRememberedValue = new kw1(6, appThemePreset, mutableState4);
                                composer2.updateRememberedValue(objRememberedValue);
                            }
                            Composer composer3 = composer2;
                            v72.e(appThemePreset, z2, modifierThen, (Function0) objRememberedValue, composer3, 0);
                            composer2 = composer3;
                            i5++;
                            c = c2;
                            length = i7;
                            i6 = i8;
                            z = false;
                        } else {
                            char c3 = c;
                            composer2.endReplaceGroup();
                            AppThemePreset appThemePreset2 = (AppThemePreset) mutableState4.getValue();
                            AppThemePreset appThemePreset3 = AppThemePreset.LIGHT;
                            MutableState mutableState5 = this.d;
                            if (appThemePreset2 == appThemePreset3) {
                                composer2.startReplaceGroup(-1928661918);
                                Modifier modifierFillMaxWidth$default2 = SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null);
                                MeasurePolicy measurePolicyColumnMeasurePolicy2 = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.m712spacedBy0680j_4(Dp.m7813constructorimpl(8.0f)), Alignment.INSTANCE.getStart(), composer2, 6);
                                long currentCompositeKeyHashCode2 = ComposablesKt.getCurrentCompositeKeyHashCode(composer2, 0);
                                int i9 = (int) (currentCompositeKeyHashCode2 ^ (currentCompositeKeyHashCode2 >>> c3));
                                CompositionLocalMap currentCompositionLocalMap2 = composer2.getCurrentCompositionLocalMap();
                                Modifier modifierMaterializeModifier2 = ComposedModifierKt.materializeModifier(composer2, modifierFillMaxWidth$default2);
                                ComposeUiNode.Companion companion2 = ComposeUiNode.INSTANCE;
                                Function0<ComposeUiNode> constructor2 = companion2.getConstructor();
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
                                mr.z(companion2, composerM4318constructorimpl2, measurePolicyColumnMeasurePolicy2, composerM4318constructorimpl2, currentCompositionLocalMap2);
                                Updater.m4326setimpl(composerM4318constructorimpl2, modifierMaterializeModifier2, (Function2<? super T, ? super Modifier, Unit>) id.h(companion2, composerM4318constructorimpl2, Integer.valueOf(i9), composerM4318constructorimpl2));
                                ColumnScopeInstance columnScopeInstance2 = ColumnScopeInstance.INSTANCE;
                                MaterialTheme materialTheme2 = MaterialTheme.INSTANCE;
                                int i10 = MaterialTheme.$stable;
                                TextStyle bodyMedium = materialTheme2.getTypography(composer2, i10).getBodyMedium();
                                long onSurface = materialTheme2.getColorScheme(composer2, i10).getOnSurface();
                                Composer composer4 = composer2;
                                mutableState = mutableState5;
                                int i11 = 4;
                                TextKt.m3048TextNvy7gAk("亮色背景模式", null, onSurface, null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, bodyMedium, composer4, 6, 0, 131066);
                                composer2 = composer4;
                                List<List> listChunked = CollectionsKt___CollectionsKt.chunked(ArraysKt.toList(LightThemeBackgroundStyle.values()), 4);
                                composer2.startReplaceGroup(1583114498);
                                for (List<LightThemeBackgroundStyle> list : listChunked) {
                                    Modifier modifierFillMaxWidth$default3 = SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null);
                                    MeasurePolicy measurePolicyRowMeasurePolicy = RowKt.rowMeasurePolicy(Arrangement.INSTANCE.m712spacedBy0680j_4(Dp.m7813constructorimpl(10.0f)), Alignment.INSTANCE.getTop(), composer2, 6);
                                    long currentCompositeKeyHashCode3 = ComposablesKt.getCurrentCompositeKeyHashCode(composer2, 0);
                                    int i12 = (int) (currentCompositeKeyHashCode3 ^ (currentCompositeKeyHashCode3 >>> c3));
                                    CompositionLocalMap currentCompositionLocalMap3 = composer2.getCurrentCompositionLocalMap();
                                    Modifier modifierMaterializeModifier3 = ComposedModifierKt.materializeModifier(composer2, modifierFillMaxWidth$default3);
                                    ComposeUiNode.Companion companion3 = ComposeUiNode.INSTANCE;
                                    int i13 = i11;
                                    Function0<ComposeUiNode> constructor3 = companion3.getConstructor();
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
                                    mr.z(companion3, composerM4318constructorimpl3, measurePolicyRowMeasurePolicy, composerM4318constructorimpl3, currentCompositionLocalMap3);
                                    Updater.m4326setimpl(composerM4318constructorimpl3, modifierMaterializeModifier3, (Function2<? super T, ? super Modifier, Unit>) id.h(companion3, composerM4318constructorimpl3, Integer.valueOf(i12), composerM4318constructorimpl3));
                                    RowScopeInstance rowScopeInstance = RowScopeInstance.INSTANCE;
                                    composer2.startReplaceGroup(318724305);
                                    for (LightThemeBackgroundStyle lightThemeBackgroundStyle : list) {
                                        boolean z3 = lightThemeBackgroundStyle == ((LightThemeBackgroundStyle) mutableState.getValue());
                                        Modifier modifierE = zs1.E(rowScopeInstance, Modifier.INSTANCE, 1.0f, false, 2, null);
                                        boolean zChanged2 = composer2.changed(mutableState) | composer2.changed(lightThemeBackgroundStyle.ordinal());
                                        Object objRememberedValue2 = composer2.rememberedValue();
                                        if (zChanged2 || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                                            objRememberedValue2 = new kw1(3, lightThemeBackgroundStyle, mutableState);
                                            composer2.updateRememberedValue(objRememberedValue2);
                                        }
                                        Composer composer5 = composer2;
                                        v72.c(lightThemeBackgroundStyle, z3, modifierE, (Function0) objRememberedValue2, composer5, 0);
                                        composer2 = composer5;
                                    }
                                    composer2.endReplaceGroup();
                                    composer2.startReplaceGroup(318740991);
                                    int size = 4 - list.size();
                                    for (int i14 = 0; i14 < size; i14++) {
                                        SpacerKt.Spacer(SizeKt.m1050height3ABfNKs(zs1.E(rowScopeInstance, Modifier.INSTANCE, 1.0f, false, 2, null), Dp.m7813constructorimpl(82.0f)), composer2, 0);
                                    }
                                    composer2.endReplaceGroup();
                                    composer2.endNode();
                                    i11 = i13;
                                }
                                i = i11;
                                composer2.endReplaceGroup();
                                composer2.endNode();
                                composer2.endReplaceGroup();
                            } else {
                                mutableState = mutableState5;
                                i = 4;
                                composer2.startReplaceGroup(-1926845628);
                                composer2.endReplaceGroup();
                            }
                            AppThemePreset appThemePreset4 = (AppThemePreset) mutableState4.getValue();
                            AppThemePreset appThemePreset5 = AppThemePreset.DARK;
                            MutableState mutableState6 = this.e;
                            MutableState mutableState7 = this.g;
                            if (appThemePreset4 == appThemePreset5) {
                                composer2.startReplaceGroup(-1926686071);
                                Modifier modifierFillMaxWidth$default4 = SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null);
                                MeasurePolicy measurePolicyColumnMeasurePolicy3 = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.m712spacedBy0680j_4(Dp.m7813constructorimpl(8.0f)), Alignment.INSTANCE.getStart(), composer2, 6);
                                long currentCompositeKeyHashCode4 = ComposablesKt.getCurrentCompositeKeyHashCode(composer2, 0);
                                int i15 = (int) (currentCompositeKeyHashCode4 ^ (currentCompositeKeyHashCode4 >>> c3));
                                CompositionLocalMap currentCompositionLocalMap4 = composer2.getCurrentCompositionLocalMap();
                                Modifier modifierMaterializeModifier4 = ComposedModifierKt.materializeModifier(composer2, modifierFillMaxWidth$default4);
                                ComposeUiNode.Companion companion4 = ComposeUiNode.INSTANCE;
                                Function0<ComposeUiNode> constructor4 = companion4.getConstructor();
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
                                mr.z(companion4, composerM4318constructorimpl4, measurePolicyColumnMeasurePolicy3, composerM4318constructorimpl4, currentCompositionLocalMap4);
                                Updater.m4326setimpl(composerM4318constructorimpl4, modifierMaterializeModifier4, (Function2<? super T, ? super Modifier, Unit>) id.h(companion4, composerM4318constructorimpl4, Integer.valueOf(i15), composerM4318constructorimpl4));
                                ColumnScopeInstance columnScopeInstance3 = ColumnScopeInstance.INSTANCE;
                                MaterialTheme materialTheme3 = MaterialTheme.INSTANCE;
                                int i16 = MaterialTheme.$stable;
                                TextStyle bodyMedium2 = materialTheme3.getTypography(composer2, i16).getBodyMedium();
                                long onSurface2 = materialTheme3.getColorScheme(composer2, i16).getOnSurface();
                                Composer composer6 = composer2;
                                MutableState mutableState8 = mutableState7;
                                mutableState2 = mutableState6;
                                TextKt.m3048TextNvy7gAk("深色背景模式", null, onSurface2, null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, bodyMedium2, composer6, 6, 0, 131066);
                                Composer composer7 = composer6;
                                List<List> listChunked2 = CollectionsKt___CollectionsKt.chunked(CollectionsKt.plus((Collection) ArraysKt.toList(DarkThemeStyle.values()), (Iterable) CollectionsKt.listOf((Object) null)), i);
                                composer7.startReplaceGroup(1442479068);
                                for (List<DarkThemeStyle> list2 : listChunked2) {
                                    Modifier modifierFillMaxWidth$default5 = SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, i4, null);
                                    MeasurePolicy measurePolicyRowMeasurePolicy2 = RowKt.rowMeasurePolicy(Arrangement.INSTANCE.m712spacedBy0680j_4(Dp.m7813constructorimpl(10.0f)), Alignment.INSTANCE.getTop(), composer7, 6);
                                    long currentCompositeKeyHashCode5 = ComposablesKt.getCurrentCompositeKeyHashCode(composer7, 0);
                                    int i17 = (int) (currentCompositeKeyHashCode5 ^ (currentCompositeKeyHashCode5 >>> c3));
                                    CompositionLocalMap currentCompositionLocalMap5 = composer7.getCurrentCompositionLocalMap();
                                    Modifier modifierMaterializeModifier5 = ComposedModifierKt.materializeModifier(composer7, modifierFillMaxWidth$default5);
                                    ComposeUiNode.Companion companion5 = ComposeUiNode.INSTANCE;
                                    Function0<ComposeUiNode> constructor5 = companion5.getConstructor();
                                    if (composer7.getApplier() == null) {
                                        ComposablesKt.invalidApplier();
                                    }
                                    composer7.startReusableNode();
                                    if (composer7.getInserting()) {
                                        composer7.createNode(constructor5);
                                    } else {
                                        composer7.useNode();
                                    }
                                    Composer composerM4318constructorimpl5 = Updater.m4318constructorimpl(composer7);
                                    mr.z(companion5, composerM4318constructorimpl5, measurePolicyRowMeasurePolicy2, composerM4318constructorimpl5, currentCompositionLocalMap5);
                                    Updater.m4326setimpl(composerM4318constructorimpl5, modifierMaterializeModifier5, (Function2<? super T, ? super Modifier, Unit>) id.h(companion5, composerM4318constructorimpl5, Integer.valueOf(i17), composerM4318constructorimpl5));
                                    RowScopeInstance rowScopeInstance2 = RowScopeInstance.INSTANCE;
                                    composer7.startReplaceGroup(1850961927);
                                    for (DarkThemeStyle darkThemeStyle : list2) {
                                        if (darkThemeStyle != null) {
                                            composer7.startReplaceGroup(919618112);
                                            DarkThemeGlowPosition darkThemeGlowPosition = (DarkThemeGlowPosition) mutableState8.getValue();
                                            boolean z4 = darkThemeStyle == ((DarkThemeStyle) mutableState2.getValue());
                                            Modifier modifierE2 = zs1.E(rowScopeInstance2, Modifier.INSTANCE, 1.0f, false, 2, null);
                                            boolean zChanged3 = composer7.changed(mutableState2) | composer7.changed(darkThemeStyle.ordinal());
                                            Object objRememberedValue3 = composer7.rememberedValue();
                                            if (zChanged3 || objRememberedValue3 == Composer.INSTANCE.getEmpty()) {
                                                objRememberedValue3 = new kw1(4, darkThemeStyle, mutableState2);
                                                composer7.updateRememberedValue(objRememberedValue3);
                                            }
                                            Function0 function0 = (Function0) objRememberedValue3;
                                            Composer composer8 = composer7;
                                            v72.a(darkThemeStyle, darkThemeGlowPosition, z4, modifierE2, function0, composer8, 0);
                                            composer7 = composer8;
                                            composer7.endReplaceGroup();
                                        } else {
                                            composer7.startReplaceGroup(920184978);
                                            v72.b(zs1.E(rowScopeInstance2, Modifier.INSTANCE, 1.0f, false, 2, null), composer7, 0);
                                            composer7.endReplaceGroup();
                                        }
                                    }
                                    composer7.endReplaceGroup();
                                    composer7.endNode();
                                    i4 = 1;
                                }
                                composer7.endReplaceGroup();
                                MaterialTheme materialTheme4 = MaterialTheme.INSTANCE;
                                int i18 = MaterialTheme.$stable;
                                Composer composer9 = composer7;
                                TextKt.m3048TextNvy7gAk("色雾位置", null, Color.m5151copywmQWz5c$default(materialTheme4.getColorScheme(composer7, i18).getOnSurface(), 0.82f, 0.0f, 0.0f, 0.0f, 14, null), null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, materialTheme4.getTypography(composer7, i18).getLabelMedium(), composer9, 6, 0, 131066);
                                composer2 = composer9;
                                Modifier modifierFillMaxWidth$default6 = SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null);
                                MeasurePolicy measurePolicyRowMeasurePolicy3 = RowKt.rowMeasurePolicy(Arrangement.INSTANCE.m712spacedBy0680j_4(Dp.m7813constructorimpl(10.0f)), Alignment.INSTANCE.getTop(), composer2, 6);
                                long currentCompositeKeyHashCode6 = ComposablesKt.getCurrentCompositeKeyHashCode(composer2, 0);
                                int i19 = (int) ((currentCompositeKeyHashCode6 >>> c3) ^ currentCompositeKeyHashCode6);
                                CompositionLocalMap currentCompositionLocalMap6 = composer2.getCurrentCompositionLocalMap();
                                Modifier modifierMaterializeModifier6 = ComposedModifierKt.materializeModifier(composer2, modifierFillMaxWidth$default6);
                                ComposeUiNode.Companion companion6 = ComposeUiNode.INSTANCE;
                                Function0<ComposeUiNode> constructor6 = companion6.getConstructor();
                                if (composer2.getApplier() == null) {
                                    ComposablesKt.invalidApplier();
                                }
                                composer2.startReusableNode();
                                if (composer2.getInserting()) {
                                    composer2.createNode(constructor6);
                                } else {
                                    composer2.useNode();
                                }
                                Composer composerM4318constructorimpl6 = Updater.m4318constructorimpl(composer2);
                                mr.z(companion6, composerM4318constructorimpl6, measurePolicyRowMeasurePolicy3, composerM4318constructorimpl6, currentCompositionLocalMap6);
                                Updater.m4326setimpl(composerM4318constructorimpl6, modifierMaterializeModifier6, (Function2<? super T, ? super Modifier, Unit>) id.h(companion6, composerM4318constructorimpl6, Integer.valueOf(i19), composerM4318constructorimpl6));
                                RowScopeInstance rowScopeInstance3 = RowScopeInstance.INSTANCE;
                                composer2.startReplaceGroup(462136979);
                                DarkThemeGlowPosition[] darkThemeGlowPositionArrValues = DarkThemeGlowPosition.values();
                                int length2 = darkThemeGlowPositionArrValues.length;
                                int i20 = 0;
                                while (i20 < length2) {
                                    DarkThemeGlowPosition darkThemeGlowPosition2 = darkThemeGlowPositionArrValues[i20];
                                    String displayName = darkThemeGlowPosition2.getDisplayName();
                                    boolean z5 = darkThemeGlowPosition2 == ((DarkThemeGlowPosition) mutableState8.getValue());
                                    Modifier modifierE3 = zs1.E(rowScopeInstance3, Modifier.INSTANCE, 1.0f, false, 2, null);
                                    RowScopeInstance rowScopeInstance4 = rowScopeInstance3;
                                    MutableState mutableState9 = mutableState8;
                                    boolean zChanged4 = composer2.changed(mutableState9) | composer2.changed(darkThemeGlowPosition2.ordinal());
                                    Object objRememberedValue4 = composer2.rememberedValue();
                                    if (zChanged4 || objRememberedValue4 == Composer.INSTANCE.getEmpty()) {
                                        objRememberedValue4 = new kw1(5, darkThemeGlowPosition2, mutableState9);
                                        composer2.updateRememberedValue(objRememberedValue4);
                                    }
                                    v72.g(0, composer2, modifierE3, displayName, (Function0) objRememberedValue4, z5);
                                    i20++;
                                    mutableState8 = mutableState9;
                                    rowScopeInstance3 = rowScopeInstance4;
                                }
                                mutableState3 = mutableState8;
                                composer2.endReplaceGroup();
                                composer2.endNode();
                                composer2.endNode();
                                composer2.endReplaceGroup();
                            } else {
                                mutableState2 = mutableState6;
                                mutableState3 = mutableState7;
                                composer2.startReplaceGroup(-1923738684);
                                composer2.endReplaceGroup();
                            }
                            Modifier.Companion companion7 = Modifier.INSTANCE;
                            Modifier modifierFillMaxWidth$default7 = SizeKt.fillMaxWidth$default(companion7, 0.0f, 1, null);
                            Arrangement arrangement = Arrangement.INSTANCE;
                            Arrangement.HorizontalOrVertical horizontalOrVerticalM712spacedBy0680j_4 = arrangement.m712spacedBy0680j_4(Dp.m7813constructorimpl(8.0f));
                            Alignment.Companion companion8 = Alignment.INSTANCE;
                            MeasurePolicy measurePolicyColumnMeasurePolicy4 = ColumnKt.columnMeasurePolicy(horizontalOrVerticalM712spacedBy0680j_4, companion8.getStart(), composer2, 6);
                            long currentCompositeKeyHashCode7 = ComposablesKt.getCurrentCompositeKeyHashCode(composer2, 0);
                            int i21 = (int) (currentCompositeKeyHashCode7 ^ (currentCompositeKeyHashCode7 >>> c3));
                            CompositionLocalMap currentCompositionLocalMap7 = composer2.getCurrentCompositionLocalMap();
                            Modifier modifierMaterializeModifier7 = ComposedModifierKt.materializeModifier(composer2, modifierFillMaxWidth$default7);
                            ComposeUiNode.Companion companion9 = ComposeUiNode.INSTANCE;
                            Function0<ComposeUiNode> constructor7 = companion9.getConstructor();
                            if (composer2.getApplier() == null) {
                                ComposablesKt.invalidApplier();
                            }
                            composer2.startReusableNode();
                            if (composer2.getInserting()) {
                                composer2.createNode(constructor7);
                            } else {
                                composer2.useNode();
                            }
                            Composer composerM4318constructorimpl7 = Updater.m4318constructorimpl(composer2);
                            mr.z(companion9, composerM4318constructorimpl7, measurePolicyColumnMeasurePolicy4, composerM4318constructorimpl7, currentCompositionLocalMap7);
                            Updater.m4326setimpl(composerM4318constructorimpl7, modifierMaterializeModifier7, (Function2<? super T, ? super Modifier, Unit>) id.h(companion9, composerM4318constructorimpl7, Integer.valueOf(i21), composerM4318constructorimpl7));
                            ColumnScopeInstance columnScopeInstance4 = ColumnScopeInstance.INSTANCE;
                            MaterialTheme materialTheme5 = MaterialTheme.INSTANCE;
                            int i22 = MaterialTheme.$stable;
                            Composer composer10 = composer2;
                            TextKt.m3048TextNvy7gAk("界面选项", null, materialTheme5.getColorScheme(composer2, i22).getOnSurface(), null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, materialTheme5.getTypography(composer2, i22).getBodyMedium(), composer10, 6, 0, 131066);
                            Modifier modifierFillMaxWidth$default8 = SizeKt.fillMaxWidth$default(companion7, 0.0f, 1, null);
                            MeasurePolicy measurePolicyRowMeasurePolicy4 = RowKt.rowMeasurePolicy(arrangement.m712spacedBy0680j_4(Dp.m7813constructorimpl(10.0f)), companion8.getTop(), composer10, 6);
                            long currentCompositeKeyHashCode8 = ComposablesKt.getCurrentCompositeKeyHashCode(composer10, 0);
                            int i23 = (int) ((currentCompositeKeyHashCode8 >>> c3) ^ currentCompositeKeyHashCode8);
                            CompositionLocalMap currentCompositionLocalMap8 = composer10.getCurrentCompositionLocalMap();
                            Modifier modifierMaterializeModifier8 = ComposedModifierKt.materializeModifier(composer10, modifierFillMaxWidth$default8);
                            Function0<ComposeUiNode> constructor8 = companion9.getConstructor();
                            if (composer10.getApplier() == null) {
                                ComposablesKt.invalidApplier();
                            }
                            composer10.startReusableNode();
                            if (composer10.getInserting()) {
                                composer10.createNode(constructor8);
                            } else {
                                composer10.useNode();
                            }
                            Composer composerM4318constructorimpl8 = Updater.m4318constructorimpl(composer10);
                            mr.z(companion9, composerM4318constructorimpl8, measurePolicyRowMeasurePolicy4, composerM4318constructorimpl8, currentCompositionLocalMap8);
                            Updater.m4326setimpl(composerM4318constructorimpl8, modifierMaterializeModifier8, (Function2<? super T, ? super Modifier, Unit>) id.h(companion9, composerM4318constructorimpl8, Integer.valueOf(i23), composerM4318constructorimpl8));
                            RowScopeInstance rowScopeInstance5 = RowScopeInstance.INSTANCE;
                            MutableState mutableState10 = this.i;
                            boolean zBooleanValue = ((Boolean) mutableState10.getValue()).booleanValue();
                            Modifier modifierM1069width3ABfNKs = SizeKt.m1069width3ABfNKs(companion7, Dp.m7813constructorimpl(176.0f));
                            boolean zChanged5 = composer10.changed(mutableState10);
                            Object objRememberedValue5 = composer10.rememberedValue();
                            if (zChanged5 || objRememberedValue5 == Composer.INSTANCE.getEmpty()) {
                                objRememberedValue5 = new s72(0, mutableState10);
                                composer10.updateRememberedValue(objRememberedValue5);
                            }
                            v72.h(3126, composer10, modifierM1069width3ABfNKs, "界面强调色", "跟随背景模式", (Function0) objRememberedValue5, zBooleanValue);
                            MutableState mutableState11 = this.j;
                            boolean zBooleanValue2 = ((Boolean) mutableState11.getValue()).booleanValue();
                            Modifier modifierM1069width3ABfNKs2 = SizeKt.m1069width3ABfNKs(companion7, Dp.m7813constructorimpl(176.0f));
                            boolean zChanged6 = composer10.changed(mutableState11);
                            Object objRememberedValue6 = composer10.rememberedValue();
                            if (zChanged6 || objRememberedValue6 == Composer.INSTANCE.getEmpty()) {
                                objRememberedValue6 = new s72(1, mutableState11);
                                composer10.updateRememberedValue(objRememberedValue6);
                            }
                            v72.h(3126, composer10, modifierM1069width3ABfNKs2, "悬浮边框", "边框与卡片留白", (Function0) objRememberedValue6, zBooleanValue2);
                            composer10.endNode();
                            MutableState mutableState12 = this.h;
                            int iIntValue2 = ((Number) mutableState12.getValue()).intValue();
                            MutableState mutableState13 = mutableState3;
                            Modifier modifierFillMaxWidth$default9 = SizeKt.fillMaxWidth$default(companion7, 0.0f, 1, null);
                            boolean zChanged7 = composer10.changed(mutableState12);
                            Object objRememberedValue7 = composer10.rememberedValue();
                            if (zChanged7 || objRememberedValue7 == Composer.INSTANCE.getEmpty()) {
                                objRememberedValue7 = new s72(2, mutableState12);
                                composer10.updateRememberedValue(objRememberedValue7);
                            }
                            v72.d(iIntValue2, modifierFillMaxWidth$default9, (Function0) objRememberedValue7, composer10, 48);
                            composer10.endNode();
                            Modifier modifierFillMaxWidth$default10 = SizeKt.fillMaxWidth$default(companion7, 0.0f, 1, null);
                            MeasurePolicy measurePolicyRowMeasurePolicy5 = RowKt.rowMeasurePolicy(arrangement.m713spacedByD5KLDUw(Dp.m7813constructorimpl(12.0f), companion8.getEnd()), companion8.getTop(), composer10, 6);
                            long currentCompositeKeyHashCode9 = ComposablesKt.getCurrentCompositeKeyHashCode(composer10, 0);
                            int i24 = (int) (currentCompositeKeyHashCode9 ^ (currentCompositeKeyHashCode9 >>> c3));
                            CompositionLocalMap currentCompositionLocalMap9 = composer10.getCurrentCompositionLocalMap();
                            Modifier modifierMaterializeModifier9 = ComposedModifierKt.materializeModifier(composer10, modifierFillMaxWidth$default10);
                            Function0<ComposeUiNode> constructor9 = companion9.getConstructor();
                            if (composer10.getApplier() == null) {
                                ComposablesKt.invalidApplier();
                            }
                            composer10.startReusableNode();
                            if (composer10.getInserting()) {
                                composer10.createNode(constructor9);
                            } else {
                                composer10.useNode();
                            }
                            Composer composerM4318constructorimpl9 = Updater.m4318constructorimpl(composer10);
                            mr.z(companion9, composerM4318constructorimpl9, measurePolicyRowMeasurePolicy5, composerM4318constructorimpl9, currentCompositionLocalMap9);
                            Updater.m4326setimpl(composerM4318constructorimpl9, modifierMaterializeModifier9, (Function2<? super T, ? super Modifier, Unit>) id.h(companion9, composerM4318constructorimpl9, Integer.valueOf(i24), composerM4318constructorimpl9));
                            Object objRememberedValue8 = composer10.rememberedValue();
                            Composer.Companion companion10 = Composer.INSTANCE;
                            if (objRememberedValue8 == companion10.getEmpty()) {
                                snapshotMutationPolicy = null;
                                objRememberedValue8 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Boolean.FALSE, null, 2, null);
                                composer10.updateRememberedValue(objRememberedValue8);
                            } else {
                                snapshotMutationPolicy = null;
                            }
                            MutableState mutableState14 = (MutableState) objRememberedValue8;
                            Object objRememberedValue9 = composer10.rememberedValue();
                            if (objRememberedValue9 == companion10.getEmpty()) {
                                objRememberedValue9 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Boolean.FALSE, snapshotMutationPolicy, 2, snapshotMutationPolicy);
                                composer10.updateRememberedValue(objRememberedValue9);
                            }
                            MutableState mutableState15 = (MutableState) objRememberedValue9;
                            ButtonColors buttonColorsI = hc2.i(jc2.c, false, composer10, 6, 2);
                            ButtonScale buttonScaleL = hc2.l(1.05f);
                            u61 u61Var = this.k;
                            ButtonGlow buttonGlowA = el0.a(u61Var);
                            ButtonBorder buttonBorderH = hc2.h(composer10);
                            Modifier modifierM1050height3ABfNKs = SizeKt.m1050height3ABfNKs(SizeKt.m1069width3ABfNKs(companion7, Dp.m7813constructorimpl(96.0f)), Dp.m7813constructorimpl(42.0f));
                            Object objRememberedValue10 = composer10.rememberedValue();
                            if (objRememberedValue10 == companion10.getEmpty()) {
                                objRememberedValue10 = new b42(4, mutableState14);
                                composer10.updateRememberedValue(objRememberedValue10);
                            }
                            Modifier modifierOnFocusChanged = FocusChangedModifierKt.onFocusChanged(modifierM1050height3ABfNKs, (Function1) objRememberedValue10);
                            ComposableLambda composableLambdaRememberComposableLambda = ComposableLambdaKt.rememberComposableLambda(-2035803214, true, new w91(19, mutableState14), composer10, 54);
                            Function0 function1 = this.l;
                            ButtonKt.m8231ButtonTCVpFMg(function1, modifierOnFocusChanged, null, false, buttonScaleL, buttonGlowA, null, buttonColorsI, 0.0f, buttonBorderH, null, null, composableLambdaRememberComposableLambda, composer10, 0, RendererCapabilities.DECODER_SUPPORT_MASK, 3404);
                            ButtonColors buttonColorsI2 = hc2.i(jc2.b, false, composer10, 6, 2);
                            ButtonScale buttonScaleL2 = hc2.l(1.05f);
                            ButtonGlow buttonGlowA2 = el0.a(u61Var);
                            ButtonBorder buttonBorderH2 = hc2.h(composer10);
                            Modifier modifierM1050height3ABfNKs2 = SizeKt.m1050height3ABfNKs(SizeKt.m1069width3ABfNKs(companion7, Dp.m7813constructorimpl(96.0f)), Dp.m7813constructorimpl(42.0f));
                            Object objRememberedValue11 = composer10.rememberedValue();
                            if (objRememberedValue11 == companion10.getEmpty()) {
                                objRememberedValue11 = new b42(5, mutableState15);
                                composer10.updateRememberedValue(objRememberedValue11);
                            }
                            Modifier modifierOnFocusChanged2 = FocusChangedModifierKt.onFocusChanged(modifierM1050height3ABfNKs2, (Function1) objRememberedValue11);
                            boolean zChangedInstance = composer10.changedInstance(coroutineScope) | composer10.changedInstance(q72Var) | composer10.changed(mutableState4) | composer10.changed(mutableState) | composer10.changed(mutableState2) | composer10.changed(mutableState13) | composer10.changed(mutableState10) | composer10.changed(mutableState11) | composer10.changed(mutableState12) | composer10.changed(function1);
                            Object objRememberedValue12 = composer10.rememberedValue();
                            if (zChangedInstance || objRememberedValue12 == companion10.getEmpty()) {
                                ih ihVar = new ih(coroutineScope, q72Var, function1, mutableState4, mutableState, mutableState2, mutableState13, mutableState10, mutableState11, mutableState12);
                                composer10.updateRememberedValue(ihVar);
                                objRememberedValue12 = ihVar;
                            }
                            ButtonKt.m8231ButtonTCVpFMg((Function0) objRememberedValue12, modifierOnFocusChanged2, null, false, buttonScaleL2, buttonGlowA2, null, buttonColorsI2, 0.0f, buttonBorderH2, null, null, ComposableLambdaKt.rememberComposableLambda(250558761, true, new w91(20, mutableState15), composer10, 54), composer10, 0, RendererCapabilities.DECODER_SUPPORT_MASK, 3404);
                            if (x2.m(composer10)) {
                                ComposerKt.traceEventEnd();
                            }
                        }
                    }
                } else {
                    composer.skipToGroupEnd();
                }
                return Unit.INSTANCE;
        }
    }

    public /* synthetic */ u91(ScrollState scrollState, FocusRequester focusRequester, MutableState mutableState, MutableState mutableState2, MutableState mutableState3, MutableState mutableState4, MutableState mutableState5, MutableState mutableState6, MutableState mutableState7, u61 u61Var, Function0 function0, CoroutineScope coroutineScope, q72 q72Var) {
        this.m = scrollState;
        this.b = focusRequester;
        this.c = mutableState;
        this.d = mutableState2;
        this.e = mutableState3;
        this.g = mutableState4;
        this.h = mutableState5;
        this.i = mutableState6;
        this.j = mutableState7;
        this.k = u61Var;
        this.l = function0;
        this.n = coroutineScope;
        this.o = q72Var;
    }
}
