package defpackage;

import androidx.compose.animation.core.AnimationSpec;
import androidx.compose.foundation.gestures.BringIntoViewSpec;

/* JADX INFO: loaded from: classes4.dex */
public final class s80 implements BringIntoViewSpec {
    @Override // androidx.compose.foundation.gestures.BringIntoViewSpec
    public final float calculateScrollDistance(float f, float f2, float f3) {
        float f4 = f2 + f;
        if (f >= 0.0f && f4 <= f3) {
            return 0.0f;
        }
        if (f < 0.0f && f4 > f3) {
            return 0.0f;
        }
        float f5 = f4 - f3;
        return Math.abs(f) < Math.abs(f5) ? f : f5;
    }

    @Override // androidx.compose.foundation.gestures.BringIntoViewSpec
    public final AnimationSpec getScrollAnimationSpec() {
        return BringIntoViewSpec.INSTANCE.getDefaultScrollAnimationSpec$foundation();
    }
}
