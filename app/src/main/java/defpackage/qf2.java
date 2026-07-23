package defpackage;

import android.content.Context;
import android.content.SharedPreferences;
import kotlin.text.StringsKt;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.StateFlow;
import kotlinx.coroutines.flow.StateFlowKt;

/* JADX INFO: loaded from: classes4.dex */
public final class qf2 {
    public final SharedPreferences a;
    public final MutableStateFlow b;
    public final StateFlow c;

    public qf2(Context context) {
        context.getClass();
        SharedPreferences sharedPreferences = context.getSharedPreferences("webdav_sync_settings", 0);
        this.a = sharedPreferences;
        String string = sharedPreferences.getString("webdav_server_url", "");
        String string2 = string != null ? StringsKt.trim((CharSequence) string).toString() : null;
        String strE = hg2.E(string2 == null ? "" : string2);
        String string3 = sharedPreferences.getString("webdav_username", "");
        String string4 = string3 != null ? StringsKt.trim((CharSequence) string3).toString() : null;
        string4 = string4 == null ? "" : string4;
        String string5 = sharedPreferences.getString("webdav_password", "");
        String string6 = string5 != null ? StringsKt.trim((CharSequence) string5).toString() : null;
        MutableStateFlow MutableStateFlow = StateFlowKt.MutableStateFlow(new ye2(strE, string4, string6 == null ? "" : string6, sharedPreferences.getBoolean("webdav_sync_server_configurations", true), sharedPreferences.getBoolean("webdav_sync_app_settings", true)));
        this.b = MutableStateFlow;
        this.c = FlowKt.asStateFlow(MutableStateFlow);
    }

    public final void a(ye2 ye2Var) {
        ye2Var.getClass();
        ye2 ye2VarA = ye2Var.a();
        this.a.edit().putString("webdav_server_url", ye2VarA.a).putString("webdav_username", ye2VarA.b).putString("webdav_password", ye2VarA.c).putBoolean("webdav_sync_server_configurations", ye2VarA.d).putBoolean("webdav_sync_app_settings", ye2VarA.e).apply();
        this.b.setValue(ye2VarA);
    }
}
