package defpackage;

import java.util.Arrays;
import kotlin.ranges.RangesKt;

/* JADX INFO: loaded from: classes5.dex */
public final class cn extends vp1 {
    public byte[] a;
    public int b;

    @Override // defpackage.vp1
    public final Object a() {
        return Arrays.copyOf(this.a, this.b);
    }

    @Override // defpackage.vp1
    public final void b(int i) {
        byte[] bArr = this.a;
        if (bArr.length < i) {
            this.a = Arrays.copyOf(bArr, RangesKt.coerceAtLeast(i, bArr.length * 2));
        }
    }

}
