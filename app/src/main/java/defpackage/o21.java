package defpackage;

import android.content.Context;
import androidx.compose.runtime.MutableState;
import androidx.lifecycle.SavedStateHandle;
import com.dh.myembyapp.data.preferences.ServerPreferences;
import com.dh.myembyapp.data.preferences.UserPreferences;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class o21 implements Function2 {
    public final /* synthetic */ int a;
    public final /* synthetic */ NavHostController b;
    public final /* synthetic */ MutableState c;
    public final /* synthetic */ ServerPreferences d;
    public final /* synthetic */ Context e;
    public final /* synthetic */ UserPreferences g;

    public /* synthetic */ o21(int i, Context context, MutableState mutableState, NavHostController navHostController, ServerPreferences serverPreferences, UserPreferences userPreferences) {
        this.a = i;
        this.b = navHostController;
        this.c = mutableState;
        this.d = serverPreferences;
        this.e = context;
        this.g = userPreferences;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        SavedStateHandle savedStateHandle;
        String str = (String) obj;
        switch (this.a) {
            case 0:
                String str2 = (String) obj2;
                str.getClass();
                str2.getClass();
                e31.d(this.b, this.c, this.d, this.e, this.g, str, str2, (896 & 128) != 0 ? null : null, null, false);
                break;
            case 1:
                String str3 = (String) obj2;
                str.getClass();
                str3.getClass();
                e31.d(this.b, this.c, this.d, this.e, this.g, str, str3, (896 & 128) != 0 ? null : null, null, false);
                break;
            default:
                String str4 = (String) obj2;
                str.getClass();
                str4.getClass();
                MutableState mutableState = this.c;
                String str5 = (String) mutableState.getValue();
                if (e31.f(this.d, this.e, this.g, mutableState, str, false)) {
                    String strConcat = "library/".concat(str4);
                    NavHostController navHostController = this.b;
                    NavController.navigate$default((NavController) navHostController, strConcat, (NavOptions) null, (Navigator.Extras) null, 6, (Object) null);
                    NavBackStackEntry currentBackStackEntry = navHostController.getCurrentBackStackEntry();
                    if (currentBackStackEntry != null && (savedStateHandle = currentBackStackEntry.getSavedStateHandle()) != null) {
                        if (Intrinsics.areEqual(str5, str)) {
                            savedStateHandle.remove("libraryShouldRestoreServer");
                            savedStateHandle.remove("libraryRestoreServerId");
                        } else {
                            savedStateHandle.set("libraryShouldRestoreServer", Boolean.TRUE);
                            savedStateHandle.set("libraryRestoreServerId", str5);
                        }
                    }
                }
                break;
        }
        return Unit.INSTANCE;
    }
}
