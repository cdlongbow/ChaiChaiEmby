package defpackage;

import java.util.Arrays;
import kotlin.ranges.RangesKt;

/* JADX INFO: loaded from: classes5.dex */
public final class tl extends vp1 {
    public boolean[] a;
    public int b;

    @Override // defpackage.vp1
    public final Object a() {
        return Arrays.copyOf(this.a, this.b);
    }

    @Override // defpackage.vp1
    public final void b(int i) {
        boolean[] zArr = this.a;
        if (zArr.length < i) {
            this.a = Arrays.copyOf(zArr, RangesKt.coerceAtLeast(i, zArr.length * 2));
        }
    }

}
