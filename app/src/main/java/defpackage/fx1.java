package defpackage;

import androidx.compose.runtime.MutableState;
import androidx.compose.ui.focus.FocusManager;
import androidx.compose.ui.focus.FocusRequester;
import androidx.compose.ui.platform.SoftwareKeyboardController;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class fx1 implements Function0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ SoftwareKeyboardController b;
    public final /* synthetic */ FocusManager c;
    public final /* synthetic */ Function0 d;
    public final /* synthetic */ MutableState e;
    public final /* synthetic */ CoroutineScope g;
    public final /* synthetic */ FocusRequester h;

    public /* synthetic */ fx1(SoftwareKeyboardController softwareKeyboardController, FocusManager focusManager, Function0 function0, MutableState mutableState, CoroutineScope coroutineScope, FocusRequester focusRequester, int i) {
        this.a = i;
        this.b = softwareKeyboardController;
        this.c = focusManager;
        this.d = function0;
        this.e = mutableState;
        this.g = coroutineScope;
        this.h = focusRequester;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int i = this.a;
        FocusRequester focusRequester = this.h;
        CoroutineScope coroutineScope = this.g;
        MutableState mutableState = this.e;
        Function0 function0 = this.d;
        FocusManager focusManager = this.c;
        SoftwareKeyboardController softwareKeyboardController = this.b;
        switch (i) {
            case 0:
                lx1.e(this.b, this.c, this.d, this.e, this.g, this.h);
                break;
            case 1:
                lx1.e(this.b, this.c, this.d, this.e, this.g, this.h);
                break;
            case 2:
                if (((Boolean) mutableState.getValue()).booleanValue()) {
                    ef2.h(softwareKeyboardController, focusManager, coroutineScope, mutableState, focusRequester);
                } else {
                    if (softwareKeyboardController != null) {
                        softwareKeyboardController.hide();
                    }
                    focusManager.clearFocus(true);
                    function0.invoke();
                }
                break;
            default:
                if (((Boolean) mutableState.getValue()).booleanValue()) {
                    ef2.h(softwareKeyboardController, focusManager, coroutineScope, mutableState, focusRequester);
                } else {
                    if (softwareKeyboardController != null) {
                        softwareKeyboardController.hide();
                    }
                    focusManager.clearFocus(true);
                    function0.invoke();
                }
                break;
        }
        return Unit.INSTANCE;
    }
}
