package defpackage;

import androidx.compose.runtime.MutableState;
import androidx.compose.ui.focus.FocusRequester;
import com.dh.myembyapp.data.model.TraktDeviceCodeResponse;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: loaded from: classes4.dex */
public final class eb2 extends SuspendLambda implements Function2 {
    public TraktDeviceCodeResponse a;
    public Object b;
    public long c;
    public long d;
    public long e;
    public int g;
    public /* synthetic */ Object h;
    public final /* synthetic */ xa2 i;
    public final /* synthetic */ Function1 j;
    public final /* synthetic */ MutableState k;
    public final /* synthetic */ MutableState l;
    public final /* synthetic */ MutableState m;
    public final /* synthetic */ MutableState n;
    public final /* synthetic */ MutableState o;
    public final /* synthetic */ MutableState p;
    public final /* synthetic */ MutableState q;
    public final /* synthetic */ MutableState r;
    public final /* synthetic */ MutableState s;
    public final /* synthetic */ MutableState t;
    public final /* synthetic */ MutableState u;
    public final /* synthetic */ FocusRequester v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public eb2(xa2 xa2Var, Function1 function1, MutableState mutableState, MutableState mutableState2, MutableState mutableState3, MutableState mutableState4, MutableState mutableState5, MutableState mutableState6, MutableState mutableState7, MutableState mutableState8, MutableState mutableState9, MutableState mutableState10, MutableState mutableState11, FocusRequester focusRequester, Continuation continuation) {
        super(2, continuation);
        this.i = xa2Var;
        this.j = function1;
        this.k = mutableState;
        this.l = mutableState2;
        this.m = mutableState3;
        this.n = mutableState4;
        this.o = mutableState5;
        this.p = mutableState6;
        this.q = mutableState7;
        this.r = mutableState8;
        this.s = mutableState9;
        this.t = mutableState10;
        this.u = mutableState11;
        this.v = focusRequester;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        eb2 eb2Var = new eb2(this.i, this.j, this.k, this.l, this.m, this.n, this.o, this.p, this.q, this.r, this.s, this.t, this.u, this.v, continuation);
        eb2Var.h = obj;
        return eb2Var;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((eb2) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code duplicated, block: B:13:0x007d A[PHI: r0 r8 r9 r12 r14 r18 r23 r25
      0x007d: PHI (r0v7 com.dh.myembyapp.data.model.TraktDeviceCodeResponse) = (r0v8 com.dh.myembyapp.data.model.TraktDeviceCodeResponse), (r0v26 com.dh.myembyapp.data.model.TraktDeviceCodeResponse) binds: [B:29:0x00f3, B:12:0x006b] A[DONT_GENERATE, DONT_INLINE]
      0x007d: PHI (r8v11 androidx.compose.runtime.MutableState) = (r8v12 androidx.compose.runtime.MutableState), (r8v0 androidx.compose.runtime.MutableState) binds: [B:29:0x00f3, B:12:0x006b] A[DONT_GENERATE, DONT_INLINE]
      0x007d: PHI (r9v15 long) = (r9v21 long), (r9v24 long) binds: [B:29:0x00f3, B:12:0x006b] A[DONT_GENERATE, DONT_INLINE]
      0x007d: PHI (r12v3 long) = (r12v6 long), (r12v11 long) binds: [B:29:0x00f3, B:12:0x006b] A[DONT_GENERATE, DONT_INLINE]
      0x007d: PHI (r14v21 long) = (r14v25 long), (r14v29 long) binds: [B:29:0x00f3, B:12:0x006b] A[DONT_GENERATE, DONT_INLINE]
      0x007d: PHI (r18v3 androidx.compose.runtime.MutableState) = (r18v5 androidx.compose.runtime.MutableState), (r18v9 androidx.compose.runtime.MutableState) binds: [B:29:0x00f3, B:12:0x006b] A[DONT_GENERATE, DONT_INLINE]
      0x007d: PHI (r23v1 long) = (r23v4 long), (r23v8 long) binds: [B:29:0x00f3, B:12:0x006b] A[DONT_GENERATE, DONT_INLINE]
      0x007d: PHI (r25v1 java.lang.String) = (r25v2 java.lang.String), (r25v5 java.lang.String) binds: [B:29:0x00f3, B:12:0x006b] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:25:0x00b9  */
    /* JADX WARN: Code duplicated, block: B:27:0x00c8  */
    /* JADX WARN: Code duplicated, block: B:28:0x00d9  */
    /* JADX WARN: Code duplicated, block: B:34:0x014b  */
    /* JADX WARN: Code duplicated, block: B:37:0x0153  */
    /* JADX WARN: Code duplicated, block: B:40:0x01e8  */
    /* JADX WARN: Code duplicated, block: B:54:0x021d  */
    /* JADX WARN: Code duplicated, block: B:56:0x022d  */
    /* JADX WARN: Code duplicated, block: B:58:0x0235  */
    /* JADX WARN: Code duplicated, block: B:59:0x0243  */
    /* JADX WARN: Code duplicated, block: B:61:0x024b  */
    /* JADX WARN: Code duplicated, block: B:62:0x025b  */
    /* JADX WARN: Code duplicated, block: B:64:0x0265  */
    /* JADX WARN: Code duplicated, block: B:65:0x0276  */
    /* JADX WARN: Code duplicated, block: B:67:0x027e  */
    /* JADX WARN: Code duplicated, block: B:68:0x028f  */
    /* JADX WARN: Code duplicated, block: B:70:0x0293  */
    /* JADX WARN: Code duplicated, block: B:71:0x02a5  */
    /* JADX WARN: Code duplicated, block: B:73:0x02a9  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:40:0x01e8 -> B:8:0x0045). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:58:0x0235 -> B:52:0x0212). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:74:0x02ab -> B:53:0x0216). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object r36) {
        /*
            Method dump skipped, instruction units count: 692
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.eb2.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
