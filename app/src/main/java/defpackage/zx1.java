package defpackage;

import androidx.compose.foundation.lazy.grid.LazyGridState;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.State;
import androidx.compose.ui.focus.FocusRequester;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: loaded from: classes4.dex */
public final class zx1 extends SuspendLambda implements Function2 {
    public String a;
    public Object b;
    public int c;
    public int d;
    public /* synthetic */ Object e;
    public final /* synthetic */ boolean g;
    public final /* synthetic */ FocusRequester h;
    public final /* synthetic */ MutableState i;
    public final /* synthetic */ MutableState j;
    public final /* synthetic */ MutableState k;
    public final /* synthetic */ MutableState l;
    public final /* synthetic */ State m;
    public final /* synthetic */ State n;
    public final /* synthetic */ LazyGridState o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zx1(boolean z, FocusRequester focusRequester, MutableState mutableState, MutableState mutableState2, MutableState mutableState3, MutableState mutableState4, State state, State state2, LazyGridState lazyGridState, Continuation continuation) {
        super(2, continuation);
        this.g = z;
        this.h = focusRequester;
        this.i = mutableState;
        this.j = mutableState2;
        this.k = mutableState3;
        this.l = mutableState4;
        this.m = state;
        this.n = state2;
        this.o = lazyGridState;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        zx1 zx1Var = new zx1(this.g, this.h, this.i, this.j, this.k, this.l, this.m, this.n, this.o, continuation);
        zx1Var.e = obj;
        return zx1Var;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((zx1) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code restructure failed: missing block: B:59:0x010a, code lost:
    
        if (kotlinx.coroutines.DelayKt.delay(120, r14) == r7) goto L60;
     */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r15) {
        /*
            Method dump skipped, instruction units count: 292
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.zx1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
