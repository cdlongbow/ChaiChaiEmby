package defpackage;

import androidx.compose.foundation.text.CommonContextMenuAreaKt;
import androidx.compose.foundation.text.ContextMenu_androidKt;
import androidx.compose.foundation.text.input.internal.selection.TextFieldSelectionState;
import androidx.compose.runtime.Composer;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class gr implements Function2 {
    public final /* synthetic */ int a;
    public final /* synthetic */ TextFieldSelectionState b;
    public final /* synthetic */ boolean c;
    public final /* synthetic */ Function2 d;
    public final /* synthetic */ int e;

    public /* synthetic */ gr(TextFieldSelectionState textFieldSelectionState, boolean z, Function2 function2, int i, int i2) {
        this.a = i2;
        this.b = textFieldSelectionState;
        this.c = z;
        this.d = function2;
        this.e = i;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.a) {
            case 0:
                int iIntValue = ((Integer) obj2).intValue();
                return CommonContextMenuAreaKt.CommonContextMenuArea$lambda$11(this.b, this.c, this.d, this.e, (Composer) obj, iIntValue);
            default:
                int iIntValue2 = ((Integer) obj2).intValue();
                return ContextMenu_androidKt.ContextMenuArea$lambda$1(this.b, this.c, this.d, this.e, (Composer) obj, iIntValue2);
        }
    }
}
