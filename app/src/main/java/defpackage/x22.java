package defpackage;

import java.util.Iterator;

/* JADX INFO: loaded from: classes4.dex */
public final class x22 implements Iterator {
    public String b;
    public final CharSequence c;
    public final gp d;
    public int g;
    public final /* synthetic */ int h;
    public final /* synthetic */ ri i;
    public int a = 2;
    public int e = 0;

    public x22(ri riVar, y22 y22Var, CharSequence charSequence, int i) {
        this.h = i;
        this.i = riVar;
        this.d = y22Var.a;
        this.g = y22Var.c;
        this.c = charSequence;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        String string;
        int length;
        gp gpVar;
        ig2.w(this.a != 4);
        int iD = w11.D(this.a);
        if (iD == 0) {
            return true;
        }
        if (iD != 2) {
            this.a = 4;
            int i = this.e;
            while (true) {
                int length2 = this.e;
                if (length2 != -1) {
                    int i2 = this.h;
                    ri riVar = this.i;
                    CharSequence charSequence = this.c;
                    switch (i2) {
                        case 0:
                            dp dpVar = (dp) riVar.b;
                            int length3 = charSequence.length();
                            ig2.u(length2, length3);
                            while (true) {
                                if (length2 >= length3) {
                                    length2 = -1;
                                } else if (!dpVar.c(charSequence.charAt(length2))) {
                                    length2++;
                                }
                                break;
                            }
                            break;
                        default:
                            String str = (String) riVar.b;
                            int length4 = str.length();
                            int length5 = charSequence.length() - length4;
                            while (true) {
                                if (length2 > length5) {
                                    length2 = -1;
                                    break;
                                } else {
                                    int i3 = 0;
                                    while (true) {
                                        if (i3 >= length4) {
                                            break;
                                        } else if (charSequence.charAt(i3 + length2) != str.charAt(i3)) {
                                            length2++;
                                        } else {
                                            i3++;
                                        }
                                    }
                                }
                            }
                            break;
                    }
                    if (length2 == -1) {
                        length2 = charSequence.length();
                        this.e = -1;
                    } else {
                        switch (i2) {
                            case 0:
                                length = length2 + 1;
                                break;
                            default:
                                length = ((String) riVar.b).length() + length2;
                                break;
                        }
                        this.e = length;
                    }
                    int i4 = this.e;
                    if (i4 == i) {
                        int i5 = i4 + 1;
                        this.e = i5;
                        if (i5 > charSequence.length()) {
                            this.e = -1;
                        }
                    } else {
                        while (true) {
                            gpVar = this.d;
                            if (i < length2 && gpVar.c(charSequence.charAt(i))) {
                                i++;
                            }
                        }
                        while (length2 > i && gpVar.c(charSequence.charAt(length2 - 1))) {
                            length2--;
                        }
                        int i6 = this.g;
                        if (i6 == 1) {
                            length2 = charSequence.length();
                            this.e = -1;
                            while (length2 > i && gpVar.c(charSequence.charAt(length2 - 1))) {
                                length2--;
                            }
                        } else {
                            this.g = i6 - 1;
                        }
                        string = charSequence.subSequence(i, length2).toString();
                    }
                } else {
                    this.a = 3;
                    string = null;
                }
            }
            this.b = string;
            if (this.a != 3) {
                this.a = 1;
                return true;
            }
        }
        return false;
    }

    @Override // java.util.Iterator
    public final Object next() {
        if (!hasNext()) {
            r02.p();
            return null;
        }
        this.a = 2;
        String str = this.b;
        this.b = null;
        return str;
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException();
    }
}
