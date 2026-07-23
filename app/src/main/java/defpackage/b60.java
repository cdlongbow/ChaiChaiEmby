package defpackage;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.RecomposeScopeImplKt;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class b60 implements Function2 {
    public final /* synthetic */ int a;
    public final /* synthetic */ List b;
    public final /* synthetic */ int c;

    public /* synthetic */ b60(List list, int i, int i2) {
        this.a = i2;
        this.b = list;
        this.c = i;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        int i = this.a;
        Composer composer = (Composer) obj;
        ((Integer) obj2).intValue();
        switch (i) {
            case 0:
                u90.F(this.b, composer, RecomposeScopeImplKt.updateChangedFlags(this.c | 1));
                break;
            default:
                u90.I(this.b, composer, RecomposeScopeImplKt.updateChangedFlags(this.c | 1));
                break;
        }
        return Unit.INSTANCE;
    }
}
