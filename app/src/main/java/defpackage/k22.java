package defpackage;

import androidx.compose.animation.core.AnimationScope;
import androidx.compose.foundation.gestures.ScrollScope;
import androidx.compose.foundation.gestures.snapping.SnapFlingBehaviorKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Ref;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class k22 implements Function1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ float b;
    public final /* synthetic */ Ref.FloatRef c;
    public final /* synthetic */ ScrollScope d;
    public final /* synthetic */ Function1 e;

    public /* synthetic */ k22(float f, Ref.FloatRef floatRef, ScrollScope scrollScope, Function1 function1, int i) {
        this.a = i;
        this.b = f;
        this.c = floatRef;
        this.d = scrollScope;
        this.e = function1;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i = this.a;
        Function1 function1 = this.e;
        ScrollScope scrollScope = this.d;
        Ref.FloatRef floatRef = this.c;
        float f = this.b;
        AnimationScope animationScope = (AnimationScope) obj;
        switch (i) {
            case 0:
                return SnapFlingBehaviorKt.animateDecay$lambda$0(f, floatRef, scrollScope, function1, animationScope);
            default:
                return SnapFlingBehaviorKt.animateWithTarget$lambda$0(f, floatRef, scrollScope, function1, animationScope);
        }
    }
}
