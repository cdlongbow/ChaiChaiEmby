package defpackage;

import java.util.Objects;
import kotlin.UByte;

/* JADX INFO: loaded from: classes4.dex */
public class xi {
    public static final ui e;
    public final ti a;
    public final Character b;
    public volatile xi c;
    public volatile xi d;

    static {
        new vi("base64()", "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789+/");
        new vi("base64Url()", "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789-_");
        new xi("base32()", "ABCDEFGHIJKLMNOPQRSTUVWXYZ234567");
        new xi("base32Hex()", "0123456789ABCDEFGHIJKLMNOPQRSTUV");
        e = new ui(new ti("base16()", new char[]{'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'}));
    }

    /* JADX WARN: Code duplicated, block: B:9:0x0017  */
    public xi(ti tiVar, Character ch) {
        boolean z;
        this.a = tiVar;
        if (ch != null) {
            char cCharValue = ch.charValue();
            byte[] bArr = tiVar.g;
            if (cCharValue >= bArr.length || bArr[cCharValue] == -1) {
                z = true;
            } else {
                z = false;
            }
        } else {
            z = true;
        }
        ig2.k("Padding character %s was already in alphabet", z, ch);
        this.b = ch;
    }

    public int a(byte[] bArr, CharSequence charSequence) {
        CharSequence charSequenceD = d(charSequence);
        int length = charSequenceD.length();
        ti tiVar = this.a;
        boolean[] zArr = tiVar.h;
        int i = tiVar.d;
        int i2 = tiVar.e;
        if (!zArr[length % i2]) {
            throw new wi("Invalid input length " + charSequenceD.length());
        }
        int i3 = 0;
        for (int i4 = 0; i4 < charSequenceD.length(); i4 += i2) {
            long jA = 0;
            int i5 = 0;
            for (int i6 = 0; i6 < i2; i6++) {
                jA <<= i;
                if (i4 + i6 < charSequenceD.length()) {
                    jA |= (long) tiVar.a(charSequenceD.charAt(i5 + i4));
                    i5++;
                }
            }
            int i7 = tiVar.f;
            int i8 = (i7 * 8) - (i5 * i);
            int i9 = (i7 - 1) * 8;
            while (i9 >= i8) {
                bArr[i3] = (byte) ((jA >>> i9) & 255);
                i9 -= 8;
                i3++;
            }
        }
        return i3;
    }

    public final void b(StringBuilder sb, byte[] bArr, int i, int i2) {
        ig2.v(i, i + i2, bArr.length);
        ti tiVar = this.a;
        int i3 = tiVar.f;
        int i4 = tiVar.d;
        int i5 = 0;
        ig2.l(i2 <= i3);
        long j = 0;
        for (int i6 = 0; i6 < i2; i6++) {
            j = (j | ((long) (bArr[i + i6] & UByte.MAX_VALUE))) << 8;
        }
        int i7 = ((i2 + 1) * 8) - i4;
        while (i5 < i2 * 8) {
            sb.append(tiVar.b[((int) (j >>> (i7 - i5))) & tiVar.c]);
            i5 += i4;
        }
        Character ch = this.b;
        if (ch != null) {
            while (i5 < tiVar.f * 8) {
                sb.append(ch.charValue());
                i5 += i4;
            }
        }
    }

    public void c(StringBuilder sb, byte[] bArr, int i) {
        int i2 = 0;
        ig2.v(0, i, bArr.length);
        while (i2 < i) {
            ti tiVar = this.a;
            b(sb, bArr, i2, Math.min(tiVar.f, i - i2));
            i2 += tiVar.f;
        }
    }

    public final CharSequence d(CharSequence charSequence) {
        charSequence.getClass();
        Character ch = this.b;
        if (ch == null) {
            return charSequence;
        }
        char cCharValue = ch.charValue();
        int length = charSequence.length() - 1;
        while (length >= 0 && charSequence.charAt(length) == cCharValue) {
            length--;
        }
        return charSequence.subSequence(0, length + 1);
    }

    public final boolean equals(Object obj) {
        if (obj instanceof xi) {
            xi xiVar = (xi) obj;
            if (this.a.equals(xiVar.a) && Objects.equals(this.b, xiVar.b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hashCode(this.b) ^ this.a.hashCode();
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("BaseEncoding.");
        ti tiVar = this.a;
        sb.append(tiVar);
        if (8 % tiVar.d != 0) {
            Character ch = this.b;
            if (ch == null) {
                sb.append(".omitPadding()");
            } else {
                sb.append(".withPadChar('");
                sb.append(ch);
                sb.append("')");
            }
        }
        return sb.toString();
    }

    public xi(String str, String str2) {
        this(new ti(str, str2.toCharArray()), (Character) '=');
    }
}
