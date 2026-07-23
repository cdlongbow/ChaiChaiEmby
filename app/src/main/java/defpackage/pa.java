package defpackage;

import androidx.compose.foundation.text.selection.SelectionContainerKt;
import androidx.compose.foundation.text.selection.SimpleLayoutKt;
import androidx.compose.runtime.Composer;
import androidx.compose.ui.Modifier;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class pa implements Function2 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Modifier b;
    public final /* synthetic */ Function2 c;
    public final /* synthetic */ int d;
    public final /* synthetic */ int e;

    public /* synthetic */ pa(Modifier modifier, Function2 function2, int i, int i2, int i3) {
        this.a = i3;
        this.b = modifier;
        this.c = function2;
        this.d = i;
        this.e = i2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.a) {
            case 0:
                int iIntValue = ((Integer) obj2).intValue();
                return AndroidTextContextMenuToolbarProvider_androidKt.ProvidePlatformTextContextMenuToolbar$lambda$0(this.b, this.c, this.d, this.e, (Composer) obj, iIntValue);
            case 1:
                int iIntValue2 = ((Integer) obj2).intValue();
                return PlatformDefaultTextContextMenuProviders_androidKt.ProvideDefaultPlatformTextContextMenuProviders$lambda$1(this.b, this.c, this.d, this.e, (Composer) obj, iIntValue2);
            case 2:
                int iIntValue3 = ((Integer) obj2).intValue();
                return SelectionContainerKt.SelectionContainer$lambda$4(this.b, this.c, this.d, this.e, (Composer) obj, iIntValue3);
            default:
                int iIntValue4 = ((Integer) obj2).intValue();
                return SimpleLayoutKt.SimpleLayout$lambda$1(this.b, this.c, this.d, this.e, (Composer) obj, iIntValue4);
        }
    }
}
