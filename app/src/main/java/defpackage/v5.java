package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes4.dex */
public final class v5 implements Function0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Function2 b;
    public final /* synthetic */ String c;
    public final /* synthetic */ h3 d;

    public /* synthetic */ v5(Function2 function2, String str, h3 h3Var, int i) {
        this.a = i;
        this.b = function2;
        this.c = str;
        this.d = h3Var;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int i = this.a;
        h3 h3Var = this.d;
        String str = this.c;
        Function2 function2 = this.b;
        switch (i) {
            case 0:
                function2.invoke(str, h3Var);
                break;
            default:
                function2.invoke(str, h3Var);
                break;
        }
        return Unit.INSTANCE;
    }
}
