package defpackage;

import android.graphics.PointF;
import androidx.media3.exoplayer.upstream.CmcdData;
import java.util.ArrayList;
import java.util.Collections;

/* JADX INFO: loaded from: classes4.dex */
public final class nz1 implements fe2 {
    public static final nz1 a = new nz1();
    public static final aa b = aa.f("c", "v", CmcdData.OBJECT_TYPE_INIT_SEGMENT, "o");

    @Override // defpackage.fe2
    public final Object g(tv0 tv0Var, float f) {
        if (tv0Var.l() == 1) {
            tv0Var.b();
        }
        tv0Var.c();
        ArrayList arrayListC = null;
        ArrayList arrayListC2 = null;
        ArrayList arrayListC3 = null;
        boolean zH = false;
        while (tv0Var.g()) {
            int iN = tv0Var.n(b);
            if (iN == 0) {
                zH = tv0Var.h();
            } else if (iN == 1) {
                arrayListC = vv0.c(tv0Var, f);
            } else if (iN == 2) {
                arrayListC2 = vv0.c(tv0Var, f);
            } else if (iN != 3) {
                tv0Var.o();
                tv0Var.p();
            } else {
                arrayListC3 = vv0.c(tv0Var, f);
            }
        }
        tv0Var.e();
        if (tv0Var.l() == 2) {
            tv0Var.d();
        }
        if (arrayListC == null || arrayListC2 == null || arrayListC3 == null) {
            ra.q("Shape data was missing information.");
            return null;
        }
        if (arrayListC.isEmpty()) {
            return new mz1(new PointF(), false, Collections.EMPTY_LIST);
        }
        int size = arrayListC.size();
        PointF pointF = (PointF) arrayListC.get(0);
        ArrayList arrayList = new ArrayList(size);
        for (int i = 1; i < size; i++) {
            PointF pointF2 = (PointF) arrayListC.get(i);
            int i2 = i - 1;
            arrayList.add(new bw(s41.a((PointF) arrayListC.get(i2), (PointF) arrayListC3.get(i2)), s41.a(pointF2, (PointF) arrayListC2.get(i)), pointF2));
        }
        if (zH) {
            PointF pointF3 = (PointF) arrayListC.get(0);
            int i3 = size - 1;
            arrayList.add(new bw(s41.a((PointF) arrayListC.get(i3), (PointF) arrayListC3.get(i3)), s41.a(pointF3, (PointF) arrayListC2.get(0)), pointF3));
        }
        return new mz1(pointF, zH, arrayList);
    }
}
