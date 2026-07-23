package defpackage;

import androidx.compose.foundation.layout.Arrangement;
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
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.unit.Dp;
import androidx.compose.ui.unit.TextUnitKt;
import com.dh.myembyapp.data.model.ServerConfig;
import com.dh.myembyapp.data.model.ServerIconEntry;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class hx1 implements Function2 {
    public final /* synthetic */ int a;
    public final /* synthetic */ ServerIconEntry b;
    public final /* synthetic */ ServerConfig c;
    public final /* synthetic */ CoroutineScope d;
    public final /* synthetic */ px1 e;
    public final /* synthetic */ Function1 g;
    public final /* synthetic */ Function1 h;
    public final /* synthetic */ Function0 i;
    public final /* synthetic */ MutableState j;
    public final /* synthetic */ MutableState k;
    public final /* synthetic */ MutableState l;

    public /* synthetic */ hx1(ServerIconEntry serverIconEntry, ServerConfig serverConfig, CoroutineScope coroutineScope, px1 px1Var, Function1 function1, Function1 function2, Function0 function0, MutableState mutableState, MutableState mutableState2, MutableState mutableState3, int i) {
        this.a = i;
        this.b = serverIconEntry;
        this.c = serverConfig;
        this.d = coroutineScope;
        this.e = px1Var;
        this.g = function1;
        this.h = function2;
        this.i = function0;
        this.j = mutableState;
        this.k = mutableState2;
        this.l = mutableState3;
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
        MutableState mutableState;
        MutableState mutableState2;
        switch (this.a) {
            case 0:
                Composer composer = (Composer) obj;
                int iIntValue = ((Integer) obj2).intValue();
                if (composer.shouldExecute((iIntValue & 3) != 2, iIntValue & 1)) {
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-1872769053, iIntValue, -1, "com.dh.myembyapp.ui.components.ServerIconPickerDialog.<anonymous>.<anonymous>.<anonymous> (ServerIconDialogs.kt:697)");
                    }
                    Modifier.Companion companion = Modifier.INSTANCE;
                    Modifier modifierM999padding3ABfNKs = PaddingKt.m999padding3ABfNKs(companion, Dp.m7813constructorimpl(24.0f));
                    Arrangement arrangement = Arrangement.INSTANCE;
                    Arrangement.HorizontalOrVertical horizontalOrVerticalM712spacedBy0680j_4 = arrangement.m712spacedBy0680j_4(Dp.m7813constructorimpl(18.0f));
                    Alignment.Companion companion2 = Alignment.INSTANCE;
                    MeasurePolicy measurePolicyColumnMeasurePolicy = ColumnKt.columnMeasurePolicy(horizontalOrVerticalM712spacedBy0680j_4, companion2.getStart(), composer, 6);
                    long currentCompositeKeyHashCode = ComposablesKt.getCurrentCompositeKeyHashCode(composer, 0);
                    int i = (int) (currentCompositeKeyHashCode ^ (currentCompositeKeyHashCode >>> 32));
                    CompositionLocalMap currentCompositionLocalMap = composer.getCurrentCompositionLocalMap();
                    Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(composer, modifierM999padding3ABfNKs);
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
                    Updater.m4326setimpl(composerM4318constructorimpl, modifierMaterializeModifier, (Function2<? super T, ? super Modifier, Unit>) id.h(companion3, composerM4318constructorimpl, Integer.valueOf(i), composerM4318constructorimpl));
                    ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.INSTANCE;
                    MaterialTheme materialTheme = MaterialTheme.INSTANCE;
                    int i2 = MaterialTheme.$stable;
                    TextKt.m3048TextNvy7gAk("设置服务器图标", null, materialTheme.getColorScheme(composer, i2).getOnSurface(), null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, materialTheme.getTypography(composer, i2).getTitleLarge(), composer, 6, 0, 131066);
                    ServerIconEntry serverIconEntry = this.b;
                    String name = serverIconEntry.getName();
                    ServerConfig serverConfig = this.c;
                    TextKt.m3048TextNvy7gAk(mr.s("是否将图标「", name, "」设置为「", serverConfig.getAlias(), "」的服务器图标？"), null, Color.m5151copywmQWz5c$default(materialTheme.getColorScheme(composer, i2).getOnSurface(), 0.82f, 0.0f, 0.0f, 0.0f, 14, null), null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, materialTheme.getTypography(composer, i2).getBodyMedium(), composer, 0, 0, 131066);
                    Modifier modifierFillMaxWidth$default = SizeKt.fillMaxWidth$default(companion, 0.0f, 1, null);
                    MeasurePolicy measurePolicyRowMeasurePolicy = RowKt.rowMeasurePolicy(arrangement.m713spacedByD5KLDUw(Dp.m7813constructorimpl(12.0f), companion2.getEnd()), companion2.getTop(), composer, 6);
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
                    mr.z(companion3, composerM4318constructorimpl2, measurePolicyRowMeasurePolicy, composerM4318constructorimpl2, currentCompositionLocalMap2);
                    Updater.m4326setimpl(composerM4318constructorimpl2, modifierMaterializeModifier2, (Function2<? super T, ? super Modifier, Unit>) id.h(companion3, composerM4318constructorimpl2, Integer.valueOf(i3), composerM4318constructorimpl2));
                    RowScopeInstance rowScopeInstance = RowScopeInstance.INSTANCE;
                    MutableState mutableState3 = this.j;
                    String str = ((Boolean) mutableState3.getValue()).booleanValue() ? "保存中..." : "确定";
                    CoroutineScope coroutineScope = this.d;
                    boolean zChangedInstance = composer.changedInstance(coroutineScope);
                    px1 px1Var = this.e;
                    boolean zChangedInstance2 = zChangedInstance | composer.changedInstance(px1Var) | composer.changedInstance(serverConfig) | composer.changed(serverIconEntry);
                    Function1 function1 = this.g;
                    boolean zChanged = zChangedInstance2 | composer.changed(function1);
                    Function1 function2 = this.h;
                    boolean zChanged2 = zChanged | composer.changed(function2);
                    Function0 function0 = this.i;
                    boolean zChanged3 = zChanged2 | composer.changed(function0);
                    Object objRememberedValue = composer.rememberedValue();
                    MutableState mutableState4 = this.k;
                    if (zChanged3 || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                        mutableState = mutableState3;
                        ih ihVar = new ih(coroutineScope, px1Var, serverConfig, serverIconEntry, mutableState, function1, function2, function0, mutableState4, this.l);
                        mutableState2 = mutableState4;
                        composer.updateRememberedValue(ihVar);
                        objRememberedValue = ihVar;
                    } else {
                        mutableState = mutableState3;
                        mutableState2 = mutableState4;
                    }
                    lx1.a(str, (Function0) objRememberedValue, SizeKt.m1050height3ABfNKs(SizeKt.m1069width3ABfNKs(companion, Dp.m7813constructorimpl(112.0f)), Dp.m7813constructorimpl(44.0f)), !((Boolean) mutableState.getValue()).booleanValue(), cx1.a, TextUnitKt.getSp(17), 0.0f, 0.0f, composer, 221568, 192);
                    Object objRememberedValue2 = composer.rememberedValue();
                    if (objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                        objRememberedValue2 = new zq1(4, mutableState2);
                        composer.updateRememberedValue(objRememberedValue2);
                    }
                    lx1.a("取消", (Function0) objRememberedValue2, SizeKt.m1050height3ABfNKs(SizeKt.m1069width3ABfNKs(companion, Dp.m7813constructorimpl(112.0f)), Dp.m7813constructorimpl(44.0f)), !((Boolean) mutableState.getValue()).booleanValue(), cx1.b, TextUnitKt.getSp(17), 0.0f, 0.0f, composer, 221622, 192);
                    if (x2.m(composer)) {
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
                        ComposerKt.traceEventStart(1091480862, iIntValue2, -1, "com.dh.myembyapp.ui.components.ServerIconPickerDialog.<anonymous>.<anonymous> (ServerIconDialogs.kt:689)");
                    }
                    SurfaceKt.m2905SurfaceT9BRK9s(SizeKt.wrapContentHeight$default(SizeKt.m1069width3ABfNKs(Modifier.INSTANCE, Dp.m7813constructorimpl(420.0f)), null, false, 3, null), RoundedCornerShapeKt.m1312RoundedCornerShape0680j_4(Dp.m7813constructorimpl(18.0f)), MaterialTheme.INSTANCE.getColorScheme(composer2, MaterialTheme.$stable).getSurface(), 0L, Dp.m7813constructorimpl(8.0f), 0.0f, null, ComposableLambdaKt.rememberComposableLambda(-1872769053, true, new hx1(this.b, this.c, this.d, this.e, this.g, this.h, this.i, this.j, this.k, this.l, 0), composer2, 54), composer2, 12607494, 104);
                    if (ComposerKt.isTraceInProgress()) {
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
