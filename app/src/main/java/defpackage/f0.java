package defpackage;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;

/* JADX INFO: loaded from: classes4.dex */
public class f0 implements Iterator {
    public final /* synthetic */ int a = 0;
    public final Iterator b;
    public Object c;
    public final /* synthetic */ Object d;

    public f0(o0 o0Var) {
        this.d = o0Var;
        Collection collection = o0Var.b;
        this.c = collection;
        this.b = collection instanceof List ? ((List) collection).listIterator() : collection.iterator();
    }

    public void a() {
        o0 o0Var = (o0) this.d;
        o0Var.b();
        if (o0Var.b == ((Collection) this.c)) {
            return;
        }
        ra.e();
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        switch (this.a) {
            case 0:
                break;
            case 1:
                break;
            default:
                a();
                break;
        }
        return this.b.hasNext();
    }

    @Override // java.util.Iterator
    public final Object next() {
        int i = this.a;
        Iterator it = this.b;
        switch (i) {
            case 0:
                Map.Entry entry = (Map.Entry) it.next();
                this.c = (Collection) entry.getValue();
                return ((g0) this.d).a(entry);
            case 1:
                Map.Entry entry2 = (Map.Entry) it.next();
                this.c = entry2;
                return entry2.getKey();
            default:
                a();
                return it.next();
        }
    }

    @Override // java.util.Iterator
    public final void remove() {
        int i = this.a;
        Object obj = this.d;
        Iterator it = this.b;
        switch (i) {
            case 0:
                ig2.x(((Collection) this.c) != null, "no calls to next() since the last call to remove()");
                it.remove();
                ((g0) obj).d.g -= ((Collection) this.c).size();
                ((Collection) this.c).clear();
                this.c = null;
                break;
            case 1:
                ig2.x(((Map.Entry) this.c) != null, "no calls to next() since the last call to remove()");
                Collection collection = (Collection) ((Map.Entry) this.c).getValue();
                it.remove();
                ((h0) obj).b.g -= collection.size();
                collection.clear();
                this.c = null;
                break;
            default:
                it.remove();
                o0 o0Var = (o0) obj;
                o0Var.e.g--;
                o0Var.c();
                break;
        }
    }

    public f0(o0 o0Var, ListIterator listIterator) {
        this.d = o0Var;
        this.c = o0Var.b;
        this.b = listIterator;
    }

    public f0(h0 h0Var, Iterator it) {
        this.b = it;
        this.d = h0Var;
    }

    public f0(g0 g0Var) {
        this.d = g0Var;
        this.b = g0Var.c.entrySet().iterator();
    }
}
