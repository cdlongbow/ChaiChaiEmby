package defpackage;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;

/* JADX INFO: loaded from: classes4.dex */
public final class hd extends tq {
    public final /* synthetic */ int b;
    public final d01 c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public hd(xv0 xv0Var, int i) {
        super(xv0Var);
        this.b = i;
        xv0Var.getClass();
        switch (i) {
            case 1:
                super(xv0Var);
                lw1 descriptor = xv0Var.getDescriptor();
                descriptor.getClass();
                this.c = new fd(descriptor, 2);
                break;
            case 2:
                super(xv0Var);
                lw1 descriptor2 = xv0Var.getDescriptor();
                descriptor2.getClass();
                this.c = new fd(descriptor2, 3);
                break;
            default:
                lw1 descriptor3 = xv0Var.getDescriptor();
                descriptor3.getClass();
                this.c = new fd(descriptor3, 1);
                break;
        }
    }

    @Override // defpackage.d
    public final Object a() {
        switch (this.b) {
            case 0:
                return new ArrayList();
            case 1:
                return new HashSet();
            default:
                return new LinkedHashSet();
        }
    }

    @Override // defpackage.d
    public final int b(Object obj) {
        switch (this.b) {
            case 0:
                ArrayList arrayList = (ArrayList) obj;
                arrayList.getClass();
                return arrayList.size();
            case 1:
                HashSet hashSet = (HashSet) obj;
                hashSet.getClass();
                return hashSet.size();
            default:
                LinkedHashSet linkedHashSet = (LinkedHashSet) obj;
                linkedHashSet.getClass();
                return linkedHashSet.size();
        }
    }

    @Override // defpackage.d
    public final void c(int i, Object obj) {
        switch (this.b) {
            case 0:
                ArrayList arrayList = (ArrayList) obj;
                arrayList.getClass();
                arrayList.ensureCapacity(i);
                break;
            case 1:
                ((HashSet) obj).getClass();
                break;
            default:
                ((LinkedHashSet) obj).getClass();
                break;
        }
    }

    @Override // defpackage.d
    public final Iterator d(Object obj) {
        Collection collection = (Collection) obj;
        collection.getClass();
        return collection.iterator();
    }

    @Override // defpackage.d
    public final int e(Object obj) {
        Collection collection = (Collection) obj;
        collection.getClass();
        return collection.size();
    }

    @Override // defpackage.vw1, defpackage.l40
    public final lw1 getDescriptor() {
        switch (this.b) {
            case 0:
                break;
            case 1:
                break;
        }
        return (fd) this.c;
    }

    @Override // defpackage.d
    public final Object i(Object obj) {
        switch (this.b) {
            case 0:
                throw null;
            case 1:
                throw null;
            default:
                throw null;
        }
    }

    @Override // defpackage.d
    public final Object j(Object obj) {
        switch (this.b) {
            case 0:
                ArrayList arrayList = (ArrayList) obj;
                arrayList.getClass();
                return arrayList;
            case 1:
                HashSet hashSet = (HashSet) obj;
                hashSet.getClass();
                return hashSet;
            default:
                LinkedHashSet linkedHashSet = (LinkedHashSet) obj;
                linkedHashSet.getClass();
                return linkedHashSet;
        }
    }

    @Override // defpackage.tq
    public final void k(int i, Object obj, Object obj2) {
        switch (this.b) {
            case 0:
                ArrayList arrayList = (ArrayList) obj;
                arrayList.getClass();
                arrayList.add(i, obj2);
                break;
            case 1:
                HashSet hashSet = (HashSet) obj;
                hashSet.getClass();
                hashSet.add(obj2);
                break;
            default:
                LinkedHashSet linkedHashSet = (LinkedHashSet) obj;
                linkedHashSet.getClass();
                linkedHashSet.add(obj2);
                break;
        }
    }
}
