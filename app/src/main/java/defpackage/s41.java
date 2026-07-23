package defpackage;

import android.graphics.Path;
import android.graphics.PointF;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes4.dex */
public abstract class s41 {
    public static final PointF a = new PointF();

    public static PointF a(PointF pointF, PointF pointF2) {
        return new PointF(pointF.x + pointF2.x, pointF.y + pointF2.y);
    }

    public static float b(float f, float f2, float f3) {
        return Math.max(f2, Math.min(f3, f));
    }

    public static int c(int i) {
        return Math.max(0, Math.min(255, i));
    }

    public static int d(float f, float f2) {
        int i = (int) f;
        int i2 = (int) f2;
        int i3 = i / i2;
        int i4 = i % i2;
        if (!((i ^ i2) >= 0) && i4 != 0) {
            i3--;
        }
        return i - (i2 * i3);
    }

    public static void e(mz1 mz1Var, Path path) {
        Path path2;
        path.reset();
        PointF pointF = mz1Var.b;
        ArrayList arrayList = mz1Var.a;
        path.moveTo(pointF.x, pointF.y);
        float f = pointF.x;
        float f2 = pointF.y;
        PointF pointF2 = a;
        pointF2.set(f, f2);
        int i = 0;
        while (i < arrayList.size()) {
            bw bwVar = (bw) arrayList.get(i);
            PointF pointF3 = bwVar.a;
            PointF pointF4 = bwVar.b;
            PointF pointF5 = bwVar.c;
            if (pointF3.equals(pointF2) && pointF4.equals(pointF5)) {
                path.lineTo(pointF5.x, pointF5.y);
                path2 = path;
            } else {
                path2 = path;
                path2.cubicTo(pointF3.x, pointF3.y, pointF4.x, pointF4.y, pointF5.x, pointF5.y);
            }
            pointF2.set(pointF5.x, pointF5.y);
            i++;
            path = path2;
        }
        Path path3 = path;
        if (mz1Var.c) {
            path3.close();
        }
    }

    public static float f(float f, float f2, float f3) {
        return kb0.H(f2, f, f3, f);
    }

    public static void g(zv0 zv0Var, int i, ArrayList arrayList, zv0 zv0Var2, bw0 bw0Var) {
        if (zv0Var.a(i, bw0Var.getName())) {
            String name = bw0Var.getName();
            zv0 zv0Var3 = new zv0(zv0Var2);
            zv0Var3.a.add(name);
            zv0 zv0Var4 = new zv0(zv0Var3);
            zv0Var4.b = bw0Var;
            arrayList.add(zv0Var4);
        }
    }
}
