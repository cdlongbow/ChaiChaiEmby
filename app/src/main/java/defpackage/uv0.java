package defpackage;


import java.io.EOFException;
import java.io.IOException;
import okio.Buffer;
import okio.BufferedSource;
import okio.ByteString;
import okio.Options;

/* JADX INFO: loaded from: classes4.dex */
public final class uv0 extends tv0 {
    public static final ByteString m = ByteString.encodeUtf8("'\\");
    public static final ByteString n = ByteString.encodeUtf8("\"\\");
    public static final ByteString o = ByteString.encodeUtf8("{}[]:, \n\t\r\f/\\;#=");
    public final BufferedSource g;
    public final Buffer h;
    public int i;
    public long j;
    public int k;
    public String l;

    static {
        ByteString.encodeUtf8("\n\r");
        ByteString.encodeUtf8("*/");
    }

    public uv0(BufferedSource bufferedSource) {
        this.b = new int[32];
        this.c = new String[32];
        this.d = new int[32];
        this.i = 0;
        if (bufferedSource == null) {
            n41.l("source == null");
            throw null;
        }
        this.g = bufferedSource;
        this.h = bufferedSource.getBufferField();
        m(6);
    }

    public final void A(ByteString byteString) throws IOException {
        while (true) {
            long jIndexOfElement = this.g.indexOfElement(byteString);
            if (jIndexOfElement == -1) {
                q("Unterminated string");
                throw null;
            }
            Buffer buffer = this.h;
            if (buffer.getByte(jIndexOfElement) != 92) {
                buffer.skip(jIndexOfElement + 1);
                return;
            } else {
                buffer.skip(jIndexOfElement + 1);
                z();
            }
        }
    }

    @Override // defpackage.tv0
    public final void b() {
        int iS = this.i;
        if (iS == 0) {
            iS = s();
        }
        if (iS != 3) {
            vm0.l(en0.D(l()), "Expected BEGIN_ARRAY but was ", f());
            return;
        }
        m(1);
        this.d[this.a - 1] = 0;
        this.i = 0;
    }

    @Override // defpackage.tv0
    public final void c() {
        int iS = this.i;
        if (iS == 0) {
            iS = s();
        }
        if (iS != 1) {
            vm0.l(en0.D(l()), "Expected BEGIN_OBJECT but was ", f());
        } else {
            m(3);
            this.i = 0;
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        this.i = 0;
        this.b[0] = 8;
        this.a = 1;
        this.h.clear();
        this.g.close();
    }

    @Override // defpackage.tv0
    public final void d() {
        int iS = this.i;
        if (iS == 0) {
            iS = s();
        }
        if (iS != 4) {
            vm0.l(en0.D(l()), "Expected END_ARRAY but was ", f());
            return;
        }
        int i = this.a;
        this.a = i - 1;
        int[] iArr = this.d;
        int i2 = i - 2;
        iArr[i2] = iArr[i2] + 1;
        this.i = 0;
    }

    @Override // defpackage.tv0
    public final void e() {
        int iS = this.i;
        if (iS == 0) {
            iS = s();
        }
        if (iS != 2) {
            vm0.l(en0.D(l()), "Expected END_OBJECT but was ", f());
            return;
        }
        int i = this.a;
        int i2 = i - 1;
        this.a = i2;
        this.c[i2] = null;
        int[] iArr = this.d;
        int i3 = i - 2;
        iArr[i3] = iArr[i3] + 1;
        this.i = 0;
    }

    @Override // defpackage.tv0
    public final boolean g() throws sv0, EOFException {
        int iS = this.i;
        if (iS == 0) {
            iS = s();
        }
        return (iS == 2 || iS == 4 || iS == 18) ? false : true;
    }

    @Override // defpackage.tv0
    public final boolean h() throws sv0, EOFException {
        int iS = this.i;
        if (iS == 0) {
            iS = s();
        }
        if (iS == 5) {
            this.i = 0;
            int[] iArr = this.d;
            int i = this.a - 1;
            iArr[i] = iArr[i] + 1;
            return true;
        }
        if (iS != 6) {
            vm0.l(en0.D(l()), "Expected a boolean but was ", f());
            return false;
        }
        this.i = 0;
        int[] iArr2 = this.d;
        int i2 = this.a - 1;
        iArr2[i2] = iArr2[i2] + 1;
        return false;
    }

    @Override // defpackage.tv0
    public final double i() {
        int iS = this.i;
        if (iS == 0) {
            iS = s();
        }
        if (iS == 16) {
            this.i = 0;
            int[] iArr = this.d;
            int i = this.a - 1;
            iArr[i] = iArr[i] + 1;
            return this.j;
        }
        if (iS == 17) {
            this.l = this.h.readUtf8(this.k);
        } else if (iS == 9) {
            this.l = x(n);
        } else if (iS == 8) {
            this.l = x(m);
        } else if (iS == 10) {
            this.l = y();
        } else if (iS != 11) {
            vm0.l(en0.D(l()), "Expected a double but was ", f());
            return 0.0d;
        }
        this.i = 11;
        try {
            double d = Double.parseDouble(this.l);
            if (Double.isNaN(d) || Double.isInfinite(d)) {
                throw new sv0("JSON forbids NaN and infinities: " + d + " at path " + f());
            }
            this.l = null;
            this.i = 0;
            int[] iArr2 = this.d;
            int i2 = this.a - 1;
            iArr2[i2] = iArr2[i2] + 1;
            return d;
        } catch (NumberFormatException unused) {
            vm0.l(this.l, "Expected a double but was ", f());
            return 0.0d;
        }
    }

    @Override // defpackage.tv0
    public final int j() {
        int iS = this.i;
        if (iS == 0) {
            iS = s();
        }
        if (iS == 16) {
            long j = this.j;
            int i = (int) j;
            if (j == i) {
                this.i = 0;
                int[] iArr = this.d;
                int i2 = this.a - 1;
                iArr[i2] = iArr[i2] + 1;
                return i;
            }
            throw new hr0("Expected an int but was " + this.j + " at path " + f());
        }
        if (iS == 17) {
            this.l = this.h.readUtf8(this.k);
        } else if (iS == 9 || iS == 8) {
            String strX = iS == 9 ? x(n) : x(m);
            this.l = strX;
            try {
                int i3 = Integer.parseInt(strX);
                this.i = 0;
                int[] iArr2 = this.d;
                int i4 = this.a - 1;
                iArr2[i4] = iArr2[i4] + 1;
                return i3;
            } catch (NumberFormatException unused) {
            }
        } else if (iS != 11) {
            vm0.l(en0.D(l()), "Expected an int but was ", f());
            return 0;
        }
        this.i = 11;
        try {
            double d = Double.parseDouble(this.l);
            int i5 = (int) d;
            if (i5 != d) {
                vm0.l(this.l, "Expected an int but was ", f());
                return 0;
            }
            this.l = null;
            this.i = 0;
            int[] iArr3 = this.d;
            int i6 = this.a - 1;
            iArr3[i6] = iArr3[i6] + 1;
            return i5;
        } catch (NumberFormatException unused2) {
            vm0.l(this.l, "Expected an int but was ", f());
            return 0;
        }
    }

    @Override // defpackage.tv0
    public final String k() {
        String utf8;
        int iS = this.i;
        if (iS == 0) {
            iS = s();
        }
        if (iS == 10) {
            utf8 = y();
        } else if (iS == 9) {
            utf8 = x(n);
        } else if (iS == 8) {
            utf8 = x(m);
        } else if (iS == 11) {
            utf8 = this.l;
            this.l = null;
        } else if (iS == 16) {
            utf8 = Long.toString(this.j);
        } else {
            if (iS != 17) {
                vm0.l(en0.D(l()), "Expected a string but was ", f());
                return null;
            }
            utf8 = this.h.readUtf8(this.k);
        }
        this.i = 0;
        int[] iArr = this.d;
        int i = this.a - 1;
        iArr[i] = iArr[i] + 1;
        return utf8;
    }

    @Override // defpackage.tv0
    public final int l() throws sv0, EOFException {
        int iS = this.i;
        if (iS == 0) {
            iS = s();
        }
        switch (iS) {
            case 1:
                return 3;
            case 2:
                return 4;
            case 3:
                return 1;
            case 4:
                return 2;
            case 5:
            case 6:
                return 8;
            case 7:
                return 9;
            case 8:
            case 9:
            case 10:
            case 11:
                return 6;
            case 12:
            case 13:
            case 14:
            case 15:
                return 5;
            case 16:
            case 17:
                return 7;
            case 18:
                return 10;
            default:
                throw new AssertionError();
        }
    }

    @Override // defpackage.tv0
    public final int n(aa aaVar) {
        int iS = this.i;
        if (iS == 0) {
            iS = s();
        }
        if (iS < 12 || iS > 15) {
            return -1;
        }
        if (iS == 15) {
            return t(this.l, aaVar);
        }
        int iSelect = this.g.select((Options) aaVar.b);
        if (iSelect != -1) {
            this.i = 0;
            this.c[this.a - 1] = ((String[]) aaVar.a)[iSelect];
            return iSelect;
        }
        String str = this.c[this.a - 1];
        String strV = v();
        int iT = t(strV, aaVar);
        if (iT == -1) {
            this.i = 15;
            this.l = strV;
            this.c[this.a - 1] = str;
        }
        return iT;
    }

    @Override // defpackage.tv0
    public final void o() {
        int iS = this.i;
        if (iS == 0) {
            iS = s();
        }
        if (iS == 14) {
            long jIndexOfElement = this.g.indexOfElement(o);
            Buffer buffer = this.h;
            if (jIndexOfElement == -1) {
                jIndexOfElement = buffer.size();
            }
            buffer.skip(jIndexOfElement);
        } else if (iS == 13) {
            A(n);
        } else if (iS == 12) {
            A(m);
        } else if (iS != 15) {
            vm0.l(en0.D(l()), "Expected a name but was ", f());
            return;
        }
        this.i = 0;
        this.c[this.a - 1] = "null";
    }

    @Override // defpackage.tv0
    public final void p() {
        int i = 0;
        do {
            int iS = this.i;
            if (iS == 0) {
                iS = s();
            }
            if (iS == 3) {
                m(1);
            } else {
                if (iS == 1) {
                    m(3);
                } else if (iS == 4) {
                    i--;
                    if (i < 0) {
                        vm0.l(en0.D(l()), "Expected a value but was ", f());
                        return;
                    }
                    this.a--;
                } else if (iS == 2) {
                    i--;
                    if (i < 0) {
                        vm0.l(en0.D(l()), "Expected a value but was ", f());
                        return;
                    }
                    this.a--;
                } else {
                    Buffer buffer = this.h;
                    if (iS == 14 || iS == 10) {
                        long jIndexOfElement = this.g.indexOfElement(o);
                        if (jIndexOfElement == -1) {
                            jIndexOfElement = buffer.size();
                        }
                        buffer.skip(jIndexOfElement);
                    } else if (iS == 9 || iS == 13) {
                        A(n);
                    } else if (iS == 8 || iS == 12) {
                        A(m);
                    } else if (iS == 17) {
                        buffer.skip(this.k);
                    } else if (iS == 18) {
                        vm0.l(en0.D(l()), "Expected a value but was ", f());
                        return;
                    }
                }
                this.i = 0;
            }
            i++;
            this.i = 0;
        } while (i != 0);
        int[] iArr = this.d;
        int i2 = this.a - 1;
        iArr[i2] = iArr[i2] + 1;
        this.c[i2] = "null";
    }

    public final void r() throws sv0 {
        q("Use JsonReader.setLenient(true) to accept malformed JSON");
        throw null;
    }

    /* JADX WARN: Code duplicated, block: B:148:0x01c5 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:149:0x01c7  */
    /* JADX WARN: Code duplicated, block: B:162:0x01e5  */
    /* JADX WARN: Code duplicated, block: B:164:0x01e9  */
    /* JADX WARN: Code duplicated, block: B:167:0x01ee  */
    /* JADX WARN: Code duplicated, block: B:172:0x01fa A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:173:0x01fb  */
    /* JADX WARN: Code duplicated, block: B:175:0x0207  */
    /* JADX WARN: Code duplicated, block: B:177:0x020d  */
    /* JADX WARN: Code duplicated, block: B:230:0x0160 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:231:0x01a4 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:87:0x011f A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:88:0x0120  */
    /* JADX WARN: Code duplicated, block: B:92:0x0132  */
    /* JADX WARN: Code duplicated, block: B:94:0x013b  */
    public final int s() throws sv0, EOFException {
        int i;
        String str;
        String str2;
        long j;
        char c;
        int i2;
        int i3;
        int i4;
        int i5;
        byte b;
        int i6;
        int[] iArr = this.b;
        int i7 = this.a - 1;
        int i8 = iArr[i7];
        int i9 = 0;
        Buffer buffer = this.h;
        if (i8 == 1) {
            iArr[i7] = 2;
        } else if (i8 == 2) {
            int iW = w(true);
            buffer.readByte();
            if (iW != 44) {
                if (iW == 59) {
                    r();
                    throw null;
                }
                if (iW == 93) {
                    this.i = 4;
                    return 4;
                }
                q("Unterminated array");
                throw null;
            }
        } else {
            if (i8 == 3 || i8 == 5) {
                iArr[i7] = 4;
                if (i8 == 5) {
                    int iW2 = w(true);
                    buffer.readByte();
                    if (iW2 != 44) {
                        if (iW2 == 59) {
                            r();
                            throw null;
                        }
                        if (iW2 == 125) {
                            this.i = 2;
                            return 2;
                        }
                        q("Unterminated object");
                        throw null;
                    }
                }
                int iW3 = w(true);
                if (iW3 == 34) {
                    buffer.readByte();
                    this.i = 13;
                    return 13;
                }
                if (iW3 == 39) {
                    buffer.readByte();
                    r();
                    throw null;
                }
                if (iW3 != 125) {
                    r();
                    throw null;
                }
                if (i8 == 5) {
                    q("Expected name");
                    throw null;
                }
                buffer.readByte();
                this.i = 2;
                return 2;
            }
            if (i8 == 4) {
                iArr[i7] = 5;
                int iW4 = w(true);
                buffer.readByte();
                if (iW4 != 58) {
                    if (iW4 != 61) {
                        q("Expected ':'");
                        throw null;
                    }
                    r();
                    throw null;
                }
            } else if (i8 == 6) {
                iArr[i7] = 7;
            } else {
                if (i8 == 7) {
                    if (w(false) == -1) {
                        this.i = 18;
                        return 18;
                    }
                    r();
                    throw null;
                }
                if (i8 == 8) {
                    rd1.o("JsonReader is closed");
                    return 0;
                }
            }
        }
        int iW5 = w(true);
        if (iW5 == 34) {
            buffer.readByte();
            this.i = 9;
            return 9;
        }
        if (iW5 == 39) {
            r();
            throw null;
        }
        if (iW5 != 44 && iW5 != 59) {
            if (iW5 == 91) {
                buffer.readByte();
                this.i = 3;
                return 3;
            }
            if (iW5 != 93) {
                if (iW5 == 123) {
                    buffer.readByte();
                    this.i = 1;
                    return 1;
                }
                byte b2 = buffer.getByte(0L);
                BufferedSource bufferedSource = this.g;
                if (b2 == 116 || b2 == 84) {
                    i = 5;
                    str2 = "true";
                    str = "TRUE";
                } else {
                    if (b2 != 102 && b2 != 70) {
                        if (b2 == 110 || b2 == 78) {
                            i = 7;
                            str2 = "null";
                            str = "NULL";
                        } else {
                            j = 0;
                            i = 0;
                            i9 = 0;
                        }
                        if (i != 0) {
                            return i;
                        }
                        int i10 = 1;
                        i2 = i9;
                        i3 = i2;
                        int i11 = i3;
                        long j2 = j;
                        while (true) {
                            i4 = i3 + 1;
                            if (bufferedSource.request(i4)) {
                                b = buffer.getByte(i3);
                                if (b != 43) {
                                    if (b != 69 || b == 101) {
                                        i6 = 6;
                                        if (i2 != 2 || i2 == 4) {
                                            i2 = 5;
                                            i3 = i4;
                                        } else {
                                            i5 = i9;
                                        }
                                    } else if (b == 45) {
                                        i6 = 6;
                                        if (i2 == 0) {
                                            i2 = 1;
                                            i11 = 1;
                                        } else {
                                            if (i2 != 5) {
                                                i5 = i9;
                                            }
                                            i2 = i6;
                                        }
                                        i3 = i4;
                                    } else if (b != 46) {
                                        if (b >= 48 && b <= 57) {
                                            if (i2 == 1 || i2 == 0) {
                                                i6 = 6;
                                                j2 = -(b - 48);
                                                i2 = 2;
                                            } else {
                                                if (i2 == 2) {
                                                    if (j2 != j) {
                                                        long j3 = (10 * j2) - ((long) (b - 48));
                                                        i10 &= (j2 > okio.internal.Buffer.OVERFLOW_ZONE || (j2 == okio.internal.Buffer.OVERFLOW_ZONE && j3 < j2)) ? 1 : i9;
                                                        j2 = j3;
                                                    }
                                                } else if (i2 == 3) {
                                                    i2 = 4;
                                                } else {
                                                    i6 = 6;
                                                    if (i2 == 5 || i2 == 6) {
                                                        i2 = 7;
                                                    }
                                                }
                                                i6 = 6;
                                                i3 = i4;
                                            }
                                            i3 = i4;
                                        } else if (!u(b)) {
                                        }
                                        i5 = i9;
                                    } else {
                                        i6 = 6;
                                        if (i2 == 2) {
                                            i2 = 3;
                                            i3 = i4;
                                        } else {
                                            i5 = i9;
                                        }
                                    }
                                    if (i5 != 0) {
                                        return i5;
                                    }
                                    if (u(buffer.getByte(j))) {
                                        r();
                                        throw null;
                                    }
                                    q("Expected value");
                                    throw null;
                                }
                                i6 = 6;
                                if (i2 != 5) {
                                    i5 = i9;
                                    if (i5 != 0) {
                                        return i5;
                                    }
                                    if (u(buffer.getByte(j))) {
                                        q("Expected value");
                                        throw null;
                                    }
                                    r();
                                    throw null;
                                }
                                i2 = i6;
                                i3 = i4;
                            }
                            if (i2 != 2 && i10 != 0 && ((j2 != Long.MIN_VALUE || i11 != 0) && (j2 != j || i11 == 0))) {
                                if (i11 == 0) {
                                    j2 = -j2;
                                }
                                this.j = j2;
                                buffer.skip(i3);
                                i5 = 16;
                                this.i = 16;
                            } else if (i2 != 2 || i2 == 4 || i2 == 7) {
                                this.k = i3;
                                i5 = 17;
                                this.i = 17;
                            } else {
                                i5 = i9;
                            }
                            if (i5 != 0) {
                                return i5;
                            }
                            if (u(buffer.getByte(j))) {
                                q("Expected value");
                                throw null;
                            }
                            r();
                            throw null;
                        }
                    }
                    i = 6;
                    str2 = "false";
                    str = "FALSE";
                }
                int length = str2.length();
                j = 0;
                int i12 = 1;
                while (true) {
                    if (i12 >= length) {
                        if (!bufferedSource.request(length + 1) || !u(buffer.getByte(length))) {
                            buffer.skip(length);
                            this.i = i;
                            break;
                        }
                    } else {
                        int i13 = i12 + 1;
                        if (bufferedSource.request(i13) && ((c = buffer.getByte(i12)) == str2.charAt(i12) || c == str.charAt(i12))) {
                            i12 = i13;
                        }
                    }
                    i = i9;
                    break;
                }
                if (i != 0) {
                    return i;
                }
                int i14 = 1;
                i2 = i9;
                i3 = i2;
                int i15 = i3;
                long j4 = j;
                while (true) {
                    i4 = i3 + 1;
                    if (bufferedSource.request(i4)) {
                        b = buffer.getByte(i3);
                        if (b != 43) {
                            if (b != 69) {
                                i6 = 6;
                                if (i2 != 2) {
                                }
                                i2 = 5;
                                i3 = i4;
                            } else {
                                i6 = 6;
                                if (i2 != 2) {
                                }
                                i2 = 5;
                                i3 = i4;
                            }
                            if (i5 != 0) {
                                return i5;
                            }
                            if (u(buffer.getByte(j))) {
                                q("Expected value");
                                throw null;
                            }
                            r();
                            throw null;
                        }
                        i6 = 6;
                        if (i2 != 5) {
                            i5 = i9;
                            if (i5 != 0) {
                                return i5;
                            }
                            if (u(buffer.getByte(j))) {
                                q("Expected value");
                                throw null;
                            }
                            r();
                            throw null;
                        }
                        i2 = i6;
                        i3 = i4;
                    }
                    if (i2 != 2) {
                        if (i2 != 2) {
                        }
                        this.k = i3;
                        i5 = 17;
                        this.i = 17;
                    } else {
                        if (i2 != 2) {
                        }
                        this.k = i3;
                        i5 = 17;
                        this.i = 17;
                    }
                    if (i5 != 0) {
                        return i5;
                    }
                    if (u(buffer.getByte(j))) {
                        q("Expected value");
                        throw null;
                    }
                    r();
                    throw null;
                }
            }
            if (i8 == 1) {
                buffer.readByte();
                this.i = 4;
                return 4;
            }
        }
        if (i8 == 1 || i8 == 2) {
            r();
            throw null;
        }
        q("Unexpected value");
        throw null;
    }

    public final int t(String str, aa aaVar) {
        int length = ((String[]) aaVar.a).length;
        for (int i = 0; i < length; i++) {
            if (str.equals(((String[]) aaVar.a)[i])) {
                this.i = 0;
                this.c[this.a - 1] = str;
                return i;
            }
        }
        return -1;
    }

    public final String toString() {
        return "JsonReader(" + this.g + ")";
    }

    public final boolean u(int i) throws sv0 {
        if (i == 9 || i == 10 || i == 12 || i == 13 || i == 32) {
            return false;
        }
        if (i != 35) {
            if (i == 44) {
                return false;
            }
            if (i != 47 && i != 61) {
                if (i == 123 || i == 125 || i == 58) {
                    return false;
                }
                if (i != 59) {
                    switch (i) {
                        case Input.Keys.MUTE /* 91 */:
                        case Input.Keys.PAGE_DOWN /* 93 */:
                            return false;
                        case Input.Keys.PAGE_UP /* 92 */:
                            break;
                        default:
                            return true;
                    }
                }
            }
        }
        r();
        throw null;
    }

    public final String v() throws IOException {
        String strX;
        int iS = this.i;
        if (iS == 0) {
            iS = s();
        }
        if (iS == 14) {
            strX = y();
        } else if (iS == 13) {
            strX = x(n);
        } else if (iS == 12) {
            strX = x(m);
        } else {
            if (iS != 15) {
                vm0.l(en0.D(l()), "Expected a name but was ", f());
                return null;
            }
            strX = this.l;
        }
        this.i = 0;
        this.c[this.a - 1] = strX;
        return strX;
    }

    public final int w(boolean z) throws sv0, EOFException {
        int i = 0;
        while (true) {
            int i2 = i + 1;
            BufferedSource bufferedSource = this.g;
            if (!bufferedSource.request(i2)) {
                if (z) {
                    throw new EOFException("End of input");
                }
                return -1;
            }
            long j = i;
            Buffer buffer = this.h;
            byte b = buffer.getByte(j);
            if (b != 10 && b != 32 && b != 13 && b != 9) {
                buffer.skip(j);
                if (b == 47) {
                    if (bufferedSource.request(2L)) {
                        r();
                        throw null;
                    }
                } else if (b == 35) {
                    r();
                    throw null;
                }
                return b;
            }
            i = i2;
        }
    }

    public final String x(ByteString byteString) throws IOException {
        StringBuilder sb = null;
        while (true) {
            long jIndexOfElement = this.g.indexOfElement(byteString);
            if (jIndexOfElement == -1) {
                q("Unterminated string");
                throw null;
            }
            Buffer buffer = this.h;
            if (buffer.getByte(jIndexOfElement) != 92) {
                if (sb == null) {
                    String utf8 = buffer.readUtf8(jIndexOfElement);
                    buffer.readByte();
                    return utf8;
                }
                sb.append(buffer.readUtf8(jIndexOfElement));
                buffer.readByte();
                return sb.toString();
            }
            if (sb == null) {
                sb = new StringBuilder();
            }
            sb.append(buffer.readUtf8(jIndexOfElement));
            buffer.readByte();
            sb.append(z());
        }
    }

    public final String y() throws IOException {
        long jIndexOfElement = this.g.indexOfElement(o);
        Buffer buffer = this.h;
        return jIndexOfElement != -1 ? buffer.readUtf8(jIndexOfElement) : buffer.readUtf8();
    }

    public final char z() throws sv0, EOFException {
        int i;
        BufferedSource bufferedSource = this.g;
        if (!bufferedSource.request(1L)) {
            q("Unterminated escape sequence");
            throw null;
        }
        Buffer buffer = this.h;
        byte b = buffer.readByte();
        if (b == 10 || b == 34 || b == 39 || b == 47 || b == 92) {
            return (char) b;
        }
        if (b == 98) {
            return '\b';
        }
        if (b == 102) {
            return '\f';
        }
        if (b == 110) {
            return '\n';
        }
        if (b == 114) {
            return '\r';
        }
        if (b == 116) {
            return '\t';
        }
        if (b != 117) {
            q("Invalid escape sequence: \\" + ((char) b));
            throw null;
        }
        if (!bufferedSource.request(4L)) {
            throw new EOFException("Unterminated escape sequence at path ".concat(f()));
        }
        char c = 0;
        for (int i2 = 0; i2 < 4; i2++) {
            byte b2 = buffer.getByte(i2);
            char c2 = (char) (c << 4);
            if (b2 >= 48 && b2 <= 57) {
                i = b2 - 48;
            } else if (b2 >= 97 && b2 <= 102) {
                i = b2 - 87;
            } else {
                if (b2 < 65 || b2 > 70) {
                    q("\\u" + buffer.readUtf8(4L));
                    throw null;
                }
                i = b2 - 55;
            }
            c = (char) (i + c2);
        }
        buffer.skip(4L);
        return c;
    }
}
