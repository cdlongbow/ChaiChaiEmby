package defpackage;

import android.graphics.Bitmap;

/* JADX INFO: loaded from: classes4.dex */
public abstract class is0 {
    public static final ri a;
    public static final ri b;
    public static final ri c;
    public static final ri d;
    public static final ri e;
    public static final ri f;
    public static final ri g;

    static {
        int i = 3;
        a = new ri(vb2.a, i);
        b = new ri(ce2.b, i);
        Object obj = null;
        c = new ri(obj, i);
        Boolean bool = Boolean.TRUE;
        d = new ri(bool, i);
        e = new ri(obj, i);
        f = new ri(bool, i);
        g = new ri(Boolean.FALSE, i);
    }

    public static final void a(bs0 bs0Var) {
        oi0 oi0VarB = bs0Var.b();
        oi0VarB.a.put(f, Boolean.FALSE);
    }

    public static final Bitmap.Config b(wa1 wa1Var) {
        return (Bitmap.Config) tl0.v(wa1Var, b);
    }
}
