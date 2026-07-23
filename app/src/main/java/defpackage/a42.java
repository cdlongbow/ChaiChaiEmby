package defpackage;

import android.graphics.Bitmap;
import androidx.compose.foundation.ImageKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnScope;
import androidx.compose.foundation.layout.ColumnScopeInstance;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.RowKt;
import androidx.compose.foundation.layout.RowScope;
import androidx.compose.foundation.layout.RowScopeInstance;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.SpacerKt;
import androidx.compose.material3.MaterialTheme;
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
import androidx.compose.ui.focus.FocusChangedModifierKt;
import androidx.compose.ui.graphics.AndroidImageBitmap_androidKt;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.ColorFilter;
import androidx.compose.ui.graphics.ColorKt;
import androidx.compose.ui.graphics.painter.Painter;
import androidx.compose.ui.layout.ContentScale;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.res.PainterResources_androidKt;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.text.font.FontWeight;
import androidx.compose.ui.text.style.TextOverflow;
import androidx.compose.ui.unit.Dp;
import androidx.media3.exoplayer.RendererCapabilities;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class a42 implements Function3 {
    public final /* synthetic */ int a = 0;
    public final /* synthetic */ String b;
    public final /* synthetic */ boolean c;
    public final /* synthetic */ boolean d;
    public final /* synthetic */ MutableState e;
    public final /* synthetic */ Object g;
    public final /* synthetic */ Object h;

    public /* synthetic */ a42(Bitmap bitmap, String str, boolean z, boolean z2, Function0 function0, MutableState mutableState) {
        this.g = bitmap;
        this.b = str;
        this.c = z;
        this.d = z2;
        this.h = function0;
        this.e = mutableState;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.jvm.functions.Function3
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        Composer composer;
        long jU;
        int i = this.a;
        MutableState mutableState = this.e;
        boolean z = this.d;
        boolean z2 = this.c;
        Object obj4 = this.h;
        Object obj5 = this.g;
        switch (i) {
            case 0:
                Bitmap bitmap = (Bitmap) obj5;
                Function0 function0 = (Function0) obj4;
                Composer composer2 = (Composer) obj2;
                int iIntValue = ((Integer) obj3).intValue();
                ((ColumnScope) obj).getClass();
                if (composer2.shouldExecute((iIntValue & 17) != 16, iIntValue & 1)) {
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(293824569, iIntValue, -1, "com.dh.myembyapp.ui.components.SubtitleFontUploadDialog.<anonymous>.<anonymous>.<anonymous> (SubtitleFontUploadDialog.kt:61)");
                    }
                    Modifier.Companion companion = Modifier.INSTANCE;
                    Modifier modifierM999padding3ABfNKs = PaddingKt.m999padding3ABfNKs(SizeKt.fillMaxWidth$default(companion, 0.0f, 1, null), Dp.m7813constructorimpl(20.0f));
                    MeasurePolicy measurePolicyColumnMeasurePolicy = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.m712spacedBy0680j_4(Dp.m7813constructorimpl(16.0f)), Alignment.INSTANCE.getCenterHorizontally(), composer2, 54);
                    long currentCompositeKeyHashCode = ComposablesKt.getCurrentCompositeKeyHashCode(composer2, 0);
                    int i2 = (int) (currentCompositeKeyHashCode ^ (currentCompositeKeyHashCode >>> 32));
                    CompositionLocalMap currentCompositionLocalMap = composer2.getCurrentCompositionLocalMap();
                    Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(composer2, modifierM999padding3ABfNKs);
                    ComposeUiNode.Companion companion2 = ComposeUiNode.INSTANCE;
                    Function0<ComposeUiNode> constructor = companion2.getConstructor();
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
                    mr.z(companion2, composerM4318constructorimpl, measurePolicyColumnMeasurePolicy, composerM4318constructorimpl, currentCompositionLocalMap);
                    Updater.m4326setimpl(composerM4318constructorimpl, modifierMaterializeModifier, (Function2<? super T, ? super Modifier, Unit>) id.h(companion2, composerM4318constructorimpl, Integer.valueOf(i2), composerM4318constructorimpl));
                    ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.INSTANCE;
                    MaterialTheme materialTheme = MaterialTheme.INSTANCE;
                    int i3 = MaterialTheme.$stable;
                    TextKt.m3048TextNvy7gAk("手机扫码上传字体", null, materialTheme.getColorScheme(composer2, i3).getPrimary(), null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, materialTheme.getTypography(composer2, i3).getTitleMedium(), composer2, 6, 0, 131066);
                    if (bitmap != null) {
                        composer2.startReplaceGroup(302991543);
                        ImageKt.m332Image5hnEew(AndroidImageBitmap_androidKt.asImageBitmap(bitmap), "上传字体二维码", SizeKt.m1064size3ABfNKs(companion, Dp.m7813constructorimpl(220.0f)), null, null, 0.0f, null, 0, composer2, 432, 248);
                        String str = this.b;
                        if (str == null) {
                            str = "";
                        }
                        TextKt.m3048TextNvy7gAk(str, null, Color.m5151copywmQWz5c$default(materialTheme.getColorScheme(composer2, i3).getOnSurface(), 0.7f, 0.0f, 0.0f, 0.0f, 14, null), null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, materialTheme.getTypography(composer2, i3).getBodySmall(), composer2, 0, 0, 131066);
                        TextKt.m3048TextNvy7gAk("在手机浏览器打开上传页面，支持 ttf/otf", null, Color.m5151copywmQWz5c$default(materialTheme.getColorScheme(composer2, i3).getOnSurface(), 0.7f, 0.0f, 0.0f, 0.0f, 14, null), null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, materialTheme.getTypography(composer2, i3).getBodySmall(), composer2, 6, 0, 131066);
                        composer2.endReplaceGroup();
                    } else if (z2) {
                        composer2.startReplaceGroup(303820669);
                        TextKt.m3048TextNvy7gAk("无法启动上传服务，请检查网络连接", null, materialTheme.getColorScheme(composer2, i3).getError(), null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, materialTheme.getTypography(composer2, i3).getBodySmall(), composer2, 6, 0, 131066);
                        composer2.endReplaceGroup();
                    } else if (z) {
                        composer2.startReplaceGroup(304114859);
                        TextKt.m3048TextNvy7gAk("正在启动上传服务...", null, Color.m5151copywmQWz5c$default(materialTheme.getColorScheme(composer2, i3).getOnSurface(), 0.7f, 0.0f, 0.0f, 0.0f, 14, null), null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, materialTheme.getTypography(composer2, i3).getBodySmall(), composer2, 6, 0, 131066);
                        composer2.endReplaceGroup();
                    } else {
                        composer2.startReplaceGroup(304409669);
                        TextKt.m3048TextNvy7gAk("无法启动上传服务", null, materialTheme.getColorScheme(composer2, i3).getError(), null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, materialTheme.getTypography(composer2, i3).getBodySmall(), composer2, 6, 0, 131066);
                        composer2.endReplaceGroup();
                    }
                    Object objRememberedValue = composer2.rememberedValue();
                    if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                        objRememberedValue = new b42(0, mutableState);
                        composer2.updateRememberedValue(objRememberedValue);
                    }
                    ButtonKt.m8231ButtonTCVpFMg(function0, FocusChangedModifierKt.onFocusChanged(companion, (Function1) objRememberedValue), null, false, hc2.l(1.05f), null, null, hc2.i(jc2.c, false, composer2, 6, 2), 0.0f, hc2.h(composer2), null, null, ComposableLambdaKt.rememberComposableLambda(-192207725, true, new w91(18, mutableState), composer2, 54), composer2, 0, RendererCapabilities.DECODER_SUPPORT_MASK, 3436);
                    composer2.endNode();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                } else {
                    composer2.skipToGroupEnd();
                }
                break;
            default:
                Integer num = (Integer) obj5;
                String str2 = (String) obj4;
                Composer composer3 = (Composer) obj2;
                int iIntValue2 = ((Integer) obj3).intValue();
                ((RowScope) obj).getClass();
                if (composer3.shouldExecute((iIntValue2 & 17) != 16, iIntValue2 & 1)) {
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-1144869446, iIntValue2, -1, "com.dh.myembyapp.ui.screens.home.ServerButton.<anonymous> (TopNavigation.kt:583)");
                    }
                    Arrangement.HorizontalOrVertical center = Arrangement.INSTANCE.getCenter();
                    Alignment.Vertical centerVertically = Alignment.INSTANCE.getCenterVertically();
                    Modifier.Companion companion3 = Modifier.INSTANCE;
                    Modifier modifierWrapContentWidth$default = SizeKt.wrapContentWidth$default(companion3, null, false, 3, null);
                    MeasurePolicy measurePolicyRowMeasurePolicy = RowKt.rowMeasurePolicy(center, centerVertically, composer3, 54);
                    long currentCompositeKeyHashCode2 = ComposablesKt.getCurrentCompositeKeyHashCode(composer3, 0);
                    int i4 = (int) (currentCompositeKeyHashCode2 ^ (currentCompositeKeyHashCode2 >>> 32));
                    CompositionLocalMap currentCompositionLocalMap2 = composer3.getCurrentCompositionLocalMap();
                    Modifier modifierMaterializeModifier2 = ComposedModifierKt.materializeModifier(composer3, modifierWrapContentWidth$default);
                    ComposeUiNode.Companion companion4 = ComposeUiNode.INSTANCE;
                    Function0<ComposeUiNode> constructor2 = companion4.getConstructor();
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
                    mr.z(companion4, composerM4318constructorimpl2, measurePolicyRowMeasurePolicy, composerM4318constructorimpl2, currentCompositionLocalMap2);
                    Updater.m4326setimpl(composerM4318constructorimpl2, modifierMaterializeModifier2, (Function2<? super T, ? super Modifier, Unit>) id.h(companion4, composerM4318constructorimpl2, Integer.valueOf(i4), composerM4318constructorimpl2));
                    RowScopeInstance rowScopeInstance = RowScopeInstance.INSTANCE;
                    String str3 = this.b;
                    if (num != null) {
                        composer3.startReplaceGroup(-2015440086);
                        ImageKt.Image(PainterResources_androidKt.painterResource(num.intValue(), composer3, 0), c61.n(str3, " 图标"), SizeKt.m1064size3ABfNKs(companion3, Dp.m7813constructorimpl(34.0f)), (Alignment) null, ContentScale.INSTANCE.getFit(), 0.0f, (ColorFilter) null, composer3, Painter.$stable | 24960, 104);
                        composer = composer3;
                        composer.endReplaceGroup();
                    } else {
                        composer = composer3;
                        composer.startReplaceGroup(-2015146826);
                        lx1.c(str2, str3 + " 图标", SizeKt.m1064size3ABfNKs(companion3, Dp.m7813constructorimpl(34.0f)), ContentScale.INSTANCE.getFit(), composer, 3456, 0);
                        composer.endReplaceGroup();
                    }
                    SpacerKt.Spacer(SizeKt.m1069width3ABfNKs(companion3, Dp.m7813constructorimpl(6.0f)), composer, 6);
                    MaterialTheme materialTheme2 = MaterialTheme.INSTANCE;
                    int i5 = MaterialTheme.$stable;
                    TextStyle titleSmall = materialTheme2.getTypography(composer, i5).getTitleSmall();
                    FontWeight medium = FontWeight.INSTANCE.getMedium();
                    if (((Boolean) mutableState.getValue()).booleanValue() && z2 && z) {
                        composer.startReplaceGroup(-2014574349);
                        composer.endReplaceGroup();
                        jU = ColorKt.Color(4279308561L);
                    } else if (((Boolean) mutableState.getValue()).booleanValue() && z2) {
                        composer.startReplaceGroup(-2014473537);
                        jU = materialTheme2.getColorScheme(composer, i5).getOnSecondary();
                        composer.endReplaceGroup();
                    } else {
                        jU = kb0.u(composer, -2014391263, materialTheme2, composer, i5);
                    }
                    TextKt.m3048TextNvy7gAk(str3, null, jU, null, 0L, null, medium, null, 0L, null, null, 0L, TextOverflow.INSTANCE.m7761getEllipsisgIe3tQ8(), false, 1, 0, null, titleSmall, composer, 1572864, 24960, 110522);
                    SpacerKt.Spacer(SizeKt.m1069width3ABfNKs(companion3, Dp.m7813constructorimpl(4.0f)), composer, 6);
                    composer.endNode();
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

    public /* synthetic */ a42(Integer num, String str, String str2, boolean z, boolean z2, MutableState mutableState) {
        this.g = num;
        this.b = str;
        this.h = str2;
        this.c = z;
        this.d = z2;
        this.e = mutableState;
    }
}
