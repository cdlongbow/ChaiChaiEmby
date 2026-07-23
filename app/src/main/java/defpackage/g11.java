package defpackage;

import android.graphics.Bitmap;
import android.graphics.Rect;
import androidx.collection.LongSparseArray;
import androidx.collection.SparseArrayCompat;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

/* JADX INFO: loaded from: classes4.dex */
public final class g11 {
    public HashMap c;
    public HashMap d;
    public float e;
    public HashMap f;
    public ArrayList g;
    public SparseArrayCompat h;
    public LongSparseArray i;
    public ArrayList j;
    public Rect k;
    public float l;
    public float m;
    public float n;
    public boolean o;
    public final id1 a = new id1();
    public final HashSet b = new HashSet();
    public int p = 0;

    public final void a(String str) {
        r01.b(str);
        this.b.add(str);
    }

    public final float b() {
        return (long) (((this.m - this.l) / this.n) * 1000.0f);
    }

    public final Map c() {
        float fC = wd2.c();
        if (fC != this.e) {
            for (Map.Entry entry : this.d.entrySet()) {
                HashMap map = this.d;
                String str = (String) entry.getKey();
                a21 a21Var = (a21) entry.getValue();
                float f = this.e / fC;
                int i = (int) (a21Var.a * f);
                int i2 = (int) (a21Var.b * f);
                a21 a21Var2 = new a21(a21Var.c, i, i2, a21Var.d, a21Var.e);
                Bitmap bitmap = a21Var.f;
                if (bitmap != null) {
                    a21Var2.f = Bitmap.createScaledBitmap(bitmap, i, i2, true);
                }
                map.put(str, a21Var2);
            }
        }
        this.e = fC;
        return this.d;
    }

    public final q31 d(String str) {
        int size = this.g.size();
        for (int i = 0; i < size; i++) {
            q31 q31Var = (q31) this.g.get(i);
            String str2 = q31Var.a;
            if (str2.equalsIgnoreCase(str) || (str2.endsWith("\r") && str2.substring(0, str2.length() - 1).equalsIgnoreCase(str))) {
                return q31Var;
            }
        }
        return null;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("LottieComposition:\n");
        ArrayList arrayList = this.j;
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            sb.append(((mw0) obj).a("\t"));
        }
        return sb.toString();
    }
}
