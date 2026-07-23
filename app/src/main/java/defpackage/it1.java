package defpackage;

import java.io.Serializable;

/* JADX INFO: loaded from: classes4.dex */
public final class it1 implements Serializable {
    private static final long serialVersionUID = 0;
    public final Object[] a;
    public final int[] b;

    public it1(jt1 jt1Var) {
        int size = jt1Var.i().size();
        this.a = new Object[size];
        this.b = new int[size];
        int i = 0;
        for (g91 g91Var : jt1Var.i()) {
            this.a[i] = g91Var.a;
            this.b[i] = g91Var.a();
            i++;
        }
    }

    public Object readResolve() {
        Object[] objArr = this.a;
        int length = objArr.length;
        h91 h91Var = new h91();
        h91Var.d(length);
        for (int i = 0; i < objArr.length; i++) {
            Object obj = objArr[i];
            int i2 = this.b[i];
            if (i2 != 0) {
                obj.getClass();
                h91Var.e(obj, h91Var.b(obj) + i2);
            }
        }
        if (h91Var.c != 0) {
            return new jt1(h91Var);
        }
        int i3 = pt0.d;
        return jt1.i;
    }
}
