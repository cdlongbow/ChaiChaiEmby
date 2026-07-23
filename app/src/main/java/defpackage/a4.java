package defpackage;

import com.dh.myembyapp.data.model.ServerConfig;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: loaded from: classes4.dex */
public final class a4 extends SuspendLambda implements Function2 {
    public Object a;
    public Object b;
    public Object c;
    public Object d;
    public Object e;
    public Object g;
    public boolean h;
    public int i;
    public int j;
    public int k;
    public /* synthetic */ Object l;
    public final /* synthetic */ b4 m;
    public final /* synthetic */ ServerConfig n;
    public final /* synthetic */ String o;
    public final /* synthetic */ boolean p;
    public final /* synthetic */ int q;
    public final /* synthetic */ Function2 r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a4(b4 b4Var, ServerConfig serverConfig, String str, boolean z, int i, Function2 function2, Continuation continuation) {
        super(2, continuation);
        this.m = b4Var;
        this.n = serverConfig;
        this.o = str;
        this.p = z;
        this.q = i;
        this.r = function2;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        a4 a4Var = new a4(this.m, this.n, this.o, this.p, this.q, this.r, continuation);
        a4Var.l = obj;
        return a4Var;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((a4) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code duplicated, block: B:70:0x020f  */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x01d2, code lost:
    
        if (r0 == r12) goto L62;
     */
    /* JADX WARN: Instruction removed from duplicated block: B:70:0x020f, please report this as an issue */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r26) {
        /*
            Method dump skipped, instruction units count: 560
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.a4.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
