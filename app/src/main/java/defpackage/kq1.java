package defpackage;

import androidx.compose.foundation.style.StyleOuterNode;
import androidx.compose.material3.ProgressIndicatorKt;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class kq1 implements Function0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ float b;

    public /* synthetic */ kq1(float f, int i) {
        this.a = i;
        this.b = f;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        float fLinearProgressIndicator__5eSR_E$lambda$16$lambda$15;
        int i = this.a;
        float f = this.b;
        switch (i) {
            case 0:
                fLinearProgressIndicator__5eSR_E$lambda$16$lambda$15 = ProgressIndicatorKt.LinearProgressIndicator__5eSR_E$lambda$16$lambda$15(f);
                break;
            case 1:
                fLinearProgressIndicator__5eSR_E$lambda$16$lambda$15 = ProgressIndicatorKt.CircularProgressIndicator_DUhRLBM$lambda$37$lambda$36(f);
                break;
            default:
                fLinearProgressIndicator__5eSR_E$lambda$16$lambda$15 = StyleOuterNode.drawForShape_9zt3ed4$lambda$0(f);
                break;
        }
        return Float.valueOf(fLinearProgressIndicator__5eSR_E$lambda$16$lambda$15);
    }
}
