package defpackage;

import androidx.compose.material3.internal.ProvideContentColorTextStyleKt;
import androidx.compose.material3.internal.TextFieldImplKt;
import androidx.compose.runtime.Composer;
import androidx.compose.ui.text.TextStyle;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class xq1 implements Function2 {
    public final /* synthetic */ int a;
    public final /* synthetic */ long b;
    public final /* synthetic */ TextStyle c;
    public final /* synthetic */ Function2 d;
    public final /* synthetic */ int e;

    public /* synthetic */ xq1(long j, TextStyle textStyle, Function2 function2, int i, int i2) {
        this.a = i2;
        this.b = j;
        this.c = textStyle;
        this.d = function2;
        this.e = i;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.a) {
            case 0:
                int iIntValue = ((Integer) obj2).intValue();
                return ProvideContentColorTextStyleKt.ProvideContentColorTextStyle_3J_VO9M$lambda$0(this.b, this.c, this.d, this.e, (Composer) obj, iIntValue);
            default:
                int iIntValue2 = ((Integer) obj2).intValue();
                return TextFieldImplKt.Decoration_3J_VO9M$lambda$20(this.b, this.c, this.d, this.e, (Composer) obj, iIntValue2);
        }
    }
}
