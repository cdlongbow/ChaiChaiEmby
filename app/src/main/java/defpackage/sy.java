package defpackage;

import androidx.compose.material3.NavigationBarKt;
import androidx.compose.material3.NavigationItemKt;
import androidx.compose.runtime.MutableIntState;
import androidx.compose.ui.unit.IntSize;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class sy implements Function1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ MutableIntState b;

    public /* synthetic */ sy(MutableIntState mutableIntState, int i) {
        this.a = i;
        this.b = mutableIntState;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.a) {
            case 0:
                this.b.setIntValue(((Integer) obj).intValue());
                return Unit.INSTANCE;
            case 1:
                return NavigationBarKt.NavigationBarItem$lambda$8$lambda$7(this.b, (IntSize) obj);
            case 2:
                return NavigationItemKt.NavigationItem_8Df7sds$lambda$4$lambda$3(this.b, (IntSize) obj);
            case 3:
                return NavigationItemKt.AnimatedNavigationItem_DQd_Gtc$lambda$15$lambda$14(this.b, (IntSize) obj);
            case 4:
                this.b.setIntValue(((Integer) obj).intValue());
                return Unit.INSTANCE;
            case 5:
                this.b.setIntValue(((Integer) obj).intValue());
                return Unit.INSTANCE;
            default:
                this.b.setIntValue(((Integer) obj).intValue());
                return Unit.INSTANCE;
        }
    }
}
