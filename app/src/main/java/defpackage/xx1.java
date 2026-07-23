package defpackage;

import android.os.Parcel;
import android.view.View;
import androidx.arch.core.util.Function;
import androidx.compose.animation.core.AnimationScope;
import androidx.compose.animation.core.SeekableTransitionState;
import androidx.compose.animation.core.SuspendAnimationKt;
import androidx.compose.animation.core.Transition;
import androidx.compose.animation.core.TransitionKt;
import androidx.compose.animation.core.TwoWayConverter;
import androidx.compose.foundation.gestures.UpdatableAnimationState;
import androidx.compose.foundation.interaction.MutableInteractionSource;
import androidx.compose.foundation.layout.WindowInsetsHolder;
import androidx.compose.foundation.style.StyleOuterNode;
import androidx.compose.foundation.text.TextFieldPressGestureFilterKt;
import androidx.compose.foundation.text.TextLinkScope;
import androidx.compose.material3.AnalogTimePickerState;
import androidx.compose.material3.TimePickerColors;
import androidx.compose.material3.TimePickerKt;
import androidx.compose.material3.TooltipScopeImpl;
import androidx.compose.material3.internal.TextFieldImplKt;
import androidx.compose.runtime.DisposableEffectScope;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.snapshots.SnapshotStateList$Companion$CREATOR$1;
import androidx.compose.ui.draw.CacheDrawScope;
import androidx.compose.ui.graphics.ColorProducer;
import androidx.compose.ui.graphics.GraphicsLayerScope;
import androidx.compose.ui.graphics.Outline;
import androidx.compose.ui.graphics.Shape;
import androidx.compose.ui.graphics.drawscope.ContentDrawScope;
import androidx.compose.ui.graphics.drawscope.DrawScope;
import androidx.compose.ui.node.TraversableNode;
import androidx.compose.ui.semantics.SemanticsPropertyReceiver;
import androidx.compose.ui.text.AnnotatedString;
import androidx.compose.ui.text.font.TypefaceRequest;
import androidx.compose.ui.text.font.TypefaceRequestCache;
import androidx.compose.ui.text.font.TypefaceResult;
import androidx.lifecycle.MediatorLiveData;
import androidx.lifecycle.Transformations;
import com.dh.myembyapp.data.model.ServerConfig;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Ref;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class xx1 implements Function1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ xx1(MutableState mutableState, MutableInteractionSource mutableInteractionSource) {
        this.a = 6;
        this.c = mutableState;
        this.b = mutableInteractionSource;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i = this.a;
        Object obj2 = this.c;
        Object obj3 = this.b;
        switch (i) {
            case 0:
                ServerConfig serverConfig = (ServerConfig) obj;
                serverConfig.getClass();
                ((hy1) obj3).g(serverConfig);
                ((MutableState) obj2).setValue(serverConfig);
                return Unit.INSTANCE;
            case 1:
                return SnapshotStateList$Companion$CREATOR$1.createFromParcel$lambda$0((Parcel) obj3, (ClassLoader) obj2, ((Integer) obj).intValue());
            case 2:
                return Boolean.valueOf(StyleOuterNode.resolveInheritedStyle$lambda$1((Ref.ObjectRef) obj3, (StyleOuterNode) obj2, (TraversableNode) obj));
            case 3:
                return SuspendAnimationKt.animate$lambda$1((Function2) obj3, (TwoWayConverter) obj2, (AnimationScope) obj);
            case 4:
                return TextFieldImplKt.textFieldBackground$lambda$24$lambda$23((Outline) obj3, (ColorProducer) obj2, (DrawScope) obj);
            case 5:
                return TextFieldImplKt.textFieldBackground$lambda$24((Shape) obj3, (ColorProducer) obj2, (CacheDrawScope) obj);
            case 6:
                return TextFieldPressGestureFilterKt.tapPressTextFieldModifier$lambda$0$1$0((MutableState) obj2, (MutableInteractionSource) obj3, (DisposableEffectScope) obj);
            case 7:
                return TextLinkScope.clipLink$lambda$0((TextLinkScope) obj3, (AnnotatedString.Range) obj2, (GraphicsLayerScope) obj);
            case 8:
                return TimePickerKt.drawSelector$lambda$61((AnalogTimePickerState) obj3, (TimePickerColors) obj2, (ContentDrawScope) obj);
            case 9:
                return TooltipScopeImpl.drawCaret$lambda$0((Function2) obj3, (TooltipScopeImpl) obj2, (CacheDrawScope) obj);
            case 10:
                return Transformations.map$lambda$0((MediatorLiveData) obj3, (Function1) obj2, obj);
            case 11:
                return Transformations.distinctUntilChanged$lambda$0((MediatorLiveData) obj3, (Ref.BooleanRef) obj2, obj);
            case 12:
                return Transformations.map$lambda$1((MediatorLiveData) obj3, (Function) obj2, obj);
            case 13:
                return Transition.animateTo$lambda$2$0((CoroutineScope) obj3, (Transition) obj2, (DisposableEffectScope) obj);
            case 14:
                return TransitionKt.rememberTransition$lambda$1$0((SeekableTransitionState) obj3, (CoroutineScope) obj2, (DisposableEffectScope) obj);
            case 15:
                return TransitionKt.createChildTransitionInternal$lambda$1$0((Transition) obj3, (Transition) obj2, (DisposableEffectScope) obj);
            case 16:
                return TransitionKt.createDeferredAnimation$lambda$1$0((Transition) obj3, (Transition.DeferredAnimation) obj2, (DisposableEffectScope) obj);
            case 17:
                return TransitionKt.rememberTransition$lambda$1$0$0(obj3, (CoroutineScope) obj2, (Function0) obj);
            case 18:
                return TransitionKt.createTransitionAnimation$lambda$1$0((Transition) obj3, (Transition.TransitionAnimationState) obj2, (DisposableEffectScope) obj);
            case 19:
                return TypefaceRequestCache.runCached$lambda$1((TypefaceRequestCache) obj3, (TypefaceRequest) obj2, (TypefaceResult) obj);
            case 20:
                return UpdatableAnimationState.animateToZero$lambda$2((UpdatableAnimationState) obj3, (Function1) obj2, ((Long) obj).longValue());
            case 21:
                return WideNavigationRailKt.Scrim_3J_VO9M$lambda$33$lambda$32((String) obj3, (MutableState) obj2, (SemanticsPropertyReceiver) obj);
            default:
                return WindowInsetsHolder.Companion.current$lambda$0$0((WindowInsetsHolder) obj3, (View) obj2, (DisposableEffectScope) obj);
        }
    }

    public /* synthetic */ xx1(int i, Object obj, Object obj2) {
        this.a = i;
        this.b = obj;
        this.c = obj2;
    }
}
