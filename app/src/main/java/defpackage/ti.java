package defpackage;

import java.math.RoundingMode;
import java.util.Arrays;

/* JADX INFO: loaded from: classes4.dex */
public final class ti {
    public final String a;
    public final char[] b;
    public final int c;
    public final int d;
    public final int e;
    public final int f;
    public final byte[] g;
    public final boolean[] h;
    public final boolean i;

    public ti(String str, char[] cArr, byte[] bArr, boolean z) {
        this.a = str;
        cArr.getClass();
        this.b = cArr;
        try {
            int length = cArr.length;
            RoundingMode roundingMode = RoundingMode.UNNECESSARY;
            int iB = tl0.B(length);
            this.d = iB;
            int iNumberOfTrailingZeros = Integer.numberOfTrailingZeros(iB);
            int i = 1 << (3 - iNumberOfTrailingZeros);
            this.e = i;
            this.f = iB >> iNumberOfTrailingZeros;
            this.c = cArr.length - 1;
            this.g = bArr;
            boolean[] zArr = new boolean[i];
            for (int i2 = 0; i2 < this.f; i2++) {
                int i3 = this.d;
                RoundingMode roundingMode2 = RoundingMode.CEILING;
                zArr[tl0.l(i2 * 8, i3)] = true;
            }
            this.h = zArr;
            this.i = z;
        } catch (ArithmeticException e) {
            throw new IllegalArgumentException("Illegal alphabet length " + cArr.length, e);
        }
    }

    public final int a(char c) throws wi {
        if (c > 127) {
            throw new wi("Unrecognized character: 0x" + Integer.toHexString(c));
        }
        byte b = this.g[c];
        if (b != -1) {
            return b;
        }
        if (c > ' ' && c != 127) {
            throw new wi("Unrecognized character: " + c);
        }
        throw new wi("Unrecognized character: 0x" + Integer.toHexString(c));
    }

    public final ti b() {
        if (this.i) {
            return this;
        }
        byte[] bArr = this.g;
        byte[] bArrCopyOf = Arrays.copyOf(bArr, bArr.length);
        for (int i = 65; i <= 90; i++) {
            int i2 = i | 32;
            byte b = bArr[i];
            byte b2 = bArr[i2];
            if (b == -1) {
                bArrCopyOf[i] = b2;
            } else {
                char c = (char) i;
                char c2 = (char) i2;
                if (!(b2 == -1)) {
                    rd1.o(hg2.D("Can't ignoreCase() since '%s' and '%s' encode different values", Character.valueOf(c), Character.valueOf(c2)));
                    return null;
                }
                bArrCopyOf[i2] = b;
            }
        }
        return new ti(s01.w(new StringBuilder(), this.a, ".ignoreCase()"), this.b, bArrCopyOf, true);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof ti)) {
            return false;
        }
        ti tiVar = (ti) obj;
        return this.i == tiVar.i && Arrays.equals(this.b, tiVar.b);
    }

    public final int hashCode() {
        return Arrays.hashCode(this.b) + (this.i ? 1231 : 1237);
    }


    /* JADX WARN: Illegal instructions before constructor call */
    public ti(String str, char[] cArr) {
        byte[] bArr = new byte[128];
        Arrays.fill(bArr, (byte) -1);
        for (int i = 0; i < cArr.length; i++) {
            char c = cArr[i];
            if (!(c < 128)) {
                ra.q(hg2.D("Non-ASCII character: %s", Character.valueOf(c)));
                throw null;
            }
            if (!(bArr[c] == -1)) {
                ra.q(hg2.D("Duplicate character: %s", Character.valueOf(c)));
                throw null;
            }
            bArr[c] = (byte) i;
        }
        this(str, cArr, bArr, false);
    }
}
