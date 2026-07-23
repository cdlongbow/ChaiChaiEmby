package defpackage;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.RecomposeScopeImplKt;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class ig implements Function2 {
    public final /* synthetic */ int a;
    public final /* synthetic */ List b;
    public final /* synthetic */ String c;
    public final /* synthetic */ String d;
    public final /* synthetic */ Function1 e;
    public final /* synthetic */ Function0 g;
    public final /* synthetic */ int h;

    public /* synthetic */ ig(List list, String str, String str2, Function1 function1, Function0 function0, int i, int i2) {
        this.a = i2;
        this.b = list;
        this.c = str;
        this.d = str2;
        this.e = function1;
        this.g = function0;
        this.h = i;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        int i = this.a;
        int i2 = this.h;
        switch (i) {
            case 0:
                ((Integer) obj2).getClass();
                pg.a(this.b, this.c, this.d, this.e, this.g, (Composer) obj, RecomposeScopeImplKt.updateChangedFlags(i2 | 1));
                break;
            case 1:
                ((Integer) obj2).getClass();
                pg.a(this.b, this.c, this.d, this.e, this.g, (Composer) obj, RecomposeScopeImplKt.updateChangedFlags(i2 | 1));
                break;
            default:
                ((Integer) obj2).getClass();
                xy1.b(this.b, this.c, this.d, this.e, this.g, (Composer) obj, RecomposeScopeImplKt.updateChangedFlags(i2 | 1));
                break;
        }
        return Unit.INSTANCE;
    }
}
