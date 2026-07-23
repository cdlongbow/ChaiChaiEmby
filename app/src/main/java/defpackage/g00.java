package defpackage;

import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.State;
import androidx.media3.common.Player;

import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: loaded from: classes4.dex */
public final class g00 extends SuspendLambda implements Function2 {
    public up1 a;
    public Object b;
    public Object c;
    public DanmakuPlayer d;
    public Iterator e;
    public Object g;
    public List h;
    public long i;
    public int j;
    public int k;
    public final /* synthetic */ DanmakuPlayer l;
    public final /* synthetic */ Player m;
    public final /* synthetic */ MutableState n;
    public final /* synthetic */ MutableState o;
    public final /* synthetic */ State p;
    public final /* synthetic */ State q;
    public final /* synthetic */ State r;
    public final /* synthetic */ State s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g00(DanmakuPlayer danmakuPlayer, Player player, MutableState mutableState, MutableState mutableState2, State state, State state2, State state3, State state4, Continuation continuation) {
        super(2, continuation);
        this.l = danmakuPlayer;
        this.m = player;
        this.n = mutableState;
        this.o = mutableState2;
        this.p = state;
        this.q = state2;
        this.r = state3;
        this.s = state4;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new g00(this.l, this.m, this.n, this.o, this.p, this.q, this.r, this.s, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((g00) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code duplicated, block: B:24:0x0127  */
    /* JADX WARN: Code duplicated, block: B:26:0x0138  */
    /* JADX WARN: Code duplicated, block: B:28:0x013b  */
    /* JADX WARN: Code duplicated, block: B:30:0x0145  */
    /* JADX WARN: Code duplicated, block: B:33:0x016f  */
    /* JADX WARN: Code duplicated, block: B:35:0x0172  */
    /* JADX WARN: Code duplicated, block: B:39:0x017f A[LOOP:0: B:37:0x0179->B:39:0x017f, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:46:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:33:0x016f -> B:34:0x0170). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:35:0x0172 -> B:36:0x0175). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object r19) {
        /*
            Method dump skipped, instruction units count: 408
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.g00.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
