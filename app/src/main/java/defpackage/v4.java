package defpackage;

import androidx.compose.foundation.lazy.LazyListScope;
import androidx.compose.foundation.lazy.LazyListState;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.focus.FocusRequester;
import java.util.List;
import kotlin.Function;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class v4 implements Function1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ int b;
    public final /* synthetic */ int c;
    public final /* synthetic */ LazyListState d;
    public final /* synthetic */ CoroutineScope e;
    public final /* synthetic */ FocusRequester g;
    public final /* synthetic */ Function1 h;
    public final /* synthetic */ boolean i;
    public final /* synthetic */ String j;
    public final /* synthetic */ FocusRequester k;
    public final /* synthetic */ Object l;
    public final /* synthetic */ Function m;

    public /* synthetic */ v4(Object obj, int i, int i2, LazyListState lazyListState, CoroutineScope coroutineScope, FocusRequester focusRequester, Function1 function1, boolean z, String str, FocusRequester focusRequester2, Function function, int i3) {
        this.a = i3;
        this.l = obj;
        this.b = i;
        this.c = i2;
        this.d = lazyListState;
        this.e = coroutineScope;
        this.g = focusRequester;
        this.h = function1;
        this.i = z;
        this.j = str;
        this.k = focusRequester2;
        this.m = function;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i = this.a;
        Function function = this.m;
        Object obj2 = this.l;
        switch (i) {
            case 0:
                g3 g3Var = (g3) obj2;
                Function3 function3 = (Function3) function;
                LazyListScope lazyListScope = (LazyListScope) obj;
                lazyListScope.getClass();
                List list = g3Var.b;
                lazyListScope.items(list.size(), new w5(2, new a5(g3Var, 1), list), new x5(list, 1), ComposableLambdaKt.composableLambdaInstance(2039820996, true, new u6(list, g3Var, this.b, this.c, this.d, this.e, this.g, this.h, this.i, this.j, this.k, function3, 0)));
                break;
            default:
                j3 j3Var = (j3) obj2;
                Function2 function2 = (Function2) function;
                LazyListScope lazyListScope2 = (LazyListScope) obj;
                lazyListScope2.getClass();
                List list2 = j3Var.b;
                lazyListScope2.items(list2.size(), new w5(3, new a5(j3Var, 2), list2), new x5(list2, 2), ComposableLambdaKt.composableLambdaInstance(2039820996, true, new u6(list2, j3Var, this.b, this.c, this.d, this.e, this.g, this.h, this.i, this.j, this.k, function2, 1)));
                break;
        }
        return Unit.INSTANCE;
    }
}
