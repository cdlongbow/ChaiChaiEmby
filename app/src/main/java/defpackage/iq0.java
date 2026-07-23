package defpackage;

import androidx.compose.foundation.gestures.IndirectPointerInputEventSmoother;
import androidx.compose.foundation.lazy.LazyListMeasureKt;
import androidx.compose.foundation.lazy.LazyListState;
import androidx.compose.foundation.lazy.grid.LazyGridIntervalContent;
import androidx.compose.foundation.lazy.grid.LazyGridItemSpanScope;
import androidx.compose.foundation.lazy.grid.LazyGridMeasureKt;
import androidx.compose.foundation.lazy.grid.LazyGridState;
import androidx.compose.foundation.lazy.grid.LazyGridStateKt;
import androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridMeasureKt;
import androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridState;
import androidx.compose.foundation.text.LegacyTextFieldState;
import androidx.compose.foundation.text.input.TextFieldBuffer;
import androidx.compose.foundation.text.input.internal.ImeEditCommand_androidKt;
import androidx.compose.foundation.text.input.internal.LegacyTextInputMethodRequest;
import androidx.compose.material3.IconButtonKt;
import androidx.compose.material3.IconKt;
import androidx.compose.ui.graphics.drawscope.ContentDrawScope;
import androidx.compose.ui.input.indirect.IndirectPointerInputChange;
import androidx.compose.ui.layout.Placeable;
import androidx.compose.ui.semantics.SemanticsPropertyReceiver;
import androidx.compose.ui.text.input.TextFieldValue;
import com.dh.myembyapp.data.model.Library;
import java.util.List;
import kotlin.jvm.functions.Function1;
import kotlin.time.InstantKt;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class iq0 implements Function1 {
    public final /* synthetic */ int a;

    public /* synthetic */ iq0(int i) {
        this.a = i;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.a) {
            case 0:
                Library library = (Library) obj;
                library.getClass();
                return library.getId();
            case 1:
                rx0 rx0Var = (rx0) obj;
                rx0Var.getClass();
                return rx0Var.getLibrary().getId();
            case 2:
                return ((rx0) obj).getLibrary().getId();
            case 3:
                return IconButtonKt.SurfaceIconToggleButton$lambda$26$lambda$25((SemanticsPropertyReceiver) obj);
            case 4:
                return IconButtonKt.OutlinedIconToggleButton$lambda$20$lambda$19((SemanticsPropertyReceiver) obj);
            case 5:
                return IconButtonKt.FilledIconToggleButton$lambda$12$lambda$11((SemanticsPropertyReceiver) obj);
            case 6:
                return IconButtonKt.FilledTonalIconToggleButton$lambda$16$lambda$15((SemanticsPropertyReceiver) obj);
            case 7:
                return IconButtonKt.SurfaceIconButton$lambda$23$lambda$22((SemanticsPropertyReceiver) obj);
            case 8:
                return IconKt.Icon$lambda$12$lambda$11$lambda$9$lambda$7((ContentDrawScope) obj);
            case 9:
                return ImeEditCommand_androidKt.finishComposingText$lambda$0((TextFieldBuffer) obj);
            case 10:
                return Float.valueOf(IndirectPointerInputEventSmoother.smoothEventPosition_tuRUvjQ$lambda$1((IndirectPointerInputChange) obj));
            case 11:
                return Float.valueOf(IndirectPointerInputEventSmoother.smoothEventPosition_tuRUvjQ$lambda$2((IndirectPointerInputChange) obj));
            case 12:
                return Boolean.valueOf(InstantKt.parseIso$lambda$0(((Character) obj).charValue()));
            case 13:
                return Boolean.valueOf(InstantKt.parseIso$lambda$2(((Character) obj).charValue()));
            case 14:
                return Boolean.valueOf(InstantKt.parseIso$lambda$4(((Character) obj).charValue()));
            case 15:
                return Boolean.valueOf(InstantKt.parseIso$lambda$6(((Character) obj).charValue()));
            case 16:
                return Boolean.valueOf(InstantKt.parseIso$lambda$8(((Character) obj).charValue()));
            case 17:
                return Boolean.valueOf(InstantKt.parseIso$lambda$10(((Character) obj).charValue()));
            case 18:
                return LazyGridIntervalContent.stickyHeader$lambda$1((LazyGridItemSpanScope) obj);
            case 19:
                return LazyGridMeasureKt.measureLazyGrid_t1x4au0$lambda$2((Placeable.PlacementScope) obj);
            case 20:
                return LazyGridState.Saver$lambda$1((List) obj);
            case 21:
                return LazyGridStateKt.EmptyLazyGridLayoutInfo$lambda$0(((Integer) obj).intValue());
            case 22:
                return Integer.valueOf(LazyGridStateKt.EmptyLazyGridLayoutInfo$lambda$1(((Integer) obj).intValue()));
            case 23:
                return LazyListMeasureKt.measureLazyList_pIk1_oM$lambda$2((Placeable.PlacementScope) obj);
            case 24:
                ((Integer) obj).getClass();
                return null;
            case 25:
                return LazyListState.Saver$lambda$1((List) obj);
            case 26:
                return LazyStaggeredGridMeasureKt.measure$lambda$0$0((Placeable.PlacementScope) obj);
            case 27:
                return LazyStaggeredGridState.Saver$lambda$1((List) obj);
            case 28:
                return LegacyTextFieldState.onValueChangeOriginal$lambda$0((TextFieldValue) obj);
            default:
                return LegacyTextInputMethodRequest.onEditCommand$lambda$0((List) obj);
        }
    }
}
