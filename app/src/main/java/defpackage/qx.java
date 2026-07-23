package defpackage;

import android.util.Log;
import androidx.compose.runtime.MutableState;
import androidx.compose.ui.focus.FocusState;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class qx implements Function1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Function0 b;
    public final /* synthetic */ MutableState c;

    public /* synthetic */ qx(Function0 function0, MutableState mutableState, int i) {
        this.a = i;
        this.b = function0;
        this.c = mutableState;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i = this.a;
        MutableState mutableState = this.c;
        Function0 function0 = this.b;
        switch (i) {
            case 0:
                FocusState focusState = (FocusState) obj;
                focusState.getClass();
                mutableState.setValue(Boolean.valueOf(focusState.getHasFocus()));
                if (focusState.getHasFocus()) {
                    function0.invoke();
                }
                break;
            case 1:
                FocusState focusState2 = (FocusState) obj;
                focusState2.getClass();
                mutableState.setValue(Boolean.valueOf(focusState2.isFocused()));
                if (focusState2.isFocused()) {
                    function0.invoke();
                }
                break;
            case 2:
                FocusState focusState3 = (FocusState) obj;
                focusState3.getClass();
                if (focusState3.getHasFocus() && !((Boolean) mutableState.getValue()).booleanValue()) {
                    mutableState.setValue(Boolean.TRUE);
                    function0.invoke();
                }
                break;
            case 3:
                FocusState focusState4 = (FocusState) obj;
                focusState4.getClass();
                mutableState.setValue(Boolean.valueOf(focusState4.isFocused()));
                if (focusState4.isFocused()) {
                    function0.invoke();
                }
                break;
            case 4:
                FocusState focusState5 = (FocusState) obj;
                focusState5.getClass();
                mutableState.setValue(Boolean.valueOf(focusState5.isFocused()));
                if (focusState5.isFocused()) {
                    function0.invoke();
                }
                break;
            case 5:
                FocusState focusState6 = (FocusState) obj;
                focusState6.getClass();
                mutableState.setValue(Boolean.valueOf(focusState6.isFocused()));
                if (focusState6.isFocused()) {
                    function0.invoke();
                }
                break;
            case 6:
                FocusState focusState7 = (FocusState) obj;
                focusState7.getClass();
                mutableState.setValue(Boolean.valueOf(focusState7.isFocused()));
                if (focusState7.isFocused()) {
                    function0.invoke();
                }
                break;
            case 7:
                FocusState focusState8 = (FocusState) obj;
                focusState8.getClass();
                mutableState.setValue(Boolean.valueOf(focusState8.isFocused()));
                if (focusState8.isFocused()) {
                    function0.invoke();
                }
                break;
            case 8:
                FocusState focusState9 = (FocusState) obj;
                focusState9.getClass();
                mutableState.setValue(Boolean.valueOf(focusState9.isFocused()));
                if (focusState9.isFocused()) {
                    function0.invoke();
                }
                break;
            case 9:
                FocusState focusState10 = (FocusState) obj;
                focusState10.getClass();
                mutableState.setValue(Boolean.valueOf(focusState10.isFocused()));
                if (focusState10.isFocused()) {
                    function0.invoke();
                }
                break;
            case 10:
                FocusState focusState11 = (FocusState) obj;
                focusState11.getClass();
                mutableState.setValue(Boolean.valueOf(focusState11.isFocused()));
                if (focusState11.isFocused()) {
                    function0.invoke();
                }
                break;
            case 11:
                FocusState focusState12 = (FocusState) obj;
                focusState12.getClass();
                mutableState.setValue(Boolean.valueOf(focusState12.isFocused()));
                if (focusState12.isFocused()) {
                    function0.invoke();
                }
                break;
            case 12:
                FocusState focusState13 = (FocusState) obj;
                focusState13.getClass();
                mutableState.setValue(Boolean.valueOf(focusState13.isFocused()));
                if (focusState13.isFocused()) {
                    function0.invoke();
                }
                break;
            case 13:
                FocusState focusState14 = (FocusState) obj;
                focusState14.getClass();
                mutableState.setValue(Boolean.valueOf(focusState14.isFocused()));
                if (focusState14.isFocused()) {
                    function0.invoke();
                }
                break;
            case 14:
                FocusState focusState15 = (FocusState) obj;
                focusState15.getClass();
                mutableState.setValue(Boolean.valueOf(focusState15.isFocused()));
                if (focusState15.isFocused()) {
                    function0.invoke();
                }
                break;
            default:
                Float f = (Float) obj;
                Log.d("SubtitleSettings", "延迟调整中: " + f.floatValue());
                mutableState.setValue(f);
                function0.invoke();
                break;
        }
        return Unit.INSTANCE;
    }
}
