package defpackage;

import androidx.compose.foundation.text.CommonContextMenuAreaKt;
import androidx.compose.foundation.text.ContextMenu_androidKt;
import androidx.compose.foundation.text.selection.TextFieldSelectionManager;
import androidx.compose.runtime.Composer;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class er implements Function2 {
    public final /* synthetic */ int a;
    public final /* synthetic */ TextFieldSelectionManager b;
    public final /* synthetic */ Function2 c;
    public final /* synthetic */ int d;

    public /* synthetic */ er(TextFieldSelectionManager textFieldSelectionManager, Function2 function2, int i, int i2) {
        this.a = i2;
        this.b = textFieldSelectionManager;
        this.c = function2;
        this.d = i;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        int i = this.a;
        Composer composer = (Composer) obj;
        int iIntValue = ((Integer) obj2).intValue();
        switch (i) {
            case 0:
                return CommonContextMenuAreaKt.CommonContextMenuArea$lambda$4(this.b, this.c, this.d, composer, iIntValue);
            default:
                return ContextMenu_androidKt.ContextMenuArea$lambda$0(this.b, this.c, this.d, composer, iIntValue);
        }
    }
}
