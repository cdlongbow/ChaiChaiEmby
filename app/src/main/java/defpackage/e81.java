package defpackage;

import androidx.compose.animation.core.Transition;
import androidx.compose.foundation.interaction.InteractionSource;
import androidx.compose.foundation.layout.ColumnScope;
import androidx.compose.material3.AppBarMenuState;
import androidx.compose.material3.NavigationItemKt;
import androidx.compose.material3.SheetDefaultsKt;
import androidx.compose.material3.TabKt;
import androidx.compose.material3.TextKt;
import androidx.compose.material3.ToggleableAppBarItem;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.focus.FocusRequester;
import androidx.compose.ui.graphics.Shape;
import androidx.compose.ui.text.TextStyle;
import com.dh.myembyapp.data.model.AudioVersionPrioritySettings;
import com.dh.myembyapp.data.model.PlayerDefaultViewMode;
import com.dh.myembyapp.data.model.PlayerFrameRateMatchingMode;
import com.dh.myembyapp.data.model.PlayerResizeMode;
import com.dh.myembyapp.data.model.SubtitleVersionPrioritySettings;
import com.dh.myembyapp.data.model.SystemNetworkSpeedDisplayMode;
import com.dh.myembyapp.data.model.SystemNetworkSpeedPosition;
import com.dh.myembyapp.data.model.VideoVersionPrioritySettings;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class e81 implements Function2 {
    public final /* synthetic */ int a;
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ e81(Object obj, Object obj2, int i, int i2) {
        this.a = i2;
        this.c = obj;
        this.d = obj2;
        this.b = i;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        int i = this.a;
        int i2 = this.b;
        Object obj3 = this.d;
        Object obj4 = this.c;
        switch (i) {
            case 0:
                return NavigationItemKt.IndicatorRipple$lambda$42((InteractionSource) obj4, (Shape) obj3, i2, (Composer) obj, ((Integer) obj2).intValue());
            case 1:
                ((Integer) obj2).intValue();
                cc1.C((SystemNetworkSpeedDisplayMode) obj4, (Function1) obj3, (Composer) obj, RecomposeScopeImplKt.updateChangedFlags(i2 | 1));
                return Unit.INSTANCE;
            case 2:
                ((Integer) obj2).intValue();
                cc1.r((PlayerDefaultViewMode) obj4, (Function1) obj3, (Composer) obj, RecomposeScopeImplKt.updateChangedFlags(i2 | 1));
                return Unit.INSTANCE;
            case 3:
                ((Integer) obj2).intValue();
                cc1.D((SystemNetworkSpeedPosition) obj4, (Function1) obj3, (Composer) obj, RecomposeScopeImplKt.updateChangedFlags(i2 | 1));
                return Unit.INSTANCE;
            case 4:
                ((Integer) obj2).intValue();
                cc1.t((PlayerResizeMode) obj4, (Function1) obj3, (Composer) obj, RecomposeScopeImplKt.updateChangedFlags(i2 | 1));
                return Unit.INSTANCE;
            case 5:
                ((Integer) obj2).intValue();
                cc1.s((PlayerFrameRateMatchingMode) obj4, (Function1) obj3, (Composer) obj, RecomposeScopeImplKt.updateChangedFlags(i2 | 1));
                return Unit.INSTANCE;
            case 6:
                ((Integer) obj2).intValue();
                cc1.J((VideoVersionPrioritySettings) obj4, (Function1) obj3, (Composer) obj, RecomposeScopeImplKt.updateChangedFlags(i2 | 1));
                return Unit.INSTANCE;
            case 7:
                ((Integer) obj2).intValue();
                cc1.B((SubtitleVersionPrioritySettings) obj4, (Function1) obj3, (Composer) obj, RecomposeScopeImplKt.updateChangedFlags(i2 | 1));
                return Unit.INSTANCE;
            case 8:
                ((Integer) obj2).intValue();
                cc1.g((AudioVersionPrioritySettings) obj4, (Function1) obj3, (Composer) obj, RecomposeScopeImplKt.updateChangedFlags(i2 | 1));
                return Unit.INSTANCE;
            case 9:
                ((Integer) obj2).getClass();
                lh1.c((oh1) obj4, (Function2) obj3, (Composer) obj, RecomposeScopeImplKt.updateChangedFlags(i2 | 1));
                return Unit.INSTANCE;
            case 10:
                ((Integer) obj2).getClass();
                in1.a((String) obj4, (Modifier) obj3, (Composer) obj, RecomposeScopeImplKt.updateChangedFlags(i2 | 1));
                return Unit.INSTANCE;
            case 11:
                ((Integer) obj2).intValue();
                gr1.b((w81) obj4, (Function0) obj3, (Composer) obj, RecomposeScopeImplKt.updateChangedFlags(i2 | 1));
                return Unit.INSTANCE;
            case 12:
                ((Integer) obj2).getClass();
                gr1.h((String) obj4, (e62) obj3, (Composer) obj, RecomposeScopeImplKt.updateChangedFlags(i2 | 1));
                return Unit.INSTANCE;
            case 13:
                return SearchBarKt.DetectClickFromInteractionSource$lambda$73((InteractionSource) obj4, (Function0) obj3, i2, (Composer) obj, ((Integer) obj2).intValue());
            case 14:
                ((Integer) obj2).getClass();
                gy1.b((Function0) obj4, (FocusRequester) obj3, (Composer) obj, RecomposeScopeImplKt.updateChangedFlags(i2 | 1));
                return Unit.INSTANCE;
            case 15:
                return SheetDefaultsKt.DragHandleWithTooltip$lambda$1((ColumnScope) obj4, (Function2) obj3, i2, (Composer) obj, ((Integer) obj2).intValue());
            case 16:
                return TabKt.TabBaselineLayout$lambda$11((Function2) obj4, (Function2) obj3, i2, (Composer) obj, ((Integer) obj2).intValue());
            case 17:
                return TextKt.ProvideTextStyle$lambda$20((TextStyle) obj4, (Function2) obj3, i2, (Composer) obj, ((Integer) obj2).intValue());
            case 18:
                return ToggleableAppBarItem.MenuContent$lambda$3((ToggleableAppBarItem) obj4, (AppBarMenuState) obj3, i2, (Composer) obj, ((Integer) obj2).intValue());
            default:
                return Transition.animateTo$lambda$3((Transition) obj4, obj3, i2, (Composer) obj, ((Integer) obj2).intValue());
        }
    }
}
