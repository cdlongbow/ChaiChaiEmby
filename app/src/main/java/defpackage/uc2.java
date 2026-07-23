package defpackage;

import androidx.compose.runtime.MutableState;
import androidx.compose.ui.platform.SoftwareKeyboardController;
import androidx.compose.ui.text.AnnotatedString;
import androidx.compose.ui.text.TextRange;
import androidx.compose.ui.text.TextRangeKt;
import androidx.compose.ui.text.input.TextFieldValue;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class uc2 extends FunctionReferenceImpl implements Function0 {
    public final /* synthetic */ boolean a;
    public final /* synthetic */ MutableState b;
    public final /* synthetic */ CoroutineScope c;
    public final /* synthetic */ MutableState d;
    public final /* synthetic */ SoftwareKeyboardController e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public uc2(boolean z, MutableState mutableState, CoroutineScope coroutineScope, MutableState mutableState2, SoftwareKeyboardController softwareKeyboardController) {
        super(0, Intrinsics.Kotlin.class, "enterEditing", "TvConfirmEditableOutlinedTextField$enterEditing(ZLandroidx/compose/runtime/MutableState;Lkotlinx/coroutines/CoroutineScope;Landroidx/compose/runtime/MutableState;Landroidx/compose/ui/platform/SoftwareKeyboardController;)V", 0);
        this.a = z;
        this.b = mutableState;
        this.c = coroutineScope;
        this.d = mutableState2;
        this.e = softwareKeyboardController;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        boolean z = this.a;
        if (z) {
            this.b.setValue(Boolean.TRUE);
            if (z) {
                MutableState mutableState = this.d;
                mutableState.setValue(TextFieldValue.m7519copy3r_uNRQ$default((TextFieldValue) mutableState.getValue(), (AnnotatedString) null, TextRangeKt.TextRange(((TextFieldValue) mutableState.getValue()).getText().length()), (TextRange) null, 5, (Object) null));
                BuildersKt__Builders_commonKt.launch$default(this.c, null, null, new tc2(this.e, null, 1), 3, null);
            }
        }
        return Unit.INSTANCE;
    }
}
