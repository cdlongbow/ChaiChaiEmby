package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class v0 extends x0 {
    @Override // defpackage.x0
    public final Object p(Object obj, Object obj2) {
        ze zeVar = (ze) obj;
        f01 f01VarApply = zeVar.apply(obj2);
        if (f01VarApply != null) {
            return f01VarApply;
        }
        n41.l(hg2.D("AsyncFunction.apply returned null instead of a Future. Did you mean to return immediateFuture(null)? %s", zeVar));
        return null;
    }

    @Override // defpackage.x0
    public final void q(Object obj) {
        m((f01) obj);
    }
}
