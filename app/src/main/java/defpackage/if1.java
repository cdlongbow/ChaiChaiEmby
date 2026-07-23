package defpackage;

import android.content.Context;
import androidx.compose.foundation.relocation.BringIntoViewRequester;
import androidx.compose.foundation.text.KeyCommand;
import androidx.compose.foundation.text.TextFieldDelegate;
import androidx.compose.foundation.text.TextFieldKeyInput;
import androidx.compose.foundation.text.input.internal.selection.TextFieldSelectionState;
import androidx.compose.foundation.text.input.internal.selection.TextFieldSelectionStateKt;
import androidx.compose.foundation.text.input.internal.selection.TextFieldSelectionState_androidKt;
import androidx.compose.foundation.text.selection.MouseSelectionObserver;
import androidx.compose.foundation.text.selection.SelectionAdjustment;
import androidx.compose.foundation.text.selection.SelectionGesturesKt;
import androidx.compose.foundation.text.selection.TextFieldPreparedSelection;
import androidx.compose.foundation.text.selection.TextFieldSelectionManager;
import androidx.compose.foundation.text.selection.TextFieldSelectionManagerKt;
import androidx.compose.foundation.text.selection.TextFieldSelectionManager_androidKt;
import androidx.compose.material3.SwipeToDismissBoxState;
import androidx.compose.material3.SwipeToDismissBoxValue;
import androidx.compose.material3.TextFieldLabelPosition;
import androidx.compose.material3.internal.TextFieldImplKt;
import androidx.compose.runtime.DisposableEffectScope;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.State;
import androidx.compose.ui.focus.FocusState;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.geometry.Size;
import androidx.compose.ui.graphics.Brush;
import androidx.compose.ui.graphics.drawscope.DrawScope;
import androidx.compose.ui.graphics.painter.Painter;
import androidx.compose.ui.input.pointer.PointerInputChange;
import androidx.compose.ui.semantics.SemanticsPropertyReceiver;
import androidx.compose.ui.text.input.EditProcessor;
import androidx.compose.ui.unit.Density;
import androidx.lifecycle.MediatorLiveData;
import androidx.lifecycle.Transformations;
import com.dh.myembyapp.data.model.BackupRouteConfig;
import com.dh.myembyapp.data.model.ServerConfig;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import kotlin.text.StringsKt;
import kotlinx.coroutines.CoroutineScope;
import okhttp3.internal.ws.WebSocketProtocol;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class if1 implements Function1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ if1(Function0 function0, TextFieldSelectionState textFieldSelectionState, Function0 function1) {
        this.a = 15;
        this.c = function0;
        this.b = textFieldSelectionState;
        this.d = function1;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        String str;
        int i = this.a;
        Object obj2 = this.d;
        Object obj3 = this.c;
        Object obj4 = this.b;
        switch (i) {
            case 0:
                Float f = (Float) obj;
                f.getClass();
                ((vk1) obj4).invoke(f);
                ((Function0) obj3).invoke();
                ((Function0) obj2).invoke();
                return Unit.INSTANCE;
            case 1:
                ((pl) obj4).a.evictAll();
                ((MutableState) obj3).setValue(null);
                ((MutableState) obj2).setValue((String) obj);
                return Unit.INSTANCE;
            case 2:
                ((DisposableEffectScope) obj).getClass();
                return new an1((ln1) obj4, (MutableState) obj3, (MutableState) obj2);
            case 3:
                return SearchBarDefaults.InputField$lambda$11$lambda$10((String) obj4, (SearchBarState) obj3, (String) obj2, (SemanticsPropertyReceiver) obj);
            case 4:
                return SelectionGesturesKt.mouseSelection$lambda$2((MouseSelectionObserver) obj4, (SelectionAdjustment) obj3, (Ref.BooleanRef) obj2, (PointerInputChange) obj);
            case 5:
                Function1 function1 = (Function1) obj4;
                Function0 function0 = (Function0) obj3;
                MutableState mutableState = (MutableState) obj2;
                String string = StringsKt.trim((CharSequence) obj).toString();
                if (!StringsKt.isBlank(string)) {
                    mutableState.setValue(string);
                    function1.invoke(string);
                    function0.invoke();
                }
                return Unit.INSTANCE;
            case 6:
                ServerConfig serverConfig = (ServerConfig) obj4;
                hy1 hy1Var = (hy1) obj3;
                MutableState mutableState2 = (MutableState) obj2;
                List list = (List) obj;
                list.getClass();
                String activeBackupRouteId = serverConfig.getActiveBackupRouteId();
                if (activeBackupRouteId == null || list.isEmpty()) {
                    str = null;
                } else {
                    Iterator it = list.iterator();
                    while (it.hasNext()) {
                        if (Intrinsics.areEqual(((BackupRouteConfig) it.next()).getId(), activeBackupRouteId)) {
                            str = activeBackupRouteId;
                        }
                    }
                    str = null;
                }
                ServerConfig serverConfigCopy$default = ServerConfig.copy$default(serverConfig, null, null, null, null, 0, null, null, null, null, null, null, 0L, false, false, false, false, false, list, str, null, null, 0L, 3801087, null);
                hy1Var.g(serverConfigCopy$default);
                mutableState2.setValue(serverConfigCopy$default);
                return Unit.INSTANCE;
            case 7:
                BringIntoViewRequester bringIntoViewRequester = (BringIntoViewRequester) obj4;
                CoroutineScope coroutineScope = (CoroutineScope) obj2;
                FocusState focusState = (FocusState) obj;
                focusState.getClass();
                ((MutableState) obj3).setValue(Boolean.valueOf(focusState.isFocused()));
                if (focusState.isFocused()) {
                    kz1.c(coroutineScope, bringIntoViewRequester);
                }
                return Unit.INSTANCE;
            case 8:
                return SwipeToDismissBoxState.Companion.Saver$lambda$1((Density) obj4, (Function1) obj3, (Function1) obj2, (SwipeToDismissBoxValue) obj);
            case 9:
                return TextFieldDelegate.Companion.restartInput$lambda$0((EditProcessor) obj4, (Function1) obj3, (Ref.ObjectRef) obj2, (List) obj);
            case 10:
                return TextFieldImplKt.CommonDecorationBox$lambda$18$lambda$17$lambda$16((TextFieldLabelPosition) obj4, (State) obj3, (MutableState) obj2, (Size) obj);
            case 11:
                return TextFieldKeyInput.process_ZmokQxo$lambda$1((KeyCommand) obj4, (TextFieldKeyInput) obj3, (Ref.BooleanRef) obj2, (TextFieldPreparedSelection) obj);
            case 12:
                return TextFieldSelectionManagerKt.contextMenuBuilder$lambda$0((State) obj4, (TextFieldSelectionManager) obj3, (ContextMenuState) obj2, (ContextMenuScope) obj);
            case 13:
                return TextFieldSelectionManager_androidKt.addBasicTextFieldTextContextMenuComponents$lambda$0$3((TextFieldSelectionManager) obj4, (CoroutineScope) obj3, (Context) obj2, (TextContextMenuBuilderScope) obj);
            case 14:
                return TextFieldSelectionState.detectCursorHandleDragGestures$lambda$0((Ref.LongRef) obj4, (TextFieldSelectionState) obj3, (Ref.LongRef) obj2, (Offset) obj);
            case 15:
                return TextFieldSelectionStateKt.defaultDetectTextFieldTapGestures$lambda$0((Function0) obj3, (TextFieldSelectionState) obj4, (Function0) obj2, (Offset) obj);
            case 16:
                return TextFieldSelectionState_androidKt.addBasicTextFieldTextContextMenuComponents$lambda$0$2((TextFieldSelectionState) obj4, (CoroutineScope) obj3, (Context) obj2, (TextContextMenuBuilderScope) obj);
            case 17:
                DrawScope drawScope = (DrawScope) obj;
                drawScope.getClass();
                pc0.l(drawScope, ((n00) obj4).a, 0L, 0L, 0.0f, null, null, 0, WebSocketProtocol.PAYLOAD_SHORT, null);
                pc0.k(drawScope, (Brush) obj3, 0L, 0L, 0.0f, null, null, 0, WebSocketProtocol.PAYLOAD_SHORT, null);
                pc0.k(drawScope, (Brush) obj2, 0L, 0L, 0.0f, null, null, 0, WebSocketProtocol.PAYLOAD_SHORT, null);
                return Unit.INSTANCE;
            case 18:
                return Transformations.switchMap$lambda$0((Function1) obj4, (Ref.ObjectRef) obj3, (MediatorLiveData) obj2, obj);
            default:
                Painter painter = (Painter) obj4;
                Painter painter2 = (Painter) obj3;
                Painter painter3 = (Painter) obj2;
                jf jfVar = (jf) obj;
                if (jfVar instanceof gf) {
                    return painter != null ? new gf(painter) : (gf) jfVar;
                }
                if (!(jfVar instanceof ff)) {
                    return jfVar;
                }
                ff ffVar = (ff) jfVar;
                xg0 xg0Var = ffVar.b;
                if (xg0Var.c instanceof e91) {
                    return painter2 != null ? new ff(painter2, xg0Var) : ffVar;
                }
                return painter3 != null ? new ff(painter3, xg0Var) : ffVar;
        }
    }

    public /* synthetic */ if1(Object obj, Object obj2, Object obj3, int i) {
        this.a = i;
        this.b = obj;
        this.c = obj2;
        this.d = obj3;
    }
}
