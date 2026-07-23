package defpackage;

import androidx.compose.foundation.lazy.LazyListState;
import androidx.compose.ui.focus.FocusRequester;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: loaded from: classes4.dex */
public final class j90 extends SuspendLambda implements Function2 {
    public LazyListState a;
    public FocusRequester b;
    public Object c;
    public int d;
    public int e;
    public int g;
    public int h;
    public int i;
    public int j;
    public /* synthetic */ Object k;
    public final /* synthetic */ LazyListState l;
    public final /* synthetic */ int m;
    public final /* synthetic */ FocusRequester n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j90(LazyListState lazyListState, int i, FocusRequester focusRequester, Continuation continuation) {
        super(2, continuation);
        this.l = lazyListState;
        this.m = i;
        this.n = focusRequester;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        j90 j90Var = new j90(this.l, this.m, this.n, continuation);
        j90Var.k = obj;
        return j90Var;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((j90) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code duplicated, block: B:21:0x0088  */
    /* JADX WARN: Code duplicated, block: B:24:0x00a9  */
    /* JADX WARN: Code duplicated, block: B:26:0x00b1  */
    /* JADX WARN: Code duplicated, block: B:29:0x00d0 A[PHI: r0 r1 r2 r3 r5 r6 r12
      0x00d0: PHI (r0v8 int) = (r0v15 int), (r0v15 int), (r0v35 int) binds: [B:25:0x00af, B:27:0x00cc, B:17:0x0056] A[DONT_GENERATE, DONT_INLINE]
      0x00d0: PHI (r1v5 int) = (r1v12 int), (r1v12 int), (r1v19 int) binds: [B:25:0x00af, B:27:0x00cc, B:17:0x0056] A[DONT_GENERATE, DONT_INLINE]
      0x00d0: PHI (r2v6 int) = (r2v10 int), (r2v10 int), (r2v15 int) binds: [B:25:0x00af, B:27:0x00cc, B:17:0x0056] A[DONT_GENERATE, DONT_INLINE]
      0x00d0: PHI (r3v7 int) = (r3v14 int), (r3v14 int), (r3v20 int) binds: [B:25:0x00af, B:27:0x00cc, B:17:0x0056] A[DONT_GENERATE, DONT_INLINE]
      0x00d0: PHI (r5v6 int) = (r5v11 int), (r5v11 int), (r5v16 int) binds: [B:25:0x00af, B:27:0x00cc, B:17:0x0056] A[DONT_GENERATE, DONT_INLINE]
      0x00d0: PHI (r6v4 androidx.compose.ui.focus.FocusRequester) = 
      (r6v9 androidx.compose.ui.focus.FocusRequester)
      (r6v9 androidx.compose.ui.focus.FocusRequester)
      (r6v15 androidx.compose.ui.focus.FocusRequester)
     binds: [B:25:0x00af, B:27:0x00cc, B:17:0x0056] A[DONT_GENERATE, DONT_INLINE]
      0x00d0: PHI (r12v5 androidx.compose.foundation.lazy.LazyListState) = 
      (r12v9 androidx.compose.foundation.lazy.LazyListState)
      (r12v9 androidx.compose.foundation.lazy.LazyListState)
      (r12v14 androidx.compose.foundation.lazy.LazyListState)
     binds: [B:25:0x00af, B:27:0x00cc, B:17:0x0056] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:35:0x0102  */
    /* JADX WARN: Code duplicated, block: B:48:0x0156  */
    /* JADX WARN: Code duplicated, block: B:60:0x0181  */
    /* JADX WARN: Code duplicated, block: B:62:0x0184  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:48:0x0156 -> B:9:0x002e). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object r20) {
        /*
            Method dump skipped, instruction units count: 405
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.j90.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
