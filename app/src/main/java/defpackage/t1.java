package defpackage;

import androidx.compose.runtime.MutableState;
import androidx.compose.ui.focus.FocusState;
import androidx.compose.ui.layout.LayoutCoordinates;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.text.StringsKt;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class t1 implements Function1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ MutableState b;

    public /* synthetic */ t1(int i, MutableState mutableState) {
        this.a = i;
        this.b = mutableState;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i = this.a;
        MutableState mutableState = this.b;
        switch (i) {
            case 0:
                String str = (String) obj;
                str.getClass();
                mutableState.setValue(StringsKt.trim((CharSequence) str).toString());
                return Unit.INSTANCE;
            case 1:
                String str2 = (String) obj;
                str2.getClass();
                mutableState.setValue(StringsKt.trim((CharSequence) str2).toString());
                return Unit.INSTANCE;
            case 2:
                String str3 = (String) obj;
                str3.getClass();
                mutableState.setValue(StringsKt.trim((CharSequence) str3).toString());
                return Unit.INSTANCE;
            case 3:
                String str4 = (String) obj;
                str4.getClass();
                mutableState.setValue(StringsKt.trim((CharSequence) str4).toString());
                return Unit.INSTANCE;
            case 4:
                String str5 = (String) obj;
                str5.getClass();
                mutableState.setValue(StringsKt.trim((CharSequence) str5).toString());
                return Unit.INSTANCE;
            case 5:
                String str6 = (String) obj;
                str6.getClass();
                mutableState.setValue(str6);
                return Unit.INSTANCE;
            case 6:
                FocusState focusState = (FocusState) obj;
                focusState.getClass();
                mutableState.setValue(Boolean.valueOf(focusState.getHasFocus()));
                return Unit.INSTANCE;
            case 7:
                Boolean bool = (Boolean) obj;
                bool.booleanValue();
                mutableState.setValue(bool);
                return Unit.INSTANCE;
            case 8:
                FocusState focusState2 = (FocusState) obj;
                focusState2.getClass();
                mutableState.setValue(Boolean.valueOf(focusState2.getHasFocus()));
                return Unit.INSTANCE;
            case 9:
                Boolean bool2 = (Boolean) obj;
                bool2.booleanValue();
                mutableState.setValue(bool2);
                return Unit.INSTANCE;
            case 10:
                FocusState focusState3 = (FocusState) obj;
                focusState3.getClass();
                mutableState.setValue(Boolean.valueOf(focusState3.getHasFocus()));
                return Unit.INSTANCE;
            case 11:
                FocusState focusState4 = (FocusState) obj;
                focusState4.getClass();
                mutableState.setValue(Boolean.valueOf(focusState4.getHasFocus()));
                return Unit.INSTANCE;
            case 12:
                Boolean bool3 = (Boolean) obj;
                bool3.booleanValue();
                mutableState.setValue(bool3);
                return Unit.INSTANCE;
            case 13:
                Integer num = (Integer) obj;
                num.getClass();
                mutableState.setValue(num);
                return Unit.INSTANCE;
            case 14:
                Boolean bool4 = (Boolean) obj;
                bool4.booleanValue();
                mutableState.setValue(bool4);
                return Unit.INSTANCE;
            case 15:
                Integer num2 = (Integer) obj;
                num2.getClass();
                mutableState.setValue(num2);
                return Unit.INSTANCE;
            case 16:
                Boolean bool5 = (Boolean) obj;
                bool5.booleanValue();
                mutableState.setValue(bool5);
                return Unit.INSTANCE;
            case 17:
                Integer num3 = (Integer) obj;
                num3.getClass();
                mutableState.setValue(num3);
                return Unit.INSTANCE;
            case 18:
                Boolean bool6 = (Boolean) obj;
                bool6.booleanValue();
                mutableState.setValue(bool6);
                return Unit.INSTANCE;
            case 19:
                Boolean bool7 = (Boolean) obj;
                bool7.booleanValue();
                mutableState.setValue(bool7);
                return Unit.INSTANCE;
            case 20:
                Integer num4 = (Integer) obj;
                num4.getClass();
                mutableState.setValue(num4);
                return Unit.INSTANCE;
            case 21:
                Boolean bool8 = (Boolean) obj;
                bool8.booleanValue();
                mutableState.setValue(bool8);
                return Unit.INSTANCE;
            case 22:
                kb0.B(mutableState, (FocusState) obj);
                return Unit.INSTANCE;
            case 23:
                kb0.B(mutableState, (FocusState) obj);
                return Unit.INSTANCE;
            case 24:
                kb0.B(mutableState, (FocusState) obj);
                return Unit.INSTANCE;
            case 25:
                return AndroidTextContextMenuToolbarProvider_androidKt.ProvidePlatformTextContextMenuToolbar$lambda$5$0$0(mutableState, (LayoutCoordinates) obj);
            case 26:
                FocusState focusState5 = (FocusState) obj;
                focusState5.getClass();
                mutableState.setValue(Boolean.valueOf(focusState5.getHasFocus()));
                return Unit.INSTANCE;
            case 27:
                FocusState focusState6 = (FocusState) obj;
                focusState6.getClass();
                mutableState.setValue(Boolean.valueOf(focusState6.getHasFocus()));
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
