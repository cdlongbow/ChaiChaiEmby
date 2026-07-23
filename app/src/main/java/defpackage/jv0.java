package defpackage;

import java.util.Iterator;

/* JADX INFO: loaded from: classes3.dex */
public final class jv0 extends dl0 {
    public final /* synthetic */ Iterable a;
    public final /* synthetic */ o b;

    public jv0(Iterable iterable, o oVar) {
        this.a = iterable;
        this.b = oVar;
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        Iterator it = this.a.iterator();
        it.getClass();
        return new kv0(it, this.b);
    }
}
