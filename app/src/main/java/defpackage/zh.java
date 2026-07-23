package defpackage;

import androidx.compose.foundation.text.BasicTextKt;
import androidx.compose.foundation.text.modifiers.TextAnnotatedStringNode;
import androidx.compose.runtime.DisposableEffectScope;
import androidx.compose.runtime.MutableState;
import androidx.compose.ui.focus.FocusState;
import androidx.compose.ui.layout.LayoutCoordinates;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class zh implements Function1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ MutableState b;

    public /* synthetic */ zh(int i, MutableState mutableState) {
        this.a = i;
        this.b = mutableState;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i = this.a;
        MutableState mutableState = this.b;
        switch (i) {
            case 0:
                kb0.B(mutableState, (FocusState) obj);
                return Unit.INSTANCE;
            case 1:
                kb0.B(mutableState, (FocusState) obj);
                return Unit.INSTANCE;
            case 2:
                kb0.B(mutableState, (FocusState) obj);
                return Unit.INSTANCE;
            case 3:
                return BasicTextContextMenuProviderKt.ProvideBasicTextContextMenu$lambda$4$0$0(mutableState, (LayoutCoordinates) obj);
            case 4:
                return BasicTextKt.LayoutWithLinksAndInlineContent_11Od_4g$lambda$4$0(mutableState, (List) obj);
            case 5:
                return BasicTextKt.BasicText_CL7eQgs$lambda$5$0(mutableState, (TextAnnotatedStringNode.TextSubstitutionValue) obj);
            case 6:
                kb0.B(mutableState, (FocusState) obj);
                return Unit.INSTANCE;
            case 7:
                FocusState focusState = (FocusState) obj;
                focusState.getClass();
                mutableState.setValue(Boolean.valueOf(focusState.getHasFocus()));
                return Unit.INSTANCE;
            case 8:
                kb0.B(mutableState, (FocusState) obj);
                return Unit.INSTANCE;
            case 9:
                FocusState focusState2 = (FocusState) obj;
                focusState2.getClass();
                mutableState.setValue(Boolean.valueOf(focusState2.getHasFocus()));
                return Unit.INSTANCE;
            case 10:
                kb0.B(mutableState, (FocusState) obj);
                return Unit.INSTANCE;
            case 11:
                ((DisposableEffectScope) obj).getClass();
                return new ez(0, mutableState);
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
                kb0.B(mutableState, (FocusState) obj);
                return Unit.INSTANCE;
            case 21:
                kb0.B(mutableState, (FocusState) obj);
                return Unit.INSTANCE;
            case 22:
                ((DisposableEffectScope) obj).getClass();
                return new ez(1, mutableState);
            case 23:
                Boolean bool = (Boolean) obj;
                bool.booleanValue();
                mutableState.setValue(bool);
                return Unit.INSTANCE;
            case 24:
                Boolean bool2 = (Boolean) obj;
                bool2.booleanValue();
                mutableState.setValue(bool2);
                return Unit.INSTANCE;
            case 25:
                kb0.B(mutableState, (FocusState) obj);
                return Unit.INSTANCE;
            case 26:
                kb0.B(mutableState, (FocusState) obj);
                return Unit.INSTANCE;
            case 27:
                kb0.B(mutableState, (FocusState) obj);
                return Unit.INSTANCE;
            case 28:
                kb0.B(mutableState, (FocusState) obj);
                return Unit.INSTANCE;
            default:
                kb0.B(mutableState, (FocusState) obj);
                return Unit.INSTANCE;
        }
    }
}
