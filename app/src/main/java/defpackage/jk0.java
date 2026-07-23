package defpackage;

import android.graphics.BlurMaskFilter;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.MaskFilter;
import android.graphics.Matrix;
import android.graphics.Path;
import android.graphics.PointF;
import android.graphics.RectF;
import androidx.core.view.ViewCompat;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public final class jk0 implements vc0, aj, bw0 {
    public final Path a;
    public final jw0 b;
    public final gj c;
    public final String d;
    public final boolean e;
    public final ArrayList f;
    public final vq g;
    public final vq h;
    public ee2 i;
    public final x11 j;
    public ej k;
    public float l;

    public jk0(x11 x11Var, gj gjVar, oz1 oz1Var) {
        Path path = new Path();
        this.a = path;
        this.b = new jw0(1, 0);
        this.f = new ArrayList();
        this.c = gjVar;
        String str = oz1Var.c;
        ta taVar = oz1Var.e;
        ta taVar2 = oz1Var.d;
        this.d = str;
        this.e = oz1Var.f;
        this.j = x11Var;
        if (gjVar.k() != null) {
            mk0 mk0VarA = ((ua) gjVar.k().b).a();
            this.k = mk0VarA;
            mk0VarA.a(this);
            gjVar.e(this.k);
        }
        if (taVar2 == null) {
            this.g = null;
            this.h = null;
            return;
        }
        path.setFillType(oz1Var.b);
        ej ejVarA = taVar2.a();
        this.g = (vq) ejVarA;
        ejVarA.a(this);
        gjVar.e(ejVarA);
        ej ejVarA2 = taVar.a();
        this.h = (vq) ejVarA2;
        ejVarA2.a(this);
        gjVar.e(ejVarA2);
    }

    @Override // defpackage.aj
    public final void a() {
        this.j.invalidateSelf();
    }

    @Override // defpackage.ou
    public final void b(List list, List list2) {
        for (int i = 0; i < list2.size(); i++) {
            ou ouVar = (ou) list2.get(i);
            if (ouVar instanceof cd1) {
                this.f.add((cd1) ouVar);
            }
        }
    }

    @Override // defpackage.aw0
    public final void c(zv0 zv0Var, int i, ArrayList arrayList, zv0 zv0Var2) {
        s41.g(zv0Var, i, arrayList, zv0Var2, this);
    }

    @Override // defpackage.vc0
    public final void d(RectF rectF, Matrix matrix, boolean z) {
        Path path = this.a;
        path.reset();
        int i = 0;
        while (true) {
            ArrayList arrayList = this.f;
            if (i >= arrayList.size()) {
                path.computeBounds(rectF, false);
                rectF.set(rectF.left - 1.0f, rectF.top - 1.0f, rectF.right + 1.0f, rectF.bottom + 1.0f);
                return;
            } else {
                path.addPath(((cd1) arrayList.get(i)).getPath(), matrix);
                i++;
            }
        }
    }

    @Override // defpackage.aw0
    public final void f(i21 i21Var, Object obj) {
        PointF pointF = c21.a;
        if (obj == 1) {
            this.g.j(i21Var);
            return;
        }
        if (obj == 4) {
            this.h.j(i21Var);
            return;
        }
        ColorFilter colorFilter = c21.F;
        gj gjVar = this.c;
        if (obj == colorFilter) {
            ee2 ee2Var = this.i;
            if (ee2Var != null) {
                gjVar.n(ee2Var);
            }
            ee2 ee2Var2 = new ee2(i21Var, null);
            this.i = ee2Var2;
            ee2Var2.a(this);
            gjVar.e(this.i);
            return;
        }
        if (obj == c21.e) {
            ej ejVar = this.k;
            if (ejVar != null) {
                ejVar.j(i21Var);
                return;
            }
            ee2 ee2Var3 = new ee2(i21Var, null);
            this.k = ee2Var3;
            ee2Var3.a(this);
            gjVar.e(this.k);
        }
    }

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
    @Override // defpackage.vc0
    public final void g(Canvas canvas, Matrix matrix, int i, yc0 yc0Var) {
        MaskFilter maskFilter;
        if (this.e) {
            return;
        }
        vq vqVar = this.g;
        int iL = vqVar.l(vqVar.c.b(), vqVar.c());
        float fIntValue = ((Integer) this.h.e()).intValue() / 100.0f;
        int iC = (s41.c((int) (i * fIntValue)) << 24) | (iL & ViewCompat.MEASURED_SIZE_MASK);
        jw0 jw0Var = this.b;
        jw0Var.setColor(iC);
        ee2 ee2Var = this.i;
        if (ee2Var != null) {
            jw0Var.setColorFilter((ColorFilter) ee2Var.e());
        }
        ej ejVar = this.k;
        if (ejVar != null) {
            float fFloatValue = ((Float) ejVar.e()).floatValue();
            if (fFloatValue == 0.0f) {
                jw0Var.setMaskFilter(null);
            } else if (fFloatValue != this.l) {
                gj gjVar = this.c;
                if (gjVar.A == fFloatValue) {
                    maskFilter = gjVar.B;
                } else {
                    BlurMaskFilter blurMaskFilter = new BlurMaskFilter(fFloatValue / 2.0f, BlurMaskFilter.Blur.NORMAL);
                    gjVar.B = blurMaskFilter;
                    gjVar.A = fFloatValue;
                    maskFilter = blurMaskFilter;
                }
                jw0Var.setMaskFilter(maskFilter);
            }
            this.l = fFloatValue;
        }
        if (yc0Var != null) {
            yc0Var.a((int) (fIntValue * 255.0f), jw0Var);
        } else {
            jw0Var.clearShadowLayer();
        }
        Path path = this.a;
        path.reset();
        int i2 = 0;
        while (true) {
            ArrayList arrayList = this.f;
            if (i2 >= arrayList.size()) {
                canvas.drawPath(path, jw0Var);
                return;
            } else {
                path.addPath(((cd1) arrayList.get(i2)).getPath(), matrix);
                i2++;
            }
        }
    }

    }
