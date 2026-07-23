package defpackage;

import androidx.compose.foundation.lazy.LazyListState;
import androidx.compose.runtime.MutableIntState;
import androidx.compose.runtime.MutableState;
import androidx.compose.ui.focus.FocusRequester;
import com.dh.myembyapp.data.model.MediaItem;
import java.util.List;
import java.util.Map;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: loaded from: classes4.dex */
public final class c80 extends SuspendLambda implements Function2 {
    public String a;
    public FocusRequester b;
    public Object c;
    public MutableState d;
    public MutableIntState e;
    public MutableState g;
    public int h;
    public int i;
    public int j;
    public int k;
    public int l;
    public int m;
    public int n;
    public /* synthetic */ Object o;
    public final /* synthetic */ String p;
    public final /* synthetic */ int q;
    public final /* synthetic */ List r;
    public final /* synthetic */ Map s;
    public final /* synthetic */ MediaItem t;
    public final /* synthetic */ LazyListState u;
    public final /* synthetic */ Function1 v;
    public final /* synthetic */ MutableIntState w;
    public final /* synthetic */ MutableState x;
    public final /* synthetic */ MutableState y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c80(int i, LazyListState lazyListState, MutableIntState mutableIntState, MutableState mutableState, MutableState mutableState2, MediaItem mediaItem, String str, List list, Map map, Continuation continuation, Function1 function1) {
        super(2, continuation);
        this.p = str;
        this.q = i;
        this.r = list;
        this.s = map;
        this.t = mediaItem;
        this.u = lazyListState;
        this.v = function1;
        this.w = mutableIntState;
        this.x = mutableState;
        this.y = mutableState2;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        c80 c80Var = new c80(this.q, this.u, this.w, this.x, this.y, this.t, this.p, this.r, this.s, continuation, this.v);
        c80Var.o = obj;
        return c80Var;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((c80) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code duplicated, block: B:74:0x020d  */
    /* JADX WARN: Code duplicated, block: B:77:0x0246  */
    /* JADX WARN: Code duplicated, block: B:90:0x02ba  */
    /* JADX WARN: Code duplicated, block: B:93:0x02ce  */
    /* JADX WARN: Code duplicated, block: B:95:0x02f7  */
    /* JADX WARN: Code duplicated, block: B:98:0x032e  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:98:0x032e -> B:9:0x0061). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object r29) {
        /*
            Method dump skipped, instruction units count: 896
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.c80.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
