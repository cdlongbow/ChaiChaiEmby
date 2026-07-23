package defpackage;

import android.content.Context;
import android.content.SharedPreferences;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.RangesKt;
import kotlin.text.StringsKt;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.StateFlow;
import kotlinx.coroutines.flow.StateFlowKt;

/* JADX INFO: loaded from: classes4.dex */
public final class ab2 {
    public static final MutableStateFlow c = StateFlowKt.MutableStateFlow(new i92(false, "", "", 0, true, false, 60));
    public final SharedPreferences a;
    public final StateFlow b;

    public ab2(Context context) {
        context.getClass();
        boolean z = false;
        SharedPreferences sharedPreferences = context.getSharedPreferences("trakt_settings", 0);
        this.a = sharedPreferences;
        MutableStateFlow mutableStateFlow = c;
        this.b = FlowKt.asStateFlow(mutableStateFlow);
        if (sharedPreferences.contains("trakt_client_id") || sharedPreferences.contains("trakt_client_secret")) {
            String string = sharedPreferences.getString("trakt_client_id", "");
            String string2 = string != null ? StringsKt.trim((CharSequence) string).toString() : null;
            string2 = string2 == null ? "" : string2;
            String string3 = sharedPreferences.getString("trakt_client_secret", "");
            String string4 = string3 != null ? StringsKt.trim((CharSequence) string3).toString() : null;
            String str = string4 != null ? string4 : "";
            if (Intrinsics.areEqual(string2, "1c6390b346287cb8aad251da052645aa6e57f4e2dd67ae9d9ee9c7217cc513e6") && Intrinsics.areEqual(str, "0adc6e4aa2ddd7858eb346db6467d9678709322badd984c655514c97c36a8847")) {
                z = true;
            }
            SharedPreferences.Editor editorRemove = sharedPreferences.edit().remove("trakt_client_id").remove("trakt_client_secret");
            if (!z) {
                editorRemove.remove("trakt_access_token");
                editorRemove.remove("trakt_refresh_token");
                editorRemove.remove("trakt_access_token_expires_at_ms");
            }
            editorRemove.apply();
        }
        mutableStateFlow.setValue(b());
    }

    public final i92 a() {
        i92 i92VarB = b();
        c.setValue(i92VarB);
        return i92VarB;
    }

    public final i92 b() {
        SharedPreferences sharedPreferences = this.a;
        boolean z = sharedPreferences.getBoolean("trakt_enabled", false);
        String string = sharedPreferences.getString("trakt_access_token", "");
        String string2 = string != null ? StringsKt.trim((CharSequence) string).toString() : null;
        if (string2 == null) {
            string2 = "";
        }
        String string3 = sharedPreferences.getString("trakt_refresh_token", "");
        String string4 = string3 != null ? StringsKt.trim((CharSequence) string3).toString() : null;
        return new i92(z, string2, string4 != null ? string4 : "", sharedPreferences.getLong("trakt_access_token_expires_at_ms", 0L), sharedPreferences.getBoolean("trakt_prompt_cloud_progress", true), sharedPreferences.getBoolean("trakt_sync_local_progress_to_trakt", false), sharedPreferences.getInt("trakt_minimum_progress_difference_seconds", 60)).e();
    }

    public final void c(long j, String str, String str2) {
        str.getClass();
        str2.getClass();
        d(i92.a(a(), false, str, str2, (RangesKt.coerceAtLeast(j, 0L) * 1000) + System.currentTimeMillis(), false, false, 0, 113));
    }

    public final void d(i92 i92Var) {
        i92Var.getClass();
        i92 i92VarE = i92Var.e();
        this.a.edit().putBoolean("trakt_enabled", i92VarE.a).remove("trakt_client_id").remove("trakt_client_secret").putString("trakt_access_token", i92VarE.b).putString("trakt_refresh_token", i92VarE.c).putLong("trakt_access_token_expires_at_ms", i92VarE.d).putBoolean("trakt_prompt_cloud_progress", i92VarE.e).putBoolean("trakt_sync_local_progress_to_trakt", i92VarE.f).putInt("trakt_minimum_progress_difference_seconds", i92VarE.g).apply();
        c.setValue(i92VarE);
    }
}
