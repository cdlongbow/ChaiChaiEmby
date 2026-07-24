package defpackage;

import java.util.concurrent.ConcurrentHashMap;
import java.lang.ref.SoftReference;
import java.util.ArrayList;
import kotlin.Function;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.JvmClassMappingKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.reflect.KClass;
import kotlin.reflect.KType;

/* JADX INFO: loaded from: classes5.dex */
public final class xp implements ww1, zc1 {
    public final yp a = new yp();
    public final Function b;

    public xp(Function1 function1) {
        this.b = function1;
    }

    @Override // defpackage.zc1
    public Object a(KClass kClass, ArrayList arrayList) {
        Object objM8825constructorimpl;
        Object obj = this.a.get(JvmClassMappingKt.getJavaClass(kClass));
        obj.getClass();
        k61 k61Var = (k61) obj;
        Object yc1Var = k61Var.a.get();
        if (yc1Var == null) {
            synchronized (k61Var) {
                yc1Var = k61Var.a.get();
                if (yc1Var == null) {
                    yc1Var = new yc1();
                    k61Var.a = new SoftReference(yc1Var);
                }
            }
        }
        yc1 yc1Var2 = (yc1) yc1Var;
        ArrayList arrayList2 = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(arrayList, 10));
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            Object obj2 = arrayList.get(i);
            i++;
            arrayList2.add(new yv0((KType) obj2));
        }
        ConcurrentHashMap concurrentHashMap = yc1Var2.a;
        Object obj3 = concurrentHashMap.get(arrayList2);
        if (obj3 == null) {
            try {
                
                objM8825constructorimpl = (xv0 ((Function2) this.b).invoke(kClass, arrayList));
            } catch (Throwable th) {
                
                objM8825constructorimpl = ResultKt.createFailure(th);
            }
            Result resultM8824boximpl = Result.m8824boximpl(objM8825constructorimpl);
            Object objPutIfAbsent = concurrentHashMap.putIfAbsent(arrayList2, resultM8824boximpl);
            obj3 = objPutIfAbsent == null ? resultM8824boximpl : objPutIfAbsent;
        }
        obj3.getClass();
        return ((Result) obj3).getValue();
    }

    @Override // defpackage.ww1
    public xv0 c(KClass kClass) {
        Object objInvoke;
        Object obj = this.a.get(JvmClassMappingKt.getJavaClass(kClass));
        obj.getClass();
        k61 k61Var = (k61) obj;
        Object obj2 = k61Var.a.get();
        if (obj2 == null) {
            ni niVar = new ni(1, this, kClass);
            synchronized (k61Var) {
                objInvoke = k61Var.a.get();
                if (objInvoke == null) {
                    objInvoke = niVar.invoke();
                    k61Var.a = new SoftReference(objInvoke);
                }
            }
            obj2 = objInvoke;
        }
        return ((kn) obj2).a;
    }

    public xp(Function2 function2) {
        this.b = function2;
    }
}
