package defpackage;

import kotlin.UShort;
import kotlin.UShortArray;

/* JADX INFO: loaded from: classes5.dex */
public final class ld2 extends xp1 {
    public static final ld2 c;

    static {
        UShort.INSTANCE.getClass();
        c = new ld2(md2.a);
    }

    @Override // defpackage.d
    public final int e(Object obj) {
        short[] storage = ((UShortArray) obj).getStorage();
        storage.getClass();
        return UShortArray.m9165getSizeimpl(storage);
    }

    @Override // defpackage.tq, defpackage.d
    public final void h(xt xtVar, int i, Object obj) {
        kd2 kd2Var = (kd2) obj;
        kd2Var.getClass();
        short sM9106constructorimpl = UShort.m9106constructorimpl(xtVar.decodeInlineElement(this.b, i).decodeShort());
        kd2Var.b(kd2Var.d() + 1);
        short[] sArr = kd2Var.a;
        int i2 = kd2Var.b;
        kd2Var.b = i2 + 1;
        UShortArray.m9169set01HTLdE(sArr, i2, sM9106constructorimpl);
    }

    @Override // defpackage.d
    public final Object i(Object obj) {
        short[] storage = ((UShortArray) obj).getStorage();
        storage.getClass();
        kd2 kd2Var = new kd2();
        kd2Var.a = storage;
        kd2Var.b = UShortArray.m9165getSizeimpl(storage);
        kd2Var.b(10);
        return kd2Var;
    }

    @Override // defpackage.xp1
    public final Object l() {
        return UShortArray.m9157boximpl(UShortArray.m9158constructorimpl(0));
    }

    @Override // defpackage.xp1
    public final void m(yt ytVar, Object obj, int i) {
        short[] storage = ((UShortArray) obj).getStorage();
        ytVar.getClass();
        storage.getClass();
        for (int i2 = 0; i2 < i; i2++) {
            ytVar.encodeInlineElement(this.b, i2).encodeShort(UShortArray.m9164getMh2AYeg(storage, i2));
        }
    }
}
