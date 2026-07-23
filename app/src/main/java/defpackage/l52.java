package defpackage;

/* JADX INFO: loaded from: classes4.dex */
public final class l52 implements j52 {
    public static final p00 d = new p00(4);
    public final Object a = new Object();
    public volatile j52 b;
    public Object c;

    public l52(j52 j52Var) {
        this.b = j52Var;
    }

    @Override // defpackage.j52
    public final Object get() {
        j52 j52Var = this.b;
        p00 p00Var = d;
        if (j52Var != p00Var) {
            synchronized (this.a) {
                try {
                    if (this.b != p00Var) {
                        Object obj = this.b.get();
                        this.c = obj;
                        this.b = p00Var;
                        return obj;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return this.c;
    }

    public final String toString() {
        Object obj = this.b;
        StringBuilder sb = new StringBuilder("Suppliers.memoize(");
        if (obj == d) {
            obj = "<supplier that returned " + this.c + ">";
        }
        sb.append(obj);
        sb.append(")");
        return sb.toString();
    }
}
