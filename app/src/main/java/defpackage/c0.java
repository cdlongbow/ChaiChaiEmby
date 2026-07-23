package defpackage;

import android.app.ActivityManager;
import android.content.Context;
import androidx.activity.result.ActivityResultCallerLauncher;
import androidx.compose.foundation.gestures.Orientation;
import androidx.compose.foundation.text.BasicTextKt;
import androidx.compose.foundation.text.CoreTextFieldKt;
import androidx.compose.foundation.text.LegacyTextFieldState;
import androidx.compose.foundation.text.input.internal.InputMethodManagerImpl;
import androidx.compose.foundation.text.input.internal.LegacyTextInputMethodRequest;
import androidx.compose.material.ripple.AndroidRippleIndicationInstance;
import androidx.compose.material.ripple.AndroidRippleNode;
import androidx.compose.material3.DatePickerColors;
import androidx.compose.material3.DefaultTwoRowsTopAppBarOverride;
import androidx.compose.material3.DrawerState;
import androidx.compose.material3.ModalWideNavigationRailState;
import androidx.compose.material3.TwoRowsTopAppBarOverrideScope;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.ui.text.AnnotatedString;
import androidx.core.content.ContextCompat;
import androidx.lifecycle.CoroutineLiveData;
import com.dh.myembyapp.MainActivity;
import com.dh.myembyapp.data.model.ServerConfig;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.KTypeParameterBase;
import kotlin.time.AbstractLongTimeSource;
import okhttp3.Handshake;
import okhttp3.internal.connection.ConnectPlan;
import okhttp3.internal.http2.Http2Connection;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class c0 implements Function0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ c0(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int largeMemoryClass;
        int i = this.a;
        Object obj = this.b;
        switch (i) {
            case 0:
                return Long.valueOf(((AbstractLongTimeSource) obj).getReading());
            case 1:
                return ActivityResultCallerLauncher.resultContract_delegate$lambda$0((ActivityResultCallerLauncher) obj);
            case 2:
                return ((h7) ((p7) obj).e.getValue()).a;
            case 3:
                return (String) ((v8) obj).b.getValue();
            case 4:
                return AndroidRippleIndicationInstance.onInvalidateRipple$lambda$0((AndroidRippleIndicationInstance) obj);
            case 5:
                return AndroidRippleNode.addRipple_12SF9DM$lambda$0$0$0((AndroidRippleNode) obj);
            case 6:
                return ((TextContextMenuDataProvider) obj).data();
            case 7:
                return BasicTextKt.LayoutWithLinksAndInlineContent_11Od_4g$lambda$2$0((AnnotatedString) obj);
            case 8:
                return ll.b((ll) obj);
            case 9:
                return CollectionsKt.listOf((Pair) obj);
            case 10:
                return ConnectPlan.connectTls$lambda$1((Handshake) obj);
            case 11:
                return ((LegacyTextFieldState) obj).getLayoutResult();
            case 12:
                return CoreTextFieldKt.CoreTextField$lambda$4$0((Orientation) obj);
            case 13:
                return CoroutineLiveData._init_$lambda$0((CoroutineLiveData) obj);
            case 14:
                ((bx) obj).c.invoke();
                return Unit.INSTANCE;
            case 15:
                return ((DatePickerColors) obj).dateTextFieldColors;
            case 16:
                return DefaultTextContextMenuDropdownProvider_androidKt.OpenContextMenu$lambda$1$0((TextContextMenuSession) obj);
            case 17:
                return Float.valueOf(DefaultTwoRowsTopAppBarOverride.TwoRowsTopAppBar$lambda$5$lambda$4((TwoRowsTopAppBarOverrideScope) obj));
            case 18:
                return new sc0((tc0) obj);
            case 19:
                return Float.valueOf(DrawerState.anchoredDraggableState$lambda$3((DrawerState) obj));
            case 20:
                return ExtensionEmbeddingBackend.splitSupportStatus_delegate$lambda$6((ExtensionEmbeddingBackend) obj);
            case 21:
                return Http2Connection.sendDegradedPingLater$lambda$1((Http2Connection) obj);
            case 22:
                Context context = ((xr0) obj).a;
                double d = 0.2d;
                try {
                    Object systemService = ContextCompat.getSystemService(context, ActivityManager.class);
                    systemService.getClass();
                    if (((ActivityManager) systemService).isLowRamDevice()) {
                        d = 0.15d;
                    }
                } catch (Exception unused) {
                }
                if (0.0d > d || d > 1.0d) {
                    ra.q("percent must be in the range [0.0, 1.0].");
                    return null;
                }
                l91 l91Var = new l91(1);
                try {
                    Object systemService2 = ContextCompat.getSystemService(context, ActivityManager.class);
                    systemService2.getClass();
                    ActivityManager activityManager = (ActivityManager) systemService2;
                    largeMemoryClass = (context.getApplicationInfo().flags & 1048576) != 0 ? activityManager.getLargeMemoryClass() : activityManager.getMemoryClass();
                    break;
                } catch (Exception unused2) {
                    largeMemoryClass = 256;
                }
                return new os1(new ss1((long) (d * ((long) largeMemoryClass) * 1048576), l91Var), l91Var);
            case 23:
                return InputMethodManagerImpl.imm_delegate$lambda$0((InputMethodManagerImpl) obj);
            case 24:
                return KTypeParameterBase.javaContainingDeclaration_delegate$lambda$0((KTypeParameterBase) obj);
            case 25:
                return LegacyTextInputMethodRequest.baseInputConnection_delegate$lambda$0((LegacyTextInputMethodRequest) obj);
            case 26:
                ((MainActivity) obj).c.setValue(null);
                return Unit.INSTANCE;
            case 27:
                ServerConfig serverConfig = (ServerConfig) obj;
                return SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(serverConfig != null ? serverConfig.getId() : null, null, 2, null);
            case 28:
                return ((ModalWideNavigationRailState) obj).animationSpec;
            default:
                return NavBackStackEntry.savedStateHandle_delegate$lambda$0((NavBackStackEntry) obj);
        }
    }
}
