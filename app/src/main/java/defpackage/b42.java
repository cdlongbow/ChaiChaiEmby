package defpackage;

import androidx.compose.runtime.MutableState;
import androidx.compose.ui.focus.FocusState;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class b42 implements Function1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ MutableState b;

    public /* synthetic */ b42(int i, MutableState mutableState) {
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
                break;
            case 1:
                kb0.B(mutableState, (FocusState) obj);
                break;
            case 2:
                kb0.B(mutableState, (FocusState) obj);
                break;
            case 3:
                kb0.B(mutableState, (FocusState) obj);
                break;
            case 4:
                kb0.B(mutableState, (FocusState) obj);
                break;
            case 5:
                kb0.B(mutableState, (FocusState) obj);
                break;
            case 6:
                FocusState focusState = (FocusState) obj;
                focusState.getClass();
                mutableState.setValue(Boolean.valueOf(focusState.getHasFocus()));
                focusState.getHasFocus();
                break;
            case 7:
                FocusState focusState2 = (FocusState) obj;
                focusState2.getClass();
                mutableState.setValue(Boolean.valueOf(focusState2.getHasFocus()));
                break;
            case 8:
                kb0.B(mutableState, (FocusState) obj);
                break;
            case 9:
                kb0.B(mutableState, (FocusState) obj);
                break;
            case 10:
                Integer num = (Integer) obj;
                num.intValue();
                mutableState.setValue(num);
                break;
            case 11:
                kb0.B(mutableState, (FocusState) obj);
                break;
            case 12:
                kb0.B(mutableState, (FocusState) obj);
                break;
            case 13:
                String str = (String) obj;
                str.getClass();
                mutableState.setValue(str);
                break;
            case 14:
                Boolean bool = (Boolean) obj;
                bool.booleanValue();
                mutableState.setValue(bool);
                break;
            case 15:
                String str2 = (String) obj;
                str2.getClass();
                mutableState.setValue(str2);
                break;
            case 16:
                Boolean bool2 = (Boolean) obj;
                bool2.booleanValue();
                mutableState.setValue(bool2);
                break;
            case 17:
                kb0.B(mutableState, (FocusState) obj);
                break;
            case 18:
                String str3 = (String) obj;
                str3.getClass();
                mutableState.setValue(str3);
                break;
            default:
                Boolean bool3 = (Boolean) obj;
                bool3.booleanValue();
                mutableState.setValue(bool3);
                break;
        }
        return Unit.INSTANCE;
    }
}
