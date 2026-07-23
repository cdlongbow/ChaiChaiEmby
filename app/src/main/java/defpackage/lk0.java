package defpackage;

import kotlin.jvm.internal.FloatCompanionObject;

/* JADX INFO: loaded from: classes5.dex */
public final class lk0 extends xp1 {
    public static final lk0 c;

    static {
        FloatCompanionObject.INSTANCE.getClass();
        c = new lk0(nk0.a);
    }

    @Override // defpackage.d
    public final int e(Object obj) {
        float[] fArr = (float[]) obj;
        fArr.getClass();
        return fArr.length;
    }

    @Override // defpackage.tq, defpackage.d
    public final void h(xt xtVar, int i, Object obj) {
        kk0 kk0Var = (kk0) obj;
        kk0Var.getClass();
        float fDecodeFloatElement = xtVar.decodeFloatElement(this.b, i);
        kk0Var.b(kk0Var.d() + 1);
        float[] fArr = kk0Var.a;
        int i2 = kk0Var.b;
        kk0Var.b = i2 + 1;
        fArr[i2] = fDecodeFloatElement;
    }

    @Override // defpackage.d
    public final Object i(Object obj) {
        float[] fArr = (float[]) obj;
        fArr.getClass();
        kk0 kk0Var = new kk0();
        kk0Var.a = fArr;
        kk0Var.b = fArr.length;
        kk0Var.b(10);
        return kk0Var;
    }

    @Override // defpackage.xp1
    public final Object l() {
        return new float[0];
    }

    @Override // defpackage.xp1
    public final void m(yt ytVar, Object obj, int i) {
        float[] fArr = (float[]) obj;
        ytVar.getClass();
        fArr.getClass();
        for (int i2 = 0; i2 < i; i2++) {
            ytVar.encodeFloatElement(this.b, i2, fArr[i2]);
        }
    }
}
