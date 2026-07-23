package defpackage;

import android.graphics.Matrix;
import android.graphics.PointF;
import java.util.Collections;

/* JADX INFO: loaded from: classes4.dex */
public final class pb2 {
    public final Matrix a = new Matrix();
    public final Matrix b;
    public final Matrix c;
    public final Matrix d;
    public final float[] e;
    public ej f;
    public ej g;
    public ej h;
    public ej i;
    public ej j;
    public mk0 k;
    public mk0 l;
    public ej m;
    public ej n;
    public final boolean o;

    public pb2(bb bbVar) {
        va vaVar = bbVar.a;
        this.f = vaVar == null ? null : vaVar.a();
        db dbVar = bbVar.b;
        this.g = dbVar == null ? null : dbVar.a();
        ta taVar = bbVar.c;
        this.h = taVar == null ? null : taVar.a();
        ua uaVar = bbVar.d;
        this.i = uaVar == null ? null : uaVar.a();
        ua uaVar2 = bbVar.f;
        mk0 mk0VarA = uaVar2 == null ? null : uaVar2.a();
        this.k = mk0VarA;
        this.o = bbVar.j;
        if (mk0VarA != null) {
            this.b = new Matrix();
            this.c = new Matrix();
            this.d = new Matrix();
            this.e = new float[9];
        } else {
            this.b = null;
            this.c = null;
            this.d = null;
            this.e = null;
        }
        ua uaVar3 = bbVar.g;
        this.l = uaVar3 == null ? null : uaVar3.a();
        ta taVar2 = bbVar.e;
        if (taVar2 != null) {
            this.j = taVar2.a();
        }
        ua uaVar4 = bbVar.h;
        if (uaVar4 != null) {
            this.m = uaVar4.a();
        } else {
            this.m = null;
        }
        ua uaVar5 = bbVar.i;
        if (uaVar5 != null) {
            this.n = uaVar5.a();
        } else {
            this.n = null;
        }
    }

    public final void a(gj gjVar) {
        gjVar.e(this.j);
        gjVar.e(this.m);
        gjVar.e(this.n);
        gjVar.e(this.f);
        gjVar.e(this.g);
        gjVar.e(this.h);
        gjVar.e(this.i);
        gjVar.e(this.k);
        gjVar.e(this.l);
    }

    public final void b(aj ajVar) {
        ej ejVar = this.j;
        if (ejVar != null) {
            ejVar.a(ajVar);
        }
        ej ejVar2 = this.m;
        if (ejVar2 != null) {
            ejVar2.a(ajVar);
        }
        ej ejVar3 = this.n;
        if (ejVar3 != null) {
            ejVar3.a(ajVar);
        }
        ej ejVar4 = this.f;
        if (ejVar4 != null) {
            ejVar4.a(ajVar);
        }
        ej ejVar5 = this.g;
        if (ejVar5 != null) {
            ejVar5.a(ajVar);
        }
        ej ejVar6 = this.h;
        if (ejVar6 != null) {
            ejVar6.a(ajVar);
        }
        ej ejVar7 = this.i;
        if (ejVar7 != null) {
            ejVar7.a(ajVar);
        }
        mk0 mk0Var = this.k;
        if (mk0Var != null) {
            mk0Var.a(ajVar);
        }
        mk0 mk0Var2 = this.l;
        if (mk0Var2 != null) {
            mk0Var2.a(ajVar);
        }
    }

    public final boolean c(i21 i21Var, Object obj) {
        Float fValueOf = Float.valueOf(100.0f);
        Float fValueOf2 = Float.valueOf(0.0f);
        if (obj == c21.a) {
            ej ejVar = this.f;
            if (ejVar == null) {
                this.f = new ee2(i21Var, new PointF());
                return true;
            }
            ejVar.j(i21Var);
            return true;
        }
        if (obj == c21.b) {
            ej ejVar2 = this.g;
            if (ejVar2 == null) {
                this.g = new ee2(i21Var, new PointF());
                return true;
            }
            ejVar2.j(i21Var);
            return true;
        }
        if (obj == c21.c) {
            ej ejVar3 = this.g;
            if (ejVar3 instanceof w22) {
                ((w22) ejVar3).m = i21Var;
                return true;
            }
        }
        if (obj == c21.d) {
            ej ejVar4 = this.g;
            if (ejVar4 instanceof w22) {
                ((w22) ejVar4).n = i21Var;
                return true;
            }
        }
        if (obj == c21.j) {
            ej ejVar5 = this.h;
            if (ejVar5 == null) {
                this.h = new ee2(i21Var, new vu1());
                return true;
            }
            ejVar5.j(i21Var);
            return true;
        }
        if (obj == c21.k) {
            ej ejVar6 = this.i;
            if (ejVar6 == null) {
                this.i = new ee2(i21Var, fValueOf2);
                return true;
            }
            ejVar6.j(i21Var);
            return true;
        }
        if (obj == 3) {
            ej ejVar7 = this.j;
            if (ejVar7 == null) {
                this.j = new ee2(i21Var, 100);
                return true;
            }
            ejVar7.j(i21Var);
            return true;
        }
        if (obj == c21.x) {
            ej ejVar8 = this.m;
            if (ejVar8 == null) {
                this.m = new ee2(i21Var, fValueOf);
                return true;
            }
            ejVar8.j(i21Var);
            return true;
        }
        if (obj == c21.y) {
            ej ejVar9 = this.n;
            if (ejVar9 == null) {
                this.n = new ee2(i21Var, fValueOf);
                return true;
            }
            ejVar9.j(i21Var);
            return true;
        }
        if (obj == c21.l) {
            if (this.k == null) {
                this.k = new mk0(Collections.singletonList(new dw0(fValueOf2)));
            }
            this.k.j(i21Var);
            return true;
        }
        if (obj != c21.m) {
            return false;
        }
        if (this.l == null) {
            this.l = new mk0(Collections.singletonList(new dw0(fValueOf2)));
        }
        this.l.j(i21Var);
        return true;
    }

    public final void d() {
        for (int i = 0; i < 9; i++) {
            this.e[i] = 0.0f;
        }
    }

    public final Matrix e() {
        PointF pointF;
        vu1 vu1Var;
        PointF pointF2;
        Matrix matrix = this.a;
        matrix.reset();
        ej ejVar = this.g;
        if (ejVar != null && (pointF2 = (PointF) ejVar.e()) != null) {
            float f = pointF2.x;
            if (f != 0.0f || pointF2.y != 0.0f) {
                matrix.preTranslate(f, pointF2.y);
            }
        }
        if (!this.o) {
            ej ejVar2 = this.i;
            if (ejVar2 != null) {
                float fFloatValue = ejVar2 instanceof ee2 ? ((Float) ejVar2.e()).floatValue() : ((mk0) ejVar2).l();
                if (fFloatValue != 0.0f) {
                    matrix.preRotate(fFloatValue);
                }
            }
        } else if (ejVar != null) {
            float f2 = ejVar.d;
            PointF pointF3 = (PointF) ejVar.e();
            float f3 = pointF3.x;
            float f4 = pointF3.y;
            ejVar.i(1.0E-4f + f2);
            PointF pointF4 = (PointF) ejVar.e();
            ejVar.i(f2);
            matrix.preRotate((float) Math.toDegrees(Math.atan2(pointF4.y - f4, pointF4.x - f3)));
        }
        mk0 mk0Var = this.k;
        if (mk0Var != null) {
            mk0 mk0Var2 = this.l;
            float fCos = mk0Var2 == null ? 0.0f : (float) Math.cos(Math.toRadians((-mk0Var2.l()) + 90.0f));
            mk0 mk0Var3 = this.l;
            float fSin = mk0Var3 == null ? 1.0f : (float) Math.sin(Math.toRadians((-mk0Var3.l()) + 90.0f));
            float fTan = (float) Math.tan(Math.toRadians(mk0Var.l()));
            d();
            float[] fArr = this.e;
            fArr[0] = fCos;
            fArr[1] = fSin;
            float f5 = -fSin;
            fArr[3] = f5;
            fArr[4] = fCos;
            fArr[8] = 1.0f;
            Matrix matrix2 = this.b;
            matrix2.setValues(fArr);
            d();
            fArr[0] = 1.0f;
            fArr[3] = fTan;
            fArr[4] = 1.0f;
            fArr[8] = 1.0f;
            Matrix matrix3 = this.c;
            matrix3.setValues(fArr);
            d();
            fArr[0] = fCos;
            fArr[1] = f5;
            fArr[3] = fSin;
            fArr[4] = fCos;
            fArr[8] = 1.0f;
            Matrix matrix4 = this.d;
            matrix4.setValues(fArr);
            matrix3.preConcat(matrix2);
            matrix4.preConcat(matrix3);
            matrix.preConcat(matrix4);
        }
        ej ejVar3 = this.h;
        if (ejVar3 != null && (vu1Var = (vu1) ejVar3.e()) != null) {
            float f6 = vu1Var.a;
            if (f6 != 1.0f || vu1Var.b != 1.0f) {
                matrix.preScale(f6, vu1Var.b);
            }
        }
        ej ejVar4 = this.f;
        if (ejVar4 != null && (pointF = (PointF) ejVar4.e()) != null) {
            float f7 = pointF.x;
            if (f7 != 0.0f || pointF.y != 0.0f) {
                matrix.preTranslate(-f7, -pointF.y);
            }
        }
        return matrix;
    }

    public final Matrix f(float f) {
        ej ejVar = this.g;
        PointF pointF = ejVar == null ? null : (PointF) ejVar.e();
        ej ejVar2 = this.h;
        vu1 vu1Var = ejVar2 == null ? null : (vu1) ejVar2.e();
        Matrix matrix = this.a;
        matrix.reset();
        if (pointF != null) {
            matrix.preTranslate(pointF.x * f, pointF.y * f);
        }
        if (vu1Var != null) {
            double d = f;
            matrix.preScale((float) Math.pow(vu1Var.a, d), (float) Math.pow(vu1Var.b, d));
        }
        ej ejVar3 = this.i;
        if (ejVar3 != null) {
            float fFloatValue = ((Float) ejVar3.e()).floatValue();
            ej ejVar4 = this.f;
            PointF pointF2 = ejVar4 != null ? (PointF) ejVar4.e() : null;
            matrix.preRotate(fFloatValue * f, pointF2 == null ? 0.0f : pointF2.x, pointF2 != null ? pointF2.y : 0.0f);
        }
        return matrix;
    }
}
