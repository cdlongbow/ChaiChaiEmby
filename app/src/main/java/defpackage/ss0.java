package defpackage;

/* JADX INFO: loaded from: classes4.dex */
public abstract class ss0 {
    public static int b(int i, int i2) {
        if (i2 < 0) {
            ra.q("cannot store more than MAX_VALUE elements");
            return 0;
        }
        if (i2 <= i) {
            return i;
        }
        int iHighestOneBit = i + (i >> 1) + 1;
        if (iHighestOneBit < i2) {
            iHighestOneBit = Integer.highestOneBit(i2 - 1) << 1;
        }
        if (iHighestOneBit < 0) {
            return Integer.MAX_VALUE;
        }
        return iHighestOneBit;
    }

    public abstract ss0 a(Object obj);
}
