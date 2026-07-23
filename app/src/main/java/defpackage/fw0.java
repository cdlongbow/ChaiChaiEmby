package defpackage;

import android.graphics.Matrix;
import android.graphics.PointF;
import android.view.animation.Interpolator;
import android.view.animation.LinearInterpolator;
import androidx.core.view.animation.PathInterpolatorCompat;
import androidx.media3.exoplayer.upstream.CmcdData;

/* JADX INFO: loaded from: classes4.dex */
public abstract class fw0 {
    public static final LinearInterpolator a = new LinearInterpolator();
    public static final aa b = aa.f("t", CmcdData.STREAMING_FORMAT_SS, "e", "o", CmcdData.OBJECT_TYPE_INIT_SEGMENT, CmcdData.STREAMING_FORMAT_HLS, "to", "ti");
    public static final aa c = aa.f("x", "y");

    public static Interpolator a(PointF pointF, PointF pointF2) {
        pointF.x = s41.b(pointF.x, -1.0f, 1.0f);
        pointF.y = s41.b(pointF.y, -100.0f, 100.0f);
        pointF2.x = s41.b(pointF2.x, -1.0f, 1.0f);
        float fB = s41.b(pointF2.y, -100.0f, 100.0f);
        pointF2.y = fB;
        Matrix matrix = wd2.a;
        try {
            return PathInterpolatorCompat.create(pointF.x, pointF.y, pointF2.x, fB);
        } catch (IllegalArgumentException e) {
            return "The Path cannot loop back on itself.".equals(e.getMessage()) ? PathInterpolatorCompat.create(Math.min(pointF.x, 1.0f), pointF.y, Math.max(pointF2.x, 0.0f), pointF2.y) : new LinearInterpolator();
        }
    }

    /* JADX WARN: Code duplicated, block: B:99:0x01f6  */
    /* JADX WARN: Failed to find 'out' block for switch in B:9:0x002d. Please report as an issue. */
    public static dw0 b(tv0 tv0Var, g11 g11Var, float f, fe2 fe2Var, boolean z, boolean z2) {
        Object obj;
        Interpolator interpolatorA;
        Interpolator interpolatorA2;
        Interpolator interpolatorA3;
        Object obj2;
        dw0 dw0Var;
        aa aaVar;
        aa aaVar2;
        PointF pointF;
        aa aaVar3 = b;
        LinearInterpolator linearInterpolator = a;
        if (!z || !z2) {
            aa aaVar4 = aaVar3;
            if (!z) {
                return new dw0(fe2Var.g(tv0Var, f));
            }
            tv0Var.c();
            PointF pointFB = null;
            PointF pointFB2 = null;
            PointF pointFB3 = null;
            PointF pointFB4 = null;
            boolean z3 = false;
            Object objG = null;
            float fI = 0.0f;
            Object objG2 = null;
            while (tv0Var.g()) {
                aaVar4 = aaVar4;
                switch (tv0Var.n(aaVar4)) {
                    case 0:
                        fI = (float) tv0Var.i();
                        continue;
                    case 1:
                        objG = fe2Var.g(tv0Var, f);
                        break;
                    case 2:
                        objG2 = fe2Var.g(tv0Var, f);
                        break;
                    case 3:
                        pointFB4 = vv0.b(tv0Var, 1.0f);
                        break;
                    case 4:
                        pointFB = vv0.b(tv0Var, 1.0f);
                        break;
                    case 5:
                        z3 = tv0Var.j() == 1;
                        break;
                    case 6:
                        pointFB2 = vv0.b(tv0Var, f);
                        break;
                    case 7:
                        pointFB3 = vv0.b(tv0Var, f);
                        break;
                    default:
                        tv0Var.p();
                        break;
                }
            }
            tv0Var.e();
            if (!z3) {
                if (pointFB4 == null || pointFB == null) {
                    obj = objG2;
                } else {
                    interpolatorA = a(pointFB4, pointFB);
                    obj = objG2;
                }
                dw0 dw0Var2 = new dw0(g11Var, objG, obj, interpolatorA, fI, (Float) null);
                dw0Var2.o = pointFB2;
                dw0Var2.p = pointFB3;
                return dw0Var2;
            }
            obj = objG;
            interpolatorA = linearInterpolator;
            dw0 dw0Var3 = new dw0(g11Var, objG, obj, interpolatorA, fI, (Float) null);
            dw0Var3.o = pointFB2;
            dw0Var3.p = pointFB3;
            return dw0Var3;
        }
        tv0Var.c();
        PointF pointF2 = null;
        PointF pointFB5 = null;
        PointF pointFB6 = null;
        boolean z4 = false;
        PointF pointFB7 = null;
        PointF pointFB8 = null;
        PointF pointF3 = null;
        Object objG3 = null;
        PointF pointF4 = null;
        PointF pointF5 = null;
        float fI2 = 0.0f;
        Object objG4 = null;
        while (tv0Var.g()) {
            int iN = tv0Var.n(aaVar3);
            aa aaVar5 = c;
            linearInterpolator = linearInterpolator;
            switch (iN) {
                case 0:
                    aaVar = aaVar3;
                    fI2 = (float) tv0Var.i();
                    aaVar3 = aaVar;
                    break;
                case 1:
                    aaVar = aaVar3;
                    objG3 = fe2Var.g(tv0Var, f);
                    aaVar3 = aaVar;
                    break;
                case 2:
                    aaVar = aaVar3;
                    objG4 = fe2Var.g(tv0Var, f);
                    aaVar3 = aaVar;
                    break;
                case 3:
                    aaVar = aaVar3;
                    boolean z5 = z4;
                    Object obj3 = objG3;
                    PointF pointF6 = pointF4;
                    if (tv0Var.l() == 3) {
                        tv0Var.c();
                        float fI3 = 0.0f;
                        float fI4 = 0.0f;
                        float fI5 = 0.0f;
                        float fI6 = 0.0f;
                        while (tv0Var.g()) {
                            int iN2 = tv0Var.n(aaVar5);
                            if (iN2 != 0) {
                                if (iN2 != 1) {
                                    tv0Var.p();
                                } else if (tv0Var.l() == 7) {
                                    fI6 = (float) tv0Var.i();
                                    fI4 = fI6;
                                } else {
                                    tv0Var.b();
                                    fI4 = (float) tv0Var.i();
                                    fI6 = tv0Var.l() == 7 ? (float) tv0Var.i() : fI4;
                                    tv0Var.d();
                                }
                            } else if (tv0Var.l() == 7) {
                                fI5 = (float) tv0Var.i();
                                fI3 = fI5;
                            } else {
                                tv0Var.b();
                                fI3 = (float) tv0Var.i();
                                fI5 = tv0Var.l() == 7 ? (float) tv0Var.i() : fI3;
                                tv0Var.d();
                            }
                        }
                        PointF pointF7 = new PointF(fI3, fI4);
                        pointF4 = new PointF(fI5, fI6);
                        tv0Var.e();
                        pointF3 = pointF7;
                    } else {
                        pointFB7 = vv0.b(tv0Var, f);
                        pointF4 = pointF6;
                    }
                    z4 = z5;
                    objG3 = obj3;
                    aaVar3 = aaVar;
                    break;
                case 4:
                    boolean z6 = z4;
                    if (tv0Var.l() == 3) {
                        tv0Var.c();
                        float fI7 = 0.0f;
                        float fI8 = 0.0f;
                        float fI9 = 0.0f;
                        float fI10 = 0.0f;
                        while (tv0Var.g()) {
                            Object obj4 = objG3;
                            int iN3 = tv0Var.n(aaVar5);
                            if (iN3 != 0) {
                                aaVar2 = aaVar3;
                                if (iN3 != 1) {
                                    tv0Var.p();
                                } else if (tv0Var.l() == 7) {
                                    fI10 = (float) tv0Var.i();
                                    pointF4 = pointF4;
                                    fI8 = fI10;
                                } else {
                                    pointF = pointF4;
                                    tv0Var.b();
                                    fI8 = (float) tv0Var.i();
                                    fI10 = tv0Var.l() == 7 ? (float) tv0Var.i() : fI8;
                                    tv0Var.d();
                                    pointF4 = pointF;
                                }
                            } else {
                                aaVar2 = aaVar3;
                                pointF = pointF4;
                                if (tv0Var.l() == 7) {
                                    fI9 = (float) tv0Var.i();
                                    pointF4 = pointF;
                                    fI7 = fI9;
                                } else {
                                    tv0Var.b();
                                    fI7 = (float) tv0Var.i();
                                    fI9 = tv0Var.l() == 7 ? (float) tv0Var.i() : fI7;
                                    tv0Var.d();
                                    pointF4 = pointF;
                                }
                            }
                            objG3 = obj4;
                            aaVar3 = aaVar2;
                        }
                        aaVar = aaVar3;
                        PointF pointF8 = new PointF(fI7, fI8);
                        pointF2 = new PointF(fI9, fI10);
                        tv0Var.e();
                        pointF5 = pointF8;
                    } else {
                        aaVar = aaVar3;
                        pointFB8 = vv0.b(tv0Var, f);
                    }
                    z4 = z6;
                    aaVar3 = aaVar;
                    break;
                case 5:
                    z4 = tv0Var.j() == 1;
                    linearInterpolator = linearInterpolator;
                    break;
                case 6:
                    pointFB5 = vv0.b(tv0Var, f);
                    linearInterpolator = linearInterpolator;
                    break;
                case 7:
                    pointFB6 = vv0.b(tv0Var, f);
                    linearInterpolator = linearInterpolator;
                    break;
                default:
                    tv0Var.p();
                    linearInterpolator = linearInterpolator;
                    break;
            }
        }
        Interpolator interpolatorA4 = linearInterpolator;
        boolean z7 = z4;
        Object obj5 = objG3;
        PointF pointF9 = pointF4;
        tv0Var.e();
        if (z7) {
            obj2 = obj5;
        } else {
            if (pointFB7 == null || pointFB8 == null) {
                if (pointF3 != null && pointF9 != null && pointF5 != null && pointF2 != null) {
                    interpolatorA2 = a(pointF3, pointF5);
                    interpolatorA3 = a(pointF9, pointF2);
                    obj2 = objG4;
                    interpolatorA4 = null;
                }
                if (interpolatorA2 != null || interpolatorA3 == null) {
                    dw0Var = new dw0(g11Var, obj5, obj2, interpolatorA4, fI2, (Float) null);
                } else {
                    dw0Var = new dw0(g11Var, obj5, obj2, interpolatorA2, interpolatorA3, fI2);
                }
                dw0Var.o = pointFB5;
                dw0Var.p = pointFB6;
                return dw0Var;
            }
            interpolatorA4 = a(pointFB7, pointFB8);
            obj2 = objG4;
        }
        interpolatorA2 = null;
        interpolatorA3 = null;
        if (interpolatorA2 != null) {
            dw0Var = new dw0(g11Var, obj5, obj2, interpolatorA4, fI2, (Float) null);
        } else {
            dw0Var = new dw0(g11Var, obj5, obj2, interpolatorA4, fI2, (Float) null);
        }
        dw0Var.o = pointFB5;
        dw0Var.p = pointFB6;
        return dw0Var;
    }
}
