package defpackage;

import java.util.concurrent.RejectedExecutionException;

/* JADX INFO: loaded from: classes4.dex */
public final class cr extends b3 {
    public br q;

    @Override // defpackage.y
    public final void h() {
        br brVar = this.q;
        if (brVar != null) {
            brVar.c();
        }
    }

    @Override // defpackage.b3
    public final void r() {
        br brVar = this.q;
        if (brVar != null) {
            try {
                brVar.c.execute(brVar);
            } catch (RejectedExecutionException e) {
                brVar.d.l(e);
            }
        }
    }

    @Override // defpackage.b3
    public final void v(int i) {
        if (i == 0) {
            throw null;
        }
        this.m = null;
        if (i == 1) {
            this.q = null;
        }
    }

    @Override // defpackage.b3
    public final void p(int i, Object obj) {
    }
}
