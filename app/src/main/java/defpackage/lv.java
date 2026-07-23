package defpackage;

import java.util.List;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes5.dex */
public final class lv extends mv {
    public final Function1 a;

    public lv(Function1 function1) {
        this.a = function1;
    }

    @Override // defpackage.mv
    public final xv0 a(List list) {
        list.getClass();
        return (xv0) this.a.invoke(list);
    }
}
