package defpackage;

/* JADX INFO: loaded from: classes4.dex */
public abstract class gp implements lp1 {
    public static String a(char c) {
        char[] cArr = new char[6];
        cArr[0] = '\\';
        cArr[1] = 'u';
        cArr[2] = 0;
        cArr[3] = 0;
        cArr[4] = 0;
        cArr[5] = 0;
        for (int i = 0; i < 4; i++) {
            cArr[5 - i] = "0123456789ABCDEF".charAt(c & 15);
            c = (char) (c >> 4);
        }
        return String.copyValueOf(cArr);
    }

    public static gp b(String str) {
        int length = str.length();
        if (length == 0) {
            return ap.g;
        }
        int i = 0;
        if (length != 1) {
            return length != 2 ? new bp(str) : new ep(str.charAt(0), str.charAt(1));
        }
        return new dp(str.charAt(0), i);
    }

    public abstract boolean c(char c);

    public gp d() {
        return new bp(this);
    }
}
