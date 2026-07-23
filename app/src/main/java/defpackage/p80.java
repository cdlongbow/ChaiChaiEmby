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
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: loaded from: classes4.dex */
public final class p80 extends SuspendLambda implements Function2 {
    public final /* synthetic */ MutableState A;
    public String a;
    public FocusRequester b;
    public Object c;
    public MutableState d;
    public ScrollState e;
    public MutableState g;
    public MutableState h;
    public MutableState i;
    public MutableState j;
    public int k;
    public int l;
    public int m;
    public int n;
    public int o;
    public int p;
    public /* synthetic */ Object q;
    public final /* synthetic */ List r;
    public final /* synthetic */ Map s;
    public final /* synthetic */ Function1 t;
    public final /* synthetic */ LazyListState u;
    public final /* synthetic */ MutableState v;
    public final /* synthetic */ MutableState w;
    public final /* synthetic */ MutableState x;
    public final /* synthetic */ MutableState y;
    public final /* synthetic */ ScrollState z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p80(List list, Map map, Function1 function1, LazyListState lazyListState, MutableState mutableState, MutableState mutableState2, MutableState mutableState3, MutableState mutableState4, ScrollState scrollState, MutableState mutableState5, Continuation continuation) {
        super(2, continuation);
        this.r = list;
        this.s = map;
        this.t = function1;
        this.u = lazyListState;
        this.v = mutableState;
        this.w = mutableState2;
        this.x = mutableState3;
        this.y = mutableState4;
        this.z = scrollState;
        this.A = mutableState5;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        p80 p80Var = new p80(this.r, this.s, this.t, this.u, this.v, this.w, this.x, this.y, this.z, this.A, continuation);
        p80Var.q = obj;
        return p80Var;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((p80) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code duplicated, block: B:100:0x0358  */
    /* JADX WARN: Code duplicated, block: B:102:0x0364  */
    /* JADX WARN: Code duplicated, block: B:104:0x0374  */
    /* JADX WARN: Code duplicated, block: B:107:0x037d  */
    /* JADX WARN: Code duplicated, block: B:110:0x03b6  */
    /* JADX WARN: Code duplicated, block: B:142:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:71:0x0241  */
    /* JADX WARN: Code duplicated, block: B:74:0x0277  */
    /* JADX WARN: Code duplicated, block: B:86:0x02e7  */
    /* JADX WARN: Code duplicated, block: B:87:0x02ea  */
    /* JADX WARN: Code duplicated, block: B:90:0x0300  */
    /* JADX WARN: Code duplicated, block: B:91:0x0303  */
    /* JADX WARN: Code duplicated, block: B:94:0x0336  */
    /* JADX WARN: Code duplicated, block: B:95:0x0339  */
    /* JADX WARN: Code duplicated, block: B:98:0x0355  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:110:0x03b6 -> B:10:0x005b). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object r29) {
        /*
            Method dump skipped, instruction units count: 1056
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.p80.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
