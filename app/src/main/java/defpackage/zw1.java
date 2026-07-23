package defpackage;

import java.util.HashMap;
import java.util.Map;
import kotlin.collections.MapsKt;
import kotlin.jvm.JvmClassMappingKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KClass;

/* JADX INFO: loaded from: classes4.dex */
public final class zw1 implements ax1 {
    public final HashMap a = new HashMap();
    public final HashMap b = new HashMap();
    public final HashMap c = new HashMap();
    public final HashMap d = new HashMap();
    public final HashMap e = new HashMap();
    public boolean g;

    @Override // defpackage.ax1
    public final void a(KClass kClass, KClass kClass2, xv0 xv0Var) {
        kClass.getClass();
        kClass2.getClass();
        xv0Var.getClass();
        i(kClass, kClass2, xv0Var, false);
    }

    public final rw1 b() {
        return new rw1(this.a, this.b, this.c, this.d, this.e, this.g);
    }

    @Override // defpackage.ax1
    public final void c(KClass kClass, xv0 xv0Var) {
        kClass.getClass();
        xv0Var.getClass();
        j(kClass, new kv(xv0Var), false);
    }

    public final void d(KClass kClass, Function1 function1, boolean z) {
        kClass.getClass();
        function1.getClass();
        HashMap map = this.e;
        Function1 function2 = (Function1) map.get(kClass);
        if (function2 == null || Intrinsics.areEqual(function2, function1) || z) {
            map.put(kClass, function1);
        } else {
            r02.r("Default deserializers provider for ", kClass, " is already registered: ", function2);
        }
    }

    @Override // defpackage.ax1
    public final void e(KClass kClass, Function1 function1) {
        kClass.getClass();
        function1.getClass();
        d(kClass, function1, false);
    }

    @Override // defpackage.ax1
    public final void f(KClass kClass, Function1 function1) {
        kClass.getClass();
        function1.getClass();
        g(kClass, function1, false);
    }

    public final void g(KClass kClass, Function1 function1, boolean z) {
        kClass.getClass();
        function1.getClass();
        HashMap map = this.c;
        Function1 function2 = (Function1) map.get(kClass);
        if (function2 == null || Intrinsics.areEqual(function2, function1) || z) {
            map.put(kClass, function1);
        } else {
            r02.r("Default serializers provider for ", kClass, " is already registered: ", function2);
        }
    }

    @Override // defpackage.ax1
    public final void h(KClass kClass, Function1 function1) {
        kClass.getClass();
        j(kClass, new lv(function1), false);
    }

    public final void i(KClass kClass, KClass kClass2, xv0 xv0Var, boolean z) {
        kClass.getClass();
        kClass2.getClass();
        xv0Var.getClass();
        String strF = xv0Var.getDescriptor().f();
        HashMap map = this.b;
        Object map2 = map.get(kClass);
        if (map2 == null) {
            map2 = new HashMap();
            map.put(kClass, map2);
        }
        Map map3 = (Map) map2;
        xv0 xv0Var2 = (xv0) map3.get(kClass2);
        HashMap map4 = this.d;
        Object map5 = map4.get(kClass);
        if (map5 == null) {
            map5 = new HashMap();
            map4.put(kClass, map5);
        }
        Map map6 = (Map) map5;
        if (z) {
            if (xv0Var2 != null) {
                map6.remove(xv0Var2.getDescriptor().f());
            }
            map3.put(kClass2, xv0Var);
            map6.put(strF, xv0Var);
            return;
        }
        if (xv0Var2 != null) {
            if (!Intrinsics.areEqual(xv0Var2, xv0Var)) {
                throw new uw1("Serializer for " + kClass2 + " already registered in the scope of " + kClass);
            }
        }
        xv0 xv0Var3 = (xv0) map6.get(strF);
        if (xv0Var3 == null) {
            map3.put(kClass2, xv0Var);
            map6.put(strF, xv0Var);
            return;
        }
        Object obj = map.get(kClass);
        obj.getClass();
        for (Object obj2 : MapsKt.asSequence((Map) obj)) {
            if (((Map.Entry) obj2).getValue() == xv0Var3) {
                throw new IllegalArgumentException("Multiple polymorphic serializers for base class '" + kClass + "' have the same serial name '" + strF + "': '" + kClass2 + "' and '" + ((Map.Entry) obj2) + '\'');
            }
        }
        obj2 = null;
        throw new IllegalArgumentException("Multiple polymorphic serializers for base class '" + kClass + "' have the same serial name '" + strF + "': '" + kClass2 + "' and '" + ((Map.Entry) obj2) + '\'');
    }

    public final void j(KClass kClass, mv mvVar, boolean z) {
        mv mvVar2;
        kClass.getClass();
        HashMap map = this.a;
        if (!z && (mvVar2 = (mv) map.get(kClass)) != null && !Intrinsics.areEqual(mvVar2, mvVar)) {
            throw new uw1("Contextual serializer or serializer provider for " + kClass + " already registered in this module");
        }
        map.put(kClass, mvVar);
        if (JvmClassMappingKt.getJavaClass(kClass).isInterface()) {
            this.g = true;
        }
    }
}
