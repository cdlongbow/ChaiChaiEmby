package defpackage;

import kotlin.ULong;
import kotlin.ULongArray;

/* JADX INFO: loaded from: classes5.dex */
public final class id2 extends xp1 {
    public static final id2 c;

    static {
        ULong.INSTANCE.getClass();
        c = new id2(jd2.a);
    }

    @Override // defpackage.d
    public final int e(Object obj) {
        long[] storage = ((ULongArray) obj).getStorage();
        storage.getClass();
        return ULongArray.m9060getSizeimpl(storage);
    }

    @Override // defpackage.tq, defpackage.d
    public final void h(xt xtVar, int i, Object obj) {
        hd2 hd2Var = (hd2) obj;
        hd2Var.getClass();
        long jM8999constructorimpl = ULong.m8999constructorimpl(xtVar.decodeInlineElement(this.b, i).decodeLong());
        hd2Var.b(hd2Var.d() + 1);
        long[] jArr = hd2Var.a;
        int i2 = hd2Var.b;
        hd2Var.b = i2 + 1;
        ULongArray.m9064setk8EXiF4(jArr, i2, jM8999constructorimpl);
    }

    @Override // defpackage.d
    public final Object i(Object obj) {
        long[] storage = ((ULongArray) obj).getStorage();
        storage.getClass();
        hd2 hd2Var = new hd2();
        hd2Var.a = storage;
        hd2Var.b = ULongArray.m9060getSizeimpl(storage);
        hd2Var.b(10);
        return hd2Var;
    }

    @Override // defpackage.xp1
    public final Object l() {
        return ULongArray.m9052boximpl(ULongArray.m9053constructorimpl(0));
    }

    @Override // defpackage.xp1
    public final void m(yt ytVar, Object obj, int i) {
        long[] storage = ((ULongArray) obj).getStorage();
        ytVar.getClass();
        storage.getClass();
        for (int i2 = 0; i2 < i; i2++) {
            ytVar.encodeInlineElement(this.b, i2).encodeLong(ULongArray.m9059getsVKNKU(storage, i2));
        }
    }
}
