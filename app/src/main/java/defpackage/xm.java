package defpackage;

import android.content.Context;
import androidx.datastore.core.DataStore;
import androidx.datastore.preferences.PreferenceDataStoreDelegateKt;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.properties.ReadOnlyProperty;
import kotlin.reflect.KProperty;

/* JADX INFO: loaded from: classes4.dex */
public abstract class xm {
    public static final /* synthetic */ KProperty[] a = {new PropertyReference1Impl(xm.class, "bufferDataStore", "getBufferDataStore(Landroid/content/Context;)Landroidx/datastore/core/DataStore;", 1)};
    public static final ReadOnlyProperty b = PreferenceDataStoreDelegateKt.preferencesDataStore$default("buffer_settings", null, null, null, 14, null);

    public static final DataStore a(Context context) {
        return (DataStore) b.getValue(context, a[0]);
    }
}
