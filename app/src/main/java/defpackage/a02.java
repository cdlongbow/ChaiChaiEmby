package defpackage;

import androidx.compose.ui.unit.Density;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class a02 implements Function0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ float c;

    public /* synthetic */ a02(float f, int i, Object obj) {
        this.a = i;
        this.b = obj;
        this.c = f;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        float fMo420toPx0680j_4;
        int i = this.a;
        float f = this.c;
        Object obj = this.b;
        switch (i) {
            case 0:
                fMo420toPx0680j_4 = ((Density) obj).mo420toPx0680j_4(f);
                break;
            case 1:
                fMo420toPx0680j_4 = ((Density) obj).mo420toPx0680j_4(f);
                break;
            default:
                if (((wg1) obj).b()) {
                    return null;
                }
                return Float.valueOf(f);
        }
        return Float.valueOf(fMo420toPx0680j_4);
    }
}
