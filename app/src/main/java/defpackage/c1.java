package defpackage;

import androidx.compose.runtime.MutableState;
import kotlin.Function;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class c1 implements Function1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ c1(Object obj, Object obj2, Object obj3, int i) {
        this.a = i;
        this.b = obj;
        this.c = obj2;
        this.d = obj3;
    }

    /* JADX WARN: Code duplicated, block: B:54:0x01e2  */
    /* JADX WARN: Code duplicated, block: B:72:0x0256  */
    /*  JADX ERROR: JadxRuntimeException in pass: IfRegionVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r3v7 java.lang.Object, still in use, count: 2, list:
          (r3v7 java.lang.Object) from 0x01ce: PHI (r3 I:Object) = (r3v4 java.lang.Object), (r3v7 java.lang.Object) binds: [B:47:0x01cd, B:98:0x01ce] A[DONT_GENERATE, DONT_INLINE]
          (r3v7 java.lang.Object) from 0x01c2: CHECK_CAST (rg0) (r3v7 java.lang.Object)
        	at jadx.core.utils.InsnRemover.removeSsaVar(InsnRemover.java:164)
        	at jadx.core.utils.InsnRemover.unbindResult(InsnRemover.java:129)
        	at jadx.core.utils.InsnRemover.unbindInsn(InsnRemover.java:93)
        	at jadx.core.dex.visitors.regions.TernaryMod.makeTernaryInsn(TernaryMod.java:132)
        	at jadx.core.dex.visitors.regions.TernaryMod.processRegion(TernaryMod.java:67)
        	at jadx.core.dex.visitors.regions.TernaryMod.enterRegion(TernaryMod.java:50)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:96)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverse(DepthRegionTraversal.java:27)
        	at jadx.core.dex.visitors.regions.TernaryMod.process(TernaryMod.java:36)
        	at jadx.core.dex.visitors.regions.IfRegionVisitor.process(IfRegionVisitor.java:44)
        	at jadx.core.dex.visitors.regions.IfRegionVisitor.visit(IfRegionVisitor.java:30)
        */
    @Override // kotlin.jvm.functions.Function1
    public final java.lang.Object invoke(java.lang.Object r20) {
        /*
            Method dump skipped, instruction units count: 910
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.c1.invoke(java.lang.Object):java.lang.Object");
    }

    public /* synthetic */ c1(Object obj, Object obj2, Function function, int i) {
        this.a = i;
        this.b = obj;
        this.d = obj2;
        this.c = function;
    }

    public /* synthetic */ c1(Function0 function0, Object obj, Object obj2, int i) {
        this.a = i;
        this.d = function0;
        this.b = obj;
        this.c = obj2;
    }

    public /* synthetic */ c1(Function1 function1, Object obj, MutableState mutableState, int i) {
        this.a = i;
        this.c = function1;
        this.b = obj;
        this.d = mutableState;
    }
}
