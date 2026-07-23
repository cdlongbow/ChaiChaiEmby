package defpackage;

import androidx.media3.common.SimpleBasePlayer;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class o02 implements j52 {
    public final /* synthetic */ int a;
    public final /* synthetic */ SimpleBasePlayer.State b;

    public /* synthetic */ o02(SimpleBasePlayer.State state, int i) {
        this.a = i;
        this.b = state;
    }

    @Override // defpackage.j52
    public final Object get() {
        int i = this.a;
        SimpleBasePlayer.State state = this.b;
        switch (i) {
            case 0:
                return SimpleBasePlayer.lambda$unmute$18(state);
            case 1:
                return SimpleBasePlayer.lambda$mute$17(state);
            case 2:
                return SimpleBasePlayer.lambda$setVideoSurface$19(state);
            case 3:
                return SimpleBasePlayer.lambda$increaseDeviceVolume$27(state);
            case 4:
                return SimpleBasePlayer.lambda$decreaseDeviceVolume$28(state);
            case 5:
                return SimpleBasePlayer.lambda$release$13(state);
            case 6:
                return SimpleBasePlayer.lambda$clearVideoOutput$23(state);
            case 7:
                return SimpleBasePlayer.lambda$increaseDeviceVolume$26(state);
            case 8:
                return SimpleBasePlayer.lambda$prepare$7(state);
            default:
                return SimpleBasePlayer.lambda$decreaseDeviceVolume$29(state);
        }
    }
}
