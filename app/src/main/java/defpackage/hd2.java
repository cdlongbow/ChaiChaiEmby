package defpackage;

import java.util.Arrays;
import kotlin.ULongArray;
import kotlin.ranges.RangesKt;

/* JADX INFO: loaded from: classes5.dex */
public final class hd2 extends vp1 {
    public long[] a;
    public int b;

    @Override // defpackage.vp1
    public final Object a() {
        return ULongArray.m9052boximpl(ULongArray.m9054constructorimpl(Arrays.copyOf(this.a, this.b)));
    }

    @Override // defpackage.vp1
    public final void b(int i) {
        if (ULongArray.m9060getSizeimpl(this.a) < i) {
            long[] jArr = this.a;
            this.a = ULongArray.m9054constructorimpl(Arrays.copyOf(jArr, RangesKt.coerceAtLeast(i, ULongArray.m9060getSizeimpl(jArr) * 2)));
        }
    }

}
