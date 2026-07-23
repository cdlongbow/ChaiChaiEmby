package defpackage;

import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;
import java.util.function.UnaryOperator;

/* JADX INFO: loaded from: classes4.dex */
public abstract class at0 extends ts0 implements List, RandomAccess {
    public static final bl0 b = new bl0(0, bt1.e);
    private static final long serialVersionUID = -889275714;

    public static bt1 h(int i, Object[] objArr) {
        return i == 0 ? bt1.e : new bt1(objArr, i);
    }

    public static xs0 i() {
        return new xs0(4);
    }

    public static xs0 j(int i) {
        ig2.r(i, "expectedSize");
        return new xs0(i);
    }

    public static at0 k(Iterable iterable) {
        iterable.getClass();
        if (iterable instanceof Collection) {
            return l((Collection) iterable);
        }
        Iterator it = iterable.iterator();
        if (!it.hasNext()) {
            return bt1.e;
        }
        Object next = it.next();
        if (!it.hasNext()) {
            return o(next);
        }
        xs0 xs0Var = new xs0(4);
        xs0Var.c(next);
        while (it.hasNext()) {
            xs0Var.c(it.next());
        }
        return xs0Var.f();
    }

    public static at0 l(Collection collection) {
        if (!(collection instanceof ts0)) {
            Object[] array = collection.toArray();
            ku.p(array.length, array);
            return h(array.length, array);
        }
        at0 at0VarA = ((ts0) collection).a();
        if (!at0VarA.f()) {
            return at0VarA;
        }
        Object[] array2 = at0VarA.toArray(ts0.a);
        return h(array2.length, array2);
    }

    public static bt1 m(Object[] objArr) {
        if (objArr.length == 0) {
            return bt1.e;
        }
        Object[] objArr2 = (Object[]) objArr.clone();
        ku.p(objArr2.length, objArr2);
        return h(objArr2.length, objArr2);
    }

    public static bt1 o(Object obj) {
        Object[] objArr = {obj};
        ku.p(1, objArr);
        return h(1, objArr);
    }

    public static bt1 p(Object obj, Object obj2) {
        Object[] objArr = {obj, obj2};
        ku.p(2, objArr);
        return h(2, objArr);
    }

    public static bt1 q(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        Object[] objArr = {obj, obj2, obj3, obj4, obj5};
        ku.p(5, objArr);
        return h(5, objArr);
    }

    public static bt1 r(String str, String str2, String str3, String str4, String str5, String str6) {
        Object[] objArr = {str, str2, str3, str4, str5, str6};
        ku.p(6, objArr);
        return h(6, objArr);
    }

    private void readObject(ObjectInputStream objectInputStream) throws InvalidObjectException {
        throw new InvalidObjectException("Use SerializedForm");
    }

    public static bt1 s(List list, Comparator comparator) {
        comparator.getClass();
        if (!en0.n(list)) {
            Iterator it = list.iterator();
            ArrayList arrayList = new ArrayList();
            it.getClass();
            while (it.hasNext()) {
                arrayList.add(it.next());
            }
            list = arrayList;
        }
        Object[] array = list.toArray();
        ku.p(array.length, array);
        Arrays.sort(array, comparator);
        return h(array.length, array);
    }

    @Override // java.util.List
    public final void add(int i, Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.List
    public final boolean addAll(int i, Collection collection) {
        throw new UnsupportedOperationException();
    }

    @Override // defpackage.ts0
    public int b(int i, Object[] objArr) {
        int size = size();
        for (int i2 = 0; i2 < size; i2++) {
            objArr[i + i2] = get(i2);
        }
        return i + size;
    }

    @Override // defpackage.ts0, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean contains(Object obj) {
        return indexOf(obj) >= 0;
    }

    @Override // java.util.Collection, java.util.List
    public final boolean equals(Object obj) {
        if (obj != this) {
            if (obj instanceof List) {
                List list = (List) obj;
                int size = size();
                if (size == list.size()) {
                    if (!(list instanceof RandomAccess)) {
                        Iterator it = iterator();
                        Iterator it2 = list.iterator();
                        while (it.hasNext()) {
                            if (it2.hasNext() && tl0.n(it.next(), it2.next())) {
                            }
                        }
                        return !it2.hasNext();
                    }
                    for (int i = 0; i < size; i++) {
                        if (tl0.n(get(i), list.get(i))) {
                        }
                    }
                }
            }
            return false;
        }
        return true;
    }

    @Override // defpackage.ts0
    /* JADX INFO: renamed from: g */
    public final qd2 iterator() {
        return listIterator(0);
    }

    @Override // java.util.Collection, java.util.List
    public final int hashCode() {
        int size = size();
        int i = 1;
        for (int i2 = 0; i2 < size; i2++) {
            i = ~(~(get(i2).hashCode() + (i * 31)));
        }
        return i;
    }

    @Override // java.util.List
    public final int indexOf(Object obj) {
        if (obj == null) {
            return -1;
        }
        int size = size();
        for (int i = 0; i < size; i++) {
            if (obj.equals(get(i))) {
                return i;
            }
        }
        return -1;
    }

    @Override // java.util.List
    public final int lastIndexOf(Object obj) {
        if (obj == null) {
            return -1;
        }
        for (int size = size() - 1; size >= 0; size--) {
            if (obj.equals(get(size))) {
                return size;
            }
        }
        return -1;
    }

    @Override // java.util.List
    public ListIterator listIterator() {
        return listIterator(0);
    }

    @Override // java.util.List
    /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
    public final bl0 listIterator(int i) {
        ig2.u(i, size());
        return isEmpty() ? b : new bl0(i, this);
    }

    @Override // java.util.List
    public final Object remove(int i) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.List
    public final Object set(int i, Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.List
    /* JADX INFO: renamed from: t, reason: merged with bridge method [inline-methods] */
    public at0 subList(int i, int i2) {
        ig2.v(i, i2, size());
        int i3 = i2 - i;
        if (i3 == size()) {
            return this;
        }
        return i3 == 0 ? bt1.e : new zs0(this, i, i3);
    }

    @Override // defpackage.ts0
    public Object writeReplace() {
        return new ys0(toArray(ts0.a));
    }

    @Override // defpackage.ts0
    public final at0 a() {
        return this;
    }
}
