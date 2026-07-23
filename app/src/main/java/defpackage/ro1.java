package defpackage;

import android.content.Context;
import com.dh.myembyapp.data.model.MediaItem;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: loaded from: classes4.dex */
public final class ro1 extends SuspendLambda implements Function2 {
    public Object a;
    public Object b;
    public Object c;
    public int d;
    public final /* synthetic */ io1 e;
    public final /* synthetic */ String g;
    public final /* synthetic */ long h;
    public final /* synthetic */ to1 i;
    public final /* synthetic */ boolean j;
    public final /* synthetic */ Context k;
    public final /* synthetic */ Long l;
    public final /* synthetic */ MediaItem m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ro1(io1 io1Var, String str, long j, to1 to1Var, boolean z, Context context, Long l, MediaItem mediaItem, Continuation continuation) {
        super(2, continuation);
        this.e = io1Var;
        this.g = str;
        this.h = j;
        this.i = to1Var;
        this.j = z;
        this.k = context;
        this.l = l;
        this.m = mediaItem;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new ro1(this.e, this.g, this.h, this.i, this.j, this.k, this.l, this.m, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((ro1) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code restructure failed: missing block: B:39:0x00c0, code lost:
    
        if (defpackage.to1.o(r16.i, r16.k, r16.m, r16.h, r16.l, r0, r16) == r8) goto L69;
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x0117, code lost:
    
        if (defpackage.to1.o(r16.i, r16.k, r16.m, r16.h, r16.l, r0, r16) == r8) goto L69;
     */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r17) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 351
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ro1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
