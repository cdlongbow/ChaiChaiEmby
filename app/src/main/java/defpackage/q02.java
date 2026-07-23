package defpackage;

import androidx.media3.common.SimpleBasePlayer;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class q02 implements j52 {
    public final /* synthetic */ int a;
    public final /* synthetic */ SimpleBasePlayer.State b;
    public final /* synthetic */ boolean c;

    public /* synthetic */ q02(SimpleBasePlayer.State state, boolean z, int i) {
        this.a = i;
        this.b = state;
        this.c = z;
    }

    @Override // defpackage.j52
    public final Object get() {
        switch (this.a) {
            case 0:
                return SimpleBasePlayer.lambda$setPlayWhenReady$1(this.b, this.c);
            case 1:
                return SimpleBasePlayer.lambda$setShuffleModeEnabled$9(this.b, this.c);
            case 2:
                return SimpleBasePlayer.lambda$setDeviceMuted$30(this.b, this.c);
            default:
                return SimpleBasePlayer.lambda$setDeviceMuted$31(this.b, this.c);
        }
    }
}
