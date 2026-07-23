package defpackage;

import android.content.Context;
import android.graphics.Bitmap;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.ColumnScope;
import androidx.compose.foundation.layout.RowKt;
import androidx.compose.foundation.layout.RowScopeInstance;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.lazy.LazyItemScope;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.State;
import androidx.compose.runtime.Updater;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.focus.FocusRequester;
import androidx.compose.ui.focus.FocusRequesterModifierKt;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.unit.Dp;
import androidx.lifecycle.ViewModel;

import com.dh.myembyapp.data.model.VideoVersionPrioritySettings;
import com.dh.myembyapp.data.preferences.AggregateSearchHistoryPreferences;
import com.dh.myembyapp.data.preferences.UserPreferences;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.reflect.KFunction;
import kotlin.text.StringsKt;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class h2 implements Function3 {
    public final /* synthetic */ int a = 1;
    public final /* synthetic */ FocusRequester b;
    public final /* synthetic */ State c;
    public final /* synthetic */ MutableState d;
    public final /* synthetic */ MutableState e;
    public final /* synthetic */ MutableState g;
    public final /* synthetic */ MutableState h;
    public final /* synthetic */ MutableState i;
    public final /* synthetic */ MutableState j;
    public final /* synthetic */ Object k;
    public final /* synthetic */ Object l;
    public final /* synthetic */ Object m;
    public final /* synthetic */ ViewModel n;
    public final /* synthetic */ Object o;
    public final /* synthetic */ Object p;
    public final /* synthetic */ State q;
    public final /* synthetic */ Object r;
    public final /* synthetic */ State s;

    public /* synthetic */ h2(List list, FocusRequester focusRequester, FocusRequester focusRequester2, FocusRequester focusRequester3, p7 p7Var, State state, AggregateSearchHistoryPreferences aggregateSearchHistoryPreferences, UserPreferences userPreferences, State state2, Function2 function2, MutableState mutableState, MutableState mutableState2, MutableState mutableState3, MutableState mutableState4, State state3, MutableState mutableState5, MutableState mutableState6) {
        this.k = list;
        this.b = focusRequester;
        this.l = focusRequester2;
        this.m = focusRequester3;
        this.n = p7Var;
        this.c = state;
        this.o = aggregateSearchHistoryPreferences;
        this.p = userPreferences;
        this.q = state2;
        this.r = function2;
        this.d = mutableState;
        this.e = mutableState2;
        this.g = mutableState3;
        this.h = mutableState4;
        this.s = state3;
        this.i = mutableState5;
        this.j = mutableState6;
    }

    /* JADX WARN: Code duplicated, block: B:24:0x00f7  */
    /* JADX WARN: Code duplicated, block: B:31:0x0136  */
    /* JADX WARN: Code duplicated, block: B:36:0x016d  */
    /* JADX WARN: Code duplicated, block: B:43:0x01bf  */
    /* JADX WARN: Code duplicated, block: B:48:0x01ee  */
    /* JADX WARN: Code duplicated, block: B:53:0x020f  */
    /* JADX WARN: Code duplicated, block: B:56:0x0246  */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.jvm.functions.Function3
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        MutableState mutableState;
        MutableState mutableState2;
        MutableState mutableState3;
        MutableState mutableState4;
        Context context;
        Bitmap bitmap;
        boolean zChangedInstance;
        MutableState mutableState5;
        Object c4Var;
        MutableState mutableState6;
        MutableState mutableState7;
        State state;
        boolean zChangedInstance2;
        Object objRememberedValue;
        boolean zChangedInstance3;
        Object objRememberedValue2;
        boolean zChangedInstance4;
        Object objRememberedValue3;
        boolean zChangedInstance5;
        Object objRememberedValue4;
        MutableState mutableState8;
        boolean zChanged;
        Object objRememberedValue5;
        int i = this.a;
        State state2 = this.s;
        Object obj4 = this.r;
        Object obj5 = this.p;
        Object obj6 = this.o;
        ViewModel viewModel = this.n;
        Object obj7 = this.m;
        Object obj8 = this.l;
        Object obj9 = this.k;
        switch (i) {
            case 0:
                Function0 function0 = (Function0) obj9;
                Context context2 = (Context) obj8;
                String str = (String) obj7;
                w2 w2Var = (w2) viewModel;
                MutableState mutableState9 = (MutableState) obj6;
                MutableState mutableState10 = (MutableState) obj5;
                MutableState mutableState11 = (MutableState) this.q;
                MutableState mutableState12 = (MutableState) obj4;
                MutableState mutableState13 = (MutableState) state2;
                Composer composer = (Composer) obj2;
                int iIntValue = ((Integer) obj3).intValue();
                ((LazyItemScope) obj).getClass();
                if (composer.shouldExecute((iIntValue & 17) != 16, iIntValue & 1)) {
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-218402281, iIntValue, -1, "com.dh.myembyapp.ui.screens.addserver.AddServerScreen.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (AddServerScreen.kt:687)");
                    }
                    Modifier.Companion companion = Modifier.INSTANCE;
                    Modifier modifierFillMaxWidth$default = SizeKt.fillMaxWidth$default(companion, 0.0f, 1, null);
                    MeasurePolicy measurePolicyRowMeasurePolicy = RowKt.rowMeasurePolicy(Arrangement.INSTANCE.m712spacedBy0680j_4(Dp.m7813constructorimpl(12.0f)), Alignment.INSTANCE.getTop(), composer, 6);
                    long currentCompositeKeyHashCode = ComposablesKt.getCurrentCompositeKeyHashCode(composer, 0);
                    int i2 = (int) (currentCompositeKeyHashCode ^ (currentCompositeKeyHashCode >>> 32));
                    CompositionLocalMap currentCompositionLocalMap = composer.getCurrentCompositionLocalMap();
                    Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(composer, modifierFillMaxWidth$default);
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
                    mr.z(companion2, composerM4318constructorimpl, measurePolicyRowMeasurePolicy, composerM4318constructorimpl, currentCompositionLocalMap);
                    Updater.m4326setimpl(composerM4318constructorimpl, modifierMaterializeModifier, (Function2<? super T, ? super Modifier, Unit>) id.h(companion2, composerM4318constructorimpl, Integer.valueOf(i2), composerM4318constructorimpl));
                    RowScopeInstance rowScopeInstance = RowScopeInstance.INSTANCE;
                    Modifier modifierM1050height3ABfNKs = SizeKt.m1050height3ABfNKs(zs1.E(rowScopeInstance, companion, 1.0f, false, 2, null), Dp.m7813constructorimpl(56.0f));
                    State state3 = this.c;
                    hc2.b("取消", function0, modifierM1050height3ABfNKs, !(((u2) state3.getValue()) instanceof t2), 0L, 0.0f, 0.0f, composer, 6, Input.Keys.FORWARD_DEL);
                    MutableState mutableState14 = this.d;
                    boolean zIsBlank = StringsKt.isBlank((String) mutableState14.getValue());
                    MutableState mutableState15 = this.e;
                    MutableState mutableState16 = this.g;
                    MutableState mutableState17 = this.h;
                    boolean z = (zIsBlank || StringsKt.isBlank((String) mutableState15.getValue()) || StringsKt.isBlank((String) mutableState16.getValue()) || StringsKt.isBlank((String) mutableState17.getValue())) ? false : true;
                    String str2 = ((u2) state3.getValue()) instanceof t2 ? "验证中..." : "保存";
                    Modifier modifierFocusRequester = FocusRequesterModifierKt.focusRequester(SizeKt.m1050height3ABfNKs(zs1.E(rowScopeInstance, companion, 1.0f, false, 2, null), Dp.m7813constructorimpl(56.0f)), this.b);
                    boolean z2 = !(((u2) state3.getValue()) instanceof t2) && z;
                    boolean zChangedInstance6 = composer.changedInstance(context2) | composer.changed(str) | composer.changedInstance(w2Var);
                    Object objRememberedValue6 = composer.rememberedValue();
                    if (zChangedInstance6 || objRememberedValue6 == Composer.INSTANCE.getEmpty()) {
                        mutableState = mutableState14;
                        mutableState2 = mutableState15;
                        mutableState3 = mutableState16;
                        mutableState4 = mutableState17;
                        objRememberedValue6 = new u1(context2, str, w2Var, mutableState4, mutableState, mutableState2, mutableState3, this.i, this.j, mutableState9, mutableState10, mutableState11, mutableState12, mutableState13);
                        context = context2;
                        composer.updateRememberedValue(objRememberedValue6);
                    } else {
                        mutableState = mutableState14;
                        mutableState2 = mutableState15;
                        mutableState3 = mutableState16;
                        mutableState4 = mutableState17;
                        context = context2;
                    }
                    Function0 function1 = (Function0) objRememberedValue6;
                    boolean zChangedInstance7 = composer.changedInstance(context);
                    Object objRememberedValue7 = composer.rememberedValue();
                    if (zChangedInstance7 || objRememberedValue7 == Composer.INSTANCE.getEmpty()) {
                        objRememberedValue7 = new v1(context, mutableState4, mutableState, mutableState2, mutableState3, 0);
                        composer.updateRememberedValue(objRememberedValue7);
                    }
                    hc2.c(str2, function1, modifierFocusRequester, z2, (Function0) objRememberedValue7, 0L, 0.0f, 0.0f, composer, 0, 224);
                    composer.endNode();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                } else {
                    composer.skipToGroupEnd();
                }
                break;
            default:
                List list = (List) obj9;
                FocusRequester focusRequester = (FocusRequester) obj8;
                FocusRequester focusRequester2 = (FocusRequester) obj7;
                p7 p7Var = (p7) viewModel;
                AggregateSearchHistoryPreferences aggregateSearchHistoryPreferences = (AggregateSearchHistoryPreferences) obj6;
                UserPreferences userPreferences = (UserPreferences) obj5;
                Function2 function2 = (Function2) obj4;
                Composer composer2 = (Composer) obj2;
                int iIntValue2 = ((Integer) obj3).intValue();
                ((ColumnScope) obj).getClass();
                if (composer2.shouldExecute((iIntValue2 & 17) != 16, iIntValue2 & 1)) {
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(436731073, iIntValue2, -1, "com.dh.myembyapp.ui.screens.aggregate.AggregateHubScreen.<anonymous>.<anonymous> (AggregateHubScreen.kt:574)");
                    }
                    State state4 = this.c;
                    h7 h7Var = (h7) state4.getValue();
                    Bitmap bitmap2 = (Bitmap) this.e.getValue();
                    String str3 = (String) this.g.getValue();
                    State state5 = this.q;
                    boolean zBooleanValue = ((Boolean) state5.getValue()).booleanValue();
                    MutableState mutableState18 = this.h;
                    VideoVersionPrioritySettings videoVersionPrioritySettings = (VideoVersionPrioritySettings) mutableState18.getValue();
                    String str4 = (String) state2.getValue();
                    boolean zBooleanValue2 = ((Boolean) this.i.getValue()).booleanValue();
                    boolean zChangedInstance8 = composer2.changedInstance(p7Var);
                    Object objRememberedValue8 = composer2.rememberedValue();
                    if (zChangedInstance8) {
                        bitmap = bitmap2;
                    } else {
                        bitmap = bitmap2;
                        if (objRememberedValue8 == Composer.INSTANCE.getEmpty()) {
                        }
                        Function1 function3 = (Function1) ((KFunction) objRememberedValue8);
                        zChangedInstance = composer2.changedInstance(p7Var) | composer2.changed(state4) | composer2.changedInstance(aggregateSearchHistoryPreferences) | composer2.changedInstance(userPreferences) | composer2.changedInstance(list) | composer2.changed(state5);
                        Object objRememberedValue9 = composer2.rememberedValue();
                        mutableState5 = this.j;
                        if (!zChangedInstance || objRememberedValue9 == Composer.INSTANCE.getEmpty()) {
                            mutableState6 = mutableState5;
                            mutableState7 = mutableState18;
                            c4Var = new c4(p7Var, aggregateSearchHistoryPreferences, userPreferences, list, state4, mutableState6, mutableState7, state5);
                            list = list;
                            state = state5;
                            composer2.updateRememberedValue(c4Var);
                        } else {
                            mutableState6 = mutableState5;
                            mutableState7 = mutableState18;
                            state = state5;
                            c4Var = objRememberedValue9;
                        }
                        Function0 function4 = (Function0) c4Var;
                        zChangedInstance2 = composer2.changedInstance(p7Var) | composer2.changed(function2);
                        objRememberedValue = composer2.rememberedValue();
                        if (zChangedInstance2 || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                            objRememberedValue = new s4(p7Var, function2, 0);
                            composer2.updateRememberedValue(objRememberedValue);
                        }
                        Function3 function5 = (Function3) objRememberedValue;
                        zChangedInstance3 = composer2.changedInstance(p7Var) | composer2.changed(r19) | composer2.changedInstance(aggregateSearchHistoryPreferences) | composer2.changedInstance(userPreferences) | composer2.changedInstance(list) | composer2.changed(state);
                        objRememberedValue2 = composer2.rememberedValue();
                        if (zChangedInstance3 || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                            List list2 = list;
                            objRememberedValue2 = new w4(p7Var, aggregateSearchHistoryPreferences, userPreferences, list2, r19, mutableState6, mutableState7, state, 0);
                            list = list2;
                            composer2.updateRememberedValue(objRememberedValue2);
                        }
                        Function1 function6 = (Function1) objRememberedValue2;
                        List list3 = (List) mutableState6.getValue();
                        zChangedInstance4 = composer2.changedInstance(p7Var) | composer2.changed(r19) | composer2.changedInstance(aggregateSearchHistoryPreferences) | composer2.changedInstance(userPreferences) | composer2.changedInstance(list) | composer2.changed(state);
                        objRememberedValue3 = composer2.rememberedValue();
                        if (zChangedInstance4 || objRememberedValue3 == Composer.INSTANCE.getEmpty()) {
                            List list4 = list;
                            objRememberedValue3 = new w4(p7Var, aggregateSearchHistoryPreferences, userPreferences, list4, state4, mutableState6, mutableState7, state, 1);
                            list = list4;
                            composer2.updateRememberedValue(objRememberedValue3);
                        }
                        Function1 function7 = (Function1) objRememberedValue3;
                        zChangedInstance5 = composer2.changedInstance(aggregateSearchHistoryPreferences);
                        objRememberedValue4 = composer2.rememberedValue();
                        if (zChangedInstance5 || objRememberedValue4 == Composer.INSTANCE.getEmpty()) {
                            objRememberedValue4 = new i5(aggregateSearchHistoryPreferences, mutableState6, 0);
                            composer2.updateRememberedValue(objRememberedValue4);
                        }
                        Function0 function8 = (Function0) objRememberedValue4;
                        mutableState8 = this.d;
                        zChanged = composer2.changed(mutableState8);
                        objRememberedValue5 = composer2.rememberedValue();
                        if (zChanged || objRememberedValue5 == Composer.INSTANCE.getEmpty()) {
                            objRememberedValue5 = new t1(12, mutableState8);
                            composer2.updateRememberedValue(objRememberedValue5);
                        }
                        f7.O(h7Var, list, bitmap, str3, zBooleanValue, videoVersionPrioritySettings, str4, zBooleanValue2, this.b, focusRequester, focusRequester2, function3, function4, function5, function6, list3, function7, function8, (Function1) objRememberedValue5, composer2, 905969664, 6);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                    }
                    objRememberedValue8 = new d6(p7Var, 1);
                    composer2.updateRememberedValue(objRememberedValue8);
                    Function1 function9 = (Function1) ((KFunction) objRememberedValue8);
                    zChangedInstance = composer2.changedInstance(p7Var) | composer2.changed(state4) | composer2.changedInstance(aggregateSearchHistoryPreferences) | composer2.changedInstance(userPreferences) | composer2.changedInstance(list) | composer2.changed(state5);
                    Object objRememberedValue10 = composer2.rememberedValue();
                    mutableState5 = this.j;
                    if (zChangedInstance) {
                        mutableState6 = mutableState5;
                        mutableState7 = mutableState18;
                        c4Var = new c4(p7Var, aggregateSearchHistoryPreferences, userPreferences, list, state4, mutableState6, mutableState7, state5);
                        list = list;
                        state = state5;
                        composer2.updateRememberedValue(c4Var);
                    } else {
                        mutableState6 = mutableState5;
                        mutableState7 = mutableState18;
                        c4Var = new c4(p7Var, aggregateSearchHistoryPreferences, userPreferences, list, state4, mutableState6, mutableState7, state5);
                        list = list;
                        state = state5;
                        composer2.updateRememberedValue(c4Var);
                    }
                    Function0 function10 = (Function0) c4Var;
                    zChangedInstance2 = composer2.changedInstance(p7Var) | composer2.changed(function2);
                    objRememberedValue = composer2.rememberedValue();
                    if (zChangedInstance2) {
                        objRememberedValue = new s4(p7Var, function2, 0);
                        composer2.updateRememberedValue(objRememberedValue);
                    } else {
                        objRememberedValue = new s4(p7Var, function2, 0);
                        composer2.updateRememberedValue(objRememberedValue);
                    }
                    Function3 function11 = (Function3) objRememberedValue;
                    zChangedInstance3 = composer2.changedInstance(p7Var) | composer2.changed(r19) | composer2.changedInstance(aggregateSearchHistoryPreferences) | composer2.changedInstance(userPreferences) | composer2.changedInstance(list) | composer2.changed(state);
                    objRememberedValue2 = composer2.rememberedValue();
                    if (zChangedInstance3) {
                        List list5 = list;
                        objRememberedValue2 = new w4(p7Var, aggregateSearchHistoryPreferences, userPreferences, list5, r19, mutableState6, mutableState7, state, 0);
                        list = list5;
                        composer2.updateRememberedValue(objRememberedValue2);
                    } else {
                        List list6 = list;
                        objRememberedValue2 = new w4(p7Var, aggregateSearchHistoryPreferences, userPreferences, list6, r19, mutableState6, mutableState7, state, 0);
                        list = list6;
                        composer2.updateRememberedValue(objRememberedValue2);
                    }
                    Function1 function12 = (Function1) objRememberedValue2;
                    List list7 = (List) mutableState6.getValue();
                    zChangedInstance4 = composer2.changedInstance(p7Var) | composer2.changed(r19) | composer2.changedInstance(aggregateSearchHistoryPreferences) | composer2.changedInstance(userPreferences) | composer2.changedInstance(list) | composer2.changed(state);
                    objRememberedValue3 = composer2.rememberedValue();
                    if (zChangedInstance4) {
                        List list8 = list;
                        objRememberedValue3 = new w4(p7Var, aggregateSearchHistoryPreferences, userPreferences, list8, state4, mutableState6, mutableState7, state, 1);
                        list = list8;
                        composer2.updateRememberedValue(objRememberedValue3);
                    } else {
                        List list9 = list;
                        objRememberedValue3 = new w4(p7Var, aggregateSearchHistoryPreferences, userPreferences, list9, state4, mutableState6, mutableState7, state, 1);
                        list = list9;
                        composer2.updateRememberedValue(objRememberedValue3);
                    }
                    Function1 function13 = (Function1) objRememberedValue3;
                    zChangedInstance5 = composer2.changedInstance(aggregateSearchHistoryPreferences);
                    objRememberedValue4 = composer2.rememberedValue();
                    if (zChangedInstance5) {
                        objRememberedValue4 = new i5(aggregateSearchHistoryPreferences, mutableState6, 0);
                        composer2.updateRememberedValue(objRememberedValue4);
                    } else {
                        objRememberedValue4 = new i5(aggregateSearchHistoryPreferences, mutableState6, 0);
                        composer2.updateRememberedValue(objRememberedValue4);
                    }
                    Function0 function14 = (Function0) objRememberedValue4;
                    mutableState8 = this.d;
                    zChanged = composer2.changed(mutableState8);
                    objRememberedValue5 = composer2.rememberedValue();
                    if (zChanged) {
                        objRememberedValue5 = new t1(12, mutableState8);
                        composer2.updateRememberedValue(objRememberedValue5);
                    } else {
                        objRememberedValue5 = new t1(12, mutableState8);
                        composer2.updateRememberedValue(objRememberedValue5);
                    }
                    f7.O(h7Var, list, bitmap, str3, zBooleanValue, videoVersionPrioritySettings, str4, zBooleanValue2, this.b, focusRequester, focusRequester2, function9, function10, function11, function12, list7, function13, function14, (Function1) objRememberedValue5, composer2, 905969664, 6);
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

    public /* synthetic */ h2(Function0 function0, FocusRequester focusRequester, Context context, String str, w2 w2Var, State state, MutableState mutableState, MutableState mutableState2, MutableState mutableState3, MutableState mutableState4, MutableState mutableState5, MutableState mutableState6, MutableState mutableState7, MutableState mutableState8, MutableState mutableState9, MutableState mutableState10, MutableState mutableState11) {
        this.k = function0;
        this.b = focusRequester;
        this.l = context;
        this.m = str;
        this.n = w2Var;
        this.c = state;
        this.d = mutableState;
        this.e = mutableState2;
        this.g = mutableState3;
        this.h = mutableState4;
        this.i = mutableState5;
        this.j = mutableState6;
        this.o = mutableState7;
        this.p = mutableState8;
        this.q = mutableState9;
        this.r = mutableState10;
        this.s = mutableState11;
    }
}
