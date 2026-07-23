package defpackage;

import androidx.compose.animation.AnimatedContentTransitionScope;
import androidx.compose.animation.core.SuspendAnimationKt;
import androidx.compose.foundation.GestureNodeKt;
import androidx.compose.foundation.gestures.AnchoredDraggableState;
import androidx.compose.foundation.layout.OffsetKt;
import androidx.compose.material3.DrawerState;
import androidx.compose.material3.DrawerValue;
import androidx.compose.material3.SliderKt;
import androidx.compose.material3.SliderRange;
import androidx.compose.material3.SwipeToDismissBoxState;
import androidx.compose.material3.SwipeToDismissBoxValue;
import androidx.compose.runtime.DisposableEffectScope;
import androidx.compose.runtime.saveable.MapSaverKt;
import androidx.compose.runtime.snapshots.SnapshotIdSet;
import androidx.compose.runtime.snapshots.SnapshotKt;
import androidx.compose.ui.focus.FocusState;
import androidx.compose.ui.node.TraversableNode;
import androidx.compose.ui.platform.InspectorInfo;
import com.dh.myembyapp.data.ProxyConfig;
import com.dh.myembyapp.data.model.AudioVersionPrioritySettings;
import com.dh.myembyapp.data.model.SubtitleVersionPrioritySettings;
import com.dh.myembyapp.data.model.VideoPriorityRule;
import com.dh.myembyapp.server.BackupRouteConfigServerManager;
import com.dh.myembyapp.server.OnlineSubtitleConfigServerManager;
import com.dh.myembyapp.server.ProxyConfigServerManager;
import com.dh.myembyapp.server.ServerIconLibraryInputServerManager;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlinx.coroutines.internal.ExceptionsConstructorKt;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class f5 implements Function1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Function1 b;

    public /* synthetic */ f5(Function1 function1, int i) {
        this.a = i;
        this.b = function1;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i = this.a;
        Function1 function1 = this.b;
        switch (i) {
            case 0:
                FocusState focusState = (FocusState) obj;
                focusState.getClass();
                function1.invoke(Boolean.valueOf(focusState.getHasFocus()));
                return Unit.INSTANCE;
            case 1:
                return AnchoredDraggableState.Companion.Saver$lambda$4(function1, obj);
            case 2:
                return BackupRouteConfigServerManager.startServer$lambda$0(function1, (List) obj);
            case 3:
                FocusState focusState2 = (FocusState) obj;
                focusState2.getClass();
                function1.invoke(Boolean.valueOf(focusState2.getHasFocus()));
                return Unit.INSTANCE;
            case 4:
                FocusState focusState3 = (FocusState) obj;
                focusState3.getClass();
                function1.invoke(Boolean.valueOf(focusState3.getHasFocus()));
                return Unit.INSTANCE;
            case 5:
                String str = (String) obj;
                str.getClass();
                function1.invoke(str);
                return Unit.INSTANCE;
            case 6:
                FocusState focusState4 = (FocusState) obj;
                focusState4.getClass();
                function1.invoke(Boolean.valueOf(focusState4.getHasFocus()));
                return Unit.INSTANCE;
            case 7:
                return DrawerState.Companion.Saver$lambda$1(function1, (DrawerValue) obj);
            case 8:
                return ExceptionsConstructorKt.safeCtor$lambda$9(function1, (Throwable) obj);
            case 9:
                ((DisposableEffectScope) obj).getClass();
                return new nj0(function1, 0);
            case 10:
                return Boolean.valueOf(GestureNodeKt.traverseAncestorGestureConnections$lambda$0(function1, (TraversableNode) obj));
            case 11:
                FocusState focusState5 = (FocusState) obj;
                focusState5.getClass();
                if (focusState5.getHasFocus() && function1 != null) {
                    function1.invoke("我的媒体");
                }
                return Unit.INSTANCE;
            case 12:
                FocusState focusState6 = (FocusState) obj;
                focusState6.getClass();
                function1.invoke(Boolean.valueOf(focusState6.isFocused()));
                return Unit.INSTANCE;
            case 13:
                return MapSaverKt.mapSaver$lambda$1(function1, (List) obj);
            case 14:
                return NavHostKt.NavHost$lambda$65$lambda$64(function1, (AnimatedContentTransitionScope) obj);
            case 15:
                return OffsetKt.offset$lambda$0(function1, (InspectorInfo) obj);
            case 16:
                return OffsetKt.absoluteOffset$lambda$0(function1, (InspectorInfo) obj);
            case 17:
                return OnlineSubtitleConfigServerManager.startServer$lambda$0(function1, (t91) obj);
            case 18:
                SubtitleVersionPrioritySettings subtitleVersionPrioritySettings = (SubtitleVersionPrioritySettings) obj;
                subtitleVersionPrioritySettings.getClass();
                function1.invoke(subtitleVersionPrioritySettings.normalized());
                return Unit.INSTANCE;
            case 19:
                AudioVersionPrioritySettings audioVersionPrioritySettings = (AudioVersionPrioritySettings) obj;
                audioVersionPrioritySettings.getClass();
                function1.invoke(audioVersionPrioritySettings.normalized());
                return Unit.INSTANCE;
            case 20:
                VideoPriorityRule videoPriorityRule = (VideoPriorityRule) obj;
                videoPriorityRule.getClass();
                function1.invoke(videoPriorityRule.normalized());
                return Unit.INSTANCE;
            case 21:
                return ProxyConfigServerManager.startServer$lambda$0(function1, (ProxyConfig) obj);
            case 22:
                return SearchBarDefaults.InputField$lambda$38$lambda$37(function1, (FocusState) obj);
            case 23:
                return SearchBarDefaults.InputField$lambda$25$lambda$24(function1, (FocusState) obj);
            case 24:
                return ServerIconLibraryInputServerManager.startServer$lambda$0(function1, (String) obj);
            case 25:
                FocusState focusState7 = (FocusState) obj;
                focusState7.getClass();
                function1.invoke(Boolean.valueOf(focusState7.isFocused()));
                return Unit.INSTANCE;
            case 26:
                return SliderKt.RangeSlider$lambda$18$lambda$17(function1, (SliderRange) obj);
            case 27:
                return SnapshotKt.takeNewSnapshot$lambda$0(function1, (SnapshotIdSet) obj);
            case 28:
                return SuspendAnimationKt.callWithFrameNanos$lambda$0(function1, ((Long) obj).longValue());
            default:
                return SwipeToDismissBoxState.Companion.Saver$lambda$3(function1, (SwipeToDismissBoxValue) obj);
        }
    }
}
