package defpackage;

import androidx.compose.animation.core.Easing;
import androidx.compose.animation.core.EasingFunctionsKt;
import androidx.compose.animation.core.EasingKt;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class dd0 implements Easing {
    public final /* synthetic */ int a;

    public /* synthetic */ dd0(int i) {
        this.a = i;
    }

    @Override // androidx.compose.animation.core.Easing
    public final float transform(float f) {
        switch (this.a) {
            case 0:
                return EasingFunctionsKt.EaseInElastic$lambda$0(f);
            case 1:
                return EasingFunctionsKt.EaseOutElastic$lambda$0(f);
            case 2:
                return EasingFunctionsKt.EaseInOutElastic$lambda$0(f);
            case 3:
                return EasingFunctionsKt.EaseOutBounce$lambda$0(f);
            case 4:
                return EasingFunctionsKt.EaseInBounce$lambda$0(f);
            case 5:
                return EasingFunctionsKt.EaseInOutBounce$lambda$0(f);
            default:
                return EasingKt.LinearEasing$lambda$0(f);
        }
    }
}
