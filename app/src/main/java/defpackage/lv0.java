package defpackage;

import java.util.Iterator;

/* JADX INFO: loaded from: classes4.dex */
public final class lv0 extends sb2 {
    public final /* synthetic */ xl0 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public lv0(Iterator it, xl0 xl0Var) {
        super(it);
        this.b = xl0Var;
    }

    @Override // defpackage.sb2
    public final Object a(Object obj) {
        return this.b.apply(obj);
    }
}
