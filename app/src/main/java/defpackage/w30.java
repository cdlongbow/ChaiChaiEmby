package defpackage;

import androidx.media3.exoplayer.ExoPlayer;
import androidx.media3.exoplayer.LoadControl;
import androidx.media3.exoplayer.source.preload.DefaultPreloadManager;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class w30 implements j52 {
    public final /* synthetic */ int a;
    public final /* synthetic */ LoadControl b;

    public /* synthetic */ w30(LoadControl loadControl, int i) {
        this.a = i;
        this.b = loadControl;
    }

    @Override // defpackage.j52
    public final Object get() {
        int i = this.a;
        LoadControl loadControl = this.b;
        switch (i) {
            case 0:
                return DefaultPreloadManager.Builder.lambda$setLoadControl$3(loadControl);
            case 1:
                return ExoPlayer.Builder.lambda$setLoadControl$19(loadControl);
            default:
                return ExoPlayer.Builder.lambda$new$11(loadControl);
        }
    }
}
