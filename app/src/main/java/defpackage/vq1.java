package defpackage;

import androidx.media3.common.util.Consumer;
import androidx.media3.exoplayer.source.ProgressiveMediaSource;
import androidx.media3.exoplayer.source.SingleSampleMediaSource;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class vq1 implements j52 {
    public final /* synthetic */ int a;
    public final /* synthetic */ j52 b;
    public final /* synthetic */ Consumer c;

    public /* synthetic */ vq1(j52 j52Var, Consumer consumer, int i) {
        this.a = i;
        this.b = j52Var;
        this.c = consumer;
    }

    @Override // defpackage.j52
    public final Object get() {
        switch (this.a) {
            case 0:
                return ProgressiveMediaSource.Factory.lambda$setDownloadExecutor$1(this.b, this.c);
            default:
                return SingleSampleMediaSource.Factory.lambda$setDownloadExecutor$0(this.b, this.c);
        }
    }
}
