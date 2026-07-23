package defpackage;

import androidx.compose.foundation.lazy.LazyListState;
import androidx.compose.runtime.MutableState;
import androidx.compose.ui.focus.FocusRequester;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: loaded from: classes4.dex */
public final class qj0 extends SuspendLambda implements Function2 {
    public final /* synthetic */ int a;
    public Object b;
    public int c;
    public /* synthetic */ Object d;
    public final /* synthetic */ MutableState e;
    public final /* synthetic */ LazyListState g;
    public final /* synthetic */ FocusRequester h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ qj0(MutableState mutableState, LazyListState lazyListState, FocusRequester focusRequester, Continuation continuation, int i) {
        super(2, continuation);
        this.a = i;
        this.e = mutableState;
        this.g = lazyListState;
        this.h = focusRequester;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        switch (this.a) {
            case 0:
                qj0 qj0Var = new qj0(this.e, this.g, this.h, continuation, 0);
                qj0Var.d = obj;
                return qj0Var;
            default:
                qj0 qj0Var2 = new qj0(this.e, this.g, this.h, continuation, 1);
                qj0Var2.d = obj;
                return qj0Var2;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        CoroutineScope coroutineScope = (CoroutineScope) obj;
        Continuation continuation = (Continuation) obj2;
        switch (this.a) {
            case 0:
                break;
        }
        return ((qj0) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code restructure failed: missing block: B:27:0x0088, code lost:
    
        if (androidx.compose.runtime.MonotonicFrameClockKt.withFrameNanos(r13, r12) == r10) goto L28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x0119, code lost:
    
        if (androidx.compose.runtime.MonotonicFrameClockKt.withFrameNanos(r13, r12) == r10) goto L59;
     */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r13) {
        /*
            Method dump skipped, instruction units count: 318
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.qj0.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
