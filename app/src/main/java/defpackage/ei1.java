package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class ei1 implements Function1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ on1 b;

    public /* synthetic */ ei1(on1 on1Var, int i) {
        this.a = i;
        this.b = on1Var;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i = this.a;
        on1 on1Var = this.b;
        switch (i) {
            case 0:
                on1Var.b.setFloatValue(((Float) obj).floatValue());
                break;
            default:
                on1Var.g.setIntValue(((Integer) obj).intValue());
                break;
        }
        return Unit.INSTANCE;
    }
}
