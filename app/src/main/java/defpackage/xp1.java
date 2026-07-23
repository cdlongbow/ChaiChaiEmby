package defpackage;

import java.util.Iterator;

/* JADX INFO: loaded from: classes5.dex */
public abstract class xp1 extends tq {
    public final wp1 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public xp1(xv0 xv0Var) {
        super(xv0Var);
        xv0Var.getClass();
        this.b = new wp1(xv0Var.getDescriptor());
    }

    @Override // defpackage.d
    public final Object a() {
        return (vp1) i(l());
    }

    @Override // defpackage.d
    public final int b(Object obj) {
        vp1 vp1Var = (vp1) obj;
        vp1Var.getClass();
        return vp1Var.d();
    }

    @Override // defpackage.d
    public final void c(int i, Object obj) {
        vp1 vp1Var = (vp1) obj;
        vp1Var.getClass();
        vp1Var.b(i);
    }

    @Override // defpackage.d
    public final Iterator d(Object obj) {
        throw new IllegalStateException("This method lead to boxing and must not be used, use writeContents instead");
    }

    @Override // defpackage.d, defpackage.l40
    public final Object deserialize(b20 b20Var) {
        b20Var.getClass();
        return f(b20Var);
    }

    @Override // defpackage.vw1, defpackage.l40

    @Override // defpackage.d
    public final Object j(Object obj) {
        vp1 vp1Var = (vp1) obj;
        vp1Var.getClass();
        return vp1Var.a();
    }

    @Override // defpackage.tq
    public final void k(int i, Object obj, Object obj2) {
        ((vp1) obj).getClass();
        throw new IllegalStateException("This method lead to boxing and must not be used, use Builder.append instead");
    }

    public abstract Object l();

    public abstract void m(yt ytVar, Object obj, int i);

    @Override // defpackage.tq, defpackage.vw1
    public final void serialize(wf0 wf0Var, Object obj) {
        int iE = e(obj);
        wp1 wp1Var = this.b;
        yt ytVarBeginCollection = wf0Var.beginCollection(wp1Var, iE);
        m(ytVarBeginCollection, obj, iE);
        ytVarBeginCollection.endStructure(wp1Var);
    }
}
