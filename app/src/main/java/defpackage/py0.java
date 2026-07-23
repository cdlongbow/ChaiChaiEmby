package defpackage;

import androidx.compose.foundation.lazy.LazyListState;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.snapshots.SnapshotStateMap;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: loaded from: classes4.dex */
public final class py0 extends SuspendLambda implements Function2 {
    public final /* synthetic */ int a;
    public Object b;
    public int c;
    public int d;
    public final /* synthetic */ LazyListState e;
    public final /* synthetic */ SnapshotStateMap g;
    public final /* synthetic */ SnapshotStateMap h;
    public final /* synthetic */ MutableState i;
    public final /* synthetic */ MutableState j;
    public final /* synthetic */ MutableState k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ py0(LazyListState lazyListState, SnapshotStateMap snapshotStateMap, SnapshotStateMap snapshotStateMap2, MutableState mutableState, MutableState mutableState2, MutableState mutableState3, Continuation continuation, int i) {
        super(2, continuation);
        this.a = i;
        this.e = lazyListState;
        this.g = snapshotStateMap;
        this.h = snapshotStateMap2;
        this.i = mutableState;
        this.j = mutableState2;
        this.k = mutableState3;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        switch (this.a) {
            case 0:
                return new py0(this.e, this.g, this.h, this.i, this.j, this.k, continuation, 0);
            default:
                return new py0(this.e, this.g, this.h, this.i, this.j, this.k, continuation, 1);
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
        return ((py0) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code duplicated, block: B:22:0x0072  */
    /* JADX WARN: Code duplicated, block: B:25:0x0085  */
    /* JADX WARN: Code duplicated, block: B:49:0x00fe  */
    /* JADX WARN: Code duplicated, block: B:52:0x0111  */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x009c, code lost:
    
        if (defpackage.xy1.e(r1, r8, r7, r2, r15) == r13) goto L28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x0128, code lost:
    
        if (defpackage.sy0.e(r1, r8, r7, r2, r15) == r13) goto L55;
     */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r16) {
        /*
            Method dump skipped, instruction units count: 312
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.py0.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
