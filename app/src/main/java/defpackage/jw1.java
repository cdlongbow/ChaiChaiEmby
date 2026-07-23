package defpackage;

import androidx.compose.foundation.text.selection.SelectionManager_androidKt;
import androidx.compose.foundation.text.selection.TextFieldSelectionManager_androidKt;
import androidx.compose.runtime.MutableState;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.DpSize;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class jw1 implements Function1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Density b;
    public final /* synthetic */ MutableState c;

    public /* synthetic */ jw1(Density density, MutableState mutableState, int i) {
        this.a = i;
        this.b = density;
        this.c = mutableState;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.a) {
            case 0:
                return SelectionManager_androidKt.selectionMagnifier$lambda$0$4$0$1(this.b, this.c, (DpSize) obj);
            case 1:
                return SelectionManager_androidKt.selectionMagnifier$lambda$0$4$0(this.b, this.c, (Function0) obj);
            case 2:
                return TextFieldSelectionManager_androidKt.textFieldMagnifier$lambda$0$4$0(this.b, this.c, (Function0) obj);
            default:
                return TextFieldSelectionManager_androidKt.textFieldMagnifier$lambda$0$4$0$1(this.b, this.c, (DpSize) obj);
        }
    }
}
