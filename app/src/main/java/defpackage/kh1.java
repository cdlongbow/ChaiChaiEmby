package defpackage;

import androidx.compose.foundation.ScrollState;
import androidx.compose.foundation.content.ReceiveContentNode;
import androidx.compose.foundation.gestures.ScrollingLogic;
import androidx.compose.foundation.layout.RulerAlignmentKt;
import androidx.compose.foundation.text.SecureTextFieldController;
import androidx.compose.foundation.text.input.internal.RecordingInputConnection;
import androidx.compose.foundation.text.selection.MouseSelectionObserver;
import androidx.compose.foundation.text.selection.SelectionGesturesKt;
import androidx.compose.material3.internal.FloatProducer;
import androidx.compose.material3.pulltorefresh.PullToRefreshKt;
import androidx.compose.runtime.ControlledComposition;
import androidx.compose.runtime.DisposableEffectScope;
import androidx.compose.runtime.MovableContentStateReference;
import androidx.compose.runtime.Recomposer;
import androidx.compose.runtime.SnapshotMutableDoubleStateImpl;
import androidx.compose.runtime.SnapshotMutableFloatStateImpl;
import androidx.compose.runtime.SnapshotMutableIntStateImpl;
import androidx.compose.runtime.SnapshotMutableLongStateImpl;
import androidx.compose.runtime.SnapshotMutableStateImpl;
import androidx.compose.ui.draganddrop.DragAndDropEvent;
import androidx.compose.ui.focus.FocusState;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.graphics.GraphicsLayerScope;
import androidx.compose.ui.input.pointer.PointerInputChange;
import androidx.compose.ui.layout.LayoutCoordinates;
import androidx.compose.ui.layout.Measurable;
import androidx.compose.ui.layout.Placeable;
import androidx.compose.ui.semantics.SemanticsPropertyReceiver;
import androidx.compose.ui.text.input.EditCommand;
import androidx.navigationevent.NavigationEventDispatcher;
import androidx.navigationevent.compose.RememberNavigationEventDispatcherOwnerKt;
import com.dh.myembyapp.data.model.MediaSource;
import com.dh.myembyapp.server.ProxyConfigServerManager;
import com.dh.myembyapp.server.ServerIconLibraryInputServerManager;
import java.util.List;
import java.util.concurrent.CancellationException;
import kotlin.Unit;
import kotlin.collections.ArraysKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.StringCompanionObject;
import kotlin.text.StringsKt;
import kotlin.text.Typography;
import okhttp3.Call;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class kh1 implements Function1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ kh1(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i = this.a;
        Object obj2 = this.b;
        switch (i) {
            case 0:
                GraphicsLayerScope graphicsLayerScope = (GraphicsLayerScope) obj;
                graphicsLayerScope.getClass();
                graphicsLayerScope.setAlpha(((oh1) obj2).b);
                return Unit.INSTANCE;
            case 1:
                ((og1) obj2).c.setValue((String) obj);
                return Unit.INSTANCE;
            case 2:
                MediaSource mediaSource = (MediaSource) obj;
                String str = ((eo1) obj2).g;
                if (str != null) {
                    if (StringsKt.isBlank(str)) {
                        str = null;
                    }
                    if (str != null) {
                        return str;
                    }
                }
                if (mediaSource != null) {
                    return mediaSource.getContainer();
                }
                return null;
            case 3:
                ((nn1) obj2).c(((Long) obj).longValue());
                return Unit.INSTANCE;
            case 4:
                xo1 xo1Var = (xo1) obj2;
                int iIntValue = ((Integer) obj).intValue();
                return xo1Var.e[iIntValue] + ": " + xo1Var.e(iIntValue).f();
            case 5:
                ap1 ap1Var = (ap1) obj2;
                wp wpVar = (wp) obj;
                wpVar.getClass();
                StringCompanionObject.INSTANCE.getClass();
                wp.a(wpVar, ClassDiscriminatorModeKt.CLASS_DISCRIMINATOR_KEY, j32.b);
                String str2 = "kotlinx.serialization.Polymorphic<" + ap1Var.a.getSimpleName() + Typography.greater;
                zo1 zo1Var = zo1.f;
                lw1[] lw1VarArr = new lw1[0];
                if (StringsKt.isBlank(str2)) {
                    ra.q("Blank serial names are prohibited");
                    return null;
                }
                if (Intrinsics.areEqual(zo1Var, l32.e)) {
                    ra.q("For StructureKind.CLASS please use 'buildClassSerialDescriptor' instead");
                    return null;
                }
                wp wpVar2 = new wp(str2);
                Unit unit = Unit.INSTANCE;
                wp.a(wpVar, "value", new nw1(str2, zo1Var, wpVar2.c.size(), ArraysKt.toList(lw1VarArr), wpVar2));
                List list = ap1Var.b;
                list.getClass();
                wpVar.b = list;
                return Unit.INSTANCE;
            case 6:
                ((DisposableEffectScope) obj).getClass();
                return new o2((ProxyConfigServerManager) obj2, 13);
            case 7:
                return PullToRefreshKt.CircularArrowProgressIndicator_RPmYEkk$lambda$10$lambda$9((FloatProducer) obj2, (SemanticsPropertyReceiver) obj);
            case 8:
                return ReceiveContentNode._init_$lambda$0((ReceiveContentNode) obj2, (DragAndDropEvent) obj);
            case 9:
                return Recomposer.readObserverOf$lambda$0((ControlledComposition) obj2, obj);
            case 10:
                return Recomposer.effectJob$lambda$0$0((Recomposer) obj2, (Throwable) obj);
            case 11:
                return RecordingInputConnection.performHandwritingGesture$lambda$0((RecordingInputConnection) obj2, (EditCommand) obj);
            case 12:
                return RememberNavigationEventDispatcherOwnerKt.rememberNavigationEventDispatcherOwner$lambda$5$lambda$4((NavigationEventDispatcher) obj2, (DisposableEffectScope) obj);
            case 13:
                return RulerAlignmentKt.fitOutside$lambda$0$1((Measurable) obj2, (Placeable.PlacementScope) obj);
            case 14:
                return Float.valueOf(ScrollState.scrollableState$lambda$0((ScrollState) obj2, ((Float) obj).floatValue()));
            case 15:
                return ScrollingLogic.performScrollForOverscroll$lambda$0((ScrollingLogic) obj2, (Offset) obj);
            case 16:
                return SearchBarKt.SearchBar_nbWgWpA$lambda$1$lambda$0((SearchBarState) obj2, (LayoutCoordinates) obj);
            case 17:
                return SecureTextFieldController.focusChangeModifier$lambda$0((SecureTextFieldController) obj2, (FocusState) obj);
            case 18:
                return SelectionGesturesKt.mouseSelection$lambda$0((MouseSelectionObserver) obj2, (PointerInputChange) obj);
            case 19:
                return Boolean.valueOf(ArraysKt.contains((Object[]) obj2, obj));
            case 20:
                nw1 nw1Var = (nw1) obj2;
                int iIntValue2 = ((Integer) obj).intValue();
                return nw1Var.f[iIntValue2] + ": " + nw1Var.g[iIntValue2].f();
            case 21:
                ((DisposableEffectScope) obj).getClass();
                return new o2((ServerIconLibraryInputServerManager) obj2, 14);
            case 22:
                ((DisposableEffectScope) obj).getClass();
                return new o2((hy1) obj2, 15);
            case 23:
                Call call = (Call) obj2;
                if (((Throwable) obj) instanceof CancellationException) {
                    call.cancel();
                }
                return Unit.INSTANCE;
            case 24:
                return SlotTable.extractNestedStates$lambda$1((SlotTable) obj2, (MovableContentStateReference) obj);
            case 25:
                return SnapshotMutableDoubleStateImpl.component2$lambda$0((SnapshotMutableDoubleStateImpl) obj2, ((Double) obj).doubleValue());
            case 26:
                return SnapshotMutableFloatStateImpl.component2$lambda$0((SnapshotMutableFloatStateImpl) obj2, ((Float) obj).floatValue());
            case 27:
                return SnapshotMutableIntStateImpl.component2$lambda$0((SnapshotMutableIntStateImpl) obj2, ((Integer) obj).intValue());
            case 28:
                return SnapshotMutableLongStateImpl.component2$lambda$0((SnapshotMutableLongStateImpl) obj2, ((Long) obj).longValue());
            default:
                return SnapshotMutableStateImpl.component2$lambda$0((SnapshotMutableStateImpl) obj2, obj);
        }
    }
}
