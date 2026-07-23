package defpackage;

import androidx.compose.runtime.MutableState;
import com.dh.myembyapp.data.ProxyConfig;
import com.dh.myembyapp.data.ProxyProtocol;
import com.dh.myembyapp.server.ProxyConfigServerManager;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.text.StringsKt;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: loaded from: classes4.dex */
public final class er1 extends SuspendLambda implements Function2 {
    public final /* synthetic */ ProxyConfigServerManager a;
    public final /* synthetic */ MutableState b;
    public final /* synthetic */ MutableState c;
    public final /* synthetic */ MutableState d;
    public final /* synthetic */ MutableState e;
    public final /* synthetic */ MutableState g;
    public final /* synthetic */ MutableState h;
    public final /* synthetic */ MutableState i;
    public final /* synthetic */ MutableState j;
    public final /* synthetic */ MutableState k;
    public final /* synthetic */ MutableState l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public er1(ProxyConfigServerManager proxyConfigServerManager, MutableState mutableState, MutableState mutableState2, MutableState mutableState3, MutableState mutableState4, MutableState mutableState5, MutableState mutableState6, MutableState mutableState7, MutableState mutableState8, MutableState mutableState9, MutableState mutableState10, Continuation continuation) {
        super(2, continuation);
        this.a = proxyConfigServerManager;
        this.b = mutableState;
        this.c = mutableState2;
        this.d = mutableState3;
        this.e = mutableState4;
        this.g = mutableState5;
        this.h = mutableState6;
        this.i = mutableState7;
        this.j = mutableState8;
        this.k = mutableState9;
        this.l = mutableState10;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new er1(this.a, this.b, this.c, this.d, this.e, this.g, this.h, this.i, this.j, this.k, this.l, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((er1) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        ResultKt.throwOnFailure(obj);
        boolean zD = gr1.d(this.b);
        ProxyProtocol proxyProtocol = (ProxyProtocol) this.c.getValue();
        String str = (String) this.d.getValue();
        Integer intOrNull = StringsKt.toIntOrNull((String) this.e.getValue());
        String strStartServer = this.a.startServer(new ProxyConfig(zD, proxyProtocol, str, intOrNull != null ? intOrNull.intValue() : 7890, (String) this.g.getValue(), (String) this.h.getValue(), gr1.e(this.i)), new s21(this.b, this.c, this.d, this.e, this.g, this.h, this.i, this.j));
        MutableState mutableState = this.k;
        mutableState.setValue(strStartServer);
        String str2 = (String) mutableState.getValue();
        this.l.setValue(Boolean.valueOf(str2 == null || StringsKt.isBlank(str2)));
        return Unit.INSTANCE;
    }
}
