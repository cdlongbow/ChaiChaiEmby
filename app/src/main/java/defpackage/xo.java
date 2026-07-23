package defpackage;

import java.util.Arrays;
import kotlin.ranges.RangesKt;

/* JADX INFO: loaded from: classes5.dex */
public final class xo extends vp1 {
    public char[] a;
    public int b;

    @Override // defpackage.vp1
    public final Object a() {
        return Arrays.copyOf(this.a, this.b);
    }

    @Override // defpackage.vp1
    public final void b(int i) {
        char[] cArr = this.a;
        if (cArr.length < i) {
            this.a = Arrays.copyOf(cArr, RangesKt.coerceAtLeast(i, cArr.length * 2));
        }
    }

}
