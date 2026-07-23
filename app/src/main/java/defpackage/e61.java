package defpackage;

import java.io.Serializable;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes4.dex */
public final class e61 implements j52, Serializable {
    public final int a;

    public e61() {
        ig2.r(2, "expectedValuesPerKey");
        this.a = 2;
    }

    @Override // defpackage.j52
    public final Object get() {
        return new ArrayList(this.a);
    }
}
