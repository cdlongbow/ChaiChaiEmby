package defpackage;

import com.dh.myembyapp.data.model.Library;
import com.dh.myembyapp.data.model.MediaItem;
import com.dh.myembyapp.data.model.ServerConfig;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function3;

/* JADX INFO: loaded from: classes4.dex */
public final class t6 implements Function0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Function3 b;
    public final /* synthetic */ String c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;

    public /* synthetic */ t6(Function3 function3, String str, Object obj, Object obj2, int i) {
        this.a = i;
        this.b = function3;
        this.c = str;
        this.d = obj;
        this.e = obj2;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int i = this.a;
        Object obj = this.e;
        Object obj2 = this.d;
        String str = this.c;
        Function3 function3 = this.b;
        switch (i) {
            case 0:
                function3.invoke(str, ((g3) obj2).a.getId(), ((Library) obj).getId());
                break;
            default:
                function3.invoke(str, ((ServerConfig) obj2).getId(), ((MediaItem) obj).getId());
                break;
        }
        return Unit.INSTANCE;
    }
}
