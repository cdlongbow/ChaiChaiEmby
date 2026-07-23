package defpackage;

import androidx.compose.foundation.interaction.MutableInteractionSource;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnScopeInstance;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.foundation.layout.RowKt;
import androidx.compose.foundation.layout.RowScopeInstance;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.lazy.LazyDslKt;
import androidx.compose.material3.CheckboxColors;
import androidx.compose.material3.CheckboxKt;
import androidx.compose.material3.MaterialTheme;
import androidx.compose.material3.ProgressIndicatorKt;
import androidx.compose.material3.SliderColors;
import androidx.compose.material3.SliderKt;
import androidx.compose.material3.SliderState;
import androidx.compose.material3.TextKt;
import androidx.compose.material3.TooltipKt;
import androidx.compose.material3.TooltipState;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.Updater;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.focus.FocusRequester;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.drawscope.Stroke;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.text.style.TextAlign;
import androidx.compose.ui.unit.Dp;
import androidx.compose.ui.unit.TextUnitKt;
import androidx.compose.ui.window.PopupPositionProvider;
import androidx.media3.exoplayer.RendererCapabilities;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class kp implements Function2 {
    public final /* synthetic */ int a = 2;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ boolean c;
    public final /* synthetic */ int d;
    public final /* synthetic */ int e;
    public final /* synthetic */ Object g;
    public final /* synthetic */ Object h;
    public final /* synthetic */ Object i;
    public final /* synthetic */ Object j;
    public final /* synthetic */ Object k;
    public final /* synthetic */ Object l;

    public /* synthetic */ kp(jb1 jb1Var, boolean z, List list, boolean z2, int i, String str, String str2, Function2 function2, int i2, FocusRequester focusRequester) {
        this.g = jb1Var;
        this.b = z;
        this.h = list;
        this.c = z2;
        this.d = i;
        this.i = str;
        this.j = str2;
        this.k = function2;
        this.e = i2;
        this.l = focusRequester;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        String strF;
        int i = this.a;
        Object obj3 = this.l;
        Object obj4 = this.k;
        Object obj5 = this.j;
        Object obj6 = this.i;
        Object obj7 = this.h;
        Object obj8 = this.g;
        switch (i) {
            case 0:
                return CheckboxKt.Checkbox$lambda$6(this.b, (Function1) obj8, (Stroke) obj7, (Stroke) obj6, (Modifier) obj5, this.c, (CheckboxColors) obj4, (MutableInteractionSource) obj3, this.d, this.e, (Composer) obj, ((Integer) obj2).intValue());
            case 1:
                jb1 jb1Var = (jb1) obj8;
                List list = (List) obj7;
                String str = (String) obj6;
                String str2 = (String) obj5;
                Function2 function2 = (Function2) obj4;
                FocusRequester focusRequester = (FocusRequester) obj3;
                Composer composer = (Composer) obj;
                int iIntValue = ((Integer) obj2).intValue();
                if (composer.shouldExecute((iIntValue & 3) != 2, iIntValue & 1)) {
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(214073628, iIntValue, -1, "com.dh.myembyapp.ui.screens.detail.OtherServerResourcesDialog.<anonymous>.<anonymous> (DetailScreen.kt:3478)");
                    }
                    Modifier.Companion companion = Modifier.INSTANCE;
                    Modifier modifierM1000paddingVpY3zN4 = PaddingKt.m1000paddingVpY3zN4(SizeKt.fillMaxSize$default(companion, 0.0f, 1, null), Dp.m7813constructorimpl(18.0f), Dp.m7813constructorimpl(14.0f));
                    Arrangement arrangement = Arrangement.INSTANCE;
                    Arrangement.HorizontalOrVertical horizontalOrVerticalM712spacedBy0680j_4 = arrangement.m712spacedBy0680j_4(Dp.m7813constructorimpl(12.0f));
                    Alignment.Companion companion2 = Alignment.INSTANCE;
                    MeasurePolicy measurePolicyColumnMeasurePolicy = ColumnKt.columnMeasurePolicy(horizontalOrVerticalM712spacedBy0680j_4, companion2.getStart(), composer, 6);
                    long currentCompositeKeyHashCode = ComposablesKt.getCurrentCompositeKeyHashCode(composer, 0);
                    int i2 = (int) (currentCompositeKeyHashCode ^ (currentCompositeKeyHashCode >>> 32));
                    CompositionLocalMap currentCompositionLocalMap = composer.getCurrentCompositionLocalMap();
                    Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(composer, modifierM1000paddingVpY3zN4);
                    ComposeUiNode.Companion companion3 = ComposeUiNode.INSTANCE;
                    Function0<ComposeUiNode> constructor = companion3.getConstructor();
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
                    mr.z(companion3, composerM4318constructorimpl, measurePolicyColumnMeasurePolicy, composerM4318constructorimpl, currentCompositionLocalMap);
                    Updater.m4326setimpl(composerM4318constructorimpl, modifierMaterializeModifier, (Function2<? super T, ? super Modifier, Unit>) id.h(companion3, composerM4318constructorimpl, Integer.valueOf(i2), composerM4318constructorimpl));
                    ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.INSTANCE;
                    Modifier modifierFillMaxWidth$default = SizeKt.fillMaxWidth$default(companion, 0.0f, 1, null);
                    MeasurePolicy measurePolicyP = mr.p(2.0f, arrangement, companion2.getCenterHorizontally(), composer, 54);
                    long currentCompositeKeyHashCode2 = ComposablesKt.getCurrentCompositeKeyHashCode(composer, 0);
                    int i3 = (int) (currentCompositeKeyHashCode2 ^ (currentCompositeKeyHashCode2 >>> 32));
                    CompositionLocalMap currentCompositionLocalMap2 = composer.getCurrentCompositionLocalMap();
                    Modifier modifierMaterializeModifier2 = ComposedModifierKt.materializeModifier(composer, modifierFillMaxWidth$default);
                    Function0<ComposeUiNode> constructor2 = companion3.getConstructor();
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
                    mr.z(companion3, composerM4318constructorimpl2, measurePolicyP, composerM4318constructorimpl2, currentCompositionLocalMap2);
                    Updater.m4326setimpl(composerM4318constructorimpl2, modifierMaterializeModifier2, (Function2<? super T, ? super Modifier, Unit>) id.h(companion3, composerM4318constructorimpl2, Integer.valueOf(i3), composerM4318constructorimpl2));
                    MaterialTheme materialTheme = MaterialTheme.INSTANCE;
                    int i4 = MaterialTheme.$stable;
                    TextStyle textStyleM7288copyp1EtxEg$default = TextStyle.m7288copyp1EtxEg$default(materialTheme.getTypography(composer, i4).getTitleLarge(), 0L, TextUnitKt.getSp(17), null, null, null, null, null, 0L, null, null, null, 0L, null, null, null, 0, 0, 0L, null, null, null, 0, 0, null, 16777213, null);
                    Color.Companion companion4 = Color.INSTANCE;
                    TextKt.m3048TextNvy7gAk("搜索其它版本", null, companion4.m5189getWhite0d7_KjU(), null, 0L, null, null, null, 0L, null, TextAlign.m7696boximpl(TextAlign.INSTANCE.m7703getCentere0LSkKk()), 0L, 0, false, 0, 0, null, textStyleM7288copyp1EtxEg$default, composer, 390, 0, 130042);
                    MeasurePolicy measurePolicyRowMeasurePolicy = RowKt.rowMeasurePolicy(arrangement.m712spacedBy0680j_4(Dp.m7813constructorimpl(8.0f)), companion2.getCenterVertically(), composer, 54);
                    long currentCompositeKeyHashCode3 = ComposablesKt.getCurrentCompositeKeyHashCode(composer, 0);
                    int i5 = (int) (currentCompositeKeyHashCode3 ^ (currentCompositeKeyHashCode3 >>> 32));
                    CompositionLocalMap currentCompositionLocalMap3 = composer.getCurrentCompositionLocalMap();
                    Modifier modifierMaterializeModifier3 = ComposedModifierKt.materializeModifier(composer, companion);
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
                    mr.z(companion3, composerM4318constructorimpl3, measurePolicyRowMeasurePolicy, composerM4318constructorimpl3, currentCompositionLocalMap3);
                    Updater.m4326setimpl(composerM4318constructorimpl3, modifierMaterializeModifier3, (Function2<? super T, ? super Modifier, Unit>) id.h(companion3, composerM4318constructorimpl3, Integer.valueOf(i5), composerM4318constructorimpl3));
                    RowScopeInstance rowScopeInstance = RowScopeInstance.INSTANCE;
                    String str3 = jb1Var.c;
                    List list2 = jb1Var.b;
                    TextKt.m3048TextNvy7gAk(str3 != null ? str3 : x2.f(this.e, "一共搜索到 ", " 个"), null, Color.m5151copywmQWz5c$default(companion4.m5189getWhite0d7_KjU(), 0.78f, 0.0f, 0.0f, 0.0f, 14, null), null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, TextStyle.m7288copyp1EtxEg$default(materialTheme.getTypography(composer, i4).getBodySmall(), 0L, TextUnitKt.getSp(12), null, null, null, null, null, 0L, null, null, null, 0L, null, null, null, 0, 0, 0L, null, null, null, 0, 0, null, 16777213, null), composer, RendererCapabilities.DECODER_SUPPORT_MASK, 0, 131066);
                    boolean z = this.b;
                    if (str3 == null && z) {
                        composer.startReplaceGroup(-1772013759);
                        ProgressIndicatorKt.m2703CircularProgressIndicator4lLiAd8(SizeKt.m1064size3ABfNKs(companion, Dp.m7813constructorimpl(13.0f)), Color.m5151copywmQWz5c$default(companion4.m5189getWhite0d7_KjU(), 0.85f, 0.0f, 0.0f, 0.0f, 14, null), Dp.m7813constructorimpl(2.0f), 0L, 0, 0.0f, composer, 438, 56);
                        composer.endReplaceGroup();
                    } else {
                        composer.startReplaceGroup(-1771752522);
                        composer.endReplaceGroup();
                    }
                    composer.endNode();
                    composer.endNode();
                    if (str3 != null) {
                        composer.startReplaceGroup(-472097003);
                        u90.p0(composer, 0, str3);
                        composer.endReplaceGroup();
                    } else if (list2.isEmpty() || (z && list.isEmpty())) {
                        composer.startReplaceGroup(-471917420);
                        u90.p0(composer, 6, "正在查找其他服资源...");
                        composer.endReplaceGroup();
                    } else if (this.c && list.isEmpty()) {
                        composer.startReplaceGroup(-471755197);
                        int i6 = this.d;
                        if (i6 == 0) {
                            strF = "未搜索到其他服资源";
                        } else {
                            strF = i6 == list2.size() ? "查询其他服资源失败，请稍后重试" : x2.f(i6, "未搜索到其他服资源，另有 ", " 个服务器查询失败");
                        }
                        u90.p0(composer, 0, strF);
                        composer.endReplaceGroup();
                    } else {
                        composer.startReplaceGroup(-471297265);
                        Modifier modifierFillMaxSize$default = SizeKt.fillMaxSize$default(companion, 0.0f, 1, null);
                        PaddingValues paddingValuesM995PaddingValuesa9UjIt4 = PaddingKt.m995PaddingValuesa9UjIt4(Dp.m7813constructorimpl(4.0f), Dp.m7813constructorimpl(6.0f), Dp.m7813constructorimpl(4.0f), Dp.m7813constructorimpl(8.0f));
                        Arrangement.HorizontalOrVertical horizontalOrVerticalM712spacedBy0680j_5 = arrangement.m712spacedBy0680j_4(Dp.m7813constructorimpl(12.0f));
                        boolean zChangedInstance = composer.changedInstance(list) | composer.changed(str) | composer.changed(str2) | composer.changed(function2);
                        Object objRememberedValue = composer.rememberedValue();
                        if (zChangedInstance || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                            j1 j1Var = new j1((Object) list, str, (Object) str2, (Object) focusRequester, (Object) function2, 5);
                            composer.updateRememberedValue(j1Var);
                            objRememberedValue = j1Var;
                        }
                        LazyDslKt.LazyColumn(modifierFillMaxSize$default, null, paddingValuesM995PaddingValuesa9UjIt4, false, horizontalOrVerticalM712spacedBy0680j_5, null, null, false, null, (Function1) objRememberedValue, composer, 24582, 490);
                        composer.endReplaceGroup();
                    }
                    composer.endNode();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                } else {
                    composer.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 2:
                return SliderKt.VerticalSlider$lambda$10((SliderState) obj8, (Modifier) obj5, this.b, this.c, (SliderColors) obj7, (MutableInteractionSource) obj3, (Function3) obj6, (Function3) obj4, this.d, this.e, (Composer) obj, ((Integer) obj2).intValue());
            default:
                return TooltipKt.TooltipBox$lambda$1((PopupPositionProvider) obj8, (Function3) obj7, (TooltipState) obj6, (Modifier) obj5, (Function0) obj4, this.b, this.c, (Function2) obj3, this.d, this.e, (Composer) obj, ((Integer) obj2).intValue());
        }
    }

    public /* synthetic */ kp(SliderState sliderState, Modifier modifier, boolean z, boolean z2, SliderColors sliderColors, MutableInteractionSource mutableInteractionSource, Function3 function3, Function3 function4, int i, int i2) {
        this.g = sliderState;
        this.j = modifier;
        this.b = z;
        this.c = z2;
        this.h = sliderColors;
        this.l = mutableInteractionSource;
        this.i = function3;
        this.k = function4;
        this.d = i;
        this.e = i2;
    }

    public /* synthetic */ kp(PopupPositionProvider popupPositionProvider, Function3 function3, TooltipState tooltipState, Modifier modifier, Function0 function0, boolean z, boolean z2, Function2 function2, int i, int i2) {
        this.g = popupPositionProvider;
        this.h = function3;
        this.i = tooltipState;
        this.j = modifier;
        this.k = function0;
        this.b = z;
        this.c = z2;
        this.l = function2;
        this.d = i;
        this.e = i2;
    }

    public /* synthetic */ kp(boolean z, Function1 function1, Stroke stroke, Stroke stroke2, Modifier modifier, boolean z2, CheckboxColors checkboxColors, MutableInteractionSource mutableInteractionSource, int i, int i2) {
        this.b = z;
        this.g = function1;
        this.h = stroke;
        this.i = stroke2;
        this.j = modifier;
        this.c = z2;
        this.k = checkboxColors;
        this.l = mutableInteractionSource;
        this.d = i;
        this.e = i2;
    }
}
