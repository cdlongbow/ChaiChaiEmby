package defpackage;

import androidx.compose.runtime.MutableState;
import androidx.compose.ui.focus.FocusState;
import androidx.compose.ui.text.AnnotatedString;
import androidx.compose.ui.text.TextRange;
import androidx.compose.ui.text.TextRangeKt;
import androidx.compose.ui.text.input.TextFieldValue;
import java.util.Collection;
import java.util.List;
import java.util.Set;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.text.StringsKt;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class ai implements Function1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ MutableState b;
    public final /* synthetic */ MutableState c;

    public /* synthetic */ ai(int i, MutableState mutableState, MutableState mutableState2) {
        this.a = i;
        this.b = mutableState;
        this.c = mutableState2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i = this.a;
        MutableState mutableState = this.c;
        MutableState mutableState2 = this.b;
        switch (i) {
            case 0:
                String str = (String) obj;
                str.getClass();
                Set mutableSet = CollectionsKt.toMutableSet((Set) mutableState2.getValue());
                if (!mutableSet.add(str)) {
                    mutableSet.remove(str);
                }
                mutableState2.setValue(mutableSet);
                mutableState.setValue(null);
                break;
            case 1:
                FocusState focusState = (FocusState) obj;
                focusState.getClass();
                mutableState2.setValue(Boolean.valueOf(focusState.isFocused()));
                if (focusState.isFocused()) {
                    mutableState.setValue(TextFieldValue.m7519copy3r_uNRQ$default((TextFieldValue) mutableState.getValue(), (AnnotatedString) null, TextRangeKt.TextRange(((TextFieldValue) mutableState.getValue()).getText().length()), (TextRange) null, 5, (Object) null));
                }
                break;
            case 2:
                TextFieldValue textFieldValue = (TextFieldValue) obj;
                textFieldValue.getClass();
                mutableState2.setValue(textFieldValue);
                mutableState.setValue(textFieldValue.getText());
                break;
            case 3:
                mutableState2.setValue((String) obj);
                qy.p(mutableState, false);
                break;
            case 4:
                mutableState2.setValue((String) obj);
                qy.p(mutableState, false);
                break;
            case 5:
                mutableState2.setValue((String) obj);
                qy.p(mutableState, false);
                break;
            case 6:
                String str2 = (String) obj;
                str2.getClass();
                mutableState2.setValue(str2);
                mutableState.setValue(-1);
                break;
            case 7:
                String str3 = (String) obj;
                str3.getClass();
                mutableState2.setValue(str3);
                mutableState.setValue(-1);
                break;
            case 8:
                TextFieldValue textFieldValue2 = (TextFieldValue) obj;
                textFieldValue2.getClass();
                mutableState2.setValue(textFieldValue2);
                mutableState.setValue(textFieldValue2.getText());
                break;
            case 9:
                vd1 vd1Var = (vd1) obj;
                Integer num = (Integer) mutableState2.getValue();
                if (vd1Var != null && num != null) {
                    int iIntValue = num.intValue();
                    int i2 = ud1.d;
                    String strF = x2.f(iIntValue, "已自动重试 ", " 次仍失败");
                    String str4 = vd1Var.a + "（" + strF + "）";
                    List listPlus = CollectionsKt.plus((Collection) CollectionsKt.listOf("自动重试: 已自动刷新 PlaybackInfo " + iIntValue + " 次，仍然失败"), (Iterable) vd1Var.c);
                    String str5 = vd1Var.b;
                    listPlus.getClass();
                    vd1Var = new vd1(str4, str5, listPlus);
                }
                mutableState.setValue(vd1Var);
                break;
            case 10:
                String str6 = (String) obj;
                str6.getClass();
                if (gr1.d(mutableState2)) {
                    mutableState.setValue(str6);
                }
                break;
            case 11:
                String str7 = (String) obj;
                str7.getClass();
                for (int i3 = 0; i3 < str7.length(); i3++) {
                    if (!Character.isDigit(str7.charAt(i3))) {
                    }
                    break;
                }
                if ((str7.length() == 0 || StringsKt.toIntOrNull(str7) != null) && gr1.d(mutableState2)) {
                    mutableState.setValue(str7);
                }
                break;
            case 12:
                String str8 = (String) obj;
                str8.getClass();
                if (gr1.d(mutableState2)) {
                    mutableState.setValue(str8);
                }
                break;
            default:
                String str9 = (String) obj;
                str9.getClass();
                if (gr1.d(mutableState2)) {
                    mutableState.setValue(str9);
                }
                break;
        }
        return Unit.INSTANCE;
    }
}
