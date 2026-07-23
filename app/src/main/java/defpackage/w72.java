package defpackage;

import androidx.datastore.preferences.PreferenceDataStoreDelegateKt;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.properties.ReadOnlyProperty;
import kotlin.reflect.KProperty;

/* JADX INFO: loaded from: classes4.dex */
public abstract class w72 {
    public static final /* synthetic */ KProperty[] a = {new PropertyReference1Impl(w72.class, "themeDataStore", "getThemeDataStore(Landroid/content/Context;)Landroidx/datastore/core/DataStore;", 1)};
    public static final ReadOnlyProperty b = PreferenceDataStoreDelegateKt.preferencesDataStore$default("theme_settings", null, null, null, 14, null);
}
