package defpackage;

import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class zh1 implements Function0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ on1 b;

    public /* synthetic */ zh1(on1 on1Var, int i) {
        this.a = i;
        this.b = on1Var;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int i = this.a;
        on1 on1Var = this.b;
        switch (i) {
            case 0:
                return Float.valueOf(on1Var.b.getFloatValue());
            case 1:
                return Integer.valueOf(on1Var.g.getIntValue());
            default:
                return Integer.valueOf(on1Var.g.getIntValue());
        }
    }
}
