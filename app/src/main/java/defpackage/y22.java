package defpackage;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public final class y22 {
    public final gp a;
    public final ri b;
    public final int c;

    public y22(ri riVar) {
        ap apVar = ap.g;
        this.b = riVar;
        this.a = apVar;
        this.c = Integer.MAX_VALUE;
    }

    public static y22 a(String str) {
        ig2.m(str.length() != 0, "The separator may not be the empty string.");
        return str.length() == 1 ? new y22(new ri(new dp(str.charAt(0), 0), 15)) : new y22(new ri(str, 16));
    }

    public final List b(CharSequence charSequence) {
        x22 x22Var;
        charSequence.getClass();
        ri riVar = this.b;
        switch (riVar.a) {
            case 15:
                x22Var = new x22(riVar, this, charSequence, 0);
                break;
            default:
                x22Var = new x22(riVar, this, charSequence, 1);
                break;
        }
        ArrayList arrayList = new ArrayList();
        while (x22Var.hasNext()) {
            arrayList.add((String) x22Var.next());
        }
        return Collections.unmodifiableList(arrayList);
    }
}
