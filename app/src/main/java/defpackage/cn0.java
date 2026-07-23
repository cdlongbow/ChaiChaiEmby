package defpackage;

import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes4.dex */
public final class cn0 extends j31 {
    public final /* synthetic */ int c;
    public final bn0 d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cn0(xv0 xv0Var, xv0 xv0Var2, int i) {
        super(xv0Var, xv0Var2);
        this.c = i;
        xv0Var.getClass();
        xv0Var2.getClass();
        switch (i) {
            case 1:
                super(xv0Var, xv0Var2);
                lw1 descriptor = xv0Var.getDescriptor();
                lw1 descriptor2 = xv0Var2.getDescriptor();
                descriptor.getClass();
                descriptor2.getClass();
                this.d = new bn0("kotlin.collections.LinkedHashMap", descriptor, descriptor2);
                break;
            default:
                lw1 descriptor3 = xv0Var.getDescriptor();
                lw1 descriptor4 = xv0Var2.getDescriptor();
                descriptor3.getClass();
                descriptor4.getClass();
                this.d = new bn0("kotlin.collections.HashMap", descriptor3, descriptor4);
                break;
        }
    }

    @Override // defpackage.d
    public final Object a() {
        switch (this.c) {
            case 0:
                return new HashMap();
            default:
                return new LinkedHashMap();
        }
    }

    @Override // defpackage.d
    public final int b(Object obj) {
        int size;
        switch (this.c) {
            case 0:
                HashMap map = (HashMap) obj;
                map.getClass();
                size = map.size();
                break;
            default:
                LinkedHashMap linkedHashMap = (LinkedHashMap) obj;
                linkedHashMap.getClass();
                size = linkedHashMap.size();
                break;
        }
        return size * 2;
    }

    @Override // defpackage.d
    public final void c(int i, Object obj) {
        switch (this.c) {
            case 0:
                ((HashMap) obj).getClass();
                break;
            default:
                ((LinkedHashMap) obj).getClass();
                break;
        }
    }

    @Override // defpackage.d
    public final Iterator d(Object obj) {
        switch (this.c) {
            case 0:
                Map map = (Map) obj;
                map.getClass();
                return map.entrySet().iterator();
            default:
                Map map2 = (Map) obj;
                map2.getClass();
                return map2.entrySet().iterator();
        }
    }

    @Override // defpackage.d
    public final int e(Object obj) {
        switch (this.c) {
            case 0:
                Map map = (Map) obj;
                map.getClass();
                return map.size();
            default:
                Map map2 = (Map) obj;
                map2.getClass();
                return map2.size();
        }
    }

    @Override // defpackage.vw1, defpackage.l40
    public final lw1 getDescriptor() {
        switch (this.c) {
            case 0:
                break;
        }
        return this.d;
    }

    @Override // defpackage.d
    public final Object i(Object obj) {
        switch (this.c) {
            case 0:
                throw null;
            default:
                throw null;
        }
    }

    @Override // defpackage.d
    public final Object j(Object obj) {
        switch (this.c) {
            case 0:
                HashMap map = (HashMap) obj;
                map.getClass();
                return map;
            default:
                LinkedHashMap linkedHashMap = (LinkedHashMap) obj;
                linkedHashMap.getClass();
                return linkedHashMap;
        }
    }
}
