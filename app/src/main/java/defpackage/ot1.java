package defpackage;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Path;
import android.graphics.RectF;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.ListIterator;

/* JADX INFO: loaded from: classes4.dex */
public final class ot1 implements vc0, cd1, tm0, aj, bw0 {
    public final Matrix a = new Matrix();
    public final Path b = new Path();
    public final x11 c;
    public final gj d;
    public final String e;
    public final boolean f;
    public final mk0 g;
    public final mk0 h;
    public final pb2 i;
    public pu j;

    public ot1(x11 x11Var, gj gjVar, xs1 xs1Var) {
        this.c = x11Var;
        this.d = gjVar;
        this.e = xs1Var.b;
        this.f = xs1Var.d;
        mk0 mk0VarA = xs1Var.c.a();
        this.g = mk0VarA;
        gjVar.e(mk0VarA);
        mk0VarA.a(this);
        mk0 mk0VarA2 = ((ua) xs1Var.e).a();
        this.h = mk0VarA2;
        gjVar.e(mk0VarA2);
        mk0VarA2.a(this);
        bb bbVar = (bb) xs1Var.f;
        bbVar.getClass();
        pb2 pb2Var = new pb2(bbVar);
        this.i = pb2Var;
        pb2Var.a(gjVar);
        pb2Var.b(this);
    }

    @Override // defpackage.aj
    public final void a() {
        this.c.invalidateSelf();
    }

    @Override // defpackage.ou
    public final void b(List list, List list2) {
        this.j.b(list, list2);
    }

    @Override // defpackage.aw0
    public final void c(zv0 zv0Var, int i, ArrayList arrayList, zv0 zv0Var2) {
        s41.g(zv0Var, i, arrayList, zv0Var2, this);
        for (int i2 = 0; i2 < this.j.i.size(); i2++) {
            ou ouVar = (ou) this.j.i.get(i2);
            if (ouVar instanceof bw0) {
                s41.g(zv0Var, i, arrayList, zv0Var2, (bw0) ouVar);
            }
        }
    }

    @Override // defpackage.vc0
    public final void d(RectF rectF, Matrix matrix, boolean z) {
        this.j.d(rectF, matrix, z);
    }

    @Override // defpackage.tm0
    public final void e(ListIterator listIterator) {
        if (this.j != null) {
            return;
        }
        while (listIterator.hasPrevious() && listIterator.previous() != this) {
        }
        ArrayList arrayList = new ArrayList();
        while (listIterator.hasPrevious()) {
            arrayList.add((ou) listIterator.previous());
            listIterator.remove();
        }
        Collections.reverse(arrayList);
        this.j = new pu(this.c, this.d, "Repeater", this.f, arrayList, null);
    }

    @Override // defpackage.aw0
    public final void f(i21 i21Var, Object obj) {
        if (this.i.c(i21Var, obj)) {
            return;
        }
        if (obj == c21.p) {
            this.g.j(i21Var);
        } else if (obj == c21.q) {
            this.h.j(i21Var);
        }
    }

    @Override // defpackage.vc0
    public final void g(Canvas canvas, Matrix matrix, int i, yc0 yc0Var) {
        float fFloatValue = ((Float) this.g.e()).floatValue();
        float fFloatValue2 = ((Float) this.h.e()).floatValue();
        pb2 pb2Var = this.i;
        float fFloatValue3 = ((Float) pb2Var.m.e()).floatValue() / 100.0f;
        float fFloatValue4 = ((Float) pb2Var.n.e()).floatValue() / 100.0f;
        for (int i2 = ((int) fFloatValue) - 1; i2 >= 0; i2--) {
            Matrix matrix2 = this.a;
            matrix2.set(matrix);
            float f = i2;
            matrix2.preConcat(pb2Var.f(f + fFloatValue2));
            this.j.g(canvas, matrix2, (int) (s41.f(fFloatValue3, fFloatValue4, f / fFloatValue) * i), yc0Var);
        }
    }

    @Override // defpackage.ou

    @Override // defpackage.cd1
    public final Path getPath() {
        Path path = this.j.getPath();
        Path path2 = this.b;
        path2.reset();
        float fFloatValue = ((Float) this.g.e()).floatValue();
        float fFloatValue2 = ((Float) this.h.e()).floatValue();
        for (int i = ((int) fFloatValue) - 1; i >= 0; i--) {
            Matrix matrixF = this.i.f(i + fFloatValue2);
            Matrix matrix = this.a;
            matrix.set(matrixF);
            path2.addPath(path, matrix);
        }
        return path2;
    }
}
