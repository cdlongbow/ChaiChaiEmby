package defpackage;

import androidx.compose.runtime.DisposableEffectScope;
import com.dh.myembyapp.server.WebDavSyncConfigServerManager;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class a92 implements Function1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Function1 b;

    public /* synthetic */ a92(Function1 function1, int i) {
        this.a = i;
        this.b = function1;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.a) {
            case 0:
                ((DisposableEffectScope) obj).getClass();
                return new nj0(this.b, 1);
            default:
                return WebDavSyncConfigServerManager.startServer$lambda$0(this.b, (ye2) obj);
        }
    }
}
