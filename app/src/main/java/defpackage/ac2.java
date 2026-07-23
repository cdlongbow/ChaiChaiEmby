package defpackage;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public final class ac2 implements ou, aj {
    public final boolean a;
    public final ArrayList b = new ArrayList();
    public final int c;
    public final mk0 d;
    public final mk0 e;
    public final mk0 f;

    public ac2(gj gjVar, yz1 yz1Var) {
        this.a = yz1Var.e;
        this.c = yz1Var.a;
        mk0 mk0VarA = yz1Var.b.a();
        this.d = mk0VarA;
        mk0 mk0VarA2 = yz1Var.c.a();
        this.e = mk0VarA2;
        mk0 mk0VarA3 = yz1Var.d.a();
        this.f = mk0VarA3;
        gjVar.e(mk0VarA);
        gjVar.e(mk0VarA2);
        gjVar.e(mk0VarA3);
        mk0VarA.a(this);
        mk0VarA2.a(this);
        mk0VarA3.a(this);
    }

    @Override // defpackage.aj
    public final void a() {
        int i = 0;
        while (true) {
            ArrayList arrayList = this.b;
            if (i >= arrayList.size()) {
                return;
            }
            ((aj) arrayList.get(i)).a();
            i++;
        }
    }

    public final void c(aj ajVar) {
        this.b.add(ajVar);
    }

    @Override // defpackage.ou
    public final void b(List list, List list2) {
    }
}
