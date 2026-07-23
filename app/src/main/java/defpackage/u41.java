package defpackage;

import androidx.compose.material3.ModalBottomSheetKt;
import androidx.compose.material3.SheetState;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class u41 implements Function1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ SheetState b;
    public final /* synthetic */ Function0 c;

    public /* synthetic */ u41(SheetState sheetState, Function0 function0, int i) {
        this.a = i;
        this.b = sheetState;
        this.c = function0;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i = this.a;
        Function0 function0 = this.c;
        SheetState sheetState = this.b;
        Throwable th = (Throwable) obj;
        switch (i) {
            case 0:
                return ModalBottomSheetKt.ModalBottomSheet_YbuCTN8$lambda$4$lambda$3$lambda$2(sheetState, function0, th);
            default:
                return ModalBottomSheetKt.ModalBottomSheet_YbuCTN8$lambda$7$lambda$6$lambda$5(sheetState, function0, th);
        }
    }
}
