package defpackage;

import java.util.Iterator;

/* JADX INFO: loaded from: classes5.dex */
public abstract class d implements xv0 {
    public abstract Object a();

    public abstract int b(Object obj);

    public abstract void c(int i, Object obj);

    public abstract Iterator d(Object obj);

    @Override // defpackage.l40
    public Object deserialize(b20 b20Var) {
        b20Var.getClass();
        return f(b20Var);
    }

    public abstract int e(Object obj);

    public final Object f(b20 b20Var) {
        b20Var.getClass();
        Object objA = a();
        int iB = b(objA);
        xt xtVarBeginStructure = b20Var.beginStructure(getDescriptor());
        if (!xtVarBeginStructure.decodeSequentially()) {
            while (true) {
                int iDecodeElementIndex = xtVarBeginStructure.decodeElementIndex(getDescriptor());
                if (iDecodeElementIndex == -1) {
                    break;
                }
                h(xtVarBeginStructure, iDecodeElementIndex + iB, objA);
            }
        } else {
            int iDecodeCollectionSize = xtVarBeginStructure.decodeCollectionSize(getDescriptor());
            c(iDecodeCollectionSize, objA);
            g(xtVarBeginStructure, objA, iB, iDecodeCollectionSize);
        }
        xtVarBeginStructure.endStructure(getDescriptor());
        return j(objA);
    }

    public abstract void g(xt xtVar, Object obj, int i, int i2);

    public abstract void h(xt xtVar, int i, Object obj);

    public abstract Object i(Object obj);

    public abstract Object j(Object obj);
}
