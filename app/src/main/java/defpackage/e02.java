package defpackage;

import kotlin.jvm.internal.ShortCompanionObject;

/* JADX INFO: loaded from: classes5.dex */
public final class e02 extends xp1 {
    public static final e02 c;

    static {
        ShortCompanionObject.INSTANCE.getClass();
        c = new e02(h02.a);
    }

    @Override // defpackage.d
    public final int e(Object obj) {
        short[] sArr = (short[]) obj;
        sArr.getClass();
        return sArr.length;
    }

    @Override // defpackage.tq, defpackage.d
    public final void h(xt xtVar, int i, Object obj) {
        d02 d02Var = (d02) obj;
        d02Var.getClass();
        short sDecodeShortElement = xtVar.decodeShortElement(this.b, i);
        d02Var.b(d02Var.d() + 1);
        short[] sArr = d02Var.a;
        int i2 = d02Var.b;
        d02Var.b = i2 + 1;
        sArr[i2] = sDecodeShortElement;
    }

    @Override // defpackage.d
    public final Object i(Object obj) {
        short[] sArr = (short[]) obj;
        sArr.getClass();
        d02 d02Var = new d02();
        d02Var.a = sArr;
        d02Var.b = sArr.length;
        d02Var.b(10);
        return d02Var;
    }

    @Override // defpackage.xp1
    public final Object l() {
        return new short[0];
    }

    @Override // defpackage.xp1
    public final void m(yt ytVar, Object obj, int i) {
        short[] sArr = (short[]) obj;
        ytVar.getClass();
        sArr.getClass();
        for (int i2 = 0; i2 < i; i2++) {
            ytVar.encodeShortElement(this.b, i2, sArr[i2]);
        }
    }
}
