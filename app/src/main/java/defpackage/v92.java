package defpackage;

import com.dh.myembyapp.data.model.MediaItem;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: loaded from: classes4.dex */
public final class v92 extends SuspendLambda implements Function2 {
    public Object a;
    public Long b;
    public Object c;
    public Object d;
    public Object e;
    public int g;
    public final /* synthetic */ xa2 h;
    public final /* synthetic */ Long i;
    public final /* synthetic */ MediaItem j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v92(xa2 xa2Var, Long l, MediaItem mediaItem, Continuation continuation) {
        super(2, continuation);
        this.h = xa2Var;
        this.i = l;
        this.j = mediaItem;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new v92(this.h, this.i, this.j, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((v92) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code duplicated, block: B:75:0x0198 A[ADDED_TO_REGION] */
    /* JADX WARN: Code restructure failed: missing block: B:78:0x01c1, code lost:
    
        if (r0 == r9) goto L79;
     */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r31) {
        /*
            Method dump skipped, instruction units count: 696
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.v92.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
