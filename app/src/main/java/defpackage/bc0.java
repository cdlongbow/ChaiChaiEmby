package defpackage;

import android.graphics.PointF;
import androidx.media3.exoplayer.upstream.CmcdData;

/* JADX INFO: loaded from: classes4.dex */
public final class bc0 implements fe2 {
    public static final bc0 a = new bc0();
    public static final aa b = aa.f("t", "f", CmcdData.STREAMING_FORMAT_SS, "j", "tr", "lh", "ls", "fc", "sc", "sw", "of", "ps", "sz");

    @Override // defpackage.fe2
    public final Object g(tv0 tv0Var, float f) {
        tv0Var.c();
        String strK = null;
        float fI = 0.0f;
        float fI2 = 0.0f;
        float fI3 = 0.0f;
        float fI4 = 0.0f;
        int iJ = 0;
        int iA = 0;
        int iA2 = 0;
        boolean zH = true;
        int i = 3;
        String strK2 = null;
        PointF pointF = null;
        PointF pointF2 = null;
        while (tv0Var.g()) {
            switch (tv0Var.n(b)) {
                case 0:
                    strK = tv0Var.k();
                    break;
                case 1:
                    strK2 = tv0Var.k();
                    break;
                case 2:
                    fI = (float) tv0Var.i();
                    break;
                case 3:
                    int iJ2 = tv0Var.j();
                    i = (iJ2 <= 2 && iJ2 >= 0) ? w11.E(3)[iJ2] : 3;
                    break;
                case 4:
                    iJ = tv0Var.j();
                    break;
                case 5:
                    fI2 = (float) tv0Var.i();
                    break;
                case 6:
                    fI3 = (float) tv0Var.i();
                    break;
                case 7:
                    iA = vv0.a(tv0Var);
                    break;
                case 8:
                    iA2 = vv0.a(tv0Var);
                    break;
                case 9:
                    fI4 = (float) tv0Var.i();
                    break;
                case 10:
                    zH = tv0Var.h();
                    break;
                case 11:
                    tv0Var.b();
                    pointF = new PointF(((float) tv0Var.i()) * f, ((float) tv0Var.i()) * f);
                    tv0Var.d();
                    break;
                case 12:
                    tv0Var.b();
                    pointF = pointF;
                    pointF2 = new PointF(((float) tv0Var.i()) * f, ((float) tv0Var.i()) * f);
                    tv0Var.d();
                    break;
                default:
                    tv0Var.o();
                    tv0Var.p();
                    break;
            }
        }
        tv0Var.e();
        ac0 ac0Var = new ac0();
        ac0Var.a = strK;
        ac0Var.b = strK2;
        ac0Var.c = fI;
        ac0Var.d = i;
        ac0Var.e = iJ;
        ac0Var.f = fI2;
        ac0Var.g = fI3;
        ac0Var.h = iA;
        ac0Var.i = iA2;
        ac0Var.j = fI4;
        ac0Var.k = zH;
        ac0Var.l = pointF;
        ac0Var.m = pointF2;
        return ac0Var;
    }
}
