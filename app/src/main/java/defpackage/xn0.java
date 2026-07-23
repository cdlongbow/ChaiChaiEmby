package defpackage;

import androidx.compose.runtime.MutableState;
import com.dh.myembyapp.data.preferences.UserPreferences;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class xn0 implements Function1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ UserPreferences b;
    public final /* synthetic */ MutableState c;
    public final /* synthetic */ MutableState d;

    public /* synthetic */ xn0(UserPreferences userPreferences, MutableState mutableState, MutableState mutableState2, int i) {
        this.a = i;
        this.b = userPreferences;
        this.c = mutableState;
        this.d = mutableState2;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i = this.a;
        MutableState mutableState = this.d;
        MutableState mutableState2 = this.c;
        UserPreferences userPreferences = this.b;
        String str = (String) obj;
        switch (i) {
            case 0:
                userPreferences.saveQrNetworkInterfaceName(str);
                mutableState2.setValue(Boolean.FALSE);
                Unit unit = Unit.INSTANCE;
                mutableState.setValue(Boolean.TRUE);
                break;
            default:
                userPreferences.saveQrNetworkInterfaceName(str);
                mutableState2.setValue(Boolean.FALSE);
                Unit unit2 = Unit.INSTANCE;
                mutableState.setValue(Boolean.TRUE);
                break;
        }
        return Unit.INSTANCE;
    }
}
