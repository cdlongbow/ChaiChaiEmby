package defpackage;

import android.graphics.Color;
import android.graphics.Matrix;

/* JADX INFO: loaded from: classes4.dex */
public final class yc0 {
    public float a;
    public float b;
    public float c;
    public int d;
    public float[] e = null;

    public yc0(yc0 yc0Var) {
        this.a = 0.0f;
        this.b = 0.0f;
        this.c = 0.0f;
        this.d = 0;
        this.a = yc0Var.a;
        this.b = yc0Var.b;
        this.c = yc0Var.c;
        this.d = yc0Var.d;
    }

    public final void a(int i, jw0 jw0Var) {
        int iAlpha = Color.alpha(this.d);
        int iC = s41.c(i);
        Matrix matrix = wd2.a;
        int i2 = (int) ((((iAlpha / 255.0f) * iC) / 255.0f) * 255.0f);
        if (i2 <= 0) {
            jw0Var.clearShadowLayer();
        } else {
            jw0Var.setShadowLayer(Math.max(this.a, Float.MIN_VALUE), this.b, this.c, Color.argb(i2, Color.red(this.d), Color.green(this.d), Color.blue(this.d)));
        }
    }

    public final void b(int i) {
        this.d = Color.argb(Math.round((s41.c(i) * Color.alpha(this.d)) / 255.0f), Color.red(this.d), Color.green(this.d), Color.blue(this.d));
    }

    public final void c(Matrix matrix) {
        if (this.e == null) {
            this.e = new float[2];
        }
        float[] fArr = this.e;
        fArr[0] = this.b;
        fArr[1] = this.c;
        matrix.mapVectors(fArr);
        float[] fArr2 = this.e;
        this.b = fArr2[0];
        this.c = fArr2[1];
        this.a = matrix.mapRadius(this.a);
    }
}
