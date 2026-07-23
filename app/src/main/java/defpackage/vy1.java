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
public final class vy1 extends SuspendLambda implements Function2 {
    public Object a;
    public MutableState b;
    public int c;
    public int d;
    public final /* synthetic */ String e;
    public final /* synthetic */ LazyListState g;
    public final /* synthetic */ SnapshotStateMap h;
    public final /* synthetic */ SnapshotStateMap i;
    public final /* synthetic */ MutableState j;
    public final /* synthetic */ MutableState k;
    public final /* synthetic */ MutableState l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public vy1(String str, LazyListState lazyListState, SnapshotStateMap snapshotStateMap, SnapshotStateMap snapshotStateMap2, MutableState mutableState, MutableState mutableState2, MutableState mutableState3, Continuation continuation) {
        super(2, continuation);
        this.e = str;
        this.g = lazyListState;
        this.h = snapshotStateMap;
        this.i = snapshotStateMap2;
        this.j = mutableState;
        this.k = mutableState2;
        this.l = mutableState3;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new vy1(this.e, this.g, this.h, this.i, this.j, this.k, this.l, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((vy1) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code restructure failed: missing block: B:55:0x0111, code lost:
    
        if (r0 == r6) goto L56;
     */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r15) {
        /*
            Method dump skipped, instruction units count: 287
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.vy1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
