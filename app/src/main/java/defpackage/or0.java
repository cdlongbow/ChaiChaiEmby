package defpackage;

import androidx.compose.material3.IconKt;
import androidx.compose.runtime.Composer;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.ImageBitmap;
import androidx.compose.ui.graphics.painter.Painter;
import androidx.compose.ui.graphics.vector.ImageVector;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class or0 implements Function2 {
    public final /* synthetic */ int a;
    public final /* synthetic */ String b;
    public final /* synthetic */ Modifier c;
    public final /* synthetic */ long d;
    public final /* synthetic */ int e;
    public final /* synthetic */ int g;
    public final /* synthetic */ Object h;

    public /* synthetic */ or0(Object obj, String str, Modifier modifier, long j, int i, int i2, int i3) {
        this.a = i3;
        this.h = obj;
        this.b = str;
        this.c = modifier;
        this.d = j;
        this.e = i;
        this.g = i2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.a) {
            case 0:
                int iIntValue = ((Integer) obj2).intValue();
                return IconKt.Icon_ww6aTOc$lambda$0((ImageVector) this.h, this.b, this.c, this.d, this.e, this.g, (Composer) obj, iIntValue);
            case 1:
                int iIntValue2 = ((Integer) obj2).intValue();
                return IconKt.Icon_ww6aTOc$lambda$2((ImageBitmap) this.h, this.b, this.c, this.d, this.e, this.g, (Composer) obj, iIntValue2);
            default:
                int iIntValue3 = ((Integer) obj2).intValue();
                return IconKt.Icon_ww6aTOc$lambda$6((Painter) this.h, this.b, this.c, this.d, this.e, this.g, (Composer) obj, iIntValue3);
        }
    }
}
