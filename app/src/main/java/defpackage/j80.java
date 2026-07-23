package defpackage;

import androidx.compose.foundation.ScrollState;
import androidx.compose.foundation.lazy.LazyListState;
import androidx.compose.runtime.MutableState;
import androidx.compose.ui.focus.FocusRequester;
import java.util.List;
import java.util.Map;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: loaded from: classes4.dex */
public final class j80 extends SuspendLambda implements Function2 {
    public String a;
    public FocusRequester b;
    public Object c;
    public ScrollState d;
    public MutableState e;
    public MutableState g;
    public int h;
    public int i;
    public int j;
    public int k;
    public int l;
    public int m;
    public /* synthetic */ Object n;
    public final /* synthetic */ List o;
    public final /* synthetic */ Map p;
    public final /* synthetic */ LazyListState q;
    public final /* synthetic */ MutableState r;
    public final /* synthetic */ MutableState s;
    public final /* synthetic */ ScrollState t;
    public final /* synthetic */ MutableState u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j80(List list, Map map, LazyListState lazyListState, MutableState mutableState, MutableState mutableState2, ScrollState scrollState, MutableState mutableState3, Continuation continuation) {
        super(2, continuation);
        this.o = list;
        this.p = map;
        this.q = lazyListState;
        this.r = mutableState;
        this.s = mutableState2;
        this.t = scrollState;
        this.u = mutableState3;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        j80 j80Var = new j80(this.o, this.p, this.q, this.r, this.s, this.t, this.u, continuation);
        j80Var.n = obj;
        return j80Var;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((j80) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code duplicated, block: B:105:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:106:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:107:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:57:0x0176  */
    /* JADX WARN: Code duplicated, block: B:60:0x019e  */
    /* JADX WARN: Code duplicated, block: B:73:0x01f8  */
    /* JADX WARN: Code duplicated, block: B:75:0x0204  */
    /* JADX WARN: Code duplicated, block: B:76:0x0206  */
    /* JADX WARN: Code duplicated, block: B:80:0x0239  */
    /* JADX WARN: Code duplicated, block: B:83:0x023e  */
    /* JADX WARN: Code duplicated, block: B:86:0x0257  */
    /* JADX WARN: Code duplicated, block: B:88:0x025a  */
    /* JADX WARN: Code duplicated, block: B:91:0x0287  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:91:0x0287 -> B:92:0x028e). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object r24) {
        /*
            Method dump skipped, instruction units count: 671
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.j80.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
