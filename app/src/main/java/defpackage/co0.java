package defpackage;

import androidx.compose.foundation.lazy.grid.LazyGridIntervalContent;
import androidx.compose.foundation.lazy.grid.LazyGridItemSpanScope;
import androidx.compose.runtime.Updater;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class co0 implements Function2 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Function1 b;

    public /* synthetic */ co0(Function1 function1, int i) {
        this.a = i;
        this.b = function1;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        int i = this.a;
        Function1 function1 = this.b;
        switch (i) {
            case 0:
                String str = (String) obj;
                str.getClass();
                ((String) obj2).getClass();
                function1.invoke(str);
                return Unit.INSTANCE;
            case 1:
                return LazyGridIntervalContent.item$lambda$1$0(function1, (LazyGridItemSpanScope) obj, ((Integer) obj2).intValue());
            case 2:
                return Updater.init_impl$lambda$0(function1, obj, (Unit) obj2);
            default:
                return Updater.reconcile_impl$lambda$0(function1, obj, (Unit) obj2);
        }
    }
}
