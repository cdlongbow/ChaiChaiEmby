package defpackage;

import android.graphics.BlurMaskFilter;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.DashPathEffect;
import android.graphics.MaskFilter;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PathMeasure;
import android.graphics.PointF;
import android.graphics.RectF;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public abstract class oj implements aj, bw0, vc0 {
    public final x11 e;
    public final gj f;
    public final float[] h;
    public final jw0 i;
    public final mk0 j;
    public final vq k;
    public final ArrayList l;
    public final mk0 m;
    public ee2 n;
    public ej o;
    public float p;
    public final PathMeasure a = new PathMeasure();
    public final Path b = new Path();
    public final Path c = new Path();
    public final RectF d = new RectF();
    public final ArrayList g = new ArrayList();

    public oj(x11 x11Var, gj gjVar, Paint.Cap cap, Paint.Join join, float f, ta taVar, ua uaVar, ArrayList arrayList, ua uaVar2) {
        jw0 jw0Var = new jw0(1, 0);
        this.i = jw0Var;
        this.p = 0.0f;
        this.e = x11Var;
        this.f = gjVar;
        jw0Var.setStyle(Paint.Style.STROKE);
        jw0Var.setStrokeCap(cap);
        jw0Var.setStrokeJoin(join);
        jw0Var.setStrokeMiter(f);
        this.k = (vq) taVar.a();
        this.j = uaVar.a();
        if (uaVar2 == null) {
            this.m = null;
        } else {
            this.m = uaVar2.a();
        }
        this.l = new ArrayList(arrayList.size());
        this.h = new float[arrayList.size()];
        for (int i = 0; i < arrayList.size(); i++) {
            this.l.add(((ua) arrayList.get(i)).a());
        }
        gjVar.e(this.k);
        gjVar.e(this.j);
        for (int i2 = 0; i2 < this.l.size(); i2++) {
            gjVar.e((ej) this.l.get(i2));
        }
        mk0 mk0Var = this.m;
        if (mk0Var != null) {
            gjVar.e(mk0Var);
        }
        this.k.a(this);
        this.j.a(this);
        for (int i3 = 0; i3 < arrayList.size(); i3++) {
            ((ej) this.l.get(i3)).a(this);
        }
        mk0 mk0Var2 = this.m;
        if (mk0Var2 != null) {
            mk0Var2.a(this);
        }
        if (gjVar.k() != null) {
            mk0 mk0VarA = ((ua) gjVar.k().b).a();
            this.o = mk0VarA;
            mk0VarA.a(this);
            gjVar.e(this.o);
        }
    }

    @Override // defpackage.aj
    public final void a() {
        this.e.invalidateSelf();
    }

    /* JADX WARN: Code duplicated, block: B:23:0x0050  */
    /* JADX WARN: Code duplicated, block: B:25:0x0054 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:26:0x0056  */
    /* JADX WARN: Code duplicated, block: B:39:0x0062 A[SYNTHETIC] */
    @Override // defpackage.ou
    public final void b(List list, List list2) {
        ArrayList arrayList;
        ArrayList arrayList2 = (ArrayList) list;
        nj njVar = null;
        ac2 ac2Var = null;
        for (int size = arrayList2.size() - 1; size >= 0; size--) {
            ou ouVar = (ou) arrayList2.get(size);
            if (ouVar instanceof ac2) {
                ac2 ac2Var2 = (ac2) ouVar;
                if (ac2Var2.c == 2) {
                    ac2Var = ac2Var2;
                }
            }
        }
        if (ac2Var != null) {
            ac2Var.c(this);
        }
        int size2 = list2.size();
        while (true) {
            size2--;
            arrayList = this.g;
            if (size2 < 0) {
                break;
            }
            ou ouVar2 = (ou) list2.get(size2);
            if (ouVar2 instanceof ac2) {
                ac2 ac2Var3 = (ac2) ouVar2;
                if (ac2Var3.c == 2) {
                    if (njVar != null) {
                        arrayList.add(njVar);
                    }
                    nj njVar2 = new nj(ac2Var3);
                    ac2Var3.c(this);
                    njVar = njVar2;
                } else if (!(ouVar2 instanceof cd1)) {
                    if (njVar == null) {
                        njVar = new nj(ac2Var);
                    }
                    njVar.a.add((cd1) ouVar2);
                }
            } else if (!(ouVar2 instanceof cd1)) {
                if (njVar == null) {
                    njVar = new nj(ac2Var);
                }
                njVar.a.add((cd1) ouVar2);
            }
        }
        if (njVar != null) {
            arrayList.add(njVar);
        }
    }

    @Override // defpackage.aw0
    public final void c(zv0 zv0Var, int i, ArrayList arrayList, zv0 zv0Var2) {
        s41.g(zv0Var, i, arrayList, zv0Var2, this);
    }

    @Override // defpackage.vc0
    public final void d(RectF rectF, Matrix matrix, boolean z) {
        Path path = this.b;
        path.reset();
        int i = 0;
        while (true) {
            ArrayList arrayList = this.g;
            if (i >= arrayList.size()) {
                RectF rectF2 = this.d;
                path.computeBounds(rectF2, false);
                float fL = this.j.l() / 2.0f;
                rectF2.set(rectF2.left - fL, rectF2.top - fL, rectF2.right + fL, rectF2.bottom + fL);
                rectF.set(rectF2);
                rectF.set(rectF.left - 1.0f, rectF.top - 1.0f, rectF.right + 1.0f, rectF.bottom + 1.0f);
                return;
            }
            nj njVar = (nj) arrayList.get(i);
            for (int i2 = 0; i2 < njVar.a.size(); i2++) {
                path.addPath(((cd1) njVar.a.get(i2)).getPath(), matrix);
            }
            i++;
        }
    }

    public void f(i21 i21Var, Object obj) {
        PointF pointF = c21.a;
        if (obj == 4) {
            this.k.j(i21Var);
            return;
        }
        if (obj == c21.n) {
            this.j.j(i21Var);
            return;
        }
        ColorFilter colorFilter = c21.F;
        gj gjVar = this.f;
        if (obj == colorFilter) {
            ee2 ee2Var = this.n;
            if (ee2Var != null) {
                gjVar.n(ee2Var);
            }
            ee2 ee2Var2 = new ee2(i21Var, null);
            this.n = ee2Var2;
            ee2Var2.a(this);
            gjVar.e(this.n);
            return;
        }
        if (obj == c21.e) {
            ej ejVar = this.o;
            if (ejVar != null) {
                ejVar.j(i21Var);
                return;
            }
            ee2 ee2Var3 = new ee2(i21Var, null);
            this.o = ee2Var3;
            ee2Var3.a(this);
            gjVar.e(this.o);
        }
    }

    /* JADX WARN: Code duplicated, block: B:79:0x01f0  */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    public void g(Canvas canvas, Matrix matrix, int i, yc0 yc0Var) {
        int i2;
        float f;
        MaskFilter maskFilter;
        float[] fArr;
        oj ojVar = this;
        float[] fArr2 = (float[]) wd2.e.get();
        boolean z = false;
        fArr2[0] = 0.0f;
        int i3 = 1;
        fArr2[1] = 0.0f;
        fArr2[2] = 37394.73f;
        fArr2[3] = 39575.234f;
        matrix.mapPoints(fArr2);
        if (fArr2[0] == fArr2[2] || fArr2[1] == fArr2[3]) {
            return;
        }
        float f2 = 100.0f;
        float fIntValue = ((Integer) ojVar.k.e()).intValue() / 100.0f;
        int iC = s41.c((int) (i * fIntValue));
        jw0 jw0Var = ojVar.i;
        jw0Var.setAlpha(iC);
        jw0Var.setStrokeWidth(ojVar.j.l());
        if (jw0Var.getStrokeWidth() <= 0.0f) {
            return;
        }
        ArrayList arrayList = ojVar.l;
        if (!arrayList.isEmpty()) {
            int i4 = 0;
            while (true) {
                int size = arrayList.size();
                fArr = ojVar.h;
                if (i4 >= size) {
                    break;
                }
                float fFloatValue = ((Float) ((ej) arrayList.get(i4)).e()).floatValue();
                fArr[i4] = fFloatValue;
                if (i4 % 2 == 0) {
                    if (fFloatValue < 1.0f) {
                        fArr[i4] = 1.0f;
                    }
                } else if (fFloatValue < 0.1f) {
                    fArr[i4] = 0.1f;
                }
                i4++;
            }
            mk0 mk0Var = ojVar.m;
            jw0Var.setPathEffect(new DashPathEffect(fArr, mk0Var == null ? 0.0f : ((Float) mk0Var.e()).floatValue()));
        }
        ee2 ee2Var = ojVar.n;
        if (ee2Var != null) {
            jw0Var.setColorFilter((ColorFilter) ee2Var.e());
        }
        ej ejVar = ojVar.o;
        if (ejVar != null) {
            float fFloatValue2 = ((Float) ejVar.e()).floatValue();
            if (fFloatValue2 == 0.0f) {
                jw0Var.setMaskFilter(null);
            } else if (fFloatValue2 != ojVar.p) {
                gj gjVar = ojVar.f;
                if (gjVar.A == fFloatValue2) {
                    maskFilter = gjVar.B;
                } else {
                    BlurMaskFilter blurMaskFilter = new BlurMaskFilter(fFloatValue2 / 2.0f, BlurMaskFilter.Blur.NORMAL);
                    gjVar.B = blurMaskFilter;
                    gjVar.A = fFloatValue2;
                    maskFilter = blurMaskFilter;
                }
                jw0Var.setMaskFilter(maskFilter);
            }
            ojVar.p = fFloatValue2;
        }
        if (yc0Var != null) {
            yc0Var.a((int) (fIntValue * 255.0f), jw0Var);
        }
        canvas.save();
        canvas.concat(matrix);
        int i5 = 0;
        while (true) {
            ArrayList arrayList2 = ojVar.g;
            if (i5 >= arrayList2.size()) {
                canvas.restore();
                return;
            }
            nj njVar = (nj) arrayList2.get(i5);
            ac2 ac2Var = njVar.b;
            ArrayList arrayList3 = njVar.a;
            Path path = ojVar.b;
            if (ac2Var != null) {
                path.reset();
                for (int size2 = arrayList3.size() - i3; size2 >= 0; size2--) {
                    path.addPath(((cd1) arrayList3.get(size2)).getPath());
                }
                float fFloatValue3 = ((Float) ac2Var.d.e()).floatValue() / f2;
                float fFloatValue4 = ((Float) ac2Var.e.e()).floatValue() / f2;
                float fFloatValue5 = ((Float) ac2Var.f.e()).floatValue() / 360.0f;
                if (fFloatValue3 >= 0.01f || fFloatValue4 <= 0.99f) {
                    PathMeasure pathMeasure = ojVar.a;
                    pathMeasure.setPath(path, z);
                    float length = pathMeasure.getLength();
                    while (pathMeasure.nextContour()) {
                        length += pathMeasure.getLength();
                    }
                    float f3 = fFloatValue5 * length;
                    float f4 = (fFloatValue3 * length) + f3;
                    float fMin = Math.min((fFloatValue4 * length) + f3, (f4 + length) - 1.0f);
                    int size3 = arrayList3.size() - i3;
                    float f5 = 0.0f;
                    while (size3 >= 0) {
                        int i6 = i3;
                        Path path2 = ((cd1) arrayList3.get(size3)).getPath();
                        Path path3 = ojVar.c;
                        path3.set(path2);
                        pathMeasure.setPath(path3, z);
                        float length2 = pathMeasure.getLength();
                        if (fMin > length) {
                            float f6 = fMin - length;
                            if (f6 >= f5 + length2 || f5 >= f6) {
                                f = f5 + length2;
                                if (f < f4 && f5 <= fMin) {
                                    if (f > fMin || f4 >= f5) {
                                        wd2.a(path3, f4 < f5 ? 0.0f : (f4 - f5) / length2, fMin > f ? 1.0f : (fMin - f5) / length2, 0.0f);
                                        canvas.drawPath(path3, jw0Var);
                                    } else {
                                        canvas.drawPath(path3, jw0Var);
                                    }
                                }
                            } else {
                                wd2.a(path3, f4 > length ? (f4 - length) / length2 : 0.0f, Math.min(f6 / length2, 1.0f), 0.0f);
                                canvas.drawPath(path3, jw0Var);
                            }
                        } else {
                            f = f5 + length2;
                            if (f < f4) {
                            }
                        }
                        f5 += length2;
                        size3--;
                        ojVar = this;
                        i3 = i6;
                        z = false;
                    }
                } else {
                    canvas.drawPath(path, jw0Var);
                }
                i2 = i3;
            } else {
                i2 = i3;
                path.reset();
                for (int size4 = arrayList3.size() - 1; size4 >= 0; size4--) {
                    path.addPath(((cd1) arrayList3.get(size4)).getPath());
                }
                canvas.drawPath(path, jw0Var);
            }
            i5++;
            ojVar = this;
            i3 = i2;
            z = false;
            f2 = 100.0f;
        }
    }
}
