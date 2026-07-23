package defpackage;

import kotlin.jvm.internal.LongCompanionObject;

/* JADX INFO: loaded from: classes5.dex */
public final class u01 extends xp1 {
    public static final u01 c;

    static {
        LongCompanionObject.INSTANCE.getClass();
        c = new u01(y01.a);
    }

    @Override // defpackage.d
    public final int e(Object obj) {
        long[] jArr = (long[]) obj;
        jArr.getClass();
        return jArr.length;
    }

    @Override // defpackage.tq, defpackage.d
    public final void h(xt xtVar, int i, Object obj) {
        t01 t01Var = (t01) obj;
        t01Var.getClass();
        long jDecodeLongElement = xtVar.decodeLongElement(this.b, i);
        t01Var.b(t01Var.d() + 1);
        long[] jArr = t01Var.a;
        int i2 = t01Var.b;
        t01Var.b = i2 + 1;
        jArr[i2] = jDecodeLongElement;
    }

    @Override // defpackage.d
    public final Object i(Object obj) {
        long[] jArr = (long[]) obj;
        jArr.getClass();
        t01 t01Var = new t01();
        t01Var.a = jArr;
        t01Var.b = jArr.length;
        t01Var.b(10);
        return t01Var;
    }

    @Override // defpackage.xp1
    public final Object l() {
        return new long[0];
    }

    @Override // defpackage.xp1
    public final void m(yt ytVar, Object obj, int i) {
        long[] jArr = (long[]) obj;
        ytVar.getClass();
        jArr.getClass();
        for (int i2 = 0; i2 < i; i2++) {
            ytVar.encodeLongElement(this.b, i2, jArr[i2]);
        }
    }
}
