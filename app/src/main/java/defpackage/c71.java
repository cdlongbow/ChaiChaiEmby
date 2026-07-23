package defpackage;

import android.view.Window;
import androidx.activity.OnBackPressedDispatcher;
import androidx.compose.animation.core.SeekableTransitionState;
import androidx.compose.foundation.gestures.Scrollable2DNode;
import androidx.compose.foundation.style.StyleOuterNode;
import androidx.compose.foundation.text.modifiers.TextAnnotatedStringNode;
import androidx.compose.material3.SheetState;
import androidx.compose.material3.SliderState;
import androidx.compose.material3.internal.PredictiveBackState;
import androidx.compose.runtime.MutableIntState;
import androidx.compose.runtime.saveable.SaveableStateRegistryWrapper;
import androidx.compose.runtime.snapshots.SnapshotStateObserver;
import androidx.compose.ui.text.platform.style.ShaderBrushSpan;
import androidx.lifecycle.SavedStateHandleSupport;
import androidx.lifecycle.ViewModelStoreOwner;
import androidx.savedstate.SavedStateRegistryController;
import androidx.savedstate.SavedStateRegistryOwner;
import com.dh.myembyapp.data.preferences.UserPreferences;
import java.util.ArrayList;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.reflect.KClass;
import kotlin.reflect.KType;
import okhttp3.internal.ws.RealWebSocket;
import okhttp3.internal.ws.WebSocketWriter;
import okio.internal.ResourceFileSystem;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class c71 implements Function0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ c71(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int i = this.a;
        Object obj = this.b;
        switch (i) {
            case 0:
                return NavDestinationImpl._set_route_$lambda$3((String) obj);
            case 1:
                return (cb0) ((ks1) obj).a.e.getValue();
            case 2:
                return hg2.l("kotlin.Unit", l32.h, new lw1[0], new mc0((i91) obj, 21));
            case 3:
                return new tn(((o61) obj).b);
            case 4:
                return OnBackPressedDispatcher.eventInput_delegate$lambda$0((OnBackPressedDispatcher) obj);
            case 5:
                return Float.valueOf(((UserPreferences) obj).getPlaybackSpeed());
            case 6:
                ((yn1) obj).a(null);
                return Unit.INSTANCE;
            case 7:
                MutableIntState mutableIntState = ((zu0) obj).i;
                mutableIntState.setIntValue(mutableIntState.getIntValue() + 1);
                return Unit.INSTANCE;
            case 8:
                return Boolean.valueOf(((nn1) obj).b() != null);
            case 9:
                ap1 ap1Var = (ap1) obj;
                nw1 nw1VarL = hg2.l("kotlinx.serialization.Polymorphic", zo1.e, new lw1[0], new kh1(ap1Var, 5));
                KClass kClass = ap1Var.a;
                kClass.getClass();
                return new av(nw1VarL, kClass);
            case 10:
                return RealWebSocket.writeOneFrame$lambda$0$0((RealWebSocket) obj);
            case 11:
                return RealWebSocket.finishReader$lambda$0$0((WebSocketWriter) obj);
            case 12:
                return ResourceFileSystem.roots_delegate$lambda$0((ResourceFileSystem) obj);
            case 13:
                return SaveableStateRegistryWrapper._init_$lambda$0((SaveableStateRegistryWrapper) obj);
            case 14:
                return SavedStateHandleSupport.getSavedStateHandlesVM((ViewModelStoreOwner) obj);
            case 15:
                return SavedStateRegistryController.Companion.create$lambda$0((SavedStateRegistryOwner) obj);
            case 16:
                return Boolean.valueOf(((Scrollable2DNode) obj).getIsAttached());
            case 17:
                return ((PredictiveBackState) obj).getValue();
            case 18:
                return SearchBarState.currentValue_delegate$lambda$0((SearchBarState) obj);
            case 19:
                return SeekableTransitionState.recalculateTotalDurationNanos$lambda$0((SeekableTransitionState) obj);
            case 20:
                nw1 nw1Var = (nw1) obj;
                return Integer.valueOf(tl0.A(nw1Var, nw1Var.k));
            case 21:
                return ((KType) ((ArrayList) obj).get(0)).getClassifier();
            case 22:
                return ShaderBrushSpan.shaderState$lambda$0((ShaderBrushSpan) obj);
            case 23:
                return ((SheetState) obj).anchoredDraggableMotionSpec;
            case 24:
                return SliderState.gestureEndAction$lambda$1((SliderState) obj);
            case 25:
                return SnapshotStateObserver.sendNotifications$lambda$0((SnapshotStateObserver) obj);
            case 26:
                return StyleOuterNode.drawForShape_9zt3ed4$lambda$1((StyleOuterNode) obj);
            case 27:
                Window window = (Window) obj;
                if (window != null) {
                    window.clearFlags(2);
                }
                if (window != null) {
                    window.setDimAmount(0.0f);
                }
                return Unit.INSTANCE;
            case 28:
                return Boolean.valueOf(TextAnnotatedStringNode.applySemantics$lambda$3((TextAnnotatedStringNode) obj));
            default:
                return TextContextMenuToolbarHandlerNode.derivedData_delegate$lambda$0((TextContextMenuToolbarHandlerNode) obj);
        }
    }
}
