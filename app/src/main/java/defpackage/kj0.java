package defpackage;

import androidx.compose.foundation.lazy.grid.LazyGridState;
import androidx.compose.runtime.MutableState;
import androidx.compose.ui.focus.FocusRequester;
import java.util.List;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: loaded from: classes4.dex */
public final class kj0 extends SuspendLambda implements Function2 {
    public Object a;
    public MutableState b;
    public MutableState c;
    public MutableState d;
    public int e;
    public int g;
    public int h;
    public int i;
    public int j;
    public int k;
    public /* synthetic */ Object l;
    public final /* synthetic */ boolean m;
    public final /* synthetic */ String n;
    public final /* synthetic */ List o;
    public final /* synthetic */ LazyGridState p;
    public final /* synthetic */ MutableState q;
    public final /* synthetic */ MutableState r;
    public final /* synthetic */ MutableState s;
    public final /* synthetic */ FocusRequester t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public kj0(boolean z, String str, List list, LazyGridState lazyGridState, MutableState mutableState, MutableState mutableState2, MutableState mutableState3, FocusRequester focusRequester, Continuation continuation) {
        super(2, continuation);
        this.m = z;
        this.n = str;
        this.o = list;
        this.p = lazyGridState;
        this.q = mutableState;
        this.r = mutableState2;
        this.s = mutableState3;
        this.t = focusRequester;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        kj0 kj0Var = new kj0(this.m, this.n, this.o, this.p, this.q, this.r, this.s, this.t, continuation);
        kj0Var.l = obj;
        return kj0Var;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((kj0) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code duplicated, block: B:47:0x0113 A[PHI: r0
      0x0113: PHI (r0v17 int) = (r0v15 int), (r0v18 int) binds: [B:45:0x010f, B:11:0x0076] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:58:0x0151  */
    /* JADX WARN: Code duplicated, block: B:64:0x0182  */
    /* JADX WARN: Code duplicated, block: B:68:0x01b0  */
    /* JADX WARN: Code duplicated, block: B:71:0x01c2  */
    /* JADX WARN: Code duplicated, block: B:74:0x01e3  */
    /* JADX WARN: Code duplicated, block: B:77:0x01f1  */
    /* JADX WARN: Code duplicated, block: B:87:0x012f A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:68:0x01b0 -> B:69:0x01b6). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object r18) {
        /*
            Method dump skipped, instruction units count: 576
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.kj0.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
