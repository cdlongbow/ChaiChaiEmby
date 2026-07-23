package defpackage;

import java.util.Arrays;
import kotlin.ranges.RangesKt;

/* JADX INFO: loaded from: classes5.dex */
public final class hc0 extends vp1 {
    public double[] a;
    public int b;

    @Override // defpackage.vp1
    public final Object a() {
        return Arrays.copyOf(this.a, this.b);
    }

    @Override // defpackage.vp1
    public final void b(int i) {
        double[] dArr = this.a;
        if (dArr.length < i) {
            this.a = Arrays.copyOf(dArr, RangesKt.coerceAtLeast(i, dArr.length * 2));
        }
    }

}
