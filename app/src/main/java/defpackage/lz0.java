package defpackage;

import android.content.Context;
import androidx.datastore.core.DataStore;
import androidx.datastore.preferences.core.Preferences;
import androidx.datastore.preferences.core.PreferencesKeys;
import kotlin.collections.SetsKt;
import kotlin.text.StringsKt;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowKt;

/* JADX INFO: loaded from: classes4.dex */
public final class lz0 {
    public final Context a;
    public final Preferences.Key b;
    public final Preferences.Key c;

    public lz0(Context context) {
        context.getClass();
        this.a = context;
        this.b = PreferencesKeys.stringSetKey("hidden_library_pairs");
        this.c = PreferencesKeys.stringSetKey("hidden_library_ids");
    }

    public final Flow a(String str) {
        if (str == null || StringsKt.isBlank(str)) {
            return FlowKt.flowOf(SetsKt.emptySet());
        }
        return new jz0(((DataStore) mz0.b.getValue(this.a, mz0.a[0])).getData(), this, str.concat("|"));
    }
}
