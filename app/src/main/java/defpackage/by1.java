package defpackage;

import androidx.compose.runtime.MutableState;
import com.dh.myembyapp.data.model.ServerConfig;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes4.dex */
public final class by1 implements Function0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ ServerConfig b;
    public final /* synthetic */ MutableState c;

    public /* synthetic */ by1(ServerConfig serverConfig, MutableState mutableState, int i) {
        this.a = i;
        this.b = serverConfig;
        this.c = mutableState;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int i = this.a;
        ServerConfig serverConfig = this.b;
        MutableState mutableState = this.c;
        switch (i) {
            case 0:
                mutableState.setValue(serverConfig);
                break;
            default:
                mutableState.setValue(serverConfig);
                break;
        }
        return Unit.INSTANCE;
    }
}
