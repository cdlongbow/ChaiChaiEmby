package defpackage;

import androidx.datastore.preferences.core.MutablePreferences;
import androidx.datastore.preferences.core.Preferences;
import com.dh.myembyapp.dlna.DlnaConfig;
import com.dh.myembyapp.dlna.DlnaSettings;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes4.dex */
public final class rb0 extends SuspendLambda implements Function2 {
    public /* synthetic */ Object a;
    public final /* synthetic */ DlnaConfig b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public rb0(DlnaConfig dlnaConfig, Continuation continuation) {
        super(2, continuation);
        this.b = dlnaConfig;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        rb0 rb0Var = new rb0(this.b, continuation);
        rb0Var.a = obj;
        return rb0Var;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((rb0) create((MutablePreferences) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        MutablePreferences mutablePreferences = (MutablePreferences) this.a;
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        ResultKt.throwOnFailure(obj);
        Preferences.Key key = DlnaSettings.KEY_ENABLED;
        DlnaConfig dlnaConfig = this.b;
        mutablePreferences.set(key, Boxing.boxBoolean(dlnaConfig.getEnabled()));
        mutablePreferences.set(DlnaSettings.KEY_DEVICE_NAME, dlnaConfig.getDeviceName());
        mutablePreferences.set(DlnaSettings.KEY_AUTO_PLAY, Boxing.boxBoolean(dlnaConfig.getAutoPlay()));
        mutablePreferences.set(DlnaSettings.KEY_USE_PROXY_DEFAULT, Boxing.boxBoolean(dlnaConfig.getUseProxyByDefault()));
        mutablePreferences.set(DlnaSettings.KEY_TRUST_ALL_CERTS, Boxing.boxBoolean(dlnaConfig.getTrustAllCerts()));
        return Unit.INSTANCE;
    }
}
