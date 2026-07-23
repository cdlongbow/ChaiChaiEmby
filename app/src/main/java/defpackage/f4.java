package defpackage;

import android.content.Context;
import androidx.compose.runtime.MutableState;
import androidx.compose.ui.focus.FocusRequester;
import com.dh.myembyapp.data.DanmakuMemory;
import java.util.List;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class f4 implements Function1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object g;
    public final /* synthetic */ Object h;

    public /* synthetic */ f4(MutableState mutableState, tv1 tv1Var, MutableState mutableState2, MutableState mutableState3, FocusRequester focusRequester, Function1 function1) {
        this.a = 6;
        this.b = mutableState;
        this.d = tv1Var;
        this.c = mutableState2;
        this.g = mutableState3;
        this.e = focusRequester;
        this.h = function1;
    }

    /* JADX WARN: Code duplicated, block: B:19:0x011a  */
    /* JADX WARN: Code duplicated, block: B:20:0x011d  */
    /* JADX WARN: Code duplicated, block: B:22:0x0121  */
    /* JADX WARN: Code duplicated, block: B:25:0x0131  */
    /* JADX WARN: Code duplicated, block: B:36:0x0154  */
    /* JADX WARN: Code duplicated, block: B:38:0x0157  */
    /* JADX WARN: Code duplicated, block: B:40:0x0162  */
    /* JADX WARN: Code duplicated, block: B:60:0x01ed  */
    /* JADX WARN: Code duplicated, block: B:61:0x01f8  */
    /* JADX WARN: Code duplicated, block: B:63:0x01fe  */
    /* JADX WARN: Code duplicated, block: B:64:0x0209  */
    /* JADX WARN: Code duplicated, block: B:66:0x021f  */
    /* JADX WARN: Code duplicated, block: B:67:0x0223  */
    /* JADX WARN: Code duplicated, block: B:75:0x014c A[SYNTHETIC] */
    /* JADX WARN: Multi-variable type inference failed */
    /*  JADX ERROR: JadxRuntimeException in pass: IfRegionVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r10v10 java.lang.Object, still in use, count: 2, list:
          (r10v10 java.lang.Object) from 0x0116: PHI (r10 I:Object) = (r10v5 java.lang.Object), (r10v10 java.lang.Object) binds: [B:16:0x0115, B:73:0x0116] A[DONT_GENERATE, DONT_INLINE]
          (r10v10 java.lang.Object) from 0x010a: CHECK_CAST (sw) (r10v10 java.lang.Object)
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
            Method dump skipped, instruction units count: 612
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.f4.invoke(java.lang.Object):java.lang.Object");
    }

    public /* synthetic */ f4(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, int i) {
        this.a = i;
        this.d = obj;
        this.e = obj2;
        this.b = obj3;
        this.c = obj4;
        this.g = obj5;
        this.h = obj6;
    }

    public /* synthetic */ f4(List list, MutableState mutableState, MutableState mutableState2, FocusRequester focusRequester, Function1 function1, MutableState mutableState3) {
        this.a = 5;
        this.d = list;
        this.b = mutableState;
        this.c = mutableState2;
        this.e = focusRequester;
        this.h = function1;
        this.g = mutableState3;
    }

    public /* synthetic */ f4(List list, Integer num, DanmakuMemory danmakuMemory, MutableState mutableState, MutableState mutableState2, MutableState mutableState3) {
        this.a = 3;
        this.d = list;
        this.e = num;
        this.h = danmakuMemory;
        this.b = mutableState;
        this.c = mutableState2;
        this.g = mutableState3;
    }

    public /* synthetic */ f4(Function0 function0, List list, Context context, Function1 function1, MutableState mutableState, MutableState mutableState2) {
        this.a = 1;
        this.d = function0;
        this.e = list;
        this.g = context;
        this.h = function1;
        this.b = mutableState;
        this.c = mutableState2;
    }
}
