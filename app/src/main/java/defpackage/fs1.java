package defpackage;

/* JADX INFO: loaded from: classes4.dex */
public final class fs1 implements AutoCloseable {
    public final fb0 a;

    public fs1(fb0 fb0Var) {
        this.a = fb0Var;
    }

    @Override // java.lang.AutoCloseable
    public final void close() {
        this.a.close();
    }
}
