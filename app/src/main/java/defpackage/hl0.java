package defpackage;

import java.util.ArrayList;

/* JADX INFO: loaded from: classes4.dex */
public final class hl0 {
    public final ArrayList a;
    public final char b;
    public final double c;
    public final String d;
    public final String e;

    public hl0(ArrayList arrayList, char c, double d, String str, String str2) {
        this.a = arrayList;
        this.b = c;
        this.c = d;
        this.d = str;
        this.e = str2;
    }

    public static int a(String str, char c, String str2) {
        return str2.hashCode() + i02.i(c * 31, 31, str);
    }

    public final int hashCode() {
        return a(this.e, this.b, this.d);
    }
}
