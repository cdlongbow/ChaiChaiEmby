package defpackage;

import java.util.Iterator;

/* JADX INFO: loaded from: classes5.dex */
public abstract class tq extends d {
    public final xv0 a;

    public tq(xv0 xv0Var) {
        this.a = xv0Var;
    }

    @Override // defpackage.d
    public final void g(xt xtVar, Object obj, int i, int i2) {
        if (i2 < 0) {
            ra.q("Size must be known in advance when using READ_ALL");
            return;
        }
        for (int i3 = 0; i3 < i2; i3++) {
            h(xtVar, i + i3, obj);
        }
    }

    @Override // defpackage.d
    public void h(xt xtVar, int i, Object obj) {
        k(i, obj, xtVar.decodeSerializableElement(getDescriptor(), i, this.a, null));
    }

    public abstract void k(int i, Object obj, Object obj2);

    @Override // defpackage.vw1
    public void serialize(wf0 wf0Var, Object obj) {
        int iE = e(obj);
        lw1 descriptor = getDescriptor();
        yt ytVarBeginCollection = wf0Var.beginCollection(descriptor, iE);
        Iterator itD = d(obj);
        for (int i = 0; i < iE; i++) {
            ytVarBeginCollection.encodeSerializableElement(getDescriptor(), i, this.a, itD.next());
        }
        ytVarBeginCollection.endStructure(descriptor);
    }
}
