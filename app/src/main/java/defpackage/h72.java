package defpackage;

import androidx.compose.foundation.text.input.internal.TextStyleBuffer;
import java.util.ArrayList;
import kotlin.jvm.functions.Function3;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class h72 implements Function3 {
    public final /* synthetic */ int a;
    public final /* synthetic */ ArrayList b;
    public final /* synthetic */ TextStyleBuffer c;

    public /* synthetic */ h72(ArrayList arrayList, TextStyleBuffer textStyleBuffer, int i) {
        this.a = i;
        this.b = arrayList;
        this.c = textStyleBuffer;
    }

    @Override // kotlin.jvm.functions.Function3
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        int i = this.a;
        TextStyleBuffer textStyleBuffer = this.c;
        ArrayList arrayList = this.b;
        int iIntValue = ((Integer) obj2).intValue();
        int iIntValue2 = ((Integer) obj3).intValue();
        switch (i) {
            case 0:
                return TextStyleBuffer.getAllStyles$lambda$0(arrayList, textStyleBuffer, obj, iIntValue, iIntValue2);
            default:
                return TextStyleBuffer.getStyles$lambda$0(arrayList, textStyleBuffer, obj, iIntValue, iIntValue2);
        }
    }
}
