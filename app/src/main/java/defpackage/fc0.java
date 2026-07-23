package defpackage;

import androidx.media3.extractor.ForwardingExtractorOutput;
import androidx.media3.extractor.TrackOutput;

/* JADX INFO: loaded from: classes4.dex */
public final class fc0 extends ForwardingExtractorOutput {
    @Override // androidx.media3.extractor.ForwardingExtractorOutput, androidx.media3.extractor.ExtractorOutput
    public final TrackOutput track(int i, int i2) {
        TrackOutput trackOutputTrack = super.track(i, i2);
        trackOutputTrack.getClass();
        return new gc0(trackOutputTrack, i);
    }
}
