package defpackage;

import android.graphics.Bitmap;
import androidx.compose.foundation.BackgroundKt;
import androidx.compose.foundation.ImageKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnScopeInstance;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.RowKt;
import androidx.compose.foundation.layout.RowScopeInstance;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.shape.RoundedCornerShapeKt;
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
import androidx.compose.ui.focus.FocusChangedModifierKt;
import androidx.compose.ui.focus.FocusManager;
import androidx.compose.ui.focus.FocusRequester;
import androidx.compose.ui.focus.FocusRequesterModifierKt;
import androidx.compose.ui.graphics.AndroidImageBitmap_androidKt;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.platform.SoftwareKeyboardController;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.text.font.FontWeight;
import androidx.compose.ui.unit.Dp;
import androidx.compose.ui.unit.TextUnitKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.text.StringsKt;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class gx1 implements Function2 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Bitmap b;
    public final /* synthetic */ MutableState c;
    public final /* synthetic */ MutableState d;
    public final /* synthetic */ MutableState e;
    public final /* synthetic */ MutableState g;
    public final /* synthetic */ Function0 h;
    public final /* synthetic */ SoftwareKeyboardController i;
    public final /* synthetic */ FocusManager j;
    public final /* synthetic */ Function1 k;
    public final /* synthetic */ FocusRequester l;

    public /* synthetic */ gx1(Bitmap bitmap, MutableState mutableState, MutableState mutableState2, MutableState mutableState3, MutableState mutableState4, Function0 function0, SoftwareKeyboardController softwareKeyboardController, FocusManager focusManager, Function1 function1, FocusRequester focusRequester, int i) {
        this.a = i;
        this.b = bitmap;
        this.c = mutableState;
        this.d = mutableState2;
        this.e = mutableState3;
        this.g = mutableState4;
        this.h = function0;
        this.i = softwareKeyboardController;
        this.j = focusManager;
        this.k = function1;
        this.l = focusRequester;
    }

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
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        long jU;
        MutableState mutableState;
        switch (this.a) {
            case 0:
                Composer composer = (Composer) obj;
                int iIntValue = ((Integer) obj2).intValue();
                if (composer.shouldExecute((iIntValue & 3) != 2, iIntValue & 1)) {
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(1397904446, iIntValue, -1, "com.dh.myembyapp.ui.components.ServerIconLibraryUrlDialog.<anonymous> (ServerIconDialogs.kt:206)");
                    }
                    Modifier.Companion companion = Modifier.INSTANCE;
                    Modifier modifierM275backgroundbw27NRU$default = BackgroundKt.m275backgroundbw27NRU$default(SizeKt.fillMaxSize$default(companion, 0.0f, 1, null), Color.m5151copywmQWz5c$default(Color.INSTANCE.m5178getBlack0d7_KjU(), 0.72f, 0.0f, 0.0f, 0.0f, 14, null), null, 2, null);
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
                    SurfaceKt.m2905SurfaceT9BRK9s(SizeKt.m1069width3ABfNKs(companion, Dp.m7813constructorimpl(920.0f)), RoundedCornerShapeKt.m1312RoundedCornerShape0680j_4(Dp.m7813constructorimpl(20.0f)), MaterialTheme.INSTANCE.getColorScheme(composer, MaterialTheme.$stable).getSurface(), 0L, Dp.m7813constructorimpl(10.0f), 0.0f, null, ComposableLambdaKt.rememberComposableLambda(-1211336353, true, new gx1(this.b, this.c, this.d, this.e, this.g, this.h, this.i, this.j, this.k, this.l, 1), composer, 54), composer, 12607494, 104);
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
                        ComposerKt.traceEventStart(-1211336353, iIntValue2, -1, "com.dh.myembyapp.ui.components.ServerIconLibraryUrlDialog.<anonymous>.<anonymous>.<anonymous> (ServerIconDialogs.kt:218)");
                    }
                    Modifier.Companion companion3 = Modifier.INSTANCE;
                    Modifier modifierM999padding3ABfNKs = PaddingKt.m999padding3ABfNKs(SizeKt.fillMaxWidth$default(companion3, 0.0f, 1, null), Dp.m7813constructorimpl(24.0f));
                    Arrangement arrangement = Arrangement.INSTANCE;
                    Arrangement.HorizontalOrVertical horizontalOrVerticalM712spacedBy0680j_4 = arrangement.m712spacedBy0680j_4(Dp.m7813constructorimpl(24.0f));
                    Alignment.Companion companion4 = Alignment.INSTANCE;
                    MeasurePolicy measurePolicyRowMeasurePolicy = RowKt.rowMeasurePolicy(horizontalOrVerticalM712spacedBy0680j_4, companion4.getTop(), composer2, 6);
                    long currentCompositeKeyHashCode2 = ComposablesKt.getCurrentCompositeKeyHashCode(composer2, 0);
                    int i2 = (int) (currentCompositeKeyHashCode2 ^ (currentCompositeKeyHashCode2 >>> 32));
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
                    mr.z(companion5, composerM4318constructorimpl2, measurePolicyRowMeasurePolicy, composerM4318constructorimpl2, currentCompositionLocalMap2);
                    Updater.m4326setimpl(composerM4318constructorimpl2, modifierMaterializeModifier2, (Function2<? super T, ? super Modifier, Unit>) id.h(companion5, composerM4318constructorimpl2, Integer.valueOf(i2), composerM4318constructorimpl2));
                    RowScopeInstance rowScopeInstance = RowScopeInstance.INSTANCE;
                    Modifier modifierM1069width3ABfNKs = SizeKt.m1069width3ABfNKs(companion3, Dp.m7813constructorimpl(320.0f));
                    MeasurePolicy measurePolicyP = mr.p(10.0f, arrangement, companion4.getCenterHorizontally(), composer2, 54);
                    long currentCompositeKeyHashCode3 = ComposablesKt.getCurrentCompositeKeyHashCode(composer2, 0);
                    int i3 = (int) (currentCompositeKeyHashCode3 ^ (currentCompositeKeyHashCode3 >>> 32));
                    CompositionLocalMap currentCompositionLocalMap3 = composer2.getCurrentCompositionLocalMap();
                    Modifier modifierMaterializeModifier3 = ComposedModifierKt.materializeModifier(composer2, modifierM1069width3ABfNKs);
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
                    mr.z(companion5, composerM4318constructorimpl3, measurePolicyP, composerM4318constructorimpl3, currentCompositionLocalMap3);
                    Updater.m4326setimpl(composerM4318constructorimpl3, modifierMaterializeModifier3, (Function2<? super T, ? super Modifier, Unit>) id.h(companion5, composerM4318constructorimpl3, Integer.valueOf(i3), composerM4318constructorimpl3));
                    ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.INSTANCE;
                    MaterialTheme materialTheme = MaterialTheme.INSTANCE;
                    int i4 = MaterialTheme.$stable;
                    TextKt.m3048TextNvy7gAk("手机扫码输入", null, materialTheme.getColorScheme(composer2, i4).getPrimary(), null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, materialTheme.getTypography(composer2, i4).getTitleMedium(), composer2, 6, 0, 131066);
                    Bitmap bitmap = this.b;
                    if (bitmap != null) {
                        composer2.startReplaceGroup(-340328921);
                        ImageKt.m332Image5hnEew(AndroidImageBitmap_androidKt.asImageBitmap(bitmap), "图标库二维码", SizeKt.m1064size3ABfNKs(companion3, Dp.m7813constructorimpl(220.0f)), null, null, 0.0f, null, 0, composer2, 432, 248);
                        String str = (String) this.c.getValue();
                        if (str == null) {
                            str = "";
                        }
                        TextKt.m3048TextNvy7gAk(str, null, Color.m5151copywmQWz5c$default(materialTheme.getColorScheme(composer2, i4).getOnSurface(), 0.65f, 0.0f, 0.0f, 0.0f, 14, null), null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, materialTheme.getTypography(composer2, i4).getBodySmall(), composer2, 0, 0, 131066);
                        TextKt.m3048TextNvy7gAk("手机浏览器打开后填写图标库 URL，保存后电视会自动加载", null, Color.m5151copywmQWz5c$default(materialTheme.getColorScheme(composer2, i4).getOnSurface(), 0.65f, 0.0f, 0.0f, 0.0f, 14, null), null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, materialTheme.getTypography(composer2, i4).getBodySmall(), composer2, 6, 0, 131066);
                        composer2.endReplaceGroup();
                    } else {
                        composer2.startReplaceGroup(-339431409);
                        MutableState mutableState2 = this.d;
                        String str2 = ((Boolean) mutableState2.getValue()).booleanValue() ? "二维码服务启动失败" : "正在启动二维码服务...";
                        TextStyle bodySmall = materialTheme.getTypography(composer2, i4).getBodySmall();
                        if (((Boolean) mutableState2.getValue()).booleanValue()) {
                            composer2.startReplaceGroup(-703678134);
                            jU = materialTheme.getColorScheme(composer2, i4).getError();
                            composer2.endReplaceGroup();
                        } else {
                            jU = kb0.u(composer2, -703676946, materialTheme, composer2, i4);
                        }
                        TextKt.m3048TextNvy7gAk(str2, null, jU, null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, bodySmall, composer2, 0, 0, 131066);
                        composer2.endReplaceGroup();
                    }
                    composer2.endNode();
                    Modifier modifierE = zs1.E(rowScopeInstance, companion3, 1.0f, false, 2, null);
                    MeasurePolicy measurePolicyColumnMeasurePolicy = ColumnKt.columnMeasurePolicy(arrangement.m712spacedBy0680j_4(Dp.m7813constructorimpl(14.0f)), companion4.getStart(), composer2, 6);
                    long currentCompositeKeyHashCode4 = ComposablesKt.getCurrentCompositeKeyHashCode(composer2, 0);
                    int i5 = (int) (currentCompositeKeyHashCode4 ^ (currentCompositeKeyHashCode4 >>> 32));
                    CompositionLocalMap currentCompositionLocalMap4 = composer2.getCurrentCompositionLocalMap();
                    Modifier modifierMaterializeModifier4 = ComposedModifierKt.materializeModifier(composer2, modifierE);
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
                    mr.z(companion5, composerM4318constructorimpl4, measurePolicyColumnMeasurePolicy, composerM4318constructorimpl4, currentCompositionLocalMap4);
                    Updater.m4326setimpl(composerM4318constructorimpl4, modifierMaterializeModifier4, (Function2<? super T, ? super Modifier, Unit>) id.h(companion5, composerM4318constructorimpl4, Integer.valueOf(i5), composerM4318constructorimpl4));
                    TextKt.m3048TextNvy7gAk("添加图标库 URL", null, 0L, null, 0L, null, FontWeight.INSTANCE.getBold(), null, 0L, null, null, 0L, 0, false, 0, 0, null, materialTheme.getTypography(composer2, i4).getHeadlineSmall(), composer2, 1572870, 0, 131006);
                    TextKt.m3048TextNvy7gAk("支持直接在电视上输入，也可以让手机扫码填写。", null, Color.m5151copywmQWz5c$default(materialTheme.getColorScheme(composer2, i4).getOnSurface(), 0.75f, 0.0f, 0.0f, 0.0f, 14, null), null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, materialTheme.getTypography(composer2, i4).getBodyMedium(), composer2, 6, 0, 131066);
                    MutableState mutableState3 = this.e;
                    String str3 = (String) mutableState3.getValue();
                    Modifier modifierFillMaxWidth$default = SizeKt.fillMaxWidth$default(companion3, 0.0f, 1, null);
                    Object objRememberedValue = composer2.rememberedValue();
                    Composer.Companion companion6 = Composer.INSTANCE;
                    if (objRememberedValue == companion6.getEmpty()) {
                        objRememberedValue = new li1(22, this.g);
                        composer2.updateRememberedValue(objRememberedValue);
                    }
                    Modifier modifierOnFocusChanged = FocusChangedModifierKt.onFocusChanged(modifierFillMaxWidth$default, (Function1) objRememberedValue);
                    boolean zChanged = composer2.changed(mutableState3);
                    Object objRememberedValue2 = composer2.rememberedValue();
                    if (zChanged || objRememberedValue2 == companion6.getEmpty()) {
                        objRememberedValue2 = new li1(23, mutableState3);
                        composer2.updateRememberedValue(objRememberedValue2);
                    }
                    yc2.d(str3, (Function1) objRememberedValue2, modifierOnFocusChanged, false, rt.a, null, rt.b, null, null, null, null, false, null, null, composer2, 1597440, 6, 31656);
                    id.i(8.0f, companion3, composer2, 6);
                    Modifier modifierFillMaxWidth$default2 = SizeKt.fillMaxWidth$default(companion3, 0.0f, 1, null);
                    MeasurePolicy measurePolicyRowMeasurePolicy2 = RowKt.rowMeasurePolicy(arrangement.m713spacedByD5KLDUw(Dp.m7813constructorimpl(12.0f), companion4.getEnd()), companion4.getTop(), composer2, 6);
                    long currentCompositeKeyHashCode5 = ComposablesKt.getCurrentCompositeKeyHashCode(composer2, 0);
                    int i6 = (int) (currentCompositeKeyHashCode5 ^ (currentCompositeKeyHashCode5 >>> 32));
                    CompositionLocalMap currentCompositionLocalMap5 = composer2.getCurrentCompositionLocalMap();
                    Modifier modifierMaterializeModifier5 = ComposedModifierKt.materializeModifier(composer2, modifierFillMaxWidth$default2);
                    Function0<ComposeUiNode> constructor5 = companion5.getConstructor();
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
                    mr.z(companion5, composerM4318constructorimpl5, measurePolicyRowMeasurePolicy2, composerM4318constructorimpl5, currentCompositionLocalMap5);
                    Updater.m4326setimpl(composerM4318constructorimpl5, modifierMaterializeModifier5, (Function2<? super T, ? super Modifier, Unit>) id.h(companion5, composerM4318constructorimpl5, Integer.valueOf(i6), composerM4318constructorimpl5));
                    Modifier modifierM1050height3ABfNKs = SizeKt.m1050height3ABfNKs(SizeKt.m1069width3ABfNKs(companion3, Dp.m7813constructorimpl(160.0f)), Dp.m7813constructorimpl(46.0f));
                    cx1 cx1Var = cx1.b;
                    long sp = TextUnitKt.getSp(18);
                    Function0 function0 = this.h;
                    lx1.a("取消", function0, modifierM1050height3ABfNKs, false, cx1Var, sp, 0.0f, 0.0f, composer2, 221574, 200);
                    boolean zChanged2 = composer2.changed(mutableState3);
                    SoftwareKeyboardController softwareKeyboardController = this.i;
                    boolean zChanged3 = zChanged2 | composer2.changed(softwareKeyboardController);
                    FocusManager focusManager = this.j;
                    boolean zChangedInstance = zChanged3 | composer2.changedInstance(focusManager);
                    Function1 function1 = this.k;
                    boolean zChanged4 = zChangedInstance | composer2.changed(function1) | composer2.changed(function0);
                    Object objRememberedValue3 = composer2.rememberedValue();
                    if (zChanged4 || objRememberedValue3 == companion6.getEmpty()) {
                        mutableState = mutableState3;
                        v1 v1Var = new v1(softwareKeyboardController, focusManager, function1, function0, mutableState);
                        composer2.updateRememberedValue(v1Var);
                        objRememberedValue3 = v1Var;
                    } else {
                        mutableState = mutableState3;
                    }
                    lx1.a("保存并加载", (Function0) objRememberedValue3, FocusRequesterModifierKt.focusRequester(SizeKt.m1050height3ABfNKs(SizeKt.m1069width3ABfNKs(companion3, Dp.m7813constructorimpl(200.0f)), Dp.m7813constructorimpl(46.0f)), this.l), !StringsKt.isBlank((String) mutableState.getValue()), cx1.a, TextUnitKt.getSp(18), 0.0f, 0.0f, composer2, 221190, 192);
                    if (i02.w(composer2)) {
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
