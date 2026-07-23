package defpackage;

import androidx.media3.exoplayer.upstream.CmcdData;
import java.security.AccessController;
import java.security.PrivilegedActionException;

/* JADX INFO: loaded from: classes4.dex */
public final class w extends tl0 {
    public static final Unsafe c;
    public static final long d;
    public static final long e;
    public static final long f;
    public static final long g;
    public static final long h;

    static {
        Unsafe unsafe;
        try {
            try {
                unsafe = Unsafe.getUnsafe();
            } catch (SecurityException unused) {
                unsafe = (Unsafe) AccessController.doPrivileged(new v());
            }
            try {
                e = unsafe.objectFieldOffset(y.class.getDeclaredField("c"));
                d = unsafe.objectFieldOffset(y.class.getDeclaredField("b"));
                f = unsafe.objectFieldOffset(y.class.getDeclaredField(CmcdData.OBJECT_TYPE_AUDIO_ONLY));
                g = unsafe.objectFieldOffset(x.class.getDeclaredField(CmcdData.OBJECT_TYPE_AUDIO_ONLY));
                h = unsafe.objectFieldOffset(x.class.getDeclaredField("b"));
                c = unsafe;
            } catch (NoSuchFieldException e2) {
                vm0.p(e2);
            }
        } catch (PrivilegedActionException e3) {
            rd1.w("Could not initialize intrinsics", e3.getCause());
        }
    }

    @Override // defpackage.tl0
    public final void N(x xVar, x xVar2) {
        c.putObject(xVar, h, xVar2);
    }

    @Override // defpackage.tl0
    public final void O(x xVar, Thread thread) {
        c.putObject(xVar, g, thread);
    }

    @Override // defpackage.tl0
    public final boolean c(y yVar, m mVar, m mVar2) {
        return t.a(c, yVar, d, mVar, mVar2);
    }

    @Override // defpackage.tl0
    public final boolean d(y yVar, Object obj, Object obj2) {
        return u.a(c, yVar, f, obj, obj2);
    }

    @Override // defpackage.tl0
    public final boolean e(y yVar, x xVar, x xVar2) {
        return s.a(c, yVar, e, xVar, xVar2);
    }

    @Override // defpackage.tl0
    public final m q(y yVar) {
        m mVar;
        m mVar2 = m.d;
        do {
            mVar = yVar.b;
            if (mVar2 == mVar) {
                break;
            }
        } while (!c(yVar, mVar, mVar2));
        return mVar;
    }

    @Override // defpackage.tl0
    public final x r(y yVar) {
        x xVar;
        x xVar2 = x.c;
        do {
            xVar = yVar.c;
            if (xVar2 == xVar) {
                break;
            }
        } while (!e(yVar, xVar, xVar2));
        return xVar;
    }
}
