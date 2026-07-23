package defpackage;

import kotlin.jvm.internal.DoubleCompanionObject;

/* JADX INFO: loaded from: classes5.dex */
public final class ic0 extends xp1 {
    public static final ic0 c;

    static {
        DoubleCompanionObject.INSTANCE.getClass();
        c = new ic0(lc0.a);
    }

    @Override // defpackage.d
    public final int e(Object obj) {
        double[] dArr = (double[]) obj;
        dArr.getClass();
        return dArr.length;
    }

    @Override // defpackage.tq, defpackage.d
    public final void h(xt xtVar, int i, Object obj) {
        hc0 hc0Var = (hc0) obj;
        hc0Var.getClass();
        double dDecodeDoubleElement = xtVar.decodeDoubleElement(this.b, i);
        hc0Var.b(hc0Var.d() + 1);
        double[] dArr = hc0Var.a;
        int i2 = hc0Var.b;
        hc0Var.b = i2 + 1;
        dArr[i2] = dDecodeDoubleElement;
    }

    @Override // defpackage.d
    public final Object i(Object obj) {
        double[] dArr = (double[]) obj;
        dArr.getClass();
        hc0 hc0Var = new hc0();
        hc0Var.a = dArr;
        hc0Var.b = dArr.length;
        hc0Var.b(10);
        return hc0Var;
    }

    @Override // defpackage.xp1
    public final Object l() {
        return new double[0];
    }

    @Override // defpackage.xp1
    public final void m(yt ytVar, Object obj, int i) {
        double[] dArr = (double[]) obj;
        ytVar.getClass();
        dArr.getClass();
        for (int i2 = 0; i2 < i; i2++) {
            ytVar.encodeDoubleElement(this.b, i2, dArr[i2]);
        }
    }
}
