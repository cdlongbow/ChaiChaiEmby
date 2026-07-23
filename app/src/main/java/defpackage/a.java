package defpackage;

import androidx.compose.foundation.AbstractClickableNode;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class a implements Function0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ AbstractClickableNode b;

    public /* synthetic */ a(AbstractClickableNode abstractClickableNode, int i) {
        this.a = i;
        this.b = abstractClickableNode;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int i = this.a;
        AbstractClickableNode abstractClickableNode = this.b;
        switch (i) {
            case 0:
                return AbstractClickableNode.onObservedReadsChanged$lambda$0(abstractClickableNode);
            default:
                return Boolean.valueOf(AbstractClickableNode.applySemantics$lambda$0(abstractClickableNode));
        }
    }
}
