package defpackage;

import android.graphics.Path;
import android.graphics.PointF;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public final class ed0 implements cd1, aj, bw0 {
    public final String b;
    public final x11 c;
    public final lm0 d;
    public final ej e;
    public final up f;
    public boolean h;
    public final Path a = new Path();
    public final va g = new va();

    public ed0(x11 x11Var, gj gjVar, up upVar) {
        this.b = upVar.a;
        this.c = x11Var;
        ej ejVarA = upVar.c.a();
        this.d = (lm0) ejVarA;
        ej ejVarA2 = upVar.b.a();
        this.e = ejVarA2;
        this.f = upVar;
        gjVar.e(ejVarA);
        gjVar.e(ejVarA2);
        ejVarA.a(this);
        ejVarA2.a(this);
    }

    @Override // defpackage.aj
    public final void a() {
        this.h = false;
        this.c.invalidateSelf();
    }

    @Override // defpackage.ou
    public final void b(List list, List list2) {
        int i = 0;
        while (true) {
            ArrayList arrayList = (ArrayList) list;
            if (i >= arrayList.size()) {
                return;
            }
            ou ouVar = (ou) arrayList.get(i);
            if (ouVar instanceof ac2) {
                ac2 ac2Var = (ac2) ouVar;
                if (ac2Var.c == 1) {
                    this.g.a.add(ac2Var);
                    ac2Var.c(this);
                }
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
        if (obj == c21.f) {
            this.d.j(i21Var);
        } else if (obj == c21.i) {
            this.e.j(i21Var);
        }
    }

    @Override // defpackage.ou

    @Override // defpackage.cd1
    public final Path getPath() {
        boolean z = this.h;
        Path path = this.a;
        if (z) {
            return path;
        }
        path.reset();
        up upVar = this.f;
        if (upVar.e) {
            this.h = true;
            return path;
        }
        PointF pointF = (PointF) this.d.e();
        float f = pointF.x / 2.0f;
        float f2 = pointF.y / 2.0f;
        float f3 = f * 0.55228f;
        float f4 = f2 * 0.55228f;
        path.reset();
        if (upVar.d) {
            float f5 = -f2;
            path.moveTo(0.0f, f5);
            float f6 = 0.0f - f3;
            float f7 = -f;
            float f8 = 0.0f - f4;
            path.cubicTo(f6, f5, f7, f8, f7, 0.0f);
            float f9 = f4 + 0.0f;
            path.cubicTo(f7, f9, f6, f2, 0.0f, f2);
            float f10 = f3 + 0.0f;
            path.cubicTo(f10, f2, f, f9, f, 0.0f);
            path.cubicTo(f, f8, f10, f5, 0.0f, f5);
        } else {
            float f11 = -f2;
            path.moveTo(0.0f, f11);
            float f12 = f3 + 0.0f;
            float f13 = 0.0f - f4;
            path.cubicTo(f12, f11, f, f13, f, 0.0f);
            float f14 = f4 + 0.0f;
            path.cubicTo(f, f14, f12, f2, 0.0f, f2);
            float f15 = 0.0f - f3;
            float f16 = -f;
            path.cubicTo(f15, f2, f16, f14, f16, 0.0f);
            path.cubicTo(f16, f13, f15, f11, 0.0f, f11);
        }
        PointF pointF2 = (PointF) this.e.e();
        path.offset(pointF2.x, pointF2.y);
        path.close();
        this.g.d(path);
        this.h = true;
        return path;
    }
}
