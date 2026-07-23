package defpackage;

import com.dh.myembyapp.data.model.ServerConfig;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes4.dex */
public final class ay1 implements Function0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Function1 b;
    public final /* synthetic */ ServerConfig c;

    public /* synthetic */ ay1(Function1 function1, ServerConfig serverConfig, int i) {
        this.a = i;
        this.b = function1;
        this.c = serverConfig;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int i = this.a;
        ServerConfig serverConfig = this.c;
        Function1 function1 = this.b;
        switch (i) {
            case 0:
                function1.invoke(serverConfig.getEffectiveServerConfig());
                break;
            default:
                function1.invoke(serverConfig.getId());
                break;
        }
        return Unit.INSTANCE;
    }
}
