package defpackage;

import java.io.Serializable;
import java.util.Map;

/* JADX INFO: loaded from: classes4.dex */
public final class et0 implements Serializable {
    private static final long serialVersionUID = 0;
    public final Object[] a;
    public final Object[] b;

    public et0(ft0 ft0Var) {
        int i = ((gt1) ft0Var).g;
        Object[] objArr = new Object[i];
        Object[] objArr2 = new Object[i];
        qd2 it = ft0Var.entrySet().iterator();
        int i2 = 0;
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            objArr[i2] = entry.getKey();
            objArr2[i2] = entry.getValue();
            i2++;
        }
        this.a = objArr;
        this.b = objArr2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final Object readResolve() {
        Object[] objArr = this.a;
        boolean z = objArr instanceof st0;
        Object[] objArr2 = this.b;
        if (!z) {
            dt0 dt0Var = new dt0(objArr.length);
            for (int i = 0; i < objArr.length; i++) {
                dt0Var.b(objArr[i], objArr2[i]);
            }
            return dt0Var.a(true);
        }
        st0 st0Var = (st0) objArr;
        dt0 dt0Var2 = new dt0(st0Var.size());
        qd2 it = st0Var.iterator();
        qd2 it2 = ((ts0) objArr2).iterator();
        while (it.hasNext()) {
            dt0Var2.b(it.next(), it2.next());
        }
        return dt0Var2.a(true);
    }
}
