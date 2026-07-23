package defpackage;

import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.material3.TimePickerKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.ui.Modifier;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class jm implements Function2 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Modifier b;
    public final /* synthetic */ int c;

    public /* synthetic */ jm(Modifier modifier, int i, int i2) {
        this.a = i2;
        this.b = modifier;
        this.c = i;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        Composer composer = (Composer) obj;
        Integer num = (Integer) obj2;
        switch (this.a) {
            case 0:
                return BoxKt.Box$lambda$1(this.b, this.c, composer, num.intValue());
            case 1:
                num.getClass();
                v72.b(this.b, composer, RecomposeScopeImplKt.updateChangedFlags(this.c | 1));
                return Unit.INSTANCE;
            default:
                return TimePickerKt.DisplaySeparator$lambda$54(this.b, this.c, composer, num.intValue());
        }
    }
}
