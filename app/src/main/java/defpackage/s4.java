package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class s4 implements Function3 {
    public final /* synthetic */ int a;
    public final /* synthetic */ p7 b;
    public final /* synthetic */ Function2 c;

    public /* synthetic */ s4(p7 p7Var, Function2 function2, int i) {
        this.a = i;
        this.b = p7Var;
        this.c = function2;
    }

    @Override // kotlin.jvm.functions.Function3
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        int i = this.a;
        Function2 function2 = this.c;
        p7 p7Var = this.b;
        String str = (String) obj;
        String str2 = (String) obj2;
        String str3 = (String) obj3;
        s01.D(str, str2, str3);
        switch (i) {
            case 0:
                p7Var.g.setValue(str);
                function2.invoke(str2, str3);
                break;
            default:
                p7Var.g.setValue(str);
                function2.invoke(str2, str3);
                break;
        }
        return Unit.INSTANCE;
    }
}
