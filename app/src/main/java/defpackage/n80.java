package defpackage;

import androidx.compose.foundation.lazy.LazyListState;
import androidx.compose.runtime.MutableIntState;
import androidx.compose.runtime.MutableState;
import androidx.compose.ui.focus.FocusRequester;
import com.dh.myembyapp.data.model.MediaItem;
import java.util.List;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: loaded from: classes4.dex */
public final class n80 extends SuspendLambda implements Function2 {
    public Object a;
    public String b;
    public Object c;
    public MutableState d;
    public MutableIntState e;
    public int g;
    public int h;
    public int i;
    public int j;
    public int k;
    public /* synthetic */ Object l;
    public final /* synthetic */ boolean m;
    public final /* synthetic */ List n;
    public final /* synthetic */ LazyListState o;
    public final /* synthetic */ MediaItem p;
    public final /* synthetic */ MutableIntState q;
    public final /* synthetic */ MutableState r;
    public final /* synthetic */ FocusRequester s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n80(boolean z, List list, LazyListState lazyListState, MediaItem mediaItem, MutableIntState mutableIntState, MutableState mutableState, FocusRequester focusRequester, Continuation continuation) {
        super(2, continuation);
        this.m = z;
        this.n = list;
        this.o = lazyListState;
        this.p = mediaItem;
        this.q = mutableIntState;
        this.r = mutableState;
        this.s = focusRequester;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        n80 n80Var = new n80(this.m, this.n, this.o, this.p, this.q, this.r, this.s, continuation);
        n80Var.l = obj;
        return n80Var;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((n80) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code duplicated, block: B:41:0x011a  */
    /* JADX WARN: Code duplicated, block: B:44:0x0143  */
    /* JADX WARN: Code duplicated, block: B:52:0x018d  */
    /* JADX WARN: Code duplicated, block: B:55:0x01a1  */
    /* JADX WARN: Code duplicated, block: B:57:0x01a7  */
    /* JADX WARN: Code duplicated, block: B:60:0x01d2  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:60:0x01d2 -> B:61:0x01d6). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object r22) {
        /*
            Method dump skipped, instruction units count: 516
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.n80.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
