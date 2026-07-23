package defpackage;

import androidx.compose.material3.ModalBottomSheetKt;
import androidx.compose.material3.NavigationDrawerKt;
import androidx.compose.runtime.State;
import androidx.compose.ui.graphics.drawscope.DrawScope;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class z41 implements Function1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ long b;
    public final /* synthetic */ Object c;

    public /* synthetic */ z41(int i, long j, Object obj) {
        this.a = i;
        this.b = j;
        this.c = obj;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.a) {
            case 0:
                return ModalBottomSheetKt.Scrim_KTwxG1Y$lambda$33$lambda$32(this.b, (State) this.c, (DrawScope) obj);
            case 1:
                return WideNavigationRailKt.Scrim_3J_VO9M$lambda$35$lambda$34(this.b, (State) this.c, (DrawScope) obj);
            default:
                return NavigationDrawerKt.Scrim_Bx497Mc$lambda$71$lambda$70(this.b, (Function0) this.c, (DrawScope) obj);
        }
    }
}
