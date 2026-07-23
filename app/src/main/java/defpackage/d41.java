package defpackage;

import androidx.media3.common.util.Consumer;
import androidx.media3.exoplayer.source.LoadEventInfo;
import androidx.media3.exoplayer.source.MediaLoadData;
import androidx.media3.exoplayer.source.MediaSourceEventListener;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class d41 implements Consumer {
    public final /* synthetic */ int a;
    public final /* synthetic */ MediaSourceEventListener.EventDispatcher b;
    public final /* synthetic */ LoadEventInfo c;
    public final /* synthetic */ MediaLoadData d;

    public /* synthetic */ d41(MediaSourceEventListener.EventDispatcher eventDispatcher, LoadEventInfo loadEventInfo, MediaLoadData mediaLoadData, int i) {
        this.a = i;
        this.b = eventDispatcher;
        this.c = loadEventInfo;
        this.d = mediaLoadData;
    }

    @Override // androidx.media3.common.util.Consumer
    public final void accept(Object obj) {
        int i = this.a;
        MediaLoadData mediaLoadData = this.d;
        LoadEventInfo loadEventInfo = this.c;
        MediaSourceEventListener.EventDispatcher eventDispatcher = this.b;
        MediaSourceEventListener mediaSourceEventListener = (MediaSourceEventListener) obj;
        switch (i) {
            case 0:
                eventDispatcher.lambda$loadCompleted$1(loadEventInfo, mediaLoadData, mediaSourceEventListener);
                break;
            default:
                eventDispatcher.lambda$loadCanceled$2(loadEventInfo, mediaLoadData, mediaSourceEventListener);
                break;
        }
    }
}
