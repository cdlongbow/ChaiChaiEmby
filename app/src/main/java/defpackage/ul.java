package defpackage;

import kotlin.jvm.internal.BooleanCompanionObject;

/* JADX INFO: loaded from: classes5.dex */
public final class ul extends xp1 {
    public static final ul c;

    static {
        BooleanCompanionObject.INSTANCE.getClass();
        c = new ul(vl.a);
    }

    @Override // defpackage.d
    public final int e(Object obj) {
        boolean[] zArr = (boolean[]) obj;
        zArr.getClass();
        return zArr.length;
    }

    @Override // defpackage.tq, defpackage.d
    public final void h(xt xtVar, int i, Object obj) {
        tl tlVar = (tl) obj;
        tlVar.getClass();
        boolean zDecodeBooleanElement = xtVar.decodeBooleanElement(this.b, i);
        tlVar.b(tlVar.d() + 1);
        boolean[] zArr = tlVar.a;
        int i2 = tlVar.b;
        tlVar.b = i2 + 1;
        zArr[i2] = zDecodeBooleanElement;
    }

    @Override // defpackage.d
    public final Object i(Object obj) {
        boolean[] zArr = (boolean[]) obj;
        zArr.getClass();
        tl tlVar = new tl();
        tlVar.a = zArr;
        tlVar.b = zArr.length;
        tlVar.b(10);
        return tlVar;
    }

    @Override // defpackage.xp1
    public final Object l() {
        return new boolean[0];
    }

    @Override // defpackage.xp1
    public final void m(yt ytVar, Object obj, int i) {
        boolean[] zArr = (boolean[]) obj;
        ytVar.getClass();
        zArr.getClass();
        for (int i2 = 0; i2 < i; i2++) {
            ytVar.encodeBooleanElement(this.b, i2, zArr[i2]);
        }
    }
}
