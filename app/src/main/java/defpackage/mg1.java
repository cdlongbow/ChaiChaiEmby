package defpackage;

import androidx.compose.runtime.MutableState;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: loaded from: classes4.dex */
public final class mg1 extends SuspendLambda implements Function2 {
    public final /* synthetic */ int a;
    public boolean b;
    public int c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ boolean e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public mg1(int i, MutableState mutableState, Continuation continuation, boolean z, boolean z2) {
        super(2, continuation);
        this.a = 2;
        this.b = z;
        this.e = z2;
        this.c = i;
        this.d = mutableState;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        int i = this.a;
        boolean z = this.e;
        Object obj2 = this.d;
        switch (i) {
            case 0:
                return new mg1((ng1) obj2, z, continuation, 0);
            case 1:
                return new mg1((ng1) obj2, z, continuation, 1);
            default:
                return new mg1(this.c, (MutableState) obj2, continuation, this.b, this.e);
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
        }
        return ((mg1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code restructure failed: missing block: B:37:0x00b7, code lost:
    
        if (r3.saveDv7CompatibilityEnabled(r9, r17) == r15) goto L38;
     */
    /* JADX WARN: Code restructure failed: missing block: B:76:0x0180, code lost:
    
        if (r3.saveAudioPassthroughPriorityEnabled(r9, r17) == r14) goto L77;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v0, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r2v1 */
    /* JADX WARN: Type inference failed for: r2v14 */
    /* JADX WARN: Type inference failed for: r2v2, types: [boolean] */
    /* JADX WARN: Type inference failed for: r2v30 */
    /* JADX WARN: Type inference failed for: r2v31 */
    /* JADX WARN: Type inference failed for: r2v6 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r18) {
        /*
            Method dump skipped, instruction units count: 470
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.mg1.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ mg1(ng1 ng1Var, boolean z, Continuation continuation, int i) {
        super(2, continuation);
        this.a = i;
        this.d = ng1Var;
        this.e = z;
    }
}
