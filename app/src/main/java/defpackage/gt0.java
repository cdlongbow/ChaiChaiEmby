package defpackage;

import java.util.Objects;
import java.util.Map;

/* JADX INFO: loaded from: classes4.dex */
public final class gt0 extends qd2 {
    public final qd2 a;
    public Object b = null;
    public qd2 c = mv0.d;

    public gt0(lt0 lt0Var) {
        this.a = lt0Var.e.entrySet().iterator();
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.c.hasNext() || this.a.hasNext();
    }

    @Override // java.util.Iterator
    public final Object next() {
        if (!this.c.hasNext()) {
            Map.Entry entry = (Map.Entry) this.a.next();
            this.b = entry.getKey();
            this.c = ((ts0) entry.getValue()).iterator();
        }
        Object obj = this.b;
        Objects.requireNonNull(obj);
        return new us0(obj, this.c.next());
    }
}
