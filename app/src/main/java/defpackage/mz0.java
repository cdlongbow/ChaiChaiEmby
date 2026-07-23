package defpackage;

import androidx.datastore.preferences.PreferenceDataStoreDelegateKt;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.properties.ReadOnlyProperty;
import kotlin.reflect.KProperty;

/* JADX INFO: loaded from: classes4.dex */
public abstract class mz0 {
    public static final /* synthetic */ KProperty[] a = {new PropertyReference1Impl(mz0.class, "libraryVisibilityDataStore", "getLibraryVisibilityDataStore(Landroid/content/Context;)Landroidx/datastore/core/DataStore;", 1)};
    public static final ReadOnlyProperty b = PreferenceDataStoreDelegateKt.preferencesDataStore$default("library_visibility_settings", null, null, null, 14, null);
}
