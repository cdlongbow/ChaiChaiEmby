package defpackage;

import androidx.compose.animation.core.Transition;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class ub2 implements Function0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Transition b;

    public /* synthetic */ ub2(Transition transition, int i) {
        this.a = i;
        this.b = transition;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int i = this.a;
        Transition transition = this.b;
        switch (i) {
            case 0:
                return Boolean.valueOf(Transition.animateTo$lambda$0$0(transition));
            default:
                return Long.valueOf(transition.calculateTotalDurationNanos());
        }
    }
}
