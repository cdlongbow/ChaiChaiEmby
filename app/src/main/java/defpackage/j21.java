package defpackage;

import androidx.compose.foundation.MagnifierNode;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class j21 implements Function0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ MagnifierNode b;

    public /* synthetic */ j21(MagnifierNode magnifierNode, int i) {
        this.a = i;
        this.b = magnifierNode;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int i = this.a;
        MagnifierNode magnifierNode = this.b;
        switch (i) {
            case 0:
                return MagnifierNode.onObservedReadsChanged$lambda$0(magnifierNode);
            case 1:
                return MagnifierNode.applySemantics$lambda$0(magnifierNode);
            default:
                return MagnifierNode.getAnchorPositionInRoot_F1C5BW0$lambda$0(magnifierNode);
        }
    }
}
