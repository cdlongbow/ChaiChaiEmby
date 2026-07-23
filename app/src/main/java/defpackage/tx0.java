package defpackage;

import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnScopeInstance;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.text.Handle;
import androidx.compose.foundation.text.input.internal.selection.TextFieldSelectionState;
import androidx.compose.material3.MaterialTheme;
import androidx.compose.material3.SurfaceKt;
import androidx.compose.material3.TextKt;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.SnapshotMutationPolicy;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.focus.FocusChangedModifierKt;
import androidx.compose.ui.focus.FocusRequester;
import androidx.compose.ui.focus.FocusRequesterModifierKt;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.input.pointer.PointerInputChange;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.unit.Dp;
import androidx.media3.exoplayer.RendererCapabilities;
import java.io.Serializable;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Ref;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class tx0 implements Function2 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Serializable b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ boolean g;

    public /* synthetic */ tx0(Serializable serializable, Object obj, Object obj2, Object obj3, boolean z, int i) {
        this.a = i;
        this.b = serializable;
        this.c = obj;
        this.d = obj2;
        this.e = obj3;
        this.g = z;
    }

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
        int i = this.a;
        int i2 = 2;
        boolean z = false;
        SnapshotMutationPolicy snapshotMutationPolicy = null;
        Object obj3 = this.e;
        Object obj4 = this.d;
        Object obj5 = this.c;
        Serializable serializable = this.b;
        switch (i) {
            case 0:
                uy0 uy0Var = (uy0) serializable;
                u61 u61Var = (u61) obj5;
                Function1 function1 = (Function1) obj4;
                FocusRequester focusRequester = (FocusRequester) obj3;
                Composer composer = (Composer) obj;
                int iIntValue = ((Integer) obj2).intValue();
                if (composer.shouldExecute((iIntValue & 3) != 2, iIntValue & 1)) {
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-1739697127, iIntValue, -1, "com.dh.myembyapp.ui.screens.library.LibrarySortDialog.<anonymous> (LibraryScreen.kt:688)");
                    }
                    Modifier modifierWrapContentHeight$default = SizeKt.wrapContentHeight$default(SizeKt.m1069width3ABfNKs(Modifier.INSTANCE, Dp.m7813constructorimpl(320.0f)), null, false, 3, null);
                    MaterialTheme materialTheme = MaterialTheme.INSTANCE;
                    int i3 = MaterialTheme.$stable;
                    SurfaceKt.m2905SurfaceT9BRK9s(modifierWrapContentHeight$default, materialTheme.getShapes(composer, i3).getLarge(), materialTheme.getColorScheme(composer, i3).getSurface(), 0L, Dp.m7813constructorimpl(8.0f), 0.0f, null, ComposableLambdaKt.rememberComposableLambda(-1360514594, true, new tx0(uy0Var, u61Var, function1, focusRequester, this.g, 1), composer, 54), composer, 12607494, 104);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                } else {
                    composer.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 1:
                uy0 uy0Var2 = (uy0) serializable;
                u61 u61Var2 = (u61) obj5;
                Function1 function2 = (Function1) obj4;
                FocusRequester focusRequester2 = (FocusRequester) obj3;
                Composer composer2 = (Composer) obj;
                int iIntValue2 = ((Integer) obj2).intValue();
                if (composer2.shouldExecute((iIntValue2 & 3) != 2, iIntValue2 & 1)) {
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-1360514594, iIntValue2, -1, "com.dh.myembyapp.ui.screens.library.LibrarySortDialog.<anonymous>.<anonymous> (LibraryScreen.kt:696)");
                    }
                    Modifier modifierM999padding3ABfNKs = PaddingKt.m999padding3ABfNKs(Modifier.INSTANCE, Dp.m7813constructorimpl(16.0f));
                    MeasurePolicy measurePolicyColumnMeasurePolicy = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.m712spacedBy0680j_4(Dp.m7813constructorimpl(10.0f)), Alignment.INSTANCE.getStart(), composer2, 6);
                    long currentCompositeKeyHashCode = ComposablesKt.getCurrentCompositeKeyHashCode(composer2, 0);
                    int i4 = (int) (currentCompositeKeyHashCode ^ (currentCompositeKeyHashCode >>> 32));
                    CompositionLocalMap currentCompositionLocalMap = composer2.getCurrentCompositionLocalMap();
                    Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(composer2, modifierM999padding3ABfNKs);
                    ComposeUiNode.Companion companion = ComposeUiNode.INSTANCE;
                    Function0<ComposeUiNode> constructor = companion.getConstructor();
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
                    mr.z(companion, composerM4318constructorimpl, measurePolicyColumnMeasurePolicy, composerM4318constructorimpl, currentCompositionLocalMap);
                    Updater.m4326setimpl(composerM4318constructorimpl, modifierMaterializeModifier, (Function2<? super T, ? super Modifier, Unit>) id.h(companion, composerM4318constructorimpl, Integer.valueOf(i4), composerM4318constructorimpl));
                    ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.INSTANCE;
                    MaterialTheme materialTheme2 = MaterialTheme.INSTANCE;
                    int i5 = MaterialTheme.$stable;
                    TextKt.m3048TextNvy7gAk("选择排序方式", null, materialTheme2.getColorScheme(composer2, i5).getOnSurface(), null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, materialTheme2.getTypography(composer2, i5).getTitleMedium(), composer2, 6, 0, 131066);
                    composer2.startReplaceGroup(889423017);
                    uy0[] uy0VarArrValues = uy0.values();
                    int length = uy0VarArrValues.length;
                    int i6 = 0;
                    int i7 = 0;
                    while (i6 < length) {
                        uy0 uy0Var3 = uy0VarArrValues[i6];
                        int i8 = i7 + 1;
                        boolean z2 = uy0Var3 == uy0Var2 ? true : z;
                        jc2 jc2Var = z2 ? jc2.b : jc2.a;
                        boolean zChanged = composer2.changed(uy0Var3.ordinal());
                        Object objRememberedValue = composer2.rememberedValue();
                        if (zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                            objRememberedValue = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Boolean.FALSE, snapshotMutationPolicy, i2, snapshotMutationPolicy);
                            composer2.updateRememberedValue(objRememberedValue);
                        }
                        MutableState mutableState = (MutableState) objRememberedValue;
                        uy0[] uy0VarArr = uy0VarArrValues;
                        Modifier modifierM1050height3ABfNKs = SizeKt.m1050height3ABfNKs(SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, snapshotMutationPolicy), Dp.m7813constructorimpl(50.0f));
                        boolean zChanged2 = composer2.changed(mutableState);
                        Object objRememberedValue2 = composer2.rememberedValue();
                        if (zChanged2 || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                            objRememberedValue2 = new h70(26, mutableState);
                            composer2.updateRememberedValue(objRememberedValue2);
                        }
                        Modifier modifierOnFocusChanged = FocusChangedModifierKt.onFocusChanged(modifierM1050height3ABfNKs, (Function1) objRememberedValue2);
                        if (i7 == 0) {
                            modifierOnFocusChanged = FocusRequesterModifierKt.focusRequester(modifierOnFocusChanged, focusRequester2);
                        }
                        ButtonColors buttonColorsI = hc2.i(jc2Var, false, composer2, 0, 2);
                        ButtonBorder buttonBorderH = hc2.h(composer2);
                        ButtonScale buttonScaleL = hc2.l(1.02f);
                        ButtonGlow buttonGlowA = el0.a(u61Var2);
                        boolean zChanged3 = composer2.changed(uy0Var3.ordinal()) | composer2.changed(function2);
                        Object objRememberedValue3 = composer2.rememberedValue();
                        if (zChanged3 || objRememberedValue3 == Composer.INSTANCE.getEmpty()) {
                            objRememberedValue3 = new jx0(1, function2, uy0Var3);
                            composer2.updateRememberedValue(objRememberedValue3);
                        }
                        ButtonKt.m8231ButtonTCVpFMg((Function0) objRememberedValue3, modifierOnFocusChanged, null, false, buttonScaleL, buttonGlowA, null, buttonColorsI, 0.0f, buttonBorderH, null, null, ComposableLambdaKt.rememberComposableLambda(-1925366307, true, new z60(uy0Var3, jc2Var, z2, this.g, mutableState), composer2, 54), composer2, 0, RendererCapabilities.DECODER_SUPPORT_MASK, 3404);
                        i6++;
                        uy0VarArrValues = uy0VarArr;
                        i7 = i8;
                        i2 = 2;
                        z = false;
                        snapshotMutationPolicy = null;
                    }
                    if (i9.s(composer2)) {
                        ComposerKt.traceEventEnd();
                    }
                } else {
                    composer2.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            default:
                return TextFieldSelectionState.detectSelectionHandleDragGestures$lambda$3((Ref.LongRef) serializable, (TextFieldSelectionState) obj5, (Handle) obj4, (Ref.LongRef) obj3, this.g, (PointerInputChange) obj, (Offset) obj2);
        }
    }
}
