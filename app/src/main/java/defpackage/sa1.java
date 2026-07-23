package defpackage;

import android.content.Context;
import android.content.SharedPreferences;
import kotlin.text.StringsKt;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.StateFlow;
import kotlinx.coroutines.flow.StateFlowKt;

/* JADX INFO: loaded from: classes4.dex */
public final class sa1 {
    public final SharedPreferences a;
    public final MutableStateFlow b;
    public final StateFlow c;

    public sa1(Context context) {
        context.getClass();
        SharedPreferences sharedPreferences = context.getSharedPreferences("online_subtitle_settings", 0);
        this.a = sharedPreferences;
        boolean z = sharedPreferences.getBoolean("online_subtitle_enabled", true);
        String string = sharedPreferences.getString("online_subtitle_assrt_token", "");
        String string2 = string != null ? StringsKt.trim((CharSequence) string).toString() : null;
        String str = string2 != null ? string2 : "";
        yq yqVar = ne.c;
        String string3 = sharedPreferences.getString("online_subtitle_assrt_protocol", ne.HTTPS.a);
        yqVar.getClass();
        MutableStateFlow MutableStateFlow = StateFlowKt.MutableStateFlow(new t91(z, str, yq.i(string3)));
        this.b = MutableStateFlow;
        this.c = FlowKt.asStateFlow(MutableStateFlow);
    }

    public final void a(t91 t91Var) {
        t91Var.getClass();
        this.a.edit().putBoolean("online_subtitle_enabled", t91Var.getEnabled()).putString("online_subtitle_assrt_token", StringsKt.trim((CharSequence) t91Var.getAssrtApiToken()).toString()).putString("online_subtitle_assrt_protocol", t91Var.getAssrtApiProtocol().a).apply();
        this.b.setValue(t91.a(t91Var, StringsKt.trim((CharSequence) t91Var.getAssrtApiToken()).toString()));
    }
}
