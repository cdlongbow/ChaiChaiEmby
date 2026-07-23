package defpackage;

import android.util.Log;
import androidx.datastore.preferences.core.MutablePreferences;
import androidx.datastore.preferences.core.Preferences;
import com.dh.myembyapp.data.ProxyConfig;
import com.dh.myembyapp.data.ProxySettings;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes4.dex */
public final class or1 extends SuspendLambda implements Function2 {
    public /* synthetic */ Object a;
    public final /* synthetic */ ProxyConfig b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public or1(ProxyConfig proxyConfig, Continuation continuation) {
        super(2, continuation);
        this.b = proxyConfig;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        or1 or1Var = new or1(this.b, continuation);
        or1Var.a = obj;
        return or1Var;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((or1) create((MutablePreferences) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        MutablePreferences mutablePreferences = (MutablePreferences) this.a;
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        ResultKt.throwOnFailure(obj);
        Preferences.Key key = ProxySettings.KEY_ENABLED;
        ProxyConfig proxyConfig = this.b;
        mutablePreferences.set(key, Boxing.boxBoolean(proxyConfig.getEnabled()));
        mutablePreferences.set(ProxySettings.KEY_PROTOCOL, proxyConfig.getProtocol().name());
        mutablePreferences.set(ProxySettings.KEY_HOST, proxyConfig.getHost());
        mutablePreferences.set(ProxySettings.KEY_PORT, Boxing.boxInt(proxyConfig.getPort()));
        mutablePreferences.set(ProxySettings.KEY_USERNAME, proxyConfig.getUsername());
        mutablePreferences.set(ProxySettings.KEY_PASSWORD, proxyConfig.getPassword());
        mutablePreferences.set(ProxySettings.KEY_BYPASS_LAN, Boxing.boxBoolean(proxyConfig.getBypassLan()));
        Log.d("ProxySettings", "已写入: enabled=" + proxyConfig.getEnabled() + ", protocol=" + proxyConfig.getProtocol().name() + ", host=" + proxyConfig.getHost() + ", port=" + proxyConfig.getPort() + ", bypassLan=" + proxyConfig.getBypassLan());
        return Unit.INSTANCE;
    }
}
