package defpackage;

import androidx.compose.runtime.MutableState;
import androidx.compose.ui.focus.FocusRequester;
import java.util.List;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: loaded from: classes4.dex */
public final class dy0 extends SuspendLambda implements Function2 {
    public FocusRequester a;
    public int b;
    public int c;
    public int d;
    public int e;
    public int g;
    public /* synthetic */ Object h;
    public final /* synthetic */ String i;
    public final /* synthetic */ List j;
    public final /* synthetic */ FocusRequester k;
    public final /* synthetic */ String l;
    public final /* synthetic */ FocusRequester m;
    public final /* synthetic */ FocusRequester n;
    public final /* synthetic */ MutableState o;
    public final /* synthetic */ MutableState p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dy0(String str, List list, FocusRequester focusRequester, String str2, FocusRequester focusRequester2, FocusRequester focusRequester3, MutableState mutableState, MutableState mutableState2, Continuation continuation) {
        super(2, continuation);
        this.i = str;
        this.j = list;
        this.k = focusRequester;
        this.l = str2;
        this.m = focusRequester2;
        this.n = focusRequester3;
        this.o = mutableState;
        this.p = mutableState2;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        dy0 dy0Var = new dy0(this.i, this.j, this.k, this.l, this.m, this.n, this.o, this.p, continuation);
        dy0Var.h = obj;
        return dy0Var;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((dy0) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code duplicated, block: B:20:0x0069  */
    /* JADX WARN: Code duplicated, block: B:23:0x0084  */
    /* JADX WARN: Code duplicated, block: B:31:0x00bc  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:31:0x00bc -> B:32:0x00be). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object r21) {
        /*
            Method dump skipped, instruction units count: 432
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.dy0.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
