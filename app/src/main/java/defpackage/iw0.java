package defpackage;

import android.content.Context;

/* JADX INFO: loaded from: classes4.dex */
public abstract class iw0 {
    public static volatile r81 a;
    public static volatile j81 b;

    public static j81 a(Context context) {
        j81 j81Var;
        Context applicationContext = context.getApplicationContext();
        j81 j81Var2 = b;
        if (j81Var2 != null) {
            return j81Var2;
        }
        synchronized (j81.class) {
            try {
                j81Var = b;
                if (j81Var == null) {
                    j81Var = new j81(new g1(applicationContext, 15));
                    b = j81Var;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return j81Var;
    }
}
