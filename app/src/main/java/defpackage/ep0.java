package defpackage;

import androidx.compose.foundation.ScrollState;
import androidx.compose.runtime.MutableState;
import java.util.List;
import java.util.Map;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: loaded from: classes4.dex */
public final class ep0 extends SuspendLambda implements Function2 {
    public int a;
    public int b;
    public final /* synthetic */ boolean c;
    public final /* synthetic */ List d;
    public final /* synthetic */ int e;
    public final /* synthetic */ ScrollState g;
    public final /* synthetic */ MutableState h;
    public final /* synthetic */ MutableState i;
    public final /* synthetic */ MutableState j;
    public final /* synthetic */ MutableState k;
    public final /* synthetic */ MutableState l;
    public final /* synthetic */ MutableState m;
    public final /* synthetic */ Map n;
    public final /* synthetic */ zq0 o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ep0(boolean z, List list, int i, ScrollState scrollState, MutableState mutableState, MutableState mutableState2, MutableState mutableState3, MutableState mutableState4, MutableState mutableState5, MutableState mutableState6, Map map, zq0 zq0Var, Continuation continuation) {
        super(2, continuation);
        this.c = z;
        this.d = list;
        this.e = i;
        this.g = scrollState;
        this.h = mutableState;
        this.i = mutableState2;
        this.j = mutableState3;
        this.k = mutableState4;
        this.l = mutableState5;
        this.m = mutableState6;
        this.n = map;
        this.o = zq0Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new ep0(this.c, this.d, this.e, this.g, this.h, this.i, this.j, this.k, this.l, this.m, this.n, this.o, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((ep0) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code duplicated, block: B:27:0x0086  */
    /* JADX WARN: Code duplicated, block: B:41:0x00c9  */
    /* JADX WARN: Code duplicated, block: B:43:0x00e1  */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x00ba, code lost:
    
        if (kotlinx.coroutines.flow.FlowKt.first(r8, r13) == r0) goto L38;
     */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r14) {
        /*
            Method dump skipped, instruction units count: 282
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ep0.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
