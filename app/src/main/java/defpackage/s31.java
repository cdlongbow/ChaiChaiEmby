package defpackage;

import androidx.compose.material3.ColorScheme;
import androidx.compose.material3.MaterialThemeKt;
import androidx.compose.material3.MotionScheme;
import androidx.compose.material3.Shapes;
import androidx.compose.material3.Typography;
import androidx.compose.runtime.Composer;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class s31 implements Function2 {
    public final /* synthetic */ int a;
    public final /* synthetic */ ColorScheme b;
    public final /* synthetic */ MotionScheme c;
    public final /* synthetic */ Shapes d;
    public final /* synthetic */ Typography e;
    public final /* synthetic */ Function2 g;
    public final /* synthetic */ int h;
    public final /* synthetic */ int i;

    public /* synthetic */ s31(ColorScheme colorScheme, MotionScheme motionScheme, Shapes shapes, Typography typography, Function2 function2, int i, int i2, int i3) {
        this.a = i3;
        this.b = colorScheme;
        this.c = motionScheme;
        this.d = shapes;
        this.e = typography;
        this.g = function2;
        this.h = i;
        this.i = i2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.a) {
            case 0:
                int iIntValue = ((Integer) obj2).intValue();
                return MaterialThemeKt.MaterialTheme$lambda$1(this.b, this.c, this.d, this.e, this.g, this.h, this.i, (Composer) obj, iIntValue);
            default:
                int iIntValue2 = ((Integer) obj2).intValue();
                return MaterialThemeKt.MaterialExpressiveTheme$lambda$2(this.b, this.c, this.d, this.e, this.g, this.h, this.i, (Composer) obj, iIntValue2);
        }
    }
}
