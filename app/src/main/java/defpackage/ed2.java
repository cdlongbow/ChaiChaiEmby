package defpackage;

import java.util.Arrays;
import kotlin.UIntArray;
import kotlin.ranges.RangesKt;

/* JADX INFO: loaded from: classes5.dex */
public final class ed2 extends vp1 {
    public int[] a;
    public int b;

    @Override // defpackage.vp1
    public final Object a() {
        return UIntArray.m8973boximpl(UIntArray.m8975constructorimpl(Arrays.copyOf(this.a, this.b)));
    }

    @Override // defpackage.vp1
    public final void b(int i) {
        if (UIntArray.m8981getSizeimpl(this.a) < i) {
            int[] iArr = this.a;
            this.a = UIntArray.m8975constructorimpl(Arrays.copyOf(iArr, RangesKt.coerceAtLeast(i, UIntArray.m8981getSizeimpl(iArr) * 2)));
        }
    }

}
