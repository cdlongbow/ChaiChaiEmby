package defpackage;

import java.util.Iterator;

/* JADX INFO: loaded from: classes4.dex */
public final class kv0 extends qd2 {
    public int a;
    public Object b;
    public final /* synthetic */ int c;
    public final Iterator d;
    public final /* synthetic */ Object e;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public kv0(bz1 bz1Var) {
        this();
        this.c = 1;
        this.e = bz1Var;
        this.d = bz1Var.a.iterator();
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    @Override // java.util.Iterator
    public final boolean hasNext() {
        Object next;
        ig2.w(this.a != 4);
        int iD = w11.D(this.a);
        if (iD == 0) {
            return true;
        }
        if (iD != 2) {
            this.a = 4;
            int i = this.c;
            Object obj = null;
            Object obj2 = this.e;
            Iterator it = this.d;
            switch (i) {
                case 0:
                    while (true) {
                        if (!it.hasNext()) {
                            this.a = 3;
                            break;
                        } else {
                            next = it.next();
                            if (((lp1) obj2).apply(next)) {
                                obj = next;
                                break;
                            }
                        }
                    }
                    break;
                default:
                    while (true) {
                        if (!it.hasNext()) {
                            this.a = 3;
                            break;
                        } else {
                            next = it.next();
                            if (((bz1) obj2).b.contains(next)) {
                                obj = next;
                                break;
                            }
                        }
                    }
                    break;
            }
            this.b = obj;
            if (this.a != 3) {
                this.a = 1;
                return true;
            }
        }
        return false;
    }

    @Override // java.util.Iterator
    public final Object next() {
        if (!hasNext()) {
            r02.p();
            return null;
        }
        this.a = 2;
        Object obj = this.b;
        this.b = null;
        return obj;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public kv0(Iterator it, lp1 lp1Var) {
        this();
        this.c = 0;
        this.d = it;
        this.e = lp1Var;
    }

    public kv0() {
        this.a = 2;
    }
}
