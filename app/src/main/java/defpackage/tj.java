package defpackage;

import androidx.compose.foundation.text.BasicSecureTextFieldKt;
import androidx.compose.foundation.text.selection.SelectionContainerKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.EffectsKt;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class tj implements Function2 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Function2 b;
    public final /* synthetic */ int c;

    public /* synthetic */ tj(int i, int i2, Function2 function2) {
        this.a = i2;
        this.b = function2;
        this.c = i;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        int i = this.a;
        Composer composer = (Composer) obj;
        int iIntValue = ((Integer) obj2).intValue();
        switch (i) {
            case 0:
                return BasicSecureTextFieldKt.DisableCutCopy$lambda$1(this.b, this.c, composer, iIntValue);
            case 1:
                return DefaultTextContextMenuDropdownProvider_androidKt.ProvideDefaultTextContextMenuDropdown$lambda$0(this.b, this.c, composer, iIntValue);
            case 2:
                return EffectsKt.LaunchedEffect$lambda$0(this.b, this.c, composer, iIntValue);
            default:
                return SelectionContainerKt.DisableSelection$lambda$0(this.b, this.c, composer, iIntValue);
        }
    }
}
