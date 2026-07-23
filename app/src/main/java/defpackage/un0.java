package defpackage;

import android.content.Context;
import android.widget.Toast;
import androidx.compose.foundation.lazy.LazyItemScope;
import androidx.compose.foundation.lazy.LazyListScope;
import androidx.compose.foundation.lazy.d;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.runtime.snapshots.SnapshotStateMap;
import androidx.compose.ui.focus.FocusRequester;

import com.dh.myembyapp.data.model.Library;
import com.dh.myembyapp.data.model.ServerConfig;
import com.dh.myembyapp.data.preferences.ServerPreferences;
import java.util.Arrays;
import java.util.List;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function4;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class un0 implements Function1 {
    public final /* synthetic */ int a = 1;
    public final /* synthetic */ MutableState b;
    public final /* synthetic */ Function1 c;
    public final /* synthetic */ MutableState d;
    public final /* synthetic */ MutableState e;
    public final /* synthetic */ MutableState g;
    public final /* synthetic */ Object h;
    public final /* synthetic */ Object i;
    public final /* synthetic */ Object j;
    public final /* synthetic */ Object k;
    public final /* synthetic */ Object l;

    public /* synthetic */ un0(re reVar, CoroutineScope coroutineScope, Context context, String str, ne neVar, MutableState mutableState, MutableState mutableState2, MutableState mutableState3, jj1 jj1Var, MutableState mutableState4) {
        this.h = reVar;
        this.i = coroutineScope;
        this.k = context;
        this.j = str;
        this.l = neVar;
        this.b = mutableState;
        this.d = mutableState2;
        this.e = mutableState3;
        this.c = jj1Var;
        this.g = mutableState4;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i = this.a;
        Object obj2 = this.l;
        Object obj3 = this.j;
        Object obj4 = this.k;
        Object obj5 = this.i;
        Object obj6 = this.h;
        switch (i) {
            case 0:
                Function0 function0 = (Function0) obj6;
                Function0 function1 = (Function0) obj5;
                ServerPreferences serverPreferences = (ServerPreferences) obj3;
                Context context = (Context) obj4;
                zq0 zq0Var = (zq0) obj2;
                tn0 tn0Var = (tn0) obj;
                tn0Var.getClass();
                String str = tn0Var.a;
                boolean zAreEqual = Intrinsics.areEqual(str, "__server_list__");
                MutableState mutableState = this.b;
                if (zAreEqual) {
                    mutableState.setValue(Boolean.FALSE);
                    function0.invoke();
                } else if (Intrinsics.areEqual(str, "aggregate_search")) {
                    mutableState.setValue(Boolean.FALSE);
                    function1.invoke();
                } else if (str != null) {
                    ServerConfig serverById = serverPreferences.getServerById(str);
                    if (serverById == null) {
                        mutableState.setValue(Boolean.FALSE);
                        Toast.makeText(context, "服务器不存在", 0).show();
                    } else {
                        String id = serverById.getId();
                        MutableState mutableState2 = this.d;
                        if (Intrinsics.areEqual(id, ((cq0) mutableState2.getValue()).a)) {
                            mutableState.setValue(Boolean.FALSE);
                        } else if (!serverById.isLoggedIn()) {
                            mutableState.setValue(Boolean.FALSE);
                            Toast.makeText(context, "该服务器需要重新登录，已返回服务器列表", 0).show();
                            function0.invoke();
                        } else if (bq0.g(serverPreferences, context, zq0Var, this.c, mutableState2, this.e, this.g, serverById, true)) {
                            mutableState.setValue(Boolean.FALSE);
                            Toast.makeText(context, "已切换到" + serverById.getAlias(), 0).show();
                        } else {
                            mutableState.setValue(Boolean.FALSE);
                            Toast.makeText(context, "该服务器缺少登录信息，已返回服务器列表", 0).show();
                            function0.invoke();
                        }
                    }
                }
                break;
            case 1:
                final SnapshotStateMap snapshotStateMap = (SnapshotStateMap) obj6;
                final SnapshotStateMap snapshotStateMap2 = (SnapshotStateMap) obj5;
                final CoroutineScope coroutineScope = (CoroutineScope) obj3;
                final Function2 function2 = (Function2) obj4;
                final MutableState mutableState3 = (MutableState) obj2;
                LazyListScope lazyListScope = (LazyListScope) obj;
                lazyListScope.getClass();
                final MutableState mutableState4 = this.b;
                int size = ((List) mutableState4.getValue()).size();
                h70 h70Var = new h70(28, mutableState4);
                final MutableState mutableState5 = this.d;
                final MutableState mutableState6 = this.e;
                final MutableState mutableState7 = this.g;
                final Function1 function3 = this.c;
                d.b(lazyListScope, size, h70Var, null, ComposableLambdaKt.composableLambdaInstance(-1735531984, true, new Function4() { // from class: ly0
                    @Override // kotlin.jvm.functions.Function4
                    public final Object invoke(Object obj7, Object obj8, Object obj9, Object obj10) {
                        Object obj11;
                        final MutableState mutableState8;
                        final MutableState mutableState9;
                        final MutableState mutableState10;
                        CoroutineScope coroutineScope2;
                        Function2 function4;
                        Function1 function5;
                        int iIntValue = ((Integer) obj8).intValue();
                        Composer composer = (Composer) obj9;
                        int iIntValue2 = ((Integer) obj10).intValue();
                        ((LazyItemScope) obj7).getClass();
                        if ((iIntValue2 & 48) == 0) {
                            iIntValue2 |= composer.changed(iIntValue) ? 32 : 16;
                        }
                        final int i2 = 0;
                        final int i3 = 1;
                        if (composer.shouldExecute((iIntValue2 & Input.Keys.NUMPAD_1) != 144, iIntValue2 & 1)) {
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(-1735531984, iIntValue2, -1, "com.dh.myembyapp.ui.components.LibrarySortDialog.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (LibrarySortDialog.kt:282)");
                            }
                            final MutableState mutableState11 = mutableState4;
                            final Library library = (Library) ((List) mutableState11.getValue()).get(iIntValue);
                            String str2 = String.format("%02d", Arrays.copyOf(new Object[]{Integer.valueOf(iIntValue + 1)}, 1));
                            boolean z = iIntValue > 0;
                            boolean z2 = iIntValue < CollectionsKt.getLastIndex((List) mutableState11.getValue());
                            FocusRequester focusRequester = (FocusRequester) MapsKt.getValue(snapshotStateMap, library.getId());
                            FocusRequester focusRequester2 = (FocusRequester) MapsKt.getValue(snapshotStateMap2, library.getId());
                            boolean zChanged = composer.changed(library);
                            Object objRememberedValue = composer.rememberedValue();
                            final MutableState mutableState12 = mutableState5;
                            if (zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                                objRememberedValue = new Function1() { // from class: my0
                                    /* JADX WARN: Multi-variable type inference failed */
                                    @Override // kotlin.jvm.functions.Function1
                                    public final Object invoke(Object obj12) {
                                        int i4 = i2;
                                        MutableState mutableState13 = mutableState12;
                                        Library library2 = library;
                                        boolean zBooleanValue = ((Boolean) obj12).booleanValue();
                                        switch (i4) {
                                            case 0:
                                                ty0 ty0Var = new ty0(library2.getId(), hy0.a);
                                                if (zBooleanValue) {
                                                    mutableState13.setValue(ty0Var);
                                                } else if (Intrinsics.areEqual((ty0) mutableState13.getValue(), ty0Var)) {
                                                    mutableState13.setValue(null);
                                                }
                                                break;
                                            default:
                                                ty0 ty0Var2 = new ty0(library2.getId(), hy0.b);
                                                if (zBooleanValue) {
                                                    mutableState13.setValue(ty0Var2);
                                                } else if (Intrinsics.areEqual((ty0) mutableState13.getValue(), ty0Var2)) {
                                                    mutableState13.setValue(null);
                                                }
                                                break;
                                        }
                                        return Unit.INSTANCE;
                                    }
                                };
                                composer.updateRememberedValue(objRememberedValue);
                            }
                            Function1 function6 = (Function1) objRememberedValue;
                            boolean zChanged2 = composer.changed(library);
                            Object objRememberedValue2 = composer.rememberedValue();
                            if (zChanged2 || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                                objRememberedValue2 = new Function1() { // from class: my0
                                    /* JADX WARN: Multi-variable type inference failed */
                                    @Override // kotlin.jvm.functions.Function1
                                    public final Object invoke(Object obj12) {
                                        int i4 = i3;
                                        MutableState mutableState13 = mutableState12;
                                        Library library2 = library;
                                        boolean zBooleanValue = ((Boolean) obj12).booleanValue();
                                        switch (i4) {
                                            case 0:
                                                ty0 ty0Var = new ty0(library2.getId(), hy0.a);
                                                if (zBooleanValue) {
                                                    mutableState13.setValue(ty0Var);
                                                } else if (Intrinsics.areEqual((ty0) mutableState13.getValue(), ty0Var)) {
                                                    mutableState13.setValue(null);
                                                }
                                                break;
                                            default:
                                                ty0 ty0Var2 = new ty0(library2.getId(), hy0.b);
                                                if (zBooleanValue) {
                                                    mutableState13.setValue(ty0Var2);
                                                } else if (Intrinsics.areEqual((ty0) mutableState13.getValue(), ty0Var2)) {
                                                    mutableState13.setValue(null);
                                                }
                                                break;
                                        }
                                        return Unit.INSTANCE;
                                    }
                                };
                                composer.updateRememberedValue(objRememberedValue2);
                            }
                            Function1 function7 = (Function1) objRememberedValue2;
                            boolean zChanged3 = composer.changed(mutableState11);
                            final CoroutineScope coroutineScope3 = coroutineScope;
                            boolean zChangedInstance = zChanged3 | composer.changedInstance(coroutineScope3);
                            final Function2 function8 = function2;
                            boolean zChangedInstance2 = zChangedInstance | composer.changedInstance(function8);
                            final Function1 function9 = function3;
                            boolean zChanged4 = zChangedInstance2 | composer.changed(function9) | composer.changed(library);
                            Object objRememberedValue3 = composer.rememberedValue();
                            boolean z3 = z2;
                            final MutableState mutableState13 = mutableState6;
                            MutableState mutableState14 = mutableState7;
                            MutableState mutableState15 = mutableState3;
                            if (zChanged4 || objRememberedValue3 == Composer.INSTANCE.getEmpty()) {
                                final int i4 = 0;
                                mutableState8 = mutableState15;
                                mutableState9 = mutableState14;
                                mutableState10 = mutableState12;
                                obj11 = new Function0() { // from class: ny0
                                    @Override // kotlin.jvm.functions.Function0
                                    public final Object invoke() {
                                        int i5 = i4;
                                        Library library2 = library;
                                        switch (i5) {
                                            case 0:
                                                sy0.c(mutableState13, mutableState11, mutableState10, mutableState9, coroutineScope3, mutableState8, function8, function9, library2.getId(), -1, hy0.a);
                                                break;
                                            default:
                                                sy0.c(mutableState13, mutableState11, mutableState10, mutableState9, coroutineScope3, mutableState8, function8, function9, library2.getId(), 1, hy0.b);
                                                break;
                                        }
                                        return Unit.INSTANCE;
                                    }
                                };
                                coroutineScope2 = coroutineScope3;
                                function4 = function8;
                                function5 = function9;
                                composer.updateRememberedValue(obj11);
                            } else {
                                mutableState8 = mutableState15;
                                mutableState9 = mutableState14;
                                mutableState10 = mutableState12;
                                function4 = function8;
                                function5 = function9;
                                obj11 = objRememberedValue3;
                                coroutineScope2 = coroutineScope3;
                            }
                            Function0 function10 = (Function0) obj11;
                            boolean zChanged5 = composer.changed(r17) | composer.changedInstance(coroutineScope2) | composer.changedInstance(function4) | composer.changed(function5) | composer.changed(library);
                            Object objRememberedValue4 = composer.rememberedValue();
                            if (zChanged5 || objRememberedValue4 == Composer.INSTANCE.getEmpty()) {
                                final int i5 = 1;
                                final CoroutineScope coroutineScope4 = coroutineScope2;
                                final Function2 function11 = function4;
                                final Function1 function12 = function5;
                                Function0 function13 = new Function0() { // from class: ny0
                                    @Override // kotlin.jvm.functions.Function0
                                    public final Object invoke() {
                                        int i6 = i5;
                                        Library library2 = library;
                                        switch (i6) {
                                            case 0:
                                                sy0.c(mutableState13, mutableState11, mutableState10, mutableState9, coroutineScope4, mutableState8, function11, function12, library2.getId(), -1, hy0.a);
                                                break;
                                            default:
                                                sy0.c(mutableState13, mutableState11, mutableState10, mutableState9, coroutineScope4, mutableState8, function11, function12, library2.getId(), 1, hy0.b);
                                                break;
                                        }
                                        return Unit.INSTANCE;
                                    }
                                };
                                composer.updateRememberedValue(function13);
                                objRememberedValue4 = function13;
                            }
                            sy0.d(str2, library, z, z3, focusRequester, focusRequester2, function6, function7, function10, (Function0) objRememberedValue4, composer, 0);
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                        } else {
                            composer.skipToGroupEnd();
                        }
                        return Unit.INSTANCE;
                    }
                }), 4, null);
                break;
            default:
                jj1 jj1Var = (jj1) this.c;
                se seVar = (se) obj;
                seVar.getClass();
                BuildersKt__Builders_commonKt.launch$default((CoroutineScope) obj5, null, null, new wd(((re) obj6).a, seVar, (Context) obj4, (String) obj3, (ne) obj2, this.b, this.d, this.e, jj1Var, this.g, (Continuation) null), 3, null);
                break;
        }
        return Unit.INSTANCE;
    }

    public /* synthetic */ un0(MutableState mutableState, MutableState mutableState2, MutableState mutableState3, MutableState mutableState4, MutableState mutableState5, SnapshotStateMap snapshotStateMap, SnapshotStateMap snapshotStateMap2, Function1 function1, Function2 function2, CoroutineScope coroutineScope) {
        this.b = mutableState;
        this.h = snapshotStateMap;
        this.i = snapshotStateMap2;
        this.j = coroutineScope;
        this.k = function2;
        this.c = function1;
        this.d = mutableState2;
        this.e = mutableState3;
        this.g = mutableState4;
        this.l = mutableState5;
    }

    public /* synthetic */ un0(Function0 function0, Function0 function1, MutableState mutableState, ServerPreferences serverPreferences, Context context, MutableState mutableState2, zq0 zq0Var, Function1 function2, MutableState mutableState3, MutableState mutableState4) {
        this.h = function0;
        this.i = function1;
        this.b = mutableState;
        this.j = serverPreferences;
        this.k = context;
        this.d = mutableState2;
        this.l = zq0Var;
        this.c = function2;
        this.e = mutableState3;
        this.g = mutableState4;
    }
}
