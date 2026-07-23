package defpackage;

import io.github.peerless2012.ass.AssFrame;
import io.github.peerless2012.ass.AssRender;

/* JADX INFO: loaded from: classes4.dex */
public final class ge implements Runnable {
    public final AssRender a;
    public boolean b;
    public long c;
    public he d;
    public ud e;

    public ge(AssRender assRender) {
        assRender.getClass();
        this.a = assRender;
        this.d = he.a;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.b = true;
        try {
            AssFrame assFrameRenderFrame = this.a.renderFrame(this.c / 1000, this.d);
            ud udVar = this.e;
            if (udVar != null) {
                udVar.invoke(assFrameRenderFrame);
            }
        } catch (Exception unused) {
            ud udVar2 = this.e;
            if (udVar2 != null) {
                udVar2.invoke(null);
            }
        } catch (Throwable th) {
            ud udVar3 = this.e;
            if (udVar3 != null) {
                udVar3.invoke(null);
            }
            this.b = false;
            this.e = null;
            throw th;
        }
        this.b = false;
        this.e = null;
    }
}
