package defpackage;

import kotlin.jvm.internal.ByteCompanionObject;

/* JADX INFO: loaded from: classes5.dex */
public final class en extends xp1 {
    public static final en c;

    static {
        ByteCompanionObject.INSTANCE.getClass();
        c = new en(hn.a);
    }

    @Override // defpackage.d
    public final int e(Object obj) {
        byte[] bArr = (byte[]) obj;
        bArr.getClass();
        return bArr.length;
    }

    @Override // defpackage.tq, defpackage.d
    public final void h(xt xtVar, int i, Object obj) {
        cn cnVar = (cn) obj;
        cnVar.getClass();
        byte bDecodeByteElement = xtVar.decodeByteElement(this.b, i);
        cnVar.b(cnVar.d() + 1);
        byte[] bArr = cnVar.a;
        int i2 = cnVar.b;
        cnVar.b = i2 + 1;
        bArr[i2] = bDecodeByteElement;
    }

    @Override // defpackage.d
    public final Object i(Object obj) {
        byte[] bArr = (byte[]) obj;
        bArr.getClass();
        cn cnVar = new cn();
        cnVar.a = bArr;
        cnVar.b = bArr.length;
        cnVar.b(10);
        return cnVar;
    }

    @Override // defpackage.xp1
    public final Object l() {
        return new byte[0];
    }

    @Override // defpackage.xp1
    public final void m(yt ytVar, Object obj, int i) {
        byte[] bArr = (byte[]) obj;
        ytVar.getClass();
        bArr.getClass();
        for (int i2 = 0; i2 < i; i2++) {
            ytVar.encodeByteElement(this.b, i2, bArr[i2]);
        }
    }
}
