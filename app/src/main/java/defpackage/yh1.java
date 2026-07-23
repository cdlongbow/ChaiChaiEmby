package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class yh1 implements Function1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ to1 b;

    public /* synthetic */ yh1(to1 to1Var, int i) {
        this.a = i;
        this.b = to1Var;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i = this.a;
        to1 to1Var = this.b;
        bo1 bo1Var = (bo1) obj;
        switch (i) {
            case 0:
                bo1Var.getClass();
                ku.H(to1Var, bo1Var);
                break;
            default:
                bo1Var.getClass();
                ku.H(to1Var, bo1Var);
                break;
        }
        return Unit.INSTANCE;
    }
}
