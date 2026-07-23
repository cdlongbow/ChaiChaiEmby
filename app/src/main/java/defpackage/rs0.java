package defpackage;

import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;

/* JADX INFO: loaded from: classes4.dex */
public abstract class rs0 extends ss0 {
    public Object[] a;
    public int b;
    public boolean c;

    public rs0(int i) {
        ig2.r(i, "initialCapacity");
        this.a = new Object[i];
        this.b = 0;
    }

    public final void c(Object obj) {
        obj.getClass();
        e(1);
        Object[] objArr = this.a;
        int i = this.b;
        this.b = i + 1;
        objArr[i] = obj;
    }

    public final void d(Iterable iterable) {
        if (iterable instanceof Collection) {
            Collection collection = (Collection) iterable;
            e(collection.size());
            if (collection instanceof ts0) {
                this.b = ((ts0) collection).b(this.b, this.a);
                return;
            }
        }
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            a(it.next());
        }
    }

    public final void e(int i) {
        Object[] objArr = this.a;
        int iB = ss0.b(objArr.length, this.b + i);
        if (iB > objArr.length || this.c) {
            this.a = Arrays.copyOf(this.a, iB);
            this.c = false;
        }
    }
}
