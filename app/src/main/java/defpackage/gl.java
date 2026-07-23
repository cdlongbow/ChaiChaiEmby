package defpackage;

import android.media.MediaPlayer;
import com.google.zxing.client.android.BeepManager;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class gl implements MediaPlayer.OnCompletionListener {
    @Override // android.media.MediaPlayer.OnCompletionListener
    public final void onCompletion(MediaPlayer mediaPlayer) {
        BeepManager.lambda$playBeepSound$0(mediaPlayer);
    }
}
