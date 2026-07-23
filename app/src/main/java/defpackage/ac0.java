package defpackage;

import android.graphics.PointF;

/* JADX INFO: loaded from: classes4.dex */
public final class ac0 {
    public String a;
    public String b;
    public float c;
    public int d;
    public int e;
    public float f;
    public float g;
    public int h;
    public int i;
    public float j;
    public boolean k;
    public PointF l;
    public PointF m;

    public final int hashCode() {
        int iD = ((w11.D(this.d) + (((int) (i02.i(this.a.hashCode() * 31, 31, this.b) + this.c)) * 31)) * 31) + this.e;
        long jFloatToRawIntBits = Float.floatToRawIntBits(this.f);
        return (((iD * 31) + ((int) (jFloatToRawIntBits ^ (jFloatToRawIntBits >>> 32)))) * 31) + this.h;
    }
}
