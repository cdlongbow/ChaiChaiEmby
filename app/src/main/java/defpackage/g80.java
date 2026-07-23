package defpackage;

import androidx.compose.foundation.lazy.LazyListState;
import androidx.compose.runtime.MutableState;
import com.dh.myembyapp.data.model.MediaItem;
import java.util.List;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: loaded from: classes4.dex */
public final class g80 extends SuspendLambda implements Function2 {
    public String a;
    public List b;
    public LazyListState c;
    public MutableState d;
    public MutableState e;
    public int g;
    public int h;
    public int i;
    public int j;
    public int k;
    public final /* synthetic */ MediaItem l;
    public final /* synthetic */ String m;
    public final /* synthetic */ List n;
    public final /* synthetic */ MutableState o;
    public final /* synthetic */ MutableState p;
    public final /* synthetic */ s40 q;
    public final /* synthetic */ MutableState r;
    public final /* synthetic */ LazyListState s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g80(MediaItem mediaItem, String str, List list, MutableState mutableState, MutableState mutableState2, s40 s40Var, MutableState mutableState3, LazyListState lazyListState, Continuation continuation) {
        super(2, continuation);
        this.l = mediaItem;
        this.m = str;
        this.n = list;
        this.o = mutableState;
        this.p = mutableState2;
        this.q = s40Var;
        this.r = mutableState3;
        this.s = lazyListState;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new g80(this.l, this.m, this.n, this.o, this.p, this.q, this.r, this.s, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((g80) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code duplicated, block: B:115:0x017b A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:116:0x017c A[EDGE_INSN: B:116:0x017c->B:90:0x017c BREAK  A[LOOP:0: B:83:0x0160->B:88:0x0177], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:85:0x0166  */
    /* JADX WARN: Code duplicated, block: B:88:0x0177 A[LOOP:0: B:83:0x0160->B:88:0x0177, LOOP_END] */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:101:0x01b7 -> B:102:0x01be). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:98:0x01a4 -> B:99:0x01ab). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object r19) {
        /*
            Method dump skipped, instruction units count: 461
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.g80.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
