package defpackage;

import android.view.View;
import androidx.collection.MutableObjectFloatMap;
import androidx.compose.animation.AnimatedContentTransitionScope;
import androidx.compose.foundation.lazy.LazyListScope;
import androidx.compose.foundation.lazy.LazyListState;
import androidx.compose.foundation.lazy.d;
import androidx.compose.runtime.DisposableEffectScope;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.State;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.runtime.snapshots.SnapshotStateMap;
import androidx.compose.ui.focus.FocusManager;
import androidx.compose.ui.focus.FocusRequester;
import androidx.compose.ui.platform.SoftwareKeyboardController;
import androidx.compose.ui.text.TextRange;
import androidx.compose.ui.text.TextRangeKt;
import androidx.compose.ui.text.input.TextFieldValue;
import androidx.core.view.OnApplyWindowInsetsListener;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import java.util.List;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class cy implements Function1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object g;
    public final /* synthetic */ Object h;
    public final /* synthetic */ Object i;

    public /* synthetic */ cy(View view, SoftwareKeyboardController softwareKeyboardController, FocusManager focusManager, CoroutineScope coroutineScope, MutableState mutableState, MutableState mutableState2, FocusRequester focusRequester) {
        this.a = 4;
        this.e = view;
        this.g = softwareKeyboardController;
        this.h = focusManager;
        this.b = coroutineScope;
        this.c = mutableState;
        this.d = mutableState2;
        this.i = focusRequester;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i = this.a;
        Object obj2 = this.i;
        Object obj3 = this.h;
        Object obj4 = this.g;
        Object obj5 = this.e;
        Object obj6 = this.d;
        Object obj7 = this.c;
        Object obj8 = this.b;
        switch (i) {
            case 0:
                String str = (String) obj;
                ((MutableState) obj7).setValue(str);
                ((MutableState) obj6).setValue(new TextFieldValue(str, TextRangeKt.TextRange(str.length()), (TextRange) null, 4, (DefaultConstructorMarker) null));
                BuildersKt__Builders_commonKt.launch$default((CoroutineScope) obj8, null, null, new r3(str, (MutableState) obj5, (MutableState) obj4, (MutableState) obj3, (MutableState) obj2, (Continuation) null), 3, null);
                return Unit.INSTANCE;
            case 1:
                List list = (List) obj8;
                Function0 function0 = (Function0) obj2;
                LazyListScope lazyListScope = (LazyListScope) obj;
                lazyListScope.getClass();
                lazyListScope.items(list.size(), new w5(17, new xw(5), list), new x5(list, 17), ComposableLambdaKt.composableLambdaInstance(2039820996, true, new p90(list, (String) obj7, (FocusRequester) obj6, list, (Function2) obj5, (Function1) obj4, (Function0) obj3, function0)));
                return Unit.INSTANCE;
            case 2:
                List list2 = (List) obj6;
                LazyListScope lazyListScope2 = (LazyListScope) obj;
                lazyListScope2.getClass();
                d.b(lazyListScope2, list2.size(), new jg(list2, 4), null, ComposableLambdaKt.composableLambdaInstance(1535522025, true, new no0(list2, (String) obj5, (CoroutineScope) obj8, (LazyListState) obj4, (FocusRequester) obj3, (Function2) obj2, (MutableState) obj7)), 4, null);
                return Unit.INSTANCE;
            case 3:
                return NavHostKt.NavHost$lambda$75$lambda$74((MutableObjectFloatMap) obj8, (ComposeNavigator) obj6, (Function1) obj5, (Function1) obj4, (Function1) obj3, (State) obj2, (MutableState) obj7, (AnimatedContentTransitionScope) obj);
            case 4:
                View view = (View) obj5;
                final SoftwareKeyboardController softwareKeyboardController = (SoftwareKeyboardController) obj4;
                final FocusManager focusManager = (FocusManager) obj3;
                final CoroutineScope coroutineScope = (CoroutineScope) obj8;
                final MutableState mutableState = (MutableState) obj7;
                final MutableState mutableState2 = (MutableState) obj6;
                final FocusRequester focusRequester = (FocusRequester) obj2;
                ((DisposableEffectScope) obj).getClass();
                if (view == null) {
                    return new pa1();
                }
                ViewCompat.setOnApplyWindowInsetsListener(view, new OnApplyWindowInsetsListener() { // from class: la1
                    /* JADX WARN: Multi-variable type inference failed */
                    @Override // androidx.core.view.OnApplyWindowInsetsListener
                    public final WindowInsetsCompat onApplyWindowInsets(View view2, WindowInsetsCompat windowInsetsCompat) {
                        view2.getClass();
                        windowInsetsCompat.getClass();
                        boolean zIsVisible = windowInsetsCompat.isVisible(WindowInsetsCompat.Type.ime());
                        MutableState mutableState3 = mutableState;
                        if (((Boolean) mutableState3.getValue()).booleanValue() && !zIsVisible) {
                            MutableState mutableState4 = mutableState2;
                            if (((Boolean) mutableState4.getValue()).booleanValue()) {
                                SoftwareKeyboardController softwareKeyboardController2 = softwareKeyboardController;
                                if (softwareKeyboardController2 != null) {
                                    softwareKeyboardController2.hide();
                                }
                                focusManager.clearFocus(true);
                                mutableState4.setValue(Boolean.FALSE);
                                BuildersKt__Builders_commonKt.launch$default(coroutineScope, null, null, new ji(focusRequester, null, 13), 3, null);
                            }
                        }
                        mutableState3.setValue(Boolean.valueOf(zIsVisible));
                        return windowInsetsCompat;
                    }
                });
                return new o2(view, 9);
            case 5:
                n32 n32Var = (n32) obj;
                n32Var.getClass();
                ((MutableState) obj7).setValue(Integer.valueOf(n32Var.a));
                ((MutableState) obj6).setValue(n32Var.b);
                ((MutableState) obj5).setValue(n32Var.c);
                ((MutableState) obj4).setValue(Integer.valueOf(n32Var.d));
                ((MutableState) obj3).setValue(Integer.valueOf(n32Var.e));
                ((MutableState) obj2).setValue(Float.valueOf(n32Var.f));
                ((MutableState) obj8).setValue(n32Var.g);
                return Unit.INSTANCE;
            case 6:
                MutableState mutableState3 = (MutableState) obj7;
                MutableState mutableState4 = (MutableState) obj6;
                MutableState mutableState5 = (MutableState) obj5;
                LazyListScope lazyListScope3 = (LazyListScope) obj;
                lazyListScope3.getClass();
                d.b(lazyListScope3, ((List) mutableState3.getValue()).size(), new li1(28, mutableState3), null, ComposableLambdaKt.composableLambdaInstance(-758002365, true, new no0(mutableState3, mutableState4, mutableState5, (SnapshotStateMap) obj4, (SnapshotStateMap) obj3, (String) obj8, (Function1) obj2)), 4, null);
                return Unit.INSTANCE;
            default:
                ye2 ye2VarA = ((ye2) obj).a();
                ((MutableState) obj7).setValue(ye2VarA.a);
                ((MutableState) obj6).setValue(ye2VarA.b);
                ((MutableState) obj5).setValue(ye2VarA.c);
                ((MutableState) obj4).setValue(Boolean.valueOf(ye2VarA.d));
                ((MutableState) obj3).setValue(Boolean.valueOf(ye2VarA.e));
                ((Function1) obj8).invoke(ye2VarA);
                ((MutableState) obj2).setValue("已通过扫码回填 WebDAV 地址、账号、密码与同步范围。");
                return Unit.INSTANCE;
        }
    }

    public /* synthetic */ cy(MutableObjectFloatMap mutableObjectFloatMap, ComposeNavigator composeNavigator, Function1 function1, Function1 function2, Function1 function3, State state, MutableState mutableState) {
        this.a = 3;
        this.b = mutableObjectFloatMap;
        this.d = composeNavigator;
        this.e = function1;
        this.g = function2;
        this.h = function3;
        this.i = state;
        this.c = mutableState;
    }

    public /* synthetic */ cy(MutableState mutableState, MutableState mutableState2, MutableState mutableState3, MutableState mutableState4, MutableState mutableState5, MutableState mutableState6, MutableState mutableState7) {
        this.a = 5;
        this.c = mutableState;
        this.d = mutableState2;
        this.e = mutableState3;
        this.g = mutableState4;
        this.h = mutableState5;
        this.i = mutableState6;
        this.b = mutableState7;
    }

    public /* synthetic */ cy(MutableState mutableState, MutableState mutableState2, MutableState mutableState3, SnapshotStateMap snapshotStateMap, SnapshotStateMap snapshotStateMap2, String str, Function1 function1) {
        this.a = 6;
        this.c = mutableState;
        this.b = str;
        this.g = snapshotStateMap;
        this.h = snapshotStateMap2;
        this.i = function1;
        this.d = mutableState2;
        this.e = mutableState3;
    }

    public /* synthetic */ cy(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object obj7, int i) {
        this.a = i;
        this.b = obj;
        this.c = obj2;
        this.d = obj3;
        this.e = obj4;
        this.g = obj5;
        this.h = obj6;
        this.i = obj7;
    }

    public /* synthetic */ cy(List list, String str, CoroutineScope coroutineScope, LazyListState lazyListState, FocusRequester focusRequester, Function2 function2, MutableState mutableState) {
        this.a = 2;
        this.d = list;
        this.e = str;
        this.b = coroutineScope;
        this.g = lazyListState;
        this.h = focusRequester;
        this.i = function2;
        this.c = mutableState;
    }
}
