package defpackage;

import androidx.compose.material3.TimePickerKt;
import androidx.compose.runtime.DisposableEffectScope;
import androidx.compose.runtime.MutableState;
import androidx.compose.ui.focus.FocusState;
import androidx.compose.ui.layout.LayoutCoordinates;
import androidx.compose.ui.text.AnnotatedString;
import androidx.compose.ui.text.TextRange;
import androidx.compose.ui.text.TextRangeKt;
import androidx.compose.ui.text.input.TextFieldValue;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class y1 implements Function1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ MutableState b;
    public final /* synthetic */ MutableState c;
    public final /* synthetic */ MutableState d;

    public /* synthetic */ y1(MutableState mutableState, MutableState mutableState2, MutableState mutableState3, int i) {
        this.a = i;
        this.b = mutableState;
        this.c = mutableState2;
        this.d = mutableState3;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i = this.a;
        MutableState mutableState = this.d;
        MutableState mutableState2 = this.c;
        MutableState mutableState3 = this.b;
        switch (i) {
            case 0:
                String str = (String) obj;
                str.getClass();
                ad1 ad1VarC = p2.c(str);
                mutableState3.setValue(ad1VarC.a);
                String str2 = ad1VarC.b;
                if (str2 != null) {
                    mutableState2.setValue(str2);
                }
                Integer num = ad1VarC.c;
                if (num != null) {
                    mutableState.setValue(String.valueOf(num.intValue()));
                }
                return Unit.INSTANCE;
            case 1:
                mutableState3.setValue((List) obj);
                qy.p(mutableState2, false);
                mutableState.setValue(null);
                return Unit.INSTANCE;
            case 2:
                mutableState3.setValue((List) obj);
                qy.p(mutableState2, false);
                mutableState.setValue(null);
                return Unit.INSTANCE;
            case 3:
                mutableState3.setValue((List) obj);
                qy.p(mutableState2, false);
                mutableState.setValue(null);
                return Unit.INSTANCE;
            case 4:
                x82 x82Var = (x82) obj;
                x82Var.getClass();
                bq0.o(mutableState3, true);
                int iOrdinal = x82Var.ordinal();
                if (iOrdinal == 0) {
                    mr.A((Number) mutableState2.getValue(), 1, mutableState2);
                } else {
                    if (iOrdinal != 1) {
                        qu.f();
                        return null;
                    }
                    mr.A((Number) mutableState.getValue(), 1, mutableState);
                }
                return Unit.INSTANCE;
            case 5:
                FocusState focusState = (FocusState) obj;
                focusState.getClass();
                mutableState3.setValue(Boolean.valueOf(focusState.isFocused()));
                mutableState2.setValue(Boolean.valueOf(focusState.isFocused()));
                if (focusState.isFocused()) {
                    mutableState.setValue(TextFieldValue.m7519copy3r_uNRQ$default((TextFieldValue) mutableState.getValue(), (AnnotatedString) null, TextRangeKt.TextRange(((TextFieldValue) mutableState.getValue()).getText().length()), (TextRange) null, 5, (Object) null));
                }
                return Unit.INSTANCE;
            case 6:
                return TimePickerKt.ClockText$lambda$77$lambda$76(mutableState3, mutableState2, mutableState, (LayoutCoordinates) obj);
            default:
                ((DisposableEffectScope) obj).getClass();
                return new an1(mutableState3, mutableState2, mutableState);
        }
    }
}
