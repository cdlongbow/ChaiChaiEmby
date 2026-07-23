package defpackage;

import kotlin.jvm.internal.CharCompanionObject;

/* JADX INFO: loaded from: classes5.dex */
public final class yo extends xp1 {
    public static final yo c;

    static {
        CharCompanionObject.INSTANCE.getClass();
        c = new yo(hp.a);
    }

    @Override // defpackage.d
    public final int e(Object obj) {
        char[] cArr = (char[]) obj;
        cArr.getClass();
        return cArr.length;
    }

    @Override // defpackage.tq, defpackage.d
    public final void h(xt xtVar, int i, Object obj) {
        xo xoVar = (xo) obj;
        xoVar.getClass();
        char cDecodeCharElement = xtVar.decodeCharElement(this.b, i);
        xoVar.b(xoVar.d() + 1);
        char[] cArr = xoVar.a;
        int i2 = xoVar.b;
        xoVar.b = i2 + 1;
        cArr[i2] = cDecodeCharElement;
    }

    @Override // defpackage.d
    public final Object i(Object obj) {
        char[] cArr = (char[]) obj;
        cArr.getClass();
        xo xoVar = new xo();
        xoVar.a = cArr;
        xoVar.b = cArr.length;
        xoVar.b(10);
        return xoVar;
    }

    @Override // defpackage.xp1
    public final Object l() {
        return new char[0];
    }

    @Override // defpackage.xp1
    public final void m(yt ytVar, Object obj, int i) {
        char[] cArr = (char[]) obj;
        ytVar.getClass();
        cArr.getClass();
        for (int i2 = 0; i2 < i; i2++) {
            ytVar.encodeCharElement(this.b, i2, cArr[i2]);
        }
    }
}
