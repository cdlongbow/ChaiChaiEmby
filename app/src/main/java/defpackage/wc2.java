package defpackage;

import android.view.KeyEvent;
import androidx.compose.runtime.MutableState;
import androidx.compose.ui.focus.FocusManager;
import androidx.compose.ui.platform.SoftwareKeyboardController;
import kotlin.jvm.functions.Function1;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: loaded from: classes4.dex */
public final class wc2 implements Function1 {
    public final /* synthetic */ FocusManager a;
    public final /* synthetic */ MutableState b;
    public final /* synthetic */ boolean c;
    public final /* synthetic */ CoroutineScope d;
    public final /* synthetic */ MutableState e;
    public final /* synthetic */ SoftwareKeyboardController g;

    public wc2(FocusManager focusManager, MutableState mutableState, boolean z, CoroutineScope coroutineScope, MutableState mutableState2, SoftwareKeyboardController softwareKeyboardController) {
        this.a = focusManager;
        this.b = mutableState;
        this.c = z;
        this.d = coroutineScope;
        this.e = mutableState2;
        this.g = softwareKeyboardController;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        KeyEvent keyEventM6229unboximpl = ((androidx.compose.ui.input.key.KeyEvent) obj).m6229unboximpl();
        keyEventM6229unboximpl.getClass();
        MutableState mutableState = this.b;
        return Boolean.valueOf(yc2.g(keyEventM6229unboximpl, ((Boolean) mutableState.getValue()).booleanValue(), new uc2(this.c, this.b, this.d, this.e, this.g), new vc2(this.g, mutableState), new dy1(this.a, 2)));
    }
}
