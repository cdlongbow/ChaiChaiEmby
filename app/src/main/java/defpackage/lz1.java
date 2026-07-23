package defpackage;

import android.graphics.Path;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public final class lz1 implements cd1, aj, bw0 {
    public final String b;
    public final boolean c;
    public final x11 d;
    public final sz1 e;
    public boolean f;
    public final Path a = new Path();
    public final va g = new va();

    public lz1(x11 x11Var, gj gjVar, uz1 uz1Var) {
        this.b = uz1Var.a;
        this.c = uz1Var.d;
        this.d = x11Var;
        sz1 sz1Var = new sz1(uz1Var.c.a);
        this.e = sz1Var;
        gjVar.e(sz1Var);
        sz1Var.a(this);
    }

    @Override // defpackage.aj
    public final void a() {
        this.f = false;
        this.d.invalidateSelf();
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0028  */
    /* JADX WARN: Code duplicated, block: B:12:0x002c A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:13:0x002e  */
    /* JADX WARN: Code duplicated, block: B:21:0x003d A[SYNTHETIC] */
    @Override // defpackage.ou
    public final void b(List list, List list2) {
        ArrayList arrayList = null;
        int i = 0;
        while (true) {
            ArrayList arrayList2 = (ArrayList) list;
            if (i >= arrayList2.size()) {
                this.e.m = arrayList;
                return;
            }
            ou ouVar = (ou) arrayList2.get(i);
            if (ouVar instanceof ac2) {
                ac2 ac2Var = (ac2) ouVar;
                if (ac2Var.c == 1) {
                    this.g.a.add(ac2Var);
                    ac2Var.c(this);
                } else if (!(ouVar instanceof bu1)) {
                    if (arrayList == null) {
                        arrayList = new ArrayList();
                    }
                    bu1 bu1Var = (bu1) ouVar;
                    bu1Var.b.a(this);
                    arrayList.add(bu1Var);
                }
            } else if (!(ouVar instanceof bu1)) {
                if (arrayList == null) {
                    arrayList = new ArrayList();
                }
                bu1 bu1Var2 = (bu1) ouVar;
                bu1Var2.b.a(this);
                arrayList.add(bu1Var2);
            }
            i++;
        }
    }

    @Override // defpackage.aw0
    public final void c(zv0 zv0Var, int i, ArrayList arrayList, zv0 zv0Var2) {
        s41.g(zv0Var, i, arrayList, zv0Var2, this);
    }

    @Override // defpackage.aw0
    public final void f(i21 i21Var, Object obj) {
        if (obj == c21.K) {
            this.e.j(i21Var);
        }
    }

    @Override // defpackage.ou

    @Override // defpackage.cd1
    public final Path getPath() {
        boolean z = this.f;
        sz1 sz1Var = this.e;
        Path path = this.a;
        if (z && sz1Var.e == null) {
            return path;
        }
        path.reset();
        if (this.c) {
            this.f = true;
            return path;
        }
        Path path2 = (Path) sz1Var.e();
        if (path2 == null) {
            return path;
        }
        path.set(path2);
        path.setFillType(Path.FillType.EVEN_ODD);
        this.g.d(path);
        this.f = true;
        return path;
    }
}
