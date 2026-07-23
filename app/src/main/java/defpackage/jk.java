package defpackage;

import androidx.compose.foundation.text.BasicTextFieldKt;
import androidx.compose.foundation.text.input.internal.selection.TextFieldSelectionState;
import androidx.compose.runtime.Composer;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class jk implements Function2 {
    public final /* synthetic */ int a;
    public final /* synthetic */ TextFieldSelectionState b;
    public final /* synthetic */ int c;

    public /* synthetic */ jk(TextFieldSelectionState textFieldSelectionState, int i, int i2) {
        this.a = i2;
        this.b = textFieldSelectionState;
        this.c = i;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        int i = this.a;
        Composer composer = (Composer) obj;
        int iIntValue = ((Integer) obj2).intValue();
        switch (i) {
            case 0:
                return BasicTextFieldKt.TextFieldCursorHandle$lambda$4(this.b, this.c, composer, iIntValue);
            default:
                return BasicTextFieldKt.TextFieldSelectionHandles$lambda$8(this.b, this.c, composer, iIntValue);
        }
    }
}
