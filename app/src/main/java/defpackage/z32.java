package defpackage;

import android.content.Context;
import androidx.datastore.core.DataStore;
import androidx.datastore.preferences.PreferenceDataStoreDelegateKt;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.properties.ReadOnlyProperty;
import kotlin.reflect.KProperty;

/* JADX INFO: loaded from: classes4.dex */
public abstract class z32 {
    public static final /* synthetic */ KProperty[] a = {new PropertyReference1Impl(z32.class, "subtitleFontDataStore", "getSubtitleFontDataStore(Landroid/content/Context;)Landroidx/datastore/core/DataStore;", 1)};
    public static final ReadOnlyProperty b = PreferenceDataStoreDelegateKt.preferencesDataStore$default("subtitle_font_settings", null, null, null, 14, null);

    public static final DataStore a(Context context) {
        return (DataStore) b.getValue(context, a[0]);
    }
}
