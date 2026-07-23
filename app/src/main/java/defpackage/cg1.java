package defpackage;

import androidx.compose.runtime.MutableState;
import androidx.compose.ui.focus.FocusRequester;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: loaded from: classes4.dex */
public final class cg1 extends SuspendLambda implements Function2 {
    public Function0 a;
    public FocusRequester b;
    public MutableState c;
    public MutableState d;
    public int e;
    public int g;
    public int h;
    public /* synthetic */ Object i;
    public final /* synthetic */ nv j;
    public final /* synthetic */ wh1 k;
    public final /* synthetic */ FocusRequester l;
    public final /* synthetic */ MutableState m;
    public final /* synthetic */ MutableState n;
    public final /* synthetic */ FocusRequester o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cg1(nv nvVar, wh1 wh1Var, FocusRequester focusRequester, MutableState mutableState, MutableState mutableState2, FocusRequester focusRequester2, Continuation continuation) {
        super(2, continuation);
        this.j = nvVar;
        this.k = wh1Var;
        this.l = focusRequester;
        this.m = mutableState;
        this.n = mutableState2;
        this.o = focusRequester2;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        cg1 cg1Var = new cg1(this.j, this.k, this.l, this.m, this.n, this.o, continuation);
        cg1Var.i = obj;
        return cg1Var;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((cg1) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code duplicated, block: B:27:0x00a8  */
    /* JADX WARN: Code duplicated, block: B:30:0x00b7  */
    /* JADX WARN: Code duplicated, block: B:32:0x00bd  */
    /* JADX WARN: Code duplicated, block: B:59:0x0072 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:27:0x00a8 -> B:28:0x00a9). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:45:0x0111 -> B:46:0x0112). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object r20) {
        /*
            Method dump skipped, instruction units count: 323
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.cg1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
