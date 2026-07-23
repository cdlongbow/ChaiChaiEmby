package defpackage;

import androidx.compose.runtime.MutableState;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes4.dex */
public final class j6 extends SuspendLambda implements Function2 {
    public final /* synthetic */ int a;
    public int b;
    public /* synthetic */ Object c;
    public final /* synthetic */ y32 d;
    public final /* synthetic */ MutableState e;
    public final /* synthetic */ MutableState g;
    public final /* synthetic */ MutableState h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ j6(y32 y32Var, MutableState mutableState, MutableState mutableState2, MutableState mutableState3, Continuation continuation, int i) {
        super(2, continuation);
        this.a = i;
        this.d = y32Var;
        this.e = mutableState;
        this.g = mutableState2;
        this.h = mutableState3;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        switch (this.a) {
            case 0:
                j6 j6Var = new j6(this.d, this.e, this.g, this.h, continuation, 0);
                j6Var.c = obj;
                return j6Var;
            case 1:
                j6 j6Var2 = new j6(this.d, this.e, this.g, this.h, continuation, 1);
                j6Var2.c = obj;
                return j6Var2;
            default:
                j6 j6Var3 = new j6(this.d, this.e, this.g, this.h, continuation, 2);
                j6Var3.c = obj;
                return j6Var3;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        o32 o32Var = (o32) obj;
        Continuation continuation = (Continuation) obj2;
        switch (this.a) {
            case 0:
                break;
            case 1:
                break;
        }
        return ((j6) create(o32Var, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x0049, code lost:
    
        if (r9.b(r13, r12) == r10) goto L16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x009d, code lost:
    
        if (r9.b(r13, r12) == r10) goto L31;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x00f1, code lost:
    
        if (r9.b(r13, r12) == r10) goto L46;
     */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r13) {
        /*
            Method dump skipped, instruction units count: 276
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.j6.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
