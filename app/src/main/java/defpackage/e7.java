package defpackage;

import androidx.compose.foundation.lazy.LazyListState;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: loaded from: classes4.dex */
public final class e7 extends SuspendLambda implements Function2 {
    public final /* synthetic */ int a;
    public int b;
    public final /* synthetic */ LazyListState c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ e7(LazyListState lazyListState, int i, Continuation continuation) {
        super(2, continuation);
        this.a = i;
        this.c = lazyListState;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        switch (this.a) {
            case 0:
                return new e7(this.c, 0, continuation);
            case 1:
                return new e7(this.c, 1, continuation);
            case 2:
                return new e7(this.c, 2, continuation);
            default:
                return new e7(this.c, 3, continuation);
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
        }
        return ((e7) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x004a, code lost:
    
        if (r3.scrollToItem(0, 0, r8) == r0) goto L20;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x008e, code lost:
    
        if (r3.scrollToItem(0, 0, r8) == r0) goto L39;
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x00d2, code lost:
    
        if (r3.scrollToItem(0, 0, r8) == r0) goto L58;
     */
    /* JADX WARN: Code restructure failed: missing block: B:76:0x0115, code lost:
    
        if (r3.scrollToItem(0, 0, r8) == r0) goto L77;
     */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r9) {
        /*
            Method dump skipped, instruction units count: 294
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.e7.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
