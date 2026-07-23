package defpackage;

import android.animation.Animator;
import android.content.Context;
import android.view.SurfaceView;
import android.view.TextureView;
import androidx.compose.animation.core.AnimationKt;
import androidx.compose.animation.core.AnimationVector;
import androidx.compose.foundation.AndroidExternalSurface_androidKt;
import androidx.compose.foundation.gestures.AnchoredDraggableDefaults;
import androidx.compose.foundation.gestures.AnchoredDraggableKt;
import androidx.compose.material3.AppBarKt;
import androidx.compose.material3.internal.AccessibilityServiceStateProvider_androidKt;
import androidx.compose.material3.internal.AccessibilityUtilKt;
import androidx.compose.material3.internal.AnchoredDraggableState;
import androidx.compose.ui.input.pointer.PointerType;
import androidx.compose.ui.semantics.SemanticsPropertyReceiver;
import androidx.compose.ui.text.AnnotatedString;
import androidx.compose.ui.text.AnnotatedStringKt;
import androidx.core.animation.AnimatorKt;
import androidx.lifecycle.Lifecycle;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class a1 implements Function1 {
    public final /* synthetic */ int a;

    public /* synthetic */ a1(int i) {
        this.a = i;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.a) {
            case 0:
                return AccessibilityServiceStateProvider_androidKt.ObserveState$lambda$6$lambda$5((Lifecycle.Event) obj);
            case 1:
                return AccessibilityUtilKt.IncreaseHorizontalSemanticsBounds$lambda$2((SemanticsPropertyReceiver) obj);
            case 2:
                return AccessibilityUtilKt.IncreaseVerticalSemanticsBounds$lambda$5((SemanticsPropertyReceiver) obj);
            case 3:
                return ActivityNavigator.hostActivity$lambda$0((Context) obj);
            case 4:
                ((Long) obj).longValue();
                return Unit.INSTANCE;
            case 5:
                ((Long) obj).longValue();
                return Unit.INSTANCE;
            case 6:
                ((Boolean) obj).booleanValue();
                return Unit.INSTANCE;
            case 7:
                ((String) obj).getClass();
                return Unit.INSTANCE;
            case 8:
                ((Long) obj).longValue();
                return Unit.INSTANCE;
            case 9:
                return Float.valueOf(AnchoredDraggableDefaults.PositionalThreshold$lambda$0(((Float) obj).floatValue()));
            case 10:
                return Boolean.valueOf(AnchoredDraggableKt.AnchoredDraggableState$lambda$2(obj));
            case 11:
                return Boolean.valueOf(AnchoredDraggableKt.AnchoredDraggableState$lambda$0(obj));
            case 12:
                return Boolean.valueOf(AnchoredDraggableKt.AlwaysDrag$lambda$0((PointerType) obj));
            case 13:
                return Float.valueOf(AnchoredDraggableKt.GetOrNan$lambda$0(((Integer) obj).intValue()));
            case 14:
                return Boolean.valueOf(AnchoredDraggableState._init_$lambda$0(obj));
            case 15:
                return Boolean.valueOf(androidx.compose.foundation.gestures.AnchoredDraggableState.confirmValueChange$lambda$0(obj));
            case 16:
                return Boolean.valueOf(AnchoredDraggableState._init_$lambda$1(obj));
            case 17:
                return Boolean.valueOf(androidx.compose.foundation.gestures.AnchoredDraggableState._init_$lambda$0(obj));
            case 18:
                return Boolean.valueOf(androidx.compose.foundation.gestures.AnchoredDraggableState.Companion.Saver$lambda$2(obj));
            case 19:
                return Boolean.valueOf(androidx.compose.foundation.gestures.AnchoredDraggableState.Companion.Saver$lambda$5(obj));
            case 20:
                return androidx.compose.foundation.gestures.AnchoredDraggableState.Companion.Saver$lambda$1(obj);
            case 21:
                return AndroidExternalSurface_androidKt.AndroidExternalSurface_58FFMhA$lambda$1$0((SurfaceView) obj);
            case 22:
                return AndroidExternalSurface_androidKt.AndroidEmbeddedExternalSurface_sv6N_fY$lambda$0$0((Context) obj);
            case 23:
                return AndroidExternalSurface_androidKt.AndroidEmbeddedExternalSurface_sv6N_fY$lambda$1$0((TextureView) obj);
            case 24:
                return AnimationKt.createAnimation$lambda$0((AnimationVector) obj);
            case 25:
                return AnimationKt.createAnimation$lambda$1((AnimationVector) obj);
            case 26:
                return AnimatorKt.addPauseListener$lambda$0((Animator) obj);
            case 27:
                return AnimatorKt.addPauseListener$lambda$1((Animator) obj);
            case 28:
                return Boolean.valueOf(AnnotatedStringKt.substringWithoutParagraphStyles$lambda$0((AnnotatedString.Annotation) obj));
            default:
                return AppBarKt.TopAppBarLayout_lyUyIHI$lambda$51$lambda$41$lambda$40((SemanticsPropertyReceiver) obj);
        }
    }
}
