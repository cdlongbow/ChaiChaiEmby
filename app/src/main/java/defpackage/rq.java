package defpackage;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public final class rq extends b3 {
    public List q;

    @Override // defpackage.b3
    public final void p(int i, Object obj) {
        List list = this.q;
        if (list != null) {
            list.set(i, new sq(obj));
        }
    }

    @Override // defpackage.b3
    public final void r() {
        List<sq> list = this.q;
        if (list != null) {
            int size = list.size();
            ig2.r(size, "initialArraySize");
            ArrayList arrayList = new ArrayList(size);
            for (sq sqVar : list) {
                arrayList.add(sqVar != null ? sqVar.a : null);
            }
            k(Collections.unmodifiableList(arrayList));
        }
    }

    @Override // defpackage.b3
    public final void v(int i) {
        if (i == 0) {
            throw null;
        }
        this.m = null;
        this.q = null;
    }
}
