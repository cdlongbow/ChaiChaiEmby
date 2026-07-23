package defpackage;

import android.media.AudioManager;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class vf implements AudioManager.OnAudioFocusChangeListener {
    public final /* synthetic */ AudioFocusManager a;

    public /* synthetic */ vf(AudioFocusManager audioFocusManager) {
        this.a = audioFocusManager;
    }

    @Override // android.media.AudioManager.OnAudioFocusChangeListener
    public final void onAudioFocusChange(int i) {
        this.a.handlePlatformAudioFocusChange(i);
    }
}
