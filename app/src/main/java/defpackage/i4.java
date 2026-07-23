package defpackage;

import android.content.Context;
import androidx.compose.runtime.MutableState;
import com.dh.myembyapp.data.ProxyConfig;
import com.dh.myembyapp.data.ProxySettings;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class i4 implements Function1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ CoroutineScope b;
    public final /* synthetic */ ProxySettings c;
    public final /* synthetic */ Context d;
    public final /* synthetic */ MutableState e;
    public final /* synthetic */ MutableState g;

    public /* synthetic */ i4(CoroutineScope coroutineScope, ProxySettings proxySettings, Context context, MutableState mutableState, MutableState mutableState2, int i) {
        this.a = i;
        this.b = coroutineScope;
        this.c = proxySettings;
        this.d = context;
        this.e = mutableState;
        this.g = mutableState2;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.a) {
            case 0:
                ProxyConfig proxyConfig = (ProxyConfig) obj;
                proxyConfig.getClass();
                BuildersKt__Builders_commonKt.launch$default(this.b, null, null, new m6(this.c, proxyConfig, this.d, this.e, this.g, null, 0), 3, null);
                break;
            case 1:
                ProxyConfig proxyConfig2 = (ProxyConfig) obj;
                proxyConfig2.getClass();
                BuildersKt__Builders_commonKt.launch$default(this.b, null, null, new m6(this.c, proxyConfig2, this.d, this.e, this.g, null, 1), 3, null);
                break;
            default:
                ProxyConfig proxyConfig3 = (ProxyConfig) obj;
                proxyConfig3.getClass();
                BuildersKt__Builders_commonKt.launch$default(this.b, null, null, new m6(this.c, proxyConfig3, this.d, this.e, this.g, null, 2), 3, null);
                break;
        }
        return Unit.INSTANCE;
    }
}
