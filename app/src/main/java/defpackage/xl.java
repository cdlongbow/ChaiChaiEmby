package defpackage;

import androidx.compose.animation.core.Animation;
import androidx.compose.animation.core.AnimationState;
import androidx.compose.animation.core.SuspendAnimationKt;
import androidx.compose.foundation.border.BorderLogic;
import androidx.compose.ui.geometry.Rect;
import androidx.compose.ui.graphics.Brush;
import androidx.compose.ui.graphics.Outline;
import androidx.compose.ui.graphics.Path;
import androidx.compose.ui.graphics.drawscope.DrawScope;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Ref;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class xl implements Function1 {
    public final /* synthetic */ int a = 0;
    public final /* synthetic */ float b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object g;

    public /* synthetic */ xl(Rect rect, Outline.Generic generic, Brush brush, float f, Path path) {
        this.c = rect;
        this.d = generic;
        this.e = brush;
        this.b = f;
        this.g = path;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i = this.a;
        Object obj2 = this.g;
        Object obj3 = this.e;
        Object obj4 = this.d;
        Object obj5 = this.c;
        switch (i) {
            case 0:
                return BorderLogic.createDrawGenericBorder$lambda$1$0$0((Rect) obj5, (Outline.Generic) obj4, (Brush) obj3, this.b, (Path) obj2, (DrawScope) obj);
            default:
                long jLongValue = ((Long) obj).longValue();
                return SuspendAnimationKt.animate$lambda$6((Ref.ObjectRef) obj5, this.b, (Animation) obj4, (AnimationState) obj3, (Function1) obj2, jLongValue);
        }
    }

    public /* synthetic */ xl(Ref.ObjectRef objectRef, float f, Animation animation, AnimationState animationState, Function1 function1) {
        this.c = objectRef;
        this.b = f;
        this.d = animation;
        this.e = animationState;
        this.g = function1;
    }
}
