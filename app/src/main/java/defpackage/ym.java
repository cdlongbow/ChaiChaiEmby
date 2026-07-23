package defpackage;

import kotlin.reflect.KClass;

/* JADX INFO: loaded from: classes5.dex */
public abstract class ym {
    public static final at1 a(KClass kClass, xv0 xv0Var) {
        kClass.getClass();
        xv0Var.getClass();
        return new at1(kClass, xv0Var);
    }

    public static final xv0 b(xv0 xv0Var) {
        return xv0Var.getDescriptor().b() ? xv0Var : new f91(xv0Var);
    }
}
