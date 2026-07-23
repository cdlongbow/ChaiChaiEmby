package defpackage;

import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.snapshots.SnapshotStateList;
import kotlin.Function;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class gh implements Function0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;

    public /* synthetic */ gh(MutableState mutableState, MutableState mutableState2, MutableState mutableState3, MutableState mutableState4) {
        this.a = 3;
        this.c = mutableState;
        this.d = mutableState2;
        this.e = mutableState3;
        this.b = mutableState4;
    }

    /* JADX WARN: Code duplicated, block: B:123:0x036c  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r8v2, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r8v3, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r8v7, types: [java.util.ArrayList] */
    /*  JADX ERROR: JadxRuntimeException in pass: IfRegionVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r1v11 java.lang.Object, still in use, count: 2, list:
          (r1v11 java.lang.Object) from 0x0367: PHI (r1 I:Object) = (r1v9 java.lang.Object), (r1v11 java.lang.Object) binds: [B:120:0x0366, B:144:0x0367] A[DONT_GENERATE, DONT_INLINE]
          (r1v11 java.lang.Object) from 0x0353: CHECK_CAST (com.dh.myembyapp.data.model.BackupRouteConfig) (r1v11 java.lang.Object)
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
    @Override // kotlin.jvm.functions.Function0
    public final java.lang.Object invoke() {
        /*
            Method dump skipped, instruction units count: 966
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.gh.invoke():java.lang.Object");
    }

    public /* synthetic */ gh(int i, Object obj, Object obj2, Object obj3, Object obj4) {
        this.a = i;
        this.d = obj;
        this.e = obj2;
        this.b = obj3;
        this.c = obj4;
    }

    public /* synthetic */ gh(int i, MutableState mutableState, Object obj, Object obj2, Object obj3) {
        this.a = i;
        this.d = obj;
        this.e = obj2;
        this.c = mutableState;
        this.b = obj3;
    }

    public /* synthetic */ gh(SnapshotStateList snapshotStateList, MutableState mutableState, MutableState mutableState2, MutableState mutableState3) {
        this.a = 1;
        this.b = snapshotStateList;
        this.c = mutableState;
        this.d = mutableState2;
        this.e = mutableState3;
    }

    public /* synthetic */ gh(Function function, MutableState mutableState, MutableState mutableState2, Object obj, int i) {
        this.a = i;
        this.d = function;
        this.c = mutableState;
        this.e = mutableState2;
        this.b = obj;
    }
}
