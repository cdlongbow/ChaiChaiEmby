package defpackage;

/* JADX INFO: loaded from: classes4.dex */
public final class p extends tl0 {
    @Override // defpackage.tl0
    public final void N(x xVar, x xVar2) {
        xVar.b = xVar2;
    }

    @Override // defpackage.tl0
    public final void O(x xVar, Thread thread) {
        xVar.a = thread;
    }

    @Override // defpackage.tl0
    public final boolean c(y yVar, m mVar, m mVar2) {
        synchronized (yVar) {
            try {
                if (yVar.b != mVar) {
                    return false;
                }
                yVar.b = mVar2;
                return true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // defpackage.tl0
    public final boolean d(y yVar, Object obj, Object obj2) {
        synchronized (yVar) {
            try {
                if (yVar.a != obj) {
                    return false;
                }
                yVar.a = obj2;
                return true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // defpackage.tl0
    public final boolean e(y yVar, x xVar, x xVar2) {
        synchronized (yVar) {
            try {
                if (yVar.c != xVar) {
                    return false;
                }
                yVar.c = xVar2;
                return true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // defpackage.tl0
    public final m q(y yVar) {
        m mVar;
        m mVar2 = m.d;
        synchronized (yVar) {
            try {
                mVar = yVar.b;
                if (mVar != mVar2) {
                    yVar.b = mVar2;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return mVar;
    }

    @Override // defpackage.tl0
    public final x r(y yVar) {
        x xVar;
        x xVar2 = x.c;
        synchronized (yVar) {
            try {
                xVar = yVar.c;
                if (xVar != xVar2) {
                    yVar.c = xVar2;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return xVar;
    }
}
