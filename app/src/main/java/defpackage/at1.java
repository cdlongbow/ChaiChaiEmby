package defpackage;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.jvm.JvmClassMappingKt;
import kotlin.jvm.internal.ArrayIteratorKt;
import kotlin.reflect.KClass;

/* JADX INFO: loaded from: classes4.dex */
public final class at1 extends tq {
    public final KClass b;
    public final fd c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public at1(KClass kClass, xv0 xv0Var) {
        super(xv0Var);
        kClass.getClass();
        xv0Var.getClass();
        this.b = kClass;
        lw1 descriptor = xv0Var.getDescriptor();
        descriptor.getClass();
        this.c = new fd(descriptor, 0);
    }

    @Override // defpackage.d
    public final Object a() {
        return new ArrayList();
    }

    @Override // defpackage.d
    public final int b(Object obj) {
        ArrayList arrayList = (ArrayList) obj;
        arrayList.getClass();
        return arrayList.size();
    }

    @Override // defpackage.d
    public final void c(int i, Object obj) {
        ArrayList arrayList = (ArrayList) obj;
        arrayList.getClass();
        arrayList.ensureCapacity(i);
    }

    @Override // defpackage.d
    public final Iterator d(Object obj) {
        Object[] objArr = (Object[]) obj;
        objArr.getClass();
        return ArrayIteratorKt.iterator(objArr);
    }

    @Override // defpackage.d
    public final int e(Object obj) {
        Object[] objArr = (Object[]) obj;
        objArr.getClass();
        return objArr.length;
    }

    @Override // defpackage.vw1, defpackage.l40

    @Override // defpackage.d
    public final Object i(Object obj) {
        throw null;
    }

    @Override // defpackage.d
    public final Object j(Object obj) {
        ArrayList arrayList = (ArrayList) obj;
        arrayList.getClass();
        KClass kClass = this.b;
        kClass.getClass();
        Object objNewInstance = Array.newInstance((Class<?>) JvmClassMappingKt.getJavaClass(kClass), arrayList.size());
        objNewInstance.getClass();
        Object[] array = arrayList.toArray((Object[]) objNewInstance);
        array.getClass();
        return array;
    }

    @Override // defpackage.tq
    public final void k(int i, Object obj, Object obj2) {
        ArrayList arrayList = (ArrayList) obj;
        arrayList.getClass();
        arrayList.add(i, obj2);
    }
}
