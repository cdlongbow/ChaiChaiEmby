package defpackage;

import java.util.Map;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.TypeIntrinsics;
import kotlin.reflect.KClass;

/* JADX INFO: loaded from: classes5.dex */
public final class rw1 extends yw1 {
    public final Map a;
    public final Map b;
    public final Map c;
    public final Map d;
    public final Map e;
    public final boolean f;

    public rw1(Map map, Map map2, Map map3, Map map4, Map map5, boolean z) {
        map.getClass();
        map2.getClass();
        map3.getClass();
        map4.getClass();
        map5.getClass();
        this.a = map;
        this.b = map2;
        this.c = map3;
        this.d = map4;
        this.e = map5;
        this.f = z;
    }

    @Override // defpackage.yw1
    public final void a(ax1 ax1Var) {
        for (Map.Entry entry : this.a.entrySet()) {
            KClass kClass = (KClass) entry.getKey();
            mv mvVar = (mv) entry.getValue();
            if (mvVar instanceof kv) {
                kClass.getClass();
                xv0 xv0Var = ((kv) mvVar).a;
                xv0Var.getClass();
                ax1Var.c(kClass, xv0Var);
            } else {
                if (!(mvVar instanceof lv)) {
                    qu.f();
                    return;
                }
                ax1Var.h(kClass, ((lv) mvVar).a);
            }
        }
        for (Map.Entry entry2 : this.b.entrySet()) {
            KClass kClass2 = (KClass) entry2.getKey();
            for (Map.Entry entry3 : ((Map) entry2.getValue()).entrySet()) {
                KClass kClass3 = (KClass) entry3.getKey();
                xv0 xv0Var2 = (xv0) entry3.getValue();
                kClass2.getClass();
                kClass3.getClass();
                xv0Var2.getClass();
                ax1Var.a(kClass2, kClass3, xv0Var2);
            }
        }
        for (Map.Entry entry4 : this.c.entrySet()) {
            KClass kClass4 = (KClass) entry4.getKey();
            Function1 function1 = (Function1) entry4.getValue();
            kClass4.getClass();
            function1.getClass();
            ax1Var.f(kClass4, (Function1) TypeIntrinsics.beforeCheckcastToFunctionOfArity(function1, 1));
        }
        for (Map.Entry entry5 : this.e.entrySet()) {
            KClass kClass5 = (KClass) entry5.getKey();
            Function1 function2 = (Function1) entry5.getValue();
            kClass5.getClass();
            function2.getClass();
            ax1Var.e(kClass5, (Function1) TypeIntrinsics.beforeCheckcastToFunctionOfArity(function2, 1));
        }
    }
}
