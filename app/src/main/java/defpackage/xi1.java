package defpackage;

import com.dh.myembyapp.data.api.DanmakuApiClient;
import java.security.KeyManagementException;
import java.security.NoSuchAlgorithmException;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: loaded from: classes4.dex */
public final class xi1 extends SuspendLambda implements Function2 {
    public final /* synthetic */ int a;
    public final /* synthetic */ kx b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ xi1(kx kxVar, Continuation continuation, int i) {
        super(2, continuation);
        this.a = i;
        this.b = kxVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        int i = this.a;
        kx kxVar = this.b;
        switch (i) {
            case 0:
                return new xi1(kxVar, continuation, 0);
            default:
                return new xi1(kxVar, continuation, 1);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        CoroutineScope coroutineScope = (CoroutineScope) obj;
        Continuation continuation = (Continuation) obj2;
        switch (this.a) {
            case 0:
                break;
        }
        return ((xi1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws NoSuchAlgorithmException, KeyManagementException {
        int i = this.a;
        kx kxVar = this.b;
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        switch (i) {
            case 0:
                ResultKt.throwOnFailure(obj);
                kxVar.getClass();
                kxVar.c.setValue(new uw());
                break;
            default:
                ResultKt.throwOnFailure(obj);
                if (kxVar.b().getEnabled() && kxVar.b().hasValidApi()) {
                    DanmakuApiClient.INSTANCE.initializeMultiple(kxVar.b().getApiSlotUrls(), kxVar.b().getApiSlotNames(), kxVar.b().getApiUrlsUseProxy());
                }
                break;
        }
        return Unit.INSTANCE;
    }
}
