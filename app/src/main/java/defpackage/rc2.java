package defpackage;

import androidx.compose.runtime.MutableState;
import androidx.compose.ui.platform.SoftwareKeyboardController;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class rc2 extends FunctionReferenceImpl implements Function0 {
    public final /* synthetic */ Function0 a;
    public final /* synthetic */ SoftwareKeyboardController b;
    public final /* synthetic */ MutableState c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public rc2(Function0 function0, SoftwareKeyboardController softwareKeyboardController, MutableState mutableState) {
        super(0, Intrinsics.Kotlin.class, "finishImeAction", "TvConfirmEditableBasicTextField$finishImeAction(Lkotlin/jvm/functions/Function0;Landroidx/compose/ui/platform/SoftwareKeyboardController;Landroidx/compose/runtime/MutableState;)V", 0);
        this.a = function0;
        this.b = softwareKeyboardController;
        this.c = mutableState;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        yc2.c(this.b, this.c);
        this.a.invoke();
        return Unit.INSTANCE;
    }
}
