package defpackage;

import androidx.compose.animation.core.AnimationState;
import androidx.compose.animation.core.SuspendAnimationKt;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class n52 implements Function0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ AnimationState b;

    public /* synthetic */ n52(int i, AnimationState animationState) {
        this.a = i;
        this.b = animationState;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int i = this.a;
        AnimationState animationState = this.b;
        switch (i) {
            case 0:
                return SuspendAnimationKt.animate$lambda$4(animationState);
            default:
                return SuspendAnimationKt.animate$lambda$3$0(animationState);
        }
    }
}
