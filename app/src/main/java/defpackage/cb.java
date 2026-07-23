package defpackage;

import android.graphics.PointF;
import android.view.animation.Interpolator;
import androidx.media3.exoplayer.upstream.CmcdData;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public abstract class cb {
    public static final aa a = aa.f(CmcdData.OBJECT_TYPE_AUDIO_ONLY, TtmlNode.TAG_P, CmcdData.STREAMING_FORMAT_SS, "rz", "r", "o", "so", "eo", "sk", "sa");
    public static final aa b = aa.f("k");

    /* JADX WARN: Code duplicated, block: B:22:0x0068  */
    /* JADX WARN: Code duplicated, block: B:23:0x0085  */
    /* JADX WARN: Code duplicated, block: B:25:0x0093  */
    /* JADX WARN: Code duplicated, block: B:75:0x0172  */
    public static bb a(uv0 uv0Var, g11 g11Var) {
        ta taVar;
        ua uaVarG;
        List list;
        ua uaVar;
        ua uaVar2;
        Float fValueOf = Float.valueOf(0.0f);
        boolean z = uv0Var.l() == 3;
        if (z) {
            uv0Var.c();
        }
        ua uaVar3 = null;
        ua uaVarG2 = null;
        va vaVarA = null;
        db dbVarB = null;
        ta taVar2 = null;
        ua uaVarG3 = null;
        ta taVarI = null;
        ua uaVarG4 = null;
        ua uaVarG5 = null;
        while (uv0Var.g()) {
            switch (uv0Var.n(a)) {
                case 0:
                    uv0Var.c();
                    while (uv0Var.g()) {
                        if (uv0Var.n(b) != 0) {
                            uv0Var.o();
                            uv0Var.p();
                        } else {
                            vaVarA = wa.a(uv0Var, g11Var);
                        }
                    }
                    uv0Var.e();
                    uaVarG2 = uaVarG2;
                    break;
                case 1:
                    dbVarB = wa.b(uv0Var, g11Var);
                    break;
                case 2:
                    taVar2 = new ta(gw0.a(uv0Var, g11Var, 1.0f, yq.g, false), 4);
                    uaVarG2 = uaVarG2;
                    break;
                case 3:
                    g11Var.a("Lottie doesn't support 3D layers.");
                    uaVarG = tl0.G(uv0Var, g11Var, false);
                    list = uaVarG.a;
                    if (list.isEmpty()) {
                        uaVar = uaVarG;
                        uaVar2 = uaVarG2;
                        list.add(new dw0(g11Var, fValueOf, fValueOf, (Interpolator) null, 0.0f, Float.valueOf(g11Var.m)));
                    } else {
                        uaVar = uaVarG;
                        uaVar2 = uaVarG2;
                        if (((dw0) list.get(0)).b == null) {
                            list.set(0, new dw0(g11Var, fValueOf, fValueOf, (Interpolator) null, 0.0f, Float.valueOf(g11Var.m)));
                        }
                    }
                    uaVarG2 = uaVar2;
                    uaVar3 = uaVar;
                    break;
                case 4:
                    uaVarG = tl0.G(uv0Var, g11Var, false);
                    list = uaVarG.a;
                    if (list.isEmpty()) {
                        uaVar = uaVarG;
                        uaVar2 = uaVarG2;
                        list.add(new dw0(g11Var, fValueOf, fValueOf, (Interpolator) null, 0.0f, Float.valueOf(g11Var.m)));
                    } else {
                        uaVar = uaVarG;
                        uaVar2 = uaVarG2;
                        if (((dw0) list.get(0)).b == null) {
                            list.set(0, new dw0(g11Var, fValueOf, fValueOf, (Interpolator) null, 0.0f, Float.valueOf(g11Var.m)));
                        }
                    }
                    uaVarG2 = uaVar2;
                    uaVar3 = uaVar;
                    break;
                case 5:
                    taVarI = tl0.I(uv0Var, g11Var);
                    break;
                case 6:
                    uaVarG4 = tl0.G(uv0Var, g11Var, false);
                    break;
                case 7:
                    uaVarG5 = tl0.G(uv0Var, g11Var, false);
                    break;
                case 8:
                    uaVarG3 = tl0.G(uv0Var, g11Var, false);
                    break;
                case 9:
                    uaVarG2 = tl0.G(uv0Var, g11Var, false);
                    break;
                default:
                    uv0Var.o();
                    uv0Var.p();
                    break;
            }
        }
        ua uaVar4 = uaVarG2;
        if (z) {
            uv0Var.e();
        }
        va vaVar = (vaVarA == null || (vaVarA.c() && ((PointF) ((dw0) vaVarA.a.get(0)).b).equals(0.0f, 0.0f))) ? null : vaVarA;
        if (dbVarB == null || (!(dbVarB instanceof xa) && dbVarB.c() && ((PointF) ((dw0) dbVarB.b().get(0)).b).equals(0.0f, 0.0f))) {
            dbVarB = null;
        }
        ua uaVar5 = (uaVar3 == null || (uaVar3.c() && ((Float) ((dw0) uaVar3.a.get(0)).b).floatValue() == 0.0f)) ? null : uaVar3;
        if (taVar2 == null) {
            taVar = null;
        } else {
            if (taVar2.c()) {
                vu1 vu1Var = (vu1) ((dw0) taVar2.a.get(0)).b;
                if (vu1Var.a == 1.0f && vu1Var.b == 1.0f) {
                    taVar = null;
                }
            }
            taVar = taVar2;
        }
        return new bb(vaVar, dbVarB, taVar, uaVar5, taVarI, uaVarG4, uaVarG5, (uaVarG3 == null || (uaVarG3.c() && ((Float) ((dw0) uaVarG3.a.get(0)).b).floatValue() == 0.0f)) ? null : uaVarG3, (uaVar4 == null || (uaVar4.c() && ((Float) ((dw0) uaVar4.a.get(0)).b).floatValue() == 0.0f)) ? null : uaVar4);
    }
}
