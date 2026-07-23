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
public final class a80 extends SuspendLambda implements Function2 {
    public String a;
    public FocusRequester b;
    public Object c;
    public MutableState d;
    public MutableState e;
    public int g;
    public int h;
    public int i;
    public int j;
    public int k;
    public int l;
    public /* synthetic */ Object m;
    public final /* synthetic */ String n;
    public final /* synthetic */ int o;
    public final /* synthetic */ List p;
    public final /* synthetic */ Map q;
    public final /* synthetic */ Function1 r;
    public final /* synthetic */ MediaItem s;
    public final /* synthetic */ LazyListState t;
    public final /* synthetic */ MutableIntState u;
    public final /* synthetic */ MutableState v;
    public final /* synthetic */ MutableState w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a80(int i, LazyListState lazyListState, MutableIntState mutableIntState, MutableState mutableState, MutableState mutableState2, MediaItem mediaItem, String str, List list, Map map, Continuation continuation, Function1 function1) {
        super(2, continuation);
        this.n = str;
        this.o = i;
        this.p = list;
        this.q = map;
        this.r = function1;
        this.s = mediaItem;
        this.t = lazyListState;
        this.u = mutableIntState;
        this.v = mutableState;
        this.w = mutableState2;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        a80 a80Var = new a80(this.o, this.t, this.u, this.v, this.w, this.s, this.n, this.p, this.q, continuation, this.r);
        a80Var.m = obj;
        return a80Var;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((a80) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code duplicated, block: B:101:0x0287  */
    /* JADX WARN: Code duplicated, block: B:128:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:129:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:77:0x019b  */
    /* JADX WARN: Code duplicated, block: B:80:0x01c3  */
    /* JADX WARN: Code duplicated, block: B:93:0x0221  */
    /* JADX WARN: Code duplicated, block: B:96:0x0234  */
    /* JADX WARN: Code duplicated, block: B:98:0x025a  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:101:0x0287 -> B:9:0x0042). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object r24) {
        /*
            Method dump skipped, instruction units count: 721
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.a80.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
