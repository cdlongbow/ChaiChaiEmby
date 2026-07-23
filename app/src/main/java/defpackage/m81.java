package defpackage;

import android.content.Context;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class m81 implements bk0 {
    public final Lazy a;
    public final Lazy b;
    public final aa c;
    public final Lazy d;

    public m81(Function0 function0, Function0 function1, Function1 function2, Function0 function3) {
        this.a = LazyKt.lazy(function0);
        this.b = LazyKt.lazy(function1);
        aa aaVar = new aa();
        aaVar.a = function2;
        aaVar.b = yq.h;
        this.c = aaVar;
        this.d = LazyKt.lazy(function3);
    }

    @Override // defpackage.bk0
    public final ck0 a(Object obj, wa1 wa1Var, ks1 ks1Var) {
        rd2 rd2Var = (rd2) obj;
        if (!Intrinsics.areEqual(rd2Var.c, "http") && !Intrinsics.areEqual(rd2Var.c, "https")) {
            return null;
        }
        String str = rd2Var.a;
        Lazy lazy = this.a;
        Lazy lazy2 = LazyKt.lazy(new c71(ks1Var, 1));
        Lazy lazy3 = this.b;
        aa aaVar = this.c;
        Context context = wa1Var.a;
        Object obj2 = aaVar.b;
        yq yqVar = yq.h;
        if (obj2 == yqVar) {
            synchronized (aaVar) {
                obj2 = aaVar.b;
                if (obj2 == yqVar) {
                    Function1 function1 = (Function1) aaVar.a;
                    function1.getClass();
                    Object objInvoke = function1.invoke(context);
                    aaVar.b = objInvoke;
                    aaVar.a = null;
                    obj2 = objInvoke;
                }
            }
        }
        return new s81(str, wa1Var, lazy, lazy2, lazy3, LazyKt.lazyOf(obj2), this.d);
    }

    public /* synthetic */ m81(Function0 function0) {
        this(function0, new o01(28), l81.a, new o01(29));
    }
}
