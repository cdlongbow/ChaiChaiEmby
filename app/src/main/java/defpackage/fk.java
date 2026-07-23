package defpackage;

import androidx.compose.foundation.text.BasicTextFieldKt;
import androidx.compose.foundation.text.CoreTextFieldKt;
import androidx.compose.foundation.text.input.internal.LegacyPlatformTextInputServiceAdapter;
import androidx.compose.material3.ExposedDropdownMenuKt;
import androidx.compose.runtime.State;
import androidx.compose.ui.focus.FocusRequester;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlinx.coroutines.flow.MutableSharedFlow;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class fk implements Function0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ Object c;

    public /* synthetic */ fk(int i, Object obj, boolean z) {
        this.a = i;
        this.b = z;
        this.c = obj;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.a) {
            case 0:
                return BasicTextFieldKt.BasicTextField$lambda$13$0(this.b, (MutableSharedFlow) this.c);
            case 1:
                return CoreTextFieldKt.CoreTextField$lambda$19$0(this.b, (LegacyPlatformTextInputServiceAdapter) this.c);
            case 2:
                State state = (State) this.c;
                if (this.b) {
                    ((Function0) state.getValue()).invoke();
                }
                return Unit.INSTANCE;
            default:
                return ExposedDropdownMenuKt.ExposedDropdownMenuBox$lambda$20$lambda$19(this.b, (FocusRequester) this.c);
        }
    }
}
