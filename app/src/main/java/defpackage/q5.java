package defpackage;

import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnScope;
import androidx.compose.foundation.layout.ColumnScopeInstance;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.lazy.LazyDslKt;
import androidx.compose.foundation.lazy.LazyItemScope;
import androidx.compose.foundation.lazy.LazyListState;
import androidx.compose.material3.MaterialTheme;
import androidx.compose.material3.TextKt;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.State;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.snapshots.SnapshotStateMap;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.focus.FocusRequester;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.unit.Dp;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class q5 implements Function3 {
    public final /* synthetic */ int a = 0;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ MutableState d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object g;
    public final /* synthetic */ Object h;
    public final /* synthetic */ Object i;
    public final /* synthetic */ Object j;
    public final /* synthetic */ Object k;

    public /* synthetic */ q5(u61 u61Var, LazyListState lazyListState, MutableState mutableState, String str, SnapshotStateMap snapshotStateMap, SnapshotStateMap snapshotStateMap2, Function1 function1, MutableState mutableState2, MutableState mutableState3) {
        this.b = u61Var;
        this.e = lazyListState;
        this.d = mutableState;
        this.h = str;
        this.c = snapshotStateMap;
        this.i = snapshotStateMap2;
        this.j = function1;
        this.g = mutableState2;
        this.k = mutableState3;
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
    @Override // kotlin.jvm.functions.Function3
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        int i = this.a;
        Object obj4 = this.k;
        Object obj5 = this.g;
        Object obj6 = this.j;
        Object obj7 = this.i;
        Object obj8 = this.c;
        Object obj9 = this.h;
        Object obj10 = this.e;
        Object obj11 = this.b;
        Object[] objArr = 0;
        switch (i) {
            case 0:
                boolean z = true;
                FocusRequester focusRequester = (FocusRequester) obj11;
                FocusRequester focusRequester2 = (FocusRequester) obj10;
                Object obj12 = (p7) obj9;
                Object obj13 = (Function3) obj8;
                Object obj14 = (Function2) obj7;
                State state = (State) obj6;
                State state2 = (State) obj4;
                MutableState mutableState = (MutableState) obj5;
                Composer composer = (Composer) obj2;
                int iIntValue = ((Integer) obj3).intValue();
                ((ColumnScope) obj).getClass();
                if ((iIntValue & 17) == 16) {
                    z = false;
                }
                if (composer.shouldExecute(z, iIntValue & 1)) {
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-1415189255, iIntValue, -1, "com.dh.myembyapp.ui.screens.aggregate.AggregateHubScreen.<anonymous>.<anonymous> (AggregateHubScreen.kt:648)");
                    }
                    List list = ((i7) state.getValue()).c;
                    String str = (String) state2.getValue();
                    boolean zBooleanValue = ((Boolean) mutableState.getValue()).booleanValue();
                    MutableState mutableState2 = this.d;
                    boolean zChanged = composer.changed(mutableState2);
                    Object objRememberedValue = composer.rememberedValue();
                    if (zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                        objRememberedValue = new t1(19, mutableState2);
                        composer.updateRememberedValue(objRememberedValue);
                    }
                    Function1 function1 = (Function1) objRememberedValue;
                    boolean zChangedInstance = composer.changedInstance(obj12) | composer.changed(obj13) | composer.changed(obj14);
                    Object objRememberedValue2 = composer.rememberedValue();
                    if (zChangedInstance || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                        objRememberedValue2 = new r5(obj12, obj14, obj13, objArr == true ? 1 : 0);
                        composer.updateRememberedValue(objRememberedValue2);
                    }
                    f7.M(list, str, zBooleanValue, focusRequester, focusRequester2, function1, (Function2) objRememberedValue2, composer, 27648);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                } else {
                    composer.skipToGroupEnd();
                }
                break;
            case 1:
                FocusRequester focusRequester3 = (FocusRequester) obj11;
                Function3 function3 = (Function3) obj8;
                String str2 = (String) obj5;
                String str3 = (String) obj9;
                List list2 = (List) obj7;
                CoroutineScope coroutineScope = (CoroutineScope) obj6;
                LazyListState lazyListState = (LazyListState) obj4;
                FocusRequester focusRequester4 = (FocusRequester) obj10;
                Composer composer2 = (Composer) obj2;
                int iIntValue2 = ((Integer) obj3).intValue();
                ((LazyItemScope) obj).getClass();
                if (composer2.shouldExecute((iIntValue2 & 17) != 16, iIntValue2 & 1)) {
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(766497926, iIntValue2, -1, "com.dh.myembyapp.ui.screens.home.MediaItemSection.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (HomeScreen.kt:2608)");
                    }
                    boolean zChanged2 = composer2.changed(function3) | composer2.changed(str2) | composer2.changed(str3) | composer2.changedInstance(list2);
                    Object objRememberedValue3 = composer2.rememberedValue();
                    if (zChanged2 || objRememberedValue3 == Composer.INSTANCE.getEmpty()) {
                        gh ghVar = new gh(7, function3, str2, str3, list2);
                        composer2.updateRememberedValue(ghVar);
                        objRememberedValue3 = ghVar;
                    }
                    Function0 function0 = (Function0) objRememberedValue3;
                    boolean zChangedInstance2 = composer2.changedInstance(coroutineScope) | composer2.changed(lazyListState);
                    Object objRememberedValue4 = composer2.rememberedValue();
                    if (zChangedInstance2 || objRememberedValue4 == Composer.INSTANCE.getEmpty()) {
                        xi0 xi0Var = new xi0(coroutineScope, this.d, lazyListState, focusRequester4, 1);
                        composer2.updateRememberedValue(xi0Var);
                        objRememberedValue4 = xi0Var;
                    }
                    bq0.O(null, focusRequester3, function0, (Function0) objRememberedValue4, composer2, 48);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                } else {
                    composer2.skipToGroupEnd();
                }
                break;
            default:
                u61 u61Var = (u61) obj11;
                LazyListState lazyListState2 = (LazyListState) obj10;
                String str4 = (String) obj9;
                SnapshotStateMap snapshotStateMap = (SnapshotStateMap) obj8;
                SnapshotStateMap snapshotStateMap2 = (SnapshotStateMap) obj7;
                Function1 function2 = (Function1) obj6;
                MutableState mutableState3 = (MutableState) obj5;
                MutableState mutableState4 = (MutableState) obj4;
                Composer composer3 = (Composer) obj2;
                int iIntValue3 = ((Integer) obj3).intValue();
                ((ColumnScope) obj).getClass();
                if (composer3.shouldExecute((iIntValue3 & 17) != 16, iIntValue3 & 1)) {
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(427228503, iIntValue3, -1, "com.dh.myembyapp.ui.components.ServerSortDialog.<anonymous>.<anonymous>.<anonymous> (ServerSortDialog.kt:173)");
                    }
                    Modifier.Companion companion = Modifier.INSTANCE;
                    Modifier modifierM1000paddingVpY3zN4 = PaddingKt.m1000paddingVpY3zN4(SizeKt.fillMaxWidth$default(companion, 0.0f, 1, null), Dp.m7813constructorimpl(18.0f), Dp.m7813constructorimpl(16.0f));
                    Arrangement arrangement = Arrangement.INSTANCE;
                    MeasurePolicy measurePolicyColumnMeasurePolicy = ColumnKt.columnMeasurePolicy(arrangement.m712spacedBy0680j_4(Dp.m7813constructorimpl(12.0f)), Alignment.INSTANCE.getStart(), composer3, 6);
                    long currentCompositeKeyHashCode = ComposablesKt.getCurrentCompositeKeyHashCode(composer3, 0);
                    int i2 = (int) (currentCompositeKeyHashCode ^ (currentCompositeKeyHashCode >>> 32));
                    CompositionLocalMap currentCompositionLocalMap = composer3.getCurrentCompositionLocalMap();
                    Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(composer3, modifierM1000paddingVpY3zN4);
                    ComposeUiNode.Companion companion2 = ComposeUiNode.INSTANCE;
                    Function0<ComposeUiNode> constructor = companion2.getConstructor();
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
                    mr.z(companion2, composerM4318constructorimpl, measurePolicyColumnMeasurePolicy, composerM4318constructorimpl, currentCompositionLocalMap);
                    Updater.m4326setimpl(composerM4318constructorimpl, modifierMaterializeModifier, (Function2<? super T, ? super Modifier, Unit>) id.h(companion2, composerM4318constructorimpl, Integer.valueOf(i2), composerM4318constructorimpl));
                    ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.INSTANCE;
                    MaterialTheme materialTheme = MaterialTheme.INSTANCE;
                    int i3 = MaterialTheme.$stable;
                    TextKt.m3048TextNvy7gAk("服务器排序", null, materialTheme.getColorScheme(composer3, i3).getPrimary(), null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, materialTheme.getTypography(composer3, i3).getTitleMedium(), composer3, 6, 0, 131066);
                    TextKt.m3048TextNvy7gAk("调整服务器卡片和首页切换服务器弹窗中的显示顺序。", null, u61Var.B, null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, materialTheme.getTypography(composer3, i3).getBodySmall(), composer3, 6, 0, 131066);
                    Modifier modifierM1051heightInVpY3zN4 = SizeKt.m1051heightInVpY3zN4(SizeKt.fillMaxWidth$default(companion, 0.0f, 1, null), Dp.m7813constructorimpl(180.0f), Dp.m7813constructorimpl(500.0f));
                    Arrangement.HorizontalOrVertical horizontalOrVerticalM712spacedBy0680j_4 = arrangement.m712spacedBy0680j_4(Dp.m7813constructorimpl(10.0f));
                    PaddingValues paddingValuesM994PaddingValuesYgX7TsA$default = PaddingKt.m994PaddingValuesYgX7TsA$default(0.0f, Dp.m7813constructorimpl(6.0f), 1, null);
                    MutableState mutableState5 = this.d;
                    boolean zChanged3 = composer3.changed(mutableState5) | composer3.changed(str4) | composer3.changed(snapshotStateMap) | composer3.changed(snapshotStateMap2) | composer3.changed(function2);
                    Object objRememberedValue5 = composer3.rememberedValue();
                    if (zChanged3 || objRememberedValue5 == Composer.INSTANCE.getEmpty()) {
                        objRememberedValue5 = new cy(mutableState5, mutableState3, mutableState4, snapshotStateMap, snapshotStateMap2, str4, function2);
                        composer3.updateRememberedValue(objRememberedValue5);
                    }
                    LazyDslKt.LazyColumn(modifierM1051heightInVpY3zN4, lazyListState2, paddingValuesM994PaddingValuesYgX7TsA$default, false, horizontalOrVerticalM712spacedBy0680j_4, null, null, false, null, (Function1) objRememberedValue5, composer3, 24966, 488);
                    composer3.endNode();
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

    public /* synthetic */ q5(FocusRequester focusRequester, FocusRequester focusRequester2, MutableState mutableState, p7 p7Var, Function3 function3, Function2 function2, State state, State state2, MutableState mutableState2) {
        this.b = focusRequester;
        this.e = focusRequester2;
        this.d = mutableState;
        this.h = p7Var;
        this.c = function3;
        this.i = function2;
        this.j = state;
        this.k = state2;
        this.g = mutableState2;
    }

    public /* synthetic */ q5(FocusRequester focusRequester, Function3 function3, String str, String str2, List list, CoroutineScope coroutineScope, LazyListState lazyListState, MutableState mutableState, FocusRequester focusRequester2) {
        this.b = focusRequester;
        this.c = function3;
        this.g = str;
        this.h = str2;
        this.i = list;
        this.j = coroutineScope;
        this.k = lazyListState;
        this.d = mutableState;
        this.e = focusRequester2;
    }
}
