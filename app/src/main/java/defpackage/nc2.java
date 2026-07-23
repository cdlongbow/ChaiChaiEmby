package defpackage;

import androidx.compose.runtime.MutableState;
import androidx.compose.ui.platform.SoftwareKeyboardController;
import androidx.compose.ui.text.input.TextFieldValue;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class nc2 extends FunctionReferenceImpl implements Function0 {
    public final /* synthetic */ boolean a;
    public final /* synthetic */ MutableState b;
    public final /* synthetic */ Function1 c;
    public final /* synthetic */ TextFieldValue d;
    public final /* synthetic */ CoroutineScope e;
    public final /* synthetic */ SoftwareKeyboardController g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public nc2(boolean z, MutableState mutableState, Function1 function1, TextFieldValue textFieldValue, CoroutineScope coroutineScope, SoftwareKeyboardController softwareKeyboardController) {
        super(0, Intrinsics.Kotlin.class, "enterEditing", "TvConfirmEditableBasicTextField$enterEditing(ZLandroidx/compose/runtime/MutableState;Lkotlin/jvm/functions/Function1;Landroidx/compose/ui/text/input/TextFieldValue;Lkotlinx/coroutines/CoroutineScope;Landroidx/compose/ui/platform/SoftwareKeyboardController;)V", 0);
        this.a = z;
        this.b = mutableState;
        this.c = function1;
        this.d = textFieldValue;
        this.e = coroutineScope;
        this.g = softwareKeyboardController;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        yc2.f(this.a, this.b, this.c, this.d, this.e, this.g);
        return Unit.INSTANCE;
    }
}
