package defpackage;

import java.io.Serializable;

/* JADX INFO: loaded from: classes4.dex */
public final class ot0 implements Serializable {
    public final pt0 a;

    public ot0(pt0 pt0Var) {
        this.a = pt0Var;
    }

    public Object readResolve() {
        return this.a.i();
    }
}
