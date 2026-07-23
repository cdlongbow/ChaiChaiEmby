package defpackage;

import androidx.compose.runtime.Composer;
import androidx.compose.ui.Modifier;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class b40 implements Function2 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Modifier b;
    public final /* synthetic */ Function2 c;
    public final /* synthetic */ int d;

    public /* synthetic */ b40(Modifier modifier, Function2 function2, int i, int i2) {
        this.a = i2;
        this.b = modifier;
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
                return DefaultTextContextMenuDropdownProvider_androidKt.ProvideDefaultTextContextMenuDropdown$lambda$1(this.b, this.c, this.d, composer, iIntValue);
            default:
                return PlatformDefaultTextContextMenuProviders_androidKt.ProvideBothDefaultProviders$lambda$5(this.b, this.c, this.d, composer, iIntValue);
        }
    }
}
