package defpackage;

import java.util.Iterator;
import java.util.Map;

/* JADX INFO: loaded from: classes4.dex */
public final class n31 extends sb2 {
    public final /* synthetic */ int b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ n31(Iterator it, int i) {
        super(it);
        this.b = i;
    }

    @Override // defpackage.sb2
    public final Object a(Object obj) {
        switch (this.b) {
            case 0:
                return ((Map.Entry) obj).getKey();
            default:
                return ((Map.Entry) obj).getValue();
        }
    }
}
