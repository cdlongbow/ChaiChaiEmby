package defpackage;

import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: classes4.dex */
public final class dt0 {
    public Object[] a;
    public int b = 0;
    public ct0 c;

    public dt0(int i) {
        this.a = new Object[i * 2];
    }

    public final gt1 a(boolean z) {
        ct0 ct0Var;
        ct0 ct0Var2;
        if (z && (ct0Var2 = this.c) != null) {
            throw ct0Var2.a();
        }
        gt1 gt1VarF = gt1.f(this.b, this.a, this);
        if (!z || (ct0Var = this.c) == null) {
            return gt1VarF;
        }
        throw ct0Var.a();
    }

    public final void b(Object obj, Object obj2) {
        int i = (this.b + 1) * 2;
        Object[] objArr = this.a;
        if (i > objArr.length) {
            this.a = Arrays.copyOf(objArr, ss0.b(objArr.length, i));
        }
        ig2.q(obj, obj2);
        Object[] objArr2 = this.a;
        int i2 = this.b;
        int i3 = i2 * 2;
        objArr2[i3] = obj;
        objArr2[i3 + 1] = obj2;
        this.b = i2 + 1;
    }

    public final void c(Set set) {
        if (set instanceof Collection) {
            int size = (set.size() + this.b) * 2;
            Object[] objArr = this.a;
            if (size > objArr.length) {
                this.a = Arrays.copyOf(objArr, ss0.b(objArr.length, size));
            }
        }
        Iterator it = set.iterator();
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            b(entry.getKey(), entry.getValue());
        }
    }
}
