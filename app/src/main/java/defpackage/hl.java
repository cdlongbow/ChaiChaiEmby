package defpackage;

import android.media.MediaPlayer;
import com.google.zxing.client.android.BeepManager;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class hl implements MediaPlayer.OnErrorListener {
    @Override // android.media.MediaPlayer.OnErrorListener
    public final boolean onError(MediaPlayer mediaPlayer, int i, int i2) {
        return BeepManager.lambda$playBeepSound$1(mediaPlayer, i, i2);
    }
}
