package defpackage;

import java.util.Arrays;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public abstract class si implements db {
    public final List a;

    public si(List list) {
        this.a = list;
    }

    @Override // defpackage.db

    @Override // defpackage.db
    public final boolean c() {
        List list = this.a;
        return list.isEmpty() || (list.size() == 1 && ((dw0) list.get(0)).c());
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        List list = this.a;
        if (!list.isEmpty()) {
            sb.append("values=");
            sb.append(Arrays.toString(list.toArray()));
        }
        return sb.toString();
    }
}
