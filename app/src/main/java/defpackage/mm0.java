package defpackage;

import android.graphics.Color;
import java.util.ArrayList;
import java.util.Arrays;

/* JADX INFO: loaded from: classes4.dex */
public final class mm0 implements fe2 {
    public int a;

    /* JADX WARN: Code duplicated, block: B:38:0x00d3  */
    @Override // defpackage.fe2
    public final Object g(tv0 tv0Var, float f) {
        int i;
        int iArgb;
        float f2;
        int iArgb2;
        float f3;
        float f4;
        ArrayList arrayList = new ArrayList();
        int i2 = 1;
        int i3 = 0;
        boolean z = tv0Var.l() == 1;
        if (z) {
            tv0Var.b();
        }
        while (tv0Var.g()) {
            arrayList.add(Float.valueOf((float) tv0Var.i()));
        }
        int i4 = 2;
        if (arrayList.size() == 4 && ((Float) arrayList.get(0)).floatValue() == 1.0f) {
            arrayList.set(0, Float.valueOf(0.0f));
            arrayList.add(Float.valueOf(1.0f));
            arrayList.add((Float) arrayList.get(1));
            arrayList.add((Float) arrayList.get(2));
            arrayList.add((Float) arrayList.get(3));
            this.a = 2;
        }
        if (z) {
            tv0Var.d();
        }
        if (this.a == -1) {
            this.a = arrayList.size() / 4;
        }
        int i5 = this.a;
        float[] fArr = new float[i5];
        int[] iArr = new int[i5];
        int i6 = 0;
        int i7 = 0;
        int i8 = 0;
        while (true) {
            i = this.a * 4;
            if (i6 >= i) {
                break;
            }
            int i9 = i6 / 4;
            double dFloatValue = ((Float) arrayList.get(i6)).floatValue();
            int i10 = i3;
            int i11 = i6 % 4;
            if (i11 != 0) {
                if (i11 == i2) {
                    i7 = (int) (dFloatValue * 255.0d);
                } else if (i11 == 2) {
                    i8 = (int) (dFloatValue * 255.0d);
                } else if (i11 == 3) {
                    iArr[i9] = Color.argb(255, i7, i8, (int) (dFloatValue * 255.0d));
                }
            } else if (i9 > 0) {
                float f5 = (float) dFloatValue;
                if (fArr[i9 - 1] >= f5) {
                    fArr[i9] = f5 + 0.01f;
                } else {
                    fArr[i9] = (float) dFloatValue;
                }
            } else {
                fArr[i9] = (float) dFloatValue;
            }
            i6++;
            i3 = i10;
            i2 = 1;
        }
        int i12 = i3;
        km0 km0Var = new km0(iArr, fArr);
        if (arrayList.size() <= i) {
            return km0Var;
        }
        int size = (arrayList.size() - i) / 2;
        float[] fArr2 = new float[size];
        float[] fArr3 = new float[size];
        int i13 = i12;
        while (i < arrayList.size()) {
            if (i % 2 == 0) {
                fArr2[i13] = ((Float) arrayList.get(i)).floatValue();
            } else {
                fArr3[i13] = ((Float) arrayList.get(i)).floatValue();
                i13++;
            }
            i++;
        }
        float[] fArrCopyOf = km0Var.a;
        if (fArrCopyOf.length == 0) {
            fArrCopyOf = fArr2;
        } else if (size != 0) {
            int length = fArrCopyOf.length + size;
            float[] fArr4 = new float[length];
            int i14 = i12;
            int i15 = i14;
            int i16 = i15;
            int i17 = i16;
            while (i14 < length) {
                float f6 = i16 < fArrCopyOf.length ? fArrCopyOf[i16] : Float.NaN;
                float f7 = i17 < size ? fArr2[i17] : Float.NaN;
                if (Float.isNaN(f7) || f6 < f7) {
                    fArr4[i14] = f6;
                    i16++;
                } else if (Float.isNaN(f6) || f7 < f6) {
                    fArr4[i14] = f7;
                    i17++;
                } else {
                    fArr4[i14] = f6;
                    i16++;
                    i17++;
                    i15++;
                }
                i14++;
            }
            fArrCopyOf = i15 == 0 ? fArr4 : Arrays.copyOf(fArr4, length - i15);
        }
        int length2 = fArrCopyOf.length;
        int[] iArr2 = new int[length2];
        int i18 = i12;
        while (i18 < length2) {
            float f8 = fArrCopyOf[i18];
            int iBinarySearch = Arrays.binarySearch(fArr, f8);
            int iBinarySearch2 = Arrays.binarySearch(fArr2, f8);
            if (iBinarySearch < 0 || iBinarySearch2 > 0) {
                if (iBinarySearch2 < 0) {
                    iBinarySearch2 = -(iBinarySearch2 + 1);
                }
                float f9 = fArr3[iBinarySearch2];
                if (i5 < i4 || f8 == fArr[i12]) {
                    iArgb = iArr[i12];
                } else {
                    int i19 = 1;
                    while (true) {
                        if (i19 >= i5) {
                            ra.q("Unreachable code.");
                            return null;
                        }
                        f2 = fArr[i19];
                        if (f2 >= f8 || i19 == i5 - 1) {
                            break;
                        }
                        i19++;
                    }
                    if (i19 != i5 - 1 || f8 < f2) {
                        int i20 = i19 - 1;
                        float f10 = fArr[i20];
                        int iD = ig2.D((f8 - f10) / (f2 - f10), iArr[i20], iArr[i19]);
                        iArgb = Color.argb((int) (f9 * 255.0f), Color.red(iD), Color.green(iD), Color.blue(iD));
                    } else {
                        iArgb = Color.argb((int) (f9 * 255.0f), Color.red(iArr[i19]), Color.green(iArr[i19]), Color.blue(iArr[i19]));
                    }
                }
                iArr2[i18] = iArgb;
            } else {
                int i21 = iArr[iBinarySearch];
                if (size < i4 || f8 <= fArr2[i12]) {
                    iArgb2 = Color.argb((int) (fArr3[i12] * 255.0f), Color.red(i21), Color.green(i21), Color.blue(i21));
                } else {
                    int i22 = 1;
                    while (true) {
                        if (i22 >= size) {
                            ra.q("Unreachable code.");
                            return null;
                        }
                        f3 = fArr2[i22];
                        if (f3 >= f8 || i22 == size - 1) {
                            break;
                        }
                        i22++;
                    }
                    if (f3 <= f8) {
                        f4 = fArr3[i22];
                    } else {
                        int i23 = i22 - 1;
                        float f11 = fArr2[i23];
                        f4 = s41.f(fArr3[i23], fArr3[i22], (f8 - f11) / (f3 - f11));
                    }
                    iArgb2 = Color.argb((int) (f4 * 255.0f), Color.red(i21), Color.green(i21), Color.blue(i21));
                }
                iArr2[i18] = iArgb2;
            }
            i18++;
            i4 = 2;
        }
        return new km0(iArr2, fArrCopyOf);
    }
}
