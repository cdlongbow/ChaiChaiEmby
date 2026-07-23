package defpackage;

import androidx.media3.datasource.DataSourceBitmapLoader;
import androidx.media3.exoplayer.DefaultLoadControl;
import androidx.media3.exoplayer.analytics.DefaultPlaybackSessionManager;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class p00 implements j52 {
    public final /* synthetic */ int a;

    public /* synthetic */ p00(int i) {
        this.a = i;
    }

    @Override // defpackage.j52
    public final Object get() {
        switch (this.a) {
            case 0:
                return DataSourceBitmapLoader.lambda$static$0();
            case 1:
                return DefaultPlaybackSessionManager.generateDefaultSessionId();
            case 2:
                return new DefaultLoadControl();
            case 3:
                return new DefaultGlObjectsProvider();
            default:
                throw new IllegalStateException();
        }
    }
}
