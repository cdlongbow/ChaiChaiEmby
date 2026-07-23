package defpackage;

import androidx.compose.material3.TimePickerKt;
import androidx.compose.ui.semantics.SemanticsPropertyReceiver;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class g82 implements Function1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ String b;

    public /* synthetic */ g82(String str, int i) {
        this.a = i;
        this.b = str;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i = this.a;
        String str = this.b;
        SemanticsPropertyReceiver semanticsPropertyReceiver = (SemanticsPropertyReceiver) obj;
        switch (i) {
            case 0:
                return TimePickerKt.PeriodToggleImpl$lambda$41$lambda$40(str, semanticsPropertyReceiver);
            case 1:
                return TimePickerKt.TimePickerTextField_1vLObsk$lambda$92$lambda$89$lambda$88$lambda$87(str, semanticsPropertyReceiver);
            case 2:
                return TimePickerKt.TimeSelector_SAnMeKU$lambda$56$lambda$55(str, semanticsPropertyReceiver);
            default:
                return WideNavigationRailKt.ModalWideNavigationRailContent_pU6N4AM$lambda$18$lambda$17(str, semanticsPropertyReceiver);
        }
    }
}
