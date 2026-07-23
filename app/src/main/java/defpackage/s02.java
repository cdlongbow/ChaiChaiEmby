package defpackage;

import androidx.media3.common.SimpleBasePlayer;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class s02 implements j52 {
    public final /* synthetic */ int a;
    public final /* synthetic */ SimpleBasePlayer.State b;
    public final /* synthetic */ int c;

    public /* synthetic */ s02(SimpleBasePlayer.State state, int i, int i2) {
        this.a = i2;
        this.b = state;
        this.c = i;
    }

    @Override // defpackage.j52
    public final Object get() {
        switch (this.a) {
            case 0:
                return SimpleBasePlayer.lambda$setDeviceVolume$24(this.b, this.c);
            case 1:
                return SimpleBasePlayer.lambda$setDeviceVolume$25(this.b, this.c);
            default:
                return SimpleBasePlayer.lambda$setRepeatMode$8(this.b, this.c);
        }
    }
}
