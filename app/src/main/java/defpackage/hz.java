package defpackage;

import android.content.Context;
import androidx.datastore.core.DataStore;
import com.dh.myembyapp.data.DanmakuSettingsManager;
import kotlin.jvm.internal.PropertyReference2Impl;
import kotlin.reflect.KProperty;

/* JADX INFO: loaded from: classes4.dex */
public final class hz {
    public static final /* synthetic */ KProperty[] a = {new PropertyReference2Impl(hz.class, "dataStore", "getDataStore(Landroid/content/Context;)Landroidx/datastore/core/DataStore;", 0)};

    public static final DataStore a(hz hzVar, Context context) {
        hzVar.getClass();
        return (DataStore) DanmakuSettingsManager.dataStore$delegate.getValue(context, a[0]);
    }
}
