package defpackage;

import kotlin.UByte;

/* JADX INFO: loaded from: classes4.dex */
public final class vi extends xi {
    /* JADX WARN: Illegal instructions before constructor call */
    public vi(String str, String str2) {
        char[] charArray = str2.toCharArray();
        super(new ti(str, charArray), (Character) '=');
        ig2.l(charArray.length == 64);
    }

    @Override // defpackage.xi
    public final int a(byte[] bArr, CharSequence charSequence) throws wi {
        CharSequence charSequenceD = d(charSequence);
        int length = charSequenceD.length();
        ti tiVar = this.a;
        if (!tiVar.h[length % tiVar.e]) {
            throw new wi("Invalid input length " + charSequenceD.length());
        }
        int i = 0;
        int i2 = 0;
        while (i < charSequenceD.length()) {
            int i3 = i + 2;
            int iA = (tiVar.a(charSequenceD.charAt(i + 1)) << 12) | (tiVar.a(charSequenceD.charAt(i)) << 18);
            int i4 = i2 + 1;
            bArr[i2] = (byte) (iA >>> 16);
            if (i3 < charSequenceD.length()) {
                int i5 = i + 3;
                int iA2 = iA | (tiVar.a(charSequenceD.charAt(i3)) << 6);
                int i6 = i2 + 2;
                bArr[i4] = (byte) ((iA2 >>> 8) & 255);
                if (i5 < charSequenceD.length()) {
                    i += 4;
                    i2 += 3;
                    bArr[i6] = (byte) ((iA2 | tiVar.a(charSequenceD.charAt(i5))) & 255);
                } else {
                    i2 = i6;
                    i = i5;
                }
            } else {
                i2 = i4;
                i = i3;
            }
        }
        return i2;
    }

    @Override // defpackage.xi
    public final void c(StringBuilder sb, byte[] bArr, int i) {
        int i2 = 0;
        ig2.v(0, i, bArr.length);
        for (int i3 = i; i3 >= 3; i3 -= 3) {
            int i4 = i2 + 2;
            int i5 = ((bArr[i2 + 1] & UByte.MAX_VALUE) << 8) | ((bArr[i2] & UByte.MAX_VALUE) << 16);
            i2 += 3;
            int i6 = i5 | (bArr[i4] & UByte.MAX_VALUE);
            ti tiVar = this.a;
            char[] cArr = tiVar.b;
            char[] cArr2 = tiVar.b;
            sb.append(cArr[i6 >>> 18]);
            sb.append(cArr2[(i6 >>> 12) & 63]);
            sb.append(cArr2[(i6 >>> 6) & 63]);
            sb.append(cArr2[i6 & 63]);
        }
        if (i2 < i) {
            b(sb, bArr, i2, i - i2);
        }
    }
}
