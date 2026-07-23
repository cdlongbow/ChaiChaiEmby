package defpackage;

import androidx.compose.animation.core.AnimationScope;
import androidx.compose.material3.AppBarKt;
import androidx.compose.material3.TopAppBarState;
import androidx.compose.ui.unit.IntSize;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class qb implements Function1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ TopAppBarState b;

    public /* synthetic */ qb(TopAppBarState topAppBarState, int i) {
        this.a = i;
        this.b = topAppBarState;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i = this.a;
        TopAppBarState topAppBarState = this.b;
        switch (i) {
            case 0:
                return AppBarKt.adjustHeightOffsetLimit$lambda$38$lambda$37(topAppBarState, (IntSize) obj);
            default:
                return AppBarKt.settleAppBar$lambda$55(topAppBarState, (AnimationScope) obj);
        }
    }
}
