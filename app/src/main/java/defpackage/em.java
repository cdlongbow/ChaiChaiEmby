package defpackage;

import androidx.compose.animation.core.FiniteAnimationSpec;
import androidx.compose.material3.BottomSheetScaffoldKt;
import androidx.compose.material3.ModalBottomSheetKt;
import androidx.compose.material3.SheetState;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class em implements Function0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ SheetState b;
    public final /* synthetic */ FiniteAnimationSpec c;
    public final /* synthetic */ FiniteAnimationSpec d;
    public final /* synthetic */ FiniteAnimationSpec e;

    public /* synthetic */ em(SheetState sheetState, FiniteAnimationSpec finiteAnimationSpec, FiniteAnimationSpec finiteAnimationSpec2, FiniteAnimationSpec finiteAnimationSpec3, int i) {
        this.a = i;
        this.b = sheetState;
        this.c = finiteAnimationSpec;
        this.d = finiteAnimationSpec2;
        this.e = finiteAnimationSpec3;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.a) {
            case 0:
                return BottomSheetScaffoldKt.StandardBottomSheet_w7I5h1o$lambda$7$lambda$6(this.b, this.c, this.d, this.e);
            default:
                return ModalBottomSheetKt.ModalBottomSheet_YbuCTN8$lambda$1$lambda$0(this.b, this.c, this.d, this.e);
        }
    }
}
