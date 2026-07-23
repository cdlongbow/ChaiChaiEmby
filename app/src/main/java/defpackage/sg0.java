package defpackage;

import androidx.compose.foundation.lazy.LazyListScope;
import androidx.compose.foundation.lazy.d;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class sg0 implements Function1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ List b;
    public final /* synthetic */ String c;
    public final /* synthetic */ MutableState d;

    public /* synthetic */ sg0(List list, String str, MutableState mutableState, int i) {
        this.a = i;
        this.b = list;
        this.c = str;
        this.d = mutableState;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i = this.a;
        MutableState mutableState = this.d;
        String str = this.c;
        List list = this.b;
        int i2 = 1;
        switch (i) {
            case 0:
                LazyListScope lazyListScope = (LazyListScope) obj;
                lazyListScope.getClass();
                d.b(lazyListScope, list.size(), new jg(list, i2), null, ComposableLambdaKt.composableLambdaInstance(1959799657, true, new tg0(list, str, mutableState, 0)), 4, null);
                break;
            default:
                LazyListScope lazyListScope2 = (LazyListScope) obj;
                lazyListScope2.getClass();
                d.b(lazyListScope2, list.size(), new jg(list, 8), null, ComposableLambdaKt.composableLambdaInstance(-1189899885, true, new tg0(list, str, mutableState, i2)), 4, null);
                break;
        }
        return Unit.INSTANCE;
    }
}
