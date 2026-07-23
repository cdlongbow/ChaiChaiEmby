package defpackage;

import androidx.activity.compose.ManagedActivityResultLauncher;
import androidx.compose.animation.core.Animatable;
import androidx.compose.animation.core.AnimateAsStateKt;
import androidx.compose.foundation.FocusableNode;
import androidx.compose.foundation.lazy.grid.LazyGridItemProviderKt;
import androidx.compose.foundation.lazy.grid.LazyGridState;
import androidx.compose.foundation.lazy.layout.LazySaveableStateHolderKt;
import androidx.compose.foundation.pager.LazyLayoutPagerKt;
import androidx.compose.foundation.pager.PagerState;
import androidx.compose.foundation.shape.RoundedCornerShape;
import androidx.compose.foundation.text.BasicTextFieldKt;
import androidx.compose.foundation.text.BasicTextKt;
import androidx.compose.foundation.text.TextLinkScope;
import androidx.compose.material3.AppBarMenuState;
import androidx.compose.material3.ClickableAppBarItem;
import androidx.compose.material3.DefaultModalWideNavigationRailOverride;
import androidx.compose.material3.ModalWideNavigationRailOverrideScope;
import androidx.compose.material3.TooltipState;
import androidx.compose.material3.internal.AnchoredDraggableState;
import androidx.compose.material3.internal.AnimatedShapeKt;
import androidx.compose.material3.internal.BasicTooltipKt;
import androidx.compose.runtime.MovableContentStateReference;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.State;
import androidx.compose.runtime.saveable.SaveableStateHolder;
import androidx.compose.runtime.saveable.SaveableStateRegistry;
import androidx.compose.runtime.tooling.CompositionErrorContextImpl;
import androidx.compose.ui.text.AnnotatedString;
import androidx.compose.ui.text.input.TextFieldValue;
import com.dh.myembyapp.data.api.IqiyiSuggestItem;
import com.dh.myembyapp.data.model.DanmakuConfig;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Ref;
import kotlin.reflect.KClass;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.channels.Channel;
import kotlinx.coroutines.flow.MutableStateFlow;
import okhttp3.internal.http2.Http2Connection;
import okhttp3.internal.http2.Http2Stream;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class z7 implements Function0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ z7(int i, Object obj, Object obj2) {
        this.a = i;
        this.b = obj;
        this.c = obj2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.a) {
            case 0:
                ((Function1) this.b).invoke(((IqiyiSuggestItem) this.c).getName());
                return Unit.INSTANCE;
            case 1:
                return AnchoredDraggableState.trySnapTo$lambda$9((AnchoredDraggableState) this.b, this.c);
            case 2:
                return AndroidTextContextMenuToolbarProvider.observeReadsAndGet$lambda$0((Ref.ObjectRef) this.b, (Function0) this.c);
            case 3:
                return AnimateAsStateKt.animateValueAsState$lambda$7$0((Channel) this.b, this.c);
            case 4:
                return AnimatedShapeKt.rememberAnimatedShape$lambda$4$lambda$3((Channel) this.b, (RoundedCornerShape) this.c);
            case 5:
                vc vcVar = (vc) this.b;
                c cVar = new c((ManagedActivityResultLauncher) this.c, 8);
                vcVar.getClass();
                vcVar.c = cVar;
                return Unit.INSTANCE;
            case 6:
                return BasicTextFieldKt.BasicTextField$lambda$20$0((TextFieldValue) this.b, (MutableState) this.c);
            case 7:
                return BasicTextKt.LayoutWithLinksAndInlineContent_11Od_4g$lambda$1$0((TextLinkScope) this.b, (AnnotatedString) this.c);
            case 8:
                return Boolean.valueOf(BasicTooltipKt.anchorSemantics$lambda$12$lambda$11((CoroutineScope) this.b, (TooltipState) this.c));
            case 9:
                return ClickableAppBarItem.MenuContent$lambda$2$lambda$1((ClickableAppBarItem) this.b, (AppBarMenuState) this.c);
            case 10:
                return CollectionsKt.listOf(TuplesKt.to((bk0) this.b, (KClass) this.c));
            case 11:
                return CompositionErrorContextImpl.attachComposeStackTrace$lambda$0((CompositionErrorContextImpl) this.b, this.c);
            case 12:
                c00 c00Var = (c00) this.b;
                MutableState mutableState = (MutableState) this.c;
                mutableState.setValue(Boolean.valueOf(!((Boolean) mutableState.getValue()).booleanValue()));
                boolean zBooleanValue = ((Boolean) mutableState.getValue()).booleanValue();
                MutableStateFlow mutableStateFlow = c00Var.b;
                mutableStateFlow.setValue(DanmakuConfig.copy$default((DanmakuConfig) mutableStateFlow.getValue(), zBooleanValue, null, null, null, null, false, 62, null));
                return Unit.INSTANCE;
            case 13:
                w10 w10Var = (w10) this.b;
                String str = (String) this.c;
                synchronized (w10Var.c) {
                    w10Var.b.remove(str);
                }
                return Unit.INSTANCE;
            case 14:
                return DefaultModalWideNavigationRailOverride.ModalWideNavigationRail$lambda$16$lambda$15((Channel) this.b, (ModalWideNavigationRailOverrideScope) this.c);
            case 15:
                return DefaultModalWideNavigationRailOverride.ModalWideNavigationRail$lambda$18$lambda$17((CoroutineScope) this.b, (ModalWideNavigationRailOverrideScope) this.c);
            case 16:
                return DefaultModalWideNavigationRailOverride.ModalWideNavigationRail$lambda$22$lambda$21((CoroutineScope) this.b, (Animatable) this.c);
            case 17:
                return DefaultTextContextMenuDropdownProvider_androidKt.DefaultTextContextMenuDropdown$lambda$0$0$0$1((TextContextMenuItem) this.b, (TextContextMenuSession) this.c);
            case 18:
                return DefaultTextContextMenuDropdownProvider_androidKt.OpenContextMenu$lambda$0$0((TextContextMenuDataProvider) this.b, (Function0) this.c);
            case 19:
                ((va0) this.b).k((String) this.c, false);
                return Unit.INSTANCE;
            case 20:
                return DialogHostKt.DialogHost$lambda$5$lambda$4$lambda$3((DialogNavigator) this.b, (NavBackStackEntry) this.c);
            case 21:
                qg0 qg0Var = (qg0) this.b;
                String str2 = (String) this.c;
                Enum[] enumArr = qg0Var.a;
                pg0 pg0Var = new pg0(str2, enumArr.length);
                for (Enum r0 : enumArr) {
                    pg0Var.h(r0.name());
                }
                return pg0Var;
            case 22:
                return FocusableNode.retrievePinnableContainer$lambda$0((Ref.ObjectRef) this.b, (FocusableNode) this.c);
            case 23:
                return GapComposer.insertMovableContentGuarded$lambda$0$0$1$0$0$0$0((GapComposer) this.b, (MovableContentStateReference) this.c);
            case 24:
                ((Function2) this.b).invoke(((uv1) this.c).a, "我的媒体");
                return Unit.INSTANCE;
            case 25:
                return Http2Connection.ReaderRunnable.headers$lambda$0$0((Http2Connection) this.b, (Http2Stream) this.c);
            case 26:
                return Http2Connection.ReaderRunnable.applyAndAckSettings$lambda$0$0$1((Http2Connection) this.b, (Ref.ObjectRef) this.c);
            case 27:
                return LazyGridItemProviderKt.rememberLazyGridItemProviderLambda$lambda$0$1((State) this.b, (LazyGridState) this.c);
            case 28:
                return LazyLayoutPagerKt.rememberPagerItemProviderLambda$lambda$0$1((State) this.b, (PagerState) this.c);
            default:
                return LazySaveableStateHolderKt.LazySaveableStateHolderProvider$lambda$0$0((SaveableStateRegistry) this.b, (SaveableStateHolder) this.c);
        }
    }
}
