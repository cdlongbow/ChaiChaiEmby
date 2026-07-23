package defpackage;

import androidx.compose.runtime.MutableState;
import androidx.compose.ui.focus.FocusState;
import androidx.compose.ui.layout.LayoutCoordinates;
import com.dh.myembyapp.data.model.AudioVersionPrioritySettings;
import com.dh.myembyapp.data.model.SubtitleVersionPrioritySettings;
import com.dh.myembyapp.data.model.VideoVersionPrioritySettings;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class ub1 implements Function1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ MutableState b;

    public /* synthetic */ ub1(int i, MutableState mutableState) {
        this.a = i;
        this.b = mutableState;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i = this.a;
        MutableState mutableState = this.b;
        switch (i) {
            case 0:
                VideoVersionPrioritySettings videoVersionPrioritySettings = (VideoVersionPrioritySettings) obj;
                videoVersionPrioritySettings.getClass();
                mutableState.setValue(videoVersionPrioritySettings.normalized());
                return Unit.INSTANCE;
            case 1:
                kb0.B(mutableState, (FocusState) obj);
                return Unit.INSTANCE;
            case 2:
                AudioVersionPrioritySettings audioVersionPrioritySettings = (AudioVersionPrioritySettings) obj;
                audioVersionPrioritySettings.getClass();
                mutableState.setValue(audioVersionPrioritySettings.normalized());
                return Unit.INSTANCE;
            case 3:
                SubtitleVersionPrioritySettings subtitleVersionPrioritySettings = (SubtitleVersionPrioritySettings) obj;
                subtitleVersionPrioritySettings.getClass();
                mutableState.setValue(subtitleVersionPrioritySettings.normalized());
                return Unit.INSTANCE;
            case 4:
                kb0.B(mutableState, (FocusState) obj);
                return Unit.INSTANCE;
            case 5:
                kb0.B(mutableState, (FocusState) obj);
                return Unit.INSTANCE;
            case 6:
                return PlatformDefaultTextContextMenuProviders_androidKt.ProvideBothDefaultProviders$lambda$4$0$0(mutableState, (LayoutCoordinates) obj);
            case 7:
                kb0.B(mutableState, (FocusState) obj);
                return Unit.INSTANCE;
            case 8:
                Boolean bool = (Boolean) obj;
                bool.booleanValue();
                mutableState.setValue(bool);
                return Unit.INSTANCE;
            case 9:
                kb0.B(mutableState, (FocusState) obj);
                return Unit.INSTANCE;
            case 10:
                Boolean bool2 = (Boolean) obj;
                bool2.booleanValue();
                mutableState.setValue(bool2);
                return Unit.INSTANCE;
            case 11:
                Boolean bool3 = (Boolean) obj;
                bool3.booleanValue();
                mutableState.setValue(bool3);
                return Unit.INSTANCE;
            case 12:
                Integer num = (Integer) obj;
                num.intValue();
                mutableState.setValue(num);
                return Unit.INSTANCE;
            case 13:
                Integer num2 = (Integer) obj;
                num2.intValue();
                mutableState.setValue(num2);
                return Unit.INSTANCE;
            case 14:
                Boolean bool4 = (Boolean) obj;
                bool4.booleanValue();
                mutableState.setValue(bool4);
                return Unit.INSTANCE;
            case 15:
                Boolean bool5 = (Boolean) obj;
                bool5.booleanValue();
                mutableState.setValue(bool5);
                return Unit.INSTANCE;
            case 16:
                Boolean bool6 = (Boolean) obj;
                bool6.booleanValue();
                mutableState.setValue(bool6);
                return Unit.INSTANCE;
            case 17:
                Boolean bool7 = (Boolean) obj;
                bool7.booleanValue();
                mutableState.setValue(bool7);
                return Unit.INSTANCE;
            case 18:
                Boolean bool8 = (Boolean) obj;
                bool8.booleanValue();
                mutableState.setValue(bool8);
                return Unit.INSTANCE;
            case 19:
                Integer num3 = (Integer) obj;
                num3.intValue();
                mutableState.setValue(num3);
                return Unit.INSTANCE;
            case 20:
                Boolean bool9 = (Boolean) obj;
                bool9.getClass();
                mutableState.setValue(bool9);
                return Unit.INSTANCE;
            case 21:
                Boolean bool10 = (Boolean) obj;
                bool10.getClass();
                mutableState.setValue(bool10);
                return Unit.INSTANCE;
            case 22:
                Boolean bool11 = (Boolean) obj;
                bool11.getClass();
                mutableState.setValue(bool11);
                return Unit.INSTANCE;
            case 23:
                Boolean bool12 = (Boolean) obj;
                bool12.booleanValue();
                mutableState.setValue(bool12);
                return Unit.INSTANCE;
            case 24:
                Boolean bool13 = (Boolean) obj;
                bool13.getClass();
                mutableState.setValue(bool13);
                return Unit.INSTANCE;
            case 25:
                Boolean bool14 = (Boolean) obj;
                bool14.booleanValue();
                mutableState.setValue(bool14);
                return Unit.INSTANCE;
            case 26:
                Boolean bool15 = (Boolean) obj;
                bool15.booleanValue();
                mutableState.setValue(bool15);
                return Unit.INSTANCE;
            case 27:
                Boolean bool16 = (Boolean) obj;
                bool16.getClass();
                mutableState.setValue(bool16);
                return Unit.INSTANCE;
            case 28:
                Boolean bool17 = (Boolean) obj;
                bool17.getClass();
                mutableState.setValue(bool17);
                return Unit.INSTANCE;
            default:
                mutableState.setValue((String) obj);
                return Unit.INSTANCE;
        }
    }
}
