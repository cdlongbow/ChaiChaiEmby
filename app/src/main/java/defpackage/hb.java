package defpackage;

import androidx.compose.foundation.lazy.LazyListItemProviderKt;
import androidx.compose.foundation.lazy.grid.LazyGridItemProviderKt;
import androidx.compose.foundation.lazy.layout.LazyLayoutKt;
import androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridItemProviderKt;
import androidx.compose.foundation.text.selection.SelectionMagnifierKt;
import androidx.compose.material.ripple.RippleIndicationInstance;
import androidx.compose.material3.AppBarColumnKt;
import androidx.compose.material3.AppBarRowKt;
import androidx.compose.material3.DefaultModalWideNavigationRailOverride;
import androidx.compose.material3.NavigationBarKt;
import androidx.compose.material3.NavigationItemKt;
import androidx.compose.material3.NavigationRailKt;
import androidx.compose.material3.internal.TextFieldImplKt;
import androidx.compose.runtime.State;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class hb implements Function0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ State b;

    public /* synthetic */ hb(State state, int i) {
        this.a = i;
        this.b = state;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int i = this.a;
        State state = this.b;
        switch (i) {
            case 0:
                return AppBarColumnKt.AppBarColumn$lambda$1$lambda$0(state);
            case 1:
                return AppBarRowKt.AppBarRow$lambda$1$lambda$0(state);
            case 2:
                return Boolean.valueOf(DefaultModalWideNavigationRailOverride.ModalWideNavigationRail$lambda$3$lambda$2(state));
            case 3:
                return Boolean.valueOf(DefaultModalWideNavigationRailOverride.ModalWideNavigationRail$lambda$6$lambda$5(state));
            case 4:
                return LazyGridItemProviderKt.rememberLazyGridItemProviderLambda$lambda$0$0(state);
            case 5:
                return LazyLayoutKt.LazyLayout$lambda$1$0$0(state);
            case 6:
                return LazyListItemProviderKt.rememberLazyListItemProviderLambda$lambda$0$0(state);
            case 7:
                return LazyStaggeredGridItemProviderKt.rememberStaggeredGridItemProviderLambda$lambda$0$0(state);
            case 8:
                return NavHostKt.NavHost$lambda$52$lambda$51(state);
            case 9:
                return Float.valueOf(NavigationBarKt.NavigationBarItem$lambda$15$lambda$12$lambda$11(state));
            case 10:
                return Float.valueOf(NavigationBarKt.NavigationBarItem$lambda$15$lambda$14$lambda$13(state));
            case 11:
                return Float.valueOf(NavigationItemKt.AnimatedNavigationItem_DQd_Gtc$lambda$26$lambda$23$lambda$22(state));
            case 12:
                return Float.valueOf(NavigationItemKt.AnimatedNavigationItem_DQd_Gtc$lambda$26$lambda$25$lambda$24(state));
            case 13:
                return Float.valueOf(NavigationItemKt.NavigationItem_8Df7sds$lambda$9$lambda$8$lambda$7(state));
            case 14:
                return Float.valueOf(NavigationRailKt.NavigationRailItem$lambda$10$lambda$7$lambda$6(state));
            case 15:
                return Float.valueOf(NavigationRailKt.NavigationRailItem$lambda$10$lambda$9$lambda$8(state));
            case 16:
                return Integer.valueOf(((Number) state.getValue()).intValue());
            case 17:
                return Integer.valueOf(((Number) state.getValue()).intValue());
            case 18:
                return RippleIndicationInstance.stateLayer$lambda$0(state);
            case 19:
                return SelectionMagnifierKt.animatedSelectionMagnifier$lambda$0$1$0(state);
            case 20:
                return Boolean.valueOf(TextFieldImplKt.CommonDecorationBox$lambda$18$lambda$7$lambda$6(state));
            default:
                return Boolean.valueOf(TextFieldImplKt.CommonDecorationBox$lambda$18$lambda$10$lambda$9(state));
        }
    }
}
