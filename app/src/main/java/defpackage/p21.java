package defpackage;

import androidx.compose.runtime.MutableState;
import androidx.compose.ui.focus.FocusState;
import com.dh.myembyapp.data.model.PlayerDefaultViewMode;
import com.dh.myembyapp.data.model.PlayerFrameRateMatchingMode;
import com.dh.myembyapp.data.model.PlayerResizeMode;
import com.dh.myembyapp.data.model.SystemNetworkSpeedDisplayMode;
import com.dh.myembyapp.data.model.SystemNetworkSpeedPosition;
import com.dh.myembyapp.data.model.SystemTimeDisplayMode;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class p21 implements Function1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ MutableState b;

    public /* synthetic */ p21(int i, MutableState mutableState) {
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
                mutableState.setValue(str);
                return Unit.INSTANCE;
            case 1:
                ((hf) obj).getClass();
                mutableState.setValue(Boolean.FALSE);
                return Unit.INSTANCE;
            case 2:
                ((hf) obj).getClass();
                mutableState.setValue(Boolean.FALSE);
                return Unit.INSTANCE;
            case 3:
                FocusState focusState = (FocusState) obj;
                focusState.getClass();
                mutableState.setValue(Boolean.valueOf(focusState.getHasFocus()));
                return Unit.INSTANCE;
            case 4:
                String str2 = (String) obj;
                str2.getClass();
                mutableState.setValue(str2);
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
                return ((qe) ((List) mutableState.getValue()).get(((Integer) obj).intValue())).a;
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
                SystemTimeDisplayMode systemTimeDisplayMode = (SystemTimeDisplayMode) obj;
                systemTimeDisplayMode.getClass();
                mutableState.setValue(systemTimeDisplayMode);
                return Unit.INSTANCE;
            case 17:
                SystemNetworkSpeedDisplayMode systemNetworkSpeedDisplayMode = (SystemNetworkSpeedDisplayMode) obj;
                systemNetworkSpeedDisplayMode.getClass();
                mutableState.setValue(systemNetworkSpeedDisplayMode);
                return Unit.INSTANCE;
            case 18:
                SystemNetworkSpeedPosition systemNetworkSpeedPosition = (SystemNetworkSpeedPosition) obj;
                systemNetworkSpeedPosition.getClass();
                mutableState.setValue(systemNetworkSpeedPosition);
                return Unit.INSTANCE;
            case 19:
                kb0.B(mutableState, (FocusState) obj);
                return Unit.INSTANCE;
            case 20:
                kb0.B(mutableState, (FocusState) obj);
                return Unit.INSTANCE;
            case 21:
                PlayerResizeMode playerResizeMode = (PlayerResizeMode) obj;
                playerResizeMode.getClass();
                mutableState.setValue(playerResizeMode);
                return Unit.INSTANCE;
            case 22:
                kb0.B(mutableState, (FocusState) obj);
                return Unit.INSTANCE;
            case 23:
                PlayerDefaultViewMode playerDefaultViewMode = (PlayerDefaultViewMode) obj;
                playerDefaultViewMode.getClass();
                mutableState.setValue(playerDefaultViewMode);
                return Unit.INSTANCE;
            case 24:
                kb0.B(mutableState, (FocusState) obj);
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
                PlayerFrameRateMatchingMode playerFrameRateMatchingMode = (PlayerFrameRateMatchingMode) obj;
                playerFrameRateMatchingMode.getClass();
                mutableState.setValue(playerFrameRateMatchingMode);
                return Unit.INSTANCE;
            default:
                kb0.B(mutableState, (FocusState) obj);
                return Unit.INSTANCE;
        }
    }
}
