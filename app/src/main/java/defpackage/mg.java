package defpackage;

import androidx.compose.foundation.lazy.LazyListState;
import androidx.compose.runtime.MutableState;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: loaded from: classes4.dex */
public final class mg extends SuspendLambda implements Function2 {
    public final /* synthetic */ int a;
    public int b;
    public final /* synthetic */ LazyListState c;
    public final /* synthetic */ MutableState d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ mg(LazyListState lazyListState, MutableState mutableState, Continuation continuation, int i) {
        super(2, continuation);
        this.a = i;
        this.c = lazyListState;
        this.d = mutableState;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        int i = this.a;
        MutableState mutableState = this.d;
        LazyListState lazyListState = this.c;
        switch (i) {
            case 0:
                return new mg(lazyListState, mutableState, continuation, 0);
            case 1:
                return new mg(lazyListState, mutableState, continuation, 1);
            case 2:
                return new mg(lazyListState, mutableState, continuation, 2);
            case 3:
                return new mg(lazyListState, mutableState, continuation, 3);
            case 4:
                return new mg(lazyListState, mutableState, continuation, 4);
            case 5:
                return new mg(lazyListState, mutableState, continuation, 5);
            default:
                return new mg(lazyListState, mutableState, continuation, 6);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        CoroutineScope coroutineScope = (CoroutineScope) obj;
        Continuation continuation = (Continuation) obj2;
        switch (this.a) {
            case 0:
                break;
            case 1:
                break;
            case 2:
                break;
            case 3:
                break;
            case 4:
                break;
            case 5:
                break;
        }
        return ((mg) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code restructure failed: missing block: B:51:0x00f1, code lost:
    
        if (r1.scrollToItem(0, 0, r12) == r12) goto L52;
     */
    /* JADX WARN: Code restructure failed: missing block: B:72:0x0142, code lost:
    
        if (r1.scrollToItem(0, 0, r12) == r12) goto L73;
     */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r13) {
        /*
            Method dump skipped, instruction units count: 448
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.mg.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
