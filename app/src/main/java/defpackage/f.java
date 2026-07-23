package defpackage;

import androidx.compose.foundation.lazy.layout.LazyLayoutBeyondBoundsProviderModifierNode;
import androidx.compose.foundation.text.BasicTextFieldKt;
import androidx.compose.foundation.text.TextFieldSizeKt;
import androidx.compose.foundation.text.input.internal.TextFieldTextLayoutModifierNode;
import androidx.compose.foundation.text.modifiers.TextAnnotatedStringNode;
import androidx.compose.foundation.text.modifiers.TextStringSimpleNode;
import androidx.compose.material3.AppBarKt;
import androidx.compose.material3.BadgeKt;
import androidx.compose.material3.ClockFaceSizeModifier;
import androidx.compose.material3.DragHandleKt;
import androidx.compose.material3.ExposedDropdownMenuKt$ExposedDropdownMenuBox$scope$1$1;
import androidx.compose.material3.SliderDefaults;
import androidx.compose.material3.TooltipKt;
import androidx.compose.material3.internal.TextFieldImplKt;
import androidx.compose.ui.layout.Placeable;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class f implements Function1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Placeable b;

    public /* synthetic */ f(int i, Placeable placeable) {
        this.a = i;
        this.b = placeable;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i = this.a;
        Placeable placeable = this.b;
        switch (i) {
            case 0:
                Placeable.PlacementScope.placeRelative$default((Placeable.PlacementScope) obj, this.b, 0, 0, 0.0f, 4, null);
                return Unit.INSTANCE;
            case 1:
                return AppBarKt.BottomAppBarLayout_t5fmz9U$lambda$23$lambda$22$lambda$21(placeable, (Placeable.PlacementScope) obj);
            case 2:
                return BadgeKt.badgeBounds$lambda$7$lambda$6(placeable, (Placeable.PlacementScope) obj);
            case 3:
                return BasicTextFieldKt.minHeightForSingleLineField$lambda$0$0(placeable, (Placeable.PlacementScope) obj);
            case 4:
                return ClockFaceSizeModifier.measure_3p2s80s$lambda$0(placeable, (Placeable.PlacementScope) obj);
            case 5:
                Placeable.PlacementScope.place$default((Placeable.PlacementScope) obj, this.b, 0, 0, 0.0f, 4, null);
                return Unit.INSTANCE;
            case 6:
                return DragHandleKt.VerticalDragHandle$lambda$13$lambda$12$lambda$11(placeable, (Placeable.PlacementScope) obj);
            case 7:
                return ExposedDropdownMenuKt$ExposedDropdownMenuBox$scope$1$1.exposedDropdownSize$lambda$3$lambda$2(placeable, (Placeable.PlacementScope) obj);
            case 8:
                return LazyLayoutBeyondBoundsProviderModifierNode.measure_3p2s80s$lambda$0(placeable, (Placeable.PlacementScope) obj);
            case 9:
                return SliderDefaults.TrackImpl_xlyIBlM$lambda$44$lambda$43$lambda$42(placeable, (Placeable.PlacementScope) obj);
            case 10:
                return SliderDefaults.TrackImpl_VvwgllI$lambda$29$lambda$28$lambda$27(placeable, (Placeable.PlacementScope) obj);
            case 11:
                return TextAnnotatedStringNode.measure_3p2s80s$lambda$0$0(placeable, (Placeable.PlacementScope) obj);
            case 12:
                return TextFieldImplKt.textFieldLabelMinHeight$lambda$26$lambda$25(placeable, (Placeable.PlacementScope) obj);
            case 13:
                return TextFieldSizeKt.legacyTextFieldMinSize$lambda$0$4$0$0(placeable, (Placeable.PlacementScope) obj);
            case 14:
                return TextFieldTextLayoutModifierNode.measure_3p2s80s$lambda$0(placeable, (Placeable.PlacementScope) obj);
            case 15:
                return TextStringSimpleNode.measure_3p2s80s$lambda$0$0(placeable, (Placeable.PlacementScope) obj);
            default:
                return TooltipKt.layoutCaret_J5j9r9c$lambda$22$lambda$21(placeable, (Placeable.PlacementScope) obj);
        }
    }
}
