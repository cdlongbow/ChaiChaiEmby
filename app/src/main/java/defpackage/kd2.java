package defpackage;

import java.util.Arrays;
import kotlin.UShortArray;
import kotlin.ranges.RangesKt;

/* JADX INFO: loaded from: classes5.dex */
public final class kd2 extends vp1 {
    public short[] a;
    public int b;

    @Override // defpackage.vp1
    public final Object a() {
        return UShortArray.m9157boximpl(UShortArray.m9159constructorimpl(Arrays.copyOf(this.a, this.b)));
    }

    @Override // defpackage.vp1
    public final void b(int i) {
        if (UShortArray.m9165getSizeimpl(this.a) < i) {
            short[] sArr = this.a;
            this.a = UShortArray.m9159constructorimpl(Arrays.copyOf(sArr, RangesKt.coerceAtLeast(i, UShortArray.m9165getSizeimpl(sArr) * 2)));
        }
    }

}
