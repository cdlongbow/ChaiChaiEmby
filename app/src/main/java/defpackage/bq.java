package defpackage;

import androidx.compose.foundation.ClickableKt;
import androidx.compose.foundation.text.selection.SelectableInfo;
import androidx.compose.foundation.text.selection.SelectionLayoutKt;
import androidx.compose.ui.node.TraversableNode;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Ref;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class bq implements Function1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Ref.BooleanRef b;

    public /* synthetic */ bq(Ref.BooleanRef booleanRef, int i) {
        this.a = i;
        this.b = booleanRef;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i = this.a;
        Ref.BooleanRef booleanRef = this.b;
        switch (i) {
            case 0:
                return Boolean.valueOf(ClickableKt.hasScrollableContainer$lambda$0(booleanRef, (TraversableNode) obj));
            default:
                return SelectionLayoutKt.isCollapsed$lambda$0(booleanRef, (SelectableInfo) obj);
        }
    }
}
