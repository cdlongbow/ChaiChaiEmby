package defpackage;

import android.content.Context;
import androidx.datastore.core.DataStore;
import com.dh.myembyapp.dlna.DlnaSettings;
import kotlin.jvm.internal.PropertyReference2Impl;
import kotlin.reflect.KProperty;

/* JADX INFO: loaded from: classes4.dex */
public final class qb0 {
    public static final /* synthetic */ KProperty[] a = {new PropertyReference2Impl(qb0.class, "dataStore", "getDataStore(Landroid/content/Context;)Landroidx/datastore/core/DataStore;", 0)};

    public static final DataStore a(qb0 qb0Var, Context context) {
        qb0Var.getClass();
        return (DataStore) DlnaSettings.dataStore$delegate.getValue(context, a[0]);
    }
}
