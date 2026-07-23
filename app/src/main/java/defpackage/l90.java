package defpackage;

import androidx.compose.animation.core.AnimationSpec;
import androidx.compose.foundation.gestures.BringIntoViewSpec;

/* JADX INFO: loaded from: classes4.dex */
public final class l90 implements BringIntoViewSpec {
    public final /* synthetic */ float a;

    public l90(float f) {
        this.a = f;
    }

    /* JADX WARN: Code duplicated, block: B:17:0x002f A[RETURN] */
    @Override // androidx.compose.foundation.gestures.BringIntoViewSpec
    public final float calculateScrollDistance(float f, float f2, float f3) {
        float f4 = this.a;
        float f5 = f3 - f4;
        float f6 = f5 - f4;
        float f7 = f + f2;
        float f8 = f - f4;
        float f9 = f7 - f5;
        if (f >= f4 && f7 <= f5) {
            return 0.0f;
        }
        if (f2 > f6) {
            if (Math.abs(f8) < Math.abs(f9)) {
                return f8;
            }
            return f9;
        }
        if (f >= f4) {
            if (f7 > f5) {
                return f9;
            }
            return 0.0f;
        }
        return f8;
    }

    @Override // androidx.compose.foundation.gestures.BringIntoViewSpec
    public final AnimationSpec getScrollAnimationSpec() {
        return BringIntoViewSpec.INSTANCE.getDefaultScrollAnimationSpec$foundation();
    }
}
