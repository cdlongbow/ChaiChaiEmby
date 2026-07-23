package defpackage;

import androidx.compose.foundation.ScrollState;
import androidx.compose.foundation.lazy.LazyListState;
import androidx.compose.ui.focus.FocusRequester;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: loaded from: classes4.dex */
public final class iq extends SuspendLambda implements Function2 {
    public final /* synthetic */ int a = 1;
    public int b;
    public final /* synthetic */ int c;
    public /* synthetic */ Object d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object g;
    public final /* synthetic */ Object h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public iq(int i, ScrollState scrollState, Function1 function1, Function1 function2, Function0 function0, Continuation continuation) {
        super(2, continuation);
        this.c = i;
        this.d = scrollState;
        this.e = function1;
        this.g = function2;
        this.h = function0;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        switch (this.a) {
            case 0:
                iq iqVar = new iq(this.c, (String) this.e, (LazyListState) this.g, (FocusRequester) this.h, continuation);
                iqVar.d = obj;
                return iqVar;
            default:
                return new iq(this.c, (ScrollState) this.d, (Function1) this.e, (Function1) this.g, (Function0) this.h, continuation);
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
        return ((iq) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x0064, code lost:
    
        if (androidx.compose.runtime.MonotonicFrameClockKt.withFrameNanos(r0, r15) == r12) goto L21;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x00c0, code lost:
    
        if (androidx.compose.runtime.MonotonicFrameClockKt.withFrameNanos(r0, r15) == r13) goto L41;
     */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r16) {
        /*
            Method dump skipped, instruction units count: 234
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.iq.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public iq(int i, String str, LazyListState lazyListState, FocusRequester focusRequester, Continuation continuation) {
        super(2, continuation);
        this.c = i;
        this.e = str;
        this.g = lazyListState;
        this.h = focusRequester;
    }
}
