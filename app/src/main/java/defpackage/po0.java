package defpackage;

import android.util.Log;
import androidx.compose.foundation.lazy.LazyListState;
import androidx.compose.runtime.MutableState;
import androidx.compose.ui.focus.FocusState;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class po0 implements Function1 {
    public final /* synthetic */ int a = 0;
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;

    public /* synthetic */ po0(int i, j51 j51Var, Function1 function1, MutableState mutableState) {
        this.b = i;
        this.d = j51Var;
        this.e = function1;
        this.c = mutableState;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i = this.a;
        Object obj2 = this.e;
        Object obj3 = this.d;
        int i2 = this.b;
        Object obj4 = this.c;
        switch (i) {
            case 0:
                MutableState mutableState = (MutableState) obj4;
                CoroutineScope coroutineScope = (CoroutineScope) obj3;
                LazyListState lazyListState = (LazyListState) obj2;
                if (((Boolean) obj).booleanValue() && i2 == 0 && !((Boolean) mutableState.getValue()).booleanValue()) {
                    BuildersKt__Builders_commonKt.launch$default(coroutineScope, null, null, new mg(lazyListState, mutableState, null, 3), 3, null);
                }
                return Unit.INSTANCE;
            case 1:
                j51 j51Var = (j51) obj3;
                Function1 function1 = (Function1) obj2;
                MutableState mutableState2 = (MutableState) obj4;
                FocusState focusState = (FocusState) obj;
                focusState.getClass();
                if (focusState.isFocused()) {
                    Log.d("MoreMenu", "菜单项获得焦点: index=" + i2 + ", label=" + j51Var.a);
                    mutableState2.setValue(Integer.valueOf(i2));
                    function1.invoke(Integer.valueOf(i2));
                }
                return Unit.INSTANCE;
            default:
                return RouteSerializerKt.generateNavArguments$lambda$4$lambda$3((xv0) obj4, i2, (Map) obj3, (String) obj2, (NavArgumentBuilder) obj);
        }
    }

    public /* synthetic */ po0(int i, MutableState mutableState, CoroutineScope coroutineScope, LazyListState lazyListState) {
        this.b = i;
        this.c = mutableState;
        this.d = coroutineScope;
        this.e = lazyListState;
    }

    public /* synthetic */ po0(xv0 xv0Var, int i, Map map, String str) {
        this.c = xv0Var;
        this.b = i;
        this.d = map;
        this.e = str;
    }
}
