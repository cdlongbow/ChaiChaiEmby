package defpackage;

import androidx.compose.material3.DividerKt;
import androidx.compose.material3.ProgressIndicatorKt;
import androidx.compose.runtime.Composer;
import androidx.compose.ui.Modifier;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class lb0 implements Function2 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Modifier b;
    public final /* synthetic */ float c;
    public final /* synthetic */ long d;
    public final /* synthetic */ int e;
    public final /* synthetic */ int g;

    public /* synthetic */ lb0(Modifier modifier, long j, float f, int i, int i2) {
        this.a = 3;
        this.b = modifier;
        this.d = j;
        this.c = f;
        this.e = i;
        this.g = i2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.a) {
            case 0:
                int iIntValue = ((Integer) obj2).intValue();
                return DividerKt.Divider_9IZ8Weo$lambda$6(this.b, this.c, this.d, this.e, this.g, (Composer) obj, iIntValue);
            case 1:
                int iIntValue2 = ((Integer) obj2).intValue();
                return DividerKt.VerticalDivider_9IZ8Weo$lambda$5(this.b, this.c, this.d, this.e, this.g, (Composer) obj, iIntValue2);
            case 2:
                int iIntValue3 = ((Integer) obj2).intValue();
                return DividerKt.HorizontalDivider_9IZ8Weo$lambda$2(this.b, this.c, this.d, this.e, this.g, (Composer) obj, iIntValue3);
            default:
                int iIntValue4 = ((Integer) obj2).intValue();
                Modifier modifier = this.b;
                float f = this.c;
                return ProgressIndicatorKt.CircularProgressIndicator_aM_cp0Q$lambda$40(modifier, this.d, f, this.e, this.g, (Composer) obj, iIntValue4);
        }
    }

    public /* synthetic */ lb0(Modifier modifier, float f, long j, int i, int i2, int i3) {
        this.a = i3;
        this.b = modifier;
        this.c = f;
        this.d = j;
        this.e = i;
        this.g = i2;
    }
}
