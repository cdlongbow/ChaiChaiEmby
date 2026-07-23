package defpackage;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.RecomposeScopeImplKt;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class px implements Function2 {
    public final /* synthetic */ int a = 1;
    public final /* synthetic */ String b;
    public final /* synthetic */ List c;
    public final /* synthetic */ Function1 d;
    public final /* synthetic */ int e;

    public /* synthetic */ px(String str, List list, Function1 function1, int i) {
        this.b = str;
        this.c = list;
        this.d = function1;
        this.e = i;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        int i = this.a;
        int i2 = this.e;
        Function1 function1 = this.d;
        List list = this.c;
        String str = this.b;
        Composer composer = (Composer) obj;
        Integer num = (Integer) obj2;
        switch (i) {
            case 0:
                num.intValue();
                qy.b(RecomposeScopeImplKt.updateChangedFlags(i2 | 1), composer, str, list, function1);
                break;
            default:
                num.getClass();
                ld1.a(RecomposeScopeImplKt.updateChangedFlags(i2 | 1), composer, str, list, function1);
                break;
        }
        return Unit.INSTANCE;
    }

    public /* synthetic */ px(List list, String str, Function1 function1, int i) {
        this.c = list;
        this.b = str;
        this.d = function1;
        this.e = i;
    }
}
