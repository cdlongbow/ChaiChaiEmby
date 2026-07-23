package defpackage;

import java.util.Objects;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.util.Arrays;
import java.util.Collection;
import java.util.Set;
import java.util.SortedSet;

/* JADX INFO: loaded from: classes4.dex */
public abstract class st0 extends ts0 implements Set {
    public static final /* synthetic */ int c = 0;
    private static final long serialVersionUID = 912559;
    public transient at0 b;

    public static int h(int i) {
        int iMax = Math.max(i, 2);
        if (iMax >= 751619276) {
            ig2.m(iMax < 1073741824, "collection too large");
            return 1073741824;
        }
        int iHighestOneBit = Integer.highestOneBit(iMax - 1) << 1;
        while (((double) iHighestOneBit) * 0.7d < iMax) {
            iHighestOneBit <<= 1;
        }
        return iHighestOneBit;
    }

    public static st0 i(int i, Object... objArr) {
        if (i == 0) {
            return kt1.k;
        }
        if (i == 1) {
            Object obj = objArr[0];
            Objects.requireNonNull(obj);
            return new m12(obj);
        }
        int iH = h(i);
        Object[] objArr2 = new Object[iH];
        int i2 = iH - 1;
        int i3 = 0;
        int i4 = 0;
        for (int i5 = 0; i5 < i; i5++) {
            Object obj2 = objArr[i5];
            if (obj2 == null) {
                n41.l(i9.f(i5, "at index "));
                return null;
            }
            int iHashCode = obj2.hashCode();
            int iM = ku.M(iHashCode);
            while (true) {
                int i6 = iM & i2;
                Object obj3 = objArr2[i6];
                if (obj3 == null) {
                    objArr[i4] = obj2;
                    objArr2[i6] = obj2;
                    i3 += iHashCode;
                    i4++;
                    break;
                }
                if (obj3.equals(obj2)) {
                    break;
                }
                iM++;
            }
        }
        Arrays.fill(objArr, i4, i, (Object) null);
        if (i4 == 1) {
            Object obj4 = objArr[0];
            Objects.requireNonNull(obj4);
            return new m12(obj4);
        }
        if (h(i4) < iH / 2) {
            return i(i4, objArr);
        }
        int length = objArr.length;
        if (i4 < (length >> 1) + (length >> 2)) {
            objArr = Arrays.copyOf(objArr, i4);
        }
        return new kt1(objArr, objArr2, i3, i2, i4);
    }

    public static st0 j(Collection collection) {
        if ((collection instanceof st0) && !(collection instanceof SortedSet)) {
            st0 st0Var = (st0) collection;
            if (!st0Var.f()) {
                return st0Var;
            }
        }
        Object[] array = collection.toArray();
        return i(array.length, array);
    }

    private void readObject(ObjectInputStream objectInputStream) throws InvalidObjectException {
        throw new InvalidObjectException("Use SerializedForm");
    }

    @Override // defpackage.ts0
    public at0 a() {
        at0 at0Var = this.b;
        if (at0Var != null) {
            return at0Var;
        }
        at0 at0VarK = k();
        this.b = at0VarK;
        return at0VarK;
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if ((obj instanceof st0) && (this instanceof kt1) && (((st0) obj) instanceof kt1) && ((kt1) this).e != obj.hashCode()) {
            return false;
        }
        return ku.t(this, obj);
    }

    @Override // java.util.Collection, java.util.Set
    public int hashCode() {
        return ku.C(this);
    }

    public at0 k() {
        Object[] array = toArray(ts0.a);
        bl0 bl0Var = at0.b;
        return at0.h(array.length, array);
    }

    @Override // defpackage.ts0
    public Object writeReplace() {
        return new rt0(toArray(ts0.a));
    }
}
