package defpackage;

import java.util.Arrays;
import kotlin.ranges.RangesKt;

/* JADX INFO: loaded from: classes5.dex */
public final class t01 extends vp1 {
    public long[] a;
    public int b;

    @Override // defpackage.vp1
    public final Object a() {
        return Arrays.copyOf(this.a, this.b);
    }

    @Override // defpackage.vp1
    public final void b(int i) {
        long[] jArr = this.a;
        if (jArr.length < i) {
            this.a = Arrays.copyOf(jArr, RangesKt.coerceAtLeast(i, jArr.length * 2));
        }
    }

}
