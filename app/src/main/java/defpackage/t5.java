package defpackage;

import android.content.Context;
import android.widget.Toast;
import androidx.compose.runtime.MutableState;
import com.dh.myembyapp.data.preferences.UserPreferences;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class t5 implements Function0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ UserPreferences b;
    public final /* synthetic */ Context c;
    public final /* synthetic */ MutableState d;

    public /* synthetic */ t5(UserPreferences userPreferences, Context context, MutableState mutableState, int i) {
        this.a = i;
        this.b = userPreferences;
        this.c = context;
        this.d = mutableState;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int i = this.a;
        MutableState mutableState = this.d;
        Context context = this.c;
        UserPreferences userPreferences = this.b;
        switch (i) {
            case 0:
                boolean zBooleanValue = ((Boolean) mutableState.getValue()).booleanValue();
                boolean z = !zBooleanValue;
                userPreferences.saveAdminDebugFeaturesUnlocked(z);
                mutableState.setValue(Boolean.valueOf(z));
                Toast.makeText(context, zBooleanValue ? "已关闭管理员调试功能" : "已开启管理员调试功能", 0).show();
                break;
            case 1:
                boolean zBooleanValue2 = ((Boolean) mutableState.getValue()).booleanValue();
                boolean z2 = !zBooleanValue2;
                userPreferences.saveAdminDebugFeaturesUnlocked(z2);
                mutableState.setValue(Boolean.valueOf(z2));
                Toast.makeText(context, zBooleanValue2 ? "已关闭管理员调试功能" : "已开启管理员调试功能", 0).show();
                break;
            default:
                boolean zBooleanValue3 = ((Boolean) mutableState.getValue()).booleanValue();
                boolean z3 = !zBooleanValue3;
                userPreferences.saveAdminDebugFeaturesUnlocked(z3);
                mutableState.setValue(Boolean.valueOf(z3));
                Toast.makeText(context, zBooleanValue3 ? "已关闭管理员调试功能" : "已开启管理员调试功能", 0).show();
                break;
        }
        return Unit.INSTANCE;
    }
}
