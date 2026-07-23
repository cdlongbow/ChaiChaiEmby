package defpackage;

/* JADX INFO: loaded from: classes4.dex */
public final class j {
    public static final j c;
    public static final j d;
    public final boolean a;
    public final Throwable b;

    static {
        if (y.d) {
            d = null;
            c = null;
        } else {
            d = new j(false, null);
            c = new j(true, null);
        }
    }

    public j(boolean z, Throwable th) {
        this.a = z;
        this.b = th;
    }
}
