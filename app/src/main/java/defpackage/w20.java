package defpackage;

import androidx.media3.common.MediaItem;
import androidx.media3.common.Player;
import androidx.media3.common.SimpleBasePlayer;
import androidx.media3.common.util.ListenerSet;
import androidx.media3.exoplayer.analytics.AnalyticsListener;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class w20 implements ListenerSet.Event {
    public final /* synthetic */ int a = 1;
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ w20(Player.PositionInfo positionInfo, Player.PositionInfo positionInfo2, int i) {
        this.b = i;
        this.c = positionInfo;
        this.d = positionInfo2;
    }

    @Override // androidx.media3.common.util.ListenerSet.Event
    public final void invoke(Object obj) {
        switch (this.a) {
            case 0:
                ((AnalyticsListener) obj).onMediaItemTransition((AnalyticsListener.EventTime) this.c, (MediaItem) this.d, this.b);
                break;
            default:
                SimpleBasePlayer.lambda$updateStateAndInformListeners$35(this.b, (Player.PositionInfo) this.c, (Player.PositionInfo) this.d, (Player.Listener) obj);
                break;
        }
    }

    public /* synthetic */ w20(AnalyticsListener.EventTime eventTime, MediaItem mediaItem, int i) {
        this.c = eventTime;
        this.d = mediaItem;
        this.b = i;
    }
}
