package defpackage;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.RecomposeScopeImplKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class v40 implements Function2 {
    public final /* synthetic */ int a;
    public final /* synthetic */ String b;
    public final /* synthetic */ int c;

    public /* synthetic */ v40(String str, int i, int i2) {
        this.a = i2;
        this.b = str;
        this.c = i;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        int i = this.a;
        Composer composer = (Composer) obj;
        ((Integer) obj2).intValue();
        switch (i) {
            case 0:
                u90.d0(composer, RecomposeScopeImplKt.updateChangedFlags(this.c | 1), this.b);
                break;
            default:
                u90.p0(composer, RecomposeScopeImplKt.updateChangedFlags(this.c | 1), this.b);
                break;
        }
        return Unit.INSTANCE;
    }
}
