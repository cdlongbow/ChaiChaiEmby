package defpackage;

import androidx.compose.material3.ModalBottomSheetKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.RecomposeScopeImplKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class a51 implements Function2 {
    public final /* synthetic */ int a = 0;
    public final /* synthetic */ long b;
    public final /* synthetic */ boolean c;
    public final /* synthetic */ boolean d;
    public final /* synthetic */ int e;
    public final /* synthetic */ Function0 g;

    public /* synthetic */ a51(long j, Function0 function0, boolean z, boolean z2, int i) {
        this.b = j;
        this.g = function0;
        this.c = z;
        this.d = z2;
        this.e = i;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.a) {
            case 0:
                int iIntValue = ((Integer) obj2).intValue();
                return ModalBottomSheetKt.Scrim_KTwxG1Y$lambda$34(this.b, this.g, this.c, this.d, this.e, (Composer) obj, iIntValue);
            default:
                ((Integer) obj2).getClass();
                ku.c(this.b, this.c, this.d, (wh1) this.g, (Composer) obj, RecomposeScopeImplKt.updateChangedFlags(this.e | 1));
                return Unit.INSTANCE;
        }
    }

    public /* synthetic */ a51(long j, boolean z, boolean z2, wh1 wh1Var, int i) {
        this.b = j;
        this.c = z;
        this.d = z2;
        this.g = wh1Var;
        this.e = i;
    }
}
