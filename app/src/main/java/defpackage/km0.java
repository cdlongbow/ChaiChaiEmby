package defpackage;

import java.util.Arrays;

/* JADX INFO: loaded from: classes4.dex */
public final class km0 {
    public final float[] a;
    public final int[] b;

    public km0(int[] iArr, float[] fArr) {
        this.a = fArr;
        this.b = iArr;
    }

    public final void a(km0 km0Var) {
        int i = 0;
        while (true) {
            int[] iArr = km0Var.b;
            if (i >= iArr.length) {
                return;
            }
            this.a[i] = km0Var.a[i];
            this.b[i] = iArr[i];
            i++;
        }
    }

    public final km0 b(float[] fArr) {
        int iD;
        int[] iArr = new int[fArr.length];
        for (int i = 0; i < fArr.length; i++) {
            float f = fArr[i];
            float[] fArr2 = this.a;
            int iBinarySearch = Arrays.binarySearch(fArr2, f);
            int[] iArr2 = this.b;
            if (iBinarySearch >= 0) {
                iD = iArr2[iBinarySearch];
            } else {
                int i2 = -(iBinarySearch + 1);
                if (i2 == 0) {
                    iD = iArr2[0];
                } else if (i2 == iArr2.length - 1) {
                    iD = iArr2[iArr2.length - 1];
                } else {
                    int i3 = i2 - 1;
                    float f2 = fArr2[i3];
                    iD = ig2.D((f - f2) / (fArr2[i2] - f2), iArr2[i3], iArr2[i2]);
                }
            }
            iArr[i] = iD;
        }
        return new km0(iArr, fArr);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || km0.class != obj.getClass()) {
            return false;
        }
        km0 km0Var = (km0) obj;
        return Arrays.equals(this.a, km0Var.a) && Arrays.equals(this.b, km0Var.b);
    }

    public final int hashCode() {
        return Arrays.hashCode(this.b) + (Arrays.hashCode(this.a) * 31);
    }
}
