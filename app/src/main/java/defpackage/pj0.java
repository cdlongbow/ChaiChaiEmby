package defpackage;

import androidx.compose.foundation.lazy.LazyListState;
import androidx.compose.runtime.MutableState;
import androidx.compose.ui.focus.FocusRequester;
import java.util.List;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: loaded from: classes4.dex */
public final class pj0 extends SuspendLambda implements Function2 {
    public Object a;
    public FocusRequester b;
    public int c;
    public int d;
    public int e;
    public int g;
    public int h;
    public int i;
    public /* synthetic */ Object j;
    public final /* synthetic */ int k;
    public final /* synthetic */ String l;
    public final /* synthetic */ String m;
    public final /* synthetic */ List n;
    public final /* synthetic */ String o;
    public final /* synthetic */ LazyListState p;
    public final /* synthetic */ FocusRequester q;
    public final /* synthetic */ FocusRequester r;
    public final /* synthetic */ MutableState s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public pj0(int i, String str, String str2, List list, String str3, LazyListState lazyListState, FocusRequester focusRequester, FocusRequester focusRequester2, MutableState mutableState, Continuation continuation) {
        super(2, continuation);
        this.k = i;
        this.l = str;
        this.m = str2;
        this.n = list;
        this.o = str3;
        this.p = lazyListState;
        this.q = focusRequester;
        this.r = focusRequester2;
        this.s = mutableState;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        pj0 pj0Var = new pj0(this.k, this.l, this.m, this.n, this.o, this.p, this.q, this.r, this.s, continuation);
        pj0Var.j = obj;
        return pj0Var;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((pj0) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code duplicated, block: B:108:0x0139 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:81:0x016a A[Catch: all -> 0x012b, Exception -> 0x012e, TRY_ENTER, TryCatch #0 {Exception -> 0x012e, blocks: (B:76:0x0159, B:78:0x015f, B:81:0x016a, B:84:0x0172, B:85:0x0175, B:89:0x019e, B:75:0x014f, B:59:0x0128, B:64:0x0131), top: B:103:0x001a }] */
    /* JADX WARN: Code duplicated, block: B:83:0x0170 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:87:0x0198  */
    /* JADX WARN: Code duplicated, block: B:88:0x0199  */
    /* JADX WARN: Code duplicated, block: B:92:0x01c2  */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object r19) {
        /*
            Method dump skipped, instruction units count: 477
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.pj0.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
