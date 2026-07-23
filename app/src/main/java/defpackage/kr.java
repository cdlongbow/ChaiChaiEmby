package defpackage;

import java.util.Objects;
import java.io.IOException;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.AbstractMap;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import kotlinx.coroutines.internal.LockFreeTaskQueueCore;

/* JADX INFO: loaded from: classes4.dex */
public final class kr extends AbstractMap implements Serializable {
    public static final Object k = new Object();
    public transient Object a;
    public transient int[] b;
    public transient Object[] c;
    public transient Object[] d;
    public transient int e;
    public transient int g;
    public transient ir h;
    public transient ir i;
    public transient r0 j;

    public static kr a() {
        kr krVar = new kr();
        krVar.f(3);
        return krVar;
    }

    public static kr b(int i) {
        kr krVar = new kr();
        krVar.f(i);
        return krVar;
    }

    private void readObject(ObjectInputStream objectInputStream) throws ClassNotFoundException, IOException {
        objectInputStream.defaultReadObject();
        int i = objectInputStream.readInt();
        if (i < 0) {
            throw new InvalidObjectException(i9.f(i, "Invalid size: "));
        }
        f(i);
        for (int i2 = 0; i2 < i; i2++) {
            put(objectInputStream.readObject(), objectInputStream.readObject());
        }
    }

    private void writeObject(ObjectOutputStream objectOutputStream) throws IOException {
        objectOutputStream.defaultWriteObject();
        objectOutputStream.writeInt(size());
        Map mapC = c();
        Iterator it = mapC != null ? mapC.entrySet().iterator() : new hr(this, 1);
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            objectOutputStream.writeObject(entry.getKey());
            objectOutputStream.writeObject(entry.getValue());
        }
    }

    public final Map c() {
        Object obj = this.a;
        if (obj instanceof Map) {
            return (Map) obj;
        }
        return null;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final void clear() {
        if (h()) {
            return;
        }
        this.e += 32;
        Map mapC = c();
        if (mapC != null) {
            this.e = Math.min(Math.max(size(), 3), LockFreeTaskQueueCore.MAX_CAPACITY_MASK);
            mapC.clear();
            this.a = null;
            this.g = 0;
            return;
        }
        Arrays.fill(k(), 0, this.g, (Object) null);
        Arrays.fill(l(), 0, this.g, (Object) null);
        Object obj = this.a;
        Objects.requireNonNull(obj);
        if (obj instanceof byte[]) {
            Arrays.fill((byte[]) obj, (byte) 0);
        } else if (obj instanceof short[]) {
            Arrays.fill((short[]) obj, (short) 0);
        } else {
            Arrays.fill((int[]) obj, 0);
        }
        Arrays.fill(j(), 0, this.g, 0);
        this.g = 0;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean containsKey(Object obj) {
        Map mapC = c();
        if (mapC != null) {
            return mapC.containsKey(obj);
        }
        return e(obj) != -1;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean containsValue(Object obj) {
        Map mapC = c();
        if (mapC != null) {
            return mapC.containsValue(obj);
        }
        for (int i = 0; i < this.g; i++) {
            if (tl0.n(obj, l()[i])) {
                return true;
            }
        }
        return false;
    }

    public final int d() {
        return (1 << (this.e & 31)) - 1;
    }

    public final int e(Object obj) {
        if (h()) {
            return -1;
        }
        int iN = ku.N(obj);
        int iD = d();
        Object obj2 = this.a;
        Objects.requireNonNull(obj2);
        int iC0 = tl0.c0(iN & iD, obj2);
        if (iC0 == 0) {
            return -1;
        }
        int i = ~iD;
        int i2 = iN & i;
        do {
            int i3 = iC0 - 1;
            int i4 = j()[i3];
            if ((i4 & i) == i2 && tl0.n(obj, k()[i3])) {
                return i3;
            }
            iC0 = i4 & iD;
        } while (iC0 != 0);
        return -1;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Set entrySet() {
        ir irVar = this.i;
        if (irVar != null) {
            return irVar;
        }
        ir irVar2 = new ir(this, 0);
        this.i = irVar2;
        return irVar2;
    }

    public final void f(int i) {
        ig2.m(i >= 0, "Expected size must be >= 0");
        this.e = Math.min(Math.max(i, 1), LockFreeTaskQueueCore.MAX_CAPACITY_MASK);
    }

    public final void g(int i, int i2) {
        Object obj = this.a;
        Objects.requireNonNull(obj);
        int[] iArrJ = j();
        Object[] objArrK = k();
        Object[] objArrL = l();
        int size = size();
        int i3 = size - 1;
        if (i >= i3) {
            objArrK[i] = null;
            objArrL[i] = null;
            iArrJ[i] = 0;
            return;
        }
        Object obj2 = objArrK[i3];
        objArrK[i] = obj2;
        objArrL[i] = objArrL[i3];
        objArrK[i3] = null;
        objArrL[i3] = null;
        iArrJ[i] = iArrJ[i3];
        iArrJ[i3] = 0;
        int iN = ku.N(obj2) & i2;
        int iC0 = tl0.c0(iN, obj);
        if (iC0 == size) {
            tl0.d0(iN, i + 1, obj);
            return;
        }
        while (true) {
            int i4 = iC0 - 1;
            int i5 = iArrJ[i4];
            int i6 = i5 & i2;
            if (i6 == size) {
                iArrJ[i4] = tl0.C(i5, i + 1, i2);
                return;
            }
            iC0 = i6;
        }
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Object get(Object obj) {
        Map mapC = c();
        if (mapC != null) {
            return mapC.get(obj);
        }
        int iE = e(obj);
        if (iE == -1) {
            return null;
        }
        return l()[iE];
    }

    public final boolean h() {
        return this.a == null;
    }

    public final Object i(Object obj) {
        if (!h()) {
            int iD = d();
            Object obj2 = this.a;
            Objects.requireNonNull(obj2);
            int iU = tl0.U(obj, null, iD, obj2, j(), k(), null);
            if (iU != -1) {
                Object obj3 = l()[iU];
                g(iU, iD);
                this.g--;
                this.e += 32;
                return obj3;
            }
        }
        return k;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean isEmpty() {
        return size() == 0;
    }

    public final int[] j() {
        int[] iArr = this.b;
        Objects.requireNonNull(iArr);
        return iArr;
    }

    public final Object[] k() {
        Object[] objArr = this.c;
        Objects.requireNonNull(objArr);
        return objArr;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Set keySet() {
        ir irVar = this.h;
        if (irVar != null) {
            return irVar;
        }
        ir irVar2 = new ir(this, 1);
        this.h = irVar2;
        return irVar2;
    }

    public final Object[] l() {
        Object[] objArr = this.d;
        Objects.requireNonNull(objArr);
        return objArr;
    }

    public final int m(int i, int i2, int i3, int i4) {
        Object objJ = tl0.j(i2);
        int i5 = i2 - 1;
        if (i4 != 0) {
            tl0.d0(i3 & i5, i4 + 1, objJ);
        }
        Object obj = this.a;
        Objects.requireNonNull(obj);
        int[] iArrJ = j();
        for (int i6 = 0; i6 <= i; i6++) {
            int iC0 = tl0.c0(i6, obj);
            while (iC0 != 0) {
                int i7 = iC0 - 1;
                int i8 = iArrJ[i7];
                int i9 = ((~i) & i8) | i6;
                int i10 = i9 & i5;
                int iC1 = tl0.c0(i10, objJ);
                tl0.d0(i10, iC0, objJ);
                iArrJ[i7] = tl0.C(i9, iC1, i5);
                iC0 = i8 & i;
            }
        }
        this.a = objJ;
        this.e = tl0.C(this.e, 32 - Integer.numberOfLeadingZeros(i5), 31);
        return i5;
    }

    /* JADX WARN: Code duplicated, block: B:40:0x00eb  */
    /* JADX WARN: Code duplicated, block: B:42:0x0100 A[LOOP:1: B:39:0x00e9->B:42:0x0100, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:63:0x00e4 A[EDGE_INSN: B:63:0x00e4->B:37:0x00e4 BREAK  A[LOOP:1: B:39:0x00e9->B:42:0x0100], SYNTHETIC] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:41:0x00fe -> B:37:0x00e4). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    @Override // java.util.AbstractMap, java.util.Map
    public final java.lang.Object put(java.lang.Object r23, java.lang.Object r24) {
        /*
            Method dump skipped, instruction units count: 405
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.kr.put(java.lang.Object, java.lang.Object):java.lang.Object");
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Object remove(Object obj) {
        Map mapC = c();
        if (mapC != null) {
            return mapC.remove(obj);
        }
        Object objI = i(obj);
        if (objI == k) {
            return null;
        }
        return objI;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final int size() {
        Map mapC = c();
        return mapC != null ? mapC.size() : this.g;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Collection values() {
        r0 r0Var = this.j;
        if (r0Var != null) {
            return r0Var;
        }
        r0 r0Var2 = new r0(this, 2);
        this.j = r0Var2;
        return r0Var2;
    }
}
