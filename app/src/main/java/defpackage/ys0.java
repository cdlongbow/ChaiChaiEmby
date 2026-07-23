package defpackage;

import java.io.Serializable;

/* JADX INFO: loaded from: classes4.dex */
public final class ys0 implements Serializable {
    private static final long serialVersionUID = 0;
    public final Object[] a;

    public ys0(Object[] objArr) {
        this.a = objArr;
    }

    public Object readResolve() {
        return at0.m(this.a);
    }
}
