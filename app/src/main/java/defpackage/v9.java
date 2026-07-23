package defpackage;

import androidx.compose.foundation.BackgroundKt;
import androidx.compose.foundation.interaction.MutableInteractionSource;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnScope;
import androidx.compose.foundation.layout.ColumnScopeInstance;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.foundation.layout.RowKt;
import androidx.compose.foundation.layout.RowScopeInstance;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.shape.RoundedCornerShape;
import androidx.compose.foundation.shape.RoundedCornerShapeKt;
import androidx.compose.material3.AndroidMenu_androidKt;
import androidx.compose.material3.CardColors;
import androidx.compose.material3.CardDefaults;
import androidx.compose.material3.CardKt;
import androidx.compose.material3.MaterialTheme;
import androidx.compose.material3.MenuItemColors;
import androidx.compose.material3.NavigationDrawerItemColors;
import androidx.compose.material3.NavigationDrawerKt;
import androidx.compose.material3.RangeSliderState;
import androidx.compose.material3.SliderColors;
import androidx.compose.material3.SliderKt;
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
import androidx.compose.ui.focus.FocusRequester;
import androidx.compose.ui.graphics.Shadow;
import androidx.compose.ui.graphics.Shape;
import androidx.compose.ui.graphics.drawscope.DrawStyle;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.text.AnnotatedString;
import androidx.compose.ui.text.PlatformSpanStyle;
import androidx.compose.ui.text.SpanStyle;
import androidx.compose.ui.text.font.FontFamily;
import androidx.compose.ui.text.font.FontStyle;
import androidx.compose.ui.text.font.FontSynthesis;
import androidx.compose.ui.text.font.FontWeight;
import androidx.compose.ui.text.intl.LocaleList;
import androidx.compose.ui.text.style.BaselineShift;
import androidx.compose.ui.text.style.TextDecoration;
import androidx.compose.ui.text.style.TextGeometricTransform;
import androidx.compose.ui.unit.Dp;
import androidx.media3.exoplayer.RendererCapabilities;

import kotlin.Function;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class v9 implements Function2 {
    public final /* synthetic */ int a = 3;
    public final /* synthetic */ Function b;
    public final /* synthetic */ int c;
    public final /* synthetic */ int d;
    public final /* synthetic */ boolean e;
    public final /* synthetic */ Object g;
    public final /* synthetic */ Object h;
    public final /* synthetic */ Object i;
    public final /* synthetic */ Object j;
    public final /* synthetic */ Object k;
    public final /* synthetic */ Object l;
    public final /* synthetic */ Object m;

    public /* synthetic */ v9(u61 u61Var, CoroutineScope coroutineScope, rm rmVar, Function0 function0, FocusRequester focusRequester, MutableState mutableState, MutableState mutableState2, int i, int i2, boolean z, MutableState mutableState3) {
        this.g = u61Var;
        this.h = coroutineScope;
        this.i = rmVar;
        this.b = function0;
        this.j = focusRequester;
        this.k = mutableState;
        this.l = mutableState2;
        this.c = i;
        this.d = i2;
        this.e = z;
        this.m = mutableState3;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        int i = this.a;
        Object obj3 = this.l;
        Object obj4 = this.k;
        Function function = this.b;
        Object obj5 = this.i;
        Object obj6 = this.m;
        Object obj7 = this.h;
        Object obj8 = this.j;
        Object obj9 = this.g;
        switch (i) {
            case 0:
                return AndroidMenu_androidKt.DropdownMenuItem$lambda$7((Function2) obj9, (Function0) function, (Modifier) obj8, (Function2) obj7, (Function2) obj5, this.e, (MenuItemColors) obj4, (PaddingValues) obj3, (MutableInteractionSource) obj6, this.c, this.d, (Composer) obj, ((Integer) obj2).intValue());
            case 1:
                final u61 u61Var = (u61) obj9;
                final CoroutineScope coroutineScope = (CoroutineScope) obj7;
                final rm rmVar = (rm) obj5;
                final Function0 function0 = (Function0) function;
                final FocusRequester focusRequester = (FocusRequester) obj8;
                final MutableState mutableState = (MutableState) obj4;
                final MutableState mutableState2 = (MutableState) obj3;
                final MutableState mutableState3 = (MutableState) obj6;
                Composer composer = (Composer) obj;
                int iIntValue = ((Integer) obj2).intValue();
                if (composer.shouldExecute((iIntValue & 3) != 2, iIntValue & 1)) {
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(1201409338, iIntValue, -1, "com.dh.myembyapp.ui.components.BufferSettingsDialog.<anonymous> (BufferSettingsDialog.kt:99)");
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
                    Modifier modifierWrapContentHeight$default = SizeKt.wrapContentHeight$default(SizeKt.m1069width3ABfNKs(companion, Dp.m7813constructorimpl(420.0f)), null, false, 3, null);
                    RoundedCornerShape roundedCornerShapeM1312RoundedCornerShape0680j_4 = RoundedCornerShapeKt.m1312RoundedCornerShape0680j_4(Dp.m7813constructorimpl(16.0f));
                    CardColors cardColorsM2119cardColorsro_MJ88 = CardDefaults.INSTANCE.m2119cardColorsro_MJ88(MaterialTheme.INSTANCE.getColorScheme(composer, MaterialTheme.$stable).getSurface(), 0L, 0L, 0L, composer, CardDefaults.$stable << 12, 14);
                    final int i3 = this.c;
                    final int i4 = this.d;
                    final boolean z = this.e;
                    CardKt.Card(modifierWrapContentHeight$default, roundedCornerShapeM1312RoundedCornerShape0680j_4, cardColorsM2119cardColorsro_MJ88, null, null, ComposableLambdaKt.rememberComposableLambda(-1064616910, true, new Function3() { // from class: sm
                        /* JADX WARN: Multi-variable type inference failed */
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
                        @Override // kotlin.jvm.functions.Function3
                        public final Object invoke(Object obj10, Object obj11, Object obj12) {
                            Composer composer2 = (Composer) obj11;
                            int iIntValue2 = ((Integer) obj12).intValue();
                            ((ColumnScope) obj10).getClass();
                            if (composer2.shouldExecute((iIntValue2 & 17) != 16, iIntValue2 & 1)) {
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventStart(-1064616910, iIntValue2, -1, "com.dh.myembyapp.ui.components.BufferSettingsDialog.<anonymous>.<anonymous>.<anonymous> (BufferSettingsDialog.kt:114)");
                                }
                                Modifier.Companion companion3 = Modifier.INSTANCE;
                                Modifier modifierM999padding3ABfNKs = PaddingKt.m999padding3ABfNKs(SizeKt.fillMaxWidth$default(companion3, 0.0f, 1, null), Dp.m7813constructorimpl(24.0f));
                                Arrangement arrangement = Arrangement.INSTANCE;
                                Arrangement.HorizontalOrVertical horizontalOrVerticalM712spacedBy0680j_4 = arrangement.m712spacedBy0680j_4(Dp.m7813constructorimpl(16.0f));
                                Alignment.Companion companion4 = Alignment.INSTANCE;
                                MeasurePolicy measurePolicyColumnMeasurePolicy = ColumnKt.columnMeasurePolicy(horizontalOrVerticalM712spacedBy0680j_4, companion4.getStart(), composer2, 6);
                                long currentCompositeKeyHashCode2 = ComposablesKt.getCurrentCompositeKeyHashCode(composer2, 0);
                                int i5 = (int) (currentCompositeKeyHashCode2 ^ (currentCompositeKeyHashCode2 >>> 32));
                                CompositionLocalMap currentCompositionLocalMap2 = composer2.getCurrentCompositionLocalMap();
                                Modifier modifierMaterializeModifier2 = ComposedModifierKt.materializeModifier(composer2, modifierM999padding3ABfNKs);
                                ComposeUiNode.Companion companion5 = ComposeUiNode.INSTANCE;
                                Function0<ComposeUiNode> constructor2 = companion5.getConstructor();
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
                                mr.z(companion5, composerM4318constructorimpl2, measurePolicyColumnMeasurePolicy, composerM4318constructorimpl2, currentCompositionLocalMap2);
                                Updater.m4326setimpl(composerM4318constructorimpl2, modifierMaterializeModifier2, (Function2<? super T, ? super Modifier, Unit>) id.h(companion5, composerM4318constructorimpl2, Integer.valueOf(i5), composerM4318constructorimpl2));
                                ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.INSTANCE;
                                MaterialTheme materialTheme = MaterialTheme.INSTANCE;
                                int i6 = MaterialTheme.$stable;
                                TextKt.m3048TextNvy7gAk("缓冲设置", null, materialTheme.getColorScheme(composer2, i6).getPrimary(), null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, materialTheme.getTypography(composer2, i6).getTitleLarge(), composer2, 6, 0, 131066);
                                Modifier modifierFillMaxWidth$default = SizeKt.fillMaxWidth$default(companion3, 0.0f, 1, null);
                                MeasurePolicy measurePolicyRowMeasurePolicy = RowKt.rowMeasurePolicy(arrangement.getSpaceBetween(), companion4.getCenterVertically(), composer2, 54);
                                long currentCompositeKeyHashCode3 = ComposablesKt.getCurrentCompositeKeyHashCode(composer2, 0);
                                int i7 = (int) (currentCompositeKeyHashCode3 ^ (currentCompositeKeyHashCode3 >>> 32));
                                CompositionLocalMap currentCompositionLocalMap3 = composer2.getCurrentCompositionLocalMap();
                                Modifier modifierMaterializeModifier3 = ComposedModifierKt.materializeModifier(composer2, modifierFillMaxWidth$default);
                                Function0<ComposeUiNode> constructor3 = companion5.getConstructor();
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
                                mr.z(companion5, composerM4318constructorimpl3, measurePolicyRowMeasurePolicy, composerM4318constructorimpl3, currentCompositionLocalMap3);
                                Updater.m4326setimpl(composerM4318constructorimpl3, modifierMaterializeModifier3, (Function2<? super T, ? super Modifier, Unit>) id.h(companion5, composerM4318constructorimpl3, Integer.valueOf(i7), composerM4318constructorimpl3));
                                RowScopeInstance rowScopeInstance = RowScopeInstance.INSTANCE;
                                TextKt.m3048TextNvy7gAk("缓冲大小", null, materialTheme.getColorScheme(composer2, i6).getOnSurface(), null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, materialTheme.getTypography(composer2, i6).getBodyLarge(), composer2, 6, 0, 131066);
                                MutableState mutableState4 = mutableState;
                                int iIntValue3 = ((Number) mutableState4.getValue()).intValue();
                                Object objRememberedValue = composer2.rememberedValue();
                                Composer.Companion companion6 = Composer.INSTANCE;
                                if (objRememberedValue == companion6.getEmpty()) {
                                    objRememberedValue = new r1(25, mutableState4);
                                    composer2.updateRememberedValue(objRememberedValue);
                                }
                                Function0 function1 = (Function0) objRememberedValue;
                                Object objRememberedValue2 = composer2.rememberedValue();
                                if (objRememberedValue2 == companion6.getEmpty()) {
                                    objRememberedValue2 = new r1(26, mutableState4);
                                    composer2.updateRememberedValue(objRememberedValue2);
                                }
                                wm.b(iIntValue3, "MB", 30, HttpStatus.SC_BAD_REQUEST, 10, function1, (Function0) objRememberedValue2, focusRequester, composer2, 14380464, 0);
                                composer2.endNode();
                                Modifier modifierFillMaxWidth$default2 = SizeKt.fillMaxWidth$default(companion3, 0.0f, 1, null);
                                MeasurePolicy measurePolicyRowMeasurePolicy2 = RowKt.rowMeasurePolicy(arrangement.getSpaceBetween(), companion4.getCenterVertically(), composer2, 54);
                                long currentCompositeKeyHashCode4 = ComposablesKt.getCurrentCompositeKeyHashCode(composer2, 0);
                                int i8 = (int) (currentCompositeKeyHashCode4 ^ (currentCompositeKeyHashCode4 >>> 32));
                                CompositionLocalMap currentCompositionLocalMap4 = composer2.getCurrentCompositionLocalMap();
                                Modifier modifierMaterializeModifier4 = ComposedModifierKt.materializeModifier(composer2, modifierFillMaxWidth$default2);
                                Function0<ComposeUiNode> constructor4 = companion5.getConstructor();
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
                                mr.z(companion5, composerM4318constructorimpl4, measurePolicyRowMeasurePolicy2, composerM4318constructorimpl4, currentCompositionLocalMap4);
                                Updater.m4326setimpl(composerM4318constructorimpl4, modifierMaterializeModifier4, (Function2<? super T, ? super Modifier, Unit>) id.h(companion5, composerM4318constructorimpl4, Integer.valueOf(i8), composerM4318constructorimpl4));
                                TextKt.m3048TextNvy7gAk("缓冲时长", null, materialTheme.getColorScheme(composer2, i6).getOnSurface(), null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, materialTheme.getTypography(composer2, i6).getBodyLarge(), composer2, 6, 0, 131066);
                                MutableState mutableState5 = mutableState2;
                                int iIntValue4 = ((Number) mutableState5.getValue()).intValue();
                                Object objRememberedValue3 = composer2.rememberedValue();
                                if (objRememberedValue3 == companion6.getEmpty()) {
                                    objRememberedValue3 = new r1(27, mutableState5);
                                    composer2.updateRememberedValue(objRememberedValue3);
                                }
                                Function0 function2 = (Function0) objRememberedValue3;
                                Object objRememberedValue4 = composer2.rememberedValue();
                                if (objRememberedValue4 == companion6.getEmpty()) {
                                    objRememberedValue4 = new r1(28, mutableState5);
                                    composer2.updateRememberedValue(objRememberedValue4);
                                }
                                wm.b(iIntValue4, "秒", 120, 1800, 60, function2, (Function0) objRememberedValue4, null, composer2, 1797552, 128);
                                composer2.endNode();
                                composer2.startReplaceGroup(-190357957);
                                AnnotatedString.Builder builder = new AnnotatedString.Builder(0, 1, null);
                                builder.append("最大堆内存：");
                                long error = materialTheme.getColorScheme(composer2, i6).getError();
                                FontWeight.Companion companion7 = FontWeight.INSTANCE;
                                builder.pushStyle(new SpanStyle(error, 0L, companion7.getSemiBold(), (FontStyle) null, (FontSynthesis) null, (FontFamily) null, (String) null, 0L, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, (TextDecoration) null, (Shadow) null, (PlatformSpanStyle) null, (DrawStyle) null, 65530, (DefaultConstructorMarker) null));
                                builder.append(i3 + "MB");
                                builder.pop();
                                builder.append("（建议不超过 1/2 ≈ ");
                                builder.pushStyle(new SpanStyle(materialTheme.getColorScheme(composer2, i6).getError(), 0L, companion7.getSemiBold(), (FontStyle) null, (FontSynthesis) null, (FontFamily) null, (String) null, 0L, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, (TextDecoration) null, (Shadow) null, (PlatformSpanStyle) null, (DrawStyle) null, 65530, (DefaultConstructorMarker) null));
                                builder.append(i4 + "MB");
                                builder.pop();
                                if (z) {
                                    composer2.startReplaceGroup(-562092024);
                                    builder.append("；当前最高可设 ");
                                    builder.pushStyle(new SpanStyle(materialTheme.getColorScheme(composer2, i6).getError(), 0L, companion7.getSemiBold(), (FontStyle) null, (FontSynthesis) null, (FontFamily) null, (String) null, 0L, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, (TextDecoration) null, (Shadow) null, (PlatformSpanStyle) null, (DrawStyle) null, 65530, (DefaultConstructorMarker) null));
                                    builder.append("400MB");
                                    builder.pop();
                                    composer2.endReplaceGroup();
                                } else {
                                    composer2.startReplaceGroup(-561593265);
                                    composer2.endReplaceGroup();
                                }
                                builder.append("，防止OOM闪退）");
                                AnnotatedString annotatedString = builder.toAnnotatedString();
                                composer2.endReplaceGroup();
                                TextKt.m3049TextZ58ophY(annotatedString, null, materialTheme.getColorScheme(composer2, i6).getOnSurfaceVariant(), null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, materialTheme.getTypography(composer2, i6).getBodySmall(), composer2, 0, 0, 262138);
                                id.i(4.0f, companion3, composer2, 6);
                                ButtonColors buttonColorsI = hc2.i(jc2.b, false, composer2, 6, 2);
                                ButtonScale buttonScaleL = hc2.l(1.05f);
                                ButtonGlow buttonGlowA = el0.a(u61Var);
                                ButtonBorder buttonBorderH = hc2.h(composer2);
                                Modifier modifierM1050height3ABfNKs = SizeKt.m1050height3ABfNKs(SizeKt.fillMaxWidth$default(companion3, 0.0f, 1, null), Dp.m7813constructorimpl(48.0f));
                                Object objRememberedValue5 = composer2.rememberedValue();
                                Object empty = companion6.getEmpty();
                                MutableState mutableState6 = mutableState3;
                                if (objRememberedValue5 == empty) {
                                    objRememberedValue5 = new zh(6, mutableState6);
                                    composer2.updateRememberedValue(objRememberedValue5);
                                }
                                Modifier modifierOnFocusChanged = FocusChangedModifierKt.onFocusChanged(modifierM1050height3ABfNKs, (Function1) objRememberedValue5);
                                CoroutineScope coroutineScope2 = coroutineScope;
                                boolean zChangedInstance = composer2.changedInstance(coroutineScope2);
                                rm rmVar2 = rmVar;
                                boolean zChangedInstance2 = zChangedInstance | composer2.changedInstance(rmVar2);
                                Function0 function3 = function0;
                                boolean zChanged = composer2.changed(function3) | zChangedInstance2;
                                Object objRememberedValue6 = composer2.rememberedValue();
                                if (zChanged || objRememberedValue6 == companion6.getEmpty()) {
                                    objRememberedValue6 = new v1((Object) coroutineScope2, (Object) rmVar2, function3, mutableState4, mutableState5, 4);
                                    composer2.updateRememberedValue(objRememberedValue6);
                                }
                                ButtonKt.m8231ButtonTCVpFMg((Function0) objRememberedValue6, modifierOnFocusChanged, null, false, buttonScaleL, buttonGlowA, null, buttonColorsI, 0.0f, buttonBorderH, null, null, ComposableLambdaKt.rememberComposableLambda(734012184, true, new p1(7, mutableState6), composer2, 54), composer2, 0, RendererCapabilities.DECODER_SUPPORT_MASK, 3404);
                                composer2.endNode();
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventEnd();
                                }
                            } else {
                                composer2.skipToGroupEnd();
                            }
                            return Unit.INSTANCE;
                        }
                    }, composer, 54), composer, 196614, 24);
                    composer.endNode();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                } else {
                    composer.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 2:
                return NavigationDrawerKt.NavigationDrawerItem$lambda$65((Function2) obj9, this.e, (Function0) function, (Modifier) obj8, (Function2) obj7, (Function2) obj5, (Shape) obj4, (NavigationDrawerItemColors) obj3, (MutableInteractionSource) obj6, this.c, this.d, (Composer) obj, ((Integer) obj2).intValue());
            default:
                return SliderKt.RangeSlider$lambda$23((RangeSliderState) obj9, (Modifier) obj8, this.e, (SliderColors) obj7, (MutableInteractionSource) obj6, (MutableInteractionSource) obj5, (Function3) function, (Function3) obj4, (Function3) obj3, this.c, this.d, (Composer) obj, ((Integer) obj2).intValue());
        }
    }

    public /* synthetic */ v9(RangeSliderState rangeSliderState, Modifier modifier, boolean z, SliderColors sliderColors, MutableInteractionSource mutableInteractionSource, MutableInteractionSource mutableInteractionSource2, Function3 function3, Function3 function4, Function3 function5, int i, int i2) {
        this.g = rangeSliderState;
        this.j = modifier;
        this.e = z;
        this.h = sliderColors;
        this.m = mutableInteractionSource;
        this.i = mutableInteractionSource2;
        this.b = function3;
        this.k = function4;
        this.l = function5;
        this.c = i;
        this.d = i2;
    }

    public /* synthetic */ v9(Function2 function2, Function0 function0, Modifier modifier, Function2 function3, Function2 function4, boolean z, MenuItemColors menuItemColors, PaddingValues paddingValues, MutableInteractionSource mutableInteractionSource, int i, int i2) {
        this.g = function2;
        this.b = function0;
        this.j = modifier;
        this.h = function3;
        this.i = function4;
        this.e = z;
        this.k = menuItemColors;
        this.l = paddingValues;
        this.m = mutableInteractionSource;
        this.c = i;
        this.d = i2;
    }

    public /* synthetic */ v9(Function2 function2, boolean z, Function0 function0, Modifier modifier, Function2 function3, Function2 function4, Shape shape, NavigationDrawerItemColors navigationDrawerItemColors, MutableInteractionSource mutableInteractionSource, int i, int i2) {
        this.g = function2;
        this.e = z;
        this.b = function0;
        this.j = modifier;
        this.h = function3;
        this.i = function4;
        this.k = shape;
        this.l = navigationDrawerItemColors;
        this.m = mutableInteractionSource;
        this.c = i;
        this.d = i2;
    }
}
