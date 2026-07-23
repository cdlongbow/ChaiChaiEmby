package defpackage;

import kotlin.UInt;
import kotlin.UIntArray;

/* JADX INFO: loaded from: classes5.dex */
public final class fd2 extends xp1 {
    public static final fd2 c;

    static {
        UInt.INSTANCE.getClass();
        c = new fd2(gd2.a);
    }

    @Override // defpackage.d
    public final int e(Object obj) {
        int[] storage = ((UIntArray) obj).getStorage();
        storage.getClass();
        return UIntArray.m8981getSizeimpl(storage);
    }

    @Override // defpackage.tq, defpackage.d
    public final void h(xt xtVar, int i, Object obj) {
        ed2 ed2Var = (ed2) obj;
        ed2Var.getClass();
        int iM8920constructorimpl = UInt.m8920constructorimpl(xtVar.decodeInlineElement(this.b, i).decodeInt());
        ed2Var.b(ed2Var.d() + 1);
        int[] iArr = ed2Var.a;
        int i2 = ed2Var.b;
        ed2Var.b = i2 + 1;
        UIntArray.m8985setVXSXFK8(iArr, i2, iM8920constructorimpl);
    }

    @Override // defpackage.d
    public final Object i(Object obj) {
        int[] storage = ((UIntArray) obj).getStorage();
        storage.getClass();
        ed2 ed2Var = new ed2();
        ed2Var.a = storage;
        ed2Var.b = UIntArray.m8981getSizeimpl(storage);
        ed2Var.b(10);
        return ed2Var;
    }

    @Override // defpackage.xp1
    public final Object l() {
        return UIntArray.m8973boximpl(UIntArray.m8974constructorimpl(0));
    }

    @Override // defpackage.xp1
    public final void m(yt ytVar, Object obj, int i) {
        int[] storage = ((UIntArray) obj).getStorage();
        ytVar.getClass();
        storage.getClass();
        for (int i2 = 0; i2 < i; i2++) {
            ytVar.encodeInlineElement(this.b, i2).encodeInt(UIntArray.m8980getpVg5ArA(storage, i2));
        }
    }
}
