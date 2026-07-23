package defpackage;

import android.content.Context;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.State;
import androidx.compose.ui.focus.FocusRequester;
import java.util.List;
import java.util.Set;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: loaded from: classes4.dex */
public final class c6 extends SuspendLambda implements Function2 {
    public final /* synthetic */ int a = 3;
    public Object b;
    public int c;
    public boolean d;
    public Object e;
    public Object g;
    public Object h;
    public Object i;
    public final /* synthetic */ Object j;
    public final /* synthetic */ Object k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c6(boolean z, List list, MutableState mutableState, MutableState mutableState2, List list2, zq0 zq0Var, int i, Set set, Context context, Continuation continuation) {
        super(2, continuation);
        this.d = z;
        this.b = list;
        this.e = mutableState;
        this.g = mutableState2;
        this.h = list2;
        this.i = zq0Var;
        this.c = i;
        this.j = set;
        this.k = context;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        int i = this.a;
        Object obj2 = this.k;
        Object obj3 = this.j;
        switch (i) {
            case 0:
                c6 c6Var = new c6(this.d, (MutableState) this.e, (MutableState) this.g, (State) obj3, (MutableState) this.h, (MutableState) this.i, (FocusRequester) obj2, continuation);
                c6Var.b = obj;
                return c6Var;
            case 1:
                return new c6(this.d, (MutableState) this.e, (MutableState) this.g, (MutableState) this.h, (MutableState) this.i, (MutableState) obj3, (MutableState) obj2, continuation);
            case 2:
                return new c6(this.d, (List) this.b, (MutableState) this.e, (MutableState) this.g, (List) this.h, (zq0) this.i, this.c, (Set) obj3, (Context) obj2, continuation);
            case 3:
                return new c6((cz0) obj3, (String) obj2, continuation);
            default:
                return new c6((rw) this.e, (eo1) this.g, this.d, (kx) this.h, (kx) this.i, (kx) obj3, (Context) obj2, continuation);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        CoroutineScope coroutineScope = (CoroutineScope) obj;
        Continuation continuation = (Continuation) obj2;
        switch (this.a) {
            case 0:
                break;
            case 1:
                break;
            case 2:
                break;
            case 3:
                break;
        }
        return ((c6) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code duplicated, block: B:107:0x031f A[Catch: Exception -> 0x0310, TryCatch #0 {Exception -> 0x0310, blocks: (B:105:0x0319, B:107:0x031f, B:111:0x0328, B:115:0x0344, B:130:0x0378, B:134:0x03ea, B:138:0x03f3, B:118:0x034e, B:119:0x0353, B:121:0x0359, B:123:0x0366, B:127:0x0370, B:129:0x0374, B:114:0x0340, B:85:0x026f, B:87:0x0279, B:89:0x027f, B:91:0x028b, B:94:0x0291, B:96:0x0299, B:98:0x02a1, B:81:0x0262), top: B:284:0x0262 }] */
    /* JADX WARN: Code duplicated, block: B:109:0x0325  */
    /* JADX WARN: Code duplicated, block: B:110:0x0327  */
    /* JADX WARN: Code duplicated, block: B:113:0x033f  */
    /* JADX WARN: Code duplicated, block: B:114:0x0340 A[Catch: Exception -> 0x0310, TryCatch #0 {Exception -> 0x0310, blocks: (B:105:0x0319, B:107:0x031f, B:111:0x0328, B:115:0x0344, B:130:0x0378, B:134:0x03ea, B:138:0x03f3, B:118:0x034e, B:119:0x0353, B:121:0x0359, B:123:0x0366, B:127:0x0370, B:129:0x0374, B:114:0x0340, B:85:0x026f, B:87:0x0279, B:89:0x027f, B:91:0x028b, B:94:0x0291, B:96:0x0299, B:98:0x02a1, B:81:0x0262), top: B:284:0x0262 }] */
    /* JADX WARN: Code duplicated, block: B:117:0x034c  */
    /* JADX WARN: Code duplicated, block: B:118:0x034e A[Catch: Exception -> 0x0310, TryCatch #0 {Exception -> 0x0310, blocks: (B:105:0x0319, B:107:0x031f, B:111:0x0328, B:115:0x0344, B:130:0x0378, B:134:0x03ea, B:138:0x03f3, B:118:0x034e, B:119:0x0353, B:121:0x0359, B:123:0x0366, B:127:0x0370, B:129:0x0374, B:114:0x0340, B:85:0x026f, B:87:0x0279, B:89:0x027f, B:91:0x028b, B:94:0x0291, B:96:0x0299, B:98:0x02a1, B:81:0x0262), top: B:284:0x0262 }] */
    /* JADX WARN: Code duplicated, block: B:121:0x0359 A[Catch: Exception -> 0x0310, TryCatch #0 {Exception -> 0x0310, blocks: (B:105:0x0319, B:107:0x031f, B:111:0x0328, B:115:0x0344, B:130:0x0378, B:134:0x03ea, B:138:0x03f3, B:118:0x034e, B:119:0x0353, B:121:0x0359, B:123:0x0366, B:127:0x0370, B:129:0x0374, B:114:0x0340, B:85:0x026f, B:87:0x0279, B:89:0x027f, B:91:0x028b, B:94:0x0291, B:96:0x0299, B:98:0x02a1, B:81:0x0262), top: B:284:0x0262 }] */
    /* JADX WARN: Code duplicated, block: B:123:0x0366 A[Catch: Exception -> 0x0310, TryCatch #0 {Exception -> 0x0310, blocks: (B:105:0x0319, B:107:0x031f, B:111:0x0328, B:115:0x0344, B:130:0x0378, B:134:0x03ea, B:138:0x03f3, B:118:0x034e, B:119:0x0353, B:121:0x0359, B:123:0x0366, B:127:0x0370, B:129:0x0374, B:114:0x0340, B:85:0x026f, B:87:0x0279, B:89:0x027f, B:91:0x028b, B:94:0x0291, B:96:0x0299, B:98:0x02a1, B:81:0x0262), top: B:284:0x0262 }] */
    /* JADX WARN: Code duplicated, block: B:124:0x036b  */
    /* JADX WARN: Code duplicated, block: B:132:0x03e7  */
    /* JADX WARN: Code duplicated, block: B:133:0x03e9  */
    /* JADX WARN: Code duplicated, block: B:136:0x03f0  */
    /* JADX WARN: Code duplicated, block: B:137:0x03f2  */
    /* JADX WARN: Code duplicated, block: B:143:0x03ff A[Catch: Exception -> 0x03fd, TryCatch #1 {Exception -> 0x03fd, blocks: (B:140:0x03f9, B:143:0x03ff, B:145:0x0409, B:148:0x0412, B:152:0x041f), top: B:286:0x031d }] */
    /* JADX WARN: Code duplicated, block: B:145:0x0409 A[Catch: Exception -> 0x03fd, TryCatch #1 {Exception -> 0x03fd, blocks: (B:140:0x03f9, B:143:0x03ff, B:145:0x0409, B:148:0x0412, B:152:0x041f), top: B:286:0x031d }] */
    /* JADX WARN: Code duplicated, block: B:147:0x040f  */
    /* JADX WARN: Code duplicated, block: B:150:0x041c  */
    /* JADX WARN: Code duplicated, block: B:151:0x041e  */
    /* JADX WARN: Code duplicated, block: B:156:0x043d  */
    /* JADX WARN: Code duplicated, block: B:157:0x043f  */
    /* JADX WARN: Code duplicated, block: B:297:0x0370 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:300:0x0353 A[ADDED_TO_REGION, REMOVE, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:313:0x0559 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:315:0x0524 A[SYNTHETIC] */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v4, types: [androidx.compose.runtime.MutableState] */
    /* JADX WARN: Type inference failed for: r1v6, types: [androidx.compose.runtime.MutableState] */
    /* JADX WARN: Type inference failed for: r1v74 */
    /* JADX WARN: Type inference failed for: r1v75 */
    /* JADX WARN: Type inference failed for: r1v9 */
    /* JADX WARN: Type inference failed for: r2v18 */
    /* JADX WARN: Type inference failed for: r2v19, types: [kotlinx.coroutines.flow.MutableStateFlow] */
    /* JADX WARN: Type inference failed for: r2v25 */
    /* JADX WARN: Type inference failed for: r2v47 */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    /*  JADX ERROR: JadxRuntimeException in pass: IfRegionVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r5v18 java.lang.Object, still in use, count: 2, list:
          (r5v18 java.lang.Object) from 0x0555: PHI (r5 I:Object) = (r5v15 java.lang.Object), (r5v18 java.lang.Object) binds: [B:202:0x0554, B:318:0x0555] A[DONT_GENERATE, DONT_INLINE]
          (r5v18 java.lang.Object) from 0x053f: CHECK_CAST (rx0) (r5v18 java.lang.Object)
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
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object r30) {
        /*
            Method dump skipped, instruction units count: 1886
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.c6.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c6(cz0 cz0Var, String str, Continuation continuation) {
        super(2, continuation);
        this.j = cz0Var;
        this.k = str;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c6(boolean z, MutableState mutableState, MutableState mutableState2, MutableState mutableState3, MutableState mutableState4, MutableState mutableState5, MutableState mutableState6, Continuation continuation) {
        super(2, continuation);
        this.d = z;
        this.e = mutableState;
        this.g = mutableState2;
        this.h = mutableState3;
        this.i = mutableState4;
        this.j = mutableState5;
        this.k = mutableState6;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c6(boolean z, MutableState mutableState, MutableState mutableState2, State state, MutableState mutableState3, MutableState mutableState4, FocusRequester focusRequester, Continuation continuation) {
        super(2, continuation);
        this.d = z;
        this.e = mutableState;
        this.g = mutableState2;
        this.j = state;
        this.h = mutableState3;
        this.i = mutableState4;
        this.k = focusRequester;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c6(rw rwVar, eo1 eo1Var, boolean z, kx kxVar, kx kxVar2, kx kxVar3, Context context, Continuation continuation) {
        super(2, continuation);
        this.e = rwVar;
        this.g = eo1Var;
        this.d = z;
        this.h = kxVar;
        this.i = kxVar2;
        this.j = kxVar3;
        this.k = context;
    }
}
