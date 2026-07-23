package defpackage;

import java.lang.ref.SoftReference;

/* JADX INFO: loaded from: classes5.dex */
public final class yp extends ClassValue {
    @Override // java.lang.ClassValue
    public final Object computeValue(Class cls) {
        cls.getClass();
        k61 k61Var = new k61();
        k61Var.a = new SoftReference(null);
        return k61Var;
    }
}
