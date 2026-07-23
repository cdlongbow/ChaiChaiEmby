package defpackage;

import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class di1 implements Function0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ og1 b;

    public /* synthetic */ di1(og1 og1Var, int i) {
        this.a = i;
        this.b = og1Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int i = this.a;
        og1 og1Var = this.b;
        switch (i) {
            case 0:
                return (String) og1Var.c.getValue();
            case 1:
                return (String) og1Var.a.getValue();
            case 2:
                return Boolean.valueOf(og1Var.a());
            default:
                return Boolean.valueOf(og1Var.b());
        }
    }
}
