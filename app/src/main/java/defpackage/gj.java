package defpackage;

import android.graphics.BlurMaskFilter;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.RectF;
import android.os.Build;
import androidx.core.graphics.BlendModeCompat;
import androidx.core.graphics.PaintCompat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public abstract class gj implements vc0, aj, aw0 {
    public float A;
    public BlurMaskFilter B;
    public jw0 C;
    public final Path a = new Path();
    public final Matrix b = new Matrix();
    public final Matrix c = new Matrix();
    public final jw0 d = new jw0(1, 0);
    public final jw0 e;
    public final jw0 f;
    public final jw0 g;
    public final jw0 h;
    public final RectF i;
    public final RectF j;
    public final RectF k;
    public final RectF l;
    public final RectF m;
    public final Matrix n;
    public final x11 o;
    public final mw0 p;
    public final rr0 q;
    public final mk0 r;
    public gj s;
    public gj t;
    public List u;
    public final ArrayList v;
    public final pb2 w;
    public boolean x;
    public boolean y;
    public jw0 z;

    public gj(x11 x11Var, mw0 mw0Var) {
        PorterDuff.Mode mode = PorterDuff.Mode.DST_IN;
        this.e = new jw0(mode);
        PorterDuff.Mode mode2 = PorterDuff.Mode.DST_OUT;
        this.f = new jw0(mode2);
        jw0 jw0Var = new jw0(1, 0);
        this.g = jw0Var;
        PorterDuff.Mode mode3 = PorterDuff.Mode.CLEAR;
        jw0 jw0Var2 = new jw0();
        jw0Var2.setXfermode(new PorterDuffXfermode(mode3));
        this.h = jw0Var2;
        this.i = new RectF();
        this.j = new RectF();
        this.k = new RectF();
        this.l = new RectF();
        this.m = new RectF();
        this.n = new Matrix();
        this.v = new ArrayList();
        this.x = true;
        this.A = 0.0f;
        this.o = x11Var;
        this.p = mw0Var;
        List list = mw0Var.h;
        if (mw0Var.u == 3) {
            jw0Var.setXfermode(new PorterDuffXfermode(mode2));
        } else {
            jw0Var.setXfermode(new PorterDuffXfermode(mode));
        }
        bb bbVar = mw0Var.i;
        bbVar.getClass();
        pb2 pb2Var = new pb2(bbVar);
        this.w = pb2Var;
        pb2Var.b(this);
        if (list != null && !list.isEmpty()) {
            rr0 rr0Var = new rr0(list);
            this.q = rr0Var;
            ArrayList arrayList = (ArrayList) rr0Var.b;
            int size = arrayList.size();
            int i = 0;
            while (i < size) {
                Object obj = arrayList.get(i);
                i++;
                ((ej) obj).a(this);
            }
            ArrayList arrayList2 = (ArrayList) this.q.c;
            int size2 = arrayList2.size();
            int i2 = 0;
            while (i2 < size2) {
                Object obj2 = arrayList2.get(i2);
                i2++;
                ej ejVar = (ej) obj2;
                e(ejVar);
                ejVar.a(this);
            }
        }
        mw0 mw0Var2 = this.p;
        if (mw0Var2.t.isEmpty()) {
            if (true != this.x) {
                this.x = true;
                this.o.invalidateSelf();
                return;
            }
            return;
        }
        mk0 mk0Var = new mk0(mw0Var2.t);
        this.r = mk0Var;
        mk0Var.b = true;
        mk0Var.a(new aj() { // from class: fj
            @Override // defpackage.aj
            public final void a() {
                gj gjVar = this.a;
                boolean z = gjVar.r.l() == 1.0f;
                if (z != gjVar.x) {
                    gjVar.x = z;
                    gjVar.o.invalidateSelf();
                }
            }
        });
        boolean z = ((Float) this.r.e()).floatValue() == 1.0f;
        if (z != this.x) {
            this.x = z;
            this.o.invalidateSelf();
        }
        e(this.r);
    }

    @Override // defpackage.aj
    public final void a() {
        this.o.invalidateSelf();
    }

    @Override // defpackage.aw0
    public final void c(zv0 zv0Var, int i, ArrayList arrayList, zv0 zv0Var2) {
        gj gjVar = this.s;
        mw0 mw0Var = this.p;
        if (gjVar != null) {
            String str = gjVar.p.c;
            zv0 zv0Var3 = new zv0(zv0Var2);
            zv0Var3.a.add(str);
            if (zv0Var.a(i, this.s.p.c)) {
                gj gjVar2 = this.s;
                zv0 zv0Var4 = new zv0(zv0Var3);
                zv0Var4.b = gjVar2;
                arrayList.add(zv0Var4);
            }
            if (zv0Var.c(i, this.s.p.c) && zv0Var.d(i, mw0Var.c)) {
                this.s.o(zv0Var, zv0Var.b(i, this.s.p.c) + i, arrayList, zv0Var3);
            }
        }
        String str2 = mw0Var.c;
        String str3 = mw0Var.c;
        if (zv0Var.c(i, str2)) {
            if (!"__container".equals(str3)) {
                zv0 zv0Var5 = new zv0(zv0Var2);
                zv0Var5.a.add(str3);
                if (zv0Var.a(i, str3)) {
                    zv0 zv0Var6 = new zv0(zv0Var5);
                    zv0Var6.b = this;
                    arrayList.add(zv0Var6);
                }
                zv0Var2 = zv0Var5;
            }
            if (zv0Var.d(i, str3)) {
                o(zv0Var, zv0Var.b(i, str3) + i, arrayList, zv0Var2);
            }
        }
    }

    @Override // defpackage.vc0
    public void d(RectF rectF, Matrix matrix, boolean z) {
        this.i.set(0.0f, 0.0f, 0.0f, 0.0f);
        h();
        Matrix matrix2 = this.n;
        matrix2.set(matrix);
        if (z) {
            List list = this.u;
            if (list != null) {
                for (int size = list.size() - 1; size >= 0; size--) {
                    matrix2.preConcat(((gj) this.u.get(size)).w.e());
                }
            } else {
                gj gjVar = this.t;
                if (gjVar != null) {
                    matrix2.preConcat(gjVar.w.e());
                }
            }
        }
        matrix2.preConcat(this.w.e());
    }

    public final void e(ej ejVar) {
        if (ejVar == null) {
            return;
        }
        this.v.add(ejVar);
    }

    public void f(i21 i21Var, Object obj) {
        this.w.c(i21Var, obj);
    }

    /* JADX WARN: Code duplicated, block: B:55:0x010b  */
    /* JADX WARN: Code duplicated, block: B:56:0x010f  */
    @Override // defpackage.vc0
    public final void g(Canvas canvas, Matrix matrix, int i, yc0 yc0Var) {
        Path path;
        float f;
        RectF rectF;
        jw0 jw0Var;
        BlendModeCompat blendModeCompat;
        Path path2;
        char c;
        Path path3;
        Integer num;
        if (this.x) {
            mw0 mw0Var = this.p;
            boolean z = mw0Var.v;
            int i2 = mw0Var.y;
            if (z) {
                return;
            }
            h();
            Matrix matrix2 = this.b;
            matrix2.reset();
            matrix2.set(matrix);
            int i3 = 1;
            for (int size = this.u.size() - 1; size >= 0; size--) {
                matrix2.preConcat(((gj) this.u.get(size)).w.e());
            }
            pb2 pb2Var = this.w;
            ej ejVar = pb2Var.j;
            int iIntValue = (int) ((((i / 255.0f) * ((ejVar == null || (num = (Integer) ejVar.e()) == null) ? 100 : num.intValue())) / 100.0f) * 255.0f);
            if (this.s == null && !l() && i2 == 1) {
                matrix2.preConcat(pb2Var.e());
                j(canvas, matrix2, iIntValue, yc0Var);
                m();
                return;
            }
            RectF rectF2 = this.i;
            int i4 = 0;
            d(rectF2, matrix2, false);
            if (this.s != null && mw0Var.u != 3) {
                RectF rectF3 = this.l;
                rectF3.set(0.0f, 0.0f, 0.0f, 0.0f);
                this.s.d(rectF3, matrix, true);
                if (!rectF2.intersect(rectF3)) {
                    rectF2.set(0.0f, 0.0f, 0.0f, 0.0f);
                }
            }
            matrix2.preConcat(pb2Var.e());
            RectF rectF4 = this.k;
            rectF4.set(0.0f, 0.0f, 0.0f, 0.0f);
            boolean zL = l();
            rr0 rr0Var = this.q;
            Path path4 = this.a;
            if (zL) {
                int size2 = ((List) rr0Var.d).size();
                while (true) {
                    if (i4 < size2) {
                        r31 r31Var = (r31) ((List) rr0Var.d).get(i4);
                        Path path5 = (Path) ((ej) ((ArrayList) rr0Var.b).get(i4)).e();
                        if (path5 != null) {
                            path4.set(path5);
                            path4.transform(matrix2);
                            int iD = w11.D(r31Var.a);
                            if (iD != 0) {
                                if (iD != i3) {
                                    if (iD != 2) {
                                        if (iD == 3) {
                                        }
                                        rectF = this.m;
                                        path4.computeBounds(rectF, false);
                                        if (i4 == 0) {
                                            rectF4.set(rectF);
                                        } else {
                                            rectF4.set(Math.min(rectF4.left, rectF.left), Math.min(rectF4.top, rectF.top), Math.max(rectF4.right, rectF.right), Math.max(rectF4.bottom, rectF.bottom));
                                        }
                                    }
                                }
                                path = path4;
                                f = 0.0f;
                            }
                            if (r31Var.d) {
                                path = path4;
                                f = 0.0f;
                            }
                            rectF = this.m;
                            path4.computeBounds(rectF, false);
                            if (i4 == 0) {
                                rectF4.set(rectF);
                            } else {
                                rectF4.set(Math.min(rectF4.left, rectF.left), Math.min(rectF4.top, rectF.top), Math.max(rectF4.right, rectF.right), Math.max(rectF4.bottom, rectF.bottom));
                            }
                        }
                        i4++;
                        size2 = size2;
                        path4 = path4;
                        i3 = 1;
                    } else {
                        path = path4;
                        if (rectF2.intersect(rectF4)) {
                            f = 0.0f;
                        } else {
                            f = 0.0f;
                            rectF2.set(0.0f, 0.0f, 0.0f, 0.0f);
                        }
                    }
                }
            } else {
                path = path4;
                f = 0.0f;
            }
            float width = canvas.getWidth();
            float height = canvas.getHeight();
            RectF rectF5 = this.j;
            rectF5.set(f, f, width, height);
            Matrix matrix3 = this.c;
            canvas.getMatrix(matrix3);
            if (!matrix3.isIdentity()) {
                matrix3.invert(matrix3);
                matrix3.mapRect(rectF5);
            }
            if (!rectF2.intersect(rectF5)) {
                rectF2.set(f, f, f, f);
            }
            if (rectF2.width() >= 1.0f && rectF2.height() >= 1.0f) {
                jw0 jw0Var2 = this.d;
                jw0Var2.setAlpha(255);
                int iD2 = w11.D(i2);
                if (iD2 == 1) {
                    blendModeCompat = BlendModeCompat.MODULATE;
                } else if (iD2 == 2) {
                    blendModeCompat = BlendModeCompat.SCREEN;
                } else if (iD2 == 3) {
                    blendModeCompat = BlendModeCompat.OVERLAY;
                } else if (iD2 == 4) {
                    blendModeCompat = BlendModeCompat.DARKEN;
                } else if (iD2 != 5) {
                    blendModeCompat = iD2 != 16 ? null : BlendModeCompat.PLUS;
                } else {
                    blendModeCompat = BlendModeCompat.LIGHTEN;
                }
                PaintCompat.setBlendMode(jw0Var2, blendModeCompat);
                Matrix matrix4 = wd2.a;
                canvas.saveLayer(rectF2, jw0Var2);
                if (i2 != 2) {
                    i(canvas);
                } else {
                    if (this.C == null) {
                        jw0 jw0Var3 = new jw0();
                        this.C = jw0Var3;
                        jw0Var3.setColor(-1);
                    }
                    canvas.drawRect(rectF2.left - 1.0f, rectF2.top - 1.0f, rectF2.right + 1.0f, rectF2.bottom + 1.0f, this.C);
                }
                j(canvas, matrix2, iIntValue, yc0Var);
                if (l()) {
                    jw0 jw0Var4 = this.e;
                    canvas.saveLayer(rectF2, jw0Var4);
                    if (Build.VERSION.SDK_INT < 28) {
                        i(canvas);
                    }
                    int i5 = 0;
                    while (true) {
                        List list = (List) rr0Var.d;
                        ArrayList arrayList = (ArrayList) rr0Var.b;
                        if (i5 >= list.size()) {
                            break;
                        }
                        r31 r31Var2 = (r31) list.get(i5);
                        ej ejVar2 = (ej) arrayList.get(i5);
                        ej ejVar3 = (ej) ((ArrayList) rr0Var.c).get(i5);
                        int i6 = r31Var2.a;
                        boolean z2 = r31Var2.d;
                        int iD3 = w11.D(i6);
                        int i7 = i5;
                        jw0 jw0Var5 = this.f;
                        if (iD3 == 0) {
                            path2 = path;
                            c = 4;
                            if (z2) {
                                Matrix matrix5 = wd2.a;
                                canvas.saveLayer(rectF2, jw0Var2);
                                canvas.drawRect(rectF2, jw0Var2);
                                path2.set((Path) ejVar2.e());
                                path2.transform(matrix2);
                                jw0Var2.setAlpha((int) (((Integer) ejVar3.e()).intValue() * 2.55f));
                                canvas.drawPath(path2, jw0Var5);
                                canvas.restore();
                            } else {
                                path2.set((Path) ejVar2.e());
                                path2.transform(matrix2);
                                jw0Var2.setAlpha((int) (((Integer) ejVar3.e()).intValue() * 2.55f));
                                canvas.drawPath(path2, jw0Var2);
                            }
                        } else if (iD3 == 1) {
                            path2 = path;
                            c = 4;
                            if (i7 == 0) {
                                jw0Var2.setColor(-16777216);
                                jw0Var2.setAlpha(255);
                                canvas.drawRect(rectF2, jw0Var2);
                            }
                            if (z2) {
                                Matrix matrix6 = wd2.a;
                                canvas.saveLayer(rectF2, jw0Var5);
                                canvas.drawRect(rectF2, jw0Var2);
                                jw0Var5.setAlpha((int) (((Integer) ejVar3.e()).intValue() * 2.55f));
                                path2.set((Path) ejVar2.e());
                                path2.transform(matrix2);
                                canvas.drawPath(path2, jw0Var5);
                                canvas.restore();
                            } else {
                                path2.set((Path) ejVar2.e());
                                path2.transform(matrix2);
                                canvas.drawPath(path2, jw0Var5);
                            }
                        } else if (iD3 == 2) {
                            c = 4;
                            if (z2) {
                                Matrix matrix7 = wd2.a;
                                canvas.saveLayer(rectF2, jw0Var4);
                                canvas.drawRect(rectF2, jw0Var2);
                                jw0Var5.setAlpha((int) (((Integer) ejVar3.e()).intValue() * 2.55f));
                                path3 = path;
                                path3.set((Path) ejVar2.e());
                                path3.transform(matrix2);
                                canvas.drawPath(path3, jw0Var5);
                                canvas.restore();
                            } else {
                                path3 = path;
                                Matrix matrix8 = wd2.a;
                                canvas.saveLayer(rectF2, jw0Var4);
                                path3.set((Path) ejVar2.e());
                                path3.transform(matrix2);
                                jw0Var2.setAlpha((int) (((Integer) ejVar3.e()).intValue() * 2.55f));
                                canvas.drawPath(path3, jw0Var2);
                                canvas.restore();
                            }
                            path2 = path3;
                        } else if (iD3 != 3) {
                            path2 = path;
                            c = 4;
                        } else {
                            if (!arrayList.isEmpty()) {
                                int i8 = 0;
                                while (true) {
                                    if (i8 >= list.size()) {
                                        c = 4;
                                        jw0Var2.setAlpha(255);
                                        canvas.drawRect(rectF2, jw0Var2);
                                        break;
                                    } else {
                                        c = 4;
                                        if (((r31) list.get(i8)).a != 4) {
                                            break;
                                        } else {
                                            i8++;
                                        }
                                    }
                                }
                            } else {
                                c = 4;
                            }
                            path2 = path;
                        }
                        i5 = i7 + 1;
                        path = path2;
                    }
                    canvas.restore();
                }
                if (this.s != null) {
                    canvas.saveLayer(rectF2, this.g);
                    i(canvas);
                    this.s.g(canvas, matrix, iIntValue, null);
                    canvas.restore();
                }
                canvas.restore();
            }
            if (this.y && (jw0Var = this.z) != null) {
                jw0Var.setStyle(Paint.Style.STROKE);
                this.z.setColor(-251901);
                this.z.setStrokeWidth(4.0f);
                canvas.drawRect(rectF2, this.z);
                this.z.setStyle(Paint.Style.FILL);
                this.z.setColor(1357638635);
                canvas.drawRect(rectF2, this.z);
            }
            m();
        }
    }

    public final void h() {
        if (this.u != null) {
            return;
        }
        if (this.t == null) {
            this.u = Collections.EMPTY_LIST;
            return;
        }
        this.u = new ArrayList();
        for (gj gjVar = this.t; gjVar != null; gjVar = gjVar.t) {
            this.u.add(gjVar);
        }
    }

    public final void i(Canvas canvas) {
        RectF rectF = this.i;
        canvas.drawRect(rectF.left - 1.0f, rectF.top - 1.0f, rectF.right + 1.0f, rectF.bottom + 1.0f, this.h);
    }

    public abstract void j(Canvas canvas, Matrix matrix, int i, yc0 yc0Var);

    public ri k() {
        return this.p.w;
    }

    public final boolean l() {
        rr0 rr0Var = this.q;
        return (rr0Var == null || ((ArrayList) rr0Var.b).isEmpty()) ? false : true;
    }

    public final void m() {
        id1 id1Var = this.o.a.a;
        String str = this.p.c;
        HashMap map = id1Var.c;
        if (id1Var.a) {
            t31 t31Var = (t31) map.get(str);
            if (t31Var == null) {
                t31Var = new t31();
                map.put(str, t31Var);
            }
            int i = t31Var.a + 1;
            t31Var.a = i;
            if (i == Integer.MAX_VALUE) {
                t31Var.a = i / 2;
            }
            if (str.equals("__container")) {
                Iterator<E> it = id1Var.b.iterator();
                if (it.hasNext()) {
                    it.next().getClass();
                    throw new ClassCastException();
                }
            }
        }
    }

    public final void n(ej ejVar) {
        this.v.remove(ejVar);
    }

    public void p(boolean z) {
        if (z && this.z == null) {
            this.z = new jw0();
        }
        this.y = z;
    }

    public void q(float f) {
        pb2 pb2Var = this.w;
        ej ejVar = pb2Var.j;
        if (ejVar != null) {
            ejVar.i(f);
        }
        ej ejVar2 = pb2Var.m;
        if (ejVar2 != null) {
            ejVar2.i(f);
        }
        ej ejVar3 = pb2Var.n;
        if (ejVar3 != null) {
            ejVar3.i(f);
        }
        ej ejVar4 = pb2Var.f;
        if (ejVar4 != null) {
            ejVar4.i(f);
        }
        ej ejVar5 = pb2Var.g;
        if (ejVar5 != null) {
            ejVar5.i(f);
        }
        ej ejVar6 = pb2Var.h;
        if (ejVar6 != null) {
            ejVar6.i(f);
        }
        ej ejVar7 = pb2Var.i;
        if (ejVar7 != null) {
            ejVar7.i(f);
        }
        mk0 mk0Var = pb2Var.k;
        if (mk0Var != null) {
            mk0Var.i(f);
        }
        mk0 mk0Var2 = pb2Var.l;
        if (mk0Var2 != null) {
            mk0Var2.i(f);
        }
        int i = 0;
        rr0 rr0Var = this.q;
        if (rr0Var != null) {
            ArrayList arrayList = (ArrayList) rr0Var.b;
            for (int i2 = 0; i2 < arrayList.size(); i2++) {
                ((ej) arrayList.get(i2)).i(f);
            }
        }
        mk0 mk0Var3 = this.r;
        if (mk0Var3 != null) {
            mk0Var3.i(f);
        }
        gj gjVar = this.s;
        if (gjVar != null) {
            gjVar.q(f);
        }
        while (true) {
            ArrayList arrayList2 = this.v;
            if (i >= arrayList2.size()) {
                return;
            }
            ((ej) arrayList2.get(i)).i(f);
            i++;
        }
    }

    @Override // defpackage.ou
    public final void b(List list, List list2) {
    }

    public void o(zv0 zv0Var, int i, ArrayList arrayList, zv0 zv0Var2) {
    }
}
