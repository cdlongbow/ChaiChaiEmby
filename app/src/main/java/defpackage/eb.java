package defpackage;

import androidx.compose.animation.AnimateBoundsModifierKt;
import androidx.compose.animation.BoundsTransform;
import androidx.compose.animation.SharedBoundsNode;
import androidx.compose.animation.SharedTransitionDefaults;
import androidx.compose.animation.core.FiniteAnimationSpec;
import androidx.compose.ui.geometry.Rect;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class eb implements BoundsTransform {
    public final /* synthetic */ int a;

    public /* synthetic */ eb(int i) {
        this.a = i;
    }

    @Override // androidx.compose.animation.BoundsTransform
    public final FiniteAnimationSpec createAnimationSpec(Rect rect, Rect rect2) {
        switch (this.a) {
            case 0:
                return AnimateBoundsModifierKt.DefaultBoundsTransform$lambda$0(rect, rect2);
            case 1:
                return SharedBoundsNode.approachPlaceMatchInTransition$lambda$1(rect, rect2);
            default:
                return SharedTransitionDefaults.BoundsTransform$lambda$0(rect, rect2);
        }
    }
}
