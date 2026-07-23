package defpackage;

import android.graphics.Rect;
import androidx.collection.LongSparseArray;
import androidx.collection.SparseArrayCompat;
import androidx.media3.exoplayer.upstream.CmcdData;
import java.util.ArrayList;
import java.util.HashMap;

/* JADX INFO: loaded from: classes4.dex */
public abstract class n11 {
    public static final aa a = aa.f("w", CmcdData.STREAMING_FORMAT_HLS, "ip", "op", "fr", "v", "layers", "assets", "fonts", "chars", "markers");
    public static final aa b = aa.f(TtmlNode.ATTR_ID, "layers", "w", CmcdData.STREAMING_FORMAT_HLS, TtmlNode.TAG_P, "u");
    public static final aa c = aa.f("list");
    public static final aa d = aa.f("cm", "tm", "dr");

    /* JADX WARN: Failed to find 'out' block for switch in B:6:0x0046. Please report as an issue. */
    public static g11 a(uv0 uv0Var) {
        float f;
        float f2;
        float f3;
        float f4;
        float fC = wd2.c();
        LongSparseArray longSparseArray = new LongSparseArray();
        ArrayList arrayList = new ArrayList();
        HashMap map = new HashMap();
        HashMap map2 = new HashMap();
        HashMap map3 = new HashMap();
        ArrayList arrayList2 = new ArrayList();
        SparseArrayCompat sparseArrayCompat = new SparseArrayCompat();
        g11 g11Var = new g11();
        uv0Var.c();
        float fI = 0.0f;
        int iJ = 0;
        int iJ2 = 0;
        float fI2 = 0.0f;
        float fI3 = 0.0f;
        while (uv0Var.g()) {
            fC = fC;
            switch (uv0Var.n(a)) {
                case 0:
                    iJ = uv0Var.j();
                    fC = fC;
                    break;
                case 1:
                    iJ2 = uv0Var.j();
                    fC = fC;
                    break;
                case 2:
                    fI2 = (float) uv0Var.i();
                    fI = fI;
                    break;
                case 3:
                    fI3 = ((float) uv0Var.i()) - 0.01f;
                    fI = fI;
                    break;
                case 4:
                    fI = (float) uv0Var.i();
                    fC = fC;
                    break;
                case 5:
                    fI = fI;
                    f = fI2;
                    f2 = fI3;
                    String[] strArrSplit = uv0Var.k().split("\\.");
                    int i = Integer.parseInt(strArrSplit[0]);
                    int i2 = Integer.parseInt(strArrSplit[1]);
                    int i3 = Integer.parseInt(strArrSplit[2]);
                    if (i < 4 || (i <= 4 && (i2 < 4 || (i2 <= 4 && i3 < 0)))) {
                        g11Var.a("Lottie only supports bodymovin >= 4.4.0");
                    }
                    fI2 = f;
                    fI3 = f2;
                    fI = fI;
                    break;
                case 6:
                    fI = fI;
                    f = fI2;
                    f2 = fI3;
                    uv0Var.b();
                    int i4 = 0;
                    while (uv0Var.g()) {
                        mw0 mw0VarA = nw0.a(uv0Var, g11Var);
                        if (mw0VarA.e == 3) {
                            i4++;
                        }
                        arrayList.add(mw0VarA);
                        longSparseArray.put(mw0VarA.d, mw0VarA);
                        if (i4 > 4) {
                            r01.b("You have " + i4 + " images. Lottie should primarily be used with shapes. If you are using Adobe Illustrator, convert the Illustrator layers to shape layers.");
                        }
                    }
                    uv0Var.d();
                    fI2 = f;
                    fI3 = f2;
                    fI = fI;
                    break;
                case 7:
                    fI = fI;
                    f = fI2;
                    f2 = fI3;
                    uv0Var.b();
                    while (uv0Var.g()) {
                        ArrayList arrayList3 = new ArrayList();
                        LongSparseArray longSparseArray2 = new LongSparseArray();
                        uv0Var.c();
                        String strK = null;
                        String strK2 = null;
                        String strK3 = null;
                        int iJ3 = 0;
                        int iJ4 = 0;
                        while (uv0Var.g()) {
                            int iN = uv0Var.n(b);
                            if (iN == 0) {
                                strK = uv0Var.k();
                            } else if (iN == 1) {
                                uv0Var.b();
                                while (uv0Var.g()) {
                                    mw0 mw0VarA2 = nw0.a(uv0Var, g11Var);
                                    longSparseArray2.put(mw0VarA2.d, mw0VarA2);
                                    arrayList3.add(mw0VarA2);
                                }
                                uv0Var.d();
                            } else if (iN == 2) {
                                iJ3 = uv0Var.j();
                            } else if (iN == 3) {
                                iJ4 = uv0Var.j();
                            } else if (iN == 4) {
                                strK2 = uv0Var.k();
                            } else if (iN != 5) {
                                uv0Var.o();
                                uv0Var.p();
                            } else {
                                strK3 = uv0Var.k();
                            }
                        }
                        uv0Var.e();
                        if (strK2 != null) {
                            map2.put(strK, new a21(strK, iJ3, iJ4, strK2, strK3));
                        } else {
                            map.put(strK, arrayList3);
                        }
                    }
                    uv0Var.d();
                    fI2 = f;
                    fI3 = f2;
                    fI = fI;
                    break;
                case 8:
                    fI = fI;
                    f = fI2;
                    float f5 = fI3;
                    uv0Var.c();
                    while (uv0Var.g()) {
                        if (uv0Var.n(c) != 0) {
                            uv0Var.o();
                            uv0Var.p();
                        } else {
                            uv0Var.b();
                            while (uv0Var.g()) {
                                aa aaVar = kl0.a;
                                uv0Var.c();
                                String strK4 = null;
                                String strK5 = null;
                                String strK6 = null;
                                while (uv0Var.g()) {
                                    int iN2 = uv0Var.n(kl0.a);
                                    if (iN2 != 0) {
                                        float f6 = f5;
                                        if (iN2 == 1) {
                                            strK5 = uv0Var.k();
                                        } else if (iN2 == 2) {
                                            strK6 = uv0Var.k();
                                        } else if (iN2 != 3) {
                                            uv0Var.o();
                                            uv0Var.p();
                                        } else {
                                            uv0Var.i();
                                        }
                                        f5 = f6;
                                    } else {
                                        strK4 = uv0Var.k();
                                    }
                                }
                                uv0Var.e();
                                map3.put(strK5, new fl0(strK4, strK5, strK6));
                                f5 = f5;
                            }
                            uv0Var.d();
                        }
                    }
                    f2 = f5;
                    uv0Var.e();
                    fI2 = f;
                    fI3 = f2;
                    fI = fI;
                    break;
                case 9:
                    fI = fI;
                    f = fI2;
                    f3 = fI3;
                    uv0Var.b();
                    while (uv0Var.g()) {
                        aa aaVar2 = il0.a;
                        ArrayList arrayList4 = new ArrayList();
                        uv0Var.c();
                        double dI = 0.0d;
                        String strK7 = null;
                        String strK8 = null;
                        char cCharAt = 0;
                        while (uv0Var.g()) {
                            int iN3 = uv0Var.n(il0.a);
                            if (iN3 == 0) {
                                cCharAt = uv0Var.k().charAt(0);
                            } else if (iN3 == 1) {
                                uv0Var.i();
                            } else if (iN3 == 2) {
                                dI = uv0Var.i();
                            } else if (iN3 == 3) {
                                strK7 = uv0Var.k();
                            } else if (iN3 == 4) {
                                strK8 = uv0Var.k();
                            } else if (iN3 != 5) {
                                uv0Var.o();
                                uv0Var.p();
                            } else {
                                uv0Var.c();
                                while (uv0Var.g()) {
                                    if (uv0Var.n(il0.b) != 0) {
                                        uv0Var.o();
                                        uv0Var.p();
                                    } else {
                                        uv0Var.b();
                                        while (uv0Var.g()) {
                                            arrayList4.add((qz1) wu.a(uv0Var, g11Var));
                                        }
                                        uv0Var.d();
                                    }
                                }
                                uv0Var.e();
                            }
                        }
                        uv0Var.e();
                        hl0 hl0Var = new hl0(arrayList4, cCharAt, dI, strK7, strK8);
                        sparseArrayCompat.put(hl0Var.hashCode(), hl0Var);
                    }
                    uv0Var.d();
                    f2 = f3;
                    fI2 = f;
                    fI3 = f2;
                    fI = fI;
                    break;
                case 10:
                    uv0Var.b();
                    while (uv0Var.g()) {
                        uv0Var.c();
                        String strK9 = null;
                        float fI4 = 0.0f;
                        float fI5 = 0.0f;
                        while (uv0Var.g()) {
                            int iN4 = uv0Var.n(d);
                            if (iN4 != 0) {
                                f4 = fI;
                                if (iN4 == 1) {
                                    fI3 = fI3;
                                    fI4 = (float) uv0Var.i();
                                } else if (iN4 != 2) {
                                    uv0Var.o();
                                    uv0Var.p();
                                } else {
                                    fI3 = fI3;
                                    fI5 = (float) uv0Var.i();
                                }
                                fI = f4;
                                fI2 = fI2;
                            } else {
                                f4 = fI;
                                strK9 = uv0Var.k();
                            }
                            fI = f4;
                        }
                        uv0Var.e();
                        arrayList2.add(new q31(strK9, fI4, fI5));
                        fI3 = fI3;
                        fI2 = fI2;
                        fI = fI;
                    }
                    fI = fI;
                    f = fI2;
                    f3 = fI3;
                    uv0Var.d();
                    f2 = f3;
                    fI2 = f;
                    fI3 = f2;
                    fI = fI;
                    break;
                default:
                    uv0Var.o();
                    uv0Var.p();
                    fI = fI;
                    f = fI2;
                    f2 = fI3;
                    fI2 = f;
                    fI3 = f2;
                    fI = fI;
                    break;
            }
        }
        float f7 = fC;
        float f8 = fI;
        Rect rect = new Rect(0, 0, (int) (iJ * f7), (int) (iJ2 * f7));
        float fC2 = wd2.c();
        g11Var.k = rect;
        g11Var.l = fI2;
        g11Var.m = fI3;
        g11Var.n = f8;
        g11Var.j = arrayList;
        g11Var.i = longSparseArray;
        g11Var.c = map;
        g11Var.d = map2;
        g11Var.e = fC2;
        g11Var.h = sparseArrayCompat;
        g11Var.f = map3;
        g11Var.g = arrayList2;
        return g11Var;
    }
}
