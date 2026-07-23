package defpackage;

import androidx.compose.foundation.lazy.LazyListState;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.RecomposeScopeImplKt;
import java.util.List;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class u70 implements Function2 {
    public final /* synthetic */ int a;
    public final /* synthetic */ List b;
    public final /* synthetic */ Function1 c;
    public final /* synthetic */ LazyListState d;
    public final /* synthetic */ Map e;
    public final /* synthetic */ String g;
    public final /* synthetic */ Function1 h;
    public final /* synthetic */ int i;

    public /* synthetic */ u70(List list, Function1 function1, LazyListState lazyListState, Map map, String str, Function1 function2, int i, int i2) {
        this.a = i2;
        this.b = list;
        this.c = function1;
        this.d = lazyListState;
        this.e = map;
        this.g = str;
        this.h = function2;
        this.i = i;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.a) {
            case 0:
                ((Integer) obj2).getClass();
                u90.c(this.b, this.c, this.d, this.e, this.g, this.h, (Composer) obj, RecomposeScopeImplKt.updateChangedFlags(this.i | 1));
                break;
            default:
                ((Integer) obj2).getClass();
                u90.y0(this.b, this.c, this.d, this.e, this.g, this.h, (Composer) obj, RecomposeScopeImplKt.updateChangedFlags(this.i | 1));
                break;
        }
        return Unit.INSTANCE;
    }
}
