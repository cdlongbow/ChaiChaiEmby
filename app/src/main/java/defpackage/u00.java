package defpackage;

import androidx.compose.material3.DateInputKt;
import androidx.compose.runtime.MutableState;
import androidx.compose.ui.focus.FocusState;
import androidx.compose.ui.layout.LayoutCoordinates;
import androidx.compose.ui.layout.LayoutCoordinatesKt;
import androidx.compose.ui.semantics.SemanticsPropertyReceiver;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class u00 implements Function1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ MutableState b;

    public /* synthetic */ u00(int i, MutableState mutableState) {
        this.a = i;
        this.b = mutableState;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i = this.a;
        MutableState mutableState = this.b;
        switch (i) {
            case 0:
                return DateInputKt.DateInputTextField_xJ3Ic0Y$lambda$14$lambda$13(mutableState, (SemanticsPropertyReceiver) obj);
            case 1:
                FocusState focusState = (FocusState) obj;
                focusState.getClass();
                if (focusState.isFocused()) {
                    m20.c(4, mutableState);
                }
                return Unit.INSTANCE;
            case 2:
                FocusState focusState2 = (FocusState) obj;
                focusState2.getClass();
                if (focusState2.isFocused()) {
                    m20.c(3, mutableState);
                }
                return Unit.INSTANCE;
            case 3:
                FocusState focusState3 = (FocusState) obj;
                focusState3.getClass();
                if (focusState3.isFocused()) {
                    m20.c(5, mutableState);
                }
                return Unit.INSTANCE;
            case 4:
                kb0.B(mutableState, (FocusState) obj);
                return Unit.INSTANCE;
            case 5:
                kb0.B(mutableState, (FocusState) obj);
                return Unit.INSTANCE;
            case 6:
                kb0.B(mutableState, (FocusState) obj);
                return Unit.INSTANCE;
            case 7:
                kb0.B(mutableState, (FocusState) obj);
                return Unit.INSTANCE;
            case 8:
                kb0.B(mutableState, (FocusState) obj);
                return Unit.INSTANCE;
            case 9:
                kb0.B(mutableState, (FocusState) obj);
                return Unit.INSTANCE;
            case 10:
                kb0.B(mutableState, (FocusState) obj);
                return Unit.INSTANCE;
            case 11:
                kb0.B(mutableState, (FocusState) obj);
                return Unit.INSTANCE;
            case 12:
                kb0.B(mutableState, (FocusState) obj);
                return Unit.INSTANCE;
            case 13:
                kb0.B(mutableState, (FocusState) obj);
                return Unit.INSTANCE;
            case 14:
                kb0.B(mutableState, (FocusState) obj);
                return Unit.INSTANCE;
            case 15:
                kb0.B(mutableState, (FocusState) obj);
                return Unit.INSTANCE;
            case 16:
                kb0.B(mutableState, (FocusState) obj);
                return Unit.INSTANCE;
            case 17:
                kb0.B(mutableState, (FocusState) obj);
                return Unit.INSTANCE;
            case 18:
                kb0.B(mutableState, (FocusState) obj);
                return Unit.INSTANCE;
            case 19:
                kb0.B(mutableState, (FocusState) obj);
                return Unit.INSTANCE;
            case 20:
                ya1 ya1Var = (ya1) obj;
                ya1Var.getClass();
                mutableState.setValue(u90.q1(ya1Var));
                return Unit.INSTANCE;
            case 21:
                Boolean bool = (Boolean) obj;
                bool.booleanValue();
                mutableState.setValue(bool);
                return Unit.INSTANCE;
            case 22:
                kb0.B(mutableState, (FocusState) obj);
                return Unit.INSTANCE;
            case 23:
                kb0.B(mutableState, (FocusState) obj);
                return Unit.INSTANCE;
            case 24:
                String str = (String) obj;
                str.getClass();
                if (Intrinsics.areEqual((String) mutableState.getValue(), str)) {
                    mutableState.setValue(null);
                }
                return Unit.INSTANCE;
            case 25:
                FocusState focusState4 = (FocusState) obj;
                focusState4.getClass();
                mutableState.setValue(Boolean.valueOf(focusState4.getHasFocus()));
                return Unit.INSTANCE;
            case 26:
                kb0.B(mutableState, (FocusState) obj);
                return Unit.INSTANCE;
            case 27:
                kb0.B(mutableState, (FocusState) obj);
                return Unit.INSTANCE;
            case 28:
                LayoutCoordinates layoutCoordinates = (LayoutCoordinates) obj;
                layoutCoordinates.getClass();
                mutableState.setValue(LayoutCoordinatesKt.boundsInWindow$default(layoutCoordinates, false, 1, null));
                return Unit.INSTANCE;
            default:
                LayoutCoordinates layoutCoordinates2 = (LayoutCoordinates) obj;
                layoutCoordinates2.getClass();
                mutableState.setValue(LayoutCoordinatesKt.boundsInWindow$default(layoutCoordinates2, false, 1, null));
                return Unit.INSTANCE;
        }
    }
}
