package defpackage;

import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class du1 implements Function0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ xv0 b;

    public /* synthetic */ du1(xv0 xv0Var, int i) {
        this.a = i;
        this.b = xv0Var;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int i = this.a;
        xv0 xv0Var = this.b;
        switch (i) {
            case 0:
                return RouteSerializerKt.generateRoutePattern$lambda$0(xv0Var);
            default:
                return RouteSerializerKt.generateNavArguments$lambda$2(xv0Var);
        }
    }
}
