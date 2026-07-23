package defpackage;

import androidx.compose.foundation.text.selection.Selection;
import androidx.compose.foundation.text.selection.SelectionContainerKt;
import androidx.compose.runtime.MutableState;
import androidx.compose.ui.focus.FocusState;
import androidx.media3.common.text.CueGroup;
import com.dh.myembyapp.data.ProxyProtocol;
import com.dh.myembyapp.data.model.ServerConfig;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class li1 implements Function1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ MutableState b;

    public /* synthetic */ li1(int i, MutableState mutableState) {
        this.a = i;
        this.b = mutableState;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i = this.a;
        MutableState mutableState = this.b;
        switch (i) {
            case 0:
                mutableState.setValue((String) obj);
                return Unit.INSTANCE;
            case 1:
                Boolean bool = (Boolean) obj;
                bool.booleanValue();
                mutableState.setValue(bool);
                return Unit.INSTANCE;
            case 2:
                Boolean bool2 = (Boolean) obj;
                bool2.booleanValue();
                mutableState.setValue(bool2);
                return Unit.INSTANCE;
            case 3:
                Boolean bool3 = (Boolean) obj;
                bool3.booleanValue();
                mutableState.setValue(bool3);
                return Unit.INSTANCE;
            case 4:
                String str = (String) obj;
                str.getClass();
                mutableState.setValue(str);
                return Unit.INSTANCE;
            case 5:
                Boolean bool4 = (Boolean) obj;
                bool4.booleanValue();
                mutableState.setValue(bool4);
                return Unit.INSTANCE;
            case 6:
                Integer num = (Integer) obj;
                num.intValue();
                mutableState.setValue(num);
                return Unit.INSTANCE;
            case 7:
                Boolean bool5 = (Boolean) obj;
                bool5.booleanValue();
                mutableState.setValue(bool5);
                return Unit.INSTANCE;
            case 8:
                String str2 = (String) obj;
                str2.getClass();
                mutableState.setValue(str2);
                return Unit.INSTANCE;
            case 9:
                mutableState.setValue((CueGroup) obj);
                return Unit.INSTANCE;
            case 10:
                Boolean bool6 = (Boolean) obj;
                bool6.booleanValue();
                mutableState.setValue(bool6);
                return Unit.INSTANCE;
            case 11:
                kb0.B(mutableState, (FocusState) obj);
                return Unit.INSTANCE;
            case 12:
                ProxyProtocol proxyProtocol = (ProxyProtocol) obj;
                proxyProtocol.getClass();
                mutableState.setValue(proxyProtocol);
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
                String str3 = (String) obj;
                str3.getClass();
                mutableState.setValue(str3);
                return Unit.INSTANCE;
            case 18:
                kb0.B(mutableState, (FocusState) obj);
                return Unit.INSTANCE;
            case 19:
                return SelectionContainerKt.SelectionContainer$lambda$3$0(mutableState, (Selection) obj);
            case 20:
                String str4 = (String) obj;
                str4.getClass();
                mutableState.setValue(str4);
                return Unit.INSTANCE;
            case 21:
                kb0.B(mutableState, (FocusState) obj);
                return Unit.INSTANCE;
            case 22:
                kb0.B(mutableState, (FocusState) obj);
                return Unit.INSTANCE;
            case 23:
                String str5 = (String) obj;
                str5.getClass();
                mutableState.setValue(str5);
                return Unit.INSTANCE;
            case 24:
                FocusState focusState = (FocusState) obj;
                focusState.getClass();
                mutableState.setValue(Boolean.valueOf(focusState.getHasFocus()));
                return Unit.INSTANCE;
            case 25:
                FocusState focusState2 = (FocusState) obj;
                focusState2.getClass();
                mutableState.setValue(Boolean.valueOf(focusState2.getHasFocus()));
                return Unit.INSTANCE;
            case 26:
                String str6 = (String) obj;
                str6.getClass();
                mutableState.setValue(str6);
                return Unit.INSTANCE;
            case 27:
                kb0.B(mutableState, (FocusState) obj);
                return Unit.INSTANCE;
            case 28:
                return ((ServerConfig) ((List) mutableState.getValue()).get(((Integer) obj).intValue())).getId();
            default:
                kb0.B(mutableState, (FocusState) obj);
                return Unit.INSTANCE;
        }
    }
}
