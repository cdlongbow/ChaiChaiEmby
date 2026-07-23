package defpackage;

import androidx.compose.animation.core.InfiniteTransition;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.lazy.layout.LazySaveableStateHolderKt;
import androidx.compose.foundation.pager.PagerLazyLayoutItemProvider;
import androidx.compose.foundation.text.CoreTextFieldKt;
import androidx.compose.foundation.text.TextLinkScope;
import androidx.compose.foundation.text.selection.TextFieldSelectionManager;
import androidx.compose.material3.ClickableAppBarItem;
import androidx.compose.material3.CustomAppBarItem;
import androidx.compose.material3.MaterialTheme;
import androidx.compose.material3.SegmentedButtonDefaults;
import androidx.compose.material3.TextKt;
import androidx.compose.material3.ToggleableAppBarItem;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.text.font.FontWeight;
import androidx.compose.ui.unit.Dp;
import com.dh.myembyapp.data.model.MediaItem;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class yc implements Function2 {
    public final /* synthetic */ int a;
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ yc(int i, MutableState mutableState) {
        this.a = 7;
        this.b = i;
        this.c = mutableState;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        int i = this.a;
        int i2 = this.b;
        Object obj3 = this.c;
        switch (i) {
            case 0:
                ((Integer) obj2).intValue();
                bd.a((vc) obj3, (Composer) obj, RecomposeScopeImplKt.updateChangedFlags(1 | i2));
                return Unit.INSTANCE;
            case 1:
                return ClickableAppBarItem.AppbarContent$lambda$0((ClickableAppBarItem) obj3, i2, (Composer) obj, ((Integer) obj2).intValue());
            case 2:
                ((Integer) obj2).intValue();
                lq.b((MediaItem) obj3, (Composer) obj, RecomposeScopeImplKt.updateChangedFlags(1 | i2));
                return Unit.INSTANCE;
            case 3:
                return CoreTextFieldKt.TextFieldCursorHandle$lambda$4((TextFieldSelectionManager) obj3, i2, (Composer) obj, ((Integer) obj2).intValue());
            case 4:
                return CustomAppBarItem.AppbarContent$lambda$0((CustomAppBarItem) obj3, i2, (Composer) obj, ((Integer) obj2).intValue());
            case 5:
                ((Integer) obj2).getClass();
                u90.D((n40) obj3, (Composer) obj, RecomposeScopeImplKt.updateChangedFlags(1 | i2));
                return Unit.INSTANCE;
            case 6:
                ((Integer) obj2).intValue();
                u90.D0((aa0) obj3, (Composer) obj, RecomposeScopeImplKt.updateChangedFlags(1 | i2));
                return Unit.INSTANCE;
            case 7:
                MutableState mutableState = (MutableState) obj3;
                Composer composer = (Composer) obj;
                int iIntValue = ((Integer) obj2).intValue();
                if (composer.shouldExecute((iIntValue & 3) != 2, iIntValue & 1)) {
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(545658866, iIntValue, -1, "com.dh.myembyapp.ui.screens.detail.OtherServerResourceRow.<anonymous>.<anonymous>.<anonymous>.<anonymous> (DetailScreen.kt:3744)");
                    }
                    TextKt.m3048TextNvy7gAk(String.valueOf(i2), PaddingKt.m1000paddingVpY3zN4(Modifier.INSTANCE, Dp.m7813constructorimpl(10.0f), Dp.m7813constructorimpl(6.0f)), ((Boolean) mutableState.getValue()).booleanValue() ? u90.c : Color.m5151copywmQWz5c$default(Color.INSTANCE.m5189getWhite0d7_KjU(), 0.86f, 0.0f, 0.0f, 0.0f, 14, null), null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, TextStyle.m7288copyp1EtxEg$default(MaterialTheme.INSTANCE.getTypography(composer, MaterialTheme.$stable).getLabelMedium(), 0L, 0L, FontWeight.INSTANCE.getSemiBold(), null, null, null, null, 0L, null, null, null, 0L, null, null, null, 0, 0, 0L, null, null, null, 0, 0, null, 16777211, null), composer, 48, 0, 131064);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                } else {
                    composer.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 8:
                return DialogHostKt.DialogHost$lambda$7((DialogNavigator) obj3, i2, (Composer) obj, ((Integer) obj2).intValue());
            case 9:
                return InfiniteTransition.run$lambda$2((InfiniteTransition) obj3, i2, (Composer) obj, ((Integer) obj2).intValue());
            case 10:
                return LazySaveableStateHolderKt.LazySaveableStateHolderProvider$lambda$2((Function3) obj3, i2, (Composer) obj, ((Integer) obj2).intValue());
            case 11:
                return PagerLazyLayoutItemProvider.Item$lambda$0((PagerLazyLayoutItemProvider) obj3, i2, (Composer) obj, ((Integer) obj2).intValue());
            case 12:
                return SegmentedButtonDefaults.ActiveIcon$lambda$1((SegmentedButtonDefaults) obj3, i2, (Composer) obj, ((Integer) obj2).intValue());
            case 13:
                return TextLinkScope.LinksComposables$lambda$1((TextLinkScope) obj3, i2, (Composer) obj, ((Integer) obj2).intValue());
            default:
                return ToggleableAppBarItem.AppbarContent$lambda$0((ToggleableAppBarItem) obj3, i2, (Composer) obj, ((Integer) obj2).intValue());
        }
    }

    public /* synthetic */ yc(Object obj, int i, int i2) {
        this.a = i2;
        this.c = obj;
        this.b = i;
    }
}
