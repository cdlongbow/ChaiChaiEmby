package defpackage;

import com.dh.myembyapp.data.model.Library;
import com.dh.myembyapp.data.model.MediaSource;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes4.dex */
public final class ez0 implements Function0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Function2 b;
    public final /* synthetic */ boolean c;
    public final /* synthetic */ Object d;

    public /* synthetic */ ez0(boolean z, Function2 function2, int i, Object obj) {
        this.a = i;
        this.b = function2;
        this.d = obj;
        this.c = z;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int i = this.a;
        boolean z = this.c;
        Object obj = this.d;
        Function2 function2 = this.b;
        switch (i) {
            case 0:
                function2.invoke(((Library) obj).getId(), Boolean.valueOf(z));
                break;
            default:
                function2.invoke((MediaSource) obj, Boolean.valueOf(z));
                break;
        }
        return Unit.INSTANCE;
    }
}
