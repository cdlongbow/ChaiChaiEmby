package defpackage;

import androidx.compose.animation.core.AnimationVector1D;
import androidx.compose.animation.core.AnimationVector2D;
import androidx.compose.animation.core.AnimationVector4D;
import androidx.compose.animation.core.SeekableTransitionState;
import androidx.compose.animation.core.TransitionKt;
import androidx.compose.animation.core.VectorConvertersKt;
import androidx.compose.foundation.gestures.TransformGestureDetectorKt;
import androidx.compose.foundation.gestures.TransformableKt;
import androidx.compose.ui.focus.FocusState;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.geometry.Rect;
import androidx.compose.ui.geometry.Size;
import androidx.compose.ui.input.pointer.PointerInputChange;
import androidx.compose.ui.layout.Placeable;
import androidx.compose.ui.unit.Dp;
import androidx.compose.ui.unit.DpOffset;
import androidx.compose.ui.unit.IntOffset;
import androidx.compose.ui.unit.IntSize;
import com.dh.myembyapp.data.model.AudioPrioritySortType;
import com.dh.myembyapp.data.model.SubtitlePrioritySortType;
import com.dh.myembyapp.data.model.VideoQualityStandard;
import com.dh.myembyapp.data.model.VideoVersionPrioritySettings;
import com.dh.myembyapp.data.preferences.UserPreferences;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class y82 implements Function1 {
    public final /* synthetic */ int a;

    public /* synthetic */ y82(int i) {
        this.a = i;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.a) {
            case 0:
                ((Boolean) obj).booleanValue();
                return Unit.INSTANCE;
            case 1:
                return Boolean.valueOf(TransformGestureDetectorKt.calculateCentroid$lambda$0((PointerInputChange) obj));
            case 2:
                return Boolean.valueOf(TransformableKt.transformable$lambda$0((Offset) obj));
            case 3:
                return TransitionKt.SeekableTransitionStateTotalDurationChanged$lambda$0((SeekableTransitionState) obj);
            case 4:
                ((FocusState) obj).getClass();
                return Unit.INSTANCE;
            case 5:
                ((FocusState) obj).getClass();
                return Unit.INSTANCE;
            case 6:
                ((FocusState) obj).getClass();
                return Unit.INSTANCE;
            case 7:
                return UserPreferences.saveAudioVersionPrioritySettings$lambda$0$0((AudioPrioritySortType) obj);
            case 8:
                return UserPreferences.saveSubtitleVersionPrioritySettings$lambda$0$0((SubtitlePrioritySortType) obj);
            case 9:
                return Unit.INSTANCE;
            case 10:
                return VectorConvertersKt.FloatToVector$lambda$0(((Float) obj).floatValue());
            case 11:
                return VectorConvertersKt.IntToVector$lambda$0(((Integer) obj).intValue());
            case 12:
                return Integer.valueOf(VectorConvertersKt.IntToVector$lambda$1((AnimationVector1D) obj));
            case 13:
                return VectorConvertersKt.DpToVector$lambda$0((Dp) obj);
            case 14:
                return VectorConvertersKt.DpToVector$lambda$1((AnimationVector1D) obj);
            case 15:
                return VectorConvertersKt.DpOffsetToVector$lambda$0((DpOffset) obj);
            case 16:
                return VectorConvertersKt.DpOffsetToVector$lambda$1((AnimationVector2D) obj);
            case 17:
                return VectorConvertersKt.SizeToVector$lambda$0((Size) obj);
            case 18:
                return VectorConvertersKt.SizeToVector$lambda$1((AnimationVector2D) obj);
            case 19:
                return VectorConvertersKt.OffsetToVector$lambda$0((Offset) obj);
            case 20:
                return VectorConvertersKt.OffsetToVector$lambda$1((AnimationVector2D) obj);
            case 21:
                return VectorConvertersKt.IntOffsetToVector$lambda$0((IntOffset) obj);
            case 22:
                return VectorConvertersKt.IntOffsetToVector$lambda$1((AnimationVector2D) obj);
            case 23:
                return VectorConvertersKt.IntSizeToVector$lambda$0((IntSize) obj);
            case 24:
                return VectorConvertersKt.IntSizeToVector$lambda$1((AnimationVector2D) obj);
            case 25:
                return VectorConvertersKt.RectToVector$lambda$0((Rect) obj);
            case 26:
                return VectorConvertersKt.RectToVector$lambda$1((AnimationVector4D) obj);
            case 27:
                return Float.valueOf(((AnimationVector1D) obj).getValue());
            case 28:
                return VideoVersionPrioritySettings.Companion.buildQualityPriorityText$lambda$0$2((VideoQualityStandard) obj);
            default:
                return WideNavigationRailKt.AnonymousClass1.AnonymousClass2.measure_3p2s80s$lambda$0((Placeable.PlacementScope) obj);
        }
    }
}
