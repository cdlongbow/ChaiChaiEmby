package defpackage;

import androidx.compose.foundation.text.TextLinkScope;
import androidx.compose.material3.TimePickerDialogKt;
import androidx.compose.runtime.Composer;
import kotlin.Function;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class y72 implements Function2 {
    public final /* synthetic */ int a;
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Function e;

    public /* synthetic */ y72(Object obj, Object obj2, Function function, int i, int i2) {
        this.a = i2;
        this.c = obj;
        this.d = obj2;
        this.e = function;
        this.b = i;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        int i = this.a;
        Function function = this.e;
        Object obj3 = this.d;
        Object obj4 = this.c;
        switch (i) {
            case 0:
                int iIntValue = ((Integer) obj2).intValue();
                return TimePickerDialogKt.TimePickerCustomLayout$lambda$3((Function2) obj4, (Function2) obj3, (Function3) function, this.b, (Composer) obj, iIntValue);
            default:
                int iIntValue2 = ((Integer) obj2).intValue();
                return TextLinkScope.StyleAnnotation$lambda$1((TextLinkScope) obj4, (Object[]) obj3, (Function1) function, this.b, (Composer) obj, iIntValue2);
        }
    }
}
