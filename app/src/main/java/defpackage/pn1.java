package defpackage;

import android.os.SystemClock;

/* JADX INFO: loaded from: classes4.dex */
public final class pn1 {
    public int a;
    public long b;
    public long c;

    public pn1() {
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        this.a = 0;
        this.b = 0L;
        this.c = jElapsedRealtime;
    }
}
