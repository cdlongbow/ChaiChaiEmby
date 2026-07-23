package defpackage;

import androidx.compose.material3.ModalBottomSheetKt;
import androidx.compose.material3.NavigationDrawerKt;
import androidx.compose.ui.semantics.SemanticsPropertyReceiver;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class y41 implements Function1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ String b;
    public final /* synthetic */ Function0 c;

    public /* synthetic */ y41(String str, Function0 function0, int i) {
        this.a = i;
        this.b = str;
        this.c = function0;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.a) {
            case 0:
                return ModalBottomSheetKt.Scrim_KTwxG1Y$lambda$31$lambda$30(this.b, this.c, (SemanticsPropertyReceiver) obj);
            default:
                return NavigationDrawerKt.Scrim_Bx497Mc$lambda$69$lambda$68(this.b, this.c, (SemanticsPropertyReceiver) obj);
        }
    }
}
