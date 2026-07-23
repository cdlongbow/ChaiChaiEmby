package defpackage;

import androidx.compose.foundation.lazy.LazyListScope;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import java.util.List;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class t70 implements Function1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ List b;
    public final /* synthetic */ boolean c;
    public final /* synthetic */ String d;
    public final /* synthetic */ Map e;
    public final /* synthetic */ Function1 g;
    public final /* synthetic */ Function1 h;

    public /* synthetic */ t70(List list, boolean z, String str, Map map, Function1 function1, Function1 function2, int i) {
        this.a = i;
        this.b = list;
        this.c = z;
        this.d = str;
        this.e = map;
        this.g = function1;
        this.h = function2;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        LazyListScope lazyListScope = (LazyListScope) obj;
        switch (this.a) {
            case 0:
                lazyListScope.getClass();
                xw xwVar = new xw(4);
                List list = this.b;
                lazyListScope.items(list.size(), new w5(12, xwVar, list), new x5(list, 11), ComposableLambdaKt.composableLambdaInstance(2039820996, true, new z70(list, this.c, this.d, list, this.e, this.g, this.h, 0)));
                break;
            default:
                lazyListScope.getClass();
                xw xwVar2 = new xw(3);
                List list2 = this.b;
                lazyListScope.items(list2.size(), new w5(18, xwVar2, list2), new x5(list2, 18), ComposableLambdaKt.composableLambdaInstance(2039820996, true, new z70(list2, this.c, this.d, list2, this.e, this.g, this.h, 1)));
                break;
        }
        return Unit.INSTANCE;
    }
}
