package defpackage;

import android.graphics.Path;
import java.io.EOFException;
import java.util.ArrayList;
import java.util.Collections;

/* JADX INFO: loaded from: classes4.dex */
public abstract class wu {
    public static final aa a = aa.f("ty", "d");

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:124:0x01de  */
    /* JADX WARN: Code duplicated, block: B:16:0x0041  */
    /* JADX WARN: Code duplicated, block: B:445:0x0772 A[LOOP:1: B:443:0x076c->B:445:0x0772, LOOP_END] */
    public static vu a(uv0 uv0Var, g11 g11Var) throws sv0, EOFException {
        String strK;
        vu upVar;
        vu oz1Var;
        vu qz1Var;
        vu qm0Var;
        int i;
        int i2;
        uv0Var.c();
        int iJ = 2;
        while (true) {
            if (!uv0Var.g()) {
                strK = null;
                break;
            }
            int iN = uv0Var.n(a);
            if (iN == 0) {
                strK = uv0Var.k();
                break;
            }
            if (iN != 1) {
                uv0Var.o();
                uv0Var.p();
            } else {
                iJ = uv0Var.j();
            }
        }
        if (strK == null) {
            return null;
        }
        boolean zH = false;
        boolean zH2 = false;
        int i3 = 0;
        int i4 = 3;
        switch (strK) {
            case "el":
                aa aaVar = vp.a;
                boolean z = iJ == 3;
                boolean zH3 = false;
                String strK2 = null;
                db dbVarB = null;
                ta taVarJ = null;
                while (uv0Var.g()) {
                    int iN2 = uv0Var.n(vp.a);
                    if (iN2 == 0) {
                        strK2 = uv0Var.k();
                    } else if (iN2 == 1) {
                        dbVarB = wa.b(uv0Var, g11Var);
                    } else if (iN2 == 2) {
                        taVarJ = tl0.J(uv0Var, g11Var);
                    } else if (iN2 == 3) {
                        zH3 = uv0Var.h();
                    } else if (iN2 != 4) {
                        uv0Var.o();
                        uv0Var.p();
                    } else {
                        z = uv0Var.j() == 3;
                    }
                }
                upVar = new up(strK2, dbVarB, taVarJ, z, zH3);
                oz1Var = upVar;
                while (uv0Var.g()) {
                    uv0Var.p();
                }
                uv0Var.e();
                return oz1Var;
            case "fl":
                aa aaVar2 = pz1.a;
                int iJ2 = 1;
                boolean zH4 = false;
                boolean zH5 = false;
                ta taVar = null;
                String strK3 = null;
                ta taVarF = null;
                while (uv0Var.g()) {
                    int iN3 = uv0Var.n(pz1.a);
                    if (iN3 == 0) {
                        strK3 = uv0Var.k();
                    } else if (iN3 == 1) {
                        taVarF = tl0.F(uv0Var, g11Var);
                    } else if (iN3 == 2) {
                        taVar = tl0.I(uv0Var, g11Var);
                    } else if (iN3 == 3) {
                        zH4 = uv0Var.h();
                    } else if (iN3 == 4) {
                        iJ2 = uv0Var.j();
                    } else if (iN3 != 5) {
                        uv0Var.o();
                        uv0Var.p();
                    } else {
                        zH5 = uv0Var.h();
                    }
                }
                if (taVar == null) {
                    taVar = new ta(Collections.singletonList(new dw0(100)), 2);
                }
                oz1Var = new oz1(strK3, zH4, iJ2 == 1 ? Path.FillType.WINDING : Path.FillType.EVEN_ODD, taVarF, taVar, zH5);
                while (uv0Var.g()) {
                    uv0Var.p();
                }
                uv0Var.e();
                return oz1Var;
            case "gf":
                aa aaVar3 = pm0.a;
                Path.FillType fillType = Path.FillType.WINDING;
                int i5 = 0;
                boolean zH6 = false;
                ta taVar2 = null;
                String strK4 = null;
                ta taVarH = null;
                ta taVarJ2 = null;
                ta taVarJ3 = null;
                while (uv0Var.g()) {
                    switch (uv0Var.n(pm0.a)) {
                        case 0:
                            strK4 = uv0Var.k();
                            break;
                        case 1:
                            uv0Var.c();
                            int iJ3 = -1;
                            while (uv0Var.g()) {
                                int iN4 = uv0Var.n(pm0.b);
                                if (iN4 == 0) {
                                    iJ3 = uv0Var.j();
                                } else if (iN4 != 1) {
                                    uv0Var.o();
                                    uv0Var.p();
                                } else {
                                    taVarH = tl0.H(uv0Var, g11Var, iJ3);
                                }
                            }
                            uv0Var.e();
                            break;
                        case 2:
                            taVar2 = tl0.I(uv0Var, g11Var);
                            break;
                        case 3:
                            i5 = uv0Var.j() != 1 ? 2 : 1;
                            break;
                        case 4:
                            taVarJ2 = tl0.J(uv0Var, g11Var);
                            break;
                        case 5:
                            taVarJ3 = tl0.J(uv0Var, g11Var);
                            break;
                        case 6:
                            fillType = uv0Var.j() == 1 ? Path.FillType.WINDING : Path.FillType.EVEN_ODD;
                            break;
                        case 7:
                            zH6 = uv0Var.h();
                            break;
                        default:
                            uv0Var.o();
                            uv0Var.p();
                            break;
                    }
                }
                if (taVar2 == null) {
                    taVar2 = new ta(Collections.singletonList(new dw0(100)), 2);
                }
                oz1Var = new nm0(strK4, i5, fillType, taVarH, taVar2, taVarJ2, taVarJ3, zH6);
                while (uv0Var.g()) {
                    uv0Var.p();
                }
                uv0Var.e();
                return oz1Var;
            case "gr":
                aa aaVar4 = rz1.a;
                ArrayList arrayList = new ArrayList();
                String strK5 = null;
                while (uv0Var.g()) {
                    int iN5 = uv0Var.n(rz1.a);
                    if (iN5 == 0) {
                        strK5 = uv0Var.k();
                    } else if (iN5 == 1) {
                        zH = uv0Var.h();
                    } else if (iN5 != 2) {
                        uv0Var.p();
                    } else {
                        uv0Var.b();
                        while (uv0Var.g()) {
                            vu vuVarA = a(uv0Var, g11Var);
                            if (vuVarA != null) {
                                arrayList.add(vuVarA);
                            }
                        }
                        uv0Var.d();
                    }
                }
                qz1Var = new qz1(strK5, arrayList, zH);
                oz1Var = qz1Var;
                while (uv0Var.g()) {
                    uv0Var.p();
                }
                uv0Var.e();
                return oz1Var;
            case "gs":
                aa aaVar5 = sm0.a;
                ArrayList arrayList2 = new ArrayList();
                int i6 = 0;
                int i7 = 0;
                int i8 = 0;
                boolean zH7 = false;
                ta taVar3 = null;
                String strK6 = null;
                ta taVarH2 = null;
                ta taVarJ4 = null;
                ta taVarJ5 = null;
                ua uaVarG = null;
                ua uaVar = null;
                float fI = 0.0f;
                while (uv0Var.g()) {
                    switch (uv0Var.n(sm0.a)) {
                        case 0:
                            strK6 = uv0Var.k();
                            break;
                        case 1:
                            uv0Var.c();
                            int iJ4 = -1;
                            while (uv0Var.g()) {
                                int iN6 = uv0Var.n(sm0.b);
                                if (iN6 == 0) {
                                    iJ4 = uv0Var.j();
                                } else if (iN6 != 1) {
                                    uv0Var.o();
                                    uv0Var.p();
                                } else {
                                    taVarH2 = tl0.H(uv0Var, g11Var, iJ4);
                                }
                            }
                            uv0Var.e();
                            break;
                        case 2:
                            taVar3 = tl0.I(uv0Var, g11Var);
                            break;
                        case 3:
                            i6 = uv0Var.j() != 1 ? 2 : 1;
                            break;
                        case 4:
                            taVarJ4 = tl0.J(uv0Var, g11Var);
                            break;
                        case 5:
                            taVarJ5 = tl0.J(uv0Var, g11Var);
                            break;
                        case 6:
                            uaVarG = tl0.G(uv0Var, g11Var, true);
                            break;
                        case 7:
                            i7 = w11.E(3)[uv0Var.j() - 1];
                            break;
                        case 8:
                            i8 = w11.E(3)[uv0Var.j() - 1];
                            break;
                        case 9:
                            fI = (float) uv0Var.i();
                            break;
                        case 10:
                            zH7 = uv0Var.h();
                            break;
                        case 11:
                            uv0Var.b();
                            while (uv0Var.g()) {
                                uv0Var.c();
                                String strK7 = null;
                                ua uaVarG2 = null;
                                while (uv0Var.g()) {
                                    int iN7 = uv0Var.n(sm0.c);
                                    if (iN7 == 0) {
                                        strK7 = uv0Var.k();
                                    } else if (iN7 != 1) {
                                        uv0Var.o();
                                        uv0Var.p();
                                    } else {
                                        uaVarG2 = tl0.G(uv0Var, g11Var, true);
                                    }
                                }
                                uv0Var.e();
                                if (strK7.equals("o")) {
                                    uaVar = uaVarG2;
                                } else if (strK7.equals("d") || strK7.equals("g")) {
                                    g11Var.o = true;
                                    arrayList2.add(uaVarG2);
                                }
                            }
                            uv0Var.d();
                            if (arrayList2.size() == 1) {
                                arrayList2.add((ua) arrayList2.get(0));
                            }
                            break;
                        default:
                            uv0Var.o();
                            uv0Var.p();
                            break;
                    }
                }
                if (taVar3 == null) {
                    taVar3 = new ta(Collections.singletonList(new dw0(100)), 2);
                }
                qm0Var = new qm0(strK6, i6, taVarH2, taVar3, taVarJ4, taVarJ5, uaVarG, i7, i8, fI, arrayList2, uaVar, zH7);
                oz1Var = qm0Var;
                while (uv0Var.g()) {
                    uv0Var.p();
                }
                uv0Var.e();
                return oz1Var;
            case "mm":
                aa aaVar6 = m41.a;
                boolean zH8 = false;
                String strK8 = null;
                while (uv0Var.g()) {
                    int iN8 = uv0Var.n(m41.a);
                    if (iN8 == 0) {
                        strK8 = uv0Var.k();
                    } else if (iN8 == 1) {
                        int iJ5 = uv0Var.j();
                        if (iJ5 != 1) {
                            if (iJ5 == 2) {
                                i3 = 2;
                            } else if (iJ5 == 3) {
                                i3 = 3;
                            } else if (iJ5 == 4) {
                                i3 = 4;
                            } else if (iJ5 == 5) {
                                i3 = 5;
                            }
                        }
                        i3 = 1;
                    } else if (iN8 != 2) {
                        uv0Var.o();
                        uv0Var.p();
                    } else {
                        zH8 = uv0Var.h();
                    }
                }
                k41 k41Var = new k41(strK8, i3, zH8);
                g11Var.a("Animation contains merge paths. Merge paths are only supported on KitKat+ and must be manually enabled by calling enableMergePathsForKitKatAndAbove().");
                oz1Var = k41Var;
                while (uv0Var.g()) {
                    uv0Var.p();
                }
                uv0Var.e();
                return oz1Var;
            case "rc":
                aa aaVar7 = ys1.a;
                boolean zH9 = false;
                String strK9 = null;
                db dbVarB2 = null;
                ta taVarJ6 = null;
                ua uaVarG3 = null;
                while (uv0Var.g()) {
                    int iN9 = uv0Var.n(ys1.a);
                    if (iN9 == 0) {
                        strK9 = uv0Var.k();
                    } else if (iN9 == 1) {
                        dbVarB2 = wa.b(uv0Var, g11Var);
                    } else if (iN9 == 2) {
                        taVarJ6 = tl0.J(uv0Var, g11Var);
                    } else if (iN9 == 3) {
                        uaVarG3 = tl0.G(uv0Var, g11Var, true);
                    } else if (iN9 != 4) {
                        uv0Var.p();
                    } else {
                        zH9 = uv0Var.h();
                    }
                }
                qm0Var = new xs1(strK9, dbVarB2, taVarJ6, uaVarG3, zH9);
                oz1Var = qm0Var;
                while (uv0Var.g()) {
                    uv0Var.p();
                }
                uv0Var.e();
                return oz1Var;
            case "rd":
                aa aaVar8 = cu1.a;
                String strK10 = null;
                ua uaVarG4 = null;
                while (uv0Var.g()) {
                    int iN10 = uv0Var.n(cu1.a);
                    if (iN10 == 0) {
                        strK10 = uv0Var.k();
                    } else if (iN10 == 1) {
                        uaVarG4 = tl0.G(uv0Var, g11Var, true);
                    } else if (iN10 != 2) {
                        uv0Var.p();
                    } else {
                        zH2 = uv0Var.h();
                    }
                }
                oz1Var = zH2 ? null : new au1(strK10, uaVarG4);
                while (uv0Var.g()) {
                    uv0Var.p();
                }
                uv0Var.e();
                return oz1Var;
            case "rp":
                aa aaVar9 = pt1.a;
                boolean zH10 = false;
                String strK11 = null;
                ua uaVarG5 = null;
                ua uaVarG6 = null;
                bb bbVarA = null;
                while (uv0Var.g()) {
                    int iN11 = uv0Var.n(pt1.a);
                    if (iN11 == 0) {
                        strK11 = uv0Var.k();
                    } else if (iN11 == 1) {
                        uaVarG5 = tl0.G(uv0Var, g11Var, false);
                    } else if (iN11 == 2) {
                        uaVarG6 = tl0.G(uv0Var, g11Var, false);
                    } else if (iN11 == 3) {
                        bbVarA = cb.a(uv0Var, g11Var);
                    } else if (iN11 != 4) {
                        uv0Var.p();
                    } else {
                        zH10 = uv0Var.h();
                    }
                }
                qm0Var = new xs1(strK11, uaVarG5, uaVarG6, bbVarA, zH10);
                oz1Var = qm0Var;
                while (uv0Var.g()) {
                    uv0Var.p();
                }
                uv0Var.e();
                return oz1Var;
            case "sh":
                aa aaVar10 = vz1.a;
                int iJ6 = 0;
                boolean zH11 = false;
                ta taVar4 = null;
                String strK12 = null;
                while (uv0Var.g()) {
                    int iN12 = uv0Var.n(vz1.a);
                    if (iN12 == 0) {
                        strK12 = uv0Var.k();
                    } else if (iN12 == 1) {
                        iJ6 = uv0Var.j();
                    } else if (iN12 == 2) {
                        taVar4 = new ta(gw0.a(uv0Var, g11Var, wd2.c(), nz1.a, false), 5);
                    } else if (iN12 != 3) {
                        uv0Var.p();
                    } else {
                        zH11 = uv0Var.h();
                    }
                }
                qz1Var = new uz1(strK12, iJ6, taVar4, zH11);
                oz1Var = qz1Var;
                while (uv0Var.g()) {
                    uv0Var.p();
                }
                uv0Var.e();
                return oz1Var;
            case "sr":
                aa aaVar11 = dp1.a;
                boolean z2 = iJ == 3;
                int i9 = 0;
                boolean zH12 = false;
                String strK13 = null;
                ua uaVarG7 = null;
                db dbVarB3 = null;
                ua uaVarG8 = null;
                ua uaVarG9 = null;
                ua uaVarG10 = null;
                ua uaVarG11 = null;
                ua uaVarG12 = null;
                while (uv0Var.g()) {
                    switch (uv0Var.n(dp1.a)) {
                        case 0:
                            strK13 = uv0Var.k();
                            break;
                        case 1:
                            int iJ7 = uv0Var.j();
                            int[] iArrE = w11.E(2);
                            int length = iArrE.length;
                            int i10 = 0;
                            while (true) {
                                if (i10 >= length) {
                                    i9 = 0;
                                }
                                int i11 = iArrE[i10];
                                if (i11 == 1) {
                                    i = 1;
                                } else {
                                    if (i11 != 2) {
                                        throw null;
                                    }
                                    i = 2;
                                }
                                if (i == iJ7) {
                                    i9 = i11;
                                }
                                i10++;
                                break;
                                break;
                            }
                            break;
                        case 2:
                            uaVarG7 = tl0.G(uv0Var, g11Var, false);
                            break;
                        case 3:
                            dbVarB3 = wa.b(uv0Var, g11Var);
                            break;
                        case 4:
                            uaVarG8 = tl0.G(uv0Var, g11Var, false);
                            break;
                        case 5:
                            uaVarG10 = tl0.G(uv0Var, g11Var, true);
                            break;
                        case 6:
                            uaVarG12 = tl0.G(uv0Var, g11Var, false);
                            break;
                        case 7:
                            uaVarG9 = tl0.G(uv0Var, g11Var, true);
                            break;
                        case 8:
                            uaVarG11 = tl0.G(uv0Var, g11Var, false);
                            break;
                        case 9:
                            zH12 = uv0Var.h();
                            break;
                        case 10:
                            z2 = uv0Var.j() == 3;
                            break;
                        default:
                            uv0Var.o();
                            uv0Var.p();
                            break;
                    }
                }
                qm0Var = new cp1(strK13, i9, uaVarG7, dbVarB3, uaVarG8, uaVarG9, uaVarG10, uaVarG11, uaVarG12, zH12, z2);
                oz1Var = qm0Var;
                while (uv0Var.g()) {
                    uv0Var.p();
                }
                uv0Var.e();
                return oz1Var;
            case "st":
                aa aaVar12 = xz1.a;
                ArrayList arrayList3 = new ArrayList();
                int i12 = 0;
                int i13 = 0;
                boolean zH13 = false;
                ta taVar5 = null;
                String strK14 = null;
                ua uaVar2 = null;
                ta taVarF2 = null;
                ua uaVarG13 = null;
                float fI2 = 0.0f;
                while (uv0Var.g()) {
                    switch (uv0Var.n(xz1.a)) {
                        case 0:
                            strK14 = uv0Var.k();
                            continue;
                        case 1:
                            taVarF2 = tl0.F(uv0Var, g11Var);
                            continue;
                        case 2:
                            uaVarG13 = tl0.G(uv0Var, g11Var, true);
                            continue;
                        case 3:
                            taVar5 = tl0.I(uv0Var, g11Var);
                            continue;
                        case 4:
                            i12 = w11.E(i4)[uv0Var.j() - 1];
                            continue;
                        case 5:
                            i13 = w11.E(i4)[uv0Var.j() - 1];
                            continue;
                        case 6:
                            i2 = i4;
                            fI2 = (float) uv0Var.i();
                            break;
                        case 7:
                            zH13 = uv0Var.h();
                            continue;
                        case 8:
                            uv0Var.b();
                            while (uv0Var.g()) {
                                uv0Var.c();
                                ua uaVarG14 = null;
                                String strK15 = null;
                                while (uv0Var.g()) {
                                    int i14 = i4;
                                    int iN13 = uv0Var.n(xz1.b);
                                    if (iN13 == 0) {
                                        strK15 = uv0Var.k();
                                    } else if (iN13 != 1) {
                                        uv0Var.o();
                                        uv0Var.p();
                                    } else {
                                        uaVarG14 = tl0.G(uv0Var, g11Var, true);
                                    }
                                    i4 = i14;
                                }
                                int i15 = i4;
                                uv0Var.e();
                                strK15.getClass();
                                switch (strK15) {
                                    case "d":
                                    case "g":
                                        g11Var.o = true;
                                        arrayList3.add(uaVarG14);
                                        break;
                                    case "o":
                                        uaVar2 = uaVarG14;
                                        break;
                                }
                                i4 = i15;
                            }
                            i2 = i4;
                            uv0Var.d();
                            if (arrayList3.size() == 1) {
                                arrayList3.add((ua) arrayList3.get(0));
                            }
                            break;
                        default:
                            uv0Var.p();
                            continue;
                    }
                    i4 = i2;
                }
                if (taVar5 == null) {
                    taVar5 = new ta(Collections.singletonList(new dw0(100)), 2);
                }
                oz1Var = new wz1(strK14, uaVar2, arrayList3, taVarF2, taVar5, uaVarG13, i12 == 0 ? 1 : i12, i13 == 0 ? 1 : i13, fI2, zH13);
                while (uv0Var.g()) {
                    uv0Var.p();
                }
                uv0Var.e();
                return oz1Var;
            case "tm":
                aa aaVar13 = zz1.a;
                int i16 = 0;
                boolean zH14 = false;
                String strK16 = null;
                ua uaVarG15 = null;
                ua uaVarG16 = null;
                ua uaVarG17 = null;
                while (uv0Var.g()) {
                    int iN14 = uv0Var.n(zz1.a);
                    if (iN14 == 0) {
                        uaVarG15 = tl0.G(uv0Var, g11Var, false);
                    } else if (iN14 == 1) {
                        uaVarG16 = tl0.G(uv0Var, g11Var, false);
                    } else if (iN14 == 2) {
                        uaVarG17 = tl0.G(uv0Var, g11Var, false);
                    } else if (iN14 == 3) {
                        strK16 = uv0Var.k();
                    } else if (iN14 == 4) {
                        int iJ8 = uv0Var.j();
                        if (iJ8 == 1) {
                            i16 = 1;
                        } else {
                            if (iJ8 != 2) {
                                ra.q(i9.f(iJ8, "Unknown trim path type "));
                                return null;
                            }
                            i16 = 2;
                        }
                    } else if (iN14 != 5) {
                        uv0Var.p();
                    } else {
                        zH14 = uv0Var.h();
                    }
                }
                upVar = new yz1(strK16, i16, uaVarG15, uaVarG16, uaVarG17, zH14);
                oz1Var = upVar;
                while (uv0Var.g()) {
                    uv0Var.p();
                }
                uv0Var.e();
                return oz1Var;
            case "tr":
                oz1Var = cb.a(uv0Var, g11Var);
                while (uv0Var.g()) {
                    uv0Var.p();
                }
                uv0Var.e();
                return oz1Var;
            default:
                r01.b("Unknown shape type ".concat(strK));
                while (uv0Var.g()) {
                    uv0Var.p();
                }
                uv0Var.e();
                return oz1Var;
        }
    }
}
