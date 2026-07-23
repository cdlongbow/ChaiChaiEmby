package defpackage;

import kotlin.UByte;

/* JADX INFO: loaded from: classes4.dex */
public final class ui extends xi {
    public final char[] f;

    public ui(ti tiVar) {
        super(tiVar, (Character) null);
        this.f = new char[512];
        char[] cArr = tiVar.b;
        ig2.l(cArr.length == 16);
        for (int i = 0; i < 256; i++) {
            char[] cArr2 = this.f;
            cArr2[i] = cArr[i >>> 4];
            cArr2[i | 256] = cArr[i & 15];
        }
    }

    @Override // defpackage.xi
    public final int a(byte[] bArr, CharSequence charSequence) throws wi {
        if (charSequence.length() % 2 == 1) {
            throw new wi("Invalid input length " + charSequence.length());
        }
        int i = 0;
        int i2 = 0;
        while (i < charSequence.length()) {
            char cCharAt = charSequence.charAt(i);
            ti tiVar = this.a;
            bArr[i2] = (byte) ((tiVar.a(cCharAt) << 4) | tiVar.a(charSequence.charAt(i + 1)));
            i += 2;
            i2++;
        }
        return i2;
    }

    @Override // defpackage.xi
    public final void c(StringBuilder sb, byte[] bArr, int i) {
        ig2.v(0, i, bArr.length);
        for (int i2 = 0; i2 < i; i2++) {
            int i3 = bArr[i2] & UByte.MAX_VALUE;
            char[] cArr = this.f;
            sb.append(cArr[i3]);
            sb.append(cArr[i3 | 256]);
        }
    }
}
