package defpackage;

import android.content.Context;
import android.content.Intent;
import android.view.View;
import androidx.compose.animation.core.Animatable;
import androidx.compose.animation.core.InfiniteTransition;
import androidx.compose.animation.core.InfiniteTransitionKt;
import androidx.compose.foundation.AbstractClickableNode;
import androidx.compose.foundation.BorderModifierNode;
import androidx.compose.foundation.ClickableKt;
import androidx.compose.foundation.FocusableNode;
import androidx.compose.foundation.GestureConnection;
import androidx.compose.foundation.gestures.BringIntoViewRequestPriorityQueue;
import androidx.compose.foundation.gestures.ContentInViewNode;
import androidx.compose.foundation.interaction.Interaction;
import androidx.compose.foundation.interaction.MutableInteractionSource;
import androidx.compose.foundation.interaction.PressInteraction;
import androidx.compose.foundation.lazy.layout.AwaitFirstLayoutModifier;
import androidx.compose.foundation.text.BasicSecureTextField_androidKt;
import androidx.compose.foundation.text.BasicSecureTextField_androidKt$platformAllowsRevealLastTyped$settingsObserver$1$1;
import androidx.compose.foundation.text.BasicTextFieldKt;
import androidx.compose.foundation.text.ContentResolverForSecureTextField;
import androidx.compose.foundation.text.CoreTextFieldKt;
import androidx.compose.foundation.text.LegacyTextFieldState;
import androidx.compose.foundation.text.input.internal.CoreTextFieldSemanticsModifierNode;
import androidx.compose.material3.BottomSheetScaffoldKt;
import androidx.compose.material3.DatePickerColors;
import androidx.compose.material3.DatePickerKt;
import androidx.compose.material3.DateRangePickerDefaults;
import androidx.compose.material3.DefaultModalWideNavigationRailOverride;
import androidx.compose.material3.ExposedDropdownMenu_androidKt;
import androidx.compose.material3.IndicatorLineNode;
import androidx.compose.material3.SelectedRangeInfo;
import androidx.compose.material3.SheetState;
import androidx.compose.material3.TooltipState;
import androidx.compose.material3.internal.BasicTooltipKt;
import androidx.compose.runtime.DisposableEffectScope;
import androidx.compose.ui.focus.FocusState;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.graphics.Brush;
import androidx.compose.ui.graphics.Outline;
import androidx.compose.ui.graphics.Path;
import androidx.compose.ui.graphics.drawscope.ContentDrawScope;
import androidx.compose.ui.input.indirect.IndirectPointerInputChange;
import androidx.compose.ui.input.pointer.PointerInputChange;
import androidx.compose.ui.semantics.SemanticsPropertyReceiver;
import androidx.compose.ui.spatial.RelativeLayoutBounds;
import androidx.compose.ui.text.AnnotatedString;
import androidx.compose.ui.text.font.FontFamilyResolverImpl;
import androidx.compose.ui.text.font.TypefaceRequest;
import androidx.compose.ui.text.input.EditCommand;
import androidx.compose.ui.text.input.EditProcessor;
import androidx.compose.ui.text.input.TextFieldValue;
import androidx.lifecycle.ViewModelKt;
import com.dh.myembyapp.server.SearchInputServerManager;
import java.io.IOException;
import java.util.List;
import java.util.concurrent.CompletableFuture;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Ref;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Deferred;
import kotlinx.coroutines.android.HandlerContext;
import kotlinx.coroutines.future.FutureKt;
import okhttp3.internal.cache.DiskLruCache;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class b implements Function1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ b(int i, Object obj, Object obj2) {
        this.a = i;
        this.b = obj;
        this.c = obj2;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i = this.a;
        Object obj2 = this.c;
        Object obj3 = this.b;
        switch (i) {
            case 0:
                return AbstractClickableNode.handlePressInteractionCancel$lambda$0$0$0((MutableInteractionSource) obj3, (PressInteraction.Cancel) obj2, (Throwable) obj);
            case 1:
                ((DisposableEffectScope) obj).getClass();
                return new r6(0, (SearchInputServerManager) obj3, (p7) obj2);
            case 2:
                Function1 function1 = (Function1) obj3;
                vc vcVar = (vc) obj2;
                Intent intent = (Intent) obj;
                intent.getClass();
                if (function1 != null) {
                    function1.invoke(intent);
                } else {
                    intent.addFlags(268435456);
                    vcVar.a.startActivity(intent);
                }
                return Unit.INSTANCE;
            case 3:
                return AwaitFirstLayoutModifier.Node.requestOnAfterLayoutCallback$lambda$0((AwaitFirstLayoutModifier.Node) obj3, (AwaitFirstLayoutModifier) obj2, (RelativeLayoutBounds) obj);
            case 4:
                return BasicSecureTextField_androidKt.platformAllowsRevealLastTyped$lambda$5$0((ContentResolverForSecureTextField) obj3, (BasicSecureTextField_androidKt$platformAllowsRevealLastTyped$settingsObserver$1$1) obj2, (DisposableEffectScope) obj);
            case 5:
                return BasicTextFieldKt.BasicTextField$lambda$27$0((TextFieldValue) obj3, (Function1) obj2, (TextFieldValue) obj);
            case 6:
                return BasicTooltipKt.keyboardBehavior$lambda$13((CoroutineScope) obj3, (TooltipState) obj2, (FocusState) obj);
            case 7:
                return BorderModifierNode.drawRoundRectBorder_JqoCqck$lambda$1((Path) obj3, (Brush) obj2, (ContentDrawScope) obj);
            case 8:
                return BorderModifierNode.drawGenericBorder$lambda$0((Outline.Generic) obj3, (Brush) obj2, (ContentDrawScope) obj);
            case 9:
                return BottomSheetScaffoldKt.StandardBottomSheet_w7I5h1o$lambda$10$lambda$9((CoroutineScope) obj3, (SheetState) obj2, ((Float) obj).floatValue());
            case 10:
                return BringIntoViewRequestPriorityQueue.enqueue$lambda$1((BringIntoViewRequestPriorityQueue) obj3, (ContentInViewNode.Request) obj2, (Throwable) obj);
            case 11:
                return Boolean.valueOf(ClickableKt.hasInterestedParent$lambda$0((IndirectPointerInputChange) obj3, (Ref.BooleanRef) obj2, (GestureConnection) obj));
            case 12:
                return Boolean.valueOf(ClickableKt.hasInterestedParent$lambda$1((PointerInputChange) obj3, (Ref.BooleanRef) obj2, (GestureConnection) obj));
            case 13:
                return ContextMenuAreaKt.ContextMenuArea$lambda$1$0((Function0) obj3, (ContextMenuState) obj2, (Offset) obj);
            case 14:
                return CoreTextFieldKt.CoreTextField$lambda$20$0((LegacyTextFieldState) obj3, (Brush) obj2, (ContentDrawScope) obj);
            case 15:
                return Boolean.valueOf(CoreTextFieldSemanticsModifierNode.applySemantics$lambda$4((CoreTextFieldSemanticsModifierNode) obj3, (SemanticsPropertyReceiver) obj2, (AnnotatedString) obj));
            case 16:
                return DatePickerKt.Month$lambda$51$lambda$50((SelectedRangeInfo) obj3, (DatePickerColors) obj2, (ContentDrawScope) obj);
            case 17:
                return DateRangePickerDefaults.DateRangePickerHeadline_nZrIstQ$lambda$3$lambda$2((String) obj3, (String) obj2, (SemanticsPropertyReceiver) obj);
            case 18:
                return DefaultModalWideNavigationRailOverride.ModalWideNavigationRail$lambda$20$lambda$19((CoroutineScope) obj3, (Animatable) obj2, ((Float) obj).floatValue());
            case 19:
                va0 va0Var = (va0) obj3;
                Context context = (Context) obj2;
                jb2 jb2Var = (jb2) obj;
                jb2Var.getClass();
                context.getClass();
                if (!((aa0) va0Var.l0.getValue()).a) {
                    BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(va0Var), null, null, new i00(va0Var, jb2Var, context, null), 3, null);
                }
                return Unit.INSTANCE;
            case 20:
                return DiskLruCache.Editor.newSink$lambda$0$0((DiskLruCache) obj3, (DiskLruCache.Editor) obj2, (IOException) obj);
            case 21:
                return EditProcessor.generateBatchErrorMessage$lambda$0$0((EditCommand) obj3, (EditProcessor) obj2, (EditCommand) obj);
            case 22:
                return EmbeddingCompat.setEmbeddingCallback$lambda$0((EmbeddingInterfaceCompat.EmbeddingCallbackInterface) obj3, (EmbeddingCompat) obj2, (List) obj);
            case 23:
                return ExposedDropdownMenu_androidKt.SoftKeyboardListener$lambda$5$lambda$4((View) obj3, (Function0) obj2, (DisposableEffectScope) obj);
            case 24:
                return FocusableNode.emitWithFallback$lambda$0((MutableInteractionSource) obj3, (Interaction) obj2, (Throwable) obj);
            case 25:
                return FontFamilyResolverImpl.resolve$lambda$0((FontFamilyResolverImpl) obj3, (TypefaceRequest) obj2, (Function1) obj);
            case 26:
                return FutureKt.asCompletableFuture$lambda$1((CompletableFuture) obj3, (Deferred) obj2, (Throwable) obj);
            case 27:
                return HandlerContext.scheduleResumeAfterDelay$lambda$2((HandlerContext) obj3, (y2) obj2, (Throwable) obj);
            case 28:
                return IndicatorLineNode.drawWithCacheModifierNode$lambda$3$lambda$2((Path) obj3, (IndicatorLineNode) obj2, (ContentDrawScope) obj);
            default:
                return InfiniteTransitionKt.animateValue$lambda$2$0((InfiniteTransition) obj3, (InfiniteTransition.TransitionAnimationState) obj2, (DisposableEffectScope) obj);
        }
    }
}
