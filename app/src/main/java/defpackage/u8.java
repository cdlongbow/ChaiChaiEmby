package defpackage;

import com.dh.myembyapp.data.model.ServerConfig;
import java.util.List;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: loaded from: classes4.dex */
public final class u8 extends SuspendLambda implements Function2 {
    public Object a;
    public Object b;
    public List c;
    public int d;
    public final /* synthetic */ v8 e;
    public final /* synthetic */ ServerConfig g;
    public final /* synthetic */ String h;
    public final /* synthetic */ boolean i;
    public final /* synthetic */ long j;
    public final /* synthetic */ int k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u8(v8 v8Var, ServerConfig serverConfig, String str, boolean z, long j, int i, Continuation continuation) {
        super(2, continuation);
        this.e = v8Var;
        this.g = serverConfig;
        this.h = str;
        this.i = z;
        this.j = j;
        this.k = i;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new u8(this.e, this.g, this.h, this.i, this.j, this.k, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((u8) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code restructure failed: missing block: B:26:0x00e6, code lost:
    
        if (defpackage.v8.a(r0, r1, r10, r3, r5) == r7) goto L27;
     */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r18) {
        /*
            Method dump skipped, instruction units count: 236
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.u8.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
