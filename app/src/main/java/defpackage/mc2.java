package defpackage;

import androidx.compose.runtime.MutableState;
import androidx.compose.ui.platform.SoftwareKeyboardController;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class mc2 extends FunctionReferenceImpl implements Function0 {
    public final /* synthetic */ SoftwareKeyboardController a;
    public final /* synthetic */ MutableState b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public mc2(SoftwareKeyboardController softwareKeyboardController, MutableState mutableState) {
        super(0, Intrinsics.Kotlin.class, "exitEditing", "TvConfirmEditableBasicTextField$exitEditing(Landroidx/compose/ui/platform/SoftwareKeyboardController;Landroidx/compose/runtime/MutableState;)V", 0);
        this.a = softwareKeyboardController;
        this.b = mutableState;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        yc2.c(this.a, this.b);
        return Unit.INSTANCE;
    }
}
