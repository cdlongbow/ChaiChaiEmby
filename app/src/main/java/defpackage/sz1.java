package defpackage;

import android.graphics.Path;
import android.graphics.PointF;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public final class sz1 extends ej {
    public final mz1 i;
    public final Path j;
    public Path k;
    public Path l;
    public ArrayList m;

    public sz1(List list) {
        super(list);
        this.i = new mz1();
        this.j = new Path();
    }

    /* JADX WARN: Code duplicated, block: B:42:0x016f  */
    @Override // defpackage.ej
    public final Object f(dw0 dw0Var, float f) {
        mz1 mz1Var;
        mz1 mz1Var2;
        int i;
        int i2;
        mz1 mz1Var3;
        mz1 mz1Var4 = (mz1) dw0Var.b;
        mz1 mz1Var5 = (mz1) dw0Var.c;
        mz1 mz1Var6 = mz1Var5 == null ? mz1Var4 : mz1Var5;
        mz1 mz1Var7 = this.i;
        ArrayList arrayList = mz1Var7.a;
        if (mz1Var7.b == null) {
            mz1Var7.b = new PointF();
        }
        boolean z = mz1Var4.c;
        ArrayList arrayList2 = mz1Var4.a;
        boolean z2 = true;
        mz1Var7.c = z || mz1Var6.c;
        int size = arrayList2.size();
        ArrayList arrayList3 = mz1Var6.a;
        if (size != arrayList3.size()) {
            r01.b("Curves must have the same number of control points. Shape 1: " + arrayList2.size() + "\tShape 2: " + arrayList3.size());
        }
        int iMin = Math.min(arrayList2.size(), arrayList3.size());
        if (arrayList.size() < iMin) {
            for (int size2 = arrayList.size(); size2 < iMin; size2++) {
                arrayList.add(new bw());
            }
        } else if (arrayList.size() > iMin) {
            for (int size3 = arrayList.size() - 1; size3 >= iMin; size3--) {
                arrayList.remove(arrayList.size() - 1);
            }
        }
        PointF pointF = mz1Var4.b;
        PointF pointF2 = mz1Var6.b;
        mz1Var7.a(s41.f(pointF.x, pointF2.x, f), s41.f(pointF.y, pointF2.y, f));
        int size4 = arrayList.size() - 1;
        while (size4 >= 0) {
            bw bwVar = (bw) arrayList2.get(size4);
            bw bwVar2 = (bw) arrayList3.get(size4);
            PointF pointF3 = bwVar.a;
            PointF pointF4 = bwVar.b;
            PointF pointF5 = bwVar.c;
            boolean z3 = z2;
            PointF pointF6 = bwVar2.a;
            PointF pointF7 = bwVar2.b;
            PointF pointF8 = bwVar2.c;
            ((bw) arrayList.get(size4)).a.set(s41.f(pointF3.x, pointF6.x, f), s41.f(pointF3.y, pointF6.y, f));
            ((bw) arrayList.get(size4)).b.set(s41.f(pointF4.x, pointF7.x, f), s41.f(pointF4.y, pointF7.y, f));
            ((bw) arrayList.get(size4)).c.set(s41.f(pointF5.x, pointF8.x, f), s41.f(pointF5.y, pointF8.y, f));
            size4--;
            z2 = z3;
            arrayList2 = arrayList2;
            mz1Var7 = mz1Var7;
            arrayList3 = arrayList3;
        }
        mz1 mz1Var8 = mz1Var7;
        boolean z4 = z2;
        ArrayList arrayList4 = this.m;
        if (arrayList4 != null) {
            int size5 = arrayList4.size() - 1;
            mz1Var = mz1Var8;
            while (true) {
                ArrayList arrayList5 = mz1Var.a;
                if (size5 < 0) {
                    break;
                }
                bu1 bu1Var = (bu1) this.m.get(size5);
                bu1Var.getClass();
                if (arrayList5.size() <= 2) {
                    i = size5;
                } else {
                    float fFloatValue = ((Float) bu1Var.b.e()).floatValue();
                    if (fFloatValue == 0.0f) {
                        i = size5;
                    } else {
                        boolean z5 = mz1Var.c;
                        int size6 = arrayList5.size() - 1;
                        int i3 = 0;
                        while (size6 >= 0) {
                            bw bwVar3 = (bw) arrayList5.get(size6);
                            bw bwVar4 = (bw) arrayList5.get(bu1.c(size6 - 1, arrayList5.size()));
                            PointF pointF9 = (size6 != 0 || z5) ? bwVar4.c : mz1Var.b;
                            int i4 = size5;
                            i3 = (((size6 != 0 || z5) ? bwVar4.b : pointF9).equals(pointF9) && bwVar3.a.equals(pointF9) && !((mz1Var.c || (size6 != 0 && size6 != arrayList5.size() + (-1))) ? false : z4)) ? i3 + 2 : i3 + 1;
                            size6--;
                            size5 = i4;
                        }
                        i = size5;
                        mz1 mz1Var9 = bu1Var.c;
                        if (mz1Var9 == null || mz1Var9.a.size() != i3) {
                            ArrayList arrayList6 = new ArrayList(i3);
                            for (int i5 = 0; i5 < i3; i5++) {
                                arrayList6.add(new bw());
                            }
                            i2 = 0;
                            bu1Var.c = new mz1(new PointF(0.0f, 0.0f), false, arrayList6);
                        } else {
                            i2 = 0;
                        }
                        mz1 mz1Var10 = bu1Var.c;
                        mz1Var10.c = z5;
                        PointF pointF10 = mz1Var.b;
                        mz1Var10.a(pointF10.x, pointF10.y);
                        ArrayList arrayList7 = mz1Var10.a;
                        boolean z6 = mz1Var.c;
                        int i6 = i2;
                        int i7 = i6;
                        while (i6 < arrayList5.size()) {
                            bw bwVar5 = (bw) arrayList5.get(i6);
                            bw bwVar6 = (bw) arrayList5.get(bu1.c(i6 - 1, arrayList5.size()));
                            bw bwVar7 = (bw) arrayList5.get(bu1.c(i6 - 2, arrayList5.size()));
                            PointF pointF11 = (i6 != 0 || z6) ? bwVar6.c : mz1Var.b;
                            PointF pointF12 = (i6 != 0 || z6) ? bwVar6.b : pointF11;
                            float f2 = fFloatValue;
                            PointF pointF13 = bwVar5.a;
                            PointF pointF14 = bwVar7.c;
                            boolean z7 = z6;
                            PointF pointF15 = bwVar5.c;
                            boolean z8 = (mz1Var.c || !(i6 == 0 || i6 == arrayList5.size() + (-1))) ? false : z4;
                            if (pointF12.equals(pointF11) && pointF13.equals(pointF11) && !z8) {
                                float f3 = pointF11.x;
                                float f4 = f3 - pointF14.x;
                                float f5 = pointF11.y;
                                float f6 = f5 - pointF14.y;
                                float f7 = pointF15.x - f3;
                                float f8 = pointF15.y - f5;
                                mz1 mz1Var11 = mz1Var;
                                float fHypot = (float) Math.hypot(f4, f6);
                                float fHypot2 = (float) Math.hypot(f7, f8);
                                float fMin = Math.min(f2 / fHypot, 0.5f);
                                float fMin2 = Math.min(f2 / fHypot2, 0.5f);
                                float f9 = pointF11.x;
                                float fH = kb0.H(pointF14.x, f9, fMin, f9);
                                float f10 = pointF11.y;
                                float fH2 = kb0.H(pointF14.y, f10, fMin, f10);
                                float fH3 = kb0.H(pointF15.x, f9, fMin2, f9);
                                float fH4 = kb0.H(pointF15.y, f10, fMin2, f10);
                                float f11 = fH - ((fH - f9) * 0.5519f);
                                float f12 = fH2 - ((fH2 - f10) * 0.5519f);
                                float f13 = fH3 - ((fH3 - f9) * 0.5519f);
                                float f14 = fH4 - ((fH4 - f10) * 0.5519f);
                                bw bwVar8 = (bw) arrayList7.get(bu1.c(i7 - 1, arrayList7.size()));
                                bw bwVar9 = (bw) arrayList7.get(i7);
                                mz1Var3 = mz1Var11;
                                bwVar8.b.set(fH, fH2);
                                bwVar8.c.set(fH, fH2);
                                if (i6 == 0) {
                                    mz1Var10.a(fH, fH2);
                                }
                                bwVar9.a.set(f11, f12);
                                bw bwVar10 = (bw) arrayList7.get(i7 + 1);
                                bwVar9.b.set(f13, f14);
                                bwVar9.c.set(fH3, fH4);
                                bwVar10.a.set(fH3, fH4);
                                i7 += 2;
                            } else {
                                mz1Var3 = mz1Var;
                                bw bwVar11 = (bw) arrayList7.get(bu1.c(i7 - 1, arrayList7.size()));
                                bw bwVar12 = (bw) arrayList7.get(i7);
                                PointF pointF16 = bwVar6.b;
                                bwVar11.b.set(pointF16.x, pointF16.y);
                                PointF pointF17 = bwVar6.c;
                                bwVar11.c.set(pointF17.x, pointF17.y);
                                PointF pointF18 = bwVar5.a;
                                bwVar12.a.set(pointF18.x, pointF18.y);
                                i7++;
                            }
                            i6++;
                            arrayList5 = arrayList5;
                            fFloatValue = f2;
                            z6 = z7;
                            mz1Var4 = mz1Var4;
                            mz1Var5 = mz1Var5;
                            mz1Var = mz1Var3;
                        }
                        mz1Var = mz1Var10;
                    }
                }
                size5 = i - 1;
                mz1Var4 = mz1Var4;
                mz1Var5 = mz1Var5;
            }
        } else {
            mz1Var = mz1Var8;
        }
        mz1 mz1Var12 = mz1Var4;
        mz1 mz1Var13 = mz1Var5;
        Path path = this.j;
        s41.e(mz1Var, path);
        if (this.e == null) {
            return path;
        }
        if (this.k == null) {
            this.k = new Path();
            this.l = new Path();
        }
        s41.e(mz1Var12, this.k);
        if (mz1Var13 != null) {
            mz1Var2 = mz1Var13;
            s41.e(mz1Var2, this.l);
        } else {
            mz1Var2 = mz1Var13;
        }
        i21 i21Var = this.e;
        float f15 = dw0Var.g;
        float fFloatValue2 = dw0Var.h.floatValue();
        mz1 mz1Var14 = mz1Var2;
        Path path2 = this.k;
        return (Path) i21Var.b(f15, fFloatValue2, path2, mz1Var14 == null ? path2 : this.l, f, d(), this.d);
    }

    @Override // defpackage.ej
    public final boolean k() {
        ArrayList arrayList = this.m;
        return (arrayList == null || arrayList.isEmpty()) ? false : true;
    }
}
