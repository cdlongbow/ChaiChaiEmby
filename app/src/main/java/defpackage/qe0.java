package defpackage;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: loaded from: classes4.dex */
public final class qe0 extends SuspendLambda implements Function2 {
    public Object a;
    public int b;
    public final /* synthetic */ uf0 c;
    public final /* synthetic */ String d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public qe0(uf0 uf0Var, String str, Continuation continuation) {
        super(2, continuation);
        this.c = uf0Var;
        this.d = str;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new qe0(this.c, this.d, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((qe0) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code duplicated, block: B:53:0x012a A[Catch: Exception -> 0x0076, TRY_LEAVE, TryCatch #1 {Exception -> 0x0076, blocks: (B:35:0x00aa, B:36:0x00ac, B:38:0x00b2, B:40:0x00b8, B:41:0x00ee, B:43:0x00f4, B:45:0x0106, B:47:0x010c, B:48:0x0110, B:50:0x0116, B:51:0x0119, B:52:0x011d, B:53:0x012a, B:21:0x0061, B:23:0x0069, B:25:0x0071, B:30:0x007c, B:32:0x0082, B:18:0x005a), top: B:59:0x005a }] */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x00a7, code lost:
    
        if (r0 == r14) goto L34;
     */
    /* JADX WARN: Instruction removed from duplicated block: B:53:0x012a, please report this as an issue */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r19) {
        /*
            Method dump skipped, instruction units count: 367
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.qe0.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
