package defpackage;

import androidx.compose.animation.core.Transition;
import androidx.compose.animation.core.TransitionKt;
import androidx.compose.runtime.DisposableEffectScope;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class xb2 implements Function1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Transition b;

    public /* synthetic */ xb2(Transition transition, int i) {
        this.a = i;
        this.b = transition;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i = this.a;
        Transition transition = this.b;
        DisposableEffectScope disposableEffectScope = (DisposableEffectScope) obj;
        switch (i) {
            case 0:
                return TransitionKt.rememberTransition$lambda$3$0(transition, disposableEffectScope);
            default:
                return TransitionKt.updateTransition$lambda$1$0(transition, disposableEffectScope);
        }
    }
}
