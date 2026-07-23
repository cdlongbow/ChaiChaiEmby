package defpackage;

import androidx.compose.foundation.text.input.internal.selection.TextFieldSelectionState;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Ref;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class w62 implements Function0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Ref.LongRef b;
    public final /* synthetic */ Ref.LongRef c;
    public final /* synthetic */ TextFieldSelectionState d;

    public /* synthetic */ w62(Ref.LongRef longRef, TextFieldSelectionState textFieldSelectionState, Ref.LongRef longRef2, int i) {
        this.a = i;
        this.b = longRef;
        this.d = textFieldSelectionState;
        this.c = longRef2;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int i = this.a;
        Ref.LongRef longRef = this.c;
        TextFieldSelectionState textFieldSelectionState = this.d;
        Ref.LongRef longRef2 = this.b;
        switch (i) {
            case 0:
                return TextFieldSelectionState.detectSelectionHandleDragGestures$lambda$2(longRef2, textFieldSelectionState, longRef);
            case 1:
                return TextFieldSelectionState.detectCursorHandleDragGestures$lambda$1(longRef2, longRef, textFieldSelectionState);
            case 2:
                return TextFieldSelectionState.detectCursorHandleDragGestures$lambda$2(longRef2, longRef, textFieldSelectionState);
            default:
                return TextFieldSelectionState.detectSelectionHandleDragGestures$lambda$1(longRef2, textFieldSelectionState, longRef);
        }
    }

    public /* synthetic */ w62(Ref.LongRef longRef, Ref.LongRef longRef2, TextFieldSelectionState textFieldSelectionState, int i) {
        this.a = i;
        this.b = longRef;
        this.c = longRef2;
        this.d = textFieldSelectionState;
    }
}
