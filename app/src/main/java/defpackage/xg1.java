package defpackage;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.ui.focus.FocusRequester;
import androidx.lifecycle.LifecycleOwner;
import com.dh.myembyapp.data.ProxyConfig;
import com.dh.myembyapp.data.model.ServerConfig;
import com.dh.myembyapp.data.model.ServerPingState;
import kotlin.Function;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class xg1 implements Function2 {
    public final /* synthetic */ int a = 0;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ Function0 c;
    public final /* synthetic */ Function0 d;
    public final /* synthetic */ Function0 e;
    public final /* synthetic */ Function0 g;
    public final /* synthetic */ boolean h;
    public final /* synthetic */ int i;
    public final /* synthetic */ int j;
    public final /* synthetic */ Object k;
    public final /* synthetic */ Object l;
    public final /* synthetic */ Object m;
    public final /* synthetic */ Object n;
    public final /* synthetic */ Function o;
    public final /* synthetic */ Function p;

    public /* synthetic */ xg1(LifecycleOwner lifecycleOwner, Function0 function0, boolean z, Function0 function1, Function0 function2, Function0 function3, boolean z2, Function1 function4, Function1 function5, Function1 function6, Function3 function7, Function2 function8, int i, int i2) {
        this.k = lifecycleOwner;
        this.c = function0;
        this.b = z;
        this.d = function1;
        this.e = function2;
        this.g = function3;
        this.h = z2;
        this.l = function4;
        this.m = function5;
        this.n = function6;
        this.o = function7;
        this.p = function8;
        this.i = i;
        this.j = i2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        int i = this.a;
        int i2 = this.j;
        int i3 = this.i;
        Function function = this.p;
        Function function2 = this.o;
        Object obj3 = this.n;
        Object obj4 = this.m;
        Object obj5 = this.l;
        Object obj6 = this.k;
        switch (i) {
            case 0:
                ((Integer) obj2).intValue();
                int iUpdateChangedFlags = RecomposeScopeImplKt.updateChangedFlags(i3 | 1);
                int iUpdateChangedFlags2 = RecomposeScopeImplKt.updateChangedFlags(i2);
                bh1.a((LifecycleOwner) obj6, this.c, this.b, this.d, this.e, this.g, this.h, (Function1) obj5, (Function1) obj4, (Function1) obj3, (Function3) function2, (Function2) function, (Composer) obj, iUpdateChangedFlags, iUpdateChangedFlags2);
                break;
            default:
                ((Integer) obj2).getClass();
                int iUpdateChangedFlags3 = RecomposeScopeImplKt.updateChangedFlags(i3 | 1);
                int iUpdateChangedFlags4 = RecomposeScopeImplKt.updateChangedFlags(i2);
                gy1.d((ServerConfig) obj6, (ProxyConfig) obj5, (ServerPingState) obj4, this.b, (FocusRequester) obj3, this.c, this.d, this.e, this.g, this.h, (Function0) function2, (Function0) function, (Composer) obj, iUpdateChangedFlags3, iUpdateChangedFlags4);
                break;
        }
        return Unit.INSTANCE;
    }

    public /* synthetic */ xg1(ServerConfig serverConfig, ProxyConfig proxyConfig, ServerPingState serverPingState, boolean z, FocusRequester focusRequester, Function0 function0, Function0 function1, Function0 function2, Function0 function3, boolean z2, Function0 function4, Function0 function5, int i, int i2) {
        this.k = serverConfig;
        this.l = proxyConfig;
        this.m = serverPingState;
        this.b = z;
        this.n = focusRequester;
        this.c = function0;
        this.d = function1;
        this.e = function2;
        this.g = function3;
        this.h = z2;
        this.o = function4;
        this.p = function5;
        this.i = i;
        this.j = i2;
    }
}
