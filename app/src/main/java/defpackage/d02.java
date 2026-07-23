package defpackage;

import java.util.Arrays;
import kotlin.ranges.RangesKt;

/* JADX INFO: loaded from: classes5.dex */
public final class d02 extends vp1 {
    public short[] a;
    public int b;

    @Override // defpackage.vp1
    public final Object a() {
        return Arrays.copyOf(this.a, this.b);
    }

    @Override // defpackage.vp1
    public final void b(int i) {
        short[] sArr = this.a;
        if (sArr.length < i) {
            this.a = Arrays.copyOf(sArr, RangesKt.coerceAtLeast(i, sArr.length * 2));
        }
    }

}
