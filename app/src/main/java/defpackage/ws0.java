package defpackage;

import java.io.Serializable;
import java.util.Arrays;
import okhttp3.internal.url._UrlKt;

/* JADX INFO: loaded from: classes4.dex */
public final class ws0 implements Serializable {
    public static final ws0 c = new ws0(new int[0]);
    public final int[] a;
    public final int b;

    public ws0(int[] iArr) {
        int length = iArr.length;
        this.a = iArr;
        this.b = length;
    }

    public final boolean equals(Object obj) {
        ws0 ws0Var;
        int i;
        int i2;
        if (obj == this) {
            return true;
        }
        if ((obj instanceof ws0) && (i2 = this.b) == (i = (ws0Var = (ws0) obj).b)) {
            for (int i3 = 0; i3 < i2; i3++) {
                ig2.p(i3, i2);
                int i4 = this.a[i3];
                ig2.p(i3, i);
                if (i4 == ws0Var.a[i3]) {
                }
            }
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int i = 1;
        for (int i2 = 0; i2 < this.b; i2++) {
            i = (i * 31) + this.a[i2];
        }
        return i;
    }

    public Object readResolve() {
        return this.b == 0 ? c : this;
    }

    public final String toString() {
        int i = this.b;
        if (i == 0) {
            return _UrlKt.PATH_SEGMENT_ENCODE_SET_URI;
        }
        StringBuilder sb = new StringBuilder(i * 5);
        sb.append('[');
        int[] iArr = this.a;
        sb.append(iArr[0]);
        for (int i2 = 1; i2 < i; i2++) {
            sb.append(", ");
            sb.append(iArr[i2]);
        }
        sb.append(']');
        return sb.toString();
    }

    public Object writeReplace() {
        int[] iArr = this.a;
        int length = iArr.length;
        int i = this.b;
        return i < length ? new ws0(Arrays.copyOfRange(iArr, 0, i)) : this;
    }
}
