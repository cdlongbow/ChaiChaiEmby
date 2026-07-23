package defpackage;

import java.io.Serializable;

/* JADX INFO: loaded from: classes4.dex */
public final class rt0 implements Serializable {
    private static final long serialVersionUID = 0;
    public final Object[] a;

    public rt0(Object[] objArr) {
        this.a = objArr;
    }

    public Object readResolve() {
        Object[] objArr = this.a;
        int length = objArr.length;
        if (length != 0) {
            return length != 1 ? st0.i(objArr.length, (Object[]) objArr.clone()) : new m12(objArr[0]);
        }
        return kt1.k;
    }
}
