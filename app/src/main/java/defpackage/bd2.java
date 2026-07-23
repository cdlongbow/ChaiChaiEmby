package defpackage;

import java.util.Arrays;
import kotlin.UByteArray;
import kotlin.ranges.RangesKt;

/* JADX INFO: loaded from: classes5.dex */
public final class bd2 extends vp1 {
    public byte[] a;
    public int b;

    @Override // defpackage.vp1
    public final Object a() {
        return UByteArray.m8894boximpl(UByteArray.m8896constructorimpl(Arrays.copyOf(this.a, this.b)));
    }

    @Override // defpackage.vp1
    public final void b(int i) {
        if (UByteArray.m8902getSizeimpl(this.a) < i) {
            byte[] bArr = this.a;
            this.a = UByteArray.m8896constructorimpl(Arrays.copyOf(bArr, RangesKt.coerceAtLeast(i, UByteArray.m8902getSizeimpl(bArr) * 2)));
        }
    }

}
