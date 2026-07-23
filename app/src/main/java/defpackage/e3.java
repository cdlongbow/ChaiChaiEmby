package defpackage;

import androidx.media3.exoplayer.upstream.CmcdData;
import java.util.Set;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import java.util.logging.Level;

/* JADX INFO: loaded from: classes4.dex */
public abstract class e3 extends r {
    public static final ig2 k;
    public static final gx0 l = new gx0(e3.class);
    public volatile Set i;
    public volatile int j;

    static {
        Throwable th;
        ig2 d3Var;
        try {
            d3Var = new c3(AtomicReferenceFieldUpdater.newUpdater(e3.class, Set.class, CmcdData.OBJECT_TYPE_INIT_SEGMENT), AtomicIntegerFieldUpdater.newUpdater(e3.class, "j"));
            th = null;
        } catch (Throwable th2) {
            th = th2;
            d3Var = new d3(2);
        }
        k = d3Var;
        if (th != null) {
            l.a().log(Level.SEVERE, "SafeAtomicHelper is broken!", th);
        }
    }
}
