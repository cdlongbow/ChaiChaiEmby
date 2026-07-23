package defpackage;

import android.content.Context;
import androidx.datastore.core.DataStore;
import androidx.datastore.preferences.core.Preferences;
import androidx.datastore.preferences.core.PreferencesKeys;

/* JADX INFO: loaded from: classes4.dex */
public final class q72 {
    public static final Preferences.Key c = PreferencesKeys.stringKey("theme_preset");
    public static final Preferences.Key d = PreferencesKeys.stringKey("light_background_style");
    public static final Preferences.Key e = PreferencesKeys.stringKey("dark_theme_style");
    public static final Preferences.Key f = PreferencesKeys.stringKey("dark_theme_glow_position");
    public static final Preferences.Key g = PreferencesKeys.booleanKey("accent_follows_theme");
    public static final Preferences.Key h = PreferencesKeys.booleanKey("detached_focus_border_enabled");
    public static final Preferences.Key i = PreferencesKeys.intKey("card_size_level");
    public final Context a;
    public final b7 b;

    public q72(Context context) {
        context.getClass();
        this.a = context;
        this.b = new b7(((DataStore) w72.b.getValue(context, w72.a[0])).getData(), 9);
    }
}
