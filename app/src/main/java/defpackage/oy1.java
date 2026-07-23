package defpackage;

import com.dh.myembyapp.data.preferences.ServerPreferences;
import java.util.function.Predicate;
import kotlin.jvm.functions.Function1;

public final /* synthetic */ class oy1 implements Predicate {
    public final /* synthetic */ int a;
    public final /* synthetic */ Function1 b;

    public /* synthetic */ oy1(Function1 function1, int i) {
        this.a = i;
        this.b = function1;
    }

    @Override // java.util.function.Predicate
    public final boolean test(Object obj) {
        int i = this.a;
        Function1 function1 = this.b;
        switch (i) {
            case 0:
                return ServerPreferences.deleteServer$lambda$1((dl) function1, obj);
            case 1:
                return ((Boolean) ((m22) function1).invoke(obj)).booleanValue();
            default:
                return ((Boolean) ((dl) function1).invoke(obj)).booleanValue();
        }
    }
}