package defpackage;

import java.util.function.BiFunction;
import java.util.function.Function;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.future.FutureKt;

public final /* synthetic */ class zl0 implements BiFunction {
    public final /* synthetic */ int a;
    public final /* synthetic */ Function2 b;

    public /* synthetic */ zl0(int i, Function2 function2) {
        this.a = i;
        this.b = function2;
    }

    @Override // java.util.function.BiFunction
    public final Object apply(Object obj, Object obj2) {
        int i = this.a;
        Function2 function2 = this.b;
        switch (i) {
            case 0:
                return ((a5) function2).invoke(obj, (Throwable) obj2);
            default:
                return FutureKt.setupCancellation$lambda$3(function2, obj, (Throwable) obj2);
        }
    }
}