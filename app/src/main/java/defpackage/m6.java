package defpackage;

import android.content.Context;
import androidx.compose.runtime.MutableState;
import com.dh.myembyapp.data.ProxyConfig;
import com.dh.myembyapp.data.ProxySettings;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: loaded from: classes4.dex */
public final class m6 extends SuspendLambda implements Function2 {
    public final /* synthetic */ int a;
    public int b;
    public final /* synthetic */ ProxySettings c;
    public final /* synthetic */ ProxyConfig d;
    public final /* synthetic */ Context e;
    public final /* synthetic */ MutableState g;
    public final /* synthetic */ MutableState h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ m6(ProxySettings proxySettings, ProxyConfig proxyConfig, Context context, MutableState mutableState, MutableState mutableState2, Continuation continuation, int i) {
        super(2, continuation);
        this.a = i;
        this.c = proxySettings;
        this.d = proxyConfig;
        this.e = context;
        this.g = mutableState;
        this.h = mutableState2;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        switch (this.a) {
            case 0:
                return new m6(this.c, this.d, this.e, this.g, this.h, continuation, 0);
            case 1:
                return new m6(this.c, this.d, this.e, this.g, this.h, continuation, 1);
            default:
                return new m6(this.c, this.d, this.e, this.g, this.h, continuation, 2);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        CoroutineScope coroutineScope = (CoroutineScope) obj;
        Continuation continuation = (Continuation) obj2;
        switch (this.a) {
            case 0:
                break;
            case 1:
                break;
        }
        return ((m6) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        int i = this.a;
        MutableState mutableState = this.g;
        MutableState mutableState2 = this.h;
        Context context = this.e;
        ProxySettings proxySettings = this.c;
        ProxyConfig proxyConfig = this.d;
        switch (i) {
            case 0:
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i2 = this.b;
                if (i2 == 0) {
                    ResultKt.throwOnFailure(obj);
                    this.b = 1;
                    if (proxySettings.saveProxyConfig(proxyConfig, this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i2 != 1) {
                        rd1.o("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    ResultKt.throwOnFailure(obj);
                }
                context.getClass();
                proxyConfig.getClass();
                lr1.a(proxyConfig);
                float f = f7.a;
                float f2 = f7.a;
                mutableState.setValue(Boolean.FALSE);
                Unit unit = Unit.INSTANCE;
                mutableState2.setValue(Boolean.TRUE);
                return Unit.INSTANCE;
            case 1:
                Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i3 = this.b;
                if (i3 == 0) {
                    ResultKt.throwOnFailure(obj);
                    this.b = 1;
                    if (proxySettings.saveProxyConfig(proxyConfig, this) == coroutine_suspended2) {
                        return coroutine_suspended2;
                    }
                } else {
                    if (i3 != 1) {
                        rd1.o("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    ResultKt.throwOnFailure(obj);
                }
                context.getClass();
                proxyConfig.getClass();
                lr1.a(proxyConfig);
                mutableState.setValue(Boolean.FALSE);
                Unit unit2 = Unit.INSTANCE;
                mutableState2.setValue(Boolean.TRUE);
                return Unit.INSTANCE;
            default:
                Object coroutine_suspended3 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i4 = this.b;
                if (i4 == 0) {
                    ResultKt.throwOnFailure(obj);
                    this.b = 1;
                    if (proxySettings.saveProxyConfig(proxyConfig, this) == coroutine_suspended3) {
                        return coroutine_suspended3;
                    }
                } else {
                    if (i4 != 1) {
                        rd1.o("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    ResultKt.throwOnFailure(obj);
                }
                context.getClass();
                proxyConfig.getClass();
                lr1.a(proxyConfig);
                mutableState.setValue(Boolean.FALSE);
                Unit unit3 = Unit.INSTANCE;
                mutableState2.setValue(Boolean.TRUE);
                return Unit.INSTANCE;
        }
    }
}
