package defpackage;

import android.content.Context;
import androidx.compose.runtime.MutableState;
import com.dh.myembyapp.data.model.ServerConfig;
import com.dh.myembyapp.data.preferences.ServerPreferences;
import com.dh.myembyapp.data.preferences.UserPreferences;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class z21 implements Function1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ NavHostController b;
    public final /* synthetic */ Context c;
    public final /* synthetic */ ServerPreferences d;
    public final /* synthetic */ UserPreferences e;
    public final /* synthetic */ MutableState g;

    public /* synthetic */ z21(NavHostController navHostController, MutableState mutableState, ServerPreferences serverPreferences, Context context, UserPreferences userPreferences) {
        this.a = 0;
        this.d = serverPreferences;
        this.c = context;
        this.e = userPreferences;
        this.g = mutableState;
        this.b = navHostController;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        Object objM8825constructorimpl;
        boolean z;
        int i = this.a;
        NavHostController navHostController = this.b;
        switch (i) {
            case 0:
                String str = (String) obj;
                str.getClass();
                if (e31.f(this.d, this.c, this.e, this.g, str, true)) {
                    try {
                        Result.Companion companion = Result.INSTANCE;
                        objM8825constructorimpl = Result.m8825constructorimpl(navHostController.getBackStackEntry("home"));
                    } catch (Throwable th) {
                        Result.Companion companion2 = Result.INSTANCE;
                        objM8825constructorimpl = Result.m8825constructorimpl(ResultKt.createFailure(th));
                    }
                    if (Result.m8832isSuccessimpl(objM8825constructorimpl)) {
                        navHostController.navigate("home", (Function1<? super NavOptionsBuilder, Unit>) new ox0(9));
                    } else {
                        navHostController.navigate("home", (Function1<? super NavOptionsBuilder, Unit>) new ox0(10));
                    }
                    z = true;
                    break;
                } else {
                    z = false;
                }
                return Boolean.valueOf(z);
            case 1:
                ServerConfig serverConfig = (ServerConfig) obj;
                serverConfig.getClass();
                ServerConfig effectiveServerConfig = serverConfig.getEffectiveServerConfig();
                boolean zIsLoggedIn = effectiveServerConfig.isLoggedIn();
                NavHostController navHostController2 = this.b;
                if (zIsLoggedIn && e31.c(this.c, this.d, this.e, this.g, effectiveServerConfig, true)) {
                    navHostController2.navigate("home", (Function1<? super NavOptionsBuilder, Unit>) new ox0(8));
                } else {
                    String id = effectiveServerConfig.getId();
                    id.getClass();
                    NavController.navigate$default((NavController) navHostController2, "edit_server/".concat(id), (NavOptions) null, (Navigator.Extras) null, 6, (Object) null);
                }
                return Unit.INSTANCE;
            case 2:
                ServerConfig serverConfig2 = (ServerConfig) obj;
                serverConfig2.getClass();
                if (e31.c(this.c, this.d, this.e, this.g, serverConfig2, true)) {
                    navHostController.navigate("home", (Function1<? super NavOptionsBuilder, Unit>) new ox0(7));
                }
                return Unit.INSTANCE;
            default:
                ServerConfig serverConfig3 = (ServerConfig) obj;
                serverConfig3.getClass();
                if (e31.c(this.c, this.d, this.e, this.g, serverConfig3, true)) {
                    navHostController.navigate("home", (Function1<? super NavOptionsBuilder, Unit>) new ox0(11));
                }
                return Unit.INSTANCE;
        }
    }

    public /* synthetic */ z21(int i, Context context, MutableState mutableState, NavHostController navHostController, ServerPreferences serverPreferences, UserPreferences userPreferences) {
        this.a = i;
        this.b = navHostController;
        this.c = context;
        this.d = serverPreferences;
        this.e = userPreferences;
        this.g = mutableState;
    }
}
