package defpackage;

import java.util.Objects;
import java.util.Iterator;

/* JADX INFO: loaded from: classes4.dex */
public final class mt0 extends qd2 {
    public int a;
    public Object b;
    public final /* synthetic */ Iterator c;

    public mt0(qd2 qd2Var) {
        this.c = qd2Var;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.a > 0 || this.c.hasNext();
    }

    @Override // java.util.Iterator
    public final Object next() {
        if (this.a <= 0) {
            g91 g91Var = (g91) this.c.next();
            this.b = g91Var.a;
            this.a = g91Var.a();
        }
        this.a--;
        Object obj = this.b;
        Objects.requireNonNull(obj);
        return obj;
    }
}
