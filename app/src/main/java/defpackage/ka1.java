package defpackage;

import android.content.Context;
import android.graphics.Bitmap;
import androidx.compose.foundation.BackgroundKt;
import androidx.compose.foundation.BorderKt;
import androidx.compose.foundation.BorderStrokeKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnScopeInstance;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.foundation.layout.RowKt;
import androidx.compose.foundation.layout.RowScopeInstance;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.lazy.LazyDslKt;
import androidx.compose.foundation.lazy.LazyItemScope;
import androidx.compose.foundation.lazy.LazyListScope;
import androidx.compose.foundation.lazy.d;
import androidx.compose.foundation.shape.RoundedCornerShape;
import androidx.compose.foundation.shape.RoundedCornerShapeKt;
import androidx.compose.foundation.text.KeyboardOptions;
import androidx.compose.material3.MaterialTheme;
import androidx.compose.material3.ProgressIndicatorKt;
import androidx.compose.material3.SurfaceKt;
import androidx.compose.material3.TextKt;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.MutableIntState;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.focus.FocusChangedModifierKt;
import androidx.compose.ui.focus.FocusManager;
import androidx.compose.ui.focus.FocusRequester;
import androidx.compose.ui.focus.FocusRequesterModifierKt;
import androidx.compose.ui.focus.FocusState;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.ColorKt;
import androidx.compose.ui.graphics.Shadow;
import androidx.compose.ui.graphics.SolidColor;
import androidx.compose.ui.graphics.drawscope.DrawStyle;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.platform.SoftwareKeyboardController;
import androidx.compose.ui.text.PlatformTextStyle;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.text.font.FontFamily;
import androidx.compose.ui.text.font.FontStyle;
import androidx.compose.ui.text.font.FontSynthesis;
import androidx.compose.ui.text.font.FontWeight;
import androidx.compose.ui.text.input.ImeAction;
import androidx.compose.ui.text.input.PlatformImeOptions;
import androidx.compose.ui.text.input.TextFieldValue;
import androidx.compose.ui.text.intl.LocaleList;
import androidx.compose.ui.text.style.BaselineShift;
import androidx.compose.ui.text.style.LineHeightStyle;
import androidx.compose.ui.text.style.TextDecoration;
import androidx.compose.ui.text.style.TextGeometricTransform;
import androidx.compose.ui.text.style.TextIndent;
import androidx.compose.ui.text.style.TextMotion;
import androidx.compose.ui.unit.Dp;
import androidx.compose.ui.unit.TextUnitKt;
import androidx.media3.exoplayer.RendererCapabilities;

import java.util.List;
import java.util.Locale;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function4;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import kotlin.text.StringsKt;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class ka1 implements Function2 {
    public final /* synthetic */ FocusRequester A;
    public final /* synthetic */ MutableState B;
    public final /* synthetic */ MutableState C;
    public final /* synthetic */ MutableState D;
    public final /* synthetic */ int a;
    public final /* synthetic */ String b;
    public final /* synthetic */ CoroutineScope c;
    public final /* synthetic */ Context d;
    public final /* synthetic */ ne e;
    public final /* synthetic */ FocusRequester g;
    public final /* synthetic */ MutableState h;
    public final /* synthetic */ FocusRequester i;
    public final /* synthetic */ SoftwareKeyboardController j;
    public final /* synthetic */ FocusManager k;
    public final /* synthetic */ ij1 l;
    public final /* synthetic */ MutableState m;
    public final /* synthetic */ MutableState n;
    public final /* synthetic */ MutableState o;
    public final /* synthetic */ MutableState p;
    public final /* synthetic */ MutableState q;
    public final /* synthetic */ MutableState r;
    public final /* synthetic */ MutableState s;
    public final /* synthetic */ MutableState t;
    public final /* synthetic */ MutableState u;
    public final /* synthetic */ MutableState v;
    public final /* synthetic */ MutableIntState w;
    public final /* synthetic */ Bitmap x;
    public final /* synthetic */ String y;
    public final /* synthetic */ jj1 z;

    public /* synthetic */ ka1(String str, CoroutineScope coroutineScope, Context context, ne neVar, FocusRequester focusRequester, MutableState mutableState, FocusRequester focusRequester2, SoftwareKeyboardController softwareKeyboardController, FocusManager focusManager, ij1 ij1Var, MutableState mutableState2, MutableState mutableState3, MutableState mutableState4, MutableState mutableState5, MutableState mutableState6, MutableState mutableState7, MutableState mutableState8, MutableState mutableState9, MutableState mutableState10, MutableState mutableState11, MutableIntState mutableIntState, Bitmap bitmap, String str2, jj1 jj1Var, FocusRequester focusRequester3, MutableState mutableState12, MutableState mutableState13, MutableState mutableState14, int i) {
        this.a = i;
        this.b = str;
        this.c = coroutineScope;
        this.d = context;
        this.e = neVar;
        this.g = focusRequester;
        this.h = mutableState;
        this.i = focusRequester2;
        this.j = softwareKeyboardController;
        this.k = focusManager;
        this.l = ij1Var;
        this.m = mutableState2;
        this.n = mutableState3;
        this.o = mutableState4;
        this.p = mutableState5;
        this.q = mutableState6;
        this.r = mutableState7;
        this.s = mutableState8;
        this.t = mutableState9;
        this.u = mutableState10;
        this.v = mutableState11;
        this.w = mutableIntState;
        this.x = bitmap;
        this.y = str2;
        this.z = jj1Var;
        this.A = focusRequester3;
        this.B = mutableState12;
        this.C = mutableState13;
        this.D = mutableState14;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        MutableState mutableState;
        final MutableState mutableState2;
        String str;
        Object na1Var;
        CoroutineScope coroutineScope;
        FocusRequester focusRequester;
        switch (this.a) {
            case 0:
                Composer composer = (Composer) obj;
                int iIntValue = ((Integer) obj2).intValue();
                if (composer.shouldExecute((iIntValue & 3) != 2, iIntValue & 1)) {
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(587017914, iIntValue, -1, "com.dh.myembyapp.ui.components.OnlineSubtitleSearchDialog.<anonymous> (OnlineSubtitleSearchDialog.kt:308)");
                    }
                    Modifier.Companion companion = Modifier.INSTANCE;
                    Modifier modifierM275backgroundbw27NRU$default = BackgroundKt.m275backgroundbw27NRU$default(SizeKt.fillMaxSize$default(companion, 0.0f, 1, null), Color.m5151copywmQWz5c$default(Color.INSTANCE.m5178getBlack0d7_KjU(), 0.7f, 0.0f, 0.0f, 0.0f, 14, null), null, 2, null);
                    MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.INSTANCE.getCenter(), false);
                    long currentCompositeKeyHashCode = ComposablesKt.getCurrentCompositeKeyHashCode(composer, 0);
                    int i = (int) (currentCompositeKeyHashCode ^ (currentCompositeKeyHashCode >>> 32));
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
                    Updater.m4326setimpl(composerM4318constructorimpl, modifierMaterializeModifier, (Function2<? super T, ? super Modifier, Unit>) id.h(companion2, composerM4318constructorimpl, Integer.valueOf(i), composerM4318constructorimpl));
                    BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
                    Modifier modifierM1050height3ABfNKs = SizeKt.m1050height3ABfNKs(SizeKt.m1069width3ABfNKs(companion, Dp.m7813constructorimpl(760.0f)), Dp.m7813constructorimpl(620.0f));
                    RoundedCornerShape roundedCornerShapeM1312RoundedCornerShape0680j_4 = RoundedCornerShapeKt.m1312RoundedCornerShape0680j_4(Dp.m7813constructorimpl(12.0f));
                    long jColor = ColorKt.Color(4280953386L);
                    String str2 = this.b;
                    CoroutineScope coroutineScope2 = this.c;
                    Context context = this.d;
                    ne neVar = this.e;
                    FocusRequester focusRequester2 = this.g;
                    MutableState mutableState3 = this.h;
                    FocusRequester focusRequester3 = this.i;
                    SoftwareKeyboardController softwareKeyboardController = this.j;
                    FocusManager focusManager = this.k;
                    ij1 ij1Var = this.l;
                    MutableState mutableState4 = this.m;
                    MutableState mutableState5 = this.n;
                    MutableState mutableState6 = this.o;
                    MutableState mutableState7 = this.p;
                    MutableState mutableState8 = this.q;
                    MutableState mutableState9 = this.r;
                    MutableState mutableState10 = this.s;
                    MutableState mutableState11 = this.t;
                    MutableState mutableState12 = this.u;
                    MutableState mutableState13 = this.v;
                    MutableIntState mutableIntState = this.w;
                    Bitmap bitmap = this.x;
                    String str3 = this.y;
                    jj1 jj1Var = this.z;
                    FocusRequester focusRequester4 = this.A;
                    MutableState mutableState14 = this.B;
                    MutableState mutableState15 = this.C;
                    MutableState mutableState16 = this.D;
                    SurfaceKt.m2905SurfaceT9BRK9s(modifierM1050height3ABfNKs, roundedCornerShapeM1312RoundedCornerShape0680j_4, jColor, 0L, 0.0f, 0.0f, null, ComposableLambdaKt.rememberComposableLambda(-1432025799, true, new ka1(str2, coroutineScope2, context, neVar, focusRequester2, mutableState3, focusRequester3, softwareKeyboardController, focusManager, ij1Var, mutableState4, mutableState5, mutableState6, mutableState7, mutableState8, mutableState9, mutableState10, mutableState11, mutableState12, mutableState13, mutableIntState, bitmap, str3, jj1Var, focusRequester4, mutableState14, mutableState15, mutableState16, 1), composer, 54), composer, 12583302, 120);
                    re reVar = (re) mutableState11.getValue();
                    if (reVar == null) {
                        composer.startReplaceGroup(368342705);
                        composer.endReplaceGroup();
                    } else {
                        composer.startReplaceGroup(368342706);
                        boolean zAreEqual = Intrinsics.areEqual((String) mutableState14.getValue(), reVar.a.a);
                        String str4 = (String) mutableState16.getValue();
                        Object objRememberedValue = composer.rememberedValue();
                        Composer.Companion companion3 = Composer.INSTANCE;
                        if (objRememberedValue == companion3.getEmpty()) {
                            mutableState = mutableState11;
                            objRememberedValue = new lu0(23, mutableState);
                            composer.updateRememberedValue(objRememberedValue);
                        } else {
                            mutableState = mutableState11;
                        }
                        Function0 function0 = (Function0) objRememberedValue;
                        boolean zChangedInstance = composer.changedInstance(coroutineScope2) | composer.changedInstance(context) | composer.changed(str2) | composer.changed(neVar.ordinal()) | composer.changed(jj1Var) | composer.changedInstance(reVar);
                        Object objRememberedValue2 = composer.rememberedValue();
                        if (zChangedInstance || objRememberedValue2 == companion3.getEmpty()) {
                            un0 un0Var = new un0(reVar, coroutineScope2, context, str2, neVar, mutableState14, mutableState16, mutableState7, jj1Var, mutableState);
                            composer.updateRememberedValue(un0Var);
                            objRememberedValue2 = un0Var;
                        }
                        ra1.a(reVar, zAreEqual, str4, function0, (Function1) objRememberedValue2, composer, 3072);
                        composer.endReplaceGroup();
                    }
                    composer.endNode();
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
                        ComposerKt.traceEventStart(-1432025799, iIntValue2, -1, "com.dh.myembyapp.ui.components.OnlineSubtitleSearchDialog.<anonymous>.<anonymous>.<anonymous> (OnlineSubtitleSearchDialog.kt:321)");
                    }
                    Modifier.Companion companion4 = Modifier.INSTANCE;
                    Modifier modifierM999padding3ABfNKs = PaddingKt.m999padding3ABfNKs(SizeKt.fillMaxSize$default(companion4, 0.0f, 1, null), Dp.m7813constructorimpl(20.0f));
                    Arrangement arrangement = Arrangement.INSTANCE;
                    Arrangement.HorizontalOrVertical horizontalOrVerticalM712spacedBy0680j_4 = arrangement.m712spacedBy0680j_4(Dp.m7813constructorimpl(8.0f));
                    Alignment.Companion companion5 = Alignment.INSTANCE;
                    MeasurePolicy measurePolicyColumnMeasurePolicy = ColumnKt.columnMeasurePolicy(horizontalOrVerticalM712spacedBy0680j_4, companion5.getStart(), composer2, 6);
                    long currentCompositeKeyHashCode2 = ComposablesKt.getCurrentCompositeKeyHashCode(composer2, 0);
                    int i2 = (int) (currentCompositeKeyHashCode2 ^ (currentCompositeKeyHashCode2 >>> 32));
                    CompositionLocalMap currentCompositionLocalMap2 = composer2.getCurrentCompositionLocalMap();
                    Modifier modifierMaterializeModifier2 = ComposedModifierKt.materializeModifier(composer2, modifierM999padding3ABfNKs);
                    ComposeUiNode.Companion companion6 = ComposeUiNode.INSTANCE;
                    Function0<ComposeUiNode> constructor2 = companion6.getConstructor();
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
                    mr.z(companion6, composerM4318constructorimpl2, measurePolicyColumnMeasurePolicy, composerM4318constructorimpl2, currentCompositionLocalMap2);
                    Updater.m4326setimpl(composerM4318constructorimpl2, modifierMaterializeModifier2, (Function2<? super T, ? super Modifier, Unit>) id.h(companion6, composerM4318constructorimpl2, Integer.valueOf(i2), composerM4318constructorimpl2));
                    ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.INSTANCE;
                    MaterialTheme materialTheme = MaterialTheme.INSTANCE;
                    int i3 = MaterialTheme.$stable;
                    TextStyle titleMedium = materialTheme.getTypography(composer2, i3).getTitleMedium();
                    Color.Companion companion7 = Color.INSTANCE;
                    TextKt.m3048TextNvy7gAk("在线字幕搜索 (ASSRT)", null, companion7.m5189getWhite0d7_KjU(), null, 0L, null, FontWeight.INSTANCE.getBold(), null, 0L, null, null, 0L, 0, false, 0, 0, null, titleMedium, composer2, 1573254, 0, 131002);
                    Modifier modifierFillMaxWidth$default = SizeKt.fillMaxWidth$default(companion4, 0.0f, 1, null);
                    MeasurePolicy measurePolicyRowMeasurePolicy = RowKt.rowMeasurePolicy(arrangement.m712spacedBy0680j_4(Dp.m7813constructorimpl(8.0f)), companion5.getCenterVertically(), composer2, 54);
                    long currentCompositeKeyHashCode3 = ComposablesKt.getCurrentCompositeKeyHashCode(composer2, 0);
                    int i4 = (int) (currentCompositeKeyHashCode3 ^ (currentCompositeKeyHashCode3 >>> 32));
                    CompositionLocalMap currentCompositionLocalMap3 = composer2.getCurrentCompositionLocalMap();
                    Modifier modifierMaterializeModifier3 = ComposedModifierKt.materializeModifier(composer2, modifierFillMaxWidth$default);
                    Function0<ComposeUiNode> constructor3 = companion6.getConstructor();
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
                    mr.z(companion6, composerM4318constructorimpl3, measurePolicyRowMeasurePolicy, composerM4318constructorimpl3, currentCompositionLocalMap3);
                    Updater.m4326setimpl(composerM4318constructorimpl3, modifierMaterializeModifier3, (Function2<? super T, ? super Modifier, Unit>) id.h(companion6, composerM4318constructorimpl3, Integer.valueOf(i4), composerM4318constructorimpl3));
                    RowScopeInstance rowScopeInstance = RowScopeInstance.INSTANCE;
                    Modifier modifierV = kb0.v(8.0f, SizeKt.m1050height3ABfNKs(zs1.E(rowScopeInstance, companion4, 1.0f, false, 2, null), Dp.m7813constructorimpl(44.0f)), ColorKt.Color(4279900698L));
                    MutableState mutableState17 = this.h;
                    Modifier modifierBorder = BorderKt.border(modifierV, yc2.j(((Boolean) mutableState17.getValue()).booleanValue(), composer2), RoundedCornerShapeKt.m1312RoundedCornerShape0680j_4(Dp.m7813constructorimpl(8.0f)));
                    MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy2 = BoxKt.maybeCachedBoxMeasurePolicy(companion5.getTopStart(), false);
                    long currentCompositeKeyHashCode4 = ComposablesKt.getCurrentCompositeKeyHashCode(composer2, 0);
                    int i5 = (int) (currentCompositeKeyHashCode4 ^ (currentCompositeKeyHashCode4 >>> 32));
                    CompositionLocalMap currentCompositionLocalMap4 = composer2.getCurrentCompositionLocalMap();
                    Modifier modifierMaterializeModifier4 = ComposedModifierKt.materializeModifier(composer2, modifierBorder);
                    Function0<ComposeUiNode> constructor4 = companion6.getConstructor();
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
                    mr.z(companion6, composerM4318constructorimpl4, measurePolicyMaybeCachedBoxMeasurePolicy2, composerM4318constructorimpl4, currentCompositionLocalMap4);
                    Updater.m4326setimpl(composerM4318constructorimpl4, modifierMaterializeModifier4, (Function2<? super T, ? super Modifier, Unit>) id.h(companion6, composerM4318constructorimpl4, Integer.valueOf(i5), composerM4318constructorimpl4));
                    BoxScopeInstance boxScopeInstance2 = BoxScopeInstance.INSTANCE;
                    Modifier modifierM1000paddingVpY3zN4 = PaddingKt.m1000paddingVpY3zN4(SizeKt.fillMaxWidth$default(companion4, 0.0f, 1, null), Dp.m7813constructorimpl(10.0f), Dp.m7813constructorimpl(8.0f));
                    MeasurePolicy measurePolicyRowMeasurePolicy2 = RowKt.rowMeasurePolicy(arrangement.getStart(), companion5.getCenterVertically(), composer2, 48);
                    long currentCompositeKeyHashCode5 = ComposablesKt.getCurrentCompositeKeyHashCode(composer2, 0);
                    int i6 = (int) (currentCompositeKeyHashCode5 ^ (currentCompositeKeyHashCode5 >>> 32));
                    CompositionLocalMap currentCompositionLocalMap5 = composer2.getCurrentCompositionLocalMap();
                    Modifier modifierMaterializeModifier5 = ComposedModifierKt.materializeModifier(composer2, modifierM1000paddingVpY3zN4);
                    Function0<ComposeUiNode> constructor5 = companion6.getConstructor();
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
                    mr.z(companion6, composerM4318constructorimpl5, measurePolicyRowMeasurePolicy2, composerM4318constructorimpl5, currentCompositionLocalMap5);
                    Updater.m4326setimpl(composerM4318constructorimpl5, modifierMaterializeModifier5, (Function2<? super T, ? super Modifier, Unit>) id.h(companion6, composerM4318constructorimpl5, Integer.valueOf(i6), composerM4318constructorimpl5));
                    final MutableState mutableState18 = this.m;
                    TextFieldValue textFieldValue = (TextFieldValue) mutableState18.getValue();
                    Modifier modifierFocusRequester = FocusRequesterModifierKt.focusRequester(zs1.E(rowScopeInstance, companion4, 1.0f, false, 2, null), this.i);
                    Object objRememberedValue3 = composer2.rememberedValue();
                    Composer.Companion companion8 = Composer.INSTANCE;
                    Object empty = companion8.getEmpty();
                    MutableState mutableState19 = this.n;
                    if (objRememberedValue3 == empty) {
                        objRememberedValue3 = new y1(mutableState19, mutableState17, mutableState18, 5);
                        composer2.updateRememberedValue(objRememberedValue3);
                    }
                    Modifier modifierOnFocusChanged = FocusChangedModifierKt.onFocusChanged(modifierFocusRequester, (Function1) objRememberedValue3);
                    TextStyle textStyle = new TextStyle(companion7.m5189getWhite0d7_KjU(), TextUnitKt.getSp(22), (FontWeight) null, (FontStyle) null, (FontSynthesis) null, (FontFamily) null, (String) null, 0L, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, (TextDecoration) null, (Shadow) null, (DrawStyle) null, 0, 0, 0L, (TextIndent) null, (PlatformTextStyle) null, (LineHeightStyle) null, 0, 0, (TextMotion) null, 16777212, (DefaultConstructorMarker) null);
                    KeyboardOptions keyboardOptions = new KeyboardOptions(0, (Boolean) null, 0, ImeAction.INSTANCE.m7461getSearcheUduSuo(), (PlatformImeOptions) null, (Boolean) null, (LocaleList) null, 119, (DefaultConstructorMarker) null);
                    SolidColor solidColor = new SolidColor(companion7.m5189getWhite0d7_KjU(), null);
                    Object objRememberedValue4 = composer2.rememberedValue();
                    Object empty2 = companion8.getEmpty();
                    int i7 = 8;
                    MutableState mutableState20 = this.o;
                    if (objRememberedValue4 == empty2) {
                        objRememberedValue4 = new ai(i7, mutableState18, mutableState20);
                        composer2.updateRememberedValue(objRememberedValue4);
                    }
                    Function1 function1 = (Function1) objRememberedValue4;
                    final String str5 = this.b;
                    boolean zChanged = composer2.changed(str5);
                    final CoroutineScope coroutineScope3 = this.c;
                    boolean zChangedInstance2 = zChanged | composer2.changedInstance(coroutineScope3);
                    final Context context2 = this.d;
                    boolean zChangedInstance3 = zChangedInstance2 | composer2.changedInstance(context2);
                    final ne neVar2 = this.e;
                    boolean zChanged2 = composer2.changed(neVar2.ordinal()) | zChangedInstance3;
                    Object objRememberedValue5 = composer2.rememberedValue();
                    final MutableState mutableState21 = this.p;
                    final MutableState mutableState22 = this.q;
                    final MutableState mutableState23 = this.r;
                    final MutableState mutableState24 = this.s;
                    final MutableState mutableState25 = this.t;
                    final MutableState mutableState26 = this.u;
                    final MutableState mutableState27 = this.v;
                    final MutableIntState mutableIntState2 = this.w;
                    if (zChanged2 || objRememberedValue5 == companion8.getEmpty()) {
                        final int i8 = 0;
                        mutableState2 = mutableState20;
                        objRememberedValue5 = new Function0() { // from class: da1
                            /* JADX WARN: Multi-variable type inference failed */
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                switch (i8) {
                                    case 0:
                                        MutableState mutableState28 = mutableState2;
                                        ra1.e(str5, coroutineScope3, mutableState28, mutableState18, mutableState21, context2, neVar2, mutableState22, mutableState23, mutableState24, mutableState25, mutableState26, mutableState27, mutableIntState2, StringsKt.trim((CharSequence) mutableState28.getValue()).toString());
                                        break;
                                    default:
                                        MutableState mutableState29 = mutableState2;
                                        ra1.e(str5, coroutineScope3, mutableState29, mutableState18, mutableState21, context2, neVar2, mutableState22, mutableState23, mutableState24, mutableState25, mutableState26, mutableState27, mutableIntState2, StringsKt.trim((CharSequence) mutableState29.getValue()).toString());
                                        break;
                                }
                                return Unit.INSTANCE;
                            }
                        };
                        str = str5;
                        composer2.updateRememberedValue(objRememberedValue5);
                    } else {
                        mutableState2 = mutableState20;
                        str = str5;
                    }
                    Function0 function2 = (Function0) objRememberedValue5;
                    SoftwareKeyboardController softwareKeyboardController2 = this.j;
                    boolean zChanged3 = composer2.changed(softwareKeyboardController2);
                    FocusManager focusManager2 = this.k;
                    boolean zChangedInstance4 = zChanged3 | composer2.changedInstance(focusManager2) | composer2.changedInstance(coroutineScope3);
                    ij1 ij1Var2 = this.l;
                    boolean zChanged4 = zChangedInstance4 | composer2.changed(ij1Var2);
                    Object objRememberedValue6 = composer2.rememberedValue();
                    FocusRequester focusRequester5 = this.g;
                    if (zChanged4 || objRememberedValue6 == companion8.getEmpty()) {
                        na1Var = new na1(softwareKeyboardController2, rowScopeInstance, focusManager2, coroutineScope3, ij1Var2, mutableState25, mutableState19, focusRequester5);
                        coroutineScope = coroutineScope3;
                        focusRequester = focusRequester5;
                        composer2.updateRememberedValue(na1Var);
                    } else {
                        na1Var = objRememberedValue6;
                        focusRequester = focusRequester5;
                        coroutineScope = coroutineScope3;
                    }
                    yc2.a(textFieldValue, function1, modifierOnFocusChanged, false, textStyle, solidColor, keyboardOptions, function2, null, null, (Function4) na1Var, ComposableLambdaKt.rememberComposableLambda(-788971163, true, new w91(4, r48), composer2, 54), composer2, 102457392, RendererCapabilities.DECODER_SUPPORT_MASK, 1544);
                    composer2.endNode();
                    composer2.endNode();
                    Object objRememberedValue7 = composer2.rememberedValue();
                    if (objRememberedValue7 == companion8.getEmpty()) {
                        objRememberedValue7 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Boolean.FALSE, null, 2, null);
                        composer2.updateRememberedValue(objRememberedValue7);
                    }
                    MutableState mutableState28 = (MutableState) objRememberedValue7;
                    boolean zChanged5 = composer2.changed(str) | composer2.changedInstance(coroutineScope) | composer2.changedInstance(context2) | composer2.changed(neVar2.ordinal());
                    Object objRememberedValue8 = composer2.rememberedValue();
                    if (zChanged5 || objRememberedValue8 == companion8.getEmpty()) {
                        final int i9 = 1;
                        final String str6 = str;
                        final CoroutineScope coroutineScope4 = coroutineScope;
                        objRememberedValue8 = new Function0() { // from class: da1
                            /* JADX WARN: Multi-variable type inference failed */
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                switch (i9) {
                                    case 0:
                                        MutableState mutableState29 = mutableState2;
                                        ra1.e(str6, coroutineScope4, mutableState29, mutableState18, mutableState21, context2, neVar2, mutableState22, mutableState23, mutableState24, mutableState25, mutableState26, mutableState27, mutableIntState2, StringsKt.trim((CharSequence) mutableState29.getValue()).toString());
                                        break;
                                    default:
                                        MutableState mutableState210 = mutableState2;
                                        ra1.e(str6, coroutineScope4, mutableState210, mutableState18, mutableState21, context2, neVar2, mutableState22, mutableState23, mutableState24, mutableState25, mutableState26, mutableState27, mutableIntState2, StringsKt.trim((CharSequence) mutableState210.getValue()).toString());
                                        break;
                                }
                                return Unit.INSTANCE;
                            }
                        };
                        composer2.updateRememberedValue(objRememberedValue8);
                    }
                    Function0 function3 = (Function0) objRememberedValue8;
                    Modifier modifierFocusRequester2 = FocusRequesterModifierKt.focusRequester(SizeKt.m1050height3ABfNKs(companion4, Dp.m7813constructorimpl(44.0f)), focusRequester);
                    Object objRememberedValue9 = composer2.rememberedValue();
                    if (objRememberedValue9 == companion8.getEmpty()) {
                        objRememberedValue9 = new p21(8, mutableState28);
                        composer2.updateRememberedValue(objRememberedValue9);
                    }
                    Modifier modifierOnFocusChanged2 = FocusChangedModifierKt.onFocusChanged(modifierFocusRequester2, (Function1) objRememberedValue9);
                    ButtonColors buttonColorsM = hc2.m(false, composer2, 1);
                    ButtonDefaults buttonDefaults = ButtonDefaults.INSTANCE;
                    Border border = new Border(BorderStrokeKt.m301BorderStrokecXLIe8U(Dp.m7813constructorimpl(2.0f), companion7.m5189getWhite0d7_KjU()), 0.0f, null, 6, null);
                    int i10 = (ButtonDefaults.$stable << 15) | 48;
                    ButtonKt.m8231ButtonTCVpFMg(function3, modifierOnFocusChanged2, null, false, null, null, null, buttonColorsM, 0.0f, buttonDefaults.border(null, border, null, null, null, composer2, i10, 29), null, null, ComposableLambdaKt.rememberComposableLambda(932953219, true, new w91(2, mutableState28), composer2, 54), composer2, 0, RendererCapabilities.DECODER_SUPPORT_MASK, 3452);
                    Composer composer3 = composer2;
                    composer3.endNode();
                    Modifier modifierF = wn.F(columnScopeInstance, SizeKt.fillMaxWidth$default(companion4, 0.0f, 1, null), 1.0f, false, 2, null);
                    MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy3 = BoxKt.maybeCachedBoxMeasurePolicy(companion5.getTopStart(), false);
                    long currentCompositeKeyHashCode6 = ComposablesKt.getCurrentCompositeKeyHashCode(composer3, 0);
                    int i11 = (int) (currentCompositeKeyHashCode6 ^ (currentCompositeKeyHashCode6 >>> 32));
                    CompositionLocalMap currentCompositionLocalMap6 = composer3.getCurrentCompositionLocalMap();
                    Modifier modifierMaterializeModifier6 = ComposedModifierKt.materializeModifier(composer3, modifierF);
                    Function0<ComposeUiNode> constructor6 = companion6.getConstructor();
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
                    mr.z(companion6, composerM4318constructorimpl6, measurePolicyMaybeCachedBoxMeasurePolicy3, composerM4318constructorimpl6, currentCompositionLocalMap6);
                    Updater.m4326setimpl(composerM4318constructorimpl6, modifierMaterializeModifier6, (Function2<? super T, ? super Modifier, Unit>) id.h(companion6, composerM4318constructorimpl6, Integer.valueOf(i11), composerM4318constructorimpl6));
                    if (((Boolean) mutableState22.getValue()).booleanValue()) {
                        composer3.startReplaceGroup(-1451470220);
                        Modifier modifierFillMaxSize$default = SizeKt.fillMaxSize$default(companion4, 0.0f, 1, null);
                        MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy4 = BoxKt.maybeCachedBoxMeasurePolicy(companion5.getCenter(), false);
                        long currentCompositeKeyHashCode7 = ComposablesKt.getCurrentCompositeKeyHashCode(composer3, 0);
                        int i12 = (int) (currentCompositeKeyHashCode7 ^ (currentCompositeKeyHashCode7 >>> 32));
                        CompositionLocalMap currentCompositionLocalMap7 = composer3.getCurrentCompositionLocalMap();
                        Modifier modifierMaterializeModifier7 = ComposedModifierKt.materializeModifier(composer3, modifierFillMaxSize$default);
                        Function0<ComposeUiNode> constructor7 = companion6.getConstructor();
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
                        mr.z(companion6, composerM4318constructorimpl7, measurePolicyMaybeCachedBoxMeasurePolicy4, composerM4318constructorimpl7, currentCompositionLocalMap7);
                        Updater.m4326setimpl(composerM4318constructorimpl7, modifierMaterializeModifier7, (Function2<? super T, ? super Modifier, Unit>) id.h(companion6, composerM4318constructorimpl7, Integer.valueOf(i12), composerM4318constructorimpl7));
                        ProgressIndicatorKt.m2703CircularProgressIndicator4lLiAd8(null, 0L, 0.0f, 0L, 0, 0.0f, composer3, 0, 63);
                        composer3 = composer3;
                        composer3.endNode();
                        composer3.endReplaceGroup();
                    } else {
                        boolean zBooleanValue = ((Boolean) mutableState23.getValue()).booleanValue();
                        Bitmap bitmap2 = this.x;
                        String str7 = this.y;
                        if (!zBooleanValue) {
                            composer3.startReplaceGroup(-1451085014);
                            ra1.b(bitmap2, str7, "手机扫码输入搜索内容", composer3, 432);
                            composer3.endReplaceGroup();
                        } else if (((List) mutableState26.getValue()).isEmpty()) {
                            composer3.startReplaceGroup(-1450745006);
                            String str8 = (String) mutableState21.getValue();
                            ra1.b(bitmap2, str7, (str8 == null || StringsKt.isBlank(str8)) ? "暂无搜索结果，扫码重新输入" : "搜索失败，扫码重新输入", composer3, 48);
                            composer3.endReplaceGroup();
                        } else {
                            composer3.startReplaceGroup(-1450013251);
                            Modifier modifierFillMaxSize$default2 = SizeKt.fillMaxSize$default(companion4, 0.0f, 1, null);
                            PaddingValues paddingValuesM996PaddingValuesa9UjIt4$default = PaddingKt.m996PaddingValuesa9UjIt4$default(0.0f, Dp.m7813constructorimpl(8.0f), 0.0f, Dp.m7813constructorimpl(2.0f), 5, null);
                            Arrangement.HorizontalOrVertical horizontalOrVerticalM712spacedBy0680j_5 = arrangement.m712spacedBy0680j_4(Dp.m7813constructorimpl(6.0f));
                            boolean zChanged6 = composer3.changed(str) | composer3.changedInstance(coroutineScope) | composer3.changedInstance(context2) | composer3.changed(neVar2.ordinal());
                            final jj1 jj1Var2 = this.z;
                            boolean zChanged7 = zChanged6 | composer3.changed(jj1Var2);
                            Object objRememberedValue10 = composer3.rememberedValue();
                            if (zChanged7 || objRememberedValue10 == companion8.getEmpty()) {
                                final MutableState mutableState29 = this.B;
                                final MutableState mutableState30 = this.C;
                                final MutableState mutableState31 = this.D;
                                final FocusRequester focusRequester6 = this.A;
                                final String str9 = str;
                                final CoroutineScope coroutineScope5 = coroutineScope;
                                final MutableState mutableState32 = mutableState2;
                                objRememberedValue10 = new Function1() { // from class: ca1
                                    /* JADX WARN: Multi-variable type inference failed */
                                    @Override // kotlin.jvm.functions.Function1
                                    public final Object invoke(Object obj3) {
                                        LazyListScope lazyListScope = (LazyListScope) obj3;
                                        lazyListScope.getClass();
                                        final MutableState mutableState33 = mutableState26;
                                        int size = ((List) mutableState33.getValue()).size();
                                        p21 p21Var = new p21(9, mutableState33);
                                        final ne neVar3 = neVar2;
                                        final jj1 jj1Var3 = jj1Var2;
                                        final Context context3 = context2;
                                        final MutableState mutableState34 = mutableState29;
                                        final MutableState mutableState35 = mutableState30;
                                        final MutableState mutableState36 = mutableState27;
                                        final MutableState mutableState37 = mutableState24;
                                        final MutableState mutableState38 = mutableState22;
                                        final MutableState mutableState39 = mutableState32;
                                        final MutableState mutableState40 = mutableState21;
                                        final MutableState mutableState41 = mutableState25;
                                        final MutableState mutableState42 = mutableState31;
                                        final FocusRequester focusRequester7 = focusRequester6;
                                        final String str10 = str9;
                                        final CoroutineScope coroutineScope6 = coroutineScope5;
                                        d.b(lazyListScope, size, p21Var, null, ComposableLambdaKt.composableLambdaInstance(1498036948, true, new Function4() { // from class: fa1
                                            /* JADX WARN: Multi-variable type inference failed */
                                            /* JADX WARN: Type inference fix 'apply assigned field type' failed
                                            java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
                                            	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
                                            	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
                                            	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
                                            	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
                                            	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
                                            	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
                                            	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
                                             */
                                            @Override // kotlin.jvm.functions.Function4
                                            public final Object invoke(Object obj4, Object obj5, Object obj6, Object obj7) {
                                                String upperCase;
                                                Modifier modifier;
                                                MutableState mutableState43;
                                                MutableState mutableState44;
                                                String str11;
                                                long jM5189getWhite0d7_KjU;
                                                int i13;
                                                Object obj8;
                                                float f;
                                                MutableState mutableState45;
                                                MutableState mutableState46;
                                                qe qeVar;
                                                final int iIntValue3 = ((Integer) obj5).intValue();
                                                Composer composer4 = (Composer) obj6;
                                                int iIntValue4 = ((Integer) obj7).intValue();
                                                ((LazyItemScope) obj4).getClass();
                                                if ((iIntValue4 & 48) == 0) {
                                                    iIntValue4 |= composer4.changed(iIntValue3) ? 32 : 16;
                                                }
                                                if (composer4.shouldExecute((iIntValue4 & Input.Keys.NUMPAD_1) != 144, iIntValue4 & 1)) {
                                                    if (ComposerKt.isTraceInProgress()) {
                                                        ComposerKt.traceEventStart(1498036948, iIntValue4, -1, "com.dh.myembyapp.ui.components.OnlineSubtitleSearchDialog.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (OnlineSubtitleSearchDialog.kt:472)");
                                                    }
                                                    final MutableState mutableState47 = mutableState33;
                                                    qe qeVar2 = (qe) ((List) mutableState47.getValue()).get(iIntValue3);
                                                    MutableState mutableState48 = mutableState34;
                                                    String str12 = (String) mutableState48.getValue();
                                                    String str13 = qeVar2.a;
                                                    boolean zAreEqual2 = Intrinsics.areEqual(str12, str13);
                                                    MutableState mutableState49 = mutableState35;
                                                    if (!zAreEqual2) {
                                                        Intrinsics.areEqual((String) mutableState49.getValue(), str13);
                                                    }
                                                    boolean zChanged8 = composer4.changed(str13);
                                                    Object objRememberedValue11 = composer4.rememberedValue();
                                                    if (zChanged8 || objRememberedValue11 == Composer.INSTANCE.getEmpty()) {
                                                        objRememberedValue11 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Boolean.FALSE, null, 2, null);
                                                        composer4.updateRememberedValue(objRememberedValue11);
                                                    }
                                                    final MutableState mutableState50 = (MutableState) objRememberedValue11;
                                                    String string = StringsKt.trim((CharSequence) StringsKt__StringsKt.substringAfterLast(qeVar2.f, '.', "")).toString();
                                                    Locale locale = Locale.ROOT;
                                                    String lowerCase = string.toLowerCase(locale);
                                                    lowerCase.getClass();
                                                    if (StringsKt.isBlank(lowerCase)) {
                                                        upperCase = "未知";
                                                    } else {
                                                        upperCase = lowerCase.toUpperCase(locale);
                                                        upperCase.getClass();
                                                    }
                                                    String str14 = upperCase;
                                                    Modifier modifierFocusRequester3 = Modifier.INSTANCE;
                                                    Modifier modifierFillMaxWidth$default2 = SizeKt.fillMaxWidth$default(modifierFocusRequester3, 0.0f, 1, null);
                                                    qe qeVar3 = (qe) CollectionsKt.firstOrNull((List) mutableState47.getValue());
                                                    if (Intrinsics.areEqual(qeVar3 != null ? qeVar3.a : null, str13)) {
                                                        modifierFocusRequester3 = FocusRequesterModifierKt.focusRequester(modifierFocusRequester3, focusRequester7);
                                                    }
                                                    Modifier modifierThen = modifierFillMaxWidth$default2.then(modifierFocusRequester3);
                                                    boolean zChanged9 = composer4.changed(mutableState50);
                                                    boolean z = (iIntValue4 & Input.Keys.FORWARD_DEL) == 32;
                                                    final String str15 = str10;
                                                    boolean zChanged10 = z | zChanged9 | composer4.changed(str15);
                                                    final CoroutineScope coroutineScope7 = coroutineScope6;
                                                    boolean zChangedInstance5 = zChanged10 | composer4.changedInstance(coroutineScope7);
                                                    final Context context4 = context3;
                                                    boolean zChangedInstance6 = zChangedInstance5 | composer4.changedInstance(context4);
                                                    final ne neVar4 = neVar3;
                                                    boolean zChanged11 = zChangedInstance6 | composer4.changed(neVar4.ordinal());
                                                    Object objRememberedValue12 = composer4.rememberedValue();
                                                    final MutableState mutableState51 = mutableState40;
                                                    if (zChanged11 || objRememberedValue12 == Composer.INSTANCE.getEmpty()) {
                                                        final MutableState mutableState52 = mutableState36;
                                                        final MutableState mutableState53 = mutableState37;
                                                        final MutableState mutableState54 = mutableState38;
                                                        final MutableState mutableState55 = mutableState39;
                                                        modifier = modifierThen;
                                                        mutableState43 = mutableState48;
                                                        mutableState44 = mutableState49;
                                                        Function1 function4 = new Function1() { // from class: ga1
                                                            /* JADX WARN: Multi-variable type inference failed */
                                                            @Override // kotlin.jvm.functions.Function1
                                                            public final Object invoke(Object obj9) {
                                                                FocusState focusState = (FocusState) obj9;
                                                                focusState.getClass();
                                                                mutableState50.setValue(Boolean.valueOf(focusState.isFocused()));
                                                                if (focusState.isFocused()) {
                                                                    MutableState mutableState56 = mutableState47;
                                                                    if (iIntValue3 == CollectionsKt.getLastIndex((List) mutableState56.getValue())) {
                                                                        MutableState mutableState57 = mutableState52;
                                                                        if (((Boolean) mutableState57.getValue()).booleanValue()) {
                                                                            MutableState mutableState58 = mutableState53;
                                                                            if (!((Boolean) mutableState58.getValue()).booleanValue()) {
                                                                                MutableState mutableState59 = mutableState54;
                                                                                if (!((Boolean) mutableState59.getValue()).booleanValue()) {
                                                                                    String string2 = StringsKt.trim((CharSequence) mutableState55.getValue()).toString();
                                                                                    if (!StringsKt.isBlank(string2)) {
                                                                                        String str16 = str15;
                                                                                        if (!StringsKt.isBlank(str16) && !((Boolean) mutableState59.getValue()).booleanValue() && !((Boolean) mutableState58.getValue()).booleanValue() && ((Boolean) mutableState57.getValue()).booleanValue()) {
                                                                                            BuildersKt__Builders_commonKt.launch$default(coroutineScope7, null, null, new mi(context4, str16, string2, neVar4, mutableState58, mutableState56, mutableState57, mutableState51, (Continuation) null), 3, null);
                                                                                        }
                                                                                    }
                                                                                }
                                                                            }
                                                                        }
                                                                    }
                                                                }
                                                                return Unit.INSTANCE;
                                                            }
                                                        };
                                                        str11 = str15;
                                                        composer4.updateRememberedValue(function4);
                                                        objRememberedValue12 = function4;
                                                    } else {
                                                        modifier = modifierThen;
                                                        mutableState43 = mutableState48;
                                                        mutableState44 = mutableState49;
                                                        str11 = str15;
                                                    }
                                                    Modifier modifierOnFocusChanged3 = FocusChangedModifierKt.onFocusChanged(modifier, (Function1) objRememberedValue12);
                                                    ClickableSurfaceDefaults clickableSurfaceDefaults = ClickableSurfaceDefaults.INSTANCE;
                                                    if (((Boolean) r5.getValue()).booleanValue()) {
                                                        jM5189getWhite0d7_KjU = Color.INSTANCE.m5189getWhite0d7_KjU();
                                                        i13 = 14;
                                                        obj8 = null;
                                                        f = 0.15f;
                                                    } else {
                                                        jM5189getWhite0d7_KjU = Color.INSTANCE.m5189getWhite0d7_KjU();
                                                        i13 = 14;
                                                        obj8 = null;
                                                        f = 0.06f;
                                                    }
                                                    long jM5151copywmQWz5c$default = Color.m5151copywmQWz5c$default(jM5189getWhite0d7_KjU, f, 0.0f, 0.0f, 0.0f, i13, obj8);
                                                    Color.Companion companion9 = Color.INSTANCE;
                                                    long jM5151copywmQWz5c$default2 = Color.m5151copywmQWz5c$default(companion9.m5189getWhite0d7_KjU(), 0.2f, 0.0f, 0.0f, 0.0f, 14, null);
                                                    int i14 = ClickableSurfaceDefaults.$stable;
                                                    String str16 = str11;
                                                    ClickableSurfaceColors clickableSurfaceColorsM8292colorsoq7We08 = clickableSurfaceDefaults.m8292colorsoq7We08(jM5151copywmQWz5c$default, 0L, jM5151copywmQWz5c$default2, 0L, 0L, 0L, 0L, 0L, composer4, (i14 << 24) | RendererCapabilities.DECODER_SUPPORT_MASK, 250);
                                                    int i15 = i14 << 15;
                                                    ClickableSurfaceBorder clickableSurfaceBorderBorder = clickableSurfaceDefaults.border(null, new Border(BorderStrokeKt.m301BorderStrokecXLIe8U(Dp.m7813constructorimpl(2.0f), companion9.m5189getWhite0d7_KjU()), 0.0f, null, 6, null), null, null, null, composer4, i15 | 48, 29);
                                                    ClickableSurfaceShape clickableSurfaceShapeShape = clickableSurfaceDefaults.shape(RoundedCornerShapeKt.m1312RoundedCornerShape0680j_4(Dp.m7813constructorimpl(8.0f)), null, null, null, null, composer4, i15, 30);
                                                    ClickableSurfaceScale clickableSurfaceScaleScale$default = ClickableSurfaceDefaults.scale$default(clickableSurfaceDefaults, 0.0f, 1.01f, 0.0f, 0.0f, 0.0f, 29, null);
                                                    boolean zChanged12 = composer4.changed(qeVar2) | composer4.changedInstance(coroutineScope7) | composer4.changed(str16) | composer4.changed(neVar4.ordinal()) | composer4.changedInstance(context4);
                                                    jj1 jj1Var4 = jj1Var3;
                                                    boolean zChanged13 = zChanged12 | composer4.changed(jj1Var4);
                                                    Object objRememberedValue13 = composer4.rememberedValue();
                                                    if (zChanged13 || objRememberedValue13 == Composer.INSTANCE.getEmpty()) {
                                                        mutableState45 = mutableState43;
                                                        mutableState46 = mutableState44;
                                                        qeVar = qeVar2;
                                                        ha1 ha1Var = new ha1(qeVar, coroutineScope7, mutableState45, mutableState46, mutableState51, str16, neVar4, mutableState41, context4, mutableState42, jj1Var4);
                                                        composer4.updateRememberedValue(ha1Var);
                                                        objRememberedValue13 = ha1Var;
                                                    } else {
                                                        qeVar = qeVar2;
                                                        mutableState45 = mutableState43;
                                                        mutableState46 = mutableState44;
                                                    }
                                                    androidx.tv.material3.SurfaceKt.m8520Surface05tvjtU((Function0) objRememberedValue13, modifierOnFocusChanged3, null, false, 0.0f, clickableSurfaceShapeShape, clickableSurfaceColorsM8292colorsoq7We08, clickableSurfaceScaleScale$default, clickableSurfaceBorderBorder, null, null, ComposableLambdaKt.rememberComposableLambda(-2081481515, true, new n1(qeVar, mutableState50, str14, mutableState46, mutableState45, 5), composer4, 54), composer4, 0, 48, 1564);
                                                    if (ComposerKt.isTraceInProgress()) {
                                                        ComposerKt.traceEventEnd();
                                                    }
                                                } else {
                                                    composer4.skipToGroupEnd();
                                                }
                                                return Unit.INSTANCE;
                                            }
                                        }), 4, null);
                                        if (((Boolean) mutableState37.getValue()).booleanValue()) {
                                            d.a(lazyListScope, "loading_more", null, nt.a, 2, null);
                                        }
                                        return Unit.INSTANCE;
                                    }
                                };
                                composer3.updateRememberedValue(objRememberedValue10);
                            }
                            LazyDslKt.LazyColumn(modifierFillMaxSize$default2, null, paddingValuesM996PaddingValuesa9UjIt4$default, false, horizontalOrVerticalM712spacedBy0680j_5, null, null, false, null, (Function1) objRememberedValue10, composer3, 24966, 490);
                            composer3 = composer3;
                            composer3.endReplaceGroup();
                        }
                    }
                    composer3.endNode();
                    String str10 = (String) mutableState21.getValue();
                    if (str10 == null || StringsKt.isBlank(str10)) {
                        composer3.startReplaceGroup(1044930387);
                        composer3.endReplaceGroup();
                    } else {
                        composer3.startReplaceGroup(1044700987);
                        String str11 = (String) mutableState21.getValue();
                        if (str11 == null) {
                            str11 = "";
                        }
                        Composer composer4 = composer3;
                        TextKt.m3048TextNvy7gAk(str11, null, ColorKt.Color(4294937216L), null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, materialTheme.getTypography(composer3, i3).getBodySmall(), composer4, RendererCapabilities.DECODER_SUPPORT_MASK, 0, 131066);
                        composer3 = composer4;
                        composer3.endReplaceGroup();
                    }
                    Modifier modifierFillMaxWidth$default2 = SizeKt.fillMaxWidth$default(companion4, 0.0f, 1, null);
                    MeasurePolicy measurePolicyRowMeasurePolicy3 = RowKt.rowMeasurePolicy(arrangement.getEnd(), companion5.getCenterVertically(), composer3, 54);
                    long currentCompositeKeyHashCode8 = ComposablesKt.getCurrentCompositeKeyHashCode(composer3, 0);
                    int i13 = (int) (currentCompositeKeyHashCode8 ^ (currentCompositeKeyHashCode8 >>> 32));
                    CompositionLocalMap currentCompositionLocalMap8 = composer3.getCurrentCompositionLocalMap();
                    Modifier modifierMaterializeModifier8 = ComposedModifierKt.materializeModifier(composer3, modifierFillMaxWidth$default2);
                    Function0<ComposeUiNode> constructor8 = companion6.getConstructor();
                    if (composer3.getApplier() == null) {
                        ComposablesKt.invalidApplier();
                    }
                    composer3.startReusableNode();
                    if (composer3.getInserting()) {
                        composer3.createNode(constructor8);
                    } else {
                        composer3.useNode();
                    }
                    Composer composerM4318constructorimpl8 = Updater.m4318constructorimpl(composer3);
                    mr.z(companion6, composerM4318constructorimpl8, measurePolicyRowMeasurePolicy3, composerM4318constructorimpl8, currentCompositionLocalMap8);
                    Updater.m4326setimpl(composerM4318constructorimpl8, modifierMaterializeModifier8, (Function2<? super T, ? super Modifier, Unit>) id.h(companion6, composerM4318constructorimpl8, Integer.valueOf(i13), composerM4318constructorimpl8));
                    Object objRememberedValue11 = composer3.rememberedValue();
                    if (objRememberedValue11 == companion8.getEmpty()) {
                        objRememberedValue11 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Boolean.FALSE, null, 2, null);
                        composer3.updateRememberedValue(objRememberedValue11);
                    }
                    MutableState mutableState33 = (MutableState) objRememberedValue11;
                    Object objRememberedValue12 = composer3.rememberedValue();
                    if (objRememberedValue12 == companion8.getEmpty()) {
                        objRememberedValue12 = new p21(7, mutableState33);
                        composer3.updateRememberedValue(objRememberedValue12);
                    }
                    Composer composer5 = composer3;
                    ButtonKt.m8231ButtonTCVpFMg(ij1Var2, FocusChangedModifierKt.onFocusChanged(companion4, (Function1) objRememberedValue12), null, false, null, null, null, hc2.p(false, composer3, 0, 1), 0.0f, buttonDefaults.border(null, new Border(BorderStrokeKt.m301BorderStrokecXLIe8U(Dp.m7813constructorimpl(2.0f), companion7.m5189getWhite0d7_KjU()), 0.0f, null, 6, null), null, null, null, composer5, i10, 29), null, null, ComposableLambdaKt.rememberComposableLambda(-349957894, true, new w91(3, mutableState33), composer5, 54), composer5, 0, RendererCapabilities.DECODER_SUPPORT_MASK, 3452);
                    if (x2.m(composer5)) {
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
