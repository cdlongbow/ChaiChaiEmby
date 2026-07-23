package defpackage;

import androidx.media3.datasource.DataSource;
import androidx.media3.datasource.PlaceholderDataSource;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class od1 implements DataSource.Factory {
    @Override // androidx.media3.datasource.DataSource.Factory
    public final DataSource createDataSource() {
        return PlaceholderDataSource.a();
    }
}
