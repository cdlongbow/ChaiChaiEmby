package defpackage;

import android.content.res.AssetManager;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PointF;
import android.graphics.RectF;
import android.graphics.Typeface;
import androidx.collection.LongSparseArray;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes4.dex */
public final class f72 extends gj {
    public final StringBuilder D;
    public final RectF E;
    public final Matrix F;
    public final jw0 G;
    public final jw0 H;
    public final HashMap I;
    public final LongSparseArray J;
    public final ArrayList K;
    public final vq L;
    public final x11 M;
    public final g11 N;
    public final int O;
    public final vq P;
    public ee2 Q;
    public final vq R;
    public ee2 S;
    public final mk0 T;
    public ee2 U;
    public final mk0 V;
    public ee2 W;
    public final vq X;
    public ee2 Y;
    public ee2 Z;
    public final vq a0;
    public final vq b0;
    public final vq c0;

    public f72(x11 x11Var, mw0 mw0Var) {
        za zaVar;
        za zaVar2;
        ta taVar;
        za zaVar3;
        ta taVar2;
        za zaVar4;
        ta taVar3;
        ab abVar;
        ta taVar4;
        ab abVar2;
        ua uaVar;
        ab abVar3;
        ua uaVar2;
        ab abVar4;
        ta taVar5;
        ab abVar5;
        ta taVar6;
        super(x11Var, mw0Var);
        this.D = new StringBuilder(2);
        this.E = new RectF();
        this.F = new Matrix();
        jw0 jw0Var = new jw0(1, 1);
        jw0Var.setStyle(Paint.Style.FILL);
        this.G = jw0Var;
        jw0 jw0Var2 = new jw0(1, 2);
        jw0Var2.setStyle(Paint.Style.STROKE);
        this.H = jw0Var2;
        this.I = new HashMap();
        this.J = new LongSparseArray();
        this.K = new ArrayList();
        this.O = 2;
        this.M = x11Var;
        this.N = mw0Var.b;
        vq vqVar = new vq(mw0Var.q.a, 2);
        this.L = vqVar;
        vqVar.a(this);
        e(vqVar);
        aa aaVar = mw0Var.r;
        if (aaVar != null && (abVar5 = (ab) aaVar.a) != null && (taVar6 = (ta) abVar5.a) != null) {
            ej ejVarA = taVar6.a();
            this.P = (vq) ejVarA;
            ejVarA.a(this);
            e(ejVarA);
        }
        if (aaVar != null && (abVar4 = (ab) aaVar.a) != null && (taVar5 = (ta) abVar4.b) != null) {
            ej ejVarA2 = taVar5.a();
            this.R = (vq) ejVarA2;
            ejVarA2.a(this);
            e(ejVarA2);
        }
        if (aaVar != null && (abVar3 = (ab) aaVar.a) != null && (uaVar2 = (ua) abVar3.c) != null) {
            mk0 mk0VarA = uaVar2.a();
            this.T = mk0VarA;
            mk0VarA.a(this);
            e(mk0VarA);
        }
        if (aaVar != null && (abVar2 = (ab) aaVar.a) != null && (uaVar = (ua) abVar2.d) != null) {
            mk0 mk0VarA2 = uaVar.a();
            this.V = mk0VarA2;
            mk0VarA2.a(this);
            e(mk0VarA2);
        }
        if (aaVar != null && (abVar = (ab) aaVar.a) != null && (taVar4 = (ta) abVar.e) != null) {
            ej ejVarA3 = taVar4.a();
            this.X = (vq) ejVarA3;
            ejVarA3.a(this);
            e(ejVarA3);
        }
        if (aaVar != null && (zaVar4 = (za) aaVar.b) != null && (taVar3 = zaVar4.a) != null) {
            ej ejVarA4 = taVar3.a();
            this.a0 = (vq) ejVarA4;
            ejVarA4.a(this);
            e(ejVarA4);
        }
        if (aaVar != null && (zaVar3 = (za) aaVar.b) != null && (taVar2 = zaVar3.b) != null) {
            ej ejVarA5 = taVar2.a();
            this.b0 = (vq) ejVarA5;
            ejVarA5.a(this);
            e(ejVarA5);
        }
        if (aaVar != null && (zaVar2 = (za) aaVar.b) != null && (taVar = zaVar2.c) != null) {
            ej ejVarA6 = taVar.a();
            this.c0 = (vq) ejVarA6;
            ejVarA6.a(this);
            e(ejVarA6);
        }
        if (aaVar == null || (zaVar = (za) aaVar.b) == null) {
            return;
        }
        this.O = zaVar.d;
    }

    public static void s(String str, Paint paint, Canvas canvas) {
        if (paint.getColor() == 0) {
            return;
        }
        if (paint.getStyle() == Paint.Style.STROKE && paint.getStrokeWidth() == 0.0f) {
            return;
        }
        canvas.drawText(str, 0, str.length(), 0.0f, 0.0f, paint);
    }

    public static void t(Path path, Paint paint, Canvas canvas) {
        if (paint.getColor() == 0) {
            return;
        }
        if (paint.getStyle() == Paint.Style.STROKE && paint.getStrokeWidth() == 0.0f) {
            return;
        }
        canvas.drawPath(path, paint);
    }

    @Override // defpackage.gj, defpackage.vc0
    public final void d(RectF rectF, Matrix matrix, boolean z) {
        super.d(rectF, matrix, z);
        g11 g11Var = this.N;
        rectF.set(0.0f, 0.0f, g11Var.k.width(), g11Var.k.height());
    }

    @Override // defpackage.gj, defpackage.aw0
    public final void f(i21 i21Var, Object obj) {
        super.f(i21Var, obj);
        PointF pointF = c21.a;
        if (obj == 1) {
            ee2 ee2Var = this.Q;
            if (ee2Var != null) {
                n(ee2Var);
            }
            ee2 ee2Var2 = new ee2(i21Var, null);
            this.Q = ee2Var2;
            ee2Var2.a(this);
            e(this.Q);
            return;
        }
        if (obj == 2) {
            ee2 ee2Var3 = this.S;
            if (ee2Var3 != null) {
                n(ee2Var3);
            }
            ee2 ee2Var4 = new ee2(i21Var, null);
            this.S = ee2Var4;
            ee2Var4.a(this);
            e(this.S);
            return;
        }
        if (obj == c21.n) {
            ee2 ee2Var5 = this.U;
            if (ee2Var5 != null) {
                n(ee2Var5);
            }
            ee2 ee2Var6 = new ee2(i21Var, null);
            this.U = ee2Var6;
            ee2Var6.a(this);
            e(this.U);
            return;
        }
        if (obj == c21.o) {
            ee2 ee2Var7 = this.W;
            if (ee2Var7 != null) {
                n(ee2Var7);
            }
            ee2 ee2Var8 = new ee2(i21Var, null);
            this.W = ee2Var8;
            ee2Var8.a(this);
            e(this.W);
            return;
        }
        if (obj == c21.A) {
            ee2 ee2Var9 = this.Y;
            if (ee2Var9 != null) {
                n(ee2Var9);
            }
            ee2 ee2Var10 = new ee2(i21Var, null);
            this.Y = ee2Var10;
            ee2Var10.a(this);
            e(this.Y);
            return;
        }
        if (obj != c21.H) {
            if (obj == c21.J) {
                vq vqVar = this.L;
                vqVar.getClass();
                vqVar.j(new y62(new z11(), i21Var, new ac0()));
                return;
            }
            return;
        }
        ee2 ee2Var11 = this.Z;
        if (ee2Var11 != null) {
            n(ee2Var11);
        }
        ee2 ee2Var12 = new ee2(i21Var, null);
        this.Z = ee2Var12;
        ee2Var12.a(this);
        e(this.Z);
    }

    /* JADX WARN: Code duplicated, block: B:100:0x0354  */
    /* JADX WARN: Code duplicated, block: B:102:0x035c  */
    /* JADX WARN: Code duplicated, block: B:120:0x03df  */
    /* JADX WARN: Code duplicated, block: B:122:0x03e9  */
    /* JADX WARN: Code duplicated, block: B:123:0x03eb  */
    /* JADX WARN: Code duplicated, block: B:127:0x03fc  */
    /* JADX WARN: Code duplicated, block: B:129:0x0411  */
    /* JADX WARN: Code duplicated, block: B:132:0x041e  */
    /* JADX WARN: Code duplicated, block: B:135:0x0436  */
    /* JADX WARN: Code duplicated, block: B:151:0x0484  */
    /* JADX WARN: Code duplicated, block: B:152:0x048f  */
    /* JADX WARN: Code duplicated, block: B:154:0x049d A[LOOP:9: B:153:0x049b->B:154:0x049d, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:158:0x04c0  */
    /* JADX WARN: Code duplicated, block: B:159:0x04c7  */
    /* JADX WARN: Code duplicated, block: B:162:0x04f3  */
    /* JADX WARN: Code duplicated, block: B:181:0x0479 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:22:0x00e6  */
    /* JADX WARN: Code duplicated, block: B:24:0x00f0  */
    /* JADX WARN: Code duplicated, block: B:25:0x00f3  */
    /* JADX WARN: Code duplicated, block: B:29:0x0104  */
    /* JADX WARN: Code duplicated, block: B:31:0x0117  */
    /* JADX WARN: Code duplicated, block: B:34:0x0123  */
    /* JADX WARN: Code duplicated, block: B:36:0x013f  */
    /* JADX WARN: Code duplicated, block: B:37:0x0151  */
    /* JADX WARN: Code duplicated, block: B:39:0x015c  */
    /* JADX WARN: Code duplicated, block: B:40:0x016d  */
    /* JADX WARN: Code duplicated, block: B:42:0x0184 A[LOOP:4: B:41:0x0182->B:42:0x0184, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:47:0x01b2  */
    /* JADX WARN: Code duplicated, block: B:49:0x01e4  */
    /* JADX WARN: Code duplicated, block: B:50:0x01ef  */
    /* JADX WARN: Code duplicated, block: B:55:0x024d  */
    /* JADX WARN: Code duplicated, block: B:76:0x02d7  */
    /* JADX WARN: Code duplicated, block: B:78:0x02dd  */
    /* JADX WARN: Code duplicated, block: B:80:0x02f1  */
    /* JADX WARN: Code duplicated, block: B:81:0x02f4  */
    /* JADX WARN: Code duplicated, block: B:83:0x0300  */
    /* JADX WARN: Code duplicated, block: B:84:0x0305  */
    /* JADX WARN: Code duplicated, block: B:86:0x0309  */
    /* JADX WARN: Code duplicated, block: B:87:0x030d  */
    /* JADX WARN: Code duplicated, block: B:92:0x0342 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:93:0x0344  */
    /* JADX WARN: Code duplicated, block: B:94:0x0347 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:95:0x0349  */
    /* JADX WARN: Code duplicated, block: B:96:0x034c  */
    /* JADX WARN: Instruction removed from duplicated block: B:87:0x030d, please report this as an issue */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.gj
    public final void j(Canvas canvas, Matrix matrix, int i, yc0 yc0Var) {
        ab abVarI;
        Typeface typefaceCreateFromAsset;
        j61 j61Var;
        HashMap map;
        Typeface typeface;
        HashMap map2;
        Typeface typeface2;
        Typeface typeface3;
        boolean zContains;
        boolean zContains2;
        int i2;
        float fFloatValue;
        float fC;
        List listAsList;
        int size;
        int i3;
        int length;
        int i4;
        PointF pointF;
        float f;
        float f2;
        List listX;
        int i5;
        e72 e72Var;
        String str;
        int length2;
        int iCodePointAt;
        int i6;
        int iCharCount;
        float f3;
        long j;
        LongSparseArray longSparseArray;
        StringBuilder sb;
        int iCharCount2;
        String string;
        int iCodePointAt2;
        Canvas canvas2;
        float fFloatValue2;
        float f4;
        int i7;
        int i8;
        PointF pointF2;
        float f5;
        float f6;
        List listX2;
        int i9;
        e72 e72Var2;
        String str2;
        int i10;
        float f7;
        g11 g11Var;
        hl0 hl0Var;
        HashMap map3;
        ArrayList arrayList;
        int size2;
        ArrayList arrayList2;
        int i11;
        List list;
        int i12;
        jw0 jw0Var;
        jw0 jw0Var2;
        Path path;
        jw0 jw0Var3;
        jw0 jw0Var4;
        ac0 ac0Var = (ac0) this.L.e();
        g11 g11Var2 = this.N;
        fl0 fl0Var = (fl0) g11Var2.f.get(ac0Var.b);
        if (fl0Var == null) {
            return;
        }
        String str3 = fl0Var.c;
        String str4 = fl0Var.a;
        canvas.save();
        canvas.concat(matrix);
        r(ac0Var, i, 0);
        x11 x11Var = this.M;
        Map map4 = x11Var.k;
        String str5 = "\n";
        mk0 mk0Var = this.V;
        int i13 = 0;
        jw0 jw0Var5 = this.G;
        jw0 jw0Var6 = this.H;
        if (map4 != null || x11Var.a.h.size() <= 0) {
            ee2 ee2Var = this.Z;
            if (ee2Var == null || (typefaceCreateFromAsset = (Typeface) ee2Var.e()) == null) {
                Map map5 = x11Var.k;
                if (map5 == null) {
                    abVarI = x11Var.i();
                    if (abVarI != null) {
                        j61Var = (j61) abVarI.a;
                        j61Var.a = str4;
                        j61Var.b = str3;
                        map = (HashMap) abVarI.b;
                        typeface = (Typeface) map.get(j61Var);
                        if (typeface != null) {
                            typefaceCreateFromAsset = typeface;
                            str5 = "\n";
                        } else {
                            map2 = (HashMap) abVarI.c;
                            typeface2 = (Typeface) map2.get(str4);
                            if (typeface2 != null) {
                                typefaceCreateFromAsset = typeface2;
                            } else {
                                typeface3 = fl0Var.d;
                                if (typeface3 != null) {
                                    typefaceCreateFromAsset = typeface3;
                                } else {
                                    typefaceCreateFromAsset = Typeface.createFromAsset((AssetManager) abVarI.d, "fonts/" + str4 + ((String) abVarI.e));
                                    map2.put(str4, typefaceCreateFromAsset);
                                }
                            }
                            zContains = str3.contains("Italic");
                            zContains2 = str3.contains("Bold");
                            if (!zContains && zContains2) {
                                i2 = 3;
                            } else if (zContains) {
                                i2 = 2;
                            } else if (zContains2) {
                                i2 = 1;
                            } else {
                                i2 = 0;
                            }
                            if (typefaceCreateFromAsset.getStyle() != i2) {
                                typefaceCreateFromAsset = Typeface.create(typefaceCreateFromAsset, i2);
                            }
                            map.put(j61Var, typefaceCreateFromAsset);
                        }
                    } else {
                        str5 = "\n";
                        typefaceCreateFromAsset = null;
                    }
                } else {
                    if (map5.containsKey(str4)) {
                        typefaceCreateFromAsset = (Typeface) map5.get(str4);
                    } else {
                        String str6 = fl0Var.b;
                        if (map5.containsKey(str6)) {
                            typefaceCreateFromAsset = (Typeface) map5.get(str6);
                        } else {
                            String strC = mr.C(str4, "-", str3);
                            if (map5.containsKey(strC)) {
                                typefaceCreateFromAsset = (Typeface) map5.get(strC);
                            } else {
                                abVarI = x11Var.i();
                                if (abVarI != null) {
                                    j61Var = (j61) abVarI.a;
                                    j61Var.a = str4;
                                    j61Var.b = str3;
                                    map = (HashMap) abVarI.b;
                                    typeface = (Typeface) map.get(j61Var);
                                    if (typeface != null) {
                                        typefaceCreateFromAsset = typeface;
                                    } else {
                                        map2 = (HashMap) abVarI.c;
                                        typeface2 = (Typeface) map2.get(str4);
                                        if (typeface2 != null) {
                                            typefaceCreateFromAsset = typeface2;
                                        } else {
                                            typeface3 = fl0Var.d;
                                            if (typeface3 != null) {
                                                typefaceCreateFromAsset = typeface3;
                                            } else {
                                                typefaceCreateFromAsset = Typeface.createFromAsset((AssetManager) abVarI.d, "fonts/" + str4 + ((String) abVarI.e));
                                                map2.put(str4, typefaceCreateFromAsset);
                                            }
                                        }
                                        zContains = str3.contains("Italic");
                                        zContains2 = str3.contains("Bold");
                                        if (!zContains) {
                                            if (zContains) {
                                                i2 = 2;
                                            } else if (zContains2) {
                                                i2 = 1;
                                            } else {
                                                i2 = 0;
                                            }
                                        } else if (zContains) {
                                            i2 = 2;
                                        } else if (zContains2) {
                                            i2 = 1;
                                        } else {
                                            i2 = 0;
                                        }
                                        if (typefaceCreateFromAsset.getStyle() != i2) {
                                            typefaceCreateFromAsset = Typeface.create(typefaceCreateFromAsset, i2);
                                        }
                                        map.put(j61Var, typefaceCreateFromAsset);
                                    }
                                } else {
                                    str5 = "\n";
                                    typefaceCreateFromAsset = null;
                                }
                            }
                        }
                    }
                    str5 = "\n";
                }
                if (typefaceCreateFromAsset == null) {
                    typefaceCreateFromAsset = fl0Var.d;
                }
            } else {
                str5 = "\n";
            }
            if (typefaceCreateFromAsset != null) {
                String str7 = ac0Var.a;
                jw0Var5.setTypeface(typefaceCreateFromAsset);
                ee2 ee2Var2 = this.Y;
                float fFloatValue3 = ee2Var2 != null ? ((Float) ee2Var2.e()).floatValue() : ac0Var.c;
                jw0Var5.setTextSize(wd2.c() * fFloatValue3);
                jw0Var6.setTypeface(jw0Var5.getTypeface());
                jw0Var6.setTextSize(jw0Var5.getTextSize());
                float f8 = ac0Var.e / 10.0f;
                ee2 ee2Var3 = this.W;
                if (ee2Var3 != null) {
                    fFloatValue = ((Float) ee2Var3.e()).floatValue();
                } else {
                    if (mk0Var != null) {
                        fFloatValue = ((Float) mk0Var.e()).floatValue();
                    }
                    fC = ((wd2.c() * f8) * fFloatValue3) / 100.0f;
                    listAsList = Arrays.asList(str7.replaceAll("\r\n", "\r").replaceAll("\u0003", "\r").replaceAll(str5, "\r").split("\r"));
                    size = listAsList.size();
                    i3 = 0;
                    length = 0;
                    i4 = -1;
                    while (i3 < size) {
                        String str8 = (String) listAsList.get(i3);
                        pointF = ac0Var.m;
                        if (pointF == null) {
                            f = 0.0f;
                        } else {
                            f = pointF.x;
                        }
                        f2 = fC;
                        listX = x(str8, f, fl0Var, 0.0f, f2, false);
                        i5 = 0;
                        while (i5 < listX.size()) {
                            e72Var = (e72) listX.get(i5);
                            i4++;
                            canvas.save();
                            if (w(canvas, ac0Var, i4, e72Var.b)) {
                                str = e72Var.a;
                                length2 = 0;
                                while (length2 < str.length()) {
                                    iCodePointAt = str.codePointAt(length2);
                                    i6 = length2;
                                    iCharCount = Character.charCount(iCodePointAt) + length2;
                                    fl0 fl0Var2 = fl0Var;
                                    while (true) {
                                        if (iCharCount < str.length()) {
                                            f3 = f2;
                                            break;
                                        }
                                        iCodePointAt2 = str.codePointAt(iCharCount);
                                        f3 = f2;
                                        if (Character.getType(iCodePointAt2) == 16 && Character.getType(iCodePointAt2) != 27 && Character.getType(iCodePointAt2) != 6 && Character.getType(iCodePointAt2) != 28 && Character.getType(iCodePointAt2) != 8 && Character.getType(iCodePointAt2) != 19) {
                                            break;
                                        }
                                        iCharCount += Character.charCount(iCodePointAt2);
                                        iCodePointAt = (iCodePointAt * 31) + iCodePointAt2;
                                        f2 = f3;
                                    }
                                    j = iCodePointAt;
                                    longSparseArray = this.J;
                                    if (longSparseArray.containsKey(j)) {
                                        string = (String) longSparseArray.get(j);
                                    } else {
                                        sb = this.D;
                                        sb.setLength(0);
                                        iCharCount2 = i6;
                                        while (iCharCount2 < iCharCount) {
                                            int i14 = iCharCount;
                                            int iCodePointAt3 = str.codePointAt(iCharCount2);
                                            sb.appendCodePoint(iCodePointAt3);
                                            iCharCount2 += Character.charCount(iCodePointAt3);
                                            iCharCount = i14;
                                        }
                                        string = sb.toString();
                                        longSparseArray.put(j, string);
                                    }
                                    r(ac0Var, i, length + i6);
                                    if (ac0Var.k) {
                                        s(string, jw0Var5, canvas);
                                        s(string, jw0Var6, canvas);
                                    } else {
                                        s(string, jw0Var6, canvas);
                                        s(string, jw0Var5, canvas);
                                    }
                                    canvas.translate(jw0Var5.measureText(string) + f3, 0.0f);
                                    length2 = string.length() + i6;
                                    fl0Var = fl0Var2;
                                    listAsList = listAsList;
                                    f2 = f3;
                                    size = size;
                                }
                            }
                            fl0 fl0Var3 = fl0Var;
                            float f9 = f2;
                            List list2 = listAsList;
                            int i15 = size;
                            length += e72Var.a.length();
                            canvas.restore();
                            i5++;
                            listX = listX;
                            fl0Var = fl0Var3;
                            listAsList = list2;
                            f2 = f9;
                            size = i15;
                        }
                        i3++;
                        fl0Var = fl0Var;
                        fC = f2;
                    }
                }
                f8 += fFloatValue;
                fC = ((wd2.c() * f8) * fFloatValue3) / 100.0f;
                listAsList = Arrays.asList(str7.replaceAll("\r\n", "\r").replaceAll("\u0003", "\r").replaceAll(str5, "\r").split("\r"));
                size = listAsList.size();
                i3 = 0;
                length = 0;
                i4 = -1;
                while (i3 < size) {
                    String str9 = (String) listAsList.get(i3);
                    pointF = ac0Var.m;
                    if (pointF == null) {
                        f = 0.0f;
                    } else {
                        f = pointF.x;
                    }
                    f2 = fC;
                    listX = x(str9, f, fl0Var, 0.0f, f2, false);
                    i5 = 0;
                    while (i5 < listX.size()) {
                        e72Var = (e72) listX.get(i5);
                        i4++;
                        canvas.save();
                        if (w(canvas, ac0Var, i4, e72Var.b)) {
                            str = e72Var.a;
                            length2 = 0;
                            while (length2 < str.length()) {
                                iCodePointAt = str.codePointAt(length2);
                                i6 = length2;
                                iCharCount = Character.charCount(iCodePointAt) + length2;
                                fl0 fl0Var4 = fl0Var;
                                while (true) {
                                    if (iCharCount < str.length()) {
                                        f3 = f2;
                                        break;
                                    }
                                    iCodePointAt2 = str.codePointAt(iCharCount);
                                    f3 = f2;
                                    if (Character.getType(iCodePointAt2) == 16) {
                                    }
                                    iCharCount += Character.charCount(iCodePointAt2);
                                    iCodePointAt = (iCodePointAt * 31) + iCodePointAt2;
                                    f2 = f3;
                                }
                                j = iCodePointAt;
                                longSparseArray = this.J;
                                if (longSparseArray.containsKey(j)) {
                                    string = (String) longSparseArray.get(j);
                                } else {
                                    sb = this.D;
                                    sb.setLength(0);
                                    iCharCount2 = i6;
                                    while (iCharCount2 < iCharCount) {
                                        int i16 = iCharCount;
                                        int iCodePointAt4 = str.codePointAt(iCharCount2);
                                        sb.appendCodePoint(iCodePointAt4);
                                        iCharCount2 += Character.charCount(iCodePointAt4);
                                        iCharCount = i16;
                                    }
                                    string = sb.toString();
                                    longSparseArray.put(j, string);
                                }
                                r(ac0Var, i, length + i6);
                                if (ac0Var.k) {
                                    s(string, jw0Var5, canvas);
                                    s(string, jw0Var6, canvas);
                                } else {
                                    s(string, jw0Var6, canvas);
                                    s(string, jw0Var5, canvas);
                                }
                                canvas.translate(jw0Var5.measureText(string) + f3, 0.0f);
                                length2 = string.length() + i6;
                                fl0Var = fl0Var4;
                                listAsList = listAsList;
                                f2 = f3;
                                size = size;
                            }
                        }
                        fl0 fl0Var5 = fl0Var;
                        float f10 = f2;
                        List list3 = listAsList;
                        int i17 = size;
                        length += e72Var.a.length();
                        canvas.restore();
                        i5++;
                        listX = listX;
                        fl0Var = fl0Var5;
                        listAsList = list3;
                        f2 = f10;
                        size = i17;
                    }
                    i3++;
                    fl0Var = fl0Var;
                    fC = f2;
                }
            }
            canvas2 = canvas;
        } else {
            ee2 ee2Var4 = this.Y;
            float fFloatValue4 = ee2Var4 != null ? ((Float) ee2Var4.e()).floatValue() : ac0Var.c;
            float f11 = 0.0f;
            float[] fArr = (float[]) wd2.e.get();
            fArr[0] = 0.0f;
            fArr[1] = 0.0f;
            float f12 = wd2.f;
            fArr[2] = f12;
            fArr[3] = f12;
            float f13 = fFloatValue4 / 100.0f;
            matrix.mapPoints(fArr);
            jw0 jw0Var7 = jw0Var5;
            x11 x11Var2 = x11Var;
            g11 g11Var3 = g11Var2;
            String str10 = str3;
            Math.hypot(fArr[2] - fArr[0], fArr[3] - fArr[1]);
            List listAsList2 = Arrays.asList(ac0Var.a.replaceAll("\r\n", "\r").replaceAll("\u0003", "\r").replaceAll("\n", "\r").split("\r"));
            int size3 = listAsList2.size();
            float f14 = ac0Var.e / 10.0f;
            ee2 ee2Var5 = this.W;
            if (ee2Var5 != null) {
                fFloatValue2 = ((Float) ee2Var5.e()).floatValue();
            } else {
                if (mk0Var != null) {
                    fFloatValue2 = ((Float) mk0Var.e()).floatValue();
                }
                f4 = f14;
                i7 = 0;
                i8 = -1;
                while (i7 < size3) {
                    String str11 = (String) listAsList2.get(i7);
                    pointF2 = ac0Var.m;
                    if (pointF2 == null) {
                        f5 = f11;
                    } else {
                        f5 = pointF2.x;
                    }
                    f6 = f13;
                    i9 = i13;
                    for (listX2 = x(str11, f5, fl0Var, f6, f4, true); i9 < listX2.size(); listX2 = listX2) {
                        e72Var2 = (e72) listX2.get(i9);
                        i8++;
                        canvas.save();
                        if (w(canvas, ac0Var, i8, e72Var2.b)) {
                            str2 = e72Var2.a;
                            i10 = i13;
                            while (i10 < str2.length()) {
                                List list4 = listAsList2;
                                String str12 = str10;
                                int i18 = i9;
                                f7 = f4;
                                g11Var = g11Var3;
                                hl0Var = (hl0) g11Var.h.get(hl0.a(str4, str2.charAt(i10), str12));
                                if (hl0Var == null) {
                                    g11Var3 = g11Var;
                                    str2 = str2;
                                    size3 = size3;
                                    i7 = i7;
                                    i10 = i10;
                                    jw0Var = jw0Var6;
                                    x11Var2 = x11Var2;
                                    jw0Var2 = jw0Var7;
                                } else {
                                    r(ac0Var, i, i10);
                                    map3 = this.I;
                                    if (map3.containsKey(hl0Var)) {
                                        list = (List) map3.get(hl0Var);
                                    } else {
                                        arrayList = hl0Var.a;
                                        size2 = arrayList.size();
                                        arrayList2 = new ArrayList(size2);
                                        i11 = i13;
                                        while (i11 < size2) {
                                            arrayList2.add(new pu(x11Var2, this, (qz1) arrayList.get(i11), g11Var));
                                            size2 = size2;
                                            i11++;
                                            arrayList = arrayList;
                                        }
                                        map3.put(hl0Var, arrayList2);
                                        list = arrayList2;
                                    }
                                    i12 = i13;
                                    while (i12 < list.size()) {
                                        path = ((pu) list.get(i12)).getPath();
                                        g11 g11Var4 = g11Var;
                                        path.computeBounds(this.E, i13);
                                        Matrix matrix2 = this.F;
                                        matrix2.reset();
                                        List list5 = list;
                                        matrix2.preTranslate(f11, (-ac0Var.g) * wd2.c());
                                        matrix2.preScale(f6, f6);
                                        path.transform(matrix2);
                                        if (ac0Var.k) {
                                            jw0Var4 = jw0Var7;
                                            t(path, jw0Var4, canvas);
                                            jw0Var3 = jw0Var6;
                                            t(path, jw0Var3, canvas);
                                        } else {
                                            jw0Var3 = jw0Var6;
                                            jw0Var4 = jw0Var7;
                                            t(path, jw0Var3, canvas);
                                            t(path, jw0Var4, canvas);
                                        }
                                        i12++;
                                        jw0Var6 = jw0Var3;
                                        jw0Var7 = jw0Var4;
                                        list = list5;
                                        g11Var = g11Var4;
                                        i13 = 0;
                                        f11 = 0.0f;
                                    }
                                    g11Var3 = g11Var;
                                    jw0Var = jw0Var6;
                                    jw0Var2 = jw0Var7;
                                    canvas.translate((wd2.c() * ((float) hl0Var.c) * f6) + f7, 0.0f);
                                }
                                f4 = f7;
                                jw0Var6 = jw0Var;
                                str10 = str12;
                                jw0Var7 = jw0Var2;
                                x11Var2 = x11Var2;
                                i9 = i18;
                                listAsList2 = list4;
                                str2 = str2;
                                size3 = size3;
                                i7 = i7;
                                i13 = 0;
                                f11 = 0.0f;
                                i10++;
                            }
                        }
                        int i19 = i9;
                        float f15 = f4;
                        List list6 = listAsList2;
                        int i20 = size3;
                        int i21 = i7;
                        jw0 jw0Var8 = jw0Var6;
                        x11 x11Var3 = x11Var2;
                        jw0 jw0Var9 = jw0Var7;
                        String str13 = str10;
                        canvas.restore();
                        f4 = f15;
                        jw0Var6 = jw0Var8;
                        str10 = str13;
                        jw0Var7 = jw0Var9;
                        x11Var2 = x11Var3;
                        listAsList2 = list6;
                        size3 = i20;
                        i7 = i21;
                        i13 = 0;
                        f11 = 0.0f;
                        i9 = i19 + 1;
                    }
                    listAsList2 = listAsList2;
                    i13 = 0;
                    f11 = 0.0f;
                    i7++;
                    f13 = f6;
                }
                canvas2 = canvas;
            }
            f14 += fFloatValue2;
            f4 = f14;
            i7 = 0;
            i8 = -1;
            while (i7 < size3) {
                String str14 = (String) listAsList2.get(i7);
                pointF2 = ac0Var.m;
                if (pointF2 == null) {
                    f5 = f11;
                } else {
                    f5 = pointF2.x;
                }
                f6 = f13;
                i9 = i13;
                while (i9 < listX2.size()) {
                    e72Var2 = (e72) listX2.get(i9);
                    i8++;
                    canvas.save();
                    if (w(canvas, ac0Var, i8, e72Var2.b)) {
                        str2 = e72Var2.a;
                        i10 = i13;
                        while (i10 < str2.length()) {
                            List list7 = listAsList2;
                            String str15 = str10;
                            int i110 = i9;
                            f7 = f4;
                            g11Var = g11Var3;
                            hl0Var = (hl0) g11Var.h.get(hl0.a(str4, str2.charAt(i10), str15));
                            if (hl0Var == null) {
                                g11Var3 = g11Var;
                                str2 = str2;
                                size3 = size3;
                                i7 = i7;
                                i10 = i10;
                                jw0Var = jw0Var6;
                                x11Var2 = x11Var2;
                                jw0Var2 = jw0Var7;
                            } else {
                                r(ac0Var, i, i10);
                                map3 = this.I;
                                if (map3.containsKey(hl0Var)) {
                                    list = (List) map3.get(hl0Var);
                                } else {
                                    arrayList = hl0Var.a;
                                    size2 = arrayList.size();
                                    arrayList2 = new ArrayList(size2);
                                    i11 = i13;
                                    while (i11 < size2) {
                                        arrayList2.add(new pu(x11Var2, this, (qz1) arrayList.get(i11), g11Var));
                                        size2 = size2;
                                        i11++;
                                        arrayList = arrayList;
                                    }
                                    map3.put(hl0Var, arrayList2);
                                    list = arrayList2;
                                }
                                i12 = i13;
                                while (i12 < list.size()) {
                                    path = ((pu) list.get(i12)).getPath();
                                    g11 g11Var5 = g11Var;
                                    path.computeBounds(this.E, i13);
                                    Matrix matrix3 = this.F;
                                    matrix3.reset();
                                    List list8 = list;
                                    matrix3.preTranslate(f11, (-ac0Var.g) * wd2.c());
                                    matrix3.preScale(f6, f6);
                                    path.transform(matrix3);
                                    if (ac0Var.k) {
                                        jw0Var4 = jw0Var7;
                                        t(path, jw0Var4, canvas);
                                        jw0Var3 = jw0Var6;
                                        t(path, jw0Var3, canvas);
                                    } else {
                                        jw0Var3 = jw0Var6;
                                        jw0Var4 = jw0Var7;
                                        t(path, jw0Var3, canvas);
                                        t(path, jw0Var4, canvas);
                                    }
                                    i12++;
                                    jw0Var6 = jw0Var3;
                                    jw0Var7 = jw0Var4;
                                    list = list8;
                                    g11Var = g11Var5;
                                    i13 = 0;
                                    f11 = 0.0f;
                                }
                                g11Var3 = g11Var;
                                jw0Var = jw0Var6;
                                jw0Var2 = jw0Var7;
                                canvas.translate((wd2.c() * ((float) hl0Var.c) * f6) + f7, 0.0f);
                            }
                            f4 = f7;
                            jw0Var6 = jw0Var;
                            str10 = str15;
                            jw0Var7 = jw0Var2;
                            x11Var2 = x11Var2;
                            i9 = i110;
                            listAsList2 = list7;
                            str2 = str2;
                            size3 = size3;
                            i7 = i7;
                            i13 = 0;
                            f11 = 0.0f;
                            i10++;
                        }
                    }
                    int i111 = i9;
                    float f16 = f4;
                    List list9 = listAsList2;
                    int i22 = size3;
                    int i23 = i7;
                    jw0 jw0Var10 = jw0Var6;
                    x11 x11Var4 = x11Var2;
                    jw0 jw0Var11 = jw0Var7;
                    String str16 = str10;
                    canvas.restore();
                    f4 = f16;
                    jw0Var6 = jw0Var10;
                    str10 = str16;
                    jw0Var7 = jw0Var11;
                    x11Var2 = x11Var4;
                    listAsList2 = list9;
                    size3 = i22;
                    i7 = i23;
                    i13 = 0;
                    f11 = 0.0f;
                    i9 = i111 + 1;
                }
                listAsList2 = listAsList2;
                i13 = 0;
                f11 = 0.0f;
                i7++;
                f13 = f6;
            }
            canvas2 = canvas;
        }
        canvas2.restore();
    }

    public final void r(ac0 ac0Var, int i, int i2) {
        ee2 ee2Var = this.Q;
        jw0 jw0Var = this.G;
        if (ee2Var != null) {
            jw0Var.setColor(((Integer) ee2Var.e()).intValue());
        } else {
            vq vqVar = this.P;
            if (vqVar == null || !v(i2)) {
                jw0Var.setColor(ac0Var.h);
            } else {
                jw0Var.setColor(((Integer) vqVar.e()).intValue());
            }
        }
        ee2 ee2Var2 = this.S;
        jw0 jw0Var2 = this.H;
        if (ee2Var2 != null) {
            jw0Var2.setColor(((Integer) ee2Var2.e()).intValue());
        } else {
            vq vqVar2 = this.R;
            if (vqVar2 == null || !v(i2)) {
                jw0Var2.setColor(ac0Var.i);
            } else {
                jw0Var2.setColor(((Integer) vqVar2.e()).intValue());
            }
        }
        ej ejVar = this.w.j;
        int iIntValue = 100;
        int iIntValue2 = ejVar == null ? 100 : ((Integer) ejVar.e()).intValue();
        vq vqVar3 = this.X;
        if (vqVar3 != null && v(i2)) {
            iIntValue = ((Integer) vqVar3.e()).intValue();
        }
        int iRound = Math.round((((iIntValue / 100.0f) * ((iIntValue2 * 255.0f) / 100.0f)) * i) / 255.0f);
        jw0Var.setAlpha(iRound);
        jw0Var2.setAlpha(iRound);
        ee2 ee2Var3 = this.U;
        if (ee2Var3 != null) {
            jw0Var2.setStrokeWidth(((Float) ee2Var3.e()).floatValue());
            return;
        }
        mk0 mk0Var = this.T;
        if (mk0Var == null || !v(i2)) {
            jw0Var2.setStrokeWidth(wd2.c() * ac0Var.j);
        } else {
            jw0Var2.setStrokeWidth(((Float) mk0Var.e()).floatValue());
        }
    }

    public final e72 u(int i) {
        ArrayList arrayList = this.K;
        for (int size = arrayList.size(); size < i; size++) {
            e72 e72Var = new e72();
            e72Var.a = "";
            e72Var.b = 0.0f;
            arrayList.add(e72Var);
        }
        return (e72) arrayList.get(i - 1);
    }

    public final boolean v(int i) {
        vq vqVar;
        int length = ((ac0) this.L.e()).a.length();
        vq vqVar2 = this.a0;
        if (vqVar2 == null || (vqVar = this.b0) == null) {
            return true;
        }
        int iMin = Math.min(((Integer) vqVar2.e()).intValue(), ((Integer) vqVar.e()).intValue());
        int iMax = Math.max(((Integer) vqVar2.e()).intValue(), ((Integer) vqVar.e()).intValue());
        vq vqVar3 = this.c0;
        if (vqVar3 != null) {
            int iIntValue = ((Integer) vqVar3.e()).intValue();
            iMin += iIntValue;
            iMax += iIntValue;
        }
        if (this.O == 2) {
            return i >= iMin && i < iMax;
        }
        float f = (i / length) * 100.0f;
        return f >= ((float) iMin) && f < ((float) iMax);
    }

    public final boolean w(Canvas canvas, ac0 ac0Var, int i, float f) {
        PointF pointF = ac0Var.l;
        PointF pointF2 = ac0Var.m;
        float fC = wd2.c();
        float fK = kb0.K(i, ac0Var.f, fC, pointF == null ? 0.0f : (ac0Var.f * fC) + pointF.y);
        if (this.M.v && pointF2 != null && pointF != null && fK >= pointF.y + pointF2.y + ac0Var.c) {
            return false;
        }
        float f2 = pointF == null ? 0.0f : pointF.x;
        float f3 = pointF2 != null ? pointF2.x : 0.0f;
        int iD = w11.D(ac0Var.d);
        if (iD == 0) {
            canvas.translate(f2, fK);
            return true;
        }
        if (iD == 1) {
            canvas.translate((f2 + f3) - f, fK);
            return true;
        }
        if (iD != 2) {
            return true;
        }
        canvas.translate(((f3 / 2.0f) + f2) - (f / 2.0f), fK);
        return true;
    }

    public final List x(String str, float f, fl0 fl0Var, float f2, float f3, boolean z) {
        float fMeasureText;
        int i = 0;
        int i2 = 0;
        boolean z2 = false;
        int i3 = 0;
        float f4 = 0.0f;
        float f5 = 0.0f;
        float f6 = 0.0f;
        for (int i4 = 0; i4 < str.length(); i4++) {
            char cCharAt = str.charAt(i4);
            if (z) {
                hl0 hl0Var = (hl0) this.N.h.get(hl0.a(fl0Var.a, cCharAt, fl0Var.c));
                if (hl0Var != null) {
                    fMeasureText = (wd2.c() * ((float) hl0Var.c) * f2) + f3;
                }
            } else {
                fMeasureText = this.G.measureText(str.substring(i4, i4 + 1)) + f3;
            }
            if (cCharAt == ' ') {
                z2 = true;
                f6 = fMeasureText;
            } else if (z2) {
                z2 = false;
                i3 = i4;
                f5 = fMeasureText;
            } else {
                f5 += fMeasureText;
            }
            f4 += fMeasureText;
            if (f > 0.0f && f4 >= f && cCharAt != ' ') {
                i++;
                e72 e72VarU = u(i);
                if (i3 == i2) {
                    String strSubstring = str.substring(i2, i4);
                    String strTrim = strSubstring.trim();
                    float length = (f4 - fMeasureText) - ((strTrim.length() - strSubstring.length()) * f6);
                    e72VarU.a = strTrim;
                    e72VarU.b = length;
                    i2 = i4;
                    i3 = i2;
                    f4 = fMeasureText;
                    f5 = f4;
                } else {
                    String strSubstring2 = str.substring(i2, i3 - 1);
                    String strTrim2 = strSubstring2.trim();
                    float length2 = ((f4 - f5) - ((strSubstring2.length() - strTrim2.length()) * f6)) - f6;
                    e72VarU.a = strTrim2;
                    e72VarU.b = length2;
                    f4 = f5;
                    i2 = i3;
                }
            }
        }
        if (f4 > 0.0f) {
            i++;
            e72 e72VarU2 = u(i);
            e72VarU2.a = str.substring(i2);
            e72VarU2.b = f4;
        }
        return this.K.subList(0, i);
    }
}
