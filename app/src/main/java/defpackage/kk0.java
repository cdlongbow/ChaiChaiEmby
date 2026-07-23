package defpackage;

import java.util.Arrays;
import kotlin.ranges.RangesKt;

/* JADX INFO: loaded from: classes5.dex */
public final class kk0 extends vp1 {
    public float[] a;
    public int b;

    @Override // defpackage.vp1
    public final Object a() {
        return Arrays.copyOf(this.a, this.b);
    }

    @Override // defpackage.vp1
    public final void b(int i) {
        float[] fArr = this.a;
        if (fArr.length < i) {
            this.a = Arrays.copyOf(fArr, RangesKt.coerceAtLeast(i, fArr.length * 2));
        }
    }

}
