package defpackage;

import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Matrix;
import android.graphics.Path;
import android.graphics.RectF;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public final class pu implements vc0, cd1, aj, aw0 {
    public final l91 a;
    public final RectF b;
    public final m91 c;
    public final Matrix d;
    public final Path e;
    public final RectF f;
    public final String g;
    public final boolean h;
    public final ArrayList i;
    public final x11 j;
    public ArrayList k;
    public final pb2 l;

    public pu(x11 x11Var, gj gjVar, String str, boolean z, ArrayList arrayList, bb bbVar) {
        this.a = new l91(0);
        this.b = new RectF();
        this.c = new m91();
        this.d = new Matrix();
        this.e = new Path();
        this.f = new RectF();
        this.g = str;
        this.j = x11Var;
        this.h = z;
        this.i = arrayList;
        if (bbVar != null) {
            pb2 pb2Var = new pb2(bbVar);
            this.l = pb2Var;
            pb2Var.a(gjVar);
            pb2Var.b(this);
        }
        ArrayList arrayList2 = new ArrayList();
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            ou ouVar = (ou) arrayList.get(size);
            if (ouVar instanceof tm0) {
                arrayList2.add((tm0) ouVar);
            }
        }
        for (int size2 = arrayList2.size() - 1; size2 >= 0; size2--) {
            ((tm0) arrayList2.get(size2)).e(arrayList.listIterator(arrayList.size()));
        }
    }

    @Override // defpackage.aj
    public final void a() {
        this.j.invalidateSelf();
    }

    @Override // defpackage.ou
    public final void b(List list, List list2) {
        int size = list.size();
        ArrayList arrayList = this.i;
        ArrayList arrayList2 = new ArrayList(arrayList.size() + size);
        arrayList2.addAll(list);
        for (int size2 = arrayList.size() - 1; size2 >= 0; size2--) {
            ou ouVar = (ou) arrayList.get(size2);
            ouVar.b(arrayList2, arrayList.subList(0, size2));
            arrayList2.add(ouVar);
        }
    }

    @Override // defpackage.aw0
    public final void c(zv0 zv0Var, int i, ArrayList arrayList, zv0 zv0Var2) {
        String str = this.g;
        if (!zv0Var.c(i, str) && !"__container".equals(str)) {
            return;
        }
        if (!"__container".equals(str)) {
            zv0 zv0Var3 = new zv0(zv0Var2);
            zv0Var3.a.add(str);
            if (zv0Var.a(i, str)) {
                zv0 zv0Var4 = new zv0(zv0Var3);
                zv0Var4.b = this;
                arrayList.add(zv0Var4);
            }
            zv0Var2 = zv0Var3;
        }
        if (!zv0Var.d(i, str)) {
            return;
        }
        int iB = zv0Var.b(i, str) + i;
        int i2 = 0;
        while (true) {
            ArrayList arrayList2 = this.i;
            if (i2 >= arrayList2.size()) {
                return;
            }
            ou ouVar = (ou) arrayList2.get(i2);
            if (ouVar instanceof aw0) {
                ((aw0) ouVar).c(zv0Var, iB, arrayList, zv0Var2);
            }
            i2++;
        }
    }

    @Override // defpackage.vc0
    public final void d(RectF rectF, Matrix matrix, boolean z) {
        Matrix matrix2 = this.d;
        matrix2.set(matrix);
        pb2 pb2Var = this.l;
        if (pb2Var != null) {
            matrix2.preConcat(pb2Var.e());
        }
        RectF rectF2 = this.f;
        rectF2.set(0.0f, 0.0f, 0.0f, 0.0f);
        ArrayList arrayList = this.i;
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            ou ouVar = (ou) arrayList.get(size);
            if (ouVar instanceof vc0) {
                ((vc0) ouVar).d(rectF2, matrix2, z);
                rectF.union(rectF2);
            }
        }
    }

    public final List e() {
        if (this.k == null) {
            this.k = new ArrayList();
            int i = 0;
            while (true) {
                ArrayList arrayList = this.i;
                if (i >= arrayList.size()) {
                    break;
                }
                ou ouVar = (ou) arrayList.get(i);
                if (ouVar instanceof cd1) {
                    this.k.add((cd1) ouVar);
                }
                i++;
            }
        }
        return this.k;
    }

    @Override // defpackage.aw0
    public final void f(i21 i21Var, Object obj) {
        pb2 pb2Var = this.l;
        if (pb2Var != null) {
            pb2Var.c(i21Var, obj);
        }
    }

    @Override // defpackage.vc0
    public final void g(Canvas canvas, Matrix matrix, int i, yc0 yc0Var) {
        if (this.h) {
            return;
        }
        Matrix matrix2 = this.d;
        matrix2.set(matrix);
        pb2 pb2Var = this.l;
        if (pb2Var != null) {
            matrix2.preConcat(pb2Var.e());
            ej ejVar = pb2Var.j;
            i = (int) (((((ejVar == null ? 100 : ((Integer) ejVar.e()).intValue()) / 100.0f) * i) / 255.0f) * 255.0f);
        }
        x11 x11Var = this.j;
        boolean z = (x11Var.t && h() && i != 255) || (yc0Var != null && x11Var.u && h());
        int i2 = z ? 255 : i;
        m91 m91Var = this.c;
        if (z) {
            RectF rectF = this.b;
            rectF.set(0.0f, 0.0f, 0.0f, 0.0f);
            d(rectF, matrix, true);
            l91 l91Var = this.a;
            l91Var.a = i;
            if (yc0Var != null) {
                if (Color.alpha(yc0Var.d) > 0) {
                    l91Var.b = yc0Var;
                } else {
                    l91Var.b = null;
                }
                yc0Var = null;
            } else {
                l91Var.b = null;
            }
            canvas = m91Var.e(canvas, rectF, l91Var);
        } else if (yc0Var != null) {
            yc0 yc0Var2 = new yc0(yc0Var);
            yc0Var2.b(i2);
            yc0Var = yc0Var2;
        }
        ArrayList arrayList = this.i;
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            Object obj = arrayList.get(size);
            if (obj instanceof vc0) {
                ((vc0) obj).g(canvas, matrix2, i2, yc0Var);
            }
        }
        if (z) {
            m91Var.c();
        }
    }

    @Override // defpackage.ou
    public final String getName() {
        throw null;
    }

    @Override // defpackage.cd1
    public final Path getPath() {
        Matrix matrix = this.d;
        matrix.reset();
        pb2 pb2Var = this.l;
        if (pb2Var != null) {
            matrix.set(pb2Var.e());
        }
        Path path = this.e;
        path.reset();
        if (!this.h) {
            ArrayList arrayList = this.i;
            for (int size = arrayList.size() - 1; size >= 0; size--) {
                ou ouVar = (ou) arrayList.get(size);
                if (ouVar instanceof cd1) {
                    path.addPath(((cd1) ouVar).getPath(), matrix);
                }
            }
        }
        return path;
    }

    public final boolean h() {
        int i = 0;
        int i2 = 0;
        while (true) {
            ArrayList arrayList = this.i;
            if (i >= arrayList.size()) {
                return false;
            }
            if ((arrayList.get(i) instanceof vc0) && (i2 = i2 + 1) >= 2) {
                return true;
            }
            i++;
        }
    }

    public pu(x11 x11Var, gj gjVar, qz1 qz1Var, g11 g11Var) {
        bb bbVar;
        String str = qz1Var.a;
        boolean z = qz1Var.c;
        List list = qz1Var.b;
        ArrayList arrayList = new ArrayList(list.size());
        int i = 0;
        for (int i2 = 0; i2 < list.size(); i2++) {
            ou ouVarA = ((vu) list.get(i2)).a(x11Var, g11Var, gjVar);
            if (ouVarA != null) {
                arrayList.add(ouVarA);
            }
        }
        while (true) {
            if (i >= list.size()) {
                bbVar = null;
                break;
            }
            vu vuVar = (vu) list.get(i);
            if (vuVar instanceof bb) {
                bbVar = (bb) vuVar;
                break;
            }
            i++;
        }
        this(x11Var, gjVar, str, z, arrayList, bbVar);
    }
}
