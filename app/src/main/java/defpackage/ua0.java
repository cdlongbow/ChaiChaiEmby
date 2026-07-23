package defpackage;

import android.content.Context;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: loaded from: classes4.dex */
public final class ua0 extends SuspendLambda implements Function2 {
    public Object a;
    public Object b;
    public Object c;
    public int d;
    public final /* synthetic */ va0 e;
    public final /* synthetic */ boolean g;
    public final /* synthetic */ String h;
    public final /* synthetic */ boolean i;
    public final /* synthetic */ Context j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ua0(va0 va0Var, boolean z, String str, boolean z2, Context context, Continuation continuation) {
        super(2, continuation);
        this.e = va0Var;
        this.g = z;
        this.h = str;
        this.i = z2;
        this.j = context;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new ua0(this.e, this.g, this.h, this.i, this.j, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((ua0) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code duplicated, block: B:42:0x0096 A[PHI: r5
      0x0096: PHI (r5v2 java.lang.Object) = (r5v1 java.lang.Object), (r5v4 java.lang.Object) binds: [B:40:0x0093, B:37:0x0086] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x00ea, code lost:
    
        if (defpackage.va0.e(r0, r4, r2, r10, r2, r5, r6, r20) == r8) goto L51;
     */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r21) {
        /*
            Method dump skipped, instruction units count: 296
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ua0.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
