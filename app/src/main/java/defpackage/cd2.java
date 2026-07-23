package defpackage;

import kotlin.UByte;
import kotlin.UByteArray;

/* JADX INFO: loaded from: classes5.dex */
public final class cd2 extends xp1 {
    public static final cd2 c;

    static {
        UByte.INSTANCE.getClass();
        c = new cd2(dd2.a);
    }

    @Override // defpackage.d
    public final int e(Object obj) {
        byte[] storage = ((UByteArray) obj).getStorage();
        storage.getClass();
        return UByteArray.m8902getSizeimpl(storage);
    }

    @Override // defpackage.tq, defpackage.d
    public final void h(xt xtVar, int i, Object obj) {
        bd2 bd2Var = (bd2) obj;
        bd2Var.getClass();
        byte bM8843constructorimpl = UByte.m8843constructorimpl(xtVar.decodeInlineElement(this.b, i).decodeByte());
        bd2Var.b(bd2Var.d() + 1);
        byte[] bArr = bd2Var.a;
        int i2 = bd2Var.b;
        bd2Var.b = i2 + 1;
        UByteArray.m8906setVurrAj0(bArr, i2, bM8843constructorimpl);
    }

    @Override // defpackage.d
    public final Object i(Object obj) {
        byte[] storage = ((UByteArray) obj).getStorage();
        storage.getClass();
        bd2 bd2Var = new bd2();
        bd2Var.a = storage;
        bd2Var.b = UByteArray.m8902getSizeimpl(storage);
        bd2Var.b(10);
        return bd2Var;
    }

    @Override // defpackage.xp1
    public final Object l() {
        return UByteArray.m8894boximpl(UByteArray.m8895constructorimpl(0));
    }

    @Override // defpackage.xp1
    public final void m(yt ytVar, Object obj, int i) {
        byte[] storage = ((UByteArray) obj).getStorage();
        ytVar.getClass();
        storage.getClass();
        for (int i2 = 0; i2 < i; i2++) {
            ytVar.encodeInlineElement(this.b, i2).encodeByte(UByteArray.m8901getw2LRezQ(storage, i2));
        }
    }
}
