package defpackage;

import kotlin.jvm.internal.IntCompanionObject;

/* JADX INFO: loaded from: classes5.dex */
public final class du0 extends xp1 {
    public static final du0 c;

    static {
        IntCompanionObject.INSTANCE.getClass();
        c = new du0(fu0.a);
    }

    @Override // defpackage.d
    public final int e(Object obj) {
        int[] iArr = (int[]) obj;
        iArr.getClass();
        return iArr.length;
    }

    @Override // defpackage.tq, defpackage.d
    public final void h(xt xtVar, int i, Object obj) {
        cu0 cu0Var = (cu0) obj;
        cu0Var.getClass();
        int iDecodeIntElement = xtVar.decodeIntElement(this.b, i);
        cu0Var.b(cu0Var.d() + 1);
        int[] iArr = cu0Var.a;
        int i2 = cu0Var.b;
        cu0Var.b = i2 + 1;
        iArr[i2] = iDecodeIntElement;
    }

    @Override // defpackage.d
    public final Object i(Object obj) {
        int[] iArr = (int[]) obj;
        iArr.getClass();
        cu0 cu0Var = new cu0();
        cu0Var.a = iArr;
        cu0Var.b = iArr.length;
        cu0Var.b(10);
        return cu0Var;
    }

    @Override // defpackage.xp1
    public final Object l() {
        return new int[0];
    }

    @Override // defpackage.xp1
    public final void m(yt ytVar, Object obj, int i) {
        int[] iArr = (int[]) obj;
        ytVar.getClass();
        iArr.getClass();
        for (int i2 = 0; i2 < i; i2++) {
            ytVar.encodeIntElement(this.b, i2, iArr[i2]);
        }
    }
}
