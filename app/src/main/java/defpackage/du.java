package defpackage;

import android.os.Handler;
import android.os.Message;
import androidx.media3.common.util.ListenerSet;
import androidx.media3.common.util.StuckPlayerDetector;
import androidx.media3.exoplayer.offline.DownloadManager;
import androidx.media3.exoplayer.source.ConcatenatingMediaSource;
import androidx.media3.exoplayer.source.ConcatenatingMediaSource2;
import androidx.media3.ui.PlayerNotificationManager;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class du implements Handler.Callback {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ du(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    @Override // android.os.Handler.Callback
    public final boolean handleMessage(Message message) {
        int i = this.a;
        Object obj = this.b;
        switch (i) {
            case 0:
                return ((ConcatenatingMediaSource) obj).handleMessage(message);
            case 1:
                return ((ConcatenatingMediaSource2) obj).handleMessage(message);
            case 2:
                return ((DownloadManager) obj).handleMainMessage(message);
            case 3:
                return ((ListenerSet) obj).handleMessage(message);
            case 4:
                return ((PlayerNotificationManager) obj).handleMessage(message);
            default:
                return ((StuckPlayerDetector) obj).handleMessage(message);
        }
    }
}
